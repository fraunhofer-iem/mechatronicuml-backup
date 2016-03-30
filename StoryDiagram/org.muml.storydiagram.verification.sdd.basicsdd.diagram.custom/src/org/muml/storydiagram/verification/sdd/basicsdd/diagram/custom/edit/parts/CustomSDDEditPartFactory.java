package org.muml.storydiagram.verification.sdd.basicsdd.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.BasicSDDEditPartFactory;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.EdgeEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LeafNodeEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableNameEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodeEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodePatternNodeContentCompartmentEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodeTypeEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternStoryPatternContentCompartmentEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry;


/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author cgerking
 * 
 */
public class CustomSDDEditPartFactory extends BasicSDDEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (BasicSDDVisualIDRegistry.getVisualID(view)) {
			case LeafNodeEditPart.VISUAL_ID:
				return new CustomLeafNodeEditPart(view);
			case StoryPatternNodeTypeEditPart.VISUAL_ID:
				return new CustomPatternNodeTypeEditPart(view);	
			case StoryPatternNodeEditPart.VISUAL_ID:
				return new CustomPatternNodeEditPart(view);
			case ObjectVariableNameEditPart.VISUAL_ID:
				return new CustomObjectVariableNameLabelEditPart(view);
			case EdgeEditPart.VISUAL_ID:
				return new CustomEdgeEditPart(view);
			case StoryPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
				return new CustomStoryPatternContentCompartementEditPart(view);
			case StoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID:
				return new CustomPatternNodePatternNodeContentCompartmentEditPart(view);	
			};
			
		}
		return super.createEditPart(context, model);
	}

}
