package de.uni_paderborn.fujaba.muml.deployment.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwarePortDirectionKind;

public class CustomHardwarePortEditPart extends HardwarePortEditPart {

	public CustomHardwarePortEditPart(View view) {
		super(view);
	}

	protected IFigure createNodeShape() {
		HardwarePortFigure figure = new HardwarePortFigure();
		HardwarePort hardwarePort = (HardwarePort) getNotationView().getElement();
		HardwarePortDirectionKind kind = hardwarePort.getKind();
		
		figure.getFigureInContainer().setVisible(kind == HardwarePortDirectionKind.IN);
		figure.getFigureOutContainer().setVisible(kind == HardwarePortDirectionKind.OUT);
		figure.getFigureInOutContainer().setVisible(kind == HardwarePortDirectionKind.IN_OUT);
		primaryShape = figure;
		return figure;
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (DeploymentPackage.Literals.HARDWARE_PORT__KIND.equals(feature)) {
			HardwarePort hardwarePort = (HardwarePort) notification.getNotifier();
			HardwarePortDirectionKind kind = hardwarePort.getKind();
			
			HardwarePortFigure figure = getPrimaryShape();
			figure.getFigureInContainer().setVisible(kind == HardwarePortDirectionKind.IN);
			figure.getFigureOutContainer().setVisible(kind == HardwarePortDirectionKind.OUT);
			figure.getFigureInOutContainer().setVisible(kind == HardwarePortDirectionKind.IN_OUT);
		}
		super.handleNotificationEvent(notification);
	}
	
}
