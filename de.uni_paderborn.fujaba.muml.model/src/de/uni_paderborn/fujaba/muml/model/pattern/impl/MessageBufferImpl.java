/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.pattern.impl;

import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;

import de.uni_paderborn.fujaba.muml.model.msgiface.MessageType;

import de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.CorePackage;

import org.storydriven.core.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Buffer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.MessageBufferImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.MessageBufferImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.MessageBufferImpl#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.MessageBufferImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageBufferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.MESSAGE_BUFFER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.MESSAGE_BUFFER__COMMENT, oldComment, comment));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.MESSAGE_BUFFER__BUFFER_SIZE, oldBufferSize, newBufferSize);
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
				msgs = ((InternalEObject)bufferSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.MESSAGE_BUFFER__BUFFER_SIZE, null, msgs);
			if (newBufferSize != null)
				msgs = ((InternalEObject)newBufferSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.MESSAGE_BUFFER__BUFFER_SIZE, null, msgs);
			msgs = basicSetBufferSize(newBufferSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.MESSAGE_BUFFER__BUFFER_SIZE, newBufferSize, newBufferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageType> getMessageType() {
		if (messageType == null) {
			messageType = new EObjectResolvingEList<MessageType>(MessageType.class, this, PatternPackage.MESSAGE_BUFFER__MESSAGE_TYPE);
		}
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		if (eContainerFeatureID() != PatternPackage.MESSAGE_BUFFER__ROLE) return null;
		return (Role)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(Role newRole, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRole, PatternPackage.MESSAGE_BUFFER__ROLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		if (newRole != eInternalContainer() || (eContainerFeatureID() != PatternPackage.MESSAGE_BUFFER__ROLE && newRole != null)) {
			if (EcoreUtil.isAncestor(this, newRole))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, PatternPackage.ROLE__RECEIVER_MESSAGE_BUFFER, Role.class, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.MESSAGE_BUFFER__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternPackage.MESSAGE_BUFFER__ROLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRole((Role)otherEnd, msgs);
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
			case PatternPackage.MESSAGE_BUFFER__BUFFER_SIZE:
				return basicSetBufferSize(null, msgs);
			case PatternPackage.MESSAGE_BUFFER__ROLE:
				return basicSetRole(null, msgs);
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
			case PatternPackage.MESSAGE_BUFFER__ROLE:
				return eInternalContainer().eInverseRemove(this, PatternPackage.ROLE__RECEIVER_MESSAGE_BUFFER, Role.class, msgs);
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
			case PatternPackage.MESSAGE_BUFFER__COMMENT:
				return getComment();
			case PatternPackage.MESSAGE_BUFFER__BUFFER_SIZE:
				return getBufferSize();
			case PatternPackage.MESSAGE_BUFFER__MESSAGE_TYPE:
				return getMessageType();
			case PatternPackage.MESSAGE_BUFFER__ROLE:
				return getRole();
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
			case PatternPackage.MESSAGE_BUFFER__COMMENT:
				setComment((String)newValue);
				return;
			case PatternPackage.MESSAGE_BUFFER__BUFFER_SIZE:
				setBufferSize((NaturalNumber)newValue);
				return;
			case PatternPackage.MESSAGE_BUFFER__MESSAGE_TYPE:
				getMessageType().clear();
				getMessageType().addAll((Collection<? extends MessageType>)newValue);
				return;
			case PatternPackage.MESSAGE_BUFFER__ROLE:
				setRole((Role)newValue);
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
			case PatternPackage.MESSAGE_BUFFER__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case PatternPackage.MESSAGE_BUFFER__BUFFER_SIZE:
				setBufferSize((NaturalNumber)null);
				return;
			case PatternPackage.MESSAGE_BUFFER__MESSAGE_TYPE:
				getMessageType().clear();
				return;
			case PatternPackage.MESSAGE_BUFFER__ROLE:
				setRole((Role)null);
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
			case PatternPackage.MESSAGE_BUFFER__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case PatternPackage.MESSAGE_BUFFER__BUFFER_SIZE:
				return bufferSize != null;
			case PatternPackage.MESSAGE_BUFFER__MESSAGE_TYPE:
				return messageType != null && !messageType.isEmpty();
			case PatternPackage.MESSAGE_BUFFER__ROLE:
				return getRole() != null;
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
				case PatternPackage.MESSAGE_BUFFER__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
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
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return PatternPackage.MESSAGE_BUFFER__COMMENT;
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

} //MessageBufferImpl
