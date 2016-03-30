package org.muml.pim.common.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * Copied code from generated class
 * structuredcomponent.diagram.edit.parts.PortEditPart
 * 
 * @author bingo
 * 
 */
public class CustomPortFigure extends RectangleFigure {

	/**
	 * The visualization of this PortFigure.
	 */
	public enum PortType {
		NONE, IN_PORT, OUT_PORT, INOUT_PORT
	};

	/**
	 * The kind of the Port visualization.
	 */
	public enum PortKind {
		DISCRETE, CONTINUOUS, HYBRID, HARDWARE
	}

	private boolean multiPort;

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
	 * @generated
	 */
	private RectangleFigure fFigureOutlineRectangle;

	/**
	 * @generated
	 */
	private RectangleFigure fFigureShadowRectangle;

	/**
	 * @generated
	 */
	private WrappingLabel fFigureHardwareTypeLabel;

	/**
	 * @generated
	 */
	private RectangleFigure fFigureInPolygonContainer;
	/**
	 * @generated
	 */
	private RectangleFigure fFigureOutPolygonContainer;

	/**
	 * @generated
	 */
	private RectangleFigure fFigureInOutPolygonContainer;

	/**
	 * Constructs this CustomPortFigure.
	 */
	public CustomPortFigure() {
		this.setLayoutManager(new StackLayout());
		this.setFill(false);
		this.setOutline(false);
		createContents();
		fFigureHardwareTypeLabel.setAlignment(PositionConstants.CENTER);
		setMulti(false);
		setPortKindAndPortType(null, PortType.INOUT_PORT);
		setPortSide(PositionConstants.NORTH);
	}

