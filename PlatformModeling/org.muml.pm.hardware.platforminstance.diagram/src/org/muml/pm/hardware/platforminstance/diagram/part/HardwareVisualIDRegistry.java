package org.muml.pm.hardware.platforminstance.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceNameEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfiguration2EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartmentEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartment2EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartmentEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceName2EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceNameEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortLabel2EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortLabelEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkBridgeInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkConnectorInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.SensorInstanceNameEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceNameEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel10EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel11EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel12EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel13EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel3EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel4EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel5EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel6EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel7EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel8EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel9EditPart;

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
	private static final String DEBUG_KEY = "org.muml.pm.hardware.platforminstance.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (HWPlatformInstanceConfigurationEditPart.MODEL_ID.equals(view.getType())) {
				return HWPlatformInstanceConfigurationEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry.getVisualID(view.getType());
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
				PlatformInstanceDiagramEditorPlugin.getInstance()
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
		if (HwplatforminstancePackage.eINSTANCE.getHWPlatformInstanceConfiguration()
				.isSuperTypeOf(domainElement.eClass()) && isDiagram((HWPlatformInstanceConfiguration) domainElement)) {
			return HWPlatformInstanceConfigurationEditPart.VISUAL_ID;
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
		String containerModelID = org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getModelID(containerView);
		if (!HWPlatformInstanceConfigurationEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (HWPlatformInstanceConfigurationEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = HWPlatformInstanceConfigurationEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case HWPlatformInstanceConfigurationEditPart.VISUAL_ID:
			if (HwplatforminstancePackage.eINSTANCE.getHWPlatformInstance().isSuperTypeOf(domainElement.eClass())) {
				return HWPlatformInstanceEditPart.VISUAL_ID;
			}
			break;
		case HWPlatformInstanceEditPart.VISUAL_ID:
			if (HwplatforminstancePackage.eINSTANCE.getDelegationHWPortInstance()
					.isSuperTypeOf(domainElement.eClass())) {
				return DelegationHWPortInstanceEditPart.VISUAL_ID;
			}
			break;
		case HWPlatformInstance2EditPart.VISUAL_ID:
			if (HwplatforminstancePackage.eINSTANCE.getDelegationHWPortInstance()
					.isSuperTypeOf(domainElement.eClass())) {
				return DelegationHWPortInstanceEditPart.VISUAL_ID;
			}
			break;
		case StructuredResourceInstanceEditPart.VISUAL_ID:
			if (HwplatforminstancePackage.eINSTANCE.getHWPortInstance().isSuperTypeOf(domainElement.eClass())) {
				return HWPortInstanceEditPart.VISUAL_ID;
			}
			break;
		case ActuatorInstanceEditPart.VISUAL_ID:
			if (HwplatforminstancePackage.eINSTANCE.getHWPortInstance().isSuperTypeOf(domainElement.eClass())) {
				return HWPortInstanceEditPart.VISUAL_ID;
			}
			break;
		case SensorInstanceEditPart.VISUAL_ID:
			if (HwplatforminstancePackage.eINSTANCE.getHWPortInstance().isSuperTypeOf(domainElement.eClass())) {
				return HWPortInstanceEditPart.VISUAL_ID;
			}
			break;
		case HWPlatformInstanceHWPlatformCompartmentEditPart.VISUAL_ID:
			if (HwplatforminstancePackage.eINSTANCE.getHWPlatformInstanceConfiguration()
					.isSuperTypeOf(domainElement.eClass())) {
				return HWPlatformInstanceConfiguration2EditPart.VISUAL_ID;
			}
			break;
		case HWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID:
			if (HwplatforminstancePackage.eINSTANCE.getHWPlatformInstance().isSuperTypeOf(domainElement.eClass())) {
				return HWPlatformInstance2EditPart.VISUAL_ID;
			}
			if (HwresourceinstancePackage.eINSTANCE.getStructuredResourceInstance()
					.isSuperTypeOf(domainElement.eClass())) {
				return StructuredResourceInstanceEditPart.VISUAL_ID;
			}
			if (HwresourceinstancePackage.eINSTANCE.getActuatorInstance().isSuperTypeOf(domainElement.eClass())) {
				return ActuatorInstanceEditPart.VISUAL_ID;
			}
			if (HwresourceinstancePackage.eINSTANCE.getSensorInstance().isSuperTypeOf(domainElement.eClass())) {
				return SensorInstanceEditPart.VISUAL_ID;
			}
			if (HwplatforminstancePackage.eINSTANCE.getBusInstance().isSuperTypeOf(domainElement.eClass())) {
				return BusInstanceEditPart.VISUAL_ID;
			}
			if (HwplatforminstancePackage.eINSTANCE.getNetworkBridgeInstance().isSuperTypeOf(domainElement.eClass())) {
				return NetworkBridgeInstanceEditPart.VISUAL_ID;
			}
			break;
		case HWPlatformInstanceHWPlatformCompartment2EditPart.VISUAL_ID:
			if (HwplatforminstancePackage.eINSTANCE.getHWPlatformInstanceConfiguration()
					.isSuperTypeOf(domainElement.eClass())) {
				return HWPlatformInstanceConfiguration2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getModelID(containerView);
		if (!HWPlatformInstanceConfigurationEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (HWPlatformInstanceConfigurationEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = HWPlatformInstanceConfigurationEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case HWPlatformInstanceConfigurationEditPart.VISUAL_ID:
			if (HWPlatformInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HWPlatformInstanceEditPart.VISUAL_ID:
			if (HWPlatformInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HWPlatformInstanceHWPlatformCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DelegationHWPortInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HWPlatformInstanceConfiguration2EditPart.VISUAL_ID:
			if (HWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HWPlatformInstance2EditPart.VISUAL_ID:
			if (HWPlatformInstanceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HWPlatformInstanceHWPlatformCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DelegationHWPortInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DelegationHWPortInstanceEditPart.VISUAL_ID:
			if (HWPortLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredResourceInstanceEditPart.VISUAL_ID:
			if (StructuredResourceInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HWPortInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HWPortInstanceEditPart.VISUAL_ID:
			if (HWPortLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActuatorInstanceEditPart.VISUAL_ID:
			if (ActuatorInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HWPortInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SensorInstanceEditPart.VISUAL_ID:
			if (SensorInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HWPortInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BusInstanceEditPart.VISUAL_ID:
			if (WrappingLabel11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NetworkBridgeInstanceEditPart.VISUAL_ID:
			if (WrappingLabel13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HWPlatformInstanceHWPlatformCompartmentEditPart.VISUAL_ID:
			if (HWPlatformInstanceConfiguration2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID:
			if (HWPlatformInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StructuredResourceInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActuatorInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BusInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NetworkBridgeInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HWPlatformInstanceHWPlatformCompartment2EditPart.VISUAL_ID:
			if (HWPlatformInstanceConfiguration2EditPart.VISUAL_ID == nodeVisualID) {
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
		if (HwplatforminstancePackage.eINSTANCE.getNetworkConnectorInstance().isSuperTypeOf(domainElement.eClass())) {
			return NetworkConnectorInstanceEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(HWPlatformInstanceConfiguration element) {
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
		case HWPlatformInstanceHWPlatformCompartmentEditPart.VISUAL_ID:
		case HWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID:
		case HWPlatformInstanceHWPlatformCompartment2EditPart.VISUAL_ID:
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
		case HWPlatformInstanceConfigurationEditPart.VISUAL_ID:
			return false;
		case DelegationHWPortInstanceEditPart.VISUAL_ID:
		case HWPortInstanceEditPart.VISUAL_ID:
		case BusInstanceEditPart.VISUAL_ID:
		case NetworkBridgeInstanceEditPart.VISUAL_ID:
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
			return org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
