package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;

import de.uni_paderborn.fujaba.muml.common.figures.CustomBorderItemLocator;
import de.uni_paderborn.fujaba.muml.common.figures.PolyarcFigure;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;

public class StateBehavior {

	public static final Dimension DEFAULT_BORDER_ITEM_OFFSET = new Dimension(
			12, 12);

	public static final int INITIAL_STATE_MARGIN_TOP = 13;

	private PolyarcFigure initialStateArc;
	private PolylineShape initialStateArrow;
	private RectangleFigure stateContainer;
	private Ellipse initialStateEllipse;
	private RectangleFigure innerContainer;
	private AbstractBorderedShapeEditPart editPart;
	private boolean initialState;

	public void setEditPart(AbstractBorderedShapeEditPart editPart) {
		this.editPart = editPart;
		updateInitialState();
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
		this.initialState = initialState;
		updateInitialState();
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

	private void updateInitialState() {
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

		if (editPart != null) {
			Figure borderItemContainer = (Figure) editPart.getBorderedFigure()
					.getBorderItemContainer();

			for (Object borderItem : borderItemContainer.getChildren()) {
				updateBorderItem(borderItemContainer, (IFigure) borderItem);
			}
		}
	}

	public void afterAddFixedChild(EditPart childEditPart) {
		if (editPart != null) {
			Figure borderItemContainer = (Figure) editPart.getBorderedFigure()
					.getBorderItemContainer();
			updateBorderItem(borderItemContainer,
					((AbstractGraphicalEditPart) childEditPart).getFigure());
		}
	}

	private void updateBorderItem(Figure borderItemContainer, IFigure borderItem) {
		int verticalOffset = 0;
		if (initialState) {
			verticalOffset = INITIAL_STATE_MARGIN_TOP;
		}

		Object constraint = borderItemContainer.getLayoutManager()
				.getConstraint(borderItem);
		if (constraint instanceof BorderItemLocator) {
			BorderItemLocator locator = (BorderItemLocator) constraint;
			CustomBorderItemLocator customLocator;
			if (locator instanceof CustomBorderItemLocator) {
				customLocator = (CustomBorderItemLocator) locator;
			} else {
				customLocator = new CustomBorderItemLocator(
						editPart.getMainFigure(),
						locator.getPreferredSideOfParent());
			}
			// This magical -1 fixes a bug that the border item cannot reside at
			// the top border...
			int magicalVerticalOffset = verticalOffset - 1;
			customLocator.setBorderItemOffset(DEFAULT_BORDER_ITEM_OFFSET
					.getExpanded(0, magicalVerticalOffset),
					DEFAULT_BORDER_ITEM_OFFSET);

			// Always call setConstraint(), to update visuals (even if
			// locator==customLocator).
			borderItemContainer.setConstraint((IFigure) borderItem,
					customLocator);
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
		return plate;
	}

}
