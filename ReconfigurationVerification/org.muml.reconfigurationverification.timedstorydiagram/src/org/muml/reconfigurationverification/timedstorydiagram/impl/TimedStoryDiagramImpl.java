/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.timedstorydiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceConstraint;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceVariable;
import org.muml.reconfigurationverification.timedstorydiagram.TimedStoryDiagram;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage;
import org.muml.storydiagram.activities.impl.ActivityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Story Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.impl.TimedStoryDiagramImpl#getClockInstConstraint <em>Clock Inst Constraint</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.impl.TimedStoryDiagramImpl#getResets <em>Resets</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.impl.TimedStoryDiagramImpl#getMinDuration <em>Min Duration</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.impl.TimedStoryDiagramImpl#getMaxDuration <em>Max Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimedStoryDiagramImpl extends ActivityImpl implements TimedStoryDiagram {
	/**
	 * The cached value of the '{@link #getClockInstConstraint() <em>Clock Inst Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockInstConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<ClockInstanceConstraint> clockInstConstraint;

	/**
	 * The cached value of the '{@link #getResets() <em>Resets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResets()
	 * @generated
	 * @ordered
	 */
	protected EList<ClockInstanceVariable> resets;

	/**
	 * The default value of the '{@link #getMinDuration() <em>Min Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinDuration() <em>Min Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDuration()
	 * @generated
	 * @ordered
	 */
	protected int minDuration = MIN_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDuration() <em>Max Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxDuration() <em>Max Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDuration()
	 * @generated
	 * @ordered
	 */
	protected int maxDuration = MAX_DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedStoryDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimedstorydiagramPackage.Literals.TIMED_STORY_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClockInstanceConstraint> getClockInstConstraint() {
		if (clockInstConstraint == null) {
			clockInstConstraint = new EObjectContainmentEList<ClockInstanceConstraint>(ClockInstanceConstraint.class, this, TimedstorydiagramPackage.TIMED_STORY_DIAGRAM__CLOCK_INST_CONSTRAINT);
		}
		return clockInstConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClockInstanceVariable> getResets() {
		if (resets == null) {
			resets = new EObjectResolvingEList<ClockInstanceVariable>(ClockInstanceVariable.class, this, TimedstorydiagramPackage.TIMED_STORY_DIAGRAM__RESETS);
		}
		return resets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinDuration() {
		return minDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinDuration(int newMinDuration) {
		int oldMinDuration = minDuration;
		minDuration = newMinDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimedstorydiagramPackage.TIMED_STORY_DIAGRAM__MIN_DURATION, oldMinDuration, minDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxDuration() {
		return maxDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDuration(int newMaxDuration) {
		int oldMaxDuration = maxDuration;
		maxDuration = newMaxDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimedstorydiagramPackage.TIMED_STORY_DIAGRAM__MAX_DURATION, oldMaxDuration, maxDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimedstorydiagramPackage.TIMED_STORY_DIAGRAM__CLOCK_INST_CONSTRAINT:
				return ((InternalEList<?>)getClockInstConstraint()).basicRemove(otherEnd, msgs);
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
			case TimedstorydiagramPackage.TIMED_STORY_DIAGRAM__CLOCK_INST_CONSTRAINT:
				return getClockInstConstraint();
			case TimedstorydiagramPackage.TIMED_STORY_DIAGRAM__RESETS:
				return getResets();
			case TimedstorydiagramPackage.TIMED_STORY_DIAGRAM__MIN_DURATION:
				return getMinDuration();
			case TimedstorydiagramPackage.TIMED_STORY_DIAGRAM__MAX_DURATION:
				return getMaxDuration();
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
			case TimedstorydiagramPackage.TIMED_STORY_DIAGRAM__CLOCK_INST_CONSTRAINT:
				getClockInstConstraint().clear();
				getClockInstConstraint().addAll((Collection<? extends ClockInstanceConstraint>)newValue);
				return;
			case TimedstorydiagramPackage.TIMED_STORY_DIAGRAM__RESETS:
				getResets().clear();
				getResets().addAll((Collection<? extends ClockInstanceVariable>)newValue);
				return;
			case TimedstorydiagramPackage.TIMED_STORY_DIAGRAM__MIN_DURATION:
				setMinDuration((Integer)newValue);
				return;
			case TimedstorydiagramPackage.TIMED_STORY_DIAGRAM__MAX_DURATION:
				setMaxDuration((Integer)newValue);
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
			case TimedstorydiagramPackage.TIMED_STORY_DIAGRAM__CLOCK_INST_CONSTRAINT:
				getClockInstConstraint().clear();
				return;
			case TimedstorydiagramPackage.TIMED_STORY_DIAGRAM__RESETS:
				getResets().clear();
				return;
			case TimedstorydiagramPackage.TIMED_STORY_DIAGRAM__MIN_DURATION:
				setMinDuration(MIN_DURATION_EDEFAULT);
				return;
			case TimedstorydiagramPackage.TIMED_STORY_DIAGRAM__MAX_DURATION:
				setMaxDuration(MAX_DURATION_EDEFAULT);
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
			case TimedstorydiagramPackage.TIMED_STORY_DIAGRAM__CLOCK_INST_CONSTRAINT:
				return clockInstConstraint != null && !clockInstConstraint.isEmpty();
			case TimedstorydiagramPackage.TIMED_STORY_DIAGRAM__RESETS:
				return resets != null && !resets.isEmpty();
			case TimedstorydiagramPackage.TIMED_STORY_DIAGRAM__MIN_DURATION:
				return minDuration != MIN_DURATION_EDEFAULT;
			case TimedstorydiagramPackage.TIMED_STORY_DIAGRAM__MAX_DURATION:
				return maxDuration != MAX_DURATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (minDuration: ");
		result.append(minDuration);
		result.append(", maxDuration: ");
		result.append(maxDuration);
		result.append(')');
		return result.toString();
	}

} //TimedStoryDiagramImpl
