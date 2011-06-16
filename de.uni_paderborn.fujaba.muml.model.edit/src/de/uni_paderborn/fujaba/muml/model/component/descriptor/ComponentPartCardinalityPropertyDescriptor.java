package de.uni_paderborn.fujaba.muml.model.component.descriptor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.core.Cardinality;

public class ComponentPartCardinalityPropertyDescriptor extends
		CardinalityPropertyDescriptor {

	public ComponentPartCardinalityPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description, feature,
				isSettable, multiLine, sortChoices, staticImage, category, filterFlags);
	}

	@Override
	protected EObject getNavigatedObject(Object object) {
		return ((ComponentPart) object).getCardinality();
	}

	@Override
	protected void setNavigatedObject(Object object, EObject newObject) {
		((ComponentPart) object).setCardinality((Cardinality) newObject);
	}

}
