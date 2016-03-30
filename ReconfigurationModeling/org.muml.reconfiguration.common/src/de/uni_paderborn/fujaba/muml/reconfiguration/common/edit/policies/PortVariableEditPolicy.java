package de.uni_paderborn.fujaba.muml.reconfiguration.common.edit.policies;

import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.common.edit.policies.ports.PortTypeEditPolicy;
import org.muml.pim.common.figures.CustomPortFigure.PortKind;
import org.muml.pim.common.figures.CustomPortFigure.PortType;
import org.muml.pim.component.Port;

import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable;
import de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.ProtocolinstantiationPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.policies.CustomPortTypeEditPolicy;

public class PortVariableEditPolicy extends CustomPortTypeEditPolicy {
	protected org.eclipse.draw2d.Label label = new Label();
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
