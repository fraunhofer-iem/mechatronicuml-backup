package de.uni_paderborn.fujaba.muml.common.edit.policies.ports;

import org.eclipse.emf.common.notify.Notification;

import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.model.protocol.Role;
import de.uni_paderborn.fujaba.muml.model.valuetype.NaturalNumber;

public class RoleEditPolicy extends PortBaseEditPolicy {

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
	protected void updatePortType() {
		CustomPortFigure.PortType type = CustomPortFigure.PortType.NONE;
		Role role = (Role) getRole();
		if (role != null) {
			// Access the message interfaces...
			boolean receiverInterfaceSet = role.getReceiverMessageTypes()
					.size() > 0;
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

		getPortFigure().setPortKindAndPortType(
				CustomPortFigure.PortKind.DISCRETE, type);
	}
	
	@Override
	protected void updateCardinality() {
		boolean isMulti = false;
		Role role = getRole();
		if (role != null && role.getCardinality() != null) {
			NaturalNumber upperBound = role.getCardinality().getUpperBound();
			if (upperBound != null
					&& (upperBound.isInfinity() || upperBound.getValue() > 1)) {
				isMulti = true;
			}
		}
		getPortFigure().setMulti(isMulti);
		getPortFigure().setMandatory(true);
	}

	protected Role getRole() {
		return (Role) getSemanticElement();
	}

}
