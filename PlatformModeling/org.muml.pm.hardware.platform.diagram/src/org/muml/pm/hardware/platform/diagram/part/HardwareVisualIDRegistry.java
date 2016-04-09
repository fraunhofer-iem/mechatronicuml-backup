package org.muml.pm.hardware.platform.diagram.part;

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
public class HardwareVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.muml.pm.hardware.platform.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformEditPart.MODEL_ID
					.equals(view.getType())) {
				return org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry
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
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin.getInstance()
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
		if (org.muml.pm.hardware.hwplatform.HwplatformPackage.eINSTANCE.getHWPlatform()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((org.muml.pm.hardware.hwplatform.HWPlatform) domainElement)) {
			return org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformEditPart.VISUAL_ID;
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
		String containerModelID = org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry
				.getModelID(containerView);
		if (!org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformEditPart.VISUAL_ID:
			if (org.muml.pm.hardware.hwplatform.HwplatformPackage.eINSTANCE.getHWPlatform()
					.isSuperTypeOf(domainElement.eClass())) {
				return org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatform2EditPart.VISUAL_ID;
			}
			break;
		case org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatform2EditPart.VISUAL_ID:
			if (org.muml.pm.hardware.hwplatform.HwplatformPackage.eINSTANCE.getDelegationHWPort()
					.isSuperTypeOf(domainElement.eClass())) {
				return org.muml.pm.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart.VISUAL_ID;
			}
			break;
		case org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID:
			if (org.muml.pm.hardware.hwplatform.HwplatformPackage.eINSTANCE.getHWPortPart()
					.isSuperTypeOf(domainElement.eClass())) {
				return org.muml.pm.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID;
			}
			break;
		case org.muml.pm.hardware.platform.diagram.edit.parts.ResourcePartEditPart.VISUAL_ID:
			if (org.muml.pm.hardware.hwplatform.HwplatformPackage.eINSTANCE.getHWPortPart()
					.isSuperTypeOf(domainElement.eClass())) {
				return org.muml.pm.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID;
			}
			break;
		case org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformHWPlatformCompartmentEditPart.VISUAL_ID:
			if (org.muml.pm.hardware.hwplatform.HwplatformPackage.eINSTANCE.getBus()
					.isSuperTypeOf(domainElement.eClass())) {
				return org.muml.pm.hardware.platform.diagram.edit.parts.BusEditPart.VISUAL_ID;
			}
			if (org.muml.pm.hardware.hwplatform.HwplatformPackage.eINSTANCE.getNetworkBridge()
					.isSuperTypeOf(domainElement.eClass())) {
				return org.muml.pm.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart.VISUAL_ID;
			}
			if (org.muml.pm.hardware.hwplatform.HwplatformPackage.eINSTANCE.getHWPlatformPart()
					.isSuperTypeOf(domainElement.eClass())) {
				return org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID;
			}
			if (org.muml.pm.hardware.hwplatform.HwplatformPackage.eINSTANCE.getResourcePart()
					.isSuperTypeOf(domainElement.eClass())) {
				return org.muml.pm.hardware.platform.diagram.edit.parts.ResourcePartEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry
				.getModelID(containerView);
		if (!org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformEditPart.VISUAL_ID:
			if (org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatform2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatform2EditPart.VISUAL_ID:
			if (org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformHWPlatformCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pm.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.pm.hardware.platform.diagram.edit.parts.BusEditPart.VISUAL_ID:
			if (org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.pm.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart.VISUAL_ID:
			if (org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID:
			if (org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformPartNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pm.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.pm.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID:
			if (org.muml.pm.hardware.platform.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.pm.hardware.platform.diagram.edit.parts.ResourcePartEditPart.VISUAL_ID:
			if (org.muml.pm.hardware.platform.diagram.edit.parts.ResourcePartNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pm.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformHWPlatformCompartmentEditPart.VISUAL_ID:
			if (org.muml.pm.hardware.platform.diagram.edit.parts.BusEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pm.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pm.hardware.platform.diagram.edit.parts.ResourcePartEditPart.VISUAL_ID == nodeVisualID) {
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
		if (org.muml.pm.hardware.hwplatform.HwplatformPackage.eINSTANCE.getNetworkConnector()
				.isSuperTypeOf(domainElement.eClass())) {
			return org.muml.pm.hardware.platform.diagram.edit.parts.NetworkConnectorEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(org.muml.pm.hardware.hwplatform.HWPlatform element) {
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
		case org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformHWPlatformCompartmentEditPart.VISUAL_ID:
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
		case org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformEditPart.VISUAL_ID:
			return false;
		case org.muml.pm.hardware.platform.diagram.edit.parts.BusEditPart.VISUAL_ID:
		case org.muml.pm.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart.VISUAL_ID:
		case org.muml.pm.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID:
		case org.muml.pm.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart.VISUAL_ID:
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
			return org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
