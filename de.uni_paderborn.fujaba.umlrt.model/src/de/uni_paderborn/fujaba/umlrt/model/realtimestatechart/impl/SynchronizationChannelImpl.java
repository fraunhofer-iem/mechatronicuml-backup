/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.umlrt.model.pattern.Role;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.impl.CallableImpl;

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
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.SynchronizationChannelImpl#getState <em>State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.SynchronizationChannelImpl#getSynchroChannelExpr <em>Synchro Channel Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.SynchronizationChannelImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.SynchronizationChannelImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SynchronizationChannelImpl extends CallableImpl implements SynchronizationChannel {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SynchronizationChannelImpl() {
		super();
		
		DerivedAttributeAdapter clockConstraintExprAdapter1 = new DerivedAttributeAdapter(this, RealtimestatechartPackage.Literals.SYNCHRONIZATION_CHANNEL__SYNCHRO_CHANNEL_EXPR, false);
		clockConstraintExprAdapter1.addLocalDependency(RealtimestatechartPackage.Literals.SYNCHRONIZATION_CHANNEL__NAME);

		DerivedAttributeAdapter clockConstraintExprAdapter2 = new DerivedAttributeAdapter(this, RealtimestatechartPackage.Literals.SYNCHRONIZATION_CHANNEL__SYNCHRO_CHANNEL_EXPR, false);
		clockConstraintExprAdapter2.addLocalDependency(CallsPackage.Literals.CALLABLE__CONTAINED_PARAMETERS);
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
	public boolean isSetSynchroChannelExpr() {
		return SYNCHRO_CHANNEL_EXPR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		if (eContainerFeatureID() != RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__ROLE) return null;
		return (Role)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(Role newRole, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRole, RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__ROLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		if (newRole != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__ROLE && newRole != null)) {
			if (EcoreUtil.isAncestor(this, newRole))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, PatternPackage.ROLE__CHANNELS, Role.class, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toMyString() {
		String value ="null";
		boolean firstTime = true;
		if(name!=null) {
		value = name ;
		if(containedParameters!=null){
			value = value+"(";
			java.util.Iterator<EParameter> iter = containedParameters.iterator();
			while(iter.hasNext()){
				EParameter tmp = iter.next();
				if(tmp.getName()!=null && tmp.getEType()!=null && 
					tmp.getEType().getInstanceTypeName()!=null){				
						if(firstTime){
							firstTime=false;
							value = value + tmp.getName() + ":" + tmp.getEType().getName();
						}else{
							value = value +", "+ tmp.getName() + ":" + tmp.getEType().getName() ;
						}	
					}
				}
			value = value + ")";
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__ROLE:
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__STATE:
				return basicSetState(null, msgs);
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__ROLE:
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__STATE:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.STATE__CHANNELS, State.class, msgs);
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__ROLE:
				return eInternalContainer().eInverseRemove(this, PatternPackage.ROLE__CHANNELS, Role.class, msgs);
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__STATE:
				return getState();
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__SYNCHRO_CHANNEL_EXPR:
				return getSynchroChannelExpr();
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__NAME:
				return getName();
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__ROLE:
				return getRole();
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__STATE:
				setState((State)newValue);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__NAME:
				setName((String)newValue);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__ROLE:
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__STATE:
				setState((State)null);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__ROLE:
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
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__STATE:
				return getState() != null;
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__SYNCHRO_CHANNEL_EXPR:
				return isSetSynchroChannelExpr();
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__ROLE:
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
		result.append(" (name: ");
		result.append(name);
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
