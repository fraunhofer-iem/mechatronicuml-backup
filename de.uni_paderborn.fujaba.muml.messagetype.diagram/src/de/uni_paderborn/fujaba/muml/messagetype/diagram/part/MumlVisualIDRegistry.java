package de.uni_paderborn.fujaba.muml.messagetype.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage;

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
			if (de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.MODEL_ID
					.equals(view.getType())) {
				return de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlVisualIDRegistry
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
				de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MessageTypeDiagramEditorPlugin
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
		if (de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage.eINSTANCE
				.getModelElementCategory()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((de.uni_paderborn.fujaba.modelinstance.ModelElementCategory) domainElement)) {
			return de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID;
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
		String containerModelID = de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlVisualIDRegistry
				.getModelID(containerView);
		if (!de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage.eINSTANCE
					.getMessageTypeRepository().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryMessageTypesCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage.eINSTANCE
					.getMessageType().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeParametersCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
					.getParameter().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.ParameterEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlVisualIDRegistry
				.getModelID(containerView);
		if (!de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryMessageTypesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeParametersCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryMessageTypesCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeParametersCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.ParameterEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(
			de.uni_paderborn.fujaba.modelinstance.ModelElementCategory element) {
		return true;
	}

}
