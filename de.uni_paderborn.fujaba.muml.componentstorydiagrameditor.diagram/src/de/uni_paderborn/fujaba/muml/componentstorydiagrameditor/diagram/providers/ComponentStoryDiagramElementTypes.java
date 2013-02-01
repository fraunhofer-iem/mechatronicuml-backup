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
	public static final IElementType ComponentStoryPattern_3011 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.ComponentStoryPattern_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentVariable_3012 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.ComponentVariable_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartVariable_3014 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.PartVariable_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiPortVariable_3016 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.MultiPortVariable_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SinglePortVariable_3017 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.SinglePortVariable_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SinglePortVariable_3018 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.SinglePortVariable_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiPortVariable_3019 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.MultiPortVariable_3019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SinglePortVariable_3020 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.SinglePortVariable_3020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InitialNode_3007 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.InitialNode_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JunctionNode_3008 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.JunctionNode_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityFinalNode_3010 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.ActivityFinalNode_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControllerExchangeNode_3021 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.ControllerExchangeNode_3021"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ComponentStoryPattern_3022 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.ComponentStoryPattern_3022"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FadingFunction_3023 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.FadingFunction_3023"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ActivityEdge_4001 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.ActivityEdge_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AssemblyVariable_4004 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.AssemblyVariable_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DelegationVariable_4005 = getElementType("de.uni_paderborn.fujaba.muml.model.componentstorydiagram.diagram.DelegationVariable_4005"); //$NON-NLS-1$

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
					ComponentStoryPattern_3011,
					de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getComponentStoryPattern());

			elements.put(
					ComponentVariable_3012,
					de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getComponentVariable());

			elements.put(
					PartVariable_3014,
					de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getPartVariable());

			elements.put(
					MultiPortVariable_3016,
					de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getMultiPortVariable());

			elements.put(
					SinglePortVariable_3017,
					de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getSinglePortVariable());

			elements.put(
					SinglePortVariable_3018,
					de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getSinglePortVariable());

			elements.put(
					MultiPortVariable_3019,
					de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getMultiPortVariable());

			elements.put(
					SinglePortVariable_3020,
					de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getSinglePortVariable());

			elements.put(InitialNode_3007,
					ActivitiesPackage.eINSTANCE.getInitialNode());

			elements.put(JunctionNode_3008,
					ActivitiesPackage.eINSTANCE.getJunctionNode());

			elements.put(ActivityFinalNode_3010,
					ActivitiesPackage.eINSTANCE.getActivityFinalNode());

			elements.put(
					ControllerExchangeNode_3021,
					de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage.eINSTANCE
							.getControllerExchangeNode());

			elements.put(
					ComponentStoryPattern_3022,
					de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getComponentStoryPattern());

			elements.put(
					FadingFunction_3023,
					de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getFadingFunction());

			elements.put(ActivityEdge_4001,
					ActivitiesPackage.eINSTANCE.getActivityEdge());

			elements.put(
					AssemblyVariable_4004,
					de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getAssemblyVariable());

			elements.put(
					DelegationVariable_4005,
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
			KNOWN_ELEMENT_TYPES.add(ComponentStoryPattern_3011);
			KNOWN_ELEMENT_TYPES.add(ComponentVariable_3012);
			KNOWN_ELEMENT_TYPES.add(PartVariable_3014);
			KNOWN_ELEMENT_TYPES.add(MultiPortVariable_3016);
			KNOWN_ELEMENT_TYPES.add(SinglePortVariable_3017);
			KNOWN_ELEMENT_TYPES.add(SinglePortVariable_3018);
			KNOWN_ELEMENT_TYPES.add(MultiPortVariable_3019);
			KNOWN_ELEMENT_TYPES.add(SinglePortVariable_3020);
			KNOWN_ELEMENT_TYPES.add(InitialNode_3007);
			KNOWN_ELEMENT_TYPES.add(JunctionNode_3008);
			KNOWN_ELEMENT_TYPES.add(ActivityFinalNode_3010);
			KNOWN_ELEMENT_TYPES.add(ControllerExchangeNode_3021);
			KNOWN_ELEMENT_TYPES.add(ComponentStoryPattern_3022);
			KNOWN_ELEMENT_TYPES.add(FadingFunction_3023);
			KNOWN_ELEMENT_TYPES.add(ActivityEdge_4001);
			KNOWN_ELEMENT_TYPES.add(AssemblyVariable_4004);
			KNOWN_ELEMENT_TYPES.add(DelegationVariable_4005);
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
			return ComponentStoryPattern_3011;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID:
			return ComponentVariable_3012;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PartVariableEditPart.VISUAL_ID:
			return PartVariable_3014;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID:
			return MultiPortVariable_3016;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID:
			return SinglePortVariable_3017;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID:
			return SinglePortVariable_3018;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.MultiPortVariable2EditPart.VISUAL_ID:
			return MultiPortVariable_3019;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariable3EditPart.VISUAL_ID:
			return SinglePortVariable_3020;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return InitialNode_3007;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.JunctionNodeEditPart.VISUAL_ID:
			return JunctionNode_3008;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityFinalNodeEditPart.VISUAL_ID:
			return ActivityFinalNode_3010;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ControllerExchangeNodeEditPart.VISUAL_ID:
			return ControllerExchangeNode_3021;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryPattern2EditPart.VISUAL_ID:
			return ComponentStoryPattern_3022;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.FadingFunctionEditPart.VISUAL_ID:
			return FadingFunction_3023;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID:
			return ActivityEdge_4001;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID:
			return AssemblyVariable_4004;
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID:
			return DelegationVariable_4005;
		}
		return null;
	}

}
