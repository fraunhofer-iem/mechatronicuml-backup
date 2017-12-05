package org.muml.pim.common.edit.policies.ports;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.muml.pim.common.figures.CustomPortFigure;
import org.muml.pim.common.figures.CustomPortFigure.PortKind;
import org.muml.pim.common.figures.CustomPortFigure.PortType;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.DirectedTypedPort;
import org.muml.pim.component.DiscretePort;
import org.muml.pim.component.Port;
import org.muml.pim.component.PortDirectionKind;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.valuetype.Cardinality;
import org.muml.pim.valuetype.ValuetypePackage;

public class PortTypeEditPolicy extends PortBaseEditPolicy {

	@Override
	public void handleNotificationEvent(Notification notification) {
		EStructuralFeature feature = null;
		EClass containingClass = null;
		if (notification.getFeature() instanceof EStructuralFeature) {
			feature = (EStructuralFeature) notification.getFeature();
		}
		if (feature != null) {
			containingClass = feature.getEContainingClass();
		}
		
		if (feature == ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY || containingClass == ValuetypePackage.Literals.NATURAL_NUMBER || containingClass == ValuetypePackage.Literals.CARDINALITY || feature == ComponentPackage.Literals.DIRECTED_TYPED_PORT__OPTIONAL) {
			refreshArrow();
			updateListeners();
			// } else if (notification.getFeature() == C){
		} else if (notification.getFeature() == ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPES
				|| notification.getFeature() == ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__SENDER_MESSAGE_TYPES
				|| notification.getFeature() == ComponentPackage.Literals.DIRECTED_TYPED_PORT__KIND) {
			refreshPortType();
		}
		super.handleNotificationEvent(notification);
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		Port port = getPort();
		if (port instanceof DiscretePort && ((DiscretePort) port).getCardinality() != null) {
			Cardinality cardinality = ((DiscretePort) port).getCardinality();
			addNotificationListener(cardinality);
			if (cardinality.getLowerBound() != null) {
				addNotificationListener(cardinality.getLowerBound());
			}
			if (cardinality.getUpperBound() != null) {
				addNotificationListener(cardinality.getUpperBound());
			}
		}
		// in case getPort() != getSemanticElement() because getPort() was
		// overridden
		addNotificationListener(port);
	}

	protected void refreshPortType() {
		EObject port = getPort();

		PortKind portKind = PortKind.DISCRETE;
		PortType portType = PortType.NONE;

		if (port != null) {
			if (ComponentPackage.Literals.DISCRETE_PORT.isSuperTypeOf(port
					.eClass())) {
				portKind = PortKind.DISCRETE;
				portType = getDiscretePortType();
			} else if (ComponentPackage.Literals.CONTINUOUS_PORT
					.isSuperTypeOf(port.eClass())) {
				portKind = PortKind.CONTINUOUS;
				portType = getDirectedPortType();
			} else if (ComponentPackage.Literals.HYBRID_PORT.isSuperTypeOf(port
					.eClass())) {
				portKind = PortKind.HYBRID;
				portType = getDirectedPortType();
			}
		}

		CustomPortFigure figure = getPortFigure();
		if (figure != null) {
			figure.setPortKindAndPortType(portKind, portType);
		}
	}
	
	protected boolean isOptional() {
		EObject port = getPort();
		if (port != null && ComponentPackage.Literals.DIRECTED_TYPED_PORT.isSuperTypeOf(port.eClass())) {
			return (Boolean) port.eGet(ComponentPackage.Literals.DIRECTED_TYPED_PORT__OPTIONAL);
		}
		return super.isOptional();
	}

	
	@Override
	protected Cardinality getCardinality() {
		Port port = getPort();
		if (port != null
				&& ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT
						.isSuperTypeOf(port.eClass())) {
			Cardinality cardinality = (Cardinality) port
					.eGet(ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY);
			return cardinality;
		}
		return super.getCardinality();
	}

	protected PortType getDiscretePortType() {
		PortType type = CustomPortFigure.PortType.NONE;
		DiscretePort discretePort = (DiscretePort) getPort();
		if (discretePort != null) {
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
		PortDirectionKind direction = null;
		DirectedTypedPort directedPort = (DirectedTypedPort) getPort();
		if (directedPort != null) {
			direction = (PortDirectionKind) directedPort.getKind();
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
