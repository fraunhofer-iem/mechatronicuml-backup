/**
 */
package de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.HelperPackage;
import de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.PreTransformationHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pre Transformation Helper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.impl.PreTransformationHelperImpl#getRtscs <em>Rtscs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreTransformationHelperImpl extends EObjectImpl implements PreTransformationHelper {
	/**
	 * The cached value of the '{@link #getRtscs() <em>Rtscs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtscs()
	 * @generated
	 * @ordered
	 */
	protected EList<RealtimeStatechart> rtscs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreTransformationHelperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HelperPackage.Literals.PRE_TRANSFORMATION_HELPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealtimeStatechart> getRtscs() {
		if (rtscs == null) {
			rtscs = new EObjectResolvingEList<RealtimeStatechart>(RealtimeStatechart.class, this, HelperPackage.PRE_TRANSFORMATION_HELPER__RTSCS);
		}
		return rtscs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HelperPackage.PRE_TRANSFORMATION_HELPER__RTSCS:
				return getRtscs();
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
			case HelperPackage.PRE_TRANSFORMATION_HELPER__RTSCS:
				getRtscs().clear();
				getRtscs().addAll((Collection<? extends RealtimeStatechart>)newValue);
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
			case HelperPackage.PRE_TRANSFORMATION_HELPER__RTSCS:
				getRtscs().clear();
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
			case HelperPackage.PRE_TRANSFORMATION_HELPER__RTSCS:
				return rtscs != null && !rtscs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PreTransformationHelperImpl
