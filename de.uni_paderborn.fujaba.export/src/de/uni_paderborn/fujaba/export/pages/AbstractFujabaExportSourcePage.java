package de.uni_paderborn.fujaba.export.pages;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import de.uni_paderborn.fujaba.common.ui.ExtensibleModelSelectionPage;
import de.uni_paderborn.fujaba.common.ui.ModelSelectionPageExtension;
import de.uni_paderborn.fujaba.common.ui.ResourceLocationProvider;

public abstract class AbstractFujabaExportSourcePage extends ExtensibleModelSelectionPage implements IFujabaExportSourcePage {

	/**
	 * Page Extension that allows the user to select the domain element
	 */
	private DomainElementPageExtension domainElementExtension;

	private FormToolkit toolkit;

	public AbstractFujabaExportSourcePage(String pageId, FormToolkit toolkit,
			ResourceLocationProvider resourceLocationProvider, ResourceSet resourceSet) {
		super(pageId, resourceLocationProvider, resourceSet);
		this.toolkit = toolkit;

	  	setTitle("Select Transformation Source");
        setDescription("Select the Fujaba domain element that should be transformed.");

		String fileExtension = wizardPageGetSourceFileExtension();
		Assert.isNotNull(fileExtension, "Please implement 'wizardPageGetSourceFileExtension()' to provide a non-null file extension that the fujaba-export-wizard supports.");
		setModelFileExtension(fileExtension);
	}
	
	@Override
	public void createControl(Composite parent) {
		int sectionStyle = Section.TITLE_BAR
				| Section.CLIENT_INDENT | Section.EXPANDED;
		Section section = toolkit.createSection(parent, sectionStyle);
		section.setText("Source Properties");
		
		Composite composite = toolkit.createComposite(section); 
		section.setClient(composite);
		composite.setLayout(new GridLayout());
		super.createControl(composite);
		setControl(section);
		
		validatePage();
	}

	@Override
	public void addExtensions() {
		ElementSelectionMode elementSelectionMode = wizardPageGetSupportedSelectionMode();
		if (elementSelectionMode.supportsElementSelection()) {
			domainElementExtension = new DomainElementPageExtension();
			addExtension("add", domainElementExtension); //$NON-NLS-1$
		}
	}

	@Override
	protected Button createButton(Composite parent, int style) {
		return toolkit.createButton(parent, "", style | SWT.FLAT);
	}

	@Override
	protected Composite createPlate(Composite parent) {
		return toolkit.createComposite(parent);
	}
	
	@Override
	protected Label createLabel(Composite parent) {
		return toolkit.createLabel(parent, "");
	}
	
	@Override
	protected Text createText(Composite parent, int style) {
		return toolkit.createText(parent, "", style);
	}
	
	public class DomainElementPageExtension implements ModelSelectionPageExtension {
		
		private CheckboxTreeViewer treeViewer;


		@Override
		public void createControl(Composite parent) {
			int sectionStyle = Section.TITLE_BAR
					| Section.CLIENT_INDENT | Section.EXPANDED;
			Section section = toolkit.createSection(parent, sectionStyle);
			section.setText("Select source elements");
			
			section.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			Composite composite = toolkit.createComposite(section);
			composite.setLayout(new GridLayout(1, false));
			
			section.setClient(composite);
			Tree tree = toolkit.createTree(composite, SWT.BORDER | SWT.CHECK);
			GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
			gridData.minimumHeight = 200;
			tree.setLayoutData(gridData);
			tree.addListener(SWT.EraseItem, new Listener() {
				public void handleEvent(Event event) {
					if ((event.detail & SWT.SELECTED) != 0 && true) {
//						event.detail &= ~SWT.SELECTED;
						
					}
				}
			});
			
			

			parent.layout(true, true);

			treeViewer = new CheckboxTreeViewer(tree);
			treeViewer.addCheckStateListener(new ICheckStateListener() {
				
				@Override
				public void checkStateChanged(CheckStateChangedEvent event) {
					if (event.getChecked()) {
						if (!wizardPageSupportsSourceModelElement((EObject) event.getElement())) {
							event.getCheckable().setChecked(event.getElement(), false);
						} else if (wizardPageGetSupportedSelectionMode() != ElementSelectionMode.ELEMENT_SELECTION_MODE_MULTI) {
							treeViewer.setCheckedElements(new Object[] { event.getElement() } );
						}
					}
					
					validatePage();			
				}
			});
			
			
		}
		
		@Override
		public void setResource(Resource resource) {
			ISelection selection = null;
			
			if (resource != null && !resource.getContents().isEmpty()) {
				EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(resource
						.getContents().get(0));
				AdapterFactory adapterFactory = null;				
				if (editingDomain instanceof AdapterFactoryEditingDomain) {
					adapterFactory = ((AdapterFactoryEditingDomain) editingDomain).getAdapterFactory();
				}
				if (adapterFactory != null) {
					treeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
					treeViewer.setLabelProvider(new GreyedAdapterFactoryLabelProvider(adapterFactory) {
						@Override
						public boolean isEnabled(Object object) {							
							return object instanceof EObject && wizardPageSupportsSourceModelElement((EObject) object);
						}
					});
					treeViewer.setInput(resource);
					selection = wizardPageGetDefaultSelection(resource);
				}
			}
			treeViewer.setSelection(selection);
			if (selection instanceof IStructuredSelection) {
				treeViewer.setCheckedElements(((IStructuredSelection) selection).toArray());
			} else {
				treeViewer.setCheckedElements(new Object[] { });
			}
			validatePage();
		}		
		
		private class ColoredAdapterFactoryLabelProvider extends AdapterFactoryLabelProvider implements IColorProvider {
			public ColoredAdapterFactoryLabelProvider(AdapterFactory adapterFactory) {
				super(adapterFactory);
			}
		}

		public Object[] getCheckedElements() {
			return treeViewer.getCheckedElements();
		}
	}
	
	@Override
	public void validatePage() {
		ElementSelectionMode elementSelectionMode = wizardPageGetSupportedSelectionMode();
        Assert.isNotNull(elementSelectionMode, "Please implement 'wizardGetSupportedSelectionMode()' to provide a non-null selection mode that your fujaba export wizard supports.");

		if (elementSelectionMode != ElementSelectionMode.ELEMENT_SELECTION_MODE_NONE && getSourceElements().length == 0) {
			setPageComplete(false);
			setErrorMessage("Please select a domain element.");
		} else {
			setErrorMessage(null);
			setPageComplete(true);
		}
	}

	public Object[] getSourceElements() {
		if (domainElementExtension != null) {
			return domainElementExtension.getCheckedElements();
		}
		return new Object[] { };
	}
	

    // default implementation
	@Override
	public ISelection wizardPageGetDefaultSelection(Resource resource) {
		TreeIterator<EObject> it = resource.getAllContents();
		while (it.hasNext()) {
			EObject element = it.next();
			if (wizardPageSupportsSourceModelElement(element)) {
				return new StructuredSelection(element);
			}
		}
		return null;
	}
		
}
