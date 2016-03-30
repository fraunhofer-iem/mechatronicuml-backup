package org.muml.pim.common.edit.policies.ports;

import org.eclipse.draw2d.LayoutListener;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.muml.pim.common.edit.policies.ports.layout.MultiPortLayoutListener;

public class MultiPortEditPolicy extends AbstractRotatingBorderItemEditPolicy {
	public static final Dimension DEFAULT_MULTI_OFFSET = new Dimension(22, 18);

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
		boolean childrenChanged = false;
		
		// Generic implementation for all kinds of children.
		if (notification.getFeature() instanceof EReference) {
			//EReference reference = (EReference) notification.getFeature();
			if (notification.getNotifier() == getSemanticElement() /*&& reference.isContainment()*/) { // inner ports are not contained by the multiport, so we must not only react on containment references.
				childrenChanged = true;
			}
		}
		
		// Concrete implementation for each kind of children
//		EStructuralFeature[] features = new EStructuralFeature[] {
//				ComponentstorypatternPackage.Literals.MULTI_PORT_VARIABLE__SUB_PORT_VARIABLES, //
//				ConnectorPackage.Literals.DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES //
//		};
//		if (Arrays.asList(features).contains(notification.getFeature())) {
//			childrenChanged = true;
//		}
		
		if (childrenChanged) {
			// Reactivate layouting
			((MultiPortLayoutListener) getContainerLayoutListener())
					.reactivateLayouting();

			// Update border item locator position
			updateBorderItemLocator();
		}
	}

	public void updateBorderItemLocator() {
		if (getHost() instanceof AbstractBorderItemEditPart) {
			AbstractBorderItemEditPart borderItemEp = (AbstractBorderItemEditPart) getHost();
			IBorderItemLocator locator = borderItemEp.getBorderItemLocator();

			if (locator instanceof BorderItemLocator) {
				((BorderItemLocator) locator)
						.setBorderItemOffset(DEFAULT_MULTI_OFFSET);
			}
		}
	}

}
