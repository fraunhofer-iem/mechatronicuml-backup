package org.muml.storydiagram.diagram.providers;

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
import org.muml.storydiagram.activities.ActivitiesPackage;
import org.muml.storydiagram.diagram.edit.parts.ActivityCallNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.ActivityEdgeEditPart;
import org.muml.storydiagram.diagram.edit.parts.ActivityEditPart;
import org.muml.storydiagram.diagram.edit.parts.ActivityFinalNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.AttributeAssignmentEditPart;
import org.muml.storydiagram.diagram.edit.parts.CollectionVariableEditPart;
import org.muml.storydiagram.diagram.edit.parts.Constraint2EditPart;
import org.muml.storydiagram.diagram.edit.parts.ConstraintEditPart;
import org.muml.storydiagram.diagram.edit.parts.FlowFinalNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.InclusionLinkEditPart;
import org.muml.storydiagram.diagram.edit.parts.InitialNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.JunctionNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.LinkVariableEditPart;
import org.muml.storydiagram.diagram.edit.parts.MatchingPatternEditPart;
import org.muml.storydiagram.diagram.edit.parts.MatchingStoryNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.MaybeLinkEditPart;
import org.muml.storydiagram.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.ObjectVariableEditPart;
import org.muml.storydiagram.diagram.edit.parts.StatementNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.StoryPatternEditPart;
import org.muml.storydiagram.diagram.part.StorydiagramsDiagramEditorPlugin;
import org.muml.storydiagram.patterns.PatternsPackage;

/**
 * @generated
 */
public class StorydiagramsElementTypes {

