package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class UmlrtDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
			return getFujabaRealtimeStatechart_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateActionsCompartmentEditPart.VISUAL_ID:
			return getStateActionsCompartment_7009SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateInvariantCompartmentEditPart.VISUAL_ID:
			return getStateInvariantCompartment_7010SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateSynchroChannelsCompartmentEditPart.VISUAL_ID:
			return getStateSynchroChannelsCompartment_7011SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart.VISUAL_ID:
			return getStateRegionCompartment_7012SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor> getFujabaRealtimeStatechart_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor>();
		for (Iterator<?> it = modelElement.getVertices().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex childElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.State2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.State3EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.HistoryStateEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getClocks().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock childElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ClockEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor> getStateActionsCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.State) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor>();
		{
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryAction childElement = modelElement
					.getEntryAction();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryActionEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor(
						childElement, visualID));
			}
		}
		{
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoAction childElement = modelElement
					.getDoAction();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.DoActionEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor(
						childElement, visualID));
			}
		}
		{
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitAction childElement = modelElement
					.getExitAction();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitActionEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor> getStateInvariantCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.State) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInvariants().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint childElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor> getStateSynchroChannelsCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.State) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChannels().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel childElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor> getStateRegionCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.State) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRegions().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region childElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
			return getFujabaRealtimeStatechart_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_2020ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.State2EditPart.VISUAL_ID:
			return getState_2021ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.State3EditPart.VISUAL_ID:
			return getState_2022ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.HistoryStateEditPart.VISUAL_ID:
			return getHistoryState_2023ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ClockEditPart.VISUAL_ID:
			return getClock_2024ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryActionEditPart.VISUAL_ID:
			return getEntryAction_3025ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.DoActionEditPart.VISUAL_ID:
			return getDoAction_3026ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitActionEditPart.VISUAL_ID:
			return getExitAction_3027ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID:
			return getClockConstraint_3028ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID:
			return getSynchronizationChannel_3029ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID:
			return getRegion_3030ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_2020IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.State2EditPart.VISUAL_ID:
			return getState_2021IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.State3EditPart.VISUAL_ID:
			return getState_2022IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.HistoryStateEditPart.VISUAL_ID:
			return getHistoryState_2023IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ClockEditPart.VISUAL_ID:
			return getClock_2024IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryActionEditPart.VISUAL_ID:
			return getEntryAction_3025IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.DoActionEditPart.VISUAL_ID:
			return getDoAction_3026IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitActionEditPart.VISUAL_ID:
			return getExitAction_3027IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID:
			return getClockConstraint_3028IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID:
			return getSynchronizationChannel_3029IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID:
			return getRegion_3030IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_2020OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.State2EditPart.VISUAL_ID:
			return getState_2021OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.State3EditPart.VISUAL_ID:
			return getState_2022OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.HistoryStateEditPart.VISUAL_ID:
			return getHistoryState_2023OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ClockEditPart.VISUAL_ID:
			return getClock_2024OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryActionEditPart.VISUAL_ID:
			return getEntryAction_3025OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.DoActionEditPart.VISUAL_ID:
			return getDoAction_3026OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitActionEditPart.VISUAL_ID:
			return getExitAction_3027OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID:
			return getClockConstraint_3028OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID:
			return getSynchronizationChannel_3029OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID:
			return getRegion_3030OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getFujabaRealtimeStatechart_1000ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getState_2020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getState_2021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getState_2022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getHistoryState_2023ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getClock_2024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getEntryAction_3025ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getDoAction_3026ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getExitAction_3027ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getClockConstraint_3028ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getSynchronizationChannel_3029ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getRegion_3030ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getTransition_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getState_2020IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.State) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getState_2021IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.State) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getState_2022IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.State) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getHistoryState_2023IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.HistoryState modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.HistoryState) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getClock_2024IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getEntryAction_3025IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getDoAction_3026IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getExitAction_3027IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getClockConstraint_3028IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getSynchronizationChannel_3029IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getRegion_3030IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getTransition_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getState_2020OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.State) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getState_2021OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.State) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getState_2022OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.State) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getHistoryState_2023OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.HistoryState modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.HistoryState) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getClock_2024OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getEntryAction_3025OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getDoAction_3026OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getExitAction_3027OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getClockConstraint_3028OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getSynchronizationChannel_3029OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getRegion_3030OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getTransition_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getContainedTypeModelFacetLinks_Transition_4002(
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart container) {
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition link = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition) linkObject;
			if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex dst = link
					.getTarget();
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.Transition_4002,
					de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getIncomingTypeModelFacetLinks_Transition_4002(
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_Target()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition link = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.Transition_4002,
					de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> getOutgoingTypeModelFacetLinks_Transition_4002(
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex source) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart) {
				container = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition link = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition) linkObject;
			if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex dst = link
					.getTarget();
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex src = link
					.getSource();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.Transition_4002,
					de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

}
