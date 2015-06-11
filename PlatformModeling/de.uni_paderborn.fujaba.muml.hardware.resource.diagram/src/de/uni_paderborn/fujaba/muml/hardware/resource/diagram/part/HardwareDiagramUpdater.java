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
			return getDevice_2006SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceStructuredResourceCompartmentEditPart.VISUAL_ID:
			return getStructuredResourceStructuredResourceCompartment_7003SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart.VISUAL_ID:
			return getCommunicationProtocolRepositoryProtocolRepositoryCompartment_7004SemanticChildren(view);
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
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor> getDevice_2006SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwresource.Device modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.Device) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCommunicationResources()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource childElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource) it
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
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor> getStructuredResourceStructuredResourceCompartment_7003SemanticChildren(
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
		for (Iterator<?> it = modelElement.getCommunicationResources()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource childElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResource2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
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
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareNodeDescriptor> getCommunicationProtocolRepositoryProtocolRepositoryCompartment_7004SemanticChildren(
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
			return getDevice_2006ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceEditPart.VISUAL_ID:
			return getStructuredResource_2007ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryEditPart.VISUAL_ID:
			return getCommunicationProtocolRepository_2008ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart.VISUAL_ID:
			return getCommunicationResource_3011ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResource2EditPart.VISUAL_ID:
			return getCommunicationResource_3012ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CacheEditPart.VISUAL_ID:
			return getCache_3013ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getProcessor_3014ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceEditPart.VISUAL_ID:
			return getProgrammableLogicDevice_3015ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.MemoryResourceEditPart.VISUAL_ID:
			return getMemoryResource_3016ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.BusProtocolEditPart.VISUAL_ID:
			return getBusProtocol_3017ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.LinkProtocolEditPart.VISUAL_ID:
			return getLinkProtocol_3018ContainedLinks(view);
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
			return getDevice_2006IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceEditPart.VISUAL_ID:
			return getStructuredResource_2007IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryEditPart.VISUAL_ID:
			return getCommunicationProtocolRepository_2008IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart.VISUAL_ID:
			return getCommunicationResource_3011IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResource2EditPart.VISUAL_ID:
			return getCommunicationResource_3012IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CacheEditPart.VISUAL_ID:
			return getCache_3013IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getProcessor_3014IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceEditPart.VISUAL_ID:
			return getProgrammableLogicDevice_3015IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.MemoryResourceEditPart.VISUAL_ID:
			return getMemoryResource_3016IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.BusProtocolEditPart.VISUAL_ID:
			return getBusProtocol_3017IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.LinkProtocolEditPart.VISUAL_ID:
			return getLinkProtocol_3018IncomingLinks(view);
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
			return getDevice_2006OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceEditPart.VISUAL_ID:
			return getStructuredResource_2007OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryEditPart.VISUAL_ID:
			return getCommunicationProtocolRepository_2008OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart.VISUAL_ID:
			return getCommunicationResource_3011OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResource2EditPart.VISUAL_ID:
			return getCommunicationResource_3012OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CacheEditPart.VISUAL_ID:
			return getCache_3013OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getProcessor_3014OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceEditPart.VISUAL_ID:
			return getProgrammableLogicDevice_3015OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.MemoryResourceEditPart.VISUAL_ID:
			return getMemoryResource_3016OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.BusProtocolEditPart.VISUAL_ID:
			return getBusProtocol_3017OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.LinkProtocolEditPart.VISUAL_ID:
			return getLinkProtocol_3018OutgoingLinks(view);
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
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getDevice_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getStructuredResource_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getCommunicationProtocolRepository_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getCommunicationResource_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getCommunicationResource_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getCache_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getProcessor_3014ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwresource.Processor modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.Processor) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Processor_OwnedCache_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getProgrammableLogicDevice_3015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getMemoryResource_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getBusProtocol_3017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getLinkProtocol_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getDevice_2006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getStructuredResource_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getCommunicationProtocolRepository_2008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getCommunicationResource_3011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getCommunicationResource_3012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getCache_3013IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwresource.Cache modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.Cache) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Processor_OwnedCache_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getProcessor_3014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getProgrammableLogicDevice_3015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getMemoryResource_3016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getBusProtocol_3017IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getLinkProtocol_3018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getDevice_2006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getStructuredResource_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getCommunicationProtocolRepository_2008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getCommunicationResource_3011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getCommunicationResource_3012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getCache_3013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getProcessor_3014OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwresource.Processor modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.Processor) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Processor_OwnedCache_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getProgrammableLogicDevice_3015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getMemoryResource_3016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getBusProtocol_3017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getLinkProtocol_3018OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getIncomingFeatureModelFacetLinks_Processor_OwnedCache_4002(
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
						de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.ProcessorOwnedCache_4002,
						de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProcessorOwnedCacheEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareLinkDescriptor> getOutgoingFeatureModelFacetLinks_Processor_OwnedCache_4002(
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
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.ProcessorOwnedCache_4002,
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
