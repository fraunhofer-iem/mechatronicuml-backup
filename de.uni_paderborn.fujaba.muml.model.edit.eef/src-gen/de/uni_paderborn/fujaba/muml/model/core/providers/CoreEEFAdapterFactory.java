/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.core.providers;

import java.util.ArrayList;
import java.util.List;

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
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.core.util.CoreAdapterFactory#createAttributeAdapter()
	 * 
	 */
	public Adapter createAttributeAdapter() {
		return new AttributePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.core.util.CoreAdapterFactory#createOperationAdapter()
	 * 
	 */
	public Adapter createOperationAdapter() {
		return new OperationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.core.util.CoreAdapterFactory#createParameterAdapter()
	 * 
	 */
	public Adapter createParameterAdapter() {
		return new ParameterPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.core.util.CoreAdapterFactory#createPrimitiveDataTypeAdapter()
	 * 
	 */
	public Adapter createPrimitiveDataTypeAdapter() {
		return new PrimitiveDataTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.core.util.CoreAdapterFactory#createArrayDataTypeAdapter()
	 * 
	 */
	public Adapter createArrayDataTypeAdapter() {
		return new ArrayDataTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.core.util.CoreAdapterFactory#createInnerDeclarationAdapter()
	 * 
	 */
	public Adapter createInnerDeclarationAdapter() {
		return new InnerDeclarationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.core.util.CoreAdapterFactory#createParameterBindingAdapter()
	 * 
	 */
	public Adapter createParameterBindingAdapter() {
		return new ParameterBindingPropertiesEditionProvider();
	}

}
