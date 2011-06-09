package de.uni_paderborn.fujaba.muml.common.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import de.uni_paderborn.fujaba.muml.model.component.PortKind;

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
		fFigureHardwareTypeLabel.setAlignment(PositionConstants.CENTER);
		setPortMulti(false);
		setPortKindAndPortType(null, PortType.INOUT_PORT);
		setPortSide(PositionConstants.NORTH);
	}

	public void setPortKindAndPortType(PortKind portKind, PortType portType) {
		// Chooses the right polygon to display.
		getFigureInPolygon().setVisible(portType == PortType.IN_PORT);
		getFigureOutPolygon().setVisible(portType == PortType.OUT_PORT);
		getFigureInOutPolygon().setVisible(portType == PortType.INOUT_PORT);

		// Set Outline
		boolean outline = portKind == PortKind.CONTINUOUS
				|| portKind == PortKind.HYBRID;
		getFigureInPolygon().setOutline(outline);
		getFigureOutPolygon().setOutline(outline);
		getFigureInOutPolygon().setOutline(outline);

		// Set Background Color
		Color backgroundColor = null;
		if (portKind == PortKind.DISCRETE) {
			backgroundColor = ColorConstants.gray;
		}
		getFigureInPolygon().setBackgroundColor(backgroundColor);
		getFigureOutPolygon().setBackgroundColor(backgroundColor);
		getFigureInOutPolygon().setBackgroundColor(backgroundColor);

		// Activate Rectangle for Port only if it is no continuous port.
		getFigureShadowRectangle().setVisible(portKind != PortKind.CONTINUOUS);
		getFigureOutlineRectangle().setOutline(portKind != PortKind.CONTINUOUS);
		getFigureOutlineRectangle().setFill(portKind != PortKind.CONTINUOUS);

		// Update Margin
		boolean fullsize = portKind != PortKind.DISCRETE;
		setMarginBorder(fullsize ? 0 : 5, getFigureInPolygonContainer());
		setMarginBorder(fullsize ? 0 : 5, getFigureOutPolygonContainer());
		setMarginBorder(fullsize ? 0 : 4, getFigureInOutPolygonContainer());

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

	private void setMarginBorder(int inset, IFigure figure) {
		figure.setBorder(new MarginBorder(inset, inset, inset, inset));
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
		this.multiPort = isMulti;

		// Calculate new Margin for bottom, right.
		int marginBottomRight = 0;
		if (isMulti) {
			marginBottomRight = 3;
		}

		// Calculate new preferred size, which is the original size (24,24)
		// minus the margin.
		if (getParent() != null) {
			Dimension preferredSize = getParent().getPreferredSize().getCopy();
			preferredSize.expand(-marginBottomRight, -marginBottomRight);

			// Set the new margin and the new preferred size.
			RectangleFigure innerRectContainer = getFigureInnerRectContainer();
			innerRectContainer.setBorder(new MarginBorder(0, 0,
					marginBottomRight, marginBottomRight));
			innerRectContainer.setPreferredSize(preferredSize);
		}
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

		fFigureShadowRectangle = new RectangleFigure();

		aux10.add(fFigureShadowRectangle);

		fFigureInnerRectContainer = new RectangleFigure();
		fFigureInnerRectContainer.setFill(false);
		fFigureInnerRectContainer.setOutline(false);
		fFigureInnerRectContainer.setBorder(new MarginBorder(getMapMode()
				.DPtoLP(0), getMapMode().DPtoLP(0), getMapMode().DPtoLP(0),
				getMapMode().DPtoLP(0)));

		this.add(fFigureInnerRectContainer);
		fFigureInnerRectContainer.setLayoutManager(new StackLayout());

		fFigureOutlineRectangle = new RectangleFigure();

		fFigureInnerRectContainer.add(fFigureOutlineRectangle);

		fFigureInPolygonContainer = new RectangleFigure();
		fFigureInPolygonContainer.setFill(false);
		fFigureInPolygonContainer.setOutline(false);
		fFigureInPolygonContainer.setBorder(new MarginBorder(getMapMode()
				.DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
				getMapMode().DPtoLP(5)));

		fFigureInnerRectContainer.add(fFigureInPolygonContainer);
		fFigureInPolygonContainer.setLayoutManager(new StackLayout());

		fFigureInPolygon = new ScalableRotableTriangleShape();
		fFigureInPolygon.addPoint(new Point(getMapMode().DPtoLP(0),
				getMapMode().DPtoLP(0)));
		fFigureInPolygon.addPoint(new Point(getMapMode().DPtoLP(1),
				getMapMode().DPtoLP(1)));
		fFigureInPolygon.addPoint(new Point(getMapMode().DPtoLP(0),
				getMapMode().DPtoLP(2)));
		fFigureInPolygon.setFill(true);
		fFigureInPolygon.setOutline(false);
		fFigureInPolygon.setBackgroundColor(ColorConstants.gray);

		fFigureInPolygonContainer.add(fFigureInPolygon);

		fFigureOutPolygonContainer = new RectangleFigure();
		fFigureOutPolygonContainer.setFill(false);
		fFigureOutPolygonContainer.setOutline(false);
		fFigureOutPolygonContainer.setBorder(new MarginBorder(getMapMode()
				.DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
				getMapMode().DPtoLP(5)));

		fFigureInnerRectContainer.add(fFigureOutPolygonContainer);
		fFigureOutPolygonContainer.setLayoutManager(new StackLayout());

		fFigureOutPolygon = new ScalableRotableTriangleShape();
		fFigureOutPolygon.addPoint(new Point(getMapMode().DPtoLP(1),
				getMapMode().DPtoLP(0)));
		fFigureOutPolygon.addPoint(new Point(getMapMode().DPtoLP(0),
				getMapMode().DPtoLP(1)));
		fFigureOutPolygon.addPoint(new Point(getMapMode().DPtoLP(1),
				getMapMode().DPtoLP(2)));
		fFigureOutPolygon.setFill(true);
		fFigureOutPolygon.setOutline(false);
		fFigureOutPolygon.setBackgroundColor(ColorConstants.gray);

		fFigureOutPolygonContainer.add(fFigureOutPolygon);

		fFigureInOutPolygonContainer = new RectangleFigure();
		fFigureInOutPolygonContainer.setFill(false);
		fFigureInOutPolygonContainer.setOutline(false);
		fFigureInOutPolygonContainer.setBorder(new MarginBorder(getMapMode()
				.DPtoLP(3), getMapMode().DPtoLP(3), getMapMode().DPtoLP(3),
				getMapMode().DPtoLP(3)));

		fFigureInnerRectContainer.add(fFigureInOutPolygonContainer);
		fFigureInOutPolygonContainer.setLayoutManager(new StackLayout());

		fFigureInOutPolygon = new ScalableRotableTriangleShape();
		fFigureInOutPolygon.addPoint(new Point(getMapMode().DPtoLP(6),
				getMapMode().DPtoLP(0)));
		fFigureInOutPolygon.addPoint(new Point(getMapMode().DPtoLP(0),
				getMapMode().DPtoLP(3)));
		fFigureInOutPolygon.addPoint(new Point(getMapMode().DPtoLP(6),
				getMapMode().DPtoLP(6)));
		fFigureInOutPolygon.addPoint(new Point(getMapMode().DPtoLP(1),
				getMapMode().DPtoLP(5)));
		fFigureInOutPolygon.addPoint(new Point(getMapMode().DPtoLP(7),
				getMapMode().DPtoLP(8)));
		fFigureInOutPolygon.addPoint(new Point(getMapMode().DPtoLP(1),
				getMapMode().DPtoLP(11)));
		fFigureInOutPolygon.setFill(true);
		fFigureInOutPolygon.setOutline(false);
		fFigureInOutPolygon.setBackgroundColor(ColorConstants.gray);

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

}