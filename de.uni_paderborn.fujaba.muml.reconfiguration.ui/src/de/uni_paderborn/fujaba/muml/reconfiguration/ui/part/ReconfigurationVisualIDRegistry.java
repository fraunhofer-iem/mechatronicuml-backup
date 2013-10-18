package de.uni_paderborn.fujaba.muml.reconfiguration.ui.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented by
 * a domain model object.
 * 
 * @generated
 */
public class ReconfigurationVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "de.uni_paderborn.fujaba.muml.reconfiguration.ui/debug/visualID"; //$NON-NLS-1$

	// /**
	// * @generated
	// */
	 public static int getVisualID(View view) {
	 if (view instanceof Diagram) {
	 if
	 (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
	 .equals(view.getType())) {
	 return
	 de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID;
	 } else {
	 return -1;
	 }
	 }
	 return
	 de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
	 .getVisualID(view.getType());
	 }
	
	
	// copied from
	// /de.uni_paderborn.fujaba.muml.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/part/MumlVisualIDRegistry.java
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

	// copied from
	// /de.uni_paderborn.fujaba.muml.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/part/MumlVisualIDRegistry.java
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	// copied from
	// /de.uni_paderborn.fujaba.muml.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/part/MumlVisualIDRegistry.java
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	// basically copied from
	// /de.uni_paderborn.fujaba.muml.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/part/MumlVisualIDRegistry.java
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage.eINSTANCE
				.getModelElementCategory()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((de.uni_paderborn.fujaba.modelinstance.ModelElementCategory) domainElement)) {
			return de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID;
		}
		return -1;
	}

	// basically copied from
	// /de.uni_paderborn.fujaba.muml.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/part/MumlVisualIDRegistry.java
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
				.getModelID(containerView);
		if (!de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			// if
			// (de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
			// .getAtomicComponent().isSuperTypeOf(domainElement.eClass())) {
			// return
			// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID;
			// }
			if (de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurableStructuredComponent().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart.VISUAL_ID;
			}
			break;

		case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurationMessagePort().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID;
			}
			
			if (de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurationExecutionPort().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart.VISUAL_ID;
			}	
			
			if (de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getRuleBasedReconfigurationController().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.RuleBasedReconfigurationControllerEditPart.VISUAL_ID;
			}
			
			
			if (de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
					.getDiscretePort().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
					.getContinuousPort().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID;
			}

			break;
		case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentCompartmentEditPart.VISUAL_ID:
			if(de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
					.getComponentPart().isSuperTypeOf(domainElement.eClass()))
				return de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID;
			

		}
		return -1;
	}

	//
	// /**
	// * @generated
	// */
	// public static boolean canCreateNode(View containerView, int nodeVisualID)
	// {
	// String containerModelID =
	// de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
	// .getModelID(containerView);
	// if
	// (!de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
	// .equals(containerModelID)) {
	// return false;
	// }
	// int containerVisualID;
	// if
	// (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
	// .equals(containerModelID)) {
	// containerVisualID =
	// de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
	// .getVisualID(containerView);
	// } else {
	// if (containerView instanceof Diagram) {
	// containerVisualID =
	// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID;
	// } else {
	// return false;
	// }
	// }
	// switch (containerVisualID) {
	// case
	// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
	// if
	// (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID
	// == nodeVisualID) {
	// return true;
	// }
	// if
	// (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID
	// == nodeVisualID) {
	// return true;
	// }
	// break;
	// case
	// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
	// if
	// (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.AtomicComponentNameEditPart.VISUAL_ID
	// == nodeVisualID) {
	// return true;
	// }
	// if
	// (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID
	// == nodeVisualID) {
	// return true;
	// }
	// if
	// (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID
	// == nodeVisualID) {
	// return true;
	// }
	// if
	// (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID
	// == nodeVisualID) {
	// return true;
	// }
	// break;
	// case
	// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID:
	// if
	// (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentNameEditPart.VISUAL_ID
	// == nodeVisualID) {
	// return true;
	// }
	// if
	// (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID
	// == nodeVisualID) {
	// return true;
	// }
	// if
	// (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID
	// == nodeVisualID) {
	// return true;
	// }
	// if
	// (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID
	// == nodeVisualID) {
	// return true;
	// }
	// break;
	// case
	// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
	// if
	// (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortNameEditPart.VISUAL_ID
	// == nodeVisualID) {
	// return true;
	// }
	// if
	// (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID
	// == nodeVisualID) {
	// return true;
	// }
	// break;
	// case
	// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
	// if
	// (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortNameEditPart.VISUAL_ID
	// == nodeVisualID) {
	// return true;
	// }
	// break;
	// case
	// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
	// if
	// (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortNameEditPart.VISUAL_ID
	// == nodeVisualID) {
	// return true;
	// }
	// break;
	// case
	// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
	// if
	// (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID
	// == nodeVisualID) {
	// return true;
	// }
	// if
	// (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart.VISUAL_ID
	// == nodeVisualID) {
	// return true;
	// }
	// break;
	// case
	// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart.VISUAL_ID:
	// if
	// (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartNameEditPart.VISUAL_ID
	// == nodeVisualID) {
	// return true;
	// }
	// break;
	// case
	// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.CoordinationProtocolOccurrenceEditPart.VISUAL_ID:
	// if
	// (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID
	// == nodeVisualID) {
	// return true;
	// }
	// break;
	// case
	// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID:
	// if
	// (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID
	// == nodeVisualID) {
	// return true;
	// }
	// if
	// (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.CoordinationProtocolOccurrenceEditPart.VISUAL_ID
	// == nodeVisualID) {
	// return true;
	// }
	// break;
	// }
	// return false;
	// }
	//
	// /**
	// * @generated
	// */
	// public static int getLinkWithClassVisualID(EObject domainElement) {
	// if (domainElement == null) {
	// return -1;
	// }
	// if (de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
	// .getAssemblyConnector().isSuperTypeOf(domainElement.eClass())) {
	// return
	// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID;
	// }
	// if (de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
	// .getDelegationConnector().isSuperTypeOf(domainElement.eClass())) {
	// return
	// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID;
	// }
	// return -1;
	// }
	//
	// copied from
	// /de.uni_paderborn.fujaba.muml.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/part/MumlVisualIDRegistry.java
	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 */
	private static boolean isDiagram(
			de.uni_paderborn.fujaba.modelinstance.ModelElementCategory element) {
		return true;
	}
	//
	// /**
	// * @generated
	// */
	// public static boolean checkNodeVisualID(View containerView,
	// EObject domainElement, int candidate) {
	// if (candidate == -1) {
	// //unrecognized id is always bad
	// return false;
	// }
	// int basic = getNodeVisualID(containerView, domainElement);
	// return basic == candidate;
	// }
	//
	// /**
	// * @generated
	// */
	// public static boolean isCompartmentVisualID(int visualID) {
	// switch (visualID) {
	// case
	// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID:
	// return true;
	// default:
	// break;
	// }
	// return false;
	// }
	//
	// /**
	// * @generated
	// */
	// public static boolean isSemanticLeafVisualID(int visualID) {
	// switch (visualID) {
	// case
	// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
	// return false;
	// case
	// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
	// case
	// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
	// case
	// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
	// case
	// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.CoordinationProtocolOccurrenceEditPart.VISUAL_ID:
	// case
	// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart.VISUAL_ID:
	// return true;
	// default:
	// break;
	// }
	// return false;
	// }
	//
	// /**
	// * @generated
	// */
	// public static final DiagramStructure TYPED_INSTANCE = new
	// DiagramStructure() {
	// /**
	// * @generated
	// */
	// @Override
	// public int getVisualID(View view) {
	// return
	// de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
	// .getVisualID(view);
	// }
	//
	// //copied from
	// /de.uni_paderborn.fujaba.muml.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/part/MumlVisualIDRegistry.java
	// public String getModelID(View view) {
	// return
	// de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
	// .getModelID(view);
	// }
	//
	// /**
	// * @generated
	// */
	// @Override
	// public int getNodeVisualID(View containerView, EObject domainElement) {
	// return
	// de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
	// .getNodeVisualID(containerView, domainElement);
	// }
	//
	// /**
	// * @generated
	// */
	// @Override
	// public boolean checkNodeVisualID(View containerView,
	// EObject domainElement, int candidate) {
	// return
	// de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
	// .checkNodeVisualID(containerView, domainElement, candidate);
	// }
	//
	// /**
	// * @generated
	// */
	// @Override
	// public boolean isCompartmentVisualID(int visualID) {
	// return
	// de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
	// .isCompartmentVisualID(visualID);
	// }
	//
	// /**
	// * @generated
	// */
	// @Override
	// public boolean isSemanticLeafVisualID(int visualID) {
	// return
	// de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
	// .isSemanticLeafVisualID(visualID);
	// }
	// };

}
