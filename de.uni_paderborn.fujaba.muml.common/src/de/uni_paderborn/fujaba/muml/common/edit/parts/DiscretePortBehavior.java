package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;

import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortKind;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;

public class DiscretePortBehavior extends AbstractPortTypeBehavior {

	public DiscretePortBehavior(GraphicalEditPart editPart) {
		super(editPart);
	}
	
	@Override
	public PortKind getPortKind() {
		return CustomPortFigure.PortKind.DISCRETE;
	}

	@Override
	public CustomPortFigure.PortType getPortType() {
		CustomPortFigure.PortType type = CustomPortFigure.PortType.NONE;
		if (getPort() != null) {
			// Access the message interfaces...
			DiscretePort discretePort = (DiscretePort) getPort();
			MessageInterface receiverInterface = discretePort
					.getReceiverMessageInterface();
			MessageInterface senderInterface = discretePort
					.getSenderMessageInterface();

			// Find out the PortType depending on the MessageInterfaces set.
			if (receiverInterface != null && senderInterface != null) {
				type = CustomPortFigure.PortType.INOUT_PORT;
			} else if (receiverInterface != null) {
				type = CustomPortFigure.PortType.IN_PORT;
			} else if (senderInterface != null) {
				type = CustomPortFigure.PortType.OUT_PORT;
			}
		}
		return type;
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (feature instanceof EStructuralFeature) {
			EStructuralFeature structuralFeature = (EStructuralFeature) feature;
			if (structuralFeature.getContainerClass() == DiscretePort.class) {
				int featureID = notification.getFeatureID(DiscretePort.class);
				if (featureID == ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_INTERFACE
						|| featureID == ComponentPackage.DISCRETE_PORT__SENDER_MESSAGE_INTERFACE) {
					updatePortType();
				}
			}
		}
		super.handleNotificationEvent(notification);
	}
}
