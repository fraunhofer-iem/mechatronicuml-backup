package org.muml.pim.common.edit.policies.ports;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.swt.graphics.Color;
import org.muml.core.common.edit.policies.EditPolicyUtils;
import org.muml.pim.common.figures.CustomPortFigure;
import org.muml.pim.valuetype.Cardinality;
import org.muml.pim.valuetype.NaturalNumber;

/**
 * Base edit policy for all border items that use the CustomPortFigure. Provides
 * handling model notifications and updating the port figure accordingly. This
 * base implementation does not depend on any semantic classes, but subclasses
 * should override handleNotificationEvent() and call refreshXXX() methods.
 * 
 * @author bingo
 * 
 */
public class PortBaseEditPolicy extends AbstractRotatingBorderItemEditPolicy {
	// Can be overriden to provide proper logic
	protected boolean isMulti() {
		Cardinality cardinality = getCardinality();
		if (cardinality != null) {
			NaturalNumber upperBound = cardinality.getUpperBound();
			if (upperBound != null
					&& (upperBound.isInfinity() || upperBound.getValue() > 1)) {
				return true;
			}
		}
		return false;
	}

	// Can be overriden to provide proper logic
	protected int getArrowLineType() {
		return Graphics.LINE_SOLID;
	}

	// Can be overriden to provide proper logic
	protected boolean isOptional() {
		Cardinality cardinality = getCardinality();
		if (cardinality != null) {
			NaturalNumber lowerBound = cardinality.getLowerBound();
			if (lowerBound != null
					&& (lowerBound.isInfinity() || lowerBound.getValue() > 0)) {
				return false;
			}
			return true;
		}
		return false;
	}

	public void activate() {
		super.activate();
		IFigure contentPane = getContentPane();
		if (!(contentPane instanceof CustomPortFigure)) {
			CustomPortFigure customPortFigure = new CustomPortFigure();
			contentPane.add(customPortFigure);
			contentPane.setLayoutManager(new StackLayout());
		}
		if (deduceBorderItemEditPart() == null) {
			getPortFigure().setPortSide(PositionConstants.WEST);
		}
		refreshPortType();
		refreshArrow();
	}
	
	protected Cardinality getCardinality() {
		return null;
	}

	@Override
	protected void sideChanged(int side) {
		getPortFigure().setPortSide(side);
		super.sideChanged(side);
	}

	protected void refreshArrow() {
		getPortFigure().setMulti(false);
		Color arrowFg = getArrowForegroundColor();
		Color arrowBg = getArrowBackgroundColor();
		getPortFigure().configureArrows(arrowFg, arrowBg);

		getPortFigure().setMulti(isMulti());
		getPortFigure().setLineStyle(
				EditPolicyUtils.getLineType(getPrimaryView()));

		int arrowLineType = getArrowLineType();
		getPortFigure().getFigureInPolygon().setLineStyle(arrowLineType);
		getPortFigure().getFigureOutPolygon().setLineStyle(arrowLineType);
		getPortFigure().getFigureInOutPolygon().setLineStyle(arrowLineType);
	}

	protected void refreshPortType() {
		getPortFigure().setPortKindAndPortType(
				CustomPortFigure.PortKind.CONTINUOUS,
				CustomPortFigure.PortType.NONE);
	}

	public CustomPortFigure getPortFigure() {
		IFigure contentPane = getContentPane();
		if (contentPane instanceof CustomPortFigure) {
			return (CustomPortFigure) contentPane;
		}
		if (!contentPane.getChildren().isEmpty() && contentPane.getChildren().get(0) instanceof CustomPortFigure) {
			return (CustomPortFigure) contentPane.getChildren().get(0);
		}
		return null;
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		if (notification.getFeature() == NotationPackage.Literals.LINE_STYLE__LINE_COLOR) {
			// our getDefaultBackgroundColor() method depends on this value; so
			// we recalculate it.
			refreshArrow();
		} else if (notification.getFeature() == NotationPackage.Literals.LINE_TYPE_STYLE__LINE_TYPE) {
			refreshArrow();
		}
		super.handleNotificationEvent(notification);
	}

	// TODO: Not yet used:
	/**
	 * The Port's Node Plate to use. It defines the size to use and is
	 * responsible to return custom PolygonPoints, that help connecting
	 * Connections at the right Point.
	 * 
	 * @return The Port's Node Plate to use.
	 */
	private NodeFigure createNodePlate() {
		// Copied from generated PortEditPart.java.
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(24, 24) {
			public PointList getPolygonPoints() {
				PointList customPolygonPoints = getPortFigure()
						.getCustomPolygonPoints(getHandleBounds());
				if (customPolygonPoints != null) {
					return customPolygonPoints;
				}
				return super.getPolygonPoints();
			}
		};

		// workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());
		return result;
	}

	/**
	 * Gets the current foreground color of the primary view.
	 * 
	 * @return the foreground color
	 */
	protected Color getArrowForegroundColor() {
		Color backgroundColor = ColorConstants.black;
		LineStyle style = (LineStyle) getPrimaryView().getStyle(
				NotationPackage.Literals.LINE_STYLE);
		if (style != null) {
			backgroundColor = DiagramColorRegistry.getInstance().getColor(
					Integer.valueOf(style.getLineColor()));
		}

		return backgroundColor;
	}

	protected Color getArrowBackgroundColor() {
		if (isOptional()) {
			return ColorConstants.white;
		}
		return getArrowForegroundColor();
	}
}
