package de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part;

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
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ResourceRepositoryEditPart.VISUAL_ID:
			return getResourceRepository_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
			return getDevice_2001SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceEditPart.VISUAL_ID:
			return getStructuredResource_2002SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceStructuredResourceCompartmentEditPart.VISUAL_ID:
			return getStructuredResourceStructuredResourceCompartment_7001SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart.VISUAL_ID:
			return getCommunicationProtocolRepositoryProtocolRepositoryCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor> getResourceRepository_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwresource.ResourceRepository modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.ResourceRepository) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getResources().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwresource.Resource childElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.Resource) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.DeviceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCommunicationMedia().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationMedia childElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationMedia) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.BusEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.LinkEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getProtocols().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocolRepository childElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocolRepository) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor> getDevice_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwresource.Device modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.Device) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwports().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort childElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor> getStructuredResource_2002SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwresource.StructuredResource modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.StructuredResource) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwports().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort childElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor> getStructuredResourceStructuredResourceCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwresource.StructuredResource modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.StructuredResource) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmbeddedAtomicResources()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwresource.AtomicResource childElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.AtomicResource) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CacheEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProcessorEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.MemoryResourceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor> getCommunicationProtocolRepositoryProtocolRepositoryCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocolRepository modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocolRepository) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCommunicationProtocols()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocol childElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocol) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.BusProtocolEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.LinkProtocolEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ResourceRepositoryEditPart.VISUAL_ID:
			return getResourceRepository_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
			return getDevice_2001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceEditPart.VISUAL_ID:
			return getStructuredResource_2002ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.BusEditPart.VISUAL_ID:
			return getBus_2003ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_2004ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryEditPart.VISUAL_ID:
			return getCommunicationProtocolRepository_2005ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart.VISUAL_ID:
			return getCommunicationResource_3001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CacheEditPart.VISUAL_ID:
			return getCache_3002ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getProcessor_3003ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceEditPart.VISUAL_ID:
			return getProgrammableLogicDevice_3004ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.MemoryResourceEditPart.VISUAL_ID:
			return getMemoryResource_3005ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.BusProtocolEditPart.VISUAL_ID:
			return getBusProtocol_3006ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.LinkProtocolEditPart.VISUAL_ID:
			return getLinkProtocol_3007ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
			return getDevice_2001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceEditPart.VISUAL_ID:
			return getStructuredResource_2002IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.BusEditPart.VISUAL_ID:
			return getBus_2003IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_2004IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryEditPart.VISUAL_ID:
			return getCommunicationProtocolRepository_2005IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart.VISUAL_ID:
			return getCommunicationResource_3001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CacheEditPart.VISUAL_ID:
			return getCache_3002IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getProcessor_3003IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceEditPart.VISUAL_ID:
			return getProgrammableLogicDevice_3004IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.MemoryResourceEditPart.VISUAL_ID:
			return getMemoryResource_3005IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.BusProtocolEditPart.VISUAL_ID:
			return getBusProtocol_3006IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.LinkProtocolEditPart.VISUAL_ID:
			return getLinkProtocol_3007IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
			return getDevice_2001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceEditPart.VISUAL_ID:
			return getStructuredResource_2002OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.BusEditPart.VISUAL_ID:
			return getBus_2003OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_2004OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryEditPart.VISUAL_ID:
			return getCommunicationProtocolRepository_2005OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart.VISUAL_ID:
			return getCommunicationResource_3001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CacheEditPart.VISUAL_ID:
			return getCache_3002OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getProcessor_3003OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceEditPart.VISUAL_ID:
			return getProgrammableLogicDevice_3004OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.MemoryResourceEditPart.VISUAL_ID:
			return getMemoryResource_3005OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.BusProtocolEditPart.VISUAL_ID:
			return getBusProtocol_3006OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.LinkProtocolEditPart.VISUAL_ID:
			return getLinkProtocol_3007OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getResourceRepository_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getDevice_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getStructuredResource_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getBus_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getLink_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getCommunicationProtocolRepository_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getCommunicationResource_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getCache_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getProcessor_3003ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwresource.Processor modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.Processor) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Processor_OwnedCache_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getProgrammableLogicDevice_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getMemoryResource_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getBusProtocol_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getLinkProtocol_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getDevice_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getStructuredResource_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getBus_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getLink_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getCommunicationProtocolRepository_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getCommunicationResource_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getCache_3002IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwresource.Cache modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.Cache) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Processor_OwnedCache_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getProcessor_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getProgrammableLogicDevice_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getMemoryResource_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getBusProtocol_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getLinkProtocol_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getDevice_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getStructuredResource_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getBus_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getLink_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getCommunicationProtocolRepository_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getCommunicationResource_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getCache_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getProcessor_3003OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwresource.Processor modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.Processor) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Processor_OwnedCache_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getProgrammableLogicDevice_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getMemoryResource_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getBusProtocol_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getLinkProtocol_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getIncomingFeatureModelFacetLinks_Processor_OwnedCache_4001(
			de.uni_paderborn.fujaba.muml.hardware.hwresource.Cache target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getProcessor_OwnedCache()) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor(
						setting.getEObject(),
						target,
						de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.ProcessorOwnedCache_4001,
						de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProcessorOwnedCacheEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getOutgoingFeatureModelFacetLinks_Processor_OwnedCache_4001(
			de.uni_paderborn.fujaba.muml.hardware.hwresource.Processor source) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor>();
		de.uni_paderborn.fujaba.muml.hardware.hwresource.Cache destination = source
				.getOwnedCache();
		if (destination == null) {
			return result;
		}
		result.add(new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor(
				source,
				destination,
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.ProcessorOwnedCache_4001,
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProcessorOwnedCacheEditPart.VISUAL_ID));
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
		public List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor> getSemanticChildren(
				View view) {
			return HardwareDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getContainedLinks(
				View view) {
			return HardwareDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getIncomingLinks(
				View view) {
			return HardwareDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getOutgoingLinks(
				View view) {
			return HardwareDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
