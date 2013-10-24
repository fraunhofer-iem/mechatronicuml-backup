package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part;

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
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart.VISUAL_ID:
			return getHWPlatformInstanceConfiguration_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID:
			return getHWPlatformInstance_2001SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_3001SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID:
			return getHWPlatformInstance_3011SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_3013SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_3014SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartmentEditPart.VISUAL_ID:
			return getHWPlatformInstanceHWPlatformCompartment_7001SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceStructuredResourceCompartmentEditPart.VISUAL_ID:
			return getStructuredResourceInstanceStructuredResourceCompartment_7002SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartment2EditPart.VISUAL_ID:
			return getHWPlatformInstanceHWPlatformCompartment_7003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getHWPlatformInstanceConfiguration_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstanceConfiguration modelElement = (de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstanceConfiguration) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwplatformInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getHWPlatformInstance_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDelegationPorts().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusPortInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getStructuredResourceInstance_3001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwportInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getHWPlatformInstance_3011SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDelegationPorts().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusPortInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getActuatorInstance_3013SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.platform.ActuatorInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.ActuatorInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwportInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getSensorInstance_3014SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.platform.SensorInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.SensorInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwportInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getHWPlatformInstanceHWPlatformCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getResourceInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCommunicationResources()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationResource childElement = (de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationResource) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHwplatformInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getStructuredResourceInstanceStructuredResourceCompartment_7002SemanticChildren(
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
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmbeddedAtomicResourceInstances()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.AtomicResourceInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.platform.AtomicResourceInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getHWPlatformInstanceHWPlatformCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getResourceInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCommunicationResources()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationResource childElement = (de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationResource) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHwplatformInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart.VISUAL_ID:
			return getHWPlatformInstanceConfiguration_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID:
			return getHWPlatformInstance_2001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_3001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
			return getCacheInstance_3002ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstance_3003ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
			return getProcessorInstance_3004ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
			return getStorageMemoryInstance_3005ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return getProcessingMemoryInstance_3006ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID:
			return getBusPortInstance_3007ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID:
			return getLinkPortInstance_3008ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusEditPart.VISUAL_ID:
			return getBus_3009ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeEditPart.VISUAL_ID:
			return getBridge_3010ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID:
			return getHWPlatformInstance_3011ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusPortInstance2EditPart.VISUAL_ID:
			return getBusPortInstance_3012ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_3013ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_3014ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getDelegation_4001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_4002ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.Link2EditPart.VISUAL_ID:
			return getLink_4005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID:
			return getHWPlatformInstance_2001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_3001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
			return getCacheInstance_3002IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstance_3003IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
			return getProcessorInstance_3004IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
			return getStorageMemoryInstance_3005IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return getProcessingMemoryInstance_3006IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID:
			return getBusPortInstance_3007IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID:
			return getLinkPortInstance_3008IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusEditPart.VISUAL_ID:
			return getBus_3009IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeEditPart.VISUAL_ID:
			return getBridge_3010IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID:
			return getHWPlatformInstance_3011IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusPortInstance2EditPart.VISUAL_ID:
			return getBusPortInstance_3012IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_3013IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_3014IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getDelegation_4001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_4002IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.Link2EditPart.VISUAL_ID:
			return getLink_4005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID:
			return getHWPlatformInstance_2001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_3001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
			return getCacheInstance_3002OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstance_3003OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
			return getProcessorInstance_3004OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
			return getStorageMemoryInstance_3005OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return getProcessingMemoryInstance_3006OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID:
			return getBusPortInstance_3007OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID:
			return getLinkPortInstance_3008OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusEditPart.VISUAL_ID:
			return getBus_3009OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeEditPart.VISUAL_ID:
			return getBridge_3010OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID:
			return getHWPlatformInstance_3011OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusPortInstance2EditPart.VISUAL_ID:
			return getBusPortInstance_3012OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_3013OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_3014OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getDelegation_4001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_4002OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.Link2EditPart.VISUAL_ID:
			return getLink_4005OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstanceConfiguration_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstance_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getStructuredResourceInstance_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getCacheInstance_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getProgrammableLogicDeviceInstance_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getProcessorInstance_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getStorageMemoryInstance_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getProcessingMemoryInstance_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBusPortInstance_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getLinkPortInstance_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBus_3009ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.Bus modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.Bus) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CommunicationMedia_ConnectedBridges_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBridge_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstance_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBusPortInstance_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getActuatorInstance_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getSensorInstance_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getDelegation_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getLink_4002ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.Link modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.Link) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CommunicationMedia_ConnectedBridges_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getLink_4005ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.Link modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.Link) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CommunicationMedia_ConnectedBridges_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstance_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getStructuredResourceInstance_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getCacheInstance_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getProgrammableLogicDeviceInstance_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getProcessorInstance_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getStorageMemoryInstance_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getProcessingMemoryInstance_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBusPortInstance_3007IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.BusPortInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.BusPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getLinkPortInstance_3008IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.LinkPortInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.LinkPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBus_3009IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.Bus modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.Bus) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_HWPortPart_ConnectedMedia_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBridge_3010IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.Bridge modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.Bridge) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_CommunicationMedia_ConnectedBridges_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Link_4005(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstance_3011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBusPortInstance_3012IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.BusPortInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.BusPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getActuatorInstance_3013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getSensorInstance_3014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getDelegation_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getLink_4002IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.Link modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.Link) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_HWPortPart_ConnectedMedia_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getLink_4005IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.Link modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.Link) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_HWPortPart_ConnectedMedia_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstance_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getStructuredResourceInstance_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getCacheInstance_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getProgrammableLogicDeviceInstance_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getProcessorInstance_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getStorageMemoryInstance_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getProcessingMemoryInstance_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBusPortInstance_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getLinkPortInstance_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBus_3009OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.Bus modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.Bus) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CommunicationMedia_ConnectedBridges_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBridge_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstance_3011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBusPortInstance_3012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getActuatorInstance_3013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getSensorInstance_3014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getDelegation_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getLink_4002OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.Link modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.Link) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CommunicationMedia_ConnectedBridges_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getLink_4005OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.Link modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.Link) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CommunicationMedia_ConnectedBridges_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getIncomingTypeModelFacetLinks_Delegation_4001(
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
					.getDelegation_HwPortInstance()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.hardware.platform.Delegation) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.Delegation link = (de.uni_paderborn.fujaba.muml.hardware.platform.Delegation) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart src = link
					.getHwPortPart();
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.Delegation_4001,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getIncomingFeatureModelFacetLinks_HWPortPart_ConnectedMedia_4003(
			de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
					.getHWPortPart_ConnectedMedia()) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor(
						setting.getEObject(),
						target,
						de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPortPartConnectedMedia_4003,
						de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortPartConnectedMediaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getIncomingFeatureModelFacetLinks_CommunicationMedia_ConnectedBridges_4004(
			de.uni_paderborn.fujaba.muml.hardware.platform.Bridge target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
					.getCommunicationMedia_ConnectedBridges()) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor(
						setting.getEObject(),
						target,
						de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.CommunicationMediaConnectedBridges_4004,
						de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CommunicationMediaConnectedBridgesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getIncomingTypeModelFacetLinks_Link_4005(
			de.uni_paderborn.fujaba.muml.hardware.platform.Bridge target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
					.getCommunicationMedia_ConnectedBridges()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.hardware.platform.Link) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.Link link = (de.uni_paderborn.fujaba.muml.hardware.platform.Link) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.Link2EditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectedHWPortParts();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart src = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.Link_4005,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.Link2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getOutgoingFeatureModelFacetLinks_CommunicationMedia_ConnectedBridges_4004(
			de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia source) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnectedBridges().iterator(); destinations
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.Bridge destination = (de.uni_paderborn.fujaba.muml.hardware.platform.Bridge) destinations
					.next();
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor(
					source,
					destination,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.CommunicationMediaConnectedBridges_4004,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CommunicationMediaConnectedBridgesEditPart.VISUAL_ID));
		}
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
		public List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getSemanticChildren(
				View view) {
			return HardwareDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getContainedLinks(
				View view) {
			return HardwareDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getIncomingLinks(
				View view) {
			return HardwareDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getOutgoingLinks(
				View view) {
			return HardwareDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
