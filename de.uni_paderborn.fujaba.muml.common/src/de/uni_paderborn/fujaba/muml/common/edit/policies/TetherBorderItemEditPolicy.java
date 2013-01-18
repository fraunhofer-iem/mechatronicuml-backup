package de.uni_paderborn.fujaba.muml.common.edit.policies;

import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;

public class TetherBorderItemEditPolicy extends BorderItemSelectionEditPolicy {

	protected boolean tetherShown = true;
	
	public boolean isTetherShown() {
		return tetherShown;
	}

	public void setTetherShown(boolean tetherShown) {
		this.tetherShown = tetherShown;
		getConnection().setVisible(tetherShown);
	}

	private OwnerMovedListener ownerMovedListener = new OwnerMovedListener();

	/**
	 * Listens to the owner figure being moved so the tether position can be
	 * updated when this occurs.
	 */
	class OwnerMovedListener implements FigureListener {

		/**
		 * @see org.eclipse.draw2d.FigureListener#figureMoved(org.eclipse.draw2d.IFigure)
		 */
		public void figureMoved(IFigure source) {
			updatePosition();
		}
	}

	private Polyline tether = null;

	protected void eraseChangeBoundsFeedback(ChangeBoundsRequest request) {
		// magic(request);

		// System.out.println("erase");

		super.eraseChangeBoundsFeedback(request);

		tether.setVisible(tetherShown);
	}

	protected IFigure createDragSourceFeedbackFigure() {
		IFigure feedback = super.createDragSourceFeedbackFigure();
		return feedback;
	}

	private Polyline getConnection() {
		if (tether == null) {
			tether = new Polyline();
			tether.setLineStyle(Graphics.LINE_DASH);
			//tether.setLineDashOffset(1);
			tether.setLineWidth(2);
			// tether.setLineWidth(1);
			// tether.getLineAttributes().dashOffset =

			tether.setForegroundColor(((IGraphicalEditPart) getHost())
					.getFigure().getForegroundColor());
		}
		return tether;
	}

	@Override
	public void deactivate() {
		if (tether != null) {
			getHostFigure().getParent().remove(tether);
			((IGraphicalEditPart) getHost()).getFigure().removeFigureListener(
					ownerMovedListener);
			tether = null;
		}
		super.deactivate();
	}

	@Override
	public void activate() {
		super.activate();
		getHostFigure().getParent().add(getConnection());
		((IGraphicalEditPart) getHost()).getFigure().addFigureListener(
				ownerMovedListener);
		getConnection().setVisible(tetherShown);
		updatePosition();
	}

	private void updatePosition() {
		// Get endPos and translate
		Point startPos;
		// if (false) {
		// endPos = getDragSourceFeedbackFigure().getBounds().getLocation();
		// getHostFigure().getParent().translateToRelative(endPos);
		// } else {
		Rectangle endBounds = getHostFigure().getBounds();
		startPos = endBounds.getLocation();
		// }

		// Get endPos from anchor
		// BorderedBorderItemEditPart whoAmI = (BorderedBorderItemEditPart)
		// getHost()
		// .getParent();
		// BorderedNodeFigure fig = (BorderedNodeFigure) whoAmI
		// .getFigure();
		// ConnectionAnchor anchor = fig.getConnectionAnchor("");
		// Point endPos = anchor.getLocation(startPos);
		//
		// // Translate startPos
		// fig.getParent().translateToAbsolute(endPos);
		// getHostFigure().getParent().translateToRelative(startPos);

		Point refPoint = ((LabelEditPart) getHost()).getReferencePoint();

		// Set start and end pos
		getConnection().setStart(startPos);
		getConnection().setEnd(refPoint);
	}

	@Override
	protected void showChangeBoundsFeedback(ChangeBoundsRequest request) {

		updatePosition();
		super.showChangeBoundsFeedback(request);

		tether.setVisible(false);
	}
	
	@SuppressWarnings("rawtypes")
	protected List createSelectionHandles() {
		MoveHandle mh = new MoveHandle(
				(GraphicalEditPart) getHost());
		mh.setBorder(null);
		return Collections.singletonList(mh);
	}
}