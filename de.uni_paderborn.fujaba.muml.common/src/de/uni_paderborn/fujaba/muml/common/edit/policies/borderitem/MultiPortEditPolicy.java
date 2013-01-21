package de.uni_paderborn.fujaba.muml.common.edit.policies.borderitem;

import java.util.Arrays;

import org.eclipse.draw2d.LayoutListener;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;

import de.uni_paderborn.fujaba.muml.common.edit.policies.borderitem.layout.MultiPortLayoutListener;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage;

public class MultiPortEditPolicy extends BorderItemEditPolicy {

	public LayoutListener createContainerLayoutListener() {

		/**
		 * A LayoutListener that listens to changes in the container's layout.
		 * After the ports are layouted, we check at which side they are, to
		 * rotate the compartment.
		 * 
		 */
		return new MultiPortLayoutListener(this);
	}

	/**
	 * Handle model-change event.
	 * 
	 * @param notification
	 *            The notification sent by the model.
	 */
	public void handleNotificationEvent(final Notification notification) {
		EStructuralFeature[] features = new EStructuralFeature[] {
				ComponentstorypatternPackage.Literals.MULTI_PORT_VARIABLE__SUB_PORT_VARIABLES, //
				ConnectorPackage.Literals.DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES //
		};
		if (Arrays.asList(features).contains(notification.getFeature())) {
			// Reactivate layouting
			((MultiPortLayoutListener) getContainerLayoutListener())
					.reactivateLayouting();

			// Update border item locator position
			updateBorderItemLocator();
		}
	}

	@Override
	public void updateBorderItemLocator() {
		IBorderItemLocator locator = ((AbstractBorderItemEditPart) getHost())
				.getBorderItemLocator();

		if (locator instanceof BorderItemLocator) {
			Dimension size = ((GraphicalEditPart) getHost()).getContentPane()
					.getSize();
			Dimension offset = new Dimension(size.width / 2, size.height / 2);
			((BorderItemLocator) locator).setBorderItemOffset(offset);
		}
	}

}
