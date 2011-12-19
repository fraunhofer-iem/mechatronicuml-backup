package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;

import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortKind;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPort;

public class ContinuousPortBehavior extends AbstractPortTypeBehavior {

	public ContinuousPortBehavior(GraphicalEditPart editPart) {
		super(editPart);
	}

	@Override
	public PortKind getPortKind() {
		return CustomPortFigure.PortKind.CONTINUOUS;
	}

	@Override
	public CustomPortFigure.PortType getPortType() {
		CustomPortFigure.PortType type;
		ContinuousPort continuousPort = (ContinuousPort) getPort();
		switch (continuousPort.getKind()) {
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

	@Override
	public void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (feature instanceof EStructuralFeature) {
			EStructuralFeature structuralFeature = (EStructuralFeature) feature;
			if (structuralFeature.getContainerClass().isAssignableFrom(
					ContinuousPort.class)) {
				int featureID = notification.getFeatureID(ContinuousPort.class);
				if (featureID == ComponentPackage.CONTINUOUS_PORT__KIND) {
					updatePortType();
				}
			}
		}
		super.handleNotificationEvent(notification);
	}
}
