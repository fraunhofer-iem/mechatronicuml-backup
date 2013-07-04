package de.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.swt.widgets.Display;

import de.fujaba.properties.runtime.RuntimePlugin;

public abstract class AbstractStructuralFeaturePropertyEditor extends
		AbstractPropertyEditor implements IStructuralFeaturePropertyEditor {

	private List<EObject> hookedObjects = new ArrayList<EObject>();

	protected EStructuralFeature feature = null;
	
	protected EObject element;
	protected Object value;

	private Adapter adapter = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification msg) {
			internalNotify(msg);
		}
	};

	public AbstractStructuralFeaturePropertyEditor(EStructuralFeature feature) {
		this.feature = feature;
	}

	public String getFeatureDescription() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(RuntimePlugin.makeHumanReadable(feature.getName(), true));
		buffer.append(" of ");
		buffer.append(RuntimePlugin.makeHumanReadable(element.eClass().getName(), true));
		return buffer.toString();
	}

	@Override
	public EStructuralFeature getFeature() {
		return feature;
	}

	public EObject getElement() {
		return element;
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
		removeListeners();
	}

	@Override
	protected void inputChanged() {
		element = (EObject) input;
		
		// calls refresh because of input change
		super.inputChanged();

		// Update Value
		Object value = null;
		if (input != null) {
			value = element.eGet(feature);
		}
		updateValue(value);
		
		// Update Adapters
		updateAdapters();
	}

	private void updateValue(Object newValue) {
		if (newValue != value) {
			value = newValue;
			valueChanged();
		}
	}

	protected void updateAdapters() {
		removeListeners();
		
		if (input != null) {
			addListeners();
		}
	}

	private void internalNotify(final Notification notification) {
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
			updateValue(notification.getNewValue());
		}
	}
	
	protected void valueChanged() {
	}

	protected void removeListeners() {
		for (EObject element : hookedObjects) {
			element.eAdapters().remove(adapter);	
		}
		hookedObjects.clear();
	}
	
	protected void addListeners() {
		registerListener(element);
	}

	protected void registerListener(EObject element) {
		if (!hookedObjects.contains(element)) {
			hookedObjects.add(element);
			element.eAdapters().add(adapter);
		}
	}

	public void setValue(Object newValue) {
		EditingDomain editingDomain = AdapterFactoryEditingDomain
				.getEditingDomainFor(element);
		if (editingDomain == null) {
			element.eSet(feature, newValue);
		} else {
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, element, feature, newValue));
		}
	}

}
