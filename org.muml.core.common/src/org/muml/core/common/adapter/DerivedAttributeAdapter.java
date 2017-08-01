package org.muml.core.common.adapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * This is an adapter that keeps track of changes of dependent features. It was
 * originally copied from:
 * 
 * http://wiki.eclipse.org/EMF/Recipes#Recipe:_Derived_Attribute_Notifier
 * 
 * @author bingo
 * 
 */
public class DerivedAttributeAdapter extends AdapterImpl {

	/**
	 * The local features that this Adapter should listen to.
	 */
	private List<EStructuralFeature> localFeatures = new ArrayList<EStructuralFeature>();

	/**
	 * The tuples (navigationFeature, dependentFeature).
	 */
	private Map<EStructuralFeature, EStructuralFeature> navigations = new HashMap<EStructuralFeature, EStructuralFeature>();

	/**
	 * The derived feature that should be notified.
	 */
	protected final EStructuralFeature derivedFeature;

	/**
	 * The object that contains the derived feature.
	 */
	protected final InternalEObject containerObject;

	/**
	 * The adapter that hooks into the dependent feature.
	 */
	private AdapterImpl dependentAdapter = new AdapterImpl() {

		@Override
		public void notifyChanged(Notification notification) {

			if (notification.getFeature() != null
					&& getDependentFeatures().contains(
							notification.getFeature())) {
				notifyDependentAttributeChange(notification);
			}

		}
	};

	/**
	 * Constructs this DerivedAttributeAdapter.
	 * 
	 * @param containerObject
	 *            The object containing the derived feature.
	 * @param derivedFeature
	 *            The derived feature to notify.
	 */
	public DerivedAttributeAdapter(InternalEObject containerObject,
			EStructuralFeature derivedFeature) {
		super();
		this.derivedFeature = derivedFeature;
		this.containerObject = containerObject;
		containerObject.eAdapters().add(this);
	}

	/**
	 * Adds a local dependency for the given localFeature.
	 * 
	 * @param localFeature
	 *            The feature to add.
	 */
	public void addLocalDependency(EStructuralFeature localFeature) {
		localFeatures.add(localFeature);
	}

	/**
	 * Adds a navigated dependency for the given navigationFeature and
	 * dependentFeature.
	 * 
	 * @param navigationFeature
	 *            The feature to navigate over.
	 * @param dependentFeature
	 *            The feature, which contains the data to be derived.
	 */
	public void addNavigatedDependency(EStructuralFeature navigationFeature,
			EStructuralFeature dependentFeature) {
		navigations.put(navigationFeature, dependentFeature);
	}

	/**
	 * Returns the navigated features.
	 * 
	 * @return the navigated features.
	 */
	public Collection<EStructuralFeature> getNavigationFeatures() {
		return navigations.keySet();
	}

	/**
	 * Returns the dependent features.
	 * 
	 * @return the dependent features.
	 */
	public Collection<EStructuralFeature> getDependentFeatures() {
		return navigations.values();
	}

	/**
	 * Gets called whenever a feature was notified about a change. It will
	 * notify the derived feature and register the adapter into the new object,
	 * if necessary.
	 * 
	 * @param notification
	 *            The notification to send.
	 */
	@Override
	public void notifyChanged(Notification notification) {

		if (notification != null && notification.getFeature() != null
				&& getNavigationFeatures().contains(notification.getFeature())) {
			switch (notification.getEventType()) {
			// TODO support ADD_MANY/REMOVE_MANY?
			case Notification.ADD:
				EObject added = (EObject) notification.getNewValue();
				added.eAdapters().add(dependentAdapter);
				break;
			case Notification.SET:
				EObject newValue = (EObject) notification.getNewValue();
				EObject oldValue = (EObject) notification.getOldValue();
				if (oldValue != null) {
					oldValue.eAdapters().remove(dependentAdapter);
				}
				if (newValue != null) {
					newValue.eAdapters().add(dependentAdapter);
				}
				break;
			case Notification.REMOVE:
				EObject removed = (EObject) notification.getOldValue();
				removed.eAdapters().remove(dependentAdapter);
				break;
			default:
				return; // No notification
			}
			notifyNavigationAttributeChange(notification);
		} else if (localFeatures.contains(notification.getFeature())) {
			notifyDependentAttributeChange(notification);
		}
	}

	/**
	 * Notifies about the change of the navigation feature.
	 * 
	 * @param notification
	 *            The notification received.
	 */
	protected void notifyNavigationAttributeChange(Notification notification) {
		if (containerObject.eNotificationRequired()) {
			int eventType = notification.getEventType();
			if (notification.getEventType() == Notification.SET
					&& derivedFeature.isMany()) {
				// TODO: Is this always working correctly?
				eventType = Notification.ADD_MANY;
			} else if (!derivedFeature.isMany()) {
				eventType = Notification.SET;
			}
			containerObject.eNotify(new ENotificationImpl(containerObject,
					eventType, derivedFeature, notification.getOldValue(), containerObject.eGet(
							derivedFeature, true, true)));
		}
	}

	/**
	 * Notifies about the change of the dependent attribute.
	 * 
	 * @param notification
	 *            The notification received.
	 */
	protected void notifyDependentAttributeChange(Notification notification) {
		if (containerObject.eNotificationRequired()) {
			containerObject.eNotify(new ENotificationImpl(containerObject,
					notification.getEventType(), derivedFeature, notification
							.getOldValue(), notification.getNewValue()));
		}
	}

}
