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
public class MumlDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartEditPart.VISUAL_ID:
			return getFujabaRealtimeStatechart_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_2001SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.State2EditPart.VISUAL_ID:
			return getState_3007SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateCompoundCompartmentEditPart.VISUAL_ID:
			return getStateCompoundCompartment_7001SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart.VISUAL_ID:
			return getStateRegionCompartment_7002SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionFujabaRealtimeStatechartCompartmentEditPart.VISUAL_ID:
			return getRegionFujabaRealtimeStatechartCompartment_7003SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateCompoundCompartment2EditPart.VISUAL_ID:
			return getStateCompoundCompartment_7004SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartment2EditPart.VISUAL_ID:
			return getStateRegionCompartment_7005SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor> getFujabaRealtimeStatechart_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getVertices().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex childElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor> getState_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.State) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStateEntryOrExitPoints()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryOrExitPoint childElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryOrExitPoint) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEntryPointEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateExitPointEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor> getState_3007SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.State) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStateEntryOrExitPoints()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryOrExitPoint childElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryOrExitPoint) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEntryPointEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateExitPointEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor> getStateCompoundCompartment_7001SemanticChildren(
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
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor>();
		{
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryEvent childElement = modelElement
					.getEntryEvent();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
			}
		}
		{
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoEvent childElement = modelElement
					.getDoEvent();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
			}
		}
		{
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitEvent childElement = modelElement
					.getExitEvent();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getInvariants().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint childElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getChannels().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel childElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor> getStateRegionCompartment_7002SemanticChildren(
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
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRegions().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region childElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor> getRegionFujabaRealtimeStatechartCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getVertices().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex childElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.State2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor> getStateCompoundCompartment_7004SemanticChildren(
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
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor>();
		{
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryEvent childElement = modelElement
					.getEntryEvent();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
			}
		}
		{
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoEvent childElement = modelElement
					.getDoEvent();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
			}
		}
		{
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitEvent childElement = modelElement
					.getExitEvent();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getInvariants().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint childElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getChannels().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel childElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor> getStateRegionCompartment_7005SemanticChildren(
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
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRegions().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region childElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartEditPart.VISUAL_ID:
			return getFujabaRealtimeStatechart_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_2001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID:
			return getEntryEvent_3001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID:
			return getDoEvent_3002ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID:
			return getExitEvent_3003ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID:
			return getClockConstraint_3004ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID:
			return getSynchronizationChannel_3005ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID:
			return getRegion_3006ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.State2EditPart.VISUAL_ID:
			return getState_3007ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEntryPointEditPart.VISUAL_ID:
			return getStateEntryPoint_3008ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateExitPointEditPart.VISUAL_ID:
			return getStateExitPoint_3009ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.Transition2EditPart.VISUAL_ID:
			return getTransition_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_2001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID:
			return getEntryEvent_3001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID:
			return getDoEvent_3002IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID:
			return getExitEvent_3003IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID:
			return getClockConstraint_3004IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID:
			return getSynchronizationChannel_3005IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID:
			return getRegion_3006IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.State2EditPart.VISUAL_ID:
			return getState_3007IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEntryPointEditPart.VISUAL_ID:
			return getStateEntryPoint_3008IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateExitPointEditPart.VISUAL_ID:
			return getStateExitPoint_3009IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.Transition2EditPart.VISUAL_ID:
			return getTransition_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_2001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID:
			return getEntryEvent_3001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID:
			return getDoEvent_3002OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID:
			return getExitEvent_3003OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID:
			return getClockConstraint_3004OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID:
			return getSynchronizationChannel_3005OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID:
			return getRegion_3006OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.State2EditPart.VISUAL_ID:
			return getState_3007OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEntryPointEditPart.VISUAL_ID:
			return getStateEntryPoint_3008OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateExitPointEditPart.VISUAL_ID:
			return getStateExitPoint_3009OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.Transition2EditPart.VISUAL_ID:
			return getTransition_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getFujabaRealtimeStatechart_1000ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getState_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getEntryEvent_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getDoEvent_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getExitEvent_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getClockConstraint_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getSynchronizationChannel_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getRegion_3006ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getState_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getStateEntryPoint_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getStateExitPoint_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getTransition_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getTransition_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getState_2001IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.State) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getEntryEvent_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getDoEvent_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getExitEvent_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getClockConstraint_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getSynchronizationChannel_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getRegion_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getState_3007IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.State) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getStateEntryPoint_3008IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryPoint modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryPoint) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getStateExitPoint_3009IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateExitPoint modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateExitPoint) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getTransition_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getTransition_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getState_2001OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.State) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getEntryEvent_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getDoEvent_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getExitEvent_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getClockConstraint_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getSynchronizationChannel_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getRegion_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getState_3007OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.State) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getStateEntryPoint_3008OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryPoint modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryPoint) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getStateExitPoint_3009OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateExitPoint modelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateExitPoint) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getTransition_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getTransition_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_Transition_4001(
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart container) {
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition link = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition) linkObject;
			// BEGIN: Bugfix (MechatronicUML)
			// TODO: Create Bug for this and reference its ID
			// if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
			//	continue;
			// }
			// END: Bugfix
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex dst = link
					.getTarget();
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4001,
					de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_Transition_4002(
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region container) {
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition link = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition) linkObject;
			// BEGIN: Bugfix (MechatronicUML)
			// TODO: Create Bug for this and reference its ID
			// if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.Transition2EditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
			//	continue;
			// }
			// END: Bugfix
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex dst = link
					.getTarget();
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4002,
					de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.Transition2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getIncomingTypeModelFacetLinks_Transition_4001(
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor>();
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
			// BEGIN: Bugfix (MechatronicUML)
			// TODO: Create Bug for this and reference its ID
			// if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
			//	continue;
			// }
			// END: Bugfix
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4001,
					de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getIncomingTypeModelFacetLinks_Transition_4002(
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor>();
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
			// BEGIN: Bugfix (MechatronicUML)
			// TODO: Create Bug for this and reference its ID
			// if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.Transition2EditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
			//	continue;
			// }
			// END: Bugfix
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4002,
					de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.Transition2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_Transition_4001(
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
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition link = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition) linkObject;
			// BEGIN: Bugfix (MechatronicUML)
			// TODO: Create Bug for this and reference its ID
			// if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
			//	continue;
			// }
			// END: Bugfix
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex dst = link
					.getTarget();
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex src = link
					.getSource();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4001,
					de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_Transition_4002(
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex source) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region) {
				container = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition link = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition) linkObject;
			// BEGIN: Bugfix (MechatronicUML)
			// TODO: Create Bug for this and reference its ID
			// if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.Transition2EditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
			//	continue;
			// }
			// END: Bugfix
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex dst = link
					.getTarget();
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex src = link
					.getSource();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4002,
					de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.Transition2EditPart.VISUAL_ID));
		}
		return result;
	}

}
