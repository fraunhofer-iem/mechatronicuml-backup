package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part;

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

/**
 * @generated
 */
public class MumlDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getRealtimeStatechart_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_3032SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartmentEditPart.VISUAL_ID:
			return getRealtimeStatechartStatechartContentsCompartment_7030SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateActionCompartmentEditPart.VISUAL_ID:
			return getStateActionCompartment_7031SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateRegionCompartmentEditPart.VISUAL_ID:
			return getStateRegionCompartment_7032SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateChannelCompartmentEditPart.VISUAL_ID:
			return getStateChannelCompartment_7033SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateInvariantCompartmentEditPart.VISUAL_ID:
			return getStateInvariantCompartment_7034SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionRegionContentsCompartmentEditPart.VISUAL_ID:
			return getRegionRegionContentsCompartment_7035SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartment2EditPart.VISUAL_ID:
			return getRealtimeStatechartStatechartContentsCompartment_7036SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor> getRealtimeStatechart_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart modelElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor>();

		if (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
				.getNodeVisualID(view, modelElement) == de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID) {
			result.add(new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor(
					modelElement,
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID));
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor> getState_3032SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.State) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConnectionPoints().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.ConnectionPoint childElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.ConnectionPoint) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryPointEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitPointEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor> getRealtimeStatechartStatechartContentsCompartment_7030SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart modelElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStates().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.State childElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.State) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor> getStateActionCompartment_7031SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.State) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor>();
		{
			de.uni_paderborn.fujaba.muml.realtimestatechart.EntryEvent childElement = modelElement
					.getEntryEvent();
			int visualID = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
			}
		}
		{
			de.uni_paderborn.fujaba.muml.realtimestatechart.DoEvent childElement = modelElement
					.getDoEvent();
			int visualID = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
			}
		}
		{
			de.uni_paderborn.fujaba.muml.realtimestatechart.ExitEvent childElement = modelElement
					.getExitEvent();
			int visualID = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor> getStateRegionCompartment_7032SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.State) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRegions().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.Region childElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.Region) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor> getStateChannelCompartment_7033SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.State) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChannels().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationChannel childElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationChannel) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor> getStateInvariantCompartment_7034SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.State) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInvariants().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.ClockConstraint childElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.ClockConstraint) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor> getRegionRegionContentsCompartment_7035SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.realtimestatechart.Region modelElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.Region) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor>();
		{
			de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart childElement = modelElement
					.getStatechart();
			int visualID = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechart2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor> getRealtimeStatechartStatechartContentsCompartment_7036SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart modelElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStates().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.State childElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.State) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
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
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getRealtimeStatechart_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
			return getRealtimeStatechart_2007ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_3032ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID:
			return getEntryEvent_3033ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID:
			return getDoEvent_3034ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID:
			return getExitEvent_3035ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID:
			return getClockConstraint_3036ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID:
			return getSynchronizationChannel_3037ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID:
			return getRegion_3038ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechart2EditPart.VISUAL_ID:
			return getRealtimeStatechart_3039ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryPointEditPart.VISUAL_ID:
			return getEntryPoint_3040ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitPointEditPart.VISUAL_ID:
			return getExitPoint_3041ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
			return getRealtimeStatechart_2007IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_3032IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID:
			return getEntryEvent_3033IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID:
			return getDoEvent_3034IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID:
			return getExitEvent_3035IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID:
			return getClockConstraint_3036IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID:
			return getSynchronizationChannel_3037IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID:
			return getRegion_3038IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechart2EditPart.VISUAL_ID:
			return getRealtimeStatechart_3039IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryPointEditPart.VISUAL_ID:
			return getEntryPoint_3040IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitPointEditPart.VISUAL_ID:
			return getExitPoint_3041IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
			return getRealtimeStatechart_2007OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_3032OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID:
			return getEntryEvent_3033OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID:
			return getDoEvent_3034OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID:
			return getExitEvent_3035OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID:
			return getClockConstraint_3036OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID:
			return getSynchronizationChannel_3037OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID:
			return getRegion_3038OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechart2EditPart.VISUAL_ID:
			return getRealtimeStatechart_3039OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryPointEditPart.VISUAL_ID:
			return getEntryPoint_3040OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitPointEditPart.VISUAL_ID:
			return getExitPoint_3041OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getRealtimeStatechart_1000ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart modelElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getRealtimeStatechart_2007ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart modelElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getState_3032ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getEntryEvent_3033ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getDoEvent_3034ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getExitEvent_3035ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getClockConstraint_3036ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getSynchronizationChannel_3037ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getRegion_3038ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getRealtimeStatechart_3039ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart modelElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getEntryPoint_3040ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getExitPoint_3041ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getTransition_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getRealtimeStatechart_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getState_3032IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.State) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getEntryEvent_3033IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getDoEvent_3034IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getExitEvent_3035IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getClockConstraint_3036IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getSynchronizationChannel_3037IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getRegion_3038IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getRealtimeStatechart_3039IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getEntryPoint_3040IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.realtimestatechart.EntryPoint modelElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.EntryPoint) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getExitPoint_3041IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.realtimestatechart.ExitPoint modelElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.ExitPoint) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getTransition_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getRealtimeStatechart_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getState_3032OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.State) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getEntryEvent_3033OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getDoEvent_3034OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getExitEvent_3035OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getClockConstraint_3036OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getSynchronizationChannel_3037OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getRegion_3038OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getRealtimeStatechart_3039OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getEntryPoint_3040OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.realtimestatechart.EntryPoint modelElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.EntryPoint) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getExitPoint_3041OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.realtimestatechart.ExitPoint modelElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.ExitPoint) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getTransition_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_Transition_4003(
			de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart container) {
		LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.Transition) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.realtimestatechart.Transition link = (de.uni_paderborn.fujaba.muml.realtimestatechart.Transition) linkObject;
			if (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex dst = link
					.getTarget();
			de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.Transition_4003,
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getIncomingTypeModelFacetLinks_Transition_4003(
			de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_Target()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.Transition) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.realtimestatechart.Transition link = (de.uni_paderborn.fujaba.muml.realtimestatechart.Transition) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.Transition_4003,
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_Transition_4003(
			de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex source) {
		de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart) {
				container = (de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.Transition) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.realtimestatechart.Transition link = (de.uni_paderborn.fujaba.muml.realtimestatechart.Transition) linkObject;
			if (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex dst = link
					.getTarget();
			de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex src = link
					.getSource();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.Transition_4003,
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
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
		public List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlNodeDescriptor> getSemanticChildren(
				View view) {
			return MumlDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getContainedLinks(
				View view) {
			return MumlDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getIncomingLinks(
				View view) {
			return MumlDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
				View view) {
			return MumlDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
