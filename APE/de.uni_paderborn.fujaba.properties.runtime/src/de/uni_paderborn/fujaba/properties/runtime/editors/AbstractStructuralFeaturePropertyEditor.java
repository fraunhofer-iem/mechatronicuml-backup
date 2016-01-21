package de.uni_paderborn.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.swt.widgets.Display;

import de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin;
import de.uni_paderborn.fujaba.properties.runtime.constraint.ICreationConstraintContributor;
import de.uni_paderborn.fujaba.properties.runtime.filter.ICreationFilter;

public abstract class AbstractStructuralFeaturePropertyEditor extends
		AbstractPropertyEditor implements IStructuralFeaturePropertyEditor {

	private List<EObject> hookedObjects = new ArrayList<EObject>();
	protected List<ICreationFilter> creationFilters = new ArrayList<ICreationFilter>();
	
	private Map<Adapter, ResourceSet> eventAdapters = new HashMap<Adapter, ResourceSet>();

	private Map<Adapter, OCLExpression> oclAdapters = new HashMap<Adapter, OCLExpression>();

	protected EStructuralFeature feature = null;
	
	protected EObject element;
	
	protected Object value;
	
	private List<EClass> creationEClasses = null;

	
	protected boolean refreshWhenResourceSetChanges = false;
	
	protected IItemPropertyDescriptor itemPropertyDescriptor;
	protected List<IValueChangedListener> valueChangedListeners = new ArrayList<IValueChangedListener>();
	
	protected Adapter adapter = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification msg) {
			internalNotify(msg);
		}
	};
	
	protected EContentAdapter contentAdapter = new EContentAdapter() {
		@Override
		public void notifyChanged(Notification msg) {
			internalNotify(msg);
		}
	};

	public AbstractStructuralFeaturePropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature) {
		super(adapterFactory);
		this.feature = feature;
		if (feature instanceof EReference) {
			for (ICreationConstraintContributor contributor : RuntimePlugin.getCreationConstraintContributors()) {
				creationFilters.addAll(contributor.getCreationConstraints((EReference) feature));	
			}
		}
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
	
		// Also do not change the value, if the resource has not been set, yet.
		// Reason: Notification is sent before and after the container is set,
		//         so we only react on the second notification.
		if (false == object instanceof EObject || ((EObject) object).eResource() == null) {
			object = null;
		}
		super.setInput(object);
	}

	@Override
	public void dispose() {
		super.dispose();
		removeListeners();
	}
	

	public static IItemPropertyDescriptor getItemPropertyDescriptor(AdapterFactory adapterFactory, 
			EStructuralFeature feature, Object input) {
		IItemPropertyDescriptor itemPropertyDescriptor = null;

		if (adapterFactory != null && input != null) {
			IItemPropertySource ips = (IItemPropertySource) adapterFactory.adapt(input,
					IItemPropertySource.class);
			if (ips != null) {
				for (IItemPropertyDescriptor descriptor : ips.getPropertyDescriptors(input)) {
					if (feature.equals(descriptor.getFeature(input))) {
						itemPropertyDescriptor = descriptor;
						break;
					}
				}
			}
		}
		return itemPropertyDescriptor;
	}


	@Override
	protected void inputChanged(Object oldObject) {
		element = (EObject) input;
		
		// Reset itemPropertyDescriptor
		itemPropertyDescriptor = getItemPropertyDescriptor(adapterFactory, feature, input);
		
		if (itemPropertyDescriptor != null && (tooltipMessage == null || tooltipMessage.isEmpty())) {
			tooltipMessage = itemPropertyDescriptor.getDescription(input);
		}
		installTooltip();
		
		// calls refresh because of input change
		super.inputChanged(oldObject);

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
			boolean hasResource = true;
			if (newValue instanceof EObject) {
				EObject eObject = (EObject) newValue;
				hasResource = eObject.eResource() != null;
			}
			
			// Do not change the value, if the resource has not been set, yet.
			// Reason: Notification is sent before and after the container is set,
			//         so we only react on the second notification.
			if (hasResource) {
				value = newValue;
				if (feature.isMany() && value != null) { // copy collection
					value = new ArrayList<Object>((Collection<?>) value);
				}
				valueChanged();
			}
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
		if (refreshWhenResourceSetChanges && !isDisposed()) {
			refresh();
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

	protected void updateAdapters() {
		removeListeners();
		if (input != null) {
			addListeners();
		}
	}
	protected void removeListeners() {
		removeEventAdapters();
		for (EObject element : hookedObjects) {
			element.eAdapters().remove(adapter);	
		}
		hookedObjects.clear();
	}
	
	protected void addListeners() {
		registerListener(element);
		
		if (refreshWhenResourceSetChanges) {
			ResourceSet resourceSet = getResourceSet();
			if (resourceSet != null)  {
				resourceSet.eAdapters().add(contentAdapter);
				eventAdapters.put(contentAdapter, resourceSet);
			}
		}
		
		// Register those expressions that could not be registered before, because no editing domain was known before the first inputChanged() call
		if (!oclAdapters.isEmpty()) {
			for(Adapter adapter : oclAdapters.keySet()) {
				OCLExpression expression = oclAdapters.get(adapter);
				registerOCLAdapter(expression, adapter);
			}
		}
	}

	protected void registerListener(EObject element) {
		if (!hookedObjects.contains(element)) {
			hookedObjects.add(element);
			element.eAdapters().add(adapter);
		}
	}

	public void setDefaultValue() {
		setValue(getDefaultValue());
	}
	
	protected Object getDefaultValue() {
		Object defaultValue = feature.getDefaultValue();
		
		// WORKAROUND: Emf implementation of EStructuralFeature.getDefaultValue() returns null for many-feature...
		if (feature.isMany() && !(defaultValue instanceof Collection<?>)) {
			List<Object> manyValue = new ArrayList<Object>();
			if (defaultValue != null) {
				manyValue.add(defaultValue);
			}
			defaultValue = manyValue;
		}
		return defaultValue;
	}

	public void setValue(Object newValue) {
		// XXX This is bad if the opposite is the containment reference! and we just want to hide the container reference.
		// Do not set value other than default value for invisible editors
		//if (!isVisible()) {
		//	newValue = feature.getDefaultValue();
		//}

		boolean changed = (value == null) != (newValue == null) || (value != null && newValue != null && !value.equals(newValue));
		
		EditingDomain editingDomain = getEditingDomain(element);
		if (changed && editingDomain != null) {

		
			
			doSetValue(newValue);
			
			// If the value could not be applied, refresh editor!
			if ((value != null && !value.equals(newValue))
					|| (newValue != null && !newValue.equals(value))
					|| ((value == null) != (newValue == null))) {
				valueChanged();
			}
		}
	}
	
	protected void doSetValue(Object newValue) {
		Object oldValue = value;
		if (feature.isMany()) { // copy list
			oldValue = new ArrayList<Object>((Collection<?>)oldValue);
		}

		if (itemPropertyDescriptor != null) {
			itemPropertyDescriptor.setPropertyValue(element, newValue);
		} else {
			final Object finalNewValue = newValue;
			EditingDomain editingDomain = getEditingDomain(element);
			editingDomain.getCommandStack().execute(new ChangeCommand(element) {
				
				@Override
				protected void doExecute() {
					element.eSet(feature, finalNewValue);
				}
			
			});
		}
		

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
	
	protected Collection<Object> getChoices() {
		List<Object> choices = null;
		try {
			if (feature.getEType() == EcorePackage.Literals.EBOOLEAN) {
				choices = Arrays.asList(new Object[] { true, false });
			}
			if (choices == null && itemPropertyDescriptor != null) {
				choices = new ArrayList<Object>(itemPropertyDescriptor.getChoiceOfValues(input));
			}
		} catch (Exception e) {
			  IStatus status = new Status(IStatus.ERROR,
			      RuntimePlugin.PLUGIN_ID, 0,
			      "Could not generate choices for feature.", e);
			  RuntimePlugin.getDefault().getLog().log(status);
		}
		if (choices == null) {
			choices = new ArrayList<Object>();
		}

		// Always have null at the front, see MECHATRONICUML #1327.
		choices.remove(null);
		if (false == feature.getEType() instanceof EEnum) {
			choices.add(0, null);
		}

		// Disabled because of #1327:
//		// Make sure optional <=> choices.contains(null) is equivalent
//		choices.remove(null); // This makes sure the null is added to the front
//		boolean optional = feature.getLowerBound() <= 0 && false == feature.getEType() instanceof EEnum; // enums should not be optional, as they do not seem to support setting null as value.
//		if (optional != choices.contains(null)) {
//			if (optional) {
//				choices.add(0, null);
//			} else {
//				choices.remove(null);
//			}
//		}
		
		return choices;
	}

	public ResourceSet getResourceSet() {
		if (element != null && element.eResource() != null) {
			return element.eResource().getResourceSet();
		} else {
			System.out.println("no resource set");
		}
		return null;
	}
	
	public void addCreationFilter(ICreationFilter filter) {
		creationFilters.add(filter);
	}
	
	public void removeCreationFilter(ICreationFilter filter) {
		creationFilters.remove(filter);
	}
	

	public boolean registerOCLAdapter(OCLExpression expression, Adapter adapter) {
		oclAdapters.put(adapter, expression);

		ResourceSet myResourceSet = getResourceSet();
		if (myResourceSet == null || element == null) {
			return false;
		}
		

		// store adapter to unregister them in dispose()
		eventAdapters.put(adapter, myResourceSet);

		myResourceSet.eAdapters().add(adapter);
		
		return true;
	}

	public void unregisterEventAdapter(Adapter adapter) {
		ResourceSet myResourceSet = eventAdapters.get(adapter);
		myResourceSet.eAdapters().remove(adapter);
	}

	protected void removeEventAdapters() {
		for (Adapter adapter : eventAdapters.keySet()) {
			unregisterEventAdapter(adapter);
		}
	}
	
	public List<EClass> getCreationEClasses() {
		if (creationEClasses == null) {
			creationEClasses = calculateCreationEClasses();
		}
		return creationEClasses;
	}

	protected List<EClass> calculateCreationEClasses() {
		List<EClass> eClasses = new ArrayList<EClass>();
		for (EClass eClass : RuntimePlugin.getEClasses((EReference) feature)) {
			boolean mayCreate = true;
			for (ICreationFilter filter : creationFilters) {
				if (!filter.select(input, eClass)) {
					mayCreate = false;
				}
			}
			if (mayCreate) {
				eClasses.add(eClass);
			}
		}
		return eClasses;
	}

	public void setInitializeQuery(Query<EClassifier, ?, ?> query) {
		// TODO: Implement
	}
	
}
