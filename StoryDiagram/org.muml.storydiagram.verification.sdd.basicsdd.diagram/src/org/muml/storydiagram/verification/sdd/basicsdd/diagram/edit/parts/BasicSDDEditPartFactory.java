package org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class BasicSDDEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
					.getVisualID(view)) {

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryDecisionDiagramEditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryDecisionDiagramEditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodeEditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodeEditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodeNameEditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodeNameEditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodeTypeEditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodeTypeEditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LeafNodeEditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LeafNodeEditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternEditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternEditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableNameEditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableNameEditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.WrappingLabel2EditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.AttributeAssignmentEditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.AttributeAssignmentEditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ConstraintEditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ConstraintEditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableEditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableEditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.WrappingLabel3EditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableNameEditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableNameEditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.WrappingLabel4EditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.Constraint2EditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.Constraint2EditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodePatternNodeContentCompartmentEditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternStoryPatternContentCompartmentEditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternStoryPatternConstraintsCompartmentEditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableCollectionVariableConstraintsCompartmentEditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableCollectionVariableConstraintsCompartmentEditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableObjectVariableConstraintsCompartmentEditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.EdgeEditPart(
						view);

			case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LinkVariableEditPart.VISUAL_ID:
				return new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LinkVariableEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
