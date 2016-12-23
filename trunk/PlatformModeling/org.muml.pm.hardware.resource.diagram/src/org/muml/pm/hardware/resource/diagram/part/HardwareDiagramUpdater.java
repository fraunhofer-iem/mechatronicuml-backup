package org.muml.pm.hardware.resource.diagram.part;

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
import org.muml.pm.hardware.hwresource.AtomicResource;
import org.muml.pm.hardware.hwresource.Cache;
import org.muml.pm.hardware.hwresource.CommunicationProtocol;
import org.muml.pm.hardware.hwresource.CommunicationProtocolRepository;
import org.muml.pm.hardware.hwresource.CommunicationResource;
import org.muml.pm.hardware.hwresource.Device;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwresource.Processor;
import org.muml.pm.hardware.hwresource.Resource;
import org.muml.pm.hardware.hwresource.ResourceRepository;
import org.muml.pm.hardware.hwresource.StructuredResource;
import org.muml.pm.hardware.resource.diagram.edit.parts.BusProtocolEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CacheEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationResource2EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.DeviceEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.LinkProtocolEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.MemoryResourceEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.ProcessorEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.ProcessorOwnedCacheEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.ResourceRepositoryEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.StructuredResourceEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.StructuredResourceStructuredResourceCompartmentEditPart;
import org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes;

/**
 * @generated
 */
