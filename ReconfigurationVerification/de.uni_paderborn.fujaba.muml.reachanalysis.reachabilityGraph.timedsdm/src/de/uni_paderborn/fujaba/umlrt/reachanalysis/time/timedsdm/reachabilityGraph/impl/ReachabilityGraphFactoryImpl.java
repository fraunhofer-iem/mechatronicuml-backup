/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.ReachabilityGraphFactory;
import de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.ReachabilityGraphPackage;
import de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.TimedGTSDelayTransition;
import de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.TimedStepGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReachabilityGraphFactoryImpl extends EFactoryImpl implements ReachabilityGraphFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReachabilityGraphFactory init() {
		try {
			ReachabilityGraphFactory theReachabilityGraphFactory = (ReachabilityGraphFactory)EPackage.Registry.INSTANCE.getEFactory(ReachabilityGraphPackage.eNS_URI);
			if (theReachabilityGraphFactory != null) {
				return theReachabilityGraphFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReachabilityGraphFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReachabilityGraphFactoryImpl() {
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
			case ReachabilityGraphPackage.TIMED_STEP_GRAPH: return createTimedStepGraph();
			case ReachabilityGraphPackage.TIMED_GTS_DELAY_TRANSITION: return createTimedGTSDelayTransition();
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
	public ReachabilityGraphPackage getReachabilityGraphPackage() {
		return (ReachabilityGraphPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReachabilityGraphPackage getPackage() {
		return ReachabilityGraphPackage.eINSTANCE;
	}

} //ReachabilityGraphFactoryImpl
