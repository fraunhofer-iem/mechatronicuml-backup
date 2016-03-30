package org.muml.reconfiguration.componentstorypattern.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.muml.reconfiguration.componentstorypattern.ComponentStoryPatternVariable;
import org.muml.reconfiguration.componentstorypattern.ComponentVariable;
import org.muml.reconfiguration.componentstorypattern.MultiPortVariable;
import org.muml.reconfiguration.verification.sdd.componentsdd.ComponentStoryPatternNode;
import org.muml.storydiagram.patterns.BindingSemantics;

public class BindingSemanticsPropertyDescriptor extends ItemPropertyDescriptor {
	public BindingSemanticsPropertyDescriptor(AdapterFactory adapterFactory,
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
			return Collections.singletonList(BindingSemantics.MANDATORY);
		}
		
		if (object instanceof MultiPortVariable){
			return Collections.singletonList(BindingSemantics.MANDATORY);
		}
		
		if (object instanceof ComponentStoryPatternVariable){
			EObject container = ((ComponentStoryPatternVariable) object).eContainer();
			while(container != null){
				if(container instanceof ComponentStoryPatternNode){
					List<Object> bindingSemantics = new ArrayList<Object>();
					bindingSemantics.add(BindingSemantics.MANDATORY);
					bindingSemantics.add(BindingSemantics.OPTIONAL);
					return bindingSemantics;
				}
				container = container.eContainer();
			}
		}
		
		// originalObjects must not be changed; therefore we create another ArrayList and copy the elements.
		@SuppressWarnings("unchecked")
		Collection<Object> originalObjects = (Collection<Object>) super.getChoiceOfValues(object);
		List<Object> objects = new ArrayList<Object>(originalObjects);
		return objects;
	}
	
	
	
}
