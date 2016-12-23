/**
 */
package org.muml.reconfigurationverification.timedstorychart.transform.helper.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.muml.pim.connector.Connector;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.reconfigurationverification.timedstorychart.transform.helper.HelperPackage;
import org.muml.reconfigurationverification.timedstorychart.transform.helper.TSCTransformationInput;
import org.muml.reconfigurationverification.timedstorychart.transform.helper.TransitionTuple;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSC Transformation Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.TSCTransformationInputImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.TSCTransformationInputImpl#getSyncTransitionTuples <em>Sync Transition Tuples</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.TSCTransformationInputImpl#getNoSyncTransitions <em>No Sync Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TSCTransformationInputImpl extends EObjectImpl implements TSCTransformationInput {
	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected Connector connector;

	/**
	 * The cached value of the '{@link #getSyncTransitionTuples() <em>Sync Transition Tuples</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncTransitionTuples()
	 * @generated
	 * @ordered
	 */
	protected EList<TransitionTuple> syncTransitionTuples;

	/**
	 * The cached value of the '{@link #getNoSyncTransitions() <em>No Sync Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoSyncTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> noSyncTransitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSCTransformationInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HelperPackage.Literals.TSC_TRANSFORMATION_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getConnector() {
		if (connector != null && connector.eIsProxy()) {
			InternalEObject oldConnector = (InternalEObject)connector;
			connector = (Connector)eResolveProxy(oldConnector);
			if (connector != oldConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HelperPackage.TSC_TRANSFORMATION_INPUT__CONNECTOR, oldConnector, connector));
			}
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetConnector() {
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(Connector newConnector) {
		Connector oldConnector = connector;
		connector = newConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HelperPackage.TSC_TRANSFORMATION_INPUT__CONNECTOR, oldConnector, connector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransitionTuple> getSyncTransitionTuples() {
		if (syncTransitionTuples == null) {
			syncTransitionTuples = new EObjectResolvingEList<TransitionTuple>(TransitionTuple.class, this, HelperPackage.TSC_TRANSFORMATION_INPUT__SYNC_TRANSITION_TUPLES);
		}
		return syncTransitionTuples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getNoSyncTransitions() {
		if (noSyncTransitions == null) {
			noSyncTransitions = new EObjectResolvingEList<Transition>(Transition.class, this, HelperPackage.TSC_TRANSFORMATION_INPUT__NO_SYNC_TRANSITIONS);
		}
		return noSyncTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HelperPackage.TSC_TRANSFORMATION_INPUT__CONNECTOR:
				if (resolve) return getConnector();
				return basicGetConnector();
			case HelperPackage.TSC_TRANSFORMATION_INPUT__SYNC_TRANSITION_TUPLES:
				return getSyncTransitionTuples();
			case HelperPackage.TSC_TRANSFORMATION_INPUT__NO_SYNC_TRANSITIONS:
				return getNoSyncTransitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HelperPackage.TSC_TRANSFORMATION_INPUT__CONNECTOR:
				setConnector((Connector)newValue);
				return;
			case HelperPackage.TSC_TRANSFORMATION_INPUT__SYNC_TRANSITION_TUPLES:
				getSyncTransitionTuples().clear();
				getSyncTransitionTuples().addAll((Collection<? extends TransitionTuple>)newValue);
				return;
			case HelperPackage.TSC_TRANSFORMATION_INPUT__NO_SYNC_TRANSITIONS:
				getNoSyncTransitions().clear();
				getNoSyncTransitions().addAll((Collection<? extends Transition>)newValue);
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
			case HelperPackage.TSC_TRANSFORMATION_INPUT__CONNECTOR:
				setConnector((Connector)null);
				return;
			case HelperPackage.TSC_TRANSFORMATION_INPUT__SYNC_TRANSITION_TUPLES:
				getSyncTransitionTuples().clear();
				return;
			case HelperPackage.TSC_TRANSFORMATION_INPUT__NO_SYNC_TRANSITIONS:
				getNoSyncTransitions().clear();
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
			case HelperPackage.TSC_TRANSFORMATION_INPUT__CONNECTOR:
				return connector != null;
			case HelperPackage.TSC_TRANSFORMATION_INPUT__SYNC_TRANSITION_TUPLES:
				return syncTransitionTuples != null && !syncTransitionTuples.isEmpty();
			case HelperPackage.TSC_TRANSFORMATION_INPUT__NO_SYNC_TRANSITIONS:
				return noSyncTransitions != null && !noSyncTransitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TSCTransformationInputImpl
