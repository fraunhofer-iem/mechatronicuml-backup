/**
 */
package org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.core.CorePackage;
import org.muml.core.expressions.ExpressionsFactory;
import org.muml.core.expressions.common.CommonExpressionsFactory;
import org.muml.pim.actionlanguage.ActionlanguageFactory;
import org.muml.pim.behavior.BehaviorFactory;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.psm.apiexpressions.ApiexpressionsFactory;
import org.muml.psm.properties.PropertiesFactory;
import org.muml.psm.psm_realtimestatechart.Psm_realtimestatechartFactory;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.APICallParameterBinding;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage;

/**
 * This is the item provider adapter for a {@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.APICallParameterBinding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class APICallParameterBindingItemProvider extends RealtimeStatechartParameterBindingItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APICallParameterBindingItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
			addImplementationsPropertyDescriptor(object);
			addParametersPropertyDescriptor(object);
			addReturnTypePropertyDescriptor(object);
			addExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
				 CorePackage.Literals.NAMED_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommentableElement_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommentableElement_comment_feature", "_UI_CommentableElement_type"),
				 CorePackage.Literals.COMMENTABLE_ELEMENT__COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Implementations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_implementations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_implementations_feature", "_UI_Operation_type"),
				 BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParametersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_parameters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_parameters_feature", "_UI_Operation_type"),
				 BehaviorPackage.Literals.OPERATION__PARAMETERS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Return Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReturnTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_returnType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_returnType_feature", "_UI_Operation_type"),
				 BehaviorPackage.Literals.OPERATION__RETURN_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APICallParameterBinding_expression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APICallParameterBinding_expression_feature", "_UI_APICallParameterBinding_type"),
				 RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
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
			childrenFeatures.add(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSIONS);
			childrenFeatures.add(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS);
			childrenFeatures.add(BehaviorPackage.Literals.OPERATION__PARAMETERS);
			childrenFeatures.add(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION);
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
	 * This returns APICallParameterBinding.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/APICallParameterBinding"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((APICallParameterBinding)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_APICallParameterBinding_type") :
			getString("_UI_APICallParameterBinding_type") + " " + label;
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

		switch (notification.getFeatureID(APICallParameterBinding.class)) {
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__NAME:
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__COMMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__EXTENSIONS:
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__IMPLEMENTATIONS:
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__PARAMETERS:
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__EXPRESSION:
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
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 Psm_realtimestatechartFactory.eINSTANCE.createAPICall()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ApiexpressionsFactory.eINSTANCE.createAPICallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ApiexpressionsFactory.eINSTANCE.createEnumerationValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ApiexpressionsFactory.eINSTANCE.createContinuousPortExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createOperationCall()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createTriggerMessageExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createDiscreteInteractionEndpointReference()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createPositionSelector()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createLocalVariableDeclarationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createTypedNamedElementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createArrayInitializeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createNondeterministicChoiceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createTimeValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createTypeCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createArrayIndexExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createAttributeAccessorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 CommonExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 CommonExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 CommonExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 CommonExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 Psm_realtimestatechartFactory.eINSTANCE.createAPICall()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ApiexpressionsFactory.eINSTANCE.createAPICallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ApiexpressionsFactory.eINSTANCE.createEnumerationValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ApiexpressionsFactory.eINSTANCE.createContinuousPortExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createOperationCall()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createTriggerMessageExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createDiscreteInteractionEndpointReference()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createPositionSelector()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createLocalVariableDeclarationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createTypedNamedElementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createArrayInitializeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createNondeterministicChoiceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createTimeValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createTypeCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createArrayIndexExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createAttributeAccessorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION,
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
			childFeature == BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS ||
			childFeature == RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING__EXPRESSION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
