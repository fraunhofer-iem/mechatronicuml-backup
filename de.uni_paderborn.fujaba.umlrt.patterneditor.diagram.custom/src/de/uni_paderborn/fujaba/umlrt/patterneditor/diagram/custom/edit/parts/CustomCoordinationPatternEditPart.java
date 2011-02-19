package de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.CoordinationPatternEditPart;

public class CustomCoordinationPatternEditPart extends
		CoordinationPatternEditPart {

	public CustomCoordinationPatternEditPart(View view) {
		super(view);
	}

	/**
	 * Customized the CoordinationPattern NodeFigure to have an EllipseAnchor.
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40) {
			@Override
			public ConnectionAnchor createDefaultAnchor() {
				return new EllipseAnchor(this);
			}
		};
		return result;
	}
}
