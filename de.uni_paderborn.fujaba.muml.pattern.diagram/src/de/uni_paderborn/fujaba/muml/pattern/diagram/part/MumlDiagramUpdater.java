package de.uni_paderborn.fujaba.muml.pattern.diagram.part;

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
import org.storydriven.core.ExtendableElement;

/**
 * @generated
 */
public class MumlDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternPatternCompartmentEditPart.VISUAL_ID:
			return getCoordinationPatternCoordinationProtocolContainerCompartment_7001SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferMessageBufferCompartmentEditPart.VISUAL_ID:
			return getMessageBufferMessageBufferCompartment_7002SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageTypeParametersCompartmentEditPart.VISUAL_ID:
			return getMessageTypeParametersCompartment_7003SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternVariantCoordinationProtocolContainerCompartmentEditPart.VISUAL_ID:
			return getCoordinationPatternVariantCoordinationProtocolContainerCompartment_7004SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor> getModelElementCategory_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.modelinstance.ModelElementCategory modelElement = (de.uni_paderborn.fujaba.modelinstance.ModelElementCategory) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternVariantEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor> getCoordinationPatternCoordinationProtocolContainerCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern modelElement = (de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor>();
		{
			de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification childElement = modelElement
					.getGmfAbstractCoordinationSpecification();
			int visualID = de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPattern2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
			}
		}
		for (Iterator<?> it = modelElement.getRoles().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.protocol.Role childElement = (de.uni_paderborn.fujaba.muml.protocol.Role) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getGmfMessageBuffers().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.connector.MessageBuffer childElement = (de.uni_paderborn.fujaba.muml.connector.MessageBuffer) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		{
			de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions childElement = modelElement
					.getGmfConnectorQualityOfServiceAssumptions();
			int visualID = de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor> getMessageBufferMessageBufferCompartment_7002SemanticChildren(
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
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGmfMessageTypes().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.msgtype.MessageType childElement = (de.uni_paderborn.fujaba.muml.msgtype.MessageType) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor> getMessageTypeParametersCompartment_7003SemanticChildren(
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
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.behavior.Parameter childElement = (de.uni_paderborn.fujaba.muml.behavior.Parameter) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ParameterEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}

		return result;
	}

	/**
	* @generated
	*/
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor> getCoordinationPatternVariantCoordinationProtocolContainerCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.pattern.CoordinationPatternVariant modelElement = (de.uni_paderborn.fujaba.muml.pattern.CoordinationPatternVariant) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor>();
		{
			de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification childElement = modelElement
					.getGmfAbstractCoordinationSpecification();
			int visualID = de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternVariant2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
			}
		}
		for (Iterator<?> it = modelElement.getRoles().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.protocol.Role childElement = (de.uni_paderborn.fujaba.muml.protocol.Role) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getGmfMessageBuffers().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.connector.MessageBuffer childElement = (de.uni_paderborn.fujaba.muml.connector.MessageBuffer) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		{
			de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions childElement = modelElement
					.getGmfConnectorQualityOfServiceAssumptions();
			int visualID = de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternVariantEditPart.VISUAL_ID:
			return getCoordinationPatternVariant_2002ContainedLinks(view);
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
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternVariant2EditPart.VISUAL_ID:
			return getCoordinationPatternVariant_3008ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternVariantEditPart.VISUAL_ID:
			return getCoordinationPatternVariant_2002IncomingLinks(view);
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
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternVariant2EditPart.VISUAL_ID:
			return getCoordinationPatternVariant_3008IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternVariantEditPart.VISUAL_ID:
			return getCoordinationPatternVariant_2002OutgoingLinks(view);
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
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternVariant2EditPart.VISUAL_ID:
			return getCoordinationPatternVariant_3008OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getModelElementCategory_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPattern_2001ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern modelElement = (de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPatternVariant_2002ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.pattern.CoordinationPatternVariant modelElement = (de.uni_paderborn.fujaba.muml.pattern.CoordinationPatternVariant) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPattern_3003ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern modelElement = (de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getRole_3002ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.protocol.Role modelElement = (de.uni_paderborn.fujaba.muml.protocol.Role) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(
				getOutgoingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getMessageBuffer_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getMessageType_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getParameter_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getConnectorQualityOfServiceAssumptions_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPatternVariant_3008ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.pattern.CoordinationPatternVariant modelElement = (de.uni_paderborn.fujaba.muml.pattern.CoordinationPatternVariant) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getRoleConnector_4001ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.protocol.RoleConnector modelElement = (de.uni_paderborn.fujaba.muml.protocol.RoleConnector) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4004(
				modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPattern_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPatternVariant_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPattern_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getRole_3002IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.protocol.Role modelElement = (de.uni_paderborn.fujaba.muml.protocol.Role) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RoleConnector_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getMessageBuffer_3004IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.connector.MessageBuffer modelElement = (de.uni_paderborn.fujaba.muml.connector.MessageBuffer) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getMessageType_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getParameter_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getConnectorQualityOfServiceAssumptions_3007IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions modelElement = (de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPatternVariant_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getRoleConnector_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPattern_2001OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern modelElement = (de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPatternVariant_2002OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.pattern.CoordinationPatternVariant modelElement = (de.uni_paderborn.fujaba.muml.pattern.CoordinationPatternVariant) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPattern_3003OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern modelElement = (de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getRole_3002OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.protocol.Role modelElement = (de.uni_paderborn.fujaba.muml.protocol.Role) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_RoleConnector_4001(modelElement));
		result.addAll(
				getOutgoingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getMessageBuffer_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getMessageType_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getParameter_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getConnectorQualityOfServiceAssumptions_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getCoordinationPatternVariant_3008OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.pattern.CoordinationPatternVariant modelElement = (de.uni_paderborn.fujaba.muml.pattern.CoordinationPatternVariant) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getRoleConnector_4001OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.protocol.RoleConnector modelElement = (de.uni_paderborn.fujaba.muml.protocol.RoleConnector) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4004(
				modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_RoleConnector_4001(
			de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification container) {
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		de.uni_paderborn.fujaba.muml.protocol.RoleConnector link = container.getRoleConnector();
		if (de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		List targets = link.getConnectorEndpoints();
		Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
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
		result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor(src, dst, link,
				de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.RoleConnector_4001,
				de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getIncomingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(
			de.uni_paderborn.fujaba.muml.protocol.Role target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
					.getAbstractCoordinationSpecification_Roles()) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor(
						setting.getEObject(), target,
						de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.AbstractCoordinationSpecificationRoles_4002,
						de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getIncomingTypeModelFacetLinks_RoleConnector_4001(
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.protocol.RoleConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.protocol.RoleConnector link = (de.uni_paderborn.fujaba.muml.protocol.RoleConnector) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor(src, target, link,
					de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.RoleConnector_4001,
					de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getIncomingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4003(
			de.uni_paderborn.fujaba.muml.connector.MessageBuffer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_ReceiverMessageBuffer()) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor(
						setting.getEObject(), target,
						de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4003,
						de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getIncomingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4004(
			de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
					.getRoleConnector_ConnectorQualityOfServiceAssumptions()) {
				result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor(
						setting.getEObject(), target,
						de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.RoleConnectorConnectorQualityOfServiceAssumptions_4004,
						de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(
			de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification source) {
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> destinations = source.getRoles().iterator(); destinations.hasNext();) {
			de.uni_paderborn.fujaba.muml.protocol.Role destination = (de.uni_paderborn.fujaba.muml.protocol.Role) destinations
					.next();
			result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor(source, destination,
					de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.AbstractCoordinationSpecificationRoles_4002,
					de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_RoleConnector_4001(
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint source) {
		de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification) {
				container = (de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		de.uni_paderborn.fujaba.muml.protocol.RoleConnector link = container.getRoleConnector();
		if (de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		List targets = link.getConnectorEndpoints();
		Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
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
		result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor(src, dst, link,
				de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.RoleConnector_4001,
				de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getOutgoingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4003(
			de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint source) {
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> destinations = source.getReceiverMessageBuffer().iterator(); destinations.hasNext();) {
			de.uni_paderborn.fujaba.muml.connector.MessageBuffer destination = (de.uni_paderborn.fujaba.muml.connector.MessageBuffer) destinations
					.next();
			result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor(source, destination,
					de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4003,
					de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getOutgoingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4004(
			de.uni_paderborn.fujaba.muml.protocol.RoleConnector source) {
		LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor>();
		de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions destination = source
				.getConnectorQualityOfServiceAssumptions();
		if (destination == null) {
			return result;
		}
		result.add(new de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor(source, destination,
				de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.RoleConnectorConnectorQualityOfServiceAssumptions_4004,
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

		public List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlNodeDescriptor> getSemanticChildren(
				View view) {
			return MumlDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getContainedLinks(View view) {
			return MumlDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getIncomingLinks(View view) {
			return MumlDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlLinkDescriptor> getOutgoingLinks(View view) {
			return MumlDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
