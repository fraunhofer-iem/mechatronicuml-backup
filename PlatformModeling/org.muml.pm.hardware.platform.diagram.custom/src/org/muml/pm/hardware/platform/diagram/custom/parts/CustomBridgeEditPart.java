package org.muml.pm.hardware.platform.diagram.custom.parts;

import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pm.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart;

/**
 * A customized EditPart for a {@link Bridge}. This customized EditPart sets the
 * correct edge anchors.
 * 
 * @author adann
 * 
 */
public class CustomBridgeEditPart extends NetworkBridgeEditPart {

	public CustomBridgeEditPart(View view) {
		super(view);
	}

	@Override
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40) {
			public PointList getPolygonPoints() {
				PointList points = new PointList(4);
				Rectangle anchRect = getHandleBounds();
				points.addPoint(anchRect.x, anchRect.y + (anchRect.height / 2));
				points.addPoint(anchRect.x + (anchRect.width / 2), anchRect.y
						+ anchRect.height);
				points.addPoint(anchRect.x + anchRect.width, anchRect.y
						+ (anchRect.height / 2));
				points.addPoint(anchRect.x + (anchRect.width / 2), anchRect.y);
				return points;
			}
		};

		return result;
	}

}
