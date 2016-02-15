package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.hwport;

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;
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

public class HWDelegationPortEditPolicy extends HWPortBaseEditPolicy {

	/**
	 * Returns if this Port is a delegation Port by evaluating the
	 * isDelegation attribute of a {@link HWPortInstance}
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
		
		if(element instanceof DelegationHWPort){
			DelegationHWPort port = (DelegationHWPort) element;
			if(!port.getConnectors().isEmpty()){
				for(ConnectorEndpoint endpoint : port.getConnectors().get(0).getConnectorEndpoints()){
					if(endpoint != port && endpoint instanceof HWPortPart && ((HWPortPart) endpoint).getHwport() != null){
						kind = ((HWPortPart) endpoint).getHwport().getPortKind();
						
					}
				}
			}
			
			
		}
		return kind;
		

	}

	@Override
	protected boolean isOptionalPort() {
		// TODO Auto-generated method stub
		return false;
	}
}
