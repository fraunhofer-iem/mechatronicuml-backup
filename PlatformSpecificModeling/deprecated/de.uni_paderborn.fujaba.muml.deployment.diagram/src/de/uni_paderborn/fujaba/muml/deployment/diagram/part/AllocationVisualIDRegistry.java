package de.uni_paderborn.fujaba.muml.deployment.diagram.part;

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
public class AllocationVisualIDRegistry {

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
		return de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
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
				de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationDiagramEditorPlugin
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
		if (de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage.eINSTANCE
				.getDeployment().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((de.uni_paderborn.fujaba.muml.psm.deployment.Deployment) domainElement)) {
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
		String containerModelID = de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
				.getModelID(containerView);
		if (!de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage.eINSTANCE
					.getHardwareNode().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage.eINSTANCE
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
		String containerModelID = de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
				.getModelID(containerView);
		if (!de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
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
		if (de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage.eINSTANCE
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
			de.uni_paderborn.fujaba.muml.psm.deployment.Deployment element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
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
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.VISUAL_ID:
			return false;
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart.VISUAL_ID:
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
			return de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
