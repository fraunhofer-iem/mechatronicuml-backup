/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVariable;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.DirectVariable;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.NamedVariable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Specific Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificVariableImpl#getVariableRef <em>Variable Ref</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificVariableImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificVariableImpl#getSpecinit <em>Specinit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InstanceSpecificVariableImpl extends InstanceSpecificVarInitImpl implements InstanceSpecificVariable {
	/**
	 * The cached value of the '{@link #getVariableRef() <em>Variable Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableRef()
	 * @generated
	 * @ordered
	 */
	protected NamedVariable variableRef;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected DirectVariable location;

	/**
	 * The cached value of the '{@link #getSpecinit() <em>Specinit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecinit()
	 * @generated
	 * @ordered
	 */
	protected InstanceSpecificSpecInit specinit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceSpecificVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationsPackage.Literals.INSTANCE_SPECIFIC_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedVariable getVariableRef() {
		if (variableRef != null && variableRef.eIsProxy()) {
			InternalEObject oldVariableRef = (InternalEObject)variableRef;
			variableRef = (NamedVariable)eResolveProxy(oldVariableRef);
			if (variableRef != oldVariableRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__VARIABLE_REF, oldVariableRef, variableRef));
			}
		}
		return variableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedVariable basicGetVariableRef() {
		return variableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableRef(NamedVariable newVariableRef) {
		NamedVariable oldVariableRef = variableRef;
		variableRef = newVariableRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__VARIABLE_REF, oldVariableRef, variableRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectVariable getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(DirectVariable newLocation, NotificationChain msgs) {
		DirectVariable oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(DirectVariable newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecificSpecInit getSpecinit() {
		return specinit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecinit(InstanceSpecificSpecInit newSpecinit, NotificationChain msgs) {
		InstanceSpecificSpecInit oldSpecinit = specinit;
		specinit = newSpecinit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__SPECINIT, oldSpecinit, newSpecinit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecinit(InstanceSpecificSpecInit newSpecinit) {
		if (newSpecinit != specinit) {
			NotificationChain msgs = null;
			if (specinit != null)
				msgs = ((InternalEObject)specinit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__SPECINIT, null, msgs);
			if (newSpecinit != null)
				msgs = ((InternalEObject)newSpecinit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__SPECINIT, null, msgs);
			msgs = basicSetSpecinit(newSpecinit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__SPECINIT, newSpecinit, newSpecinit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__LOCATION:
				return basicSetLocation(null, msgs);
			case DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__SPECINIT:
				return basicSetSpecinit(null, msgs);
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
			case DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__VARIABLE_REF:
				if (resolve) return getVariableRef();
				return basicGetVariableRef();
			case DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__LOCATION:
				return getLocation();
			case DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__SPECINIT:
				return getSpecinit();
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
			case DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__VARIABLE_REF:
				setVariableRef((NamedVariable)newValue);
				return;
			case DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__LOCATION:
				setLocation((DirectVariable)newValue);
				return;
			case DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__SPECINIT:
				setSpecinit((InstanceSpecificSpecInit)newValue);
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
			case DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__VARIABLE_REF:
				setVariableRef((NamedVariable)null);
				return;
			case DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__LOCATION:
				setLocation((DirectVariable)null);
				return;
			case DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__SPECINIT:
				setSpecinit((InstanceSpecificSpecInit)null);
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
			case DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__VARIABLE_REF:
				return variableRef != null;
			case DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__LOCATION:
				return location != null;
			case DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE__SPECINIT:
				return specinit != null;
		}
		return super.eIsSet(featureID);
	}

} //InstanceSpecificVariableImpl
