/**
 */
package org.muml.psm.portapimapping.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.core.CorePackage;
import org.muml.core.expressions.ExpressionsFactory;
import org.muml.core.expressions.common.CommonExpressionsFactory;
import org.muml.core.provider.CommentableElementItemProvider;
import org.muml.pim.actionlanguage.ActionlanguageFactory;
import org.muml.psm.apiexpressions.ApiexpressionsFactory;
import org.muml.psm.portapimapping.PortApiMapping;
import org.muml.psm.portapimapping.PortapimappingPackage;
import org.muml.psm.properties.PropertiesFactory;
import org.muml.psm.provider.PsmEditPlugin;
import org.muml.psm.psm_realtimestatechart.Psm_realtimestatechartFactory;

/**
 * This is the item provider adapter for a {@link org.muml.psm.portapimapping.PortApiMapping} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PortApiMappingItemProvider extends CommentableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortApiMappingItemProvider(AdapterFactory adapterFactory) {
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

			addPortPropertyDescriptor(object);
			addExecCommandPropertyDescriptor(object);
			addRepositoryPropertyDescriptor(object);
			addInitCommandPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortApiMapping_port_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortApiMapping_port_feature", "_UI_PortApiMapping_type"),
				 PortapimappingPackage.Literals.PORT_API_MAPPING__PORT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exec Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortApiMapping_execCommand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortApiMapping_execCommand_feature", "_UI_PortApiMapping_type"),
				 PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Repository feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepositoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortApiMapping_repository_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortApiMapping_repository_feature", "_UI_PortApiMapping_type"),
				 PortapimappingPackage.Literals.PORT_API_MAPPING__REPOSITORY,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Init Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortApiMapping_initCommand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortApiMapping_initCommand_feature", "_UI_PortApiMapping_type"),
				 PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 true,
				 false,
				 false,
				 null,
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
			childrenFeatures.add(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND);
			childrenFeatures.add(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND);
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
	 * This returns PortApiMapping.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PortApiMapping"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PortApiMapping)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_PortApiMapping_type") :
			getString("_UI_PortApiMapping_type") + " " + label;
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

		switch (notification.getFeatureID(PortApiMapping.class)) {
			case PortapimappingPackage.PORT_API_MAPPING__EXEC_COMMAND:
			case PortapimappingPackage.PORT_API_MAPPING__INIT_COMMAND:
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
				 PropertiesFactory.eINSTANCE.createWCET()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSIONS,
				 PropertiesFactory.eINSTANCE.createRequiredMemory()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSIONS,
				 PropertiesFactory.eINSTANCE.createScheduling()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSIONS,
				 PropertiesFactory.eINSTANCE.createMessageFrame()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSIONS,
				 PropertiesFactory.eINSTANCE.createCANMessageFrame()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 Psm_realtimestatechartFactory.eINSTANCE.createAPICall()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ApiexpressionsFactory.eINSTANCE.createAPICallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ApiexpressionsFactory.eINSTANCE.createEnumerationValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ApiexpressionsFactory.eINSTANCE.createContinuousPortExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createOperationCall()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createTriggerMessageExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createDiscreteInteractionEndpointReference()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createPositionSelector()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createLocalVariableDeclarationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createTypedNamedElementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createArrayInitializeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createNondeterministicChoiceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createTimeValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createTypeCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createArrayIndexExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createAttributeAccessorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 CommonExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 CommonExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 CommonExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND,
				 CommonExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 Psm_realtimestatechartFactory.eINSTANCE.createAPICall()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ApiexpressionsFactory.eINSTANCE.createAPICallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ApiexpressionsFactory.eINSTANCE.createEnumerationValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ApiexpressionsFactory.eINSTANCE.createContinuousPortExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createOperationCall()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createTriggerMessageExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createDiscreteInteractionEndpointReference()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createPositionSelector()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createLocalVariableDeclarationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createTypedNamedElementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createArrayInitializeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createNondeterministicChoiceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createTimeValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createTypeCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createArrayIndexExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ActionlanguageFactory.eINSTANCE.createAttributeAccessorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 CommonExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 CommonExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 CommonExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND,
				 CommonExpressionsFactory.eINSTANCE.createLiteralExpression()));
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
			childFeature == PortapimappingPackage.Literals.PORT_API_MAPPING__EXEC_COMMAND ||
			childFeature == PortapimappingPackage.Literals.PORT_API_MAPPING__INIT_COMMAND;

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
		return PsmEditPlugin.INSTANCE;
	}

}
