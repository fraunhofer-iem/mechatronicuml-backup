/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.realtimestatechart.ExitPoint;
import de.uni_paderborn.fujaba.simulink.model.stateflow.Transition;
import fujaba2simulink.behavior_model.Behavior_modelPackage;
import fujaba2simulink.behavior_model.ScStExPoint2sfTrans;
import fujaba2simulink.impl.AbstractContainerCorrespondenceNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sc St Ex Point2sf Trans</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.impl.ScStExPoint2sfTransImpl#getSfTrans <em>Sf Trans</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.ScStExPoint2sfTransImpl#getScOutTrans <em>Sc Out Trans</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.ScStExPoint2sfTransImpl#getScInTrans <em>Sc In Trans</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.ScStExPoint2sfTransImpl#getScStExPoint <em>Sc St Ex Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScStExPoint2sfTransImpl extends AbstractContainerCorrespondenceNodeImpl implements ScStExPoint2sfTrans {
	/**
	 * The cached value of the '{@link #getSfTrans() <em>Sf Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfTrans()
	 * @generated
	 * @ordered
	 */
	protected Transition sfTrans;

	/**
	 * The cached value of the '{@link #getScOutTrans() <em>Sc Out Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScOutTrans()
	 * @generated
	 * @ordered
	 */
	protected de.uni_paderborn.fujaba.muml.realtimestatechart.Transition scOutTrans;

	/**
	 * The cached value of the '{@link #getScInTrans() <em>Sc In Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScInTrans()
	 * @generated
	 * @ordered
	 */
	protected de.uni_paderborn.fujaba.muml.realtimestatechart.Transition scInTrans;

	/**
	 * The cached value of the '{@link #getScStExPoint() <em>Sc St Ex Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScStExPoint()
	 * @generated
	 * @ordered
	 */
	protected ExitPoint scStExPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScStExPoint2sfTransImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Behavior_modelPackage.Literals.SC_ST_EX_POINT2SF_TRANS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getSfTrans() {
		if (sfTrans != null && ((EObject)sfTrans).eIsProxy()) {
			InternalEObject oldSfTrans = (InternalEObject)sfTrans;
			sfTrans = (Transition)eResolveProxy(oldSfTrans);
			if (sfTrans != oldSfTrans) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SF_TRANS, oldSfTrans, sfTrans));
			}
		}
		return sfTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetSfTrans() {
		return sfTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfTrans(Transition newSfTrans) {
		Transition oldSfTrans = sfTrans;
		sfTrans = newSfTrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SF_TRANS, oldSfTrans, sfTrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.muml.realtimestatechart.Transition getScOutTrans() {
		if (scOutTrans != null && scOutTrans.eIsProxy()) {
			InternalEObject oldScOutTrans = (InternalEObject)scOutTrans;
			scOutTrans = (de.uni_paderborn.fujaba.muml.realtimestatechart.Transition)eResolveProxy(oldScOutTrans);
			if (scOutTrans != oldScOutTrans) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SC_OUT_TRANS, oldScOutTrans, scOutTrans));
			}
		}
		return scOutTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.muml.realtimestatechart.Transition basicGetScOutTrans() {
		return scOutTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScOutTrans(de.uni_paderborn.fujaba.muml.realtimestatechart.Transition newScOutTrans) {
		de.uni_paderborn.fujaba.muml.realtimestatechart.Transition oldScOutTrans = scOutTrans;
		scOutTrans = newScOutTrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SC_OUT_TRANS, oldScOutTrans, scOutTrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.muml.realtimestatechart.Transition getScInTrans() {
		if (scInTrans != null && scInTrans.eIsProxy()) {
			InternalEObject oldScInTrans = (InternalEObject)scInTrans;
			scInTrans = (de.uni_paderborn.fujaba.muml.realtimestatechart.Transition)eResolveProxy(oldScInTrans);
			if (scInTrans != oldScInTrans) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SC_IN_TRANS, oldScInTrans, scInTrans));
			}
		}
		return scInTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.muml.realtimestatechart.Transition basicGetScInTrans() {
		return scInTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScInTrans(de.uni_paderborn.fujaba.muml.realtimestatechart.Transition newScInTrans) {
		de.uni_paderborn.fujaba.muml.realtimestatechart.Transition oldScInTrans = scInTrans;
		scInTrans = newScInTrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SC_IN_TRANS, oldScInTrans, scInTrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitPoint getScStExPoint() {
		if (scStExPoint != null && scStExPoint.eIsProxy()) {
			InternalEObject oldScStExPoint = (InternalEObject)scStExPoint;
			scStExPoint = (ExitPoint)eResolveProxy(oldScStExPoint);
			if (scStExPoint != oldScStExPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SC_ST_EX_POINT, oldScStExPoint, scStExPoint));
			}
		}
		return scStExPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitPoint basicGetScStExPoint() {
		return scStExPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScStExPoint(ExitPoint newScStExPoint) {
		ExitPoint oldScStExPoint = scStExPoint;
		scStExPoint = newScStExPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SC_ST_EX_POINT, oldScStExPoint, scStExPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SF_TRANS:
				if (resolve) return getSfTrans();
				return basicGetSfTrans();
			case Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SC_OUT_TRANS:
				if (resolve) return getScOutTrans();
				return basicGetScOutTrans();
			case Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SC_IN_TRANS:
				if (resolve) return getScInTrans();
				return basicGetScInTrans();
			case Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SC_ST_EX_POINT:
				if (resolve) return getScStExPoint();
				return basicGetScStExPoint();
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
			case Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SF_TRANS:
				setSfTrans((Transition)newValue);
				return;
			case Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SC_OUT_TRANS:
				setScOutTrans((de.uni_paderborn.fujaba.muml.realtimestatechart.Transition)newValue);
				return;
			case Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SC_IN_TRANS:
				setScInTrans((de.uni_paderborn.fujaba.muml.realtimestatechart.Transition)newValue);
				return;
			case Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SC_ST_EX_POINT:
				setScStExPoint((ExitPoint)newValue);
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
			case Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SF_TRANS:
				setSfTrans((Transition)null);
				return;
			case Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SC_OUT_TRANS:
				setScOutTrans((de.uni_paderborn.fujaba.muml.realtimestatechart.Transition)null);
				return;
			case Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SC_IN_TRANS:
				setScInTrans((de.uni_paderborn.fujaba.muml.realtimestatechart.Transition)null);
				return;
			case Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SC_ST_EX_POINT:
				setScStExPoint((ExitPoint)null);
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
			case Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SF_TRANS:
				return sfTrans != null;
			case Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SC_OUT_TRANS:
				return scOutTrans != null;
			case Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SC_IN_TRANS:
				return scInTrans != null;
			case Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS__SC_ST_EX_POINT:
				return scStExPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //ScStExPoint2sfTransImpl
