/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.impl;

import de.uni_paderborn.fujaba.common.adapter.DerivedAttributeAdapter;
import de.uni_paderborn.fujaba.muml.model.component.Port;

import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.SDMPackage;

import org.storydriven.modeling.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.PortInstanceImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.PortInstanceImpl#getPortType <em>Port Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.PortInstanceImpl#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.PortInstanceImpl#getRequiredMessageInterface <em>Required Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.PortInstanceImpl#getProvidedMessageInterface <em>Provided Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.PortInstanceImpl#getIncomingConnectorInstances <em>Incoming Connector Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.PortInstanceImpl#getOutgoingConnectorInstances <em>Outgoing Connector Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortInstanceImpl extends NamedElementImpl implements PortInstance {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPortType() <em>Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected Port portType;

	/**
	 * The cached setting delegate for the '{@link #getRequiredMessageInterface() <em>Required Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredMessageInterface()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REQUIRED_MESSAGE_INTERFACE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.PORT_INSTANCE__REQUIRED_MESSAGE_INTERFACE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getProvidedMessageInterface() <em>Provided Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedMessageInterface()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PROVIDED_MESSAGE_INTERFACE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.PORT_INSTANCE__PROVIDED_MESSAGE_INTERFACE).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getIncomingConnectorInstances() <em>Incoming Connector Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingConnectorInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorInstance> incomingConnectorInstances;

	/**
	 * The cached value of the '{@link #getOutgoingConnectorInstances() <em>Outgoing Connector Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingConnectorInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorInstance> outgoingConnectorInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected PortInstanceImpl() {
		super();

		// Install a notification adapter that informs the
		// requiredMessageInterfaceDerived-reference, whenever one of the dependent
		// features
		// was modified
		DerivedAttributeAdapter requiredMessageInterfaceDerived = new DerivedAttributeAdapter(
				this,
				InstancePackage.Literals.PORT_INSTANCE__REQUIRED_MESSAGE_INTERFACE,
				false);
		requiredMessageInterfaceDerived.addNavigatedDependency(
				InstancePackage.Literals.PORT_INSTANCE__PORT_TYPE,
				ComponentPackage.Literals.PORT__REQUIRED_MESSAGE_INTERFACE);

		// Install a notification adapter that informs the
		// providedMessageInterfaceDerived-reference, whenever one of the dependent
		// features
		// was modified
		DerivedAttributeAdapter providedMessageInterfaceDerived = new DerivedAttributeAdapter(
				this,
				InstancePackage.Literals.PORT_INSTANCE__PROVIDED_MESSAGE_INTERFACE,
				false);
		providedMessageInterfaceDerived.addNavigatedDependency(
				InstancePackage.Literals.PORT_INSTANCE__PORT_TYPE,
				ComponentPackage.Literals.PORT__PROVIDED_MESSAGE_INTERFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.PORT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.PORT_INSTANCE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPortType() {
		if (portType != null && portType.eIsProxy()) {
			InternalEObject oldPortType = (InternalEObject)portType;
			portType = (Port)eResolveProxy(oldPortType);
			if (portType != oldPortType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.PORT_INSTANCE__PORT_TYPE, oldPortType, portType));
			}
		}
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPortType() {
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortType(Port newPortType) {
		Port oldPortType = portType;
		portType = newPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.PORT_INSTANCE__PORT_TYPE, oldPortType, portType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getComponentInstance() {
		if (eContainerFeatureID() != InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE) return null;
		return (ComponentInstance)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentInstance(ComponentInstance newComponentInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponentInstance, InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstance(ComponentInstance newComponentInstance) {
		if (newComponentInstance != eInternalContainer() || (eContainerFeatureID() != InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE && newComponentInstance != null)) {
			if (EcoreUtil.isAncestor(this, newComponentInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponentInstance != null)
				msgs = ((InternalEObject)newComponentInstance).eInverseAdd(this, InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES, ComponentInstance.class, msgs);
			msgs = basicSetComponentInstance(newComponentInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE, newComponentInstance, newComponentInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface getRequiredMessageInterface() {
		return (MessageInterface)REQUIRED_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface basicGetRequiredMessageInterface() {
		return (MessageInterface)REQUIRED_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface getProvidedMessageInterface() {
		return (MessageInterface)PROVIDED_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface basicGetProvidedMessageInterface() {
		return (MessageInterface)PROVIDED_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorInstance> getIncomingConnectorInstances() {
		if (incomingConnectorInstances == null) {
			incomingConnectorInstances = new EObjectWithInverseResolvingEList<ConnectorInstance>(ConnectorInstance.class, this, InstancePackage.PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES, InstancePackage.CONNECTOR_INSTANCE__TARGET);
		}
		return incomingConnectorInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorInstance> getOutgoingConnectorInstances() {
		if (outgoingConnectorInstances == null) {
			outgoingConnectorInstances = new EObjectWithInverseResolvingEList<ConnectorInstance>(ConnectorInstance.class, this, InstancePackage.PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES, InstancePackage.CONNECTOR_INSTANCE__SOURCE);
		}
		return outgoingConnectorInstances;
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
			case InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponentInstance((ComponentInstance)otherEnd, msgs);
			case InstancePackage.PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingConnectorInstances()).basicAdd(otherEnd, msgs);
			case InstancePackage.PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingConnectorInstances()).basicAdd(otherEnd, msgs);
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
			case InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE:
				return basicSetComponentInstance(null, msgs);
			case InstancePackage.PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES:
				return ((InternalEList<?>)getIncomingConnectorInstances()).basicRemove(otherEnd, msgs);
			case InstancePackage.PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES:
				return ((InternalEList<?>)getOutgoingConnectorInstances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE:
				return eInternalContainer().eInverseRemove(this, InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES, ComponentInstance.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.PORT_INSTANCE__COMMENT:
				return getComment();
			case InstancePackage.PORT_INSTANCE__PORT_TYPE:
				if (resolve) return getPortType();
				return basicGetPortType();
			case InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE:
				return getComponentInstance();
			case InstancePackage.PORT_INSTANCE__REQUIRED_MESSAGE_INTERFACE:
				if (resolve) return getRequiredMessageInterface();
				return basicGetRequiredMessageInterface();
			case InstancePackage.PORT_INSTANCE__PROVIDED_MESSAGE_INTERFACE:
				if (resolve) return getProvidedMessageInterface();
				return basicGetProvidedMessageInterface();
			case InstancePackage.PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES:
				return getIncomingConnectorInstances();
			case InstancePackage.PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES:
				return getOutgoingConnectorInstances();
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
			case InstancePackage.PORT_INSTANCE__COMMENT:
				setComment((String)newValue);
				return;
			case InstancePackage.PORT_INSTANCE__PORT_TYPE:
				setPortType((Port)newValue);
				return;
			case InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)newValue);
				return;
			case InstancePackage.PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES:
				getIncomingConnectorInstances().clear();
				getIncomingConnectorInstances().addAll((Collection<? extends ConnectorInstance>)newValue);
				return;
			case InstancePackage.PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES:
				getOutgoingConnectorInstances().clear();
				getOutgoingConnectorInstances().addAll((Collection<? extends ConnectorInstance>)newValue);
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
			case InstancePackage.PORT_INSTANCE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case InstancePackage.PORT_INSTANCE__PORT_TYPE:
				setPortType((Port)null);
				return;
			case InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)null);
				return;
			case InstancePackage.PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES:
				getIncomingConnectorInstances().clear();
				return;
			case InstancePackage.PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES:
				getOutgoingConnectorInstances().clear();
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
			case InstancePackage.PORT_INSTANCE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case InstancePackage.PORT_INSTANCE__PORT_TYPE:
				return portType != null;
			case InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE:
				return getComponentInstance() != null;
			case InstancePackage.PORT_INSTANCE__REQUIRED_MESSAGE_INTERFACE:
				return REQUIRED_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case InstancePackage.PORT_INSTANCE__PROVIDED_MESSAGE_INTERFACE:
				return PROVIDED_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case InstancePackage.PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES:
				return incomingConnectorInstances != null && !incomingConnectorInstances.isEmpty();
			case InstancePackage.PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES:
				return outgoingConnectorInstances != null && !outgoingConnectorInstances.isEmpty();
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
		if (baseClass == CommentableElement.class) {
			switch (derivedFeatureID) {
				case InstancePackage.PORT_INSTANCE__COMMENT: return SDMPackage.COMMENTABLE_ELEMENT__COMMENT;
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
		if (baseClass == CommentableElement.class) {
			switch (baseFeatureID) {
				case SDMPackage.COMMENTABLE_ELEMENT__COMMENT: return InstancePackage.PORT_INSTANCE__COMMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //PortInstanceImpl
