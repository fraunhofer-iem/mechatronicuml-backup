package de.uni_paderborn.fujaba.muml.messagetype.diagram.providers;

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
			de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MessageTypeDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ModelElementCategory_1000 = getElementType(
			"de.uni_paderborn.fujaba.muml.messagetype.diagram.ModelElementCategory_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MessageTypeRepository_2008 = getElementType(
			"de.uni_paderborn.fujaba.muml.messagetype.diagram.MessageTypeRepository_2008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MessageType_3007 = getElementType(
			"de.uni_paderborn.fujaba.muml.messagetype.diagram.MessageType_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Parameter_3009 = getElementType(
			"de.uni_paderborn.fujaba.muml.messagetype.diagram.Parameter_3009"); //$NON-NLS-1$

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
					org.muml.core.modelinstance.ModelinstancePackage.eINSTANCE.getModelElementCategory());

			elements.put(MessageTypeRepository_2008,
					de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage.eINSTANCE.getMessageTypeRepository());

			elements.put(MessageType_3007,
					de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage.eINSTANCE.getMessageType());

			elements.put(Parameter_3009,
					de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE.getParameter());
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
			KNOWN_ELEMENT_TYPES.add(MessageTypeRepository_2008);
			KNOWN_ELEMENT_TYPES.add(MessageType_3007);
			KNOWN_ELEMENT_TYPES.add(Parameter_3009);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID:
			return ModelElementCategory_1000;
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryEditPart.VISUAL_ID:
			return MessageTypeRepository_2008;
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return MessageType_3007;
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return Parameter_3009;
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
			return de.uni_paderborn.fujaba.muml.messagetype.diagram.providers.MumlElementTypes
					.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return de.uni_paderborn.fujaba.muml.messagetype.diagram.providers.MumlElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return de.uni_paderborn.fujaba.muml.messagetype.diagram.providers.MumlElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
