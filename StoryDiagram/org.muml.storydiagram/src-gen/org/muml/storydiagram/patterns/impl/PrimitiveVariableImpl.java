/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.patterns.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.InternalEObject;
import org.muml.storydiagram.patterns.PatternsPackage;
import org.muml.storydiagram.patterns.PrimitiveVariable;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Primitive Variable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.patterns.impl.PrimitiveVariableImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveVariableImpl extends AbstractVariableImpl implements
		PrimitiveVariable {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.PRIMITIVE_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataType() {
		EDataType dataType = basicGetDataType();
		return dataType != null && dataType.eIsProxy() ? (EDataType)eResolveProxy((InternalEObject)dataType) : dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType basicGetDataType() {
		// TODO: implement this method to return the 'Data Type' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(EDataType newDataType) {
		// TODO: implement this method to set the 'Data Type' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternsPackage.PRIMITIVE_VARIABLE__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternsPackage.PRIMITIVE_VARIABLE__DATA_TYPE:
				setDataType((EDataType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PatternsPackage.PRIMITIVE_VARIABLE__DATA_TYPE:
				setDataType((EDataType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PatternsPackage.PRIMITIVE_VARIABLE__DATA_TYPE:
				return basicGetDataType() != null;
		}
		return super.eIsSet(featureID);
	}


} // PrimitiveVariableImpl
