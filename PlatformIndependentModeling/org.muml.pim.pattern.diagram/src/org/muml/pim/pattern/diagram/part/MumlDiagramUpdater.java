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
import org.muml.core.ExtendableElement;

/**
 * @generated
 */
public class MumlDiagramUpdater {

	/**
	* @generated
	*/
	public static List<org.muml.pim.pattern.diagram.part.MumlNodeDescriptor> getSemanticChildren(
			View view) {
		switch (org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case org.muml.pim.pattern.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		case org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternPatternCompartmentEditPart.VISUAL_ID:
			return getCoordinationPatternCoordinationProtocolContainerCompartment_7001SemanticChildren(view);
		case org.muml.pim.pattern.diagram.edit.parts.MessageBufferMessageBufferCompartmentEditPart.VISUAL_ID:
			return getMessageBufferMessageBufferCompartment_7002SemanticChildren(view);
		case org.muml.pim.pattern.diagram.edit.parts.MessageTypeParametersCompartmentEditPart.VISUAL_ID:
			return getMessageTypeParametersCompartment_7003SemanticChildren(view);
		case org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternVariantCoordinationProtocolContainerCompartmentEditPart.VISUAL_ID:
			return getCoordinationPatternVariantCoordinationProtocolContainerCompartment_7004SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<org.muml.pim.pattern.diagram.part.MumlNodeDescriptor> getModelElementCategory_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.core.modelinstance.ModelElementCategory modelElement = (org.muml.core.modelinstance.ModelElementCategory) view
				.getElement();
		LinkedList<org.muml.pim.pattern.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternVariantEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}

		return result;
	}

	/**
	* @generated
	*/
	public static List<org.muml.pim.pattern.diagram.part.MumlNodeDescriptor> getCoordinationPatternCoordinationProtocolContainerCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pim.pattern.CoordinationPattern modelElement = (org.muml.pim.pattern.CoordinationPattern) containerView
				.getElement();
		LinkedList<org.muml.pim.pattern.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlNodeDescriptor>();
		{
			org.muml.pim.protocol.AbstractCoordinationSpecification childElement = modelElement
					.getGmfAbstractCoordinationSpecification();
			int visualID = org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == org.muml.pim.pattern.diagram.edit.parts.CoordinationPattern2EditPart.VISUAL_ID) {
				result.add(new org.muml.pim.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
			}
		}
		for (Iterator<?> it = modelElement.getRoles().iterator(); it.hasNext();) {
			org.muml.pim.protocol.Role childElement = (org.muml.pim.protocol.Role) it
					.next();
			int visualID = org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == org.muml.pim.pattern.diagram.edit.parts.RoleEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getGmfMessageBuffers().iterator(); it.hasNext();) {
			org.muml.pim.connector.MessageBuffer childElement = (org.muml.pim.connector.MessageBuffer) it
					.next();
			int visualID = org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == org.muml.pim.pattern.diagram.edit.parts.MessageBufferEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		{
			org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions childElement = modelElement
					.getGmfConnectorQualityOfServiceAssumptions();
			int visualID = org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == org.muml.pim.pattern.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
			}
		}

