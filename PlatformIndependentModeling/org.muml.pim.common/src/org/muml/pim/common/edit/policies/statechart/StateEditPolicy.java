package org.muml.pim.common.edit.policies.statechart;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.core.common.edit.policies.NotifyingGraphicalEditPolicy;
import org.muml.pim.common.edit.policies.ports.ConnectionPointEditPolicy;
import org.muml.pim.common.figures.PolyarcFigure;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.State;

public class StateEditPolicy extends NotifyingGraphicalEditPolicy {

	public static final int INITIAL_STATE_MARGIN_TOP = 13;

	private StateDecorationFigure decorationFigure;

	private IFigure undecoratedFigure;

	protected StateDecorationFigure createDecorationFigure() {
		return new StateDecorationFigure();
	}

	@Override
	public void activate() {
		super.activate();

		// create decoration figure
		decorationFigure = createDecorationFigure();
		State state = getState();
		if (state != null) {
			decorationFigure.setInitial(state.isInitial());
			decorationFigure.setFinal(state.isFinal());
		}

		// add decoration
		addDecoration();
	}

	@Override
	public void deactivate() {
		// remove decoration
		removeDecoration();
		decorationFigure = null;

		super.deactivate();
	}

	private void addDecoration() {
		// Remove undecorated figure from the container.
		undecoratedFigure = (IFigure) getContentPane().getChildren().get(0);
		getContentPane().remove(undecoratedFigure);
		getContentPane().getLayoutManager().remove(undecoratedFigure);

		// Add decoration to the container
		getContentPane().add(decorationFigure);
		decorationFigure.getFigureInnerContainer().add(undecoratedFigure);
	}

	private void removeDecoration() {
		// Remove decoration figure from the container
		getContentPane().remove(decorationFigure);
		getContentPane().getLayoutManager().remove(decorationFigure);
		decorationFigure.getFigureInnerContainer().remove(undecoratedFigure);
		decorationFigure.getFigureInnerContainer().getLayoutManager()
				.remove(undecoratedFigure);

		// Add undecorated figure to the container
		getContentPane().add(undecoratedFigure);
		undecoratedFigure = null;
	}

	/**
	 * Convenience method that returns the hosts content pane.
	 * 
	 * @return the hosts content pane
	 */
	protected IFigure getContentPane() {
		return ((GraphicalEditPart) getHost()).getContentPane();
	}

	/**
	 * Convenience method that casts the hosts semantic element to a State.
	 * 
	 * @return the state object.
	 */
	protected State getState() {
		return (State) ((View) getHost().getModel()).getElement();
	}


	/**
	 * Handle model-change event.
	 * 
	 * @param notification
	 *            The notification sent by the model.
	 */
	@Override
	public void handleNotificationEvent(Notification notification) {

		Object feature = notification.getFeature();
		if (RealtimestatechartPackage.Literals.STATE__INITIAL.equals(feature)) {
			setInitial(notification.getNewBooleanValue());
			return;
		}
		if (RealtimestatechartPackage.Literals.STATE__FINAL.equals(feature)) {
			setFinal(notification.getNewBooleanValue());
			return;
		}
	}
	
	public int getBorderItemUpperOffset() {
		if (getState() != null && getState().isInitial()) {
			return INITIAL_STATE_MARGIN_TOP;
		}
		return 0;
	}

	protected void setInitial(boolean initial) {
		decorationFigure.setInitial(initial);
		
		// let connection point border items update their locators
		for (Object child : getHost().getChildren()) {
			EditPart childEp = (EditPart) child;
			ConnectionPointEditPolicy connectionPointEditPolicy = (ConnectionPointEditPolicy) childEp
					.getEditPolicy(org.muml.pim.common.edit.policies.EditPolicyRoles.CONNECTION_POINT_VISUALIZATION_ROLE);
			if (connectionPointEditPolicy != null) {
				connectionPointEditPolicy.updateBorderItemLocator();
			}
		}

	}

	protected void setFinal(boolean finalState) {
		decorationFigure.setFinal(finalState);
	}

