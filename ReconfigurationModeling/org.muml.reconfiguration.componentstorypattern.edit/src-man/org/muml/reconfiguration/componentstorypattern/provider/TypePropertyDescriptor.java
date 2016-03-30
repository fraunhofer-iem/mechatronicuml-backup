package org.muml.reconfiguration.componentstorypattern.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.muml.reconfiguration.componentstorypattern.SinglePortVariable;

public class TypePropertyDescriptor extends ItemPropertyDescriptor {
	public TypePropertyDescriptor(AdapterFactory adapterFactory,
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

		if (object instanceof SinglePortVariable) {
			SinglePortVariable singlePortVariable = (SinglePortVariable) object;
			if ((singlePortVariable).getMultiPortVariable() != null) {
				return Collections.singletonList(singlePortVariable.getMultiPortVariable().getPortType());
			}
		}

		// originalObjects must not be changed; therefore we create another
		// ArrayList and copy the elements.
		@SuppressWarnings("unchecked")
		Collection<Object> originalObjects = (Collection<Object>) super.getChoiceOfValues(object);
		List<Object> objects = new ArrayList<Object>(originalObjects);
		return objects;
	}

}
