/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.ape.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.MissingResourceException;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.muml.ape.PropertiesFactory;
import org.muml.ape.PropertiesPackage;
import org.muml.ape.PropertyGenerator;
import org.muml.ape.Reconciler;
import org.muml.ape.provider.PropertiesEditPlugin;
import org.muml.ape.reconcile.ReconcileCommand;

/**
 * This is a simple wizard for creating a new model file.
 */
public class PropertiesModelWizard extends Wizard implements INewWizard {
	/**
	 * The supported extensions for created files.
	 */
	public static final List<String> FILE_EXTENSIONS = Collections
			.unmodifiableList(Arrays.asList(PropertiesEditorPlugin.INSTANCE
					.getString("_UI_PropertiesEditorFilenameExtensions").split(
							"\\s*,\\s*")));

	/**
	 * A formatted list of supported file extensions, suitable for display.
	 */
	public static final String FORMATTED_FILE_EXTENSIONS = PropertiesEditorPlugin.INSTANCE
			.getString("_UI_PropertiesEditorFilenameExtensions").replaceAll(
					"\\s*,\\s*", ", ");

	/**
	 * This caches an instance of the model package.
	 */
	protected PropertiesPackage propertiesPackage = PropertiesPackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory.
	 */
	protected PropertiesFactory propertiesFactory = propertiesPackage
			.getPropertiesFactory();

	/**
	 * This is the file creation page.
	 */
	protected PropertiesModelWizardNewFileCreationPage newFileCreationPage;

	/**
	 * This is the initial object creation page.
	 */
	protected PropertiesModelWizardInitialObjectCreationPage initialObjectCreationPage;

	/**
	 * This is the initial object creation page.
	 */
	protected PropertiesModelWizardSelectGenmodelPage selectGenmodelPage;

	/**
	 * Remember the selection during initialization for populating the default
	 * container.
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization.
	 */
	protected IWorkbench workbench;

	/**
	 * Caches the names of the types that can be created as the root object.
	 */
	protected List<String> initialObjectNames;

