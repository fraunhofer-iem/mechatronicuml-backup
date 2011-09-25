package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.edit.part;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceEditPart;

public class CustomMessageInterfaceEditPart extends MessageInterfaceEditPart {

	public CustomMessageInterfaceEditPart(View view) {
		super(view);
	}

	@Override
	protected NodeFigure createNodePlate() {
		NodeFigure plate = super.createNodePlate();
		plate.setMinimumSize(new Dimension(0, 0));
		return plate;
	}

}
