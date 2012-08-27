package de.uni_paderborn.fujaba.muml.deployment.diagram.part;

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
public class MumlVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "de.uni_paderborn.fujaba.muml.deployment.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.MODEL_ID
					.equals(view.getType())) {
				return de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlVisualIDRegistry
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
				de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlDiagramEditorPlugin
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
		if (de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage.eINSTANCE
				.getDeployment().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((de.uni_paderborn.fujaba.muml.model.deployment.Deployment) domainElement)) {
			return de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.VISUAL_ID;
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
		String containerModelID = de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlVisualIDRegistry
				.getModelID(containerView);
		if (!de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage.eINSTANCE
					.getHardwareNode().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage.eINSTANCE
					.getHardwarePort().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlVisualIDRegistry
				.getModelID(containerView);
		if (!de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage.eINSTANCE
				.getCommunicationLink().isSuperTypeOf(domainElement.eClass())) {
			return de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID;
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
			de.uni_paderborn.fujaba.muml.model.deployment.Deployment element) {
		return true;
	}

}
