/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.timedstorydiagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceConstraint;
import org.muml.reconfigurationverification.timedstorydiagram.InvariantStoryDiagram;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage;
import org.muml.storydiagram.activities.impl.ActivityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invariant Story Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.impl.InvariantStoryDiagramImpl#getClockInstConstraint <em>Clock Inst Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvariantStoryDiagramImpl extends ActivityImpl implements InvariantStoryDiagram {
	/**
	 * The cached value of the '{@link #getClockInstConstraint() <em>Clock Inst Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockInstConstraint()
	 * @generated
	 * @ordered
	 */
	protected ClockInstanceConstraint clockInstConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvariantStoryDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimedstorydiagramPackage.Literals.INVARIANT_STORY_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockInstanceConstraint getClockInstConstraint() {
		return clockInstConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClockInstConstraint(ClockInstanceConstraint newClockInstConstraint, NotificationChain msgs) {
		ClockInstanceConstraint oldClockInstConstraint = clockInstConstraint;
		clockInstConstraint = newClockInstConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimedstorydiagramPackage.INVARIANT_STORY_DIAGRAM__CLOCK_INST_CONSTRAINT, oldClockInstConstraint, newClockInstConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockInstConstraint(ClockInstanceConstraint newClockInstConstraint) {
		if (newClockInstConstraint != clockInstConstraint) {
			NotificationChain msgs = null;
			if (clockInstConstraint != null)
				msgs = ((InternalEObject)clockInstConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimedstorydiagramPackage.INVARIANT_STORY_DIAGRAM__CLOCK_INST_CONSTRAINT, null, msgs);
			if (newClockInstConstraint != null)
				msgs = ((InternalEObject)newClockInstConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimedstorydiagramPackage.INVARIANT_STORY_DIAGRAM__CLOCK_INST_CONSTRAINT, null, msgs);
			msgs = basicSetClockInstConstraint(newClockInstConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimedstorydiagramPackage.INVARIANT_STORY_DIAGRAM__CLOCK_INST_CONSTRAINT, newClockInstConstraint, newClockInstConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimedstorydiagramPackage.INVARIANT_STORY_DIAGRAM__CLOCK_INST_CONSTRAINT:
				return basicSetClockInstConstraint(null, msgs);
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
			case TimedstorydiagramPackage.INVARIANT_STORY_DIAGRAM__CLOCK_INST_CONSTRAINT:
				return getClockInstConstraint();
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
			case TimedstorydiagramPackage.INVARIANT_STORY_DIAGRAM__CLOCK_INST_CONSTRAINT:
				setClockInstConstraint((ClockInstanceConstraint)newValue);
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
			case TimedstorydiagramPackage.INVARIANT_STORY_DIAGRAM__CLOCK_INST_CONSTRAINT:
				setClockInstConstraint((ClockInstanceConstraint)null);
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
			case TimedstorydiagramPackage.INVARIANT_STORY_DIAGRAM__CLOCK_INST_CONSTRAINT:
				return clockInstConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //InvariantStoryDiagramImpl
