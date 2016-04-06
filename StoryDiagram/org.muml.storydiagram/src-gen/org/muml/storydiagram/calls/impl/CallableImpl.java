/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.calls.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.impl.CommentableElementImpl;
import org.muml.storydiagram.activities.OperationExtension;
import org.muml.storydiagram.calls.Callable;
import org.muml.storydiagram.calls.CallsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Callable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.calls.impl.CallableImpl#getInParameter <em>In Parameter</em>}</li>
 *   <li>{@link org.muml.storydiagram.calls.impl.CallableImpl#getOutParameter <em>Out Parameter</em>}</li>
 *   <li>{@link org.muml.storydiagram.calls.impl.CallableImpl#getContainedParameters <em>Contained Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CallableImpl extends CommentableElementImpl implements
		Callable {
	/**
	 * The cached value of the '{@link #getInParameter() <em>In Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<EParameter> inParameter;
	/**
	 * The cached value of the '{@link #getOutParameter() <em>Out Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<EParameter> outParameter;
	/**
	 * The cached value of the '{@link #getContainedParameters() <em>Contained Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getContainedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<EParameter> containedParameters;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CallableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallsPackage.Literals.CALLABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EParameter> getInParameter() {
		if (inParameter == null) {
			inParameter = new EObjectResolvingEList<EParameter>(EParameter.class, this, CallsPackage.CALLABLE__IN_PARAMETER);
		}
		return inParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EParameter> getOutParameter() {
		if (outParameter == null) {
			outParameter = new EObjectResolvingEList<EParameter>(EParameter.class, this, CallsPackage.CALLABLE__OUT_PARAMETER);
		}
		return outParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EParameter> getContainedParameters() {
		if (containedParameters == null) {
			containedParameters = new EObjectContainmentEList<EParameter>(EParameter.class, this, CallsPackage.CALLABLE__CONTAINED_PARAMETERS);
		}
		return containedParameters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EParameter> getInParameters() {
		if (eContainer() instanceof OperationExtension) {
			return ((OperationExtension) eContainer()).getInParameters();
		}

		if (inParameters == null) {
			inParameters = new EObjectResolvingEList<EParameter>(
					EParameter.class, this, CallsPackage.CALLABLE__IN_PARAMETER);
		}
		return inParameters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EParameter> getOutParameters() {
		if (eContainer() instanceof OperationExtension) {
			return ((OperationExtension) eContainer()).getOutParameters();
		}

		if (outParameters == null) {
			outParameters = new EObjectResolvingEList<EParameter>(
					EParameter.class, this,
					CallsPackage.CALLABLE__OUT_PARAMETER);
		}
		return outParameters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CallsPackage.CALLABLE__CONTAINED_PARAMETERS:
				return ((InternalEList<?>)getContainedParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CallsPackage.CALLABLE__IN_PARAMETER:
				return getInParameter();
			case CallsPackage.CALLABLE__OUT_PARAMETER:
				return getOutParameter();
			case CallsPackage.CALLABLE__CONTAINED_PARAMETERS:
				return getContainedParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CallsPackage.CALLABLE__IN_PARAMETER:
				getInParameter().clear();
				getInParameter().addAll((Collection<? extends EParameter>)newValue);
				return;
			case CallsPackage.CALLABLE__OUT_PARAMETER:
				getOutParameter().clear();
				getOutParameter().addAll((Collection<? extends EParameter>)newValue);
				return;
			case CallsPackage.CALLABLE__CONTAINED_PARAMETERS:
				getContainedParameters().clear();
				getContainedParameters().addAll((Collection<? extends EParameter>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CallsPackage.CALLABLE__IN_PARAMETER:
				getInParameter().clear();
				return;
			case CallsPackage.CALLABLE__OUT_PARAMETER:
				getOutParameter().clear();
				return;
			case CallsPackage.CALLABLE__CONTAINED_PARAMETERS:
				getContainedParameters().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CallsPackage.CALLABLE__IN_PARAMETER:
				return inParameter != null && !inParameter.isEmpty();
			case CallsPackage.CALLABLE__OUT_PARAMETER:
				return outParameter != null && !outParameter.isEmpty();
			case CallsPackage.CALLABLE__CONTAINED_PARAMETERS:
				return containedParameters != null && !containedParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // CallableImpl
