/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.core.providers;

import org.eclipse.emf.common.notify.Adapter;

import de.uni_paderborn.fujaba.muml.model.core.util.CoreAdapterFactory;


/**
 * 
 * 
 */
public class CoreEEFAdapterFactory extends CoreAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.core.util.CoreAdapterFactory#createNaturalNumberAdapter()
	 * 
	 */
	public Adapter createNaturalNumberAdapter() {
		return new NaturalNumberPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.core.util.CoreAdapterFactory#createActivityCallExpressionAdapter()
	 * 
	 */
	public Adapter createActivityCallExpressionAdapter() {
		return new ActivityCallExpressionPropertiesEditionProvider();
	}

}
