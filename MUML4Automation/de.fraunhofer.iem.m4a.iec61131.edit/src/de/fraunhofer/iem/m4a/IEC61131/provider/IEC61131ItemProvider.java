/**
 */
package de.fraunhofer.iem.m4a.IEC61131.provider;


import de.fraunhofer.iem.m4a.IEC61131.IEC61131;
import de.fraunhofer.iem.m4a.IEC61131.IEC61131Package;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.PousFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesFactory;
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
 * This is the item provider adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.IEC61131} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IEC61131ItemProvider 
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
	public IEC61131ItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(IEC61131Package.Literals.IEC61131__LIBRARY_DECLARATIONS);
			childrenFeatures.add(IEC61131Package.Literals.IEC61131__LIBRARY_REFERENCES);
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
	 * This returns IEC61131.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IEC61131"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_IEC61131_type");
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

		switch (notification.getFeatureID(IEC61131.class)) {
			case IEC61131Package.IEC61131__LIBRARY_DECLARATIONS:
			case IEC61131Package.IEC61131__LIBRARY_REFERENCES:
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
				(IEC61131Package.Literals.IEC61131__LIBRARY_DECLARATIONS,
				 TypesFactory.eINSTANCE.createArrayTypeDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(IEC61131Package.Literals.IEC61131__LIBRARY_DECLARATIONS,
				 TypesFactory.eINSTANCE.createStructureTypeDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(IEC61131Package.Literals.IEC61131__LIBRARY_DECLARATIONS,
				 TypesFactory.eINSTANCE.createStringTypeDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(IEC61131Package.Literals.IEC61131__LIBRARY_DECLARATIONS,
				 TypesFactory.eINSTANCE.createSimpleTypeDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(IEC61131Package.Literals.IEC61131__LIBRARY_DECLARATIONS,
				 TypesFactory.eINSTANCE.createSubrangeTypeDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(IEC61131Package.Literals.IEC61131__LIBRARY_DECLARATIONS,
				 TypesFactory.eINSTANCE.createEnumeratedTypeDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(IEC61131Package.Literals.IEC61131__LIBRARY_DECLARATIONS,
				 PousFactory.eINSTANCE.createFunctionDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(IEC61131Package.Literals.IEC61131__LIBRARY_DECLARATIONS,
				 PousFactory.eINSTANCE.createFunctionBlockDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(IEC61131Package.Literals.IEC61131__LIBRARY_DECLARATIONS,
				 PousFactory.eINSTANCE.createProgramDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(IEC61131Package.Literals.IEC61131__LIBRARY_DECLARATIONS,
				 PousFactory.eINSTANCE.createBlackboxFunctionBlockDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(IEC61131Package.Literals.IEC61131__LIBRARY_DECLARATIONS,
				 ConfigurationsFactory.eINSTANCE.createConfigurationDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(IEC61131Package.Literals.IEC61131__LIBRARY_REFERENCES,
				 TypesFactory.eINSTANCE.createDateType()));

		newChildDescriptors.add
			(createChildParameter
				(IEC61131Package.Literals.IEC61131__LIBRARY_REFERENCES,
				 TypesFactory.eINSTANCE.createBitStringType()));

		newChildDescriptors.add
			(createChildParameter
				(IEC61131Package.Literals.IEC61131__LIBRARY_REFERENCES,
				 TypesFactory.eINSTANCE.createTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(IEC61131Package.Literals.IEC61131__LIBRARY_REFERENCES,
				 TypesFactory.eINSTANCE.createRealType()));

		newChildDescriptors.add
			(createChildParameter
				(IEC61131Package.Literals.IEC61131__LIBRARY_REFERENCES,
				 TypesFactory.eINSTANCE.createSignedIntegerType()));

		newChildDescriptors.add
			(createChildParameter
				(IEC61131Package.Literals.IEC61131__LIBRARY_REFERENCES,
				 TypesFactory.eINSTANCE.createUnsignedIntegerType()));

		newChildDescriptors.add
			(createChildParameter
				(IEC61131Package.Literals.IEC61131__LIBRARY_REFERENCES,
				 TypesFactory.eINSTANCE.createElementaryStringType()));

		newChildDescriptors.add
			(createChildParameter
				(IEC61131Package.Literals.IEC61131__LIBRARY_REFERENCES,
				 TypesFactory.eINSTANCE.createGenericType()));

		newChildDescriptors.add
			(createChildParameter
				(IEC61131Package.Literals.IEC61131__LIBRARY_REFERENCES,
				 TypesFactory.eINSTANCE.createHardwareResourceTypeName()));
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
