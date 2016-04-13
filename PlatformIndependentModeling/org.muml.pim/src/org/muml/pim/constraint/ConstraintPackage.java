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
package org.muml.pim.constraint;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This package provides abstract super classes for modeling different kinds of constraints that may be attached to verifiable elements of the MechatronicUML meta-model. 
 * <!-- end-model-doc -->
 * @see org.muml.pim.constraint.ConstraintFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ConstraintPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "constraint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/pim/constraint/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "constraint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstraintPackage eINSTANCE = org.muml.pim.constraint.impl.ConstraintPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.pim.constraint.impl.VerificationConstraintRepositoryImpl <em>Verification Constraint Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.constraint.impl.VerificationConstraintRepositoryImpl
	 * @see org.muml.pim.constraint.impl.ConstraintPackageImpl#getVerificationConstraintRepository()
	 * @generated
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY__ANNOTATIONS = CorePackage.EXTENDABLE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The number of structural features of the '<em>Verification Constraint Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Verification Constraint Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY_OPERATION_COUNT = CorePackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.constraint.impl.VerifiableElementImpl <em>Verifiable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.constraint.impl.VerifiableElementImpl
	 * @see org.muml.pim.constraint.impl.ConstraintPackageImpl#getVerifiableElement()
	 * @generated
	 */
	int VERIFIABLE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__ANNOTATIONS = CorePackage.EXTENDABLE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Verification Constraint Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORIES = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Verifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Verifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT_OPERATION_COUNT = CorePackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.muml.pim.constraint.VerificationConstraintRepository <em>Verification Constraint Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verification Constraint Repository</em>'.
	 * @see org.muml.pim.constraint.VerificationConstraintRepository
	 * @generated
	 */
	EClass getVerificationConstraintRepository();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.constraint.VerifiableElement <em>Verifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verifiable Element</em>'.
	 * @see org.muml.pim.constraint.VerifiableElement
	 * @generated
	 */
	EClass getVerifiableElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.constraint.VerifiableElement#getVerificationConstraintRepositories <em>Verification Constraint Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verification Constraint Repositories</em>'.
	 * @see org.muml.pim.constraint.VerifiableElement#getVerificationConstraintRepositories()
	 * @see #getVerifiableElement()
	 * @generated
	 */
	EReference getVerifiableElement_VerificationConstraintRepositories();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConstraintFactory getConstraintFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.pim.constraint.impl.VerificationConstraintRepositoryImpl <em>Verification Constraint Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.constraint.impl.VerificationConstraintRepositoryImpl
		 * @see org.muml.pim.constraint.impl.ConstraintPackageImpl#getVerificationConstraintRepository()
		 * @generated
		 */
		EClass VERIFICATION_CONSTRAINT_REPOSITORY = eINSTANCE.getVerificationConstraintRepository();

		/**
		 * The meta object literal for the '{@link org.muml.pim.constraint.impl.VerifiableElementImpl <em>Verifiable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.constraint.impl.VerifiableElementImpl
		 * @see org.muml.pim.constraint.impl.ConstraintPackageImpl#getVerifiableElement()
		 * @generated
		 */
		EClass VERIFIABLE_ELEMENT = eINSTANCE.getVerifiableElement();

		/**
		 * The meta object literal for the '<em><b>Verification Constraint Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORIES = eINSTANCE.getVerifiableElement_VerificationConstraintRepositories();

	}

} //ConstraintPackage
