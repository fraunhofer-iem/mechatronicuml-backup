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
package de.uni_paderborn.fujaba.muml.pattern;

import org.eclipse.emf.common.util.EList;

import org.storydriven.core.Extension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adapted From Coordination Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * \todosd{document!}
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.pattern.AdaptedFromCoordinationPattern#getAdaptedPattern <em>Adapted Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.pattern.PatternPackage#getAdaptedFromCoordinationPattern()
 * @model
 * @generated
 */
public interface AdaptedFromCoordinationPattern extends Extension {
	/**
	 * Returns the value of the '<em><b>Adapted Pattern</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * \todosd{document!}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adapted Pattern</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.pattern.PatternPackage#getAdaptedFromCoordinationPattern_AdaptedPattern()
	 * @model required="true"
	 * @generated
	 */
	EList<CoordinationPattern> getAdaptedPattern();

} // AdaptedFromCoordinationPattern
