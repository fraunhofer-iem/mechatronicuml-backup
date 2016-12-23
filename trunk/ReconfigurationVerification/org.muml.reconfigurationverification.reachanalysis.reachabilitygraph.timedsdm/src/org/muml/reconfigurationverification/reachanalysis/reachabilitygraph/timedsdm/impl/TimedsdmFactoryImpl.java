/**
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimedsdmFactoryImpl extends EFactoryImpl implements TimedsdmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimedsdmFactory init() {
		try {
			TimedsdmFactory theTimedsdmFactory = (TimedsdmFactory)EPackage.Registry.INSTANCE.getEFactory(TimedsdmPackage.eNS_URI);
			if (theTimedsdmFactory != null) {
				return theTimedsdmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TimedsdmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedsdmFactoryImpl() {
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
			case TimedsdmPackage.TIMED_STEP_GRAPH: return createTimedStepGraph();
			case TimedsdmPackage.TIMED_GTS_DELAY_TRANSITION: return createTimedGTSDelayTransition();
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
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedStepGraph createTimedStepGraph() {
		TimedStepGraphImpl timedStepGraph = new TimedStepGraphImpl();
		return timedStepGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedGTSDelayTransition createTimedGTSDelayTransition() {
		TimedGTSDelayTransitionImpl timedGTSDelayTransition = new TimedGTSDelayTransitionImpl();
		return timedGTSDelayTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedsdmPackage getTimedsdmPackage() {
		return (TimedsdmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TimedsdmPackage getPackage() {
		return TimedsdmPackage.eINSTANCE;
	}

} //TimedsdmFactoryImpl
