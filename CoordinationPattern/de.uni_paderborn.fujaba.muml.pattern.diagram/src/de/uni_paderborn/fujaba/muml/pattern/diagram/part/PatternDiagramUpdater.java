package de.uni_paderborn.fujaba.muml.pattern.diagram.part;

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
import org.storydriven.core.ExtendableElement;

import pattern.CoordinationPattern;

/**
 * @generated
 */
public class PatternDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternPatternCompartmentEditPart.VISUAL_ID:
			return getCoordinationPatternCoordinationProtocolContainerCompartment_7001SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferMessageBufferCompartmentEditPart.VISUAL_ID:
			return getMessageBufferMessageBufferCompartment_7002SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageTypeParametersCompartmentEditPart.VISUAL_ID:
			return getMessageTypeParametersCompartment_7003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternNodeDescriptor> getModelElementCategory_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.modelinstance.ModelElementCategory modelElement = (de.uni_paderborn.fujaba.modelinstance.ModelElementCategory) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it
				.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternNodeDescriptor> getCoordinationPatternCoordinationProtocolContainerCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CoordinationPattern modelElement = (CoordinationPattern) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternNodeDescriptor>();
		{
			de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification childElement = modelElement
					.getGmfAbstractCoordinationSpecification();
			int visualID = de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPattern2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternNodeDescriptor(
						childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getRoles().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.protocol.Role childElement = (de.uni_paderborn.fujaba.muml.protocol.Role) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getGmfMessageBuffers().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.connector.MessageBuffer childElement = (de.uni_paderborn.fujaba.muml.connector.MessageBuffer) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		{
			de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions childElement = modelElement
					.getGmfConnectorQualityOfServiceAssumptions();
			int visualID = de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternNodeDescriptor(
						childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternNodeDescriptor> getMessageBufferMessageBufferCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.connector.MessageBuffer modelElement = (de.uni_paderborn.fujaba.muml.connector.MessageBuffer) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGmfMessageTypes().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.msgtype.MessageType childElement = (de.uni_paderborn.fujaba.muml.msgtype.MessageType) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternNodeDescriptor> getMessageTypeParametersCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.msgtype.MessageType modelElement = (de.uni_paderborn.fujaba.muml.msgtype.MessageType) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.behavior.Parameter childElement = (de.uni_paderborn.fujaba.muml.behavior.Parameter) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ParameterEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPattern2EditPart.VISUAL_ID:
			return getCoordinationPattern_3003ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_3002ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferEditPart.VISUAL_ID:
			return getMessageBuffer_3004ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3005ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getParameter_3006ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptions_3007ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPattern2EditPart.VISUAL_ID:
			return getCoordinationPattern_3003IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_3002IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferEditPart.VISUAL_ID:
			return getMessageBuffer_3004IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3005IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getParameter_3006IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptions_3007IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPattern2EditPart.VISUAL_ID:
			return getCoordinationPattern_3003OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_3002OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferEditPart.VISUAL_ID:
			return getMessageBuffer_3004OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3005OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getParameter_3006OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptions_3007OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getModelElementCategory_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getCoordinationPattern_2001ContainedLinks(
			View view) {
		CoordinationPattern modelElement = (CoordinationPattern) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getCoordinationPattern_3003ContainedLinks(
			View view) {
		CoordinationPattern modelElement = (CoordinationPattern) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getRole_3002ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.protocol.Role modelElement = (de.uni_paderborn.fujaba.muml.protocol.Role) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getMessageBuffer_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getMessageType_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getParameter_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getConnectorQualityOfServiceAssumptions_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getRoleConnector_4001ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.protocol.RoleConnector modelElement = (de.uni_paderborn.fujaba.muml.protocol.RoleConnector) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getCoordinationPattern_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getCoordinationPattern_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getRole_3002IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.protocol.Role modelElement = (de.uni_paderborn.fujaba.muml.protocol.Role) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RoleConnector_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getMessageBuffer_3004IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.connector.MessageBuffer modelElement = (de.uni_paderborn.fujaba.muml.connector.MessageBuffer) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getMessageType_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getParameter_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getConnectorQualityOfServiceAssumptions_3007IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions modelElement = (de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getRoleConnector_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getCoordinationPattern_2001OutgoingLinks(
			View view) {
		CoordinationPattern modelElement = (CoordinationPattern) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getCoordinationPattern_3003OutgoingLinks(
			View view) {
		CoordinationPattern modelElement = (CoordinationPattern) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getRole_3002OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.protocol.Role modelElement = (de.uni_paderborn.fujaba.muml.protocol.Role) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_RoleConnector_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getMessageBuffer_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getMessageType_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getParameter_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getConnectorQualityOfServiceAssumptions_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getRoleConnector_4001OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.protocol.RoleConnector modelElement = (de.uni_paderborn.fujaba.muml.protocol.RoleConnector) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getContainedTypeModelFacetLinks_RoleConnector_4001(
			de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification container) {
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor>();
		de.uni_paderborn.fujaba.muml.protocol.RoleConnector link = container
				.getRoleConnector();
		if (de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		List targets = link.getConnectorEndpoints();
		Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1)
				: null; // Adapted for MUML-BUG #446
		if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
			return result;
		}
		de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theTarget;
		List sources = link.getConnectorEndpoints();
		Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
		if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
			return result;
		}
		de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
		result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor(
				src,
				dst,
				link,
				de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternElementTypes.RoleConnector_4001,
				de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getIncomingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(
			de.uni_paderborn.fujaba.muml.protocol.Role target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
					.getAbstractCoordinationSpecification_Roles()) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor(
						setting.getEObject(),
						target,
						de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternElementTypes.AbstractCoordinationSpecificationRoles_4002,
						de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getIncomingTypeModelFacetLinks_RoleConnector_4001(
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.protocol.RoleConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.protocol.RoleConnector link = (de.uni_paderborn.fujaba.muml.protocol.RoleConnector) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternElementTypes.RoleConnector_4001,
					de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getIncomingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4003(
			de.uni_paderborn.fujaba.muml.connector.MessageBuffer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_ReceiverMessageBuffer()) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor(
						setting.getEObject(),
						target,
						de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4003,
						de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getIncomingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4004(
			de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
					.getRoleConnector_ConnectorQualityOfServiceAssumptions()) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor(
						setting.getEObject(),
						target,
						de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternElementTypes.RoleConnectorConnectorQualityOfServiceAssumptions_4004,
						de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(
			de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification source) {
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor>();
		for (Iterator<?> destinations = source.getRoles().iterator(); destinations
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.protocol.Role destination = (de.uni_paderborn.fujaba.muml.protocol.Role) destinations
					.next();
			result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor(
					source,
					destination,
					de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternElementTypes.AbstractCoordinationSpecificationRoles_4002,
					de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getOutgoingTypeModelFacetLinks_RoleConnector_4001(
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint source) {
		de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification) {
				container = (de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor>();
		de.uni_paderborn.fujaba.muml.protocol.RoleConnector link = container
				.getRoleConnector();
		if (de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		List targets = link.getConnectorEndpoints();
		Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1)
				: null; // Adapted for MUML-BUG #446
		if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
			return result;
		}
		de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theTarget;
		List sources = link.getConnectorEndpoints();
		Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
		if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
			return result;
		}
		de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
		if (src != source) {
			return result;
		}
		result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor(
				src,
				dst,
				link,
				de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternElementTypes.RoleConnector_4001,
				de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getOutgoingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4003(
			de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint source) {
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor>();
		for (Iterator<?> destinations = source.getReceiverMessageBuffer()
				.iterator(); destinations.hasNext();) {
			de.uni_paderborn.fujaba.muml.connector.MessageBuffer destination = (de.uni_paderborn.fujaba.muml.connector.MessageBuffer) destinations
					.next();
			result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor(
					source,
					destination,
					de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4003,
					de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getOutgoingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4004(
			de.uni_paderborn.fujaba.muml.protocol.RoleConnector source) {
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor>();
		de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions destination = source
				.getConnectorQualityOfServiceAssumptions();
		if (destination == null) {
			return result;
		}
		result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor(
				source,
				destination,
				de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternElementTypes.RoleConnectorConnectorQualityOfServiceAssumptions_4004,
				de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID));
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
		public List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternNodeDescriptor> getSemanticChildren(
				View view) {
			return PatternDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getContainedLinks(
				View view) {
			return PatternDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getIncomingLinks(
				View view) {
			return PatternDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternLinkDescriptor> getOutgoingLinks(
				View view) {
			return PatternDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
