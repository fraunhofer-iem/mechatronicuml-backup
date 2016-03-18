package de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.policies;

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.Port;

public class CustomPortPartEditPolicy extends CustomPortTypeEditPolicy {
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