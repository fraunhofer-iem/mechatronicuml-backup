package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import de.uni_paderborn.fujaba.common.ui.ModelSelectionPageExtension;
import de.uni_paderborn.fujaba.export.pages.AbstractFujabaExportSourcePage;
import de.uni_paderborn.fujaba.export.pages.ElementSelectionMode;
import de.uni_paderborn.fujaba.export.providers.GreyedAdapterFactoryLabelProvider;
import de.uni_paderborn.fujaba.export.providers.NullContentProvider;

public class ExportPage1 extends AbstractFujabaExportSourcePage{

public ExportPage1(String pageId, FormToolkit toolkit,
			ResourceSet resourceSet, ISelection selection) {
		super(pageId, toolkit, resourceSet, selection);
		// TODO Auto-generated constructor stub
	}

public class DomainElementPageExtension2 implements ModelSelectionPageExtension {
		
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
			AdapterFactory adapterFactory = null;							
			if (resource != null && !resource.getContents().isEmpty()) {
				EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(resource
						.getContents().get(0));
				if (editingDomain instanceof AdapterFactoryEditingDomain) {
					adapterFactory = ((AdapterFactoryEditingDomain) editingDomain).getAdapterFactory();
				}
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
			} else {
				treeViewer.setContentProvider(NullContentProvider.DEFAULT);
				treeViewer.setInput(null);
			}
			setCheckedElements(selection);
		}		

		public void setCheckedElements(ISelection selection) {
			treeViewer.setSelection(selection);
			if (selection instanceof IStructuredSelection) {
				treeViewer.setCheckedElements(((IStructuredSelection) selection).toArray());
				for (Object element : ((IStructuredSelection) selection).toArray()) {
					treeViewer.reveal(element);
				}
			} else {
				treeViewer.setCheckedElements(new Object[] { });
			}
			
			validatePage();
		}

		public Object[] getCheckedElements() {
			return treeViewer.getCheckedElements();
		}
	}

@Override
public String wizardPageGetSourceFileExtension() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean wizardPageSupportsSourceModelElement(EObject element) {
	// TODO Auto-generated method stub
	return false;
}
}
