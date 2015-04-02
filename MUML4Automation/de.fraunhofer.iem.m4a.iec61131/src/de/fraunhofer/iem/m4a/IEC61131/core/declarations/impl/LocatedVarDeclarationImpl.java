/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.DirectVariable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Located Var Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.LocatedVarDeclarationImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.LocatedVarDeclarationImpl#getSpecInit <em>Spec Init</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocatedVarDeclarationImpl extends NamedVariableDeclarationImpl implements LocatedVarDeclaration {
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
	 * The cached value of the '{@link #getSpecInit() <em>Spec Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecInit()
	 * @generated
	 * @ordered
	 */
	protected LocatedVarSpecInit specInit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocatedVarDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationsPackage.Literals.LOCATED_VAR_DECLARATION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationsPackage.LOCATED_VAR_DECLARATION__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.LOCATED_VAR_DECLARATION__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.LOCATED_VAR_DECLARATION__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.LOCATED_VAR_DECLARATION__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocatedVarSpecInit getSpecInit() {
		return specInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecInit(LocatedVarSpecInit newSpecInit, NotificationChain msgs) {
		LocatedVarSpecInit oldSpecInit = specInit;
		specInit = newSpecInit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationsPackage.LOCATED_VAR_DECLARATION__SPEC_INIT, oldSpecInit, newSpecInit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecInit(LocatedVarSpecInit newSpecInit) {
		if (newSpecInit != specInit) {
			NotificationChain msgs = null;
			if (specInit != null)
				msgs = ((InternalEObject)specInit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.LOCATED_VAR_DECLARATION__SPEC_INIT, null, msgs);
			if (newSpecInit != null)
				msgs = ((InternalEObject)newSpecInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.LOCATED_VAR_DECLARATION__SPEC_INIT, null, msgs);
			msgs = basicSetSpecInit(newSpecInit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.LOCATED_VAR_DECLARATION__SPEC_INIT, newSpecInit, newSpecInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationsPackage.LOCATED_VAR_DECLARATION__LOCATION:
				return basicSetLocation(null, msgs);
			case DeclarationsPackage.LOCATED_VAR_DECLARATION__SPEC_INIT:
				return basicSetSpecInit(null, msgs);
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
			case DeclarationsPackage.LOCATED_VAR_DECLARATION__LOCATION:
				return getLocation();
			case DeclarationsPackage.LOCATED_VAR_DECLARATION__SPEC_INIT:
				return getSpecInit();
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
			case DeclarationsPackage.LOCATED_VAR_DECLARATION__LOCATION:
				setLocation((DirectVariable)newValue);
				return;
			case DeclarationsPackage.LOCATED_VAR_DECLARATION__SPEC_INIT:
				setSpecInit((LocatedVarSpecInit)newValue);
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
			case DeclarationsPackage.LOCATED_VAR_DECLARATION__LOCATION:
				setLocation((DirectVariable)null);
				return;
			case DeclarationsPackage.LOCATED_VAR_DECLARATION__SPEC_INIT:
				setSpecInit((LocatedVarSpecInit)null);
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
			case DeclarationsPackage.LOCATED_VAR_DECLARATION__LOCATION:
				return location != null;
			case DeclarationsPackage.LOCATED_VAR_DECLARATION__SPEC_INIT:
				return specInit != null;
		}
		return super.eIsSet(featureID);
	}

} //LocatedVarDeclarationImpl
