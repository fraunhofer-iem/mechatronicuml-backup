package de.uni_paderborn.fujaba.muml.pattern.diagram.providers;

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
			de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType ModelElementCategory_1000 = getElementType(
			"de.uni_paderborn.fujaba.muml.pattern.diagram.ModelElementCategory_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CoordinationPattern_2001 = getElementType(
			"de.uni_paderborn.fujaba.muml.pattern.diagram.CoordinationPattern_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CoordinationPatternVariant_2002 = getElementType(
			"de.uni_paderborn.fujaba.muml.pattern.diagram.CoordinationPatternVariant_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CoordinationPattern_3003 = getElementType(
			"de.uni_paderborn.fujaba.muml.pattern.diagram.CoordinationPattern_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Role_3002 = getElementType(
			"de.uni_paderborn.fujaba.muml.pattern.diagram.Role_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MessageBuffer_3004 = getElementType(
			"de.uni_paderborn.fujaba.muml.pattern.diagram.MessageBuffer_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MessageType_3005 = getElementType(
			"de.uni_paderborn.fujaba.muml.pattern.diagram.MessageType_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Parameter_3006 = getElementType(
			"de.uni_paderborn.fujaba.muml.pattern.diagram.Parameter_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ConnectorQualityOfServiceAssumptions_3007 = getElementType(
			"de.uni_paderborn.fujaba.muml.pattern.diagram.ConnectorQualityOfServiceAssumptions_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CoordinationPatternVariant_3008 = getElementType(
			"de.uni_paderborn.fujaba.muml.pattern.diagram.CoordinationPatternVariant_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AbstractCoordinationSpecificationRoles_4002 = getElementType(
			"de.uni_paderborn.fujaba.muml.pattern.diagram.AbstractCoordinationSpecificationRoles_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RoleConnector_4001 = getElementType(
			"de.uni_paderborn.fujaba.muml.pattern.diagram.RoleConnector_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DiscreteInteractionEndpointReceiverMessageBuffer_4003 = getElementType(
			"de.uni_paderborn.fujaba.muml.pattern.diagram.DiscreteInteractionEndpointReceiverMessageBuffer_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RoleConnectorConnectorQualityOfServiceAssumptions_4004 = getElementType(
			"de.uni_paderborn.fujaba.muml.pattern.diagram.RoleConnectorConnectorQualityOfServiceAssumptions_4004"); //$NON-NLS-1$

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

			elements.put(ModelElementCategory_1000,
					de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage.eINSTANCE.getModelElementCategory());

			elements.put(CoordinationPattern_2001,
					de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE.getCoordinationPattern());

			elements.put(CoordinationPatternVariant_2002,
					de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE.getCoordinationPatternVariant());

			elements.put(CoordinationPattern_3003,
					de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE.getCoordinationPattern());

			elements.put(Role_3002, de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE.getRole());

			elements.put(MessageBuffer_3004,
					de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE.getMessageBuffer());

			elements.put(MessageType_3005,
					de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage.eINSTANCE.getMessageType());

			elements.put(Parameter_3006,
					de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE.getParameter());

			elements.put(ConnectorQualityOfServiceAssumptions_3007,
					de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
							.getConnectorQualityOfServiceAssumptions());

			elements.put(CoordinationPatternVariant_3008,
					de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE.getCoordinationPatternVariant());

			elements.put(AbstractCoordinationSpecificationRoles_4002,
					de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
							.getAbstractCoordinationSpecification_Roles());

			elements.put(RoleConnector_4001,
					de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE.getRoleConnector());

			elements.put(DiscreteInteractionEndpointReceiverMessageBuffer_4003,
					de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
							.getDiscreteInteractionEndpoint_ReceiverMessageBuffer());

			elements.put(RoleConnectorConnectorQualityOfServiceAssumptions_4004,
					de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
							.getRoleConnector_ConnectorQualityOfServiceAssumptions());
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
			KNOWN_ELEMENT_TYPES.add(CoordinationPattern_2001);
			KNOWN_ELEMENT_TYPES.add(CoordinationPatternVariant_2002);
			KNOWN_ELEMENT_TYPES.add(CoordinationPattern_3003);
			KNOWN_ELEMENT_TYPES.add(Role_3002);
			KNOWN_ELEMENT_TYPES.add(MessageBuffer_3004);
			KNOWN_ELEMENT_TYPES.add(MessageType_3005);
			KNOWN_ELEMENT_TYPES.add(Parameter_3006);
			KNOWN_ELEMENT_TYPES.add(ConnectorQualityOfServiceAssumptions_3007);
			KNOWN_ELEMENT_TYPES.add(CoordinationPatternVariant_3008);
			KNOWN_ELEMENT_TYPES.add(AbstractCoordinationSpecificationRoles_4002);
			KNOWN_ELEMENT_TYPES.add(RoleConnector_4001);
			KNOWN_ELEMENT_TYPES.add(DiscreteInteractionEndpointReceiverMessageBuffer_4003);
			KNOWN_ELEMENT_TYPES.add(RoleConnectorConnectorQualityOfServiceAssumptions_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return ModelElementCategory_1000;
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return CoordinationPattern_2001;
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternVariantEditPart.VISUAL_ID:
			return CoordinationPatternVariant_2002;
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPattern2EditPart.VISUAL_ID:
			return CoordinationPattern_3003;
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return Role_3002;
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferEditPart.VISUAL_ID:
			return MessageBuffer_3004;
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return MessageType_3005;
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return Parameter_3006;
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return ConnectorQualityOfServiceAssumptions_3007;
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternVariant2EditPart.VISUAL_ID:
			return CoordinationPatternVariant_3008;
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID:
			return AbstractCoordinationSpecificationRoles_4002;
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return RoleConnector_4001;
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID:
			return DiscreteInteractionEndpointReceiverMessageBuffer_4003;
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return RoleConnectorConnectorQualityOfServiceAssumptions_4004;
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
			return de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes
					.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
