/**
 */
package org.muml.uppaal.adapter.mtctl.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.core.provider.CommentableElementItemProvider;
import org.muml.uppaal.adapter.mtctl.MtctlPackage;
import org.muml.uppaal.adapter.mtctl.Property;
import org.muml.uppaal.adapter.mtctl.booleanlogic.BooleanlogicFactory;
import org.muml.uppaal.adapter.mtctl.comparables.ComparablesFactory;
import org.muml.uppaal.adapter.mtctl.predicates.PredicatesFactory;
import org.muml.uppaal.adapter.mtctl.quantifiers.QuantifiersFactory;
import org.muml.uppaal.adapter.mtctl.sets.SetsFactory;

/**
 * This is the item provider adapter for a {@link org.muml.uppaal.adapter.mtctl.Property} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyItemProvider
	extends CommentableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(MtctlPackage.Literals.PROPERTY__EXPRESSION);
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
	 * This returns Property.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Property"));
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
		String label = ((Property)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_Property_type") :
			getString("_UI_Property_type") + " " + label;
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

		switch (notification.getFeatureID(Property.class)) {
			case MtctlPackage.PROPERTY__EXPRESSION:
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
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 QuantifiersFactory.eINSTANCE.createAFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 QuantifiersFactory.eINSTANCE.createAGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 QuantifiersFactory.eINSTANCE.createEFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 QuantifiersFactory.eINSTANCE.createEGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 QuantifiersFactory.eINSTANCE.createExistenceQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 QuantifiersFactory.eINSTANCE.createBoundVariable()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 QuantifiersFactory.eINSTANCE.createUniversalQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 QuantifiersFactory.eINSTANCE.createLeadsToExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 PredicatesFactory.eINSTANCE.createPredicateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 PredicatesFactory.eINSTANCE.createDeadlockExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 PredicatesFactory.eINSTANCE.createConnectorOverflowExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 PredicatesFactory.eINSTANCE.createComparisonExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 PredicatesFactory.eINSTANCE.createMessageInBufferExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 PredicatesFactory.eINSTANCE.createMessageInTransitExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 PredicatesFactory.eINSTANCE.createStateActiveExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 PredicatesFactory.eINSTANCE.createSubstateOfExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 PredicatesFactory.eINSTANCE.createTransitionFiringExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 PredicatesFactory.eINSTANCE.createTrueExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 PredicatesFactory.eINSTANCE.createFalseExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 PredicatesFactory.eINSTANCE.createStateInStatechartExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 PredicatesFactory.eINSTANCE.createMessageDiscardedExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 SetsFactory.eINSTANCE.createClockSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 SetsFactory.eINSTANCE.createIntervalSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 SetsFactory.eINSTANCE.createMessageSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 SetsFactory.eINSTANCE.createStateSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 SetsFactory.eINSTANCE.createTransitionSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 SetsFactory.eINSTANCE.createBufferSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 SetsFactory.eINSTANCE.createInstanceSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 SetsFactory.eINSTANCE.createSubinstanceSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 BooleanlogicFactory.eINSTANCE.createAndExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 BooleanlogicFactory.eINSTANCE.createImplyExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 BooleanlogicFactory.eINSTANCE.createNotExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 BooleanlogicFactory.eINSTANCE.createOrExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 ComparablesFactory.eINSTANCE.createBufferMsgCountExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 ComparablesFactory.eINSTANCE.createConstExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 ComparablesFactory.eINSTANCE.createMumlElemExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 ComparablesFactory.eINSTANCE.createSourceStateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(MtctlPackage.Literals.PROPERTY__EXPRESSION,
				 ComparablesFactory.eINSTANCE.createTargetStateExpr()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MtctlEditPlugin.INSTANCE;
	}

}
