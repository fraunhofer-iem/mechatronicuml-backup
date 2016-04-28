/**
 */
package org.muml.pim.connector.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.CommentableElement;
import org.muml.core.CorePackage;
import org.muml.core.common.adapter.DerivedAttributeAdapter;
import org.muml.core.impl.NamedElementImpl;
import org.muml.pim.connector.BufferOverflowAvoidanceStrategy;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.connector.MessageBuffer;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.valuetype.NaturalNumber;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Buffer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.connector.impl.MessageBufferImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.muml.pim.connector.impl.MessageBufferImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.muml.pim.connector.impl.MessageBufferImpl#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link org.muml.pim.connector.impl.MessageBufferImpl#getDiscreteInteractionEndpoint <em>Discrete Interaction Endpoint</em>}</li>
 *   <li>{@link org.muml.pim.connector.impl.MessageBufferImpl#getBufferOverflowAvoidanceStrategy <em>Buffer Overflow Avoidance Strategy</em>}</li>
 *   <li>{@link org.muml.pim.connector.impl.MessageBufferImpl#getGmfMessageTypes <em>Gmf Message Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageBufferImpl extends NamedElementImpl implements MessageBuffer {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = "\"no comment provided\"";

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
	 * The cached value of the '{@link #getBufferSize() <em>Buffer Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected NaturalNumber bufferSize;

	/**
	 * The cached value of the '{@link #getMessageType() <em>Message Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageType> messageType;

	/**
	 * The default value of the '{@link #getBufferOverflowAvoidanceStrategy() <em>Buffer Overflow Avoidance Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferOverflowAvoidanceStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final BufferOverflowAvoidanceStrategy BUFFER_OVERFLOW_AVOIDANCE_STRATEGY_EDEFAULT = BufferOverflowAvoidanceStrategy.DISCARD_INCOMING_MESSAGE;

	/**
	 * The cached value of the '{@link #getBufferOverflowAvoidanceStrategy() <em>Buffer Overflow Avoidance Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferOverflowAvoidanceStrategy()
	 * @generated
	 * @ordered
	 */
	protected BufferOverflowAvoidanceStrategy bufferOverflowAvoidanceStrategy = BUFFER_OVERFLOW_AVOIDANCE_STRATEGY_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getGmfMessageTypes() <em>Gmf Message Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmfMessageTypes()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GMF_MESSAGE_TYPES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ConnectorPackage.Literals.MESSAGE_BUFFER__GMF_MESSAGE_TYPES).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not 
	 */
	protected MessageBufferImpl() {
		super();
		DerivedAttributeAdapter adapter = new DerivedAttributeAdapter(this, ConnectorPackage.Literals.MESSAGE_BUFFER__GMF_MESSAGE_TYPES);
		adapter.addLocalDependency(ConnectorPackage.Literals.MESSAGE_BUFFER__MESSAGE_TYPE);
	
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConnectorPackage.Literals.MESSAGE_BUFFER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectorPackage.MESSAGE_BUFFER__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalNumber getBufferSize() {
		return bufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBufferSize(NaturalNumber newBufferSize, NotificationChain msgs) {
		NaturalNumber oldBufferSize = bufferSize;
		bufferSize = newBufferSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConnectorPackage.MESSAGE_BUFFER__BUFFER_SIZE, oldBufferSize, newBufferSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBufferSize(NaturalNumber newBufferSize) {
		if (newBufferSize != bufferSize) {
			NotificationChain msgs = null;
			if (bufferSize != null)
				msgs = ((InternalEObject)bufferSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConnectorPackage.MESSAGE_BUFFER__BUFFER_SIZE, null, msgs);
			if (newBufferSize != null)
				msgs = ((InternalEObject)newBufferSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConnectorPackage.MESSAGE_BUFFER__BUFFER_SIZE, null, msgs);
			msgs = basicSetBufferSize(newBufferSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectorPackage.MESSAGE_BUFFER__BUFFER_SIZE, newBufferSize, newBufferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageType> getMessageType() {
		if (messageType == null) {
			messageType = new EObjectResolvingEList<MessageType>(MessageType.class, this, ConnectorPackage.MESSAGE_BUFFER__MESSAGE_TYPE);
		}
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteInteractionEndpoint getDiscreteInteractionEndpoint() {
		if (eContainerFeatureID() != ConnectorPackage.MESSAGE_BUFFER__DISCRETE_INTERACTION_ENDPOINT) return null;
		return (DiscreteInteractionEndpoint)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscreteInteractionEndpoint(DiscreteInteractionEndpoint newDiscreteInteractionEndpoint, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDiscreteInteractionEndpoint, ConnectorPackage.MESSAGE_BUFFER__DISCRETE_INTERACTION_ENDPOINT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscreteInteractionEndpoint(DiscreteInteractionEndpoint newDiscreteInteractionEndpoint) {
		if (newDiscreteInteractionEndpoint != eInternalContainer() || (eContainerFeatureID() != ConnectorPackage.MESSAGE_BUFFER__DISCRETE_INTERACTION_ENDPOINT && newDiscreteInteractionEndpoint != null)) {
			if (EcoreUtil.isAncestor(this, newDiscreteInteractionEndpoint))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiscreteInteractionEndpoint != null)
				msgs = ((InternalEObject)newDiscreteInteractionEndpoint).eInverseAdd(this, ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER, DiscreteInteractionEndpoint.class, msgs);
			msgs = basicSetDiscreteInteractionEndpoint(newDiscreteInteractionEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectorPackage.MESSAGE_BUFFER__DISCRETE_INTERACTION_ENDPOINT, newDiscreteInteractionEndpoint, newDiscreteInteractionEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferOverflowAvoidanceStrategy getBufferOverflowAvoidanceStrategy() {
		return bufferOverflowAvoidanceStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBufferOverflowAvoidanceStrategy(BufferOverflowAvoidanceStrategy newBufferOverflowAvoidanceStrategy) {
		BufferOverflowAvoidanceStrategy oldBufferOverflowAvoidanceStrategy = bufferOverflowAvoidanceStrategy;
		bufferOverflowAvoidanceStrategy = newBufferOverflowAvoidanceStrategy == null ? BUFFER_OVERFLOW_AVOIDANCE_STRATEGY_EDEFAULT : newBufferOverflowAvoidanceStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectorPackage.MESSAGE_BUFFER__BUFFER_OVERFLOW_AVOIDANCE_STRATEGY, oldBufferOverflowAvoidanceStrategy, bufferOverflowAvoidanceStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MessageType> getGmfMessageTypes() {
		return (EList<MessageType>)GMF_MESSAGE_TYPES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConnectorPackage.MESSAGE_BUFFER__DISCRETE_INTERACTION_ENDPOINT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiscreteInteractionEndpoint((DiscreteInteractionEndpoint)otherEnd, msgs);
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
			case ConnectorPackage.MESSAGE_BUFFER__BUFFER_SIZE:
				return basicSetBufferSize(null, msgs);
			case ConnectorPackage.MESSAGE_BUFFER__DISCRETE_INTERACTION_ENDPOINT:
				return basicSetDiscreteInteractionEndpoint(null, msgs);
			case ConnectorPackage.MESSAGE_BUFFER__GMF_MESSAGE_TYPES:
				return ((InternalEList<?>)getGmfMessageTypes()).basicRemove(otherEnd, msgs);
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
			case ConnectorPackage.MESSAGE_BUFFER__DISCRETE_INTERACTION_ENDPOINT:
				return eInternalContainer().eInverseRemove(this, ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER, DiscreteInteractionEndpoint.class, msgs);
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
			case ConnectorPackage.MESSAGE_BUFFER__COMMENT:
				return getComment();
			case ConnectorPackage.MESSAGE_BUFFER__BUFFER_SIZE:
				return getBufferSize();
			case ConnectorPackage.MESSAGE_BUFFER__MESSAGE_TYPE:
				return getMessageType();
			case ConnectorPackage.MESSAGE_BUFFER__DISCRETE_INTERACTION_ENDPOINT:
				return getDiscreteInteractionEndpoint();
			case ConnectorPackage.MESSAGE_BUFFER__BUFFER_OVERFLOW_AVOIDANCE_STRATEGY:
				return getBufferOverflowAvoidanceStrategy();
			case ConnectorPackage.MESSAGE_BUFFER__GMF_MESSAGE_TYPES:
				return getGmfMessageTypes();
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
			case ConnectorPackage.MESSAGE_BUFFER__COMMENT:
				setComment((String)newValue);
				return;
			case ConnectorPackage.MESSAGE_BUFFER__BUFFER_SIZE:
				setBufferSize((NaturalNumber)newValue);
				return;
			case ConnectorPackage.MESSAGE_BUFFER__MESSAGE_TYPE:
				getMessageType().clear();
				getMessageType().addAll((Collection<? extends MessageType>)newValue);
				return;
			case ConnectorPackage.MESSAGE_BUFFER__DISCRETE_INTERACTION_ENDPOINT:
				setDiscreteInteractionEndpoint((DiscreteInteractionEndpoint)newValue);
				return;
			case ConnectorPackage.MESSAGE_BUFFER__BUFFER_OVERFLOW_AVOIDANCE_STRATEGY:
				setBufferOverflowAvoidanceStrategy((BufferOverflowAvoidanceStrategy)newValue);
				return;
			case ConnectorPackage.MESSAGE_BUFFER__GMF_MESSAGE_TYPES:
				getGmfMessageTypes().clear();
				getGmfMessageTypes().addAll((Collection<? extends MessageType>)newValue);
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
			case ConnectorPackage.MESSAGE_BUFFER__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ConnectorPackage.MESSAGE_BUFFER__BUFFER_SIZE:
				setBufferSize((NaturalNumber)null);
				return;
			case ConnectorPackage.MESSAGE_BUFFER__MESSAGE_TYPE:
				getMessageType().clear();
				return;
			case ConnectorPackage.MESSAGE_BUFFER__DISCRETE_INTERACTION_ENDPOINT:
				setDiscreteInteractionEndpoint((DiscreteInteractionEndpoint)null);
				return;
			case ConnectorPackage.MESSAGE_BUFFER__BUFFER_OVERFLOW_AVOIDANCE_STRATEGY:
				setBufferOverflowAvoidanceStrategy(BUFFER_OVERFLOW_AVOIDANCE_STRATEGY_EDEFAULT);
				return;
			case ConnectorPackage.MESSAGE_BUFFER__GMF_MESSAGE_TYPES:
				getGmfMessageTypes().clear();
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
			case ConnectorPackage.MESSAGE_BUFFER__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ConnectorPackage.MESSAGE_BUFFER__BUFFER_SIZE:
				return bufferSize != null;
			case ConnectorPackage.MESSAGE_BUFFER__MESSAGE_TYPE:
				return messageType != null && !messageType.isEmpty();
			case ConnectorPackage.MESSAGE_BUFFER__DISCRETE_INTERACTION_ENDPOINT:
				return getDiscreteInteractionEndpoint() != null;
			case ConnectorPackage.MESSAGE_BUFFER__BUFFER_OVERFLOW_AVOIDANCE_STRATEGY:
				return bufferOverflowAvoidanceStrategy != BUFFER_OVERFLOW_AVOIDANCE_STRATEGY_EDEFAULT;
			case ConnectorPackage.MESSAGE_BUFFER__GMF_MESSAGE_TYPES:
				return GMF_MESSAGE_TYPES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
				case ConnectorPackage.MESSAGE_BUFFER__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
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
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return ConnectorPackage.MESSAGE_BUFFER__COMMENT;
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
		result.append(", bufferOverflowAvoidanceStrategy: ");
		result.append(bufferOverflowAvoidanceStrategy);
		result.append(')');
		return result.toString();
	}

} //MessageBufferImpl
