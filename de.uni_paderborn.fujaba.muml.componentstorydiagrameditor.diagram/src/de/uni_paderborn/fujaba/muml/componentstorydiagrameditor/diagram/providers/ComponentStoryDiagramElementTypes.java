package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers;

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
import org.storydriven.storydiagrams.activities.ActivitiesPackage;

/**
 * @generated
 */
public class ComponentStoryDiagramElementTypes {

	/**
	 * @generated
	 */
	private ComponentStoryDiagramElementTypes() {
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
	public static final IElementType ComponentStoryRule_1000 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.ComponentStoryRule_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Activity_2003 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.Activity_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentStoryNode_3001 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.ComponentStoryNode_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentStoryPattern_3002 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.ComponentStoryPattern_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentVariable_3003 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.ComponentVariable_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PortVariable_3004 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.PortVariable_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartVariable_3005 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.PartVariable_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PortVariable_3006 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.PortVariable_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityEdge_4001 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.ActivityEdge_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AssemblyVariable_4002 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.AssemblyVariable_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DelegationVariable_4003 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.DelegationVariable_4003"); //$NON-NLS-1$

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
				return de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
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

			elements.put(
					ComponentStoryRule_1000,
					de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage.eINSTANCE
							.getComponentStoryRule());

			elements.put(Activity_2003,
					ActivitiesPackage.eINSTANCE.getActivity());

			elements.put(
					ComponentStoryNode_3001,
					de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage.eINSTANCE
							.getComponentStoryNode());

			elements.put(
					ComponentStoryPattern_3002,
					de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getComponentStoryPattern());

			elements.put(
					ComponentVariable_3003,
					de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getComponentVariable());

			elements.put(
					PortVariable_3004,
					de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getPortVariable());

			elements.put(
					PartVariable_3005,
					de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getPartVariable());

			elements.put(
					PortVariable_3006,
					de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getPortVariable());

			elements.put(ActivityEdge_4001,
					ActivitiesPackage.eINSTANCE.getActivityEdge());

			elements.put(
					AssemblyVariable_4002,
					de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getAssemblyVariable());

			elements.put(
					DelegationVariable_4003,
					de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getDelegationVariable());
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
			KNOWN_ELEMENT_TYPES.add(ComponentStoryRule_1000);
			KNOWN_ELEMENT_TYPES.add(Activity_2003);
			KNOWN_ELEMENT_TYPES.add(ComponentStoryNode_3001);
			KNOWN_ELEMENT_TYPES.add(ComponentStoryPattern_3002);
			KNOWN_ELEMENT_TYPES.add(ComponentVariable_3003);
			KNOWN_ELEMENT_TYPES.add(PortVariable_3004);
			KNOWN_ELEMENT_TYPES.add(PartVariable_3005);
			KNOWN_ELEMENT_TYPES.add(PortVariable_3006);
			KNOWN_ELEMENT_TYPES.add(ActivityEdge_4001);
			KNOWN_ELEMENT_TYPES.add(AssemblyVariable_4002);
			KNOWN_ELEMENT_TYPES.add(DelegationVariable_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryRuleEditPart.VISUAL_ID:
			return ComponentStoryRule_1000;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
			return Activity_2003;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeEditPart.VISUAL_ID:
			return ComponentStoryNode_3001;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryPatternEditPart.VISUAL_ID:
			return ComponentStoryPattern_3002;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID:
			return ComponentVariable_3003;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariableEditPart.VISUAL_ID:
			return PortVariable_3004;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PartVariableEditPart.VISUAL_ID:
			return PartVariable_3005;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariable2EditPart.VISUAL_ID:
			return PortVariable_3006;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID:
			return ActivityEdge_4001;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID:
			return AssemblyVariable_4002;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID:
			return DelegationVariable_4003;
		}
		return null;
	}

}
