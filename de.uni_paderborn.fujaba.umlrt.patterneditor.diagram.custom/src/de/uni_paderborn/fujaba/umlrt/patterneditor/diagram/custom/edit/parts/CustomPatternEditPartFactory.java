package de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.CoordinationPatternEditPart;
import de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.PatternEditPartFactory;
import de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.TextualConstraintEditPart;
import de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternVisualIDRegistry;

public class CustomPatternEditPartFactory extends PatternEditPartFactory {
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (PatternVisualIDRegistry.getVisualID(view)) {
			case CoordinationPatternEditPart.VISUAL_ID:
				return new CustomCoordinationPatternEditPart(view);

			case TextualConstraintEditPart.VISUAL_ID:
				return new CustomTextualConstraintEditPart(view);

			}
		}
		return super.createEditPart(context, model);
	}
}
