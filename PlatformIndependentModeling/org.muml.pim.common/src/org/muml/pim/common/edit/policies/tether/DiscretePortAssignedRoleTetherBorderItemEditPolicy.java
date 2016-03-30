package org.muml.pim.common.edit.policies.tether;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.component.ComponentPackage;

public class DiscretePortAssignedRoleTetherBorderItemEditPolicy
		extends
		org.muml.core.common.edit.policies.tether.TetherConnectionEditPolicy
		implements NotificationListener {
	
	public static int CONNECTION_LENGTH = 60; // 60px

	@SuppressWarnings("unchecked")
	@Override
	public void activate() {
		super.activate();
		
		// Fix: Moving the refinement connection of DiscretePort that points to the refinement label, should not move the port, but the label.
		getHost().getViewer().getVisualPartMap().put(getConnection(), getHost());

		// Set initial tether visibility
		EObject semanticElement = getSemanticElement();
		if (semanticElement != null) {
			boolean tetherVisible = semanticElement.eGet(
					ComponentPackage.Literals.DISCRETE_PORT__REFINED_ROLE) != null;
			getConnection().setVisible(tetherVisible);
			
			// Add notification listener
			DiagramEventBroker diagramEventBroker = getDiagramEventBroker();
			if (diagramEventBroker != null) {
				diagramEventBroker.addNotificationListener(semanticElement,
						ComponentPackage.Literals.DISCRETE_PORT__REFINED_ROLE, this);
			}
		}
	}

	@Override
	public void deactivate() {
		DiagramEventBroker diagramEventBroker = getDiagramEventBroker();
		if (diagramEventBroker != null) {
			diagramEventBroker.removeNotificationListener(getSemanticElement(),
					ComponentPackage.Literals.DISCRETE_PORT__REFINED_ROLE, this);
		}
		
		// Fix: Moving the refinement connection of DiscretePort that points to the refinement label, should not move the port, but the label.
		getHost().getViewer().getVisualPartMap().remove(getConnection());

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
		if (notification.getFeature() == ComponentPackage.Literals.DISCRETE_PORT__REFINED_ROLE) {
			getConnection().setVisible(notification.getNewValue() != null);
		}
	}

	/**
	 * Adapted the start position so that the connection points next to the
	 * label and has the length CONNETION_LENGTH.
	 */
	protected Point getNewStartPoint() {
		Point startRef = getStartRefPoint();
		Point endRef = getEndRefPoint();

		IFigure figure = ((GraphicalEditPart) getHost()).getFigure();
		Rectangle r = figure.getBounds().getCopy();

		Point startPos = r.getTopLeft();
		if (startRef.y < endRef.y) {
			startPos.y += r.height;
		}
		if (startRef.x > endRef.x) {
			startPos.x += r.width;
		}
		
		Dimension diff = startPos.getDifference(endRef);
		double length = Math.sqrt(diff.width*diff.width + diff.height*diff.height);
		return endRef.translate(diff.getScaled(CONNECTION_LENGTH / length));
	}

	@Override
	public void refresh() {
		super.refresh();
		
		// Underline
		((WrappingLabel) getHostFigure()).setTextUnderline(true);
	}
	
}
