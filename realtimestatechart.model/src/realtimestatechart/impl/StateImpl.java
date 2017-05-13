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
import realtimestatechart.StateEntryPoint;
import realtimestatechart.StateExitPoint;

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
 *   <li>{@link realtimestatechart.impl.StateImpl#getEntryPoints <em>Entry Points</em>}</li>
 *   <li>{@link realtimestatechart.impl.StateImpl#getExitPoints <em>Exit Points</em>}</li>
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
	 * The cached value of the '{@link #getEntryPoints() <em>Entry Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<StateEntryPoint> entryPoints;

	/**
	 * The cached value of the '{@link #getExitPoints() <em>Exit Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<StateExitPoint> exitPoints;

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
	public EList<StateEntryPoint> getEntryPoints() {
		if (entryPoints == null) {
			entryPoints = new EObjectContainmentEList<StateEntryPoint>(StateEntryPoint.class, this, RealtimestatechartPackage.STATE__ENTRY_POINTS);
		}
		return entryPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateExitPoint> getExitPoints() {
		if (exitPoints == null) {
			exitPoints = new EObjectContainmentEList<StateExitPoint>(StateExitPoint.class, this, RealtimestatechartPackage.STATE__EXIT_POINTS);
		}
		return exitPoints;
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
			case RealtimestatechartPackage.STATE__ENTRY_POINTS:
				return ((InternalEList<?>)getEntryPoints()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.STATE__EXIT_POINTS:
				return ((InternalEList<?>)getExitPoints()).basicRemove(otherEnd, msgs);
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
			case RealtimestatechartPackage.STATE__ENTRY_POINTS:
				return getEntryPoints();
			case RealtimestatechartPackage.STATE__EXIT_POINTS:
				return getExitPoints();
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
			case RealtimestatechartPackage.STATE__ENTRY_POINTS:
				getEntryPoints().clear();
				getEntryPoints().addAll((Collection<? extends StateEntryPoint>)newValue);
				return;
			case RealtimestatechartPackage.STATE__EXIT_POINTS:
				getExitPoints().clear();
				getExitPoints().addAll((Collection<? extends StateExitPoint>)newValue);
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
			case RealtimestatechartPackage.STATE__ENTRY_POINTS:
				getEntryPoints().clear();
				return;
			case RealtimestatechartPackage.STATE__EXIT_POINTS:
				getExitPoints().clear();
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
			case RealtimestatechartPackage.STATE__ENTRY_POINTS:
				return entryPoints != null && !entryPoints.isEmpty();
			case RealtimestatechartPackage.STATE__EXIT_POINTS:
				return exitPoints != null && !exitPoints.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //StateImpl
