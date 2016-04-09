package org.muml.storydiagram.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.muml.storydiagram.activities.ActivitiesPackage;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.diagram.edit.parts.ActivityCallNodeCalleeLabelEditPart;
import org.muml.storydiagram.diagram.edit.parts.ActivityCallNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.ActivityCallNodeNameEditPart;
import org.muml.storydiagram.diagram.edit.parts.ActivityEdgeEditPart;
import org.muml.storydiagram.diagram.edit.parts.ActivityEdgeGuardLabelEditPart;
import org.muml.storydiagram.diagram.edit.parts.ActivityEditPart;
import org.muml.storydiagram.diagram.edit.parts.ActivityFinalNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.ActivityFinalNodeLabelEditPart;
import org.muml.storydiagram.diagram.edit.parts.AttributeAssignmentEditPart;
import org.muml.storydiagram.diagram.edit.parts.CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart;
import org.muml.storydiagram.diagram.edit.parts.CollectionVariableCollectionVariableConstraintsCompartmentEditPart;
import org.muml.storydiagram.diagram.edit.parts.CollectionVariableEditPart;
import org.muml.storydiagram.diagram.edit.parts.CollectionVariableNameLabelEditPart;
import org.muml.storydiagram.diagram.edit.parts.CollectionVariableOperatorLabelEditPart;
import org.muml.storydiagram.diagram.edit.parts.CollectionVariableTypeLabelEditPart;
import org.muml.storydiagram.diagram.edit.parts.Constraint2EditPart;
import org.muml.storydiagram.diagram.edit.parts.ConstraintEditPart;
import org.muml.storydiagram.diagram.edit.parts.FlowFinalNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.InclusionLinkEditPart;
import org.muml.storydiagram.diagram.edit.parts.InclusionLinkLabelEditPart;
import org.muml.storydiagram.diagram.edit.parts.InitialNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.InitialNodeLabelEditPart;
import org.muml.storydiagram.diagram.edit.parts.JunctionNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.LinkVariableEditPart;
import org.muml.storydiagram.diagram.edit.parts.LinkVariableOperatorLabelEditPart;
import org.muml.storydiagram.diagram.edit.parts.LinkVariableSourceEndLabelEditPart;
import org.muml.storydiagram.diagram.edit.parts.LinkVariableTargetEndLabelEditPart;
import org.muml.storydiagram.diagram.edit.parts.MatchingPatternEditPart;
import org.muml.storydiagram.diagram.edit.parts.MatchingPatternStoryPatternConstraintsCompartmentEditPart;
import org.muml.storydiagram.diagram.edit.parts.MatchingPatternStoryPatternContentCompartmentEditPart;
import org.muml.storydiagram.diagram.edit.parts.MatchingStoryNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.MatchingStoryNodeNameEditPart;
import org.muml.storydiagram.diagram.edit.parts.MatchingStoryNodeStoryNodePatternCompartmentEditPart;
import org.muml.storydiagram.diagram.edit.parts.MaybeLinkEditPart;
import org.muml.storydiagram.diagram.edit.parts.MaybeLinkLabelEditPart;
import org.muml.storydiagram.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.ModifyingStoryNodeNameEditPart;
import org.muml.storydiagram.diagram.edit.parts.ModifyingStoryNodeStoryNodePatternCompartmentEditPart;
import org.muml.storydiagram.diagram.edit.parts.ObjectVariableEditPart;
import org.muml.storydiagram.diagram.edit.parts.ObjectVariableNameEditPart;
import org.muml.storydiagram.diagram.edit.parts.ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart;
import org.muml.storydiagram.diagram.edit.parts.ObjectVariableObjectVariableConstraintsCompartmentEditPart;
import org.muml.storydiagram.diagram.edit.parts.ObjectVariableOperatorEditPart;
import org.muml.storydiagram.diagram.edit.parts.ObjectVariableTypeLabelEditPart;
import org.muml.storydiagram.diagram.edit.parts.StatementNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.StatementNodeExpressionLabelEditPart;
import org.muml.storydiagram.diagram.edit.parts.StatementNodeNameEditPart;
import org.muml.storydiagram.diagram.edit.parts.StoryPatternEditPart;
import org.muml.storydiagram.diagram.edit.parts.StoryPatternStoryPatternConstraintsCompartmentEditPart;
import org.muml.storydiagram.diagram.edit.parts.StoryPatternStoryPatternContentCompartmentEditPart;
import org.muml.storydiagram.patterns.PatternsPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class StorydiagramsVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.muml.storydiagram.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ActivityEditPart.MODEL_ID.equals(view.getType())) {
				return ActivityEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.muml.storydiagram.diagram.part.StorydiagramsVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				StorydiagramsDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ActivitiesPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Activity) domainElement)) {
			return ActivityEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.muml.storydiagram.diagram.part.StorydiagramsVisualIDRegistry
				.getModelID(containerView);
		if (!ActivityEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ActivityEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.storydiagram.diagram.part.StorydiagramsVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ActivityEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ActivityEditPart.VISUAL_ID:
			if (ActivitiesPackage.eINSTANCE.getActivityCallNode().isSuperTypeOf(domainElement.eClass())) {
				return ActivityCallNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStatementNode().isSuperTypeOf(domainElement.eClass())) {
				return StatementNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getModifyingStoryNode().isSuperTypeOf(domainElement.eClass())) {
				return ModifyingStoryNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getMatchingStoryNode().isSuperTypeOf(domainElement.eClass())) {
				return MatchingStoryNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getInitialNode().isSuperTypeOf(domainElement.eClass())) {
				return InitialNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getJunctionNode().isSuperTypeOf(domainElement.eClass())) {
				return JunctionNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass())) {
				return FlowFinalNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass())) {
				return ActivityFinalNodeEditPart.VISUAL_ID;
			}
			break;
		case ModifyingStoryNodeStoryNodePatternCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getStoryPattern().isSuperTypeOf(domainElement.eClass())) {
				return StoryPatternEditPart.VISUAL_ID;
			}
			break;
		case StoryPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getCollectionVariable().isSuperTypeOf(domainElement.eClass())) {
				return CollectionVariableEditPart.VISUAL_ID;
			}
			if (PatternsPackage.eINSTANCE.getObjectVariable().isSuperTypeOf(domainElement.eClass())) {
				return ObjectVariableEditPart.VISUAL_ID;
			}
			break;
		case StoryPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
				return Constraint2EditPart.VISUAL_ID;
			}
			break;
		case CollectionVariableCollectionVariableConstraintsCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
				return ConstraintEditPart.VISUAL_ID;
			}
			break;
		case CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getAttributeAssignment().isSuperTypeOf(domainElement.eClass())) {
				return AttributeAssignmentEditPart.VISUAL_ID;
			}
			break;
		case ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
				return ConstraintEditPart.VISUAL_ID;
			}
			break;
		case ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getAttributeAssignment().isSuperTypeOf(domainElement.eClass())) {
				return AttributeAssignmentEditPart.VISUAL_ID;
			}
			break;
		case MatchingStoryNodeStoryNodePatternCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getMatchingPattern().isSuperTypeOf(domainElement.eClass())) {
				return MatchingPatternEditPart.VISUAL_ID;
			}
			break;
		case MatchingPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getCollectionVariable().isSuperTypeOf(domainElement.eClass())) {
				return CollectionVariableEditPart.VISUAL_ID;
			}
			if (PatternsPackage.eINSTANCE.getObjectVariable().isSuperTypeOf(domainElement.eClass())) {
				return ObjectVariableEditPart.VISUAL_ID;
			}
			break;
		case MatchingPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
				return Constraint2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.muml.storydiagram.diagram.part.StorydiagramsVisualIDRegistry
				.getModelID(containerView);
		if (!ActivityEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ActivityEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.storydiagram.diagram.part.StorydiagramsVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ActivityEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ActivityEditPart.VISUAL_ID:
			if (ActivityCallNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StatementNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ModifyingStoryNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MatchingStoryNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JunctionNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFinalNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityFinalNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityCallNodeEditPart.VISUAL_ID:
			if (ActivityCallNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityCallNodeCalleeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StatementNodeEditPart.VISUAL_ID:
			if (StatementNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StatementNodeExpressionLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			if (ModifyingStoryNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ModifyingStoryNodeStoryNodePatternCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MatchingStoryNodeEditPart.VISUAL_ID:
			if (MatchingStoryNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MatchingStoryNodeStoryNodePatternCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InitialNodeEditPart.VISUAL_ID:
			if (InitialNodeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityFinalNodeEditPart.VISUAL_ID:
			if (ActivityFinalNodeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StoryPatternEditPart.VISUAL_ID:
			if (StoryPatternStoryPatternContentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StoryPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollectionVariableEditPart.VISUAL_ID:
			if (CollectionVariableOperatorLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollectionVariableNameLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollectionVariableTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollectionVariableCollectionVariableConstraintsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ObjectVariableEditPart.VISUAL_ID:
			if (ObjectVariableOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ObjectVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ObjectVariableTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MatchingPatternEditPart.VISUAL_ID:
			if (MatchingPatternStoryPatternContentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MatchingPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModifyingStoryNodeStoryNodePatternCompartmentEditPart.VISUAL_ID:
			if (StoryPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StoryPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
			if (CollectionVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ObjectVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StoryPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID:
			if (Constraint2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollectionVariableCollectionVariableConstraintsCompartmentEditPart.VISUAL_ID:
			if (ConstraintEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
			if (AttributeAssignmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID:
			if (ConstraintEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
			if (AttributeAssignmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MatchingStoryNodeStoryNodePatternCompartmentEditPart.VISUAL_ID:
			if (MatchingPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MatchingPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
			if (CollectionVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ObjectVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MatchingPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID:
			if (Constraint2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityEdgeEditPart.VISUAL_ID:
			if (ActivityEdgeGuardLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LinkVariableEditPart.VISUAL_ID:
			if (LinkVariableSourceEndLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LinkVariableOperatorLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LinkVariableTargetEndLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InclusionLinkEditPart.VISUAL_ID:
			if (InclusionLinkLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MaybeLinkEditPart.VISUAL_ID:
			if (MaybeLinkLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ActivitiesPackage.eINSTANCE.getActivityEdge().isSuperTypeOf(domainElement.eClass())) {
			return ActivityEdgeEditPart.VISUAL_ID;
		}
		if (PatternsPackage.eINSTANCE.getLinkVariable().isSuperTypeOf(domainElement.eClass())) {
			return LinkVariableEditPart.VISUAL_ID;
		}
		if (PatternsPackage.eINSTANCE.getInclusionLink().isSuperTypeOf(domainElement.eClass())) {
			return InclusionLinkEditPart.VISUAL_ID;
		}
		if (PatternsPackage.eINSTANCE.getMaybeLink().isSuperTypeOf(domainElement.eClass())) {
			return MaybeLinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Activity element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case ModifyingStoryNodeStoryNodePatternCompartmentEditPart.VISUAL_ID:
		case StoryPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
		case StoryPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID:
		case CollectionVariableCollectionVariableConstraintsCompartmentEditPart.VISUAL_ID:
		case CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
		case ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID:
		case ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
		case MatchingStoryNodeStoryNodePatternCompartmentEditPart.VISUAL_ID:
		case MatchingPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
		case MatchingPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ActivityEditPart.VISUAL_ID:
			return false;
		case ActivityCallNodeEditPart.VISUAL_ID:
		case StatementNodeEditPart.VISUAL_ID:
		case InitialNodeEditPart.VISUAL_ID:
		case JunctionNodeEditPart.VISUAL_ID:
		case FlowFinalNodeEditPart.VISUAL_ID:
		case ActivityFinalNodeEditPart.VISUAL_ID:
		case AttributeAssignmentEditPart.VISUAL_ID:
		case ConstraintEditPart.VISUAL_ID:
		case Constraint2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return org.muml.storydiagram.diagram.part.StorydiagramsVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return org.muml.storydiagram.diagram.part.StorydiagramsVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.muml.storydiagram.diagram.part.StorydiagramsVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return org.muml.storydiagram.diagram.part.StorydiagramsVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return org.muml.storydiagram.diagram.part.StorydiagramsVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return org.muml.storydiagram.diagram.part.StorydiagramsVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
