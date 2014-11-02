package de.uni_paderborn.fujaba.muml.allocationalgorithm.ui.wizard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
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
import org.eclipse.jface.viewers.LabelProvider;
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
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.ModelInstancePlugin;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;

public class MainAllocationAlgorithmPage extends WizardPage implements
		ModifyListener, SelectionListener {

	// settings keys
	private static final String SETTING_FUJABA_FILE = "Fujaba"; //$NON-NLS-1$

	private static final String SETTING_ALLOCATION_FILE = "Allocation"; //$NON-NLS-1$

	private static final String SETTING_SELECTED_CIC_URIFRAGMENT = "uriFragmentCIC"; //$NON-NLS-1$
	private static final String SETTING_SELECTED_HWPIC_URIFRAGMENT = "uriFragmentHWPIC"; //$NON-NLS-1$

	private static final String FILE_EXTENSION_FUJABA = "fujaba";
	private static final String FILE_EXTENSION_ALLOCATION = "allocation_specification";

	private static final String CIC_CATEGORY = "de.uni_paderborn.fujaba.muml.instance.category";
	private static final String HWPIC_CATEGORY = "de.uni_paderborn.fujaba.muml.hardware.hwplatform.category";

	private ElementTreeSelectionDialog fujabaDialog;
	private ElementTreeSelectionDialog allocationSpecDialog;

	private ComponentInstanceConfiguration selectedCIC;
	private HWPlatformInstanceConfiguration selectedHWPIC;

	private Text textFujabaCatalog;

	private Text textAllocationSpecCatalog;
	private IStructuredSelection initialResourceSelection;
	private ListViewer viewerCIC;
	private ListViewer viewerHWPIC;

	private List<ComponentInstanceConfiguration> availableCICs = null;
	private List<HWPlatformInstanceConfiguration> availableHWPICs = null;

	private Resource fujabaResource;
	private ResourceSet resourceSet = new ResourceSetImpl();

	protected MainAllocationAlgorithmPage(String pageName,
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
		inputs.setText("Input");
		inputs.setLayout(new GridLayout(3, false));
		inputs.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		String tooltip = "A Fujaba-Model file has a \"."
				+ FILE_EXTENSION_FUJABA + "\" extension";
		textFujabaCatalog = addLabeledResourceSelection(inputs,
				"Fujaba Model:", tooltip, fujabaDialog);

		tooltip = "An Allocation Specifiaction file has a \"."
				+ FILE_EXTENSION_ALLOCATION + "\" extension";
		textAllocationSpecCatalog = addLabeledResourceSelection(inputs,
				"Allocation Specification:", tooltip, allocationSpecDialog);
		// TODO Auto-generated method stub

		configureListViewers(composite);

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
		fujabaDialog.setTitle("Choose a Fujaba File");
		fujabaDialog.setValidator(new ISelectionStatusValidator() {

			@Override
			public IStatus validate(Object[] selection) {
				// TODO Auto-generated method stub
				if (selection.length > 0
						&& selection[0] instanceof IFile
						&& ((IFile) selection[0]).getFileExtension()
								.equalsIgnoreCase(FILE_EXTENSION_FUJABA)) {
					// return new org.eclipse.core.runtime.S
					return new Status(Status.OK, "FujabaWizard",
							"Valid File selected");
				}
				return new Status(Status.ERROR, "FujabaWizard",
						"Select A Fujaba File");
			}
		});

		allocationSpecDialog = new ElementTreeSelectionDialog(getShell(),
				new WorkbenchLabelProvider(),
				new BaseWorkbenchContentProvider());
		allocationSpecDialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		allocationSpecDialog.setAllowMultiple(false);
		allocationSpecDialog.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				// TODO Auto-generated method stub
				if (element instanceof IFile
						&& ((IFile) element).getFileExtension()
								.equalsIgnoreCase(FILE_EXTENSION_ALLOCATION)) {
					return true;
				} else if (element instanceof IProject
						|| element instanceof IFolder) {
					return true;
				}
				return false;
			}
		});
		allocationSpecDialog
				.setTitle("Choose an Allocation Specification File");
		allocationSpecDialog.setValidator(new ISelectionStatusValidator() {

			@Override
			public IStatus validate(Object[] selection) {
				if (selection.length > 0
						&& selection[0] instanceof IFile
						&& ((IFile) selection[0]).getFileExtension()
								.equalsIgnoreCase(FILE_EXTENSION_ALLOCATION)) {
					// return new org.eclipse.core.runtime.S
					return new Status(Status.OK, "FujabaWizard",
							"Valid File selected");
				}
				return new Status(Status.ERROR, "FujabaWizard",
						"Select an Allocation Specification File");
			}
		});

	}

	private void configureListViewers(Composite composite) {
		Group cicElements = new Group(composite, SWT.SHADOW_IN);
		cicElements.setText("Component Instance Configurations:");
		cicElements.setLayout(new GridLayout(1, false));
		cicElements.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		viewerCIC = new ListViewer(cicElements, SWT.SINGLE | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.BORDER);
		viewerCIC.setContentProvider(new ArrayContentProvider());
		viewerCIC.getControl().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, true));
		viewerCIC.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = event.getSelection();
				if (!selection.isEmpty()
						&& selection instanceof IStructuredSelection) {

					Iterator it = ((IStructuredSelection) selection).iterator();
					while (it.hasNext()) {
						Object currentSelection = (Object) it.next();
						if (currentSelection instanceof ComponentInstanceConfiguration) {
							selectedCIC = (ComponentInstanceConfiguration) currentSelection;
							setPageComplete(isValid());
							break;
						}
					}

				}

			}
		});

		viewerCIC.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				return ((NamedElement) element).getName();

			}
		});

		Group hwpicElements = new Group(composite, SWT.SHADOW_IN);
		hwpicElements.setText("HW-Platform Instance Configurations:");
		hwpicElements.setLayout(new GridLayout(1, false));
		hwpicElements.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		viewerHWPIC = new ListViewer(hwpicElements, SWT.SINGLE | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.BORDER);
		viewerHWPIC.getControl().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, true));
		viewerHWPIC.setContentProvider(new ArrayContentProvider());
		viewerHWPIC
				.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						ISelection selection = event.getSelection();
						if (!selection.isEmpty()
								&& selection instanceof IStructuredSelection) {

							Iterator it = ((IStructuredSelection) selection)
									.iterator();
							while (it.hasNext()) {
								Object currentSelection = (Object) it.next();
								if (currentSelection instanceof HWPlatformInstanceConfiguration) {
									selectedHWPIC = (HWPlatformInstanceConfiguration) currentSelection;
									setPageComplete(isValid());
									break;
								}
							}

						}

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
		browse.setText("Select...");
		browse.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (dialog.open() == Window.OK) {
					IResource resource = (IResource) dialog.getFirstResult();
					input.setText(resource.getFullPath().toString());
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
			availableCICs = collectCICs();
			availableHWPICs = collectHWPICs();

			viewerCIC.setInput(availableCICs);
			viewerHWPIC.setInput(availableHWPICs);

		} else if (e.getSource() == textAllocationSpecCatalog) {
			allocationSpecDialog.setInitialSelection(ResourcesPlugin
					.getWorkspace().getRoot()
					.findMember(textAllocationSpecCatalog.getText()));
		}

		setPageComplete(isValid());

	}

	protected void setupBasedOnInitialSelections() {

		Iterator it = this.initialResourceSelection.iterator();
		while (it.hasNext()) {
			IResource currentResource = (IResource) it.next();
			if (currentResource.getType() == IResource.FILE
					&& ((IFile) currentResource).getFileExtension()
							.equalsIgnoreCase("fujaba")) {
				fujabaDialog.setInitialSelection(currentResource);
				textFujabaCatalog.setText(currentResource.getFullPath()
						.toString());
				return;
			}
		}

	}

	private boolean isValid() {
		if (textFujabaCatalog.getText().isEmpty()
				|| !textFujabaCatalog.getText().endsWith(".fujaba")) {
			setMessage("A Fujaba Model has to be given.",
					IMessageProvider.ERROR);
		}

		if (textAllocationSpecCatalog.getText().isEmpty()) {
			setMessage("Select an Allocation Specification File.",
					IMessageProvider.ERROR);
		}
		if (selectedCIC == null) {
			setMessage("Select an Allocation", IMessageProvider.ERROR);
		}

		if (!textFujabaCatalog.getText().isEmpty()
				&& !textAllocationSpecCatalog.getText().isEmpty()
				&& selectedHWPIC != null && selectedCIC != null) {
			// setMessage(null);
			return true;
		}

		return false;
	}

	public void saveSettings() {
		IDialogSettings s = getDialogSettings();

		if (s != null) {
			s.put(SETTING_FUJABA_FILE, textFujabaCatalog.getText());
			s.put(SETTING_ALLOCATION_FILE, textAllocationSpecCatalog.getText());
			s.put(SETTING_SELECTED_CIC_URIFRAGMENT,
					fujabaResource.getURIFragment(selectedCIC));
			s.put(SETTING_SELECTED_HWPIC_URIFRAGMENT,
					fujabaResource.getURIFragment(selectedHWPIC));
		}
	}

	public String getFujabaFilePath() {
		IDialogSettings s = getDialogSettings();
		return s.get(SETTING_FUJABA_FILE);
	}

	public String getAllocationSpecificationFilePath() {
		IDialogSettings s = getDialogSettings();
		return s.get(SETTING_ALLOCATION_FILE);
	}

	public String getURIFragmentOfCIC() {
		IDialogSettings s = getDialogSettings();
		return s.get(SETTING_SELECTED_CIC_URIFRAGMENT);
	}

	public String getURIFragmentOfHWPIC() {
		IDialogSettings s = getDialogSettings();
		return s.get(SETTING_SELECTED_HWPIC_URIFRAGMENT);
	}

	@SuppressWarnings("unchecked")
	private ArrayList<ComponentInstanceConfiguration> collectCICs() {
		ArrayList<ComponentInstanceConfiguration> newList = new ArrayList<ComponentInstanceConfiguration>();
		if (!textFujabaCatalog.getText().endsWith(".fujaba")) {
			return newList;
		}
		IPath path = new Path(textFujabaCatalog.getText());
		IFile f = ResourcesPlugin.getWorkspace().getRoot().getFile(path);

		if (f.exists()) {
			if (fujabaResource != null) {
				fujabaResource.unload();
			}
			fujabaResource = resourceSet.getResource(
					URI.createURI(textFujabaCatalog.getText()), true);
			RootNode rootNode = (RootNode) fujabaResource.getContents().get(0);
			ModelElementCategory modelElementCategory = ModelInstancePlugin
					.getInstance().getModelElementCategoryRegistry()
					.getModelElementCategory(rootNode, CIC_CATEGORY);
			newList.addAll((Collection<? extends ComponentInstanceConfiguration>) modelElementCategory
					.getModelElements());

		}
		return newList;

	}

	private ArrayList<HWPlatformInstanceConfiguration> collectHWPICs() {
		ArrayList<HWPlatformInstanceConfiguration> newList = new ArrayList<HWPlatformInstanceConfiguration>();
		if (!textFujabaCatalog.getText().endsWith(".fujaba")) {
			return newList;
		}
		IPath path = new Path(textFujabaCatalog.getText());
		IFile f = ResourcesPlugin.getWorkspace().getRoot().getFile(path);

		if (f.exists()) {
			if (fujabaResource != null) {
				fujabaResource.unload();
			}
			fujabaResource = resourceSet.getResource(
					URI.createURI(textFujabaCatalog.getText()), true);
			RootNode rootNode = (RootNode) fujabaResource.getContents().get(0);
			ModelElementCategory modelElementCategory = ModelInstancePlugin
					.getInstance().getModelElementCategoryRegistry()
					.getModelElementCategory(rootNode, HWPIC_CATEGORY);
			for (ExtendableElement element : modelElementCategory
					.getModelElements()) {
				if (element instanceof HWPlatformInstanceConfiguration) {
					newList.add((HWPlatformInstanceConfiguration) element);
				}
			}

		}
		return newList;

	}

	@Override
	public IWizardPage getPreviousPage() {
		// TODO Auto-generated method stub
		return null;
	}

}
