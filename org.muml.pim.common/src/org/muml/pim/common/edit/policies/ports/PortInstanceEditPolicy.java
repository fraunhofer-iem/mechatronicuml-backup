package org.muml.pim.common.edit.policies.ports;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.muml.pim.component.Port;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.instance.InstancePackage;

public class PortInstanceEditPolicy extends PortTypeEditPolicy {
	@Override
	public void handleNotificationEvent(Notification notification) {
		if (notification.getFeature() == ConnectorPackage.Literals.CONNECTOR_ENDPOINT_INSTANCE__TYPE) {
			refreshArrow();
			refreshPortType();
		}
		super.handleNotificationEvent(notification);
	}

	@Override
	protected Port getPort() {
		EObject element = getSemanticElement();
		if (element != null) {
			return (Port) element
					.eGet(InstancePackage.Literals.PORT_INSTANCE__PORT_TYPE);
		}
		return null;
	}
	
	@Override
	protected boolean isMulti() {
		return false;
	}

}
