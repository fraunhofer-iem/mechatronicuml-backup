package de.uni_paderborn.fujaba.umlrt.model.customdescriptors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

/**
 * 
 * @generated NOT
 * 
 * @author bingo
 *
 */
public abstract class NavigatedObjectPropertyDescriptor extends
		ItemPropertyDescriptor {

	public NavigatedObjectPropertyDescriptor(AdapterFactory adapterFactory,
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

		// Create a new TextualExpression object.
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

	protected abstract EObject getNavigatedObject(Object object);

	protected abstract EObject createNewObject();

	protected abstract void configureObject(EObject newObject,
			EStructuralFeature feature, Object value);

	protected abstract void setNavigatedObject(Object object, EObject newObject);

	protected abstract Object getObjectValue(EObject navigatedObject,
			EStructuralFeature feature);

}