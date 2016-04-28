/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package railcab.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.impl.NamedElementImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import railcab.RailCab;
import railcab.RailcabPackage;
import railcab.SectionControl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rail Cab</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link railcab.impl.RailCabImpl#getMember <em>Member</em>}</li>
 *   <li>{@link railcab.impl.RailCabImpl#getSectionControl <em>Section Control</em>}</li>
 *   <li>{@link railcab.impl.RailCabImpl#isIsLeader <em>Is Leader</em>}</li>
 *   <li>{@link railcab.impl.RailCabImpl#getLeader <em>Leader</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RailCabImpl extends NamedElementImpl implements RailCab {
	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<RailCab> member;

	/**
	 * The cached value of the '{@link #getSectionControl() <em>Section Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionControl()
	 * @generated
	 * @ordered
	 */
	protected SectionControl sectionControl;

	/**
	 * The default value of the '{@link #isIsLeader() <em>Is Leader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeader()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LEADER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLeader() <em>Is Leader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeader()
	 * @generated
	 * @ordered
	 */
	protected boolean isLeader = IS_LEADER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeader() <em>Leader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeader()
	 * @generated
	 * @ordered
	 */
	protected RailCab leader;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RailCabImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RailcabPackage.Literals.RAIL_CAB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RailCab> getMember() {
		if (member == null) {
			member = new EObjectWithInverseResolvingEList<RailCab>(RailCab.class, this, RailcabPackage.RAIL_CAB__MEMBER, RailcabPackage.RAIL_CAB__LEADER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionControl getSectionControl() {
		if (sectionControl != null && sectionControl.eIsProxy()) {
			InternalEObject oldSectionControl = (InternalEObject)sectionControl;
			sectionControl = (SectionControl)eResolveProxy(oldSectionControl);
			if (sectionControl != oldSectionControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RailcabPackage.RAIL_CAB__SECTION_CONTROL, oldSectionControl, sectionControl));
			}
		}
		return sectionControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionControl basicGetSectionControl() {
		return sectionControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSectionControl(SectionControl newSectionControl, NotificationChain msgs) {
		SectionControl oldSectionControl = sectionControl;
		sectionControl = newSectionControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RailcabPackage.RAIL_CAB__SECTION_CONTROL, oldSectionControl, newSectionControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionControl(SectionControl newSectionControl) {
		if (newSectionControl != sectionControl) {
			NotificationChain msgs = null;
			if (sectionControl != null)
				msgs = ((InternalEObject)sectionControl).eInverseRemove(this, RailcabPackage.SECTION_CONTROL__RAILCABS, SectionControl.class, msgs);
			if (newSectionControl != null)
				msgs = ((InternalEObject)newSectionControl).eInverseAdd(this, RailcabPackage.SECTION_CONTROL__RAILCABS, SectionControl.class, msgs);
			msgs = basicSetSectionControl(newSectionControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailcabPackage.RAIL_CAB__SECTION_CONTROL, newSectionControl, newSectionControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLeader() {
		return isLeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeader(boolean newIsLeader) {
		boolean oldIsLeader = isLeader;
		isLeader = newIsLeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailcabPackage.RAIL_CAB__IS_LEADER, oldIsLeader, isLeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailCab getLeader() {
		if (leader != null && leader.eIsProxy()) {
			InternalEObject oldLeader = (InternalEObject)leader;
			leader = (RailCab)eResolveProxy(oldLeader);
			if (leader != oldLeader) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RailcabPackage.RAIL_CAB__LEADER, oldLeader, leader));
			}
		}
		return leader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailCab basicGetLeader() {
		return leader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeader(RailCab newLeader, NotificationChain msgs) {
		RailCab oldLeader = leader;
		leader = newLeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RailcabPackage.RAIL_CAB__LEADER, oldLeader, newLeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeader(RailCab newLeader) {
		if (newLeader != leader) {
			NotificationChain msgs = null;
			if (leader != null)
				msgs = ((InternalEObject)leader).eInverseRemove(this, RailcabPackage.RAIL_CAB__MEMBER, RailCab.class, msgs);
			if (newLeader != null)
				msgs = ((InternalEObject)newLeader).eInverseAdd(this, RailcabPackage.RAIL_CAB__MEMBER, RailCab.class, msgs);
			msgs = basicSetLeader(newLeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailcabPackage.RAIL_CAB__LEADER, newLeader, newLeader));
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
			case RailcabPackage.RAIL_CAB__MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMember()).basicAdd(otherEnd, msgs);
			case RailcabPackage.RAIL_CAB__SECTION_CONTROL:
				if (sectionControl != null)
					msgs = ((InternalEObject)sectionControl).eInverseRemove(this, RailcabPackage.SECTION_CONTROL__RAILCABS, SectionControl.class, msgs);
				return basicSetSectionControl((SectionControl)otherEnd, msgs);
			case RailcabPackage.RAIL_CAB__LEADER:
				if (leader != null)
					msgs = ((InternalEObject)leader).eInverseRemove(this, RailcabPackage.RAIL_CAB__MEMBER, RailCab.class, msgs);
				return basicSetLeader((RailCab)otherEnd, msgs);
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
			case RailcabPackage.RAIL_CAB__MEMBER:
				return ((InternalEList<?>)getMember()).basicRemove(otherEnd, msgs);
			case RailcabPackage.RAIL_CAB__SECTION_CONTROL:
				return basicSetSectionControl(null, msgs);
			case RailcabPackage.RAIL_CAB__LEADER:
				return basicSetLeader(null, msgs);
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
			case RailcabPackage.RAIL_CAB__MEMBER:
				return getMember();
			case RailcabPackage.RAIL_CAB__SECTION_CONTROL:
				if (resolve) return getSectionControl();
				return basicGetSectionControl();
			case RailcabPackage.RAIL_CAB__IS_LEADER:
				return isIsLeader();
			case RailcabPackage.RAIL_CAB__LEADER:
				if (resolve) return getLeader();
				return basicGetLeader();
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
			case RailcabPackage.RAIL_CAB__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends RailCab>)newValue);
				return;
			case RailcabPackage.RAIL_CAB__SECTION_CONTROL:
				setSectionControl((SectionControl)newValue);
				return;
			case RailcabPackage.RAIL_CAB__IS_LEADER:
				setIsLeader((Boolean)newValue);
				return;
			case RailcabPackage.RAIL_CAB__LEADER:
				setLeader((RailCab)newValue);
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
			case RailcabPackage.RAIL_CAB__MEMBER:
				getMember().clear();
				return;
			case RailcabPackage.RAIL_CAB__SECTION_CONTROL:
				setSectionControl((SectionControl)null);
				return;
			case RailcabPackage.RAIL_CAB__IS_LEADER:
				setIsLeader(IS_LEADER_EDEFAULT);
				return;
			case RailcabPackage.RAIL_CAB__LEADER:
				setLeader((RailCab)null);
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
			case RailcabPackage.RAIL_CAB__MEMBER:
				return member != null && !member.isEmpty();
			case RailcabPackage.RAIL_CAB__SECTION_CONTROL:
				return sectionControl != null;
			case RailcabPackage.RAIL_CAB__IS_LEADER:
				return isLeader != IS_LEADER_EDEFAULT;
			case RailcabPackage.RAIL_CAB__LEADER:
				return leader != null;
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
		result.append(" (isLeader: ");
		result.append(isLeader);
		result.append(')');
		return result.toString();
	}

} //RailCabImpl
