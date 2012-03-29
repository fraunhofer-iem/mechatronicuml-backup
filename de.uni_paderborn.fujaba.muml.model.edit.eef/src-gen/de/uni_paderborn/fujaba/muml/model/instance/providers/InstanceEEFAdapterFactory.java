/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.instance.providers;

import org.eclipse.emf.common.notify.Adapter;

import de.uni_paderborn.fujaba.muml.model.instance.util.InstanceAdapterFactory;


/**
 * 
 * 
 */
public class InstanceEEFAdapterFactory extends InstanceAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.instance.util.InstanceAdapterFactory#createComponentInstanceAdapter()
	 * 
	 */
	public Adapter createComponentInstanceAdapter() {
		return new ComponentInstancePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.instance.util.InstanceAdapterFactory#createConnectorInstanceAdapter()
	 * 
	 */
	public Adapter createConnectorInstanceAdapter() {
		return new ConnectorInstancePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.instance.util.InstanceAdapterFactory#createAssemblyInstanceAdapter()
	 * 
	 */
	public Adapter createAssemblyInstanceAdapter() {
		return new AssemblyInstancePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.instance.util.InstanceAdapterFactory#createDelegationInstanceAdapter()
	 * 
	 */
	public Adapter createDelegationInstanceAdapter() {
		return new DelegationInstancePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.instance.util.InstanceAdapterFactory#createContinuousPortInstanceAdapter()
	 * 
	 */
	public Adapter createContinuousPortInstanceAdapter() {
		return new ContinuousPortInstancePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.instance.util.InstanceAdapterFactory#createHybridPortInstanceAdapter()
	 * 
	 */
	public Adapter createHybridPortInstanceAdapter() {
		return new HybridPortInstancePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.instance.util.InstanceAdapterFactory#createDiscreteSinglePortInstanceAdapter()
	 * 
	 */
	public Adapter createDiscreteSinglePortInstanceAdapter() {
		return new DiscreteSinglePortInstancePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.instance.util.InstanceAdapterFactory#createDiscreteMultiPortInstanceAdapter()
	 * 
	 */
	public Adapter createDiscreteMultiPortInstanceAdapter() {
		return new DiscreteMultiPortInstancePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.instance.util.InstanceAdapterFactory#createPatternInstanceAdapter()
	 * 
	 */
	public Adapter createPatternInstanceAdapter() {
		return new PatternInstancePropertiesEditionProvider();
	}

}
