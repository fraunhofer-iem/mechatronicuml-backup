package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.parts;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.draw2d.AbstractPointListShape;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.geometry.Transform;

import de.uni_paderborn.fujaba.umlrt.model.component.Port;
import de.uni_paderborn.fujaba.umlrt.model.core.Cardinality;

public class PortDecoration {

	private boolean isMultiPort;
	private IPortFigure portFigure;
	private PortType portType;
	private Port port;
	private int side;

	private Transform transform = new Transform();

	private Map<AbstractPointListShape, PointList> originalVertices = new HashMap<AbstractPointListShape, PointList>();
	private Map<IFigure, Rectangle> originalMargins= new HashMap<IFigure, Rectangle>();

	public enum PortType {
		NONE, IN_PORT, OUT_PORT, INOUT_PORT
	};

	public PortDecoration(IPortFigure portFigure, Port port) {
		this.portFigure = portFigure;
		this.port = port;

		// Save original Points.
		originalVertices.put(portFigure.getFigureInPolygon(), portFigure
				.getFigureInPolygon().getPoints().getCopy());
		originalVertices.put(portFigure.getFigureOutPolygon(), portFigure
				.getFigureOutPolygon().getPoints().getCopy());
		originalVertices.put(portFigure.getFigureInOutPolygon1(), portFigure
				.getFigureInOutPolygon1().getPoints().getCopy());
		originalVertices.put(portFigure.getFigureInOutPolygon2(), portFigure
				.getFigureInOutPolygon2().getPoints().getCopy());

		// Save original Insets
		originalMargins.put(portFigure.getFigureInOutPolygonContainer1(),
				getRectFromInset(portFigure.getFigureInOutPolygonContainer1()
						.getBorder().getInsets(null)));
		originalMargins.put(portFigure.getFigureInOutPolygonContainer2(),
				getRectFromInset(portFigure.getFigureInOutPolygonContainer2()
						.getBorder().getInsets(null)));

		// Set Side to NORTH (default) and update.
		setPortSide(PositionConstants.NORTH);
		update();

		// Turn on the outline for all Polygons, as we will only set one
		// Polygon visible.
		portFigure.getFigureInPolygon().setOutline(true);
		portFigure.getFigureOutPolygon().setOutline(true);
		portFigure.getFigureInOutPolygon1().setOutline(true);
		portFigure.getFigureInOutPolygon2().setOutline(true);
	}

	private static Rectangle getRectFromInset(Insets insets) {
		return new Rectangle();
	}

	public void setPortSide(int side) {
		if (side != this.side) {
			this.side = side;
			switch (side) {
			case PositionConstants.WEST:
				transform.setRotation(0.0);
				break;
	
			default:
			case PositionConstants.NORTH:
				transform.setRotation(90.0 / 360.0 * Math.PI * 2.0);
				break;
	
			case PositionConstants.EAST:
				transform.setRotation(180.0 / 360.0 * Math.PI * 2.0);
				break;
	
			case PositionConstants.SOUTH:
				transform.setRotation(270.0 / 360.0 * Math.PI * 2.0);
				break;
	
			}
	
			updateDecoration();
		}
	}
	

	public void update() {
		boolean changed = false;
		PortType newPortType;

		// Get current value for portType
		if (port.getRequired() != null && port.getProvided() != null) {
			newPortType = PortType.INOUT_PORT;
		} else if (port.getRequired() != null) {
			newPortType = PortType.IN_PORT;
		} else if (port.getProvided() != null) {
			newPortType = PortType.OUT_PORT;
		} else {
			newPortType = PortType.NONE;
		}
		
		if (newPortType != portType) {
			changed = true;
		}
		portType = newPortType;

		// Get current value for isMultiPort
		boolean newIsMultiPort = false; 
		Cardinality cardinality = port.getCardinality();
		if (cardinality != null) {
			if (cardinality.getUpperBound().getValue() > 1) {
				newIsMultiPort = true;
			}
		}
		if (newIsMultiPort != isMultiPort) {
			changed = true;
		}
		isMultiPort = newIsMultiPort;

		// update the decoration
		if (changed) {
			updateDecoration();
		}
	}

	private void updateDecoration() {
		// Set the correct insets for the inner rectangle.
		IFigure innerRectangle = portFigure.getFigureInnerRectContainer();
		if (isMultiPort) {
			innerRectangle.setBorder(new MarginBorder(new Insets(0, 0, 3, 3)));
		} else {
			innerRectangle.setBorder(new MarginBorder(new Insets(0, 0, 0, 0)));
		}

		// Set transformed PointLists
		portFigure.getFigureInPolygon().setPoints(
				getTransformedPointList(portFigure.getFigureInPolygon(), true));
		portFigure.getFigureOutPolygon()
				.setPoints(
						getTransformedPointList(
								portFigure.getFigureOutPolygon(), true));
		portFigure.getFigureInOutPolygon1().setPoints(
				getTransformedPointList(portFigure.getFigureInOutPolygon1(),
						true));
		portFigure.getFigureInOutPolygon2().setPoints(
				getTransformedPointList(portFigure.getFigureInOutPolygon2(),
						true));

		// Set transformed Insets
//		transformBorder(portFigure.getFigureInOutPolygonContainer1());
//		transformBorder(portFigure.getFigureInOutPolygonContainer2());

		// Choose the right polygon to display
		portFigure.getFigureInPolygon()
				.setVisible(portType == PortType.IN_PORT);
		portFigure.getFigureOutPolygon().setVisible(
				portType == PortType.OUT_PORT);
		portFigure.getFigureInOutPolygon1().setVisible(
				portType == PortType.INOUT_PORT);
		portFigure.getFigureInOutPolygon2().setVisible(
				portType == PortType.INOUT_PORT);

	}

	private PointList getTransformedPointList(
			AbstractPointListShape pointListShape, boolean scalablePointList) {
		PointList points = originalVertices.get(pointListShape);
		PointList transformed = new PointList();

		// Get a copy of the original points and transform each point.
		
		if (points != null) {
			transformed = points.getCopy();

			Rectangle bounds;

			if (scalablePointList) {
				bounds = transformed.getBounds();
			} else {
				bounds = pointListShape.getBounds();
			}

			for (int i = 0; i < transformed.size(); i++) {
				Point point = transformed.getPoint(i);

				// We rotate around the origin, so we must translate the center
				// into the origin.
				point.translate(-bounds.width / 2, -bounds.height / 2);

				// Rotate the point.
				point = transform.getTransformed(point);

				// Translate back into the middle.
				point.translate(bounds.width / 2, bounds.height / 2);

				// Store the transformed point.
				transformed.setPoint(point, i);
			}

			// Translate into origin.
			if (scalablePointList) {
				bounds = transformed.getBounds();
				transformed.translate(-bounds.x, -bounds.y);
			}
		}
		return transformed;
	}

}
