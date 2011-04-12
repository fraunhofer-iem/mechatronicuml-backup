/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart;
import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Statechart;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.modeling.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ClockImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ClockImpl#getAbsoluteDeadlines <em>Absolute Deadlines</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ClockImpl#getStatechart <em>Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ClockImpl#getResets <em>Resets</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ClockImpl#getClockConstraints <em>Clock Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClockImpl extends NamedElementImpl implements Clock {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAbsoluteDeadlines() <em>Absolute Deadlines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteDeadlines()
	 * @generated
	 * @ordered
	 */
	protected EList<AbsoluteDeadline> absoluteDeadlines;

	/**
	 * The cached value of the '{@link #getResets() <em>Resets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResets()
	 * @generated
	 * @ordered
	 */
	protected EList<Clock> resets;

	/**
	 * The cached value of the '{@link #getClockConstraints() <em>Clock Constraints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ClockConstraint> clockConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.CLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.CLOCK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbsoluteDeadline> getAbsoluteDeadlines() {
		if (absoluteDeadlines == null) {
			absoluteDeadlines = new EObjectWithInverseResolvingEList<AbsoluteDeadline>(AbsoluteDeadline.class, this, RealtimestatechartPackage.CLOCK__ABSOLUTE_DEADLINES, RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_CLOCK);
		}
		return absoluteDeadlines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStatechart getStatechart() {
		if (eContainerFeatureID() != RealtimestatechartPackage.CLOCK__STATECHART) return null;
		return (AbstractStatechart)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatechart(AbstractStatechart newStatechart, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStatechart, RealtimestatechartPackage.CLOCK__STATECHART, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatechart(AbstractStatechart newStatechart) {
		if (newStatechart != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.CLOCK__STATECHART && newStatechart != null)) {
			if (EcoreUtil.isAncestor(this, newStatechart))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStatechart != null)
				msgs = ((InternalEObject)newStatechart).eInverseAdd(this, CorePackage.ABSTRACT_STATECHART__CLOCKS, AbstractStatechart.class, msgs);
			msgs = basicSetStatechart(newStatechart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.CLOCK__STATECHART, newStatechart, newStatechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clock> getResets() {
		if (resets == null) {
			resets = new EObjectResolvingEList<Clock>(Clock.class, this, RealtimestatechartPackage.CLOCK__RESETS);
		}
		return resets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClockConstraint> getClockConstraints() {
		if (clockConstraints == null) {
			clockConstraints = new EObjectWithInverseResolvingEList<ClockConstraint>(ClockConstraint.class, this, RealtimestatechartPackage.CLOCK__CLOCK_CONSTRAINTS, RealtimestatechartPackage.CLOCK_CONSTRAINT__CLOCK);
		}
		return clockConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject clone(AbstractStatechart rtsc, Clock newClock) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.CLOCK__ABSOLUTE_DEADLINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAbsoluteDeadlines()).basicAdd(otherEnd, msgs);
			case RealtimestatechartPackage.CLOCK__STATECHART:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStatechart((AbstractStatechart)otherEnd, msgs);
			case RealtimestatechartPackage.CLOCK__CLOCK_CONSTRAINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClockConstraints()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.CLOCK__ABSOLUTE_DEADLINES:
				return ((InternalEList<?>)getAbsoluteDeadlines()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.CLOCK__STATECHART:
				return basicSetStatechart(null, msgs);
			case RealtimestatechartPackage.CLOCK__CLOCK_CONSTRAINTS:
				return ((InternalEList<?>)getClockConstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RealtimestatechartPackage.CLOCK__STATECHART:
				return eInternalContainer().eInverseRemove(this, CorePackage.ABSTRACT_STATECHART__CLOCKS, AbstractStatechart.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RealtimestatechartPackage.CLOCK__ID:
				return getId();
			case RealtimestatechartPackage.CLOCK__ABSOLUTE_DEADLINES:
				return getAbsoluteDeadlines();
			case RealtimestatechartPackage.CLOCK__STATECHART:
				return getStatechart();
			case RealtimestatechartPackage.CLOCK__RESETS:
				return getResets();
			case RealtimestatechartPackage.CLOCK__CLOCK_CONSTRAINTS:
				return getClockConstraints();
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
			case RealtimestatechartPackage.CLOCK__ID:
				setId((String)newValue);
				return;
			case RealtimestatechartPackage.CLOCK__ABSOLUTE_DEADLINES:
				getAbsoluteDeadlines().clear();
				getAbsoluteDeadlines().addAll((Collection<? extends AbsoluteDeadline>)newValue);
				return;
			case RealtimestatechartPackage.CLOCK__STATECHART:
				setStatechart((AbstractStatechart)newValue);
				return;
			case RealtimestatechartPackage.CLOCK__RESETS:
				getResets().clear();
				getResets().addAll((Collection<? extends Clock>)newValue);
				return;
			case RealtimestatechartPackage.CLOCK__CLOCK_CONSTRAINTS:
				getClockConstraints().clear();
				getClockConstraints().addAll((Collection<? extends ClockConstraint>)newValue);
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
			case RealtimestatechartPackage.CLOCK__ID:
				setId(ID_EDEFAULT);
				return;
			case RealtimestatechartPackage.CLOCK__ABSOLUTE_DEADLINES:
				getAbsoluteDeadlines().clear();
				return;
			case RealtimestatechartPackage.CLOCK__STATECHART:
				setStatechart((AbstractStatechart)null);
				return;
			case RealtimestatechartPackage.CLOCK__RESETS:
				getResets().clear();
				return;
			case RealtimestatechartPackage.CLOCK__CLOCK_CONSTRAINTS:
				getClockConstraints().clear();
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
			case RealtimestatechartPackage.CLOCK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RealtimestatechartPackage.CLOCK__ABSOLUTE_DEADLINES:
				return absoluteDeadlines != null && !absoluteDeadlines.isEmpty();
			case RealtimestatechartPackage.CLOCK__STATECHART:
				return getStatechart() != null;
			case RealtimestatechartPackage.CLOCK__RESETS:
				return resets != null && !resets.isEmpty();
			case RealtimestatechartPackage.CLOCK__CLOCK_CONSTRAINTS:
				return clockConstraints != null && !clockConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RealtimestatechartPackage.CLOCK___TO_STRING:
				return toString();
			case RealtimestatechartPackage.CLOCK___CLONE__ABSTRACTSTATECHART_CLOCK:
				return clone((AbstractStatechart)arguments.get(0), (Clock)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ClockImpl
