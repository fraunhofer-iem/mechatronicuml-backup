package org.muml.pim.pattern.diagram.part;

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
import org.muml.mumlcore.ExtendableElement;
import org.muml.mumlcore.modelinstance.ModelElementCategory;
import org.muml.pim.behavior.Parameter;
import org.muml.pim.connector.ConnectorEndpoint;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.connector.MessageBuffer;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.pattern.CoordinationPattern;
import org.muml.pim.pattern.CoordinationPatternVariant;
import org.muml.pim.pattern.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart;
import org.muml.pim.pattern.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart;
import org.muml.pim.pattern.diagram.edit.parts.CoordinationPattern2EditPart;
import org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternEditPart;
import org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternPatternCompartmentEditPart;
import org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternVariant2EditPart;
import org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternVariantCoordinationProtocolContainerCompartmentEditPart;
import org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternVariantEditPart;
import org.muml.pim.pattern.diagram.edit.parts.DiscreteInteractionEndpointReceiverMessageBufferEditPart;
import org.muml.pim.pattern.diagram.edit.parts.MessageBufferEditPart;
import org.muml.pim.pattern.diagram.edit.parts.MessageBufferMessageBufferCompartmentEditPart;
import org.muml.pim.pattern.diagram.edit.parts.MessageTypeEditPart;
import org.muml.pim.pattern.diagram.edit.parts.MessageTypeParametersCompartmentEditPart;
import org.muml.pim.pattern.diagram.edit.parts.ModelElementCategoryEditPart;
import org.muml.pim.pattern.diagram.edit.parts.ParameterEditPart;
import org.muml.pim.pattern.diagram.edit.parts.RoleConnectorConnectorQualityOfServiceAssumptionsEditPart;
import org.muml.pim.pattern.diagram.edit.parts.RoleConnectorEditPart;
import org.muml.pim.pattern.diagram.edit.parts.RoleEditPart;
import org.muml.pim.pattern.diagram.providers.MumlElementTypes;
import org.muml.pim.protocol.AbstractCoordinationSpecification;
import org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.protocol.Role;
import org.muml.pim.protocol.RoleConnector;

/**
 * @generated
 */
public class MumlDiagramUpdater {

	/**
	* @generated
	*/
	public static List<MumlNodeDescriptor> getSemanticChildren(View view) {
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		case CoordinationPatternPatternCompartmentEditPart.VISUAL_ID:
			return getCoordinationPatternCoordinationProtocolContainerCompartment_7001SemanticChildren(view);
		case MessageBufferMessageBufferCompartmentEditPart.VISUAL_ID:
			return getMessageBufferMessageBufferCompartment_7002SemanticChildren(view);
		case MessageTypeParametersCompartmentEditPart.VISUAL_ID:
			return getMessageTypeParametersCompartment_7003SemanticChildren(view);
		case CoordinationPatternVariantCoordinationProtocolContainerCompartmentEditPart.VISUAL_ID:
			return getCoordinationPatternVariantCoordinationProtocolContainerCompartment_7004SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MumlNodeDescriptor> getModelElementCategory_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ModelElementCategory modelElement = (ModelElementCategory) view.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CoordinationPatternEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CoordinationPatternVariantEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	* @generated
	*/
	public static List<MumlNodeDescriptor> getCoordinationPatternCoordinationProtocolContainerCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CoordinationPattern modelElement = (CoordinationPattern) containerView.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		{
			AbstractCoordinationSpecification childElement = modelElement.getGmfAbstractCoordinationSpecification();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CoordinationPattern2EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getRoles().iterator(); it.hasNext();) {
			Role childElement = (Role) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RoleEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getGmfMessageBuffers().iterator(); it.hasNext();) {
			MessageBuffer childElement = (MessageBuffer) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MessageBufferEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			ConnectorQualityOfServiceAssumptions childElement = modelElement
					.getGmfConnectorQualityOfServiceAssumptions();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
			}
		}

