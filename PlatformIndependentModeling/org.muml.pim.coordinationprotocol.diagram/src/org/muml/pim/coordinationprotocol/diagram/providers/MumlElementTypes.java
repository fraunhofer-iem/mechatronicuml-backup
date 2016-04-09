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
package org.muml.pim.coordinationprotocol.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.muml.core.modelinstance.ModelinstancePackage;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.CoordinationProtocol2EditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.CoordinationProtocolEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.DiscreteInteractionEndpointReceiverMessageBufferEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageBufferEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageTypeEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.ModelElementCategoryEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.ParameterEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleConnectorConnectorQualityOfServiceAssumptionsEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleConnectorEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleEditPart;
import org.muml.pim.coordinationprotocol.diagram.part.MumlDiagramEditorPlugin;
import org.muml.pim.msgtype.MsgtypePackage;
import org.muml.pim.protocol.ProtocolPackage;

/**
 * @generated
 */
public class MumlElementTypes {

	/**
	 * @generated
	 */
	private MumlElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			MumlDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ModelElementCategory_1000 = getElementType(
			"org.muml.pim.coordinationprotocol.diagram.ModelElementCategory_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CoordinationProtocol_2005 = getElementType(
			"org.muml.pim.coordinationprotocol.diagram.CoordinationProtocol_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CoordinationProtocol_3015 = getElementType(
			"org.muml.pim.coordinationprotocol.diagram.CoordinationProtocol_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Role_3006 = getElementType("org.muml.pim.coordinationprotocol.diagram.Role_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MessageBuffer_3013 = getElementType(
			"org.muml.pim.coordinationprotocol.diagram.MessageBuffer_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MessageType_3009 = getElementType(
			"org.muml.pim.coordinationprotocol.diagram.MessageType_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Parameter_3016 = getElementType(
			"org.muml.pim.coordinationprotocol.diagram.Parameter_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectorQualityOfServiceAssumptions_3014 = getElementType(
			"org.muml.pim.coordinationprotocol.diagram.ConnectorQualityOfServiceAssumptions_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AbstractCoordinationSpecificationRoles_4007 = getElementType(
			"org.muml.pim.coordinationprotocol.diagram.AbstractCoordinationSpecificationRoles_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RoleConnector_4006 = getElementType(
			"org.muml.pim.coordinationprotocol.diagram.RoleConnector_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DiscreteInteractionEndpointReceiverMessageBuffer_4008 = getElementType(
			"org.muml.pim.coordinationprotocol.diagram.DiscreteInteractionEndpointReceiverMessageBuffer_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RoleConnectorConnectorQualityOfServiceAssumptions_4009 = getElementType(
			"org.muml.pim.coordinationprotocol.diagram.RoleConnectorConnectorQualityOfServiceAssumptions_4009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ModelElementCategory_1000, ModelinstancePackage.eINSTANCE.getModelElementCategory());

			elements.put(CoordinationProtocol_2005, ProtocolPackage.eINSTANCE.getCoordinationProtocol());

			elements.put(CoordinationProtocol_3015, ProtocolPackage.eINSTANCE.getCoordinationProtocol());

			elements.put(Role_3006, ProtocolPackage.eINSTANCE.getRole());

			elements.put(MessageBuffer_3013, ConnectorPackage.eINSTANCE.getMessageBuffer());

			elements.put(MessageType_3009, MsgtypePackage.eINSTANCE.getMessageType());

			elements.put(Parameter_3016, BehaviorPackage.eINSTANCE.getParameter());

			elements.put(ConnectorQualityOfServiceAssumptions_3014,
					ProtocolPackage.eINSTANCE.getConnectorQualityOfServiceAssumptions());

			elements.put(AbstractCoordinationSpecificationRoles_4007,
					ProtocolPackage.eINSTANCE.getAbstractCoordinationSpecification_Roles());

			elements.put(RoleConnector_4006, ProtocolPackage.eINSTANCE.getRoleConnector());

			elements.put(DiscreteInteractionEndpointReceiverMessageBuffer_4008,
					ConnectorPackage.eINSTANCE.getDiscreteInteractionEndpoint_ReceiverMessageBuffer());

			elements.put(RoleConnectorConnectorQualityOfServiceAssumptions_4009,
					ProtocolPackage.eINSTANCE.getRoleConnector_ConnectorQualityOfServiceAssumptions());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ModelElementCategory_1000);
			KNOWN_ELEMENT_TYPES.add(CoordinationProtocol_2005);
			KNOWN_ELEMENT_TYPES.add(CoordinationProtocol_3015);
			KNOWN_ELEMENT_TYPES.add(Role_3006);
			KNOWN_ELEMENT_TYPES.add(MessageBuffer_3013);
			KNOWN_ELEMENT_TYPES.add(MessageType_3009);
			KNOWN_ELEMENT_TYPES.add(Parameter_3016);
			KNOWN_ELEMENT_TYPES.add(ConnectorQualityOfServiceAssumptions_3014);
			KNOWN_ELEMENT_TYPES.add(AbstractCoordinationSpecificationRoles_4007);
			KNOWN_ELEMENT_TYPES.add(RoleConnector_4006);
			KNOWN_ELEMENT_TYPES.add(DiscreteInteractionEndpointReceiverMessageBuffer_4008);
			KNOWN_ELEMENT_TYPES.add(RoleConnectorConnectorQualityOfServiceAssumptions_4009);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			return ModelElementCategory_1000;
		case CoordinationProtocolEditPart.VISUAL_ID:
			return CoordinationProtocol_2005;
		case CoordinationProtocol2EditPart.VISUAL_ID:
			return CoordinationProtocol_3015;
		case RoleEditPart.VISUAL_ID:
			return Role_3006;
		case MessageBufferEditPart.VISUAL_ID:
			return MessageBuffer_3013;
		case MessageTypeEditPart.VISUAL_ID:
			return MessageType_3009;
		case ParameterEditPart.VISUAL_ID:
			return Parameter_3016;
		case ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return ConnectorQualityOfServiceAssumptions_3014;
		case AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID:
			return AbstractCoordinationSpecificationRoles_4007;
		case RoleConnectorEditPart.VISUAL_ID:
			return RoleConnector_4006;
		case DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID:
			return DiscreteInteractionEndpointReceiverMessageBuffer_4008;
		case RoleConnectorConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return RoleConnectorConnectorQualityOfServiceAssumptions_4009;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes.getElement(elementTypeAdapter);
		}
	};

}
