package org.muml.pm.hardware.resourceinstance.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.muml.pm.hardware.hwresourceinstance.ActuatorInstance;
import org.muml.pm.hardware.hwresourceinstance.AtomicResourceInstance;
import org.muml.pm.hardware.hwresourceinstance.CacheInstance;
import org.muml.pm.hardware.hwresourceinstance.HWPort;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.hwresourceinstance.ProcessorInstance;
import org.muml.pm.hardware.hwresourceinstance.ResourceInstance;
import org.muml.pm.hardware.hwresourceinstance.ResourceInstanceRepository;
import org.muml.pm.hardware.hwresourceinstance.SensorInstance;
import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.CacheInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.HWPortEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceOwnedCacheInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ResourceInstanceRepositoryEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.SensorInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceStructuredResourceCompartmentEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes;

/**
 * @generated
 */
public class HardwareDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getSemanticChildren(View view) {
		switch (HardwareVisualIDRegistry.getVisualID(view)) {
		case ResourceInstanceRepositoryEditPart.VISUAL_ID:
			return getResourceInstanceRepository_1000SemanticChildren(view);
		case SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_2007SemanticChildren(view);
		case ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_2008SemanticChildren(view);
		case StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_2009SemanticChildren(view);
		case StructuredResourceInstanceStructuredResourceCompartmentEditPart.VISUAL_ID:
			return getStructuredResourceInstanceStructuredResourceCompartment_7003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getResourceInstanceRepository_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ResourceInstanceRepository modelElement = (ResourceInstanceRepository) view.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getResourceInstances().iterator(); it.hasNext();) {
			ResourceInstance childElement = (ResourceInstance) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SensorInstanceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActuatorInstanceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StructuredResourceInstanceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getSensorInstance_2007SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SensorInstance modelElement = (SensorInstance) view.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwports().iterator(); it.hasNext();) {
			HWPort childElement = (HWPort) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HWPortEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getActuatorInstance_2008SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ActuatorInstance modelElement = (ActuatorInstance) view.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwports().iterator(); it.hasNext();) {
			HWPort childElement = (HWPort) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HWPortEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getStructuredResourceInstance_2009SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		StructuredResourceInstance modelElement = (StructuredResourceInstance) view.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwports().iterator(); it.hasNext();) {
			HWPort childElement = (HWPort) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HWPortEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getStructuredResourceInstanceStructuredResourceCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StructuredResourceInstance modelElement = (StructuredResourceInstance) containerView.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmbeddedAtomicResourceInstances().iterator(); it.hasNext();) {
			AtomicResourceInstance childElement = (AtomicResourceInstance) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CacheInstanceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ProcessorInstanceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ProcessingMemoryInstanceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StorageMemoryInstanceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getContainedLinks(View view) {
		switch (HardwareVisualIDRegistry.getVisualID(view)) {
		case ResourceInstanceRepositoryEditPart.VISUAL_ID:
			return getResourceInstanceRepository_1000ContainedLinks(view);
		case SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_2007ContainedLinks(view);
		case ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_2008ContainedLinks(view);
		case StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_2009ContainedLinks(view);
		case HWPortEditPart.VISUAL_ID:
			return getHWPort_3017ContainedLinks(view);
		case CacheInstanceEditPart.VISUAL_ID:
			return getCacheInstance_3018ContainedLinks(view);
		case ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstance_3019ContainedLinks(view);
		case ProcessorInstanceEditPart.VISUAL_ID:
			return getProcessorInstance_3020ContainedLinks(view);
		case ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return getProcessingMemoryInstance_3021ContainedLinks(view);
		case StorageMemoryInstanceEditPart.VISUAL_ID:
			return getStorageMemoryInstance_3022ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getIncomingLinks(View view) {
		switch (HardwareVisualIDRegistry.getVisualID(view)) {
		case SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_2007IncomingLinks(view);
		case ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_2008IncomingLinks(view);
		case StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_2009IncomingLinks(view);
		case HWPortEditPart.VISUAL_ID:
			return getHWPort_3017IncomingLinks(view);
		case CacheInstanceEditPart.VISUAL_ID:
			return getCacheInstance_3018IncomingLinks(view);
		case ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstance_3019IncomingLinks(view);
		case ProcessorInstanceEditPart.VISUAL_ID:
			return getProcessorInstance_3020IncomingLinks(view);
		case ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return getProcessingMemoryInstance_3021IncomingLinks(view);
		case StorageMemoryInstanceEditPart.VISUAL_ID:
			return getStorageMemoryInstance_3022IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getOutgoingLinks(View view) {
		switch (HardwareVisualIDRegistry.getVisualID(view)) {
		case SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_2007OutgoingLinks(view);
		case ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_2008OutgoingLinks(view);
		case StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_2009OutgoingLinks(view);
		case HWPortEditPart.VISUAL_ID:
			return getHWPort_3017OutgoingLinks(view);
		case CacheInstanceEditPart.VISUAL_ID:
			return getCacheInstance_3018OutgoingLinks(view);
		case ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstance_3019OutgoingLinks(view);
		case ProcessorInstanceEditPart.VISUAL_ID:
			return getProcessorInstance_3020OutgoingLinks(view);
		case ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return getProcessingMemoryInstance_3021OutgoingLinks(view);
		case StorageMemoryInstanceEditPart.VISUAL_ID:
			return getStorageMemoryInstance_3022OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getResourceInstanceRepository_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getSensorInstance_2007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getActuatorInstance_2008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getStructuredResourceInstance_2009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPort_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getCacheInstance_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getProgrammableLogicDeviceInstance_3019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getProcessorInstance_3020ContainedLinks(View view) {
		ProcessorInstance modelElement = (ProcessorInstance) view.getElement();
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ProcessorInstance_OwnedCacheInstance_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getProcessingMemoryInstance_3021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getStorageMemoryInstance_3022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getSensorInstance_2007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getActuatorInstance_2008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getStructuredResourceInstance_2009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPort_3017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getCacheInstance_3018IncomingLinks(View view) {
		CacheInstance modelElement = (CacheInstance) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ProcessorInstance_OwnedCacheInstance_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getProgrammableLogicDeviceInstance_3019IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getProcessorInstance_3020IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getProcessingMemoryInstance_3021IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getStorageMemoryInstance_3022IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getSensorInstance_2007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getActuatorInstance_2008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getStructuredResourceInstance_2009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPort_3017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getCacheInstance_3018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getProgrammableLogicDeviceInstance_3019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getProcessorInstance_3020OutgoingLinks(View view) {
		ProcessorInstance modelElement = (ProcessorInstance) view.getElement();
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ProcessorInstance_OwnedCacheInstance_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getProcessingMemoryInstance_3021OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getStorageMemoryInstance_3022OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<HardwareLinkDescriptor> getIncomingFeatureModelFacetLinks_ProcessorInstance_OwnedCacheInstance_4003(
			CacheInstance target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == HwresourceinstancePackage.eINSTANCE
					.getProcessorInstance_OwnedCacheInstance()) {
				result.add(new HardwareLinkDescriptor(setting.getEObject(), target,
						HardwareElementTypes.ProcessorInstanceOwnedCacheInstance_4003,
						ProcessorInstanceOwnedCacheInstanceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<HardwareLinkDescriptor> getOutgoingFeatureModelFacetLinks_ProcessorInstance_OwnedCacheInstance_4003(
			ProcessorInstance source) {
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		CacheInstance destination = source.getOwnedCacheInstance();
		if (destination == null) {
			return result;
		}
		result.add(new HardwareLinkDescriptor(source, destination,
				HardwareElementTypes.ProcessorInstanceOwnedCacheInstance_4003,
				ProcessorInstanceOwnedCacheInstanceEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<HardwareNodeDescriptor> getSemanticChildren(View view) {
			return HardwareDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<HardwareLinkDescriptor> getContainedLinks(View view) {
			return HardwareDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<HardwareLinkDescriptor> getIncomingLinks(View view) {
			return HardwareDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<HardwareLinkDescriptor> getOutgoingLinks(View view) {
			return HardwareDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
