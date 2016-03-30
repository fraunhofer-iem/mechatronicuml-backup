/**
 * Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany and Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT, Germany
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkingHardware;

import org.eclipse.emf.ecore.EClass;
import org.muml.core.impl.ExtendableElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Networking Hardware</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class NetworkingHardwareImpl extends ExtendableElementImpl implements NetworkingHardware {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkingHardwareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatformPackage.Literals.NETWORKING_HARDWARE;
	}

} //NetworkingHardwareImpl
