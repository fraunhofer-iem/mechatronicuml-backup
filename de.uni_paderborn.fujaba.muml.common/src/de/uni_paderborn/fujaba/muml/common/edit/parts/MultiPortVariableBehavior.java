package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;

import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortKind;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortType;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;

public class MultiPortVariableBehavior extends
	AbstractPortBehavior {

	public MultiPortVariableBehavior(GraphicalEditPart editPart) {
		super(editPart);
	}
	
	public void updatePortType() {
		// Do not visualize it
	}

	public void updateCardinality() {
		// Do not visualize it
	}
	
	
	@Override
	public void activate() {
		IFigure portContainerFigure = getPortContainerFigure();
		if (portContainerFigure != null) {
			addLayoutListener(portContainerFigure);
		}

		super.activate();
	}

	/**
	 * Called whenever the EditPart is going to be deactivated. Cleans up
	 * objects.
	 */
	@Override
	public void deactivate() {
		IFigure portContainerFigure = getPortContainerFigure();
		if (portContainerFigure != null) {
			removeLayoutListener(portContainerFigure);
		}

		super.deactivate();
	}

	
	/**
	 * Handle model-change event.
	 * 
	 * @param notification
	 *            The notification sent by the model.
	 */
	public void handleNotificationEvent(final Notification notification) {
		if (ComponentstorypatternPackage.Literals.MULTI_PORT_VARIABLE__SUB_PORT_VARIABLES.equals(notification.getFeature())){
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

	@Override
	public boolean isMulti() {
		return false;
	}

	@Override
	public boolean isMandatory() {
		return false;
	}

}
