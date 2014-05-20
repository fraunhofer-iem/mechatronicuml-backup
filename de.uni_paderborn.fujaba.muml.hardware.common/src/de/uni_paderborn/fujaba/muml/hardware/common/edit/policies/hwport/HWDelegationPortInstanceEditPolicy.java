package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.hwport;

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomHWPortFigure.HWPortKind;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage;

/**
 * Base edit policy for all HWPortInstances that uses the CustomHWPortFigure.
 * Provides handling model notifications and updating the hwport figure
 * accordingly.
 * 
 * @author adann
 * 
 */

public class HWDelegationPortInstanceEditPolicy extends HWPortBaseEditPolicy {

	/**
	 * Returns whether it is a Bus- or Link-Port based on the Port-Type of this
	 * HWPortInstance.
	 * 
	 */
	/*
	 * protected HWPort getHWPort() { EObject element = getSemanticElement(); if
	 * (element != null) { return (HWPort) element
	 * .eGet(PlatformPackage.Literals.HW_PORT_INSTANCE__HWPORT_TYPE); } return
	 * null; }
	 */

	/**
	 * Returns if this PortInstance is a delegation Port by evaluating the
	 * isDelegation attribute of a {@link HWPortInstance}
	 */
	@Override
	protected boolean isDelegationPort() {

		return true;
	}

	/**
	 * A HWPortInstance is always a PortInstance.
	 * 
	 * @return true
	 */
	protected boolean isPortInstance() {
		return true;
	}

	protected boolean isMultiHWPort() {
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
		de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind modelPortKind = de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind.BUS;
		DelegationHWPortInstance hwPortInstance = null;
		if (element != null) {
			if (HwplatforminstancePackage.Literals.DELEGATION_HW_PORT_INSTANCE
					.isSuperTypeOf(element.eClass())) {
				hwPortInstance = (DelegationHWPortInstance) element;
			}
			if (hwPortInstance != null && hwPortInstance.getType() != null
					&& HwplatformPackage.Literals.DELEGATION_HW_PORT
							.isSuperTypeOf(hwPortInstance.getType().eClass())) {
				modelPortKind = ((DelegationHWPort) hwPortInstance.getType())
						.getPortKind();
			}
		}

		switch (modelPortKind.getValue()) {
		case (de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind.BUS_VALUE):
			kind = HWPortKind.BUS;
			break;
		case (de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind.LINK_VALUE):
			kind = HWPortKind.LINK;
			break;

		}
		return kind;
	}
}
