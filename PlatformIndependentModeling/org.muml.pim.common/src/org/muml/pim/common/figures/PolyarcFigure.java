package org.muml.pim.common.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

public class PolyarcFigure extends PolylineShape {
	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.pushState();
		graphics.translate(getLocation());

		drawArcFromPointList(graphics, getPoints());

		graphics.popState();
	}

	public static void drawArcFromPointList(Graphics graphics, PointList points) {
		Point pt = new Point();
		Point last = null;
		for (int i = 0; i < points.size(); i++) {
			points.getPoint(pt, i);
			if (last == null) {
				last = new Point();
			} else {
				drawArc(graphics, last, pt);
			}
			last.setLocation(pt);
		}
	}

	public static void drawArc(Graphics graphics, Point pt1, Point pt2) {
		// Calculate middle of the vector describing the direction from pt1 to
		// pt2. The vector calculated will be relative from the origin, not from
		// pt1 (see (*)).
		// This position will be used as the center of the circle to draw.
		double middleX = (pt2.x - pt1.x) / 2.0;
		double middleY = (pt2.y - pt1.y) / 2.0;

		// Calculate the length of the vector pointing from the origin to our
		// middle vector (i.e. the length of the middle vector).
		// This length will be the radius for the circle.
		double radius = Math.sqrt(middleX * middleX + middleY * middleY);

		// Calculate the outer rectangle around the circle.
		Rectangle outer = new Rectangle((int) (middleX - radius),
				(int) (middleY - radius), (int) (radius * 2),
				(int) (radius * 2));

		// Translate this rectangle by pt1 (*)
		outer.translate(pt1);

		// Calculate the normalized vector pointing from pt1 to pt2. It
		// intersects the unit circle and can be used to calculate alpha.
		double normX = middleX / radius;
		double normY = -(middleY / radius); // convert into the mathematical
											// coordinate system

		final double alpha;
		if (normY >= 0) {
			// first and second quadrant
			alpha = 180.0 * Math.acos(normX) / Math.PI;
		} else if (normY <= 0 && normX < 0) {
			// third quadrant
			alpha = 180.0 * Math.asin(-normY) / Math.PI + 180;
		} else {
			// fourth quadrant
			alpha = 180.0 * Math.asin(normY) / Math.PI;
		}
		// Draw the arc
		graphics.drawArc(outer.x, outer.y, outer.width, outer.height,
				(int) alpha, 180);
	}
}
