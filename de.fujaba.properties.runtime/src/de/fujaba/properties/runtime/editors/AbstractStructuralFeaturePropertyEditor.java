package de.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.swt.widgets.Display;

import de.fujaba.properties.runtime.RuntimePlugin;

public abstract class AbstractStructuralFeaturePropertyEditor extends
		AbstractPropertyEditor implements IStructuralFeaturePropertyEditor {

	private List<EObject> hookedObjects = new ArrayList<EObject>();

	protected EStructuralFeature feature = null;
	
	protected EObject element;
	
	protected Object value;
	
	protected IItemPropertyDescriptor itemPropertyDescriptor;
	protected List<IValueChangedListener> valueChangedListeners = new ArrayList<IValueChangedListener>();
	
	private Adapter adapter = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification msg) {
			internalNotify(msg);
		}
	};

	public AbstractStructuralFeaturePropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature) {
		super(adapterFactory);
		this.feature = feature;
	}

	public String getLabelText() {
		return RuntimePlugin.makeHumanReadable(feature.getName(), true) + ":";
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
		super.dispose();
		removeListeners();
	}

	@Override
	protected void inputChanged() {
		element = (EObject) input;
		
		// Reset itemPropertyDescriptor
		itemPropertyDescriptor = null;
		if (adapterFactory != null && input != null) {
			IItemPropertySource ips = (IItemPropertySource) adapterFactory.adapt(input,
					IItemPropertySource.class);
			for (IItemPropertyDescriptor descriptor : ips.getPropertyDescriptors(input)) {
				if (feature.equals(descriptor.getFeature(input))) {
					itemPropertyDescriptor = descriptor;
					break;
				}
			}
		}
		
		// calls refresh because of input change
		super.inputChanged();

		// Update Value
		updateValue();
		
		// Update Adapters
		updateAdapters();
	}
	
	private Object unwrap(Object value) {
		if (value instanceof ItemPropertyDescriptor.PropertyValueWrapper) {
			return ((ItemPropertyDescriptor.PropertyValueWrapper) value).getEditableValue(value);
		}
		return value;
	}

	private void updateValue() {
		Object newValue = null;
		if (element != null) {
			if (itemPropertyDescriptor != null) {
				newValue = unwrap(itemPropertyDescriptor.getPropertyValue(element));
			} else {
				newValue = element.eGet(feature);
			}
		}
		if (newValue != value || (value != null && !value.equals(newValue))) {
			value = newValue;
			if (feature.isMany()) { // copy collection
				value = new ArrayList<Object>((Collection<?>) value);
			}
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
			updateValue();
		}
	}

	public void addValueChangedListener(IValueChangedListener listener) {
		valueChangedListeners.add(listener);
	}
	
	public void removeValueChangedListener(IValueChangedListener listener) {
		valueChangedListeners.remove(listener);
	}
	
	protected void valueChanged() {
		for (IValueChangedListener listener : valueChangedListeners) {
			listener.valueChanged(value);
		}
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
	
	public void setValue(final Object newValue) {
		if (value == null && newValue != null || !value.equals(newValue)) {
			EditingDomain editingDomain = getEditingDomain(element);
			editingDomain.getCommandStack().execute(new ChangeCommand(element) {
	
				@Override
				protected void doExecute() {
					internalSetValue(newValue);
				}
			
			});
		}
	}
	
	protected void internalSetValue(Object newValue) {
		Object oldValue = value;
		if (feature.isMany()) { // copy list
			oldValue = new ArrayList<Object>((Collection<?>)oldValue);
		}

		if (itemPropertyDescriptor != null) {
			itemPropertyDescriptor.setPropertyValue(element, newValue);
		} else {
			element.eSet(feature, newValue);
		}
		
		// Delete values that are not contained anymore
		if (feature instanceof EReference && ((EReference)feature).isContainment()) {
			if (!feature.isMany() && oldValue != null && newValue == null ) {
				DeleteCommand.create(getEditingDomain(element), oldValue).execute();
			} else if (feature.isMany()) {
				List<?> oldValues = new ArrayList<Object>((Collection<?>) oldValue);
				oldValues.removeAll((Collection<?>) newValue);
				DeleteCommand.create(getEditingDomain(element), oldValues).execute();
			}
		}
	}

	public EditingDomain getEditingDomain(Object object) {
		return AdapterFactoryEditingDomain.getEditingDomainFor(object);
	}
	
	protected Collection<?> getChoices() {
		Collection<?> choices = null;
		if (feature.getEType() == EcorePackage.Literals.EBOOLEAN) {
			choices = Arrays.asList(new Boolean[] { true, false });
		}
		if (choices == null && itemPropertyDescriptor != null) {
			choices = itemPropertyDescriptor.getChoiceOfValues(input);
		}
		if (choices == null) {
			choices = Collections.emptyList();
		}
		
		// Make sure optional <=> choices.contains(null)
		boolean optional = feature.getLowerBound() <= 0;
		if (optional != choices.contains(null)) {
			choices = new ArrayList<Object>(choices); // make choices modifiable
			if (optional) {
				choices.add(null);
			} else {
				choices.remove(null);
			}
		}
		
		return choices;
	}

}
