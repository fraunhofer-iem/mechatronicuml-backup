package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.hwport;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.pim.connector.ConnectorEndpoint;
import org.muml.pim.connector.ConnectorPackage;

import de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomHWPortFigure.VisualPortKind;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationKind;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;

/**
 * Base edit policy for all HWPortInstances that uses the CustomHWPortFigure.
 * Provides handling model notifications and updating the hwport figure
 * accordingly.
 * 
 * @author adann
 * 
 */

public class HWDelegationPortEditPolicy extends HWPortBaseEditPolicy {

	/**
	 * Returns if this Port is a delegation Port by evaluating the isDelegation
	 * attribute of a {@link HWPortInstance}
	 */
	@Override
	protected boolean isDelegationPort() {

		return true;
	}

	/**
	 * A DelagtionPort is never a PortInstance.
	 * 
	 * @return true
	 */
	protected boolean isPortInstance() {
		return false;
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
		CommunicationKind kind = CommunicationKind.LINK;

		if (element instanceof DelegationHWPort) {
			DelegationHWPort port = (DelegationHWPort) element;
			if (!port.getConnectors().isEmpty()) {
				for (ConnectorEndpoint endpoint : port.getConnectors().get(0).getConnectorEndpoints()) {
					if (endpoint != port && endpoint instanceof HWPortPart
							&& ((HWPortPart) endpoint).getHwport() != null) {
						kind = ((HWPortPart) endpoint).getHwport().getPortKind();

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

		if (feature == ConnectorPackage.Literals.CONNECTOR_ENDPOINT__CONNECTORS) {
			refreshHWPortFigure();
		}
		super.handleNotificationEvent(notification);
	}
}
