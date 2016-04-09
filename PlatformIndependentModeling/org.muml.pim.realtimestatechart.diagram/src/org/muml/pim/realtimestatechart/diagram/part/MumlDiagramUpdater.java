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
package org.muml.pim.realtimestatechart.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.muml.pim.realtimestatechart.ClockConstraint;
import org.muml.pim.realtimestatechart.DoEvent;
import org.muml.pim.realtimestatechart.EntryEvent;
import org.muml.pim.realtimestatechart.EntryPoint;
import org.muml.pim.realtimestatechart.ExitEvent;
import org.muml.pim.realtimestatechart.ExitPoint;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.StateConnectionPoint;
import org.muml.pim.realtimestatechart.SynchronizationChannel;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.pim.realtimestatechart.Vertex;
import org.muml.pim.realtimestatechart.diagram.edit.parts.ClockConstraintEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.DoEventEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.EntryEventEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.EntryPointEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.ExitEventEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.ExitPointEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.ModelElementCategoryEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechart2EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechartEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartment2EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartmentEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RegionEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RegionRegionContentsCompartmentEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateActionCompartmentEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateChannelCompartmentEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateInvariantCompartmentEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateRegionCompartmentEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.SynchronizationChannelEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.TransitionEditPart;
import org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes;

/**
 * @generated
 */
public class MumlDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getSemanticChildren(View view) {
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			return getRealtimeStatechart_1000SemanticChildren(view);
		case StateEditPart.VISUAL_ID:
			return getState_3032SemanticChildren(view);
		case RealtimeStatechartStatechartContentsCompartmentEditPart.VISUAL_ID:
			return getRealtimeStatechartStatechartContentsCompartment_7030SemanticChildren(view);
		case StateActionCompartmentEditPart.VISUAL_ID:
			return getStateActionCompartment_7031SemanticChildren(view);
		case StateRegionCompartmentEditPart.VISUAL_ID:
			return getStateRegionCompartment_7032SemanticChildren(view);
		case StateChannelCompartmentEditPart.VISUAL_ID:
			return getStateChannelCompartment_7033SemanticChildren(view);
		case StateInvariantCompartmentEditPart.VISUAL_ID:
			return getStateInvariantCompartment_7034SemanticChildren(view);
		case RegionRegionContentsCompartmentEditPart.VISUAL_ID:
			return getRegionRegionContentsCompartment_7037SemanticChildren(view);
		case RealtimeStatechartStatechartContentsCompartment2EditPart.VISUAL_ID:
			return getRealtimeStatechartStatechartContentsCompartment_7038SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getRealtimeStatechart_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		RealtimeStatechart modelElement = (RealtimeStatechart) view.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();

