/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.timedstorydiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.muml.mumlcore.impl.NamedElementImpl;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstance;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.impl.ClockInstanceImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.impl.ClockInstanceImpl#getHasNode <em>Has Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClockInstanceImpl extends NamedElementImpl implements ClockInstance {
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
	 * The cached value of the '{@link #getHasNode() <em>Has Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasNode()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> hasNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimedstorydiagramPackage.Literals.CLOCK_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimedstorydiagramPackage.CLOCK_INSTANCE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getHasNode() {
		if (hasNode == null) {
			hasNode = new EObjectResolvingEList<EObject>(EObject.class, this, TimedstorydiagramPackage.CLOCK_INSTANCE__HAS_NODE);
		}
		return hasNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimedstorydiagramPackage.CLOCK_INSTANCE__ID:
				return getId();
			case TimedstorydiagramPackage.CLOCK_INSTANCE__HAS_NODE:
				return getHasNode();
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
			case TimedstorydiagramPackage.CLOCK_INSTANCE__ID:
				setId((String)newValue);
				return;
			case TimedstorydiagramPackage.CLOCK_INSTANCE__HAS_NODE:
				getHasNode().clear();
				getHasNode().addAll((Collection<? extends EObject>)newValue);
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
			case TimedstorydiagramPackage.CLOCK_INSTANCE__ID:
				setId(ID_EDEFAULT);
				return;
			case TimedstorydiagramPackage.CLOCK_INSTANCE__HAS_NODE:
				getHasNode().clear();
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
			case TimedstorydiagramPackage.CLOCK_INSTANCE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TimedstorydiagramPackage.CLOCK_INSTANCE__HAS_NODE:
				return hasNode != null && !hasNode.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ClockInstanceImpl
