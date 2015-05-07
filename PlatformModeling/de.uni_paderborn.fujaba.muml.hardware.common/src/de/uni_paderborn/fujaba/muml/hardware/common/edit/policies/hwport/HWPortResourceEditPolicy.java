package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.hwport;

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomHWPortFigure.VisualPortKind;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationKind;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;

public class HWPortResourceEditPolicy extends HWPortBaseEditPolicy {

	@Override
	protected boolean isMultiHWPort() {
		EObject element = getSemanticElement();
		Boolean isMulti = false;
		CommunicationResource comResource = null;
		if (element != null) {
			if (HwresourcePackage.Literals.COMMUNICATION_RESOURCE
					.isSuperTypeOf(element.eClass())) {
				comResource = (CommunicationResource) element;
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
		CommunicationKind modelPortKind = de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationKind.BUS;
		CommunicationResource comResource = null;
		
		if (element != null) {
			if (HwresourcePackage.Literals.COMMUNICATION_RESOURCE
					.isSuperTypeOf(element.eClass())) {
				comResource = (CommunicationResource) element;
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
