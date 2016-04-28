/**
 */
package org.muml.cbs.dependencylanguage.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.cbs.dependencylanguage.DependencyModel;
import org.muml.cbs.dependencylanguage.DependencylanguageFactory;
import org.muml.cbs.dependencylanguage.DependencylanguagePackage;
import org.muml.core.provider.CommentableElementItemProvider;
import org.muml.mumlcore.CorePackage;

/**
 * This is the item provider adapter for a {@link org.muml.cbs.dependencylanguage.DependencyModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DependencyModelItemProvider
	extends CommentableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyModelItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(DependencylanguagePackage.Literals.DEPENDENCY_MODEL__DEPENDENCIES);
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
	 * This returns DependencyModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DependencyModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DependencyModel)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_DependencyModel_type") :
			getString("_UI_DependencyModel_type") + " " + label;
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

		switch (notification.getFeatureID(DependencyModel.class)) {
			case DependencylanguagePackage.DEPENDENCY_MODEL__DEPENDENCIES:
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
				(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSIONS,
				 DependencylanguageFactory.eINSTANCE.createSynthesizableBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.DEPENDENCY_MODEL__DEPENDENCIES,
				 DependencylanguageFactory.eINSTANCE.createSynchronization()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.DEPENDENCY_MODEL__DEPENDENCIES,
				 DependencylanguageFactory.eINSTANCE.createForbiddenStateCombination()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.DEPENDENCY_MODEL__DEPENDENCIES,
				 DependencylanguageFactory.eINSTANCE.createClockMerge()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.DEPENDENCY_MODEL__DEPENDENCIES,
				 DependencylanguageFactory.eINSTANCE.createDataMerge()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.DEPENDENCY_MODEL__DEPENDENCIES,
				 DependencylanguageFactory.eINSTANCE.createConditionalDependency()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.DEPENDENCY_MODEL__DEPENDENCIES,
				 DependencylanguageFactory.eINSTANCE.createBoundedActiveState()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.DEPENDENCY_MODEL__DEPENDENCIES,
				 DependencylanguageFactory.eINSTANCE.createTriggerMessage()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DependencylanguageEditPlugin.INSTANCE;
	}

}
