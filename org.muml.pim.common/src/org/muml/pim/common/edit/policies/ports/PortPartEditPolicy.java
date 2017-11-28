package org.muml.pim.common.edit.policies.ports;

import org.eclipse.emf.ecore.EObject;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.Port;

public class PortPartEditPolicy extends PortTypeEditPolicy {
	@Override
	protected Port getPort() {
		EObject element = getSemanticElement();
		if (element != null) {
			return (Port) element
					.eGet(ComponentPackage.Literals.PORT_PART__PORT_TYPE);
		}
		return null;
	}

}
