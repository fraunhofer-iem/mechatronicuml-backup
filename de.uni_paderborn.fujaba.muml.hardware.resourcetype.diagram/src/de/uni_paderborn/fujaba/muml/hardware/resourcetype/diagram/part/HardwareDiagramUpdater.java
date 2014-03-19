package de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part;

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
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ResourceTypeRepositoryEditPart.VISUAL_ID:
			return getResourceTypeRepository_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
			return getDevice_2005SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.StructuredResourceEditPart.VISUAL_ID:
			return getStructuredResource_2007SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.StructuredResourceStructuredResourceCompartmentEditPart.VISUAL_ID:
			return getStructuredResourceStructuredResourceCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareNodeDescriptor> getResourceTypeRepository_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceTypeRepository modelElement = (de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceTypeRepository) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getResourceTypes().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceType childElement = (de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceType) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.DeviceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.StructuredResourceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareNodeDescriptor> getDevice_2005SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.resourcetype.Device modelElement = (de.uni_paderborn.fujaba.muml.hardware.resourcetype.Device) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwports().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort childElement = (de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.HWPortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareNodeDescriptor> getStructuredResource_2007SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.resourcetype.StructuredResource modelElement = (de.uni_paderborn.fujaba.muml.hardware.resourcetype.StructuredResource) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwports().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort childElement = (de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.HWPortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareNodeDescriptor> getStructuredResourceStructuredResourceCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.resourcetype.StructuredResource modelElement = (de.uni_paderborn.fujaba.muml.hardware.resourcetype.StructuredResource) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmbeddedAtomicResources()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.AtomicResource childElement = (de.uni_paderborn.fujaba.muml.hardware.resourcetype.AtomicResource) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.CacheEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProcessorEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProgrammableLogicDeviceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.MemoryResourceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ResourceTypeRepositoryEditPart.VISUAL_ID:
			return getResourceTypeRepository_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
			return getDevice_2005ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.StructuredResourceEditPart.VISUAL_ID:
			return getStructuredResource_2007ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.HWPortEditPart.VISUAL_ID:
			return getHWPort_3001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.CacheEditPart.VISUAL_ID:
			return getCache_3002ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getProcessor_3003ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProgrammableLogicDeviceEditPart.VISUAL_ID:
			return getProgrammableLogicDevice_3004ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.MemoryResourceEditPart.VISUAL_ID:
			return getMemoryResource_3005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
			return getDevice_2005IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.StructuredResourceEditPart.VISUAL_ID:
			return getStructuredResource_2007IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.HWPortEditPart.VISUAL_ID:
			return getHWPort_3001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.CacheEditPart.VISUAL_ID:
			return getCache_3002IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getProcessor_3003IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProgrammableLogicDeviceEditPart.VISUAL_ID:
			return getProgrammableLogicDevice_3004IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.MemoryResourceEditPart.VISUAL_ID:
			return getMemoryResource_3005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
			return getDevice_2005OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.StructuredResourceEditPart.VISUAL_ID:
			return getStructuredResource_2007OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.HWPortEditPart.VISUAL_ID:
			return getHWPort_3001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.CacheEditPart.VISUAL_ID:
			return getCache_3002OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getProcessor_3003OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProgrammableLogicDeviceEditPart.VISUAL_ID:
			return getProgrammableLogicDevice_3004OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.MemoryResourceEditPart.VISUAL_ID:
			return getMemoryResource_3005OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getResourceTypeRepository_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getDevice_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getStructuredResource_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getHWPort_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getCache_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getProcessor_3003ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor modelElement = (de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Processor_OwnedCache_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getProgrammableLogicDevice_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getMemoryResource_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getDevice_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getStructuredResource_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getHWPort_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getCache_3002IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache modelElement = (de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Processor_OwnedCache_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getProcessor_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getProgrammableLogicDevice_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getMemoryResource_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getDevice_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getStructuredResource_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getHWPort_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getCache_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getProcessor_3003OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor modelElement = (de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Processor_OwnedCache_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getProgrammableLogicDevice_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getMemoryResource_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getIncomingFeatureModelFacetLinks_Processor_OwnedCache_4001(
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
					.getProcessor_OwnedCache()) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor(
						setting.getEObject(),
						target,
						de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.ProcessorOwnedCache_4001,
						de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProcessorOwnedCacheEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getOutgoingFeatureModelFacetLinks_Processor_OwnedCache_4001(
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor source) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor>();
		de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache destination = source
				.getOwnedCache();
		if (destination == null) {
			return result;
		}
		result.add(new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor(
				source,
				destination,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.ProcessorOwnedCache_4001,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProcessorOwnedCacheEditPart.VISUAL_ID));
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
		public List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareNodeDescriptor> getSemanticChildren(
				View view) {
			return HardwareDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getContainedLinks(
				View view) {
			return HardwareDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getIncomingLinks(
				View view) {
			return HardwareDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareLinkDescriptor> getOutgoingLinks(
				View view) {
			return HardwareDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
