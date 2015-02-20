package de.uni_paderborn.fujaba.muml.componentstorypattern.provider;


import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.storydriven.storydiagrams.patterns.BindingState;

import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable;

public class BindingStatePropertyDescriptor extends ItemPropertyDescriptor {

	public BindingStatePropertyDescriptor(AdapterFactory adapterFactory,
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

		if (object instanceof ComponentVariable) {
			return Collections.singletonList(BindingState.BOUND);
		}
		
		return super.getChoiceOfValues(object);
	}
}
