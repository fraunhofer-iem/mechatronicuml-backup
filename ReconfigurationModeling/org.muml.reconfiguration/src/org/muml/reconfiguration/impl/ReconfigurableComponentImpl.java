/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfiguration.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.pim.component.impl.ComponentImpl;
import org.muml.reconfiguration.ReconfigurableComponent;
import org.muml.reconfiguration.ReconfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reconfigurable Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ReconfigurableComponentImpl extends ComponentImpl implements ReconfigurableComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurableComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.RECONFIGURABLE_COMPONENT;
	}

} //ReconfigurableComponentImpl
