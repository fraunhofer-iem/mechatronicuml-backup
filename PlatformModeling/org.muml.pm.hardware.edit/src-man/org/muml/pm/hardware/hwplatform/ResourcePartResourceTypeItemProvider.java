package org.muml.pm.hardware.hwplatform;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.muml.pm.hardware.hwresource.Resource;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.hwresourceinstance.ResourceInstance;

public class ResourcePartResourceTypeItemProvider extends
		ItemPropertyDescriptor {

	public ResourcePartResourceTypeItemProvider(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}

	/**
	 * Filters the ResourceTypes for a given ResourceInstance based on the
	 * function {@link #isValidChoice(EObject, EObject)}
	 */
	@Override
	public Collection<?> getChoiceOfValues(Object object) {
		EObject eobject = (EObject) object;

		List<Object> validChoices = new ArrayList<Object>();
		for (Object value : super.getChoiceOfValues(object)) {
			if (value == null) {
				continue;
			}

			if (isValidChoice(eobject, (EObject) value)) {
				validChoices.add( value);
				continue;
			}

		}
		return validChoices;
	}

	private boolean isValidChoice(EObject eobject, EObject value) {
		// TODO Auto-generated method stub
		boolean result = false;
		result = result
				|| (HwresourceinstancePackage.Literals.STRUCTURED_RESOURCE_INSTANCE
						.isSuperTypeOf(value.eClass()));
		result = result
				|| (HwresourceinstancePackage.Literals.SENSOR_INSTANCE
						.isSuperTypeOf(value.eClass()));
		result = result
				|| (HwresourceinstancePackage.Literals.ACTUATOR_INSTANCE
						.isSuperTypeOf(value.eClass()));

		return result;
	}

}
