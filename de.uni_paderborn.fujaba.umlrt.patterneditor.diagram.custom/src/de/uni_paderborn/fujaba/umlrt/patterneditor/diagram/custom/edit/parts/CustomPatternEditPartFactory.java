package de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.CoordinationPatternEditPart;
import de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.PatternDiagramEditPart;
import de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.TextualConstraintEditPart;
import de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.UmlrtEditPartFactory;
import de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.UmlrtVisualIDRegistry;

/**
 * Our customized EditPartFactory, which makes sure our overridden
 * EditPart-Classes are instantiated.
 * 
 * @author bingo
 * 
 */
public class CustomPatternEditPartFactory extends UmlrtEditPartFactory {
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (UmlrtVisualIDRegistry.getVisualID(view)) {
			case PatternDiagramEditPart.VISUAL_ID:
				return new CustomPatternDiagramEditPart(view);

			case CoordinationPatternEditPart.VISUAL_ID:
				return new CustomCoordinationPatternEditPart(view);

			case TextualConstraintEditPart.VISUAL_ID:
				return new CustomTextualConstraintEditPart(view);

			}
		}
		return super.createEditPart(context, model);
	}
}
