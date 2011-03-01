/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Clock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLClockImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLClockImpl#getAbsoluteDeadlines <em>Absolute Deadlines</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLClockImpl#getUMLRealtimeStatechart <em>UML Realtime Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLClockImpl#getResets <em>Resets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLClockImpl extends EObjectImpl implements UMLClock {
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
	 * The cached value of the '{@link #getUMLRealtimeStatechart() <em>UML Realtime Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 * @ordered
	 */
	protected UMLRealtimeStatechart uMLRealtimeStatechart;

	/**
	 * The cached value of the '{@link #getResets() <em>Resets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResets()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLClock> resets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLClockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.UML_CLOCK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_CLOCK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbsoluteDeadline> getAbsoluteDeadlines() {
		if (absoluteDeadlines == null) {
			absoluteDeadlines = new EObjectWithInverseResolvingEList<AbsoluteDeadline>(AbsoluteDeadline.class, this, RealtimestatechartPackage.UML_CLOCK__ABSOLUTE_DEADLINES, RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_CLOCK);
		}
		return absoluteDeadlines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeStatechart getUMLRealtimeStatechart() {
		if (uMLRealtimeStatechart != null && uMLRealtimeStatechart.eIsProxy()) {
			InternalEObject oldUMLRealtimeStatechart = (InternalEObject)uMLRealtimeStatechart;
			uMLRealtimeStatechart = (UMLRealtimeStatechart)eResolveProxy(oldUMLRealtimeStatechart);
			if (uMLRealtimeStatechart != oldUMLRealtimeStatechart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.UML_CLOCK__UML_REALTIME_STATECHART, oldUMLRealtimeStatechart, uMLRealtimeStatechart));
			}
		}
		return uMLRealtimeStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeStatechart basicGetUMLRealtimeStatechart() {
		return uMLRealtimeStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUMLRealtimeStatechart(UMLRealtimeStatechart newUMLRealtimeStatechart, NotificationChain msgs) {
		UMLRealtimeStatechart oldUMLRealtimeStatechart = uMLRealtimeStatechart;
		uMLRealtimeStatechart = newUMLRealtimeStatechart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_CLOCK__UML_REALTIME_STATECHART, oldUMLRealtimeStatechart, newUMLRealtimeStatechart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLRealtimeStatechart(UMLRealtimeStatechart newUMLRealtimeStatechart) {
		if (newUMLRealtimeStatechart != uMLRealtimeStatechart) {
			NotificationChain msgs = null;
			if (uMLRealtimeStatechart != null)
				msgs = ((InternalEObject)uMLRealtimeStatechart).eInverseRemove(this, RealtimestatechartPackage.UML_REALTIME_STATECHART__UML_CLOCKS, UMLRealtimeStatechart.class, msgs);
			if (newUMLRealtimeStatechart != null)
				msgs = ((InternalEObject)newUMLRealtimeStatechart).eInverseAdd(this, RealtimestatechartPackage.UML_REALTIME_STATECHART__UML_CLOCKS, UMLRealtimeStatechart.class, msgs);
			msgs = basicSetUMLRealtimeStatechart(newUMLRealtimeStatechart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_CLOCK__UML_REALTIME_STATECHART, newUMLRealtimeStatechart, newUMLRealtimeStatechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UMLClock> getResets() {
		if (resets == null) {
			resets = new EObjectResolvingEList<UMLClock>(UMLClock.class, this, RealtimestatechartPackage.UML_CLOCK__RESETS);
		}
		return resets;
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
	public EObject clone(UMLRealtimeStatechart rtsc, UMLClock newClock) {
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
			case RealtimestatechartPackage.UML_CLOCK__ABSOLUTE_DEADLINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAbsoluteDeadlines()).basicAdd(otherEnd, msgs);
			case RealtimestatechartPackage.UML_CLOCK__UML_REALTIME_STATECHART:
				if (uMLRealtimeStatechart != null)
					msgs = ((InternalEObject)uMLRealtimeStatechart).eInverseRemove(this, RealtimestatechartPackage.UML_REALTIME_STATECHART__UML_CLOCKS, UMLRealtimeStatechart.class, msgs);
				return basicSetUMLRealtimeStatechart((UMLRealtimeStatechart)otherEnd, msgs);
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
			case RealtimestatechartPackage.UML_CLOCK__ABSOLUTE_DEADLINES:
				return ((InternalEList<?>)getAbsoluteDeadlines()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.UML_CLOCK__UML_REALTIME_STATECHART:
				return basicSetUMLRealtimeStatechart(null, msgs);
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
			case RealtimestatechartPackage.UML_CLOCK__ID:
				return getId();
			case RealtimestatechartPackage.UML_CLOCK__ABSOLUTE_DEADLINES:
				return getAbsoluteDeadlines();
			case RealtimestatechartPackage.UML_CLOCK__UML_REALTIME_STATECHART:
				if (resolve) return getUMLRealtimeStatechart();
				return basicGetUMLRealtimeStatechart();
			case RealtimestatechartPackage.UML_CLOCK__RESETS:
				return getResets();
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
			case RealtimestatechartPackage.UML_CLOCK__ID:
				setId((String)newValue);
				return;
			case RealtimestatechartPackage.UML_CLOCK__ABSOLUTE_DEADLINES:
				getAbsoluteDeadlines().clear();
				getAbsoluteDeadlines().addAll((Collection<? extends AbsoluteDeadline>)newValue);
				return;
			case RealtimestatechartPackage.UML_CLOCK__UML_REALTIME_STATECHART:
				setUMLRealtimeStatechart((UMLRealtimeStatechart)newValue);
				return;
			case RealtimestatechartPackage.UML_CLOCK__RESETS:
				getResets().clear();
				getResets().addAll((Collection<? extends UMLClock>)newValue);
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
			case RealtimestatechartPackage.UML_CLOCK__ID:
				setId(ID_EDEFAULT);
				return;
			case RealtimestatechartPackage.UML_CLOCK__ABSOLUTE_DEADLINES:
				getAbsoluteDeadlines().clear();
				return;
			case RealtimestatechartPackage.UML_CLOCK__UML_REALTIME_STATECHART:
				setUMLRealtimeStatechart((UMLRealtimeStatechart)null);
				return;
			case RealtimestatechartPackage.UML_CLOCK__RESETS:
				getResets().clear();
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
			case RealtimestatechartPackage.UML_CLOCK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RealtimestatechartPackage.UML_CLOCK__ABSOLUTE_DEADLINES:
				return absoluteDeadlines != null && !absoluteDeadlines.isEmpty();
			case RealtimestatechartPackage.UML_CLOCK__UML_REALTIME_STATECHART:
				return uMLRealtimeStatechart != null;
			case RealtimestatechartPackage.UML_CLOCK__RESETS:
				return resets != null && !resets.isEmpty();
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
			case RealtimestatechartPackage.UML_CLOCK___TO_STRING:
				return toString();
			case RealtimestatechartPackage.UML_CLOCK___CLONE__UMLREALTIMESTATECHART_UMLCLOCK:
				return clone((UMLRealtimeStatechart)arguments.get(0), (UMLClock)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //UMLClockImpl
