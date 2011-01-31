package patterneditor.diagram.providers;

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
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import patterneditor.PatterneditorPackage;
import patterneditor.diagram.edit.parts.ConstrainableElementConstraint2EditPart;
import patterneditor.diagram.edit.parts.ConstrainableElementConstraintEditPart;
import patterneditor.diagram.edit.parts.CoordinationPatternEditPart;
import patterneditor.diagram.edit.parts.PatternDiagramEditPart;
import patterneditor.diagram.edit.parts.RoleConnectorEditPart;
import patterneditor.diagram.edit.parts.RoleEditPart;
import patterneditor.diagram.edit.parts.RolePatternEditPart;
import patterneditor.diagram.edit.parts.TextualConstraintEditPart;
import patterneditor.diagram.part.PatternDiagramEditorPlugin;

/**
 * @generated
 */
public class PatternElementTypes {

	/**
	 * @generated
	 */
	private PatternElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType PatternDiagram_1000 = getElementType("patterneditor.diagram.PatternDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CoordinationPattern_2001 = getElementType("patterneditor.diagram.CoordinationPattern_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Role_2002 = getElementType("patterneditor.diagram.Role_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TextualConstraint_2004 = getElementType("patterneditor.diagram.TextualConstraint_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RoleConnector_4001 = getElementType("patterneditor.diagram.RoleConnector_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RolePattern_4002 = getElementType("patterneditor.diagram.RolePattern_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConstrainableElementConstraint_4005 = getElementType("patterneditor.diagram.ConstrainableElementConstraint_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConstrainableElementConstraint_4006 = getElementType("patterneditor.diagram.ConstrainableElementConstraint_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return PatternDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
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

			elements.put(PatternDiagram_1000,
					PatterneditorPackage.eINSTANCE.getPatternDiagram());

			elements.put(
					CoordinationPattern_2001,
					de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage.eINSTANCE
							.getCoordinationPattern());

			elements.put(
					Role_2002,
					de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage.eINSTANCE
							.getRole());

			elements.put(
					TextualConstraint_2004,
					de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintPackage.eINSTANCE
							.getTextualConstraint());

			elements.put(
					RoleConnector_4001,
					de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage.eINSTANCE
							.getRoleConnector());

			elements.put(
					RolePattern_4002,
					de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage.eINSTANCE
							.getRole_Pattern());

			elements.put(
					ConstrainableElementConstraint_4005,
					de.uni_paderborn.fujaba.umlrt.model.core.CorePackage.eINSTANCE
							.getConstrainableElement_Constraint());

			elements.put(
					ConstrainableElementConstraint_4006,
					de.uni_paderborn.fujaba.umlrt.model.core.CorePackage.eINSTANCE
							.getConstrainableElement_Constraint());
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
			KNOWN_ELEMENT_TYPES.add(PatternDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(CoordinationPattern_2001);
			KNOWN_ELEMENT_TYPES.add(Role_2002);
			KNOWN_ELEMENT_TYPES.add(TextualConstraint_2004);
			KNOWN_ELEMENT_TYPES.add(RoleConnector_4001);
			KNOWN_ELEMENT_TYPES.add(RolePattern_4002);
			KNOWN_ELEMENT_TYPES.add(ConstrainableElementConstraint_4005);
			KNOWN_ELEMENT_TYPES.add(ConstrainableElementConstraint_4006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case PatternDiagramEditPart.VISUAL_ID:
			return PatternDiagram_1000;
		case CoordinationPatternEditPart.VISUAL_ID:
			return CoordinationPattern_2001;
		case RoleEditPart.VISUAL_ID:
			return Role_2002;
		case TextualConstraintEditPart.VISUAL_ID:
			return TextualConstraint_2004;
		case RoleConnectorEditPart.VISUAL_ID:
			return RoleConnector_4001;
		case RolePatternEditPart.VISUAL_ID:
			return RolePattern_4002;
		case ConstrainableElementConstraintEditPart.VISUAL_ID:
			return ConstrainableElementConstraint_4005;
		case ConstrainableElementConstraint2EditPart.VISUAL_ID:
			return ConstrainableElementConstraint_4006;
		}
		return null;
	}

}
