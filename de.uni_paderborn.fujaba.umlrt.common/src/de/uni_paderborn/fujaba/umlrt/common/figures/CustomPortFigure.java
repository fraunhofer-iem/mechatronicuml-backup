package de.uni_paderborn.fujaba.umlrt.common.figures;

import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;

/**
 * Copied code from generated class
 * structuredcomponenteditor.diagram.edit.parts.PortEditPart
 * 
 * @author bingo
 * 
 */
public class CustomPortFigure extends RectangleFigure {

	/**
	 * The visualization of this PortFigure.
	 * 
	 * @author bingo
	 * 
	 */
	public enum PortType {
		NONE, IN_PORT, OUT_PORT, INOUT_PORT
	};

	/**
	 * @generated
	 */
	private ScalableRotableTriangleShape fFigureInPolygon;
	/**
	 * @generated
	 */
	private ScalableRotableTriangleShape fFigureOutPolygon;

	/**
	 * @generated
	 */
	private ScalableRotableTriangleShape fFigureInOutPolygon;

	/**
	 * @generated
	 */
	private RectangleFigure fFigureInnerRectContainer;

	/**
	 * The EditPart's MapMode.
	 */
	private IMapMode mapMode;

	/**
	 * Constructs this CustomPortFigure.
	 * 
	 * @param mapMode
	 *            The EditPart's MapMode.
	 * 
	 * @generated NOT
	 */
	public CustomPortFigure(IMapMode mapMode) {
		this.setLayoutManager(new StackLayout());
		this.setFill(false);
		this.setOutline(false);
		this.mapMode = mapMode;
		createContents();
		setPortType(PortType.INOUT_PORT);
		setPortSide(PositionConstants.NORTH);
		getFigureInPolygon().setOutline(true);
		getFigureOutPolygon().setOutline(true);
		getFigureInOutPolygon().setOutline(true);
	}

	/**
	 * Sets the Port Type.
	 * 
	 * @param portType
	 *            The new PortType to set.
	 */
	public void setPortType(PortType portType) {
		// Chooses the right polygon to display.
		getFigureInPolygon().setVisible(portType == PortType.IN_PORT);
		getFigureOutPolygon().setVisible(portType == PortType.OUT_PORT);
		getFigureInOutPolygon().setVisible(portType == PortType.INOUT_PORT);
	}

	/**
	 * Sets the side that this Port lies at.
	 * 
	 * @param side
	 *            Can be a value of PositionConstants (WEST, NORTH, EAST,
	 *            SOUTH).
	 */
	public void setPortSide(int side) {
		switch (side) {
		case PositionConstants.WEST:
			setRotationInDegrees(0.0);
			break;

		default:
		case PositionConstants.NORTH:
			setRotationInDegrees(90.0);
			break;

		case PositionConstants.EAST:
			setRotationInDegrees(180.0);
			break;

		case PositionConstants.SOUTH:
			setRotationInDegrees(270.0);
			break;

		}
	}

	/**
	 * Sets, if this Port should be visualized as a multi port.
	 * 
	 * @param isMulti
	 *            true, if this Port is a multi port.
	 */
	public void setPortMulti(boolean isMulti) {
		// Calculate new Margin for bottom, right.
		int marginBottomRight = 0;
		if (isMulti) {
			marginBottomRight = 3;
		}

		// Calculate new preferred size, which is the original size (24,24)
		// minus the margin.
		Dimension preferredSize = getParent().getPreferredSize().getCopy();
		preferredSize.expand(-marginBottomRight, -marginBottomRight);

		// Set the new margin and the new preferred size. 
		RectangleFigure innerRectContainer = getFigureInnerRectContainer();
		innerRectContainer.setBorder(new MarginBorder(0, 0, marginBottomRight,
				marginBottomRight));
		innerRectContainer.setPreferredSize(preferredSize);
	}

	/**
	 * Sets the Rotation in degrees.
	 * 
	 * @param degrees
	 *            The degrees to rotate the polygons.
	 */
	private void setRotationInDegrees(double degrees) {
		getFigureInPolygon().setRotationInDegrees(degrees);
		getFigureOutPolygon().setRotationInDegrees(degrees);
		getFigureInOutPolygon().setRotationInDegrees(degrees);
	}

	/**
	 * Returns the EditPart's MapMode.
	 * 
	 * @return the MapMode to use.
	 */
	private IMapMode getMapMode() {
		return mapMode;
	}

