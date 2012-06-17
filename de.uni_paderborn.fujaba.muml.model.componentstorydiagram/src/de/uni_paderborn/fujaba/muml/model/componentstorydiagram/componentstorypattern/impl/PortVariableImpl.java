/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.impl;

import de.uni_paderborn.fujaba.muml.model.component.Port;

import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ConnectorVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.impl.PortVariableImpl#getIncomingConnectorVariables <em>Incoming Connector Variables</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.impl.PortVariableImpl#getOutgoingConnectorVariables <em>Outgoing Connector Variables</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.impl.PortVariableImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortVariableImpl extends ComponentStoryPatternVariableImpl implements PortVariable {
	/**
	 * The cached value of the '{@link #getIncomingConnectorVariables() <em>Incoming Connector Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingConnectorVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorVariable> incomingConnectorVariables;

	/**
	 * The cached value of the '{@link #getOutgoingConnectorVariables() <em>Outgoing Connector Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingConnectorVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorVariable> outgoingConnectorVariables;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Port type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentstorypatternPackage.Literals.PORT_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorVariable> getIncomingConnectorVariables() {
		if (incomingConnectorVariables == null) {
			incomingConnectorVariables = new EObjectWithInverseResolvingEList<ConnectorVariable>(ConnectorVariable.class, this, ComponentstorypatternPackage.PORT_VARIABLE__INCOMING_CONNECTOR_VARIABLES, ComponentstorypatternPackage.CONNECTOR_VARIABLE__TARGET);
		}
		return incomingConnectorVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorVariable> getOutgoingConnectorVariables() {
		if (outgoingConnectorVariables == null) {
			outgoingConnectorVariables = new EObjectWithInverseResolvingEList<ConnectorVariable>(ConnectorVariable.class, this, ComponentstorypatternPackage.PORT_VARIABLE__OUTGOING_CONNECTOR_VARIABLES, ComponentstorypatternPackage.CONNECTOR_VARIABLE__SOURCE);
		}
		return outgoingConnectorVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Port)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentstorypatternPackage.PORT_VARIABLE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Port newType) {
		Port oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.PORT_VARIABLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentstorypatternPackage.PORT_VARIABLE__INCOMING_CONNECTOR_VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingConnectorVariables()).basicAdd(otherEnd, msgs);
			case ComponentstorypatternPackage.PORT_VARIABLE__OUTGOING_CONNECTOR_VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingConnectorVariables()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentstorypatternPackage.PORT_VARIABLE__INCOMING_CONNECTOR_VARIABLES:
				return ((InternalEList<?>)getIncomingConnectorVariables()).basicRemove(otherEnd, msgs);
			case ComponentstorypatternPackage.PORT_VARIABLE__OUTGOING_CONNECTOR_VARIABLES:
				return ((InternalEList<?>)getOutgoingConnectorVariables()).basicRemove(otherEnd, msgs);
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
			case ComponentstorypatternPackage.PORT_VARIABLE__INCOMING_CONNECTOR_VARIABLES:
				return getIncomingConnectorVariables();
			case ComponentstorypatternPackage.PORT_VARIABLE__OUTGOING_CONNECTOR_VARIABLES:
				return getOutgoingConnectorVariables();
			case ComponentstorypatternPackage.PORT_VARIABLE__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case ComponentstorypatternPackage.PORT_VARIABLE__INCOMING_CONNECTOR_VARIABLES:
				getIncomingConnectorVariables().clear();
				getIncomingConnectorVariables().addAll((Collection<? extends ConnectorVariable>)newValue);
				return;
			case ComponentstorypatternPackage.PORT_VARIABLE__OUTGOING_CONNECTOR_VARIABLES:
				getOutgoingConnectorVariables().clear();
				getOutgoingConnectorVariables().addAll((Collection<? extends ConnectorVariable>)newValue);
				return;
			case ComponentstorypatternPackage.PORT_VARIABLE__TYPE:
				setType((Port)newValue);
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
			case ComponentstorypatternPackage.PORT_VARIABLE__INCOMING_CONNECTOR_VARIABLES:
				getIncomingConnectorVariables().clear();
				return;
			case ComponentstorypatternPackage.PORT_VARIABLE__OUTGOING_CONNECTOR_VARIABLES:
				getOutgoingConnectorVariables().clear();
				return;
			case ComponentstorypatternPackage.PORT_VARIABLE__TYPE:
				setType((Port)null);
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
			case ComponentstorypatternPackage.PORT_VARIABLE__INCOMING_CONNECTOR_VARIABLES:
				return incomingConnectorVariables != null && !incomingConnectorVariables.isEmpty();
			case ComponentstorypatternPackage.PORT_VARIABLE__OUTGOING_CONNECTOR_VARIABLES:
				return outgoingConnectorVariables != null && !outgoingConnectorVariables.isEmpty();
			case ComponentstorypatternPackage.PORT_VARIABLE__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

} //PortVariableImpl
