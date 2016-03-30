/*
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.coordinationprotocol.diagram.part;

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
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlNodeDescriptor> getSemanticChildren(
			View view) {
		switch (org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.CoordinationProtocolCoordinationProtocolContainerCompartmentEditPart.VISUAL_ID:
			return getCoordinationProtocolCoordinationProtocolContainerCompartment_7005SemanticChildren(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageBufferMessageBufferCompartmentEditPart.VISUAL_ID:
			return getMessageBufferMessageBufferCompartment_7009SemanticChildren(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageTypeMessageTypesCompartmentEditPart.VISUAL_ID:
			return getMessageTypeParametersCompartment_7010SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlNodeDescriptor> getModelElementCategory_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.core.modelinstance.ModelElementCategory modelElement = (org.muml.core.modelinstance.ModelElementCategory) view
				.getElement();
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.coordinationprotocol.diagram.edit.parts.CoordinationProtocolEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.coordinationprotocol.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlNodeDescriptor> getCoordinationProtocolCoordinationProtocolContainerCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pim.protocol.CoordinationProtocol modelElement = (org.muml.pim.protocol.CoordinationProtocol) containerView
				.getElement();
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlNodeDescriptor>();
		{
			org.muml.pim.protocol.AbstractCoordinationSpecification childElement = modelElement
					.getGmfAbstractCoordinationSpecification();
			int visualID = org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.coordinationprotocol.diagram.edit.parts.CoordinationProtocol2EditPart.VISUAL_ID) {
				result.add(new org.muml.pim.coordinationprotocol.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getRoles().iterator(); it.hasNext();) {
			org.muml.pim.protocol.Role childElement = (org.muml.pim.protocol.Role) it
					.next();
			int visualID = org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.coordinationprotocol.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getGmfMessageBuffers().iterator(); it.hasNext();) {
			org.muml.pim.connector.MessageBuffer childElement = (org.muml.pim.connector.MessageBuffer) it
					.next();
			int visualID = org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageBufferEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.coordinationprotocol.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		{
			org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions childElement = modelElement
					.getGmfConnectorQualityOfServiceAssumptions();
			int visualID = org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.coordinationprotocol.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.coordinationprotocol.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlNodeDescriptor> getMessageBufferMessageBufferCompartment_7009SemanticChildren(
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
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGmfMessageTypes().iterator(); it.hasNext();) {
			org.muml.pim.msgtype.MessageType childElement = (org.muml.pim.msgtype.MessageType) it
					.next();
			int visualID = org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.coordinationprotocol.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlNodeDescriptor> getMessageTypeParametersCompartment_7010SemanticChildren(
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
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it.hasNext();) {
			org.muml.pim.behavior.Parameter childElement = (org.muml.pim.behavior.Parameter) it
					.next();
			int visualID = org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.coordinationprotocol.diagram.edit.parts.ParameterEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.coordinationprotocol.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getContainedLinks(
			View view) {
		switch (org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000ContainedLinks(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.CoordinationProtocolEditPart.VISUAL_ID:
			return getCoordinationProtocol_2005ContainedLinks(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.CoordinationProtocol2EditPart.VISUAL_ID:
			return getCoordinationProtocol_3015ContainedLinks(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_3006ContainedLinks(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageBufferEditPart.VISUAL_ID:
			return getMessageBuffer_3013ContainedLinks(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3009ContainedLinks(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getParameter_3016ContainedLinks(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptions_3014ContainedLinks(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getIncomingLinks(
			View view) {
		switch (org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.CoordinationProtocolEditPart.VISUAL_ID:
			return getCoordinationProtocol_2005IncomingLinks(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.CoordinationProtocol2EditPart.VISUAL_ID:
			return getCoordinationProtocol_3015IncomingLinks(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_3006IncomingLinks(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageBufferEditPart.VISUAL_ID:
			return getMessageBuffer_3013IncomingLinks(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3009IncomingLinks(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getParameter_3016IncomingLinks(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptions_3014IncomingLinks(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.CoordinationProtocolEditPart.VISUAL_ID:
			return getCoordinationProtocol_2005OutgoingLinks(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.CoordinationProtocol2EditPart.VISUAL_ID:
			return getCoordinationProtocol_3015OutgoingLinks(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_3006OutgoingLinks(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageBufferEditPart.VISUAL_ID:
			return getMessageBuffer_3013OutgoingLinks(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3009OutgoingLinks(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getParameter_3016OutgoingLinks(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptions_3014OutgoingLinks(view);
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getModelElementCategory_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getCoordinationProtocol_2005ContainedLinks(
			View view) {
		org.muml.pim.protocol.CoordinationProtocol modelElement = (org.muml.pim.protocol.CoordinationProtocol) view
				.getElement();
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getCoordinationProtocol_3015ContainedLinks(
			View view) {
		org.muml.pim.protocol.CoordinationProtocol modelElement = (org.muml.pim.protocol.CoordinationProtocol) view
				.getElement();
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getRole_3006ContainedLinks(
			View view) {
		org.muml.pim.protocol.Role modelElement = (org.muml.pim.protocol.Role) view
				.getElement();
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor>();
		result.addAll(
				getOutgoingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getMessageBuffer_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getMessageType_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getParameter_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getConnectorQualityOfServiceAssumptions_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getRoleConnector_4006ContainedLinks(
			View view) {
		org.muml.pim.protocol.RoleConnector modelElement = (org.muml.pim.protocol.RoleConnector) view
				.getElement();
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4009(
				modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getCoordinationProtocol_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getCoordinationProtocol_3015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getRole_3006IncomingLinks(
			View view) {
		org.muml.pim.protocol.Role modelElement = (org.muml.pim.protocol.Role) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RoleConnector_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getMessageBuffer_3013IncomingLinks(
			View view) {
		org.muml.pim.connector.MessageBuffer modelElement = (org.muml.pim.connector.MessageBuffer) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getMessageType_3009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getParameter_3016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getConnectorQualityOfServiceAssumptions_3014IncomingLinks(
			View view) {
		org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions modelElement = (org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getRoleConnector_4006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getCoordinationProtocol_2005OutgoingLinks(
			View view) {
		org.muml.pim.protocol.CoordinationProtocol modelElement = (org.muml.pim.protocol.CoordinationProtocol) view
				.getElement();
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getCoordinationProtocol_3015OutgoingLinks(
			View view) {
		org.muml.pim.protocol.CoordinationProtocol modelElement = (org.muml.pim.protocol.CoordinationProtocol) view
				.getElement();
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getRole_3006OutgoingLinks(
			View view) {
		org.muml.pim.protocol.Role modelElement = (org.muml.pim.protocol.Role) view
				.getElement();
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_RoleConnector_4006(modelElement));
		result.addAll(
				getOutgoingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getMessageBuffer_3013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getMessageType_3009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getParameter_3016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getConnectorQualityOfServiceAssumptions_3014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getRoleConnector_4006OutgoingLinks(
			View view) {
		org.muml.pim.protocol.RoleConnector modelElement = (org.muml.pim.protocol.RoleConnector) view
				.getElement();
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4009(
				modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_RoleConnector_4006(
			org.muml.pim.protocol.AbstractCoordinationSpecification container) {
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor>();
		org.muml.pim.protocol.RoleConnector link = container.getRoleConnector();
		if (org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry
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
		result.add(new org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor(src, dst, link,
				org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes.RoleConnector_4006,
				org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getIncomingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4007(
			org.muml.pim.protocol.Role target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.muml.pim.protocol.ProtocolPackage.eINSTANCE
					.getAbstractCoordinationSpecification_Roles()) {
				result.add(new org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor(
						setting.getEObject(), target,
						org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes.AbstractCoordinationSpecificationRoles_4007,
						org.muml.pim.coordinationprotocol.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getIncomingTypeModelFacetLinks_RoleConnector_4006(
			org.muml.pim.connector.ConnectorEndpoint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof org.muml.pim.protocol.RoleConnector) {
				continue;
			}
			org.muml.pim.protocol.RoleConnector link = (org.muml.pim.protocol.RoleConnector) setting
					.getEObject();
			if (org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint src = (org.muml.pim.connector.ConnectorEndpoint) theSource;
			result.add(new org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor(src,
					target, link,
					org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes.RoleConnector_4006,
					org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getIncomingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4008(
			org.muml.pim.connector.MessageBuffer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_ReceiverMessageBuffer()) {
				result.add(new org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor(
						setting.getEObject(), target,
						org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4008,
						org.muml.pim.coordinationprotocol.diagram.edit.parts.DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getIncomingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4009(
			org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.muml.pim.protocol.ProtocolPackage.eINSTANCE
					.getRoleConnector_ConnectorQualityOfServiceAssumptions()) {
				result.add(new org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor(
						setting.getEObject(), target,
						org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes.RoleConnectorConnectorQualityOfServiceAssumptions_4009,
						org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleConnectorConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4007(
			org.muml.pim.protocol.AbstractCoordinationSpecification source) {
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> destinations = source.getRoles().iterator(); destinations.hasNext();) {
			org.muml.pim.protocol.Role destination = (org.muml.pim.protocol.Role) destinations
					.next();
			result.add(new org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor(source,
					destination,
					org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes.AbstractCoordinationSpecificationRoles_4007,
					org.muml.pim.coordinationprotocol.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_RoleConnector_4006(
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
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor>();
		org.muml.pim.protocol.RoleConnector link = container.getRoleConnector();
		if (org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry
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
		result.add(new org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor(src, dst, link,
				org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes.RoleConnector_4006,
				org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getOutgoingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4008(
			org.muml.pim.connector.DiscreteInteractionEndpoint source) {
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> destinations = source.getReceiverMessageBuffer().iterator(); destinations.hasNext();) {
			org.muml.pim.connector.MessageBuffer destination = (org.muml.pim.connector.MessageBuffer) destinations
					.next();
			result.add(new org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor(source,
					destination,
					org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4008,
					org.muml.pim.coordinationprotocol.diagram.edit.parts.DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getOutgoingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4009(
			org.muml.pim.protocol.RoleConnector source) {
		LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor>();
		org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions destination = source
				.getConnectorQualityOfServiceAssumptions();
		if (destination == null) {
			return result;
		}
		result.add(new org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor(source,
				destination,
				org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes.RoleConnectorConnectorQualityOfServiceAssumptions_4009,
				org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleConnectorConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID));
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

		public List<org.muml.pim.coordinationprotocol.diagram.part.MumlNodeDescriptor> getSemanticChildren(
				View view) {
			return MumlDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getContainedLinks(
				View view) {
			return MumlDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getIncomingLinks(
				View view) {
			return MumlDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<org.muml.pim.coordinationprotocol.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
				View view) {
			return MumlDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
