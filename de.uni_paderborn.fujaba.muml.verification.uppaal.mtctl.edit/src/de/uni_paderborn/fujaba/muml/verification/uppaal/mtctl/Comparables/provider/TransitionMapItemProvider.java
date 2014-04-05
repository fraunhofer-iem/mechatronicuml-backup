/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.provider;


import de.uni_paderborn.fujaba.muml.behavior.BehaviorFactory;

import de.uni_paderborn.fujaba.muml.component.ComponentFactory;

import de.uni_paderborn.fujaba.muml.connector.ConnectorFactory;

import de.uni_paderborn.fujaba.muml.instance.InstanceFactory;

import de.uni_paderborn.fujaba.muml.msgtype.MsgtypeFactory;

import de.uni_paderborn.fujaba.muml.protocol.ProtocolFactory;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartFactory;

import de.uni_paderborn.fujaba.muml.types.TypesFactory;

import de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.BooleanLogicFactory;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesFactory;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesPackage;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.TransitionMap;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.MtctlFactory;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicatesFactory;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifiersFactory;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.SetsFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.storydriven.core.expressions.ExpressionsFactory;

import org.storydriven.core.expressions.common.CommonExpressionsFactory;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.TransitionMap} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionMapItemProvider
	extends MapExprItemProvider
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
	public TransitionMapItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TransitionMap)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_TransitionMap_type") :
			getString("_UI_TransitionMap_type") + " " + label;
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

		switch (notification.getFeatureID(TransitionMap.class)) {
			case ComparablesPackage.TRANSITION_MAP__TRANSITION:
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
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ComparablesFactory.eINSTANCE.createBufferMsgCountExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ComparablesFactory.eINSTANCE.createConstExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ComparablesFactory.eINSTANCE.createMumlElemExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ComparablesFactory.eINSTANCE.createSourceStateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ComparablesFactory.eINSTANCE.createTargetStateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 MtctlFactory.eINSTANCE.createPropertyRepository()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 QuantifiersFactory.eINSTANCE.createAFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 QuantifiersFactory.eINSTANCE.createAGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 QuantifiersFactory.eINSTANCE.createEFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 QuantifiersFactory.eINSTANCE.createEGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 QuantifiersFactory.eINSTANCE.createExistenceQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 QuantifiersFactory.eINSTANCE.createBoundVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 QuantifiersFactory.eINSTANCE.createUniversalQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 QuantifiersFactory.eINSTANCE.createLeadsToExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 QuantifiersFactory.eINSTANCE.createTimeIntervalExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 PredicatesFactory.eINSTANCE.createPredicateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 PredicatesFactory.eINSTANCE.createDeadlockExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 PredicatesFactory.eINSTANCE.createBufferOverflowExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 PredicatesFactory.eINSTANCE.createComparisonExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 PredicatesFactory.eINSTANCE.createMessageInBufferExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 PredicatesFactory.eINSTANCE.createMessageInTransitExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 PredicatesFactory.eINSTANCE.createStateActiveExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 PredicatesFactory.eINSTANCE.createSubstateOfExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 PredicatesFactory.eINSTANCE.createTransitionFiringExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 PredicatesFactory.eINSTANCE.createTrueExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 PredicatesFactory.eINSTANCE.createFalseExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 SetsFactory.eINSTANCE.createClockSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 SetsFactory.eINSTANCE.createIntervalSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 SetsFactory.eINSTANCE.createMessageSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 SetsFactory.eINSTANCE.createStateSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 SetsFactory.eINSTANCE.createTransitionSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 SetsFactory.eINSTANCE.createBufferSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 BooleanLogicFactory.eINSTANCE.createAndExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 BooleanLogicFactory.eINSTANCE.createImplyExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 BooleanLogicFactory.eINSTANCE.createNotExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 BooleanLogicFactory.eINSTANCE.createOrExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 CommonExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 CommonExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 CommonExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 CommonExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ComponentFactory.eINSTANCE.createContinuousPort()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ComponentFactory.eINSTANCE.createDiscretePort()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ComponentFactory.eINSTANCE.createComponentPart()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ComponentFactory.eINSTANCE.createStaticStructuredComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ComponentFactory.eINSTANCE.createAssemblyConnector()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ComponentFactory.eINSTANCE.createDelegationConnector()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ComponentFactory.eINSTANCE.createHybridPort()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ComponentFactory.eINSTANCE.createCoordinationProtocolPart()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ComponentFactory.eINSTANCE.createPortPart()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ComponentFactory.eINSTANCE.createStaticAtomicComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 InstanceFactory.eINSTANCE.createAssemblyConnectorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 InstanceFactory.eINSTANCE.createDelegationConnectorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 InstanceFactory.eINSTANCE.createComponentInstanceConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 InstanceFactory.eINSTANCE.createContinuousPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 InstanceFactory.eINSTANCE.createHybridPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 InstanceFactory.eINSTANCE.createDiscreteSinglePortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 InstanceFactory.eINSTANCE.createDiscreteMultiPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 InstanceFactory.eINSTANCE.createCoordinationProtocolInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 InstanceFactory.eINSTANCE.createStructuredComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 InstanceFactory.eINSTANCE.createAtomicComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ProtocolFactory.eINSTANCE.createCoordinationProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ProtocolFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ProtocolFactory.eINSTANCE.createRoleConnector()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ProtocolFactory.eINSTANCE.createConnectorQualityOfServiceAssumptions()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 RealtimestatechartFactory.eINSTANCE.createAbsoluteDeadline()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 RealtimestatechartFactory.eINSTANCE.createRelativeDeadline()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 RealtimestatechartFactory.eINSTANCE.createClock()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 RealtimestatechartFactory.eINSTANCE.createRegion()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 RealtimestatechartFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 RealtimestatechartFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 RealtimestatechartFactory.eINSTANCE.createClockConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 RealtimestatechartFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 RealtimestatechartFactory.eINSTANCE.createAsynchronousMessageEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 RealtimestatechartFactory.eINSTANCE.createDoEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 RealtimestatechartFactory.eINSTANCE.createSynchronizationChannel()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 RealtimestatechartFactory.eINSTANCE.createSynchronization()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 RealtimestatechartFactory.eINSTANCE.createRealtimeStatechart()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 RealtimestatechartFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 RealtimestatechartFactory.eINSTANCE.createEntryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 RealtimestatechartFactory.eINSTANCE.createExitEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 RealtimestatechartFactory.eINSTANCE.createEntryPoint()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 RealtimestatechartFactory.eINSTANCE.createExitPoint()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 MsgtypeFactory.eINSTANCE.createMessageType()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 MsgtypeFactory.eINSTANCE.createMessageTypeRepository()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 TypesFactory.eINSTANCE.createArrayDataType()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 TypesFactory.eINSTANCE.createPrimitiveDataType()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 TypesFactory.eINSTANCE.createRangedPrimitiveDataType()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ConnectorFactory.eINSTANCE.createMessageBuffer()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ValuetypeFactory.eINSTANCE.createCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ValuetypeFactory.eINSTANCE.createTimeValue()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ValuetypeFactory.eINSTANCE.createNaturalNumber()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 ValuetypeFactory.eINSTANCE.createRange()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 BehaviorFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 BehaviorFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 BehaviorFactory.eINSTANCE.createParameterBinding()));

		newChildDescriptors.add
			(createChildParameter
				(ComparablesPackage.Literals.TRANSITION_MAP__TRANSITION,
				 BehaviorFactory.eINSTANCE.createVariable()));
	}

}
