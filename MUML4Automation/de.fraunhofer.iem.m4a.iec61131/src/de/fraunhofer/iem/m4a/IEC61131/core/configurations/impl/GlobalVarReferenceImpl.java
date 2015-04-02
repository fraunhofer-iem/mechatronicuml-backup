/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.GlobalVarReference;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.GlobalVar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Var Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.GlobalVarReferenceImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.GlobalVarReferenceImpl#getStructureElementName <em>Structure Element Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalVarReferenceImpl extends MinimalEObjectImpl.Container implements GlobalVarReference {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected GlobalVar reference;

	/**
	 * The default value of the '{@link #getStructureElementName() <em>Structure Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String STRUCTURE_ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStructureElementName() <em>Structure Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureElementName()
	 * @generated
	 * @ordered
	 */
	protected String structureElementName = STRUCTURE_ELEMENT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalVarReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationsPackage.Literals.GLOBAL_VAR_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVar getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (GlobalVar)eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigurationsPackage.GLOBAL_VAR_REFERENCE__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVar basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(GlobalVar newReference) {
		GlobalVar oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.GLOBAL_VAR_REFERENCE__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStructureElementName() {
		return structureElementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureElementName(String newStructureElementName) {
		String oldStructureElementName = structureElementName;
		structureElementName = newStructureElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.GLOBAL_VAR_REFERENCE__STRUCTURE_ELEMENT_NAME, oldStructureElementName, structureElementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationsPackage.GLOBAL_VAR_REFERENCE__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case ConfigurationsPackage.GLOBAL_VAR_REFERENCE__STRUCTURE_ELEMENT_NAME:
				return getStructureElementName();
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
			case ConfigurationsPackage.GLOBAL_VAR_REFERENCE__REFERENCE:
				setReference((GlobalVar)newValue);
				return;
			case ConfigurationsPackage.GLOBAL_VAR_REFERENCE__STRUCTURE_ELEMENT_NAME:
				setStructureElementName((String)newValue);
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
			case ConfigurationsPackage.GLOBAL_VAR_REFERENCE__REFERENCE:
				setReference((GlobalVar)null);
				return;
			case ConfigurationsPackage.GLOBAL_VAR_REFERENCE__STRUCTURE_ELEMENT_NAME:
				setStructureElementName(STRUCTURE_ELEMENT_NAME_EDEFAULT);
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
			case ConfigurationsPackage.GLOBAL_VAR_REFERENCE__REFERENCE:
				return reference != null;
			case ConfigurationsPackage.GLOBAL_VAR_REFERENCE__STRUCTURE_ELEMENT_NAME:
				return STRUCTURE_ELEMENT_NAME_EDEFAULT == null ? structureElementName != null : !STRUCTURE_ELEMENT_NAME_EDEFAULT.equals(structureElementName);
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
		result.append(" (structureElementName: ");
		result.append(structureElementName);
		result.append(')');
		return result.toString();
	}

} //GlobalVarReferenceImpl
