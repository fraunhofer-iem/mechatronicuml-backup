/**
 */
package org.muml.uppaal.adapter.mtctl.quantifiers.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.uppaal.adapter.mtctl.booleanlogic.BooleanlogicFactory;
import org.muml.uppaal.adapter.mtctl.comparables.ComparablesFactory;
import org.muml.uppaal.adapter.mtctl.predicates.PredicatesFactory;
import org.muml.uppaal.adapter.mtctl.quantifiers.EGExpr;
import org.muml.uppaal.adapter.mtctl.quantifiers.QuantifiersFactory;
import org.muml.uppaal.adapter.mtctl.quantifiers.QuantifiersPackage;
import org.muml.uppaal.adapter.mtctl.sets.SetsFactory;

/**
 * This is the item provider adapter for a {@link org.muml.uppaal.adapter.mtctl.quantifiers.EGExpr} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EGExprItemProvider
	extends TemporalQuantifierExprItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGExprItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(QuantifiersPackage.Literals.EG_EXPR__EXPR);
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
	 * This returns EGExpr.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EGExpr"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_EGExpr_type");
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

		switch (notification.getFeatureID(EGExpr.class)) {
			case QuantifiersPackage.EG_EXPR__EXPR:
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
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 QuantifiersFactory.eINSTANCE.createAFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 QuantifiersFactory.eINSTANCE.createAGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 QuantifiersFactory.eINSTANCE.createEFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 QuantifiersFactory.eINSTANCE.createEGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 QuantifiersFactory.eINSTANCE.createExistenceQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 QuantifiersFactory.eINSTANCE.createBoundVariable()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 QuantifiersFactory.eINSTANCE.createUniversalQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 QuantifiersFactory.eINSTANCE.createLeadsToExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 PredicatesFactory.eINSTANCE.createPredicateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 PredicatesFactory.eINSTANCE.createDeadlockExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 PredicatesFactory.eINSTANCE.createConnectorOverflowExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 PredicatesFactory.eINSTANCE.createComparisonExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 PredicatesFactory.eINSTANCE.createMessageInBufferExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 PredicatesFactory.eINSTANCE.createMessageInTransitExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 PredicatesFactory.eINSTANCE.createStateActiveExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 PredicatesFactory.eINSTANCE.createSubstateOfExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 PredicatesFactory.eINSTANCE.createTransitionFiringExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 PredicatesFactory.eINSTANCE.createTrueExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 PredicatesFactory.eINSTANCE.createFalseExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 PredicatesFactory.eINSTANCE.createStateInStatechartExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 PredicatesFactory.eINSTANCE.createMessageDiscardedExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 SetsFactory.eINSTANCE.createClockSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 SetsFactory.eINSTANCE.createIntervalSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 SetsFactory.eINSTANCE.createMessageSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 SetsFactory.eINSTANCE.createStateSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 SetsFactory.eINSTANCE.createTransitionSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 SetsFactory.eINSTANCE.createBufferSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 SetsFactory.eINSTANCE.createInstanceSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 SetsFactory.eINSTANCE.createSubinstanceSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 BooleanlogicFactory.eINSTANCE.createAndExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 BooleanlogicFactory.eINSTANCE.createImplyExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 BooleanlogicFactory.eINSTANCE.createNotExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 BooleanlogicFactory.eINSTANCE.createOrExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 ComparablesFactory.eINSTANCE.createBufferMsgCountExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 ComparablesFactory.eINSTANCE.createConstExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 ComparablesFactory.eINSTANCE.createMumlElemExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 ComparablesFactory.eINSTANCE.createSourceStateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.EG_EXPR__EXPR,
				 ComparablesFactory.eINSTANCE.createTargetStateExpr()));
	}

}
