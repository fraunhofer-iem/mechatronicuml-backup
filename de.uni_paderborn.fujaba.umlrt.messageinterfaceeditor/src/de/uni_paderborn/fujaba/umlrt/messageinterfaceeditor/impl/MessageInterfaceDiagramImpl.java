/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageInterfaceDiagram;
import de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageinterfaceeditorPackage;
import de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Interface Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.impl.MessageInterfaceDiagramImpl#getMessageInterfaces <em>Message Interfaces</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.impl.MessageInterfaceDiagramImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageInterfaceDiagramImpl extends EObjectImpl implements MessageInterfaceDiagram {
	/**
	 * The cached value of the '{@link #getMessageInterfaces() <em>Message Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageInterface> messageInterfaces;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageInterfaceDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MessageinterfaceeditorPackage.Literals.MESSAGE_INTERFACE_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageInterface> getMessageInterfaces() {
		if (messageInterfaces == null) {
			messageInterfaces = new EObjectContainmentEList<MessageInterface>(MessageInterface.class, this, MessageinterfaceeditorPackage.MESSAGE_INTERFACE_DIAGRAM__MESSAGE_INTERFACES);
		}
		return messageInterfaces;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MessageinterfaceeditorPackage.MESSAGE_INTERFACE_DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MessageinterfaceeditorPackage.MESSAGE_INTERFACE_DIAGRAM__MESSAGE_INTERFACES:
				return ((InternalEList<?>)getMessageInterfaces()).basicRemove(otherEnd, msgs);
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
			case MessageinterfaceeditorPackage.MESSAGE_INTERFACE_DIAGRAM__MESSAGE_INTERFACES:
				return getMessageInterfaces();
			case MessageinterfaceeditorPackage.MESSAGE_INTERFACE_DIAGRAM__NAME:
				return getName();
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
			case MessageinterfaceeditorPackage.MESSAGE_INTERFACE_DIAGRAM__MESSAGE_INTERFACES:
				getMessageInterfaces().clear();
				getMessageInterfaces().addAll((Collection<? extends MessageInterface>)newValue);
				return;
			case MessageinterfaceeditorPackage.MESSAGE_INTERFACE_DIAGRAM__NAME:
				setName((String)newValue);
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
			case MessageinterfaceeditorPackage.MESSAGE_INTERFACE_DIAGRAM__MESSAGE_INTERFACES:
				getMessageInterfaces().clear();
				return;
			case MessageinterfaceeditorPackage.MESSAGE_INTERFACE_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
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
			case MessageinterfaceeditorPackage.MESSAGE_INTERFACE_DIAGRAM__MESSAGE_INTERFACES:
				return messageInterfaces != null && !messageInterfaces.isEmpty();
			case MessageinterfaceeditorPackage.MESSAGE_INTERFACE_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //MessageInterfaceDiagramImpl
