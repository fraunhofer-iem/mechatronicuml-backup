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

import de.uni_paderborn.fujaba.muml.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition;
import fujaba2simulink.behavior_model.Behavior_modelPackage;
import fujaba2simulink.behavior_model.ScTrans2SfTrans;
import fujaba2simulink.impl.AbstractContainerCorrespondenceNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sc Trans2 Sf Trans</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.impl.ScTrans2SfTransImpl#getScTrans <em>Sc Trans</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.ScTrans2SfTransImpl#getSfTrans <em>Sf Trans</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.ScTrans2SfTransImpl#getScReg <em>Sc Reg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScTrans2SfTransImpl extends AbstractContainerCorrespondenceNodeImpl implements ScTrans2SfTrans {
	/**
	 * The cached value of the '{@link #getScTrans() <em>Sc Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScTrans()
	 * @generated
	 * @ordered
	 */
	protected Transition scTrans;

	/**
	 * The cached value of the '{@link #getSfTrans() <em>Sf Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfTrans()
	 * @generated
	 * @ordered
	 */
	protected de.uni_paderborn.fujaba.simulink.model.stateflow.Transition sfTrans;

	/**
	 * The cached value of the '{@link #getScReg() <em>Sc Reg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScReg()
	 * @generated
	 * @ordered
	 */
	protected Region scReg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScTrans2SfTransImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Behavior_modelPackage.Literals.SC_TRANS2_SF_TRANS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getScTrans() {
		if (scTrans != null && scTrans.eIsProxy()) {
			InternalEObject oldScTrans = (InternalEObject)scTrans;
			scTrans = (Transition)eResolveProxy(oldScTrans);
			if (scTrans != oldScTrans) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_TRANS2_SF_TRANS__SC_TRANS, oldScTrans, scTrans));
			}
		}
		return scTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetScTrans() {
		return scTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScTrans(Transition newScTrans) {
		Transition oldScTrans = scTrans;
		scTrans = newScTrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_TRANS2_SF_TRANS__SC_TRANS, oldScTrans, scTrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.simulink.model.stateflow.Transition getSfTrans() {
		if (sfTrans != null && ((EObject)sfTrans).eIsProxy()) {
			InternalEObject oldSfTrans = (InternalEObject)sfTrans;
			sfTrans = (de.uni_paderborn.fujaba.simulink.model.stateflow.Transition)eResolveProxy(oldSfTrans);
			if (sfTrans != oldSfTrans) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_TRANS2_SF_TRANS__SF_TRANS, oldSfTrans, sfTrans));
			}
		}
		return sfTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.simulink.model.stateflow.Transition basicGetSfTrans() {
		return sfTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfTrans(de.uni_paderborn.fujaba.simulink.model.stateflow.Transition newSfTrans) {
		de.uni_paderborn.fujaba.simulink.model.stateflow.Transition oldSfTrans = sfTrans;
		sfTrans = newSfTrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_TRANS2_SF_TRANS__SF_TRANS, oldSfTrans, sfTrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getScReg() {
		if (scReg != null && scReg.eIsProxy()) {
			InternalEObject oldScReg = (InternalEObject)scReg;
			scReg = (Region)eResolveProxy(oldScReg);
			if (scReg != oldScReg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_TRANS2_SF_TRANS__SC_REG, oldScReg, scReg));
			}
		}
		return scReg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region basicGetScReg() {
		return scReg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScReg(Region newScReg) {
		Region oldScReg = scReg;
		scReg = newScReg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_TRANS2_SF_TRANS__SC_REG, oldScReg, scReg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Behavior_modelPackage.SC_TRANS2_SF_TRANS__SC_TRANS:
				if (resolve) return getScTrans();
				return basicGetScTrans();
			case Behavior_modelPackage.SC_TRANS2_SF_TRANS__SF_TRANS:
				if (resolve) return getSfTrans();
				return basicGetSfTrans();
			case Behavior_modelPackage.SC_TRANS2_SF_TRANS__SC_REG:
				if (resolve) return getScReg();
				return basicGetScReg();
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
			case Behavior_modelPackage.SC_TRANS2_SF_TRANS__SC_TRANS:
				setScTrans((Transition)newValue);
				return;
			case Behavior_modelPackage.SC_TRANS2_SF_TRANS__SF_TRANS:
				setSfTrans((de.uni_paderborn.fujaba.simulink.model.stateflow.Transition)newValue);
				return;
			case Behavior_modelPackage.SC_TRANS2_SF_TRANS__SC_REG:
				setScReg((Region)newValue);
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
			case Behavior_modelPackage.SC_TRANS2_SF_TRANS__SC_TRANS:
				setScTrans((Transition)null);
				return;
			case Behavior_modelPackage.SC_TRANS2_SF_TRANS__SF_TRANS:
				setSfTrans((de.uni_paderborn.fujaba.simulink.model.stateflow.Transition)null);
				return;
			case Behavior_modelPackage.SC_TRANS2_SF_TRANS__SC_REG:
				setScReg((Region)null);
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
			case Behavior_modelPackage.SC_TRANS2_SF_TRANS__SC_TRANS:
				return scTrans != null;
			case Behavior_modelPackage.SC_TRANS2_SF_TRANS__SF_TRANS:
				return sfTrans != null;
			case Behavior_modelPackage.SC_TRANS2_SF_TRANS__SC_REG:
				return scReg != null;
		}
		return super.eIsSet(featureID);
	}

} //ScTrans2SfTransImpl
