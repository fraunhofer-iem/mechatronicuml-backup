/**
 */
package org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.mumlcore.expressions.ExpressionsFactory;
import org.muml.mumlcore.expressions.common.CommonExpressionsFactory;
import org.muml.pim.actionlanguage.ActionlanguageFactory;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.psm.apiexpressions.ApiexpressionsFactory;
import org.muml.psm.psm_realtimestatechart.Psm_realtimestatechartFactory;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterPackage;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.TimeParameter;

/**
 * This is the item provider adapter for a {@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.TimeParameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeParameterItemProvider extends RealtimeStatechartParameterItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeParameterItemProvider(AdapterFactory adapterFactory) {
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

			addDataTypePropertyDescriptor(object);
			addConstantPropertyDescriptor(object);
			addInitializeExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypedNamedElement_dataType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypedNamedElement_dataType_feature", "_UI_TypedNamedElement_type"),
				 BehaviorPackage.Literals.TYPED_NAMED_ELEMENT__DATA_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstantPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Variable_constant_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Variable_constant_feature", "_UI_Variable_type"),
				 BehaviorPackage.Literals.VARIABLE__CONSTANT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initialize Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitializeExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Variable_initializeExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Variable_initializeExpression_feature", "_UI_Variable_type"),
				 BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 true,
				 false,
				 true,
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
			childrenFeatures.add(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION);
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
	 * This returns TimeParameter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TimeParameter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TimeParameter)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TimeParameter_type") :
			getString("_UI_TimeParameter_type") + " " + label;
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

		switch (notification.getFeatureID(TimeParameter.class)) {
			case RealtimestatechartparameterPackage.TIME_PARAMETER__CONSTANT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 Psm_realtimestatechartFactory.eINSTANCE.createAPICall()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ApiexpressionsFactory.eINSTANCE.createAPICallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ApiexpressionsFactory.eINSTANCE.createEnumerationValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ApiexpressionsFactory.eINSTANCE.createContinuousPortExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createOperationCall()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createTriggerMessageExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createDiscreteInteractionEndpointReference()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createPositionSelector()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createLocalVariableDeclarationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createTypedNamedElementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createArrayInitializeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createNondeterministicChoiceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createTimeValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createTypeCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createArrayIndexExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createAttributeAccessorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createLiteralExpression()));
	}

}
