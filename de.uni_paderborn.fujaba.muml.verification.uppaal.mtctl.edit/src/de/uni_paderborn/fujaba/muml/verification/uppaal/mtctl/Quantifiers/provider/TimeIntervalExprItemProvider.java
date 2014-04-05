/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.provider;


import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.BooleanLogicFactory;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesFactory;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicatesFactory;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifiersFactory;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifiersPackage;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.TimeIntervalExpr;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.SetsFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

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

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.TimeIntervalExpr} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeIntervalExprItemProvider
	extends TemporalQuantifierExprItemProvider
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
	public TimeIntervalExprItemProvider(AdapterFactory adapterFactory) {
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

			addLowerPropertyDescriptor(object);
			addUpperPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Lower feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeIntervalExpr_lower_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeIntervalExpr_lower_feature", "_UI_TimeIntervalExpr_type"),
				 QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LOWER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Upper feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeIntervalExpr_upper_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeIntervalExpr_upper_feature", "_UI_TimeIntervalExpr_type"),
				 QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__UPPER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS);
			childrenFeatures.add(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS);
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
	 * This returns TimeIntervalExpr.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TimeIntervalExpr"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TimeIntervalExpr)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_TimeIntervalExpr_type") :
			getString("_UI_TimeIntervalExpr_type") + " " + label;
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

		switch (notification.getFeatureID(TimeIntervalExpr.class)) {
			case QuantifiersPackage.TIME_INTERVAL_EXPR__LOWER:
			case QuantifiersPackage.TIME_INTERVAL_EXPR__UPPER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case QuantifiersPackage.TIME_INTERVAL_EXPR__LHS:
			case QuantifiersPackage.TIME_INTERVAL_EXPR__RHS:
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
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 QuantifiersFactory.eINSTANCE.createAFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 QuantifiersFactory.eINSTANCE.createAGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 QuantifiersFactory.eINSTANCE.createEFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 QuantifiersFactory.eINSTANCE.createEGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 QuantifiersFactory.eINSTANCE.createExistenceQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 QuantifiersFactory.eINSTANCE.createBoundVariable()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 QuantifiersFactory.eINSTANCE.createUniversalQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 QuantifiersFactory.eINSTANCE.createLeadsToExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 QuantifiersFactory.eINSTANCE.createTimeIntervalExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 PredicatesFactory.eINSTANCE.createPredicateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 PredicatesFactory.eINSTANCE.createDeadlockExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 PredicatesFactory.eINSTANCE.createBufferOverflowExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 PredicatesFactory.eINSTANCE.createComparisonExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 PredicatesFactory.eINSTANCE.createMessageInBufferExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 PredicatesFactory.eINSTANCE.createMessageInTransitExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 PredicatesFactory.eINSTANCE.createStateActiveExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 PredicatesFactory.eINSTANCE.createSubstateOfExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 PredicatesFactory.eINSTANCE.createTransitionFiringExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 PredicatesFactory.eINSTANCE.createTrueExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 PredicatesFactory.eINSTANCE.createFalseExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 SetsFactory.eINSTANCE.createClockSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 SetsFactory.eINSTANCE.createIntervalSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 SetsFactory.eINSTANCE.createMessageSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 SetsFactory.eINSTANCE.createStateSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 SetsFactory.eINSTANCE.createTransitionSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 SetsFactory.eINSTANCE.createBufferSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 BooleanLogicFactory.eINSTANCE.createAndExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 BooleanLogicFactory.eINSTANCE.createImplyExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 BooleanLogicFactory.eINSTANCE.createNotExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 BooleanLogicFactory.eINSTANCE.createOrExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 ComparablesFactory.eINSTANCE.createBufferMsgCountExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 ComparablesFactory.eINSTANCE.createConstExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 ComparablesFactory.eINSTANCE.createMumlElemExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 ComparablesFactory.eINSTANCE.createSourceStateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS,
				 ComparablesFactory.eINSTANCE.createTargetStateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 QuantifiersFactory.eINSTANCE.createAFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 QuantifiersFactory.eINSTANCE.createAGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 QuantifiersFactory.eINSTANCE.createEFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 QuantifiersFactory.eINSTANCE.createEGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 QuantifiersFactory.eINSTANCE.createExistenceQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 QuantifiersFactory.eINSTANCE.createBoundVariable()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 QuantifiersFactory.eINSTANCE.createUniversalQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 QuantifiersFactory.eINSTANCE.createLeadsToExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 QuantifiersFactory.eINSTANCE.createTimeIntervalExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 PredicatesFactory.eINSTANCE.createPredicateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 PredicatesFactory.eINSTANCE.createDeadlockExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 PredicatesFactory.eINSTANCE.createBufferOverflowExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 PredicatesFactory.eINSTANCE.createComparisonExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 PredicatesFactory.eINSTANCE.createMessageInBufferExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 PredicatesFactory.eINSTANCE.createMessageInTransitExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 PredicatesFactory.eINSTANCE.createStateActiveExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 PredicatesFactory.eINSTANCE.createSubstateOfExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 PredicatesFactory.eINSTANCE.createTransitionFiringExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 PredicatesFactory.eINSTANCE.createTrueExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 PredicatesFactory.eINSTANCE.createFalseExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 SetsFactory.eINSTANCE.createClockSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 SetsFactory.eINSTANCE.createIntervalSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 SetsFactory.eINSTANCE.createMessageSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 SetsFactory.eINSTANCE.createStateSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 SetsFactory.eINSTANCE.createTransitionSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 SetsFactory.eINSTANCE.createBufferSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 BooleanLogicFactory.eINSTANCE.createAndExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 BooleanLogicFactory.eINSTANCE.createImplyExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 BooleanLogicFactory.eINSTANCE.createNotExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 BooleanLogicFactory.eINSTANCE.createOrExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 ComparablesFactory.eINSTANCE.createBufferMsgCountExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 ComparablesFactory.eINSTANCE.createConstExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 ComparablesFactory.eINSTANCE.createMumlElemExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 ComparablesFactory.eINSTANCE.createSourceStateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS,
				 ComparablesFactory.eINSTANCE.createTargetStateExpr()));
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
			childFeature == QuantifiersPackage.Literals.TEMPORAL_QUANTIFIER_EXPR__EXPR ||
			childFeature == QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__LHS ||
			childFeature == QuantifiersPackage.Literals.TIME_INTERVAL_EXPR__RHS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
