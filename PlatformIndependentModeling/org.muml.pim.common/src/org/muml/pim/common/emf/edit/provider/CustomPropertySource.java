package org.muml.pim.common.emf.edit.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

public class CustomPropertySource extends PropertySource {

	private AdapterFactory adapterFactory;
	private IPropertySourceProvider propertySourceProvider;
	private EditingDomain editingDomain;

	public CustomPropertySource(Object object,
			IItemPropertySource itemPropertySource,
			AdapterFactory adapterFactory, EditingDomain editingDomain,
			IPropertySourceProvider propertySourceProvider) {
		super(object, itemPropertySource);
		this.propertySourceProvider = propertySourceProvider;
		this.adapterFactory = adapterFactory;
		this.editingDomain = editingDomain;
	}

	protected IPropertyDescriptor createPropertyDescriptor(
			IItemPropertyDescriptor itemPropertyDescriptor) {
		return new CustomPropertyDescriptor(this.object, itemPropertyDescriptor, adapterFactory, editingDomain, propertySourceProvider);
	}

}
