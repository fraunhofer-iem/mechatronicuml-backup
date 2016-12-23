package org.muml.pim.common.edit.policies.ports;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.core.common.edit.policies.NotifyingGraphicalEditPolicy;

/**
 * This class contains all the behavior for rotated border items.
 * 
 * @author bingo
 * 
 */
public abstract class AbstractRotatingBorderItemEditPolicy extends
		NotifyingGraphicalEditPolicy {

	/**
	 * The offset that the port lies within it's container.
	 */
	public static final Dimension DEFAULT_OFFSET = new Dimension(12, 12);

	/**
	 * The LayoutListener for layouting the port's container.
	 */
	private LayoutListener containerLayoutListener;

	@Override
	public void activate() {
		super.activate();

		updateBorderItemLocator();

		IFigure containerFigure = getBorderItemContainerFigure();
		if (containerFigure != null) {
			addLayoutListener(containerFigure);
		}
	}

	@Override
	public void deactivate() {

		IFigure containerFigure = getBorderItemContainerFigure();
		if (containerFigure != null) {
			removeLayoutListener(containerFigure);
		}

		super.deactivate();
	}

	public IFigure getContentPane() {
		return ((AbstractGraphicalEditPart) getHost()).getContentPane();
	}

	public void updateBorderItemLocator() {
		// do not deduce, we would overwrite the offset for the multi port.
		// only set if we are a border item ourselves.
		// AbstractBorderItemEditPart borderItemEp = deduceBorderItemEditPart();
		if (getHost() instanceof AbstractBorderItemEditPart) {
			AbstractBorderItemEditPart borderItemEp = (AbstractBorderItemEditPart) getHost();
			IBorderItemLocator locator = borderItemEp.getBorderItemLocator();

			if (locator instanceof BorderItemLocator) {
				// Dimension size = borderItemEp.getContentPane().getSize();
				// Dimension offset = new Dimension(size.width / 2,
				// size.height / 2);
				// ((BorderItemLocator) locator).setBorderItemOffset(offset);
				((BorderItemLocator) locator)
						.setBorderItemOffset(DEFAULT_OFFSET);
			}
		}
	}

	
	/**
	 * Adds a LayoutListener to the given figure. This listener will hook into
	 * layout changes (movements) and update the port's visual orientation
	 * according to the side it lies at.
	 * 
	 * @param figure
	 *            The figure.
	 */
	public void addLayoutListener(IFigure figure) {
		LayoutListener layoutListener = getContainerLayoutListener();
		if (layoutListener != null) {
			figure.removeLayoutListener(layoutListener);
			figure.addLayoutListener(layoutListener);
		}
	}

	/**
	 * Removes the LayoutListener from the given figure.
	 * 
	 * @param figure
	 *            The container figure.
	 */
	public void removeLayoutListener(IFigure figure) {
		if (containerLayoutListener != null) {
			figure.removeLayoutListener(containerLayoutListener);
		}
	}

	/**
	 * Gets and lazily creates the container layout listener.
	 * 
	 * @return The container layout listener. Can be null, if the host is no
	 *         border item.
	 */
	public LayoutListener getContainerLayoutListener() {
		if (containerLayoutListener == null) {
			// can return null
			containerLayoutListener = createContainerLayoutListener();
		}
		return containerLayoutListener;
	}

	public LayoutListener createContainerLayoutListener() {
		AbstractBorderItemEditPart part = deduceBorderItemEditPart();
		if (part != null) {
			return new DefaultLayoutListener(part);
		}
		return null;
	}

	/**
	 * Convenience method
	 */
	protected IFigure getBorderItemContainerFigure() {
		GraphicalEditPart borderItemEp = deduceBorderItemEditPart();
		if (borderItemEp != null
				&& borderItemEp.getParent() instanceof GraphicalEditPart) {
			GraphicalEditPart parentEditPart = (GraphicalEditPart) borderItemEp
					.getParent();
			if (parentEditPart.getFigure() instanceof BorderedNodeFigure) {
				BorderedNodeFigure bnf = (BorderedNodeFigure) parentEditPart
						.getFigure();
				return bnf.getBorderItemContainer();
			}
		}
		return null;
	}

	/**
	 * Convenience method to return the host's primary view.
	 * 
	 * @return primary view.
	 */
	protected View getPrimaryView() {
		return ((GraphicalEditPart) getHost()).getPrimaryView();
	}



	/**
	 * Convenience method
	 */
	public AbstractBorderItemEditPart deduceBorderItemEditPart() {
		EditPart ep = getHost();
		while (ep != null && false == ep instanceof AbstractBorderItemEditPart) {
			ep = ep.getParent();
		}
		return (AbstractBorderItemEditPart) ep;
	}

	/**
	 * A LayoutListener that listens to changes in the container's layout. After
	 * the ports are layouted, we check at which side they are, to rotate their
	 * polygon.
	 * 
	 */
	public class DefaultLayoutListener extends LayoutListener.Stub {
		private AbstractBorderItemEditPart part;

		public DefaultLayoutListener(AbstractBorderItemEditPart part) {
			this.part = part;
		}

		/**
		 * Rotate the port's figure according to the side that the port
		 * currently is at.
		 */
		@Override
		public void postLayout(IFigure container) {
			IBorderItemLocator borderItemLocator = part.getBorderItemLocator();
			if (borderItemLocator != null) {
				borderItemLocator.relocate(part.getFigure());
				int side = borderItemLocator.getCurrentSideOfParent();
				sideChanged(side);
			}
		}

		protected void sideChanged(int side) {
			AbstractRotatingBorderItemEditPolicy.this.sideChanged(side);
		}
	}

	protected void sideChanged(int side) {
		// default implementation does nothing
	}

}
