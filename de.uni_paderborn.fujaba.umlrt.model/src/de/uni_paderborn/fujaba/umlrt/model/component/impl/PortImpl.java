/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.component.impl;

import de.uni_paderborn.fujaba.umlrt.model.component.Component;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.umlrt.model.component.ConnectorType;
import de.uni_paderborn.fujaba.umlrt.model.component.Port;
import de.uni_paderborn.fujaba.umlrt.model.component.PortKind;
import de.uni_paderborn.fujaba.umlrt.model.component.PortSpecification;

import de.uni_paderborn.fujaba.umlrt.model.core.Cardinality;

import de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface;

import de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.umlrt.model.pattern.Role;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.SDMPackage;

import org.storydriven.modeling.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.impl.PortImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.impl.PortImpl#getInvisibleInterfaces <em>Invisible Interfaces</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.impl.PortImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.impl.PortImpl#getPortKind <em>Port Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.impl.PortImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.impl.PortImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.impl.PortImpl#getProvided <em>Provided</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.impl.PortImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.impl.PortImpl#getFromPortToConnectorRev <em>From Port To Connector Rev</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.impl.PortImpl#getToPortToConnectorRev <em>To Port To Connector Rev</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends NamedElementImpl implements Port {
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
	 * The cached value of the '{@link #getInvisibleInterfaces() <em>Invisible Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvisibleInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> invisibleInterfaces;

	/**
	 * The default value of the '{@link #getPortKind() <em>Port Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortKind()
	 * @generated
	 * @ordered
	 */
	protected static final PortKind PORT_KIND_EDEFAULT = PortKind.DISCRETE;

	/**
	 * The cached value of the '{@link #getPortKind() <em>Port Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortKind()
	 * @generated
	 * @ordered
	 */
	protected PortKind portKind = PORT_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<PortSpecification> specification;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected MessageInterface required;

	/**
	 * The cached value of the '{@link #getProvided() <em>Provided</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvided()
	 * @generated
	 * @ordered
	 */
	protected MessageInterface provided;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality;

	/**
	 * The cached value of the '{@link #getFromPortToConnectorRev() <em>From Port To Connector Rev</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPortToConnectorRev()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorType> fromPortToConnectorRev;

	/**
	 * The cached value of the '{@link #getToPortToConnectorRev() <em>To Port To Connector Rev</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPortToConnectorRev()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorType> toPortToConnectorRev;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.PORT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PORT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getInvisibleInterfaces() {
		if (invisibleInterfaces == null) {
			invisibleInterfaces = new EObjectResolvingEList<EClass>(EClass.class, this, ComponentPackage.PORT__INVISIBLE_INTERFACES);
		}
		return invisibleInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		if (eContainerFeatureID() != ComponentPackage.PORT__COMPONENT) return null;
		return (Component)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponent, ComponentPackage.PORT__COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		if (newComponent != eInternalContainer() || (eContainerFeatureID() != ComponentPackage.PORT__COMPONENT && newComponent != null)) {
			if (EcoreUtil.isAncestor(this, newComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, ComponentPackage.COMPONENT__PORTS, Component.class, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PORT__COMPONENT, newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortKind getPortKind() {
		return portKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortKind(PortKind newPortKind) {
		PortKind oldPortKind = portKind;
		portKind = newPortKind == null ? PORT_KIND_EDEFAULT : newPortKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PORT__PORT_KIND, oldPortKind, portKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortSpecification> getSpecification() {
		if (specification == null) {
			specification = new EObjectContainmentEList<PortSpecification>(PortSpecification.class, this, ComponentPackage.PORT__SPECIFICATION);
		}
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface getRequired() {
		if (required != null && required.eIsProxy()) {
			InternalEObject oldRequired = (InternalEObject)required;
			required = (MessageInterface)eResolveProxy(oldRequired);
			if (required != oldRequired) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.PORT__REQUIRED, oldRequired, required));
			}
		}
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface basicGetRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(MessageInterface newRequired) {
		MessageInterface oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PORT__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface getProvided() {
		if (provided != null && provided.eIsProxy()) {
			InternalEObject oldProvided = (InternalEObject)provided;
			provided = (MessageInterface)eResolveProxy(oldProvided);
			if (provided != oldProvided) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.PORT__PROVIDED, oldProvided, provided));
			}
		}
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface basicGetProvided() {
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvided(MessageInterface newProvided) {
		MessageInterface oldProvided = provided;
		provided = newProvided;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PORT__PROVIDED, oldProvided, provided));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinality(Cardinality newCardinality, NotificationChain msgs) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.PORT__CARDINALITY, oldCardinality, newCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		if (newCardinality != cardinality) {
			NotificationChain msgs = null;
			if (cardinality != null)
				msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.PORT__CARDINALITY, null, msgs);
			if (newCardinality != null)
				msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.PORT__CARDINALITY, null, msgs);
			msgs = basicSetCardinality(newCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PORT__CARDINALITY, newCardinality, newCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getFromPortToConnectorRev() {
		if (fromPortToConnectorRev == null) {
			fromPortToConnectorRev = new EObjectWithInverseResolvingEList<ConnectorType>(ConnectorType.class, this, ComponentPackage.PORT__FROM_PORT_TO_CONNECTOR_REV, ComponentPackage.CONNECTOR_TYPE__FROM_PORT);
		}
		return fromPortToConnectorRev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getToPortToConnectorRev() {
		if (toPortToConnectorRev == null) {
			toPortToConnectorRev = new EObjectWithInverseResolvingEList<ConnectorType>(ConnectorType.class, this, ComponentPackage.PORT__TO_PORT_TO_CONNECTOR_REV, ComponentPackage.CONNECTOR_TYPE__TO_PORT);
		}
		return toPortToConnectorRev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case ComponentPackage.PORT__COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponent((Component)otherEnd, msgs);
			case ComponentPackage.PORT__FROM_PORT_TO_CONNECTOR_REV:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromPortToConnectorRev()).basicAdd(otherEnd, msgs);
			case ComponentPackage.PORT__TO_PORT_TO_CONNECTOR_REV:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToPortToConnectorRev()).basicAdd(otherEnd, msgs);
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
			case ComponentPackage.PORT__COMPONENT:
				return basicSetComponent(null, msgs);
			case ComponentPackage.PORT__SPECIFICATION:
				return ((InternalEList<?>)getSpecification()).basicRemove(otherEnd, msgs);
			case ComponentPackage.PORT__CARDINALITY:
				return basicSetCardinality(null, msgs);
			case ComponentPackage.PORT__FROM_PORT_TO_CONNECTOR_REV:
				return ((InternalEList<?>)getFromPortToConnectorRev()).basicRemove(otherEnd, msgs);
			case ComponentPackage.PORT__TO_PORT_TO_CONNECTOR_REV:
				return ((InternalEList<?>)getToPortToConnectorRev()).basicRemove(otherEnd, msgs);
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
			case ComponentPackage.PORT__COMPONENT:
				return eInternalContainer().eInverseRemove(this, ComponentPackage.COMPONENT__PORTS, Component.class, msgs);
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
			case ComponentPackage.PORT__COMMENT:
				return getComment();
			case ComponentPackage.PORT__INVISIBLE_INTERFACES:
				return getInvisibleInterfaces();
			case ComponentPackage.PORT__COMPONENT:
				return getComponent();
			case ComponentPackage.PORT__PORT_KIND:
				return getPortKind();
			case ComponentPackage.PORT__SPECIFICATION:
				return getSpecification();
			case ComponentPackage.PORT__REQUIRED:
				if (resolve) return getRequired();
				return basicGetRequired();
			case ComponentPackage.PORT__PROVIDED:
				if (resolve) return getProvided();
				return basicGetProvided();
			case ComponentPackage.PORT__CARDINALITY:
				return getCardinality();
			case ComponentPackage.PORT__FROM_PORT_TO_CONNECTOR_REV:
				return getFromPortToConnectorRev();
			case ComponentPackage.PORT__TO_PORT_TO_CONNECTOR_REV:
				return getToPortToConnectorRev();
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
			case ComponentPackage.PORT__COMMENT:
				setComment((String)newValue);
				return;
			case ComponentPackage.PORT__INVISIBLE_INTERFACES:
				getInvisibleInterfaces().clear();
				getInvisibleInterfaces().addAll((Collection<? extends EClass>)newValue);
				return;
			case ComponentPackage.PORT__COMPONENT:
				setComponent((Component)newValue);
				return;
			case ComponentPackage.PORT__PORT_KIND:
				setPortKind((PortKind)newValue);
				return;
			case ComponentPackage.PORT__SPECIFICATION:
				getSpecification().clear();
				getSpecification().addAll((Collection<? extends PortSpecification>)newValue);
				return;
			case ComponentPackage.PORT__REQUIRED:
				setRequired((MessageInterface)newValue);
				return;
			case ComponentPackage.PORT__PROVIDED:
				setProvided((MessageInterface)newValue);
				return;
			case ComponentPackage.PORT__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case ComponentPackage.PORT__FROM_PORT_TO_CONNECTOR_REV:
				getFromPortToConnectorRev().clear();
				getFromPortToConnectorRev().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case ComponentPackage.PORT__TO_PORT_TO_CONNECTOR_REV:
				getToPortToConnectorRev().clear();
				getToPortToConnectorRev().addAll((Collection<? extends ConnectorType>)newValue);
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
			case ComponentPackage.PORT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ComponentPackage.PORT__INVISIBLE_INTERFACES:
				getInvisibleInterfaces().clear();
				return;
			case ComponentPackage.PORT__COMPONENT:
				setComponent((Component)null);
				return;
			case ComponentPackage.PORT__PORT_KIND:
				setPortKind(PORT_KIND_EDEFAULT);
				return;
			case ComponentPackage.PORT__SPECIFICATION:
				getSpecification().clear();
				return;
			case ComponentPackage.PORT__REQUIRED:
				setRequired((MessageInterface)null);
				return;
			case ComponentPackage.PORT__PROVIDED:
				setProvided((MessageInterface)null);
				return;
			case ComponentPackage.PORT__CARDINALITY:
				setCardinality((Cardinality)null);
				return;
			case ComponentPackage.PORT__FROM_PORT_TO_CONNECTOR_REV:
				getFromPortToConnectorRev().clear();
				return;
			case ComponentPackage.PORT__TO_PORT_TO_CONNECTOR_REV:
				getToPortToConnectorRev().clear();
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
			case ComponentPackage.PORT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ComponentPackage.PORT__INVISIBLE_INTERFACES:
				return invisibleInterfaces != null && !invisibleInterfaces.isEmpty();
			case ComponentPackage.PORT__COMPONENT:
				return getComponent() != null;
			case ComponentPackage.PORT__PORT_KIND:
				return portKind != PORT_KIND_EDEFAULT;
			case ComponentPackage.PORT__SPECIFICATION:
				return specification != null && !specification.isEmpty();
			case ComponentPackage.PORT__REQUIRED:
				return required != null;
			case ComponentPackage.PORT__PROVIDED:
				return provided != null;
			case ComponentPackage.PORT__CARDINALITY:
				return cardinality != null;
			case ComponentPackage.PORT__FROM_PORT_TO_CONNECTOR_REV:
				return fromPortToConnectorRev != null && !fromPortToConnectorRev.isEmpty();
			case ComponentPackage.PORT__TO_PORT_TO_CONNECTOR_REV:
				return toPortToConnectorRev != null && !toPortToConnectorRev.isEmpty();
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
				case ComponentPackage.PORT__COMMENT: return SDMPackage.COMMENTABLE_ELEMENT__COMMENT;
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
				case SDMPackage.COMMENTABLE_ELEMENT__COMMENT: return ComponentPackage.PORT__COMMENT;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ComponentPackage.PORT___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //PortImpl
