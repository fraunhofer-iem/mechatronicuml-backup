package de.uni_paderborn.fujaba.muml.model.pattern.descriptor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.muml.model.component.descriptor.CardinalityPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.model.core.Cardinality;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;

public class RoleCardinalityPropertyDescriptor extends
		CardinalityPropertyDescriptor {

	public RoleCardinalityPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description, feature,
				isSettable, multiLine, sortChoices, staticImage, category, filterFlags);
	}

	@Override
	protected EObject getNavigatedObject(Object object) {
		return ((Role) object).getCardinality();
	}

	@Override
	protected void setNavigatedObject(Object object, EObject newObject) {
		((Role) object).setCardinality((Cardinality) newObject);
	}

}