		return result;
	}

	/**
	* @generated
	*/
	public static List<org.muml.pim.pattern.diagram.part.MumlNodeDescriptor> getMessageBufferMessageBufferCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pim.connector.MessageBuffer modelElement = (org.muml.pim.connector.MessageBuffer) containerView
				.getElement();
		LinkedList<org.muml.pim.pattern.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGmfMessageTypes().iterator(); it.hasNext();) {
			org.muml.pim.msgtype.MessageType childElement = (org.muml.pim.msgtype.MessageType) it
					.next();
			int visualID = org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == org.muml.pim.pattern.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}

		return result;
	}

	/**
	* @generated
	*/
	public static List<org.muml.pim.pattern.diagram.part.MumlNodeDescriptor> getMessageTypeParametersCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pim.msgtype.MessageType modelElement = (org.muml.pim.msgtype.MessageType) containerView
				.getElement();
		LinkedList<org.muml.pim.pattern.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it.hasNext();) {
			org.muml.pim.behavior.Parameter childElement = (org.muml.pim.behavior.Parameter) it
					.next();
			int visualID = org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == org.muml.pim.pattern.diagram.edit.parts.ParameterEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}

		return result;
	}

	/**
	* @generated
	*/
	public static List<org.muml.pim.pattern.diagram.part.MumlNodeDescriptor> getCoordinationPatternVariantCoordinationProtocolContainerCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pim.pattern.CoordinationPatternVariant modelElement = (org.muml.pim.pattern.CoordinationPatternVariant) containerView
				.getElement();
		LinkedList<org.muml.pim.pattern.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlNodeDescriptor>();
		{
			org.muml.pim.protocol.AbstractCoordinationSpecification childElement = modelElement
					.getGmfAbstractCoordinationSpecification();
			int visualID = org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternVariant2EditPart.VISUAL_ID) {
				result.add(new org.muml.pim.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
			}
		}
		for (Iterator<?> it = modelElement.getRoles().iterator(); it.hasNext();) {
			org.muml.pim.protocol.Role childElement = (org.muml.pim.protocol.Role) it
					.next();
			int visualID = org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == org.muml.pim.pattern.diagram.edit.parts.RoleEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getGmfMessageBuffers().iterator(); it.hasNext();) {
			org.muml.pim.connector.MessageBuffer childElement = (org.muml.pim.connector.MessageBuffer) it
					.next();
			int visualID = org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == org.muml.pim.pattern.diagram.edit.parts.MessageBufferEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		{
			org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions childElement = modelElement
					.getGmfConnectorQualityOfServiceAssumptions();
			int visualID = org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == org.muml.pim.pattern.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
			}
		}

		return result;
	}

	/**
	* @generated
	*/
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getContainedLinks(
			View view) {
		switch (org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case org.muml.pim.pattern.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000ContainedLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001ContainedLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternVariantEditPart.VISUAL_ID:
			return getCoordinationPatternVariant_2002ContainedLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.CoordinationPattern2EditPart.VISUAL_ID:
			return getCoordinationPattern_3003ContainedLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_3002ContainedLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.MessageBufferEditPart.VISUAL_ID:
			return getMessageBuffer_3004ContainedLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3005ContainedLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getParameter_3006ContainedLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptions_3007ContainedLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternVariant2EditPart.VISUAL_ID:
			return getCoordinationPatternVariant_3008ContainedLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getIncomingLinks(
			View view) {
		switch (org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001IncomingLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternVariantEditPart.VISUAL_ID:
			return getCoordinationPatternVariant_2002IncomingLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.CoordinationPattern2EditPart.VISUAL_ID:
			return getCoordinationPattern_3003IncomingLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_3002IncomingLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.MessageBufferEditPart.VISUAL_ID:
			return getMessageBuffer_3004IncomingLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3005IncomingLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getParameter_3006IncomingLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptions_3007IncomingLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternVariant2EditPart.VISUAL_ID:
			return getCoordinationPatternVariant_3008IncomingLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001OutgoingLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternVariantEditPart.VISUAL_ID:
			return getCoordinationPatternVariant_2002OutgoingLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.CoordinationPattern2EditPart.VISUAL_ID:
			return getCoordinationPattern_3003OutgoingLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_3002OutgoingLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.MessageBufferEditPart.VISUAL_ID:
			return getMessageBuffer_3004OutgoingLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3005OutgoingLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getParameter_3006OutgoingLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptions_3007OutgoingLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternVariant2EditPart.VISUAL_ID:
			return getCoordinationPatternVariant_3008OutgoingLinks(view);
		case org.muml.pim.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getModelElementCategory_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPattern_2001ContainedLinks(
			View view) {
		org.muml.pim.pattern.CoordinationPattern modelElement = (org.muml.pim.pattern.CoordinationPattern) view
				.getElement();
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPatternVariant_2002ContainedLinks(
			View view) {
		org.muml.pim.pattern.CoordinationPatternVariant modelElement = (org.muml.pim.pattern.CoordinationPatternVariant) view
				.getElement();
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPattern_3003ContainedLinks(
			View view) {
		org.muml.pim.pattern.CoordinationPattern modelElement = (org.muml.pim.pattern.CoordinationPattern) view
				.getElement();
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getRole_3002ContainedLinks(
			View view) {
		org.muml.pim.protocol.Role modelElement = (org.muml.pim.protocol.Role) view
				.getElement();
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(
				getOutgoingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getMessageBuffer_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getMessageType_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getParameter_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getConnectorQualityOfServiceAssumptions_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPatternVariant_3008ContainedLinks(
			View view) {
		org.muml.pim.pattern.CoordinationPatternVariant modelElement = (org.muml.pim.pattern.CoordinationPatternVariant) view
				.getElement();
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getRoleConnector_4001ContainedLinks(
			View view) {
		org.muml.pim.protocol.RoleConnector modelElement = (org.muml.pim.protocol.RoleConnector) view
				.getElement();
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4004(
				modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPattern_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPatternVariant_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPattern_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getRole_3002IncomingLinks(
			View view) {
		org.muml.pim.protocol.Role modelElement = (org.muml.pim.protocol.Role) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RoleConnector_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getMessageBuffer_3004IncomingLinks(
			View view) {
		org.muml.pim.connector.MessageBuffer modelElement = (org.muml.pim.connector.MessageBuffer) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getMessageType_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getParameter_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getConnectorQualityOfServiceAssumptions_3007IncomingLinks(
			View view) {
		org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions modelElement = (org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPatternVariant_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getRoleConnector_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPattern_2001OutgoingLinks(
			View view) {
		org.muml.pim.pattern.CoordinationPattern modelElement = (org.muml.pim.pattern.CoordinationPattern) view
				.getElement();
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPatternVariant_2002OutgoingLinks(
			View view) {
		org.muml.pim.pattern.CoordinationPatternVariant modelElement = (org.muml.pim.pattern.CoordinationPatternVariant) view
				.getElement();
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPattern_3003OutgoingLinks(
			View view) {
		org.muml.pim.pattern.CoordinationPattern modelElement = (org.muml.pim.pattern.CoordinationPattern) view
				.getElement();
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getRole_3002OutgoingLinks(
			View view) {
		org.muml.pim.protocol.Role modelElement = (org.muml.pim.protocol.Role) view
				.getElement();
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_RoleConnector_4001(modelElement));
		result.addAll(
				getOutgoingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getMessageBuffer_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getMessageType_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getParameter_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getConnectorQualityOfServiceAssumptions_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPatternVariant_3008OutgoingLinks(
			View view) {
		org.muml.pim.pattern.CoordinationPatternVariant modelElement = (org.muml.pim.pattern.CoordinationPatternVariant) view
				.getElement();
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getRoleConnector_4001OutgoingLinks(
			View view) {
		org.muml.pim.protocol.RoleConnector modelElement = (org.muml.pim.protocol.RoleConnector) view
				.getElement();
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4004(
				modelElement));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_RoleConnector_4001(
			org.muml.pim.protocol.AbstractCoordinationSpecification container) {
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		org.muml.pim.protocol.RoleConnector link = container.getRoleConnector();
		if (org.muml.pim.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		List targets = link.getConnectorEndpoints();
		Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
		if (false == theTarget instanceof org.muml.pim.connector.ConnectorEndpoint) {
			return result;
		}
		org.muml.pim.connector.ConnectorEndpoint dst = (org.muml.pim.connector.ConnectorEndpoint) theTarget;
		List sources = link.getConnectorEndpoints();
		Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
		if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpoint) {
			return result;
		}
		org.muml.pim.connector.ConnectorEndpoint src = (org.muml.pim.connector.ConnectorEndpoint) theSource;
		result.add(new org.muml.pim.pattern.diagram.part.MumlLinkDescriptor(src, dst, link,
				org.muml.pim.pattern.diagram.providers.MumlElementTypes.RoleConnector_4001,
				org.muml.pim.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getIncomingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(
			org.muml.pim.protocol.Role target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.muml.pim.protocol.ProtocolPackage.eINSTANCE
					.getAbstractCoordinationSpecification_Roles()) {
				result.add(new org.muml.pim.pattern.diagram.part.MumlLinkDescriptor(
						setting.getEObject(), target,
						org.muml.pim.pattern.diagram.providers.MumlElementTypes.AbstractCoordinationSpecificationRoles_4002,
						org.muml.pim.pattern.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getIncomingTypeModelFacetLinks_RoleConnector_4001(
			org.muml.pim.connector.ConnectorEndpoint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof org.muml.pim.protocol.RoleConnector) {
				continue;
			}
			org.muml.pim.protocol.RoleConnector link = (org.muml.pim.protocol.RoleConnector) setting
					.getEObject();
			if (org.muml.pim.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint src = (org.muml.pim.connector.ConnectorEndpoint) theSource;
			result.add(new org.muml.pim.pattern.diagram.part.MumlLinkDescriptor(src, target, link,
					org.muml.pim.pattern.diagram.providers.MumlElementTypes.RoleConnector_4001,
					org.muml.pim.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getIncomingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4003(
			org.muml.pim.connector.MessageBuffer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_ReceiverMessageBuffer()) {
				result.add(new org.muml.pim.pattern.diagram.part.MumlLinkDescriptor(
						setting.getEObject(), target,
						org.muml.pim.pattern.diagram.providers.MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4003,
						org.muml.pim.pattern.diagram.edit.parts.DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getIncomingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4004(
			org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.muml.pim.protocol.ProtocolPackage.eINSTANCE
					.getRoleConnector_ConnectorQualityOfServiceAssumptions()) {
				result.add(new org.muml.pim.pattern.diagram.part.MumlLinkDescriptor(
						setting.getEObject(), target,
						org.muml.pim.pattern.diagram.providers.MumlElementTypes.RoleConnectorConnectorQualityOfServiceAssumptions_4004,
						org.muml.pim.pattern.diagram.edit.parts.RoleConnectorConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(
			org.muml.pim.protocol.AbstractCoordinationSpecification source) {
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> destinations = source.getRoles().iterator(); destinations.hasNext();) {
			org.muml.pim.protocol.Role destination = (org.muml.pim.protocol.Role) destinations
					.next();
			result.add(new org.muml.pim.pattern.diagram.part.MumlLinkDescriptor(source, destination,
					org.muml.pim.pattern.diagram.providers.MumlElementTypes.AbstractCoordinationSpecificationRoles_4002,
					org.muml.pim.pattern.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_RoleConnector_4001(
			org.muml.pim.connector.ConnectorEndpoint source) {
		org.muml.pim.protocol.AbstractCoordinationSpecification container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof org.muml.pim.protocol.AbstractCoordinationSpecification) {
				container = (org.muml.pim.protocol.AbstractCoordinationSpecification) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		org.muml.pim.protocol.RoleConnector link = container.getRoleConnector();
		if (org.muml.pim.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		List targets = link.getConnectorEndpoints();
		Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
		if (false == theTarget instanceof org.muml.pim.connector.ConnectorEndpoint) {
			return result;
		}
		org.muml.pim.connector.ConnectorEndpoint dst = (org.muml.pim.connector.ConnectorEndpoint) theTarget;
		List sources = link.getConnectorEndpoints();
		Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
		if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpoint) {
			return result;
		}
		org.muml.pim.connector.ConnectorEndpoint src = (org.muml.pim.connector.ConnectorEndpoint) theSource;
		if (src != source) {
			return result;
		}
		result.add(new org.muml.pim.pattern.diagram.part.MumlLinkDescriptor(src, dst, link,
				org.muml.pim.pattern.diagram.providers.MumlElementTypes.RoleConnector_4001,
				org.muml.pim.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getOutgoingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4003(
			org.muml.pim.connector.DiscreteInteractionEndpoint source) {
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> destinations = source.getReceiverMessageBuffer().iterator(); destinations.hasNext();) {
			org.muml.pim.connector.MessageBuffer destination = (org.muml.pim.connector.MessageBuffer) destinations
					.next();
			result.add(new org.muml.pim.pattern.diagram.part.MumlLinkDescriptor(source, destination,
					org.muml.pim.pattern.diagram.providers.MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4003,
					org.muml.pim.pattern.diagram.edit.parts.DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getOutgoingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4004(
			org.muml.pim.protocol.RoleConnector source) {
		LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor>();
		org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions destination = source
				.getConnectorQualityOfServiceAssumptions();
		if (destination == null) {
			return result;
		}
		result.add(new org.muml.pim.pattern.diagram.part.MumlLinkDescriptor(source, destination,
				org.muml.pim.pattern.diagram.providers.MumlElementTypes.RoleConnectorConnectorQualityOfServiceAssumptions_4004,
				org.muml.pim.pattern.diagram.edit.parts.RoleConnectorConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID));
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

		public List<org.muml.pim.pattern.diagram.part.MumlNodeDescriptor> getSemanticChildren(
				View view) {
			return MumlDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getContainedLinks(View view) {
			return MumlDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getIncomingLinks(View view) {
			return MumlDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<org.muml.pim.pattern.diagram.part.MumlLinkDescriptor> getOutgoingLinks(View view) {
			return MumlDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
