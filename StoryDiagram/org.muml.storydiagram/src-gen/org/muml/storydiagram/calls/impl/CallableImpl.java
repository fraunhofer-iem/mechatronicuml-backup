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
 *   <li>{@link org.muml.storydiagram.calls.impl.CallableImpl#getInParameters <em>In Parameters</em>}</li>
 *   <li>{@link org.muml.storydiagram.calls.impl.CallableImpl#getOutParameters <em>Out Parameters</em>}</li>
 *   <li>{@link org.muml.storydiagram.calls.impl.CallableImpl#getContainedParameters <em>Contained Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CallableImpl extends CommentableElementImpl implements
		Callable {
	/**
	 * The cached value of the '{@link #getInParameters() <em>In Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<EParameter> inParameters;
	/**
	 * The cached value of the '{@link #getOutParameters() <em>Out Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<EParameter> outParameters;
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
					EParameter.class, this, CallsPackage.CALLABLE__IN_PARAMETERS);
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
					CallsPackage.CALLABLE__OUT_PARAMETERS);
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
			case CallsPackage.CALLABLE__IN_PARAMETERS:
				return getInParameters();
			case CallsPackage.CALLABLE__OUT_PARAMETERS:
				return getOutParameters();
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
			case CallsPackage.CALLABLE__IN_PARAMETERS:
				getInParameters().clear();
				getInParameters().addAll((Collection<? extends EParameter>)newValue);
				return;
			case CallsPackage.CALLABLE__OUT_PARAMETERS:
				getOutParameters().clear();
				getOutParameters().addAll((Collection<? extends EParameter>)newValue);
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
			case CallsPackage.CALLABLE__IN_PARAMETERS:
				getInParameters().clear();
				return;
			case CallsPackage.CALLABLE__OUT_PARAMETERS:
				getOutParameters().clear();
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
			case CallsPackage.CALLABLE__IN_PARAMETERS:
				return inParameters != null && !inParameters.isEmpty();
			case CallsPackage.CALLABLE__OUT_PARAMETERS:
				return outParameters != null && !outParameters.isEmpty();
			case CallsPackage.CALLABLE__CONTAINED_PARAMETERS:
				return containedParameters != null && !containedParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // CallableImpl
