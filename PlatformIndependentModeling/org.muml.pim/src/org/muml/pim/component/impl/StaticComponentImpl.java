/**
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.component.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.StaticComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class StaticComponentImpl extends ComponentImpl implements StaticComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.STATIC_COMPONENT;
	}

} //StaticComponentImpl
