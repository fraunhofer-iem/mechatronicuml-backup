package de.uni_paderborn.fujaba.muml.utilities.batch;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.storydriven.modeling.NamedElement;

import de.fujaba.modelinstance.ModelElementCategory;
import de.fujaba.modelinstance.ModelinstancePackage;
import de.fujaba.modelinstance.RootNode;
import de.fujaba.newwizard.FujabaNewwizardPlugin;
import de.fujaba.newwizard.Messages;
import de.fujaba.newwizard.commands.CreateDiagramCommand;
import de.fujaba.newwizard.diagrams.DiagramEditorUtil;
import de.fujaba.newwizard.diagrams.IDiagramInformation;
import de.uni_paderborn.fujaba.muml.utilities.ui.pages.DiagramHierarchyContentsSelectionPage;

public class BatchDiagramCreationWizard extends Wizard implements INewWizard {
	private TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
			.createEditingDomain();

	private IStructuredSelection selection;
	private DiagramHierarchyContentsSelectionPage diagramContentsSelectionPage;

	public IPath getModelPath() {
		@SuppressWarnings("rawtypes")
		Iterator it = selection.iterator();
		if (it.hasNext()) {
			Object object = it.next();
			IResource selectedResource = null;
			if (object instanceof IResource) {
				selectedResource = (IResource) object;
			} else if (object instanceof IAdaptable) {
				selectedResource = (IResource) ((IAdaptable) object)
						.getAdapter(IResource.class);
			}
			if (selectedResource != null) {
				return selectedResource.getFullPath();

			}
		}
		return null;
	}

	public Resource getModelResource() {
		URI modelURI = URI.createPlatformResourceURI(getModelPath()
				.toOSString(), true);
		return editingDomain.getResourceSet().getResource(modelURI, true);

	}

	@Override
	public void addPages() {
		diagramContentsSelectionPage = createSelectionPage();
		addPage(diagramContentsSelectionPage);
	}

	@Override
	public void createPageControls(Composite pageContainer) {
		super.createPageControls(pageContainer);
		diagramContentsSelectionPage.resourceChanged(getModelResource());
	}

