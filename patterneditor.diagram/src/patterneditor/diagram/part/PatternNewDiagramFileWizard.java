package patterneditor.diagram.part;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import patterneditor.PatternDiagram;
import patterneditor.PatterneditorFactory;
import patterneditor.diagram.edit.parts.PatternDiagramEditPart;
import de.uni_paderborn.fujaba.umlrt.model.modelstructure.RootNode;
import de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.umlrt.model.pattern.PatternFactory;

/**
 * @generated
 */
public class PatternNewDiagramFileWizard extends Wizard {

	/**
	 * @generated NOT
	 */
	private EObject diagramRoot;

	/**
	 * @generated
	 */
	private WizardNewFileCreationPage myFileCreationPage;

	/**
	 * @generated
	 */
	private ModelElementSelectionPage diagramRootElementSelectionPage;

	/**
	 * @generated
	 */
	private TransactionalEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	/**
	 * @generated NOT
	 */
	public PatternNewDiagramFileWizard(URI domainModelURI, EObject diagramRoot,
			TransactionalEditingDomain editingDomain) {

		// BEGIN ADDED
		this.diagramRoot = diagramRoot;
		// END ADDED

		assert domainModelURI != null : "Domain model uri must be specified"; //$NON-NLS-1$
		assert diagramRoot != null : "Doagram root element must be specified"; //$NON-NLS-1$
		assert editingDomain != null : "Editing domain must be specified"; //$NON-NLS-1$

		myFileCreationPage = new WizardNewFileCreationPage(
				Messages.PatternNewDiagramFileWizard_CreationPageName,
				StructuredSelection.EMPTY);
		myFileCreationPage
				.setTitle(Messages.PatternNewDiagramFileWizard_CreationPageTitle);
		myFileCreationPage.setDescription(NLS.bind(
				Messages.PatternNewDiagramFileWizard_CreationPageDescription,
				PatternDiagramEditPart.MODEL_ID));
		IPath filePath;
		String fileName = URI.decode(domainModelURI.trimFileExtension()
				.lastSegment());
		if (domainModelURI.isPlatformResource()) {
			filePath = new Path(domainModelURI.trimSegments(1)
					.toPlatformString(true));
		} else if (domainModelURI.isFile()) {
			filePath = new Path(domainModelURI.trimSegments(1).toFileString());
		} else {
			// TODO : use some default path
			throw new IllegalArgumentException(
					"Unsupported URI: " + domainModelURI); //$NON-NLS-1$
		}
		myFileCreationPage.setContainerFullPath(filePath);
		myFileCreationPage.setFileName(PatternDiagramEditorUtil
				.getUniqueFileName(filePath, fileName, "pattern_diagram")); //$NON-NLS-1$

		diagramRootElementSelectionPage = new DiagramRootElementSelectionPage(
				Messages.PatternNewDiagramFileWizard_RootSelectionPageName);
		diagramRootElementSelectionPage
				.setTitle(Messages.PatternNewDiagramFileWizard_RootSelectionPageTitle);
		diagramRootElementSelectionPage
				.setDescription(Messages.PatternNewDiagramFileWizard_RootSelectionPageDescription);
		diagramRootElementSelectionPage.setModelElement(diagramRoot);

		myEditingDomain = editingDomain;
	}

	/**
	 * @generated
	 */
	public void addPages() {
		addPage(myFileCreationPage);
		addPage(diagramRootElementSelectionPage);
	}

