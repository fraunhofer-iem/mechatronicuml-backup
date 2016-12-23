package org.muml.pm.hardware.platforminstance.diagram.custom.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart;

/**
 * A customized EditPart for {@link StructuredResourceInstance}. 
 * A customized Figure will be used, which underlines the text.
 * 
 * @author adann
 * 
 */
public class CustomStructuredResourceInstanceEditPart extends
		StructuredResourceInstanceEditPart {

	public CustomStructuredResourceInstanceEditPart(View view) {
		super(view);
	}
	
	@Override
	protected IFigure createNodeShape() {
		 primaryShape = new CustomStructuredResourceFigure();
		 ((CustomStructuredResourceFigure) primaryShape).getFigureResourceNameFigure().setTextUnderline(true);
		 ((CustomStructuredResourceFigure) primaryShape).getFigureResourceKindFigure().setTextUnderline(true);
		return primaryShape;
	} 
	

	
	public class CustomStructuredResourceFigure extends ResourceFigure{
		@Override
		protected void fillShape(Graphics graphics) {
			Color bgColor = graphics.getBackgroundColor();
			Color fgColor = graphics.getForegroundColor();
			// Set the graphics color
			graphics.setForegroundColor(ColorConstants.buttonLightest);
			graphics.setBackgroundColor(ColorConstants.buttonDarker);
			// Restore the original colors
			graphics.fillGradient(getBounds(), true);
			graphics.setBackgroundColor(bgColor);
			graphics.setForegroundColor(fgColor);
		}

	}
}
