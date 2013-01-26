package de.uni_paderborn.fujaba.muml.common.edit.policies.tether;

import org.eclipse.draw2d.IFigure;
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

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;

public class DiscretePortAssignedRoleTetherBorderItemEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.common.edit.policies.tether.TetherConnectionEditPolicy
		implements NotificationListener {

	@Override
	public void activate() {
		super.activate();
		
		getHost().getViewer().getVisualPartMap().put(getConnection(), getHost());

		// Set initial tether visibility
		boolean tetherVisible = getSemanticElement().eGet(
				ComponentPackage.Literals.DISCRETE_PORT__REFINES) != null;
		getConnection().setVisible(tetherVisible);
		
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
		if (notification.getFeature() == ComponentPackage.Literals.DISCRETE_PORT__REFINES) {
			getConnection().setVisible(notification.getNewValue() != null);
		}
	}

	/**
	 * Adapted the start position so that the connection points next to the
	 * label and is a little bit longer, as required for our concrete syntax for Ports.
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
		startPos.translate(startPos.getDifference(endRef).getScaled(0.5));

		return startPos;
	}

	@Override
	public void refresh() {
		super.refresh();
		
		// Underline
		((WrappingLabel) getHostFigure()).setTextUnderline(true);
	}
	
	

}
