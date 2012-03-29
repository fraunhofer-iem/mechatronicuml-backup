/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.component.providers;

import org.eclipse.emf.common.notify.Adapter;

import de.uni_paderborn.fujaba.muml.model.component.util.ComponentAdapterFactory;


/**
 * 
 * 
 */
public class ComponentEEFAdapterFactory extends ComponentAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.component.util.ComponentAdapterFactory#createContinuousPortAdapter()
	 * 
	 */
	public Adapter createContinuousPortAdapter() {
		return new ContinuousPortPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.component.util.ComponentAdapterFactory#createDiscretePortAdapter()
	 * 
	 */
	public Adapter createDiscretePortAdapter() {
		return new DiscretePortPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.component.util.ComponentAdapterFactory#createComponentPartAdapter()
	 * 
	 */
	public Adapter createComponentPartAdapter() {
		return new ComponentPartPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.component.util.ComponentAdapterFactory#createStructuredComponentAdapter()
	 * 
	 */
	public Adapter createStructuredComponentAdapter() {
		return new StructuredComponentPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.component.util.ComponentAdapterFactory#createAtomicComponentAdapter()
	 * 
	 */
	public Adapter createAtomicComponentAdapter() {
		return new AtomicComponentPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.component.util.ComponentAdapterFactory#createAssemblyAdapter()
	 * 
	 */
	public Adapter createAssemblyAdapter() {
		return new AssemblyPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.component.util.ComponentAdapterFactory#createDelegationAdapter()
	 * 
	 */
	public Adapter createDelegationAdapter() {
		return new DelegationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.component.util.ComponentAdapterFactory#createHybridPortAdapter()
	 * 
	 */
	public Adapter createHybridPortAdapter() {
		return new HybridPortPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.component.util.ComponentAdapterFactory#createPatternOccurrenceAdapter()
	 * 
	 */
	public Adapter createPatternOccurrenceAdapter() {
		return new PatternOccurrencePropertiesEditionProvider();
	}

}
