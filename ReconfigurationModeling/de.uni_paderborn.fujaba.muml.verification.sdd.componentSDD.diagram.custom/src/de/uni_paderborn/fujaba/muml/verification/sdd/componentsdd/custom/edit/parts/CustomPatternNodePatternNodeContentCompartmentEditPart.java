package de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodePatternNodeContentCompartmentEditPart;


public class CustomPatternNodePatternNodeContentCompartmentEditPart extends
ComponentStoryPatternNodePatternNodeContentCompartmentEditPart {

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
