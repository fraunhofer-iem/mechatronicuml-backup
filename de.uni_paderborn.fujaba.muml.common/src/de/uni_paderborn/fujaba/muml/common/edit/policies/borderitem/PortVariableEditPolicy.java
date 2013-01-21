package de.uni_paderborn.fujaba.muml.common.edit.policies.borderitem;

import org.eclipse.emf.common.notify.Notification;

import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;

public class PortVariableEditPolicy extends PortTypeEditPolicy {
	@Override
	public void handleNotificationEvent(Notification notification) {
		if (ComponentstorypatternPackage.Literals.PORT_VARIABLE__TYPE
				.equals(notification.getFeature())) {
			updateCardinality();
			updatePortType();
		}
	}

	@Override
	protected Port getPort() {
		return (Port) getSemanticElement().eGet(
				ComponentstorypatternPackage.Literals.PORT_VARIABLE__TYPE);
	}
}
