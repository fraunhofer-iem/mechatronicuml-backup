package org.muml.storydiagram.verification.sdd.basicsdd.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodePatternNodeContentCompartmentEditPart;

public class CustomPatternNodePatternNodeContentCompartmentEditPart extends
StoryPatternNodePatternNodeContentCompartmentEditPart {

	public CustomPatternNodePatternNodeContentCompartmentEditPart(View view) {
		super(view);
	}
	
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		
		result.setBorder(null);

		return result;
	}

}
