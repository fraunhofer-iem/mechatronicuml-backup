/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component.impl;

import de.uni_paderborn.fujaba.common.adapter.DerivedAttributeAdapter;
import de.uni_paderborn.fujaba.muml.model.component.Component;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ConnectorType;
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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl#getPortKind <em>Port Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl#getRequiredMessageInterface <em>Required Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl#getProvidedMessageInterface <em>Provided Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl#getIncomingConnectors <em>Incoming Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl#getOutgoingConnectors <em>Outgoing Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl#getAdaptationRealtimeStatechart <em>Adaptation Realtime Statechart</em>}</li>
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
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' reference list.
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
	 * The cached setting delegate for the '{@link #getRequiredMessageInterface() <em>Required Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredMessageInterface()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REQUIRED_MESSAGE_INTERFACE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.PORT__REQUIRED_MESSAGE_INTERFACE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getProvidedMessageInterface() <em>Provided Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedMessageInterface()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PROVIDED_MESSAGE_INTERFACE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.PORT__PROVIDED_MESSAGE_INTERFACE).getSettingDelegate();

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
	 * The cached setting delegate for the '{@link #getAdaptationRealtimeStatechart() <em>Adaptation Realtime Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptationRealtimeStatechart()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ADAPTATION_REALTIME_STATECHART__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.PORT__ADAPTATION_REALTIME_STATECHART).getSettingDelegate();

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
		DerivedAttributeAdapter requiredDerivedAdapter = new DerivedAttributeAdapter(this, ComponentPackage.Literals.PORT__REQUIRED_MESSAGE_INTERFACE, false);
		requiredDerivedAdapter.addNavigatedDependency(ComponentPackage.Literals.PORT__SPECIFICATION, ComponentPackage.Literals.DISCRETE_PORT_SPECIFICATION__REQUIRED_MESSAGE_INTERFACE);

		// Install a notification adapter that informs the
		// providedMessageInterface-reference, whenever one of the dependent features
		// was modified
		DerivedAttributeAdapter providedDerivedAdapter = new DerivedAttributeAdapter(this, ComponentPackage.Literals.PORT__PROVIDED_MESSAGE_INTERFACE, false);
		providedDerivedAdapter.addNavigatedDependency(ComponentPackage.Literals.PORT__SPECIFICATION, ComponentPackage.Literals.DISCRETE_PORT_SPECIFICATION__PROVIDED_MESSAGE_INTERFACE);

		// Install a notification adapter that informs the
		// adaptationRealtimeStatechart-reference, whenever one of the dependent features
		// was modified
		DerivedAttributeAdapter statechartDerivedAdapter = new DerivedAttributeAdapter(this, ComponentPackage.Literals.PORT__ADAPTATION_REALTIME_STATECHART, false);
		statechartDerivedAdapter.addNavigatedDependency(ComponentPackage.Literals.PORT__SPECIFICATION, ComponentPackage.Literals.DISCRETE_PORT_SPECIFICATION__ADAPTATION_REALTIME_STATECHART);
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
			constraint = new EObjectWithInverseResolvingEList<Constraint>(Constraint.class, this, ComponentPackage.PORT__CONSTRAINT, ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT);
		}
		return constraint;
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
	public void setRequiredMessageInterface(MessageInterface newRequiredMessageInterface) {
		REQUIRED_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newRequiredMessageInterface);
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
	public void setProvidedMessageInterface(MessageInterface newProvidedMessageInterface) {
		PROVIDED_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newProvidedMessageInterface);
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
	public AbstractRealtimeStatechart getAdaptationRealtimeStatechart() {
		return (AbstractRealtimeStatechart)ADAPTATION_REALTIME_STATECHART__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRealtimeStatechart basicGetAdaptationRealtimeStatechart() {
		return (AbstractRealtimeStatechart)ADAPTATION_REALTIME_STATECHART__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdaptationRealtimeStatechart(AbstractRealtimeStatechart newAdaptationRealtimeStatechart) {
		ADAPTATION_REALTIME_STATECHART__ESETTING_DELEGATE.dynamicSet(this, null, 0, newAdaptationRealtimeStatechart);
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
			case ComponentPackage.PORT__COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponent((Component)otherEnd, msgs);
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
			case ComponentPackage.PORT__COMPONENT:
				return basicSetComponent(null, msgs);
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
			case ComponentPackage.PORT__CONSTRAINT:
				return getConstraint();
			case ComponentPackage.PORT__COMPONENT:
				return getComponent();
			case ComponentPackage.PORT__PORT_KIND:
				return getPortKind();
			case ComponentPackage.PORT__SPECIFICATION:
				return getSpecification();
			case ComponentPackage.PORT__CARDINALITY:
				return getCardinality();
			case ComponentPackage.PORT__REQUIRED_MESSAGE_INTERFACE:
				if (resolve) return getRequiredMessageInterface();
				return basicGetRequiredMessageInterface();
			case ComponentPackage.PORT__PROVIDED_MESSAGE_INTERFACE:
				if (resolve) return getProvidedMessageInterface();
				return basicGetProvidedMessageInterface();
			case ComponentPackage.PORT__INCOMING_CONNECTORS:
				return getIncomingConnectors();
			case ComponentPackage.PORT__OUTGOING_CONNECTORS:
				return getOutgoingConnectors();
			case ComponentPackage.PORT__ADAPTATION_REALTIME_STATECHART:
				if (resolve) return getAdaptationRealtimeStatechart();
				return basicGetAdaptationRealtimeStatechart();
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
			case ComponentPackage.PORT__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case ComponentPackage.PORT__REQUIRED_MESSAGE_INTERFACE:
				setRequiredMessageInterface((MessageInterface)newValue);
				return;
			case ComponentPackage.PORT__PROVIDED_MESSAGE_INTERFACE:
				setProvidedMessageInterface((MessageInterface)newValue);
				return;
			case ComponentPackage.PORT__INCOMING_CONNECTORS:
				getIncomingConnectors().clear();
				getIncomingConnectors().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case ComponentPackage.PORT__OUTGOING_CONNECTORS:
				getOutgoingConnectors().clear();
				getOutgoingConnectors().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case ComponentPackage.PORT__ADAPTATION_REALTIME_STATECHART:
				setAdaptationRealtimeStatechart((AbstractRealtimeStatechart)newValue);
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
			case ComponentPackage.PORT__COMPONENT:
				setComponent((Component)null);
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
			case ComponentPackage.PORT__REQUIRED_MESSAGE_INTERFACE:
				setRequiredMessageInterface((MessageInterface)null);
				return;
			case ComponentPackage.PORT__PROVIDED_MESSAGE_INTERFACE:
				setProvidedMessageInterface((MessageInterface)null);
				return;
			case ComponentPackage.PORT__INCOMING_CONNECTORS:
				getIncomingConnectors().clear();
				return;
			case ComponentPackage.PORT__OUTGOING_CONNECTORS:
				getOutgoingConnectors().clear();
				return;
			case ComponentPackage.PORT__ADAPTATION_REALTIME_STATECHART:
				setAdaptationRealtimeStatechart((AbstractRealtimeStatechart)null);
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
			case ComponentPackage.PORT__COMPONENT:
				return getComponent() != null;
			case ComponentPackage.PORT__PORT_KIND:
				return portKind != PORT_KIND_EDEFAULT;
			case ComponentPackage.PORT__SPECIFICATION:
				return specification != null && !specification.isEmpty();
			case ComponentPackage.PORT__CARDINALITY:
				return cardinality != null;
			case ComponentPackage.PORT__REQUIRED_MESSAGE_INTERFACE:
				return REQUIRED_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.PORT__PROVIDED_MESSAGE_INTERFACE:
				return PROVIDED_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.PORT__INCOMING_CONNECTORS:
				return incomingConnectors != null && !incomingConnectors.isEmpty();
			case ComponentPackage.PORT__OUTGOING_CONNECTORS:
				return outgoingConnectors != null && !outgoingConnectors.isEmpty();
			case ComponentPackage.PORT__ADAPTATION_REALTIME_STATECHART:
				return ADAPTATION_REALTIME_STATECHART__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
