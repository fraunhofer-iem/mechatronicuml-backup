package org.muml.pm.hardware.platforminstance.diagram.custom.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart;

/**
 * A customized EditPart for {@link HWPlatformInstance}. A customized Figure
 * will be used, which underlines the text.
 * 
 * @author adann
 * 
 */
public class CustomHWPlatformInstanceEditPart extends HWPlatformInstanceEditPart {

	public CustomHWPlatformInstanceEditPart(View view) {
		super(view);
	}

	@Override
	protected IFigure createNodeShape() {
		primaryShape =  new CustomHWPlatformFigure();
		((HWPlatform) primaryShape).getFigureHWPlatformNameLabel().setTextUnderline(true);
		return primaryShape;
	}

	@Override
	public void activate() {
		super.activate();
	}
	
	
	


	public class CustomHWPlatformFigure extends HWPlatform{
		@Override
		protected void fillShape(Graphics graphics) {
			Color bgColor = graphics.getBackgroundColor();
			Color fgColor = graphics.getForegroundColor();
			// Set the graphics color
			graphics.setForegroundColor(ColorConstants.menuBackground);
			graphics.setBackgroundColor(ColorConstants.menuBackgroundSelected);
			// Restore the original colors
			graphics.fillGradient(getBounds(), true);
			graphics.setBackgroundColor(bgColor);
			graphics.setForegroundColor(fgColor);
		}
	}
	

}
