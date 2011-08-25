package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;

import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortKind;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.HardwarePort;

public class HardwarePortBehavior extends AbstractPortBehavior {

	public HardwarePortBehavior(AbstractBorderItemEditPart editPart) {
		super(editPart);
	}
	
	@Override
	public PortKind getPortKind() {
		return CustomPortFigure.PortKind.HARDWARE;
	}

	@Override
	public CustomPortFigure.PortType getPortType() {
		CustomPortFigure.PortType type = CustomPortFigure.PortType.NONE;
		return type;
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (feature instanceof EStructuralFeature) {
			EStructuralFeature structuralFeature = (EStructuralFeature) feature;
			if (structuralFeature.getContainerClass() == HardwarePort.class) {
				int featureID = notification.getFeatureID(HardwarePort.class);
				if (featureID == ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_INTERFACE
						|| featureID == ComponentPackage.DISCRETE_PORT__SENDER_MESSAGE_INTERFACE) {
					updatePortType();
				}
			}
		}
		super.handleNotificationEvent(notification);
	}
}
