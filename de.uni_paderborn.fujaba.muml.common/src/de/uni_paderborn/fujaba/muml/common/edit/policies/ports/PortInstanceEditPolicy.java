package de.uni_paderborn.fujaba.muml.common.edit.policies.ports;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.component.Port;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;

public class PortInstanceEditPolicy extends PortTypeEditPolicy {
	@Override
	public void handleNotificationEvent(Notification notification) {
		if (notification.getFeature() == ConnectorPackage.Literals.CONNECTOR_ENDPOINT_INSTANCE__TYPE) {
			refreshCardinality();
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

}
