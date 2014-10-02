/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl;

import org.eclipse.emf.ecore.EClass;

import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.impl.ReachabilityGraphTransitionImpl;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.DelayTransition;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.RtscPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delay Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DelayTransitionImpl extends ReachabilityGraphTransitionImpl implements DelayTransition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelayTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtscPackage.Literals.DELAY_TRANSITION;
	}

} //DelayTransitionImpl
