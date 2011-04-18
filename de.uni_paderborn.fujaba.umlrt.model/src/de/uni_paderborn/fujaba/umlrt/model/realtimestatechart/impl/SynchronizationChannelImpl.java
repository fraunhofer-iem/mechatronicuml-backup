/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.calls.Callable;
import org.storydriven.modeling.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronization Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.SynchronizationChannelImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.SynchronizationChannelImpl#getState <em>State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.SynchronizationChannelImpl#getSynchroChannelExpr <em>Synchro Channel Expr</em>}</li>
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
	 * The default value of the '{@link #getSynchroChannelExpr() <em>Synchro Channel Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchroChannelExpr()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNCHRO_CHANNEL_EXPR_EDEFAULT = "synchroChannelExpr";

	/**
	 * The cached value of the '{@link #getSynchroChannelExpr() <em>Synchro Channel Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchroChannelExpr()
	 * @generated
	 * @ordered
	 */
	protected String synchroChannelExpr = SYNCHRO_CHANNEL_EXPR_EDEFAULT;

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
	public State getState() {
		if (eContainerFeatureID() != RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__STATE) return null;
		return (State)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(State newState, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newState, RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		if (newState != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__STATE && newState != null)) {
			if (EcoreUtil.isAncestor(this, newState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, RealtimestatechartPackage.STATE__CHANNELS, State.class, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__STATE, newState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSynchroChannelExpr() {
		return synchroChannelExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchroChannelExpr(String newSynchroChannelExpr) {
		String oldSynchroChannelExpr = synchroChannelExpr;
		synchroChannelExpr = newSynchroChannelExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__SYNCHRO_CHANNEL_EXPR, oldSynchroChannelExpr, synchroChannelExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__STATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetState((State)otherEnd, msgs);
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__STATE:
				return basicSetState(null, msgs);
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__STATE:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.STATE__CHANNELS, State.class, msgs);
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__COMMENT:
				return getComment();
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__STATE:
				return getState();
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__SYNCHRO_CHANNEL_EXPR:
				return getSynchroChannelExpr();
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__STATE:
				setState((State)newValue);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__SYNCHRO_CHANNEL_EXPR:
				setSynchroChannelExpr((String)newValue);
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__STATE:
				setState((State)null);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__SYNCHRO_CHANNEL_EXPR:
				setSynchroChannelExpr(SYNCHRO_CHANNEL_EXPR_EDEFAULT);
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__STATE:
				return getState() != null;
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__SYNCHRO_CHANNEL_EXPR:
				return SYNCHRO_CHANNEL_EXPR_EDEFAULT == null ? synchroChannelExpr != null : !SYNCHRO_CHANNEL_EXPR_EDEFAULT.equals(synchroChannelExpr);
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (comment: ");
		result.append(comment);
		result.append(", synchroChannelExpr: ");
		result.append(synchroChannelExpr);
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
