package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;

import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortKind;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.DiscretePort;

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

	@Override
	public void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (feature instanceof EStructuralFeature) {
			EStructuralFeature structuralFeature = (EStructuralFeature) feature;
			if (structuralFeature.getContainerClass() == DiscretePort.class) {
				int featureID = notification.getFeatureID(DiscretePort.class);
				if (featureID == ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_TYPES
						|| featureID == ComponentPackage.DISCRETE_PORT__SENDER_MESSAGE_TYPES) {
					updatePortType();
				}
			}
		}
		super.handleNotificationEvent(notification);
	}
}
