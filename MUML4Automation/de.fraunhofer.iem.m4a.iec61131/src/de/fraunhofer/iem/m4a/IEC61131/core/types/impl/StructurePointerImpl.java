/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ArrayStructVarSpec;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.TempVarDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationOnly;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SharedVarSpecImpl;

import de.fraunhofer.iem.m4a.IEC61131.core.types.StructurePointer;
import de.fraunhofer.iem.m4a.IEC61131.core.types.StructureTypeDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.NamedVariable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Pointer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructurePointerImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructurePointerImpl#getStructureType <em>Structure Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructurePointerImpl extends SharedVarSpecImpl implements StructurePointer {
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
	 * The cached value of the '{@link #getStructureType() <em>Structure Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureType()
	 * @generated
	 * @ordered
	 */
	protected StructureTypeDeclaration structureType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructurePointerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.STRUCTURE_POINTER;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCTURE_POINTER__VARIABLE_NAME, oldVariableName, newVariableName);
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
				msgs = ((InternalEObject)variableName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STRUCTURE_POINTER__VARIABLE_NAME, null, msgs);
			if (newVariableName != null)
				msgs = ((InternalEObject)newVariableName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STRUCTURE_POINTER__VARIABLE_NAME, null, msgs);
			msgs = basicSetVariableName(newVariableName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCTURE_POINTER__VARIABLE_NAME, newVariableName, newVariableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureTypeDeclaration getStructureType() {
		if (structureType != null && structureType.eIsProxy()) {
			InternalEObject oldStructureType = (InternalEObject)structureType;
			structureType = (StructureTypeDeclaration)eResolveProxy(oldStructureType);
			if (structureType != oldStructureType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.STRUCTURE_POINTER__STRUCTURE_TYPE, oldStructureType, structureType));
			}
		}
		return structureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureTypeDeclaration basicGetStructureType() {
		return structureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureType(StructureTypeDeclaration newStructureType) {
		StructureTypeDeclaration oldStructureType = structureType;
		structureType = newStructureType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCTURE_POINTER__STRUCTURE_TYPE, oldStructureType, structureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.STRUCTURE_POINTER__VARIABLE_NAME:
				return basicSetVariableName(null, msgs);
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
			case TypesPackage.STRUCTURE_POINTER__VARIABLE_NAME:
				return getVariableName();
			case TypesPackage.STRUCTURE_POINTER__STRUCTURE_TYPE:
				if (resolve) return getStructureType();
				return basicGetStructureType();
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
			case TypesPackage.STRUCTURE_POINTER__VARIABLE_NAME:
				setVariableName((NamedVariable)newValue);
				return;
			case TypesPackage.STRUCTURE_POINTER__STRUCTURE_TYPE:
				setStructureType((StructureTypeDeclaration)newValue);
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
			case TypesPackage.STRUCTURE_POINTER__VARIABLE_NAME:
				setVariableName((NamedVariable)null);
				return;
			case TypesPackage.STRUCTURE_POINTER__STRUCTURE_TYPE:
				setStructureType((StructureTypeDeclaration)null);
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
			case TypesPackage.STRUCTURE_POINTER__VARIABLE_NAME:
				return variableName != null;
			case TypesPackage.STRUCTURE_POINTER__STRUCTURE_TYPE:
				return structureType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == VarDeclarationOnly.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TempVarDeclaration.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ArrayStructVarSpec.class) {
			switch (derivedFeatureID) {
				case TypesPackage.STRUCTURE_POINTER__VARIABLE_NAME: return DeclarationsPackage.ARRAY_STRUCT_VAR_SPEC__VARIABLE_NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == VarDeclarationOnly.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TempVarDeclaration.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ArrayStructVarSpec.class) {
			switch (baseFeatureID) {
				case DeclarationsPackage.ARRAY_STRUCT_VAR_SPEC__VARIABLE_NAME: return TypesPackage.STRUCTURE_POINTER__VARIABLE_NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //StructurePointerImpl
