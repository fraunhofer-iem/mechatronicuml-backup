package org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry;

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
			switch (BasicSDDVisualIDRegistry.getVisualID(view)) {

			case StoryDecisionDiagramEditPart.VISUAL_ID:
				return new StoryDecisionDiagramEditPart(view);

			case StoryPatternNodeEditPart.VISUAL_ID:
				return new StoryPatternNodeEditPart(view);

			case StoryPatternNodeNameEditPart.VISUAL_ID:
				return new StoryPatternNodeNameEditPart(view);

			case StoryPatternNodeTypeEditPart.VISUAL_ID:
				return new StoryPatternNodeTypeEditPart(view);

			case LeafNodeEditPart.VISUAL_ID:
				return new LeafNodeEditPart(view);

			case StoryPatternEditPart.VISUAL_ID:
				return new StoryPatternEditPart(view);

			case CollectionVariableEditPart.VISUAL_ID:
				return new CollectionVariableEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case CollectionVariableNameEditPart.VISUAL_ID:
				return new CollectionVariableNameEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case AttributeAssignmentEditPart.VISUAL_ID:
				return new AttributeAssignmentEditPart(view);

			case ConstraintEditPart.VISUAL_ID:
				return new ConstraintEditPart(view);

			case ObjectVariableEditPart.VISUAL_ID:
				return new ObjectVariableEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case ObjectVariableNameEditPart.VISUAL_ID:
				return new ObjectVariableNameEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case Constraint2EditPart.VISUAL_ID:
				return new Constraint2EditPart(view);

			case StoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID:
				return new StoryPatternNodePatternNodeContentCompartmentEditPart(view);

			case StoryPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
				return new StoryPatternStoryPatternContentCompartmentEditPart(view);

			case StoryPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID:
				return new StoryPatternStoryPatternConstraintsCompartmentEditPart(view);

			case CollectionVariableCollectionVariableConstraintsCompartmentEditPart.VISUAL_ID:
				return new CollectionVariableCollectionVariableConstraintsCompartmentEditPart(view);

			case CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
				return new CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart(view);

			case ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID:
				return new ObjectVariableObjectVariableConstraintsCompartmentEditPart(view);

			case ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
				return new ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart(view);

			case EdgeEditPart.VISUAL_ID:
				return new EdgeEditPart(view);

			case LinkVariableEditPart.VISUAL_ID:
				return new LinkVariableEditPart(view);

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
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
