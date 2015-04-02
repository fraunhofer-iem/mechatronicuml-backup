/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il.provider;


import de.fraunhofer.iem.m4a.IEC61131.languages.il.ExprOperator;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlExpression;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFactory;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage;

import de.fraunhofer.iem.m4a.IEC61131.provider.Iec61131EditPlugin;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IlExpressionItemProvider 
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
	public IlExpressionItemProvider(AdapterFactory adapterFactory) {
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

			addExprOperatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Expr Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExprOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IlExpression_ExprOperator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IlExpression_ExprOperator_feature", "_UI_IlExpression_type"),
				 IlPackage.Literals.IL_EXPRESSION__EXPR_OPERATOR,
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
			childrenFeatures.add(IlPackage.Literals.INSTRUCTION__LABEL);
			childrenFeatures.add(IlPackage.Literals.IL_EXPRESSION__OPERAND);
			childrenFeatures.add(IlPackage.Literals.IL_EXPRESSION__SIMPLE_INSTRUCTION_LIST);
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
	 * This returns IlExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IlExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ExprOperator labelValue = ((IlExpression)object).getExprOperator();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_IlExpression_type") :
			getString("_UI_IlExpression_type") + " " + label;
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

		switch (notification.getFeatureID(IlExpression.class)) {
			case IlPackage.IL_EXPRESSION__EXPR_OPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IlPackage.IL_EXPRESSION__LABEL:
			case IlPackage.IL_EXPRESSION__OPERAND:
			case IlPackage.IL_EXPRESSION__SIMPLE_INSTRUCTION_LIST:
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
				(IlPackage.Literals.INSTRUCTION__LABEL,
				 IlFactory.eINSTANCE.createIlLabel()));

		newChildDescriptors.add
			(createChildParameter
				(IlPackage.Literals.IL_EXPRESSION__OPERAND,
				 IlFactory.eINSTANCE.createOperandConstant()));

		newChildDescriptors.add
			(createChildParameter
				(IlPackage.Literals.IL_EXPRESSION__OPERAND,
				 IlFactory.eINSTANCE.createOperandEnumeratedValue()));

		newChildDescriptors.add
			(createChildParameter
				(IlPackage.Literals.IL_EXPRESSION__OPERAND,
				 IlFactory.eINSTANCE.createOperandVariable()));

		newChildDescriptors.add
			(createChildParameter
				(IlPackage.Literals.IL_EXPRESSION__SIMPLE_INSTRUCTION_LIST,
				 IlFactory.eINSTANCE.createIlExpression()));

		newChildDescriptors.add
			(createChildParameter
				(IlPackage.Literals.IL_EXPRESSION__SIMPLE_INSTRUCTION_LIST,
				 IlFactory.eINSTANCE.createIlFormalFunctCall()));

		newChildDescriptors.add
			(createChildParameter
				(IlPackage.Literals.IL_EXPRESSION__SIMPLE_INSTRUCTION_LIST,
				 IlFactory.eINSTANCE.createSimpleOperationOperand()));

		newChildDescriptors.add
			(createChildParameter
				(IlPackage.Literals.IL_EXPRESSION__SIMPLE_INSTRUCTION_LIST,
				 IlFactory.eINSTANCE.createSimpleOperationFunction()));
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
