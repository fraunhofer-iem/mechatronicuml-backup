package de.uni_paderborn.fujaba.muml.patterneditor.diagram.part;

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
import org.storydriven.core.ExtendableElement;

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;

/**
 * @generated
 */
public class MumlDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationProtocolCoordinationPatternContainerCompartmentEditPart.VISUAL_ID:
			return getCoordinationProtocolCoordinationPatternContainerCompartment_7005SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor> getModelElementCategory_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ModelElementCategory modelElement = (ModelElementCategory) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it
				.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationProtocolEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor> getCoordinationProtocolCoordinationPatternContainerCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol modelElement = (de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor>();
		{
			de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol childElement = modelElement
					.getGmfCoordinationProtocol();
			int visualID = de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationProtocol2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getRoles().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.protocol.Role childElement = (de.uni_paderborn.fujaba.muml.model.protocol.Role) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationProtocolEditPart.VISUAL_ID:
			return getCoordinationProtocol_2005ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationProtocol2EditPart.VISUAL_ID:
			return getCoordinationProtocol_3005ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_3006ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationProtocolEditPart.VISUAL_ID:
			return getCoordinationProtocol_2005IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationProtocol2EditPart.VISUAL_ID:
			return getCoordinationProtocol_3005IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_3006IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationProtocolEditPart.VISUAL_ID:
			return getCoordinationProtocol_2005OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationProtocol2EditPart.VISUAL_ID:
			return getCoordinationProtocol_3005OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_3006OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getModelElementCategory_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getCoordinationProtocol_2005ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol modelElement = (de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CoordinationProtocol_Roles_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getCoordinationProtocol_3005ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol modelElement = (de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CoordinationProtocol_Roles_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getRole_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getRoleConnector_4006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getCoordinationProtocol_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getCoordinationProtocol_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getRole_3006IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.protocol.Role modelElement = (de.uni_paderborn.fujaba.muml.model.protocol.Role) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_CoordinationProtocol_Roles_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RoleConnector_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getRoleConnector_4006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getCoordinationProtocol_2005OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol modelElement = (de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CoordinationProtocol_Roles_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getCoordinationProtocol_3005OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol modelElement = (de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CoordinationProtocol_Roles_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getRole_3006OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.protocol.Role modelElement = (de.uni_paderborn.fujaba.muml.model.protocol.Role) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_RoleConnector_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getRoleConnector_4006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_RoleConnector_4006(
			de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol container) {
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor>();
		de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector link = container
				.getRoleConnector();
		if (de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		List targets = link.getConnectorEndpoints();
		Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1)
				: null; // Adapted for MUML-BUG #446
		if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
			return result;
		}
		de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theTarget;
		List sources = link.getConnectorEndpoints();
		Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
		if (false == theSource instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
			return result;
		}
		de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theSource;
		result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor(
				src,
				dst,
				link,
				de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.RoleConnector_4006,
				de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getIncomingFeatureModelFacetLinks_CoordinationProtocol_Roles_4007(
			de.uni_paderborn.fujaba.muml.model.protocol.Role target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage.eINSTANCE
					.getCoordinationProtocol_Roles()) {
				result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor(
						setting.getEObject(),
						target,
						de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.CoordinationProtocolRoles_4007,
						de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationProtocolRolesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getIncomingTypeModelFacetLinks_RoleConnector_4006(
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage.eINSTANCE
					.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector link = (de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.RoleConnector_4006,
					de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getOutgoingFeatureModelFacetLinks_CoordinationProtocol_Roles_4007(
			de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol source) {
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> destinations = source.getRoles().iterator(); destinations
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.protocol.Role destination = (de.uni_paderborn.fujaba.muml.model.protocol.Role) destinations
					.next();
			result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor(
					source,
					destination,
					de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.CoordinationProtocolRoles_4007,
					de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationProtocolRolesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_RoleConnector_4006(
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint source) {
		de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol) {
				container = (de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor>();
		de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector link = container
				.getRoleConnector();
		if (de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		List targets = link.getConnectorEndpoints();
		Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1)
				: null; // Adapted for MUML-BUG #446
		if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
			return result;
		}
		de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theTarget;
		List sources = link.getConnectorEndpoints();
		Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
		if (false == theSource instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
			return result;
		}
		de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theSource;
		if (src != source) {
			return result;
		}
		result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor(
				src,
				dst,
				link,
				de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.RoleConnector_4006,
				de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		return result;
	}

}
