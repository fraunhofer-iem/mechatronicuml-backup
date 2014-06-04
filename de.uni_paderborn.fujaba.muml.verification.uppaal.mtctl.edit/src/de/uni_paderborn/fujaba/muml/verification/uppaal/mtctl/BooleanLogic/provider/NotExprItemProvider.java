/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.provider;


import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.BooleanLogicFactory;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.BooleanLogicPackage;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.NotExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesFactory;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicatesFactory;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifiersFactory;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.SetsFactory;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.provider.ExpressionItemProvider;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.provider.MtctlEditPlugin;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.NotExpr} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NotExprItemProvider
	extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotExprItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BooleanLogicPackage.Literals.NOT_EXPR__OPD);
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
	 * This returns NotExpr.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NotExpr"));
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
		return getString("_UI_NotExpr_type");
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

		switch (notification.getFeatureID(NotExpr.class)) {
			case BooleanLogicPackage.NOT_EXPR__OPD:
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
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 BooleanLogicFactory.eINSTANCE.createAndExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 BooleanLogicFactory.eINSTANCE.createImplyExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 BooleanLogicFactory.eINSTANCE.createNotExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 BooleanLogicFactory.eINSTANCE.createOrExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 QuantifiersFactory.eINSTANCE.createAFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 QuantifiersFactory.eINSTANCE.createAGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 QuantifiersFactory.eINSTANCE.createEFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 QuantifiersFactory.eINSTANCE.createEGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 QuantifiersFactory.eINSTANCE.createExistenceQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 QuantifiersFactory.eINSTANCE.createBoundVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 QuantifiersFactory.eINSTANCE.createUniversalQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 QuantifiersFactory.eINSTANCE.createLeadsToExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 QuantifiersFactory.eINSTANCE.createTimeIntervalExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 PredicatesFactory.eINSTANCE.createPredicateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 PredicatesFactory.eINSTANCE.createDeadlockExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 PredicatesFactory.eINSTANCE.createBufferOverflowExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 PredicatesFactory.eINSTANCE.createComparisonExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 PredicatesFactory.eINSTANCE.createMessageInBufferExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 PredicatesFactory.eINSTANCE.createMessageInTransitExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 PredicatesFactory.eINSTANCE.createStateActiveExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 PredicatesFactory.eINSTANCE.createSubstateOfExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 PredicatesFactory.eINSTANCE.createTransitionFiringExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 PredicatesFactory.eINSTANCE.createTrueExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 PredicatesFactory.eINSTANCE.createFalseExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 PredicatesFactory.eINSTANCE.createStateInStatechartExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 SetsFactory.eINSTANCE.createClockSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 SetsFactory.eINSTANCE.createIntervalSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 SetsFactory.eINSTANCE.createMessageSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 SetsFactory.eINSTANCE.createStateSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 SetsFactory.eINSTANCE.createTransitionSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 SetsFactory.eINSTANCE.createBufferSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 SetsFactory.eINSTANCE.createConnectorEndpointInstanceSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 ComparablesFactory.eINSTANCE.createBufferMsgCountExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 ComparablesFactory.eINSTANCE.createConstExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 ComparablesFactory.eINSTANCE.createMumlElemExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
				 ComparablesFactory.eINSTANCE.createSourceStateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.NOT_EXPR__OPD,
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
