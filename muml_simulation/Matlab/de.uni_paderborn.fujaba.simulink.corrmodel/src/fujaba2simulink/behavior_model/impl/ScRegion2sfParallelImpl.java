/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Region;
import de.uni_paderborn.fujaba.simulink.model.stateflow.State;
import fujaba2simulink.behavior_model.Behavior_modelPackage;
import fujaba2simulink.behavior_model.ScRegion2sfParallel;
import fujaba2simulink.impl.AbstractContainerCorrespondenceNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sc Region2sf Parallel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.impl.ScRegion2sfParallelImpl#getScRegion <em>Sc Region</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.ScRegion2sfParallelImpl#getSfParallelState <em>Sf Parallel State</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.ScRegion2sfParallelImpl#getScRegRtsc <em>Sc Reg Rtsc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScRegion2sfParallelImpl extends AbstractContainerCorrespondenceNodeImpl implements ScRegion2sfParallel {
	/**
	 * The cached value of the '{@link #getScRegion() <em>Sc Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScRegion()
	 * @generated
	 * @ordered
	 */
	protected Region scRegion;

	/**
	 * The cached value of the '{@link #getSfParallelState() <em>Sf Parallel State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfParallelState()
	 * @generated
	 * @ordered
	 */
	protected State sfParallelState;

	/**
	 * The cached value of the '{@link #getScRegRtsc() <em>Sc Reg Rtsc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScRegRtsc()
	 * @generated
	 * @ordered
	 */
	protected RealtimeStatechart scRegRtsc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScRegion2sfParallelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Behavior_modelPackage.Literals.SC_REGION2SF_PARALLEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getScRegion() {
		if (scRegion != null && scRegion.eIsProxy()) {
			InternalEObject oldScRegion = (InternalEObject)scRegion;
			scRegion = (Region)eResolveProxy(oldScRegion);
			if (scRegion != oldScRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_REGION2SF_PARALLEL__SC_REGION, oldScRegion, scRegion));
			}
		}
		return scRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region basicGetScRegion() {
		return scRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScRegion(Region newScRegion) {
		Region oldScRegion = scRegion;
		scRegion = newScRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_REGION2SF_PARALLEL__SC_REGION, oldScRegion, scRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSfParallelState() {
		if (sfParallelState != null && ((EObject)sfParallelState).eIsProxy()) {
			InternalEObject oldSfParallelState = (InternalEObject)sfParallelState;
			sfParallelState = (State)eResolveProxy(oldSfParallelState);
			if (sfParallelState != oldSfParallelState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_REGION2SF_PARALLEL__SF_PARALLEL_STATE, oldSfParallelState, sfParallelState));
			}
		}
		return sfParallelState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSfParallelState() {
		return sfParallelState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfParallelState(State newSfParallelState) {
		State oldSfParallelState = sfParallelState;
		sfParallelState = newSfParallelState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_REGION2SF_PARALLEL__SF_PARALLEL_STATE, oldSfParallelState, sfParallelState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechart getScRegRtsc() {
		if (scRegRtsc != null && scRegRtsc.eIsProxy()) {
			InternalEObject oldScRegRtsc = (InternalEObject)scRegRtsc;
			scRegRtsc = (RealtimeStatechart)eResolveProxy(oldScRegRtsc);
			if (scRegRtsc != oldScRegRtsc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_REGION2SF_PARALLEL__SC_REG_RTSC, oldScRegRtsc, scRegRtsc));
			}
		}
		return scRegRtsc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechart basicGetScRegRtsc() {
		return scRegRtsc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScRegRtsc(RealtimeStatechart newScRegRtsc) {
		RealtimeStatechart oldScRegRtsc = scRegRtsc;
		scRegRtsc = newScRegRtsc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_REGION2SF_PARALLEL__SC_REG_RTSC, oldScRegRtsc, scRegRtsc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Behavior_modelPackage.SC_REGION2SF_PARALLEL__SC_REGION:
				if (resolve) return getScRegion();
				return basicGetScRegion();
			case Behavior_modelPackage.SC_REGION2SF_PARALLEL__SF_PARALLEL_STATE:
				if (resolve) return getSfParallelState();
				return basicGetSfParallelState();
			case Behavior_modelPackage.SC_REGION2SF_PARALLEL__SC_REG_RTSC:
				if (resolve) return getScRegRtsc();
				return basicGetScRegRtsc();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Behavior_modelPackage.SC_REGION2SF_PARALLEL__SC_REGION:
				setScRegion((Region)newValue);
				return;
			case Behavior_modelPackage.SC_REGION2SF_PARALLEL__SF_PARALLEL_STATE:
				setSfParallelState((State)newValue);
				return;
			case Behavior_modelPackage.SC_REGION2SF_PARALLEL__SC_REG_RTSC:
				setScRegRtsc((RealtimeStatechart)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Behavior_modelPackage.SC_REGION2SF_PARALLEL__SC_REGION:
				setScRegion((Region)null);
				return;
			case Behavior_modelPackage.SC_REGION2SF_PARALLEL__SF_PARALLEL_STATE:
				setSfParallelState((State)null);
				return;
			case Behavior_modelPackage.SC_REGION2SF_PARALLEL__SC_REG_RTSC:
				setScRegRtsc((RealtimeStatechart)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Behavior_modelPackage.SC_REGION2SF_PARALLEL__SC_REGION:
				return scRegion != null;
			case Behavior_modelPackage.SC_REGION2SF_PARALLEL__SF_PARALLEL_STATE:
				return sfParallelState != null;
			case Behavior_modelPackage.SC_REGION2SF_PARALLEL__SC_REG_RTSC:
				return scRegRtsc != null;
		}
		return super.eIsSet(featureID);
	}

} //ScRegion2sfParallelImpl
