package de.uni_paderborn.fujaba.muml.componentstorypattern.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.storydriven.storydiagrams.patterns.BindingOperator;

import de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable;

public class BindingOperatorPropertyDescriptor extends ItemPropertyDescriptor {
	public BindingOperatorPropertyDescriptor(AdapterFactory adapterFactory,
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
		
		if (object instanceof MultiPortVariable){
			return Collections.singletonList(BindingOperator.CHECK_ONLY);
		}
		
		// originalObjects must not be changed; therefore we create another ArrayList and copy the elements.
		@SuppressWarnings("unchecked")
		Collection<Object> originalObjects = (Collection<Object>) super.getChoiceOfValues(object);
		List<Object> objects = new ArrayList<Object>(originalObjects);
		return objects;
	}
	
	
	
}
