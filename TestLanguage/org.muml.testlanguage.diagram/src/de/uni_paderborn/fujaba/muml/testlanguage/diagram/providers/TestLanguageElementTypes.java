package de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers;

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
public class TestLanguageElementTypes {

	/**
	 * @generated
	 */
	private TestLanguageElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType TestCase_1000 = getElementType("de.uni_paderborn.fujaba.muml.testlanguage.diagram.TestCase_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Node_2001 = getElementType("de.uni_paderborn.fujaba.muml.testlanguage.diagram.Node_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Input_3001 = getElementType("de.uni_paderborn.fujaba.muml.testlanguage.diagram.Input_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Output_3002 = getElementType("de.uni_paderborn.fujaba.muml.testlanguage.diagram.Output_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputTargets_4001 = getElementType("de.uni_paderborn.fujaba.muml.testlanguage.diagram.OutputTargets_4001"); //$NON-NLS-1$

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
					TestCase_1000,
					de.uni_paderborn.fujaba.muml.testlanguage.TestLanguagePackage.eINSTANCE
							.getTestCase());

			elements.put(
					Node_2001,
					de.uni_paderborn.fujaba.muml.testlanguage.TestLanguagePackage.eINSTANCE
							.getNode());

			elements.put(
					Input_3001,
					de.uni_paderborn.fujaba.muml.testlanguage.TestLanguagePackage.eINSTANCE
							.getInput());

			elements.put(
					Output_3002,
					de.uni_paderborn.fujaba.muml.testlanguage.TestLanguagePackage.eINSTANCE
							.getOutput());

			elements.put(
					OutputTargets_4001,
					de.uni_paderborn.fujaba.muml.testlanguage.TestLanguagePackage.eINSTANCE
							.getOutput_Targets());
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
			KNOWN_ELEMENT_TYPES.add(TestCase_1000);
			KNOWN_ELEMENT_TYPES.add(Node_2001);
			KNOWN_ELEMENT_TYPES.add(Input_3001);
			KNOWN_ELEMENT_TYPES.add(Output_3002);
			KNOWN_ELEMENT_TYPES.add(OutputTargets_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.TestCaseEditPart.VISUAL_ID:
			return TestCase_1000;
		case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return Node_2001;
		case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return Input_3001;
		case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return Output_3002;
		case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.OutputTargetsEditPart.VISUAL_ID:
			return OutputTargets_4001;
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
			return de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
