package org.muml.pm.hardware.hwresource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.muml.pm.hardware.hwresource.Cache;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwresource.Processor;


public class ProcessorOwnedCacheItemProvider extends ItemPropertyDescriptor {

	public ProcessorOwnedCacheItemProvider(AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature, boolean isSettable, boolean multiLine,
			boolean sortChoices, Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, multiLine, sortChoices,
				staticImage, category, filterFlags);
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
				validChoices.add(value);
				continue;
			}

		}
		return validChoices;
	}

	private boolean isValidChoice(EObject eobject, EObject value) {
		// TODO Auto-generated method stub
		boolean result = false;
		if (HwresourcePackage.Literals.PROCESSOR.isSuperTypeOf(eobject.eClass())
				&& HwresourcePackage.Literals.CACHE.isSuperTypeOf(value.eClass())) {
			result = ((Processor) eobject).getParentStructuredResource() == ((Cache) value)
					.getParentStructuredResource();

		}

		return result;
	}

}
