package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;

import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortKind;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortType;
import de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.impl.PortInstanceImpl;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;

public class DiscretePortInstanceBehavior extends AbstractPortInstanceBehavior {

	public DiscretePortInstanceBehavior(GraphicalEditPart editPart) {
		super(editPart);
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		Object featureObject = notification.getFeature();
		if (featureObject instanceof EStructuralFeature) {
			EStructuralFeature feature = (EStructuralFeature) featureObject;
			if (InstancePackage.Literals.DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_INTERFACE
					.equals(feature)
					|| InstancePackage.Literals.DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_INTERFACE
							.equals(feature)) {
				updatePortType();
			}
		}
	}

	@Override
	public PortKind getPortKind() {
		return CustomPortFigure.PortKind.DISCRETE;
	}

	@Override
	public PortType getPortType() {
		MessageInterface receiverMessageInterface = null;
		MessageInterface senderMessageInterface = null;
		
		PortInstance portInstance = getPortInstance();
		
		if (portInstance != null
				&& portInstance instanceof DiscretePortInstance) {

			receiverMessageInterface = ((DiscretePortInstance) portInstance)
					.getReceiverMessageInterface();
			senderMessageInterface = ((DiscretePortInstance) portInstance)
					.getSenderMessageInterface();
		}
		CustomPortFigure.PortType type = CustomPortFigure.PortType.NONE;
		if (receiverMessageInterface != null && senderMessageInterface != null) {
			type = CustomPortFigure.PortType.INOUT_PORT;
		} else if (receiverMessageInterface != null) {
			type = CustomPortFigure.PortType.IN_PORT;
		} else if (senderMessageInterface != null) {
			type = CustomPortFigure.PortType.OUT_PORT;
		}
		return type;
	}

}
