package de.uni_paderborn.fujaba.muml.common.edit.policies.borderitem.layout;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;

/**
 * A LayoutListener that listens to changes in the container's layout. After the
 * ports are layouted, we check at which side they are, to rotate their polygon.
 * 
 */
public class DefaultLayoutListener extends LayoutListener.Stub {
	protected AbstractBorderItemEditPart borderItemEp;

	public DefaultLayoutListener( AbstractBorderItemEditPart borderItemEp) {
		this.borderItemEp = borderItemEp;
	}

	/**
	 * Rotate the port's figure according to the side that the port currently is
	 * at.
	 */
	@Override
	public void postLayout(IFigure container) {
		IBorderItemLocator borderItemLocator = borderItemEp
				.getBorderItemLocator();
		if (borderItemLocator != null) {
			borderItemLocator.relocate(borderItemEp.getFigure());
			int side = borderItemLocator.getCurrentSideOfParent();
			sideChanged(side);
		}
	}

	protected void sideChanged(int side) {
		// default implementation does nothing
	}
}