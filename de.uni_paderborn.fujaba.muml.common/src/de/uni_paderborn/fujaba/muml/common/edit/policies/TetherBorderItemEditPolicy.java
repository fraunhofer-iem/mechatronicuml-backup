package de.uni_paderborn.fujaba.muml.common.edit.policies;

import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.BorderedBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;

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
			// tether.setLineDashOffset(1);
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
			tether = null;
		}
		getHostFigure().removeFigureListener(
				ownerMovedListener);
		super.deactivate();
	}

	@Override
	public void activate() {
		super.activate();
		getHostFigure().getParent().add(getConnection());
		getHostFigure().addFigureListener(
				ownerMovedListener);
		getConnection().setVisible(tetherShown);
		updatePosition();
	}

	private void updatePosition() {
		// Get startPos (no need to translate)
		Point startPos = getHostFigure().getBounds().getLocation();

		// Get endPos from anchor
		BorderedBorderItemEditPart parentEditPart = (BorderedBorderItemEditPart) getHost()
				.getParent();
		BorderedNodeFigure fig = (BorderedNodeFigure) parentEditPart
				.getFigure();
		ConnectionAnchor anchor = fig.getConnectionAnchor("");
		
		// Get absolute coordinates of startPos to ask anchor
		Point startPosAbsolute = startPos.getCopy();
		getHostFigure().translateToAbsolute(startPosAbsolute);
		
		// Ask anchor, the anchor works with absolute coordinates, so translate accordingly
		Point endPos = anchor.getLocation(startPosAbsolute);
		getHostFigure().translateToRelative(endPos);
		
		// Set start and end pos
		getConnection().setStart(startPos);		// start from label
		getConnection().setEnd(endPos);			// end at port 
	}

	@Override
	protected void showChangeBoundsFeedback(ChangeBoundsRequest request) {

		updatePosition();
		super.showChangeBoundsFeedback(request);

		tether.setVisible(false);
	}

	@SuppressWarnings("rawtypes")
	protected List createSelectionHandles() {
		MoveHandle mh = new MoveHandle((GraphicalEditPart) getHost());
		mh.setBorder(null);
		return Collections.singletonList(mh);
	}
}