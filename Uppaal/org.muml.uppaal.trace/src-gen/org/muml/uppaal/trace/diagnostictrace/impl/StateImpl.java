/**
 */
package org.muml.uppaal.trace.diagnosticTrace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.uppaal.trace.diagnosticTrace.DiagnosticTracePackage;
import org.muml.uppaal.trace.diagnosticTrace.LocationActivity;
import org.muml.uppaal.trace.diagnosticTrace.State;
import org.muml.uppaal.trace.diagnosticTrace.VariableValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.diagnostictrace.impl.StateImpl#getLocationActivities <em>Location Activities</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.diagnostictrace.impl.StateImpl#getVariableValues <em>Variable Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends TraceItemImpl implements org.muml.uppaal.trace.diagnostictrace.State {
	/**
	 * The cached value of the '{@link #getLocationActivities() <em>Location Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<org.muml.uppaal.trace.diagnostictrace.LocationActivity> locationActivities;

	/**
	 * The cached value of the '{@link #getVariableValues() <em>Variable Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableValues()
	 * @generated
	 * @ordered
	 */
	protected EList<org.muml.uppaal.trace.diagnostictrace.VariableValue> variableValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.muml.uppaal.trace.diagnostictrace.LocationActivity> getLocationActivities() {
		if (locationActivities == null) {
			locationActivities = new EObjectContainmentEList<org.muml.uppaal.trace.diagnostictrace.LocationActivity>(org.muml.uppaal.trace.diagnostictrace.LocationActivity.class, this, org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.STATE__LOCATION_ACTIVITIES);
		}
		return locationActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.muml.uppaal.trace.diagnostictrace.VariableValue> getVariableValues() {
		if (variableValues == null) {
			variableValues = new EObjectContainmentEList<org.muml.uppaal.trace.diagnostictrace.VariableValue>(org.muml.uppaal.trace.diagnostictrace.VariableValue.class, this, org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.STATE__VARIABLE_VALUES);
		}
		return variableValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.STATE__LOCATION_ACTIVITIES:
				return ((InternalEList<?>)getLocationActivities()).basicRemove(otherEnd, msgs);
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.STATE__VARIABLE_VALUES:
				return ((InternalEList<?>)getVariableValues()).basicRemove(otherEnd, msgs);
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
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.STATE__LOCATION_ACTIVITIES:
				return getLocationActivities();
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.STATE__VARIABLE_VALUES:
				return getVariableValues();
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
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.STATE__LOCATION_ACTIVITIES:
				getLocationActivities().clear();
				getLocationActivities().addAll((Collection<? extends org.muml.uppaal.trace.diagnostictrace.LocationActivity>)newValue);
				return;
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.STATE__VARIABLE_VALUES:
				getVariableValues().clear();
				getVariableValues().addAll((Collection<? extends org.muml.uppaal.trace.diagnostictrace.VariableValue>)newValue);
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
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.STATE__LOCATION_ACTIVITIES:
				getLocationActivities().clear();
				return;
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.STATE__VARIABLE_VALUES:
				getVariableValues().clear();
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
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.STATE__LOCATION_ACTIVITIES:
				return locationActivities != null && !locationActivities.isEmpty();
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.STATE__VARIABLE_VALUES:
				return variableValues != null && !variableValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
