package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
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
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformEditPart.VISUAL_ID:
			return getHWPlatform_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatform2EditPart.VISUAL_ID:
			return getHWPlatform_2008SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID:
			return getHWPlatformPart_3016SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourcePartEditPart.VISUAL_ID:
			return getResourcePart_3019SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformHWPlatformCompartmentEditPart.VISUAL_ID:
			return getHWPlatformHWPlatformCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor> getHWPlatform_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor>();
		Resource resource = modelElement.eResource();
		for (Iterator<EObject> it = getPhantomNodesIterator(resource); it
				.hasNext();) {
			EObject childElement = it.next();
			if (childElement == modelElement) {
				continue;
			}
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement) == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatform2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor(
						childElement,
						de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatform2EditPart.VISUAL_ID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor> getHWPlatform_2008SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDelegationPorts().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort childElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor> getHWPlatformPart_3016SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformPart modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformPart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwPortParts().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart childElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor> getResourcePart_3019SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.ResourcePart modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.ResourcePart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwPortParts().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart childElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor> getHWPlatformHWPlatformCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNetworkingHardwareParts()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkingHardwarePart childElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkingHardwarePart) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusPartEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgePartEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEmbeddedPlatformParts()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwplatform.PlatformPart childElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.PlatformPart) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourcePartEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Iterator<EObject> getPhantomNodesIterator(Resource resource) {
		return resource.getAllContents();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformEditPart.VISUAL_ID:
			return getHWPlatform_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatform2EditPart.VISUAL_ID:
			return getHWPlatform_2008ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusPartEditPart.VISUAL_ID:
			return getBusPart_3014ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgePartEditPart.VISUAL_ID:
			return getBridgePart_3015ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID:
			return getHWPlatformPart_3016ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID:
			return getHWPortPart_3022ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart.VISUAL_ID:
			return getDelegationHWPort_3018ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourcePartEditPart.VISUAL_ID:
			return getResourcePart_3019ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getDelegation_4028ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkPartEditPart.VISUAL_ID:
			return getLinkPart_4029ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusConnectorEditPart.VISUAL_ID:
			return getBusConnector_4030ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatform2EditPart.VISUAL_ID:
			return getHWPlatform_2008IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusPartEditPart.VISUAL_ID:
			return getBusPart_3014IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgePartEditPart.VISUAL_ID:
			return getBridgePart_3015IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID:
			return getHWPlatformPart_3016IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID:
			return getHWPortPart_3022IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart.VISUAL_ID:
			return getDelegationHWPort_3018IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourcePartEditPart.VISUAL_ID:
			return getResourcePart_3019IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getDelegation_4028IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkPartEditPart.VISUAL_ID:
			return getLinkPart_4029IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusConnectorEditPart.VISUAL_ID:
			return getBusConnector_4030IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatform2EditPart.VISUAL_ID:
			return getHWPlatform_2008OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusPartEditPart.VISUAL_ID:
			return getBusPart_3014OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgePartEditPart.VISUAL_ID:
			return getBridgePart_3015OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID:
			return getHWPlatformPart_3016OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID:
			return getHWPortPart_3022OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart.VISUAL_ID:
			return getDelegationHWPort_3018OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourcePartEditPart.VISUAL_ID:
			return getResourcePart_3019OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getDelegation_4028OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkPartEditPart.VISUAL_ID:
			return getLinkPart_4029OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusConnectorEditPart.VISUAL_ID:
			return getBusConnector_4030OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPlatform_1000ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Delegation_4028(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LinkPart_4029(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_BusConnector_4030(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPlatform_2008ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Delegation_4028(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LinkPart_4029(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_BusConnector_4030(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getBusPart_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getBridgePart_3015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPlatformPart_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPortPart_3022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getDelegationHWPort_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getResourcePart_3019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getDelegation_4028ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getLinkPart_4029ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getBusConnector_4030ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPlatform_2008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getBusPart_3014IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusPart modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusPart) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4028(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkPart_4029(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BusConnector_4030(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getBridgePart_3015IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.BridgePart modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.BridgePart) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4028(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkPart_4029(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BusConnector_4030(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPlatformPart_3016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPortPart_3022IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4028(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkPart_4029(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BusConnector_4030(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getDelegationHWPort_3018IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4028(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkPart_4029(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BusConnector_4030(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getResourcePart_3019IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getDelegation_4028IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getLinkPart_4029IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getBusConnector_4030IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPlatform_2008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getBusPart_3014OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusPart modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusPart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4028(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkPart_4029(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_BusConnector_4030(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getBridgePart_3015OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.BridgePart modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.BridgePart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4028(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkPart_4029(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_BusConnector_4030(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPlatformPart_3016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPortPart_3022OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4028(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkPart_4029(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_BusConnector_4030(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getDelegationHWPort_3018OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4028(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkPart_4029(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_BusConnector_4030(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getResourcePart_3019OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getDelegation_4028OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getLinkPart_4029OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getBusConnector_4030OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getContainedTypeModelFacetLinks_Delegation_4028(
			de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform container) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getNetworkingHardwareParts()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatform.Delegation) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.hwplatform.Delegation link = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.Delegation) linkObject;
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Delegation_4028,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getContainedTypeModelFacetLinks_LinkPart_4029(
			de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform container) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getNetworkingHardwareParts()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatform.LinkPart) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.hwplatform.LinkPart link = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.LinkPart) linkObject;
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkPartEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.LinkPart_4029,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkPartEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getContainedTypeModelFacetLinks_BusConnector_4030(
			de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform container) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getNetworkingHardwareParts()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusConnector link = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusConnector) linkObject;
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BusConnector_4030,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getIncomingTypeModelFacetLinks_Delegation_4028(
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatform.Delegation) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.hwplatform.Delegation link = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.Delegation) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Delegation_4028,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getIncomingTypeModelFacetLinks_LinkPart_4029(
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatform.LinkPart) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.hwplatform.LinkPart link = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.LinkPart) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkPartEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.LinkPart_4029,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkPartEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getIncomingTypeModelFacetLinks_BusConnector_4030(
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusConnector link = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusConnector) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BusConnector_4030,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getOutgoingTypeModelFacetLinks_Delegation_4028(
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint source) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform) {
				container = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getNetworkingHardwareParts()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatform.Delegation) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.hwplatform.Delegation link = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.Delegation) linkObject;
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Delegation_4028,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getOutgoingTypeModelFacetLinks_LinkPart_4029(
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint source) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform) {
				container = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getNetworkingHardwareParts()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatform.LinkPart) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.hwplatform.LinkPart link = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.LinkPart) linkObject;
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkPartEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.LinkPart_4029,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkPartEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getOutgoingTypeModelFacetLinks_BusConnector_4030(
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint source) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform) {
				container = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getNetworkingHardwareParts()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusConnector link = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusConnector) linkObject;
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BusConnector_4030,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusConnectorEditPart.VISUAL_ID));
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
		public List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor> getSemanticChildren(
				View view) {
			return HardwareDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getContainedLinks(
				View view) {
			return HardwareDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getIncomingLinks(
				View view) {
			return HardwareDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getOutgoingLinks(
				View view) {
			return HardwareDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
