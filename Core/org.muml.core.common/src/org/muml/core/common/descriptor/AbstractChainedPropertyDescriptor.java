package org.muml.core.common.descriptor;

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

	/**
	 * Returns a unique id that consists of all id's of PropertyDescriptor in
	 * the chain. This way the id is unique for a chain.
	 * 
	 * @param object
	 *            The object.
	 * 
	 * @return The unique id.
	 */
	@Override
	public String getId(Object object) {
		String id = "";
		if (parent != null) {
			id += parent.getId(object);
		}
		return id + getMyId(object );
	}
	
	public String getMyId(Object object) {
		return super.getId(object);
	}

	@Override
	protected Object getValue(EObject object, EStructuralFeature feature) {
		EObject realObject = object;
		if (parent != null) {
			// recursively ask the parent PropertyDescriptor for the property
			// value of its own feature.
			// Note: getPropertyValue() internally calls getValue() again.
			Object value = getWrappedValue(parent.getPropertyValue(object));
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
		boolean notified = false;

		if (parent != null) {
			Object realObject = getWrappedValue(parent.getPropertyValue(object));
			if (realObject == null) {
				realObject = parent.createObject();
				parent.setPropertyValue(object, realObject);
			} else {
				// Notify recursively to root
				parent.notifyObject(object);
			}
			object = realObject;
		}

		// Get the real old value from EMF (for the notification)
		Object oldValue = super.getValue((EObject) object, getFeatureToNotify());

		// Set the new value
		doSetValue(object, value);

		// Notify
		if (!notified) {
			// Get the real new value from EMF (for the notification)
			Object newValue = super.getValue((EObject) object, getFeatureToNotify());
			doNotifyObject(object, oldValue, newValue);
		}
	}

	/**
	 * Auxiliary method to unwrap a value.
	 * 
	 * @param value
	 *            The PropertyValueWrapper.
	 * @return The wrapped value.
	 */
	protected static Object getWrappedValue(Object value) {
		if (value instanceof ItemPropertyDescriptor.PropertyValueWrapper) {
			value = ((ItemPropertyDescriptor.PropertyValueWrapper) value)
					.getEditableValue(value);
		}
		return value;
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
	public boolean isPropertySet(Object object) {
		Object realObject = object;
		if (parent != null) {
			// ask the parent PropertyDescriptor for the property
			// value of its feature
			Object value = getWrappedValue(parent.getPropertyValue(object));
			realObject = value;
		}

		if (realObject != null) {
			return doIsPropertySet(realObject);
		}

		return false;
	}
	public boolean doIsPropertySet(Object object) {
		return super.isPropertySet(object);
	}

	@Override
	public void notifyObject(Object object) {
		if (parent != null) {
			parent.notifyObject(object);
		}
		Object value = getValue((EObject) object, feature);
		doNotifyObject(object, value, value);
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

	public void doNotifyObject(Object object, Object oldValue, Object newValue) {
		EStructuralFeature featureToNotify = getFeatureToNotify();
		
		
		// TODO: This solution does not yet work, but should be preferred.
		// int eventType = Notification.SET;
		// if (featureToNotify()) {
		// // TODO: Is this always working correctly?
		// eventType = Notification.ADD_MANY;
		// }
		//
		// if (object instanceof InternalEObject) {
		// ((InternalEObject) object).eNotify(new ENotificationImpl(
		// (InternalEObject) object, eventType, featureToNotify, oldValue,
		// newValue));
		// }

		// TODO: It follows a hack to get this working quickly...

		// Test, if oldValue equals newValue. If not, we do not need to notify,
		// because setting the new value will send a notification later.
		if (oldValue == newValue
				|| (oldValue != null && oldValue.equals(newValue))
				|| (newValue != null && newValue.equals(oldValue))) {
			if (featureToNotify.isMany() && featureToNotify.isChangeable()) {
				// TODO
			} else if (featureToNotify.isChangeable()) {
				try {
					super.setPropertyValue(object, null);
				} catch (Exception e) {

				}
				try {
					super.setPropertyValue(object, newValue);
				} catch (Exception e) {

				}
			}
		}
	}

	protected EStructuralFeature getFeatureToNotify() {
		return feature;
	}

	@Override
	public Object getActualObject(Object object) {
		return getWrappedValue(parent.getPropertyValue(object));
	}

}
