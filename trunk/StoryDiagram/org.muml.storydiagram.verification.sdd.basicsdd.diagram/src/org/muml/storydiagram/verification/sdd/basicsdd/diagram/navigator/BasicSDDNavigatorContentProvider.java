package org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.AttributeAssignmentEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableCollectionVariableConstraintsCompartmentEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.Constraint2EditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ConstraintEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.EdgeEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LeafNodeEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LinkVariableEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableObjectVariableConstraintsCompartmentEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryDecisionDiagramEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodeEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodePatternNodeContentCompartmentEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternStoryPatternConstraintsCompartmentEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternStoryPatternContentCompartmentEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.Messages;

/**
 * @generated
 */
public class BasicSDDNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public BasicSDDNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<BasicSDDNavigatorItem> result = new ArrayList<BasicSDDNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, StoryDecisionDiagramEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof BasicSDDNavigatorGroup) {
			BasicSDDNavigatorGroup group = (BasicSDDNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof BasicSDDNavigatorItem) {
			BasicSDDNavigatorItem navigatorItem = (BasicSDDNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (BasicSDDVisualIDRegistry.getVisualID(view)) {

		case StoryDecisionDiagramEditPart.VISUAL_ID: {
			LinkedList<BasicSDDAbstractNavigatorItem> result = new LinkedList<BasicSDDAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			BasicSDDNavigatorGroup links = new BasicSDDNavigatorGroup(
					Messages.NavigatorGroupName_StoryDecisionDiagram_1000_links, "icons/linksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(StoryPatternNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(LeafNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(EdgeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(LinkVariableEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case StoryPatternNodeEditPart.VISUAL_ID: {
			LinkedList<BasicSDDAbstractNavigatorItem> result = new LinkedList<BasicSDDAbstractNavigatorItem>();
			Node sv = (Node) view;
			BasicSDDNavigatorGroup incominglinks = new BasicSDDNavigatorGroup(
					Messages.NavigatorGroupName_StoryPatternNode_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			BasicSDDNavigatorGroup outgoinglinks = new BasicSDDNavigatorGroup(
					Messages.NavigatorGroupName_StoryPatternNode_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(StoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BasicSDDVisualIDRegistry.getType(StoryPatternEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(EdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(EdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LeafNodeEditPart.VISUAL_ID: {
			LinkedList<BasicSDDAbstractNavigatorItem> result = new LinkedList<BasicSDDAbstractNavigatorItem>();
			Node sv = (Node) view;
			BasicSDDNavigatorGroup incominglinks = new BasicSDDNavigatorGroup(
					Messages.NavigatorGroupName_LeafNode_2004_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			BasicSDDNavigatorGroup outgoinglinks = new BasicSDDNavigatorGroup(
					Messages.NavigatorGroupName_LeafNode_2004_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(EdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(EdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CollectionVariableEditPart.VISUAL_ID: {
			LinkedList<BasicSDDAbstractNavigatorItem> result = new LinkedList<BasicSDDAbstractNavigatorItem>();
			Node sv = (Node) view;
			BasicSDDNavigatorGroup incominglinks = new BasicSDDNavigatorGroup(
					Messages.NavigatorGroupName_CollectionVariable_3006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			BasicSDDNavigatorGroup outgoinglinks = new BasicSDDNavigatorGroup(
					Messages.NavigatorGroupName_CollectionVariable_3006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), BasicSDDVisualIDRegistry
					.getType(CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BasicSDDVisualIDRegistry.getType(AttributeAssignmentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), BasicSDDVisualIDRegistry
					.getType(CollectionVariableCollectionVariableConstraintsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BasicSDDVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(LinkVariableEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(LinkVariableEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ObjectVariableEditPart.VISUAL_ID: {
			LinkedList<BasicSDDAbstractNavigatorItem> result = new LinkedList<BasicSDDAbstractNavigatorItem>();
			Node sv = (Node) view;
			BasicSDDNavigatorGroup incominglinks = new BasicSDDNavigatorGroup(
					Messages.NavigatorGroupName_ObjectVariable_3009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			BasicSDDNavigatorGroup outgoinglinks = new BasicSDDNavigatorGroup(
					Messages.NavigatorGroupName_ObjectVariable_3009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), BasicSDDVisualIDRegistry
					.getType(ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BasicSDDVisualIDRegistry.getType(AttributeAssignmentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), BasicSDDVisualIDRegistry
					.getType(ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BasicSDDVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(LinkVariableEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(LinkVariableEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case StoryPatternEditPart.VISUAL_ID: {
			LinkedList<BasicSDDAbstractNavigatorItem> result = new LinkedList<BasicSDDAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(StoryPatternStoryPatternContentCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BasicSDDVisualIDRegistry.getType(CollectionVariableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(StoryPatternStoryPatternContentCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BasicSDDVisualIDRegistry.getType(ObjectVariableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(StoryPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BasicSDDVisualIDRegistry.getType(Constraint2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case EdgeEditPart.VISUAL_ID: {
			LinkedList<BasicSDDAbstractNavigatorItem> result = new LinkedList<BasicSDDAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			BasicSDDNavigatorGroup target = new BasicSDDNavigatorGroup(Messages.NavigatorGroupName_Edge_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			BasicSDDNavigatorGroup source = new BasicSDDNavigatorGroup(Messages.NavigatorGroupName_Edge_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(StoryPatternNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(LeafNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(StoryPatternNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(LeafNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case LinkVariableEditPart.VISUAL_ID: {
			LinkedList<BasicSDDAbstractNavigatorItem> result = new LinkedList<BasicSDDAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			BasicSDDNavigatorGroup target = new BasicSDDNavigatorGroup(
					Messages.NavigatorGroupName_LinkVariable_4003_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			BasicSDDNavigatorGroup source = new BasicSDDNavigatorGroup(
					Messages.NavigatorGroupName_LinkVariable_4003_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(CollectionVariableEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(ObjectVariableEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(CollectionVariableEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					BasicSDDVisualIDRegistry.getType(ObjectVariableEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return StoryDecisionDiagramEditPart.MODEL_ID.equals(BasicSDDVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<BasicSDDNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<BasicSDDNavigatorItem> result = new ArrayList<BasicSDDNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new BasicSDDNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof BasicSDDAbstractNavigatorItem) {
			BasicSDDAbstractNavigatorItem abstractNavigatorItem = (BasicSDDAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
