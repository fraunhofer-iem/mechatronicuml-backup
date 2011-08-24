package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;

import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortKind;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortType;
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPort;
import de.uni_paderborn.fujaba.muml.model.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.model.component.HardwarePort;
import de.uni_paderborn.fujaba.muml.model.component.HybridPort;
import de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.impl.PortInstanceImpl;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;

public class PortInstanceBehavior extends AbstractBasePortBehavior {

	/**
	 * The model object. It will be set, while the EditPart is active (between
	 * calls to activate() and deactivate()).
	 */
	private PortInstance portInstance;

	public PortInstanceBehavior(AbstractBorderItemEditPart editPart) {
		super(editPart);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void activate() {
		EObject element = editPart.getNotationView().getElement();
		if (element instanceof PortInstance) {
			portInstance = (PortInstance) editPart.getNotationView()
					.getElement();
		}
		super.activate();
	}

	/**
	 * Called whenever the EditPart is going to be deactivated. Cleans up
	 * objects.
	 */
	@Override
	public void deactivate() {
		portInstance = null;
		super.deactivate();
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (feature instanceof EReference) {
			EReference reference = (EReference) feature;
			if (reference.getContainerClass().isAssignableFrom(
					PortInstance.class)) {
				int featureID = notification
						.getFeatureID(PortInstanceImpl.class);
				if (featureID == InstancePackage.DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_INTERFACE
						|| featureID == InstancePackage.DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_INTERFACE) {
					updatePortType();
				}
			}
		}
	}

	@Override
	public PortKind getPortKind() {
		if (portInstance.getPortType() instanceof DiscretePort &&
				!(portInstance.getPortType() instanceof ContinuousPort)) {
			return CustomPortFigure.PortKind.DISCRETE;
		} else if (portInstance.getPortType() instanceof HardwarePort) {
			return CustomPortFigure.PortKind.HARDWARE;
		} else if (portInstance.getPortType() instanceof ContinuousPort &&
				!(portInstance.getPortType() instanceof DiscretePort)) {
			return CustomPortFigure.PortKind.CONTINUOUS;
		} else if (portInstance.getPortType() instanceof HybridPort) {
			return CustomPortFigure.PortKind.HYBRID;
		}
		return null;
	}

	@Override
	public PortType getPortType() {
		MessageInterface receiverMessageInterface = null;
		MessageInterface senderMessageInterface = null;
		
		if (portInstance != null &&
				portInstance instanceof DiscretePortInstance){
			
			receiverMessageInterface = ((DiscretePortInstance)portInstance
					).getReceiverMessageInterface();
			senderMessageInterface = ((DiscretePortInstance)portInstance).getSenderMessageInterface();
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

	@Override
	public boolean isMultiPort() {
		return false;
	}

}
