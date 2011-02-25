package de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;

public class PortContainerLayoutListener extends LayoutListener.Stub {
	private AbstractBorderItemEditPart editPart;
	private PortDecoration portDecoration;

	public PortContainerLayoutListener(AbstractBorderItemEditPart editPart,
			PortDecoration portDecoration) {
		this.editPart = editPart;
		this.portDecoration = portDecoration;
	}

	@Override
	public void postLayout(IFigure container) {
		IBorderItemLocator borderItemLocator = editPart.getBorderItemLocator();
		if (borderItemLocator != null) {
			borderItemLocator.relocate(editPart.getFigure());
			int side = borderItemLocator.getCurrentSideOfParent();
			portDecoration.setPortSide(side);
		}

		
	}
}
