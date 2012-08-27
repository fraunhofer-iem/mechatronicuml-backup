/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage.provider;


import de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguageFactory;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.ReturnStatement;

import de.uni_paderborn.fujaba.muml.model.core.CoreFactory;

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

import org.storydriven.core.CorePackage;
import org.storydriven.core.expressions.ExpressionsFactory;

import org.storydriven.core.expressions.common.CommonExpressionsFactory;

import org.storydriven.core.expressions.provider.ExpressionItemProvider;
import org.storydriven.storydiagrams.activities.ActivitiesFactory;
import org.storydriven.storydiagrams.activities.expressions.ActivitiesExpressionsFactory;

import org.storydriven.storydiagrams.calls.CallsFactory;
import org.storydriven.storydiagrams.calls.expressions.CallsExpressionsFactory;

import org.storydriven.storydiagrams.patterns.expressions.PatternsExpressionsFactory;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ReturnStatement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReturnStatementItemProvider
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
	public ReturnStatementItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION);
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
	 * This returns ReturnStatement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ReturnStatement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ReturnStatement)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_ReturnStatement_type") :
			getString("_UI_ReturnStatement_type") + " " + label;
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

		switch (notification.getFeatureID(ReturnStatement.class)) {
			case ActionLanguagePackage.RETURN_STATEMENT__EXPRESSION:
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
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createOperationCall()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
				 ActionLanguageFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
				 CoreFactory.eINSTANCE.createActivityCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
				 ActivitiesExpressionsFactory.eINSTANCE.createExceptionVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
				 CallsExpressionsFactory.eINSTANCE.createMethodCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
				 CallsExpressionsFactory.eINSTANCE.createParameterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
				 PatternsExpressionsFactory.eINSTANCE.createAttributeValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
				 PatternsExpressionsFactory.eINSTANCE.createObjectVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
				 PatternsExpressionsFactory.eINSTANCE.createCollectionSizeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.RETURN_STATEMENT__EXPRESSION,
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
