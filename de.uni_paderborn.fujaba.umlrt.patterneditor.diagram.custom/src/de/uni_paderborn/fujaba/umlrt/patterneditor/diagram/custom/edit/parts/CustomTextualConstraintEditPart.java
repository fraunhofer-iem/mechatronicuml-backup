package de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.TextualConstraintEditPart;

public class CustomTextualConstraintEditPart extends TextualConstraintEditPart {

	public CustomTextualConstraintEditPart(View view) {
		super(view);
	}
//		this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
//				.DPtoLP(0)));
//		this.addPoint(new Point(getMapMode().DPtoLP(30), getMapMode()
//				.DPtoLP(0)));
//		this.addPoint(new Point(getMapMode().DPtoLP(30), getMapMode()
//				.DPtoLP(10)));
//		this.addPoint(new Point(getMapMode().DPtoLP(40), getMapMode()
//				.DPtoLP(10)));
//		this.addPoint(new Point(getMapMode().DPtoLP(30), getMapMode()
//				.DPtoLP(10)));
//		this.addPoint(new Point(getMapMode().DPtoLP(30), getMapMode()
//				.DPtoLP(0)));
//		this.addPoint(new Point(getMapMode().DPtoLP(40), getMapMode()
//				.DPtoLP(10)));
//		this.addPoint(new Point(getMapMode().DPtoLP(40), getMapMode()
//				.DPtoLP(40)));
//		this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
//				.DPtoLP(40)));
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40) {
			public PointList getPolygonPoints() {
				PointList points = new PointList(6);
				Rectangle anchRect = getHandleBounds();
				points.addPoint(anchRect.x, anchRect.y);
				points.addPoint(anchRect.x + anchRect.width * 30 / 40, anchRect.y);
				points.addPoint(anchRect.x + anchRect.width, anchRect.y  + anchRect.height * 10 / 40);
				points.addPoint(anchRect.x + anchRect.width, anchRect.y + anchRect.height);
				points.addPoint(anchRect.x, anchRect.y + anchRect.height);
				points.addPoint(anchRect.x, anchRect.y);
				return points;
			}
		};
		return result;
	}

}
