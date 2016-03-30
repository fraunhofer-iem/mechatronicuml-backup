package org.muml.reconfiguration.ui.edit.policies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.UpdaterLinkDescriptor;
import org.muml.pim.component.diagram.edit.policies.ModelElementCategoryCanonicalEditPolicy;

public class CustomModelElementCategoryCanonicalEditPolicy extends ModelElementCategoryCanonicalEditPolicy {

	private boolean canonicalNodes = true;

	public CustomModelElementCategoryCanonicalEditPolicy() {
		super();
	}

	public CustomModelElementCategoryCanonicalEditPolicy(boolean canonicalNodes) {
		super(canonicalNodes);
		this.canonicalNodes = canonicalNodes;
	}

	// Has to be copied from ModelElementCategoryCanonicalEditPolicy, because
	// some methods that have to be overridden (e.g. collectAllLinks) are
	// private and only called from this method.
	// So the workaround is to call the adapted methods here.
	protected void refreshSemantic() {
		if (resolveSemanticElement() == null) {
			return;
		}
		LinkedList<IAdaptable> createdViews = new LinkedList<IAdaptable>();
		List<org.muml.pim.component.diagram.part.MumlNodeDescriptor> childDescriptors = getSemanticChildrenViewDescriptors();
		LinkedList<View> orphaned = new LinkedList<View>();
		// we care to check only views we recognize as ours
		LinkedList<View> knownViewChildren = new LinkedList<View>();
		for (View v : getViewChildren()) {
			if (isMyDiagramElement(v)) {
				knownViewChildren.add(v);
			}
		}
		// alternative to #cleanCanonicalSemanticChildren(getViewChildren(),
		// semanticChildren)
		//
		// iteration happens over list of desired semantic elements, trying to
		// find best matching View, while original CEP
		// iterates views, potentially losing view (size/bounds) information -
		// i.e. if there are few views to reference same EObject, only last one
		// to answer isOrphaned == true will be used for the domain element
		// representation, see #cleanCanonicalSemanticChildren()
		for (Iterator<org.muml.pim.component.diagram.part.MumlNodeDescriptor> descriptorsIterator = childDescriptors
				.iterator(); descriptorsIterator.hasNext();) {
			org.muml.pim.component.diagram.part.MumlNodeDescriptor next = descriptorsIterator.next();
			String hint = org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.getType(next.getVisualID());
			LinkedList<View> perfectMatch = new LinkedList<View>(); // both
																	// semanticElement
																	// and hint
																	// match
																	// that of
																	// NodeDescriptor
			for (View childView : getViewChildren()) {
				EObject semanticElement = childView.getElement();

				// Note: semanticElement can be null, for diagram annotations!
				if (semanticElement != null && semanticElement.equals(next.getModelElement())) {
					if (hint.equals(childView.getType())) {
						perfectMatch.add(childView);
						// actually, can stop iteration over view children here,
						// but
						// may want to use not the first view but last one as a
						// 'real' match (the way original CEP does
						// with its trick with viewToSemanticMap inside
						// #cleanCanonicalSemanticChildren
					}
				}
			}
			if (perfectMatch.size() > 0) {
				descriptorsIterator.remove(); // precise match found no need to
												// create anything for the
												// NodeDescriptor
				// use only one view (first or last?), keep rest as orphaned for
				// further consideration
				knownViewChildren.remove(perfectMatch.getFirst());
			}
		}
		// those left in knownViewChildren are subject to removal - they are our
		// diagram elements we didn't find match to,
		// or those we have potential matches to, and thus need to be recreated,
		// preserving size/location information.
		orphaned.addAll(knownViewChildren);
		//
		ArrayList<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>(
				childDescriptors.size());
		for (org.muml.pim.component.diagram.part.MumlNodeDescriptor next : childDescriptors) {
			String hint = org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.getType(next.getVisualID());
			IAdaptable elementAdapter = new CanonicalElementAdapter(next.getModelElement(), hint);
			CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(elementAdapter,
					Node.class, hint, ViewUtil.APPEND, false, host().getDiagramPreferencesHint());
			viewDescriptors.add(descriptor);
		}

		boolean changed = deleteViews(orphaned.iterator());
		//
		CreateViewRequest request = getCreateViewRequest(viewDescriptors);
		Command cmd = getCreateViewCommand(request);
		if (cmd != null && cmd.canExecute()) {
			SetViewMutabilityCommand.makeMutable(new EObjectAdapter(host().getNotationView())).execute();
			executeCommand(cmd);
			@SuppressWarnings("unchecked")
			List<IAdaptable> nl = (List<IAdaptable>) request.getNewObject();
			createdViews.addAll(nl);
		}
		if (changed || createdViews.size() > 0) {
			postProcessRefreshSemantic(createdViews);
		}

		Collection<IAdaptable> createdConnectionViews = refreshConnections();

		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host().getEditingDomain(), createdViews,
					host());
			executeCommand(new ICommandProxy(layoutCmd));
		}
		// TODO
		// updating the connections leads to null-pointer exception when
		// triggering the diagram's canonical edit policy after the
		// execution of QVTO-Transformations (especially the generation of the
		// reconfiguration controller).
		// createdViews.addAll(createdConnectionViews);

		makeViewsImmutable(createdViews);
	}

	protected EditPart getSourceEditPart(UpdaterLinkDescriptor descriptor, Domain2Notation domain2NotationMap) {
		return getEditPart(descriptor.getSource(), domain2NotationMap);
	}

	protected EditPart getTargetEditPart(UpdaterLinkDescriptor descriptor, Domain2Notation domain2NotationMap) {
		return getEditPart(descriptor.getDestination(), domain2NotationMap);
	}

	private EditPart getEditPart(EObject domainModelElement, Domain2Notation domain2NotationMap) {
		View view = (View) domain2NotationMap.get(domainModelElement);
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry().get(view);
		}
		return null;
	}

	private Collection<IAdaptable> refreshConnections() {
		Domain2Notation domain2NotationMap = new Domain2Notation();
		Collection<org.muml.pim.component.diagram.part.MumlLinkDescriptor> linkDescriptors = collectAllLinks(
				getDiagram(), domain2NotationMap);
		Collection existingLinks = new LinkedList(getDiagram().getEdges());
		for (Iterator linksIterator = existingLinks.iterator(); linksIterator.hasNext();) {
			Edge nextDiagramLink = (Edge) linksIterator.next();
			int diagramLinkVisualID = org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.getVisualID(nextDiagramLink);
			if (diagramLinkVisualID == -1) {
				if (nextDiagramLink.getSource() != null && nextDiagramLink.getTarget() != null) {
					linksIterator.remove();
				}
				continue;
			}
			if (nextDiagramLink.getSource() != null && nextDiagramLink.getTarget() != null) {
				EObject diagramLinkObject = nextDiagramLink.getElement();
				EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
				EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
				for (Iterator<org.muml.pim.component.diagram.part.MumlLinkDescriptor> linkDescriptorsIterator = linkDescriptors
						.iterator(); linkDescriptorsIterator.hasNext();) {
					org.muml.pim.component.diagram.part.MumlLinkDescriptor nextLinkDescriptor = linkDescriptorsIterator
							.next();
					if (diagramLinkObject == nextLinkDescriptor.getModelElement()
							&& diagramLinkSrc == nextLinkDescriptor.getSource()
							&& diagramLinkDst == nextLinkDescriptor.getDestination()
							&& diagramLinkVisualID == nextLinkDescriptor.getVisualID()) {
						linksIterator.remove();
						linkDescriptorsIterator.remove();
						break;
					}
				}
			}
		}
		deleteViews(existingLinks.iterator());
		return createConnections(linkDescriptors, domain2NotationMap);
	}

	private Collection<org.muml.pim.component.diagram.part.MumlLinkDescriptor> collectAllLinks(
			View view, Domain2Notation domain2NotationMap) {
		if (!org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
				.equals(org.muml.pim.component.diagram.part.MumlVisualIDRegistry.getModelID(view))) {
			return Collections.emptyList();
		}
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		switch (org.muml.pim.component.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {

		case org.muml.reconfiguration.ui.edit.parts.ReconfigurableAtomicComponentEditPart.VISUAL_ID: {
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}

		case org.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(org.muml.reconfiguration.ui.part.ReconfigurationDiagramUpdater
						.getReconfigurableStructuredComponent_2076ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}

		case org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(org.muml.pim.component.diagram.part.MumlDiagramUpdater
						.getStaticStructuredComponent_2005ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}

		case org.muml.reconfiguration.ui.edit.parts.ManagerEditPart.VISUAL_ID: {

			domain2NotationMap.putView(view.getElement(), view);
			break;
		}

		case org.muml.reconfiguration.ui.edit.parts.ExecutorEditPart.VISUAL_ID: {

			domain2NotationMap.putView(view.getElement(), view);
			break;
		}

		case org.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID: {

			domain2NotationMap.putView(view.getElement(), view);
			break;
		}

		case org.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart.VISUAL_ID: {

			domain2NotationMap.putView(view.getElement(), view);
			break;
		}

		case org.muml.reconfiguration.ui.edit.parts.BroadcastPortEditPart.VISUAL_ID: {

			domain2NotationMap.putView(view.getElement(), view);
			break;
		}

		case org.muml.reconfiguration.ui.edit.parts.InternalReconfigurationCommunicationPortEditPart.VISUAL_ID: {

			domain2NotationMap.putView(view.getElement(), view);
			break;
		}

		case org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(org.muml.pim.component.diagram.part.MumlDiagramUpdater
						.getModelElementCategory_1000ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}

		case org.muml.reconfiguration.ui.edit.parts.FadingComponentEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}

		case org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(org.muml.pim.component.diagram.part.MumlDiagramUpdater
						.getDiscretePort_3010ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(org.muml.pim.component.diagram.part.MumlDiagramUpdater
						.getContinuousPort_3011ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case org.muml.pim.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(org.muml.pim.component.diagram.part.MumlDiagramUpdater
						.getHybridPort_3013ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(org.muml.pim.component.diagram.part.MumlDiagramUpdater
						.getComponentPart_3012ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case org.muml.pim.component.diagram.edit.parts.PortPartEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(org.muml.pim.component.diagram.part.MumlDiagramUpdater
						.getPortPart_3022ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case org.muml.pim.component.diagram.edit.parts.CoordinationProtocolPartEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(org.muml.pim.component.diagram.part.MumlDiagramUpdater
						.getCoordinationProtocolPart_3016ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case org.muml.pim.component.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(org.muml.pim.component.diagram.part.MumlDiagramUpdater
						.getAssemblyConnector_4001ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case org.muml.pim.component.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(org.muml.pim.component.diagram.part.MumlDiagramUpdater
						.getDelegationConnector_4002ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}

		}
		for (Iterator children = view.getChildren().iterator(); children.hasNext();) {
			result.addAll(collectAllLinks((View) children.next(), domain2NotationMap));
		}
		for (Iterator edges = view.getSourceEdges().iterator(); edges.hasNext();) {
			result.addAll(collectAllLinks((View) edges.next(), domain2NotationMap));
		}
		return result;
	}

	private Collection<IAdaptable> createConnections(
			Collection<org.muml.pim.component.diagram.part.MumlLinkDescriptor> linkDescriptors,
			Domain2Notation domain2NotationMap) {
		LinkedList<IAdaptable> adapters = new LinkedList<IAdaptable>();
		for (org.muml.pim.component.diagram.part.MumlLinkDescriptor nextLinkDescriptor : linkDescriptors) {
			EditPart sourceEditPart = getSourceEditPart(nextLinkDescriptor, domain2NotationMap);
			EditPart targetEditPart = getTargetEditPart(nextLinkDescriptor, domain2NotationMap);
			if (sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(
					nextLinkDescriptor.getSemanticAdapter(),
					org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
							.getType(nextLinkDescriptor.getVisualID()),
					ViewUtil.APPEND, false, ((IGraphicalEditPart) getHost()).getDiagramPreferencesHint());
			CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(descriptor);
			ccr.setType(RequestConstants.REQ_CONNECTION_START);
			ccr.setSourceEditPart(sourceEditPart);
			sourceEditPart.getCommand(ccr);
			ccr.setTargetEditPart(targetEditPart);
			ccr.setType(RequestConstants.REQ_CONNECTION_END);
			Command cmd = targetEditPart.getCommand(ccr);
			if (cmd != null && cmd.canExecute()) {
				executeCommand(cmd);
				IAdaptable viewAdapter = (IAdaptable) ccr.getNewObject();
				if (viewAdapter != null) {
					adapters.add(viewAdapter);
				}
			}
		}
		return adapters;
	}

	private boolean isMyDiagramElement(View view) {
		int visualID = org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
				.getVisualID(view);
		return visualID == org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentEditPart.VISUAL_ID
				|| visualID == org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID
				|| visualID == org.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart.VISUAL_ID
				|| visualID == org.muml.reconfiguration.ui.edit.parts.ReconfigurableAtomicComponentEditPart.VISUAL_ID;
	}

	protected List getSemanticChildrenViewDescriptors() {
		// Begin added to switch off toplevel canonical behavior:
		if (!canonicalNodes) {
			View containerView = (View) getHost().getModel();
			List<View> childViews = containerView.getChildren();
			List<org.muml.pim.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor>();

			for (View childView : childViews) {
				EObject childElement = childView.getElement();
				int visualID = org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
						.getVisualID(childView);
				List<Integer> visualIDs = Arrays.asList(new Integer[] {
						org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentEditPart.VISUAL_ID,
						org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID,
						org.muml.reconfiguration.ui.edit.parts.ReconfigurableAtomicComponentEditPart.VISUAL_ID,
						org.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart.VISUAL_ID });

				// Note: childElement can be null, for diagram annotations!
				if (childElement == null
						|| childElement.eContainer() == containerView.getElement() && visualIDs.contains(visualID)) {
					result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(childElement,
							visualID));
					continue;
				}
			}
			return result;
		}
		// End added

		View viewObject = (View) getHost().getModel();
		return org.muml.pim.component.diagram.part.MumlDiagramUpdater
				.getModelElementCategory_1000SemanticChildren(viewObject);

	}

	private Diagram getDiagram() {
		return ((View) getHost().getModel()).getDiagram();
	}

	protected static class Domain2Notation extends HashMap<EObject, View> {
		/**
		 * @generated
		 * 
		 */
		public boolean containsDomainElement(EObject domainElement) {
			return this.containsKey(domainElement);
		}

		/**
		 * @generated
		 */
		public View getHinted(EObject domainEObject, String hint) {
			return this.get(domainEObject);
		}

		/**
		 * @generated
		 */
		public void putView(EObject domainElement, View view) {
			if (!containsKey(view.getElement())) {
				this.put(domainElement, view);
			}
		}

	}
}
