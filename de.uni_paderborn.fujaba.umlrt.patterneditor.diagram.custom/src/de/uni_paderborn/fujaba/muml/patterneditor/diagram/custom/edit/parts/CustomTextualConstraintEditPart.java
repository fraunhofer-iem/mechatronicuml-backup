package de.uni_paderborn.fujaba.muml.patterneditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.TextualConstraintEditPart;

/**
 * A custom EditPart for TextualConstraints. We customize the NodeFigure here.
 * 
 * @author bingo
 * 
 */
public class CustomTextualConstraintEditPart extends TextualConstraintEditPart {

	public CustomTextualConstraintEditPart(View view) {
		super(view);
	}

	/**
	 * Make sure, the node figure returns the used PolygonPoints, so that
	 * connections can connect to the correct location.
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40) {
			public PointList getPolygonPoints() {
				PointList points = new PointList(6);
				Rectangle anchRect = getHandleBounds();
				points.addPoint(anchRect.x, anchRect.y);
				points.addPoint(anchRect.x + anchRect.width * 30 / 40,
						anchRect.y);
				points.addPoint(anchRect.x + anchRect.width, anchRect.y
						+ anchRect.height * 10 / 40);
				points.addPoint(anchRect.x + anchRect.width, anchRect.y
						+ anchRect.height);
				points.addPoint(anchRect.x, anchRect.y + anchRect.height);
				points.addPoint(anchRect.x, anchRect.y);
				return points;
			}
		};
		return result;
	}

}