	/**
	 * This just records the information.
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(PropertiesEditorPlugin.INSTANCE
				.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE
				.getImageDescriptor(PropertiesEditorPlugin.INSTANCE
						.getImage("full/wizban/NewProperties")));
	}

	/**
	 * Returns the names of the types that can be created as the root object.
	 */
	protected Collection<String> getInitialObjectNames() {
		if (initialObjectNames == null) {
			initialObjectNames = new ArrayList<String>();
			for (EClassifier eClassifier : propertiesPackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass)eClassifier;
					if (!eClass.isAbstract()) {
						initialObjectNames.add(eClass.getName());
					}
				}
			}
			Collections.sort(initialObjectNames, CommonPlugin.INSTANCE.getComparator());
		}
		return initialObjectNames;
	}

	/**
	 * Create a new model.
	 */
	protected EObject createInitialModel() {
		EObject rootObject = propertiesFactory.createPropertyGenerator();
		return rootObject;
	}

	/**
	 * Do the work after everything is specified.
	 */
	@Override
	public boolean performFinish() {
		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor progressMonitor) {
					try {
						// Create a resource set
						//
						ResourceSet resourceSet = new ResourceSetImpl();

						// Get the URI of the model file.
						//
						URI fileURI = URI.createPlatformResourceURI(modelFile
								.getFullPath().toString(), true);

						// Create a resource for this file.
						//
						Resource resource = resourceSet.createResource(fileURI);

						// Create a PropertyGenerator, connect to GenModel and reconcile
						PropertyGenerator rootObject = PropertiesFactory.eINSTANCE.createPropertyGenerator();
						Reconciler reconciler = PropertiesFactory.eINSTANCE.createReconciler();
						rootObject.setReconciler(reconciler);

						// Connect to genmodel
						Resource genmodelResource = resourceSet.createResource(URI.createPlatformResourceURI(selectGenmodelPage.getGenModel().getFullPath().toString(), true));
						genmodelResource.load(Collections.emptyMap());
						EcoreUtil.resolveAll(genmodelResource);
						if (!genmodelResource.getContents().isEmpty() && genmodelResource.getContents().iterator().next() instanceof GenModel) {
							GenModel genModel = (GenModel) genmodelResource.getContents().iterator().next();
							rootObject.setGenModel(genModel);
						}

						// Add the initial model object to the contents.
						//
						if (rootObject != null) {
							resource.getContents().add(rootObject);
						}

						// Reconcile
						ReconcileCommand reconcileCommand = new ReconcileCommand(rootObject);
						if (reconcileCommand.canExecute()) {
							reconcileCommand.execute();
						}

						// Save the contents of the resource to the file system.
						//
						resource.save(Collections.emptyMap());
					} catch (Exception exception) {
						PropertiesEditorPlugin.INSTANCE.log(exception);
					} finally {
						progressMonitor.done();
					}
				}
			};

			getContainer().run(false, false, operation);

			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = workbench
					.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(
						modelFile);
				getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						((ISetSelectionTarget) activePart)
								.selectReveal(targetSelection);
					}
				});
			}

			// Open an editor on the new file.
			//
			try {
				page.openEditor(
						new FileEditorInput(modelFile),
						workbench
								.getEditorRegistry()
								.getDefaultEditor(
										modelFile.getFullPath().toString())
								.getId());
			} catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(),
						PropertiesEditorPlugin.INSTANCE
								.getString("_UI_OpenEditorError_label"),
						exception.getMessage());
				return false;
			}

			return true;
		} catch (Exception exception) {
			PropertiesEditorPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	/**
	 * This is the one page of the wizard.
	 */
	public class PropertiesModelWizardNewFileCreationPage extends
			WizardNewFileCreationPage {
		/**
		 * Pass in the selection.
		 */
		public PropertiesModelWizardNewFileCreationPage(String pageId,
				IStructuredSelection selection) {
			super(pageId, selection);
		}

		/**
		 * The framework calls this to see if the file is correct.
		 */
		@Override
		protected boolean validatePage() {
			if (super.validatePage()) {
				String extension = new Path(getFileName()).getFileExtension();
				if (extension == null || !FILE_EXTENSIONS.contains(extension)) {
					String key = FILE_EXTENSIONS.size() > 1 ? "_WARN_FilenameExtensions"
							: "_WARN_FilenameExtension";
					setErrorMessage(PropertiesEditorPlugin.INSTANCE.getString(
							key, new Object[] { FORMATTED_FILE_EXTENSIONS }));
					return false;
				}
				return true;
			}
			return false;
		}


		public IFile getModelFile() {
			return ResourcesPlugin.getWorkspace().getRoot()
					.getFile(getContainerFullPath().append(getFileName()));
		}
	}

	/**
	 * This is the page where the type of object to create is selected.
	 */
	public class PropertiesModelWizardInitialObjectCreationPage extends WizardPage {

		protected Combo initialObjectField;

		protected List<String> encodings;

		protected Combo encodingField;

		/**
		 * Pass in the selection.
		 */
		public PropertiesModelWizardInitialObjectCreationPage(String pageId) {
			super(pageId);
		}

		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE); {
				GridLayout layout = new GridLayout();
				layout.numColumns = 1;
				layout.verticalSpacing = 12;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}

			Label containerLabel = new Label(composite, SWT.LEFT);
			{
				containerLabel.setText(PropertiesEditorPlugin.INSTANCE.getString("_UI_ModelObject"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				containerLabel.setLayoutData(data);
			}

			initialObjectField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				initialObjectField.setLayoutData(data);
			}

			for (String objectName : getInitialObjectNames()) {
				initialObjectField.add(getLabel(objectName));
			}

			if (initialObjectField.getItemCount() == 1) {
				initialObjectField.select(0);
			}
			initialObjectField.addModifyListener(validator);

			Label encodingLabel = new Label(composite, SWT.LEFT);
			{
				encodingLabel.setText(PropertiesEditorPlugin.INSTANCE.getString("_UI_XMLEncoding"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				encodingLabel.setLayoutData(data);
			}
			encodingField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				encodingField.setLayoutData(data);
			}

			for (String encoding : getEncodings()) {
				encodingField.add(encoding);
			}

			encodingField.select(0);
			encodingField.addModifyListener(validator);

			setPageComplete(validatePage());
			setControl(composite);
		}

		protected ModifyListener validator =
			new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					setPageComplete(validatePage());
				}
			};

		protected boolean validatePage() {
			return getInitialObjectName() != null && getEncodings().contains(encodingField.getText());
		}


		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				if (initialObjectField.getItemCount() == 1) {
					initialObjectField.clearSelection();
					encodingField.setFocus();
				}
				else {
					encodingField.clearSelection();
					initialObjectField.setFocus();
				}
			}
		}


		public String getInitialObjectName() {
			String label = initialObjectField.getText();

			for (String name : getInitialObjectNames()) {
				if (getLabel(name).equals(label)) {
					return name;
				}
			}
			return null;
		}

		public String getEncoding() {
			return encodingField.getText();
		}

		/**
		 * Returns the label for the specified type name.
		 */
		protected String getLabel(String typeName) {
			try {
				return PropertiesEditPlugin.INSTANCE.getString("_UI_" + typeName + "_type");
			}
			catch(MissingResourceException mre) {
				PropertiesEditorPlugin.INSTANCE.log(mre);
			}
			return typeName;
		}

		protected Collection<String> getEncodings() {
			if (encodings == null) {
				encodings = new ArrayList<String>();
				for (StringTokenizer stringTokenizer = new StringTokenizer(PropertiesEditorPlugin.INSTANCE.getString("_UI_XMLEncodingChoices")); stringTokenizer.hasMoreTokens(); ) {
					encodings.add(stringTokenizer.nextToken());
				}
			}
			return encodings;
		}
	}

	/**
	 * This is the page where the type of object to create is selected.
	 */
	public class PropertiesModelWizardSelectGenmodelPage extends
			WizardPage {

		private IFile genModel;

		/**
		 * Pass in the selection.
		 */
		public PropertiesModelWizardSelectGenmodelPage(String pageId) {
			super(pageId);
		}


		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			GridLayout layout = new GridLayout();
			layout.numColumns = 1;
			layout.verticalSpacing = 12;
			composite.setLayout(layout);

			GridData data = new GridData();
			data.verticalAlignment = GridData.FILL;
			data.grabExcessVerticalSpace = true;
			data.horizontalAlignment = GridData.FILL;
			composite.setLayoutData(data);

			// TODO: Show resources to select genmodel
			
			
			setPageComplete(validatePage());
			setControl(composite);
		}

		protected ModifyListener validator = new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setPageComplete(validatePage());
			}
		};

		protected boolean validatePage() {
			return genModel != null;
		}

		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				// Set Focus
			}
		}

		/**
		 * Returns the label for the specified type name.
		 */
		protected String getLabel(String typeName) {
			try {
				return PropertiesEditPlugin.INSTANCE.getString("_UI_"
						+ typeName + "_type");
			} catch (MissingResourceException mre) {
				PropertiesEditorPlugin.INSTANCE.log(mre);
			}
			return typeName;
		}
		
		public void setGenModel(IFile genModel) {
			this.genModel = genModel;
		}


		public IFile getGenModel() {
			return genModel;
		}

	}

	/**
	 * The framework calls this to create the contents of the wizard.
	 */
	@Override
	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new PropertiesModelWizardNewFileCreationPage(
				"newFileCreationPage", selection);
		newFileCreationPage.setTitle(PropertiesEditorPlugin.INSTANCE
				.getString("_UI_PropertiesModelWizard_label"));
		newFileCreationPage.setDescription(PropertiesEditorPlugin.INSTANCE
				.getString("_UI_PropertiesModelWizard_description"));
		newFileCreationPage.setFileName(PropertiesEditorPlugin.INSTANCE
				.getString("_UI_PropertiesEditorFilenameDefaultBase")
				+ "."
				+ FILE_EXTENSIONS.get(0));
		addPage(newFileCreationPage);
		
		// Create the genmodel selection page, do not add yet
		selectGenmodelPage = new PropertiesModelWizardSelectGenmodelPage(
				"selectGenmodelPage");
		selectGenmodelPage.setTitle(PropertiesEditorPlugin.INSTANCE
				.getString("_UI_PropertiesModelWizard_label"));
		selectGenmodelPage
				.setDescription("Select a genmodel");

		// Try and get the resource selection to determine a current directory
		// for the file dialog.
		//
		IResource selectedResource = null;
		if (selection != null && !selection.isEmpty()) {
			// Get the resource...
			//
			Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				//
				selectedResource = (IResource) selectedElement;
			}
		}
		
		IResource selectedLocation = null;
		if (selectedResource != null && selectedResource.getType() == IResource.FILE) {
			// 1. Use the parent as location for the propsheet file
			IResource parentResource = selectedResource.getParent();
			if (parentResource instanceof IFolder || parentResource instanceof IProject) {
				selectedLocation = parentResource;
			}
			
			// 2. Check if a genmodel is selected
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.createResource(URI.createPlatformResourceURI(selectedResource.getFullPath().toString(), true));
			try {
				resource.load(Collections.emptyMap());
			} catch (IOException e) {
			}
			if (!resource.getContents().isEmpty() && resource.getContents().iterator().next() instanceof GenModel) {
				selectGenmodelPage.setGenModel((IFile) selectedResource);
			}
		}

		if (selectedLocation != null) {
			// Set this for the container.
			//
			newFileCreationPage.setContainerFullPath(selectedResource
					.getFullPath());

			// Make up a unique new name here.
			//
//			String defaultModelBaseFilename = PropertiesEditorPlugin.INSTANCE
//					.getString("_UI_PropertiesEditorFilenameDefaultBase");
			String defaultModelBaseFilename = selectedResource.getName().split("\\.")[0];
			
			String defaultModelFilenameExtension = FILE_EXTENSIONS
					.get(0);
			String modelFilename = defaultModelBaseFilename + "."
					+ defaultModelFilenameExtension;
			for (int i = 1; ((IContainer) selectedLocation)
					.findMember(modelFilename) != null; ++i) {
				modelFilename = defaultModelBaseFilename + i + "."
						+ defaultModelFilenameExtension;
			}
			newFileCreationPage.setFileName(modelFilename);
		}
		

		if (selectGenmodelPage.getGenModel() == null) {
			addPage(selectGenmodelPage);
		}
		
	}

	/**
	 * Get the file from the page.
	 */
	public IFile getModelFile() {
		return newFileCreationPage.getModelFile();
	}

}
