package de.uni_paderborn.fujaba.muml.common.edit.policies;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.editpolicies.GraphicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;

/**
 * This class provides convenience methods for graphical edit policies that need
 * notification.
 * 
 * @author bingo
 * 
 */
public abstract class NotifyingGraphicalEditPolicy extends GraphicalEditPolicy
		implements NotificationListener {

	/**
	 * Activated this edit policy, does initializing work.
	 */
	@Override
	public void activate() {
		super.activate();

		// add semantic listeners
		DiagramEventBroker diagramEventBroker = getDiagramEventBroker();
		if (diagramEventBroker != null) {
			addSemanticListeners(diagramEventBroker);
		}
	}

	/**
	 * Deactivates this edit policy from its host, making it non-operable and
	 * doing cleanup work.
	 */
	@Override
	public void deactivate() {
		// remove semantic listeners
		DiagramEventBroker diagramEventBroker = getDiagramEventBroker();
		if (diagramEventBroker != null) {
			removeSemanticListeners(diagramEventBroker);
		}
		super.deactivate();
	}

	/**
	 * Gets the diagram event broker from the editing domain.
	 * 
	 * @return the diagram event broker
	 */
	private DiagramEventBroker getDiagramEventBroker() {
		TransactionalEditingDomain theEditingDomain = ((GraphicalEditPart) getHost())
				.getEditingDomain();
		if (theEditingDomain != null) {
			return DiagramEventBroker.getInstance(theEditingDomain);
		}
		return null;
	}

	/**
	 * Convenience method.
	 * 
	 * @return The semantic element.
	 */
	protected EObject getSemanticElement() {
		return ((GraphicalEditPart) getHost()).getNotationView().getElement();
	}

	/**
	 * Delegates the notification to the handleNotificationEvent method.
	 */
	@Override
	public void notifyChanged(Notification notification) {
		if (getHost().isActive()) {
			handleNotificationEvent(notification);
		}
	}

	/**
	 * Handle a model-change event.
	 * 
	 * @param notification
	 *            The notification sent by the model.
	 */
	public void handleNotificationEvent(Notification notification) {
		// default implementation does nothing.
	}

	/**
	 * Add semantic listeners to the event broker.
	 * 
	 * @param broker
	 *            The broker to add listeners to.
	 */
	protected void addSemanticListeners(DiagramEventBroker broker) {
		// default implementation listens to all model changes
		broker.addNotificationListener(getSemanticElement(), this);
	}

	/**
	 * Remove semantic listeners to the event broker.
	 * 
	 * @param broker
	 *            The broker to remove listeners from.
	 */
	protected void removeSemanticListeners(DiagramEventBroker broker) {
		// default implementation listens to all model changes
		broker.removeNotificationListener(getSemanticElement(), this);
	}

}
