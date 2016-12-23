/*
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.componentinstanceconfiguration.diagram.edit.policies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.UpdaterLinkDescriptor;
import org.muml.core.common.edit.policies.IDiagramCanonicalEditPolicy;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.part.MumlDiagramUpdater;
import org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor;
import org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor;
import org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry;
import org.muml.pim.instance.InstancePackage;

/**
 * @generated
 */
public class ComponentInstanceConfigurationDiagramCanonicalEditPolicy extends CanonicalEditPolicy
		implements IDiagramCanonicalEditPolicy {

	/**
	 * @generated
	 */
	private boolean canonicalNodes = true;

	/**
	 * @generated
	 */
	private Set<EStructuralFeature> myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	public ComponentInstanceConfigurationDiagramCanonicalEditPolicy() {
	}

	/**
	 * @generated
	 */
	public ComponentInstanceConfigurationDiagramCanonicalEditPolicy(boolean canonicalNodes) {
		this.canonicalNodes = canonicalNodes;
	}

	// BEGIN MUML TICKET #1247
	/**
	 * @generated
	 */
	private List<String> noConnectionViews = new ArrayList<String>();

	/**
	 * @generated
	 */
	public void addNoConnectionView(String type) {
		noConnectionViews.add(type);
	}

	/**
	 * @generated
	 */
	public void removeNoConnectionView(String type) {
		noConnectionViews.remove(type);
	}

	// END MUML TICKET #1247

	/**
	 * @generated
	 */
	protected void refreshOnActivate() {
		// Need to activate editpart children before invoking the canonical refresh for EditParts to add event listeners
		List<?> c = getHost().getChildren();
		for (int i = 0; i < c.size(); i++) {
			((EditPart) c.get(i)).activate();
		}
		super.refreshOnActivate();
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet<EStructuralFeature>();
			myFeaturesToSynchronize
					.add(InstancePackage.eINSTANCE.getComponentInstanceConfiguration_ParentPortInstances());
			myFeaturesToSynchronize
					.add(InstancePackage.eINSTANCE.getComponentInstanceConfiguration_ComponentInstances());
			myFeaturesToSynchronize
					.add(InstancePackage.eINSTANCE.getComponentInstanceConfiguration_CoordinationProtocolInstances());
		}
		return myFeaturesToSynchronize;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	protected List getSemanticChildrenList() {
		List<MumlNodeDescriptor> childDescriptors = getSemanticChildrenViewDescriptors();
		LinkedList<EObject> result = new LinkedList<EObject>();
		for (MumlNodeDescriptor d : childDescriptors) {
			result.add(d.getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */

	@SuppressWarnings("rawtypes")
	protected List getSemanticChildrenViewDescriptors() {
		// Begin added to switch off toplevel canonical behavior:
		if (!canonicalNodes) {
			View containerView = (View) getHost().getModel();
			List<View> childViews = containerView.getChildren();
			List<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();

			for (View childView : childViews) {
				EObject childElement = childView.getElement();
				int visualID = MumlVisualIDRegistry.getVisualID(childView);
				List<Integer> visualIDs = Arrays.asList(new Integer[] { HybridPortInstanceEditPart.VISUAL_ID,
						DiscreteSinglePortInstanceEditPart.VISUAL_ID, DiscreteMultiPortInstanceEditPart.VISUAL_ID,
						ContinuousPortInstanceEditPart.VISUAL_ID, AtomicComponentInstanceEditPart.VISUAL_ID,
						StructuredComponentInstanceEditPart.VISUAL_ID,
						CoordinationProtocolInstanceEditPart.VISUAL_ID });

				// Note: childElement can be null, for diagram annotations!
				if (childElement == null
						|| childElement.eContainer() == containerView.getElement() && visualIDs.contains(visualID)) {
					result.add(new MumlNodeDescriptor(childElement, visualID));
					continue;
				}
			}
			return result;
		}
		// End added

		View viewObject = (View) getHost().getModel();
		return MumlDiagramUpdater.getComponentInstanceConfiguration_1000SemanticChildren(viewObject);

	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection<EObject> semanticChildren, final View view) {
		return isMyDiagramElement(view) && !semanticChildren.contains(view.getElement());
	}

	/**
	 * @generated
	 */
	private boolean isMyDiagramElement(View view) {
		int visualID = MumlVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case HybridPortInstanceEditPart.VISUAL_ID:
		case DiscreteSinglePortInstanceEditPart.VISUAL_ID:
		case DiscreteMultiPortInstanceEditPart.VISUAL_ID:
		case ContinuousPortInstanceEditPart.VISUAL_ID:
		case AtomicComponentInstanceEditPart.VISUAL_ID:
		case StructuredComponentInstanceEditPart.VISUAL_ID:
		case CoordinationProtocolInstanceEditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void refreshSemantic() {
		if (resolveSemanticElement() == null) {
			return;
		}
		LinkedList<IAdaptable> createdViews = new LinkedList<IAdaptable>();
		List<MumlNodeDescriptor> childDescriptors = getSemanticChildrenViewDescriptors();
		LinkedList<View> orphaned = new LinkedList<View>();
		// we care to check only views we recognize as ours
		LinkedList<View> knownViewChildren = new LinkedList<View>();
		for (View v : getViewChildren()) {
			if (isMyDiagramElement(v)) {
				knownViewChildren.add(v);
			}
		}
		// alternative to #cleanCanonicalSemanticChildren(getViewChildren(), semanticChildren)
		//
		// iteration happens over list of desired semantic elements, trying to find best matching View, while original CEP
		// iterates views, potentially losing view (size/bounds) information - i.e. if there are few views to reference same EObject, only last one 
		// to answer isOrphaned == true will be used for the domain element representation, see #cleanCanonicalSemanticChildren()
		for (Iterator<MumlNodeDescriptor> descriptorsIterator = childDescriptors.iterator(); descriptorsIterator
				.hasNext();) {
			MumlNodeDescriptor next = descriptorsIterator.next();
			String hint = MumlVisualIDRegistry.getType(next.getVisualID());
			LinkedList<View> perfectMatch = new LinkedList<View>(); // both semanticElement and hint match that of NodeDescriptor
			for (View childView : getViewChildren()) {
				EObject semanticElement = childView.getElement();

				// Note: semanticElement can be null, for diagram annotations!
				if (semanticElement != null && semanticElement.equals(next.getModelElement())) {
					if (hint.equals(childView.getType())) {
						perfectMatch.add(childView);
						// actually, can stop iteration over view children here, but
						// may want to use not the first view but last one as a 'real' match (the way original CEP does
						// with its trick with viewToSemanticMap inside #cleanCanonicalSemanticChildren
					}
				}
			}
			if (perfectMatch.size() > 0) {
				descriptorsIterator.remove(); // precise match found no need to create anything for the NodeDescriptor
				// use only one view (first or last?), keep rest as orphaned for further consideration
				knownViewChildren.remove(perfectMatch.getFirst());
			}
		}
		// those left in knownViewChildren are subject to removal - they are our diagram elements we didn't find match to,
		// or those we have potential matches to, and thus need to be recreated, preserving size/location information.
		orphaned.addAll(knownViewChildren);
		//
		ArrayList<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>(
				childDescriptors.size());
		for (MumlNodeDescriptor next : childDescriptors) {
			String hint = MumlVisualIDRegistry.getType(next.getVisualID());
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

		createdViews.addAll(createdConnectionViews);

		makeViewsImmutable(createdViews);
	}

	/**
	 * @generated
	 */
	private Collection<IAdaptable> refreshConnections() {
		Domain2Notation domain2NotationMap = new Domain2Notation();
		Collection<MumlLinkDescriptor> linkDescriptors = collectAllLinks(getDiagram(), domain2NotationMap);
		Collection existingLinks = new LinkedList(getDiagram().getEdges());
		for (Iterator linksIterator = existingLinks.iterator(); linksIterator.hasNext();) {
			Edge nextDiagramLink = (Edge) linksIterator.next();
			int diagramLinkVisualID = MumlVisualIDRegistry.getVisualID(nextDiagramLink);
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
				for (Iterator<MumlLinkDescriptor> linkDescriptorsIterator = linkDescriptors
						.iterator(); linkDescriptorsIterator.hasNext();) {
					MumlLinkDescriptor nextLinkDescriptor = linkDescriptorsIterator.next();
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

	/**
	 * @generated
	 */
	private Collection<MumlLinkDescriptor> collectAllLinks(View view, Domain2Notation domain2NotationMap) {
		if (!ComponentInstanceConfigurationDiagramEditPart.MODEL_ID.equals(MumlVisualIDRegistry.getModelID(view))) {
			return Collections.emptyList();
		}
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MumlDiagramUpdater.getComponentInstanceConfiguration_1000ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case HybridPortInstanceEditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MumlDiagramUpdater.getHybridPortInstance_2021ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case DiscreteSinglePortInstanceEditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MumlDiagramUpdater.getDiscreteSinglePortInstance_2022ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case DiscreteMultiPortInstanceEditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MumlDiagramUpdater.getDiscreteMultiPortInstance_2023ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ContinuousPortInstanceEditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MumlDiagramUpdater.getContinuousPortInstance_2024ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case AtomicComponentInstanceEditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MumlDiagramUpdater.getAtomicComponentInstance_2016ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case StructuredComponentInstanceEditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MumlDiagramUpdater.getStructuredComponentInstance_2015ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case CoordinationProtocolInstanceEditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MumlDiagramUpdater.getCoordinationProtocolInstance_2025ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case DiscreteSinglePortInstance2EditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MumlDiagramUpdater.getDiscreteSinglePortInstance_3026ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case HybridPortInstance2EditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MumlDiagramUpdater.getHybridPortInstance_3031ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case DiscreteSinglePortInstance3EditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MumlDiagramUpdater.getDiscreteSinglePortInstance_3032ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case DiscreteMultiPortInstance2EditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MumlDiagramUpdater.getDiscreteMultiPortInstance_3033ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ContinuousPortInstance2EditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MumlDiagramUpdater.getContinuousPortInstance_3034ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ComponentInstanceConfigurationEditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MumlDiagramUpdater.getComponentInstanceConfiguration_3023ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case AtomicComponentInstance2EditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MumlDiagramUpdater.getAtomicComponentInstance_3024ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case StructuredComponentInstance2EditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MumlDiagramUpdater.getStructuredComponentInstance_3025ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case CoordinationProtocolInstance2EditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MumlDiagramUpdater.getCoordinationProtocolInstance_3035ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case AssemblyConnectorInstanceEditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MumlDiagramUpdater.getAssemblyConnectorInstance_4001ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case DelegationConnectorInstanceEditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MumlDiagramUpdater.getDelegationConnectorInstance_4002ContainedLinks(view));
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

	/**
	 * @generated
	 */
	private Collection<IAdaptable> createConnections(Collection<MumlLinkDescriptor> linkDescriptors,
			Domain2Notation domain2NotationMap) {
		LinkedList<IAdaptable> adapters = new LinkedList<IAdaptable>();
		for (MumlLinkDescriptor nextLinkDescriptor : linkDescriptors) {
			EditPart sourceEditPart = getSourceEditPart(nextLinkDescriptor, domain2NotationMap);
			EditPart targetEditPart = getTargetEditPart(nextLinkDescriptor, domain2NotationMap);
			if (sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(
					nextLinkDescriptor.getSemanticAdapter(),
					MumlVisualIDRegistry.getType(nextLinkDescriptor.getVisualID()), ViewUtil.APPEND, false,
					((IGraphicalEditPart) getHost()).getDiagramPreferencesHint());
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

	/**
	 * @generated
	 */
	private EditPart getEditPart(EObject domainModelElement, Domain2Notation domain2NotationMap) {
		View view = (View) domain2NotationMap.get(domainModelElement);
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry().get(view);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private Diagram getDiagram() {
		return ((View) getHost().getModel()).getDiagram();
	}

	/**
	 * @generated
	 */
	protected EditPart getSourceEditPart(UpdaterLinkDescriptor descriptor, Domain2Notation domain2NotationMap) {
		return getEditPart(descriptor.getSource(), domain2NotationMap);
	}

	/**
	 * @generated
	 */
	protected EditPart getTargetEditPart(UpdaterLinkDescriptor descriptor, Domain2Notation domain2NotationMap) {
		return getEditPart(descriptor.getDestination(), domain2NotationMap);
	}

	/**
	 * @generated
	 */
	protected final EditPart getHintedEditPart(EObject domainModelElement, Domain2Notation domain2NotationMap,
			int hintVisualId) {
		View view = (View) domain2NotationMap.getHinted(domainModelElement, MumlVisualIDRegistry.getType(hintVisualId));
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry().get(view);
		}
		return null;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("serial")
	protected static class Domain2Notation extends HashMap<EObject, View> {
		/**
		 * @generated
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
