package de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import de.uni_paderborn.fujaba.common.descriptor.INavigatedObjectPropertyDescriptor;

public class NavigatedProperty extends Property {

	private EStructuralFeature navigationFeature;
	
	public NavigatedProperty(Resource resource, EStructuralFeature feature,
			AdapterFactory adapterFactory, AbstractPropertyEditor propertyEditor, EStructuralFeature navigationFeature) {
		super(resource, feature, adapterFactory, propertyEditor);
		this.navigationFeature = navigationFeature;
	}


	@Override
	protected boolean isValidItemPropertyDescriptor(
			IItemPropertyDescriptor itemPropertyDescriptor, Object object) {
		if (!(itemPropertyDescriptor instanceof INavigatedObjectPropertyDescriptor)) {
			return false;
		}
		if (!super.isValidItemPropertyDescriptor(itemPropertyDescriptor, object)) {
			return false;
		}
		EStructuralFeature navigationFeature = ((INavigatedObjectPropertyDescriptor) itemPropertyDescriptor)
					.getNavigationFeature();
		return navigationFeature.equals(navigationFeature);
	}

}
