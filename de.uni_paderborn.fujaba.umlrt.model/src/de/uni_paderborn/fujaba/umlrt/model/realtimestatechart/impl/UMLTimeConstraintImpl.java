/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLTimeConstraint;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.storydriven.modeling.expressions.ComparingOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Time Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLTimeConstraintImpl#getBound <em>Bound</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLTimeConstraintImpl#getUmlClock <em>Uml Clock</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLTimeConstraintImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLTimeConstraintImpl extends EObjectImpl implements UMLTimeConstraint {
	/**
	 * The cached value of the '{@link #getBound() <em>Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound()
	 * @generated
	 * @ordered
	 */
	protected NaturalNumber bound;

	/**
	 * The cached value of the '{@link #getUmlClock() <em>Uml Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlClock()
	 * @generated
	 * @ordered
	 */
	protected UMLClock umlClock;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparingOperator OPERATOR_EDEFAULT = ComparingOperator.LESS;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparingOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLTimeConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.UML_TIME_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalNumber getBound() {
		return bound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBound(NaturalNumber newBound, NotificationChain msgs) {
		NaturalNumber oldBound = bound;
		bound = newBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_TIME_CONSTRAINT__BOUND, oldBound, newBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBound(NaturalNumber newBound) {
		if (newBound != bound) {
			NotificationChain msgs = null;
			if (bound != null)
				msgs = ((InternalEObject)bound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.UML_TIME_CONSTRAINT__BOUND, null, msgs);
			if (newBound != null)
				msgs = ((InternalEObject)newBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.UML_TIME_CONSTRAINT__BOUND, null, msgs);
			msgs = basicSetBound(newBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_TIME_CONSTRAINT__BOUND, newBound, newBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLClock getUmlClock() {
		if (umlClock != null && umlClock.eIsProxy()) {
			InternalEObject oldUmlClock = (InternalEObject)umlClock;
			umlClock = (UMLClock)eResolveProxy(oldUmlClock);
			if (umlClock != oldUmlClock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.UML_TIME_CONSTRAINT__UML_CLOCK, oldUmlClock, umlClock));
			}
		}
		return umlClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLClock basicGetUmlClock() {
		return umlClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUmlClock(UMLClock newUmlClock, NotificationChain msgs) {
		UMLClock oldUmlClock = umlClock;
		umlClock = newUmlClock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_TIME_CONSTRAINT__UML_CLOCK, oldUmlClock, newUmlClock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlClock(UMLClock newUmlClock) {
		if (newUmlClock != umlClock) {
			NotificationChain msgs = null;
			if (umlClock != null)
				msgs = ((InternalEObject)umlClock).eInverseRemove(this, RealtimestatechartPackage.UML_CLOCK__TIME_CONSTRAINTS, UMLClock.class, msgs);
			if (newUmlClock != null)
				msgs = ((InternalEObject)newUmlClock).eInverseAdd(this, RealtimestatechartPackage.UML_CLOCK__TIME_CONSTRAINTS, UMLClock.class, msgs);
			msgs = basicSetUmlClock(newUmlClock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_TIME_CONSTRAINT__UML_CLOCK, newUmlClock, newUmlClock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparingOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(ComparingOperator newOperator) {
		ComparingOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_TIME_CONSTRAINT__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject clone(UMLRealtimeStatechart rtsc, UMLTimeConstraint newAtom) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.UML_TIME_CONSTRAINT__UML_CLOCK:
				if (umlClock != null)
					msgs = ((InternalEObject)umlClock).eInverseRemove(this, RealtimestatechartPackage.UML_CLOCK__TIME_CONSTRAINTS, UMLClock.class, msgs);
				return basicSetUmlClock((UMLClock)otherEnd, msgs);
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
			case RealtimestatechartPackage.UML_TIME_CONSTRAINT__BOUND:
				return basicSetBound(null, msgs);
			case RealtimestatechartPackage.UML_TIME_CONSTRAINT__UML_CLOCK:
				return basicSetUmlClock(null, msgs);
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
			case RealtimestatechartPackage.UML_TIME_CONSTRAINT__BOUND:
				return getBound();
			case RealtimestatechartPackage.UML_TIME_CONSTRAINT__UML_CLOCK:
				if (resolve) return getUmlClock();
				return basicGetUmlClock();
			case RealtimestatechartPackage.UML_TIME_CONSTRAINT__OPERATOR:
				return getOperator();
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
			case RealtimestatechartPackage.UML_TIME_CONSTRAINT__BOUND:
				setBound((NaturalNumber)newValue);
				return;
			case RealtimestatechartPackage.UML_TIME_CONSTRAINT__UML_CLOCK:
				setUmlClock((UMLClock)newValue);
				return;
			case RealtimestatechartPackage.UML_TIME_CONSTRAINT__OPERATOR:
				setOperator((ComparingOperator)newValue);
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
			case RealtimestatechartPackage.UML_TIME_CONSTRAINT__BOUND:
				setBound((NaturalNumber)null);
				return;
			case RealtimestatechartPackage.UML_TIME_CONSTRAINT__UML_CLOCK:
				setUmlClock((UMLClock)null);
				return;
			case RealtimestatechartPackage.UML_TIME_CONSTRAINT__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case RealtimestatechartPackage.UML_TIME_CONSTRAINT__BOUND:
				return bound != null;
			case RealtimestatechartPackage.UML_TIME_CONSTRAINT__UML_CLOCK:
				return umlClock != null;
			case RealtimestatechartPackage.UML_TIME_CONSTRAINT__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
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
			case RealtimestatechartPackage.UML_TIME_CONSTRAINT___CLONE__UMLREALTIMESTATECHART_UMLTIMECONSTRAINT:
				return clone((UMLRealtimeStatechart)arguments.get(0), (UMLTimeConstraint)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //UMLTimeConstraintImpl
