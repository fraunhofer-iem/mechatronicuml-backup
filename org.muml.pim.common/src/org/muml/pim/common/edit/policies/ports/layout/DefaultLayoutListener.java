package org.muml.pim.common.edit.policies.ports.layout;

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
	private AbstractBorderItemEditPart part;

	public DefaultLayoutListener(AbstractBorderItemEditPart part) {
		this.part = part;
	}

	/**
	 * Rotate the port's figure according to the side that the port currently is
	 * at.
	 */
	@Override
	public void postLayout(IFigure container) {
		IBorderItemLocator borderItemLocator = part
				.getBorderItemLocator();
		if (borderItemLocator != null) {
			borderItemLocator.relocate(part.getFigure());
			int side = borderItemLocator.getCurrentSideOfParent();
			sideChanged(side);
		}
	}

	protected void sideChanged(int side) {
		// default implementation does nothing
	}
}