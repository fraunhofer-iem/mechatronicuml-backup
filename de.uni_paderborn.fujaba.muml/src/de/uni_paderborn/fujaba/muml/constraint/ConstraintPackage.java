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
package de.uni_paderborn.fujaba.muml.constraint;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.core.CorePackage;

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
 * @see de.uni_paderborn.fujaba.muml.constraint.ConstraintFactory
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
	String eNS_URI = "http://www.fujaba.de/muml/constraint/0.4.0";

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
	ConstraintPackage eINSTANCE = de.uni_paderborn.fujaba.muml.constraint.impl.ConstraintPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.constraint.impl.VerificationConstraintRepositoryImpl <em>Verification Constraint Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.constraint.impl.VerificationConstraintRepositoryImpl
	 * @see de.uni_paderborn.fujaba.muml.constraint.impl.ConstraintPackageImpl#getVerificationConstraintRepository()
	 * @generated
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Verification Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY__VERIFICATION_CONSTRAINT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Verification Constraint Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY___ECLASS = CorePackage.EXTENDABLE_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY___EIS_PROXY = CorePackage.EXTENDABLE_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY___ERESOURCE = CorePackage.EXTENDABLE_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY___ECONTAINER = CorePackage.EXTENDABLE_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY___ECONTAINING_FEATURE = CorePackage.EXTENDABLE_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY___ECONTAINMENT_FEATURE = CorePackage.EXTENDABLE_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY___ECONTENTS = CorePackage.EXTENDABLE_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY___EALL_CONTENTS = CorePackage.EXTENDABLE_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY___ECROSS_REFERENCES = CorePackage.EXTENDABLE_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY___EGET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.EXTENDABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY___EIS_SET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY___EUNSET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY___EINVOKE__EOPERATION_ELIST = CorePackage.EXTENDABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY___GET_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY___PROVIDE_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY___GET_ANNOTATION__STRING = CorePackage.EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY___PROVIDE_ANNOTATION__STRING = CorePackage.EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Verification Constraint Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_REPOSITORY_OPERATION_COUNT = CorePackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.constraint.impl.VerifiableElementImpl <em>Verifiable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.constraint.impl.VerifiableElementImpl
	 * @see de.uni_paderborn.fujaba.muml.constraint.impl.ConstraintPackageImpl#getVerifiableElement()
	 * @generated
	 */
	int VERIFIABLE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Verification Constraint Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Verifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Verifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.constraint.impl.VerificationConstraintImpl <em>Verification Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.constraint.impl.VerificationConstraintImpl
	 * @see de.uni_paderborn.fujaba.muml.constraint.impl.ConstraintPackageImpl#getVerificationConstraint()
	 * @generated
	 */
	int VERIFICATION_CONSTRAINT = 2;

	/**
	 * The number of structural features of the '<em>Verification Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Verification Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_CONSTRAINT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.constraint.VerificationConstraintRepository <em>Verification Constraint Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verification Constraint Repository</em>'.
	 * @see de.uni_paderborn.fujaba.muml.constraint.VerificationConstraintRepository
	 * @generated
	 */
	EClass getVerificationConstraintRepository();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.constraint.VerificationConstraintRepository#getVerificationConstraint <em>Verification Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verification Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.muml.constraint.VerificationConstraintRepository#getVerificationConstraint()
	 * @see #getVerificationConstraintRepository()
	 * @generated
	 */
	EReference getVerificationConstraintRepository_VerificationConstraint();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.constraint.VerifiableElement <em>Verifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verifiable Element</em>'.
	 * @see de.uni_paderborn.fujaba.muml.constraint.VerifiableElement
	 * @generated
	 */
	EClass getVerifiableElement();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.constraint.VerifiableElement#getVerificationConstraintRepository <em>Verification Constraint Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verification Constraint Repository</em>'.
	 * @see de.uni_paderborn.fujaba.muml.constraint.VerifiableElement#getVerificationConstraintRepository()
	 * @see #getVerifiableElement()
	 * @generated
	 */
	EReference getVerifiableElement_VerificationConstraintRepository();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.constraint.VerificationConstraint <em>Verification Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verification Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.muml.constraint.VerificationConstraint
	 * @generated
	 */
	EClass getVerificationConstraint();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.constraint.impl.VerificationConstraintRepositoryImpl <em>Verification Constraint Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.constraint.impl.VerificationConstraintRepositoryImpl
		 * @see de.uni_paderborn.fujaba.muml.constraint.impl.ConstraintPackageImpl#getVerificationConstraintRepository()
		 * @generated
		 */
		EClass VERIFICATION_CONSTRAINT_REPOSITORY = eINSTANCE.getVerificationConstraintRepository();

		/**
		 * The meta object literal for the '<em><b>Verification Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION_CONSTRAINT_REPOSITORY__VERIFICATION_CONSTRAINT = eINSTANCE.getVerificationConstraintRepository_VerificationConstraint();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.constraint.impl.VerifiableElementImpl <em>Verifiable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.constraint.impl.VerifiableElementImpl
		 * @see de.uni_paderborn.fujaba.muml.constraint.impl.ConstraintPackageImpl#getVerifiableElement()
		 * @generated
		 */
		EClass VERIFIABLE_ELEMENT = eINSTANCE.getVerifiableElement();

		/**
		 * The meta object literal for the '<em><b>Verification Constraint Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORY = eINSTANCE.getVerifiableElement_VerificationConstraintRepository();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.constraint.impl.VerificationConstraintImpl <em>Verification Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.constraint.impl.VerificationConstraintImpl
		 * @see de.uni_paderborn.fujaba.muml.constraint.impl.ConstraintPackageImpl#getVerificationConstraint()
		 * @generated
		 */
		EClass VERIFICATION_CONSTRAINT = eINSTANCE.getVerificationConstraint();

	}

} //ConstraintPackage
