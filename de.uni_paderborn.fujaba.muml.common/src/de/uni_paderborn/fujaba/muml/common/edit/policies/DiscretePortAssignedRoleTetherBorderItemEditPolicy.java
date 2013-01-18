package de.uni_paderborn.fujaba.muml.common.edit.policies;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;

public class DiscretePortAssignedRoleTetherBorderItemEditPolicy extends
		TetherBorderItemEditPolicy implements NotificationListener {

	@Override
	public void activate() {
		// Update Tether Visibility before super call
		boolean tetherVisible = getSemanticElement().eGet(
				ComponentPackage.Literals.DISCRETE_PORT__REFINES) != null;
		setTetherShown(tetherVisible);

		// Super call
		super.activate();
		
		// Add notification listener
		DiagramEventBroker diagramEventBroker = getDiagramEventBroker();
		if (diagramEventBroker != null) {
			diagramEventBroker.addNotificationListener(getSemanticElement(),
					ComponentPackage.Literals.DISCRETE_PORT__REFINES, this);
		}
	}

	@Override
	public void deactivate() {
		DiagramEventBroker diagramEventBroker = getDiagramEventBroker();
		if (diagramEventBroker != null) {
			diagramEventBroker.removeNotificationListener(getSemanticElement(),
					ComponentPackage.Literals.DISCRETE_PORT__REFINES, this);
		}
		
		super.deactivate();
	}

	private EObject getSemanticElement() {
		return getNotationView().getElement();
	}

	private View getNotationView() {
		return ((GraphicalEditPart) getHost()).getNotationView();
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

	@Override
	public void notifyChanged(Notification notification) {
		if (notification.getFeature() == ComponentPackage.Literals.DISCRETE_PORT__REFINES) {
			setTetherShown(notification.getNewValue() != null);
		}
	}

}
