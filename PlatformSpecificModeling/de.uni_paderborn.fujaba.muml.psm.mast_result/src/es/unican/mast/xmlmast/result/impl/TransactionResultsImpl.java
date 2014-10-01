/**
 */
package es.unican.mast.xmlmast.result.impl;

import es.unican.mast.xmlmast.result.ResultPackage;
import es.unican.mast.xmlmast.result.SimulationTimingResult;
import es.unican.mast.xmlmast.result.Slack;
import es.unican.mast.xmlmast.result.TimingResult;
import es.unican.mast.xmlmast.result.TransactionResults;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction Results</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.TransactionResultsImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.TransactionResultsImpl#getSlack <em>Slack</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.TransactionResultsImpl#getTimingResult <em>Timing Result</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.TransactionResultsImpl#getSimulationTimingResult <em>Simulation Timing Result</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.TransactionResultsImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransactionResultsImpl extends MinimalEObjectImpl.Container implements TransactionResults {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionResultsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.TRANSACTION_RESULTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ResultPackage.TRANSACTION_RESULTS__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Slack> getSlack() {
		return getGroup().list(ResultPackage.Literals.TRANSACTION_RESULTS__SLACK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimingResult> getTimingResult() {
		return getGroup().list(ResultPackage.Literals.TRANSACTION_RESULTS__TIMING_RESULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimulationTimingResult> getSimulationTimingResult() {
		return getGroup().list(ResultPackage.Literals.TRANSACTION_RESULTS__SIMULATION_TIMING_RESULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.TRANSACTION_RESULTS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultPackage.TRANSACTION_RESULTS__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ResultPackage.TRANSACTION_RESULTS__SLACK:
				return ((InternalEList<?>)getSlack()).basicRemove(otherEnd, msgs);
			case ResultPackage.TRANSACTION_RESULTS__TIMING_RESULT:
				return ((InternalEList<?>)getTimingResult()).basicRemove(otherEnd, msgs);
			case ResultPackage.TRANSACTION_RESULTS__SIMULATION_TIMING_RESULT:
				return ((InternalEList<?>)getSimulationTimingResult()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultPackage.TRANSACTION_RESULTS__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ResultPackage.TRANSACTION_RESULTS__SLACK:
				return getSlack();
			case ResultPackage.TRANSACTION_RESULTS__TIMING_RESULT:
				return getTimingResult();
			case ResultPackage.TRANSACTION_RESULTS__SIMULATION_TIMING_RESULT:
				return getSimulationTimingResult();
			case ResultPackage.TRANSACTION_RESULTS__NAME:
				return getName();
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
			case ResultPackage.TRANSACTION_RESULTS__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ResultPackage.TRANSACTION_RESULTS__SLACK:
				getSlack().clear();
				getSlack().addAll((Collection<? extends Slack>)newValue);
				return;
			case ResultPackage.TRANSACTION_RESULTS__TIMING_RESULT:
				getTimingResult().clear();
				getTimingResult().addAll((Collection<? extends TimingResult>)newValue);
				return;
			case ResultPackage.TRANSACTION_RESULTS__SIMULATION_TIMING_RESULT:
				getSimulationTimingResult().clear();
				getSimulationTimingResult().addAll((Collection<? extends SimulationTimingResult>)newValue);
				return;
			case ResultPackage.TRANSACTION_RESULTS__NAME:
				setName((String)newValue);
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
			case ResultPackage.TRANSACTION_RESULTS__GROUP:
				getGroup().clear();
				return;
			case ResultPackage.TRANSACTION_RESULTS__SLACK:
				getSlack().clear();
				return;
			case ResultPackage.TRANSACTION_RESULTS__TIMING_RESULT:
				getTimingResult().clear();
				return;
			case ResultPackage.TRANSACTION_RESULTS__SIMULATION_TIMING_RESULT:
				getSimulationTimingResult().clear();
				return;
			case ResultPackage.TRANSACTION_RESULTS__NAME:
				setName(NAME_EDEFAULT);
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
			case ResultPackage.TRANSACTION_RESULTS__GROUP:
				return group != null && !group.isEmpty();
			case ResultPackage.TRANSACTION_RESULTS__SLACK:
				return !getSlack().isEmpty();
			case ResultPackage.TRANSACTION_RESULTS__TIMING_RESULT:
				return !getTimingResult().isEmpty();
			case ResultPackage.TRANSACTION_RESULTS__SIMULATION_TIMING_RESULT:
				return !getSimulationTimingResult().isEmpty();
			case ResultPackage.TRANSACTION_RESULTS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TransactionResultsImpl
