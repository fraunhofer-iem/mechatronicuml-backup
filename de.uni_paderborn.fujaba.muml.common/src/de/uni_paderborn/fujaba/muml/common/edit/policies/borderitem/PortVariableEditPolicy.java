package de.uni_paderborn.fujaba.muml.common.edit.policies.borderitem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;

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
		super.handleNotificationEvent(notification);
	}

	@Override
	protected Port getPort() {
		EObject element = getSemanticElement();
		if (element != null) {
			return (Port) element
					.eGet(ComponentstorypatternPackage.Literals.PORT_VARIABLE__TYPE);
		}
		return null;
	}
}
