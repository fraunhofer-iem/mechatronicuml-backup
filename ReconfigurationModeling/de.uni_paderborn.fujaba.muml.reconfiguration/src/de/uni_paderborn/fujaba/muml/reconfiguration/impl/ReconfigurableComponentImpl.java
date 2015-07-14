/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.impl;

import org.eclipse.emf.ecore.EClass;

import de.uni_paderborn.fujaba.muml.component.impl.ComponentImpl;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableComponent;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;

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
