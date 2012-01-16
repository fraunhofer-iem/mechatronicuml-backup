/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.deployment.providers;

import org.eclipse.emf.common.notify.Adapter;

import de.uni_paderborn.fujaba.muml.model.deployment.util.DeploymentAdapterFactory;


/**
 * 
 * 
 */
public class DeploymentEEFAdapterFactory extends DeploymentAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.util.DeploymentAdapterFactory#createDeploymentAdapter()
	 * 
	 */
	public Adapter createDeploymentAdapter() {
		return new DeploymentPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.util.DeploymentAdapterFactory#createHardwareNodeAdapter()
	 * 
	 */
	public Adapter createHardwareNodeAdapter() {
		return new HardwareNodePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.util.DeploymentAdapterFactory#createHardwarePortAdapter()
	 * 
	 */
	public Adapter createHardwarePortAdapter() {
		return new HardwarePortPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.util.DeploymentAdapterFactory#createCommunicationLinkAdapter()
	 * 
	 */
	public Adapter createCommunicationLinkAdapter() {
		return new CommunicationLinkPropertiesEditionProvider();
	}

}
