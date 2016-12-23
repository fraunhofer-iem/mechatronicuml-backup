package org.muml.psm.transformation.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.muml.core.ExtendableElement;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.core.modelinstance.ModelInstancePlugin;
import org.muml.core.modelinstance.RootNode;

public class MainCodeGenConfigPage extends WizardPage implements
		ModifyListener, SelectionListener {

	// settings keys
	private static final String SETTING_FUJABA_FILE = "Fujaba"; //$NON-NLS-1$

	private static final String SETTING_API_MAPPING_FILE = "APIMapping"; //$NON-NLS-1$

	private static final String SETTING_SELECTED_MODELELEMENT_URIFRAGMENT = "uriFragment"; //$NON-NLS-1$

	private static final String FILE_EXTENSION_FUJABA = Messages.MainCodeGenConfigPage_0;
	private static final String FILE_EXTENSION_APIMAPPING = Messages.MainCodeGenConfigPage_1;

	private static final String MODEL_ELEMENT_CATEGORY = Messages.MainCodeGenConfigPage_2;

	private ElementTreeSelectionDialog fujabaDialog;
	private ElementTreeSelectionDialog apiMappingDialog;

	private ExtendableElement selectedElement;

	private Text textFujabaCatalog;

	private Text textAPIMappingGraph;
	private IStructuredSelection initialResourceSelection;
	private ListViewer viewer;

	private List<ExtendableElement> availableModelElements = null;
	private Resource fujabaResource;
	private ResourceSet resourceSet = new ResourceSetImpl();

	protected MainCodeGenConfigPage(String pageName,
			IStructuredSelection selection) {
		super(pageName);

		initialResourceSelection = selection;
		setPageComplete(false);
	}

	@Override
	public void createControl(Composite parent) {

		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout());

		configureDialogs();

		Group inputs = new Group(composite, SWT.SHADOW_IN);
		inputs.setText("Input"); //$NON-NLS-1$
		inputs.setLayout(new GridLayout(3, false));
		inputs.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		String tooltip = "A Fujaba-Model file has a \"." //$NON-NLS-1$
				+ FILE_EXTENSION_FUJABA + "\" extension"; //$NON-NLS-1$
		textFujabaCatalog = addLabeledResourceSelection(inputs,
				"Fujaba Model:", tooltip, fujabaDialog); //$NON-NLS-1$

		tooltip = "A API-Mapping model file has a \"." //$NON-NLS-1$
				+ FILE_EXTENSION_APIMAPPING + "\" extension"; //$NON-NLS-1$
		textAPIMappingGraph = addLabeledResourceSelection(inputs,
				"API-Mapping Model:", tooltip, apiMappingDialog); //$NON-NLS-1$
		// TODO Auto-generated method stub

		Group modelElements = new Group(composite, SWT.SHADOW_IN);
		modelElements.setText("System-Allocations:"); //$NON-NLS-1$
		modelElements.setLayout(new GridLayout(1, false));
		modelElements
				.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		viewer = new ListViewer(modelElements, SWT.SINGLE | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FILL);
		viewer.setContentProvider(new ArrayContentProvider());
		viewer.getControl().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, true));
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = event.getSelection();
				if (!selection.isEmpty()
						&& selection instanceof IStructuredSelection) {

					Iterator it = ((IStructuredSelection) selection).iterator();
					while (it.hasNext()) {
						Object currentSelection = (Object) it.next();
						if (currentSelection instanceof ExtendableElement) {
							selectedElement = (ExtendableElement) currentSelection;
							setPageComplete(isValid());
							break;
						}
					}

				}

			}
		});

		if (initialResourceSelection != null) {
			setupBasedOnInitialSelections();

		}
		setControl(parent);
	}

	private void configureDialogs() {
		fujabaDialog = new ElementTreeSelectionDialog(getShell(),
				new WorkbenchLabelProvider(),
				new BaseWorkbenchContentProvider());
		fujabaDialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		fujabaDialog.setAllowMultiple(false);
		fujabaDialog.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				// TODO Auto-generated method stub
				if (element instanceof IFile
						&& ((IFile) element).getFileExtension()
								.equalsIgnoreCase(FILE_EXTENSION_FUJABA)) {
					return true;
				} else if (element instanceof IProject
						|| element instanceof IFolder) {
					return true;
				}
				return false;
			}
		});
		fujabaDialog.setTitle("Choose a Fujaba File"); //$NON-NLS-1$
		fujabaDialog.setValidator(new ISelectionStatusValidator() {

			@Override
			public IStatus validate(Object[] selection) {
				// TODO Auto-generated method stub
				if (selection.length > 0
						&& selection[0] instanceof IFile
						&& ((IFile) selection[0]).getFileExtension()
								.equalsIgnoreCase(FILE_EXTENSION_FUJABA)) {
					// return new org.eclipse.core.runtime.S
					return new Status(Status.OK, "FujabaWizard", //$NON-NLS-1$
							"Valid File selected"); //$NON-NLS-1$
				}
				return new Status(Status.ERROR, "FujabaWizard", //$NON-NLS-1$
						"Select A Fujaba File"); //$NON-NLS-1$
			}
		});

		apiMappingDialog = new ElementTreeSelectionDialog(getShell(),
				new WorkbenchLabelProvider(),
				new BaseWorkbenchContentProvider());
		apiMappingDialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		apiMappingDialog.setAllowMultiple(false);
		apiMappingDialog.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				// TODO Auto-generated method stub
				if (element instanceof IFile
						&& ((IFile) element).getFileExtension()
								.equalsIgnoreCase(FILE_EXTENSION_APIMAPPING)) {
					return true;
				} else if (element instanceof IProject
						|| element instanceof IFolder) {
					return true;
				}
				return false;
			}
		});
		apiMappingDialog.setTitle("Choose a API-Mapping File"); //$NON-NLS-1$
		apiMappingDialog.setValidator(new ISelectionStatusValidator() {

			@Override
			public IStatus validate(Object[] selection) {
				if (selection.length > 0
						&& selection[0] instanceof IFile
						&& ((IFile) selection[0]).getFileExtension()
								.equalsIgnoreCase(FILE_EXTENSION_APIMAPPING)) {
					// return new org.eclipse.core.runtime.S
					return new Status(Status.OK, "FujabaWizard", //$NON-NLS-1$
							"Valid File selected"); //$NON-NLS-1$
				}
				return new Status(Status.ERROR, "FujabaWizard", //$NON-NLS-1$
						"Select A API-Mapping File"); //$NON-NLS-1$
			}
		});

	}

	private Text addLabeledResourceSelection(Composite parent, String label,
			String tooltip, final ElementTreeSelectionDialog dialog) {
		Label select = new Label(parent, SWT.LEFT);
		select.setText(label);
		select.setToolTipText(tooltip);

		final Text input = new Text(parent, SWT.BORDER);
		input.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		input.addModifyListener(this);
		input.setToolTipText(tooltip);

		Button browse = new Button(parent, SWT.PUSH);
		browse.setToolTipText(tooltip);
		browse.setText("Select..."); //$NON-NLS-1$
		browse.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (dialog.open() == Window.OK) {
					IResource resource = (IResource) dialog.getFirstResult();
					input.setText(URI.createPlatformResourceURI(resource.getFullPath().toString(),true).toString());
				}
			}
		});

		return input;
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		widgetDefaultSelected(e);
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {

		setPageComplete(isValid());
	}

	@Override
	public void modifyText(ModifyEvent e) {
		if (e.getSource() == textFujabaCatalog) {
			fujabaDialog.setInitialSelection(ResourcesPlugin.getWorkspace()
					.getRoot().findMember(textFujabaCatalog.getText()));
			availableModelElements = collectSystemAllocations();

			viewer.setInput(availableModelElements);

		} else if (e.getSource() == textAPIMappingGraph) {
			apiMappingDialog.setInitialSelection(ResourcesPlugin.getWorkspace()
					.getRoot().findMember(textAPIMappingGraph.getText()));
		}

		setPageComplete(isValid());

	}

	protected void setupBasedOnInitialSelections() {

		Iterator it = this.initialResourceSelection.iterator();
		while (it.hasNext()) {
			IResource currentResource = (IResource) it.next();
			if (currentResource.getType() == IResource.FILE
					&& ((IFile) currentResource).getFileExtension()
							.equalsIgnoreCase(Messages.MainCodeGenConfigPage_0)) {
				fujabaDialog.setInitialSelection(currentResource);
				textFujabaCatalog.setText(URI.createPlatformResourceURI(currentResource.getFullPath().toString(), true).toString());
			
				return;
			}
		}

	}

	private boolean isValid() {
		if (textFujabaCatalog.getText().isEmpty()
				|| !textFujabaCatalog.getText().endsWith("."+Messages.MainCodeGenConfigPage_0)) {
			setMessage("A Fujaba Model has to be given.", //$NON-NLS-1$
					IMessageProvider.ERROR);
		}

		if (textAPIMappingGraph.getText().isEmpty()) {
			setMessage("Select a API-Mapping File.", //$NON-NLS-1$
					IMessageProvider.INFORMATION);
		}
		if (selectedElement == null) {
			setMessage("Select an Allocation", IMessageProvider.ERROR); //$NON-NLS-1$
		}

		if (!textFujabaCatalog.getText().isEmpty() && selectedElement != null) {
			// setMessage(null);
			return true;
		}

		return false;
	}

	public void saveSettings() {
		IDialogSettings s = getDialogSettings();

		if (s != null) {
			s.put(SETTING_FUJABA_FILE, textFujabaCatalog.getText());
			s.put(SETTING_API_MAPPING_FILE, textAPIMappingGraph.getText());
			s.put(SETTING_SELECTED_MODELELEMENT_URIFRAGMENT,
					fujabaResource.getURIFragment(selectedElement));
		}
	}

	public String getFujabaFilePath() {
		IDialogSettings s = getDialogSettings();
		return s.get(SETTING_FUJABA_FILE);
	}

	public String getAPIMappingFilePath() {
		IDialogSettings s = getDialogSettings();
		return s.get(SETTING_API_MAPPING_FILE);
	}

	public String getURIFragmentOfSelectedElement() {
		IDialogSettings s = getDialogSettings();
		return s.get(SETTING_SELECTED_MODELELEMENT_URIFRAGMENT);
	}

	private ArrayList<ExtendableElement> collectSystemAllocations() {
		ArrayList<ExtendableElement> newList = new ArrayList<ExtendableElement>();
		if (!textFujabaCatalog.getText().endsWith("."+Messages.MainCodeGenConfigPage_0)) {
			return newList;
		}
		
		
		if (textFujabaCatalog.getText().endsWith(Messages.MainCodeGenConfigPage_0)) {
			if (fujabaResource != null) {
				fujabaResource.unload();
			}
			fujabaResource = resourceSet.getResource(URI.createURI(textFujabaCatalog.getText()), true);
			RootNode rootNode = (RootNode) fujabaResource.getContents().get(0);
			ModelElementCategory modelElementCategory = ModelInstancePlugin
					.getInstance().getModelElementCategoryRegistry()
					.getModelElementCategory(rootNode, MODEL_ELEMENT_CATEGORY);
			newList.addAll(modelElementCategory.getModelElements());

		}
		return newList;

	}

	@Override
	public IWizardPage getPreviousPage() {
		// TODO Auto-generated method stub
		return null;
	}

}