	/**
	 * List of polygon points to use as boundaries for a node figure (this makes the connections go at the right position for initial states).
	 */
	public PointList getPolygonPoints(NodeFigure nodeFigure) {
		int verticalOffset = 0;
		if (getState() != null && getState().isInitial()) {
			verticalOffset = INITIAL_STATE_MARGIN_TOP;
		}

		// Copied from default implementation in DefaultSizeNodeFigure
		// and modified to keep track of the vertical offset.
		PointList points = new PointList(5);
		Rectangle anchorableRectangle = nodeFigure.getHandleBounds();
		points.addPoint(anchorableRectangle.x, anchorableRectangle.y
				+ verticalOffset);
		points.addPoint(anchorableRectangle.x
				+ anchorableRectangle.width, anchorableRectangle.y
				+ verticalOffset);
		points.addPoint(anchorableRectangle.x
				+ anchorableRectangle.width, anchorableRectangle.y
				+ anchorableRectangle.height);
		points.addPoint(anchorableRectangle.x, anchorableRectangle.y
				+ anchorableRectangle.height);
		points.addPoint(anchorableRectangle.x, anchorableRectangle.y
				+ verticalOffset);
		return points;
	}
	
	private class StateDecorationFigure extends RectangleFigure {

		private RectangleFigure fFigureInnerContainer;

		private RoundedRectangle fFigureFinalStateOutline;

		private RectangleFigure fFigureStateContainer;

		private PolylineShape fFigureInitialStateArrow;

		private Ellipse fFigureInitialStateEllipse;

		private PolyarcFigure fFigureInitialStateArc;

		public StateDecorationFigure() {
			this.setLayoutManager(new StackLayout());
			this.setFill(false);
			this.setOutline(false);
			createContents();
		}

		private void createContents() {

			fFigureInitialStateArc = new PolyarcFigure();

			this.add(fFigureInitialStateArc);

			fFigureInitialStateArrow = new PolylineShape();
			fFigureInitialStateArrow.addPoint(new Point(26, 8));
			fFigureInitialStateArrow.addPoint(new Point(31, 13));
			fFigureInitialStateArrow.addPoint(new Point(33, 6));

			fFigureInitialStateArc.addPoint(new Point(13, 9));
			fFigureInitialStateArc.addPoint(new Point(30, 16));

			this.add(fFigureInitialStateArrow);

			RectangleFigure initialStateContainer = new RectangleFigure();
			initialStateContainer.setFill(false);
			initialStateContainer.setOutline(false);

			this.add(initialStateContainer);
			initialStateContainer.setLayoutManager(new XYLayout());

			fFigureInitialStateEllipse = new Ellipse();
			fFigureInitialStateEllipse.setBackgroundColor(ColorConstants.black);

			initialStateContainer.add(fFigureInitialStateEllipse,
					new Rectangle(10, 0, 10, 10));

			fFigureStateContainer = new RectangleFigure();
			fFigureStateContainer.setFill(false);
			fFigureStateContainer.setOutline(false);
			fFigureStateContainer.setBorder(new MarginBorder(0, 30, 0, 0));

			this.add(fFigureStateContainer);
			fFigureStateContainer.setLayoutManager(new StackLayout());

			fFigureFinalStateOutline = new RoundedRectangle();
			fFigureFinalStateOutline.setCornerDimensions(new Dimension(12, 12));

			fFigureStateContainer.add(fFigureFinalStateOutline);

			fFigureInnerContainer = new RectangleFigure();
			fFigureInnerContainer.setFill(false);
			fFigureInnerContainer.setOutline(false);
			fFigureInnerContainer.setBorder(new MarginBorder(4));

			fFigureStateContainer.add(fFigureInnerContainer);
			fFigureInnerContainer.setLayoutManager(new StackLayout());
		}

		public RectangleFigure getFigureInnerContainer() {
			return fFigureInnerContainer;
		}

		public void setInitial(boolean initial) {
			fFigureInitialStateArrow.setVisible(initial);
			fFigureInitialStateArc.setVisible(initial);

			MarginBorder marginBorder;
			if (initial) {
				marginBorder = new MarginBorder(INITIAL_STATE_MARGIN_TOP, 0, 0,
						0);
			} else {
				marginBorder = new MarginBorder(0);
			}

			fFigureStateContainer.setBorder(marginBorder);
			fFigureInitialStateEllipse.setVisible(initial);
		}

		public void setFinal(boolean finalState) {
			fFigureFinalStateOutline.setOutline(finalState);

			MarginBorder marginBorder;
			if (finalState) {
				marginBorder = new MarginBorder(4);
			} else {
				marginBorder = new MarginBorder(0);
			}
			decorationFigure.getFigureInnerContainer().setBorder(marginBorder);
		}
	}

}
