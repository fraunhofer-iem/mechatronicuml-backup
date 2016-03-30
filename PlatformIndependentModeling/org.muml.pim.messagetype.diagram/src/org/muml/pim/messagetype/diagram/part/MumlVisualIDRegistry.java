package org.muml.pim.messagetype.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

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
	private static final String DEBUG_KEY = "de.uni_paderborn.fujaba.muml.messagetype.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (org.muml.pim.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.MODEL_ID
					.equals(view.getType())) {
				return org.muml.pim.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry.getVisualID(view.getType());
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
				org.muml.pim.messagetype.diagram.part.MessageTypeDiagramEditorPlugin.getInstance()
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
		if (org.muml.core.modelinstance.ModelinstancePackage.eINSTANCE.getModelElementCategory()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((org.muml.core.modelinstance.ModelElementCategory) domainElement)) {
			return org.muml.pim.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID;
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
		String containerModelID = org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry
				.getModelID(containerView);
		if (!org.muml.pim.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (org.muml.pim.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = org.muml.pim.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case org.muml.pim.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID:
			if (org.muml.pim.msgtype.MsgtypePackage.eINSTANCE.getMessageTypeRepository()
					.isSuperTypeOf(domainElement.eClass())) {
				return org.muml.pim.messagetype.diagram.edit.parts.MessageTypeRepositoryEditPart.VISUAL_ID;
			}
			break;
		case org.muml.pim.messagetype.diagram.edit.parts.MessageTypeRepositoryMessageTypesCompartmentEditPart.VISUAL_ID:
			if (org.muml.pim.msgtype.MsgtypePackage.eINSTANCE.getMessageType()
					.isSuperTypeOf(domainElement.eClass())) {
				return org.muml.pim.messagetype.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID;
			}
			break;
		case org.muml.pim.messagetype.diagram.edit.parts.MessageTypeParametersCompartmentEditPart.VISUAL_ID:
			if (org.muml.pim.behavior.BehaviorPackage.eINSTANCE.getParameter()
					.isSuperTypeOf(domainElement.eClass())) {
				return org.muml.pim.messagetype.diagram.edit.parts.ParameterEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry
				.getModelID(containerView);
		if (!org.muml.pim.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (org.muml.pim.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = org.muml.pim.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case org.muml.pim.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID:
			if (org.muml.pim.messagetype.diagram.edit.parts.MessageTypeRepositoryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.pim.messagetype.diagram.edit.parts.MessageTypeRepositoryEditPart.VISUAL_ID:
			if (org.muml.pim.messagetype.diagram.edit.parts.MessageTypeRepositoryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pim.messagetype.diagram.edit.parts.MessageTypeRepositoryMessageTypesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.pim.messagetype.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			if (org.muml.pim.messagetype.diagram.edit.parts.MessageTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pim.messagetype.diagram.edit.parts.MessageTypeParametersCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.pim.messagetype.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			if (org.muml.pim.messagetype.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.pim.messagetype.diagram.edit.parts.MessageTypeRepositoryMessageTypesCompartmentEditPart.VISUAL_ID:
			if (org.muml.pim.messagetype.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.pim.messagetype.diagram.edit.parts.MessageTypeParametersCompartmentEditPart.VISUAL_ID:
			if (org.muml.pim.messagetype.diagram.edit.parts.ParameterEditPart.VISUAL_ID == nodeVisualID) {
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
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(org.muml.core.modelinstance.ModelElementCategory element) {
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
		case org.muml.pim.messagetype.diagram.edit.parts.MessageTypeRepositoryMessageTypesCompartmentEditPart.VISUAL_ID:
		case org.muml.pim.messagetype.diagram.edit.parts.MessageTypeParametersCompartmentEditPart.VISUAL_ID:
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
		case org.muml.pim.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID:
			return false;
		case org.muml.pim.messagetype.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
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
			return org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
