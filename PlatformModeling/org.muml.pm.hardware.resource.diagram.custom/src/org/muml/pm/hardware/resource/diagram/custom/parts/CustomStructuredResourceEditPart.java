package org.muml.pm.hardware.resource.diagram.custom.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.muml.pm.hardware.common.figures.CustomIconFigure.ResourceType;
import org.muml.pm.hardware.resource.diagram.edit.parts.StructuredResourceEditPart;


/**
 * A customized EditPart for StructuredResources. A customized icon (a 3D-Box) for a StructuredResource will be used.
 * 
 * @author adann
 * 
 */
public class CustomStructuredResourceEditPart extends StructuredResourceEditPart {

	public CustomStructuredResourceEditPart(View view) {
		super(view);
	}

	@Override
	protected IFigure createNodeShape() {
		primaryShape = new CustomStructuredResourceFigure();
		((CustomStructuredResourceFigure) primaryShape).getFigureCustomStructuredIconFigure().setIcon(ResourceType.STRUCTURED);
		return primaryShape;
	}
	
	public class CustomStructuredResourceFigure extends StructuredResourceFigure{
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

