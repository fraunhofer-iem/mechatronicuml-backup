package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.KeyHandler;
import org.eclipse.gef.KeyStroke;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.marker.MarkerNavigationService;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentProvider;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.navigator.resources.ProjectExplorer;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.IShowInTargetList;
import org.eclipse.ui.part.ShowInContext;
import org.storydriven.modeling.ExtendableElement;

import de.fujaba.newwizard.IFujabaEditor;
import de.fujaba.newwizard.InitialElementAdapter;

/**
 * @generated
 */
public class RealtimestatechartDiagramEditor extends DiagramDocumentEditor
		implements IGotoMarker, IFujabaEditor {

	/**
	 * @generated
	 */
	public static final String ID = "de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final String CONTEXT_ID = "de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.ui.diagramContext"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public RealtimestatechartDiagramEditor() {
		super(true);
	}

	/**
	 * @generated
	 */
	protected String getContextID() {
		return CONTEXT_ID;
	}

	/**
	 * @generated
	 */
	protected PaletteRoot createPaletteRoot(PaletteRoot existingPaletteRoot) {
		PaletteRoot root = super.createPaletteRoot(existingPaletteRoot);
		new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlPaletteFactory()
				.fillPalette(root);
		return root;
	}

	/**
	 * @generated
	 */
	public String getContributorId() {
		return de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin.ID;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class type) {
		if (type == IShowInTargetList.class) {
			return new IShowInTargetList() {
				public String[] getShowInTargetIds() {
					return new String[] { ProjectExplorer.VIEW_ID };
				}
			};
		}
		return super.getAdapter(type);
	}

	/**
	 * @generated
	 */
	protected IDocumentProvider getDocumentProvider(IEditorInput input) {
		if (input instanceof IFileEditorInput
				|| input instanceof URIEditorInput) {
			return de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().getDocumentProvider();
		}
		return super.getDocumentProvider(input);
	}

	/**
	 * @generated
	 */
	public TransactionalEditingDomain getEditingDomain() {
		IDocument document = getEditorInput() != null ? getDocumentProvider()
				.getDocument(getEditorInput()) : null;
		if (document instanceof IDiagramDocument) {
			return ((IDiagramDocument) document).getEditingDomain();
		}
		return super.getEditingDomain();
	}

	/**
	 * @generated
	 */
	protected void setDocumentProvider(IEditorInput input) {
		if (input instanceof IFileEditorInput
				|| input instanceof URIEditorInput) {
			setDocumentProvider(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().getDocumentProvider());
		} else {
			super.setDocumentProvider(input);
		}
	}

	/**
	 * @generated
	 */
	public void gotoMarker(IMarker marker) {
		MarkerNavigationService.getInstance().gotoMarker(this, marker);
	}

	/**
	 * @generated
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	 * @generated
	 */
	public void doSaveAs() {
		performSaveAs(new NullProgressMonitor());
	}

	/**
	 * @generated
	 */
	protected void performSaveAs(IProgressMonitor progressMonitor) {
		Shell shell = getSite().getShell();
		IEditorInput input = getEditorInput();
		SaveAsDialog dialog = new SaveAsDialog(shell);
		IFile original = input instanceof IFileEditorInput ? ((IFileEditorInput) input)
				.getFile() : null;
		if (original != null) {
			dialog.setOriginalFile(original);
		}
		dialog.create();
		IDocumentProvider provider = getDocumentProvider();
		if (provider == null) {
			// editor has been programmatically closed while the dialog was open
			return;
		}
		if (provider.isDeleted(input) && original != null) {
			String message = NLS
					.bind(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.RealtimestatechartDiagramEditor_SavingDeletedFile,
							original.getName());
			dialog.setErrorMessage(null);
			dialog.setMessage(message, IMessageProvider.WARNING);
		}
		if (dialog.open() == Window.CANCEL) {
			if (progressMonitor != null) {
				progressMonitor.setCanceled(true);
			}
			return;
		}
		IPath filePath = dialog.getResult();
		if (filePath == null) {
			if (progressMonitor != null) {
				progressMonitor.setCanceled(true);
			}
			return;
		}
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IFile file = workspaceRoot.getFile(filePath);
		final IEditorInput newInput = new FileEditorInput(file);
		// Check if the editor is already open
		IEditorMatchingStrategy matchingStrategy = getEditorDescriptor()
				.getEditorMatchingStrategy();
		IEditorReference[] editorRefs = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage()
				.getEditorReferences();
		for (int i = 0; i < editorRefs.length; i++) {
			if (matchingStrategy.matches(editorRefs[i], newInput)) {
				MessageDialog
						.openWarning(
								shell,
								de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.RealtimestatechartDiagramEditor_SaveAsErrorTitle,
								de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.RealtimestatechartDiagramEditor_SaveAsErrorMessage);
				return;
			}
		}
		boolean success = false;
		try {
			provider.aboutToChange(newInput);
			getDocumentProvider(newInput).saveDocument(progressMonitor,
					newInput,
					getDocumentProvider().getDocument(getEditorInput()), true);
			success = true;
		} catch (CoreException x) {
			IStatus status = x.getStatus();
			if (status == null || status.getSeverity() != IStatus.CANCEL) {
				ErrorDialog
						.openError(
								shell,
								de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.RealtimestatechartDiagramEditor_SaveErrorTitle,
								de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.RealtimestatechartDiagramEditor_SaveErrorMessage,
								x.getStatus());
			}
		} finally {
			provider.changed(newInput);
			if (success) {
				setInput(newInput);
			}
		}
		if (progressMonitor != null) {
			progressMonitor.setCanceled(!success);
		}
	}

	/**
	 * @generated
	 */
	public ShowInContext getShowInContext() {
		return new ShowInContext(getEditorInput(), getNavigatorSelection());
	}

	/**
	 * @generated
	 */
	private ISelection getNavigatorSelection() {
		IDiagramDocument document = getDiagramDocument();
		if (document == null) {
			return StructuredSelection.EMPTY;
		}
		Diagram diagram = document.getDiagram();
		if (diagram == null || diagram.eResource() == null) {
			return StructuredSelection.EMPTY;
		}
		IFile file = WorkspaceSynchronizer.getFile(diagram.eResource());
		if (file != null) {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.navigator.MumlNavigatorItem item = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.navigator.MumlNavigatorItem(
					diagram, file, false);
			return new StructuredSelection(item);
		}
		return StructuredSelection.EMPTY;
	}

	/**
	 * @generated
	 */
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.DiagramEditorContextMenuProvider provider = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.DiagramEditorContextMenuProvider(
				this, getDiagramGraphicalViewer());
		getDiagramGraphicalViewer().setContextMenu(provider);
		getSite().registerContextMenu(ActionIds.DIAGRAM_EDITOR_CONTEXT_MENU,
				provider, getDiagramGraphicalViewer());

		// Begin added to bind delete keyboard shortcut to "Delete From Model" action, not Delete From Diagram (default)
		KeyHandler keyHandler = getDiagramGraphicalViewer().getKeyHandler();
		keyHandler.put(
				KeyStroke.getPressed(SWT.DEL, 127, 0),
				getActionRegistry().getAction(
						ActionIds.ACTION_DELETE_FROM_MODEL));
		keyHandler.put(KeyStroke.getPressed(SWT.BS, 8, 0), getActionRegistry()
				.getAction(ActionIds.ACTION_DELETE_FROM_MODEL));
		// End added
	}

	/**
	 * @generated
	 */
	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		ValidateAction.runValidation(getDiagramEditPart(), getDiagramEditPart()
				.getDiagramView());
		super.doSave(progressMonitor);
	}

	/**
	 * @generated
	 */
	@Override
	public boolean isValidDiagramElement(EObject diagramElement) {
		IAdaptable adapter = new EObjectAdapter(diagramElement);
		IOperation operation = new CreateDiagramViewOperation(
				adapter,
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID,
				getPreferencesHint());
		return ViewService.getInstance().provides(operation);
	}

	/**
	 * @generated
	 */
	@Override
	public boolean isValidTopLevelNodeElement(EObject diagramElement,
			EObject topLevelNodeElement) {
		Diagram diagram = ViewService
				.getInstance()
				.createDiagram(
						diagramElement,
						de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID,
						getPreferencesHint());
		IAdaptable adapter = new EObjectAdapter(topLevelNodeElement);
		IOperation operation = new CreateNodeViewOperation(adapter, diagram,
				null, 0, false, getPreferencesHint());
		return ViewService.getInstance().provides(operation);
	}

	/**
	 * @generated
	 */
	@Override
	public ExtendableElement createDiagramElement() {

		return de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory.eINSTANCE
				.createRealtimeStatechart();

	}

	/**
	 * @generated
	 */
	public CreateViewRequest getCreatePersistedViewsRequest(Diagram diagram,
			Collection<EObject> elements) {
		List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor> childDescriptors = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlDiagramUpdater
				.getRealtimeStatechart_1000SemanticChildren(diagram);
		List<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>(
				childDescriptors.size());

		for (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor d : childDescriptors) {
			if (!elements.contains(d.getModelElement())) {
				continue;
			}
			java.lang.String hint = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
					.getType(d.getVisualID());
			IAdaptable elementAdapter = new InitialElementAdapter(
					d.getModelElement(), hint);
			CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(
					elementAdapter, Node.class, hint, ViewUtil.APPEND, true,
					getPreferencesHint());
			viewDescriptors.add(descriptor);
		}
		return new CreateViewRequest(viewDescriptors);
	}

	/**
	 * @generated
	 */
	@Override
	public PreferencesHint getPreferencesHint() {
		return de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

}
