/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations.provider;


import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesFactory;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclaration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LocatedVarDeclarationItemProvider 
	extends NamedVariableDeclarationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocatedVarDeclarationItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(DeclarationsPackage.Literals.LOCATED_VAR_DECLARATION__LOCATION);
			childrenFeatures.add(DeclarationsPackage.Literals.LOCATED_VAR_DECLARATION__SPEC_INIT);
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
	 * This returns LocatedVarDeclaration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LocatedVarDeclaration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_LocatedVarDeclaration_type");
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

		switch (notification.getFeatureID(LocatedVarDeclaration.class)) {
			case DeclarationsPackage.LOCATED_VAR_DECLARATION__LOCATION:
			case DeclarationsPackage.LOCATED_VAR_DECLARATION__SPEC_INIT:
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
				(DeclarationsPackage.Literals.LOCATED_VAR_DECLARATION__LOCATION,
				 VariablesFactory.eINSTANCE.createDirectVariable()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.LOCATED_VAR_DECLARATION__SPEC_INIT,
				 DeclarationsFactory.eINSTANCE.createVar1SpecInitDecl()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.LOCATED_VAR_DECLARATION__SPEC_INIT,
				 DeclarationsFactory.eINSTANCE.createSingleByteStringSpecInit()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.LOCATED_VAR_DECLARATION__SPEC_INIT,
				 DeclarationsFactory.eINSTANCE.createDoubleByteStringSpecInit()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.LOCATED_VAR_DECLARATION__SPEC_INIT,
				 TypesFactory.eINSTANCE.createArraySpecInit()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.LOCATED_VAR_DECLARATION__SPEC_INIT,
				 TypesFactory.eINSTANCE.createInitializedStructure()));
	}

}