	/**
	 * @generated NOT
	 */
	public boolean performFinish() {
		LinkedList<IFile> affectedFiles = new LinkedList<IFile>();
		IFile diagramFile = myFileCreationPage.createNewFile();
		PatternDiagramEditorUtil.setCharset(diagramFile);
		affectedFiles.add(diagramFile);
		URI diagramModelURI = URI.createPlatformResourceURI(diagramFile
				.getFullPath().toString(), true);
		ResourceSet resourceSet = myEditingDomain.getResourceSet();
		final Resource diagramResource = resourceSet
				.createResource(diagramModelURI);
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				myEditingDomain,
				Messages.PatternNewDiagramFileWizard_InitDiagramCommand,
				affectedFiles) {

			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				// BEGIN ADDED
				EObject modelElement = diagramRootElementSelectionPage
						.getModelElement();

				if (modelElement == null) {
					PatternDiagram patternDiagram = PatterneditorFactory.eINSTANCE
							.createPatternDiagram();

					CoordinationPattern coordinationPattern = PatternFactory.eINSTANCE
							.createCoordinationPattern();
					patternDiagram.setCoordinationPattern(coordinationPattern);

					((RootNode) diagramRoot).getDiagrams().add(patternDiagram);
					try {
						diagramRoot.eResource().save(Collections.EMPTY_MAP);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					modelElement = patternDiagram;
				}
				// END ADDED

				int diagramVID = PatternVisualIDRegistry
						.getDiagramVisualID(modelElement);
				if (diagramVID != PatternDiagramEditPart.VISUAL_ID) {
					return CommandResult
							.newErrorCommandResult(Messages.PatternNewDiagramFileWizard_IncorrectRootError);
				}
				Diagram diagram = ViewService.createDiagram(modelElement,
						PatternDiagramEditPart.MODEL_ID,
						PatternDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				diagramResource.getContents().add(diagram);
				return CommandResult.newOKCommandResult();
			}
		};
		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new NullProgressMonitor(), null);
			diagramResource.save(PatternDiagramEditorUtil.getSaveOptions());
			PatternDiagramEditorUtil.openDiagram(diagramResource);
		} catch (ExecutionException e) {
			PatternDiagramEditorPlugin.getInstance().logError(
					"Unable to create model and diagram", e); //$NON-NLS-1$
		} catch (IOException ex) {
			PatternDiagramEditorPlugin.getInstance().logError(
					"Save operation failed for: " + diagramModelURI, ex); //$NON-NLS-1$
		} catch (PartInitException ex) {
			PatternDiagramEditorPlugin.getInstance().logError(
					"Unable to open editor", ex); //$NON-NLS-1$
		}
		return true;
	}

	/**
	 * @generated NOT
	 */
	private static class DiagramRootElementSelectionPage extends
			ModelElementSelectionPage {

		private Button selectOption;
		private Button createOption;

		/**
		 * @generated NOT
		 */
		public boolean isCreateSelected() {
			return createOption.getSelection();
		}

		/**
		 * @generated NOT
		 */
		public EObject getModelElement() {
			if (isCreateSelected()) {
				return null;
			}
			return super.getModelElement();
		}

		/**
		 * @generated NOT
		 */
		@Override
		public void createControl(Composite parent) {
			initializeDialogUnits(parent);

			Composite plate = new Composite(parent, SWT.NONE);
			plate.setLayoutData(new GridData(GridData.FILL_BOTH));
			GridLayout layout = new GridLayout();
			layout.marginWidth = 0;
			plate.setLayout(layout);
			setControl(plate);

			createOption = new Button(plate, SWT.RADIO);
			createOption.setText("Neues Modell-Element anlegen");
			selectOption = new Button(plate, SWT.RADIO);
			selectOption.setText("Bestehendes Modell-Element auswählen");

			Composite selectPlate = new Composite(plate, SWT.NONE);
			selectPlate.setLayoutData(new GridData(GridData.FILL_BOTH));
			GridLayout selectLayout = new GridLayout();
			selectLayout.marginLeft = 16;
			selectPlate.setLayout(selectLayout);

			super.createControl(selectPlate);

			/*
			 * Add Listeners to the Option Buttons
			 */
			createOption.addListener(SWT.Selection, new Listener() {

				@Override
				public void handleEvent(Event event) {
					modelViewer.getTree().setEnabled(false);
					setPageComplete(validatePage());
				}
			});
			selectOption.addListener(SWT.Selection, new Listener() {

				@Override
				public void handleEvent(Event event) {
					modelViewer.getTree().setEnabled(true);
					setPageComplete(validatePage());
				}
			});
			createOption.setSelection(true);
			modelViewer.getTree().setEnabled(false);

			/*
			 * Validate Page
			 */
			setPageComplete(validatePage());
		}

		/**
		 * @generated
		 */
		protected DiagramRootElementSelectionPage(String pageName) {
			super(pageName);
		}

		/**
		 * @generated
		 */
		protected String getSelectionTitle() {
			return Messages.PatternNewDiagramFileWizard_RootSelectionPageSelectionTitle;
		}

		/**
		 * @generated
		 */
		protected boolean validatePage() {
			if (isCreateSelected()) {
				setErrorMessage(null);
				return true;
			}
			if (selectedModelElement == null) {
				setErrorMessage(Messages.PatternNewDiagramFileWizard_RootSelectionPageNoSelectionMessage);
				return false;
			}
			boolean result = ViewService
					.getInstance()
					.provides(
							new CreateDiagramViewOperation(
									new EObjectAdapter(selectedModelElement),
									PatternDiagramEditPart.MODEL_ID,
									PatternDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT));
			setErrorMessage(result ? null
					: Messages.PatternNewDiagramFileWizard_RootSelectionPageInvalidSelectionMessage);
			return result;
		}
	}
}
