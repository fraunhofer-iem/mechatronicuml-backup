package org.muml.pm.hardware.common.edit.policies.hwport;

import org.eclipse.emf.ecore.EObject;
import org.muml.pm.hardware.common.figures.CustomHWPortFigure.VisualPortKind;
import org.muml.pm.hardware.hwresource.CommunicationKind;
import org.muml.pm.hardware.hwresource.CommunicationResource;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwresourceinstance.HWPort;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;

public class HWPortEditPolicy extends HWPortBaseEditPolicy {

	@Override
	protected boolean isMultiHWPort() {
		EObject element = getSemanticElement();
		Boolean isMulti = false;
		CommunicationResource comResource = null;
		if (element != null) {
			if (HwresourceinstancePackage.Literals.HW_PORT
					.isSuperTypeOf(element.eClass())) {
				comResource =((HWPort) element).getCommunicationResource();
			}
			if (comResource != null && comResource.getCardinality() != null) {
				isMulti = comResource.getCardinality().getUpperBound()
						.getValue() > 1;
			}

		}

		return isMulti;
	}

	protected CommunicationKind getCommunicationKind() {
		EObject element = getSemanticElement();
		CommunicationKind modelPortKind = org.muml.pm.hardware.hwresource.CommunicationKind.BUS;
		CommunicationResource comResource = null;
		
		if (element != null) {
			if (HwresourceinstancePackage.Literals.HW_PORT
					.isSuperTypeOf(element.eClass())) {
				comResource = ((HWPort) element).getCommunicationResource();
			}
			if (comResource != null) {
				modelPortKind = comResource.getPortKind();
			}

		}
		return modelPortKind;
	}

	@Override
	protected boolean isDelegationPort() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean isOptionalPort() {
		EObject element = getSemanticElement();
		Boolean isOptional = false;
		CommunicationResource comResource = null;
		if (element != null) {
			if (HwresourcePackage.Literals.COMMUNICATION_RESOURCE
					.isSuperTypeOf(element.eClass())) {
				comResource = (CommunicationResource) element;
			}
			if (comResource != null && comResource.getCardinality() != null) {
				isOptional = comResource.getCardinality().getLowerBound()
						.getValue() == 0;
			}

		}

		return isOptional;
	}

}
