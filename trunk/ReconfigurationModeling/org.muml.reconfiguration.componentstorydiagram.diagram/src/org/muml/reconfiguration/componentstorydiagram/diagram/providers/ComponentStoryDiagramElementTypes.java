package org.muml.reconfiguration.componentstorydiagram.diagram.providers;

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
import org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityEdgeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityFinalNodeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.AssemblyVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPattern2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryRuleEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariable2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.DelegationVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.FadingComponentPartVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.InitialNodeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.JunctionNodeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortOrderConstraintEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariable2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.PartVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable3EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;
import org.muml.storydiagram.activities.ActivitiesPackage;

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
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ComponentStoryDiagramDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ComponentStoryRule_1000 = getElementType(
			"org.muml.reconfiguration.componentstorydiagram.diagram.ComponentStoryRule_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Activity_2003 = getElementType(
			"org.muml.reconfiguration.componentstorydiagram.diagram.Activity_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentStoryNode_3001 = getElementType(
			"org.muml.reconfiguration.componentstorydiagram.diagram.ComponentStoryNode_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentStoryPattern_3011 = getElementType(
			"org.muml.reconfiguration.componentstorydiagram.diagram.ComponentStoryPattern_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentVariable_3012 = getElementType(
			"org.muml.reconfiguration.componentstorydiagram.diagram.ComponentVariable_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentPartVariable_3014 = getElementType(
			"org.muml.reconfiguration.componentstorydiagram.diagram.ComponentPartVariable_3014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MultiPortVariable_3016 = getElementType(
			"org.muml.reconfiguration.componentstorydiagram.diagram.MultiPortVariable_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SinglePortVariable_3017 = getElementType(
			"org.muml.reconfiguration.componentstorydiagram.diagram.SinglePortVariable_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SinglePortVariable_3018 = getElementType(
			"org.muml.reconfiguration.componentstorydiagram.diagram.SinglePortVariable_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiPortVariable_3019 = getElementType(
			"org.muml.reconfiguration.componentstorydiagram.diagram.MultiPortVariable_3019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SinglePortVariable_3020 = getElementType(
			"org.muml.reconfiguration.componentstorydiagram.diagram.SinglePortVariable_3020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InitialNode_3007 = getElementType(
			"org.muml.reconfiguration.componentstorydiagram.diagram.InitialNode_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JunctionNode_3008 = getElementType(
			"org.muml.reconfiguration.componentstorydiagram.diagram.JunctionNode_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityFinalNode_3010 = getElementType(
			"org.muml.reconfiguration.componentstorydiagram.diagram.ActivityFinalNode_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControllerExchangeNode_3021 = getElementType(
			"org.muml.reconfiguration.componentstorydiagram.diagram.ControllerExchangeNode_3021"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ComponentStoryPattern_3022 = getElementType(
			"org.muml.reconfiguration.componentstorydiagram.diagram.ComponentStoryPattern_3022"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ComponentVariable_3023 = getElementType(
			"org.muml.reconfiguration.componentstorydiagram.diagram.ComponentVariable_3023"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FadingComponentPartVariable_3024 = getElementType(
			"org.muml.reconfiguration.componentstorydiagram.diagram.FadingComponentPartVariable_3024"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ActivityEdge_4001 = getElementType(
			"org.muml.reconfiguration.componentstorydiagram.diagram.ActivityEdge_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AssemblyVariable_4004 = getElementType(
			"org.muml.reconfiguration.componentstorydiagram.diagram.AssemblyVariable_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DelegationVariable_4005 = getElementType(
			"org.muml.reconfiguration.componentstorydiagram.diagram.DelegationVariable_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MultiPortOrderConstraint_4006 = getElementType(
			"org.muml.reconfiguration.componentstorydiagram.diagram.MultiPortOrderConstraint_4006"); //$NON-NLS-1$

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

			elements.put(ComponentStoryRule_1000, ComponentstorydiagramPackage.eINSTANCE.getComponentStoryRule());

			elements.put(Activity_2003, ActivitiesPackage.eINSTANCE.getActivity());

			elements.put(ComponentStoryNode_3001, ComponentstorydiagramPackage.eINSTANCE.getComponentStoryNode());

			elements.put(ComponentStoryPattern_3011, ComponentstorypatternPackage.eINSTANCE.getComponentStoryPattern());

			elements.put(ComponentVariable_3012, ComponentstorypatternPackage.eINSTANCE.getComponentVariable());

			elements.put(ComponentPartVariable_3014, ComponentstorypatternPackage.eINSTANCE.getComponentPartVariable());

			elements.put(MultiPortVariable_3016, ComponentstorypatternPackage.eINSTANCE.getMultiPortVariable());

			elements.put(SinglePortVariable_3017, ComponentstorypatternPackage.eINSTANCE.getSinglePortVariable());

			elements.put(SinglePortVariable_3018, ComponentstorypatternPackage.eINSTANCE.getSinglePortVariable());

			elements.put(MultiPortVariable_3019, ComponentstorypatternPackage.eINSTANCE.getMultiPortVariable());

			elements.put(SinglePortVariable_3020, ComponentstorypatternPackage.eINSTANCE.getSinglePortVariable());

			elements.put(InitialNode_3007, ActivitiesPackage.eINSTANCE.getInitialNode());

			elements.put(JunctionNode_3008, ActivitiesPackage.eINSTANCE.getJunctionNode());

			elements.put(ActivityFinalNode_3010, ActivitiesPackage.eINSTANCE.getActivityFinalNode());

			elements.put(ControllerExchangeNode_3021,
					ComponentstorydiagramPackage.eINSTANCE.getControllerExchangeNode());

			elements.put(ComponentStoryPattern_3022, ComponentstorypatternPackage.eINSTANCE.getComponentStoryPattern());

			elements.put(ComponentVariable_3023, ComponentstorypatternPackage.eINSTANCE.getComponentVariable());

			elements.put(FadingComponentPartVariable_3024,
					ComponentstorypatternPackage.eINSTANCE.getFadingComponentPartVariable());

			elements.put(ActivityEdge_4001, ActivitiesPackage.eINSTANCE.getActivityEdge());

			elements.put(AssemblyVariable_4004, ComponentstorypatternPackage.eINSTANCE.getAssemblyVariable());

			elements.put(DelegationVariable_4005, ComponentstorypatternPackage.eINSTANCE.getDelegationVariable());

			elements.put(MultiPortOrderConstraint_4006,
					ComponentstorypatternPackage.eINSTANCE.getMultiPortOrderConstraint());
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
			KNOWN_ELEMENT_TYPES.add(ComponentPartVariable_3014);
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
			KNOWN_ELEMENT_TYPES.add(ComponentVariable_3023);
			KNOWN_ELEMENT_TYPES.add(FadingComponentPartVariable_3024);
			KNOWN_ELEMENT_TYPES.add(ActivityEdge_4001);
			KNOWN_ELEMENT_TYPES.add(AssemblyVariable_4004);
			KNOWN_ELEMENT_TYPES.add(DelegationVariable_4005);
			KNOWN_ELEMENT_TYPES.add(MultiPortOrderConstraint_4006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ComponentStoryRuleEditPart.VISUAL_ID:
			return ComponentStoryRule_1000;
		case ActivityEditPart.VISUAL_ID:
			return Activity_2003;
		case ComponentStoryNodeEditPart.VISUAL_ID:
			return ComponentStoryNode_3001;
		case ComponentStoryPatternEditPart.VISUAL_ID:
			return ComponentStoryPattern_3011;
		case ComponentVariableEditPart.VISUAL_ID:
			return ComponentVariable_3012;
		case PartVariableEditPart.VISUAL_ID:
			return ComponentPartVariable_3014;
		case MultiPortVariableEditPart.VISUAL_ID:
			return MultiPortVariable_3016;
		case SinglePortVariableEditPart.VISUAL_ID:
			return SinglePortVariable_3017;
		case SinglePortVariable2EditPart.VISUAL_ID:
			return SinglePortVariable_3018;
		case MultiPortVariable2EditPart.VISUAL_ID:
			return MultiPortVariable_3019;
		case SinglePortVariable3EditPart.VISUAL_ID:
			return SinglePortVariable_3020;
		case InitialNodeEditPart.VISUAL_ID:
			return InitialNode_3007;
		case JunctionNodeEditPart.VISUAL_ID:
			return JunctionNode_3008;
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return ActivityFinalNode_3010;
		case ControllerExchangeNodeEditPart.VISUAL_ID:
			return ControllerExchangeNode_3021;
		case ComponentStoryPattern2EditPart.VISUAL_ID:
			return ComponentStoryPattern_3022;
		case ComponentVariable2EditPart.VISUAL_ID:
			return ComponentVariable_3023;
		case FadingComponentPartVariableEditPart.VISUAL_ID:
			return FadingComponentPartVariable_3024;
		case ActivityEdgeEditPart.VISUAL_ID:
			return ActivityEdge_4001;
		case AssemblyVariableEditPart.VISUAL_ID:
			return AssemblyVariable_4004;
		case DelegationVariableEditPart.VISUAL_ID:
			return DelegationVariable_4005;
		case MultiPortOrderConstraintEditPart.VISUAL_ID:
			return MultiPortOrderConstraint_4006;
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
			return org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes
					.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes
					.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
