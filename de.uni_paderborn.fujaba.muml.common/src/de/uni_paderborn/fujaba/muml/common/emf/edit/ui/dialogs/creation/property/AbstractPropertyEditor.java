package de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;


public abstract class AbstractPropertyEditor {
	private Boolean valid;
	
	private boolean extendVertically = false;
	
	/**
	 * This property editor's control, or <code>null</code> if not created yet.
	 */
	protected Control control;

	protected Property property;

	protected AdapterFactory adapterFactory;

	protected List<IValidator> validators = new ArrayList<IValidator>();
	
	protected List<IValidationListener> validationListeners = new ArrayList<IValidationListener>();
	
	public AbstractPropertyEditor(AdapterFactory adapterFactory) {
		this(adapterFactory, false);
	}
	
	public AbstractPropertyEditor(AdapterFactory adapterFactory,  boolean extendVertically) {
		this.adapterFactory = adapterFactory;
		this.extendVertically = extendVertically;
	}

	public void init(Property property) {
		this.property = property;
	}

	public void setExtendVertically(boolean extendVertically) {
		this.extendVertically = extendVertically;
	}
	
	public boolean isExtendVertically() {
		return extendVertically;
	}
	
	/**
	 * Creates the control for this cell editor under the given parent control.
	 * 
	 * @param parent
	 *            the parent control
	 * @return
	 */
	public Control create(Composite parent) {
		control = createControl(parent);
		return control;
	}

	/**
	 * Disposes of this cell editor and frees any associated SWT resources.
	 */
	public void dispose() {
		if (control != null && !control.isDisposed()) {
			control.dispose();
		}
		control = null;
	}

	public Object getValue() {
		if (isValid()) {
			return doGetValue();
		}
		return null;
	}

	protected void revalidate() {
		Object value = doGetValue();
		boolean newValid = true;
		for (IValidator validator : validators) {
			IValidationStatus status = validator.validate(value);
			if (!status.isSuccessful()) {
				newValid = false;
			}
			applyValidationStatus(status);
		}
		setValid(newValid);
	}
	
	protected void applyValidationStatus(IValidationStatus validationStatus) {
		
	}
	
	/**
	 * Returns this property editor's value.
	 * <p>
	 * This framework method must be implemented by concrete subclasses.
	 * </p>
	 * 
	 * @return the value of this property editor
	 */
	protected abstract Object doGetValue();

	/**
	 * Creates the control for this property editor under the given parent
	 * control.
	 * <p>
	 * This framework method must be implemented by concrete subclasses.
	 * </p>
	 * 
	 * @param parent
	 *            the parent control
	 * @return the new control
	 */
	protected abstract Control createControl(Composite parent);
	
	public boolean isValid() {
		return valid != null && valid.booleanValue();
	}

	protected void setValid(boolean valid) {
		if (this.valid == null || this.valid.booleanValue() != valid) {
			this.valid = valid;
			for (IValidationListener validationListener : validationListeners) {
				validationListener.validationOccurred(valid);
			}
		}
	}

	public void setPropertyValue(EObject object) {
		IItemPropertySource ips = (IItemPropertySource) adapterFactory
				.adapt(object, IItemPropertySource.class);
		if (ips != null) {
			IItemPropertyDescriptor itemPropertyDescriptor = ips.getPropertyDescriptor(object,
					property.getFeature());
			
			if (itemPropertyDescriptor != null) {
				itemPropertyDescriptor.setPropertyValue(object, getValue());
			}
		}
	}

	public void addValidationListener(IValidationListener validationListener) {
		validationListeners.add(validationListener);
	}

	public void removeValidationListener(IValidationListener validationListener) {
		validationListeners.remove(validationListener);
	}
	
	public void addValidator(IValidator validator) {
		validators.add(validator);
	}
	
	public void removeValidator(IValidator validator) {
		validators.remove(validator);
	}
	
	public abstract void setDefaultValue();
}
