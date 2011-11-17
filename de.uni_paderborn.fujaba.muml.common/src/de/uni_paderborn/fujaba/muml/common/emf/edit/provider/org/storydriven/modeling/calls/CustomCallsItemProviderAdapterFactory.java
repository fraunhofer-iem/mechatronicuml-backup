package de.uni_paderborn.fujaba.muml.common.emf.edit.provider.org.storydriven.modeling.calls;

import org.eclipse.emf.common.notify.Adapter;
import org.storydriven.modeling.calls.provider.CallsItemProviderAdapterFactory;


public class CustomCallsItemProviderAdapterFactory extends
		CallsItemProviderAdapterFactory {
	/**
	 * This creates an adapter for a {@link org.storydriven.modeling.calls.ParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Adapter createParameterBindingAdapter() {
		if (parameterBindingItemProvider == null) {
			parameterBindingItemProvider = new CustomParameterBindingItemProvider(
					this);
		}

		return parameterBindingItemProvider;
	}

}
