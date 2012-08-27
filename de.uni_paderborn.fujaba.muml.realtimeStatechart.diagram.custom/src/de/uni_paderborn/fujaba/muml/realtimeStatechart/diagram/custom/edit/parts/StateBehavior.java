package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;

import de.uni_paderborn.fujaba.muml.common.figures.PolyarcFigure;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;

public class StateBehavior extends BorderItemContainerBehavior {

	public static final Dimension DEFAULT_BORDER_ITEM_OFFSET = new Dimension(
			12, 12);

	public static final int INITIAL_STATE_MARGIN_TOP = 13;

	private PolyarcFigure initialStateArc;
	private PolylineShape initialStateArrow;
	private RectangleFigure stateContainer;
	private Ellipse initialStateEllipse;
	private RectangleFigure innerContainer;

	private boolean initialState;

	
	
	@Override
	public void setEditPart(AbstractBorderedShapeEditPart editPart) {
		super.setEditPart(editPart);
		
		// Super implementation of setEditPart already updates the border items,
		// so no update is required
		updateInitialState(false);
	}

	public void handleNotificationEvent(Notification notification) {

		Object feature = notification.getFeature();
		if (feature instanceof EStructuralFeature) {
			EStructuralFeature structuralFeature = (EStructuralFeature) feature;
			if (structuralFeature.getContainerClass() == State.class) {
				int featureID = notification.getFeatureID(State.class);
				switch (featureID) {
				case RealtimestatechartPackage.STATE__INITIAL:
					setInitialState(notification.getNewBooleanValue());
					break;
				case RealtimestatechartPackage.STATE__FINAL:
					setFinalState(notification.getNewBooleanValue());
					break;
				}
			}
		}
	}

	public void setInitialState(boolean initialState) {
		if (this.initialState != initialState) {
			this.initialState = initialState;
			updateInitialState(true);
		}
	}

	public void setFinalState(boolean finalState) {
		MarginBorder marginBorder;
		if (finalState) {
			marginBorder = new MarginBorder(4, 4, 4, 4);
		} else {
			marginBorder = new MarginBorder(0, 0, 0, 0);
		}
		innerContainer.setBorder(marginBorder);
	}

	public void setStateInnerFigures(IMapMode mapMode,
			PolyarcFigure initialStateArc, PolylineShape initialStateArrow,
			RectangleFigure stateContainer, Ellipse initialStateEllipse,
			RectangleFigure innerContainer) {
		this.initialStateArc = initialStateArc;
		this.initialStateArrow = initialStateArrow;
		this.stateContainer = stateContainer;
		this.initialStateEllipse = initialStateEllipse;
		this.innerContainer = innerContainer;

		PolylineShape fFigureInitialStateArc = initialStateArc;
		fFigureInitialStateArc.addPoint(new Point(mapMode.DPtoLP(13), mapMode
				.DPtoLP(9)));
		fFigureInitialStateArc.addPoint(new Point(mapMode.DPtoLP(30), mapMode
				.DPtoLP(16)));
	}

	private void updateInitialState(boolean update) {
		initialStateArrow.setVisible(initialState);
		initialStateArc.setVisible(initialState);

		MarginBorder marginBorder;
		if (initialState) {
			marginBorder = new MarginBorder(INITIAL_STATE_MARGIN_TOP, 0, 0, 0);
		} else {
			marginBorder = new MarginBorder(0, 0, 0, 0);
		}

		stateContainer.setBorder(marginBorder);
		initialStateEllipse.setVisible(initialState);

		if (update) {
			updateBorderItems();
		}
	}

	public NodeFigure createNodePlate() {
		DefaultSizeNodeFigure plate = new DefaultSizeNodeFigure(40, 40) {

			public PointList getPolygonPoints() {
				int verticalOffset = 0;
				if (initialState) {
					verticalOffset = INITIAL_STATE_MARGIN_TOP;
				}

				// Copied from default implementation in DefaultSizeNodeFigure
				// and modified to keep track of the vertical offset.
				PointList points = new PointList(5);
				Rectangle anchorableRectangle = getHandleBounds();
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
		};
		plate.setMinimumSize(new Dimension(0, 0));
		return plate;
	}

	@Override
	protected Dimension getTopLeftOffset() {
		int verticalOffset = 0;
		if (initialState) {
			verticalOffset = INITIAL_STATE_MARGIN_TOP;
		}
		// This magical -1 fixes a bug that the border item cannot reside at
		// the top border...
		int magicalVerticalOffset = verticalOffset - 1;
		return DEFAULT_BORDER_ITEM_OFFSET.getExpanded(0, magicalVerticalOffset);
	}

	@Override
	protected Dimension getBottomRightOffset() {
		return DEFAULT_BORDER_ITEM_OFFSET;
	}

}
