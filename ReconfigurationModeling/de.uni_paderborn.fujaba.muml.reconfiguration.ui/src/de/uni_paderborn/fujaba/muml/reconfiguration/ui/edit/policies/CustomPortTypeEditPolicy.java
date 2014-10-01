package de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.policies;

import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;

import de.uni_paderborn.fujaba.muml.common.edit.policies.ports.PortTypeEditPolicy;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortKind;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortType;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.DirectedTypedPort;
import de.uni_paderborn.fujaba.muml.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.component.Port;
import de.uni_paderborn.fujaba.muml.component.PortDirectionKind;
import de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.InternalReconfigurationCommunicationPort;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.ProtocolinstantiationPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.BroadcastPortEditPart;
import de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart;
import de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart;
import de.uni_paderborn.fujaba.muml.valuetype.Cardinality;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;

public class CustomPortTypeEditPolicy extends PortTypeEditPolicy {

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
		// in case getPort() != getSemanticElement() because getPort() was
		// overridden
		addNotificationListener(getPort());
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
			} else if (ReconfigurationPackage.Literals.INTERNAL_RECONFIGURATION_COMMUNICATION_PORT
					.isSuperTypeOf(port.eClass())) {
				portKind = PortKind.DISCRETE;
				portType = getInternalReconfigurationCommunicationPortKind(((InternalReconfigurationCommunicationPort) port));
			} else if (ReconfigurationPackage.Literals.RECONFIGURATION_MESSAGE_PORT
					.isSuperTypeOf(port.eClass())) {
				org.eclipse.draw2d.Label label = new Label();
				label.setText("RM");
				EditPart editPart = getHost();
				if (editPart instanceof ReconfigurationMessagePortEditPart) {
					((ReconfigurationMessagePortEditPart) editPart)
							.getPrimaryShape().add(label);
				} else if (editPart instanceof PortPartEditPart) {
					((PortPartEditPart) editPart)
							.getPrimaryShape().add(label);
				}
		
			} else if (ReconfigurationPackage.Literals.RECONFIGURATION_EXECUTION_PORT
					.isSuperTypeOf(port.eClass())) {
				org.eclipse.draw2d.Label label = new Label();
				label.setText("RE");
				EditPart editPart = getHost();
				if (editPart instanceof ReconfigurationExecutionPortEditPart) {
					((ReconfigurationExecutionPortEditPart) editPart)
							.getPrimaryShape().add(label);
				} else if (editPart instanceof PortPartEditPart) {
					((PortPartEditPart) editPart).getPrimaryShape().add(label);
				}

			}
			else if (ProtocolinstantiationPackage.Literals.BROADCAST_PORT
					.isSuperTypeOf(port.eClass())) {
				org.eclipse.draw2d.Label label = new Label();
				label.setText("B");
				EditPart editPart = getHost();
				if (editPart instanceof BroadcastPortEditPart) {
					((BroadcastPortEditPart) editPart)
							.getPrimaryShape().add(label);
				} else if (editPart instanceof PortPartEditPart) {
					((PortPartEditPart) editPart).getPrimaryShape().add(label);
				}

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
