/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeCompositeState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.SDMPackage;

import org.storydriven.modeling.calls.Callable;

import org.storydriven.modeling.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronization Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.SynchronizationChannelImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.SynchronizationChannelImpl#getUMLRealtimeComplexState <em>UML Realtime Complex State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SynchronizationChannelImpl extends NamedElementImpl implements SynchronizationChannel {
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
	 * The cached value of the '{@link #getUMLRealtimeComplexState() <em>UML Realtime Complex State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLRealtimeComplexState()
	 * @generated
	 * @ordered
	 */
	protected UMLRealtimeCompositeState uMLRealtimeComplexState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronizationChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.SYNCHRONIZATION_CHANNEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeCompositeState getUMLRealtimeComplexState() {
		if (uMLRealtimeComplexState != null && uMLRealtimeComplexState.eIsProxy()) {
			InternalEObject oldUMLRealtimeComplexState = (InternalEObject)uMLRealtimeComplexState;
			uMLRealtimeComplexState = (UMLRealtimeCompositeState)eResolveProxy(oldUMLRealtimeComplexState);
			if (uMLRealtimeComplexState != oldUMLRealtimeComplexState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__UML_REALTIME_COMPLEX_STATE, oldUMLRealtimeComplexState, uMLRealtimeComplexState));
			}
		}
		return uMLRealtimeComplexState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeCompositeState basicGetUMLRealtimeComplexState() {
		return uMLRealtimeComplexState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUMLRealtimeComplexState(UMLRealtimeCompositeState newUMLRealtimeComplexState, NotificationChain msgs) {
		UMLRealtimeCompositeState oldUMLRealtimeComplexState = uMLRealtimeComplexState;
		uMLRealtimeComplexState = newUMLRealtimeComplexState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__UML_REALTIME_COMPLEX_STATE, oldUMLRealtimeComplexState, newUMLRealtimeComplexState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLRealtimeComplexState(UMLRealtimeCompositeState newUMLRealtimeComplexState) {
		if (newUMLRealtimeComplexState != uMLRealtimeComplexState) {
			NotificationChain msgs = null;
			if (uMLRealtimeComplexState != null)
				msgs = ((InternalEObject)uMLRealtimeComplexState).eInverseRemove(this, RealtimestatechartPackage.UML_REALTIME_COMPOSITE_STATE__CHANNELS, UMLRealtimeCompositeState.class, msgs);
			if (newUMLRealtimeComplexState != null)
				msgs = ((InternalEObject)newUMLRealtimeComplexState).eInverseAdd(this, RealtimestatechartPackage.UML_REALTIME_COMPOSITE_STATE__CHANNELS, UMLRealtimeCompositeState.class, msgs);
			msgs = basicSetUMLRealtimeComplexState(newUMLRealtimeComplexState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__UML_REALTIME_COMPLEX_STATE, newUMLRealtimeComplexState, newUMLRealtimeComplexState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject clone(UMLRealtimeStatechart rtsc, SynchronizationChannel newChannel) {
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__UML_REALTIME_COMPLEX_STATE:
				if (uMLRealtimeComplexState != null)
					msgs = ((InternalEObject)uMLRealtimeComplexState).eInverseRemove(this, RealtimestatechartPackage.UML_REALTIME_COMPOSITE_STATE__CHANNELS, UMLRealtimeCompositeState.class, msgs);
				return basicSetUMLRealtimeComplexState((UMLRealtimeCompositeState)otherEnd, msgs);
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__UML_REALTIME_COMPLEX_STATE:
				return basicSetUMLRealtimeComplexState(null, msgs);
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__COMMENT:
				return getComment();
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__UML_REALTIME_COMPLEX_STATE:
				if (resolve) return getUMLRealtimeComplexState();
				return basicGetUMLRealtimeComplexState();
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__COMMENT:
				setComment((String)newValue);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__UML_REALTIME_COMPLEX_STATE:
				setUMLRealtimeComplexState((UMLRealtimeCompositeState)newValue);
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__UML_REALTIME_COMPLEX_STATE:
				setUMLRealtimeComplexState((UMLRealtimeCompositeState)null);
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__UML_REALTIME_COMPLEX_STATE:
				return uMLRealtimeComplexState != null;
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
				case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__COMMENT: return SDMPackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Callable.class) {
			switch (derivedFeatureID) {
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
				case SDMPackage.COMMENTABLE_ELEMENT__COMMENT: return RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Callable.class) {
			switch (baseFeatureID) {
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL___CLONE__UMLREALTIMESTATECHART_SYNCHRONIZATIONCHANNEL:
				return clone((UMLRealtimeStatechart)arguments.get(0), (SynchronizationChannel)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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

	@Override
	public EList<EParameter> getInParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<EParameter> getOutParameters() {
		// TODO Auto-generated method stub
		return null;
	}

} //SynchronizationChannelImpl
