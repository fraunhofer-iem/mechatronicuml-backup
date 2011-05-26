package de.uni_paderborn.fujaba.adapter;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * This is an adapter that keeps track of changes of dependant features. It was
 * copied from:
 * 
 * http://wiki.eclipse.org/EMF/Recipes#Recipe:_Derived_Attribute_Notifier
 * 
 * @author bingo
 * 
 */
public class DerivedAttributeAdapter extends AdapterImpl {

	private List<EStructuralFeature> localFeatures = new ArrayList<EStructuralFeature>();

	// TODO this lot could be put into a subclass and put in a list to allow for
	// multiple navigated dependencies
	private EStructuralFeature dependantFeature = null;
	private EStructuralFeature navigationFeature = null;

	protected boolean isManyFeature;
	
	protected final EStructuralFeature derivedFeature;
	protected final InternalEObject source;

	private AdapterImpl dependantAdapter = new AdapterImpl() {

		@Override
		public void notifyChanged(Notification notification) {
			if (notification.getFeature() != null && notification.getFeature().equals(dependantFeature)) {
				notifyDerivedAttributeChange(notification);
			}
		}
	};

	public DerivedAttributeAdapter(EObject source,
			EStructuralFeature derivedFeature, boolean isManyFeature) {
		super();
		this.isManyFeature = isManyFeature;
		this.derivedFeature = derivedFeature;
		this.source = (InternalEObject) source;
		source.eAdapters().add(this);
	}

	public void addNavigatedDependency(EStructuralFeature navigationFeature,
			EStructuralFeature dependantFeature) {
		this.dependantFeature = dependantFeature;
		this.navigationFeature = navigationFeature;
	}

	public void addLocalDependency(EStructuralFeature localFeature) {
		localFeatures.add(localFeature);
	}

	@Override
	public void notifyChanged(Notification notification) {

		if (notification != null && notification.getFeature() != null
				&& notification.getFeature().equals(navigationFeature)) {
			switch (notification.getEventType()) {
			// TODO support ADD_MANY/REMOVE_MANY?
			case Notification.ADD:
				EObject added = (EObject) notification.getNewValue();
				added.eAdapters().add(dependantAdapter);
				break;
			case Notification.SET:
				EObject newValue = (EObject) notification.getNewValue();
				EObject oldValue = (EObject) notification.getOldValue();
				if (oldValue != null)
					oldValue.eAdapters().remove(dependantAdapter);
				if (newValue != null)
					newValue.eAdapters().add(dependantAdapter);
				break;
			case Notification.REMOVE:
				EObject removed = (EObject) notification.getOldValue();
				removed.eAdapters().remove(dependantAdapter);
				break;
			default:
				return; // No notification
			}
			notifyNavigationAttributeChange(notification);
		} else if (localFeatures.contains(notification.getFeature())) {
			notifyDerivedAttributeChange(notification);
		}
	}

	protected void notifyNavigationAttributeChange(Notification notification) {
		if (source.eNotificationRequired()) {
			int eventType = notification.getEventType();
			if (notification.getEventType() == Notification.SET && isManyFeature) {
				// TODO: Is this always working correctly?
				eventType = Notification.ADD_MANY;
			} else if (!isManyFeature) {
				eventType = Notification.SET;
			}
			source.eNotify(new ENotificationImpl(source, eventType,
					derivedFeature, null, source.eGet(derivedFeature, true, true)));
		}
	}

	protected void notifyDerivedAttributeChange(Notification notification) {
		if (source.eNotificationRequired()) {
			source.eNotify(new ENotificationImpl(source, notification.getEventType(),
					derivedFeature, notification.getOldValue(), notification.getNewValue()));
		}
	}
}
