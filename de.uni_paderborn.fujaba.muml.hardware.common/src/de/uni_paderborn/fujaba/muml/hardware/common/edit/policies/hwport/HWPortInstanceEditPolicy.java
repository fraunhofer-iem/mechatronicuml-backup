package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.hwport;

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomHWPortFigure.HWPortKind;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;

/**
 * Base edit policy for all HWPortInstances that uses the CustomHWPortFigure.
 * Provides handling model notifications and updating the hwport figure
 * accordingly.
 * 
 * @author adann
 * 
 */

public class HWPortInstanceEditPolicy extends HWPortBaseEditPolicy {

 	/**
	 * Returns whether it is a Bus- or Link-Port based on the Port-Type of this
	 * HWPortInstance.
	 * 
	 */
/*	protected HWPort getHWPort() {
		EObject element = getSemanticElement();
		if (element != null) {
			return (HWPort) element
					.eGet(PlatformPackage.Literals.HW_PORT_INSTANCE__HWPORT_TYPE);
		}
		return null;
	} */

	/**
	 * Returns if this PortInstance is a delegation Port by evaluating the
	 * isDelegation attribute of a {@link HWPortInstance}
	 */
	@Override
	protected boolean isDelegationPort() {
		EObject element = getSemanticElement();
		if (element != null) {
			return ((HWPortInstance) element).isIsDelegationPort();
		}
		return false;
	}

	/**
	 * A HWPortInstance is always a PortInstance.
	 * 
	 * @return true
	 */
	protected boolean isPortInstance() {
		return true;
	}
	
	
	protected boolean isMultiHWPort(){
		return false;
	}

	/**
	 * Returns whether it is a Bus- or Link-Port based on the Port-Type of this
	 * HWPortInstance.
	 * 
	 */	
	@Override
	protected HWPortKind getHWPortKind() {
		EObject element = getSemanticElement();
		HWPortKind kind = HWPortKind.BUS;
		if (element != null) {
			if (PlatformPackage.Literals.BUS_PORT_INSTANCE
					.isSuperTypeOf(element.eClass())) {
				kind = HWPortKind.BUS;
			} else if (PlatformPackage.Literals.LINK_PORT_INSTANCE
					.isSuperTypeOf(element.eClass())) {
				kind = HWPortKind.LINK;
			}
		}
		return kind;
	}
}
