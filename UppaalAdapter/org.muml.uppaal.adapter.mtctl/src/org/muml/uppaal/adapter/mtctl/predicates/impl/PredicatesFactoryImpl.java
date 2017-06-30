/**
 */
package org.muml.uppaal.adapter.mtctl.predicates.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.uppaal.adapter.mtctl.predicates.ComparisonExpr;
import org.muml.uppaal.adapter.mtctl.predicates.ComparisonOp;
import org.muml.uppaal.adapter.mtctl.predicates.ConnectorOverflowExpr;
import org.muml.uppaal.adapter.mtctl.predicates.DeadlockExpr;
import org.muml.uppaal.adapter.mtctl.predicates.FalseExpr;
import org.muml.uppaal.adapter.mtctl.predicates.MessageDiscardedExpr;
import org.muml.uppaal.adapter.mtctl.predicates.MessageInBufferExpr;
import org.muml.uppaal.adapter.mtctl.predicates.MessageInTransitExpr;
import org.muml.uppaal.adapter.mtctl.predicates.PredicateExpr;
import org.muml.uppaal.adapter.mtctl.predicates.PredicatesFactory;
import org.muml.uppaal.adapter.mtctl.predicates.PredicatesPackage;
import org.muml.uppaal.adapter.mtctl.predicates.StateActiveExpr;
import org.muml.uppaal.adapter.mtctl.predicates.StateInStatechartExpr;
import org.muml.uppaal.adapter.mtctl.predicates.SubstateOfExpr;
import org.muml.uppaal.adapter.mtctl.predicates.TransitionFiringExpr;
import org.muml.uppaal.adapter.mtctl.predicates.TrueExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PredicatesFactoryImpl extends EFactoryImpl implements PredicatesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PredicatesFactory init() {
		try {
			PredicatesFactory thePredicatesFactory = (PredicatesFactory)EPackage.Registry.INSTANCE.getEFactory(PredicatesPackage.eNS_URI);
			if (thePredicatesFactory != null) {
				return thePredicatesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PredicatesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicatesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PredicatesPackage.DEADLOCK_EXPR: return createDeadlockExpr();
			case PredicatesPackage.CONNECTOR_OVERFLOW_EXPR: return createConnectorOverflowExpr();
			case PredicatesPackage.COMPARISON_EXPR: return createComparisonExpr();
			case PredicatesPackage.MESSAGE_IN_BUFFER_EXPR: return createMessageInBufferExpr();
			case PredicatesPackage.MESSAGE_IN_TRANSIT_EXPR: return createMessageInTransitExpr();
			case PredicatesPackage.STATE_ACTIVE_EXPR: return createStateActiveExpr();
			case PredicatesPackage.SUBSTATE_OF_EXPR: return createSubstateOfExpr();
			case PredicatesPackage.TRANSITION_FIRING_EXPR: return createTransitionFiringExpr();
			case PredicatesPackage.PREDICATE_EXPR: return createPredicateExpr();
			case PredicatesPackage.TRUE_EXPR: return createTrueExpr();
			case PredicatesPackage.FALSE_EXPR: return createFalseExpr();
			case PredicatesPackage.STATE_IN_STATECHART_EXPR: return createStateInStatechartExpr();
			case PredicatesPackage.MESSAGE_DISCARDED_EXPR: return createMessageDiscardedExpr();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PredicatesPackage.COMPARISON_OP:
				return createComparisonOpFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PredicatesPackage.COMPARISON_OP:
				return convertComparisonOpToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeadlockExpr createDeadlockExpr() {
		DeadlockExprImpl deadlockExpr = new DeadlockExprImpl();
		return deadlockExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorOverflowExpr createConnectorOverflowExpr() {
		ConnectorOverflowExprImpl connectorOverflowExpr = new ConnectorOverflowExprImpl();
		return connectorOverflowExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonExpr createComparisonExpr() {
		ComparisonExprImpl comparisonExpr = new ComparisonExprImpl();
		return comparisonExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInBufferExpr createMessageInBufferExpr() {
		MessageInBufferExprImpl messageInBufferExpr = new MessageInBufferExprImpl();
		return messageInBufferExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInTransitExpr createMessageInTransitExpr() {
		MessageInTransitExprImpl messageInTransitExpr = new MessageInTransitExprImpl();
		return messageInTransitExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateActiveExpr createStateActiveExpr() {
		StateActiveExprImpl stateActiveExpr = new StateActiveExprImpl();
		return stateActiveExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstateOfExpr createSubstateOfExpr() {
		SubstateOfExprImpl substateOfExpr = new SubstateOfExprImpl();
		return substateOfExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionFiringExpr createTransitionFiringExpr() {
		TransitionFiringExprImpl transitionFiringExpr = new TransitionFiringExprImpl();
		return transitionFiringExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateExpr createPredicateExpr() {
		PredicateExprImpl predicateExpr = new PredicateExprImpl();
		return predicateExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueExpr createTrueExpr() {
		TrueExprImpl trueExpr = new TrueExprImpl();
		return trueExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FalseExpr createFalseExpr() {
		FalseExprImpl falseExpr = new FalseExprImpl();
		return falseExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateInStatechartExpr createStateInStatechartExpr() {
		StateInStatechartExprImpl stateInStatechartExpr = new StateInStatechartExprImpl();
		return stateInStatechartExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDiscardedExpr createMessageDiscardedExpr() {
		MessageDiscardedExprImpl messageDiscardedExpr = new MessageDiscardedExprImpl();
		return messageDiscardedExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOp createComparisonOpFromString(EDataType eDataType, String initialValue) {
		ComparisonOp result = ComparisonOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicatesPackage getPredicatesPackage() {
		return (PredicatesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PredicatesPackage getPackage() {
		return PredicatesPackage.eINSTANCE;
	}

} //PredicatesFactoryImpl
