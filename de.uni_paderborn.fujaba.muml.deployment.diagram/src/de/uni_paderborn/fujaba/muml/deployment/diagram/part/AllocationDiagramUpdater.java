package de.uni_paderborn.fujaba.muml.deployment.diagram.part;

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
public class AllocationDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.VISUAL_ID:
			return getDeployment_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeEditPart.VISUAL_ID:
			return getHardwareNode_2003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationNodeDescriptor> getDeployment_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.psm.deployment.Deployment modelElement = (de.uni_paderborn.fujaba.muml.psm.deployment.Deployment) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHardwareNodes().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.psm.deployment.HardwareNode childElement = (de.uni_paderborn.fujaba.muml.psm.deployment.HardwareNode) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationNodeDescriptor> getHardwareNode_2003SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.psm.deployment.HardwareNode modelElement = (de.uni_paderborn.fujaba.muml.psm.deployment.HardwareNode) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHardwarePorts().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.psm.deployment.HardwarePort childElement = (de.uni_paderborn.fujaba.muml.psm.deployment.HardwarePort) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.VISUAL_ID:
			return getDeployment_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeEditPart.VISUAL_ID:
			return getHardwareNode_2003ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart.VISUAL_ID:
			return getHardwarePort_3003ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID:
			return getCommunicationLink_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeEditPart.VISUAL_ID:
			return getHardwareNode_2003IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart.VISUAL_ID:
			return getHardwarePort_3003IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID:
			return getCommunicationLink_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeEditPart.VISUAL_ID:
			return getHardwareNode_2003OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart.VISUAL_ID:
			return getHardwarePort_3003OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID:
			return getCommunicationLink_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> getDeployment_1000ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.psm.deployment.Deployment modelElement = (de.uni_paderborn.fujaba.muml.psm.deployment.Deployment) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_CommunicationLink_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> getHardwareNode_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> getHardwarePort_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> getCommunicationLink_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> getHardwareNode_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> getHardwarePort_3003IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.psm.deployment.HardwarePort modelElement = (de.uni_paderborn.fujaba.muml.psm.deployment.HardwarePort) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CommunicationLink_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> getCommunicationLink_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> getHardwareNode_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> getHardwarePort_3003OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.psm.deployment.HardwarePort modelElement = (de.uni_paderborn.fujaba.muml.psm.deployment.HardwarePort) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CommunicationLink_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> getCommunicationLink_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> getContainedTypeModelFacetLinks_CommunicationLink_4003(
			de.uni_paderborn.fujaba.muml.psm.deployment.Deployment container) {
		LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor>();
		for (Iterator<?> links = container.getCommunicationLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.psm.deployment.CommunicationLink) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.psm.deployment.CommunicationLink link = (de.uni_paderborn.fujaba.muml.psm.deployment.CommunicationLink) linkObject;
			if (de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
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
			result.add(new de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.deployment.diagram.providers.AllocationElementTypes.CommunicationLink_4003,
					de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> getIncomingTypeModelFacetLinks_CommunicationLink_4003(
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.psm.deployment.CommunicationLink) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.psm.deployment.CommunicationLink link = (de.uni_paderborn.fujaba.muml.psm.deployment.CommunicationLink) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.deployment.diagram.providers.AllocationElementTypes.CommunicationLink_4003,
					de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> getOutgoingTypeModelFacetLinks_CommunicationLink_4003(
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint source) {
		de.uni_paderborn.fujaba.muml.psm.deployment.Deployment container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.psm.deployment.Deployment) {
				container = (de.uni_paderborn.fujaba.muml.psm.deployment.Deployment) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor>();
		for (Iterator<?> links = container.getCommunicationLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.psm.deployment.CommunicationLink) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.psm.deployment.CommunicationLink link = (de.uni_paderborn.fujaba.muml.psm.deployment.CommunicationLink) linkObject;
			if (de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
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
			result.add(new de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.deployment.diagram.providers.AllocationElementTypes.CommunicationLink_4003,
					de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID));
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
		public List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationNodeDescriptor> getSemanticChildren(
				View view) {
			return AllocationDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> getContainedLinks(
				View view) {
			return AllocationDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> getIncomingLinks(
				View view) {
			return AllocationDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationLinkDescriptor> getOutgoingLinks(
				View view) {
			return AllocationDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
