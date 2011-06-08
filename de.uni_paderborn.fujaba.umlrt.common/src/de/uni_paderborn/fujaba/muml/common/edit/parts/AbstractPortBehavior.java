package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;

import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.model.component.PortKind;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;

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
	protected AbstractBorderItemEditPart editPart;

	/**
	 * The port's figure.
	 */
	private CustomPortFigure portFigure;

	/**
	 * The offset that the port lies within it's container.
	 */
	private static final Dimension offset = new Dimension(12, 12);

	/**
	 * The LayoutListener for layouting the port's container.
	 */
	private LayoutListener portContainerLayoutListener;

	/**
	 * Constructs this instance.
	 * 
	 * @param editPart
	 *            The port's EditPart.
	 * @param portFigure
	 *            The port's figure.
	 */
	public AbstractPortBehavior(AbstractBorderItemEditPart editPart) {
		this.editPart = editPart;
	}

	/**
	 * Handle model-change event. We update the PortFigure's visualization
	 * according to the current state of the model (Port).
	 * 
	 * @param notification
	 *            The notification sent by the model.
	 */
	public abstract void handleNotificationEvent(final Notification notification);

	/**
	 * Updates the PortFigure to visualize a multi-port, if necessary.
	 */
	public void updatePortCardinality(boolean isMultiPort) {
		if (portFigure != null) {
			portFigure.setPortMulti(isMultiPort);
		}
	}

	/**
	 * Updates the PortFigure to visualize a specific kind of port.
	 */
	public void updatePortKindAndPortType(PortKind portKind, MessageInterface sender, MessageInterface receiver) {
		if (portFigure != null) {
			CustomPortFigure.PortType portType;
			if (sender != null && receiver != null) {
				portType = CustomPortFigure.PortType.INOUT_PORT;
			} else if (receiver != null) {
				portType = CustomPortFigure.PortType.IN_PORT;
			} else if (sender != null) {
				portType = CustomPortFigure.PortType.OUT_PORT;
			} else {
				portType = CustomPortFigure.PortType.NONE;
			}

			portFigure.setPortKindAndPortType(portKind, portType);
		}
	}

	/**
	 * Adds a LayoutListener to the given port container figure. This listener
	 * will hook into layout changes (movements) and update the port's visual
	 * orientation according to the side it lies at.
	 * 
	 * @param portContainerFigure
	 *            The port's container figure.
	 */
	public void addPortContainerLayoutListener(IFigure portContainerFigure) {
		portContainerLayoutListener = new PortContainerLayoutListener(editPart,
				portFigure);
		portContainerFigure.addLayoutListener(portContainerLayoutListener);
	}

	/**
	 * Removes the LayoutListener from the given port container figure.
	 * 
	 * @param portContainerFigure
	 *            The port's container figure.
	 */
	public void removePortContainerLayoutListener(IFigure portContainerFigure) {
		if (portContainerLayoutListener != null) {
			portContainerFigure
					.removeLayoutListener(portContainerLayoutListener);
		}
	}

	/**
	 * Called whenever the EditPart is going to be activated. Initializes
	 * objects.
	 */
	public void activate() {
		IBorderItemLocator locator = editPart.getBorderItemLocator();
		if (locator instanceof BorderItemLocator) {
			((BorderItemLocator) locator).setBorderItemOffset(offset);
		}
		updatePortKindAndPortType();
		updatePortCardinality();
	}

	public abstract void updatePortCardinality();
	public abstract void updatePortKindAndPortType();

	/**
	 * Called whenever the EditPart is going to be deactivated. Cleans up
	 * objects.
	 */
	public void deactivate() {
	}

	public CustomPortFigure getPortFigure() {
		return portFigure;
	}

	public void setPortFigure(CustomPortFigure portFigure) {
		this.portFigure = portFigure;
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
				if (portFigure != null) {
					customPolygonPoints = portFigure
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

	/**
	 * A LayoutListener that listens to changes in the container's layout. After
	 * the ports are layouted, we check at which side they are, to rotate their
	 * polygon.
	 * 
	 * @author bingo
	 * 
	 */
	private class PortContainerLayoutListener extends LayoutListener.Stub {
		/**
		 * The port's EditPart.
		 */
		private AbstractBorderItemEditPart editPart;

		/**
		 * The port's figure that should be rotated.
		 */
		private CustomPortFigure portFigure;

		/**
		 * Constructs this LayoutListener.
		 * 
		 * @param editPart
		 *            The port's EditPart
		 * @param portFigure
		 *            The port's figure that should be rotated.
		 */
		public PortContainerLayoutListener(AbstractBorderItemEditPart editPart,
				CustomPortFigure portFigure) {
			this.editPart = editPart;
			this.portFigure = portFigure;
		}

		/**
		 * Rotate the port's figure according to the side that the port
		 * currently is at.
		 */
		@Override
		public void postLayout(IFigure container) {
			IBorderItemLocator borderItemLocator = editPart
					.getBorderItemLocator();
			if (borderItemLocator != null) {
				borderItemLocator.relocate(editPart.getFigure());
				int side = borderItemLocator.getCurrentSideOfParent();
				portFigure.setPortSide(side);
			}
		}
	}
}
