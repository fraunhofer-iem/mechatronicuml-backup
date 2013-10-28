package de.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.examples.eventmanager.EventFilter;
import org.eclipse.ocl.examples.eventmanager.EventManager;
import org.eclipse.ocl.examples.eventmanager.EventManagerFactory;
import org.eclipse.ocl.examples.impactanalyzer.ImpactAnalyzer;
import org.eclipse.ocl.examples.impactanalyzer.ImpactAnalyzerFactory;
import org.eclipse.ocl.examples.impactanalyzer.util.OCLFactory;
import org.eclipse.swt.widgets.Display;

import de.fujaba.properties.runtime.RuntimePlugin;

public abstract class AbstractStructuralFeaturePropertyEditor extends
		AbstractPropertyEditor implements IStructuralFeaturePropertyEditor {

	private List<EObject> hookedObjects = new ArrayList<EObject>();
	
	private Map<Adapter, ResourceSet> eventAdapters = new HashMap<Adapter, ResourceSet>();

	private Map<Adapter, OCLExpression> unregisteredOCLExpressions = new HashMap<Adapter, OCLExpression>();

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
		removeEventAdapters();
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
		
		// Register those expressions that could not be registered before, because no editing domain was known before the first inputChanged() call
		if (!unregisteredOCLExpressions.isEmpty()) {
			for(Adapter adapter : unregisteredOCLExpressions.keySet()) {
				OCLExpression expression = unregisteredOCLExpressions.get(adapter);
				registerOCLAdapter(expression, adapter);
			}
		}
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

	public void setDefaultValue() {
		setValue(feature.getDefaultValue());
	}
	
	public void setValue(final Object newValue) {
		boolean changed = (value == null) != (newValue == null) || (value != null && newValue != null && !value.equals(newValue));
		EditingDomain editingDomain = getEditingDomain(element);
		if (changed && editingDomain != null) {
			editingDomain.getCommandStack().execute(new ChangeCommand(element) {
	
				@Override
				protected void doExecute() {
					doSetValue(newValue);
				}
			
			}); 

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
			element.eSet(feature, newValue);
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
		
		// Make sure optional <=> choices.contains(null) is equivalent
		boolean optional = feature.getLowerBound() <= 0 && false == feature.getEType() instanceof EEnum; // enums should not be optional, as they do not seem to support setting null as value.
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

	public ResourceSet getResourceSet() {
		if (element != null) {
			return element.eResource().getResourceSet();
		}
		return null;
	}
	/**
	 * Convenience method that creates an OCL expression, registers it with an
	 * Impact Analyzer and uses it as visibility filter.
	 * 
	 * It updates the visibility of this editor each time the Impact Analyzer
	 * decides it might be necessary.
	 * @param context 
	 * 
	 * @param oclExpression
	 *            The oclExpression to use.
	 */
	public void addVisibilityFilter(String oclExpression, EClassifier context) {

		IFilter filter = createOCLFilter(oclExpression, context, new AdapterImpl() {

			@Override
			public void notifyChanged(Notification notification) {
				updateVisibility(true, true);
			}

		});
		if (filter != null) {
			addVisibilityFilter(filter);
		}
	}

	private IFilter createOCLFilter(String oclExpression, EClassifier context, Adapter adapter) {
		
		try {
			Helper helper = RuntimePlugin.OCL_ECORE.createOCLHelper();
			helper.setAttributeContext(context, feature);
			OCLExpression expression = helper.createQuery(oclExpression);
			registerOCLAdapter(expression, adapter)	;
			
			final Query<EClassifier, ?, ?> query = RuntimePlugin.OCL_ECORE.createQuery(expression);		 
			return new IFilter() {

				@Override
				public boolean select(Object toTest) {
					return Boolean.TRUE.equals(query.evaluate(input));
				}
				
			};
		} catch (ParserException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean registerOCLAdapter(OCLExpression expression, Adapter adapter) {
		ResourceSet myResourceSet = getResourceSet();
		if (myResourceSet == null) {
			unregisteredOCLExpressions.put(adapter, expression);
			return false;
		}
		unregisteredOCLExpressions.remove(adapter);

		final ImpactAnalyzer impactAnalyzer = ImpactAnalyzerFactory.INSTANCE
				.createImpactAnalyzer(expression, // the expression to
													// re-evaluate incrementally
						false, // whether to re-evaluate when new context
								// objects appear
						OCLFactory.getInstance());

		EventFilter filter = impactAnalyzer.createFilterForExpression();
		EventManager eventManager = EventManagerFactory.eINSTANCE
				.getEventManagerFor(myResourceSet);
		eventManager.subscribe(filter, adapter);

		// store adapter to unregister them in dispose()
		eventAdapters.put(adapter, myResourceSet);
		return true;
	}

	public void unregisterEventAdapter(Adapter adapter) {
		ResourceSet myResourceSet = eventAdapters.get(adapter);
		EventManager eventManager = EventManagerFactory.eINSTANCE
				.getEventManagerFor(myResourceSet);
		eventManager.unsubscribe(adapter);
	}

	protected void removeEventAdapters() {
		for (Adapter adapter : eventAdapters.keySet()) {
			unregisterEventAdapter(adapter);
		}
	}
	
	public void updateVisibility(boolean relayout, boolean setDefaultValue) {
		boolean visibleBefore = isVisible();
		
		super.updateVisibility(relayout);

		// Only set default value, if we are hiding the editor and it was not hidden before.
		if (isVisible() || !visibleBefore) {
			setDefaultValue = false;
		}

		// Set default value if necessary and requested.
		if (setDefaultValue) {
			setDefaultValue();
		}
	}


}
