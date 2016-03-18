/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.behavior.Parameter;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule;
import de.uni_paderborn.fujaba.muml.reconfiguration.Signature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.SignatureImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.SignatureImpl#getReturnParameters <em>Return Parameters</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.SignatureImpl#getReconfigurationRule <em>Reconfiguration Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignatureImpl extends NamedElementImpl implements Signature {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getReturnParameters() <em>Return Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> returnParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, ReconfigurationPackage.SIGNATURE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getReturnParameters() {
		if (returnParameters == null) {
			returnParameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, ReconfigurationPackage.SIGNATURE__RETURN_PARAMETERS);
		}
		return returnParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationRule getReconfigurationRule() {
		if (eContainerFeatureID() != ReconfigurationPackage.SIGNATURE__RECONFIGURATION_RULE) return null;
		return (ReconfigurationRule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReconfigurationRule(ReconfigurationRule newReconfigurationRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReconfigurationRule, ReconfigurationPackage.SIGNATURE__RECONFIGURATION_RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconfigurationRule(ReconfigurationRule newReconfigurationRule) {
		if (newReconfigurationRule != eInternalContainer() || (eContainerFeatureID() != ReconfigurationPackage.SIGNATURE__RECONFIGURATION_RULE && newReconfigurationRule != null)) {
			if (EcoreUtil.isAncestor(this, newReconfigurationRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReconfigurationRule != null)
				msgs = ((InternalEObject)newReconfigurationRule).eInverseAdd(this, ReconfigurationPackage.RECONFIGURATION_RULE__SIGNATURE, ReconfigurationRule.class, msgs);
			msgs = basicSetReconfigurationRule(newReconfigurationRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.SIGNATURE__RECONFIGURATION_RULE, newReconfigurationRule, newReconfigurationRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReconfigurationPackage.SIGNATURE__RECONFIGURATION_RULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReconfigurationRule((ReconfigurationRule)otherEnd, msgs);
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
			case ReconfigurationPackage.SIGNATURE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ReconfigurationPackage.SIGNATURE__RETURN_PARAMETERS:
				return ((InternalEList<?>)getReturnParameters()).basicRemove(otherEnd, msgs);
			case ReconfigurationPackage.SIGNATURE__RECONFIGURATION_RULE:
				return basicSetReconfigurationRule(null, msgs);
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
			case ReconfigurationPackage.SIGNATURE__RECONFIGURATION_RULE:
				return eInternalContainer().eInverseRemove(this, ReconfigurationPackage.RECONFIGURATION_RULE__SIGNATURE, ReconfigurationRule.class, msgs);
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
			case ReconfigurationPackage.SIGNATURE__PARAMETERS:
				return getParameters();
			case ReconfigurationPackage.SIGNATURE__RETURN_PARAMETERS:
				return getReturnParameters();
			case ReconfigurationPackage.SIGNATURE__RECONFIGURATION_RULE:
				return getReconfigurationRule();
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
			case ReconfigurationPackage.SIGNATURE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ReconfigurationPackage.SIGNATURE__RETURN_PARAMETERS:
				getReturnParameters().clear();
				getReturnParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ReconfigurationPackage.SIGNATURE__RECONFIGURATION_RULE:
				setReconfigurationRule((ReconfigurationRule)newValue);
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
			case ReconfigurationPackage.SIGNATURE__PARAMETERS:
				getParameters().clear();
				return;
			case ReconfigurationPackage.SIGNATURE__RETURN_PARAMETERS:
				getReturnParameters().clear();
				return;
			case ReconfigurationPackage.SIGNATURE__RECONFIGURATION_RULE:
				setReconfigurationRule((ReconfigurationRule)null);
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
			case ReconfigurationPackage.SIGNATURE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ReconfigurationPackage.SIGNATURE__RETURN_PARAMETERS:
				return returnParameters != null && !returnParameters.isEmpty();
			case ReconfigurationPackage.SIGNATURE__RECONFIGURATION_RULE:
				return getReconfigurationRule() != null;
		}
		return super.eIsSet(featureID);
	}

} //SignatureImpl
