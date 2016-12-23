package org.muml.pm.hardware.common.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

/**
 * The custom HWPort figure for all hardware ports.
 * 
 * @author adann
 * 
 */
public class CustomHWPortFigure extends RectangleFigure {

	public enum VisualPortKind {
		BUS, LINK
	}

	public boolean isDelegationPort;


	private RectangleFigure fFigureInnerRectContainer;
	private RectangleFigure fFigureOuterRectContainer;

	private RectangleFigure fFigureShadowRectangle;

	/**
	 * @generated
	 */
	private ScalablePolygonShape fFigureBusArrow;
	/**
	 * @generated
	 */
	private PolylineShape fFigureP2PLine;
	/**
	 * @generated
	 */
	private Ellipse fFigureCircle1;
	/**
	 * @generated
	 */
	private Ellipse fFigureCircle2;

	/**
	 * @generated
	 */
	public CustomHWPortFigure() {
		this.setLayoutManager(new StackLayout());
		this.setFill(true);
		this.setOutline(false);
		// this.setBorder(new MarginBorder(0));
		createContents();
		setDelegationPort(false);
		setHWPortKind(VisualPortKind.BUS);
		setMulti(false);
	}

	public void setHWPortKind(VisualPortKind portKind) {
		this.getFigureBusArrow().setVisible(portKind == VisualPortKind.BUS);
		this.getFigureP2PLine().setVisible(portKind == VisualPortKind.LINK);
		this.getFigureCircle1().setVisible(portKind == VisualPortKind.LINK);
		this.getFigureCircle2().setVisible(portKind == VisualPortKind.LINK);
	}

	public void setDelegationPort(boolean isDelegationPort) {
		Color newColor = ColorConstants.black;
		if (isDelegationPort) {
			newColor = ColorConstants.gray;
		}
		this.getFigureBusArrow().setBackgroundColor(newColor);
		this.getFigureP2PLine().setForegroundColor(newColor);
		this.getFigureCircle1().setBackgroundColor(newColor);
		this.getFigureCircle2().setBackgroundColor(newColor);
	}

	/**
	 * @generated
	 */
	private void createContents() {
		RectangleFigure aux10 = new RectangleFigure();
		aux10.setFill(false);
		aux10.setOutline(false);
		aux10.setBorder(new MarginBorder(0, 3, 3, 0));

		this.add(aux10);
		aux10.setLayoutManager(new StackLayout());

		fFigureShadowRectangle = new RectangleFigure();

		aux10.add(fFigureShadowRectangle);

		fFigureOuterRectContainer = new RectangleFigure();
		fFigureOuterRectContainer.setFill(true);
		fFigureOuterRectContainer.setOutline(true);
		fFigureOuterRectContainer.setBorder(new MarginBorder(0));
		fFigureOuterRectContainer.setLayoutManager(new StackLayout());

		this.add(fFigureOuterRectContainer);
		fFigureInnerRectContainer = new RectangleFigure();
		fFigureInnerRectContainer.setFill(false);
		fFigureInnerRectContainer.setOutline(false);
		fFigureInnerRectContainer.setBorder(new MarginBorder(1));

		fFigureOuterRectContainer.add(fFigureInnerRectContainer);
		fFigureInnerRectContainer.setLayoutManager(new StackLayout());

		fFigureBusArrow = new ScalablePolygonShape();

		fFigureBusArrow.addPoint(new Point(0, 2));
		fFigureBusArrow.addPoint(new Point(2, 4));
		fFigureBusArrow.addPoint(new Point(2, 3));
		fFigureBusArrow.addPoint(new Point(4, 3));
		fFigureBusArrow.addPoint(new Point(4, 4));
		fFigureBusArrow.addPoint(new Point(6, 2));
		fFigureBusArrow.addPoint(new Point(4, 0));
		fFigureBusArrow.addPoint(new Point(4, 1));
		fFigureBusArrow.addPoint(new Point(2, 1));
		fFigureBusArrow.addPoint(new Point(2, 0));
		fFigureBusArrow.addPoint(new Point(0, 2));
		fFigureBusArrow.setFill(true);
		fFigureBusArrow.setOutline(false);
		fFigureBusArrow.setBackgroundColor(ColorConstants.black);

		fFigureInnerRectContainer.add(fFigureBusArrow);

		fFigureP2PLine = new PolylineShape();

		fFigureP2PLine.addPoint(new Point(3, 3));
		fFigureP2PLine.addPoint(new Point(11, 3));
		fFigureP2PLine.addPoint(new Point(11, 18));
		fFigureP2PLine.addPoint(new Point(18, 18));
		fFigureP2PLine.setBackgroundColor(ColorConstants.black);

		fFigureInnerRectContainer.add(fFigureP2PLine);

		fFigureCircle1 = new Ellipse();

		fFigureCircle1.setOutline(false);
		fFigureCircle1.setBackgroundColor(ColorConstants.black);
		fFigureCircle1.setLocation(new Point(2, 1));
		fFigureCircle1.setSize(6, 6);

		fFigureP2PLine.add(fFigureCircle1);

		fFigureCircle2 = new Ellipse();

		fFigureCircle2.setOutline(false);
		fFigureCircle2.setBackgroundColor(ColorConstants.black);
		fFigureCircle2.setLocation(new Point(14, 16));
		fFigureCircle2.setSize(6, 6);

		fFigureP2PLine.add(fFigureCircle2);

		// this.add(outerRectangle);
		// this.add(innerRectangle);
	}

