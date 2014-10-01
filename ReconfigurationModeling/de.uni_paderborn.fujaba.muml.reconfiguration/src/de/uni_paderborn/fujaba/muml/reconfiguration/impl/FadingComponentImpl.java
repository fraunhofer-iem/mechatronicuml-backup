/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.component.impl.AtomicComponentImpl;
import de.uni_paderborn.fujaba.muml.reconfiguration.FadingComponent;
import de.uni_paderborn.fujaba.muml.reconfiguration.FadingFunction;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fading Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.FadingComponentImpl#getFadingFunction <em>Fading Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FadingComponentImpl extends AtomicComponentImpl implements FadingComponent {
	/**
	 * The cached value of the '{@link #getFadingFunction() <em>Fading Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFadingFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<FadingFunction> fadingFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FadingComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.FADING_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FadingFunction> getFadingFunction() {
		if (fadingFunction == null) {
			fadingFunction = new EObjectContainmentEList<FadingFunction>(FadingFunction.class, this, ReconfigurationPackage.FADING_COMPONENT__FADING_FUNCTION);
		}
		return fadingFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReconfigurationPackage.FADING_COMPONENT__FADING_FUNCTION:
				return ((InternalEList<?>)getFadingFunction()).basicRemove(otherEnd, msgs);
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
			case ReconfigurationPackage.FADING_COMPONENT__FADING_FUNCTION:
				return getFadingFunction();
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
			case ReconfigurationPackage.FADING_COMPONENT__FADING_FUNCTION:
				getFadingFunction().clear();
				getFadingFunction().addAll((Collection<? extends FadingFunction>)newValue);
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
			case ReconfigurationPackage.FADING_COMPONENT__FADING_FUNCTION:
				getFadingFunction().clear();
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
			case ReconfigurationPackage.FADING_COMPONENT__FADING_FUNCTION:
				return fadingFunction != null && !fadingFunction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FadingComponentImpl
