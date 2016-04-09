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
import org.muml.pim.connector.ConnectorEndpointInstance;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pm.hardware.hwplatforminstance.BusInstance;
import org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HWPortInstance;
import org.muml.pm.hardware.hwplatforminstance.NetworkBridgeInstance;
import org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance;
import org.muml.pm.hardware.hwplatforminstance.NetworkingHardwareInstance;
import org.muml.pm.hardware.hwresourceinstance.ActuatorInstance;
import org.muml.pm.hardware.hwresourceinstance.HWPort;
import org.muml.pm.hardware.hwresourceinstance.ResourceInstance;
import org.muml.pm.hardware.hwresourceinstance.SensorInstance;
import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfiguration2EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartmentEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartment2EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartmentEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkBridgeInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkConnectorInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes;

/**
 * @generated
 */
public class HardwareDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getSemanticChildren(View view) {
		switch (HardwareVisualIDRegistry.getVisualID(view)) {
		case HWPlatformInstanceConfigurationEditPart.VISUAL_ID:
			return getHWPlatformInstanceConfiguration_1000SemanticChildren(view);
		case HWPlatformInstanceEditPart.VISUAL_ID:
			return getHWPlatformInstance_2005SemanticChildren(view);
		case HWPlatformInstance2EditPart.VISUAL_ID:
			return getHWPlatformInstance_3040SemanticChildren(view);
		case StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_3042SemanticChildren(view);
		case ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_3044SemanticChildren(view);
		case SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_3045SemanticChildren(view);
		case HWPlatformInstanceHWPlatformCompartmentEditPart.VISUAL_ID:
			return getHWPlatformInstanceHWPlatformCompartment_7012SemanticChildren(view);
		case HWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID:
			return getHWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartment_7013SemanticChildren(
					view);
		case HWPlatformInstanceHWPlatformCompartment2EditPart.VISUAL_ID:
			return getHWPlatformInstanceHWPlatformCompartment_7014SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getHWPlatformInstanceConfiguration_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		HWPlatformInstanceConfiguration modelElement = (HWPlatformInstanceConfiguration) view.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwplatformInstances().iterator(); it.hasNext();) {
			HWPlatformInstance childElement = (HWPlatformInstance) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HWPlatformInstanceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getHWPlatformInstance_2005SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		HWPlatformInstance modelElement = (HWPlatformInstance) view.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDelegationPorts().iterator(); it.hasNext();) {
			DelegationHWPortInstance childElement = (DelegationHWPortInstance) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DelegationHWPortInstanceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getHWPlatformInstance_3040SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		HWPlatformInstance modelElement = (HWPlatformInstance) view.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDelegationPorts().iterator(); it.hasNext();) {
			DelegationHWPortInstance childElement = (DelegationHWPortInstance) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DelegationHWPortInstanceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getStructuredResourceInstance_3042SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		StructuredResourceInstance modelElement = (StructuredResourceInstance) view.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwports().iterator(); it.hasNext();) {
			HWPort childElement = (HWPort) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HWPortInstanceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getActuatorInstance_3044SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ActuatorInstance modelElement = (ActuatorInstance) view.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwports().iterator(); it.hasNext();) {
			HWPort childElement = (HWPort) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HWPortInstanceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getSensorInstance_3045SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SensorInstance modelElement = (SensorInstance) view.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwports().iterator(); it.hasNext();) {
			HWPort childElement = (HWPort) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HWPortInstanceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getHWPlatformInstanceHWPlatformCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		HWPlatformInstance modelElement = (HWPlatformInstance) containerView.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();
		{
			HWPlatformInstanceConfiguration childElement = modelElement.getEmbeddedHPIC();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HWPlatformInstanceConfiguration2EditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getHWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		HWPlatformInstanceConfiguration modelElement = (HWPlatformInstanceConfiguration) containerView.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwplatformInstances().iterator(); it.hasNext();) {
			HWPlatformInstance childElement = (HWPlatformInstance) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HWPlatformInstance2EditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getResources().iterator(); it.hasNext();) {
			ResourceInstance childElement = (ResourceInstance) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StructuredResourceInstanceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActuatorInstanceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SensorInstanceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNetworkingHardwareInstances().iterator(); it.hasNext();) {
			NetworkingHardwareInstance childElement = (NetworkingHardwareInstance) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == BusInstanceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NetworkBridgeInstanceEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getHWPlatformInstanceHWPlatformCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		HWPlatformInstance modelElement = (HWPlatformInstance) containerView.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();
		{
			HWPlatformInstanceConfiguration childElement = modelElement.getEmbeddedHPIC();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HWPlatformInstanceConfiguration2EditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getContainedLinks(View view) {
		switch (HardwareVisualIDRegistry.getVisualID(view)) {
		case HWPlatformInstanceConfigurationEditPart.VISUAL_ID:
			return getHWPlatformInstanceConfiguration_1000ContainedLinks(view);
		case HWPlatformInstanceEditPart.VISUAL_ID:
			return getHWPlatformInstance_2005ContainedLinks(view);
		case HWPlatformInstanceConfiguration2EditPart.VISUAL_ID:
			return getHWPlatformInstanceConfiguration_3039ContainedLinks(view);
		case HWPlatformInstance2EditPart.VISUAL_ID:
			return getHWPlatformInstance_3040ContainedLinks(view);
		case DelegationHWPortInstanceEditPart.VISUAL_ID:
			return getDelegationHWPortInstance_3041ContainedLinks(view);
		case StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_3042ContainedLinks(view);
		case HWPortInstanceEditPart.VISUAL_ID:
			return getHWPortInstance_3043ContainedLinks(view);
		case ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_3044ContainedLinks(view);
		case SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_3045ContainedLinks(view);
		case BusInstanceEditPart.VISUAL_ID:
			return getBusInstance_3046ContainedLinks(view);
		case NetworkBridgeInstanceEditPart.VISUAL_ID:
			return getNetworkBridgeInstance_3047ContainedLinks(view);
		case NetworkConnectorInstanceEditPart.VISUAL_ID:
			return getNetworkConnectorInstance_4012ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getIncomingLinks(View view) {
		switch (HardwareVisualIDRegistry.getVisualID(view)) {
		case HWPlatformInstanceEditPart.VISUAL_ID:
			return getHWPlatformInstance_2005IncomingLinks(view);
		case HWPlatformInstanceConfiguration2EditPart.VISUAL_ID:
			return getHWPlatformInstanceConfiguration_3039IncomingLinks(view);
		case HWPlatformInstance2EditPart.VISUAL_ID:
			return getHWPlatformInstance_3040IncomingLinks(view);
		case DelegationHWPortInstanceEditPart.VISUAL_ID:
			return getDelegationHWPortInstance_3041IncomingLinks(view);
		case StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_3042IncomingLinks(view);
		case HWPortInstanceEditPart.VISUAL_ID:
			return getHWPortInstance_3043IncomingLinks(view);
		case ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_3044IncomingLinks(view);
		case SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_3045IncomingLinks(view);
		case BusInstanceEditPart.VISUAL_ID:
			return getBusInstance_3046IncomingLinks(view);
		case NetworkBridgeInstanceEditPart.VISUAL_ID:
			return getNetworkBridgeInstance_3047IncomingLinks(view);
		case NetworkConnectorInstanceEditPart.VISUAL_ID:
			return getNetworkConnectorInstance_4012IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getOutgoingLinks(View view) {
		switch (HardwareVisualIDRegistry.getVisualID(view)) {
		case HWPlatformInstanceEditPart.VISUAL_ID:
			return getHWPlatformInstance_2005OutgoingLinks(view);
		case HWPlatformInstanceConfiguration2EditPart.VISUAL_ID:
			return getHWPlatformInstanceConfiguration_3039OutgoingLinks(view);
		case HWPlatformInstance2EditPart.VISUAL_ID:
			return getHWPlatformInstance_3040OutgoingLinks(view);
		case DelegationHWPortInstanceEditPart.VISUAL_ID:
			return getDelegationHWPortInstance_3041OutgoingLinks(view);
		case StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_3042OutgoingLinks(view);
		case HWPortInstanceEditPart.VISUAL_ID:
			return getHWPortInstance_3043OutgoingLinks(view);
		case ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_3044OutgoingLinks(view);
		case SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_3045OutgoingLinks(view);
		case BusInstanceEditPart.VISUAL_ID:
			return getBusInstance_3046OutgoingLinks(view);
		case NetworkBridgeInstanceEditPart.VISUAL_ID:
			return getNetworkBridgeInstance_3047OutgoingLinks(view);
		case NetworkConnectorInstanceEditPart.VISUAL_ID:
			return getNetworkConnectorInstance_4012OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPlatformInstanceConfiguration_1000ContainedLinks(View view) {
		HWPlatformInstanceConfiguration modelElement = (HWPlatformInstanceConfiguration) view.getElement();
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_NetworkConnectorInstance_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPlatformInstance_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPlatformInstanceConfiguration_3039ContainedLinks(View view) {
		HWPlatformInstanceConfiguration modelElement = (HWPlatformInstanceConfiguration) view.getElement();
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_NetworkConnectorInstance_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPlatformInstance_3040ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getDelegationHWPortInstance_3041ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getStructuredResourceInstance_3042ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPortInstance_3043ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getActuatorInstance_3044ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getSensorInstance_3045ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getBusInstance_3046ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getNetworkBridgeInstance_3047ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getNetworkConnectorInstance_4012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPlatformInstance_2005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPlatformInstanceConfiguration_3039IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPlatformInstance_3040IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getDelegationHWPortInstance_3041IncomingLinks(View view) {
		DelegationHWPortInstance modelElement = (DelegationHWPortInstance) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NetworkConnectorInstance_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getStructuredResourceInstance_3042IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPortInstance_3043IncomingLinks(View view) {
		HWPortInstance modelElement = (HWPortInstance) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NetworkConnectorInstance_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getActuatorInstance_3044IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getSensorInstance_3045IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getBusInstance_3046IncomingLinks(View view) {
		BusInstance modelElement = (BusInstance) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NetworkConnectorInstance_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getNetworkBridgeInstance_3047IncomingLinks(View view) {
		NetworkBridgeInstance modelElement = (NetworkBridgeInstance) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NetworkConnectorInstance_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getNetworkConnectorInstance_4012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPlatformInstance_2005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPlatformInstanceConfiguration_3039OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPlatformInstance_3040OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getDelegationHWPortInstance_3041OutgoingLinks(View view) {
		DelegationHWPortInstance modelElement = (DelegationHWPortInstance) view.getElement();
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NetworkConnectorInstance_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getStructuredResourceInstance_3042OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPortInstance_3043OutgoingLinks(View view) {
		HWPortInstance modelElement = (HWPortInstance) view.getElement();
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NetworkConnectorInstance_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getActuatorInstance_3044OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getSensorInstance_3045OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getBusInstance_3046OutgoingLinks(View view) {
		BusInstance modelElement = (BusInstance) view.getElement();
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NetworkConnectorInstance_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getNetworkBridgeInstance_3047OutgoingLinks(View view) {
		NetworkBridgeInstance modelElement = (NetworkBridgeInstance) view.getElement();
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NetworkConnectorInstance_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getNetworkConnectorInstance_4012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<HardwareLinkDescriptor> getContainedTypeModelFacetLinks_NetworkConnectorInstance_4012(
			HWPlatformInstanceConfiguration container) {
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getNetworkConnectorInstances().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NetworkConnectorInstance) {
				continue;
			}
			NetworkConnectorInstance link = (NetworkConnectorInstance) linkObject;
			if (NetworkConnectorInstanceEditPart.VISUAL_ID != HardwareVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpointInstances();
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof ConnectorEndpointInstance) {
				continue;
			}
			ConnectorEndpointInstance dst = (ConnectorEndpointInstance) theTarget;
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpointInstance) {
				continue;
			}
			ConnectorEndpointInstance src = (ConnectorEndpointInstance) theSource;
			result.add(new HardwareLinkDescriptor(src, dst, link, HardwareElementTypes.NetworkConnectorInstance_4012,
					NetworkConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<HardwareLinkDescriptor> getIncomingTypeModelFacetLinks_NetworkConnectorInstance_4012(
			ConnectorEndpointInstance target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConnectorPackage.eINSTANCE
					.getConnectorInstance_ConnectorEndpointInstances()
					|| false == setting.getEObject() instanceof NetworkConnectorInstance) {
				continue;
			}
			NetworkConnectorInstance link = (NetworkConnectorInstance) setting.getEObject();
			if (NetworkConnectorInstanceEditPart.VISUAL_ID != HardwareVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpointInstance) {
				continue;
			}
			ConnectorEndpointInstance src = (ConnectorEndpointInstance) theSource;
			result.add(new HardwareLinkDescriptor(src, target, link, HardwareElementTypes.NetworkConnectorInstance_4012,
					NetworkConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<HardwareLinkDescriptor> getOutgoingTypeModelFacetLinks_NetworkConnectorInstance_4012(
			ConnectorEndpointInstance source) {
		HWPlatformInstanceConfiguration container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof HWPlatformInstanceConfiguration) {
				container = (HWPlatformInstanceConfiguration) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getNetworkConnectorInstances().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NetworkConnectorInstance) {
				continue;
			}
			NetworkConnectorInstance link = (NetworkConnectorInstance) linkObject;
			if (NetworkConnectorInstanceEditPart.VISUAL_ID != HardwareVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpointInstances();
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof ConnectorEndpointInstance) {
				continue;
			}
			ConnectorEndpointInstance dst = (ConnectorEndpointInstance) theTarget;
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpointInstance) {
				continue;
			}
			ConnectorEndpointInstance src = (ConnectorEndpointInstance) theSource;
			if (src != source) {
				continue;
			}
			result.add(new HardwareLinkDescriptor(src, dst, link, HardwareElementTypes.NetworkConnectorInstance_4012,
					NetworkConnectorInstanceEditPart.VISUAL_ID));
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
