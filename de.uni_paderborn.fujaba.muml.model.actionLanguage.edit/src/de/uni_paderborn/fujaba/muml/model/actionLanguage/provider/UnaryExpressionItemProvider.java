/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.core.CorePackage;
import org.storydriven.core.expressions.ExpressionsFactory;
import org.storydriven.core.expressions.common.CommonExpressionsFactory;
import org.storydriven.core.expressions.provider.ExpressionItemProvider;

import org.storydriven.storydiagrams.activities.ActivitiesFactory;
import org.storydriven.storydiagrams.activities.expressions.ActivitiesExpressionsFactory;
import org.storydriven.storydiagrams.calls.CallsFactory;
import org.storydriven.storydiagrams.calls.expressions.CallsExpressionsFactory;
import org.storydriven.storydiagrams.patterns.expressions.PatternsExpressionsFactory;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguageFactory;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryExpression;
import de.uni_paderborn.fujaba.muml.model.core.CoreFactory;


/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnaryExpressionItemProvider
	extends ExpressionItemProvider
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
	public UnaryExpressionItemProvider(AdapterFactory adapterFactory) {
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

			addUnaryOperatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Unary Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnaryOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnaryExpression_unaryOperator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnaryExpression_unaryOperator_feature", "_UI_UnaryExpression_type"),
				 ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_OPERATOR,
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
			childrenFeatures.add(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION);
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
	 * This returns UnaryExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UnaryExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UnaryExpression)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_UnaryExpression_type") :
			getString("_UI_UnaryExpression_type") + " " + label;
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

		switch (notification.getFeatureID(UnaryExpression.class)) {
			case ActionLanguagePackage.UNARY_EXPRESSION__UNARY_OPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ActionLanguagePackage.UNARY_EXPRESSION__UNARY_EXPRESSION:
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
				(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSION,
				 ActivitiesFactory.eINSTANCE.createOperationExtension()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSION,
				 CallsFactory.eINSTANCE.createParameterExtension()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createBinaryLogicExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createOperationCall()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 CoreFactory.eINSTANCE.createActivityCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createLogicExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createBooleanLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createIntegerLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createDoubleLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createStringLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 ActivitiesExpressionsFactory.eINSTANCE.createExceptionVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 CallsExpressionsFactory.eINSTANCE.createMethodCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 CallsExpressionsFactory.eINSTANCE.createParameterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 PatternsExpressionsFactory.eINSTANCE.createAttributeValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 PatternsExpressionsFactory.eINSTANCE.createObjectVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 PatternsExpressionsFactory.eINSTANCE.createCollectionSizeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.UNARY_EXPRESSION__UNARY_EXPRESSION,
				 PatternsExpressionsFactory.eINSTANCE.createPrimitiveVariableExpression()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ActionLanguageEditPlugin.INSTANCE;
	}

}
