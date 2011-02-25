package de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScalablePolygonShape;

public interface IPortFigure extends IFigure {
	ScalablePolygonShape getFigureInPolygon();

	ScalablePolygonShape getFigureOutPolygon();

	ScalablePolygonShape getFigureInOutPolygon1();

	ScalablePolygonShape getFigureInOutPolygon2();

	RectangleFigure getFigureInOutPolygonContainer1();

	RectangleFigure getFigureInOutPolygonContainer2();

	RectangleFigure getFigureInnerRectContainer();

}
