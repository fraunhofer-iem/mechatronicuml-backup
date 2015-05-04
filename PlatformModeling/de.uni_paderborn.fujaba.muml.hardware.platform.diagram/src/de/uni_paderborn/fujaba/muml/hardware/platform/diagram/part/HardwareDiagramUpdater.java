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
		for (Iterator<?> it = modelElement.getNetworkingHardware().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkingHardware childElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkingHardware) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart.VISUAL_ID) {
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
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusEditPart.VISUAL_ID:
			return getBus_3023ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart.VISUAL_ID:
			return getNetworkBridge_3024ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID:
			return getHWPlatformPart_3016ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID:
			return getHWPortPart_3022ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart.VISUAL_ID:
			return getDelegationHWPort_3018ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourcePartEditPart.VISUAL_ID:
			return getResourcePart_3019ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkConnectorEditPart.VISUAL_ID:
			return getNetworkConnector_4031ContainedLinks(view);
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
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusEditPart.VISUAL_ID:
			return getBus_3023IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart.VISUAL_ID:
			return getNetworkBridge_3024IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID:
			return getHWPlatformPart_3016IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID:
			return getHWPortPart_3022IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart.VISUAL_ID:
			return getDelegationHWPort_3018IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourcePartEditPart.VISUAL_ID:
			return getResourcePart_3019IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkConnectorEditPart.VISUAL_ID:
			return getNetworkConnector_4031IncomingLinks(view);
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
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusEditPart.VISUAL_ID:
			return getBus_3023OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart.VISUAL_ID:
			return getNetworkBridge_3024OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID:
			return getHWPlatformPart_3016OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID:
			return getHWPortPart_3022OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart.VISUAL_ID:
			return getDelegationHWPort_3018OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourcePartEditPart.VISUAL_ID:
			return getResourcePart_3019OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkConnectorEditPart.VISUAL_ID:
			return getNetworkConnector_4031OutgoingLinks(view);
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
		result.addAll(getContainedTypeModelFacetLinks_NetworkConnector_4031(modelElement));
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
		result.addAll(getContainedTypeModelFacetLinks_NetworkConnector_4031(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getBus_3023ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getNetworkBridge_3024ContainedLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getNetworkConnector_4031ContainedLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getBus_3023IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.Bus modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.Bus) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NetworkConnector_4031(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getNetworkBridge_3024IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkBridge modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkBridge) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NetworkConnector_4031(
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
		result.addAll(getIncomingTypeModelFacetLinks_NetworkConnector_4031(
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
		result.addAll(getIncomingTypeModelFacetLinks_NetworkConnector_4031(
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
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getNetworkConnector_4031IncomingLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getBus_3023OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.Bus modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.Bus) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NetworkConnector_4031(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getNetworkBridge_3024OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkBridge modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkBridge) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NetworkConnector_4031(modelElement));
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
		result.addAll(getOutgoingTypeModelFacetLinks_NetworkConnector_4031(modelElement));
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
		result.addAll(getOutgoingTypeModelFacetLinks_NetworkConnector_4031(modelElement));
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
	public static List<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getNetworkConnector_4031OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getContainedTypeModelFacetLinks_NetworkConnector_4031(
			de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform container) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getNetworkConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector link = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector) linkObject;
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.NetworkConnector_4031,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getIncomingTypeModelFacetLinks_NetworkConnector_4031(
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector link = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.NetworkConnector_4031,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareLinkDescriptor> getOutgoingTypeModelFacetLinks_NetworkConnector_4031(
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
		for (Iterator<?> links = container.getNetworkConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector link = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector) linkObject;
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
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
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.NetworkConnector_4031,
					de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkConnectorEditPart.VISUAL_ID));
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
