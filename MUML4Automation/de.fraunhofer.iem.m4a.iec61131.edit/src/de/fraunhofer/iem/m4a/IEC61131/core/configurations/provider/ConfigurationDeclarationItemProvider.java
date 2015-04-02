/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations.provider;


import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.provider.LibraryElementItemProvider;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesFactory;
import de.fraunhofer.iem.m4a.IEC61131.provider.Iec61131EditPlugin;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationDeclarationItemProvider extends LibraryElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationDeclarationItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ConfigurationsPackage.Literals.CONFIGURATION_DECLARATION__RESOURCES);
			childrenFeatures.add(ConfigurationsPackage.Literals.CONFIGURATION_DECLARATION__DECLARATIONS);
			childrenFeatures.add(ConfigurationsPackage.Literals.CONFIGURATION_DECLARATION__ACCESS);
			childrenFeatures.add(ConfigurationsPackage.Literals.CONFIGURATION_DECLARATION__INSTANCE_SPECIFIC_INITS);
			childrenFeatures.add(ConfigurationsPackage.Literals.CONFIGURATION_DECLARATION__GLOBAL_VAR_NAMES);
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
	 * This returns ConfigurationDeclaration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConfigurationDeclaration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ConfigurationDeclaration)object).getIdentifier();
		return label == null || label.length() == 0 ?
			getString("_UI_ConfigurationDeclaration_type") :
			getString("_UI_ConfigurationDeclaration_type") + " " + label;
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

		switch (notification.getFeatureID(ConfigurationDeclaration.class)) {
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__RESOURCES:
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__DECLARATIONS:
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__ACCESS:
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__INSTANCE_SPECIFIC_INITS:
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__GLOBAL_VAR_NAMES:
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
				(ConfigurationsPackage.Literals.CONFIGURATION_DECLARATION__RESOURCES,
				 ConfigurationsFactory.eINSTANCE.createResourceDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.CONFIGURATION_DECLARATION__DECLARATIONS,
				 DeclarationsFactory.eINSTANCE.createGlobalVarDeclarationContainer()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.CONFIGURATION_DECLARATION__DECLARATIONS,
				 DeclarationsFactory.eINSTANCE.createAccessVarContainer()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.CONFIGURATION_DECLARATION__DECLARATIONS,
				 DeclarationsFactory.eINSTANCE.createInstanceSpecificVarContainter()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.CONFIGURATION_DECLARATION__ACCESS,
				 DeclarationsFactory.eINSTANCE.createAccessVarContainer()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.CONFIGURATION_DECLARATION__INSTANCE_SPECIFIC_INITS,
				 DeclarationsFactory.eINSTANCE.createInstanceSpecificVarContainter()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationsPackage.Literals.CONFIGURATION_DECLARATION__GLOBAL_VAR_NAMES,
				 VariablesFactory.eINSTANCE.createGlobalVar()));
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
			childFeature == ConfigurationsPackage.Literals.CONFIGURATION_DECLARATION__DECLARATIONS ||
			childFeature == ConfigurationsPackage.Literals.CONFIGURATION_DECLARATION__ACCESS ||
			childFeature == ConfigurationsPackage.Literals.CONFIGURATION_DECLARATION__INSTANCE_SPECIFIC_INITS;

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
