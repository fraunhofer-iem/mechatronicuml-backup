package de.uni_paderborn.fujaba.muml.model.core.descriptor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.common.descriptor.DefaultNavigatedObjectPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.model.core.CoreFactory;
import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;

/**
 * 
 * @generated NOT
 * 
 * @author bingo
 * 
 */
public class NaturalNumberNavigatedObjectPropertyDescriptor extends
		DefaultNavigatedObjectPropertyDescriptor {

	public NaturalNumberNavigatedObjectPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags,
			EStructuralFeature navigatedFeature) {
		super(adapterFactory, resourceLocator, displayName, description, feature,
				isSettable, multiLine, sortChoices, staticImage, category, filterFlags,
				navigatedFeature);
	}

	public NaturalNumberNavigatedObjectPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags,
			EStructuralFeature navigatedFeature, EClass instanceClass) {
		super(adapterFactory, resourceLocator, displayName, description, feature,
				isSettable, multiLine, sortChoices, staticImage, category, filterFlags,
				navigatedFeature, instanceClass);
	}

	@Override
	protected Object getValue(EObject object, EStructuralFeature feature) {
		Object value = super.getValue(object, feature);
		if (value != null) {
			return value.toString();
		}
		return null;
	}

	@Override
	protected void configureObject(EObject newObject,
			EStructuralFeature feature, Object value) {
		NaturalNumber naturalNumber = CoreFactory.eINSTANCE
				.createNaturalNumber();
		naturalNumber.setValue((String) value);
		
		super.configureObject(newObject, feature, naturalNumber);
	}

}