	/**
	 * @generated
	 */
	private void createContents() {

		RectangleFigure aux10 = new RectangleFigure();
		aux10.setFill(false);
		aux10.setOutline(false);
		aux10.setBorder(new MarginBorder(getMapMode().DPtoLP(3), getMapMode()
				.DPtoLP(3), getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));

		this.add(aux10);
		aux10.setLayoutManager(new StackLayout());

		RectangleFigure shadow1 = new RectangleFigure();

		aux10.add(shadow1);

		fFigureInnerRectContainer = new RectangleFigure();
		fFigureInnerRectContainer.setFill(false);
		fFigureInnerRectContainer.setOutline(false);
		fFigureInnerRectContainer.setBorder(new MarginBorder(getMapMode()
				.DPtoLP(0), getMapMode().DPtoLP(0), getMapMode().DPtoLP(3),
				getMapMode().DPtoLP(3)));

		this.add(fFigureInnerRectContainer);
		fFigureInnerRectContainer.setLayoutManager(new StackLayout());

		RectangleFigure innerRectangle1 = new RectangleFigure();

		fFigureInnerRectContainer.add(innerRectangle1);

		RectangleFigure inPolygonContainer1 = new RectangleFigure();
		inPolygonContainer1.setFill(false);
		inPolygonContainer1.setOutline(false);
		inPolygonContainer1.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
				getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode()
						.DPtoLP(5)));

		fFigureInnerRectContainer.add(inPolygonContainer1);
		inPolygonContainer1.setLayoutManager(new StackLayout());

		fFigureInPolygon = new ScalableRotableTriangleShape();
		fFigureInPolygon.addPoint(new Point(getMapMode().DPtoLP(0),
				getMapMode().DPtoLP(0)));
		fFigureInPolygon.addPoint(new Point(getMapMode().DPtoLP(1),
				getMapMode().DPtoLP(1)));
		fFigureInPolygon.addPoint(new Point(getMapMode().DPtoLP(0),
				getMapMode().DPtoLP(2)));
		fFigureInPolygon.setOutline(false);

		inPolygonContainer1.add(fFigureInPolygon);

		RectangleFigure outPolygonContainer1 = new RectangleFigure();
		outPolygonContainer1.setFill(false);
		outPolygonContainer1.setOutline(false);
		outPolygonContainer1.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
				getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode()
						.DPtoLP(5)));

		fFigureInnerRectContainer.add(outPolygonContainer1);
		outPolygonContainer1.setLayoutManager(new StackLayout());

		fFigureOutPolygon = new ScalableRotableTriangleShape();
		fFigureOutPolygon.addPoint(new Point(getMapMode().DPtoLP(1),
				getMapMode().DPtoLP(0)));
		fFigureOutPolygon.addPoint(new Point(getMapMode().DPtoLP(0),
				getMapMode().DPtoLP(1)));
		fFigureOutPolygon.addPoint(new Point(getMapMode().DPtoLP(1),
				getMapMode().DPtoLP(2)));
		fFigureOutPolygon.setOutline(false);

		outPolygonContainer1.add(fFigureOutPolygon);

		RectangleFigure inOutPolygonContainer1 = new RectangleFigure();
		inOutPolygonContainer1.setFill(false);
		inOutPolygonContainer1.setOutline(false);
		inOutPolygonContainer1.setBorder(new MarginBorder(getMapMode()
				.DPtoLP(3), getMapMode().DPtoLP(3), getMapMode().DPtoLP(3),
				getMapMode().DPtoLP(3)));

		fFigureInnerRectContainer.add(inOutPolygonContainer1);
		inOutPolygonContainer1.setLayoutManager(new StackLayout());

		fFigureInOutPolygon = new ScalableRotableTriangleShape();
		fFigureInOutPolygon.addPoint(new Point(getMapMode().DPtoLP(2),
				getMapMode().DPtoLP(2)));
		fFigureInOutPolygon.addPoint(new Point(getMapMode().DPtoLP(1),
				getMapMode().DPtoLP(3)));
		fFigureInOutPolygon.addPoint(new Point(getMapMode().DPtoLP(2),
				getMapMode().DPtoLP(4)));
		fFigureInOutPolygon.addPoint(new Point(getMapMode().DPtoLP(0),
				getMapMode().DPtoLP(0)));
		fFigureInOutPolygon.addPoint(new Point(getMapMode().DPtoLP(1),
				getMapMode().DPtoLP(1)));
		fFigureInOutPolygon.addPoint(new Point(getMapMode().DPtoLP(0),
				getMapMode().DPtoLP(2)));
		fFigureInOutPolygon.setOutline(false);

		inOutPolygonContainer1.add(fFigureInOutPolygon);

	}

	/**
	 * @generated
	 */
	public ScalableRotableTriangleShape getFigureInPolygon() {
		return fFigureInPolygon;
	}

	/**
	 * @generated
	 */
	public ScalableRotableTriangleShape getFigureOutPolygon() {
		return fFigureOutPolygon;
	}

	/**
	 * @generated
	 */
	public ScalableRotableTriangleShape getFigureInOutPolygon() {
		return fFigureInOutPolygon;
	}

	/**
	 * @generated
	 */
	public RectangleFigure getFigureInnerRectContainer() {
		return fFigureInnerRectContainer;
	}

}