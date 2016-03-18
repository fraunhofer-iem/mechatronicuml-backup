package de.uni_paderborn.fujaba.muml.common.edit.policies.ports;

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.Port;

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
