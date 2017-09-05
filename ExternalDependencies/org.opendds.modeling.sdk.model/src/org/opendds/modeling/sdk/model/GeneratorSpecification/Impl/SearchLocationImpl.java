/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification.Impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage;
import org.opendds.modeling.sdk.model.GeneratorSpecification.LocationPath;
import org.opendds.modeling.sdk.model.GeneratorSpecification.LocationVariable;
import org.opendds.modeling.sdk.model.GeneratorSpecification.SearchLocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SearchLocationImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SearchLocationImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchLocationImpl extends EObjectImpl implements SearchLocation {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected LocationVariable variable;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected LocationPath path;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.SEARCH_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationVariable getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(LocationVariable newVariable, NotificationChain msgs) {
		LocationVariable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.SEARCH_LOCATION__VARIABLE, oldVariable, newVariable);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(LocationVariable newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject) variable).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.SEARCH_LOCATION__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject) newVariable).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.SEARCH_LOCATION__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.SEARCH_LOCATION__VARIABLE,
					newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationPath getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(LocationPath newPath, NotificationChain msgs) {
		LocationPath oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.SEARCH_LOCATION__PATH, oldPath, newPath);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(LocationPath newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject) path).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.SEARCH_LOCATION__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject) newPath).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.SEARCH_LOCATION__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.SEARCH_LOCATION__PATH, newPath,
					newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.SEARCH_LOCATION__VARIABLE:
			return basicSetVariable(null, msgs);
		case GeneratorPackage.SEARCH_LOCATION__PATH:
			return basicSetPath(null, msgs);
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
		case GeneratorPackage.SEARCH_LOCATION__VARIABLE:
			return getVariable();
		case GeneratorPackage.SEARCH_LOCATION__PATH:
			return getPath();
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
		case GeneratorPackage.SEARCH_LOCATION__VARIABLE:
			setVariable((LocationVariable) newValue);
			return;
		case GeneratorPackage.SEARCH_LOCATION__PATH:
			setPath((LocationPath) newValue);
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
		case GeneratorPackage.SEARCH_LOCATION__VARIABLE:
			setVariable((LocationVariable) null);
			return;
		case GeneratorPackage.SEARCH_LOCATION__PATH:
			setPath((LocationPath) null);
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
		case GeneratorPackage.SEARCH_LOCATION__VARIABLE:
			return variable != null;
		case GeneratorPackage.SEARCH_LOCATION__PATH:
			return path != null;
		}
		return super.eIsSet(featureID);
	}

} //SearchLocationImpl
