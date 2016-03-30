package de.uni_paderborn.fujaba.export.pages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.TreeIterator;
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
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
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
import org.muml.common.ui.ExtensibleModelSelectionPage;
import org.muml.common.ui.ModelSelectionPageExtension;
import org.muml.common.ui.ResourceLocationProvider;

import de.uni_paderborn.fujaba.export.providers.GreyedAdapterFactoryLabelProvider;
import de.uni_paderborn.fujaba.export.providers.NullContentProvider;

public abstract class AbstractFujabaExportSourcePage extends ExtensibleModelSelectionPage implements IActivatableWizardPage {

	/**
	 * Page Extension that allows the user to select the domain element
	 */
	protected DomainElementPageExtension domainElementExtension;

	protected FormToolkit toolkit;

	protected ISelection selection;
	/**
	 * Creates a fujaba-export source page.
	 * 
	 * @param pageId
	 * @param toolkit
	 * @param resourceSet
	 * @param selection
	 *            The default selection. If null it indicates that nothing is
	 *            selected.
	 */
	public AbstractFujabaExportSourcePage(String pageId, FormToolkit toolkit,
			ResourceSet resourceSet, ISelection selection) {
		super(pageId, new ResourceLocationProvider(selection), resourceSet);
		setUnloadAllowed(false);
		this.toolkit = toolkit;
		this.selection = selection;

		setTitle("Select Transformation Source");
		setDescription("Select the MechatronicUML domain element that should be transformed.");

		String fileExtension = wizardPageGetSourceFileExtension();
		Assert.isNotNull(
				fileExtension,
				"Please implement 'wizardPageGetSourceFileExtension()' to provide a non-null file extension that the MechatronicUML-export-wizard supports.");
		setModelFileExtension(fileExtension);
	}

	@Override
	public void createControl(Composite parent) {
		int sectionStyle = Section.TITLE_BAR | Section.CLIENT_INDENT
				| Section.EXPANDED;
		Section section = toolkit.createSection(parent, sectionStyle);
		section.setText("Source Properties");

		Composite composite = toolkit.createComposite(section);
		section.setClient(composite);
		composite.setLayout(new GridLayout());
		super.createControl(composite);
		setControl(section);
//		domainElementExtension.getTreeViewer().addSelectionChangedListener(mainSelectionListener);
//		if (domainElementExtension.getTreeViewer()!= null) {
//			for(ICheckStateListener listener : checkStateListeners){
//				domainElementExtension.getTreeViewer().addCheckStateListener(listener);
//			}
//			checkStateListeners.clear();
//		}
//		new ISelectionChangedListener() {
//
//			@Override
//			public void selectionChanged(SelectionChangedEvent event) {
//				for (ISelectionChangedListener listener : domainElementSelectionChangedListeners) {
//					listener.selectionChanged(event);
//				}
//			}
//		
//		};
		validatePage();
	}

	protected void initControls() {
		super.initControls();
		applyInitialSelection(filterSelection(selection));
	}

	protected void applyInitialSelection(ISelection selection) {
		if (!selection.isEmpty()) {
			domainElementExtension.setCheckedElements(selection);
		}
	}

