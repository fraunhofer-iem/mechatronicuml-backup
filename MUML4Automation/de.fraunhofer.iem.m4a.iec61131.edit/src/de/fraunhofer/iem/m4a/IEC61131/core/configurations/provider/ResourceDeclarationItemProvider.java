/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations.provider;


import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsFactory;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.provider.NamedElementItemProvider;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesFactory;

import de.fraunhofer.iem.m4a.IEC61131.provider.Iec61131EditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceDeclarationItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDeclarationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOnHardwareResourcePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the On Hardware Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnHardwareResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceDeclaration_onHardwareResource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceDeclaration_onHardwareResource_feature", "_UI_ResourceDeclaration_type"),
				 ConfigurationsPackage.Literals.RESOURCE_DECLARATION__ON_HARDWARE_RESOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ConfigurationsPackage.Literals.RESOURCE_DECLARATION__DECLARATIONS);
			childrenFeatures.add(ConfigurationsPackage.Literals.RESOURCE_DECLARATION__PROGRAM_CONFIGURATIONS);
			childrenFeatures.add(ConfigurationsPackage.Literals.RESOURCE_DECLARATION__TASK_CONFIGURATIONS);
			childrenFeatures.add(ConfigurationsPackage.Literals.RESOURCE_DECLARATION__GLOBAL_VAR_NAMES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ResourceDeclaration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ResourceDeclaration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ResourceDeclaration)object).getIdentifier();
		return label == null || label.length() == 0 ?
			getString("_UI_ResourceDeclaration_type") :
			getString("_UI_ResourceDeclaration_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ResourceDeclaration.class)) {
			case ConfigurationsPackage.RESOURCE_DECLARATION__ON_HARDWARE_RESOURCE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ConfigurationsPackage.RESOURCE_DECLARATION__DECLARATIONS:
			case ConfigurationsPackage.RESOURCE_DECLARATION__PROGRAM_CONFIGURATIONS:
			case ConfigurationsPackage.RESOURCE_DECLARATION__TASK_CONFIGURATIONS:
			case ConfigurationsPackage.RESOURCE_DECLARATION__GLOBAL_VAR_NAMES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.RESOURCE_DECLARATION__DECLARATIONS,
				 DeclarationsFactory.eINSTANCE.createGlobalVarDeclarationContainer()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.RESOURCE_DECLARATION__PROGRAM_CONFIGURATIONS,
				 ConfigurationsFactory.eINSTANCE.createProgramConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.RESOURCE_DECLARATION__TASK_CONFIGURATIONS,
				 ConfigurationsFactory.eINSTANCE.createTaskConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.RESOURCE_DECLARATION__GLOBAL_VAR_NAMES,
				 VariablesFactory.eINSTANCE.createGlobalVar()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Iec61131EditPlugin.INSTANCE;
	}

}
