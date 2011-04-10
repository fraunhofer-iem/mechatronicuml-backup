/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.msgiface.impl;

import de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface;
import de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifacePackage;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.impl.MessageInterfaceImpl#getInherits <em>Inherits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageInterfaceImpl extends EClassImpl implements MessageInterface {
	/**
	 * The cached value of the '{@link #getInherits() <em>Inherits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInherits()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageInterface> inherits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MsgifacePackage.Literals.MESSAGE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageInterface> getInherits() {
		if (inherits == null) {
			inherits = new EObjectResolvingEList<MessageInterface>(MessageInterface.class, this, MsgifacePackage.MESSAGE_INTERFACE__INHERITS);
		}
		return inherits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MsgifacePackage.MESSAGE_INTERFACE__INHERITS:
				return getInherits();
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
			case MsgifacePackage.MESSAGE_INTERFACE__INHERITS:
				getInherits().clear();
				getInherits().addAll((Collection<? extends MessageInterface>)newValue);
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
			case MsgifacePackage.MESSAGE_INTERFACE__INHERITS:
				getInherits().clear();
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
			case MsgifacePackage.MESSAGE_INTERFACE__INHERITS:
				return inherits != null && !inherits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MessageInterfaceImpl
