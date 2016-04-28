package org.muml.core.modelinstance.ui.batch;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
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
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
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
import org.muml.core.common.DiagramEditorUtil;
import org.muml.core.common.Messages;
import org.muml.core.modelinstance.ui.ModelinstanceUiPlugin;
import org.muml.core.modelinstance.ui.commands.CreateDiagramCommand;
import org.muml.core.modelinstance.ui.diagrams.IDiagramInformation;
import org.muml.mumlcore.NamedElement;
import org.muml.mumlcore.modelinstance.ModelElementCategory;
import org.muml.mumlcore.modelinstance.ModelinstancePackage;
import org.muml.mumlcore.modelinstance.RootNode;

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
		AdapterFactory adapterFactory = ((AdapterFactoryEditingDomain) editingDomain).getAdapterFactory(); 
		DiagramHierarchyContentsSelectionPage selectionPage = new DiagramHierarchyContentsSelectionPage(
				"diagram elements", null, null, adapterFactory);

		selectionPage.setTitle("Select source elements");
		selectionPage
				.setDescription("Select all elements to use as diagram element.");
		return selectionPage;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

	@Override
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			@Override
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				Collection<EObject> elements = diagramContentsSelectionPage
						.getSelectedElements();
				createDiagrams(elements, monitor, diagramContentsSelectionPage.isOverwriteDiagrams());
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
				ModelinstanceUiPlugin.getDefault().logError(
						"Error creating resources", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return true;
	}

	public void createDiagrams(Collection<EObject> elements,
			IProgressMonitor progressMonitor) {
		createDiagrams(elements, progressMonitor, false);
	}

	/**
	 * This method should be called within a workspace modify operation since it
	 * creates resources.
	 * 
	 * @param elements
	 *            The elements to create diagrams for.
	 * @param progressMonitor
	 *            The monitor to show progress in.
	 * @param overwriteDiagrams
	 *            <code>true</code> if diagrams should be overwritten, else a
	 *            unique name will be chosen to prevent overwriting existing
	 *            diagrams.
	 */
	public void createDiagrams(Collection<EObject> elements,
			IProgressMonitor progressMonitor, boolean overwriteDiagrams) {
		progressMonitor.beginTask(
				Messages.DiagramEditorUtil_CreateDiagramProgressTask,
				elements.size());

		final Resource modelResource = getModelResource();

		Map<String, IDiagramInformation> diagramInformationMap = ModelinstanceUiPlugin
				.getDefault().getDiagramInformationMap();
		Map<EObject, ElementInformation> elementInformationMap = new HashMap<EObject, ElementInformation>();

		// For each selected element find out if it can be used to create a
		// Diagram and how.
		for (EObject element : elements) {
			ElementInformation elementInformation = getElementInformation(
					element, diagramInformationMap);
			if (elementInformation != null) {
				elementInformationMap.put(element, elementInformation);
			}
		}

		// For each element within the elementInformationMap create the Diagram.
		int work = 0;
		for (Map.Entry<EObject, ElementInformation> entry : elementInformationMap
				.entrySet()) {
			EObject element = entry.getKey();
			ElementInformation elementInformation = entry.getValue();

			IDiagramInformation diagramInformation = elementInformation.diagramInformation;
			EObject diagramElement = elementInformation.diagramElement;
			Collection<EObject> contents = elementInformation.contents;

			// Diagram name
			String elementLabel = getElementLabel(element);

			// Build URI for the new diagram file
			IPath diagramDirectory = getModelPath().removeLastSegments(1);

			// Create subdirectories for all container elements that are
			// checked.
			for (EObject container : getContainmentHierarchy(element)) {
				if (elements.contains(container)
						&& elementInformationMap.containsKey(container)
						|| container instanceof ModelElementCategory) {
					diagramDirectory = diagramDirectory
							.append(getElementLabel(container));
				}
			}

			String diagramFilename;
			if (overwriteDiagrams) {
				diagramFilename = elementLabel + "." + diagramInformation.getFileExtension();
			} else {
				diagramFilename = getUniqueFileName(diagramDirectory, elementLabel, diagramInformation.getFileExtension());
			}

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
				OperationHistoryFactory.getOperationHistory().execute(command,
						new SubProgressMonitor(progressMonitor, 1), null);
			} catch (ExecutionException e) {
				ModelinstanceUiPlugin.getDefault().logError(
						"Unable to create model and diagramResource", e); //$NON-NLS-1$
			}
			DiagramEditorUtil.setCharset(WorkspaceSynchronizer
					.getFile(diagramResource));

			// Show that the work was done.
			work++;
			progressMonitor.worked(work);
		}
		DiagramEditorUtil.setCharset(WorkspaceSynchronizer
				.getFile(modelResource));
	}

	private ElementInformation getElementInformation(EObject element,
			Map<String, IDiagramInformation> map) {
		for (IDiagramInformation information : map.values()) {
			String modelId = information.getModelId();
			
			EClass elementClass = information.getDiagramElementClass();
			if (elementClass == null) {
				continue;
			}
			boolean useCategory = ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY
					.isSuperTypeOf(elementClass);
			if (!useCategory && isValidDiagramElement(modelId, element)) {
				Collection<EObject> contents = Collections.emptyList();
				return new ElementInformation(element, contents, information);
			} else if (useCategory
					&& element.eContainer() instanceof ModelElementCategory
					&& isValidTopLevelNodeElement(modelId,
							element.eContainer(), element)) {
				Collection<EObject> contents = Collections
						.singletonList(element);
				return new ElementInformation(null, contents, information);
			}
		}
		return null;
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
	
	private class ElementInformation {
		public IDiagramInformation diagramInformation;
		public Collection<EObject> contents;
		public EObject diagramElement;

		public ElementInformation(EObject diagramElement,
				Collection<EObject> contents,
				IDiagramInformation diagramInformation) {
			this.diagramElement = diagramElement;
			this.contents = contents;
			this.diagramInformation = diagramInformation;
		}



	}
}
