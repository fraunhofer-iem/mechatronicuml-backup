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
			return getSensorInstance_2007SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_2008SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_2009SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceStructuredResourceCompartmentEditPart.VISUAL_ID:
			return getStructuredResourceInstanceStructuredResourceCompartment_7003SemanticChildren(view);
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
		de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstanceRepository modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstanceRepository) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getResourceInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance) it
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
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor> getSensorInstance_2007SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.SensorInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.SensorInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwports().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort childElement = (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.HWPortEditPart.VISUAL_ID) {
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
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor> getActuatorInstance_2008SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ActuatorInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ActuatorInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwports().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort childElement = (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.HWPortEditPart.VISUAL_ID) {
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
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor> getStructuredResourceInstance_2009SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwports().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort childElement = (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.HWPortEditPart.VISUAL_ID) {
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
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor> getStructuredResourceInstanceStructuredResourceCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmbeddedAtomicResourceInstances()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.AtomicResourceInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.AtomicResourceInstance) it
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
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID) {
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
			return getSensorInstance_2007ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_2008ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_2009ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.HWPortEditPart.VISUAL_ID:
			return getHWPort_3017ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
			return getCacheInstance_3018ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstance_3019ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
			return getProcessorInstance_3020ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return getProcessingMemoryInstance_3021ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
			return getStorageMemoryInstance_3022ContainedLinks(view);
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
			return getSensorInstance_2007IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_2008IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_2009IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.HWPortEditPart.VISUAL_ID:
			return getHWPort_3017IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
			return getCacheInstance_3018IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstance_3019IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
			return getProcessorInstance_3020IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return getProcessingMemoryInstance_3021IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
			return getStorageMemoryInstance_3022IncomingLinks(view);
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
			return getSensorInstance_2007OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_2008OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_2009OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.HWPortEditPart.VISUAL_ID:
			return getHWPort_3017OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
			return getCacheInstance_3018OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstance_3019OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
			return getProcessorInstance_3020OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return getProcessingMemoryInstance_3021OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
			return getStorageMemoryInstance_3022OutgoingLinks(view);
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
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getSensorInstance_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getActuatorInstance_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getStructuredResourceInstance_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getHWPort_3017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getCacheInstance_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getProgrammableLogicDeviceInstance_3019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getProcessorInstance_3020ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessorInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessorInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ProcessorInstance_OwnedCacheInstance_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getProcessingMemoryInstance_3021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getStorageMemoryInstance_3022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getSensorInstance_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getActuatorInstance_2008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getStructuredResourceInstance_2009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getHWPort_3017IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getCacheInstance_3018IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.CacheInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.CacheInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ProcessorInstance_OwnedCacheInstance_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getProgrammableLogicDeviceInstance_3019IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getProcessorInstance_3020IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getProcessingMemoryInstance_3021IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getStorageMemoryInstance_3022IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getSensorInstance_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getActuatorInstance_2008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getStructuredResourceInstance_2009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getHWPort_3017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getCacheInstance_3018OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getProgrammableLogicDeviceInstance_3019OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getProcessorInstance_3020OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessorInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessorInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ProcessorInstance_OwnedCacheInstance_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getProcessingMemoryInstance_3021OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getStorageMemoryInstance_3022OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getIncomingFeatureModelFacetLinks_ProcessorInstance_OwnedCacheInstance_4003(
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.CacheInstance target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
					.getProcessorInstance_OwnedCacheInstance()) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor(
						setting.getEObject(),
						target,
						de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProcessorInstanceOwnedCacheInstance_4003,
						de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceOwnedCacheInstanceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> getOutgoingFeatureModelFacetLinks_ProcessorInstance_OwnedCacheInstance_4003(
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessorInstance source) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor>();
		de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.CacheInstance destination = source
				.getOwnedCacheInstance();
		if (destination == null) {
			return result;
		}
		result.add(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareLinkDescriptor(
				source,
				destination,
				de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProcessorInstanceOwnedCacheInstance_4003,
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
