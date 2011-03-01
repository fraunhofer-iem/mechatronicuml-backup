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

public class PortUpperBoundPropertyDescriptor extends ItemPropertyDescriptor {

	public PortUpperBoundPropertyDescriptor(AdapterFactory adapterFactory,
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

		// In case the old Cardinality object had a lower bound, copy it. We do
		// not copy the upper bound here, as we are about to set a new one.
		if (oldCardinality != null && oldCardinality.getLowerBound() != null) {
			newCardinality.setLowerBound(oldCardinality.getLowerBound());
		}

		// Create the new NaturalNumber for the upper bound and set it's value.
		NaturalNumber upperBoundNumber = CoreFactory.eINSTANCE
				.createNaturalNumber();
		upperBoundNumber.setValue((Long) value);

		// Set the new upper bound for the Cardinality and set the Port's
		// Cardinality.
		newCardinality.setUpperBound(upperBoundNumber);
		p.setCardinality(newCardinality);
	}

	@Override
	protected Object getValue(EObject object, EStructuralFeature feature) {
		Port p = (Port) object;

		if (p.getCardinality() != null
				&& p.getCardinality().getUpperBound() != null) {
			return p.getCardinality().getUpperBound().getValue();
		}

		return null;
	}
}