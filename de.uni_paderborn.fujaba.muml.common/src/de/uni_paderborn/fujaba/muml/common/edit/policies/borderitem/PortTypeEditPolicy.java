package de.uni_paderborn.fujaba.muml.common.edit.policies.borderitem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortKind;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortType;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind;
import de.uni_paderborn.fujaba.muml.model.component.DirectedTypedPort;
import de.uni_paderborn.fujaba.muml.model.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.model.valuetype.Range;

public class PortTypeEditPolicy extends PortBaseEditPolicy {

	@Override
	public void handleNotificationEvent(Notification notification) {
		if (notification.getFeature() == ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY) {
			updateCardinality();
		} else if (notification.getFeature() == ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPES
				|| notification.getFeature() == ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__SENDER_MESSAGE_TYPES
				|| notification.getFeature() == ComponentPackage.Literals.DIRECTED_TYPED_PORT__KIND) {
			updatePortType();
		}
	}

	protected void updatePortType() {
		EObject port = getSemanticElement();

		PortKind portKind = PortKind.CONTINUOUS;
		PortType portType = PortType.NONE;

		if (ComponentPackage.Literals.DISCRETE_PORT
				.isSuperTypeOf(port.eClass())) {
			portKind = PortKind.DISCRETE;
			portType = getDiscretePortType();
		} else if (ComponentPackage.Literals.CONTINUOUS_PORT.isSuperTypeOf(port
				.eClass())) {
			portKind = PortKind.CONTINUOUS;
			portType = getDirectedPortType();
		} else if (ComponentPackage.Literals.HYBRID_PORT.isSuperTypeOf(port
				.eClass())) {
			portKind = PortKind.HYBRID;
			portType = getDirectedPortType();
		}

		getPortFigure().setPortKindAndPortType(portKind, portType);
	}

	@Override
	protected void updateCardinality() {
		Port port = getPort();
		if (port != null
				&& ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT
						.isSuperTypeOf(port.eClass())) {
			Range cardinality = (Range) port
					.eGet(ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY);
			setCardinality(cardinality);
		}
	}

	protected PortType getDiscretePortType() {
		PortType type = CustomPortFigure.PortType.NONE;
		DiscretePort discretePort = (DiscretePort) getPort();
		if (discretePort != null) {
			// Find out the PortType depending on the MessageInterfaces set.
			if (discretePort.isIsDiscreteInOutPort()) {
				type = CustomPortFigure.PortType.INOUT_PORT;
			} else if (discretePort.isIsDiscreteInPort()) {
				type = CustomPortFigure.PortType.IN_PORT;
			} else if (discretePort.isIsDiscreteOutPort()) {
				type = CustomPortFigure.PortType.OUT_PORT;
			}
		}
		return type;
	}

	protected Port getPort() {
		return (Port) getSemanticElement();
	}

	protected PortType getDirectedPortType() {
		// Get port direction
		ContinuousPortDirectionKind direction = null;
		DirectedTypedPort directedPort = (DirectedTypedPort) getPort();
		if (directedPort != null) {
			direction = (ContinuousPortDirectionKind) directedPort.getKind();
		}

		// select port type based on port direction
		CustomPortFigure.PortType type;
		switch (direction) {
		case IN:
			type = CustomPortFigure.PortType.IN_PORT;
			break;
		case OUT:
			type = CustomPortFigure.PortType.OUT_PORT;
			break;
		default:
			type = CustomPortFigure.PortType.NONE;
			break;
		}
		return type;
	}

}
