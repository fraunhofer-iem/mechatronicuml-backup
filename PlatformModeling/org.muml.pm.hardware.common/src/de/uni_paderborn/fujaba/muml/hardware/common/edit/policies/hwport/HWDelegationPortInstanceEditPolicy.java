package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.hwport;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;
import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomHWPortFigure.VisualPortKind;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationKind;

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
	protected CommunicationKind getCommunicationKind() {
		EObject element = getSemanticElement();
		CommunicationKind kind = CommunicationKind.BUS;
		if (element instanceof DelegationHWPortInstance) {
			DelegationHWPortInstance port = (DelegationHWPortInstance) element;
			if (!port.getConnectorInstances().isEmpty()) {
				for (ConnectorEndpointInstance endpoint : port.getConnectorInstances().get(0)
						.getConnectorEndpointInstances()) {
					if (endpoint != port && endpoint instanceof HWPortInstance
							&& ((HWPortInstance) endpoint).getType() != null) {
						kind = ((HWPortInstance) endpoint).getPortKind();

					}
				}
			}

		}

		return kind;

	}

	@Override
	protected boolean isOptionalPort() {
		return false;
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		EStructuralFeature feature = null;
		if (notification.getFeature() instanceof EStructuralFeature) {
			feature = (EStructuralFeature) notification.getFeature();
		}

		if (feature == ConnectorPackage.Literals.CONNECTOR_ENDPOINT_INSTANCE__CONNECTOR_INSTANCES) {
			refreshHWPortFigure();
		}
		super.handleNotificationEvent(notification);
	}
}
