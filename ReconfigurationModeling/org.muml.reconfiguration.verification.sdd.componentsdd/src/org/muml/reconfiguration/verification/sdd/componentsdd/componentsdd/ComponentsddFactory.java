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
package org.muml.reconfiguration.verification.sdd.componentsdd.componentsdd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.reconfiguration.verification.sdd.componentsdd.componentsdd.ComponentsddPackage
 * @generated
 */
public interface ComponentsddFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentsddFactory eINSTANCE = org.muml.reconfiguration.verification.sdd.componentsdd.componentsdd.impl.ComponentsddFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Story Decision Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Story Decision Diagram</em>'.
	 * @generated
	 */
	ComponentStoryDecisionDiagram createComponentStoryDecisionDiagram();

	/**
	 * Returns a new object of class '<em>Component Story Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Story Pattern Node</em>'.
	 * @generated
	 */
	ComponentStoryPatternNode createComponentStoryPatternNode();

	/**
	 * Returns a new object of class '<em>Evaluate Component SDD Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluate Component SDD Expression</em>'.
	 * @generated
	 */
	EvaluateComponentSDDExpression createEvaluateComponentSDDExpression();

	/**
	 * Returns a new object of class '<em>Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Node</em>'.
	 * @generated
	 */
	InitialNode createInitialNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentsddPackage getComponentsddPackage();

} //ComponentsddFactory