	/**
	 * @generated
	 */
	private StorydiagramsElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			StorydiagramsDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Activity_1000 = getElementType("org.muml.storydiagram.diagram.Activity_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityCallNode_2001 = getElementType(
			"org.muml.storydiagram.diagram.ActivityCallNode_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StatementNode_2002 = getElementType(
			"org.muml.storydiagram.diagram.StatementNode_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ModifyingStoryNode_2003 = getElementType(
			"org.muml.storydiagram.diagram.ModifyingStoryNode_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MatchingStoryNode_2004 = getElementType(
			"org.muml.storydiagram.diagram.MatchingStoryNode_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InitialNode_2005 = getElementType(
			"org.muml.storydiagram.diagram.InitialNode_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JunctionNode_2006 = getElementType(
			"org.muml.storydiagram.diagram.JunctionNode_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FlowFinalNode_2007 = getElementType(
			"org.muml.storydiagram.diagram.FlowFinalNode_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityFinalNode_2008 = getElementType(
			"org.muml.storydiagram.diagram.ActivityFinalNode_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StoryPattern_3001 = getElementType(
			"org.muml.storydiagram.diagram.StoryPattern_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CollectionVariable_3002 = getElementType(
			"org.muml.storydiagram.diagram.CollectionVariable_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AttributeAssignment_3003 = getElementType(
			"org.muml.storydiagram.diagram.AttributeAssignment_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Constraint_3004 = getElementType("org.muml.storydiagram.diagram.Constraint_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObjectVariable_3005 = getElementType(
			"org.muml.storydiagram.diagram.ObjectVariable_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Constraint_3006 = getElementType("org.muml.storydiagram.diagram.Constraint_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MatchingPattern_3007 = getElementType(
			"org.muml.storydiagram.diagram.MatchingPattern_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityEdge_4001 = getElementType(
			"org.muml.storydiagram.diagram.ActivityEdge_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LinkVariable_4002 = getElementType(
			"org.muml.storydiagram.diagram.LinkVariable_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InclusionLink_4003 = getElementType(
			"org.muml.storydiagram.diagram.InclusionLink_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MaybeLink_4004 = getElementType("org.muml.storydiagram.diagram.MaybeLink_4004"); //$NON-NLS-1$

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

			elements.put(Activity_1000, ActivitiesPackage.eINSTANCE.getActivity());

			elements.put(ActivityCallNode_2001, ActivitiesPackage.eINSTANCE.getActivityCallNode());

			elements.put(StatementNode_2002, ActivitiesPackage.eINSTANCE.getStatementNode());

			elements.put(ModifyingStoryNode_2003, ActivitiesPackage.eINSTANCE.getModifyingStoryNode());

			elements.put(MatchingStoryNode_2004, ActivitiesPackage.eINSTANCE.getMatchingStoryNode());

			elements.put(InitialNode_2005, ActivitiesPackage.eINSTANCE.getInitialNode());

			elements.put(JunctionNode_2006, ActivitiesPackage.eINSTANCE.getJunctionNode());

			elements.put(FlowFinalNode_2007, ActivitiesPackage.eINSTANCE.getFlowFinalNode());

			elements.put(ActivityFinalNode_2008, ActivitiesPackage.eINSTANCE.getActivityFinalNode());

			elements.put(StoryPattern_3001, PatternsPackage.eINSTANCE.getStoryPattern());

			elements.put(CollectionVariable_3002, PatternsPackage.eINSTANCE.getCollectionVariable());

			elements.put(AttributeAssignment_3003, PatternsPackage.eINSTANCE.getAttributeAssignment());

			elements.put(Constraint_3004, PatternsPackage.eINSTANCE.getConstraint());

			elements.put(ObjectVariable_3005, PatternsPackage.eINSTANCE.getObjectVariable());

			elements.put(Constraint_3006, PatternsPackage.eINSTANCE.getConstraint());

			elements.put(MatchingPattern_3007, PatternsPackage.eINSTANCE.getMatchingPattern());

			elements.put(ActivityEdge_4001, ActivitiesPackage.eINSTANCE.getActivityEdge());

			elements.put(LinkVariable_4002, PatternsPackage.eINSTANCE.getLinkVariable());

			elements.put(InclusionLink_4003, PatternsPackage.eINSTANCE.getInclusionLink());

			elements.put(MaybeLink_4004, PatternsPackage.eINSTANCE.getMaybeLink());
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
			KNOWN_ELEMENT_TYPES.add(Activity_1000);
			KNOWN_ELEMENT_TYPES.add(ActivityCallNode_2001);
			KNOWN_ELEMENT_TYPES.add(StatementNode_2002);
			KNOWN_ELEMENT_TYPES.add(ModifyingStoryNode_2003);
			KNOWN_ELEMENT_TYPES.add(MatchingStoryNode_2004);
			KNOWN_ELEMENT_TYPES.add(InitialNode_2005);
			KNOWN_ELEMENT_TYPES.add(JunctionNode_2006);
			KNOWN_ELEMENT_TYPES.add(FlowFinalNode_2007);
			KNOWN_ELEMENT_TYPES.add(ActivityFinalNode_2008);
			KNOWN_ELEMENT_TYPES.add(StoryPattern_3001);
			KNOWN_ELEMENT_TYPES.add(CollectionVariable_3002);
			KNOWN_ELEMENT_TYPES.add(AttributeAssignment_3003);
			KNOWN_ELEMENT_TYPES.add(Constraint_3004);
			KNOWN_ELEMENT_TYPES.add(ObjectVariable_3005);
			KNOWN_ELEMENT_TYPES.add(Constraint_3006);
			KNOWN_ELEMENT_TYPES.add(MatchingPattern_3007);
			KNOWN_ELEMENT_TYPES.add(ActivityEdge_4001);
			KNOWN_ELEMENT_TYPES.add(LinkVariable_4002);
			KNOWN_ELEMENT_TYPES.add(InclusionLink_4003);
			KNOWN_ELEMENT_TYPES.add(MaybeLink_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ActivityEditPart.VISUAL_ID:
			return Activity_1000;
		case ActivityCallNodeEditPart.VISUAL_ID:
			return ActivityCallNode_2001;
		case StatementNodeEditPart.VISUAL_ID:
			return StatementNode_2002;
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return ModifyingStoryNode_2003;
		case MatchingStoryNodeEditPart.VISUAL_ID:
			return MatchingStoryNode_2004;
		case InitialNodeEditPart.VISUAL_ID:
			return InitialNode_2005;
		case JunctionNodeEditPart.VISUAL_ID:
			return JunctionNode_2006;
		case FlowFinalNodeEditPart.VISUAL_ID:
			return FlowFinalNode_2007;
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return ActivityFinalNode_2008;
		case StoryPatternEditPart.VISUAL_ID:
			return StoryPattern_3001;
		case CollectionVariableEditPart.VISUAL_ID:
			return CollectionVariable_3002;
		case AttributeAssignmentEditPart.VISUAL_ID:
			return AttributeAssignment_3003;
		case ConstraintEditPart.VISUAL_ID:
			return Constraint_3004;
		case ObjectVariableEditPart.VISUAL_ID:
			return ObjectVariable_3005;
		case Constraint2EditPart.VISUAL_ID:
			return Constraint_3006;
		case MatchingPatternEditPart.VISUAL_ID:
			return MatchingPattern_3007;
		case ActivityEdgeEditPart.VISUAL_ID:
			return ActivityEdge_4001;
		case LinkVariableEditPart.VISUAL_ID:
			return LinkVariable_4002;
		case InclusionLinkEditPart.VISUAL_ID:
			return InclusionLink_4003;
		case MaybeLinkEditPart.VISUAL_ID:
			return MaybeLink_4004;
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
			return org.muml.storydiagram.diagram.providers.StorydiagramsElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return org.muml.storydiagram.diagram.providers.StorydiagramsElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return org.muml.storydiagram.diagram.providers.StorydiagramsElementTypes.getElement(elementTypeAdapter);
		}
	};

}
