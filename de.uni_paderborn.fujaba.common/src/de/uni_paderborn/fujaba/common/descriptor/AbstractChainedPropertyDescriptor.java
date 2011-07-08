package de.uni_paderborn.fujaba.common.descriptor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

public abstract class AbstractChainedPropertyDescriptor extends
		ItemPropertyDescriptor implements IChainedPropertyDescriptor {

	private IChainedPropertyDescriptor parent;

	/**
	 * Constructs this AbstractChainedPropertyDescriptor.
	 */
	public AbstractChainedPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}

	@Override
	public String getId(Object object) {
		String id = "";
		if (parent != null) {
			id += parent.getId(object);
		}
		return id + super.getId(object);
	}

	@Override
	protected Object getValue(EObject object, EStructuralFeature feature) {
		EObject realObject = object;
		if (parent != null) {
			// recursively ask the parent PropertyDescriptor for the property
			// value of its own feature.
			// Note: getPropertyValue() internally calls getValue() again.
			Object value = parent.getPropertyValue(object);
			if (value instanceof ItemPropertyDescriptor.PropertyValueWrapper) {
				value = ((ItemPropertyDescriptor.PropertyValueWrapper) value).getEditableValue(value);
			}
			realObject = (EObject) value; 
		}

		if (realObject != null) {
			return doGetValue(realObject, feature);
		}

		if (feature.isMany()) {
			return ECollections.EMPTY_ELIST;
		}

		return null;
	}

	@Override
	public void setPropertyValue(Object object, Object value) {
		if (parent != null) {
			Object realObject = parent.getPropertyValue(object);
			if (realObject instanceof ItemPropertyDescriptor.PropertyValueWrapper) {
				realObject = ((ItemPropertyDescriptor.PropertyValueWrapper) realObject).getEditableValue(value);
			}
			if (realObject == null) {
				realObject = parent.createObject();
				parent.setPropertyValue(object, realObject);
			}
			object = realObject;
		}
		doSetValue(object, value);
	}

	@Override
	public Object doGetValue(EObject object, EStructuralFeature feature) {
		// Default implementation calls getValue() from super implementation,
		// which just gets the value directly.
		return super.getValue(object, feature);
	}

	@Override
	public void doSetValue(Object object, Object value) {
		// Default implementation calls setPropertyValue() from super
		// implementation, which just sets the value directly.
		super.setPropertyValue(object, value);
	}

	@Override
	public abstract Object createObject();

	@Override
	public IChainedPropertyDescriptor getParentDescriptor() {
		return parent;
	}

	@Override
	public void setParentDescriptor(IChainedPropertyDescriptor parent) {
		this.parent = parent;
	}

}
