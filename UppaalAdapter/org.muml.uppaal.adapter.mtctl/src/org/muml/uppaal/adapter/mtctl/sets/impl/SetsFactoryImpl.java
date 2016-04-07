/**
 */
package org.muml.uppaal.adapter.mtctl.sets.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.uppaal.adapter.mtctl.sets.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SetsFactoryImpl extends EFactoryImpl implements SetsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SetsFactory init() {
		try {
			SetsFactory theSetsFactory = (SetsFactory)EPackage.Registry.INSTANCE.getEFactory(SetsPackage.eNS_URI);
			if (theSetsFactory != null) {
				return theSetsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SetsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetsFactoryImpl() {
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
			case SetsPackage.CLOCK_SET_EXPR: return createClockSetExpr();
			case SetsPackage.INTERVAL_SET_EXPR: return createIntervalSetExpr();
			case SetsPackage.MESSAGE_SET_EXPR: return createMessageSetExpr();
			case SetsPackage.STATE_SET_EXPR: return createStateSetExpr();
			case SetsPackage.TRANSITION_SET_EXPR: return createTransitionSetExpr();
			case SetsPackage.BUFFER_SET_EXPR: return createBufferSetExpr();
			case SetsPackage.INSTANCE_SET_EXPR: return createInstanceSetExpr();
			case SetsPackage.SUBINSTANCE_SET_EXPR: return createSubinstanceSetExpr();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockSetExpr createClockSetExpr() {
		ClockSetExprImpl clockSetExpr = new ClockSetExprImpl();
		return clockSetExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalSetExpr createIntervalSetExpr() {
		IntervalSetExprImpl intervalSetExpr = new IntervalSetExprImpl();
		return intervalSetExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSetExpr createMessageSetExpr() {
		MessageSetExprImpl messageSetExpr = new MessageSetExprImpl();
		return messageSetExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSetExpr createStateSetExpr() {
		StateSetExprImpl stateSetExpr = new StateSetExprImpl();
		return stateSetExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionSetExpr createTransitionSetExpr() {
		TransitionSetExprImpl transitionSetExpr = new TransitionSetExprImpl();
		return transitionSetExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferSetExpr createBufferSetExpr() {
		BufferSetExprImpl bufferSetExpr = new BufferSetExprImpl();
		return bufferSetExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSetExpr createInstanceSetExpr() {
		InstanceSetExprImpl instanceSetExpr = new InstanceSetExprImpl();
		return instanceSetExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubinstanceSetExpr createSubinstanceSetExpr() {
		SubinstanceSetExprImpl subinstanceSetExpr = new SubinstanceSetExprImpl();
		return subinstanceSetExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetsPackage getSetsPackage() {
		return (SetsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SetsPackage getPackage() {
		return SetsPackage.eINSTANCE;
	}

} //SetsFactoryImpl
