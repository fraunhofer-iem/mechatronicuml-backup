package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StaticStructuredComponentEditPart;

public class CustomStaticStructuredComponentEditPart extends
		StaticStructuredComponentEditPart {

	public CustomStaticStructuredComponentEditPart(View view) {
		super(view);
	}

	@Override
	protected NodeFigure createNodePlate() {
		NodeFigure plate = super.createNodePlate();
		plate.setMinimumSize(new Dimension(0, 0));
		return plate;
	}

}