public class HardwareDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getSemanticChildren(View view) {
		switch (HardwareVisualIDRegistry.getVisualID(view)) {
		case ResourceRepositoryEditPart.VISUAL_ID:
			return getResourceRepository_1000SemanticChildren(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2006SemanticChildren(view);
		case StructuredResourceStructuredResourceCompartmentEditPart.VISUAL_ID:
			return getStructuredResourceStructuredResourceCompartment_7003SemanticChildren(view);
		case CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart.VISUAL_ID:
			return getCommunicationProtocolRepositoryProtocolRepositoryCompartment_7004SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getResourceRepository_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ResourceRepository modelElement = (ResourceRepository) view.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getResources().iterator(); it.hasNext();) {
			Resource childElement = (Resource) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DeviceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StructuredResourceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getProtocols().iterator(); it.hasNext();) {
			CommunicationProtocolRepository childElement = (CommunicationProtocolRepository) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CommunicationProtocolRepositoryEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getDevice_2006SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Device modelElement = (Device) view.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCommunicationResources().iterator(); it.hasNext();) {
			CommunicationResource childElement = (CommunicationResource) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CommunicationResourceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getStructuredResourceStructuredResourceCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StructuredResource modelElement = (StructuredResource) containerView.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCommunicationResources().iterator(); it.hasNext();) {
			CommunicationResource childElement = (CommunicationResource) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CommunicationResource2EditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEmbeddedAtomicResources().iterator(); it.hasNext();) {
			AtomicResource childElement = (AtomicResource) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CacheEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ProcessorEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ProgrammableLogicDeviceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MemoryResourceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getCommunicationProtocolRepositoryProtocolRepositoryCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CommunicationProtocolRepository modelElement = (CommunicationProtocolRepository) containerView.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCommunicationProtocols().iterator(); it.hasNext();) {
			CommunicationProtocol childElement = (CommunicationProtocol) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == BusProtocolEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LinkProtocolEditPart.VISUAL_ID) {
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
		case ResourceRepositoryEditPart.VISUAL_ID:
			return getResourceRepository_1000ContainedLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2006ContainedLinks(view);
		case StructuredResourceEditPart.VISUAL_ID:
			return getStructuredResource_2007ContainedLinks(view);
		case CommunicationProtocolRepositoryEditPart.VISUAL_ID:
			return getCommunicationProtocolRepository_2008ContainedLinks(view);
		case CommunicationResourceEditPart.VISUAL_ID:
			return getCommunicationResource_3011ContainedLinks(view);
		case CommunicationResource2EditPart.VISUAL_ID:
			return getCommunicationResource_3012ContainedLinks(view);
		case CacheEditPart.VISUAL_ID:
			return getCache_3013ContainedLinks(view);
		case ProcessorEditPart.VISUAL_ID:
			return getProcessor_3014ContainedLinks(view);
		case ProgrammableLogicDeviceEditPart.VISUAL_ID:
			return getProgrammableLogicDevice_3015ContainedLinks(view);
		case MemoryResourceEditPart.VISUAL_ID:
			return getMemoryResource_3016ContainedLinks(view);
		case BusProtocolEditPart.VISUAL_ID:
			return getBusProtocol_3017ContainedLinks(view);
		case LinkProtocolEditPart.VISUAL_ID:
			return getLinkProtocol_3018ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getIncomingLinks(View view) {
		switch (HardwareVisualIDRegistry.getVisualID(view)) {
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2006IncomingLinks(view);
		case StructuredResourceEditPart.VISUAL_ID:
			return getStructuredResource_2007IncomingLinks(view);
		case CommunicationProtocolRepositoryEditPart.VISUAL_ID:
			return getCommunicationProtocolRepository_2008IncomingLinks(view);
		case CommunicationResourceEditPart.VISUAL_ID:
			return getCommunicationResource_3011IncomingLinks(view);
		case CommunicationResource2EditPart.VISUAL_ID:
			return getCommunicationResource_3012IncomingLinks(view);
		case CacheEditPart.VISUAL_ID:
			return getCache_3013IncomingLinks(view);
		case ProcessorEditPart.VISUAL_ID:
			return getProcessor_3014IncomingLinks(view);
		case ProgrammableLogicDeviceEditPart.VISUAL_ID:
			return getProgrammableLogicDevice_3015IncomingLinks(view);
		case MemoryResourceEditPart.VISUAL_ID:
			return getMemoryResource_3016IncomingLinks(view);
		case BusProtocolEditPart.VISUAL_ID:
			return getBusProtocol_3017IncomingLinks(view);
		case LinkProtocolEditPart.VISUAL_ID:
			return getLinkProtocol_3018IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getOutgoingLinks(View view) {
		switch (HardwareVisualIDRegistry.getVisualID(view)) {
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2006OutgoingLinks(view);
		case StructuredResourceEditPart.VISUAL_ID:
			return getStructuredResource_2007OutgoingLinks(view);
		case CommunicationProtocolRepositoryEditPart.VISUAL_ID:
			return getCommunicationProtocolRepository_2008OutgoingLinks(view);
		case CommunicationResourceEditPart.VISUAL_ID:
			return getCommunicationResource_3011OutgoingLinks(view);
		case CommunicationResource2EditPart.VISUAL_ID:
			return getCommunicationResource_3012OutgoingLinks(view);
		case CacheEditPart.VISUAL_ID:
			return getCache_3013OutgoingLinks(view);
		case ProcessorEditPart.VISUAL_ID:
			return getProcessor_3014OutgoingLinks(view);
		case ProgrammableLogicDeviceEditPart.VISUAL_ID:
			return getProgrammableLogicDevice_3015OutgoingLinks(view);
		case MemoryResourceEditPart.VISUAL_ID:
			return getMemoryResource_3016OutgoingLinks(view);
		case BusProtocolEditPart.VISUAL_ID:
			return getBusProtocol_3017OutgoingLinks(view);
		case LinkProtocolEditPart.VISUAL_ID:
			return getLinkProtocol_3018OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getResourceRepository_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getDevice_2006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getStructuredResource_2007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getCommunicationProtocolRepository_2008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getCommunicationResource_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getCommunicationResource_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getCache_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getProcessor_3014ContainedLinks(View view) {
		Processor modelElement = (Processor) view.getElement();
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Processor_OwnedCache_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getProgrammableLogicDevice_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getMemoryResource_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getBusProtocol_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getLinkProtocol_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getDevice_2006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getStructuredResource_2007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getCommunicationProtocolRepository_2008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getCommunicationResource_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getCommunicationResource_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getCache_3013IncomingLinks(View view) {
		Cache modelElement = (Cache) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Processor_OwnedCache_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getProcessor_3014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getProgrammableLogicDevice_3015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getMemoryResource_3016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getBusProtocol_3017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getLinkProtocol_3018IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getDevice_2006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getStructuredResource_2007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getCommunicationProtocolRepository_2008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getCommunicationResource_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getCommunicationResource_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getCache_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getProcessor_3014OutgoingLinks(View view) {
		Processor modelElement = (Processor) view.getElement();
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Processor_OwnedCache_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getProgrammableLogicDevice_3015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getMemoryResource_3016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getBusProtocol_3017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getLinkProtocol_3018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<HardwareLinkDescriptor> getIncomingFeatureModelFacetLinks_Processor_OwnedCache_4002(
			Cache target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == HwresourcePackage.eINSTANCE.getProcessor_OwnedCache()) {
				result.add(new HardwareLinkDescriptor(setting.getEObject(), target,
						HardwareElementTypes.ProcessorOwnedCache_4002, ProcessorOwnedCacheEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<HardwareLinkDescriptor> getOutgoingFeatureModelFacetLinks_Processor_OwnedCache_4002(
			Processor source) {
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		Cache destination = source.getOwnedCache();
		if (destination == null) {
			return result;
		}
		result.add(new HardwareLinkDescriptor(source, destination, HardwareElementTypes.ProcessorOwnedCache_4002,
				ProcessorOwnedCacheEditPart.VISUAL_ID));
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
