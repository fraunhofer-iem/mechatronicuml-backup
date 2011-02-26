package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;

import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.parts.figures.CustomPortFigure;

public class PortContainerLayoutListener extends LayoutListener.Stub {
	private AbstractBorderItemEditPart editPart;

	CustomPortFigure portFigure;
	
	public PortContainerLayoutListener(AbstractBorderItemEditPart editPart, CustomPortFigure portFigure) {
		this.editPart = editPart;
		this.portFigure = portFigure;
	}

	@Override
	public void postLayout(IFigure container) {
		IBorderItemLocator borderItemLocator = editPart.getBorderItemLocator();
		if (borderItemLocator != null) {
			borderItemLocator.relocate(editPart.getFigure());
			int side = borderItemLocator.getCurrentSideOfParent();
			portFigure.setPortSide(side);
		}

		
	}
}
