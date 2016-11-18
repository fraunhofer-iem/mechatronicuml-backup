package org.muml.pm.hardware.resource.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwresource.ResourceRepository;
import org.muml.pm.hardware.resource.diagram.edit.parts.BusProtocolEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.BusProtocolNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CacheEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CacheNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationResource2EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationResourceNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.DeviceEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.DeviceNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.HWPortLabelEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.LinkProtocolEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.LinkProtocolNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.MemoryResourceEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.MemoryResourceNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.ProcessorEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.ProcessorNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.ResourceRepositoryEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.StructuredResourceEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.StructuredResourceNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.StructuredResourceStructuredResourceCompartmentEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel10EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel11EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel12EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel13EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel14EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel15EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel16EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel17EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel18EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel19EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel20EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel3EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel4EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel5EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel6EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel7EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel8EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel9EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabelEditPart;

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
	private static final String DEBUG_KEY = "org.muml.pm.hardware.resource.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ResourceRepositoryEditPart.MODEL_ID.equals(view.getType())) {
				return ResourceRepositoryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry.getVisualID(view.getType());
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
				HardwareDiagramEditorPlugin.getInstance()
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
		if (HwresourcePackage.eINSTANCE.getResourceRepository().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ResourceRepository) domainElement)) {
			return ResourceRepositoryEditPart.VISUAL_ID;
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
		String containerModelID = org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry
				.getModelID(containerView);
		if (!ResourceRepositoryEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ResourceRepositoryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ResourceRepositoryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ResourceRepositoryEditPart.VISUAL_ID:
			if (HwresourcePackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
				return DeviceEditPart.VISUAL_ID;
			}
			if (HwresourcePackage.eINSTANCE.getStructuredResource().isSuperTypeOf(domainElement.eClass())) {
				return StructuredResourceEditPart.VISUAL_ID;
			}
			if (HwresourcePackage.eINSTANCE.getCommunicationProtocolRepository()
					.isSuperTypeOf(domainElement.eClass())) {
				return CommunicationProtocolRepositoryEditPart.VISUAL_ID;
			}
			break;
		case DeviceEditPart.VISUAL_ID:
			if (HwresourcePackage.eINSTANCE.getCommunicationResource().isSuperTypeOf(domainElement.eClass())) {
				return CommunicationResourceEditPart.VISUAL_ID;
			}
			break;
		case StructuredResourceStructuredResourceCompartmentEditPart.VISUAL_ID:
			if (HwresourcePackage.eINSTANCE.getCommunicationResource().isSuperTypeOf(domainElement.eClass())) {
				return CommunicationResource2EditPart.VISUAL_ID;
			}
			if (HwresourcePackage.eINSTANCE.getCache().isSuperTypeOf(domainElement.eClass())) {
				return CacheEditPart.VISUAL_ID;
			}
			if (HwresourcePackage.eINSTANCE.getProcessor().isSuperTypeOf(domainElement.eClass())) {
				return ProcessorEditPart.VISUAL_ID;
			}
			if (HwresourcePackage.eINSTANCE.getProgrammableLogicDevice().isSuperTypeOf(domainElement.eClass())) {
				return ProgrammableLogicDeviceEditPart.VISUAL_ID;
			}
			if (HwresourcePackage.eINSTANCE.getMemoryResource().isSuperTypeOf(domainElement.eClass())) {
				return MemoryResourceEditPart.VISUAL_ID;
			}
			break;
		case CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart.VISUAL_ID:
			if (HwresourcePackage.eINSTANCE.getBusProtocol().isSuperTypeOf(domainElement.eClass())) {
				return BusProtocolEditPart.VISUAL_ID;
			}
			if (HwresourcePackage.eINSTANCE.getLinkProtocol().isSuperTypeOf(domainElement.eClass())) {
				return LinkProtocolEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry
				.getModelID(containerView);
		if (!ResourceRepositoryEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ResourceRepositoryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ResourceRepositoryEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ResourceRepositoryEditPart.VISUAL_ID:
			if (DeviceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StructuredResourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommunicationProtocolRepositoryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeviceEditPart.VISUAL_ID:
			if (DeviceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommunicationResourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredResourceEditPart.VISUAL_ID:
			if (StructuredResourceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StructuredResourceStructuredResourceCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommunicationProtocolRepositoryEditPart.VISUAL_ID:
			if (CommunicationProtocolRepositoryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommunicationResourceEditPart.VISUAL_ID:
			if (HWPortLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommunicationResource2EditPart.VISUAL_ID:
			if (CommunicationResourceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CacheEditPart.VISUAL_ID:
			if (CacheNameEditPart.VISUAL_ID == nodeVisualID) {
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
			break;
		case ProcessorEditPart.VISUAL_ID:
			if (WrappingLabel11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProcessorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProgrammableLogicDeviceEditPart.VISUAL_ID:
			if (ProgrammableLogicDeviceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MemoryResourceEditPart.VISUAL_ID:
			if (MemoryResourceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel17EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel18EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel19EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel20EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BusProtocolEditPart.VISUAL_ID:
			if (BusProtocolNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LinkProtocolEditPart.VISUAL_ID:
			if (LinkProtocolNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredResourceStructuredResourceCompartmentEditPart.VISUAL_ID:
			if (CommunicationResource2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CacheEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProcessorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProgrammableLogicDeviceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MemoryResourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart.VISUAL_ID:
			if (BusProtocolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LinkProtocolEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(ResourceRepository element) {
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
		case StructuredResourceStructuredResourceCompartmentEditPart.VISUAL_ID:
		case CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart.VISUAL_ID:
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
		case ResourceRepositoryEditPart.VISUAL_ID:
			return false;
		case CommunicationResourceEditPart.VISUAL_ID:
		case CommunicationResource2EditPart.VISUAL_ID:
		case CacheEditPart.VISUAL_ID:
		case ProcessorEditPart.VISUAL_ID:
		case ProgrammableLogicDeviceEditPart.VISUAL_ID:
		case MemoryResourceEditPart.VISUAL_ID:
		case BusProtocolEditPart.VISUAL_ID:
		case LinkProtocolEditPart.VISUAL_ID:
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
			return org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
