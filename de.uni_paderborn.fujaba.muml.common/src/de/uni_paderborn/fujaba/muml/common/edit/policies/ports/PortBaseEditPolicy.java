package de.uni_paderborn.fujaba.muml.common.edit.policies.ports;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.LineType;
import org.eclipse.gmf.runtime.notation.LineTypeStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

import de.uni_paderborn.fujaba.muml.common.edit.policies.EditPolicyUtils;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber;
import de.uni_paderborn.fujaba.muml.valuetype.Range;

/**
 * Base edit policy for all border items that use the CustomPortFigure. Provides
 * handling model notifications and updating the port figure accordingly. This
 * base implementation does not depend on any semantic classes, but subclasses
 * should override handleNotificationEvent() and call update*() methods.
 * 
 * @author bingo
 * 
 */
public class PortBaseEditPolicy extends AbstractRotatingBorderItemEditPolicy {

	public void activate() {
		super.activate();
		if (deduceBorderItemEditPart() == null) {
			getPortFigure().setPortSide(PositionConstants.WEST);
		}
		refreshPortType();
		refreshCardinality();
	}


	@Override
	protected void sideChanged(int side) {
		getPortFigure().setPortSide(side);
		super.sideChanged(side);
	}

	protected void refreshCardinality() {
		getPortFigure().setMulti(false);
		Color color = getForegroundColor();
		getPortFigure().setLineStyle(EditPolicyUtils.getLineType(getPrimaryView()));
		getPortFigure().configureArrows(color, color);
	}

	protected void refreshPortType() {
		getPortFigure().setPortKindAndPortType(
				CustomPortFigure.PortKind.CONTINUOUS,
				CustomPortFigure.PortType.NONE);
	}

	public CustomPortFigure getPortFigure() {
		return (CustomPortFigure) getContentPane();
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		if (notification.getFeature() == NotationPackage.Literals.LINE_STYLE__LINE_COLOR) {
			// our getDefaultBackgroundColor() method depends on this value; so
			// we recalculate it.
			refreshCardinality();
		} else if (notification.getFeature() == NotationPackage.Literals.LINE_TYPE_STYLE__LINE_TYPE) {
			refreshCardinality();
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
	protected Color getForegroundColor() {
		Color backgroundColor = ColorConstants.black;
		LineStyle style = (LineStyle) getPrimaryView().getStyle(
				NotationPackage.Literals.LINE_STYLE);
		if (style != null) {
			backgroundColor = DiagramColorRegistry.getInstance().getColor(
					Integer.valueOf(style.getLineColor()));
		}

		return backgroundColor;
	}

	/**
	 * Convenience method to use a range as cardinality; can be used by
	 * subclasses
	 */
	protected void setCardinality(Range cardinality) {
		if (cardinality == null) {
			return;
		}

		boolean isMulti = false, mandatory = false;
		NaturalNumber upperBound = cardinality.getUpperBound();
		if (upperBound != null
				&& (upperBound.isInfinity() || upperBound.getValue() > 1)) {
			isMulti = true;
		}
		NaturalNumber lowerBound = cardinality.getLowerBound();

		if (lowerBound != null
				&& (lowerBound.isInfinity() || lowerBound.getValue() > 0)) {
			mandatory = true;
		}
		getPortFigure().setMulti(isMulti);

		// Update background color
		int lineType = EditPolicyUtils.getLineType(getPrimaryView());
		int innerLineType = Graphics.LINE_SOLID;
		Color foregroundColor = getForegroundColor();
		Color backgroundColor = foregroundColor;
		if (!mandatory) {
			backgroundColor = ColorConstants.white;
			innerLineType = lineType;
		}
		
		getPortFigure().configureArrows(foregroundColor, backgroundColor);
		getPortFigure().setLineStyle(lineType);
		getPortFigure().getFigureInPolygon().setLineStyle(innerLineType);
		getPortFigure().getFigureOutPolygon().setLineStyle(innerLineType);
		getPortFigure().getFigureInOutPolygon().setLineStyle(innerLineType);
	}



}
