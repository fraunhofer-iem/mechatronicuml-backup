/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.stateflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.simulink.stateflow.Data;
import org.muml.simulink.stateflow.EmbeddedFunction;
import org.muml.simulink.stateflow.StateflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Embedded Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.stateflow.impl.EmbeddedFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.impl.EmbeddedFunctionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.impl.EmbeddedFunctionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.impl.EmbeddedFunctionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.impl.EmbeddedFunctionImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.impl.EmbeddedFunctionImpl#getConstant <em>Constant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmbeddedFunctionImpl extends StateflowElementImpl implements EmbeddedFunction {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> output;

	/**
	 * The cached value of the '{@link #getLocal() <em>Local</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> local;

	/**
	 * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> constant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmbeddedFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateflowPackage.Literals.EMBEDDED_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateflowPackage.EMBEDDED_FUNCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateflowPackage.EMBEDDED_FUNCTION__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<Data>(Data.class, this, StateflowPackage.EMBEDDED_FUNCTION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<Data>(Data.class, this, StateflowPackage.EMBEDDED_FUNCTION__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getLocal() {
		if (local == null) {
			local = new EObjectContainmentEList<Data>(Data.class, this, StateflowPackage.EMBEDDED_FUNCTION__LOCAL);
		}
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getConstant() {
		if (constant == null) {
			constant = new EObjectContainmentEList<Data>(Data.class, this, StateflowPackage.EMBEDDED_FUNCTION__CONSTANT);
		}
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateflowPackage.EMBEDDED_FUNCTION__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case StateflowPackage.EMBEDDED_FUNCTION__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
			case StateflowPackage.EMBEDDED_FUNCTION__LOCAL:
				return ((InternalEList<?>)getLocal()).basicRemove(otherEnd, msgs);
			case StateflowPackage.EMBEDDED_FUNCTION__CONSTANT:
				return ((InternalEList<?>)getConstant()).basicRemove(otherEnd, msgs);
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
			case StateflowPackage.EMBEDDED_FUNCTION__NAME:
				return getName();
			case StateflowPackage.EMBEDDED_FUNCTION__CODE:
				return getCode();
			case StateflowPackage.EMBEDDED_FUNCTION__INPUT:
				return getInput();
			case StateflowPackage.EMBEDDED_FUNCTION__OUTPUT:
				return getOutput();
			case StateflowPackage.EMBEDDED_FUNCTION__LOCAL:
				return getLocal();
			case StateflowPackage.EMBEDDED_FUNCTION__CONSTANT:
				return getConstant();
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
			case StateflowPackage.EMBEDDED_FUNCTION__NAME:
				setName((String)newValue);
				return;
			case StateflowPackage.EMBEDDED_FUNCTION__CODE:
				setCode((String)newValue);
				return;
			case StateflowPackage.EMBEDDED_FUNCTION__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Data>)newValue);
				return;
			case StateflowPackage.EMBEDDED_FUNCTION__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends Data>)newValue);
				return;
			case StateflowPackage.EMBEDDED_FUNCTION__LOCAL:
				getLocal().clear();
				getLocal().addAll((Collection<? extends Data>)newValue);
				return;
			case StateflowPackage.EMBEDDED_FUNCTION__CONSTANT:
				getConstant().clear();
				getConstant().addAll((Collection<? extends Data>)newValue);
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
			case StateflowPackage.EMBEDDED_FUNCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StateflowPackage.EMBEDDED_FUNCTION__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case StateflowPackage.EMBEDDED_FUNCTION__INPUT:
				getInput().clear();
				return;
			case StateflowPackage.EMBEDDED_FUNCTION__OUTPUT:
				getOutput().clear();
				return;
			case StateflowPackage.EMBEDDED_FUNCTION__LOCAL:
				getLocal().clear();
				return;
			case StateflowPackage.EMBEDDED_FUNCTION__CONSTANT:
				getConstant().clear();
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
			case StateflowPackage.EMBEDDED_FUNCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StateflowPackage.EMBEDDED_FUNCTION__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case StateflowPackage.EMBEDDED_FUNCTION__INPUT:
				return input != null && !input.isEmpty();
			case StateflowPackage.EMBEDDED_FUNCTION__OUTPUT:
				return output != null && !output.isEmpty();
			case StateflowPackage.EMBEDDED_FUNCTION__LOCAL:
				return local != null && !local.isEmpty();
			case StateflowPackage.EMBEDDED_FUNCTION__CONSTANT:
				return constant != null && !constant.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //EmbeddedFunctionImpl
