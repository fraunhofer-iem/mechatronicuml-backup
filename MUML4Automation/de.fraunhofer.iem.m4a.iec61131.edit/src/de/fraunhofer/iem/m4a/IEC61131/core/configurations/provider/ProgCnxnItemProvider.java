/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations.provider;


import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgCnxn;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsFactory;

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
 * This is the item provider adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgCnxn} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgCnxnItemProvider 
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
	public ProgCnxnItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VAR);
			childrenFeatures.add(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VALUE);
			childrenFeatures.add(ConfigurationsPackage.Literals.PROG_CNXN__DATA_SINK_VAR);
			childrenFeatures.add(ConfigurationsPackage.Literals.PROG_CNXN__DATA_SINK_VALUE);
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
	 * This returns ProgCnxn.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProgCnxn"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ProgCnxn_type");
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

		switch (notification.getFeatureID(ProgCnxn.class)) {
			case ConfigurationsPackage.PROG_CNXN__PROG_DATA_SOURCE_VAR:
			case ConfigurationsPackage.PROG_CNXN__PROG_DATA_SOURCE_VALUE:
			case ConfigurationsPackage.PROG_CNXN__DATA_SINK_VAR:
			case ConfigurationsPackage.PROG_CNXN__DATA_SINK_VALUE:
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
				(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VAR,
				 VariablesFactory.eINSTANCE.createNamedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VAR,
				 VariablesFactory.eINSTANCE.createStructuredVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VAR,
				 VariablesFactory.eINSTANCE.createArrayVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VALUE,
				 ConfigurationsFactory.eINSTANCE.createGlobalVarReference()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VALUE,
				 TypesFactory.eINSTANCE.createEnumeratedValue()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VALUE,
				 LiteralsFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VALUE,
				 LiteralsFactory.eINSTANCE.createNumericLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VALUE,
				 LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VALUE,
				 LiteralsFactory.eINSTANCE.createBitStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VALUE,
				 LiteralsFactory.eINSTANCE.createBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VALUE,
				 LiteralsFactory.eINSTANCE.createRealLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VALUE,
				 LiteralsFactory.eINSTANCE.createSignedInteger()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VALUE,
				 LiteralsFactory.eINSTANCE.createBinaryInteger()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VALUE,
				 LiteralsFactory.eINSTANCE.createOctalInteger()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VALUE,
				 LiteralsFactory.eINSTANCE.createHexInteger()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VALUE,
				 LiteralsFactory.eINSTANCE.createUnsignedInteger()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VALUE,
				 LiteralsFactory.eINSTANCE.createTimeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VALUE,
				 LiteralsFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VALUE,
				 LiteralsFactory.eINSTANCE.createTimeOfDay()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VALUE,
				 LiteralsFactory.eINSTANCE.createDate()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VALUE,
				 LiteralsFactory.eINSTANCE.createDateAndTime()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VALUE,
				 VariablesFactory.eINSTANCE.createDirectVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__DATA_SINK_VAR,
				 VariablesFactory.eINSTANCE.createNamedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__DATA_SINK_VAR,
				 VariablesFactory.eINSTANCE.createStructuredVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__DATA_SINK_VAR,
				 VariablesFactory.eINSTANCE.createArrayVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__DATA_SINK_VALUE,
				 ConfigurationsFactory.eINSTANCE.createGlobalVarReference()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.PROG_CNXN__DATA_SINK_VALUE,
				 VariablesFactory.eINSTANCE.createDirectVariable()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VAR ||
			childFeature == ConfigurationsPackage.Literals.PROG_CNXN__DATA_SINK_VAR ||
			childFeature == ConfigurationsPackage.Literals.PROG_CNXN__PROG_DATA_SOURCE_VALUE ||
			childFeature == ConfigurationsPackage.Literals.PROG_CNXN__DATA_SINK_VALUE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
