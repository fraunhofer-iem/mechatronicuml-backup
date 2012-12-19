package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;

import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortKind;
import de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;
import de.uni_paderborn.fujaba.muml.model.protocol.Role;

public class RoleBehavior extends AbstractPortBehavior {
	/**
	 * The model object. It will be set, while the EditPart is active (between
	 * calls to activate() and deactivate()).
	 */
	private Role role;

	public RoleBehavior(GraphicalEditPart editPart) {
		super(editPart);
	}

	@Override
	public void activate() {
		EObject element = editPart.getNotationView().getElement();
		if (element instanceof Role) {
			role = (Role) editPart.getNotationView().getElement();
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

	public Role getRole() {
		return role;
	}

	/**
	 * Called whenever the EditPart is going to be deactivated. Cleans up
	 * objects.
	 */
	@Override
	public void deactivate() {
		role = null;

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
	public PortKind getPortKind() {
		return CustomPortFigure.PortKind.DISCRETE;
	}

	@Override
	public CustomPortFigure.PortType getPortType() {
		CustomPortFigure.PortType type = CustomPortFigure.PortType.NONE;
		if (getRole() != null) {
			// Access the message interfaces...
			Role role = (Role) getRole();
			boolean receiverInterfaceSet = role.getReceiverMessageTypes().size() > 0;
			boolean senderInterfaceSet = role.getSenderMessageTypes().size() > 0;

			// Find out the PortType depending on the MessageInterfaces set.
			if (receiverInterfaceSet && senderInterfaceSet) {
				type = CustomPortFigure.PortType.INOUT_PORT;
			} else if (receiverInterfaceSet) {
				type = CustomPortFigure.PortType.IN_PORT;
			} else if (senderInterfaceSet) {
				type = CustomPortFigure.PortType.OUT_PORT;
			}
		}
		return type;
	}

	@Override
	public boolean isMulti() {
		boolean isMulti = false;
		if (role != null && role.getCardinality() != null) {
			NaturalNumber upperBound = role.getCardinality().getUpperBound();
			if (upperBound != null
					&& (upperBound.isInfinity() || upperBound.getValue() > 1)) {
				isMulti = true;
			}
		}
		return isMulti;
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		if (notification.getFeature() == ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY) {
			updateCardinality();
		} else if (notification.getFeature() == ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPES
				|| notification.getFeature() == ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__SENDER_MESSAGE_TYPES) {
			updatePortType();
		}
	}

	@Override
	public boolean isMandatory() {
		return true;
	}

}
