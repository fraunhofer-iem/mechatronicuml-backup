package de.uni_paderborn.fujaba.muml.common.edit.policies.borderitem;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.GraphicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;

import de.uni_paderborn.fujaba.muml.common.edit.policies.borderitem.layout.DefaultLayoutListener;

/**
 * This class contains all the behavior for border items.
 * 
 * @author bingo
 * 
 */
public class BorderItemEditPolicy extends GraphicalEditPolicy implements
		NotificationListener {
	/**
	 * Edit policy role for registering this edit policy or a subclass.
	 */
	public static final String BORDER_ITEM_ROLE = "BorderItemRole"; //$NON-NLS-1$

	/**
	 * The offset that the port lies within it's container.
	 */
	public static final Dimension DEFAULT_OFFSET = new Dimension(12, 12);

	/**
	 * The LayoutListener for layouting the port's container.
	 */
	private LayoutListener containerLayoutListener;

	@Override
	public void activate() {
		super.activate();
		addLayoutListener(getContainerFigure());
		updateBorderItemLocator();

		// Add notification listener
		DiagramEventBroker diagramEventBroker = getDiagramEventBroker();
		if (diagramEventBroker != null) {
			diagramEventBroker.addNotificationListener(getSemanticElement(),
					this);
		}
	}

	@Override
	public void deactivate() {
		DiagramEventBroker diagramEventBroker = getDiagramEventBroker();
		if (diagramEventBroker != null) {
			diagramEventBroker.removeNotificationListener(getSemanticElement(),
					this);
		}

		removeLayoutListener(getContainerFigure());
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
	
	public IFigure getContentPane() {
		return ((AbstractGraphicalEditPart) getHost()).getContentPane();
	}

	public void updateBorderItemLocator() {
		if (getHost() instanceof AbstractBorderItemEditPart) {
			IBorderItemLocator locator = ((AbstractBorderItemEditPart) getHost())
					.getBorderItemLocator();
			if (locator instanceof BorderItemLocator) {
				((BorderItemLocator) locator)
						.setBorderItemOffset(DEFAULT_OFFSET);
			}
		}
	}

	/**
	 * Adds a LayoutListener to the given figure. This listener will hook into
	 * layout changes (movements) and update the port's visual orientation
	 * according to the side it lies at.
	 * 
	 * @param figure
	 *            The figure.
	 */
	public void addLayoutListener(IFigure figure) {
		figure.removeLayoutListener(getContainerLayoutListener());
		figure.addLayoutListener(getContainerLayoutListener());
	}

	/**
	 * Removes the LayoutListener from the given figure.
	 * 
	 * @param figure
	 *            The container figure.
	 */
	public void removeLayoutListener(IFigure figure) {
		if (containerLayoutListener != null) {
			figure.removeLayoutListener(containerLayoutListener);
		}
	}

	/**
	 * Gets and lazily creates the container layout listener.
	 * 
	 * @return The container layout listener.
	 */
	public LayoutListener getContainerLayoutListener() {
		if (containerLayoutListener == null) {
			containerLayoutListener = createContainerLayoutListener();
		}
		return containerLayoutListener;
	}

	protected LayoutListener createContainerLayoutListener() {
		return new DefaultLayoutListener((AbstractBorderItemEditPart) getHost());
	}

	/**
	 * Convenience method
	 */
	protected IFigure getContainerFigure() {
		GraphicalEditPart parentEditPart = (GraphicalEditPart) getHost()
				.getParent();
		if (parentEditPart.getFigure() instanceof BorderedNodeFigure) {
			BorderedNodeFigure bnf = (BorderedNodeFigure) parentEditPart
					.getFigure();
			return bnf.getBorderItemContainer();
		}
		return null;
	}

	/**
	 * Convenience method
	 */
	protected EObject getSemanticElement() {
		return ((GraphicalEditPart) getHost()).getNotationView().getElement();
	}

	/**
	 * Convenience method
	 */
	protected AbstractBorderItemEditPart getBorderItemEditPart() {
		return (AbstractBorderItemEditPart) getHost();
	}

	@Override
	public void notifyChanged(Notification notification) {
		if (getHost().isActive()) {
			handleNotificationEvent(notification);
		}
	}

	/**
	 * Handle model-change event. We update the PortFigure's visualization
	 * according to the current state of the model.
	 * 
	 * @param notification
	 *            The notification sent by the model.
	 */
	public void handleNotificationEvent(final Notification notification) {
		// default implementation does nothing
	}

}
