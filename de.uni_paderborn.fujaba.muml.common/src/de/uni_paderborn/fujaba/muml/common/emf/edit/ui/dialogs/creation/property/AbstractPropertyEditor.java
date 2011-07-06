package de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import de.uni_paderborn.fujaba.common.descriptor.INavigatedObjectPropertyDescriptor;

/**
 * An abstract implementation of a property editor. Should be subclassed to
 * create the gui-control to use.
 * 
 * @author bingo
 * 
 */
public abstract class AbstractPropertyEditor {

	/**
	 * A field, which remembers, if the last validation was successful; or
	 * <code>null</code>, if no validation has been done yet.
	 */
	private Boolean valid;

	/**
	 * Should the control extend vertically and take more place?
	 */
	private boolean extendVertically = false;

	/**
	 * This property editor's control, or <code>null</code> if not created yet.
	 */
	protected Control control;

	/**
	 * The property, which is edited.
	 */
	protected Property property;

	/**
	 * The AdapterFactory to use, when creating an ItemPropertyDescritor.
	 */
	protected AdapterFactory adapterFactory;

	/**
	 * The list of registered Validators to use, when revalidating.
	 */
	protected List<IValidator> validators = new ArrayList<IValidator>();

	/**
	 * The list of registered ValidationListeners to inform about validation
	 * events.
	 */
	protected List<IValidationListener> validationListeners = new ArrayList<IValidationListener>();

	/**
	 * Constructs this AbstractPropertyEditor.
	 * 
	 * @param adapterFactory
	 *            The AdapterFactory to use to create ItemPropertyDescriptors.
	 */
	public AbstractPropertyEditor(AdapterFactory adapterFactory) {
		this(adapterFactory, false);
	}

	/**
	 * Constructs this AbstractPropertyEditor.
	 * 
	 * @param adapterFactory
	 *            The AdapterFactory to use to create ItemPropertyDescriptors.
	 * @param extendVertically
	 *            <code>true</code>, if the control should extend vertically and
	 *            take more place.
	 */
	public AbstractPropertyEditor(AdapterFactory adapterFactory,
			boolean extendVertically) {
		this.adapterFactory = adapterFactory;
		this.extendVertically = extendVertically;
	}

	/**
	 * Set the Property for this editor.
	 * 
	 * @param property
	 *            The property to edit.
	 */
	public void init(Property property) {
		this.property = property;
	}

	/**
	 * Sets the value of the extendVertical field.
	 * 
	 * @param extendVertically
	 *            <code>true</code>, if the control should extend vertically and
	 *            take more place.
	 */
	public void setExtendVertically(boolean extendVertically) {
		this.extendVertically = extendVertically;
	}

	/**
	 * Gets the value of the extendVertical field.
	 * 
	 * @return <code>true</code>, if the control should extend vertically and
	 *         take more place.
	 */
	public boolean isExtendVertically() {
		return extendVertically;
	}

	/**
	 * Creates the control for this cell editor under the given parent control.
	 * 
	 * @param parent
	 *            the parent control
	 * @return the control for this cell editor.
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

	/**
	 * Returns the value of the editor.
	 * 
	 * @return the value or <code>null</code> if the current value is not valid.
	 */
	public Object getValue() {
		if (isValid()) {
			return doGetValue();
		}
		return null;
	}

	/**
	 * Validates the current input.
	 */
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

	/**
	 * Applies the validation status. This can be used to mark errors in
	 * text-fields for example.
	 * 
	 * @param validationStatus
	 *            The validation status to apply.
	 */
	protected void applyValidationStatus(IValidationStatus validationStatus) {
		// Default implementation does nothing
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

	/**
	 * Finds out, if the current value is valid.
	 * 
	 * @return <code>true</code> if the current value is valid.
	 */
	public boolean isValid() {
		return valid != null && valid.booleanValue();
	}

	/**
	 * Sets the valid field and optionally informs all validation listeners.
	 * 
	 * @param valid
	 *            The new value for the valid field.
	 */
	protected void setValid(boolean valid) {
		if (this.valid == null || this.valid.booleanValue() != valid) {
			this.valid = valid;
			for (IValidationListener validationListener : validationListeners) {
				validationListener.validationOccurred(valid);
			}
		}
	}

	/**
	 * Sets the current value for the object passed.
	 * 
	 * @param object
	 *            The object to set the value for.
	 */
	public void setPropertyValue(EObject object) {
		IItemPropertyDescriptor itemPropertyDescriptor = getItemPropertyDescriptor(object);
		if (itemPropertyDescriptor != null) {
			itemPropertyDescriptor.setPropertyValue(object, getValue());
		}
	}

	private IItemPropertyDescriptor getItemPropertyDescriptor(EObject object) {
		IItemPropertySource ips = (IItemPropertySource) adapterFactory.adapt(
				object, IItemPropertySource.class);
		if (ips != null) {
			List<IItemPropertyDescriptor> itemPropertyDescriptors = ips
					.getPropertyDescriptors(object);
			for (IItemPropertyDescriptor itemPropertyDescriptor : itemPropertyDescriptors) {
				Object descriptorFeature = itemPropertyDescriptor
						.getFeature(object);
				if (itemPropertyDescriptor instanceof INavigatedObjectPropertyDescriptor) {
					descriptorFeature = ((INavigatedObjectPropertyDescriptor) itemPropertyDescriptor)
							.getNavigationFeature();
				}
				if (descriptorFeature.equals(property.getFeature())) {
					return itemPropertyDescriptor;
				}
			}
		}
		return null;
	}

	/**
	 * Adds a validation listener to the list of registrated listeners. This
	 * listener will be notified, when revalidating the input.
	 * 
	 * @param validationListener
	 *            The validation listener to register.
	 */
	public void addValidationListener(IValidationListener validationListener) {
		validationListeners.add(validationListener);
	}

	/**
	 * Removes a validation listener from the list of registrated listeners.
	 * This listener will not be notified anymore, when revalidating the input.
	 * 
	 * @param validationListener
	 *            The validation listener to deregister.
	 */
	public void removeValidationListener(IValidationListener validationListener) {
		validationListeners.remove(validationListener);
	}

	/**
	 * Adds a validator to the list of registrated validators. This validator
	 * will be considered, when revalidating the input.
	 * 
	 * @param validator
	 *            The validator to register.
	 */
	public void addValidator(IValidator validator) {
		validators.add(validator);
	}

	/**
	 * Removes a validator from the list of registrated validators. This
	 * validator will not be considered anymore, when revalidating the input.
	 * 
	 * @param validator
	 *            The validator to deregister.
	 */
	public void removeValidator(IValidator validator) {
		validators.remove(validator);
	}

	/**
	 * Sets a default (or empty) value for the control.
	 */
	public abstract void setDefaultValue();
}
