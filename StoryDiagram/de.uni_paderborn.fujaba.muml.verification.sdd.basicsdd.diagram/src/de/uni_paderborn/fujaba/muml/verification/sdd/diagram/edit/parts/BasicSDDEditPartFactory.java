package de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts;

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
			switch (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
					.getVisualID(view)) {

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryDecisionDiagramEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryDecisionDiagramEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeTypeEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeTypeEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.LeafNodeEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.LeafNodeEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.WrappingLabel2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.AttributeAssignmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.AttributeAssignmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ConstraintEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ConstraintEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.WrappingLabel3EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.WrappingLabel4EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.Constraint2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.Constraint2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodePatternNodeContentCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternStoryPatternContentCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternStoryPatternConstraintsCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableCollectionVariableConstraintsCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableCollectionVariableConstraintsCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableObjectVariableConstraintsCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.EdgeEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.LinkVariableEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.LinkVariableEditPart(
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
