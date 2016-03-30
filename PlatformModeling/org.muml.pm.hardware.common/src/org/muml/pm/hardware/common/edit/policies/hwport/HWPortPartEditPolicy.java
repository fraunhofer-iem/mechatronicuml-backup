package org.muml.pm.hardware.common.edit.policies.hwport;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.pm.hardware.hwplatform.HWPlatformPart;
import org.muml.pm.hardware.hwplatform.HWPortPart;
import org.muml.pm.hardware.hwplatform.HwplatformPackage;
import org.muml.pm.hardware.hwresource.CommunicationKind;

/**
 * Base edit policy for all {@link HWPortPart}s that uses the
 * CustomHWPortFigure. Provides handling model notifications and updating the
 * hwport figure accordingly.
 * 
 * @author adann
 * 
 */
public class HWPortPartEditPolicy extends HWPortBaseEditPolicy {

	@Override
	public void handleNotificationEvent(Notification notification) {
		EStructuralFeature feature = null;
		if (notification.getFeature() instanceof EStructuralFeature) {
			feature = (EStructuralFeature) notification.getFeature();
		}

		/**
		 * 
		 */
		if (feature == HwplatformPackage.Literals.HW_PORT_PART__HWPORT) {
			refreshHWPortFigure();

		}
		super.handleNotificationEvent(notification);
	}

	/**
	 * Returns whether its HWPortInstance is a delegation port.
	 * 
	 */
	@Override
	protected boolean isDelegationPort() {
		HWPortPart element = (HWPortPart) getSemanticElement();
		if (element.getParentPlatformPart() instanceof HWPlatformPart) {
			return true;
		}

		return false;
	}

	@Override
	protected boolean isMultiHWPort() {
		EObject element = getSemanticElement();

		HWPortPart hwPortPart = null;

		if (element != null && HwplatformPackage.Literals.HW_PORT_PART.isSuperTypeOf(element.eClass())) {

			hwPortPart = (HWPortPart) element;

		}
		if (hwPortPart == null) {
			return false;
		}
		return hwPortPart.getHwport().isMultiHWPort();
	}

	@Override
	protected CommunicationKind getCommunicationKind() {
		EObject element = getSemanticElement();
		CommunicationKind modelPortKind = org.muml.pm.hardware.hwresource.CommunicationKind.BUS;
		HWPortPart hwPortPart = null;
		if (element != null && HwplatformPackage.Literals.HW_PORT_PART.isSuperTypeOf(element.eClass())) {

			hwPortPart = (HWPortPart) element;

		}

		if (hwPortPart != null) {
			modelPortKind = hwPortPart.getHwport().getPortKind();
		}

		return modelPortKind;
	}

	@Override
	protected boolean isOptionalPort() {
		EObject element = getSemanticElement();
		HWPortPart portPart = (HWPortPart) element;
		if (portPart.getHwport().getCardinality() != null
				&& portPart.getHwport().getCardinality().getLowerBound() != null) {

			return portPart.getHwport().getCardinality().getLowerBound().getValue() == 0;
		}
		return false;
	}
}
