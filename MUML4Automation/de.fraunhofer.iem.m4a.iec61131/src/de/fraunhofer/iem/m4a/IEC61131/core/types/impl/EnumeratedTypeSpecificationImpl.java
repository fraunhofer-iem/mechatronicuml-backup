/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SharedVarSpecImpl;
import de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeSpecification;
import de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValue;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumerated Type Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedTypeSpecificationImpl#getValueList <em>Value List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumeratedTypeSpecificationImpl extends SharedVarSpecImpl implements EnumeratedTypeSpecification {
	/**
	 * The cached value of the '{@link #getValueList() <em>Value List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueList()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumeratedValue> valueList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumeratedTypeSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.ENUMERATED_TYPE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumeratedValue> getValueList() {
		if (valueList == null) {
			valueList = new EObjectContainmentEList<EnumeratedValue>(EnumeratedValue.class, this, TypesPackage.ENUMERATED_TYPE_SPECIFICATION__VALUE_LIST);
		}
		return valueList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.ENUMERATED_TYPE_SPECIFICATION__VALUE_LIST:
				return ((InternalEList<?>)getValueList()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.ENUMERATED_TYPE_SPECIFICATION__VALUE_LIST:
				return getValueList();
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
			case TypesPackage.ENUMERATED_TYPE_SPECIFICATION__VALUE_LIST:
				getValueList().clear();
				getValueList().addAll((Collection<? extends EnumeratedValue>)newValue);
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
			case TypesPackage.ENUMERATED_TYPE_SPECIFICATION__VALUE_LIST:
				getValueList().clear();
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
			case TypesPackage.ENUMERATED_TYPE_SPECIFICATION__VALUE_LIST:
				return valueList != null && !valueList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnumeratedTypeSpecificationImpl
