package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;

public abstract class AbstractPortTypeBehavior extends AbstractPortBehavior {

	/**
	 * The model object. It will be set, while the EditPart is active (between
	 * calls to activate() and deactivate()).
	 */
	private Port port;

	public AbstractPortTypeBehavior(GraphicalEditPart editPart) {
		super(editPart);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void activate() {
		EObject element = editPart.getNotationView().getElement();
		if (element instanceof Port) {
			port = (Port) editPart.getNotationView().getElement();
		}

		EditPart parentEditPart = editPart.getParent();
		IFigure figure = null;
		if (parentEditPart instanceof GraphicalEditPart) {
			figure = ((GraphicalEditPart) parentEditPart).getFigure();
		}
		if (figure instanceof BorderedNodeFigure) {
			BorderedNodeFigure bnf = (BorderedNodeFigure) figure;
			IFigure portContainerFigure = bnf.getBorderItemContainer();
			addLayoutListener(portContainerFigure);
		}

		super.activate();
	}

	public Port getPort() {
		return port;
	}

	/**
	 * Called whenever the EditPart is going to be deactivated. Cleans up
	 * objects.
	 */
	@Override
	public void deactivate() {
		port = null;

		EditPart parentEditPart = editPart.getParent();
		IFigure figure = null;
		if (parentEditPart instanceof GraphicalEditPart) {
			figure = ((GraphicalEditPart) parentEditPart).getFigure();
		}
		if (figure instanceof BorderedNodeFigure) {
			BorderedNodeFigure bnf = (BorderedNodeFigure) figure;
			IFigure portContainerFigure = bnf.getBorderItemContainer();
			removeLayoutListener(portContainerFigure);
		}

		super.deactivate();
	}

	@Override
	public boolean isMulti() {
		boolean isMulti = false;
		if (port != null && port.getCardinality() != null) {
			NaturalNumber upperBound = port.getCardinality().getUpperBound();
			if (upperBound != null
					&& (upperBound.isInfinity() || upperBound.getValue() > 1)) {
				isMulti = true;
			}
		}
		return isMulti;
	}
	
	@Override
	public boolean isMandatory() {
		boolean mandatory = false;
		if (port != null && port.getCardinality() != null) {
			NaturalNumber lowerBound = port.getCardinality().getLowerBound();
			if (lowerBound != null
					&& (lowerBound.isInfinity() || lowerBound.getValue() > 0)) {
				mandatory = true;
			}
		}
		return mandatory;
	}
	
	@Override
	public void handleNotificationEvent(Notification notification) {
		if (notification.getFeature() == ComponentPackage.Literals.PORT__CARDINALITY) {
			updateCardinality();
		}
	}

}
