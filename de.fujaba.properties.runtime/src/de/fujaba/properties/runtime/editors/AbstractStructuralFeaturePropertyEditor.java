package de.fujaba.properties.runtime.editors;

import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Display;

public abstract class AbstractStructuralFeaturePropertyEditor extends AbstractPropertyEditor implements
		IStructuralFeaturePropertyEditor {

	private List<EObject> hookedObjects;
	
	protected EStructuralFeature feature = null;
	
	private Adapter adapter = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification msg) {
			internalNotify(msg);
		}
	};
	
	public AbstractStructuralFeaturePropertyEditor(EStructuralFeature feature) {
		this.feature = feature;
	}

	@Override
	public EStructuralFeature getFeature() {
		return feature;
	}

	public EObject getElement() {
		return (EObject) input;
	}

	@Override
	public void setInput(Object object) {
		// When object is of wrong type, unset current object and use none.
		if (false == object instanceof EObject) {
			object = null;
		}
		super.setInput(object);
	}

	@Override
	public void dispose() {
		setInput(null); // remove listeners
	}

	protected void inputChanged() {
		super.inputChanged();
		updateAdapters();
	}
	
	protected void updateAdapters() {
		for (EObject element : hookedObjects) {
			unregisterListener(element);
		}
		addListeners();
	}

	protected void internalNotify(final Notification notification) {
		if (Display.getCurrent() == null) {
			// execute refresh() in the SWT ui thread
			Display.getDefault().asyncExec(new Runnable() {
				@Override
				public void run() {
					handleNotificationEvent(notification);
				}
			});
		} else {
			handleNotificationEvent(notification);
		}
	}
	
	protected void handleNotificationEvent(Notification notification) {
		if (notification.getFeature() == feature) {
			refresh();
		}
	}

	protected void addListeners() {
		registerListener((EObject) input);
	}

	
	protected void registerListener(EObject element) {
		if (!hookedObjects.contains(element)) {
			hookedObjects.add(element);
			element.eAdapters().add(adapter);
		}
	}

	protected void unregisterListener(EObject element) {
		element.eAdapters().remove(adapter);

	}

}