	/**
	 * @generated
	 */
	public ScalablePolygonShape getFigureBusArrow() {
		return fFigureBusArrow;
	}

	public RectangleFigure getFigureInnerRectContainer() {
		return fFigureInnerRectContainer;
	}

	public RectangleFigure getFigureOuterRectangleFigure() {
		return fFigureOuterRectContainer;
	}

	public RectangleFigure getfFigureShadowRectangle() {
		return fFigureShadowRectangle;
	}

	/**
	 * @generated
	 */
	public PolylineShape getFigureP2PLine() {
		return fFigureP2PLine;
	}

	/**
	 * @generated
	 */
	public Ellipse getFigureCircle1() {
		return fFigureCircle1;
	}

	/**
	 * @generated
	 */
	public Ellipse getFigureCircle2() {
		return fFigureCircle2;
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
			// setRotationInDegrees(0.0);
			break;

		default:
		case PositionConstants.NORTH:
			// setRotationInDegrees(90.0);
			break;

		case PositionConstants.EAST:
			// setRotationInDegrees(180.0);
			break;

		case PositionConstants.SOUTH:
			// setRotationInDegrees(270.0);
			break;

		}
	}

	public void setMulti(boolean multi) {

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
			getFigureOuterRectangleFigure().setFill(!multi);
			getFigureOuterRectangleFigure().setOutline(!multi);

			// Set the new margin and the new preferred size.
			getFigureInnerRectContainer().setFill(multi);
			getFigureInnerRectContainer().setOutline(multi);
			getFigureOuterRectangleFigure().setBorder(
					new MarginBorder(marginTopRight, 0, 0, marginTopRight));
		}
	}
	
	public void setOptional(boolean isOptional){
		if(isOptional){
			getFigureInnerRectContainer().setLineStyle(SWT.LINE_DASH);
			getFigureOuterRectangleFigure().setLineStyle(SWT.LINE_DASH);
			getfFigureShadowRectangle().setLineStyle(SWT.LINE_DASH);
		}
		else{
			getFigureInnerRectContainer().setLineStyle(SWT.LINE_SOLID);
			getFigureOuterRectangleFigure().setLineStyle(SWT.LINE_SOLID);
			getfFigureShadowRectangle().setLineStyle(SWT.LINE_SOLID);
		}
		
	}

}
