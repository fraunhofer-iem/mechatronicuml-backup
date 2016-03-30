package org.muml.pm.hardware.platforminstance.diagram.part;

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
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getSemanticChildren(
			View view) {
		switch (org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart.VISUAL_ID:
			return getHWPlatformInstanceConfiguration_1000SemanticChildren(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID:
			return getHWPlatformInstance_2005SemanticChildren(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID:
			return getHWPlatformInstance_3040SemanticChildren(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_3042SemanticChildren(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_3044SemanticChildren(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_3045SemanticChildren(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartmentEditPart.VISUAL_ID:
			return getHWPlatformInstanceHWPlatformCompartment_7012SemanticChildren(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID:
			return getHWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartment_7013SemanticChildren(
					view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartment2EditPart.VISUAL_ID:
			return getHWPlatformInstanceHWPlatformCompartment_7014SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getHWPlatformInstanceConfiguration_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration modelElement = (org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration) view
				.getElement();
		LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwplatformInstances().iterator(); it.hasNext();) {
			org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance childElement = (org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance) it
					.next();
			int visualID = org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID) {
				result.add(
						new org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getHWPlatformInstance_2005SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance modelElement = (org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance) view
				.getElement();
		LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDelegationPorts().iterator(); it.hasNext();) {
			org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance childElement = (org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance) it
					.next();
			int visualID = org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart.VISUAL_ID) {
				result.add(
						new org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getHWPlatformInstance_3040SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance modelElement = (org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance) view
				.getElement();
		LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDelegationPorts().iterator(); it.hasNext();) {
			org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance childElement = (org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance) it
					.next();
			int visualID = org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart.VISUAL_ID) {
				result.add(
						new org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getStructuredResourceInstance_3042SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance modelElement = (org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance) view
				.getElement();
		LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwports().iterator(); it.hasNext();) {
			org.muml.pm.hardware.hwresourceinstance.HWPort childElement = (org.muml.pm.hardware.hwresourceinstance.HWPort) it
					.next();
			int visualID = org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart.VISUAL_ID) {
				result.add(
						new org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getActuatorInstance_3044SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pm.hardware.hwresourceinstance.ActuatorInstance modelElement = (org.muml.pm.hardware.hwresourceinstance.ActuatorInstance) view
				.getElement();
		LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwports().iterator(); it.hasNext();) {
			org.muml.pm.hardware.hwresourceinstance.HWPort childElement = (org.muml.pm.hardware.hwresourceinstance.HWPort) it
					.next();
			int visualID = org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart.VISUAL_ID) {
				result.add(
						new org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getSensorInstance_3045SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pm.hardware.hwresourceinstance.SensorInstance modelElement = (org.muml.pm.hardware.hwresourceinstance.SensorInstance) view
				.getElement();
		LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwports().iterator(); it.hasNext();) {
			org.muml.pm.hardware.hwresourceinstance.HWPort childElement = (org.muml.pm.hardware.hwresourceinstance.HWPort) it
					.next();
			int visualID = org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart.VISUAL_ID) {
				result.add(
						new org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getHWPlatformInstanceHWPlatformCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance modelElement = (org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance) containerView
				.getElement();
		LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		{
			org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration childElement = modelElement
					.getEmbeddedHPIC();
			int visualID = org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfiguration2EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
								childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getHWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration modelElement = (org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration) containerView
				.getElement();
		LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwplatformInstances().iterator(); it.hasNext();) {
			org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance childElement = (org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance) it
					.next();
			int visualID = org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getResources().iterator(); it.hasNext();) {
			org.muml.pm.hardware.hwresourceinstance.ResourceInstance childElement = (org.muml.pm.hardware.hwresourceinstance.ResourceInstance) it
					.next();
			int visualID = org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pm.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID) {
				result.add(
						new org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pm.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID) {
				result.add(
						new org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pm.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID) {
				result.add(
						new org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNetworkingHardwareInstances().iterator(); it.hasNext();) {
			org.muml.pm.hardware.hwplatforminstance.NetworkingHardwareInstance childElement = (org.muml.pm.hardware.hwplatforminstance.NetworkingHardwareInstance) it
					.next();
			int visualID = org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pm.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart.VISUAL_ID) {
				result.add(
						new org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkBridgeInstanceEditPart.VISUAL_ID) {
				result.add(
						new org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getHWPlatformInstanceHWPlatformCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance modelElement = (org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance) containerView
				.getElement();
		LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		{
			org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration childElement = modelElement
					.getEmbeddedHPIC();
			int visualID = org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfiguration2EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
								childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getContainedLinks(
			View view) {
		switch (org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart.VISUAL_ID:
			return getHWPlatformInstanceConfiguration_1000ContainedLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID:
			return getHWPlatformInstance_2005ContainedLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfiguration2EditPart.VISUAL_ID:
			return getHWPlatformInstanceConfiguration_3039ContainedLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID:
			return getHWPlatformInstance_3040ContainedLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart.VISUAL_ID:
			return getDelegationHWPortInstance_3041ContainedLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_3042ContainedLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart.VISUAL_ID:
			return getHWPortInstance_3043ContainedLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_3044ContainedLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_3045ContainedLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart.VISUAL_ID:
			return getBusInstance_3046ContainedLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkBridgeInstanceEditPart.VISUAL_ID:
			return getNetworkBridgeInstance_3047ContainedLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkConnectorInstanceEditPart.VISUAL_ID:
			return getNetworkConnectorInstance_4012ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getIncomingLinks(
			View view) {
		switch (org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID:
			return getHWPlatformInstance_2005IncomingLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfiguration2EditPart.VISUAL_ID:
			return getHWPlatformInstanceConfiguration_3039IncomingLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID:
			return getHWPlatformInstance_3040IncomingLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart.VISUAL_ID:
			return getDelegationHWPortInstance_3041IncomingLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_3042IncomingLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart.VISUAL_ID:
			return getHWPortInstance_3043IncomingLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_3044IncomingLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_3045IncomingLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart.VISUAL_ID:
			return getBusInstance_3046IncomingLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkBridgeInstanceEditPart.VISUAL_ID:
			return getNetworkBridgeInstance_3047IncomingLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkConnectorInstanceEditPart.VISUAL_ID:
			return getNetworkConnectorInstance_4012IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID:
			return getHWPlatformInstance_2005OutgoingLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfiguration2EditPart.VISUAL_ID:
			return getHWPlatformInstanceConfiguration_3039OutgoingLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID:
			return getHWPlatformInstance_3040OutgoingLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart.VISUAL_ID:
			return getDelegationHWPortInstance_3041OutgoingLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_3042OutgoingLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart.VISUAL_ID:
			return getHWPortInstance_3043OutgoingLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_3044OutgoingLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_3045OutgoingLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart.VISUAL_ID:
			return getBusInstance_3046OutgoingLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkBridgeInstanceEditPart.VISUAL_ID:
			return getNetworkBridgeInstance_3047OutgoingLinks(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkConnectorInstanceEditPart.VISUAL_ID:
			return getNetworkConnectorInstance_4012OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstanceConfiguration_1000ContainedLinks(
			View view) {
		org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration modelElement = (org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration) view
				.getElement();
		LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_NetworkConnectorInstance_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstance_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstanceConfiguration_3039ContainedLinks(
			View view) {
		org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration modelElement = (org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration) view
				.getElement();
		LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_NetworkConnectorInstance_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstance_3040ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getDelegationHWPortInstance_3041ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getStructuredResourceInstance_3042ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPortInstance_3043ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getActuatorInstance_3044ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getSensorInstance_3045ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBusInstance_3046ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getNetworkBridgeInstance_3047ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getNetworkConnectorInstance_4012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstance_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstanceConfiguration_3039IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstance_3040IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getDelegationHWPortInstance_3041IncomingLinks(
			View view) {
		org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance modelElement = (org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NetworkConnectorInstance_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getStructuredResourceInstance_3042IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPortInstance_3043IncomingLinks(
			View view) {
		org.muml.pm.hardware.hwplatforminstance.HWPortInstance modelElement = (org.muml.pm.hardware.hwplatforminstance.HWPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NetworkConnectorInstance_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getActuatorInstance_3044IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getSensorInstance_3045IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBusInstance_3046IncomingLinks(
			View view) {
		org.muml.pm.hardware.hwplatforminstance.BusInstance modelElement = (org.muml.pm.hardware.hwplatforminstance.BusInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NetworkConnectorInstance_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getNetworkBridgeInstance_3047IncomingLinks(
			View view) {
		org.muml.pm.hardware.hwplatforminstance.NetworkBridgeInstance modelElement = (org.muml.pm.hardware.hwplatforminstance.NetworkBridgeInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NetworkConnectorInstance_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getNetworkConnectorInstance_4012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstance_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstanceConfiguration_3039OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstance_3040OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getDelegationHWPortInstance_3041OutgoingLinks(
			View view) {
		org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance modelElement = (org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance) view
				.getElement();
		LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NetworkConnectorInstance_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getStructuredResourceInstance_3042OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPortInstance_3043OutgoingLinks(
			View view) {
		org.muml.pm.hardware.hwplatforminstance.HWPortInstance modelElement = (org.muml.pm.hardware.hwplatforminstance.HWPortInstance) view
				.getElement();
		LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NetworkConnectorInstance_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getActuatorInstance_3044OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getSensorInstance_3045OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBusInstance_3046OutgoingLinks(
			View view) {
		org.muml.pm.hardware.hwplatforminstance.BusInstance modelElement = (org.muml.pm.hardware.hwplatforminstance.BusInstance) view
				.getElement();
		LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NetworkConnectorInstance_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getNetworkBridgeInstance_3047OutgoingLinks(
			View view) {
		org.muml.pm.hardware.hwplatforminstance.NetworkBridgeInstance modelElement = (org.muml.pm.hardware.hwplatforminstance.NetworkBridgeInstance) view
				.getElement();
		LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NetworkConnectorInstance_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getNetworkConnectorInstance_4012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getContainedTypeModelFacetLinks_NetworkConnectorInstance_4012(
			org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration container) {
		LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getNetworkConnectorInstances().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance) {
				continue;
			}
			org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance link = (org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance) linkObject;
			if (org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkConnectorInstanceEditPart.VISUAL_ID != org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpointInstances();
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof org.muml.pim.connector.ConnectorEndpointInstance) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpointInstance dst = (org.muml.pim.connector.ConnectorEndpointInstance) theTarget;
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpointInstance) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpointInstance src = (org.muml.pim.connector.ConnectorEndpointInstance) theSource;
			result.add(new org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor(
					src, dst, link,
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.NetworkConnectorInstance_4012,
					org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getIncomingTypeModelFacetLinks_NetworkConnectorInstance_4012(
			org.muml.pim.connector.ConnectorEndpointInstance target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getConnectorInstance_ConnectorEndpointInstances()
					|| false == setting
							.getEObject() instanceof org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance) {
				continue;
			}
			org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance link = (org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance) setting
					.getEObject();
			if (org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkConnectorInstanceEditPart.VISUAL_ID != org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpointInstance) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpointInstance src = (org.muml.pim.connector.ConnectorEndpointInstance) theSource;
			result.add(new org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor(
					src, target, link,
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.NetworkConnectorInstance_4012,
					org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getOutgoingTypeModelFacetLinks_NetworkConnectorInstance_4012(
			org.muml.pim.connector.ConnectorEndpointInstance source) {
		org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration) {
				container = (org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getNetworkConnectorInstances().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance) {
				continue;
			}
			org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance link = (org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance) linkObject;
			if (org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkConnectorInstanceEditPart.VISUAL_ID != org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpointInstances();
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof org.muml.pim.connector.ConnectorEndpointInstance) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpointInstance dst = (org.muml.pim.connector.ConnectorEndpointInstance) theTarget;
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpointInstance) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpointInstance src = (org.muml.pim.connector.ConnectorEndpointInstance) theSource;
			if (src != source) {
				continue;
			}
			result.add(new org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor(
					src, dst, link,
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.NetworkConnectorInstance_4012,
					org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkConnectorInstanceEditPart.VISUAL_ID));
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

		public List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getSemanticChildren(
				View view) {
			return HardwareDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getContainedLinks(
				View view) {
			return HardwareDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getIncomingLinks(
				View view) {
			return HardwareDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getOutgoingLinks(
				View view) {
			return HardwareDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
