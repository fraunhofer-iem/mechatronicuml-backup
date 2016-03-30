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

import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * This package defines all modeling elements in order to define Real-Time Coordination Patterns.
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.pattern.PatternFactory
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
	String eNS_URI = "http://www.fujaba.de/muml/pattern/0.3.18";

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
	PatternPackage eINSTANCE = de.uni_paderborn.fujaba.muml.pattern.impl.PatternPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.pattern.impl.AbstractCoordinationPatternImpl <em>Abstract Coordination Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.pattern.impl.AbstractCoordinationPatternImpl
	 * @see de.uni_paderborn.fujaba.muml.pattern.impl.PatternPackageImpl#getAbstractCoordinationPattern()
	 * @generated
	 */
	int ABSTRACT_COORDINATION_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN__ANNOTATION = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN__EXTENSION = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__EXTENSION;

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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN___ECLASS = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN___EIS_PROXY = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN___ERESOURCE = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN___ECONTAINER = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN___ECONTAINING_FEATURE = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN___ECONTAINMENT_FEATURE = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN___ECONTENTS = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN___EALL_CONTENTS = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN___ECROSS_REFERENCES = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN___EGET__ESTRUCTURALFEATURE = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN___EGET__ESTRUCTURALFEATURE_BOOLEAN = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN___ESET__ESTRUCTURALFEATURE_OBJECT = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN___EIS_SET__ESTRUCTURALFEATURE = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN___EUNSET__ESTRUCTURALFEATURE = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN___EINVOKE__EOPERATION_ELIST = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN___GET_EXTENSION__ECLASS = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN___PROVIDE_EXTENSION__ECLASS = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN___GET_ANNOTATION__STRING = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN___PROVIDE_ANNOTATION__STRING = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Abstract Coordination Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_PATTERN_OPERATION_COUNT = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.pattern.impl.CoordinationPatternImpl <em>Coordination Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.pattern.impl.CoordinationPatternImpl
	 * @see de.uni_paderborn.fujaba.muml.pattern.impl.PatternPackageImpl#getCoordinationPattern()
	 * @generated
	 */
	int COORDINATION_PATTERN = 4;

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.pattern.AbstractCoordinationPattern <em>Abstract Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Coordination Pattern</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.AbstractCoordinationPattern
	 * @generated
	 */
	EClass getAbstractCoordinationPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.pattern.AbstractCoordinationPattern#getVerifiedConfigurations <em>Verified Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verified Configurations</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.AbstractCoordinationPattern#getVerifiedConfigurations()
	 * @see #getAbstractCoordinationPattern()
	 * @generated
	 */
	EReference getAbstractCoordinationPattern_VerifiedConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.pattern.AbstractCoordinationPattern#getPatternParameters <em>Pattern Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pattern Parameters</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.AbstractCoordinationPattern#getPatternParameters()
	 * @see #getAbstractCoordinationPattern()
	 * @generated
	 */
	EReference getAbstractCoordinationPattern_PatternParameters();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.pattern.impl.DescriptionAspectsImpl <em>Description Aspects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.pattern.impl.DescriptionAspectsImpl
	 * @see de.uni_paderborn.fujaba.muml.pattern.impl.PatternPackageImpl#getDescriptionAspects()
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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.pattern.impl.VerifiedConfigurationImpl <em>Verified Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.pattern.impl.VerifiedConfigurationImpl
	 * @see de.uni_paderborn.fujaba.muml.pattern.impl.PatternPackageImpl#getVerifiedConfiguration()
	 * @generated
	 */
	int VERIFIED_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION___PROVIDE_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION___GET_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION___PROVIDE_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Verified Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_CONFIGURATION_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.pattern.impl.CoordinationPatternVariantImpl <em>Coordination Pattern Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.pattern.impl.CoordinationPatternVariantImpl
	 * @see de.uni_paderborn.fujaba.muml.pattern.impl.PatternPackageImpl#getCoordinationPatternVariant()
	 * @generated
	 */
	int COORDINATION_PATTERN_VARIANT = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT__ANNOTATION = ABSTRACT_COORDINATION_PATTERN__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT__EXTENSION = ABSTRACT_COORDINATION_PATTERN__EXTENSION;

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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT___ECLASS = ABSTRACT_COORDINATION_PATTERN___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT___EIS_PROXY = ABSTRACT_COORDINATION_PATTERN___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT___ERESOURCE = ABSTRACT_COORDINATION_PATTERN___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT___ECONTAINER = ABSTRACT_COORDINATION_PATTERN___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT___ECONTAINING_FEATURE = ABSTRACT_COORDINATION_PATTERN___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT___ECONTAINMENT_FEATURE = ABSTRACT_COORDINATION_PATTERN___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT___ECONTENTS = ABSTRACT_COORDINATION_PATTERN___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT___EALL_CONTENTS = ABSTRACT_COORDINATION_PATTERN___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT___ECROSS_REFERENCES = ABSTRACT_COORDINATION_PATTERN___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT___EGET__ESTRUCTURALFEATURE = ABSTRACT_COORDINATION_PATTERN___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_COORDINATION_PATTERN___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_COORDINATION_PATTERN___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_COORDINATION_PATTERN___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_COORDINATION_PATTERN___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT___EINVOKE__EOPERATION_ELIST = ABSTRACT_COORDINATION_PATTERN___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT___GET_EXTENSION__ECLASS = ABSTRACT_COORDINATION_PATTERN___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT___PROVIDE_EXTENSION__ECLASS = ABSTRACT_COORDINATION_PATTERN___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT___GET_ANNOTATION__STRING = ABSTRACT_COORDINATION_PATTERN___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT___PROVIDE_ANNOTATION__STRING = ABSTRACT_COORDINATION_PATTERN___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Coordination Pattern Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_VARIANT_OPERATION_COUNT = ABSTRACT_COORDINATION_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__ANNOTATION = ABSTRACT_COORDINATION_PATTERN__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__EXTENSION = ABSTRACT_COORDINATION_PATTERN__EXTENSION;

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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___ECLASS = ABSTRACT_COORDINATION_PATTERN___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___EIS_PROXY = ABSTRACT_COORDINATION_PATTERN___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___ERESOURCE = ABSTRACT_COORDINATION_PATTERN___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___ECONTAINER = ABSTRACT_COORDINATION_PATTERN___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___ECONTAINING_FEATURE = ABSTRACT_COORDINATION_PATTERN___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___ECONTAINMENT_FEATURE = ABSTRACT_COORDINATION_PATTERN___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___ECONTENTS = ABSTRACT_COORDINATION_PATTERN___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___EALL_CONTENTS = ABSTRACT_COORDINATION_PATTERN___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___ECROSS_REFERENCES = ABSTRACT_COORDINATION_PATTERN___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___EGET__ESTRUCTURALFEATURE = ABSTRACT_COORDINATION_PATTERN___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_COORDINATION_PATTERN___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_COORDINATION_PATTERN___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_COORDINATION_PATTERN___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_COORDINATION_PATTERN___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___EINVOKE__EOPERATION_ELIST = ABSTRACT_COORDINATION_PATTERN___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___GET_EXTENSION__ECLASS = ABSTRACT_COORDINATION_PATTERN___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___PROVIDE_EXTENSION__ECLASS = ABSTRACT_COORDINATION_PATTERN___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___GET_ANNOTATION__STRING = ABSTRACT_COORDINATION_PATTERN___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___PROVIDE_ANNOTATION__STRING = ABSTRACT_COORDINATION_PATTERN___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Coordination Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_OPERATION_COUNT = ABSTRACT_COORDINATION_PATTERN_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern <em>Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Pattern</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern
	 * @generated
	 */
	EClass getCoordinationPattern();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern#getDescriptionAspects <em>Description Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Aspects</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern#getDescriptionAspects()
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	EReference getCoordinationPattern_DescriptionAspects();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern#getPatternVariants <em>Pattern Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pattern Variants</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern#getPatternVariants()
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	EReference getCoordinationPattern_PatternVariants();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern#getCombineablePatterns <em>Combineable Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Combineable Patterns</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern#getCombineablePatterns()
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	EReference getCoordinationPattern_CombineablePatterns();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern#getAlternativePatterns <em>Alternative Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alternative Patterns</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern#getAlternativePatterns()
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	EReference getCoordinationPattern_AlternativePatterns();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects <em>Description Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Aspects</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects
	 * @generated
	 */
	EClass getDescriptionAspects();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getOverview <em>Overview</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overview</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getOverview()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Overview();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getContext()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Context();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getProblem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Problem</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getProblem()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Problem();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solution</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getSolution()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Solution();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Structure</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getStructure()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Structure();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getBehavior()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Behavior();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getExamples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Examples</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getExamples()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Examples();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getConsequences <em>Consequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consequences</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getConsequences()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Consequences();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getCombineability <em>Combineability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Combineability</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getCombineability()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Combineability();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getVariants <em>Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variants</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getVariants()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Variants();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternatives</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getAlternatives()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Alternatives();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getVerification_properties <em>Verification properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verification properties</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.DescriptionAspects#getVerification_properties()
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	EAttribute getDescriptionAspects_Verification_properties();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.pattern.VerifiedConfiguration <em>Verified Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verified Configuration</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.VerifiedConfiguration
	 * @generated
	 */
	EClass getVerifiedConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.pattern.VerifiedConfiguration#getParameterBindings <em>Parameter Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Bindings</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.VerifiedConfiguration#getParameterBindings()
	 * @see #getVerifiedConfiguration()
	 * @generated
	 */
	EReference getVerifiedConfiguration_ParameterBindings();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.pattern.VerifiedConfiguration#getCoordinationPattern <em>Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Coordination Pattern</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.VerifiedConfiguration#getCoordinationPattern()
	 * @see #getVerifiedConfiguration()
	 * @generated
	 */
	EReference getVerifiedConfiguration_CoordinationPattern();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.pattern.CoordinationPatternVariant <em>Coordination Pattern Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Pattern Variant</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.CoordinationPatternVariant
	 * @generated
	 */
	EClass getCoordinationPatternVariant();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.pattern.CoordinationPatternVariant#getOriginalPattern <em>Original Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Pattern</em>'.
	 * @see de.uni_paderborn.fujaba.muml.pattern.CoordinationPatternVariant#getOriginalPattern()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.pattern.impl.AbstractCoordinationPatternImpl <em>Abstract Coordination Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.pattern.impl.AbstractCoordinationPatternImpl
		 * @see de.uni_paderborn.fujaba.muml.pattern.impl.PatternPackageImpl#getAbstractCoordinationPattern()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.pattern.impl.CoordinationPatternImpl <em>Coordination Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.pattern.impl.CoordinationPatternImpl
		 * @see de.uni_paderborn.fujaba.muml.pattern.impl.PatternPackageImpl#getCoordinationPattern()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.pattern.impl.DescriptionAspectsImpl <em>Description Aspects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.pattern.impl.DescriptionAspectsImpl
		 * @see de.uni_paderborn.fujaba.muml.pattern.impl.PatternPackageImpl#getDescriptionAspects()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.pattern.impl.VerifiedConfigurationImpl <em>Verified Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.pattern.impl.VerifiedConfigurationImpl
		 * @see de.uni_paderborn.fujaba.muml.pattern.impl.PatternPackageImpl#getVerifiedConfiguration()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.pattern.impl.CoordinationPatternVariantImpl <em>Coordination Pattern Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.pattern.impl.CoordinationPatternVariantImpl
		 * @see de.uni_paderborn.fujaba.muml.pattern.impl.PatternPackageImpl#getCoordinationPatternVariant()
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
