package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;

import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;

/**
 * This class contains all the behavior for port edit parts.
 * 
 * @author bingo
 * 
 */
public abstract class AbstractPortBehavior {
	/**
	 * The port's EditPart.
	 */
	protected GraphicalEditPart editPart;

	/**
	 * The port's figure.
	 */
	private CustomPortFigure figure;

	/**
	 * The offset that the port lies within it's container.
	 */
	protected static final Dimension DEFAULT_OFFSET = new Dimension(12, 12);

	/**
	 * The LayoutListener for layouting the port's container.
	 */
	private LayoutListener containerLayoutListener;

	/**
	 * Constructs this instance.
	 * 
	 * @param editPart
	 *            The port's EditPart.
	 */
	public AbstractPortBehavior(GraphicalEditPart editPart) {
		this.editPart = editPart;
	}

	/**
	 * Handle model-change event. We update the PortFigure's visualization
	 * according to the current state of the model (Port).
	 * 
	 * @param notification
	 *            The notification sent by the model.
	 */
	public void handleNotificationEvent(final Notification notification) {
		// default implementation does nothing
	}

	public abstract CustomPortFigure.PortKind getPortKind();

	public abstract CustomPortFigure.PortType getPortType();

	public abstract boolean isMulti();

	public abstract boolean isMandatory();

	/**
	 * Updates the PortFigure to visualize a multi-port, if necessary.
	 */
	public void updateCardinality() {
		if (figure != null) {
			figure.setMulti(isMulti());
			figure.setMandatory(isMandatory());
		}
	}

	/**
	 * Updates the PortFigure to visualize a specific kind of port.
	 */
	public void updatePortType() {
		if (figure != null) {
			figure.setPortKindAndPortType(getPortKind(), getPortType());
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

	/**
	 * Creates the container layout listener.
	 * 
	 * @return the container layout listener.
	 */
	public LayoutListener createContainerLayoutListener() {

		/**
		 * A LayoutListener that listens to changes in the container's layout.
		 * After the ports are layouted, we check at which side they are, to
		 * rotate their polygon.
		 * 
		 */
		return new LayoutListener.Stub() {

			/**
			 * Rotate the port's figure according to the side that the port
			 * currently is at.
			 */
			@Override
			public void postLayout(IFigure container) {
				IBorderItemLocator borderItemLocator = ((AbstractBorderItemEditPart) editPart)
						.getBorderItemLocator();
				if (borderItemLocator != null) {
					borderItemLocator.relocate(editPart.getFigure());
					int side = borderItemLocator.getCurrentSideOfParent();
					figure.setPortSide(side);
				}
			}
		};
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
		// if (editPart instanceof AbstractBorderItemEditPart) {
		figure.removeLayoutListener(getContainerLayoutListener());
		figure.addLayoutListener(getContainerLayoutListener());
		// }
	}

	/**
	 * Removes the LayoutListener from the given figure.
	 * 
	 * @param containerFigure
	 *            The port's container figure.
	 */
	public void removeContainerLayoutListener(IFigure containerFigure) {
		if (containerLayoutListener != null) {
			containerFigure.removeLayoutListener(containerLayoutListener);
		}
	}

	/**
	 * Called whenever the EditPart is going to be activated. Initializes
	 * objects.
	 */
	public void activate() {
		updateBorderItemLocator();
		updatePortType();
		updateCardinality();
	}

	protected void updateBorderItemLocator() {
		if (editPart instanceof AbstractBorderItemEditPart) {
			IBorderItemLocator locator = ((AbstractBorderItemEditPart) editPart)
					.getBorderItemLocator();
			if (locator instanceof BorderItemLocator) {
				((BorderItemLocator) locator).setBorderItemOffset(DEFAULT_OFFSET);
			}
		}
	}

	/**
	 * Called whenever the EditPart is going to be deactivated. Cleans up
	 * objects.
	 */
	public void deactivate() {
	}

	public CustomPortFigure getPortFigure() {
		return figure;
	}

	public void setFigure(CustomPortFigure figure) {
		this.figure = figure;
	}

	/**
	 * The Port's Node Plate to use. It defines the size to use and is
	 * responsible to return custom PolygonPoints, that help connecting
	 * Connections at the right Point.
	 * 
	 * @return The Port's Node Plate to use.
	 */
	public NodeFigure createNodePlate() {
		// Copied from generated PortEditPart.java.
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(24, 24) {
			public PointList getPolygonPoints() {
				PointList customPolygonPoints = null;
				if (figure != null) {
					customPolygonPoints = figure
							.getCustomPolygonPoints(getHandleBounds());
				}
				if (customPolygonPoints != null) {
					return customPolygonPoints;
				}
				return super.getPolygonPoints();
			}
		};

		// FIXME: workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());
		return result;
	}

}
