/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarSpec;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.LocationPrefix;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.NamedVariable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incompl Located Var Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.IncomplLocatedVarDeclarationImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.IncomplLocatedVarDeclarationImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.IncomplLocatedVarDeclarationImpl#getSpec <em>Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncomplLocatedVarDeclarationImpl extends MinimalEObjectImpl.Container implements IncomplLocatedVarDeclaration {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final LocationPrefix LOCATION_EDEFAULT = LocationPrefix.I;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected LocationPrefix location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected NamedVariable variableName;

	/**
	 * The cached value of the '{@link #getSpec() <em>Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpec()
	 * @generated
	 * @ordered
	 */
	protected VarSpec spec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncomplLocatedVarDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationsPackage.Literals.INCOMPL_LOCATED_VAR_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationPrefix getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(LocationPrefix newLocation) {
		LocationPrefix oldLocation = location;
		location = newLocation == null ? LOCATION_EDEFAULT : newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedVariable getVariableName() {
		return variableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableName(NamedVariable newVariableName, NotificationChain msgs) {
		NamedVariable oldVariableName = variableName;
		variableName = newVariableName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__VARIABLE_NAME, oldVariableName, newVariableName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableName(NamedVariable newVariableName) {
		if (newVariableName != variableName) {
			NotificationChain msgs = null;
			if (variableName != null)
				msgs = ((InternalEObject)variableName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__VARIABLE_NAME, null, msgs);
			if (newVariableName != null)
				msgs = ((InternalEObject)newVariableName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__VARIABLE_NAME, null, msgs);
			msgs = basicSetVariableName(newVariableName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__VARIABLE_NAME, newVariableName, newVariableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarSpec getSpec() {
		return spec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpec(VarSpec newSpec, NotificationChain msgs) {
		VarSpec oldSpec = spec;
		spec = newSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__SPEC, oldSpec, newSpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpec(VarSpec newSpec) {
		if (newSpec != spec) {
			NotificationChain msgs = null;
			if (spec != null)
				msgs = ((InternalEObject)spec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__SPEC, null, msgs);
			if (newSpec != null)
				msgs = ((InternalEObject)newSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__SPEC, null, msgs);
			msgs = basicSetSpec(newSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__SPEC, newSpec, newSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__VARIABLE_NAME:
				return basicSetVariableName(null, msgs);
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__SPEC:
				return basicSetSpec(null, msgs);
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
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__LOCATION:
				return getLocation();
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__VARIABLE_NAME:
				return getVariableName();
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__SPEC:
				return getSpec();
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
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__LOCATION:
				setLocation((LocationPrefix)newValue);
				return;
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__VARIABLE_NAME:
				setVariableName((NamedVariable)newValue);
				return;
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__SPEC:
				setSpec((VarSpec)newValue);
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
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__VARIABLE_NAME:
				setVariableName((NamedVariable)null);
				return;
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__SPEC:
				setSpec((VarSpec)null);
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
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__LOCATION:
				return location != LOCATION_EDEFAULT;
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__VARIABLE_NAME:
				return variableName != null;
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION__SPEC:
				return spec != null;
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
		result.append(" (location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //IncomplLocatedVarDeclarationImpl
