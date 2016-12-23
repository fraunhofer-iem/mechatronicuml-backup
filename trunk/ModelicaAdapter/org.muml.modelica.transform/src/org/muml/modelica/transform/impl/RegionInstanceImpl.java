/**
 */
package org.muml.modelica.transform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.modelica.transform.RegionInstance;
import org.muml.modelica.transform.TransformPackage;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.impl.RegionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.modelica.transform.impl.RegionInstanceImpl#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link org.muml.modelica.transform.impl.RegionInstanceImpl#isEmbedsSinglePortStatechart <em>Embeds Single Port Statechart</em>}</li>
 *   <li>{@link org.muml.modelica.transform.impl.RegionInstanceImpl#isEmbedsMultiPortStatechart <em>Embeds Multi Port Statechart</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionInstanceImpl extends RegionImpl implements RegionInstance {
	/**
	 * The cached value of the '{@link #getInstanceOf() <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceOf()
	 * @generated
	 * @ordered
	 */
	protected Region instanceOf;

	/**
	 * The cached setting delegate for the '{@link #isEmbedsSinglePortStatechart() <em>Embeds Single Port Statechart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbedsSinglePortStatechart()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate EMBEDS_SINGLE_PORT_STATECHART__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TransformPackage.Literals.REGION_INSTANCE__EMBEDS_SINGLE_PORT_STATECHART).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isEmbedsMultiPortStatechart() <em>Embeds Multi Port Statechart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbedsMultiPortStatechart()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate EMBEDS_MULTI_PORT_STATECHART__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TransformPackage.Literals.REGION_INSTANCE__EMBEDS_MULTI_PORT_STATECHART).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransformPackage.Literals.REGION_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getInstanceOf() {
		if (instanceOf != null && instanceOf.eIsProxy()) {
			InternalEObject oldInstanceOf = (InternalEObject)instanceOf;
			instanceOf = (Region)eResolveProxy(oldInstanceOf);
			if (instanceOf != oldInstanceOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransformPackage.REGION_INSTANCE__INSTANCE_OF, oldInstanceOf, instanceOf));
			}
		}
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region basicGetInstanceOf() {
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceOf(Region newInstanceOf) {
		Region oldInstanceOf = instanceOf;
		instanceOf = newInstanceOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformPackage.REGION_INSTANCE__INSTANCE_OF, oldInstanceOf, instanceOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEmbedsSinglePortStatechart() {
		return (Boolean)EMBEDS_SINGLE_PORT_STATECHART__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbedsSinglePortStatechart(boolean newEmbedsSinglePortStatechart) {
		EMBEDS_SINGLE_PORT_STATECHART__ESETTING_DELEGATE.dynamicSet(this, null, 0, newEmbedsSinglePortStatechart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEmbedsMultiPortStatechart() {
		return (Boolean)EMBEDS_MULTI_PORT_STATECHART__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbedsMultiPortStatechart(boolean newEmbedsMultiPortStatechart) {
		EMBEDS_MULTI_PORT_STATECHART__ESETTING_DELEGATE.dynamicSet(this, null, 0, newEmbedsMultiPortStatechart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TransformPackage.REGION_INSTANCE__INSTANCE_OF:
				if (resolve) return getInstanceOf();
				return basicGetInstanceOf();
			case TransformPackage.REGION_INSTANCE__EMBEDS_SINGLE_PORT_STATECHART:
				return isEmbedsSinglePortStatechart();
			case TransformPackage.REGION_INSTANCE__EMBEDS_MULTI_PORT_STATECHART:
				return isEmbedsMultiPortStatechart();
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
			case TransformPackage.REGION_INSTANCE__INSTANCE_OF:
				setInstanceOf((Region)newValue);
				return;
			case TransformPackage.REGION_INSTANCE__EMBEDS_SINGLE_PORT_STATECHART:
				setEmbedsSinglePortStatechart((Boolean)newValue);
				return;
			case TransformPackage.REGION_INSTANCE__EMBEDS_MULTI_PORT_STATECHART:
				setEmbedsMultiPortStatechart((Boolean)newValue);
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
			case TransformPackage.REGION_INSTANCE__INSTANCE_OF:
				setInstanceOf((Region)null);
				return;
			case TransformPackage.REGION_INSTANCE__EMBEDS_SINGLE_PORT_STATECHART:
				EMBEDS_SINGLE_PORT_STATECHART__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case TransformPackage.REGION_INSTANCE__EMBEDS_MULTI_PORT_STATECHART:
				EMBEDS_MULTI_PORT_STATECHART__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case TransformPackage.REGION_INSTANCE__INSTANCE_OF:
				return instanceOf != null;
			case TransformPackage.REGION_INSTANCE__EMBEDS_SINGLE_PORT_STATECHART:
				return EMBEDS_SINGLE_PORT_STATECHART__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case TransformPackage.REGION_INSTANCE__EMBEDS_MULTI_PORT_STATECHART:
				return EMBEDS_MULTI_PORT_STATECHART__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //RegionInstanceImpl
