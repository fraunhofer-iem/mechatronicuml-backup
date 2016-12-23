/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphTransitionImpl;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.DelayTransition;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.RtscPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delay Transition</b></em>'.
 * <!-- end-user-doc -->
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
