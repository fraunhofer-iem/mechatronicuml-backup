package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.hwport;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.muml.connector.Connector;
import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;
import de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomHWPortFigure.HWPortKind;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;


/**
 * Base edit policy for all {@link HWPortPart}s that uses the CustomHWPortFigure.
 *  Provides handling model notifications and updating the hwport figure accordingly. 
 * 
 * @author adann
 * 
 */
public class HWDelegationPortEditPolicy extends HWPortBaseEditPolicy {
	
	@Override
	public void handleNotificationEvent(Notification notification) {
		EStructuralFeature feature = null;
		if (notification.getFeature() instanceof EStructuralFeature) {
			feature = (EStructuralFeature) notification.getFeature();
		}

		/**
		 * 
		 */
		if (feature == HwresourcePackage.Literals.COMMUNICATION_RESOURCE__PORT_KIND || feature == HwresourcePackage.Literals.COMMUNICATION_RESOURCE__MULTI_HW_PORT) {
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
		return true;
	}




	@Override
	protected boolean isMultiHWPort() {
		EObject element = getSemanticElement();
	
		DelegationHWPort hwPort = null;

		if (element != null) {
			if (HwplatformPackage.Literals.DELEGATION_HW_PORT
					.isSuperTypeOf(element.eClass())) {
				hwPort = (DelegationHWPort) element;
			} 
		}
		if(hwPort==null){
			return false;
		}
		return hwPort.isMultiHWPort();
	}


	@Override
	protected HWPortKind getHWPortKind() {
		EObject element = getSemanticElement();
		HWPortKind kind = HWPortKind.BUS;
		de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind modelPortKind = de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind.BUS;
		DelegationHWPort hwPort = null;
		if (element != null) {
			if (HwplatformPackage.Literals.DELEGATION_HW_PORT
					.isSuperTypeOf(element.eClass())) {
				hwPort = (DelegationHWPort) element;
			} 
			}
			

		if (hwPort != null) {
			modelPortKind = hwPort.getPortKind();
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
	protected boolean isOptionalPort() {
		// TODO Auto-generated method stub
		return false;
	}
}
