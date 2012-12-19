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
		return new MultiPortLayoutListener(this);
	}

	
}
