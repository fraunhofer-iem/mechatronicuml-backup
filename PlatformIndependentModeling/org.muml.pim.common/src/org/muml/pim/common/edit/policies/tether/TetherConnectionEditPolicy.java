package org.muml.pim.common.edit.policies.tether;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.eclipse.gmf.runtime.draw2d.ui.geometry.PointListUtilities;

/**
 * Customized and more extendable version of TetherConnectionEditPolicy using a
 * Polyline instead of a PolylineConnectionEx. We calculate positions using the
 * node's ConnectionAnchor when available.
 * 
 * @author ingo
 * 
 */
public class TetherConnectionEditPolicy
		extends
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.TetherConnectionEditPolicy {

	protected Polyline tether;

	public Polyline getConnection() {
		if (tether == null) {
			tether = new Polyline();
			tether.setLineStyle(Graphics.LINE_DASH);
		}
		return tether;
	}

	/**
	 * Updates the end-points of the tether based on the figure's position.
	 */
	public void refresh() {
		getConnection().setStart(getNewStartPoint()); // start from host figure
		getConnection().setEnd(getNewEndPoint()); // end at parent figure
		getConnection().setForegroundColor(
				((AbstractGraphicalEditPart) getHost().getParent()).getFigure()
						.getForegroundColor());
	}

	// Adapted from
	// org.eclipse.gmf.runtime.diagram.ui.editpolicies.TetherConnectionEditPolicy.refresh()
	protected Point getNewEndPoint() {
		PointList pl = new PointList();
		Point endPoint = new Point();
		if (getHost().getParent() instanceof AbstractConnectionEditPart) {
			AbstractConnectionEditPart connectionClassEP = (AbstractConnectionEditPart) getHost()
					.getParent();
			pl = connectionClassEP.getConnectionFigure().getPoints();
			endPoint = PointListUtilities.calculatePointRelativeToLine(pl, 0,
					50, true);
		} else {
			IFigure fig = ((AbstractGraphicalEditPart) getHost().getParent())
					.getFigure();
			endPoint = fig.getBounds().getLocation();

			// Use the node's connection anchor if available
			if (fig instanceof BorderedNodeFigure) {
				// Get endPos from anchor
				ConnectionAnchor anchor = ((BorderedNodeFigure) fig)
						.getConnectionAnchor("");

				if (anchor != null) {
					// Get absolute coordinates of start reference point for use with anchor.
					Point startRef = getStartRefPoint();
					Point startRefAbsolute = startRef.getCopy();
					getHostFigure().translateToAbsolute(startRefAbsolute);
	
					// Ask anchor, which works with absolute coordinates, so
					// translate accordingly.
					endPoint = anchor.getLocation(startRefAbsolute);
					getHostFigure().translateToRelative(endPoint);
				}
			}
		}
		return endPoint;
	}

	// Adapted from
	// org.eclipse.gmf.runtime.diagram.ui.editpolicies.TetherConnectionEditPolicy.refresh()
	protected Point getNewStartPoint() {
		Point endRef = getEndRefPoint();

		IFigure figure = ((GraphicalEditPart) getHost()).getFigure();
		Rectangle r = figure.getBounds().getCopy();

		Point midTop = new Point(r.x + r.width / 2, r.y);
		Point midBottom = new Point(r.x + r.width / 2, r.y + r.height);
		Point midLeft = new Point(r.x, r.y + r.height / 2);
		Point midRight = new Point(r.x + r.width, r.y + r.height / 2);

		Point startPoint = midTop;

		int x = r.x + r.width / 2 - endRef.x;
		int y = r.y + r.height / 2 - endRef.y;

		if (y > 0 && y > x && y > -x)
			startPoint = midTop;
		else if (y < 0 && y < x && y < -x)
			startPoint = midBottom;
		else if (x < 0 && y > x && y < -x)
			startPoint = midRight;
		else
			startPoint = midLeft;

		return startPoint;
	}

	/**
	 * Start reference point, for calculating the end point. We use the center of the start figure.
	 */
	protected Point getStartRefPoint() {
		return getHostFigure().getBounds().getCenter();
	}

	/**
	 * End reference point, for calculating the start point. We use the center of the end figure.
	 */
	protected Point getEndRefPoint() {
		Point endRef = ((GraphicalEditPart) getHost().getParent()).getFigure()
				.getBounds().getCenter();
		return endRef;
	}
}
