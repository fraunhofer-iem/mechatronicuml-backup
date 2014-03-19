package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
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
			de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.part.MumlDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ModelElementCategory_1000 = getElementType("de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.ModelElementCategory_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CoordinationProtocol_2005 = getElementType("de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.CoordinationProtocol_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CoordinationProtocol_3005 = getElementType("de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.CoordinationProtocol_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Role_3006 = getElementType("de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.Role_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AbstractCoordinationSpecificationRoles_4007 = getElementType("de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.AbstractCoordinationSpecificationRoles_4007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RoleConnector_4006 = getElementType("de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.RoleConnector_4006"); //$NON-NLS-1$

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

			elements.put(
					ModelElementCategory_1000,
					de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage.eINSTANCE
							.getModelElementCategory());

			elements.put(
					CoordinationProtocol_2005,
					de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
							.getCoordinationProtocol());

			elements.put(
					CoordinationProtocol_3005,
					de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
							.getCoordinationProtocol());

			elements.put(
					Role_3006,
					de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
							.getRole());

			elements.put(
					AbstractCoordinationSpecificationRoles_4007,
					de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
							.getAbstractCoordinationSpecification_Roles());

			elements.put(
					RoleConnector_4006,
					de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
							.getRoleConnector());
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
			KNOWN_ELEMENT_TYPES.add(CoordinationProtocol_3005);
			KNOWN_ELEMENT_TYPES.add(Role_3006);
			KNOWN_ELEMENT_TYPES
					.add(AbstractCoordinationSpecificationRoles_4007);
			KNOWN_ELEMENT_TYPES.add(RoleConnector_4006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return ModelElementCategory_1000;
		case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.CoordinationProtocolEditPart.VISUAL_ID:
			return CoordinationProtocol_2005;
		case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.CoordinationProtocol2EditPart.VISUAL_ID:
			return CoordinationProtocol_3005;
		case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return Role_3006;
		case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID:
			return AbstractCoordinationSpecificationRoles_4007;
		case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return RoleConnector_4006;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers.MumlElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers.MumlElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers.MumlElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
