/**
 */
package org.muml.uppaal.trace.diagnosticTrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.muml.uppaal.trace.diagnosticTrace.DiagnosticTracePackage;
import org.muml.uppaal.trace.diagnosticTrace.NamedElementReference;
import org.muml.uppaal.trace.diagnosticTrace.SingleNamedElementReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.diagnostictrace.impl.NamedElementReferenceImpl#getSingleNamedElementReference <em>Single Named Element Reference</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.diagnostictrace.impl.NamedElementReferenceImpl#getNamedElementReference <em>Named Element Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedElementReferenceImpl extends MinimalEObjectImpl.Container implements org.muml.uppaal.trace.diagnostictrace.NamedElementReference {
	/**
	 * The cached value of the '{@link #getSingleNamedElementReference() <em>Single Named Element Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleNamedElementReference()
	 * @generated
	 * @ordered
	 */
	protected org.muml.uppaal.trace.diagnostictrace.SingleNamedElementReference singleNamedElementReference;

	/**
	 * The cached value of the '{@link #getNamedElementReference() <em>Named Element Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedElementReference()
	 * @generated
	 * @ordered
	 */
	protected org.muml.uppaal.trace.diagnostictrace.NamedElementReference namedElementReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.Literals.NAMED_ELEMENT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.uppaal.trace.diagnostictrace.SingleNamedElementReference getSingleNamedElementReference() {
		return singleNamedElementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleNamedElementReference(org.muml.uppaal.trace.diagnostictrace.SingleNamedElementReference newSingleNamedElementReference, NotificationChain msgs) {
		org.muml.uppaal.trace.diagnostictrace.SingleNamedElementReference oldSingleNamedElementReference = singleNamedElementReference;
		singleNamedElementReference = newSingleNamedElementReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE, oldSingleNamedElementReference, newSingleNamedElementReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleNamedElementReference(org.muml.uppaal.trace.diagnostictrace.SingleNamedElementReference newSingleNamedElementReference) {
		if (newSingleNamedElementReference != singleNamedElementReference) {
			NotificationChain msgs = null;
			if (singleNamedElementReference != null)
				msgs = ((InternalEObject)singleNamedElementReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE, null, msgs);
			if (newSingleNamedElementReference != null)
				msgs = ((InternalEObject)newSingleNamedElementReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE, null, msgs);
			msgs = basicSetSingleNamedElementReference(newSingleNamedElementReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE, newSingleNamedElementReference, newSingleNamedElementReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.uppaal.trace.diagnostictrace.NamedElementReference getNamedElementReference() {
		return namedElementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamedElementReference(org.muml.uppaal.trace.diagnostictrace.NamedElementReference newNamedElementReference, NotificationChain msgs) {
		org.muml.uppaal.trace.diagnostictrace.NamedElementReference oldNamedElementReference = namedElementReference;
		namedElementReference = newNamedElementReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE, oldNamedElementReference, newNamedElementReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamedElementReference(org.muml.uppaal.trace.diagnostictrace.NamedElementReference newNamedElementReference) {
		if (newNamedElementReference != namedElementReference) {
			NotificationChain msgs = null;
			if (namedElementReference != null)
				msgs = ((InternalEObject)namedElementReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE, null, msgs);
			if (newNamedElementReference != null)
				msgs = ((InternalEObject)newNamedElementReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE, null, msgs);
			msgs = basicSetNamedElementReference(newNamedElementReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE, newNamedElementReference, newNamedElementReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE:
				return basicSetSingleNamedElementReference(null, msgs);
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE:
				return basicSetNamedElementReference(null, msgs);
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
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE:
				return getSingleNamedElementReference();
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE:
				return getNamedElementReference();
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
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE:
				setSingleNamedElementReference((org.muml.uppaal.trace.diagnostictrace.SingleNamedElementReference)newValue);
				return;
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE:
				setNamedElementReference((org.muml.uppaal.trace.diagnostictrace.NamedElementReference)newValue);
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
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE:
				setSingleNamedElementReference((org.muml.uppaal.trace.diagnostictrace.SingleNamedElementReference)null);
				return;
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE:
				setNamedElementReference((org.muml.uppaal.trace.diagnostictrace.NamedElementReference)null);
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
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE:
				return singleNamedElementReference != null;
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE:
				return namedElementReference != null;
		}
		return super.eIsSet(featureID);
	}

} //NamedElementReferenceImpl
