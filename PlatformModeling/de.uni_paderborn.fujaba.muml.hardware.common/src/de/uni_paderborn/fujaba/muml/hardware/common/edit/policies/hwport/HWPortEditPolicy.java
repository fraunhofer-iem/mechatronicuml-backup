package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.hwport;

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomHWPortFigure.HWPortKind;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;

public class HWPortEditPolicy extends HWPortBaseEditPolicy {

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

	protected HWPortKind getHWPortKind() {
		EObject element = getSemanticElement();
		HWPortKind kind = HWPortKind.BUS;
		de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind modelPortKind = de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind.BUS;
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
