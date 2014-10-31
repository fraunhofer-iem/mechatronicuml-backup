package pattern.diagram.providers;

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

import pattern.PatternPackage;
import pattern.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart;
import pattern.diagram.edit.parts.CoordinationPattern2EditPart;
import pattern.diagram.edit.parts.CoordinationPatternEditPart;
import pattern.diagram.edit.parts.ModelElementCategoryEditPart;
import pattern.diagram.edit.parts.RoleConnectorEditPart;
import pattern.diagram.edit.parts.RoleEditPart;
import pattern.diagram.part.Pattern2DiagramEditorPlugin;

/**
 * @generated
 */
public class Pattern2ElementTypes {

	/**
	 * @generated
	 */
	private Pattern2ElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			Pattern2DiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ModelElementCategory_1000 = getElementType("de.uni_paderborn.fujaba.muml.pattern.diagram.ModelElementCategory_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CoordinationPattern_2001 = getElementType("de.uni_paderborn.fujaba.muml.pattern.diagram.CoordinationPattern_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CoordinationPattern_3001 = getElementType("de.uni_paderborn.fujaba.muml.pattern.diagram.CoordinationPattern_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Role_3002 = getElementType("de.uni_paderborn.fujaba.muml.pattern.diagram.Role_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RoleConnector_4001 = getElementType("de.uni_paderborn.fujaba.muml.pattern.diagram.RoleConnector_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AbstractCoordinationSpecificationRoles_4002 = getElementType("de.uni_paderborn.fujaba.muml.pattern.diagram.AbstractCoordinationSpecificationRoles_4002"); //$NON-NLS-1$

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

			elements.put(CoordinationPattern_2001,
					PatternPackage.eINSTANCE.getCoordinationPattern());

			elements.put(CoordinationPattern_3001,
					PatternPackage.eINSTANCE.getCoordinationPattern());

			elements.put(
					Role_3002,
					de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
							.getRole());

			elements.put(
					RoleConnector_4001,
					de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
							.getRoleConnector());

			elements.put(
					AbstractCoordinationSpecificationRoles_4002,
					de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
							.getAbstractCoordinationSpecification_Roles());
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
			KNOWN_ELEMENT_TYPES.add(CoordinationPattern_3001);
			KNOWN_ELEMENT_TYPES.add(Role_3002);
			KNOWN_ELEMENT_TYPES.add(RoleConnector_4001);
			KNOWN_ELEMENT_TYPES
					.add(AbstractCoordinationSpecificationRoles_4002);
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
		case CoordinationPatternEditPart.VISUAL_ID:
			return CoordinationPattern_2001;
		case CoordinationPattern2EditPart.VISUAL_ID:
			return CoordinationPattern_3001;
		case RoleEditPart.VISUAL_ID:
			return Role_3002;
		case RoleConnectorEditPart.VISUAL_ID:
			return RoleConnector_4001;
		case AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID:
			return AbstractCoordinationSpecificationRoles_4002;
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
			return pattern.diagram.providers.Pattern2ElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return pattern.diagram.providers.Pattern2ElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return pattern.diagram.providers.Pattern2ElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
