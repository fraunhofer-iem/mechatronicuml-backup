package org.muml.core.common.descriptor;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

public class DefaultChainedPropertyDescriptor extends
		AbstractChainedPropertyDescriptor {

	protected EClass instanceClass;

	protected EStructuralFeature setFeature;

	public DefaultChainedPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature,
			EStructuralFeature setFeature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags,
			IChainedPropertyDescriptor parent) {
		this(adapterFactory, resourceLocator, displayName, description,
				feature, setFeature, isSettable, multiLine, sortChoices,
				staticImage, category, filterFlags);
		setParentDescriptor(parent);
	}

	public DefaultChainedPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature,
			EStructuralFeature setFeature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
		this.setFeature = setFeature;
	}

	public DefaultChainedPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags,
			IChainedPropertyDescriptor parent) {
		this(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
		setParentDescriptor(parent);
	}

	public DefaultChainedPropertyDescriptor(AdapterFactory adapterFactory,
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
		return EcoreUtil.create(getInstanceClass());
	}

	public EClass getInstanceClass() {
		if (instanceClass == null && feature.getEType() instanceof EClass) {
			this.instanceClass = (EClass) feature.getEType();
		}
		return instanceClass;
	}

	public void setInstanceClass(EClass instanceClass) {
		this.instanceClass = instanceClass;
	}

	protected EStructuralFeature getFeatureToNotify() {
		if (setFeature != null) {
			return setFeature;
		}
		return super.getFeatureToNotify();
	}

	@Override
	public void doSetValue(Object object, Object newValue) {
		if (setFeature != null) {
			Object oldValue = doGetValue((EObject) object, feature);
			applyChangesToFeature(setFeature, object, oldValue, newValue);
		} else {
			super.doSetValue(object, newValue);
		}
	}

	/**
	 * Convenience method to calculate the changes between two values and apply
	 * them to a feature. For many-features this means that the difference
	 * between the values in the list is calculated.
	 */
	@SuppressWarnings("unchecked")
	protected void applyChangesToFeature(EStructuralFeature featureToSet,
			Object object, Object oldValue, Object newValue) {
		Object oldSetFeatureValue = doGetValue((EObject) object, featureToSet);
		if (featureToSet.isMany() && oldSetFeatureValue instanceof Collection) {

			// TODO: Maybe we should use Setting Delegates for this...

			BasicEList<Object> added = new BasicEList<Object>();
			added.addAll((Collection<?>) newValue);
			added.removeAll((Collection<?>) oldValue);

			BasicEList<Object> removed = new BasicEList<Object>();
			removed.addAll((Collection<?>) oldValue);
			removed.removeAll((Collection<?>) newValue);

			((Collection<Object>) newValue).clear();
			((Collection<Object>) newValue)
					.addAll((Collection<Object>) oldSetFeatureValue);
			((Collection<Object>) newValue).addAll(added);
			((Collection<Object>) newValue).removeAll(removed);

		}
		doSetFeatureValue(featureToSet, object, newValue);
	}

	/**
	 * Convenience method to set a new value for a feature of the given object.
	 * 
	 * @param featureToSet
	 *            The feature to set.
	 * @param object
	 *            The object containing the feature.
	 * @param newValue
	 *            The value to set.
	 */
	private void doSetFeatureValue(EStructuralFeature featureToSet,
			Object object, Object newValue) {

		// Copied from ItemPropertyDescriptor.setPropertyValue()
		EObject eObject = (EObject) object;
		EditingDomain editingDomain = getEditingDomain(object);
		if (editingDomain == null) {
			eObject.eSet(featureToSet, newValue);
		} else {
			Command setCommand = SetCommand.create(editingDomain,
					getCommandOwner(eObject), featureToSet, newValue);
			editingDomain.getCommandStack().execute(setCommand);
		}
	}

}
