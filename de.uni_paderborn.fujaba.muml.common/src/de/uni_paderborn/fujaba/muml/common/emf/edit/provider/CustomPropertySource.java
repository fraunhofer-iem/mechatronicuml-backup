package de.uni_paderborn.fujaba.muml.common.emf.edit.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

import de.uni_paderborn.fujaba.common.emf.edit.ui.IRefreshProhibitedPropertySection;

public class CustomPropertySource extends PropertySource {

	private AdapterFactory adapterFactory;
	private IPropertySourceProvider propertySourceProvider;
	private EditingDomain editingDomain;
	private IRefreshProhibitedPropertySection mainPropertySection;

	public CustomPropertySource(Object object,
			IItemPropertySource itemPropertySource,
			AdapterFactory adapterFactory, EditingDomain editingDomain,
			IPropertySourceProvider propertySourceProvider, IRefreshProhibitedPropertySection mainPropertySection) {
		super(object, itemPropertySource);
		this.propertySourceProvider = propertySourceProvider;
		this.adapterFactory = adapterFactory;
		this.editingDomain = editingDomain;
		this.mainPropertySection = mainPropertySection;
	}

	protected IPropertyDescriptor createPropertyDescriptor(
			IItemPropertyDescriptor itemPropertyDescriptor) {
//		ResourceSet resourceSet = null;
//		if (editingDomain != null) {
//			resourceSet = editingDomain.getResourceSet();
//		}
//		IItemPropertyDescriptor delegatingItemPropertyDescriptor = new CustomDelegatingItemPropertyDescriptor(
//				itemPropertyDescriptor, resourceSet);
//
//		return new CustomPropertyDescriptor(this.object, delegatingItemPropertyDescriptor, adapterFactory, editingDomain, propertySourceProvider, mainPropertySection);
		return new CustomPropertyDescriptor(this.object, itemPropertyDescriptor, adapterFactory, editingDomain, propertySourceProvider, mainPropertySection);
	}

}
