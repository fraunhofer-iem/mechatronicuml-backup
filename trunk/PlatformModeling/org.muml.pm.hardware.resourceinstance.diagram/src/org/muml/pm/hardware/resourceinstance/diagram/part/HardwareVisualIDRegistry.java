package org.muml.pm.hardware.resourceinstance.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.hwresourceinstance.ResourceInstanceRepository;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceNameEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.CacheInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.CacheInstanceNameEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.HWPortEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.HWPortLabelEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceNameEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceNameEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceNameEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ResourceInstanceRepositoryEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.SensorInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.SensorInstanceNameEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceNameEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceNameEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceStructuredResourceCompartmentEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel10EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel11EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel12EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel13EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel14EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel15EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel16EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel17EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel18EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel19EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel20EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel21EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel22EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel23EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel24EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel3EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel4EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel5EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel6EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel7EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel8EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel9EditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabelEditPart;

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
	private static final String DEBUG_KEY = "org.muml.pm.hardware.resourceinstance.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ResourceInstanceRepositoryEditPart.MODEL_ID.equals(view.getType())) {
				return ResourceInstanceRepositoryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry.getVisualID(view.getType());
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
				ResourceInstanceDiagramEditorPlugin.getInstance()
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
		if (HwresourceinstancePackage.eINSTANCE.getResourceInstanceRepository().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ResourceInstanceRepository) domainElement)) {
			return ResourceInstanceRepositoryEditPart.VISUAL_ID;
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
		String containerModelID = org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
				.getModelID(containerView);
		if (!ResourceInstanceRepositoryEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ResourceInstanceRepositoryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ResourceInstanceRepositoryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ResourceInstanceRepositoryEditPart.VISUAL_ID:
			if (HwresourceinstancePackage.eINSTANCE.getSensorInstance().isSuperTypeOf(domainElement.eClass())) {
				return SensorInstanceEditPart.VISUAL_ID;
			}
			if (HwresourceinstancePackage.eINSTANCE.getActuatorInstance().isSuperTypeOf(domainElement.eClass())) {
				return ActuatorInstanceEditPart.VISUAL_ID;
			}
			if (HwresourceinstancePackage.eINSTANCE.getStructuredResourceInstance()
					.isSuperTypeOf(domainElement.eClass())) {
				return StructuredResourceInstanceEditPart.VISUAL_ID;
			}
			break;
		case SensorInstanceEditPart.VISUAL_ID:
			if (HwresourceinstancePackage.eINSTANCE.getHWPort().isSuperTypeOf(domainElement.eClass())) {
				return HWPortEditPart.VISUAL_ID;
			}
			break;
		case ActuatorInstanceEditPart.VISUAL_ID:
			if (HwresourceinstancePackage.eINSTANCE.getHWPort().isSuperTypeOf(domainElement.eClass())) {
				return HWPortEditPart.VISUAL_ID;
			}
			break;
		case StructuredResourceInstanceEditPart.VISUAL_ID:
			if (HwresourceinstancePackage.eINSTANCE.getHWPort().isSuperTypeOf(domainElement.eClass())) {
				return HWPortEditPart.VISUAL_ID;
			}
			break;
		case StructuredResourceInstanceStructuredResourceCompartmentEditPart.VISUAL_ID:
			if (HwresourceinstancePackage.eINSTANCE.getCacheInstance().isSuperTypeOf(domainElement.eClass())) {
				return CacheInstanceEditPart.VISUAL_ID;
			}
			if (HwresourceinstancePackage.eINSTANCE.getProgrammableLogicDeviceInstance()
					.isSuperTypeOf(domainElement.eClass())) {
				return ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID;
			}
			if (HwresourceinstancePackage.eINSTANCE.getProcessorInstance().isSuperTypeOf(domainElement.eClass())) {
				return ProcessorInstanceEditPart.VISUAL_ID;
			}
			if (HwresourceinstancePackage.eINSTANCE.getProcessingMemoryInstance()
					.isSuperTypeOf(domainElement.eClass())) {
				return ProcessingMemoryInstanceEditPart.VISUAL_ID;
			}
			if (HwresourceinstancePackage.eINSTANCE.getStorageMemoryInstance().isSuperTypeOf(domainElement.eClass())) {
				return StorageMemoryInstanceEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
				.getModelID(containerView);
		if (!ResourceInstanceRepositoryEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ResourceInstanceRepositoryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ResourceInstanceRepositoryEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ResourceInstanceRepositoryEditPart.VISUAL_ID:
			if (SensorInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActuatorInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StructuredResourceInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SensorInstanceEditPart.VISUAL_ID:
			if (SensorInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HWPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActuatorInstanceEditPart.VISUAL_ID:
			if (ActuatorInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HWPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredResourceInstanceEditPart.VISUAL_ID:
			if (StructuredResourceInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StructuredResourceInstanceStructuredResourceCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HWPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HWPortEditPart.VISUAL_ID:
			if (HWPortLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CacheInstanceEditPart.VISUAL_ID:
			if (CacheInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
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
			break;
		case ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			if (ProgrammableLogicDeviceInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProcessorInstanceEditPart.VISUAL_ID:
			if (ProcessorInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProcessingMemoryInstanceEditPart.VISUAL_ID:
			if (ProcessingMemoryInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
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
		case StorageMemoryInstanceEditPart.VISUAL_ID:
			if (StorageMemoryInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel21EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel22EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel23EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel24EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredResourceInstanceStructuredResourceCompartmentEditPart.VISUAL_ID:
			if (CacheInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProcessorInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProcessingMemoryInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StorageMemoryInstanceEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(ResourceInstanceRepository element) {
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
		case StructuredResourceInstanceStructuredResourceCompartmentEditPart.VISUAL_ID:
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
		case ResourceInstanceRepositoryEditPart.VISUAL_ID:
			return false;
		case HWPortEditPart.VISUAL_ID:
		case CacheInstanceEditPart.VISUAL_ID:
		case ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
		case ProcessorInstanceEditPart.VISUAL_ID:
		case ProcessingMemoryInstanceEditPart.VISUAL_ID:
		case StorageMemoryInstanceEditPart.VISUAL_ID:
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
			return org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
