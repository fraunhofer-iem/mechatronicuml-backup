/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.Call;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PartVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.impl.PartVariableImpl#getPortVariables <em>Port Variables</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.impl.PartVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.impl.PartVariableImpl#getCall <em>Call</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartVariableImpl extends ComponentStoryPatternVariableImpl implements PartVariable {
	/**
	 * The cached value of the '{@link #getPortVariables() <em>Port Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<PortVariable> portVariables;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ComponentPart type;

	/**
	 * The cached value of the '{@link #getCall() <em>Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCall()
	 * @generated
	 * @ordered
	 */
	protected Call call;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentstorypatternPackage.Literals.PART_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortVariable> getPortVariables() {
		if (portVariables == null) {
			portVariables = new EObjectContainmentEList<PortVariable>(PortVariable.class, this, ComponentstorypatternPackage.PART_VARIABLE__PORT_VARIABLES);
		}
		return portVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPart getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ComponentPart)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentstorypatternPackage.PART_VARIABLE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPart basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ComponentPart newType) {
		ComponentPart oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.PART_VARIABLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call getCall() {
		if (call != null && call.eIsProxy()) {
			InternalEObject oldCall = (InternalEObject)call;
			call = (Call)eResolveProxy(oldCall);
			if (call != oldCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentstorypatternPackage.PART_VARIABLE__CALL, oldCall, call));
			}
		}
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call basicGetCall() {
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCall(Call newCall) {
		Call oldCall = call;
		call = newCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.PART_VARIABLE__CALL, oldCall, call));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentstorypatternPackage.PART_VARIABLE__PORT_VARIABLES:
				return ((InternalEList<?>)getPortVariables()).basicRemove(otherEnd, msgs);
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
			case ComponentstorypatternPackage.PART_VARIABLE__PORT_VARIABLES:
				return getPortVariables();
			case ComponentstorypatternPackage.PART_VARIABLE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ComponentstorypatternPackage.PART_VARIABLE__CALL:
				if (resolve) return getCall();
				return basicGetCall();
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
			case ComponentstorypatternPackage.PART_VARIABLE__PORT_VARIABLES:
				getPortVariables().clear();
				getPortVariables().addAll((Collection<? extends PortVariable>)newValue);
				return;
			case ComponentstorypatternPackage.PART_VARIABLE__TYPE:
				setType((ComponentPart)newValue);
				return;
			case ComponentstorypatternPackage.PART_VARIABLE__CALL:
				setCall((Call)newValue);
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
			case ComponentstorypatternPackage.PART_VARIABLE__PORT_VARIABLES:
				getPortVariables().clear();
				return;
			case ComponentstorypatternPackage.PART_VARIABLE__TYPE:
				setType((ComponentPart)null);
				return;
			case ComponentstorypatternPackage.PART_VARIABLE__CALL:
				setCall((Call)null);
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
			case ComponentstorypatternPackage.PART_VARIABLE__PORT_VARIABLES:
				return portVariables != null && !portVariables.isEmpty();
			case ComponentstorypatternPackage.PART_VARIABLE__TYPE:
				return type != null;
			case ComponentstorypatternPackage.PART_VARIABLE__CALL:
				return call != null;
		}
		return super.eIsSet(featureID);
	}

} //PartVariableImpl
