package org.muml.pim.messagetype.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.core.modelinstance.ModelinstancePackage;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart;
import org.muml.pim.messagetype.diagram.edit.parts.MessageTypeEditPart;
import org.muml.pim.messagetype.diagram.edit.parts.MessageTypeNameEditPart;
import org.muml.pim.messagetype.diagram.edit.parts.MessageTypeParametersCompartmentEditPart;
import org.muml.pim.messagetype.diagram.edit.parts.MessageTypeRepositoryEditPart;
import org.muml.pim.messagetype.diagram.edit.parts.MessageTypeRepositoryMessageTypesCompartmentEditPart;
import org.muml.pim.messagetype.diagram.edit.parts.MessageTypeRepositoryNameEditPart;
import org.muml.pim.messagetype.diagram.edit.parts.ParameterEditPart;
import org.muml.pim.messagetype.diagram.edit.parts.WrappingLabelEditPart;
import org.muml.pim.msgtype.MsgtypePackage;

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
	private static final String DEBUG_KEY = "org.muml.pim.messagetype.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MessageInterfaceDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return MessageInterfaceDiagramEditPart.VISUAL_ID;
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
				MessageTypeDiagramEditorPlugin.getInstance()
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
		if (ModelinstancePackage.eINSTANCE.getModelElementCategory().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ModelElementCategory) domainElement)) {
			return MessageInterfaceDiagramEditPart.VISUAL_ID;
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
		String containerModelID = org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry.getModelID(containerView);
		if (!MessageInterfaceDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (MessageInterfaceDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MessageInterfaceDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MessageInterfaceDiagramEditPart.VISUAL_ID:
			if (MsgtypePackage.eINSTANCE.getMessageTypeRepository().isSuperTypeOf(domainElement.eClass())) {
				return MessageTypeRepositoryEditPart.VISUAL_ID;
			}
			break;
		case MessageTypeRepositoryMessageTypesCompartmentEditPart.VISUAL_ID:
			if (MsgtypePackage.eINSTANCE.getMessageType().isSuperTypeOf(domainElement.eClass())) {
				return MessageTypeEditPart.VISUAL_ID;
			}
			break;
		case MessageTypeParametersCompartmentEditPart.VISUAL_ID:
			if (BehaviorPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry.getModelID(containerView);
		if (!MessageInterfaceDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (MessageInterfaceDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MessageInterfaceDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case MessageInterfaceDiagramEditPart.VISUAL_ID:
			if (MessageTypeRepositoryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageTypeRepositoryEditPart.VISUAL_ID:
			if (MessageTypeRepositoryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageTypeRepositoryMessageTypesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageTypeEditPart.VISUAL_ID:
			if (MessageTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageTypeParametersCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParameterEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageTypeRepositoryMessageTypesCompartmentEditPart.VISUAL_ID:
			if (MessageTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageTypeParametersCompartmentEditPart.VISUAL_ID:
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(ModelElementCategory element) {
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
		case MessageTypeRepositoryMessageTypesCompartmentEditPart.VISUAL_ID:
		case MessageTypeParametersCompartmentEditPart.VISUAL_ID:
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
		case MessageInterfaceDiagramEditPart.VISUAL_ID:
			return false;
		case ParameterEditPart.VISUAL_ID:
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
			return org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
