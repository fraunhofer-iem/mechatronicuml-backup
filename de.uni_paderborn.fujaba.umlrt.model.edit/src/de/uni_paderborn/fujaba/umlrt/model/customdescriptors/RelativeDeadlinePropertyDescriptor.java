package de.uni_paderborn.fujaba.umlrt.model.customdescriptors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import de.uni_paderborn.fujaba.umlrt.model.core.CoreFactory;
import de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Deadline;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition;

/**
 * 
 * @generated NOT
 * 
 * @author braun
 *
 */
public class RelativeDeadlinePropertyDescriptor extends
		ItemPropertyDescriptor {

	public RelativeDeadlinePropertyDescriptor(AdapterFactory adapterFactory,
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
		return RealtimestatechartFactory.eINSTANCE.createRelativeDeadline();
	}

	protected void configureObject(EObject newObject,
			EStructuralFeature feature, Object value) {
		NaturalNumber naturalNumber = CoreFactory.eINSTANCE
				.createNaturalNumber();
		naturalNumber.setValue((String) value);

		if (feature instanceof EReference) {
			EReference reference = (EReference) feature;
			if (reference.getContainerClass() == Deadline.class) {
				int featureID = reference.getFeatureID();
				switch (featureID) {
				case RealtimestatechartPackage.RELATIVE_DEADLINE__LOWER_BOUND:
					((RelativeDeadline) newObject).setLowerBound(naturalNumber);
					break;
				case RealtimestatechartPackage.RELATIVE_DEADLINE__UPPER_BOUND:
					((RelativeDeadline) newObject).setUpperBound(naturalNumber);
					break;
				}
			}
		}
	}

	protected Object getObjectValue(EObject navigatedObject,
			EStructuralFeature feature) {

		if (feature.getContainerClass() == Deadline.class) {
			int featureID = feature.getFeatureID();
			switch (featureID) {
			case RealtimestatechartPackage.RELATIVE_DEADLINE__LOWER_BOUND:
				NaturalNumber lowerBound = ((RelativeDeadline) navigatedObject)
						.getLowerBound();
				if (lowerBound != null) {
					return lowerBound.toString();
				}
				break;
			case RealtimestatechartPackage.RELATIVE_DEADLINE__UPPER_BOUND:
				NaturalNumber upperBound = ((RelativeDeadline) navigatedObject)
						.getUpperBound();
				if (upperBound != null) {
					return upperBound.toString();
				}
				break;
			}

		}
		return null;

	}

	protected EObject getNavigatedObject(Object object) {
		return ((Transition) object).getRelativeDeadline();
	}
	
	protected void setNavigatedObject(Object object, EObject newObject) {
		((Transition) object).setRelativeDeadline((RelativeDeadline) newObject);
	}
	
	
}