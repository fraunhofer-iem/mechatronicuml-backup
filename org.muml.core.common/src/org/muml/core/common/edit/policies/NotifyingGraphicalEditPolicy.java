package org.muml.core.common.edit.policies;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.editpolicies.GraphicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This class provides convenience methods for graphical edit policies that need
 * notification.
 * 
 * @author bingo
 * 
 */
public abstract class NotifyingGraphicalEditPolicy extends GraphicalEditPolicy
		implements NotificationListener {
	
	protected List<EObject> listeningElements = new ArrayList<EObject>(); 

	/**
	 * Activated this edit policy, does initializing work.
	 */
	@Override
	public void activate() {
		super.activate();

		// add semantic listeners
		DiagramEventBroker diagramEventBroker = getDiagramEventBroker();
		if (diagramEventBroker != null) {
			addListeners();
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
			removeListeners();
		}
		super.deactivate();
	}

	/**
	 * Gets the diagram event broker from the editing domain.
	 * 
	 * @return the diagram event broker
	 */
	private DiagramEventBroker getDiagramEventBroker() {
		TransactionalEditingDomain theEditingDomain = getEditingDomain();
		if (theEditingDomain != null) {
			return DiagramEventBroker.getInstance(theEditingDomain);
		}
		return null;
	}
	
	/**
	 * Unregisters and re-registers listeners.
	 */
	protected void updateListeners() {
		removeListeners();
		addListeners();
	}

	/**
	 * Convenience method to get the edit part's editing domain.
	 * 
	 * @return The host edit part's editing domain.
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Convenience method to get the semantic element from the edit part.
	 * 
	 * @return The semantic element.
	 */
	protected EObject getSemanticElement() {
		EObject element = (EObject) getHost().getAdapter(EObject.class);
		if (element instanceof View) { // should not be necessary, but just in case (prevented an exception, already).
			element = ((View) element).getElement();
		}
		return element;
	}
	
	/**
	 * Convenience method to return the host's notation view.
	 * 
	 * @return notation view.
	 */
	protected View getNotationView() {
		if (getHost().getModel() instanceof View) {
			return (View) getHost().getModel();
		}
		return null;
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
	 * Add listeners to the event broker.
	 */
	protected void addListeners() {
		// default implementation listens to all model and notation view changes
		addNotificationListener(getSemanticElement());
		addNotificationListener(getNotationView());
	}

	/**
	 * Remove listeners to the event broker.
	 */
	protected final void removeListeners() {
		for (EObject element : new ArrayList<EObject>(listeningElements)) {
			removeNotificationListener(element);
		}
	}

	protected void addNotificationListener(EObject element) {
		listeningElements.add(element);
		getDiagramEventBroker().addNotificationListener(element, this);
	}

	protected void removeNotificationListener(EObject element) {
		getDiagramEventBroker().addNotificationListener(element, this);
		listeningElements.remove(element);
	}

}
