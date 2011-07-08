package de.uni_paderborn.fujaba.muml.model.core.descriptor;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.common.descriptor.DefaultChainedPropertyDescriptor;
import de.uni_paderborn.fujaba.common.descriptor.IChainedPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.model.core.CoreFactory;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;

public class NaturalNumberPropertyDescriptor extends
		DefaultChainedPropertyDescriptor {

	public NaturalNumberPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags,
			IChainedPropertyDescriptor parent) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags, CorePackage.Literals.NATURAL_NUMBER,
				parent);
	}

	public NaturalNumberPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}

	@Override
	public Object createObject() {
		Assert.isTrue(
				false,
				"Tried to use NaturalNumberPropretyDescriptor as parent for another PropertyDescriptor.\n"
						+ "This is not possible, as NaturalNumberPropretyDescriptor creates Strings, which cannot be used as input object for another ItemPropertyDescriptor.");
		return null;
	}

	@Override
	public Object doGetValue(EObject object, EStructuralFeature feature) {
		Object value = super.doGetValue(object, feature);
		if (value != null) {
			return value.toString();
		}
		return null;
	}

	@Override
	public void doSetValue(Object object, Object value) {
		NaturalNumber naturalNumber = CoreFactory.eINSTANCE.createNaturalNumber();
		naturalNumber.setValue((String) value);
		super.doSetValue(object, naturalNumber);
	}


}