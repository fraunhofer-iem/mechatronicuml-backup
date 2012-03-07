/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.msgiface.providers;

import org.eclipse.emf.common.notify.Adapter;

import de.uni_paderborn.fujaba.muml.model.msgiface.util.MsgifaceAdapterFactory;


/**
 * 
 * 
 */
public class MsgifaceEEFAdapterFactory extends MsgifaceAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.msgiface.util.MsgifaceAdapterFactory#createMessageInterfaceAdapter()
	 * 
	 */
	public Adapter createMessageInterfaceAdapter() {
		return new MessageInterfacePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.msgiface.util.MsgifaceAdapterFactory#createMessageTypeAdapter()
	 * 
	 */
	public Adapter createMessageTypeAdapter() {
		return new MessageTypePropertiesEditionProvider();
	}

}
