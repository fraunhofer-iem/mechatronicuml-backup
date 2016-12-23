package org.muml.pm.hardware.platform.diagram.part;

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
import org.muml.pim.connector.ConnectorEndpoint;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pm.hardware.hwplatform.Bus;
import org.muml.pm.hardware.hwplatform.DelegationHWPort;
import org.muml.pm.hardware.hwplatform.HWPlatform;
import org.muml.pm.hardware.hwplatform.HWPlatformPart;
import org.muml.pm.hardware.hwplatform.HWPortPart;
import org.muml.pm.hardware.hwplatform.NetworkBridge;
import org.muml.pm.hardware.hwplatform.NetworkConnector;
import org.muml.pm.hardware.hwplatform.NetworkingHardware;
import org.muml.pm.hardware.hwplatform.PlatformPart;
import org.muml.pm.hardware.hwplatform.ResourcePart;
import org.muml.pm.hardware.platform.diagram.edit.parts.BusEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatform2EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformHWPlatformCompartmentEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPortPartEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.NetworkConnectorEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.ResourcePartEditPart;
import org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes;

/**
 * @generated
 */
public class HardwareDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getSemanticChildren(View view) {
		switch (HardwareVisualIDRegistry.getVisualID(view)) {
		case HWPlatformEditPart.VISUAL_ID:
			return getHWPlatform_1000SemanticChildren(view);
		case HWPlatform2EditPart.VISUAL_ID:
			return getHWPlatform_2009SemanticChildren(view);
		case HWPlatformPartEditPart.VISUAL_ID:
			return getHWPlatformPart_3027SemanticChildren(view);
		case ResourcePartEditPart.VISUAL_ID:
			return getResourcePart_3030SemanticChildren(view);
		case HWPlatformHWPlatformCompartmentEditPart.VISUAL_ID:
			return getHWPlatformHWPlatformCompartment_7003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getHWPlatform_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		HWPlatform modelElement = (HWPlatform) view.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();

		if (HardwareVisualIDRegistry.getNodeVisualID(view, modelElement) == HWPlatform2EditPart.VISUAL_ID) {
			result.add(new HardwareNodeDescriptor(modelElement, HWPlatform2EditPart.VISUAL_ID));
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getHWPlatform_2009SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		HWPlatform modelElement = (HWPlatform) view.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDelegationPorts().iterator(); it.hasNext();) {
			DelegationHWPort childElement = (DelegationHWPort) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DelegationHWPortEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getHWPlatformPart_3027SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		HWPlatformPart modelElement = (HWPlatformPart) view.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwPortParts().iterator(); it.hasNext();) {
			HWPortPart childElement = (HWPortPart) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HWPortPartEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getResourcePart_3030SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ResourcePart modelElement = (ResourcePart) view.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwPortParts().iterator(); it.hasNext();) {
			HWPortPart childElement = (HWPortPart) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HWPortPartEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareNodeDescriptor> getHWPlatformHWPlatformCompartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		HWPlatform modelElement = (HWPlatform) containerView.getElement();
		LinkedList<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNetworkingHardware().iterator(); it.hasNext();) {
			NetworkingHardware childElement = (NetworkingHardware) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == BusEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NetworkBridgeEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEmbeddedPlatformParts().iterator(); it.hasNext();) {
			PlatformPart childElement = (PlatformPart) it.next();
			int visualID = HardwareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HWPlatformPartEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ResourcePartEditPart.VISUAL_ID) {
				result.add(new HardwareNodeDescriptor(childElement, visualID));
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
	public static List<HardwareLinkDescriptor> getContainedLinks(View view) {
		switch (HardwareVisualIDRegistry.getVisualID(view)) {
		case HWPlatformEditPart.VISUAL_ID:
			return getHWPlatform_1000ContainedLinks(view);
		case HWPlatform2EditPart.VISUAL_ID:
			return getHWPlatform_2009ContainedLinks(view);
		case BusEditPart.VISUAL_ID:
			return getBus_3025ContainedLinks(view);
		case NetworkBridgeEditPart.VISUAL_ID:
			return getNetworkBridge_3026ContainedLinks(view);
		case HWPlatformPartEditPart.VISUAL_ID:
			return getHWPlatformPart_3027ContainedLinks(view);
		case HWPortPartEditPart.VISUAL_ID:
			return getHWPortPart_3028ContainedLinks(view);
		case DelegationHWPortEditPart.VISUAL_ID:
			return getDelegationHWPort_3029ContainedLinks(view);
		case ResourcePartEditPart.VISUAL_ID:
			return getResourcePart_3030ContainedLinks(view);
		case NetworkConnectorEditPart.VISUAL_ID:
			return getNetworkConnector_4032ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getIncomingLinks(View view) {
		switch (HardwareVisualIDRegistry.getVisualID(view)) {
		case HWPlatform2EditPart.VISUAL_ID:
			return getHWPlatform_2009IncomingLinks(view);
		case BusEditPart.VISUAL_ID:
			return getBus_3025IncomingLinks(view);
		case NetworkBridgeEditPart.VISUAL_ID:
			return getNetworkBridge_3026IncomingLinks(view);
		case HWPlatformPartEditPart.VISUAL_ID:
			return getHWPlatformPart_3027IncomingLinks(view);
		case HWPortPartEditPart.VISUAL_ID:
			return getHWPortPart_3028IncomingLinks(view);
		case DelegationHWPortEditPart.VISUAL_ID:
			return getDelegationHWPort_3029IncomingLinks(view);
		case ResourcePartEditPart.VISUAL_ID:
			return getResourcePart_3030IncomingLinks(view);
		case NetworkConnectorEditPart.VISUAL_ID:
			return getNetworkConnector_4032IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getOutgoingLinks(View view) {
		switch (HardwareVisualIDRegistry.getVisualID(view)) {
		case HWPlatform2EditPart.VISUAL_ID:
			return getHWPlatform_2009OutgoingLinks(view);
		case BusEditPart.VISUAL_ID:
			return getBus_3025OutgoingLinks(view);
		case NetworkBridgeEditPart.VISUAL_ID:
			return getNetworkBridge_3026OutgoingLinks(view);
		case HWPlatformPartEditPart.VISUAL_ID:
			return getHWPlatformPart_3027OutgoingLinks(view);
		case HWPortPartEditPart.VISUAL_ID:
			return getHWPortPart_3028OutgoingLinks(view);
		case DelegationHWPortEditPart.VISUAL_ID:
			return getDelegationHWPort_3029OutgoingLinks(view);
		case ResourcePartEditPart.VISUAL_ID:
			return getResourcePart_3030OutgoingLinks(view);
		case NetworkConnectorEditPart.VISUAL_ID:
			return getNetworkConnector_4032OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPlatform_1000ContainedLinks(View view) {
		HWPlatform modelElement = (HWPlatform) view.getElement();
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_NetworkConnector_4032(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPlatform_2009ContainedLinks(View view) {
		HWPlatform modelElement = (HWPlatform) view.getElement();
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_NetworkConnector_4032(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getBus_3025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getNetworkBridge_3026ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPlatformPart_3027ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPortPart_3028ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getDelegationHWPort_3029ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getResourcePart_3030ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getNetworkConnector_4032ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPlatform_2009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getBus_3025IncomingLinks(View view) {
		Bus modelElement = (Bus) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NetworkConnector_4032(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getNetworkBridge_3026IncomingLinks(View view) {
		NetworkBridge modelElement = (NetworkBridge) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NetworkConnector_4032(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPlatformPart_3027IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPortPart_3028IncomingLinks(View view) {
		HWPortPart modelElement = (HWPortPart) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NetworkConnector_4032(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getDelegationHWPort_3029IncomingLinks(View view) {
		DelegationHWPort modelElement = (DelegationHWPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NetworkConnector_4032(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getResourcePart_3030IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getNetworkConnector_4032IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPlatform_2009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getBus_3025OutgoingLinks(View view) {
		Bus modelElement = (Bus) view.getElement();
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NetworkConnector_4032(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getNetworkBridge_3026OutgoingLinks(View view) {
		NetworkBridge modelElement = (NetworkBridge) view.getElement();
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NetworkConnector_4032(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPlatformPart_3027OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getHWPortPart_3028OutgoingLinks(View view) {
		HWPortPart modelElement = (HWPortPart) view.getElement();
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NetworkConnector_4032(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getDelegationHWPort_3029OutgoingLinks(View view) {
		DelegationHWPort modelElement = (DelegationHWPort) view.getElement();
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NetworkConnector_4032(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getResourcePart_3030OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HardwareLinkDescriptor> getNetworkConnector_4032OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<HardwareLinkDescriptor> getContainedTypeModelFacetLinks_NetworkConnector_4032(
			HWPlatform container) {
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getNetworkConnectors().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NetworkConnector) {
				continue;
			}
			NetworkConnector link = (NetworkConnector) linkObject;
			if (NetworkConnectorEditPart.VISUAL_ID != HardwareVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint dst = (ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint src = (ConnectorEndpoint) theSource;
			result.add(new HardwareLinkDescriptor(src, dst, link, HardwareElementTypes.NetworkConnector_4032,
					NetworkConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<HardwareLinkDescriptor> getIncomingTypeModelFacetLinks_NetworkConnector_4032(
			ConnectorEndpoint target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConnectorPackage.eINSTANCE.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof NetworkConnector) {
				continue;
			}
			NetworkConnector link = (NetworkConnector) setting.getEObject();
			if (NetworkConnectorEditPart.VISUAL_ID != HardwareVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint src = (ConnectorEndpoint) theSource;
			result.add(new HardwareLinkDescriptor(src, target, link, HardwareElementTypes.NetworkConnector_4032,
					NetworkConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<HardwareLinkDescriptor> getOutgoingTypeModelFacetLinks_NetworkConnector_4032(
			ConnectorEndpoint source) {
		HWPlatform container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof HWPlatform) {
				container = (HWPlatform) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getNetworkConnectors().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NetworkConnector) {
				continue;
			}
			NetworkConnector link = (NetworkConnector) linkObject;
			if (NetworkConnectorEditPart.VISUAL_ID != HardwareVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint dst = (ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint src = (ConnectorEndpoint) theSource;
			if (src != source) {
				continue;
			}
			result.add(new HardwareLinkDescriptor(src, dst, link, HardwareElementTypes.NetworkConnector_4032,
					NetworkConnectorEditPart.VISUAL_ID));
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
