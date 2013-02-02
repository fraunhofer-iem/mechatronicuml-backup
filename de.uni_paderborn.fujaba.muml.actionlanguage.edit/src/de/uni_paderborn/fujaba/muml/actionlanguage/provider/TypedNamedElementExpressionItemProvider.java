/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.actionlanguage.provider;


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
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.core.expressions.ExpressionsFactory;
import org.storydriven.core.expressions.common.CommonExpressionsFactory;
import org.storydriven.core.expressions.provider.ExpressionItemProvider;

import de.uni_paderborn.fujaba.muml.actionlanguage.ActionLanguageFactory;
import de.uni_paderborn.fujaba.muml.actionlanguage.ActionLanguagePackage;
import de.uni_paderborn.fujaba.muml.actionlanguage.TypedNamedElementExpression;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.actionlanguage.TypedNamedElementExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TypedNamedElementExpressionItemProvider
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
	public TypedNamedElementExpressionItemProvider(AdapterFactory adapterFactory) {
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

			addTypedNamedElementPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Typed Named Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypedNamedElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypedNamedElementExpression_typedNamedElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypedNamedElementExpression_typedNamedElement_feature", "_UI_TypedNamedElementExpression_type"),
				 ActionLanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION__TYPED_NAMED_ELEMENT,
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
			childrenFeatures.add(ActionLanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES);
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
	 * This returns TypedNamedElementExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TypedNamedElementExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TypedNamedElementExpression)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_TypedNamedElementExpression_type") :
			getString("_UI_TypedNamedElementExpression_type") + " " + label;
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

		switch (notification.getFeatureID(TypedNamedElementExpression.class)) {
			case ActionLanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES:
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
				(ActionLanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES,
				 ActionLanguageFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES,
				 ActionLanguageFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES,
				 ActionLanguageFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES,
				 ActionLanguageFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES,
				 ActionLanguageFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES,
				 ActionLanguageFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES,
				 ActionLanguageFactory.eINSTANCE.createOperationCall()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES,
				 ActionLanguageFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES,
				 ActionLanguageFactory.eINSTANCE.createTriggerMessageExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES,
				 ActionLanguageFactory.eINSTANCE.createDiscreteInteractionEndpointReference()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES,
				 ActionLanguageFactory.eINSTANCE.createPositionSelector()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES,
				 ActionLanguageFactory.eINSTANCE.createLocalVariableDeclarationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES,
				 ActionLanguageFactory.eINSTANCE.createTypedNamedElementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES,
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES,
				 CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES,
				 CommonExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES,
				 CommonExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES,
				 CommonExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ActionLanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES,
				 CommonExpressionsFactory.eINSTANCE.createLiteralExpression()));
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
