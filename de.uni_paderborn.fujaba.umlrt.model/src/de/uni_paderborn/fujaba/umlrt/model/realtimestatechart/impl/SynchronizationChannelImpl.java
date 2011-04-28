/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.calls.Callable;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.umlrt.model.adapter.DerivedAttributeAdapter;
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
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.SynchronizationChannelImpl#getContainedParameters <em>Contained Parameters</em>}</li>
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
	 * The cached value of the '{@link #getContainedParameters() <em>Contained Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<EParameter> containedParameters;

	/**
	 * The cached setting delegate for the '{@link #getSynchroChannelExpr() <em>Synchro Channel Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchroChannelExpr()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SYNCHRO_CHANNEL_EXPR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.SYNCHRONIZATION_CHANNEL__SYNCHRO_CHANNEL_EXPR).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SynchronizationChannelImpl() {
		super();
		
		// Install a notification adapter that informs the
		// clockConstraintExpr-reference, whenever one of the dependent features
		// was modified
		DerivedAttributeAdapter clockConstraintExprAdapter = new DerivedAttributeAdapter(this, RealtimestatechartPackage.Literals.SYNCHRONIZATION_CHANNEL__SYNCHRO_CHANNEL_EXPR, Notification.SET);
		clockConstraintExprAdapter.addLocalDependency(SDMPackage.Literals.NAMED_ELEMENT__NAME);

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
		return (String)SYNCHRO_CHANNEL_EXPR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchroChannelExpr(String newSynchroChannelExpr) {
		SYNCHRO_CHANNEL_EXPR__ESETTING_DELEGATE.dynamicSet(this, null, 0, newSynchroChannelExpr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSynchroChannelExpr() {
		SYNCHRO_CHANNEL_EXPR__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSynchroChannelExpr() {
		return SYNCHRO_CHANNEL_EXPR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toMyString() {
				String value ="";
				boolean firstTime = true;
				if(name!=null) {
				value = name ;
					if(containedParameters!=null){
						value = value+"(";
						java.util.Iterator<EParameter> iter = containedParameters.iterator();
						while(iter.hasNext()){
							EParameter tmp = iter.next();
							if(firstTime){
								firstTime=false;
								value = value + tmp.getName() + ":" + tmp.getEType().getInstanceClassName() +"_"+ tmp.getEType().getInstanceTypeName();
							}else{
								value = value +", "+ tmp.getName() + ":" + tmp.getEType().getInstanceClassName() +"_"+ tmp.getEType().getInstanceTypeName();
							}
							
						}
					}else{
						value = value+"()";
					}
				}
				return value;
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__CONTAINED_PARAMETERS:
				return ((InternalEList<?>)getContainedParameters()).basicRemove(otherEnd, msgs);
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__CONTAINED_PARAMETERS:
				return getContainedParameters();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__COMMENT:
				setComment((String)newValue);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__CONTAINED_PARAMETERS:
				getContainedParameters().clear();
				getContainedParameters().addAll((Collection<? extends EParameter>)newValue);
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__CONTAINED_PARAMETERS:
				getContainedParameters().clear();
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__STATE:
				setState((State)null);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__SYNCHRO_CHANNEL_EXPR:
				unsetSynchroChannelExpr();
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__CONTAINED_PARAMETERS:
				return containedParameters != null && !containedParameters.isEmpty();
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__STATE:
				return getState() != null;
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__SYNCHRO_CHANNEL_EXPR:
				return isSetSynchroChannelExpr();
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
				case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__CONTAINED_PARAMETERS: return CallsPackage.CALLABLE__CONTAINED_PARAMETERS;
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
				case CallsPackage.CALLABLE__CONTAINED_PARAMETERS: return RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__CONTAINED_PARAMETERS;
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL___TO_MY_STRING:
				return toMyString();
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

	@Override
	public EList<EParameter> getContainedParameters() {
		// TODO Auto-generated method stub
		return null;
	}

} //SynchronizationChannelImpl
