package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part;

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

/**
 * @generated
 */
public class HardwareDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ResourceInstanceRepositoryEditPart.VISUAL_ID:
			return getResourceInstanceRepository_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_2001SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_2002SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_2003SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceStructuredResourceCompartmentEditPart.VISUAL_ID:
			return getStructuredResourceInstanceStructuredResourceCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor> getResourceInstanceRepository_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstanceRepository modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstanceRepository) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getResourceInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor> getSensorInstance_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.platform.SensorInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.SensorInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwportInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor> getActuatorInstance_2002SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.platform.ActuatorInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.ActuatorInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwportInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor> getStructuredResourceInstance_2003SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwportInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor> getStructuredResourceInstanceStructuredResourceCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmbeddedAtomicResourceInstances()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.AtomicResourceInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.platform.AtomicResourceInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ResourceInstanceRepositoryEditPart.VISUAL_ID:
			return getResourceInstanceRepository_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_2001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_2002ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_2003ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID:
			return getBusPortInstance_3001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID:
			return getLinkPortInstance_3002ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
			return getCacheInstance_3003ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstance_3004ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
			return getProcessorInstance_3005ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
			return getStorageMemoryInstance_3006ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return getProcessingMemoryInstance_3007ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_2001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_2002IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_2003IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID:
			return getBusPortInstance_3001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID:
			return getLinkPortInstance_3002IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
			return getCacheInstance_3003IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstance_3004IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
			return getProcessorInstance_3005IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
			return getStorageMemoryInstance_3006IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return getProcessingMemoryInstance_3007IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_2001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_2002OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_2003OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID:
			return getBusPortInstance_3001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID:
			return getLinkPortInstance_3002OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
			return getCacheInstance_3003OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstance_3004OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
			return getProcessorInstance_3005OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
			return getStorageMemoryInstance_3006OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return getProcessingMemoryInstance_3007OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getResourceInstanceRepository_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getSensorInstance_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getActuatorInstance_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getStructuredResourceInstance_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getBusPortInstance_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getLinkPortInstance_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getCacheInstance_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getProgrammableLogicDeviceInstance_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getProcessorInstance_3005ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.ProcessorInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.ProcessorInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ProcessorInstance_OwnedCacheInstance_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getStorageMemoryInstance_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getProcessingMemoryInstance_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getSensorInstance_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getActuatorInstance_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getStructuredResourceInstance_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getBusPortInstance_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getLinkPortInstance_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getCacheInstance_3003IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.CacheInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.CacheInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ProcessorInstance_OwnedCacheInstance_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getProgrammableLogicDeviceInstance_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getProcessorInstance_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getStorageMemoryInstance_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getProcessingMemoryInstance_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getSensorInstance_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getActuatorInstance_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getStructuredResourceInstance_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getBusPortInstance_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getLinkPortInstance_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getCacheInstance_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getProgrammableLogicDeviceInstance_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getProcessorInstance_3005OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.ProcessorInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.ProcessorInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ProcessorInstance_OwnedCacheInstance_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getStorageMemoryInstance_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getProcessingMemoryInstance_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getIncomingFeatureModelFacetLinks_ProcessorInstance_OwnedCacheInstance_4001(
			de.uni_paderborn.fujaba.muml.hardware.platform.CacheInstance target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
					.getProcessorInstance_OwnedCacheInstance()) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor(
						setting.getEObject(),
						target,
						de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProcessorInstanceOwnedCacheInstance_4001,
						de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceOwnedCacheInstanceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getOutgoingFeatureModelFacetLinks_ProcessorInstance_OwnedCacheInstance_4001(
			de.uni_paderborn.fujaba.muml.hardware.platform.ProcessorInstance source) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor>();
		de.uni_paderborn.fujaba.muml.hardware.platform.CacheInstance destination = source
				.getOwnedCacheInstance();
		if (destination == null) {
			return result;
		}
		result.add(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor(
				source,
				destination,
				de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProcessorInstanceOwnedCacheInstance_4001,
				de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceOwnedCacheInstanceEditPart.VISUAL_ID));
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
		public List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor> getSemanticChildren(
				View view) {
			return HardwareDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getContainedLinks(
				View view) {
			return HardwareDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getIncomingLinks(
				View view) {
			return HardwareDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getOutgoingLinks(
				View view) {
			return HardwareDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
