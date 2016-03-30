package org.muml.pim.realtimestatechart.descriptor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.core.common.descriptor.DefaultChainedPropertyDescriptor;
import org.muml.core.common.descriptor.IChainedPropertyDescriptor;

public class EnumerationPropertyDescriptor extends
		DefaultChainedPropertyDescriptor {

	public EnumerationPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags,
			IChainedPropertyDescriptor parent) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags, parent);
	}

	public EnumerationPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}

	@Override
	public Collection<?> getChoiceOfValues(Object object) {
		if (feature.getEType().getInstanceClass().isEnum()) {
			Collection<?> unmodifiableConstants = Arrays.asList(feature.getEType().getInstanceClass()
					.getEnumConstants());
			if (feature.getLowerBound() > 0 || !feature.isRequired()) { // TODO: Is this okay? Maybe connect using boolean AND? 
				// Get a modifiable list and append the value "null" to make it unsettable
				Collection<?> constants = new ArrayList<Object>(unmodifiableConstants);
				constants.add(null);
				return constants;
			}
			return unmodifiableConstants;
		}
		return super.getChoiceOfValues(object);

	}

}