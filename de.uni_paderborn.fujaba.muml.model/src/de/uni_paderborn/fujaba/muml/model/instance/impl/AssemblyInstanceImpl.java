/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.model.component.Assembly;
import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance;
import de.uni_paderborn.fujaba.muml.model.instance.BehavioralElementInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.AssemblyInstanceImpl#getBehavioralElementType <em>Behavioral Element Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.AssemblyInstanceImpl#getAssemblyType <em>Assembly Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.AssemblyInstanceImpl#getPropagationDelayLowerBound <em>Propagation Delay Lower Bound</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.AssemblyInstanceImpl#getPropagationDelayUpperBound <em>Propagation Delay Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssemblyInstanceImpl extends ConnectorInstanceImpl implements AssemblyInstance {
	/**
	 * The cached value of the '{@link #getBehavioralElementType() <em>Behavioral Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavioralElementType()
	 * @generated
	 * @ordered
	 */
	protected BehavioralElement behavioralElementType;

	/**
	 * The cached setting delegate for the '{@link #getAssemblyType() <em>Assembly Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ASSEMBLY_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.ASSEMBLY_INSTANCE__ASSEMBLY_TYPE).getSettingDelegate();

	/**
	 * The default value of the '{@link #getPropagationDelayLowerBound() <em>Propagation Delay Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagationDelayLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int PROPAGATION_DELAY_LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPropagationDelayLowerBound() <em>Propagation Delay Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagationDelayLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int propagationDelayLowerBound = PROPAGATION_DELAY_LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropagationDelayUpperBound() <em>Propagation Delay Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagationDelayUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int PROPAGATION_DELAY_UPPER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPropagationDelayUpperBound() <em>Propagation Delay Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagationDelayUpperBound()
	 * @generated
	 * @ordered
	 */
	protected int propagationDelayUpperBound = PROPAGATION_DELAY_UPPER_BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.ASSEMBLY_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralElement getBehavioralElementType() {
		if (behavioralElementType != null && behavioralElementType.eIsProxy()) {
			InternalEObject oldBehavioralElementType = (InternalEObject)behavioralElementType;
			behavioralElementType = (BehavioralElement)eResolveProxy(oldBehavioralElementType);
			if (behavioralElementType != oldBehavioralElementType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.ASSEMBLY_INSTANCE__BEHAVIORAL_ELEMENT_TYPE, oldBehavioralElementType, behavioralElementType));
			}
		}
		return behavioralElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralElement basicGetBehavioralElementType() {
		return behavioralElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavioralElementType(BehavioralElement newBehavioralElementType) {
		BehavioralElement oldBehavioralElementType = behavioralElementType;
		behavioralElementType = newBehavioralElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ASSEMBLY_INSTANCE__BEHAVIORAL_ELEMENT_TYPE, oldBehavioralElementType, behavioralElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assembly getAssemblyType() {
		return (Assembly)ASSEMBLY_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assembly basicGetAssemblyType() {
		return (Assembly)ASSEMBLY_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPropagationDelayLowerBound() {
		return propagationDelayLowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropagationDelayLowerBound(int newPropagationDelayLowerBound) {
		int oldPropagationDelayLowerBound = propagationDelayLowerBound;
		propagationDelayLowerBound = newPropagationDelayLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ASSEMBLY_INSTANCE__PROPAGATION_DELAY_LOWER_BOUND, oldPropagationDelayLowerBound, propagationDelayLowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPropagationDelayUpperBound() {
		return propagationDelayUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropagationDelayUpperBound(int newPropagationDelayUpperBound) {
		int oldPropagationDelayUpperBound = propagationDelayUpperBound;
		propagationDelayUpperBound = newPropagationDelayUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ASSEMBLY_INSTANCE__PROPAGATION_DELAY_UPPER_BOUND, oldPropagationDelayUpperBound, propagationDelayUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.ASSEMBLY_INSTANCE__BEHAVIORAL_ELEMENT_TYPE:
				if (resolve) return getBehavioralElementType();
				return basicGetBehavioralElementType();
			case InstancePackage.ASSEMBLY_INSTANCE__ASSEMBLY_TYPE:
				if (resolve) return getAssemblyType();
				return basicGetAssemblyType();
			case InstancePackage.ASSEMBLY_INSTANCE__PROPAGATION_DELAY_LOWER_BOUND:
				return getPropagationDelayLowerBound();
			case InstancePackage.ASSEMBLY_INSTANCE__PROPAGATION_DELAY_UPPER_BOUND:
				return getPropagationDelayUpperBound();
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
			case InstancePackage.ASSEMBLY_INSTANCE__BEHAVIORAL_ELEMENT_TYPE:
				setBehavioralElementType((BehavioralElement)newValue);
				return;
			case InstancePackage.ASSEMBLY_INSTANCE__PROPAGATION_DELAY_LOWER_BOUND:
				setPropagationDelayLowerBound((Integer)newValue);
				return;
			case InstancePackage.ASSEMBLY_INSTANCE__PROPAGATION_DELAY_UPPER_BOUND:
				setPropagationDelayUpperBound((Integer)newValue);
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
			case InstancePackage.ASSEMBLY_INSTANCE__BEHAVIORAL_ELEMENT_TYPE:
				setBehavioralElementType((BehavioralElement)null);
				return;
			case InstancePackage.ASSEMBLY_INSTANCE__PROPAGATION_DELAY_LOWER_BOUND:
				setPropagationDelayLowerBound(PROPAGATION_DELAY_LOWER_BOUND_EDEFAULT);
				return;
			case InstancePackage.ASSEMBLY_INSTANCE__PROPAGATION_DELAY_UPPER_BOUND:
				setPropagationDelayUpperBound(PROPAGATION_DELAY_UPPER_BOUND_EDEFAULT);
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
			case InstancePackage.ASSEMBLY_INSTANCE__BEHAVIORAL_ELEMENT_TYPE:
				return behavioralElementType != null;
			case InstancePackage.ASSEMBLY_INSTANCE__ASSEMBLY_TYPE:
				return ASSEMBLY_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case InstancePackage.ASSEMBLY_INSTANCE__PROPAGATION_DELAY_LOWER_BOUND:
				return propagationDelayLowerBound != PROPAGATION_DELAY_LOWER_BOUND_EDEFAULT;
			case InstancePackage.ASSEMBLY_INSTANCE__PROPAGATION_DELAY_UPPER_BOUND:
				return propagationDelayUpperBound != PROPAGATION_DELAY_UPPER_BOUND_EDEFAULT;
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
		if (baseClass == BehavioralElementInstance.class) {
			switch (derivedFeatureID) {
				case InstancePackage.ASSEMBLY_INSTANCE__BEHAVIORAL_ELEMENT_TYPE: return InstancePackage.BEHAVIORAL_ELEMENT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE;
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
		if (baseClass == BehavioralElementInstance.class) {
			switch (baseFeatureID) {
				case InstancePackage.BEHAVIORAL_ELEMENT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE: return InstancePackage.ASSEMBLY_INSTANCE__BEHAVIORAL_ELEMENT_TYPE;
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
		result.append(" (propagationDelayLowerBound: ");
		result.append(propagationDelayLowerBound);
		result.append(", propagationDelayUpperBound: ");
		result.append(propagationDelayUpperBound);
		result.append(')');
		return result.toString();
	}

} //AssemblyInstanceImpl
