package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class RealtimeStatechartVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.MODEL_ID
					.equals(view.getType())) {
				return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechartPackage.eINSTANCE
				.getRealtimeStatechart().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechart) domainElement)) {
			return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
				.getModelID(containerView);
		if (!de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getState().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getInitialState().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.InitialStateEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getFinalState().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.FinalStateEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getHistoryState().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.HistoryStateEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getClock().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateActionsCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getEntryEvent().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getDoEvent().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getExitEvent().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateInvariantCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getClockConstraint().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateSynchroChannelsCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getSynchronizationChannel().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getRegion().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
				.getModelID(containerView);
		if (!de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.InitialStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.FinalStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.HistoryStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateActionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateInvariantCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateSynchroChannelsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockNameIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.EntryEventActionExprEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.DoEventPeriodLowerPeriodUpperEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ExitEventActionExprEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockConstraintClockConstraintExprEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.SynchronizationChannelSynchroChannelExprEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateActionsCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateInvariantCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateSynchroChannelsCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionPriorityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionClockResetExprEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionDeadlineExprEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEventExprEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionGuardExprEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSideEffectExprEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionTimeGuardExprEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSafetyTransitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSynchroExprEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getTransition().isSuperTypeOf(domainElement.eClass())) {
			return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechart element) {
		return true;
	}

}
