package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.hwport;

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort;


/**
 * Base edit policy for all {@link HWPortPart}s that uses the CustomHWPortFigure.
 *  Provides handling model notifications and updating the hwport figure accordingly. 
 * 
 * @author adann
 * 
 */
public class HWPortPartEditPolicy extends HWPortTypeEditPolicy {
	
	/**
	 * Returns whether it is a Bus- or Link-Port based
	 * on the PortType of its PortInstance.
	 * 
	 */
	@Override
	protected HWPort getHWPort() {
		EObject element = getSemanticElement();
		if (element != null) {
			HWPortInstance hwportInstance = (HWPortInstance) element
					.eGet(PlatformPackage.Literals.HW_PORT_PART__HW_PORT_INSTANCE_TYPE);
			if (hwportInstance != null) {
				return (HWPort) hwportInstance
						.eGet(PlatformPackage.Literals.HW_PORT_INSTANCE__HWPORT_TYPE);
			}
		}
		return null;
	}
	
	/**
	 * Returns whether its HWPortInstance is a delegation port.
	 * 
	 */
	@Override
	protected boolean isDelegationPort() {
		EObject element = getSemanticElement();
		if (element != null) {
			HWPortInstance hwportInstance = (HWPortInstance) element
					.eGet(PlatformPackage.Literals.HW_PORT_PART__HW_PORT_INSTANCE_TYPE);
			if (hwportInstance != null) {
				return hwportInstance.isIsDelegationPort();
			}
		} 
		return false;
	}

	@Override
	protected boolean isPortInstance() {
		return true;
	}
}