	public void setPortKindAndPortType(PortKind portKind, PortType portType) {
		// Chooses the right polygon to display.
		getFigureInPolygon().setVisible(portType == PortType.IN_PORT);
		getFigureOutPolygon().setVisible(portType == PortType.OUT_PORT);
		getFigureInOutPolygon().setVisible(portType == PortType.INOUT_PORT);
		
		

		// Show Rectangle for Port only if it is no continuous port.
		getFigureShadowRectangle().setVisible(portKind != PortKind.CONTINUOUS);
		getFigureOutlineRectangle().setOutline(portKind != PortKind.CONTINUOUS);
		getFigureOutlineRectangle().setFill(portKind != PortKind.CONTINUOUS);

		// Update Margin
		boolean fullsize = portKind != PortKind.DISCRETE;
		if (fullsize) {
			getFigureInPolygonContainer().setBorder(new MarginBorder(0));
			getFigureOutPolygonContainer().setBorder(new MarginBorder(0));
			getFigureInOutPolygonContainer().setBorder(new MarginBorder(0));
		} else {
			getFigureInPolygonContainer().setBorder(new MarginBorder(5));
			getFigureOutPolygonContainer().setBorder(new MarginBorder(5));
			getFigureInOutPolygonContainer().setBorder(new MarginBorder(4));
		}

		// Set the Text for Hareware Ports
		String hardwareTypeText = "";
		if (portKind == PortKind.HARDWARE) {
			if (portType == PortType.IN_PORT) {
				hardwareTypeText = "i";
			} else if (portType == PortType.OUT_PORT) {
				hardwareTypeText = "o";
			} else if (portType == PortType.INOUT_PORT) {
				hardwareTypeText = "i/o";
			}
		}
		getFigureHardwareTypeLabel().setText(hardwareTypeText);
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
	 * @param multi
	 *            true, if this Port is a multi port.
	 */
	public void setMulti(boolean multi) {
		this.multiPort = multi;

		// Calculate new Margin for top and right.
		int marginTopRight = 0;
		if (multi) {
			marginTopRight = 3;
		}

		// Calculate new preferred size, which is the original size (24,24)
		// minus the margin.
		if (getParent() != null) {
			Dimension preferredSize = getParent().getPreferredSize().getCopy();
			preferredSize.expand(-marginTopRight, -marginTopRight);

			// Set the new margin and the new preferred size.
			RectangleFigure innerRectContainer = getFigureInnerRectContainer();
			innerRectContainer.setBorder(new MarginBorder(marginTopRight, 0, 0,
					marginTopRight));
			innerRectContainer.setPreferredSize(preferredSize);
		}
	}

	public void configureArrows(Color foregroundColor, Color backgroundColor) {
		getFigureInPolygon().setOutline(true);
		getFigureInPolygon().setForegroundColor(foregroundColor);
		getFigureInPolygon().setBackgroundColor(backgroundColor);
		getFigureOutPolygon().setOutline(true);
		getFigureOutPolygon().setForegroundColor(foregroundColor);
		getFigureOutPolygon().setBackgroundColor(backgroundColor);
		getFigureInOutPolygon().setOutline(true);
		getFigureInOutPolygon().setForegroundColor(foregroundColor);
		getFigureInOutPolygon().setBackgroundColor(backgroundColor);
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

	private void createContents() {
		RectangleFigure aux10 = new RectangleFigure();
		aux10.setFill(false);
		aux10.setOutline(false);
		aux10.setBorder(new MarginBorder(0, 3, 3, 0));

		this.add(aux10);
		aux10.setLayoutManager(new StackLayout());

		fFigureShadowRectangle = new RectangleFigure();

		aux10.add(fFigureShadowRectangle);

		fFigureInnerRectContainer = new RectangleFigure();
		fFigureInnerRectContainer.setFill(false);
		fFigureInnerRectContainer.setOutline(false);
		fFigureInnerRectContainer.setBorder(new MarginBorder(0));

		this.add(fFigureInnerRectContainer);
		fFigureInnerRectContainer.setLayoutManager(new StackLayout());

		fFigureOutlineRectangle = new RectangleFigure();

		fFigureInnerRectContainer.add(fFigureOutlineRectangle);

		fFigureInPolygonContainer = new RectangleFigure();
		fFigureInPolygonContainer.setFill(false);
		fFigureInPolygonContainer.setOutline(false);
		
		fFigureInnerRectContainer.add(fFigureInPolygonContainer);
		fFigureInPolygonContainer.setLayoutManager(new StackLayout());

		fFigureInPolygon = new ScalableRotableTriangleShape();
		fFigureInPolygon.addPoint(new Point(0, 0));
		fFigureInPolygon.addPoint(new Point(1, 1));
		fFigureInPolygon.addPoint(new Point(0, 2));
		fFigureInPolygon.setFill(true);
		fFigureInPolygon.setOutline(false);
		fFigureInPolygon.setBackgroundColor(ColorConstants.black);

		fFigureInPolygonContainer.add(fFigureInPolygon);

		fFigureOutPolygonContainer = new RectangleFigure();
		fFigureOutPolygonContainer.setFill(false);
		fFigureOutPolygonContainer.setOutline(false);
		fFigureInnerRectContainer.add(fFigureOutPolygonContainer);
		fFigureOutPolygonContainer.setLayoutManager(new StackLayout());

		fFigureOutPolygon = new ScalableRotableTriangleShape();
		fFigureOutPolygon.addPoint(new Point(1, 0));
		fFigureOutPolygon.addPoint(new Point(0, 1));
		fFigureOutPolygon.addPoint(new Point(1, 2));
		fFigureOutPolygon.setFill(true);
		fFigureOutPolygon.setOutline(false);
		fFigureOutPolygon.setBackgroundColor(ColorConstants.black);

		fFigureOutPolygonContainer.add(fFigureOutPolygon);

		fFigureInOutPolygonContainer = new RectangleFigure();
		fFigureInOutPolygonContainer.setFill(false);
		fFigureInOutPolygonContainer.setOutline(false);
		fFigureInnerRectContainer.add(fFigureInOutPolygonContainer);
		fFigureInOutPolygonContainer.setLayoutManager(new StackLayout());

		fFigureInOutPolygon = new ScalableRotableTriangleShape();
		fFigureInOutPolygon.addPoint(new Point(6, 0));
		fFigureInOutPolygon.addPoint(new Point(0, 3));
		fFigureInOutPolygon.addPoint(new Point(6, 6));
		fFigureInOutPolygon.addPoint(new Point(1, 6));
		fFigureInOutPolygon.addPoint(new Point(7, 9));
		fFigureInOutPolygon.addPoint(new Point(1, 12));
		fFigureInOutPolygon.setFill(true);
		fFigureInOutPolygon.setOutline(false);
		fFigureInOutPolygon.setBackgroundColor(ColorConstants.black);

		fFigureInOutPolygonContainer.add(fFigureInOutPolygon);

		fFigureHardwareTypeLabel = new WrappingLabel();
		fFigureHardwareTypeLabel.setText("");

		fFigureHardwareTypeLabel.setFont(FFIGUREHARDWARETYPELABEL_FONT);

		fFigureInnerRectContainer.add(fFigureHardwareTypeLabel);

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREHARDWARETYPELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 7, SWT.NORMAL);

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

	/**
	 * @generated
	 */
	public RectangleFigure getFigureOutlineRectangle() {
		return fFigureOutlineRectangle;
	}

	/**
	 * @generated
	 */
	public RectangleFigure getFigureShadowRectangle() {
		return fFigureShadowRectangle;
	}

	/**
	 * @generated
	 */
	public RectangleFigure getFigureInPolygonContainer() {
		return fFigureInPolygonContainer;
	}

	/**
	 * @generated
	 */
	public RectangleFigure getFigureOutPolygonContainer() {
		return fFigureOutPolygonContainer;
	}

	/**
	 * @generated
	 */
	public RectangleFigure getFigureInOutPolygonContainer() {
		return fFigureInOutPolygonContainer;
	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureHardwareTypeLabel() {
		return fFigureHardwareTypeLabel;
	}

	public PointList getCustomPolygonPoints(Rectangle anchRect) {
		if (multiPort) {
			PointList points = new PointList(9);
			points.addPoint(anchRect.x, anchRect.y);
			points.addPoint(anchRect.x + anchRect.width - 3, anchRect.y);
			points.addPoint(anchRect.x + anchRect.width - 3, anchRect.y + 3);
			points.addPoint(anchRect.x + anchRect.width, anchRect.y + 3);
			points.addPoint(anchRect.x + anchRect.width, anchRect.y
					+ anchRect.height);
			points.addPoint(anchRect.x + 3, anchRect.y + anchRect.height);
			points.addPoint(anchRect.x + 3, anchRect.y + anchRect.height - 3);
			points.addPoint(anchRect.x, anchRect.y + anchRect.height - 3);
			points.addPoint(anchRect.x, anchRect.y);
			return points;
		}
		return null;
	}
	
	@Override
	public void setLineStyle(int style) {
		super.setLineStyle(style);
		getFigureShadowRectangle().setLineStyle(style);
		getFigureOutlineRectangle().setLineStyle(style);
	}

}