	protected DiagramHierarchyContentsSelectionPage createSelectionPage() {
		DiagramHierarchyContentsSelectionPage selectionPage = new DiagramHierarchyContentsSelectionPage(
				"diagram elements", null, null);

		selectionPage.setTitle("Select source elements");
		selectionPage
				.setDescription("Select all elements to use as diagram element.");
		return selectionPage;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				Collection<EObject> elements = diagramContentsSelectionPage
						.getSelectedElements();
				createDiagrams(elements, monitor);
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						Messages.CreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				FujabaNewwizardPlugin.getDefault().logError(
						"Error creating resources", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return true;
	}

	/**
	 * This method should be called within a workspace modify operation since it
	 * creates resources.
	 * 
	 * @param modelURI
	 * @param elements
	 * @param progressMonitor
	 */
	public void createDiagrams(Collection<EObject> elements,
			IProgressMonitor progressMonitor) {
		progressMonitor.beginTask(
				Messages.DiagramEditorUtil_CreateDiagramProgressTask,
				elements.size());

		final Resource modelResource = getModelResource();

		Map<String, IDiagramInformation> map = FujabaNewwizardPlugin
				.getDefault().getDiagramInformationMap();

		int work = 0;
		for (EObject element : elements) {
			// Ask extension point for editorId and diagramInformation for this
			// element!
			EObject diagramElement = null;
			Collection<EObject> contents = null;
			IDiagramInformation diagramInformation = null;
			for (IDiagramInformation information : map.values()) {
				String modelId = information.getModelId();
				boolean useCategory = ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY
						.isSuperTypeOf(information.getDiagramElementClass());
				if (!useCategory && isValidDiagramElement(modelId, element)) {
					diagramElement = element;
					contents = Collections.emptyList();
				} else if (useCategory
						&& element.eContainer() instanceof ModelElementCategory
						&& isValidTopLevelNodeElement(modelId,
								element.eContainer(), element)) {
					diagramElement = null;
					contents = Collections.singletonList(element);
				} else {
					continue;
				}
				diagramInformation = information;
				break;
			}

			if (diagramInformation != null) {
				// Diagram name
				String elementLabel = getElementLabel(element);

				// Build URI for the new diagram file
				IPath diagramDirectory = getModelPath().removeLastSegments(1);
	
				// Create subdirectories for all container elements that are checked.
				for (EObject container : getContainmentHierarchy(element)) {
					if (elements.contains(container) || container instanceof ModelElementCategory) {
						diagramDirectory = diagramDirectory.append(getElementLabel(container));
					}
				}

				String diagramFilename = getUniqueFileName(diagramDirectory,
						elementLabel, diagramInformation.getFileExtension());
				IPath diagramPath = diagramDirectory.append(diagramFilename);
				URI diagramURI = URI.createPlatformResourceURI(
						diagramPath.toOSString(), true);

				// Resource
				final Resource diagramResource = editingDomain.getResourceSet()
						.createResource(diagramURI);

				AbstractTransactionalCommand command = new CreateDiagramCommand(
						editingDomain,
						Messages.DiagramEditorUtil_CreateDiagramCommandLabel,
						Collections.EMPTY_LIST, modelResource, diagramResource,
						diagramElement, contents, diagramURI.lastSegment(),
						diagramInformation);
				try {
					OperationHistoryFactory.getOperationHistory().execute(
							command,
							new SubProgressMonitor(progressMonitor, 1), null);
				} catch (ExecutionException e) {
					FujabaNewwizardPlugin.getDefault().logError(
							"Unable to create model and diagramResource", e); //$NON-NLS-1$
				}
				DiagramEditorUtil.setCharset(WorkspaceSynchronizer
						.getFile(diagramResource));
			}

			// Show that the work was done.
			work++;
			progressMonitor.worked(work);
		}
		DiagramEditorUtil.setCharset(WorkspaceSynchronizer
				.getFile(modelResource));
	}

	private LinkedList<EObject> getContainmentHierarchy(EObject element) {
		LinkedList<EObject> hierarchy = new LinkedList<EObject>();
		EObject container = element.eContainer();
		while (container != null && !(container instanceof RootNode)) {
			hierarchy.add(0, container);
			container = container.eContainer();
		}
		return hierarchy;
	}

	private String getElementLabel(EObject element) {
		String label = null;
		if (element instanceof NamedElement) {
			label = ((NamedElement) element).getName();
		} else if (element instanceof ModelElementCategory) {
			label = ((ModelElementCategory) element).getName();
		}

		if (label == null || label.equals("")) {
			label = element.eClass().getName();
		}
		
		return label;
	}

	private boolean isValidDiagramElement(String modelId, EObject diagramElement) {
		IAdaptable adapter = new EObjectAdapter(diagramElement);
		IOperation operation = new CreateDiagramViewOperation(adapter, modelId,
				null);
		return ViewService.getInstance().provides(operation);
	}

	private boolean isValidTopLevelNodeElement(String modelId,
			EObject diagramElement, EObject topLevelNodeElement) {
		Diagram diagram = ViewService.createDiagram(diagramElement, modelId,
				null);
		IAdaptable adapter = new EObjectAdapter(topLevelNodeElement);
		IOperation operation = new CreateNodeViewOperation(adapter, diagram,
				null, 0, false, null);
		return ViewService.getInstance().provides(operation);
	}

	private static String getUniqueFileName(IPath containerFullPath,
			String fileName, String extension) {
		if (containerFullPath == null) {
			containerFullPath = new Path(""); //$NON-NLS-1$
		}
		if (fileName == null || fileName.trim().length() == 0) {
			fileName = "default"; //$NON-NLS-1$
		}
		IPath filePath = containerFullPath.append(fileName);
		if (extension != null && !extension.equals(filePath.getFileExtension())) {
			filePath = filePath.addFileExtension(extension);
		}
		extension = filePath.getFileExtension();
		fileName = filePath.removeFileExtension().lastSegment();
		int i = 1;
		while (ResourcesPlugin.getWorkspace().getRoot().exists(filePath)) {
			i++;
			filePath = containerFullPath.append(fileName + i);
			if (extension != null) {
				filePath = filePath.addFileExtension(extension);
			}
		}
		return filePath.lastSegment();
	}
}
