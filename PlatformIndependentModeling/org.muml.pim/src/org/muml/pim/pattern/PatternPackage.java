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
package org.muml.pim.pattern;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.mumlcore.CorePackage;
import org.muml.pim.protocol.ProtocolPackage;

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
 * This package defines all modeling elements in order to define Real-Time Coordination Patterns.
 * <!-- end-model-doc -->
 * @see org.muml.pim.pattern.PatternFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface PatternPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pattern";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/pim/pattern/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pattern";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternPackage eINSTANCE = org.muml.pim.pattern.impl.PatternPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.pim.pattern.impl.AbstractCoordinationPatternImpl <em>Abstract Coordination Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.pattern.impl.AbstractCoordinationPatternImpl
	 * @see org.muml.pim.pattern.impl.PatternPackageImpl#getAbstractCoordinationPattern()
	 * @generated
	 */
	int ABSTRACT_COORDINATION_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN__EXTENSIONS = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN__NAME = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN__COMMENT = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__COMMENT;

	/**
	 * The feature id for the '<em><b>Verification Constraint Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN__VERIFICATION_CONSTRAINT_REPOSITORIES = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__VERIFICATION_CONSTRAINT_REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN__ROLES = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLES;

	/**
	 * The feature id for the '<em><b>Role Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN__ROLE_CONNECTOR = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Gmf Abstract Coordination Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN__GMF_ABSTRACT_COORDINATION_SPECIFICATION = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__GMF_ABSTRACT_COORDINATION_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Gmf Message Buffers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN__GMF_MESSAGE_BUFFERS = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__GMF_MESSAGE_BUFFERS;

	/**
	 * The feature id for the '<em><b>Gmf Connector Quality Of Service Assumptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN__GMF_CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__GMF_CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Adapted From Pattern</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN__ADAPTED_FROM_PATTERN = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ADAPTED_FROM_PATTERN;

	/**
	 * The feature id for the '<em><b>Verified Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN__VERIFIED_CONFIGURATIONS = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN__PATTERN_PARAMETERS = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Coordination Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN_FEATURE_COUNT = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN___GET_EXTENSION__ECLASS = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Abstract Coordination Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN_OPERATION_COUNT = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.pattern.impl.CoordinationPatternImpl <em>Coordination Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.pattern.impl.CoordinationPatternImpl
	 * @see org.muml.pim.pattern.impl.PatternPackageImpl#getCoordinationPattern()
	 * @generated
	 */
	int COORDINATION_PATTERN = 4;

	/**
	 * Returns the meta object for class '{@link org.muml.pim.pattern.AbstractCoordinationPattern <em>Abstract Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Coordination Pattern</em>'.
	 * @see org.muml.pim.pattern.AbstractCoordinationPattern
	 * @generated
	 */
	EClass getAbstractCoordinationPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.pattern.AbstractCoordinationPattern#getVerifiedConfigurations <em>Verified Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verified Configurations</em>'.
	 * @see org.muml.pim.pattern.AbstractCoordinationPattern#getVerifiedConfigurations()
	 * @see #getAbstractCoordinationPattern()
	 * @generated
	 */
	EReference getAbstractCoordinationPattern_VerifiedConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.pattern.AbstractCoordinationPattern#getPatternParameters <em>Pattern Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pattern Parameters</em>'.
	 * @see org.muml.pim.pattern.AbstractCoordinationPattern#getPatternParameters()
	 * @see #getAbstractCoordinationPattern()
	 * @generated
	 */
	EReference getAbstractCoordinationPattern_PatternParameters();

	/**
	 * The meta object id for the '{@link org.muml.pim.pattern.impl.DescriptionAspectsImpl <em>Description Aspects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.pattern.impl.DescriptionAspectsImpl
	 * @see org.muml.pim.pattern.impl.PatternPackageImpl#getDescriptionAspects()
	 * @generated
	 */
	int DESCRIPTION_ASPECTS = 1;

	/**
	 * The feature id for the '<em><b>Overview</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ASPECTS__OVERVIEW = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ASPECTS__CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ASPECTS__PROBLEM = 2;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ASPECTS__SOLUTION = 3;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ASPECTS__STRUCTURE = 4;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ASPECTS__BEHAVIOR = 5;

	/**
	 * The feature id for the '<em><b>Examples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ASPECTS__EXAMPLES = 6;

	/**
	 * The feature id for the '<em><b>Consequences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ASPECTS__CONSEQUENCES = 7;

	/**
	 * The feature id for the '<em><b>Combineability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ASPECTS__COMBINEABILITY = 8;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ASPECTS__VARIANTS = 9;

	/**
	 * The feature id for the '<em><b>Alternatives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ASPECTS__ALTERNATIVES = 10;

	/**
	 * The feature id for the '<em><b>Verification properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ASPECTS__VERIFICATION_PROPERTIES = 11;

	/**
	 * The number of structural features of the '<em>Description Aspects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ASPECTS_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Description Aspects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ASPECTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.pattern.impl.VerifiedConfigurationImpl <em>Verified Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.pattern.impl.VerifiedConfigurationImpl
	 * @see org.muml.pim.pattern.impl.PatternPackageImpl#getVerifiedConfiguration()
	 * @generated
	 */
	int VERIFIED_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION__PARAMETER_BINDINGS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Coordination Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION__COORDINATION_PATTERN = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Verified Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Verified Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.pattern.impl.CoordinationPatternVariantImpl <em>Coordination Pattern Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.pattern.impl.CoordinationPatternVariantImpl
	 * @see org.muml.pim.pattern.impl.PatternPackageImpl#getCoordinationPatternVariant()
	 * @generated
	 */
	int COORDINATION_PATTERN_VARIANT = 3;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT__EXTENSIONS = ABSTRACT_COORDINATION_PATTERN__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT__NAME = ABSTRACT_COORDINATION_PATTERN__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT__COMMENT = ABSTRACT_COORDINATION_PATTERN__COMMENT;

	/**
	 * The feature id for the '<em><b>Verification Constraint Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT__VERIFICATION_CONSTRAINT_REPOSITORIES = ABSTRACT_COORDINATION_PATTERN__VERIFICATION_CONSTRAINT_REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT__ROLES = ABSTRACT_COORDINATION_PATTERN__ROLES;

	/**
	 * The feature id for the '<em><b>Role Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT__ROLE_CONNECTOR = ABSTRACT_COORDINATION_PATTERN__ROLE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Gmf Abstract Coordination Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT__GMF_ABSTRACT_COORDINATION_SPECIFICATION = ABSTRACT_COORDINATION_PATTERN__GMF_ABSTRACT_COORDINATION_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Gmf Message Buffers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT__GMF_MESSAGE_BUFFERS = ABSTRACT_COORDINATION_PATTERN__GMF_MESSAGE_BUFFERS;

	/**
	 * The feature id for the '<em><b>Gmf Connector Quality Of Service Assumptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT__GMF_CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS = ABSTRACT_COORDINATION_PATTERN__GMF_CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Adapted From Pattern</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT__ADAPTED_FROM_PATTERN = ABSTRACT_COORDINATION_PATTERN__ADAPTED_FROM_PATTERN;

	/**
	 * The feature id for the '<em><b>Verified Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT__VERIFIED_CONFIGURATIONS = ABSTRACT_COORDINATION_PATTERN__VERIFIED_CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Pattern Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT__PATTERN_PARAMETERS = ABSTRACT_COORDINATION_PATTERN__PATTERN_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Original Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT__ORIGINAL_PATTERN = ABSTRACT_COORDINATION_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Coordination Pattern Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT_FEATURE_COUNT = ABSTRACT_COORDINATION_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT___GET_EXTENSION__ECLASS = ABSTRACT_COORDINATION_PATTERN___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Coordination Pattern Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT_OPERATION_COUNT = ABSTRACT_COORDINATION_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__EXTENSIONS = ABSTRACT_COORDINATION_PATTERN__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__NAME = ABSTRACT_COORDINATION_PATTERN__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__COMMENT = ABSTRACT_COORDINATION_PATTERN__COMMENT;

	/**
	 * The feature id for the '<em><b>Verification Constraint Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__VERIFICATION_CONSTRAINT_REPOSITORIES = ABSTRACT_COORDINATION_PATTERN__VERIFICATION_CONSTRAINT_REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__ROLES = ABSTRACT_COORDINATION_PATTERN__ROLES;

	/**
	 * The feature id for the '<em><b>Role Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__ROLE_CONNECTOR = ABSTRACT_COORDINATION_PATTERN__ROLE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Gmf Abstract Coordination Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__GMF_ABSTRACT_COORDINATION_SPECIFICATION = ABSTRACT_COORDINATION_PATTERN__GMF_ABSTRACT_COORDINATION_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Gmf Message Buffers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__GMF_MESSAGE_BUFFERS = ABSTRACT_COORDINATION_PATTERN__GMF_MESSAGE_BUFFERS;

	/**
	 * The feature id for the '<em><b>Gmf Connector Quality Of Service Assumptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__GMF_CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS = ABSTRACT_COORDINATION_PATTERN__GMF_CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Adapted From Pattern</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__ADAPTED_FROM_PATTERN = ABSTRACT_COORDINATION_PATTERN__ADAPTED_FROM_PATTERN;

	/**
	 * The feature id for the '<em><b>Verified Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__VERIFIED_CONFIGURATIONS = ABSTRACT_COORDINATION_PATTERN__VERIFIED_CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Pattern Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__PATTERN_PARAMETERS = ABSTRACT_COORDINATION_PATTERN__PATTERN_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Combineable Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__COMBINEABLE_PATTERNS = ABSTRACT_COORDINATION_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alternative Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__ALTERNATIVE_PATTERNS = ABSTRACT_COORDINATION_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description Aspects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__DESCRIPTION_ASPECTS = ABSTRACT_COORDINATION_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pattern Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__PATTERN_VARIANTS = ABSTRACT_COORDINATION_PATTERN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Coordination Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_FEATURE_COUNT = ABSTRACT_COORDINATION_PATTERN_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___GET_EXTENSION__ECLASS = ABSTRACT_COORDINATION_PATTERN___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Coordination Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_OPERATION_COUNT = ABSTRACT_COORDINATION_PATTERN_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.muml.pim.pattern.CoordinationPattern <em>Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Pattern</em>'.
	 * @see org.muml.pim.pattern.CoordinationPattern
	 * @generated
	 */
	EClass getCoordinationPattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.pattern.CoordinationPattern#getDescriptionAspects <em>Description Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Aspects</em>'.
	 * @see org.muml.pim.pattern.CoordinationPattern#getDescriptionAspects()
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	EReference getCoordinationPattern_DescriptionAspects();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.pattern.CoordinationPattern#getPatternVariants <em>Pattern Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pattern Variants</em>'.
	 * @see org.muml.pim.pattern.CoordinationPattern#getPatternVariants()
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	EReference getCoordinationPattern_PatternVariants();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.pattern.CoordinationPattern#getCombineablePatterns <em>Combineable Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Combineable Patterns</em>'.
	 * @see org.muml.pim.pattern.CoordinationPattern#getCombineablePatterns()
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	EReference getCoordinationPattern_CombineablePatterns();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.pattern.CoordinationPattern#getAlternativePatterns <em>Alternative Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alternative Patterns</em>'.
	 * @see org.muml.pim.pattern.CoordinationPattern#getAlternativePatterns()
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	EReference getCoordinationPattern_AlternativePatterns();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.pattern.DescriptionAspects <em>Description Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Aspects</em>'.
	 * @see org.muml.pim.pattern.DescriptionAspects
	 * @generated
	 */
	EClass getDescriptionAspects();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.pattern.DescriptionAspects#getOverview <em>Overview</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overview</em>'.
	 * @see org.muml.pim.pattern.DescriptionAspects#getOverview()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Overview();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.pattern.DescriptionAspects#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org.muml.pim.pattern.DescriptionAspects#getContext()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.pattern.DescriptionAspects#getProblem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Problem</em>'.
	 * @see org.muml.pim.pattern.DescriptionAspects#getProblem()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Problem();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.pattern.DescriptionAspects#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solution</em>'.
	 * @see org.muml.pim.pattern.DescriptionAspects#getSolution()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Solution();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.pattern.DescriptionAspects#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Structure</em>'.
	 * @see org.muml.pim.pattern.DescriptionAspects#getStructure()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Structure();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.pattern.DescriptionAspects#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior</em>'.
	 * @see org.muml.pim.pattern.DescriptionAspects#getBehavior()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Behavior();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.pattern.DescriptionAspects#getExamples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Examples</em>'.
	 * @see org.muml.pim.pattern.DescriptionAspects#getExamples()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Examples();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.pattern.DescriptionAspects#getConsequences <em>Consequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consequences</em>'.
	 * @see org.muml.pim.pattern.DescriptionAspects#getConsequences()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Consequences();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.pattern.DescriptionAspects#getCombineability <em>Combineability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Combineability</em>'.
	 * @see org.muml.pim.pattern.DescriptionAspects#getCombineability()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Combineability();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.pattern.DescriptionAspects#getVariants <em>Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variants</em>'.
	 * @see org.muml.pim.pattern.DescriptionAspects#getVariants()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Variants();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.pattern.DescriptionAspects#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternatives</em>'.
	 * @see org.muml.pim.pattern.DescriptionAspects#getAlternatives()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Alternatives();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.pattern.DescriptionAspects#getVerification_properties <em>Verification properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verification properties</em>'.
	 * @see org.muml.pim.pattern.DescriptionAspects#getVerification_properties()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Verification_properties();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.pattern.VerifiedConfiguration <em>Verified Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verified Configuration</em>'.
	 * @see org.muml.pim.pattern.VerifiedConfiguration
	 * @generated
	 */
	EClass getVerifiedConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.pattern.VerifiedConfiguration#getParameterBindings <em>Parameter Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Bindings</em>'.
	 * @see org.muml.pim.pattern.VerifiedConfiguration#getParameterBindings()
	 * @see #getVerifiedConfiguration()
	 * @generated
	 */
	EReference getVerifiedConfiguration_ParameterBindings();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pim.pattern.VerifiedConfiguration#getCoordinationPattern <em>Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Coordination Pattern</em>'.
	 * @see org.muml.pim.pattern.VerifiedConfiguration#getCoordinationPattern()
	 * @see #getVerifiedConfiguration()
	 * @generated
	 */
	EReference getVerifiedConfiguration_CoordinationPattern();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.pattern.CoordinationPatternVariant <em>Coordination Pattern Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Pattern Variant</em>'.
	 * @see org.muml.pim.pattern.CoordinationPatternVariant
	 * @generated
	 */
	EClass getCoordinationPatternVariant();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.pattern.CoordinationPatternVariant#getOriginalPattern <em>Original Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Pattern</em>'.
	 * @see org.muml.pim.pattern.CoordinationPatternVariant#getOriginalPattern()
	 * @see #getCoordinationPatternVariant()
	 * @generated
	 */
	EReference getCoordinationPatternVariant_OriginalPattern();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PatternFactory getPatternFactory();

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
		 * The meta object literal for the '{@link org.muml.pim.pattern.impl.AbstractCoordinationPatternImpl <em>Abstract Coordination Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.pattern.impl.AbstractCoordinationPatternImpl
		 * @see org.muml.pim.pattern.impl.PatternPackageImpl#getAbstractCoordinationPattern()
		 * @generated
		 */
		EClass ABSTRACT_COORDINATION_PATTERN = eINSTANCE.getAbstractCoordinationPattern();

		/**
		 * The meta object literal for the '<em><b>Verified Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COORDINATION_PATTERN__VERIFIED_CONFIGURATIONS = eINSTANCE.getAbstractCoordinationPattern_VerifiedConfigurations();

		/**
		 * The meta object literal for the '<em><b>Pattern Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COORDINATION_PATTERN__PATTERN_PARAMETERS = eINSTANCE.getAbstractCoordinationPattern_PatternParameters();

		/**
		 * The meta object literal for the '{@link org.muml.pim.pattern.impl.CoordinationPatternImpl <em>Coordination Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.pattern.impl.CoordinationPatternImpl
		 * @see org.muml.pim.pattern.impl.PatternPackageImpl#getCoordinationPattern()
		 * @generated
		 */
		EClass COORDINATION_PATTERN = eINSTANCE.getCoordinationPattern();

		/**
		 * The meta object literal for the '<em><b>Description Aspects</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PATTERN__DESCRIPTION_ASPECTS = eINSTANCE.getCoordinationPattern_DescriptionAspects();

		/**
		 * The meta object literal for the '<em><b>Pattern Variants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PATTERN__PATTERN_VARIANTS = eINSTANCE.getCoordinationPattern_PatternVariants();

		/**
		 * The meta object literal for the '<em><b>Combineable Patterns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PATTERN__COMBINEABLE_PATTERNS = eINSTANCE.getCoordinationPattern_CombineablePatterns();

		/**
		 * The meta object literal for the '<em><b>Alternative Patterns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PATTERN__ALTERNATIVE_PATTERNS = eINSTANCE.getCoordinationPattern_AlternativePatterns();

		/**
		 * The meta object literal for the '{@link org.muml.pim.pattern.impl.DescriptionAspectsImpl <em>Description Aspects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.pattern.impl.DescriptionAspectsImpl
		 * @see org.muml.pim.pattern.impl.PatternPackageImpl#getDescriptionAspects()
		 * @generated
		 */
		EClass DESCRIPTION_ASPECTS = eINSTANCE.getDescriptionAspects();

		/**
		 * The meta object literal for the '<em><b>Overview</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_ASPECTS__OVERVIEW = eINSTANCE.getDescriptionAspects_Overview();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_ASPECTS__CONTEXT = eINSTANCE.getDescriptionAspects_Context();

		/**
		 * The meta object literal for the '<em><b>Problem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_ASPECTS__PROBLEM = eINSTANCE.getDescriptionAspects_Problem();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_ASPECTS__SOLUTION = eINSTANCE.getDescriptionAspects_Solution();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_ASPECTS__STRUCTURE = eINSTANCE.getDescriptionAspects_Structure();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_ASPECTS__BEHAVIOR = eINSTANCE.getDescriptionAspects_Behavior();

		/**
		 * The meta object literal for the '<em><b>Examples</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_ASPECTS__EXAMPLES = eINSTANCE.getDescriptionAspects_Examples();

		/**
		 * The meta object literal for the '<em><b>Consequences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_ASPECTS__CONSEQUENCES = eINSTANCE.getDescriptionAspects_Consequences();

		/**
		 * The meta object literal for the '<em><b>Combineability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_ASPECTS__COMBINEABILITY = eINSTANCE.getDescriptionAspects_Combineability();

		/**
		 * The meta object literal for the '<em><b>Variants</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_ASPECTS__VARIANTS = eINSTANCE.getDescriptionAspects_Variants();

		/**
		 * The meta object literal for the '<em><b>Alternatives</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_ASPECTS__ALTERNATIVES = eINSTANCE.getDescriptionAspects_Alternatives();

		/**
		 * The meta object literal for the '<em><b>Verification properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_ASPECTS__VERIFICATION_PROPERTIES = eINSTANCE.getDescriptionAspects_Verification_properties();

		/**
		 * The meta object literal for the '{@link org.muml.pim.pattern.impl.VerifiedConfigurationImpl <em>Verified Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.pattern.impl.VerifiedConfigurationImpl
		 * @see org.muml.pim.pattern.impl.PatternPackageImpl#getVerifiedConfiguration()
		 * @generated
		 */
		EClass VERIFIED_CONFIGURATION = eINSTANCE.getVerifiedConfiguration();

		/**
		 * The meta object literal for the '<em><b>Parameter Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFIED_CONFIGURATION__PARAMETER_BINDINGS = eINSTANCE.getVerifiedConfiguration_ParameterBindings();

		/**
		 * The meta object literal for the '<em><b>Coordination Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFIED_CONFIGURATION__COORDINATION_PATTERN = eINSTANCE.getVerifiedConfiguration_CoordinationPattern();

		/**
		 * The meta object literal for the '{@link org.muml.pim.pattern.impl.CoordinationPatternVariantImpl <em>Coordination Pattern Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.pattern.impl.CoordinationPatternVariantImpl
		 * @see org.muml.pim.pattern.impl.PatternPackageImpl#getCoordinationPatternVariant()
		 * @generated
		 */
		EClass COORDINATION_PATTERN_VARIANT = eINSTANCE.getCoordinationPatternVariant();

		/**
		 * The meta object literal for the '<em><b>Original Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PATTERN_VARIANT__ORIGINAL_PATTERN = eINSTANCE.getCoordinationPatternVariant_OriginalPattern();

	}

} //PatternPackage