	protected IStructuredSelection filterSelection(ISelection selection) {
		List<EObject> validElements = new ArrayList<EObject>();
		if (selection instanceof IStructuredSelection) {
			for (Object element : ((IStructuredSelection) selection).toArray()) {
				EObject eObject = null;
				if (element instanceof IAdaptable) {
					eObject = (EObject) ((IAdaptable) element)
							.getAdapter(EObject.class);
				}
				if (element instanceof EObject) {
					eObject = (EObject) element;
				}
				if (eObject != null && eObject.eResource() != null
						&& eObject.eResource() == this.getResource()) {
					validElements.add(eObject);
				}
			}
		}
		return new StructuredSelection(validElements);
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

	public class DomainElementPageExtension implements
			ModelSelectionPageExtension {

		protected CheckboxTreeViewer treeViewer;
		protected Resource resource;

		public Resource getResource() {
			return resource;
		}

		public CheckboxTreeViewer getTreeViewer() {
			return treeViewer;
		}

		@Override
		public void createControl(Composite parent) {
			int sectionStyle = Section.TITLE_BAR | Section.CLIENT_INDENT
					| Section.EXPANDED;
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
						// event.detail &= ~SWT.SELECTED;

					}
				}
			});

			parent.layout(true, true);

			treeViewer = new CheckboxTreeViewer(tree);
			treeViewer.addCheckStateListener(new ICheckStateListener() {

				@Override
				public void checkStateChanged(CheckStateChangedEvent event) {
					if (event.getChecked()) {
						if (!wizardPageSupportsSourceModelElement((EObject) event
								.getElement())) {
							event.getCheckable().setChecked(event.getElement(),
									false);
						} else if (wizardPageGetSupportedSelectionMode() != ElementSelectionMode.ELEMENT_SELECTION_MODE_MULTI) {
							treeViewer.setCheckedElements(new Object[] { event
									.getElement() });
						}
					}

					validatePage();
				}
			});

		}

		@Override
		public void setResource(Resource resource) {
			if (this.resource != resource) {
				this.resource = resource;
				ISelection selection = null;
				AdapterFactory adapterFactory = null;
				if (resource != null && !resource.getContents().isEmpty()) {
					EditingDomain editingDomain = AdapterFactoryEditingDomain
							.getEditingDomainFor(resource.getContents().get(0));
					if (editingDomain instanceof AdapterFactoryEditingDomain) {
						adapterFactory = ((AdapterFactoryEditingDomain) editingDomain)
								.getAdapterFactory();
					}
				}
				if (adapterFactory != null) {
					treeViewer
							.setContentProvider(new AdapterFactoryContentProvider(
									adapterFactory));
					treeViewer
							.setLabelProvider(new GreyedAdapterFactoryLabelProvider(
									adapterFactory) {
								@Override
								public boolean isEnabled(Object object) {
									return object instanceof EObject
											&& wizardPageSupportsSourceModelElement((EObject) object);
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
		}

		public void setCheckedElements(ISelection selection) {
			treeViewer.setSelection(selection);
			if (selection instanceof IStructuredSelection) {
				treeViewer
						.setCheckedElements(((IStructuredSelection) selection)
								.toArray());
				for (Object element : ((IStructuredSelection) selection)
						.toArray()) {
					treeViewer.reveal(element);
				}
			} else {
				treeViewer.setCheckedElements(new Object[] {});
			}

			validatePage();
		}

		public Object[] getCheckedElements() {
			return treeViewer.getCheckedElements();
		}
	}

	@Override
	public void validatePage() {
		ElementSelectionMode elementSelectionMode = wizardPageGetSupportedSelectionMode();
		Assert.isNotNull(
				elementSelectionMode,
				"Please implement 'wizardGetSupportedSelectionMode()' to provide a non-null selection mode that your MechatronicUML export wizard supports.");

		String errorMessage = null;
		if (elementSelectionMode != ElementSelectionMode.ELEMENT_SELECTION_MODE_NONE
				&& getSourceElements().length == 0) {
			errorMessage = "Please select a domain element.";
		} else {
			for (Object element : getSourceElements()) {
				if (!wizardPageSupportsSourceModelElement((EObject) element)) {
					errorMessage = "Selection contains unsupported elements.";
					break;
				}
			}
			if (errorMessage == null
					&& elementSelectionMode != ElementSelectionMode.ELEMENT_SELECTION_MODE_MULTI
					&& getSourceElements().length > 1) {
				errorMessage = "Multiple source elements are not supported.";
			}
		}
		setErrorMessage(errorMessage);
		setPageComplete(errorMessage == null);
	}

	public EObject[] getSourceElements() {
		EObject[] array = new EObject[] {};
		if (domainElementExtension != null) {
			List<EObject> elements = new ArrayList<EObject>();
			for (Object element : domainElementExtension.getCheckedElements()) {
				elements.add((EObject) element);
			}
			array = elements.toArray(array);
		} else if (getResource() != null) {
			array = getResource().getContents().toArray(array);
		}
		return array;
	}

	// default implementation
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

	public abstract String wizardPageGetSourceFileExtension();

	public abstract ElementSelectionMode wizardPageGetSupportedSelectionMode();

	public abstract boolean wizardPageSupportsSourceModelElement(EObject element);
	
	@Override
	public void activate() {
		// default implementation: do nothing.
	}
	
	@Override
	public void deactivate() {
		// default implementation: do nothing.
	}
}
