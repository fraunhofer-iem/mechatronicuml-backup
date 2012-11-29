/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continuous Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ContinuousPortImpl#isIsContinuousInPort <em>Is Continuous In Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ContinuousPortImpl#isIsContinuousOutPort <em>Is Continuous Out Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContinuousPortImpl extends DirectedTypedPortImpl implements ContinuousPort {
	/**
	 * The cached setting delegate for the '{@link #isIsContinuousInPort() <em>Is Continuous In Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsContinuousInPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_CONTINUOUS_IN_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.CONTINUOUS_PORT__IS_CONTINUOUS_IN_PORT).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #isIsContinuousOutPort() <em>Is Continuous Out Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsContinuousOutPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_CONTINUOUS_OUT_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.CONTINUOUS_PORT__IS_CONTINUOUS_OUT_PORT).getSettingDelegate();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuousPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.CONTINUOUS_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsContinuousInPort() {
		return (Boolean)IS_CONTINUOUS_IN_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsContinuousOutPort() {
		return (Boolean)IS_CONTINUOUS_OUT_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.CONTINUOUS_PORT__IS_CONTINUOUS_IN_PORT:
				return isIsContinuousInPort();
			case ComponentPackage.CONTINUOUS_PORT__IS_CONTINUOUS_OUT_PORT:
				return isIsContinuousOutPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComponentPackage.CONTINUOUS_PORT__IS_CONTINUOUS_IN_PORT:
				return IS_CONTINUOUS_IN_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.CONTINUOUS_PORT__IS_CONTINUOUS_OUT_PORT:
				return IS_CONTINUOUS_OUT_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //ContinuousPortImpl
