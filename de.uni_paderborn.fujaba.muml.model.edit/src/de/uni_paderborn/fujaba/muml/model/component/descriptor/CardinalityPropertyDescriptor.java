package de.uni_paderborn.fujaba.muml.model.component.descriptor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.common.descriptor.NavigatedObjectPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.model.core.CoreFactory;
import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;

/**
 * 
 * @generated NOT
 * 
 * @author bingo
 * 
 */
public abstract class CardinalityPropertyDescriptor extends
		NavigatedObjectPropertyDescriptor {

	public CardinalityPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}

	@Override
	protected EObject createNewObject() {
		return CoreFactory.eINSTANCE.createCardinality();
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
