package de.uni_paderborn.fujaba.muml.common.edit.policies.borderitem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;

public class PortInstanceEditPolicy extends PortTypeEditPolicy {
	@Override
	public void handleNotificationEvent(Notification notification) {
		if (notification.getFeature() == ConnectorPackage.Literals.CONNECTOR_ENDPOINT_INSTANCE__TYPE) {
			updateCardinality();
			updatePortType();
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
