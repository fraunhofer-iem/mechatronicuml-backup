/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ActionTransition;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.HashToStateList;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraph;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphFactory;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage;

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
			case ReachabilityGraphPackage.HASH_TO_STATE_LIST: return createHashToStateList();
			case ReachabilityGraphPackage.HASH_TO_STATE_LIST_MAP_ENTRY: return (EObject)createHashToStateListMapEntry();
			case ReachabilityGraphPackage.REACHABILITY_GRAPH: return createReachabilityGraph();
			case ReachabilityGraphPackage.ACTION_TRANSITION: return createActionTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashToStateList createHashToStateList() {
		HashToStateListImpl hashToStateList = new HashToStateListImpl();
		return hashToStateList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Long, HashToStateList> createHashToStateListMapEntry() {
		HashToStateListMapEntryImpl hashToStateListMapEntry = new HashToStateListMapEntryImpl();
		return hashToStateListMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReachabilityGraph createReachabilityGraph() {
		ReachabilityGraphImpl reachabilityGraph = new ReachabilityGraphImpl();
		return reachabilityGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionTransition createActionTransition() {
		ActionTransitionImpl actionTransition = new ActionTransitionImpl();
		return actionTransition;
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
