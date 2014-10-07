package de.uni_paderborn.fujaba.muml.verification.sdd.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.EdgeEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.LeafNodeEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableNameEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodePatternNodeContentCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeTypeEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.BasicSDDEditPartFactory;
import de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternStoryPatternContentCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry;


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
