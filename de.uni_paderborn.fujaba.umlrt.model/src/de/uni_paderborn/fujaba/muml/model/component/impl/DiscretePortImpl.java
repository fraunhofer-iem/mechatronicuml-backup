/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component.impl;

import de.uni_paderborn.fujaba.muml.model.component.Component;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ConnectorType;
import de.uni_paderborn.fujaba.muml.model.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.model.component.Port;

import de.uni_paderborn.fujaba.muml.model.constraint.Constraint;
import de.uni_paderborn.fujaba.muml.model.constraint.ConstraintPackage;

import de.uni_paderborn.fujaba.muml.model.core.Behavior;
import de.uni_paderborn.fujaba.muml.model.core.Cardinality;
import de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;

import de.uni_paderborn.fujaba.muml.model.core.impl.BehavioralElementImpl;

import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;

import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.Extension;
import org.storydriven.modeling.NamedElement;
import org.storydriven.modeling.SDMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#getAnnotations <em>Annotation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#getExtensions <em>Extension</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#getIncomingConnectors <em>Incoming Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#getOutgoingConnectors <em>Outgoing Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#getSenderMessageInterface <em>Sender Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#getReceiverMessageInterface <em>Receiver Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#getAdaptationBehavior <em>Adaptation Behavior</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#getRoleAndAdaptationBehavior <em>Role And Adaptation Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscretePortImpl extends BehavioralElementImpl implements DiscretePort {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<EAnnotation> annotations;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> extensions;

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
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality;

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
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected Role refines;

	/**
	 * The cached value of the '{@link #getSenderMessageInterface() <em>Sender Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderMessageInterface()
	 * @generated
	 * @ordered
	 */
	protected MessageInterface senderMessageInterface;

	/**
	 * The cached value of the '{@link #getReceiverMessageInterface() <em>Receiver Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverMessageInterface()
	 * @generated
	 * @ordered
	 */
	protected MessageInterface receiverMessageInterface;

	/**
	 * The cached value of the '{@link #getAdaptationBehavior() <em>Adaptation Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptationBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior adaptationBehavior;

	/**
	 * The cached value of the '{@link #getRoleAndAdaptationBehavior() <em>Role And Adaptation Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleAndAdaptationBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior roleAndAdaptationBehavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscretePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.DISCRETE_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList.Resolving<EAnnotation>(EAnnotation.class, this, ComponentPackage.DISCRETE_PORT__ANNOTATION);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getExtensions() {
		if (extensions == null) {
			extensions = new EObjectContainmentWithInverseEList.Resolving<Extension>(Extension.class, this, ComponentPackage.DISCRETE_PORT__EXTENSION, SDMPackage.EXTENSION__EXTENDABLE_BASE);
		}
		return extensions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, ComponentPackage.DISCRETE_PORT__CONSTRAINT, ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT);
		}
		return constraint;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT__CARDINALITY, oldCardinality, newCardinality);
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
				msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.DISCRETE_PORT__CARDINALITY, null, msgs);
			if (newCardinality != null)
				msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.DISCRETE_PORT__CARDINALITY, null, msgs);
			msgs = basicSetCardinality(newCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT__CARDINALITY, newCardinality, newCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getIncomingConnectors() {
		if (incomingConnectors == null) {
			incomingConnectors = new EObjectWithInverseResolvingEList<ConnectorType>(ConnectorType.class, this, ComponentPackage.DISCRETE_PORT__INCOMING_CONNECTORS, ComponentPackage.CONNECTOR_TYPE__TO_PORT);
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
			outgoingConnectors = new EObjectWithInverseResolvingEList<ConnectorType>(ConnectorType.class, this, ComponentPackage.DISCRETE_PORT__OUTGOING_CONNECTORS, ComponentPackage.CONNECTOR_TYPE__FROM_PORT);
		}
		return outgoingConnectors;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT__COMPONENT, oldComponent, component));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRefines() {
		if (refines != null && refines.eIsProxy()) {
			InternalEObject oldRefines = (InternalEObject)refines;
			refines = (Role)eResolveProxy(oldRefines);
			if (refines != oldRefines) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT__REFINES, oldRefines, refines));
			}
		}
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRefines() {
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefines(Role newRefines, NotificationChain msgs) {
		Role oldRefines = refines;
		refines = newRefines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT__REFINES, oldRefines, newRefines);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefines(Role newRefines) {
		if (newRefines != refines) {
			NotificationChain msgs = null;
			if (refines != null)
				msgs = ((InternalEObject)refines).eInverseRemove(this, PatternPackage.ROLE__PORT, Role.class, msgs);
			if (newRefines != null)
				msgs = ((InternalEObject)newRefines).eInverseAdd(this, PatternPackage.ROLE__PORT, Role.class, msgs);
			msgs = basicSetRefines(newRefines, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT__REFINES, newRefines, newRefines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface getSenderMessageInterface() {
		if (senderMessageInterface != null && senderMessageInterface.eIsProxy()) {
			InternalEObject oldSenderMessageInterface = (InternalEObject)senderMessageInterface;
			senderMessageInterface = (MessageInterface)eResolveProxy(oldSenderMessageInterface);
			if (senderMessageInterface != oldSenderMessageInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT__SENDER_MESSAGE_INTERFACE, oldSenderMessageInterface, senderMessageInterface));
			}
		}
		return senderMessageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface basicGetSenderMessageInterface() {
		return senderMessageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderMessageInterface(MessageInterface newSenderMessageInterface) {
		MessageInterface oldSenderMessageInterface = senderMessageInterface;
		senderMessageInterface = newSenderMessageInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT__SENDER_MESSAGE_INTERFACE, oldSenderMessageInterface, senderMessageInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface getReceiverMessageInterface() {
		if (receiverMessageInterface != null && receiverMessageInterface.eIsProxy()) {
			InternalEObject oldReceiverMessageInterface = (InternalEObject)receiverMessageInterface;
			receiverMessageInterface = (MessageInterface)eResolveProxy(oldReceiverMessageInterface);
			if (receiverMessageInterface != oldReceiverMessageInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_INTERFACE, oldReceiverMessageInterface, receiverMessageInterface));
			}
		}
		return receiverMessageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface basicGetReceiverMessageInterface() {
		return receiverMessageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiverMessageInterface(MessageInterface newReceiverMessageInterface) {
		MessageInterface oldReceiverMessageInterface = receiverMessageInterface;
		receiverMessageInterface = newReceiverMessageInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_INTERFACE, oldReceiverMessageInterface, receiverMessageInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getAdaptationBehavior() {
		if (adaptationBehavior != null && adaptationBehavior.eIsProxy()) {
			InternalEObject oldAdaptationBehavior = (InternalEObject)adaptationBehavior;
			adaptationBehavior = (Behavior)eResolveProxy(oldAdaptationBehavior);
			if (adaptationBehavior != oldAdaptationBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT__ADAPTATION_BEHAVIOR, oldAdaptationBehavior, adaptationBehavior));
			}
		}
		return adaptationBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetAdaptationBehavior() {
		return adaptationBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdaptationBehavior(Behavior newAdaptationBehavior) {
		Behavior oldAdaptationBehavior = adaptationBehavior;
		adaptationBehavior = newAdaptationBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT__ADAPTATION_BEHAVIOR, oldAdaptationBehavior, adaptationBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getRoleAndAdaptationBehavior() {
		if (roleAndAdaptationBehavior != null && roleAndAdaptationBehavior.eIsProxy()) {
			InternalEObject oldRoleAndAdaptationBehavior = (InternalEObject)roleAndAdaptationBehavior;
			roleAndAdaptationBehavior = (Behavior)eResolveProxy(oldRoleAndAdaptationBehavior);
			if (roleAndAdaptationBehavior != oldRoleAndAdaptationBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT__ROLE_AND_ADAPTATION_BEHAVIOR, oldRoleAndAdaptationBehavior, roleAndAdaptationBehavior));
			}
		}
		return roleAndAdaptationBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetRoleAndAdaptationBehavior() {
		return roleAndAdaptationBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleAndAdaptationBehavior(Behavior newRoleAndAdaptationBehavior) {
		Behavior oldRoleAndAdaptationBehavior = roleAndAdaptationBehavior;
		roleAndAdaptationBehavior = newRoleAndAdaptationBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT__ROLE_AND_ADAPTATION_BEHAVIOR, oldRoleAndAdaptationBehavior, roleAndAdaptationBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension getExtension(EClass type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension provideExtension(EClass type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation getAnnotation(String source) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation provideAnnotation(String source) {
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
			case ComponentPackage.DISCRETE_PORT__EXTENSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensions()).basicAdd(otherEnd, msgs);
			case ComponentPackage.DISCRETE_PORT__CONSTRAINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraint()).basicAdd(otherEnd, msgs);
			case ComponentPackage.DISCRETE_PORT__INCOMING_CONNECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingConnectors()).basicAdd(otherEnd, msgs);
			case ComponentPackage.DISCRETE_PORT__OUTGOING_CONNECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingConnectors()).basicAdd(otherEnd, msgs);
			case ComponentPackage.DISCRETE_PORT__REFINES:
				if (refines != null)
					msgs = ((InternalEObject)refines).eInverseRemove(this, PatternPackage.ROLE__PORT, Role.class, msgs);
				return basicSetRefines((Role)otherEnd, msgs);
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
			case ComponentPackage.DISCRETE_PORT__ANNOTATION:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case ComponentPackage.DISCRETE_PORT__EXTENSION:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
			case ComponentPackage.DISCRETE_PORT__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case ComponentPackage.DISCRETE_PORT__CARDINALITY:
				return basicSetCardinality(null, msgs);
			case ComponentPackage.DISCRETE_PORT__INCOMING_CONNECTORS:
				return ((InternalEList<?>)getIncomingConnectors()).basicRemove(otherEnd, msgs);
			case ComponentPackage.DISCRETE_PORT__OUTGOING_CONNECTORS:
				return ((InternalEList<?>)getOutgoingConnectors()).basicRemove(otherEnd, msgs);
			case ComponentPackage.DISCRETE_PORT__REFINES:
				return basicSetRefines(null, msgs);
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
			case ComponentPackage.DISCRETE_PORT__ANNOTATION:
				return getAnnotations();
			case ComponentPackage.DISCRETE_PORT__EXTENSION:
				return getExtensions();
			case ComponentPackage.DISCRETE_PORT__NAME:
				return getName();
			case ComponentPackage.DISCRETE_PORT__COMMENT:
				return getComment();
			case ComponentPackage.DISCRETE_PORT__CONSTRAINT:
				return getConstraint();
			case ComponentPackage.DISCRETE_PORT__CARDINALITY:
				return getCardinality();
			case ComponentPackage.DISCRETE_PORT__INCOMING_CONNECTORS:
				return getIncomingConnectors();
			case ComponentPackage.DISCRETE_PORT__OUTGOING_CONNECTORS:
				return getOutgoingConnectors();
			case ComponentPackage.DISCRETE_PORT__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case ComponentPackage.DISCRETE_PORT__REFINES:
				if (resolve) return getRefines();
				return basicGetRefines();
			case ComponentPackage.DISCRETE_PORT__SENDER_MESSAGE_INTERFACE:
				if (resolve) return getSenderMessageInterface();
				return basicGetSenderMessageInterface();
			case ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_INTERFACE:
				if (resolve) return getReceiverMessageInterface();
				return basicGetReceiverMessageInterface();
			case ComponentPackage.DISCRETE_PORT__ADAPTATION_BEHAVIOR:
				if (resolve) return getAdaptationBehavior();
				return basicGetAdaptationBehavior();
			case ComponentPackage.DISCRETE_PORT__ROLE_AND_ADAPTATION_BEHAVIOR:
				if (resolve) return getRoleAndAdaptationBehavior();
				return basicGetRoleAndAdaptationBehavior();
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
			case ComponentPackage.DISCRETE_PORT__ANNOTATION:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends EAnnotation>)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT__EXTENSION:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends Extension>)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT__NAME:
				setName((String)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT__COMMENT:
				setComment((String)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends Constraint>)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT__INCOMING_CONNECTORS:
				getIncomingConnectors().clear();
				getIncomingConnectors().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT__OUTGOING_CONNECTORS:
				getOutgoingConnectors().clear();
				getOutgoingConnectors().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT__COMPONENT:
				setComponent((Component)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT__REFINES:
				setRefines((Role)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT__SENDER_MESSAGE_INTERFACE:
				setSenderMessageInterface((MessageInterface)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_INTERFACE:
				setReceiverMessageInterface((MessageInterface)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT__ADAPTATION_BEHAVIOR:
				setAdaptationBehavior((Behavior)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT__ROLE_AND_ADAPTATION_BEHAVIOR:
				setRoleAndAdaptationBehavior((Behavior)newValue);
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
			case ComponentPackage.DISCRETE_PORT__ANNOTATION:
				getAnnotations().clear();
				return;
			case ComponentPackage.DISCRETE_PORT__EXTENSION:
				getExtensions().clear();
				return;
			case ComponentPackage.DISCRETE_PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComponentPackage.DISCRETE_PORT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ComponentPackage.DISCRETE_PORT__CONSTRAINT:
				getConstraint().clear();
				return;
			case ComponentPackage.DISCRETE_PORT__CARDINALITY:
				setCardinality((Cardinality)null);
				return;
			case ComponentPackage.DISCRETE_PORT__INCOMING_CONNECTORS:
				getIncomingConnectors().clear();
				return;
			case ComponentPackage.DISCRETE_PORT__OUTGOING_CONNECTORS:
				getOutgoingConnectors().clear();
				return;
			case ComponentPackage.DISCRETE_PORT__COMPONENT:
				setComponent((Component)null);
				return;
			case ComponentPackage.DISCRETE_PORT__REFINES:
				setRefines((Role)null);
				return;
			case ComponentPackage.DISCRETE_PORT__SENDER_MESSAGE_INTERFACE:
				setSenderMessageInterface((MessageInterface)null);
				return;
			case ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_INTERFACE:
				setReceiverMessageInterface((MessageInterface)null);
				return;
			case ComponentPackage.DISCRETE_PORT__ADAPTATION_BEHAVIOR:
				setAdaptationBehavior((Behavior)null);
				return;
			case ComponentPackage.DISCRETE_PORT__ROLE_AND_ADAPTATION_BEHAVIOR:
				setRoleAndAdaptationBehavior((Behavior)null);
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
			case ComponentPackage.DISCRETE_PORT__ANNOTATION:
				return annotations != null && !annotations.isEmpty();
			case ComponentPackage.DISCRETE_PORT__EXTENSION:
				return extensions != null && !extensions.isEmpty();
			case ComponentPackage.DISCRETE_PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComponentPackage.DISCRETE_PORT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ComponentPackage.DISCRETE_PORT__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case ComponentPackage.DISCRETE_PORT__CARDINALITY:
				return cardinality != null;
			case ComponentPackage.DISCRETE_PORT__INCOMING_CONNECTORS:
				return incomingConnectors != null && !incomingConnectors.isEmpty();
			case ComponentPackage.DISCRETE_PORT__OUTGOING_CONNECTORS:
				return outgoingConnectors != null && !outgoingConnectors.isEmpty();
			case ComponentPackage.DISCRETE_PORT__COMPONENT:
				return component != null;
			case ComponentPackage.DISCRETE_PORT__REFINES:
				return refines != null;
			case ComponentPackage.DISCRETE_PORT__SENDER_MESSAGE_INTERFACE:
				return senderMessageInterface != null;
			case ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_INTERFACE:
				return receiverMessageInterface != null;
			case ComponentPackage.DISCRETE_PORT__ADAPTATION_BEHAVIOR:
				return adaptationBehavior != null;
			case ComponentPackage.DISCRETE_PORT__ROLE_AND_ADAPTATION_BEHAVIOR:
				return roleAndAdaptationBehavior != null;
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
		if (baseClass == EObject.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ExtendableElement.class) {
			switch (derivedFeatureID) {
				case ComponentPackage.DISCRETE_PORT__ANNOTATION: return SDMPackage.EXTENDABLE_ELEMENT__ANNOTATION;
				case ComponentPackage.DISCRETE_PORT__EXTENSION: return SDMPackage.EXTENDABLE_ELEMENT__EXTENSION;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case ComponentPackage.DISCRETE_PORT__NAME: return SDMPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == CommentableElement.class) {
			switch (derivedFeatureID) {
				case ComponentPackage.DISCRETE_PORT__COMMENT: return SDMPackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ConstrainableElement.class) {
			switch (derivedFeatureID) {
				case ComponentPackage.DISCRETE_PORT__CONSTRAINT: return CorePackage.CONSTRAINABLE_ELEMENT__CONSTRAINT;
				default: return -1;
			}
		}
		if (baseClass == Port.class) {
			switch (derivedFeatureID) {
				case ComponentPackage.DISCRETE_PORT__CARDINALITY: return ComponentPackage.PORT__CARDINALITY;
				case ComponentPackage.DISCRETE_PORT__INCOMING_CONNECTORS: return ComponentPackage.PORT__INCOMING_CONNECTORS;
				case ComponentPackage.DISCRETE_PORT__OUTGOING_CONNECTORS: return ComponentPackage.PORT__OUTGOING_CONNECTORS;
				case ComponentPackage.DISCRETE_PORT__COMPONENT: return ComponentPackage.PORT__COMPONENT;
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
		if (baseClass == EObject.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ExtendableElement.class) {
			switch (baseFeatureID) {
				case SDMPackage.EXTENDABLE_ELEMENT__ANNOTATION: return ComponentPackage.DISCRETE_PORT__ANNOTATION;
				case SDMPackage.EXTENDABLE_ELEMENT__EXTENSION: return ComponentPackage.DISCRETE_PORT__EXTENSION;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case SDMPackage.NAMED_ELEMENT__NAME: return ComponentPackage.DISCRETE_PORT__NAME;
				default: return -1;
			}
		}
		if (baseClass == CommentableElement.class) {
			switch (baseFeatureID) {
				case SDMPackage.COMMENTABLE_ELEMENT__COMMENT: return ComponentPackage.DISCRETE_PORT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ConstrainableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.CONSTRAINABLE_ELEMENT__CONSTRAINT: return ComponentPackage.DISCRETE_PORT__CONSTRAINT;
				default: return -1;
			}
		}
		if (baseClass == Port.class) {
			switch (baseFeatureID) {
				case ComponentPackage.PORT__CARDINALITY: return ComponentPackage.DISCRETE_PORT__CARDINALITY;
				case ComponentPackage.PORT__INCOMING_CONNECTORS: return ComponentPackage.DISCRETE_PORT__INCOMING_CONNECTORS;
				case ComponentPackage.PORT__OUTGOING_CONNECTORS: return ComponentPackage.DISCRETE_PORT__OUTGOING_CONNECTORS;
				case ComponentPackage.PORT__COMPONENT: return ComponentPackage.DISCRETE_PORT__COMPONENT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //DiscretePortImpl
