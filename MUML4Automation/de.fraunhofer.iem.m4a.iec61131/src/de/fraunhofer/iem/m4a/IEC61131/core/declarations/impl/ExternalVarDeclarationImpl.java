/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarSpec;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.GlobalVar;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Var Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ExternalVarDeclarationImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ExternalVarDeclarationImpl#getSpec <em>Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalVarDeclarationImpl extends MinimalEObjectImpl.Container implements ExternalVarDeclaration {
	/**
	 * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected GlobalVar variableName;

	/**
	 * The cached value of the '{@link #getSpec() <em>Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpec()
	 * @generated
	 * @ordered
	 */
	protected ExternalVarSpec spec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalVarDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationsPackage.Literals.EXTERNAL_VAR_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVar getVariableName() {
		return variableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableName(GlobalVar newVariableName, NotificationChain msgs) {
		GlobalVar oldVariableName = variableName;
		variableName = newVariableName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationsPackage.EXTERNAL_VAR_DECLARATION__VARIABLE_NAME, oldVariableName, newVariableName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableName(GlobalVar newVariableName) {
		if (newVariableName != variableName) {
			NotificationChain msgs = null;
			if (variableName != null)
				msgs = ((InternalEObject)variableName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.EXTERNAL_VAR_DECLARATION__VARIABLE_NAME, null, msgs);
			if (newVariableName != null)
				msgs = ((InternalEObject)newVariableName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.EXTERNAL_VAR_DECLARATION__VARIABLE_NAME, null, msgs);
			msgs = basicSetVariableName(newVariableName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.EXTERNAL_VAR_DECLARATION__VARIABLE_NAME, newVariableName, newVariableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalVarSpec getSpec() {
		return spec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpec(ExternalVarSpec newSpec, NotificationChain msgs) {
		ExternalVarSpec oldSpec = spec;
		spec = newSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationsPackage.EXTERNAL_VAR_DECLARATION__SPEC, oldSpec, newSpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpec(ExternalVarSpec newSpec) {
		if (newSpec != spec) {
			NotificationChain msgs = null;
			if (spec != null)
				msgs = ((InternalEObject)spec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.EXTERNAL_VAR_DECLARATION__SPEC, null, msgs);
			if (newSpec != null)
				msgs = ((InternalEObject)newSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.EXTERNAL_VAR_DECLARATION__SPEC, null, msgs);
			msgs = basicSetSpec(newSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.EXTERNAL_VAR_DECLARATION__SPEC, newSpec, newSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationsPackage.EXTERNAL_VAR_DECLARATION__VARIABLE_NAME:
				return basicSetVariableName(null, msgs);
			case DeclarationsPackage.EXTERNAL_VAR_DECLARATION__SPEC:
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
			case DeclarationsPackage.EXTERNAL_VAR_DECLARATION__VARIABLE_NAME:
				return getVariableName();
			case DeclarationsPackage.EXTERNAL_VAR_DECLARATION__SPEC:
				return getSpec();
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
			case DeclarationsPackage.EXTERNAL_VAR_DECLARATION__VARIABLE_NAME:
				setVariableName((GlobalVar)newValue);
				return;
			case DeclarationsPackage.EXTERNAL_VAR_DECLARATION__SPEC:
				setSpec((ExternalVarSpec)newValue);
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
			case DeclarationsPackage.EXTERNAL_VAR_DECLARATION__VARIABLE_NAME:
				setVariableName((GlobalVar)null);
				return;
			case DeclarationsPackage.EXTERNAL_VAR_DECLARATION__SPEC:
				setSpec((ExternalVarSpec)null);
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
			case DeclarationsPackage.EXTERNAL_VAR_DECLARATION__VARIABLE_NAME:
				return variableName != null;
			case DeclarationsPackage.EXTERNAL_VAR_DECLARATION__SPEC:
				return spec != null;
		}
		return super.eIsSet(featureID);
	}

} //ExternalVarDeclarationImpl
