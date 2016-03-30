package org.muml.pm.hardware.platform.diagram.custom.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.muml.pm.hardware.hwresource.Bus;
import org.muml.pm.hardware.hwresource.Link;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatform2EditPart;

/**
 * A customized EditPart for a {@link HWPlatform}. This customized EditPart
 * fixes the visualization of: -a connection between from
 * {@link BusPortInstance} to a {@link Bus} -a {@link Link} between two
 * {@link LinkPortInstance} -a connection between a {@link Bus} and a
 * {@link Bridge}
 * 
 * @author adann
 * 
 */
public class CustomHWPlatform2EditPart extends HWPlatform2EditPart {

	public CustomHWPlatform2EditPart(View view) {
		super(view);
	}

	@Override
	protected IFigure createNodeShape() {
		primaryShape = new CustomHWPlatformFigure();
		return primaryShape;

	}

	public class CustomHWPlatformFigure extends HWPlatform {

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
