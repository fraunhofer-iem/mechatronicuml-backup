/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations.provider;


import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1Decl;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesFactory;
import de.fraunhofer.iem.m4a.IEC61131.provider.Iec61131EditPlugin;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1Decl} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Var1DeclItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Var1DeclItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(DeclarationsPackage.Literals.NAMED_VARIABLE_DECLARATION__VARIABLE_NAME);
			childrenFeatures.add(DeclarationsPackage.Literals.VAR1_DECL__SPECIFICATION);
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
	 * This returns Var1Decl.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Var1Decl"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Var1Decl_type");
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

		switch (notification.getFeatureID(Var1Decl.class)) {
			case DeclarationsPackage.VAR1_DECL__VARIABLE_NAME:
			case DeclarationsPackage.VAR1_DECL__SPECIFICATION:
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
				(DeclarationsPackage.Literals.NAMED_VARIABLE_DECLARATION__VARIABLE_NAME,
				 VariablesFactory.eINSTANCE.createNamedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.VAR1_DECL__SPECIFICATION,
				 TypesFactory.eINSTANCE.createDateType()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.VAR1_DECL__SPECIFICATION,
				 TypesFactory.eINSTANCE.createBitStringType()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.VAR1_DECL__SPECIFICATION,
				 TypesFactory.eINSTANCE.createTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.VAR1_DECL__SPECIFICATION,
				 TypesFactory.eINSTANCE.createRealType()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.VAR1_DECL__SPECIFICATION,
				 TypesFactory.eINSTANCE.createSignedIntegerType()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.VAR1_DECL__SPECIFICATION,
				 TypesFactory.eINSTANCE.createUnsignedIntegerType()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.VAR1_DECL__SPECIFICATION,
				 TypesFactory.eINSTANCE.createElementaryStringType()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.VAR1_DECL__SPECIFICATION,
				 TypesFactory.eINSTANCE.createSubrangeTypeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.VAR1_DECL__SPECIFICATION,
				 TypesFactory.eINSTANCE.createEnumeratedTypeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.VAR1_DECL__SPECIFICATION,
				 TypesFactory.eINSTANCE.createSimpleTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.VAR1_DECL__SPECIFICATION,
				 TypesFactory.eINSTANCE.createSubrangeTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.VAR1_DECL__SPECIFICATION,
				 TypesFactory.eINSTANCE.createEnumeratedTypeReference()));
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
