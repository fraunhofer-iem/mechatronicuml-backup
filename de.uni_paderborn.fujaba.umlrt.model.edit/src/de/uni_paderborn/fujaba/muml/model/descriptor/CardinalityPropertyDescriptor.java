package de.uni_paderborn.fujaba.muml.model.descriptor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.common.descriptor.NavigatedObjectPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.model.core.Cardinality;
import de.uni_paderborn.fujaba.muml.model.core.CoreFactory;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
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

		if (feature instanceof EReference) {
			EReference reference = (EReference) feature;
			if (reference.getContainerClass() == Cardinality.class) {
				int featureID = reference.getFeatureID();
				switch (featureID) {
				case CorePackage.CARDINALITY__LOWER_BOUND:
					((Cardinality) newObject).setLowerBound(naturalNumber);
					break;
				case CorePackage.CARDINALITY__UPPER_BOUND:
					((Cardinality) newObject).setUpperBound(naturalNumber);
					break;
				}
			}
		}
	}

	@Override
	protected Object getObjectValue(EObject navigatedObject,
			EStructuralFeature feature) {

		if (feature.getContainerClass() == Cardinality.class) {
			int featureID = feature.getFeatureID();
			switch (featureID) {
			case CorePackage.CARDINALITY__LOWER_BOUND:
				NaturalNumber lowerBound = ((Cardinality) navigatedObject)
						.getLowerBound();
				if (lowerBound != null) {
					return lowerBound.toString();
				}
				break;
			case CorePackage.CARDINALITY__UPPER_BOUND:
				NaturalNumber upperBound = ((Cardinality) navigatedObject)
						.getUpperBound();
				if (upperBound != null) {
					return upperBound.toString();
				}
				break;
			}

		}
		return null;

	}

}
