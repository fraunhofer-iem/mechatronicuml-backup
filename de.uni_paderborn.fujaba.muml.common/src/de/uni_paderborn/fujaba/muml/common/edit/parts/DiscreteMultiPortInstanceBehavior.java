package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;

import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortKind;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortType;
import de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;

public class DiscreteMultiPortInstanceBehavior extends
		AbstractPortInstanceBehavior {

	public DiscreteMultiPortInstanceBehavior(GraphicalEditPart editPart) {
		super(editPart);
	}

	public void updatePortType() {
		// Do not visualize it
	}

	public void updateCardinality() {
		// Do not visualize it
	}

	/**
	 * Handle model-change event.
	 * 
	 * @param notification
	 *            The notification sent by the model.
	 */
	public void handleNotificationEvent(final Notification notification) {
		if (InstancePackage.Literals.DISCRETE_MULTI_PORT_INSTANCE__SUB_PORT_INSTANCES
				.equals(notification.getFeature())) {
			// Reactivate layouting
			((MultiPortLayoutListener) getContainerLayoutListener())
					.reactivateLayouting();

			// Update border item locator position
			updateBorderItemLocator();
		}

		super.handleNotificationEvent(notification);
	}

	@Override
	public void updateBorderItemLocator() {
		IBorderItemLocator locator = ((AbstractBorderItemEditPart) editPart)
				.getBorderItemLocator();

		if (locator instanceof BorderItemLocator) {
			Dimension size = editPart.getContentPane().getSize();
			Dimension offset = new Dimension(size.width / 2, size.height / 2);
			((BorderItemLocator) locator).setBorderItemOffset(offset);
		}
	}

	@Override
	public PortKind getPortKind() {
		return CustomPortFigure.PortKind.DISCRETE;
	}

	@Override
	public PortType getPortType() {
		return CustomPortFigure.PortType.NONE;
	}

	/**
	 * Creates the container layout listener.
	 * 
	 * @return the container layout listener.
	 */
	public LayoutListener createContainerLayoutListener() {

		/**
		 * A LayoutListener that listens to changes in the container's layout.
		 * After the ports are layouted, we check at which side they are, to
		 * rotate the compartment.
		 * 
		 */
		return new MultiPortLayoutListener();
	}

	private class MultiPortLayoutListener extends LayoutListener.Stub {

		private static final int MAX_RECURSION_DEPTH = 3;

		/**
		 * Stores how often we already switched orientation recursively. It is
		 * not allowed to switch orientation multiple times after another,
		 * because it means that the MultiPortInstance is too large for any
		 * side. GMF moves it to another side, and we switch orientation again,
		 * GMF moves to another side, we switch orientation again. This causes
		 * an infinite loop, which we want to prevent.
		 */
		private int depth = 0;

		/**
		 * Is layouting currently activated, or deactivated due to too much
		 * depth.
		 */
		private boolean activateLayouting = true;

		/**
		 * The size of our container. If it changes, we reset the value of
		 * activateLayouting.
		 */
		private Dimension parentSize = null;

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
			if (editPart.getParent() instanceof AbstractGraphicalEditPart) {
				parentFigure = ((AbstractGraphicalEditPart) editPart
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
			
			

			IBorderItemLocator locator = ((AbstractBorderItemEditPart) editPart)
					.getBorderItemLocator();
			if (locator == null) {
				return;
			}

			
			
			// Relocate border item locator to be able to
			// request current side
			locator.relocate(editPart.getFigure());
			

			// Request current side, and find out if we should be horizontal
			// or vertical
			int side = locator.getCurrentSideOfParent();
			boolean horizontal = side != PositionConstants.WEST
					&& side != PositionConstants.EAST;

			// Find the first child that is a compartment
			// (DiscreteMultiPortInstances have only one compartment).
			ResizableCompartmentFigure compartmentFigure = null;
			for (Object child : editPart.getChildren()) {
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
				LayoutManager layoutManager = compartmentFigure
						.getContentPane().getLayoutManager();
				if (layoutManager instanceof ConstrainedToolbarLayout) {
					toolbarLayout = (ConstrainedToolbarLayout) layoutManager;
				}
			}

			if (toolbarLayout != null) {
				/*
				 * Setting the layout manager invalidates our parent's layout
				 * (the ComponentInstance) And triggers relayouting of our
				 * parent, which means that this LayoutListener will get called
				 * again.Therefore we must check, if the value of horizontal has
				 * changed here to prevent endless calls.
				 */
				// horizontal = !toolbarLayout.isHorizontal();
				if (toolbarLayout.isHorizontal() != horizontal) {
					toolbarLayout.setHorizontal(horizontal);
					compartmentFigure.getContentPane().setLayoutManager(
							toolbarLayout);
					


					// Make sure we call the layout routine recursively,
					// to check, if the recursive call will switch
					// orientation again.
					container.validate();
					
					updateBorderItemLocator();
					
					container.validate();


				}
			}

			// Decrement recursion depth counter
			depth--;
		}

	};

}
