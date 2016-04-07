/**
 */
package org.muml.uppaal.trace.diagnosticTrace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.uppaal.trace.diagnosticTrace.DiagnosticTracePackage;
import org.muml.uppaal.trace.diagnosticTrace.Trace;
import org.muml.uppaal.trace.diagnosticTrace.TraceRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.diagnostictrace.impl.TraceRepositoryImpl#getTraces <em>Traces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceRepositoryImpl extends MinimalEObjectImpl.Container implements org.muml.uppaal.trace.diagnostictrace.TraceRepository {
	/**
	 * The cached value of the '{@link #getTraces() <em>Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<org.muml.uppaal.trace.diagnostictrace.Trace> traces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.Literals.TRACE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.muml.uppaal.trace.diagnostictrace.Trace> getTraces() {
		if (traces == null) {
			traces = new EObjectContainmentEList<org.muml.uppaal.trace.diagnostictrace.Trace>(org.muml.uppaal.trace.diagnostictrace.Trace.class, this, org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.TRACE_REPOSITORY__TRACES);
		}
		return traces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.TRACE_REPOSITORY__TRACES:
				return ((InternalEList<?>)getTraces()).basicRemove(otherEnd, msgs);
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
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.TRACE_REPOSITORY__TRACES:
				return getTraces();
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
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.TRACE_REPOSITORY__TRACES:
				getTraces().clear();
				getTraces().addAll((Collection<? extends org.muml.uppaal.trace.diagnostictrace.Trace>)newValue);
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
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.TRACE_REPOSITORY__TRACES:
				getTraces().clear();
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
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.TRACE_REPOSITORY__TRACES:
				return traces != null && !traces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceRepositoryImpl
