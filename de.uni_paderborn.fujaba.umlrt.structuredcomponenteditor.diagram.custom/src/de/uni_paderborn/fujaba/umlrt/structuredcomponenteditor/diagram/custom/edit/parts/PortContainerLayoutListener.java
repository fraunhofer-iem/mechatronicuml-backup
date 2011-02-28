package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;

import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.parts.figures.CustomPortFigure;

/**
 * A LayoutListener that listens to changes in the container's layout. After the
 * ports are layouted, we check at which side they are, to rotate their polygon.
 * 
 * @author bingo
 * 
 */
public class PortContainerLayoutListener extends LayoutListener.Stub {
	/**
	 * The port's EditPart.
	 */
	private AbstractBorderItemEditPart editPart;

	/**
	 * The port's figure that should be rotated.
	 */
	private CustomPortFigure portFigure;

	/**
	 * Constructs this LayoutListener.
	 * 
	 * @param editPart
	 *            The port's EditPart
	 * @param portFigure
	 *            The port's figure that should be rotated.
	 */
	public PortContainerLayoutListener(AbstractBorderItemEditPart editPart,
			CustomPortFigure portFigure) {
		this.editPart = editPart;
		this.portFigure = portFigure;
	}

	/**
	 * Rotate the port's figure according to the side that the port currently is at.
	 */
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
