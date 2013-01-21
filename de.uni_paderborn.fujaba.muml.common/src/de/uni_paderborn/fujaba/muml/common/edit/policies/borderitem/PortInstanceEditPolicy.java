package de.uni_paderborn.fujaba.muml.common.edit.policies.borderitem;

import org.eclipse.emf.common.notify.Notification;

import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;


public class PortInstanceEditPolicy extends PortTypeEditPolicy {
	@Override
	public void handleNotificationEvent(Notification notification) {
		if (notification.getFeature() == InstancePackage.Literals.PORT_INSTANCE__PORT_TYPE) {
			updateCardinality();
			updatePortType();
		}
	}

	@Override
	protected Port getPort() {
		return (Port) getSemanticElement().eGet(InstancePackage.Literals.PORT_INSTANCE__PORT_TYPE);
	}

}
