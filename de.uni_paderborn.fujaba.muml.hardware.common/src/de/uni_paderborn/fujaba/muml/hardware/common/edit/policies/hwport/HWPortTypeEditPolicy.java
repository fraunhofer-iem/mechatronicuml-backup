package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.hwport;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomHWPortFigure.HWPortKind;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage;

/**
 * Base edit policy for all HWPorts that uses the CustomHWPortFigure.
 *  Provides handling model notifications and updating the hwport figure accordingly. 
 * 
 * @author adann
 * 
 */
public class HWPortTypeEditPolicy extends HWPortBaseEditPolicy {
	
	
	@Override
	public void handleNotificationEvent(Notification notification) {
		EStructuralFeature feature = null;
		if (notification.getFeature() instanceof EStructuralFeature) {
			feature = (EStructuralFeature) notification.getFeature();
		}

		/**
		 * 
		 */
		if (feature == ResourcetypePackage.Literals.HW_PORT__PORT_TYPE) {
			refreshHWPortFigure();
		}
		super.handleNotificationEvent(notification);
	}


	
	/**
	 * A HWPort on ResourceType level is never a delegation port
	 * @return false
	 */
	protected boolean isDelegationPort() {
		return false;
	}

	/**
	 * A PortType is never a HWPortInstance
	 * @return false
	 */
	protected boolean isPortInstance() {
		return false;
	}
	
	/**
	 * Get the current HWPort.
	 * @return the semanticElement as a {@link HWPort}
	 */
	protected HWPort getHWPort() {
		return (HWPort) getSemanticElement();
	}

	@Override
	protected HWPortKind getHWPortKind() {
		HWPortKind kind = HWPortKind.BUS;
		
		if (getHWPort() != null) {
			if (getHWPort().getPortType() == de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPortKind.BUS) {
				kind = HWPortKind.BUS;
			} else if (getHWPort().getPortType() == de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPortKind.LINK) {
				kind = HWPortKind.LINK;
			}

		}
		return kind;
	}

}
