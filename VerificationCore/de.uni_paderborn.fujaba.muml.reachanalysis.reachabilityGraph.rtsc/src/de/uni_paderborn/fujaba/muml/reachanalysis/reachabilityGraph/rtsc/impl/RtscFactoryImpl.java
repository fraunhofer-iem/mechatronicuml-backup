/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.DelayTransition;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.RtscFactory;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.RtscPackage;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraph;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphState;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphTransition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RtscFactoryImpl extends EFactoryImpl implements RtscFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RtscFactory init() {
		try {
			RtscFactory theRtscFactory = (RtscFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.fujaba.de/reachabilityGraph/rtsc/0.4.0"); 
			if (theRtscFactory != null) {
				return theRtscFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RtscFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtscFactoryImpl() {
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
			case RtscPackage.ZONE_GRAPH: return createZoneGraph();
			case RtscPackage.ZONE_GRAPH_STATE: return createZoneGraphState();
			case RtscPackage.ZONE_GRAPH_TRANSITION: return createZoneGraphTransition();
			case RtscPackage.DELAY_TRANSITION: return createDelayTransition();
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
	public ZoneGraph createZoneGraph() {
		ZoneGraphImpl zoneGraph = new ZoneGraphImpl();
		return zoneGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneGraphState createZoneGraphState() {
		ZoneGraphStateImpl zoneGraphState = new ZoneGraphStateImpl();
		return zoneGraphState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneGraphTransition createZoneGraphTransition() {
		ZoneGraphTransitionImpl zoneGraphTransition = new ZoneGraphTransitionImpl();
		return zoneGraphTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayTransition createDelayTransition() {
		DelayTransitionImpl delayTransition = new DelayTransitionImpl();
		return delayTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtscPackage getRtscPackage() {
		return (RtscPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RtscPackage getPackage() {
		return RtscPackage.eINSTANCE;
	}

} //RtscFactoryImpl
