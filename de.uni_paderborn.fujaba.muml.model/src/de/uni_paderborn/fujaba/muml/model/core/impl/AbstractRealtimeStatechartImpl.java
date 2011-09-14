/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.core.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.core.Behavior;
import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Realtime Statechart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.impl.AbstractRealtimeStatechartImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.impl.AbstractRealtimeStatechartImpl#getBehavioralElement <em>Behavioral Element</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.impl.AbstractRealtimeStatechartImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.impl.AbstractRealtimeStatechartImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.impl.AbstractRealtimeStatechartImpl#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.impl.AbstractRealtimeStatechartImpl#getUtilisation <em>Utilisation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.impl.AbstractRealtimeStatechartImpl#getScheduleDocument <em>Schedule Document</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.impl.AbstractRealtimeStatechartImpl#isEmbedded <em>Embedded</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractRealtimeStatechartImpl extends NamedElementImpl implements AbstractRealtimeStatechart {
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
	 * The cached value of the '{@link #getBehavioralElement() <em>Behavioral Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavioralElement()
	 * @generated
	 * @ordered
	 */
	protected BehavioralElement behavioralElement;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<EOperation> operations;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> attributes;

	/**
	 * The default value of the '{@link #getSecurityLevel() <em>Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int SECURITY_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSecurityLevel() <em>Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected int securityLevel = SECURITY_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUtilisation() <em>Utilisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilisation()
	 * @generated
	 * @ordered
	 */
	protected static final double UTILISATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUtilisation() <em>Utilisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilisation()
	 * @generated
	 * @ordered
	 */
	protected double utilisation = UTILISATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduleDocument() <em>Schedule Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDocument()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULE_DOCUMENT_EDEFAULT = "\\\"schedule.xml\\\"";

	/**
	 * The cached value of the '{@link #getScheduleDocument() <em>Schedule Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDocument()
	 * @generated
	 * @ordered
	 */
	protected String scheduleDocument = SCHEDULE_DOCUMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isEmbedded() <em>Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbedded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMBEDDED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractRealtimeStatechartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ABSTRACT_REALTIME_STATECHART;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_REALTIME_STATECHART__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSecurityLevel() {
		return securityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityLevel(int newSecurityLevel) {
		int oldSecurityLevel = securityLevel;
		securityLevel = newSecurityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_REALTIME_STATECHART__SECURITY_LEVEL, oldSecurityLevel, securityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUtilisation() {
		return utilisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilisation(double newUtilisation) {
		double oldUtilisation = utilisation;
		utilisation = newUtilisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_REALTIME_STATECHART__UTILISATION, oldUtilisation, utilisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScheduleDocument() {
		return scheduleDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleDocument(String newScheduleDocument) {
		String oldScheduleDocument = scheduleDocument;
		scheduleDocument = newScheduleDocument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_REALTIME_STATECHART__SCHEDULE_DOCUMENT, oldScheduleDocument, scheduleDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralElement getBehavioralElement() {
		if (behavioralElement != null && behavioralElement.eIsProxy()) {
			InternalEObject oldBehavioralElement = (InternalEObject)behavioralElement;
			behavioralElement = (BehavioralElement)eResolveProxy(oldBehavioralElement);
			if (behavioralElement != oldBehavioralElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT, oldBehavioralElement, behavioralElement));
			}
		}
		return behavioralElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralElement basicGetBehavioralElement() {
		return behavioralElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehavioralElement(BehavioralElement newBehavioralElement, NotificationChain msgs) {
		BehavioralElement oldBehavioralElement = behavioralElement;
		behavioralElement = newBehavioralElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT, oldBehavioralElement, newBehavioralElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavioralElement(BehavioralElement newBehavioralElement) {
		if (newBehavioralElement != behavioralElement) {
			NotificationChain msgs = null;
			if (behavioralElement != null)
				msgs = ((InternalEObject)behavioralElement).eInverseRemove(this, CorePackage.BEHAVIORAL_ELEMENT__BEHAVIOR, BehavioralElement.class, msgs);
			if (newBehavioralElement != null)
				msgs = ((InternalEObject)newBehavioralElement).eInverseAdd(this, CorePackage.BEHAVIORAL_ELEMENT__BEHAVIOR, BehavioralElement.class, msgs);
			msgs = basicSetBehavioralElement(newBehavioralElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT, newBehavioralElement, newBehavioralElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<EOperation>(EOperation.class, this, CorePackage.ABSTRACT_REALTIME_STATECHART__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<EAttribute>(EAttribute.class, this, CorePackage.ABSTRACT_REALTIME_STATECHART__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEmbedded() {
		// TODO: implement this method to return the 'Embedded' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRealtimeStatechart getHighestParentStatechart() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT:
				if (behavioralElement != null)
					msgs = ((InternalEObject)behavioralElement).eInverseRemove(this, CorePackage.BEHAVIORAL_ELEMENT__BEHAVIOR, BehavioralElement.class, msgs);
				return basicSetBehavioralElement((BehavioralElement)otherEnd, msgs);
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
			case CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT:
				return basicSetBehavioralElement(null, msgs);
			case CorePackage.ABSTRACT_REALTIME_STATECHART__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case CorePackage.ABSTRACT_REALTIME_STATECHART__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case CorePackage.ABSTRACT_REALTIME_STATECHART__COMMENT:
				return getComment();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT:
				if (resolve) return getBehavioralElement();
				return basicGetBehavioralElement();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__OPERATIONS:
				return getOperations();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__ATTRIBUTES:
				return getAttributes();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__SECURITY_LEVEL:
				return getSecurityLevel();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__UTILISATION:
				return getUtilisation();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__SCHEDULE_DOCUMENT:
				return getScheduleDocument();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__EMBEDDED:
				return isEmbedded();
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
			case CorePackage.ABSTRACT_REALTIME_STATECHART__COMMENT:
				setComment((String)newValue);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT:
				setBehavioralElement((BehavioralElement)newValue);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends EOperation>)newValue);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends EAttribute>)newValue);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__SECURITY_LEVEL:
				setSecurityLevel((Integer)newValue);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__UTILISATION:
				setUtilisation((Double)newValue);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__SCHEDULE_DOCUMENT:
				setScheduleDocument((String)newValue);
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
			case CorePackage.ABSTRACT_REALTIME_STATECHART__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT:
				setBehavioralElement((BehavioralElement)null);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__OPERATIONS:
				getOperations().clear();
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__ATTRIBUTES:
				getAttributes().clear();
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__SECURITY_LEVEL:
				setSecurityLevel(SECURITY_LEVEL_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__UTILISATION:
				setUtilisation(UTILISATION_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__SCHEDULE_DOCUMENT:
				setScheduleDocument(SCHEDULE_DOCUMENT_EDEFAULT);
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
			case CorePackage.ABSTRACT_REALTIME_STATECHART__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT:
				return behavioralElement != null;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__SECURITY_LEVEL:
				return securityLevel != SECURITY_LEVEL_EDEFAULT;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__UTILISATION:
				return utilisation != UTILISATION_EDEFAULT;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__SCHEDULE_DOCUMENT:
				return SCHEDULE_DOCUMENT_EDEFAULT == null ? scheduleDocument != null : !SCHEDULE_DOCUMENT_EDEFAULT.equals(scheduleDocument);
			case CorePackage.ABSTRACT_REALTIME_STATECHART__EMBEDDED:
				return isEmbedded() != EMBEDDED_EDEFAULT;
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
				case CorePackage.ABSTRACT_REALTIME_STATECHART__COMMENT: return SDMPackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Behavior.class) {
			switch (derivedFeatureID) {
				case CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT: return CorePackage.BEHAVIOR__BEHAVIORAL_ELEMENT;
				case CorePackage.ABSTRACT_REALTIME_STATECHART__OPERATIONS: return CorePackage.BEHAVIOR__OPERATIONS;
				case CorePackage.ABSTRACT_REALTIME_STATECHART__ATTRIBUTES: return CorePackage.BEHAVIOR__ATTRIBUTES;
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
				case SDMPackage.COMMENTABLE_ELEMENT__COMMENT: return CorePackage.ABSTRACT_REALTIME_STATECHART__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Behavior.class) {
			switch (baseFeatureID) {
				case CorePackage.BEHAVIOR__BEHAVIORAL_ELEMENT: return CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT;
				case CorePackage.BEHAVIOR__OPERATIONS: return CorePackage.ABSTRACT_REALTIME_STATECHART__OPERATIONS;
				case CorePackage.BEHAVIOR__ATTRIBUTES: return CorePackage.ABSTRACT_REALTIME_STATECHART__ATTRIBUTES;
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
		result.append(", securityLevel: ");
		result.append(securityLevel);
		result.append(", utilisation: ");
		result.append(utilisation);
		result.append(", scheduleDocument: ");
		result.append(scheduleDocument);
		result.append(')');
		return result.toString();
	}

} //AbstractRealtimeStatechartImpl
