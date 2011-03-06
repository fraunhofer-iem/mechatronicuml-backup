package de.uni_paderborn.fujaba.umlrt.common.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;

import de.uni_paderborn.fujaba.umlrt.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.umlrt.model.component.Port;
import de.uni_paderborn.fujaba.umlrt.model.component.impl.PortImpl;
import de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber;

/**
 * This class contains all the behavior for port edit parts.
 * 
 * @author bingo
 * 
 */
public class PortBehaviour {
	/**
	 * The port's EditPart.
	 */
	private AbstractBorderItemEditPart editPart;

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
	 * The model object. It will be set, while the EditPart is active (between
	 * calls to activate() and deactivate()).
	 */
	private Port port;

	/**
	 * Constructs this instance.
	 * 
	 * @param editPart
	 *            The port's EditPart.
	 * @param portFigure
	 *            The port's figure.
	 */
	public PortBehaviour(AbstractBorderItemEditPart editPart,
			CustomPortFigure portFigure) {
		this.editPart = editPart;
		this.portFigure = portFigure;
	}

	/**
	 * Handle model-change event. We update the PortFigure's visualization
	 * according to the current state of the model (Port).
	 * 
	 * @param notification
	 *            The notification sent by the model.
	 */
	public final void handleNotificationEvent(final Notification notification) {
		Object feature = notification.getFeature();
		if (feature instanceof EReference) {
			EReference reference = (EReference) feature;
			if (reference.getContainerClass() == Port.class) {
				int featureID = notification.getFeatureID(PortImpl.class);
				if (featureID == ComponentPackage.PORT__PROVIDED
						|| featureID == ComponentPackage.PORT__REQUIRED) {
					updatePortType();
				} else if (featureID == ComponentPackage.PORT__CARDINALITY) {
					updatePortCardinality();
				}
			}
		}
	}

	/**
	 * Updates the PortFigure to visualize a multi-port, if necessary.
	 */
	public void updatePortCardinality() {
		boolean isMulti = false;
		if (port != null && port.getCardinality() != null) {
			NaturalNumber upperBound = port.getCardinality().getUpperBound();
			if (upperBound != null
					&& (upperBound.isInfinity() || upperBound.getValue() > 1)) {
				isMulti = true;
			}
		}
		portFigure.setPortMulti(isMulti);
	}

	/**
	 * Updates the PortFigure to visualize a generic port, an InPort, OutPort or
	 * InOutPort, according to the current model state.
	 */
	public void updatePortType() {
		if (port != null) {
			CustomPortFigure.PortType portType;
			if (port.getRequired() != null && port.getProvided() != null) {
				portType = CustomPortFigure.PortType.INOUT_PORT;
			} else if (port.getRequired() != null) {
				portType = CustomPortFigure.PortType.IN_PORT;
			} else if (port.getProvided() != null) {
				portType = CustomPortFigure.PortType.OUT_PORT;
			} else {
				portType = CustomPortFigure.PortType.NONE;
			}

			portFigure.setPortType(portType);
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
		EObject element = editPart.getNotationView().getElement();
		if (element instanceof Port) {
			port = (Port) editPart.getNotationView().getElement();
		}

		IBorderItemLocator locator = editPart.getBorderItemLocator();
		if (locator instanceof BorderItemLocator) {
			((BorderItemLocator) locator).setBorderItemOffset(offset);
		}

		updatePortType();
		updatePortCardinality();
	}

	/**
	 * Called whenever the EditPart is going to be deactivated. Cleans up
	 * objects.
	 */
	public void deactivate() {
		port = null;
	}

	
	/**
	 * A LayoutListener that listens to changes in the container's layout. After the
	 * ports are layouted, we check at which side they are, to rotate their polygon.
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
		 * Rotate the port's figure according to the side that the port currently is at.
		 */
		@Override
		public void postLayout(IFigure container) {
			IBorderItemLocator borderItemLocator = editPart.getBorderItemLocator();
			if (borderItemLocator != null) {
				borderItemLocator.relocate(editPart.getFigure());
				int side = borderItemLocator.getCurrentSideOfParent();
				portFigure.setPortSide(side);
			}
		}
	}


}
