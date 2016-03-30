package org.muml.core.common.edit.policies;

/**
 * Adapted BorderItemSelectionEditPolicy to fix Muml-Bug #58.
 * 
 * @author bingo
 * 
 */
// (Copied from NonResizableLabelEditPolicy and slightly modified, see comments
// below)
public class BorderItemSelectionEditPolicy
		extends
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy {

	private org.eclipse.draw2d.Polyline tether = null;

	protected void eraseChangeBoundsFeedback(
			org.eclipse.gef.requests.ChangeBoundsRequest request) {
		super.eraseChangeBoundsFeedback(request);
		if (tether != null)
			removeFeedback(tether);
		tether = null;
	}

	protected org.eclipse.draw2d.IFigure createDragSourceFeedbackFigure() {
		org.eclipse.draw2d.IFigure feedback = super
				.createDragSourceFeedbackFigure();
		tether = new org.eclipse.draw2d.Polyline();
		tether.setLineStyle(org.eclipse.draw2d.Graphics.LINE_DASHDOT);
		tether.setForegroundColor(((org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart) getHost())
				.getFigure().getForegroundColor());
		addFeedback(tether);
		return feedback;
	}

	protected void showChangeBoundsFeedback(
			org.eclipse.gef.requests.ChangeBoundsRequest request) {

		org.eclipse.draw2d.IFigure p = getDragSourceFeedbackFigure();
		org.eclipse.draw2d.geometry.Rectangle r = p.getBounds();
		org.eclipse.draw2d.geometry.Point refPoint = ((org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart) getHost())
				.getReferencePoint();

		// translate the feedback figure
		org.eclipse.draw2d.geometry.PrecisionRectangle rect = new org.eclipse.draw2d.geometry.PrecisionRectangle(
				getInitialFeedbackBounds().getCopy());
		getHostFigure().translateToAbsolute(rect);
		rect.translate(request.getMoveDelta());
		rect.resize(request.getSizeDelta());
		p.translateToRelative(rect);

		/* BEGIN MODIFIED for Muml-Bug #58 */
		/* Commented out the following line ... */

		// p.setBounds(rect);

		/* ... and replaced it with super call */
		super.showChangeBoundsFeedback(request);
		/* END MODIFIED for Muml-Bug #58 */

		org.eclipse.draw2d.geometry.Rectangle centerMain = null;
		// TODO: remove this hack. We should be using the reference point for
		// the teher end, however,
		// the reference point is causing miscaculation when positioning. This
		// has to be redone in version 2.
		if (((org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart) getHost()
				.getParent()).getFigure() instanceof org.eclipse.draw2d.Connection) {
			centerMain = new org.eclipse.draw2d.geometry.Rectangle(refPoint.x,
					refPoint.y, 0, 0);
			getHostFigure().translateToAbsolute(centerMain);
			p.translateToRelative(centerMain);
		} else {
			centerMain = ((org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart) getHost()
					.getParent()).getFigure().getBounds().getCopy();
			centerMain.translate(centerMain.width / 2, centerMain.height / 2);
			getHostFigure().translateToAbsolute(centerMain);
			p.translateToRelative(centerMain);
		}

		org.eclipse.draw2d.geometry.PrecisionRectangle ref = new org.eclipse.draw2d.geometry.PrecisionRectangle(
				centerMain);

		org.eclipse.draw2d.geometry.Point midTop = new org.eclipse.draw2d.geometry.Point(
				r.x + r.width / 2, r.y);
		org.eclipse.draw2d.geometry.Point midBottom = new org.eclipse.draw2d.geometry.Point(
				r.x + r.width / 2, r.y + r.height);
		org.eclipse.draw2d.geometry.Point midLeft = new org.eclipse.draw2d.geometry.Point(
				r.x, r.y + r.height / 2);
		org.eclipse.draw2d.geometry.Point midRight = new org.eclipse.draw2d.geometry.Point(
				r.x + r.width, r.y + r.height / 2);

		org.eclipse.draw2d.geometry.Point startPoint = midTop;

		int x = r.x + r.width / 2 - refPoint.x;
		int y = r.y + r.height / 2 - refPoint.y;

		if (y > 0 && y > x && y > -x)
			startPoint = midTop;
		else if (y < 0 && y < x && y < -x)
			startPoint = midBottom;
		else if (x < 0 && y > x && y < -x)
			startPoint = midRight;
		else
			startPoint = midLeft;

		tether.setStart(startPoint);
		tether.setEnd(ref.getLocation());
	}

	protected java.util.List<?> createSelectionHandles() {
		org.eclipse.gef.handles.MoveHandle mh = new org.eclipse.gef.handles.MoveHandle(
				(org.eclipse.gef.GraphicalEditPart) getHost());
		mh.setBorder(null);
		return java.util.Collections.singletonList(mh);
	}
}