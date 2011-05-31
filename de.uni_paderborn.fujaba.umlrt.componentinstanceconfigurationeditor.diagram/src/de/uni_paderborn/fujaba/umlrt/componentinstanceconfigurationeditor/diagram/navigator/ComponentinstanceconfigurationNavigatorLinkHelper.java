package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.navigator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.navigator.ILinkHelper;
import org.eclipse.ui.part.FileEditorInput;

/**
 * @generated
 */
public class ComponentinstanceconfigurationNavigatorLinkHelper implements
		ILinkHelper {

	/**
	 * @generated
	 */
	private static IEditorInput getEditorInput(Diagram diagram) {
		Resource diagramResource = diagram.eResource();
		for (EObject nextEObject : diagramResource.getContents()) {
			if (nextEObject == diagram) {
				return new FileEditorInput(
						WorkspaceSynchronizer.getFile(diagramResource));
			}
			if (nextEObject instanceof Diagram) {
				break;
			}
		}
		URI uri = EcoreUtil.getURI(diagram);
		String editorName = uri.lastSegment() + '#'
				+ diagram.eResource().getContents().indexOf(diagram);
		IEditorInput editorInput = new URIEditorInput(uri, editorName);
		return editorInput;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection findSelection(IEditorInput anInput) {
		IDiagramDocument document = de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.getInstance().getDocumentProvider()
				.getDiagramDocument(anInput);
		if (document == null) {
			return StructuredSelection.EMPTY;
		}
		Diagram diagram = document.getDiagram();
		IFile file = WorkspaceSynchronizer.getFile(diagram.eResource());
		if (file != null) {
			de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.navigator.ComponentinstanceconfigurationNavigatorItem item = new de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.navigator.ComponentinstanceconfigurationNavigatorItem(
					diagram, file, false);
			return new StructuredSelection(item);
		}
		return StructuredSelection.EMPTY;
	}

	/**
	 * @generated
	 */
	public void activateEditor(IWorkbenchPage aPage,
			IStructuredSelection aSelection) {
		if (aSelection == null || aSelection.isEmpty()) {
			return;
		}
		if (false == aSelection.getFirstElement() instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.navigator.MumlinstanceAbstractNavigatorItem) {
			return;
		}

		de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.navigator.MumlinstanceAbstractNavigatorItem abstractNavigatorItem = (de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.navigator.MumlinstanceAbstractNavigatorItem) aSelection
				.getFirstElement();
		View navigatorView = null;
		if (abstractNavigatorItem instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.navigator.ComponentinstanceconfigurationNavigatorItem) {
			navigatorView = ((de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.navigator.ComponentinstanceconfigurationNavigatorItem) abstractNavigatorItem)
					.getView();
		} else if (abstractNavigatorItem instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup) {
			de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup navigatorGroup = (de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup) abstractNavigatorItem;
			if (navigatorGroup.getParent() instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.navigator.ComponentinstanceconfigurationNavigatorItem) {
				navigatorView = ((de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.navigator.ComponentinstanceconfigurationNavigatorItem) navigatorGroup
						.getParent()).getView();
			}
		}
		if (navigatorView == null) {
			return;
		}
		IEditorInput editorInput = getEditorInput(navigatorView.getDiagram());
		IEditorPart editor = aPage.findEditor(editorInput);
		if (editor == null) {
			return;
		}
		aPage.bringToTop(editor);
		if (editor instanceof DiagramEditor) {
			DiagramEditor diagramEditor = (DiagramEditor) editor;
			ResourceSet diagramEditorResourceSet = diagramEditor
					.getEditingDomain().getResourceSet();
			EObject selectedView = diagramEditorResourceSet.getEObject(
					EcoreUtil.getURI(navigatorView), true);
			if (selectedView == null) {
				return;
			}
			GraphicalViewer graphicalViewer = (GraphicalViewer) diagramEditor
					.getAdapter(GraphicalViewer.class);
			EditPart selectedEditPart = (EditPart) graphicalViewer
					.getEditPartRegistry().get(selectedView);
			if (selectedEditPart != null) {
				graphicalViewer.select(selectedEditPart);
			}
		}
	}

}
