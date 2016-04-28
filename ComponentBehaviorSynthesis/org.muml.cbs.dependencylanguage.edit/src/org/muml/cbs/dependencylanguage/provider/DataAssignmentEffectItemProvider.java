/**
 */
package org.muml.cbs.dependencylanguage.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.cbs.dependencylanguage.DataAssignmentEffect;
import org.muml.cbs.dependencylanguage.DependencylanguageFactory;
import org.muml.cbs.dependencylanguage.DependencylanguagePackage;
import org.muml.mumlcore.CorePackage;
import org.muml.mumlcore.expressions.ExpressionsFactory;
import org.muml.mumlcore.expressions.common.CommonExpressionsFactory;
import org.muml.pim.actionlanguage.ActionlanguageFactory;
import org.muml.pim.actionlanguage.ActionlanguagePackage;

/**
 * This is the item provider adapter for a {@link org.muml.cbs.dependencylanguage.DataAssignmentEffect} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataAssignmentEffectItemProvider
	extends EffectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAssignmentEffectItemProvider(AdapterFactory adapterFactory) {
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

			addCommentPropertyDescriptor(object);
			addAssignOperatorPropertyDescriptor(object);
			addRhs_assignExpressionPropertyDescriptor(object);
			addIncrementDecrementOperatorPropertyDescriptor(object);
			addLhs_typedNamedElementExpressionPropertyDescriptor(object);
			addDirectionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
	 * This adds a property descriptor for the Assign Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssignOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Assignment_assignOperator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Assignment_assignOperator_feature", "_UI_Assignment_type"),
				 ActionlanguagePackage.Literals.ASSIGNMENT__ASSIGN_OPERATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rhs assign Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRhs_assignExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Assignment_rhs_assignExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Assignment_rhs_assignExpression_feature", "_UI_Assignment_type"),
				 ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Increment Decrement Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncrementDecrementOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Assignment_incrementDecrementOperator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Assignment_incrementDecrementOperator_feature", "_UI_Assignment_type"),
				 ActionlanguagePackage.Literals.ASSIGNMENT__INCREMENT_DECREMENT_OPERATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lhs typed Named Element Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLhs_typedNamedElementExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Assignment_lhs_typedNamedElementExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Assignment_lhs_typedNamedElementExpression_feature", "_UI_Assignment_type"),
				 ActionlanguagePackage.Literals.ASSIGNMENT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataAssignmentEffect_direction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataAssignmentEffect_direction_feature", "_UI_DataAssignmentEffect_type"),
				 DependencylanguagePackage.Literals.DATA_ASSIGNMENT_EFFECT__DIRECTION,
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
			childrenFeatures.add(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSIONS);
			childrenFeatures.add(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION);
			childrenFeatures.add(ActionlanguagePackage.Literals.ASSIGNMENT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION);
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
	 * This returns DataAssignmentEffect.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataAssignmentEffect"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataAssignmentEffect)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_DataAssignmentEffect_type") :
			getString("_UI_DataAssignmentEffect_type") + " " + label;
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

		switch (notification.getFeatureID(DataAssignmentEffect.class)) {
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__COMMENT:
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__ASSIGN_OPERATOR:
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__INCREMENT_DECREMENT_OPERATOR:
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__DIRECTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__EXTENSIONS:
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__RHS_ASSIGN_EXPRESSION:
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION:
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
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 DependencylanguageFactory.eINSTANCE.createDataAssignmentEffect()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createOperationCall()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createTriggerMessageExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createDiscreteInteractionEndpointReference()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createPositionSelector()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createLocalVariableDeclarationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createTypedNamedElementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createArrayInitializeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createNondeterministicChoiceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createTimeValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createTypeCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createArrayIndexExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createAttributeAccessorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionlanguagePackage.Literals.ASSIGNMENT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createTypedNamedElementExpression()));
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
			childFeature == ActionlanguagePackage.Literals.ASSIGNMENT__RHS_ASSIGN_EXPRESSION ||
			childFeature == ActionlanguagePackage.Literals.ASSIGNMENT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
