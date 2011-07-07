package de.uni_paderborn.fujaba.muml.common.emf.edit.providerfactories.org.storydriven.modeling.calls;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.storydriven.modeling.calls.provider.ParameterBindingItemProvider;

public class CustomParameterBindingItemProvider extends
		ParameterBindingItemProvider {

	public CustomParameterBindingItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			// Add custom property descriptors here...
		}
		return itemPropertyDescriptors;
	}


}