		return result;
	}

	/**
	* @generated
	*/
	public static List<MumlNodeDescriptor> getMessageBufferMessageBufferCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MessageBuffer modelElement = (MessageBuffer) containerView.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGmfMessageTypes().iterator(); it.hasNext();) {
			MessageType childElement = (MessageType) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MessageTypeEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	* @generated
	*/
	public static List<MumlNodeDescriptor> getMessageTypeParametersCompartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MessageType modelElement = (MessageType) containerView.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	* @generated
	*/
	public static List<MumlNodeDescriptor> getCoordinationPatternVariantCoordinationProtocolContainerCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CoordinationPatternVariant modelElement = (CoordinationPatternVariant) containerView.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		{
			AbstractCoordinationSpecification childElement = modelElement.getGmfAbstractCoordinationSpecification();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CoordinationPatternVariant2EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getRoles().iterator(); it.hasNext();) {
			Role childElement = (Role) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RoleEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getGmfMessageBuffers().iterator(); it.hasNext();) {
			MessageBuffer childElement = (MessageBuffer) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MessageBufferEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			ConnectorQualityOfServiceAssumptions childElement = modelElement
					.getGmfConnectorQualityOfServiceAssumptions();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
			}
		}

		return result;
	}

	/**
	* @generated
	*/
	public static List<MumlLinkDescriptor> getContainedLinks(View view) {
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000ContainedLinks(view);
		case CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001ContainedLinks(view);
		case CoordinationPatternVariantEditPart.VISUAL_ID:
			return getCoordinationPatternVariant_2002ContainedLinks(view);
		case CoordinationPattern2EditPart.VISUAL_ID:
			return getCoordinationPattern_3003ContainedLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_3002ContainedLinks(view);
		case MessageBufferEditPart.VISUAL_ID:
			return getMessageBuffer_3004ContainedLinks(view);
		case MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3005ContainedLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3006ContainedLinks(view);
		case ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptions_3007ContainedLinks(view);
		case CoordinationPatternVariant2EditPart.VISUAL_ID:
			return getCoordinationPatternVariant_3008ContainedLinks(view);
		case RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MumlLinkDescriptor> getIncomingLinks(View view) {
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001IncomingLinks(view);
		case CoordinationPatternVariantEditPart.VISUAL_ID:
			return getCoordinationPatternVariant_2002IncomingLinks(view);
		case CoordinationPattern2EditPart.VISUAL_ID:
			return getCoordinationPattern_3003IncomingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_3002IncomingLinks(view);
		case MessageBufferEditPart.VISUAL_ID:
			return getMessageBuffer_3004IncomingLinks(view);
		case MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3005IncomingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3006IncomingLinks(view);
		case ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptions_3007IncomingLinks(view);
		case CoordinationPatternVariant2EditPart.VISUAL_ID:
			return getCoordinationPatternVariant_3008IncomingLinks(view);
		case RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MumlLinkDescriptor> getOutgoingLinks(View view) {
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001OutgoingLinks(view);
		case CoordinationPatternVariantEditPart.VISUAL_ID:
			return getCoordinationPatternVariant_2002OutgoingLinks(view);
		case CoordinationPattern2EditPart.VISUAL_ID:
			return getCoordinationPattern_3003OutgoingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_3002OutgoingLinks(view);
		case MessageBufferEditPart.VISUAL_ID:
			return getMessageBuffer_3004OutgoingLinks(view);
		case MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3005OutgoingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3006OutgoingLinks(view);
		case ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptions_3007OutgoingLinks(view);
		case CoordinationPatternVariant2EditPart.VISUAL_ID:
			return getCoordinationPatternVariant_3008OutgoingLinks(view);
		case RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getModelElementCategory_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationPattern_2001ContainedLinks(View view) {
		CoordinationPattern modelElement = (CoordinationPattern) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationPatternVariant_2002ContainedLinks(View view) {
		CoordinationPatternVariant modelElement = (CoordinationPatternVariant) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationPattern_3003ContainedLinks(View view) {
		CoordinationPattern modelElement = (CoordinationPattern) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getRole_3002ContainedLinks(View view) {
		Role modelElement = (Role) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(
				getOutgoingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getMessageBuffer_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getMessageType_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getParameter_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getConnectorQualityOfServiceAssumptions_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationPatternVariant_3008ContainedLinks(View view) {
		CoordinationPatternVariant modelElement = (CoordinationPatternVariant) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getRoleConnector_4001ContainedLinks(View view) {
		RoleConnector modelElement = (RoleConnector) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4004(
				modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationPattern_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationPatternVariant_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationPattern_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getRole_3002IncomingLinks(View view) {
		Role modelElement = (Role) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RoleConnector_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getMessageBuffer_3004IncomingLinks(View view) {
		MessageBuffer modelElement = (MessageBuffer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getMessageType_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getParameter_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getConnectorQualityOfServiceAssumptions_3007IncomingLinks(View view) {
		ConnectorQualityOfServiceAssumptions modelElement = (ConnectorQualityOfServiceAssumptions) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationPatternVariant_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getRoleConnector_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationPattern_2001OutgoingLinks(View view) {
		CoordinationPattern modelElement = (CoordinationPattern) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationPatternVariant_2002OutgoingLinks(View view) {
		CoordinationPatternVariant modelElement = (CoordinationPatternVariant) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationPattern_3003OutgoingLinks(View view) {
		CoordinationPattern modelElement = (CoordinationPattern) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getRole_3002OutgoingLinks(View view) {
		Role modelElement = (Role) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_RoleConnector_4001(modelElement));
		result.addAll(
				getOutgoingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getMessageBuffer_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getMessageType_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getParameter_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getConnectorQualityOfServiceAssumptions_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationPatternVariant_3008OutgoingLinks(View view) {
		CoordinationPatternVariant modelElement = (CoordinationPatternVariant) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getRoleConnector_4001OutgoingLinks(View view) {
		RoleConnector modelElement = (RoleConnector) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4004(
				modelElement));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getContainedTypeModelFacetLinks_RoleConnector_4001(
			AbstractCoordinationSpecification container) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		RoleConnector link = container.getRoleConnector();
		if (RoleConnectorEditPart.VISUAL_ID != MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		List targets = link.getConnectorEndpoints();
		Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
		if (false == theTarget instanceof ConnectorEndpoint) {
			return result;
		}
		ConnectorEndpoint dst = (ConnectorEndpoint) theTarget;
		List sources = link.getConnectorEndpoints();
		Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
		if (false == theSource instanceof ConnectorEndpoint) {
			return result;
		}
		ConnectorEndpoint src = (ConnectorEndpoint) theSource;
		result.add(new MumlLinkDescriptor(src, dst, link, MumlElementTypes.RoleConnector_4001,
				RoleConnectorEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getIncomingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(
			Role target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ProtocolPackage.eINSTANCE
					.getAbstractCoordinationSpecification_Roles()) {
				result.add(new MumlLinkDescriptor(setting.getEObject(), target,
						MumlElementTypes.AbstractCoordinationSpecificationRoles_4002,
						AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getIncomingTypeModelFacetLinks_RoleConnector_4001(
			ConnectorEndpoint target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConnectorPackage.eINSTANCE.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof RoleConnector) {
				continue;
			}
			RoleConnector link = (RoleConnector) setting.getEObject();
			if (RoleConnectorEditPart.VISUAL_ID != MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint src = (ConnectorEndpoint) theSource;
			result.add(new MumlLinkDescriptor(src, target, link, MumlElementTypes.RoleConnector_4001,
					RoleConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getIncomingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4003(
			MessageBuffer target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_ReceiverMessageBuffer()) {
				result.add(new MumlLinkDescriptor(setting.getEObject(), target,
						MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4003,
						DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getIncomingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4004(
			ConnectorQualityOfServiceAssumptions target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ProtocolPackage.eINSTANCE
					.getRoleConnector_ConnectorQualityOfServiceAssumptions()) {
				result.add(new MumlLinkDescriptor(setting.getEObject(), target,
						MumlElementTypes.RoleConnectorConnectorQualityOfServiceAssumptions_4004,
						RoleConnectorConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(
			AbstractCoordinationSpecification source) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		for (Iterator<?> destinations = source.getRoles().iterator(); destinations.hasNext();) {
			Role destination = (Role) destinations.next();
			result.add(new MumlLinkDescriptor(source, destination,
					MumlElementTypes.AbstractCoordinationSpecificationRoles_4002,
					AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_RoleConnector_4001(
			ConnectorEndpoint source) {
		AbstractCoordinationSpecification container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof AbstractCoordinationSpecification) {
				container = (AbstractCoordinationSpecification) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		RoleConnector link = container.getRoleConnector();
		if (RoleConnectorEditPart.VISUAL_ID != MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		List targets = link.getConnectorEndpoints();
		Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
		if (false == theTarget instanceof ConnectorEndpoint) {
			return result;
		}
		ConnectorEndpoint dst = (ConnectorEndpoint) theTarget;
		List sources = link.getConnectorEndpoints();
		Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
		if (false == theSource instanceof ConnectorEndpoint) {
			return result;
		}
		ConnectorEndpoint src = (ConnectorEndpoint) theSource;
		if (src != source) {
			return result;
		}
		result.add(new MumlLinkDescriptor(src, dst, link, MumlElementTypes.RoleConnector_4001,
				RoleConnectorEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getOutgoingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4003(
			DiscreteInteractionEndpoint source) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		for (Iterator<?> destinations = source.getReceiverMessageBuffer().iterator(); destinations.hasNext();) {
			MessageBuffer destination = (MessageBuffer) destinations.next();
			result.add(new MumlLinkDescriptor(source, destination,
					MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4003,
					DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getOutgoingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4004(
			RoleConnector source) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		ConnectorQualityOfServiceAssumptions destination = source.getConnectorQualityOfServiceAssumptions();
		if (destination == null) {
			return result;
		}
		result.add(new MumlLinkDescriptor(source, destination,
				MumlElementTypes.RoleConnectorConnectorQualityOfServiceAssumptions_4004,
				RoleConnectorConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID));
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

		public List<MumlNodeDescriptor> getSemanticChildren(View view) {
			return MumlDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MumlLinkDescriptor> getContainedLinks(View view) {
			return MumlDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MumlLinkDescriptor> getIncomingLinks(View view) {
			return MumlDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MumlLinkDescriptor> getOutgoingLinks(View view) {
			return MumlDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
