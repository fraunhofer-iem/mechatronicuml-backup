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
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.pim.behavior.Parameter;
import org.muml.pim.connector.ConnectorEndpoint;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.connector.MessageBuffer;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.CoordinationProtocol2EditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.CoordinationProtocolCoordinationProtocolContainerCompartmentEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.CoordinationProtocolEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.DiscreteInteractionEndpointReceiverMessageBufferEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageBufferEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageBufferMessageBufferCompartmentEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageTypeEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageTypeMessageTypesCompartmentEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.ModelElementCategoryEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.ParameterEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleConnectorConnectorQualityOfServiceAssumptionsEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleConnectorEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleEditPart;
import org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.protocol.AbstractCoordinationSpecification;
import org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions;
import org.muml.pim.protocol.CoordinationProtocol;
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
		case CoordinationProtocolCoordinationProtocolContainerCompartmentEditPart.VISUAL_ID:
			return getCoordinationProtocolCoordinationProtocolContainerCompartment_7005SemanticChildren(view);
		case MessageBufferMessageBufferCompartmentEditPart.VISUAL_ID:
			return getMessageBufferMessageBufferCompartment_7009SemanticChildren(view);
		case MessageTypeMessageTypesCompartmentEditPart.VISUAL_ID:
			return getMessageTypeParametersCompartment_7010SemanticChildren(view);
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
			if (visualID == CoordinationProtocolEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getCoordinationProtocolCoordinationProtocolContainerCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CoordinationProtocol modelElement = (CoordinationProtocol) containerView.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		{
			AbstractCoordinationSpecification childElement = modelElement.getGmfAbstractCoordinationSpecification();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CoordinationProtocol2EditPart.VISUAL_ID) {
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
	public static List<MumlNodeDescriptor> getMessageBufferMessageBufferCompartment_7009SemanticChildren(View view) {
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
	public static List<MumlNodeDescriptor> getMessageTypeParametersCompartment_7010SemanticChildren(View view) {
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
	public static List<MumlLinkDescriptor> getContainedLinks(View view) {
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000ContainedLinks(view);
		case CoordinationProtocolEditPart.VISUAL_ID:
			return getCoordinationProtocol_2005ContainedLinks(view);
		case CoordinationProtocol2EditPart.VISUAL_ID:
			return getCoordinationProtocol_3015ContainedLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_3006ContainedLinks(view);
		case MessageBufferEditPart.VISUAL_ID:
			return getMessageBuffer_3013ContainedLinks(view);
		case MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3009ContainedLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3016ContainedLinks(view);
		case ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptions_3014ContainedLinks(view);
		case RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getIncomingLinks(View view) {
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case CoordinationProtocolEditPart.VISUAL_ID:
			return getCoordinationProtocol_2005IncomingLinks(view);
		case CoordinationProtocol2EditPart.VISUAL_ID:
			return getCoordinationProtocol_3015IncomingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_3006IncomingLinks(view);
		case MessageBufferEditPart.VISUAL_ID:
			return getMessageBuffer_3013IncomingLinks(view);
		case MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3009IncomingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3016IncomingLinks(view);
		case ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptions_3014IncomingLinks(view);
		case RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getOutgoingLinks(View view) {
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case CoordinationProtocolEditPart.VISUAL_ID:
			return getCoordinationProtocol_2005OutgoingLinks(view);
		case CoordinationProtocol2EditPart.VISUAL_ID:
			return getCoordinationProtocol_3015OutgoingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_3006OutgoingLinks(view);
		case MessageBufferEditPart.VISUAL_ID:
			return getMessageBuffer_3013OutgoingLinks(view);
		case MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3009OutgoingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3016OutgoingLinks(view);
		case ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptions_3014OutgoingLinks(view);
		case RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4006OutgoingLinks(view);
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
	public static List<MumlLinkDescriptor> getCoordinationProtocol_2005ContainedLinks(View view) {
		CoordinationProtocol modelElement = (CoordinationProtocol) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationProtocol_3015ContainedLinks(View view) {
		CoordinationProtocol modelElement = (CoordinationProtocol) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getRole_3006ContainedLinks(View view) {
		Role modelElement = (Role) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(
				getOutgoingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getMessageBuffer_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getMessageType_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getParameter_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getConnectorQualityOfServiceAssumptions_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getRoleConnector_4006ContainedLinks(View view) {
		RoleConnector modelElement = (RoleConnector) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4009(
				modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationProtocol_2005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationProtocol_3015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getRole_3006IncomingLinks(View view) {
		Role modelElement = (Role) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RoleConnector_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getMessageBuffer_3013IncomingLinks(View view) {
		MessageBuffer modelElement = (MessageBuffer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getMessageType_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getParameter_3016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getConnectorQualityOfServiceAssumptions_3014IncomingLinks(View view) {
		ConnectorQualityOfServiceAssumptions modelElement = (ConnectorQualityOfServiceAssumptions) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getRoleConnector_4006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationProtocol_2005OutgoingLinks(View view) {
		CoordinationProtocol modelElement = (CoordinationProtocol) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationProtocol_3015OutgoingLinks(View view) {
		CoordinationProtocol modelElement = (CoordinationProtocol) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getRole_3006OutgoingLinks(View view) {
		Role modelElement = (Role) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_RoleConnector_4006(modelElement));
		result.addAll(
				getOutgoingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getMessageBuffer_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getMessageType_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getParameter_3016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getConnectorQualityOfServiceAssumptions_3014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getRoleConnector_4006OutgoingLinks(View view) {
		RoleConnector modelElement = (RoleConnector) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4009(
				modelElement));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getContainedTypeModelFacetLinks_RoleConnector_4006(
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
		result.add(new MumlLinkDescriptor(src, dst, link, MumlElementTypes.RoleConnector_4006,
				RoleConnectorEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getIncomingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4007(
			Role target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ProtocolPackage.eINSTANCE
					.getAbstractCoordinationSpecification_Roles()) {
				result.add(new MumlLinkDescriptor(setting.getEObject(), target,
						MumlElementTypes.AbstractCoordinationSpecificationRoles_4007,
						AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getIncomingTypeModelFacetLinks_RoleConnector_4006(
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
			result.add(new MumlLinkDescriptor(src, target, link, MumlElementTypes.RoleConnector_4006,
					RoleConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getIncomingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4008(
			MessageBuffer target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_ReceiverMessageBuffer()) {
				result.add(new MumlLinkDescriptor(setting.getEObject(), target,
						MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4008,
						DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getIncomingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4009(
			ConnectorQualityOfServiceAssumptions target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ProtocolPackage.eINSTANCE
					.getRoleConnector_ConnectorQualityOfServiceAssumptions()) {
				result.add(new MumlLinkDescriptor(setting.getEObject(), target,
						MumlElementTypes.RoleConnectorConnectorQualityOfServiceAssumptions_4009,
						RoleConnectorConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4007(
			AbstractCoordinationSpecification source) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		for (Iterator<?> destinations = source.getRoles().iterator(); destinations.hasNext();) {
			Role destination = (Role) destinations.next();
			result.add(new MumlLinkDescriptor(source, destination,
					MumlElementTypes.AbstractCoordinationSpecificationRoles_4007,
					AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_RoleConnector_4006(
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
		result.add(new MumlLinkDescriptor(src, dst, link, MumlElementTypes.RoleConnector_4006,
				RoleConnectorEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getOutgoingFeatureModelFacetLinks_DiscreteInteractionEndpoint_ReceiverMessageBuffer_4008(
			DiscreteInteractionEndpoint source) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		for (Iterator<?> destinations = source.getReceiverMessageBuffer().iterator(); destinations.hasNext();) {
			MessageBuffer destination = (MessageBuffer) destinations.next();
			result.add(new MumlLinkDescriptor(source, destination,
					MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4008,
					DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getOutgoingFeatureModelFacetLinks_RoleConnector_ConnectorQualityOfServiceAssumptions_4009(
			RoleConnector source) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		ConnectorQualityOfServiceAssumptions destination = source.getConnectorQualityOfServiceAssumptions();
		if (destination == null) {
			return result;
		}
		result.add(new MumlLinkDescriptor(source, destination,
				MumlElementTypes.RoleConnectorConnectorQualityOfServiceAssumptions_4009,
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
