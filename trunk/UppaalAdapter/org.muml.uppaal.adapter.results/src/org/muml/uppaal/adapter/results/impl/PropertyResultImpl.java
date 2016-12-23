/**
 */
package org.muml.uppaal.adapter.results.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.uppaal.adapter.mtctl.Property;
import org.muml.uppaal.adapter.results.PropertyResult;
import org.muml.uppaal.adapter.results.ResultsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.results.impl.PropertyResultImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.muml.uppaal.adapter.results.impl.PropertyResultImpl#isFulfilled <em>Fulfilled</em>}</li>
 *   <li>{@link org.muml.uppaal.adapter.results.impl.PropertyResultImpl#getSubPropertyResults <em>Sub Property Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyResultImpl extends MinimalEObjectImpl.Container implements PropertyResult {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected Property property;

	/**
	 * The default value of the '{@link #isFulfilled() <em>Fulfilled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFulfilled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FULFILLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFulfilled() <em>Fulfilled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFulfilled()
	 * @generated
	 * @ordered
	 */
	protected boolean fulfilled = FULFILLED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubPropertyResults() <em>Sub Property Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPropertyResults()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyResult> subPropertyResults;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsPackage.Literals.PROPERTY_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getProperty() {
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject)property;
			property = (Property)eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultsPackage.PROPERTY_RESULT__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(Property newProperty) {
		Property oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.PROPERTY_RESULT__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFulfilled() {
		return fulfilled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFulfilled(boolean newFulfilled) {
		boolean oldFulfilled = fulfilled;
		fulfilled = newFulfilled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.PROPERTY_RESULT__FULFILLED, oldFulfilled, fulfilled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyResult> getSubPropertyResults() {
		if (subPropertyResults == null) {
			subPropertyResults = new EObjectContainmentEList<PropertyResult>(PropertyResult.class, this, ResultsPackage.PROPERTY_RESULT__SUB_PROPERTY_RESULTS);
		}
		return subPropertyResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultsPackage.PROPERTY_RESULT__SUB_PROPERTY_RESULTS:
				return ((InternalEList<?>)getSubPropertyResults()).basicRemove(otherEnd, msgs);
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
			case ResultsPackage.PROPERTY_RESULT__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
			case ResultsPackage.PROPERTY_RESULT__FULFILLED:
				return isFulfilled();
			case ResultsPackage.PROPERTY_RESULT__SUB_PROPERTY_RESULTS:
				return getSubPropertyResults();
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
			case ResultsPackage.PROPERTY_RESULT__PROPERTY:
				setProperty((Property)newValue);
				return;
			case ResultsPackage.PROPERTY_RESULT__FULFILLED:
				setFulfilled((Boolean)newValue);
				return;
			case ResultsPackage.PROPERTY_RESULT__SUB_PROPERTY_RESULTS:
				getSubPropertyResults().clear();
				getSubPropertyResults().addAll((Collection<? extends PropertyResult>)newValue);
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
			case ResultsPackage.PROPERTY_RESULT__PROPERTY:
				setProperty((Property)null);
				return;
			case ResultsPackage.PROPERTY_RESULT__FULFILLED:
				setFulfilled(FULFILLED_EDEFAULT);
				return;
			case ResultsPackage.PROPERTY_RESULT__SUB_PROPERTY_RESULTS:
				getSubPropertyResults().clear();
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
			case ResultsPackage.PROPERTY_RESULT__PROPERTY:
				return property != null;
			case ResultsPackage.PROPERTY_RESULT__FULFILLED:
				return fulfilled != FULFILLED_EDEFAULT;
			case ResultsPackage.PROPERTY_RESULT__SUB_PROPERTY_RESULTS:
				return subPropertyResults != null && !subPropertyResults.isEmpty();
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
		result.append(" (fulfilled: ");
		result.append(fulfilled);
		result.append(')');
		return result.toString();
	}

} //PropertyResultImpl
