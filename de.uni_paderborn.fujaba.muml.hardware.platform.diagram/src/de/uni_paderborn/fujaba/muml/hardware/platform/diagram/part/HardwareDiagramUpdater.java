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
			return getHWPlatform_2007SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID:
			return getHWPlatformPart_3010SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourceInstancePartEditPart.VISUAL_ID:
			return getResourceInstancePart_3012SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformHWPlatformCompartmentEditPart.VISUAL_ID:
			return getHWPlatformHWPlatformCompartment_7001SemanticChildren(view);
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
		de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor>();

		if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
				.getNodeVisualID(view, modelElement) == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatform2EditPart.VISUAL_ID) {
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor(
					modelElement,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatform2EditPart.VISUAL_ID));
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor> getHWPlatform_2007SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDelegationPorts().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID) {
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
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor> getHWPlatformPart_3010SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDelegationPorts().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart childElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPart2EditPart.VISUAL_ID) {
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
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor> getResourceInstancePart_3012SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstancePart modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstancePart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwportParts().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart childElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) it
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
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor> getHWPlatformHWPlatformCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmbeddedCommunicationResources()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationResource childElement = (de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationResource) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgeEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEmbeddedPlatformParts()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart childElement = (de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourceInstancePartEditPart.VISUAL_ID) {
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
			return getHWPlatform_2007ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusEditPart.VISUAL_ID:
			return getBus_3008ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgeEditPart.VISUAL_ID:
			return getBridge_3009ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID:
			return getHWPlatformPart_3010ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPart2EditPart.VISUAL_ID:
			return getHWPortPart_3007ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID:
			return getBusPortInstance_3011ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourceInstancePartEditPart.VISUAL_ID:
			return getResourceInstancePart_3012ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID:
			return getHWPortPart_3005ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID:
			return getLinkPortInstance_3013ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getDelegation_4001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_4002ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.Link2EditPart.VISUAL_ID:
			return getLink_4011ContainedLinks(view);
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
			return getHWPlatform_2007IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusEditPart.VISUAL_ID:
			return getBus_3008IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgeEditPart.VISUAL_ID:
			return getBridge_3009IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID:
			return getHWPlatformPart_3010IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPart2EditPart.VISUAL_ID:
			return getHWPortPart_3007IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID:
			return getBusPortInstance_3011IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourceInstancePartEditPart.VISUAL_ID:
			return getResourceInstancePart_3012IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID:
			return getHWPortPart_3005IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID:
			return getLinkPortInstance_3013IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getDelegation_4001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_4002IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.Link2EditPart.VISUAL_ID:
			return getLink_4011IncomingLinks(view);
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
			return getHWPlatform_2007OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusEditPart.VISUAL_ID:
			return getBus_3008OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgeEditPart.VISUAL_ID:
			return getBridge_3009OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID:
			return getHWPlatformPart_3010OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPart2EditPart.VISUAL_ID:
			return getHWPortPart_3007OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID:
			return getBusPortInstance_3011OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourceInstancePartEditPart.VISUAL_ID:
			return getResourceInstancePart_3012OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID:
			return getHWPortPart_3005OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID:
			return getLinkPortInstance_3013OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getDelegation_4001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_4002OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.Link2EditPart.VISUAL_ID:
			return getLink_4011OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPlatform_1000ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Delegation_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Link_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Link_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPlatform_2007ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Delegation_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Link_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Link_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getBus_3008ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.Bus modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.Bus) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CommunicationMedia_ConnectedBridges_4023(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getBridge_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPlatformPart_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPortPart_3007ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HWPortPart_ConnectedMedia_4027(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getBusPortInstance_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getResourceInstancePart_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPortPart_3005ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HWPortPart_ConnectedMedia_4027(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getLinkPortInstance_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getDelegation_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getLink_4002ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.Link modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.Link) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CommunicationMedia_ConnectedBridges_4023(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getLink_4011ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.Link modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.Link) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CommunicationMedia_ConnectedBridges_4023(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPlatform_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getBus_3008IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.Bus modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.Bus) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_HWPortPart_ConnectedMedia_4027(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getBridge_3009IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.Bridge modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.Bridge) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_CommunicationMedia_ConnectedBridges_4023(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Link_4011(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPlatformPart_3010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPortPart_3007IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4002(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getBusPortInstance_3011IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.BusPortInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.BusPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getResourceInstancePart_3012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPortPart_3005IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4002(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getLinkPortInstance_3013IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.LinkPortInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.LinkPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getDelegation_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getLink_4002IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.Link modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.Link) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_HWPortPart_ConnectedMedia_4027(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getLink_4011IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.Link modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.Link) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_HWPortPart_ConnectedMedia_4027(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPlatform_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getBus_3008OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.Bus modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.Bus) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CommunicationMedia_ConnectedBridges_4023(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getBridge_3009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPlatformPart_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPortPart_3007OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_HWPortPart_ConnectedMedia_4027(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getBusPortInstance_3011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getResourceInstancePart_3012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getHWPortPart_3005OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_HWPortPart_ConnectedMedia_4027(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getLinkPortInstance_3013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getDelegation_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getLink_4002OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.Link modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.Link) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CommunicationMedia_ConnectedBridges_4023(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getLink_4011OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.platform.Link modelElement = (de.uni_paderborn.fujaba.muml.hardware.platform.Link) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CommunicationMedia_ConnectedBridges_4023(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getContainedTypeModelFacetLinks_Delegation_4001(
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform container) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getDelegations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.hardware.platform.Delegation) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.Delegation link = (de.uni_paderborn.fujaba.muml.hardware.platform.Delegation) linkObject;
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getHwPortInstance();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance dst = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance) theTarget;
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart src = link
					.getHwPortPart();
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Delegation_4001,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getContainedTypeModelFacetLinks_Link_4002(
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform container) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getEmbeddedCommunicationResources()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.hardware.platform.Link) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.Link link = (de.uni_paderborn.fujaba.muml.hardware.platform.Link) linkObject;
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectedHWPortParts();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart dst = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) theTarget;
			List sources = link.getConnectedHWPortParts();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart src = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Link_4002,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getContainedTypeModelFacetLinks_Link_4011(
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform container) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getEmbeddedCommunicationResources()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.hardware.platform.Link) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.Link link = (de.uni_paderborn.fujaba.muml.hardware.platform.Link) linkObject;
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.Link2EditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectedBridges();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.hardware.platform.Bridge) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.Bridge dst = (de.uni_paderborn.fujaba.muml.hardware.platform.Bridge) theTarget;
			List sources = link.getConnectedHWPortParts();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart src = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Link_4011,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.Link2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getIncomingTypeModelFacetLinks_Delegation_4001(
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
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
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart src = link
					.getHwPortPart();
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Delegation_4001,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getIncomingTypeModelFacetLinks_Link_4002(
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
					.getCommunicationMedia_ConnectedHWPortParts()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.hardware.platform.Link) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.Link link = (de.uni_paderborn.fujaba.muml.hardware.platform.Link) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectedHWPortParts();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart src = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Link_4002,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getIncomingFeatureModelFacetLinks_HWPortPart_ConnectedMedia_4027(
			de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
					.getHWPortPart_ConnectedMedia()) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
						setting.getEObject(),
						target,
						de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.HWPortPartConnectedMedia_4027,
						de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartConnectedMediaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getIncomingFeatureModelFacetLinks_CommunicationMedia_ConnectedBridges_4023(
			de.uni_paderborn.fujaba.muml.hardware.platform.Bridge target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
					.getCommunicationMedia_ConnectedBridges()) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
						setting.getEObject(),
						target,
						de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.CommunicationMediaConnectedBridges_4023,
						de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.CommunicationMediaConnectedBridgesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getIncomingTypeModelFacetLinks_Link_4011(
			de.uni_paderborn.fujaba.muml.hardware.platform.Bridge target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
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
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.Link2EditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectedHWPortParts();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart src = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Link_4011,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.Link2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getOutgoingTypeModelFacetLinks_Delegation_4001(
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart source) {
		de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform) {
				container = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getDelegations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.hardware.platform.Delegation) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.Delegation link = (de.uni_paderborn.fujaba.muml.hardware.platform.Delegation) linkObject;
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getHwPortInstance();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance dst = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance) theTarget;
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart src = link
					.getHwPortPart();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Delegation_4001,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getOutgoingTypeModelFacetLinks_Link_4002(
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart source) {
		de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform) {
				container = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getEmbeddedCommunicationResources()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.hardware.platform.Link) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.Link link = (de.uni_paderborn.fujaba.muml.hardware.platform.Link) linkObject;
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectedHWPortParts();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart dst = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) theTarget;
			List sources = link.getConnectedHWPortParts();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart src = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) theSource;
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Link_4002,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getOutgoingFeatureModelFacetLinks_HWPortPart_ConnectedMedia_4027(
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart source) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnectedMedia().iterator(); destinations
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia destination = (de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia) destinations
					.next();
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
					source,
					destination,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.HWPortPartConnectedMedia_4027,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartConnectedMediaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getOutgoingFeatureModelFacetLinks_CommunicationMedia_ConnectedBridges_4023(
			de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia source) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnectedBridges().iterator(); destinations
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.platform.Bridge destination = (de.uni_paderborn.fujaba.muml.hardware.platform.Bridge) destinations
					.next();
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
					source,
					destination,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.CommunicationMediaConnectedBridges_4023,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.CommunicationMediaConnectedBridgesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getOutgoingTypeModelFacetLinks_Link_4011(
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart source) {
		de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform) {
				container = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getEmbeddedCommunicationResources()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.hardware.platform.Link) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.Link link = (de.uni_paderborn.fujaba.muml.hardware.platform.Link) linkObject;
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.Link2EditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectedBridges();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.hardware.platform.Bridge) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.Bridge dst = (de.uni_paderborn.fujaba.muml.hardware.platform.Bridge) theTarget;
			List sources = link.getConnectedHWPortParts();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart src = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) theSource;
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Link_4011,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.Link2EditPart.VISUAL_ID));
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
