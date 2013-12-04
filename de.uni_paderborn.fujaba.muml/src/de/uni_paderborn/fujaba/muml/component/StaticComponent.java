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
package de.uni_paderborn.fujaba.muml.component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Component</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getStaticComponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SoftwareComponentOnlyDiscreteOrHybridPorts'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SoftwareComponentOnlyDiscreteOrHybridPorts='-- Static Components with component type \"SOFTARE_COMPONENT\" must only have discrete ports and hybrid ports.\r\nself.componentKind = ComponentKind::SOFTWARE_COMPONENT implies self.ports->reject(p | p.oclIsKindOf(DiscretePort) or p.oclIsKindOf(HybridPort))->isEmpty()'"
 * @generated
 */
public interface StaticComponent extends Component {
} // StaticComponent
