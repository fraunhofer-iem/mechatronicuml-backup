/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.provider;


import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.BooleanLogicFactory;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesFactory;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicatesFactory;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifierExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifiersFactory;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifiersPackage;
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
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifierExpr} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QuantifierExprItemProvider
	extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifierExprItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA);
			childrenFeatures.add(QuantifiersPackage.Literals.QUANTIFIER_EXPR__VAR);
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
		return getString("_UI_QuantifierExpr_type");
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

		switch (notification.getFeatureID(QuantifierExpr.class)) {
			case QuantifiersPackage.QUANTIFIER_EXPR__FORMULA:
			case QuantifiersPackage.QUANTIFIER_EXPR__VAR:
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
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 QuantifiersFactory.eINSTANCE.createAFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 QuantifiersFactory.eINSTANCE.createAGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 QuantifiersFactory.eINSTANCE.createEFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 QuantifiersFactory.eINSTANCE.createEGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 QuantifiersFactory.eINSTANCE.createExistenceQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 QuantifiersFactory.eINSTANCE.createBoundVariable()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 QuantifiersFactory.eINSTANCE.createUniversalQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 QuantifiersFactory.eINSTANCE.createLeadsToExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 QuantifiersFactory.eINSTANCE.createTimeIntervalExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 PredicatesFactory.eINSTANCE.createPredicateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 PredicatesFactory.eINSTANCE.createDeadlockExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 PredicatesFactory.eINSTANCE.createBufferOverflowExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 PredicatesFactory.eINSTANCE.createComparisonExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 PredicatesFactory.eINSTANCE.createMessageInBufferExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 PredicatesFactory.eINSTANCE.createMessageInTransitExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 PredicatesFactory.eINSTANCE.createStateActiveExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 PredicatesFactory.eINSTANCE.createSubstateOfExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 PredicatesFactory.eINSTANCE.createTransitionFiringExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 PredicatesFactory.eINSTANCE.createTrueExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 PredicatesFactory.eINSTANCE.createFalseExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 PredicatesFactory.eINSTANCE.createStateInStatechartExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 SetsFactory.eINSTANCE.createClockSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 SetsFactory.eINSTANCE.createIntervalSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 SetsFactory.eINSTANCE.createMessageSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 SetsFactory.eINSTANCE.createStateSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 SetsFactory.eINSTANCE.createTransitionSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 SetsFactory.eINSTANCE.createBufferSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 SetsFactory.eINSTANCE.createConnectorEndpointInstanceSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 BooleanLogicFactory.eINSTANCE.createAndExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 BooleanLogicFactory.eINSTANCE.createImplyExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 BooleanLogicFactory.eINSTANCE.createNotExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 BooleanLogicFactory.eINSTANCE.createOrExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 ComparablesFactory.eINSTANCE.createBufferMsgCountExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 ComparablesFactory.eINSTANCE.createConstExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 ComparablesFactory.eINSTANCE.createMumlElemExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 ComparablesFactory.eINSTANCE.createSourceStateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA,
				 ComparablesFactory.eINSTANCE.createTargetStateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(QuantifiersPackage.Literals.QUANTIFIER_EXPR__VAR,
				 QuantifiersFactory.eINSTANCE.createBoundVariable()));
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
			childFeature == QuantifiersPackage.Literals.QUANTIFIER_EXPR__FORMULA ||
			childFeature == QuantifiersPackage.Literals.QUANTIFIER_EXPR__VAR;

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
		return MtctlEditPlugin.INSTANCE;
	}

}
