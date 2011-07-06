package de.uni_paderborn.fujaba.muml.model.core.descriptor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import de.uni_paderborn.fujaba.muml.model.core.CoreFactory;
import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;

/**
 * 
 * @generated NOT
 * 
 * @author bingo
 * 
 */
public class NaturalNumberPropertyDescriptor extends ItemPropertyDescriptor {

	public NaturalNumberPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description, feature,
				isSettable, multiLine, sortChoices, staticImage, category, filterFlags);
	}

	@Override
	protected Object getValue(EObject object, EStructuralFeature feature) {
		return super.getValue(object, feature).toString();
	}

	@Override
	public void setPropertyValue(Object object, Object value) {
		NaturalNumber naturalNumber = CoreFactory.eINSTANCE
				.createNaturalNumber();
		naturalNumber.setValue((String) value);
		
		super.setPropertyValue(object, naturalNumber);
	}

}