/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.pattern.providers;

import org.eclipse.emf.common.notify.Adapter;

import de.uni_paderborn.fujaba.muml.model.pattern.util.PatternAdapterFactory;


/**
 * 
 * 
 */
public class PatternEEFAdapterFactory extends PatternAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.util.PatternAdapterFactory#createRoleConnectorAdapter()
	 * 
	 */
	public Adapter createRoleConnectorAdapter() {
		return new RoleConnectorPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.util.PatternAdapterFactory#createCoordinationPatternAdapter()
	 * 
	 */
	public Adapter createCoordinationPatternAdapter() {
		return new CoordinationPatternPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.util.PatternAdapterFactory#createRoleAdapter()
	 * 
	 */
	public Adapter createRoleAdapter() {
		return new RolePropertiesEditionProvider();
	}

}
