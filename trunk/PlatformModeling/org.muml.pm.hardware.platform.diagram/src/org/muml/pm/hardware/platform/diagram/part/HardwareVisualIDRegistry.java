package org.muml.pm.hardware.platform.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.muml.pm.hardware.hwplatform.HWPlatform;
import org.muml.pm.hardware.hwplatform.HwplatformPackage;
import org.muml.pm.hardware.platform.diagram.edit.parts.BusEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatform2EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformHWPlatformCompartmentEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformPartNameEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPortLabelEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPortPartEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.NetworkConnectorEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.ResourcePartEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.ResourcePartNameEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel10EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel3EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel4EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel5EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel6EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel7EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel8EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel9EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabelEditPart;

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
			if (HWPlatformEditPart.MODEL_ID.equals(view.getType())) {
				return HWPlatformEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry.getVisualID(view.getType());
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
				PlatformDiagramEditorPlugin.getInstance()
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
		if (HwplatformPackage.eINSTANCE.getHWPlatform().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((HWPlatform) domainElement)) {
			return HWPlatformEditPart.VISUAL_ID;
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
		if (!HWPlatformEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (HWPlatformEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = HWPlatformEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case HWPlatformEditPart.VISUAL_ID:
			if (HwplatformPackage.eINSTANCE.getHWPlatform().isSuperTypeOf(domainElement.eClass())) {
				return HWPlatform2EditPart.VISUAL_ID;
			}
			break;
		case HWPlatform2EditPart.VISUAL_ID:
			if (HwplatformPackage.eINSTANCE.getDelegationHWPort().isSuperTypeOf(domainElement.eClass())) {
				return DelegationHWPortEditPart.VISUAL_ID;
			}
			break;
		case HWPlatformPartEditPart.VISUAL_ID:
			if (HwplatformPackage.eINSTANCE.getHWPortPart().isSuperTypeOf(domainElement.eClass())) {
				return HWPortPartEditPart.VISUAL_ID;
			}
			break;
		case ResourcePartEditPart.VISUAL_ID:
			if (HwplatformPackage.eINSTANCE.getHWPortPart().isSuperTypeOf(domainElement.eClass())) {
				return HWPortPartEditPart.VISUAL_ID;
			}
			break;
		case HWPlatformHWPlatformCompartmentEditPart.VISUAL_ID:
			if (HwplatformPackage.eINSTANCE.getBus().isSuperTypeOf(domainElement.eClass())) {
				return BusEditPart.VISUAL_ID;
			}
			if (HwplatformPackage.eINSTANCE.getNetworkBridge().isSuperTypeOf(domainElement.eClass())) {
				return NetworkBridgeEditPart.VISUAL_ID;
			}
			if (HwplatformPackage.eINSTANCE.getHWPlatformPart().isSuperTypeOf(domainElement.eClass())) {
				return HWPlatformPartEditPart.VISUAL_ID;
			}
			if (HwplatformPackage.eINSTANCE.getResourcePart().isSuperTypeOf(domainElement.eClass())) {
				return ResourcePartEditPart.VISUAL_ID;
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
		if (!HWPlatformEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (HWPlatformEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = HWPlatformEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case HWPlatformEditPart.VISUAL_ID:
			if (HWPlatform2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HWPlatform2EditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HWPlatformHWPlatformCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DelegationHWPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BusEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NetworkBridgeEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HWPlatformPartEditPart.VISUAL_ID:
			if (HWPlatformPartNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HWPortPartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HWPortPartEditPart.VISUAL_ID:
			if (HWPortLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ResourcePartEditPart.VISUAL_ID:
			if (ResourcePartNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HWPortPartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HWPlatformHWPlatformCompartmentEditPart.VISUAL_ID:
			if (BusEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NetworkBridgeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HWPlatformPartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResourcePartEditPart.VISUAL_ID == nodeVisualID) {
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
		if (HwplatformPackage.eINSTANCE.getNetworkConnector().isSuperTypeOf(domainElement.eClass())) {
			return NetworkConnectorEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(HWPlatform element) {
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
		case HWPlatformHWPlatformCompartmentEditPart.VISUAL_ID:
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
		case HWPlatformEditPart.VISUAL_ID:
			return false;
		case BusEditPart.VISUAL_ID:
		case NetworkBridgeEditPart.VISUAL_ID:
		case HWPortPartEditPart.VISUAL_ID:
		case DelegationHWPortEditPart.VISUAL_ID:
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
			return org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
