/**
 * <copyright>
 * Copyright (c) 2014 Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT - initial API and implementation
 * </copyright>
 */
package org.muml.ontology;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
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
 * @see org.muml.ontology.OntologyFactory
 * @model kind="package"
 * @generated
 */
public interface OntologyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ontology";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/ontology/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ontology";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OntologyPackage eINSTANCE = org.muml.ontology.impl.OntologyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.ontology.impl.OntologyExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ontology.impl.OntologyExtensionImpl
	 * @see org.muml.ontology.impl.OntologyPackageImpl#getOntologyExtension()
	 * @generated
	 */
	int ONTOLOGY_EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_EXTENSION__ANNOTATIONS = CorePackage.EXTENSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_EXTENSION__EXTENSIONS = CorePackage.EXTENSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_EXTENSION__BASE = CorePackage.EXTENSION__BASE;

	/**
	 * The feature id for the '<em><b>Model Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_EXTENSION__MODEL_BASE = CorePackage.EXTENSION__MODEL_BASE;

	/**
	 * The feature id for the '<em><b>Owning Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_EXTENSION__OWNING_ANNOTATION = CorePackage.EXTENSION__OWNING_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_EXTENSION__EXTENDABLE_BASE = CorePackage.EXTENSION__EXTENDABLE_BASE;

	/**
	 * The feature id for the '<em><b>Ontology Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_EXTENSION__ONTOLOGY_REFERENCE = CorePackage.EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_EXTENSION_FEATURE_COUNT = CorePackage.EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_EXTENSION___GET_EXTENSION__ECLASS = CorePackage.EXTENSION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_EXTENSION_OPERATION_COUNT = CorePackage.EXTENSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.muml.ontology.OntologyExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see org.muml.ontology.OntologyExtension
	 * @generated
	 */
	EClass getOntologyExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ontology.OntologyExtension#getOntologyReference <em>Ontology Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ontology Reference</em>'.
	 * @see org.muml.ontology.OntologyExtension#getOntologyReference()
	 * @see #getOntologyExtension()
	 * @generated
	 */
	EAttribute getOntologyExtension_OntologyReference();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OntologyFactory getOntologyFactory();

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
		 * The meta object literal for the '{@link org.muml.ontology.impl.OntologyExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ontology.impl.OntologyExtensionImpl
		 * @see org.muml.ontology.impl.OntologyPackageImpl#getOntologyExtension()
		 * @generated
		 */
		EClass ONTOLOGY_EXTENSION = eINSTANCE.getOntologyExtension();

		/**
		 * The meta object literal for the '<em><b>Ontology Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY_EXTENSION__ONTOLOGY_REFERENCE = eINSTANCE.getOntologyExtension_OntologyReference();

	}

} //OntologyPackage
