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

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.diagram.edit.parts.ClockConstraintEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.DoEventEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.EntryEventEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.EntryPointEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.ExitEventEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.ExitPointEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.ModelElementCategoryEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechart2EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechartEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechartNameEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartment2EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartmentEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RegionEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RegionNameEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RegionPriorityEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RegionRegionContentsCompartmentEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateActionCompartmentEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateChannelCompartmentEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateInvariantCompartmentEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateNameEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateRegionCompartmentEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.SynchronizationChannelEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.TransitionEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel3EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel4EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel5EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel6EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel7EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel8EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel9EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MumlVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.muml.pim.realtimestatechart.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ModelElementCategoryEditPart.MODEL_ID.equals(view.getType())) {
				return ModelElementCategoryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.getVisualID(view.getType());
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
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				RealtimestatechartDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
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
		if (RealtimestatechartPackage.eINSTANCE.getRealtimeStatechart().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((RealtimeStatechart) domainElement)) {
			return ModelElementCategoryEditPart.VISUAL_ID;
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
		String containerModelID = org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry
				.getModelID(containerView);
		if (!ModelElementCategoryEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ModelElementCategoryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ModelElementCategoryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			if (RealtimestatechartPackage.eINSTANCE.getRealtimeStatechart().isSuperTypeOf(domainElement.eClass())) {
				return RealtimeStatechartEditPart.VISUAL_ID;
			}
			break;
		case StateEditPart.VISUAL_ID:
			if (RealtimestatechartPackage.eINSTANCE.getEntryPoint().isSuperTypeOf(domainElement.eClass())) {
				return EntryPointEditPart.VISUAL_ID;
			}
			if (RealtimestatechartPackage.eINSTANCE.getExitPoint().isSuperTypeOf(domainElement.eClass())) {
				return ExitPointEditPart.VISUAL_ID;
			}
			break;
		case RealtimeStatechartStatechartContentsCompartmentEditPart.VISUAL_ID:
			if (RealtimestatechartPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass())) {
				return StateEditPart.VISUAL_ID;
			}
			break;
		case StateActionCompartmentEditPart.VISUAL_ID:
			if (RealtimestatechartPackage.eINSTANCE.getEntryEvent().isSuperTypeOf(domainElement.eClass())) {
				return EntryEventEditPart.VISUAL_ID;
			}
			if (RealtimestatechartPackage.eINSTANCE.getDoEvent().isSuperTypeOf(domainElement.eClass())) {
				return DoEventEditPart.VISUAL_ID;
			}
			if (RealtimestatechartPackage.eINSTANCE.getExitEvent().isSuperTypeOf(domainElement.eClass())) {
				return ExitEventEditPart.VISUAL_ID;
			}
			break;
		case StateRegionCompartmentEditPart.VISUAL_ID:
//			if (RealtimestatechartPackage.eINSTANCE.getRegion().isSuperTypeOf(domainElement.eClass())) {
//				return RegionEditPart.VISUAL_ID;
//			}
			break;
		case StateChannelCompartmentEditPart.VISUAL_ID:
			if (RealtimestatechartPackage.eINSTANCE.getSynchronizationChannel().isSuperTypeOf(domainElement.eClass())) {
				return SynchronizationChannelEditPart.VISUAL_ID;
			}
			break;
		case StateInvariantCompartmentEditPart.VISUAL_ID:
			if (RealtimestatechartPackage.eINSTANCE.getClockConstraint().isSuperTypeOf(domainElement.eClass())) {
				return ClockConstraintEditPart.VISUAL_ID;
			}
			break;
		case RegionRegionContentsCompartmentEditPart.VISUAL_ID:
			if (RealtimestatechartPackage.eINSTANCE.getRealtimeStatechart().isSuperTypeOf(domainElement.eClass())) {
				return RealtimeStatechart2EditPart.VISUAL_ID;
			}
			break;
		case RealtimeStatechartStatechartContentsCompartment2EditPart.VISUAL_ID:
			if (RealtimestatechartPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass())) {
				return StateEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry
				.getModelID(containerView);
		if (!ModelElementCategoryEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ModelElementCategoryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ModelElementCategoryEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			if (RealtimeStatechartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RealtimeStatechartEditPart.VISUAL_ID:
			if (RealtimeStatechartNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RealtimeStatechartStatechartContentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateEditPart.VISUAL_ID:
			if (StateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateActionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateRegionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateChannelCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateInvariantCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntryPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExitPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntryEventEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DoEventEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExitEventEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClockConstraintEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SynchronizationChannelEditPart.VISUAL_ID:
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RegionEditPart.VISUAL_ID:
			if (RegionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RegionPriorityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RegionRegionContentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RealtimeStatechart2EditPart.VISUAL_ID:
			if (RealtimeStatechartStatechartContentsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RealtimeStatechartStatechartContentsCompartmentEditPart.VISUAL_ID:
			if (StateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateActionCompartmentEditPart.VISUAL_ID:
			if (EntryEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DoEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExitEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateRegionCompartmentEditPart.VISUAL_ID:
			if (RegionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateChannelCompartmentEditPart.VISUAL_ID:
			if (SynchronizationChannelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateInvariantCompartmentEditPart.VISUAL_ID:
			if (ClockConstraintEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RegionRegionContentsCompartmentEditPart.VISUAL_ID:
			if (RealtimeStatechart2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RealtimeStatechartStatechartContentsCompartment2EditPart.VISUAL_ID:
			if (StateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransitionEditPart.VISUAL_ID:
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
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
		if (RealtimestatechartPackage.eINSTANCE.getTransition().isSuperTypeOf(domainElement.eClass())) {
			return TransitionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(RealtimeStatechart element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case RealtimeStatechartStatechartContentsCompartmentEditPart.VISUAL_ID:
		case StateActionCompartmentEditPart.VISUAL_ID:
		case StateRegionCompartmentEditPart.VISUAL_ID:
		case StateChannelCompartmentEditPart.VISUAL_ID:
		case StateInvariantCompartmentEditPart.VISUAL_ID:
		case RegionRegionContentsCompartmentEditPart.VISUAL_ID:
		case RealtimeStatechartStatechartContentsCompartment2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			return false;
		case EntryEventEditPart.VISUAL_ID:
		case DoEventEditPart.VISUAL_ID:
		case ExitEventEditPart.VISUAL_ID:
		case ClockConstraintEditPart.VISUAL_ID:
		case SynchronizationChannelEditPart.VISUAL_ID:
		case EntryPointEditPart.VISUAL_ID:
		case ExitPointEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
