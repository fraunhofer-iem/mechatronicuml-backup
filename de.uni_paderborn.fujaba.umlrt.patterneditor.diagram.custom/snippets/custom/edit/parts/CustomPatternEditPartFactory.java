package patterneditor.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import patterneditor.diagram.edit.parts.PatternDiagramEditPart;
import patterneditor.diagram.edit.parts.PatternEditPartFactory;
import patterneditor.diagram.part.PatternVisualIDRegistry;

public class CustomPatternEditPartFactory extends PatternEditPartFactory {
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (PatternVisualIDRegistry.getVisualID(view)) {
			case PatternDiagramEditPart.VISUAL_ID:
				return new CustomPatternDiagramEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}
}
