/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st.provider;


import de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsFactory;

import de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpression;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StFactory;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimaryExpressionItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryExpressionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(StPackage.Literals.PRIMARY_EXPRESSION__UNARY_OPERATOR);
			childrenFeatures.add(StPackage.Literals.PRIMARY_EXPRESSION__VALUE);
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
	 * This returns PrimaryExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PrimaryExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_PrimaryExpression_type");
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

		switch (notification.getFeatureID(PrimaryExpression.class)) {
			case StPackage.PRIMARY_EXPRESSION__UNARY_OPERATOR:
			case StPackage.PRIMARY_EXPRESSION__VALUE:
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
				(StPackage.Literals.PRIMARY_EXPRESSION__UNARY_OPERATOR,
				 StFactory.eINSTANCE.createUnaryOperator()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.PRIMARY_EXPRESSION__VALUE,
				 StFactory.eINSTANCE.createPrimaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.PRIMARY_EXPRESSION__VALUE,
				 StFactory.eINSTANCE.createFunctionInvocation()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.PRIMARY_EXPRESSION__VALUE,
				 StFactory.eINSTANCE.createVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.PRIMARY_EXPRESSION__VALUE,
				 StFactory.eINSTANCE.createEnumeratedValueRef()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.PRIMARY_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.PRIMARY_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createNumericLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.PRIMARY_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.PRIMARY_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createBitStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.PRIMARY_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.PRIMARY_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createRealLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.PRIMARY_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createSignedInteger()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.PRIMARY_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createBinaryInteger()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.PRIMARY_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createOctalInteger()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.PRIMARY_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createHexInteger()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.PRIMARY_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createUnsignedInteger()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.PRIMARY_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createTimeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.PRIMARY_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.PRIMARY_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createTimeOfDay()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.PRIMARY_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createDate()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.PRIMARY_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createDateAndTime()));
	}

}
