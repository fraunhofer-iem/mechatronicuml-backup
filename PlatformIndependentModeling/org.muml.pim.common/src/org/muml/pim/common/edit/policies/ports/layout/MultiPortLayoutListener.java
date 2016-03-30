package org.muml.pim.common.edit.policies.ports.layout;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.muml.pim.common.edit.policies.ports.AbstractRotatingBorderItemEditPolicy;

/**
 * A LayoutListener that listens to changes in the container's layout. After the
 * ports are layouted, we check at which side they are, to rotate the
 * compartment.
 * 
 * @author bingo
 * 
 */
public class MultiPortLayoutListener extends LayoutListener.Stub {

	private static final int MAX_RECURSION_DEPTH = 3;

	/**
	 * Stores how often we already switched orientation recursively. It is not
	 * allowed to switch orientation multiple times after another, because it
	 * means that the MultiPortInstance is too large for any side. GMF moves it
	 * to another side, and we switch orientation again, GMF moves to another
	 * side, we switch orientation again. This causes an infinite loop, which we
	 * want to prevent.
	 */
	private int depth = 0;

	/**
	 * Is layouting currently activated, or deactivated due to too much depth.
	 */
	private boolean activateLayouting = true;

	/**
	 * The size of our container. If it changes, we reset the value of
	 * activateLayouting.
	 */
	private Dimension parentSize = null;

	private AbstractRotatingBorderItemEditPolicy ep;

	public MultiPortLayoutListener(AbstractRotatingBorderItemEditPolicy ep) {
		this.ep = ep;
	}

	/**
	 * Reset the value of activateLayouting to true.
	 */
	public void reactivateLayouting() {
		activateLayouting = true;
	}

	/**
	 * Rotate the port's compartment according to the side that the port
	 * currently is at.
	 */
	@Override
	public void postLayout(IFigure container) {

		// If container size changed, we try to layout again.
		IFigure parentFigure = null;
		if (ep.getHost().getParent() instanceof AbstractGraphicalEditPart) {
			parentFigure = ((AbstractGraphicalEditPart) ep.getHost()
					.getParent()).getContentPane();
		}
		if (!activateLayouting && parentFigure != null) {
			if (parentSize == null
					|| !parentFigure.getSize().equals(parentSize)) {

				parentSize = parentFigure.getSize();
				activateLayouting = true;
			}
		}

		// Once the recursion depth is greater than a constant value, we
		// deactivate layouting
		if (depth > MAX_RECURSION_DEPTH) {
			activateLayouting = false;
		}

		// If layouting is deactivated, do not proceed.
		if (!activateLayouting) {
			return;
		}

		// Increment recursion depth counter
		depth++;

		//
		// Start relayouting
		//

		IBorderItemLocator locator = ((AbstractBorderItemEditPart) ep.getHost())
				.getBorderItemLocator();
		if (locator == null) {
			return;
		}

		// Relocate border item locator to be able to
		// request current side
		locator.relocate(((GraphicalEditPart) ep.getHost()).getFigure());

		// Request current side, and find out if we should be horizontal
		// or vertical
		int side = locator.getCurrentSideOfParent();
		boolean horizontal = side != PositionConstants.WEST
				&& side != PositionConstants.EAST;

		// Find the first child that is a compartment
		// (DiscreteMultiPortInstances have only one compartment).
		ResizableCompartmentFigure compartmentFigure = null;
		for (Object child : ep.getHost().getChildren()) {
			if (child instanceof AbstractGraphicalEditPart) {
				AbstractGraphicalEditPart childEp = ((AbstractGraphicalEditPart) child);
				IFigure figure = childEp.getFigure();

				if (figure instanceof ResizableCompartmentFigure) {
					// Store first compartment
					compartmentFigure = (ResizableCompartmentFigure) figure;
					break;
				}
			}
		}

		// Get the ToolbarLayout of the Compartment, if it exists
		ConstrainedToolbarLayout toolbarLayout = null;
		if (compartmentFigure != null) {
			LayoutManager layoutManager = compartmentFigure.getContentPane()
					.getLayoutManager();
			if (layoutManager instanceof ConstrainedToolbarLayout) {
				toolbarLayout = (ConstrainedToolbarLayout) layoutManager;
			}
		}

		if (toolbarLayout != null) {
			/*
			 * Setting the layout manager invalidates our parent's layout (the
			 * ComponentInstance) And triggers relayouting of our parent, which
			 * means that this LayoutListener will get called again.Therefore we
			 * must check, if the value of horizontal has changed here to
			 * prevent endless calls.
			 */
			if (toolbarLayout.isHorizontal() != horizontal) {
				toolbarLayout.setHorizontal(horizontal);
				compartmentFigure.getContentPane().setLayoutManager(
						toolbarLayout);

				// Make sure we call the layout routine recursively,
				// to check, if the recursive call will switch
				// orientation again.
				container.validate();

				ep.updateBorderItemLocator();

				container.validate();

			}
		}

		// Decrement recursion depth counter
		depth--;
	}

};
