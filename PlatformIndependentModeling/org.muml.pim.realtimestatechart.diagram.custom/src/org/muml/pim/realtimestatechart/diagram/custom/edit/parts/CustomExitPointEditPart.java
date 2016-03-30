package org.muml.pim.realtimestatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.realtimestatechart.diagram.edit.parts.ExitPointEditPart;

public class CustomExitPointEditPart extends ExitPointEditPart {

	public CustomExitPointEditPart(View view) {
		super(view);
	}

	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(25, 25) {

			@Override
			public ConnectionAnchor getConnectionAnchor(String terminal) {
				return createDefaultAnchor();
			}

			@Override
			public ConnectionAnchor createDefaultAnchor() {
				return new EllipseAnchor(this);
			}
		};

		// FIXME: workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());

		return result;
	}


}
