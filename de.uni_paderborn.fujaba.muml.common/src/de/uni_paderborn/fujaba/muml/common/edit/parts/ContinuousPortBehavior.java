package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;

import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortKind;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPort;
import de.uni_paderborn.fujaba.muml.model.component.Port;

public class ContinuousPortBehavior extends AbstractPortBehavior {

	public ContinuousPortBehavior(AbstractBorderItemEditPart editPart) {
		super(editPart);
	}
	
	@Override
	public PortKind getPortKind() {
		return CustomPortFigure.PortKind.CONTINUOUS;
	}

	@Override
	public CustomPortFigure.PortType getPortType() {
		CustomPortFigure.PortType type = CustomPortFigure.PortType.IN_PORT;
		return type;
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (feature instanceof EStructuralFeature) {
			EStructuralFeature structuralFeature = (EStructuralFeature) feature;
			if (structuralFeature.getContainerClass() == ContinuousPort.class) {
				int featureID = notification.getFeatureID(ContinuousPort.class);
				if (featureID == ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_INTERFACE
						|| featureID == ComponentPackage.DISCRETE_PORT__SENDER_MESSAGE_INTERFACE) {
					updatePortType();
				}
			}
		}
		super.handleNotificationEvent(notification);
	}
}
