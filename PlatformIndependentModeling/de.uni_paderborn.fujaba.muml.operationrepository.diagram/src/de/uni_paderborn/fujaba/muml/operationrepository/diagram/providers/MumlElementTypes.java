package de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers;

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
			de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ModelElementCategory_1000 = getElementType(
			"de.uni_paderborn.fujaba.muml.operationrepository.diagram.ModelElementCategory_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OperationRepository_2001 = getElementType(
			"de.uni_paderborn.fujaba.muml.operationrepository.diagram.OperationRepository_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Operation_3001 = getElementType(
			"de.uni_paderborn.fujaba.muml.operationrepository.diagram.Operation_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Parameter_3002 = getElementType(
			"de.uni_paderborn.fujaba.muml.operationrepository.diagram.Parameter_3002"); //$NON-NLS-1$

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

			elements.put(OperationRepository_2001,
					de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE.getOperationRepository());

			elements.put(Operation_3001,
					de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE.getOperation());

			elements.put(Parameter_3002,
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
			KNOWN_ELEMENT_TYPES.add(OperationRepository_2001);
			KNOWN_ELEMENT_TYPES.add(Operation_3001);
			KNOWN_ELEMENT_TYPES.add(Parameter_3002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return ModelElementCategory_1000;
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.OperationRepositoryEditPart.VISUAL_ID:
			return OperationRepository_2001;
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.OperationEditPart.VISUAL_ID:
			return Operation_3001;
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return Parameter_3002;
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
			return de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes
					.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes
					.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
