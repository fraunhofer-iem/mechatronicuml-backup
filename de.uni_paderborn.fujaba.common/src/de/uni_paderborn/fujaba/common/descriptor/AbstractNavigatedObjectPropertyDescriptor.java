package de.uni_paderborn.fujaba.common.descriptor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

/**
 * A PropertyDescriptor for navigated features.
 * 
 * @author bingo
 * 
 */
public abstract class AbstractNavigatedObjectPropertyDescriptor extends
		ItemPropertyDescriptor implements INavigatedObjectPropertyDescriptor {

	/**
	 * Constructs this NavigatedObjectPropertyDescriptor.
	 */
	public AbstractNavigatedObjectPropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, boolean multiLine, boolean sortChoices,
			Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}

	/**
	 * Sets the value for the property.
	 * 
	 * @param object
	 *            The object to set a value for.
	 * @param value
	 *            The value to set
	 */
	@Override
	public void setPropertyValue(Object object, Object value) {
		// TODO: Use commands, see super implementation!

		EObject oldObject = getNavigatedObject(object);

		EObject newObject;
		if (oldObject == null) {
			newObject = createNewObject();
		} else {

			// TODO: It is no good style to create a copy, just to fire the
			// notification.
			// newObject = oldObject;
			newObject = EcoreUtil.copy(oldObject);

		}

		configureObject(newObject, (EStructuralFeature) getFeature(this), value);

		// We could use this hack to send the notification:
		// setNavigatedObject(object, null);

		//
		// Another possibility would be to install a DerivedAttributeAdapter in
		// the model code.
		//

		// Set the new Object.
		setNavigatedObject(object, newObject);

	}

	@Override
	protected Object getValue(EObject object, EStructuralFeature feature) {
		EObject navigatedObject = getNavigatedObject(object);
		if (navigatedObject != null) {
			return getObjectValue(navigatedObject, feature);
		}
		if (feature.isMany()) {
			return ECollections.EMPTY_ELIST;
		}
		return null;
	}

	protected abstract EObject getNavigatedObject(Object object);

	protected abstract EObject createNewObject();

	protected void configureObject(EObject newObject,
			EStructuralFeature feature, Object newValue) {
		newObject.eSet(feature, newValue);
	}

	protected abstract void setNavigatedObject(Object object, EObject newObject);

	protected Object getObjectValue(EObject navigatedObject,
			EStructuralFeature feature) {
		if (feature.getContainerClass().isAssignableFrom(
				navigatedObject.getClass())) {
			return navigatedObject.eGet(feature);
		}
		if (feature.isMany()) {
			return ECollections.EMPTY_ELIST;
		}
		return null;
	}

}