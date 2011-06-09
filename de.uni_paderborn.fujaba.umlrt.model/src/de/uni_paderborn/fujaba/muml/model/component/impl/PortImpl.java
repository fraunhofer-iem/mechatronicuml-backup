/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.common.adapter.DerivedAttributeAdapter;
import de.uni_paderborn.fujaba.muml.model.component.Component;
import de.uni_paderborn.fujaba.muml.model.component.ComponentFactory;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ConnectorType;
import de.uni_paderborn.fujaba.muml.model.component.DiscretePortSpecification;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.component.PortKind;
import de.uni_paderborn.fujaba.muml.model.component.PortSpecification;
import de.uni_paderborn.fujaba.muml.model.constraint.Constraint;
import de.uni_paderborn.fujaba.muml.model.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.core.Cardinality;
import de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl#getPortKind <em>Port Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl#getSenderMessageInterface <em>Sender Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl#getReceiverMessageInterface <em>Receiver Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl#getIncomingConnectors <em>Incoming Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl#getOutgoingConnectors <em>Outgoing Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl#getComponent <em>Component</em>}</li>
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
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

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
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality;

	/**
	 * The cached setting delegate for the '{@link #getSenderMessageInterface() <em>Sender Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderMessageInterface()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SENDER_MESSAGE_INTERFACE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.PORT__SENDER_MESSAGE_INTERFACE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getReceiverMessageInterface() <em>Receiver Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverMessageInterface()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RECEIVER_MESSAGE_INTERFACE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.PORT__RECEIVER_MESSAGE_INTERFACE).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getIncomingConnectors() <em>Incoming Connectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorType> incomingConnectors;

	/**
	 * The cached value of the '{@link #getOutgoingConnectors() <em>Outgoing Connectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorType> outgoingConnectors;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected PortImpl() {
		super();
		
		// Install a notification adapter that informs the
		// requiredMessageInterface-reference, whenever one of the dependent features
		// was modified
		DerivedAttributeAdapter requiredDerivedAdapter = new DerivedAttributeAdapter(this, ComponentPackage.Literals.PORT__SENDER_MESSAGE_INTERFACE);
		requiredDerivedAdapter.addNavigatedDependency(ComponentPackage.Literals.PORT__SPECIFICATION, ComponentPackage.Literals.DISCRETE_PORT_SPECIFICATION__SENDER_MESSAGE_INTERFACE);

		// Install a notification adapter that informs the
		// providedMessageInterface-reference, whenever one of the dependent features
		// was modified
		DerivedAttributeAdapter providedDerivedAdapter = new DerivedAttributeAdapter(this, ComponentPackage.Literals.PORT__RECEIVER_MESSAGE_INTERFACE);
		providedDerivedAdapter.addNavigatedDependency(ComponentPackage.Literals.PORT__SPECIFICATION, ComponentPackage.Literals.DISCRETE_PORT_SPECIFICATION__RECEIVER_MESSAGE_INTERFACE);
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
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, ComponentPackage.PORT__CONSTRAINT, ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (Component)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.PORT__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		Component oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PORT__COMPONENT, oldComponent, component));
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
	public MessageInterface getSenderMessageInterface() {
		return (MessageInterface)SENDER_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface basicGetSenderMessageInterface() {
		return (MessageInterface)SENDER_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setSenderMessageInterface(MessageInterface newSenderMessageInterface) {
		// SENDER_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newSenderMessageInterface);
		getSafeDiscretePortSpecification().setSenderMessageInterface(newSenderMessageInterface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface getReceiverMessageInterface() {
		return (MessageInterface)RECEIVER_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface basicGetReceiverMessageInterface() {
		return (MessageInterface)RECEIVER_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setReceiverMessageInterface(MessageInterface newReceiverMessageInterface) {
		// RECEIVER_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newReceiverMessageInterface);
		getSafeDiscretePortSpecification().setReceiverMessageInterface(newReceiverMessageInterface);
	}

	/**
	 * Returns the DiscretePortSpecification of this Port if it exists. If it
	 * did not exist, it will be created before.
	 * 
	 * @return The DiscretePortSpecitifation - never <code>null</code>.
	 */
	private DiscretePortSpecification getSafeDiscretePortSpecification() {
		DiscretePortSpecification discretePortSpecification = null;
		for (PortSpecification portSpecification : getSpecification()) {
			if (portSpecification instanceof DiscretePortSpecification) {
				discretePortSpecification = (DiscretePortSpecification) portSpecification;
			}
		}
		if (discretePortSpecification == null) {
			discretePortSpecification = ComponentFactory.eINSTANCE
					.createDiscretePortSpecification();
			getSpecification().add(discretePortSpecification);
		}
		return discretePortSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getIncomingConnectors() {
		if (incomingConnectors == null) {
			incomingConnectors = new EObjectWithInverseResolvingEList<ConnectorType>(ConnectorType.class, this, ComponentPackage.PORT__INCOMING_CONNECTORS, ComponentPackage.CONNECTOR_TYPE__TO_PORT);
		}
		return incomingConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getOutgoingConnectors() {
		if (outgoingConnectors == null) {
			outgoingConnectors = new EObjectWithInverseResolvingEList<ConnectorType>(ConnectorType.class, this, ComponentPackage.PORT__OUTGOING_CONNECTORS, ComponentPackage.CONNECTOR_TYPE__FROM_PORT);
		}
		return outgoingConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance createInstance() {
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
			case ComponentPackage.PORT__CONSTRAINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraint()).basicAdd(otherEnd, msgs);
			case ComponentPackage.PORT__INCOMING_CONNECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingConnectors()).basicAdd(otherEnd, msgs);
			case ComponentPackage.PORT__OUTGOING_CONNECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingConnectors()).basicAdd(otherEnd, msgs);
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
			case ComponentPackage.PORT__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case ComponentPackage.PORT__SPECIFICATION:
				return ((InternalEList<?>)getSpecification()).basicRemove(otherEnd, msgs);
			case ComponentPackage.PORT__CARDINALITY:
				return basicSetCardinality(null, msgs);
			case ComponentPackage.PORT__INCOMING_CONNECTORS:
				return ((InternalEList<?>)getIncomingConnectors()).basicRemove(otherEnd, msgs);
			case ComponentPackage.PORT__OUTGOING_CONNECTORS:
				return ((InternalEList<?>)getOutgoingConnectors()).basicRemove(otherEnd, msgs);
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
			case ComponentPackage.PORT__COMMENT:
				return getComment();
			case ComponentPackage.PORT__CONSTRAINT:
				return getConstraint();
			case ComponentPackage.PORT__PORT_KIND:
				return getPortKind();
			case ComponentPackage.PORT__SPECIFICATION:
				return getSpecification();
			case ComponentPackage.PORT__CARDINALITY:
				return getCardinality();
			case ComponentPackage.PORT__SENDER_MESSAGE_INTERFACE:
				if (resolve) return getSenderMessageInterface();
				return basicGetSenderMessageInterface();
			case ComponentPackage.PORT__RECEIVER_MESSAGE_INTERFACE:
				if (resolve) return getReceiverMessageInterface();
				return basicGetReceiverMessageInterface();
			case ComponentPackage.PORT__INCOMING_CONNECTORS:
				return getIncomingConnectors();
			case ComponentPackage.PORT__OUTGOING_CONNECTORS:
				return getOutgoingConnectors();
			case ComponentPackage.PORT__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
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
			case ComponentPackage.PORT__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends Constraint>)newValue);
				return;
			case ComponentPackage.PORT__PORT_KIND:
				setPortKind((PortKind)newValue);
				return;
			case ComponentPackage.PORT__SPECIFICATION:
				getSpecification().clear();
				getSpecification().addAll((Collection<? extends PortSpecification>)newValue);
				return;
			case ComponentPackage.PORT__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case ComponentPackage.PORT__SENDER_MESSAGE_INTERFACE:
				setSenderMessageInterface((MessageInterface)newValue);
				return;
			case ComponentPackage.PORT__RECEIVER_MESSAGE_INTERFACE:
				setReceiverMessageInterface((MessageInterface)newValue);
				return;
			case ComponentPackage.PORT__INCOMING_CONNECTORS:
				getIncomingConnectors().clear();
				getIncomingConnectors().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case ComponentPackage.PORT__OUTGOING_CONNECTORS:
				getOutgoingConnectors().clear();
				getOutgoingConnectors().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case ComponentPackage.PORT__COMPONENT:
				setComponent((Component)newValue);
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
			case ComponentPackage.PORT__CONSTRAINT:
				getConstraint().clear();
				return;
			case ComponentPackage.PORT__PORT_KIND:
				setPortKind(PORT_KIND_EDEFAULT);
				return;
			case ComponentPackage.PORT__SPECIFICATION:
				getSpecification().clear();
				return;
			case ComponentPackage.PORT__CARDINALITY:
				setCardinality((Cardinality)null);
				return;
			case ComponentPackage.PORT__SENDER_MESSAGE_INTERFACE:
				setSenderMessageInterface((MessageInterface)null);
				return;
			case ComponentPackage.PORT__RECEIVER_MESSAGE_INTERFACE:
				setReceiverMessageInterface((MessageInterface)null);
				return;
			case ComponentPackage.PORT__INCOMING_CONNECTORS:
				getIncomingConnectors().clear();
				return;
			case ComponentPackage.PORT__OUTGOING_CONNECTORS:
				getOutgoingConnectors().clear();
				return;
			case ComponentPackage.PORT__COMPONENT:
				setComponent((Component)null);
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
			case ComponentPackage.PORT__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case ComponentPackage.PORT__PORT_KIND:
				return portKind != PORT_KIND_EDEFAULT;
			case ComponentPackage.PORT__SPECIFICATION:
				return specification != null && !specification.isEmpty();
			case ComponentPackage.PORT__CARDINALITY:
				return cardinality != null;
			case ComponentPackage.PORT__SENDER_MESSAGE_INTERFACE:
				return SENDER_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.PORT__RECEIVER_MESSAGE_INTERFACE:
				return RECEIVER_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.PORT__INCOMING_CONNECTORS:
				return incomingConnectors != null && !incomingConnectors.isEmpty();
			case ComponentPackage.PORT__OUTGOING_CONNECTORS:
				return outgoingConnectors != null && !outgoingConnectors.isEmpty();
			case ComponentPackage.PORT__COMPONENT:
				return component != null;
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
		if (baseClass == ConstrainableElement.class) {
			switch (derivedFeatureID) {
				case ComponentPackage.PORT__CONSTRAINT: return CorePackage.CONSTRAINABLE_ELEMENT__CONSTRAINT;
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
		if (baseClass == ConstrainableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.CONSTRAINABLE_ELEMENT__CONSTRAINT: return ComponentPackage.PORT__CONSTRAINT;
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
		result.append(", portKind: ");
		result.append(portKind);
		result.append(')');
		return result.toString();
	}

} //PortImpl