		if (MumlVisualIDRegistry.getNodeVisualID(view, modelElement) == RealtimeStatechartEditPart.VISUAL_ID) {
			result.add(new MumlNodeDescriptor(modelElement, RealtimeStatechartEditPart.VISUAL_ID));
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getState_3032SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		State modelElement = (State) view.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConnectionPoints().iterator(); it.hasNext();) {
			StateConnectionPoint childElement = (StateConnectionPoint) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EntryPointEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExitPointEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getRealtimeStatechartStatechartContentsCompartment_7030SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		RealtimeStatechart modelElement = (RealtimeStatechart) containerView.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStates().iterator(); it.hasNext();) {
			State childElement = (State) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StateEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getStateActionCompartment_7031SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		State modelElement = (State) containerView.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		{
			EntryEvent childElement = modelElement.getEntryEvent();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EntryEventEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
			}
		}
		{
			DoEvent childElement = modelElement.getDoEvent();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DoEventEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
			}
		}
		{
			ExitEvent childElement = modelElement.getExitEvent();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ExitEventEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getStateRegionCompartment_7032SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		State modelElement = (State) containerView.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmbeddedRegions().iterator(); it.hasNext();) {
			Region childElement = (Region) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RegionEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getStateChannelCompartment_7033SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		State modelElement = (State) containerView.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChannels().iterator(); it.hasNext();) {
			SynchronizationChannel childElement = (SynchronizationChannel) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SynchronizationChannelEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getStateInvariantCompartment_7034SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		State modelElement = (State) containerView.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInvariants().iterator(); it.hasNext();) {
			ClockConstraint childElement = (ClockConstraint) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ClockConstraintEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getRegionRegionContentsCompartment_7037SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Region modelElement = (Region) containerView.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		{
			RealtimeStatechart childElement = modelElement.getEmbeddedStatechart();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RealtimeStatechart2EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getRealtimeStatechartStatechartContentsCompartment_7038SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		RealtimeStatechart modelElement = (RealtimeStatechart) containerView.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStates().iterator(); it.hasNext();) {
			State childElement = (State) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StateEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	private static Iterator<EObject> getPhantomNodesIterator(Resource resource) {
		return resource.getAllContents();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getContainedLinks(View view) {
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			return getRealtimeStatechart_1000ContainedLinks(view);
		case RealtimeStatechartEditPart.VISUAL_ID:
			return getRealtimeStatechart_2007ContainedLinks(view);
		case StateEditPart.VISUAL_ID:
			return getState_3032ContainedLinks(view);
		case EntryEventEditPart.VISUAL_ID:
			return getEntryEvent_3033ContainedLinks(view);
		case DoEventEditPart.VISUAL_ID:
			return getDoEvent_3034ContainedLinks(view);
		case ExitEventEditPart.VISUAL_ID:
			return getExitEvent_3035ContainedLinks(view);
		case ClockConstraintEditPart.VISUAL_ID:
			return getClockConstraint_3036ContainedLinks(view);
		case SynchronizationChannelEditPart.VISUAL_ID:
			return getSynchronizationChannel_3037ContainedLinks(view);
		case RegionEditPart.VISUAL_ID:
			return getRegion_3042ContainedLinks(view);
		case RealtimeStatechart2EditPart.VISUAL_ID:
			return getRealtimeStatechart_3043ContainedLinks(view);
		case EntryPointEditPart.VISUAL_ID:
			return getEntryPoint_3040ContainedLinks(view);
		case ExitPointEditPart.VISUAL_ID:
			return getExitPoint_3041ContainedLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getIncomingLinks(View view) {
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case RealtimeStatechartEditPart.VISUAL_ID:
			return getRealtimeStatechart_2007IncomingLinks(view);
		case StateEditPart.VISUAL_ID:
			return getState_3032IncomingLinks(view);
		case EntryEventEditPart.VISUAL_ID:
			return getEntryEvent_3033IncomingLinks(view);
		case DoEventEditPart.VISUAL_ID:
			return getDoEvent_3034IncomingLinks(view);
		case ExitEventEditPart.VISUAL_ID:
			return getExitEvent_3035IncomingLinks(view);
		case ClockConstraintEditPart.VISUAL_ID:
			return getClockConstraint_3036IncomingLinks(view);
		case SynchronizationChannelEditPart.VISUAL_ID:
			return getSynchronizationChannel_3037IncomingLinks(view);
		case RegionEditPart.VISUAL_ID:
			return getRegion_3042IncomingLinks(view);
		case RealtimeStatechart2EditPart.VISUAL_ID:
			return getRealtimeStatechart_3043IncomingLinks(view);
		case EntryPointEditPart.VISUAL_ID:
			return getEntryPoint_3040IncomingLinks(view);
		case ExitPointEditPart.VISUAL_ID:
			return getExitPoint_3041IncomingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getOutgoingLinks(View view) {
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case RealtimeStatechartEditPart.VISUAL_ID:
			return getRealtimeStatechart_2007OutgoingLinks(view);
		case StateEditPart.VISUAL_ID:
			return getState_3032OutgoingLinks(view);
		case EntryEventEditPart.VISUAL_ID:
			return getEntryEvent_3033OutgoingLinks(view);
		case DoEventEditPart.VISUAL_ID:
			return getDoEvent_3034OutgoingLinks(view);
		case ExitEventEditPart.VISUAL_ID:
			return getExitEvent_3035OutgoingLinks(view);
		case ClockConstraintEditPart.VISUAL_ID:
			return getClockConstraint_3036OutgoingLinks(view);
		case SynchronizationChannelEditPart.VISUAL_ID:
			return getSynchronizationChannel_3037OutgoingLinks(view);
		case RegionEditPart.VISUAL_ID:
			return getRegion_3042OutgoingLinks(view);
		case RealtimeStatechart2EditPart.VISUAL_ID:
			return getRealtimeStatechart_3043OutgoingLinks(view);
		case EntryPointEditPart.VISUAL_ID:
			return getEntryPoint_3040OutgoingLinks(view);
		case ExitPointEditPart.VISUAL_ID:
			return getExitPoint_3041OutgoingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getRealtimeStatechart_1000ContainedLinks(View view) {
		RealtimeStatechart modelElement = (RealtimeStatechart) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getRealtimeStatechart_2007ContainedLinks(View view) {
		RealtimeStatechart modelElement = (RealtimeStatechart) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getState_3032ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getEntryEvent_3033ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDoEvent_3034ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getExitEvent_3035ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getClockConstraint_3036ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getSynchronizationChannel_3037ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getRegion_3042ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getRealtimeStatechart_3043ContainedLinks(View view) {
		RealtimeStatechart modelElement = (RealtimeStatechart) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getEntryPoint_3040ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getExitPoint_3041ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getTransition_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getRealtimeStatechart_2007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getState_3032IncomingLinks(View view) {
		State modelElement = (State) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getEntryEvent_3033IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDoEvent_3034IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getExitEvent_3035IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getClockConstraint_3036IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getSynchronizationChannel_3037IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getRegion_3042IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getRealtimeStatechart_3043IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getEntryPoint_3040IncomingLinks(View view) {
		EntryPoint modelElement = (EntryPoint) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getExitPoint_3041IncomingLinks(View view) {
		ExitPoint modelElement = (ExitPoint) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getTransition_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getRealtimeStatechart_2007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getState_3032OutgoingLinks(View view) {
		State modelElement = (State) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getEntryEvent_3033OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDoEvent_3034OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getExitEvent_3035OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getClockConstraint_3036OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getSynchronizationChannel_3037OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getRegion_3042OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getRealtimeStatechart_3043OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getEntryPoint_3040OutgoingLinks(View view) {
		EntryPoint modelElement = (EntryPoint) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getExitPoint_3041OutgoingLinks(View view) {
		ExitPoint modelElement = (ExitPoint) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getTransition_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getContainedTypeModelFacetLinks_Transition_4003(
			RealtimeStatechart container) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transition) {
				continue;
			}
			Transition link = (Transition) linkObject;
			if (TransitionEditPart.VISUAL_ID != MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Vertex dst = link.getTarget();
			Vertex src = link.getSource();
			result.add(new MumlLinkDescriptor(src, dst, link, MumlElementTypes.Transition_4003,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getIncomingTypeModelFacetLinks_Transition_4003(Vertex target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != RealtimestatechartPackage.eINSTANCE.getTransition_Target()
					|| false == setting.getEObject() instanceof Transition) {
				continue;
			}
			Transition link = (Transition) setting.getEObject();
			if (TransitionEditPart.VISUAL_ID != MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Vertex src = link.getSource();
			result.add(new MumlLinkDescriptor(src, target, link, MumlElementTypes.Transition_4003,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_Transition_4003(Vertex source) {
		RealtimeStatechart container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof RealtimeStatechart) {
				container = (RealtimeStatechart) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transition) {
				continue;
			}
			Transition link = (Transition) linkObject;
			if (TransitionEditPart.VISUAL_ID != MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Vertex dst = link.getTarget();
			Vertex src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MumlLinkDescriptor(src, dst, link, MumlElementTypes.Transition_4003,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<MumlNodeDescriptor> getSemanticChildren(View view) {
			return MumlDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MumlLinkDescriptor> getContainedLinks(View view) {
			return MumlDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MumlLinkDescriptor> getIncomingLinks(View view) {
			return MumlDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MumlLinkDescriptor> getOutgoingLinks(View view) {
			return MumlDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
