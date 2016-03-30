package de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.policies;

import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.muml.pim.common.edit.policies.ports.PortTypeEditPolicy;
import org.muml.pim.common.figures.CustomPortFigure.PortKind;
import org.muml.pim.common.figures.CustomPortFigure.PortType;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.diagram.edit.parts.PortPartEditPart;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.valuetype.ValuetypePackage;

import de.uni_paderborn.fujaba.muml.reconfiguration.InternalReconfigurationCommunicationPort;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.ProtocolinstantiationPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.BroadcastPortEditPart;
import de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart;
import de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart;

public class CustomPortTypeEditPolicy extends PortTypeEditPolicy {

	protected org.eclipse.draw2d.Label label = new Label();

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

		if (feature == ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY
				|| containingClass == ValuetypePackage.Literals.CARDINALITY
				|| feature == ComponentPackage.Literals.DIRECTED_TYPED_PORT__OPTIONAL) {
			refreshArrow();

		} else if (notification.getFeature() == ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPES
				|| notification.getFeature() == ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__SENDER_MESSAGE_TYPES
				|| notification.getFeature() == ComponentPackage.Literals.DIRECTED_TYPED_PORT__KIND
				|| notification.getFeature() == ComponentPackage.Literals.PORT_PART__PORT_TYPE) {
			refreshPortType();
		}
		super.handleNotificationEvent(notification);
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		// in case getPort() != getSemanticElement() because getPort() was
		// overridden
		addNotificationListener(getPort());
	}

	//XXX clean up
	protected void refreshPortType() {
		EObject port = getPort();

		PortKind portKind = PortKind.DISCRETE;
		PortType portType = PortType.NONE;

		if (getPortFigure().getChildren().contains(label))
			getPortFigure().remove(label);

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
			} else if (ReconfigurationPackage.Literals.INTERNAL_RECONFIGURATION_COMMUNICATION_PORT
					.isSuperTypeOf(port.eClass())) {
				portKind = PortKind.DISCRETE;
				portType = getInternalReconfigurationCommunicationPortKind(((InternalReconfigurationCommunicationPort) port));
			} else if (ReconfigurationPackage.Literals.RECONFIGURATION_MESSAGE_PORT
					.isSuperTypeOf(port.eClass())) {
				label.setText("RM");
				EditPart editPart = getHost();
				if (editPart instanceof ReconfigurationMessagePortEditPart) {
					((ReconfigurationMessagePortEditPart) editPart)
							.getPrimaryShape().add(label);
				} else if (editPart instanceof PortPartEditPart) {
					((PortPartEditPart) editPart).getPrimaryShape().add(label);
				}

			} else if (ReconfigurationPackage.Literals.RECONFIGURATION_EXECUTION_PORT
					.isSuperTypeOf(port.eClass())) {
				label.setText("RE");
				EditPart editPart = getHost();
				if (editPart instanceof ReconfigurationExecutionPortEditPart) {
					((ReconfigurationExecutionPortEditPart) editPart)
							.getPrimaryShape().add(label);
				} else if (editPart instanceof PortPartEditPart) {
					((PortPartEditPart) editPart).getPrimaryShape().add(label);
				}

			} else if (ProtocolinstantiationPackage.Literals.BROADCAST_PORT
					.isSuperTypeOf(port.eClass())) {
				label.setText("B");
				getPortFigure().add(label);

			}
		}

		getPortFigure().setPortKindAndPortType(portKind, portType);
	}

	private PortType getInternalReconfigurationCommunicationPortKind(
			InternalReconfigurationCommunicationPort port) {
		if (!port.getSenderMessageTypes().isEmpty()
				&& !port.getReceiverMessageTypes().isEmpty())
			return PortType.INOUT_PORT;
		else if (!port.getSenderMessageTypes().isEmpty())
			return PortType.OUT_PORT;
		else if (!port.getReceiverMessageTypes().isEmpty())
			return PortType.IN_PORT;
		else
			return PortType.NONE;
	}

}
