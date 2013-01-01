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
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
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
import de.uni_paderborn.fujaba.muml.model.actionLanguage.IfStatement;
import de.uni_paderborn.fujaba.muml.model.behavior.BehaviorFactory;


/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.IfStatement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfStatementItemProvider
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
	public IfStatementItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ActionLanguagePackage.Literals.IF_STATEMENT__IF_CONDITION);
			childrenFeatures.add(ActionLanguagePackage.Literals.IF_STATEMENT__IF_BLOCK);
			childrenFeatures.add(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_CONDITIONS);
			childrenFeatures.add(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_BLOCKS);
			childrenFeatures.add(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_BLOCK);
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
	 * This returns IfStatement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfStatement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfStatement)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_IfStatement_type") :
			getString("_UI_IfStatement_type") + " " + label;
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

		switch (notification.getFeatureID(IfStatement.class)) {
			case ActionLanguagePackage.IF_STATEMENT__IF_CONDITION:
			case ActionLanguagePackage.IF_STATEMENT__IF_BLOCK:
			case ActionLanguagePackage.IF_STATEMENT__ELSE_IF_CONDITIONS:
			case ActionLanguagePackage.IF_STATEMENT__ELSE_IF_BLOCKS:
			case ActionLanguagePackage.IF_STATEMENT__ELSE_BLOCK:
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
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_CONDITION,
				 ActionLanguageFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_CONDITION,
				 ActionLanguageFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_CONDITION,
				 ActionLanguageFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_CONDITION,
				 ActionLanguageFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_CONDITION,
				 ActionLanguageFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_CONDITION,
				 ActionLanguageFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_CONDITION,
				 ActionLanguageFactory.eINSTANCE.createVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_CONDITION,
				 ActionLanguageFactory.eINSTANCE.createOperationCall()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_CONDITION,
				 ActionLanguageFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_CONDITION,
				 ActionLanguageFactory.eINSTANCE.createTriggerMessageExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_CONDITION,
				 ActionLanguageFactory.eINSTANCE.createDiscreteInteractionEndpointReference()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_CONDITION,
				 ActionLanguageFactory.eINSTANCE.createPositionSelector()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_CONDITION,
				 ActionLanguageFactory.eINSTANCE.createLocalVariableDeclarationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_CONDITION,
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_CONDITION,
				 CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_CONDITION,
				 CommonExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_CONDITION,
				 CommonExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_CONDITION,
				 CommonExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_CONDITION,
				 CommonExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_BLOCK,
				 ActionLanguageFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_BLOCK,
				 ActionLanguageFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_BLOCK,
				 ActionLanguageFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__IF_BLOCK,
				 ActionLanguageFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_CONDITIONS,
				 ActionLanguageFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_CONDITIONS,
				 ActionLanguageFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_CONDITIONS,
				 ActionLanguageFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_CONDITIONS,
				 ActionLanguageFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_CONDITIONS,
				 ActionLanguageFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_CONDITIONS,
				 ActionLanguageFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_CONDITIONS,
				 ActionLanguageFactory.eINSTANCE.createVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_CONDITIONS,
				 ActionLanguageFactory.eINSTANCE.createOperationCall()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_CONDITIONS,
				 ActionLanguageFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_CONDITIONS,
				 ActionLanguageFactory.eINSTANCE.createTriggerMessageExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_CONDITIONS,
				 ActionLanguageFactory.eINSTANCE.createDiscreteInteractionEndpointReference()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_CONDITIONS,
				 ActionLanguageFactory.eINSTANCE.createPositionSelector()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_CONDITIONS,
				 ActionLanguageFactory.eINSTANCE.createLocalVariableDeclarationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_CONDITIONS,
				 CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_CONDITIONS,
				 CommonExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_CONDITIONS,
				 CommonExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_CONDITIONS,
				 CommonExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_CONDITIONS,
				 CommonExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_BLOCKS,
				 ActionLanguageFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_BLOCKS,
				 ActionLanguageFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_BLOCKS,
				 ActionLanguageFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_BLOCKS,
				 ActionLanguageFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_BLOCK,
				 ActionLanguageFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_BLOCK,
				 ActionLanguageFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_BLOCK,
				 ActionLanguageFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_BLOCK,
				 ActionLanguageFactory.eINSTANCE.createForLoop()));
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
			childFeature == ActionLanguagePackage.Literals.IF_STATEMENT__IF_CONDITION ||
			childFeature == ActionLanguagePackage.Literals.IF_STATEMENT__IF_BLOCK ||
			childFeature == ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_CONDITIONS ||
			childFeature == ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_IF_BLOCKS ||
			childFeature == ActionLanguagePackage.Literals.IF_STATEMENT__ELSE_BLOCK;

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
		return ActionLanguageEditPlugin.INSTANCE;
	}

}
