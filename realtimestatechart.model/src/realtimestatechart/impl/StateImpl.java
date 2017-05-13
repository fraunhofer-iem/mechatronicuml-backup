/**
 */
package realtimestatechart.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import realtimestatechart.NamedElement;
import realtimestatechart.Realtimestatechart;
import realtimestatechart.RealtimestatechartPackage;
import realtimestatechart.State;
import realtimestatechart.StatePoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link realtimestatechart.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link realtimestatechart.impl.StateImpl#getSubStatecharts <em>Sub Statecharts</em>}</li>
 *   <li>{@link realtimestatechart.impl.StateImpl#getStatePoints <em>State Points</em>}</li>
 *   <li>{@link realtimestatechart.impl.StateImpl#isInitial <em>Initial</em>}</li>
 *   <li>{@link realtimestatechart.impl.StateImpl#isFinal <em>Final</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends VertexImpl implements State {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubStatecharts() <em>Sub Statecharts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubStatecharts()
	 * @generated
	 * @ordered
	 */
	protected EList<Realtimestatechart> subStatecharts;

	/**
	 * The cached value of the '{@link #getStatePoints() <em>State Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatePoints()
	 * @generated
	 * @ordered
	 */
	protected EList<StatePoint> statePoints;

	/**
	 * The default value of the '{@link #isInitial() <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitial() <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitial()
	 * @generated
	 * @ordered
	 */
	protected boolean initial = INITIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean final_ = FINAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Realtimestatechart> getSubStatecharts() {
		if (subStatecharts == null) {
			subStatecharts = new EObjectContainmentEList<Realtimestatechart>(Realtimestatechart.class, this, RealtimestatechartPackage.STATE__SUB_STATECHARTS);
		}
		return subStatecharts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatePoint> getStatePoints() {
		if (statePoints == null) {
			statePoints = new EObjectContainmentEList<StatePoint>(StatePoint.class, this, RealtimestatechartPackage.STATE__STATE_POINTS);
		}
		return statePoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial(boolean newInitial) {
		boolean oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__INITIAL, oldInitial, initial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		boolean oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__FINAL, oldFinal, final_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.STATE__SUB_STATECHARTS:
				return ((InternalEList<?>)getSubStatecharts()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.STATE__STATE_POINTS:
				return ((InternalEList<?>)getStatePoints()).basicRemove(otherEnd, msgs);
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
			case RealtimestatechartPackage.STATE__NAME:
				return getName();
			case RealtimestatechartPackage.STATE__SUB_STATECHARTS:
				return getSubStatecharts();
			case RealtimestatechartPackage.STATE__STATE_POINTS:
				return getStatePoints();
			case RealtimestatechartPackage.STATE__INITIAL:
				return isInitial();
			case RealtimestatechartPackage.STATE__FINAL:
				return isFinal();
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
			case RealtimestatechartPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case RealtimestatechartPackage.STATE__SUB_STATECHARTS:
				getSubStatecharts().clear();
				getSubStatecharts().addAll((Collection<? extends Realtimestatechart>)newValue);
				return;
			case RealtimestatechartPackage.STATE__STATE_POINTS:
				getStatePoints().clear();
				getStatePoints().addAll((Collection<? extends StatePoint>)newValue);
				return;
			case RealtimestatechartPackage.STATE__INITIAL:
				setInitial((Boolean)newValue);
				return;
			case RealtimestatechartPackage.STATE__FINAL:
				setFinal((Boolean)newValue);
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
			case RealtimestatechartPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RealtimestatechartPackage.STATE__SUB_STATECHARTS:
				getSubStatecharts().clear();
				return;
			case RealtimestatechartPackage.STATE__STATE_POINTS:
				getStatePoints().clear();
				return;
			case RealtimestatechartPackage.STATE__INITIAL:
				setInitial(INITIAL_EDEFAULT);
				return;
			case RealtimestatechartPackage.STATE__FINAL:
				setFinal(FINAL_EDEFAULT);
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
			case RealtimestatechartPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RealtimestatechartPackage.STATE__SUB_STATECHARTS:
				return subStatecharts != null && !subStatecharts.isEmpty();
			case RealtimestatechartPackage.STATE__STATE_POINTS:
				return statePoints != null && !statePoints.isEmpty();
			case RealtimestatechartPackage.STATE__INITIAL:
				return initial != INITIAL_EDEFAULT;
			case RealtimestatechartPackage.STATE__FINAL:
				return final_ != FINAL_EDEFAULT;
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case RealtimestatechartPackage.STATE__NAME: return RealtimestatechartPackage.NAMED_ELEMENT__NAME;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case RealtimestatechartPackage.NAMED_ELEMENT__NAME: return RealtimestatechartPackage.STATE__NAME;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", initial: ");
		result.append(initial);
		result.append(", final: ");
		result.append(final_);
		result.append(')');
		return result.toString();
	}

} //StateImpl
