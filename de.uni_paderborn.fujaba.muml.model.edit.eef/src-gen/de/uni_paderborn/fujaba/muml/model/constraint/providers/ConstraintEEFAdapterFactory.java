/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.constraint.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import de.uni_paderborn.fujaba.muml.model.constraint.util.ConstraintAdapterFactory;


/**
 * 
 * 
 */
public class ConstraintEEFAdapterFactory extends ConstraintAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.util.ConstraintAdapterFactory#createTextualConstraintAdapter()
	 * 
	 */
	public Adapter createTextualConstraintAdapter() {
		return new TextualConstraintPropertiesEditionProvider();
	}

}
