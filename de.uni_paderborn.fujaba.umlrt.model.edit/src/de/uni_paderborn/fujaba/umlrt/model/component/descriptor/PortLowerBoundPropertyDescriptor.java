package de.uni_paderborn.fujaba.umlrt.model.component.descriptor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import de.uni_paderborn.fujaba.umlrt.model.component.Port;
import de.uni_paderborn.fujaba.umlrt.model.core.Cardinality;
import de.uni_paderborn.fujaba.umlrt.model.core.CoreFactory;
import de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber;

public class PortLowerBoundPropertyDescriptor extends ItemPropertyDescriptor {

	public PortLowerBoundPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}

	@Override
	public void setPropertyValue(Object object, Object value) {
		// Get the Port and it's current Cardinality.
		Port p = (Port) object;
		Cardinality oldCardinality = p.getCardinality();

		// Create a new Cardinality object.
		Cardinality newCardinality = CoreFactory.eINSTANCE.createCardinality();

		// In case the old Cardinality object had an upper bound, copy it. We do
		// not copy the lower bound here, as we are about to set a new one.
		if (oldCardinality != null && oldCardinality.getUpperBound() != null) {
			newCardinality.setUpperBound(oldCardinality.getUpperBound());
		}

		// Create the new NaturalNumber for the lower bound and set it's value.
		NaturalNumber lowerBoundNumber = CoreFactory.eINSTANCE
				.createNaturalNumber();
		lowerBoundNumber.setValue((Long) value);

		// Set the new lower bound for the Cardinality and set the Port's
		// Cardinality.
		newCardinality.setLowerBound(lowerBoundNumber);
		p.setCardinality(newCardinality);
	}

	@Override
	protected Object getValue(EObject object, EStructuralFeature feature) {
		Port p = (Port) object;

		if (p.getCardinality() != null
				&& p.getCardinality().getLowerBound() != null) {
			return p.getCardinality().getLowerBound().getValue();
		}

		return null;
	}
}