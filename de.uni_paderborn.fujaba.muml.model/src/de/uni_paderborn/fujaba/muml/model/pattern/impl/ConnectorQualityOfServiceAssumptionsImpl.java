/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.pattern.impl;

import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;

import de.uni_paderborn.fujaba.muml.model.pattern.ConnectorQualityOfServiceAssumptions;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.CorePackage;

import org.storydriven.core.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Quality Of Service Assumptions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.ConnectorQualityOfServiceAssumptionsImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.ConnectorQualityOfServiceAssumptionsImpl#getMinMessageDelay <em>Min Message Delay</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.ConnectorQualityOfServiceAssumptionsImpl#getMaxMessageDelay <em>Max Message Delay</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.ConnectorQualityOfServiceAssumptionsImpl#isMessageLossPossible <em>Message Loss Possible</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorQualityOfServiceAssumptionsImpl extends NamedElementImpl implements ConnectorQualityOfServiceAssumptions {
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
	 * The cached value of the '{@link #getMinMessageDelay() <em>Min Message Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinMessageDelay()
	 * @generated
	 * @ordered
	 */
	protected NaturalNumber minMessageDelay;

	/**
	 * The cached value of the '{@link #getMaxMessageDelay() <em>Max Message Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMessageDelay()
	 * @generated
	 * @ordered
	 */
	protected NaturalNumber maxMessageDelay;

	/**
	 * The default value of the '{@link #isMessageLossPossible() <em>Message Loss Possible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMessageLossPossible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MESSAGE_LOSS_POSSIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMessageLossPossible() <em>Message Loss Possible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMessageLossPossible()
	 * @generated
	 * @ordered
	 */
	protected boolean messageLossPossible = MESSAGE_LOSS_POSSIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorQualityOfServiceAssumptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalNumber getMinMessageDelay() {
		return minMessageDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinMessageDelay(NaturalNumber newMinMessageDelay, NotificationChain msgs) {
		NaturalNumber oldMinMessageDelay = minMessageDelay;
		minMessageDelay = newMinMessageDelay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MIN_MESSAGE_DELAY, oldMinMessageDelay, newMinMessageDelay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinMessageDelay(NaturalNumber newMinMessageDelay) {
		if (newMinMessageDelay != minMessageDelay) {
			NotificationChain msgs = null;
			if (minMessageDelay != null)
				msgs = ((InternalEObject)minMessageDelay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MIN_MESSAGE_DELAY, null, msgs);
			if (newMinMessageDelay != null)
				msgs = ((InternalEObject)newMinMessageDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MIN_MESSAGE_DELAY, null, msgs);
			msgs = basicSetMinMessageDelay(newMinMessageDelay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MIN_MESSAGE_DELAY, newMinMessageDelay, newMinMessageDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalNumber getMaxMessageDelay() {
		return maxMessageDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxMessageDelay(NaturalNumber newMaxMessageDelay, NotificationChain msgs) {
		NaturalNumber oldMaxMessageDelay = maxMessageDelay;
		maxMessageDelay = newMaxMessageDelay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY, oldMaxMessageDelay, newMaxMessageDelay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxMessageDelay(NaturalNumber newMaxMessageDelay) {
		if (newMaxMessageDelay != maxMessageDelay) {
			NotificationChain msgs = null;
			if (maxMessageDelay != null)
				msgs = ((InternalEObject)maxMessageDelay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY, null, msgs);
			if (newMaxMessageDelay != null)
				msgs = ((InternalEObject)newMaxMessageDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY, null, msgs);
			msgs = basicSetMaxMessageDelay(newMaxMessageDelay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY, newMaxMessageDelay, newMaxMessageDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMessageLossPossible() {
		return messageLossPossible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageLossPossible(boolean newMessageLossPossible) {
		boolean oldMessageLossPossible = messageLossPossible;
		messageLossPossible = newMessageLossPossible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE, oldMessageLossPossible, messageLossPossible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MIN_MESSAGE_DELAY:
				return basicSetMinMessageDelay(null, msgs);
			case PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY:
				return basicSetMaxMessageDelay(null, msgs);
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
			case PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__COMMENT:
				return getComment();
			case PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MIN_MESSAGE_DELAY:
				return getMinMessageDelay();
			case PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY:
				return getMaxMessageDelay();
			case PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE:
				return isMessageLossPossible();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__COMMENT:
				setComment((String)newValue);
				return;
			case PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MIN_MESSAGE_DELAY:
				setMinMessageDelay((NaturalNumber)newValue);
				return;
			case PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY:
				setMaxMessageDelay((NaturalNumber)newValue);
				return;
			case PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE:
				setMessageLossPossible((Boolean)newValue);
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
			case PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MIN_MESSAGE_DELAY:
				setMinMessageDelay((NaturalNumber)null);
				return;
			case PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY:
				setMaxMessageDelay((NaturalNumber)null);
				return;
			case PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE:
				setMessageLossPossible(MESSAGE_LOSS_POSSIBLE_EDEFAULT);
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
			case PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MIN_MESSAGE_DELAY:
				return minMessageDelay != null;
			case PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY:
				return maxMessageDelay != null;
			case PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE:
				return messageLossPossible != MESSAGE_LOSS_POSSIBLE_EDEFAULT;
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
				case PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
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
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__COMMENT;
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
		result.append(", messageLossPossible: ");
		result.append(messageLossPossible);
		result.append(')');
		return result.toString();
	}

} //ConnectorQualityOfServiceAssumptionsImpl
