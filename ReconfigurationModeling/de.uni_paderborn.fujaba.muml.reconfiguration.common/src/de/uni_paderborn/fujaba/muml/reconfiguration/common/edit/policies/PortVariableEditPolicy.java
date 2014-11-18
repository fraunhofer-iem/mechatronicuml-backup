package de.uni_paderborn.fujaba.muml.reconfiguration.common.edit.policies;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.muml.MumlPackage;
import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.common.edit.policies.ports.PortTypeEditPolicy;
import de.uni_paderborn.fujaba.muml.component.Port;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable;

public class PortVariableEditPolicy extends PortTypeEditPolicy {
	@Override
	public void handleNotificationEvent(Notification notification) {
		if (BehaviorPackage.Literals.TYPED_NAMED_ELEMENT__DATA_TYPE
				.equals(notification.getFeature())) {
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
					.eGet(ComponentstorypatternPackage.Literals.PORT_VARIABLE__PORT_TYPE);
		}
		return null;
	}
	
	@Override
	protected boolean isMulti() {
		if (getSemanticElement() instanceof SinglePortVariable
				&& ((SinglePortVariable) getSemanticElement())
						.getMultiPortVariable() != null)
			return false;
		
		return super.isMulti();
	}
}
