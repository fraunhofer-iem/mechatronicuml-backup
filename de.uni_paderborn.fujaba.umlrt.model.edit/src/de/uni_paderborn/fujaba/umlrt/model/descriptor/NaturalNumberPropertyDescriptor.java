package de.uni_paderborn.fujaba.umlrt.model.descriptor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import de.uni_paderborn.fujaba.umlrt.model.core.CoreFactory;
import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;
import de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint;

/**
 * 
 * @generated NOT
 * 
 * @author braun
 *
 */
public class NaturalNumberPropertyDescriptor extends
		ItemPropertyDescriptor {

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
	public void setPropertyValue(Object object, Object value) {
		EObject oldObject = getNavigatedObject(object);

		EObject newObject;
		if (oldObject == null) {
			newObject = createNewObject();
		} else {
			newObject = EcoreUtil.copy(oldObject);
		}

		configureObject(newObject, (EStructuralFeature) getFeature(this), value);

		setNavigatedObject(object, newObject);
	}

	@Override
	protected Object getValue(EObject object, EStructuralFeature feature) {
		EObject navigatedObject = getNavigatedObject(object);
		if (navigatedObject != null) {
			return getObjectValue(navigatedObject, feature);
		}
		return null;
	}

	protected EObject createNewObject() {
		return CoreFactory.eINSTANCE.createNaturalNumber();
	}

	protected void configureObject(EObject newObject,
			EStructuralFeature feature, Object value) {

		if (feature instanceof EAttribute) {
			EAttribute reference = (EAttribute) feature;
			if (reference.getContainerClass() == NaturalNumber.class) {
				int featureID = reference.getFeatureID();
				switch (featureID) {
				case CorePackage.NATURAL_NUMBER__VALUE:
					((NaturalNumber) newObject).setValue((Long)value);
					break;
				}
			}
		}
	}

	protected Object getObjectValue(EObject navigatedObject,
			EStructuralFeature feature) {

		if (feature.getContainerClass() == NaturalNumber.class) {
			int featureID = feature.getFeatureID();
			switch (featureID) {
			case CorePackage.NATURAL_NUMBER__VALUE:
				 Long lowerBound = ((NaturalNumber) navigatedObject)
						.getValue();
				if (lowerBound != null) {
					return lowerBound.toString();
				}
				break;
			}

		}
		return null;

	}

	protected EObject getNavigatedObject(Object object) {
		return ((ClockConstraint) object).getBound();
	}
	
	protected void setNavigatedObject(Object object, EObject newObject) {
		((ClockConstraint) object).setBound((NaturalNumber) newObject);
	}	
}