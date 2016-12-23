/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.patterns;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.core.CorePackage;
import org.muml.storydiagram.StorydiagramPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This package contains all classes for modeling story patterns that may be 
 * embedded into StoryActivityNodes of an Activity.
 * <!-- end-model-doc -->
 * @see org.muml.storydiagram.patterns.PatternsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface PatternsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "patterns";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/storydiagram/patterns/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sdp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternsPackage eINSTANCE = org.muml.storydiagram.patterns.impl.PatternsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.patterns.impl.AbstractVariableImpl <em>Abstract Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.patterns.impl.AbstractVariableImpl
	 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getAbstractVariable()
	 * @generated
	 */
	int ABSTRACT_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE__EXTENSIONS = StorydiagramPackage.VARIABLE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE__GENERIC_TYPE = StorydiagramPackage.VARIABLE__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE__CLASSIFIER = StorydiagramPackage.VARIABLE__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE__VARIABLE_NAME = StorydiagramPackage.VARIABLE__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE__NAME = StorydiagramPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE__PATTERN = StorydiagramPackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Binding State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE__BINDING_STATE = StorydiagramPackage.VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Binding Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE__BINDING_EXPRESSION = StorydiagramPackage.VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE__CONSTRAINTS = StorydiagramPackage.VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE__INCOMING_LINKS = StorydiagramPackage.VARIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Abstract Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE_FEATURE_COUNT = StorydiagramPackage.VARIABLE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE___GET_EXTENSION__ECLASS = StorydiagramPackage.VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Set Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE___SET_CLASSIFIER__ECLASSIFIER = StorydiagramPackage.VARIABLE___SET_CLASSIFIER__ECLASSIFIER;

	/**
	 * The number of operations of the '<em>Abstract Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE_OPERATION_COUNT = StorydiagramPackage.VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.patterns.impl.ObjectVariableImpl <em>Object Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.patterns.impl.ObjectVariableImpl
	 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getObjectVariable()
	 * @generated
	 */
	int OBJECT_VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__EXTENSIONS = ABSTRACT_VARIABLE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__GENERIC_TYPE = ABSTRACT_VARIABLE__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__CLASSIFIER = ABSTRACT_VARIABLE__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__VARIABLE_NAME = ABSTRACT_VARIABLE__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__NAME = ABSTRACT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__PATTERN = ABSTRACT_VARIABLE__PATTERN;

	/**
	 * The feature id for the '<em><b>Binding State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__BINDING_STATE = ABSTRACT_VARIABLE__BINDING_STATE;

	/**
	 * The feature id for the '<em><b>Binding Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__BINDING_EXPRESSION = ABSTRACT_VARIABLE__BINDING_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__CONSTRAINTS = ABSTRACT_VARIABLE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__INCOMING_LINKS = ABSTRACT_VARIABLE__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__OUTGOING_LINKS = ABSTRACT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link Order Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__LINK_ORDER_CONSTRAINTS = ABSTRACT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__BINDING_SEMANTICS = ABSTRACT_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__BINDING_OPERATOR = ABSTRACT_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attribute Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENTS = ABSTRACT_VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Object Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_FEATURE_COUNT = ABSTRACT_VARIABLE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE___GET_EXTENSION__ECLASS = ABSTRACT_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Set Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE___SET_CLASSIFIER__ECLASSIFIER = ABSTRACT_VARIABLE___SET_CLASSIFIER__ECLASSIFIER;

	/**
	 * The number of operations of the '<em>Object Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_OPERATION_COUNT = ABSTRACT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.patterns.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.patterns.impl.ConstraintImpl
	 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Constraint Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINT_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Object Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OBJECT_VARIABLE = 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.patterns.impl.AbstractLinkVariableImpl <em>Abstract Link Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.patterns.impl.AbstractLinkVariableImpl
	 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getAbstractLinkVariable()
	 * @generated
	 */
	int ABSTRACT_LINK_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE__SOURCE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Second Link Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>First Link Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE__PATTERN = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE__TARGET = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Abstract Link Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Abstract Link Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.patterns.impl.LinkConstraintImpl <em>Link Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.patterns.impl.LinkConstraintImpl
	 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getLinkConstraint()
	 * @generated
	 */
	int LINK_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT__INDEX = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT__CONSTRAINT_TYPE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT__NEGATIVE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>First Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT__FIRST_LINK = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Referencing Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT__REFERENCING_OBJECT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Second Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT__SECOND_LINK = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Link Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT___GET_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Link Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT_OPERATION_COUNT = CorePackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.patterns.impl.AttributeAssignmentImpl <em>Attribute Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.patterns.impl.AttributeAssignmentImpl
	 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getAttributeAssignment()
	 * @generated
	 */
	int ATTRIBUTE_ASSIGNMENT = 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Object Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE = 2;

	/**
	 * The number of structural features of the '<em>Attribute Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attribute Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.patterns.impl.CollectionVariableImpl <em>Collection Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.patterns.impl.CollectionVariableImpl
	 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getCollectionVariable()
	 * @generated
	 */
	int COLLECTION_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__EXTENSIONS = OBJECT_VARIABLE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__GENERIC_TYPE = OBJECT_VARIABLE__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__CLASSIFIER = OBJECT_VARIABLE__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__VARIABLE_NAME = OBJECT_VARIABLE__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__NAME = OBJECT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__PATTERN = OBJECT_VARIABLE__PATTERN;

	/**
	 * The feature id for the '<em><b>Binding State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__BINDING_STATE = OBJECT_VARIABLE__BINDING_STATE;

	/**
	 * The feature id for the '<em><b>Binding Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__BINDING_EXPRESSION = OBJECT_VARIABLE__BINDING_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__CONSTRAINTS = OBJECT_VARIABLE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__INCOMING_LINKS = OBJECT_VARIABLE__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__OUTGOING_LINKS = OBJECT_VARIABLE__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Link Order Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__LINK_ORDER_CONSTRAINTS = OBJECT_VARIABLE__LINK_ORDER_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__BINDING_SEMANTICS = OBJECT_VARIABLE__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__BINDING_OPERATOR = OBJECT_VARIABLE__BINDING_OPERATOR;

	/**
	 * The feature id for the '<em><b>Attribute Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__ATTRIBUTE_ASSIGNMENTS = OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>At Least One</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__AT_LEAST_ONE = OBJECT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__UNIQUE = OBJECT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collection Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE_FEATURE_COUNT = OBJECT_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE___GET_EXTENSION__ECLASS = OBJECT_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Set Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE___SET_CLASSIFIER__ECLASSIFIER = OBJECT_VARIABLE___SET_CLASSIFIER__ECLASSIFIER;

	/**
	 * The number of operations of the '<em>Collection Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE_OPERATION_COUNT = OBJECT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.patterns.impl.PrimitiveVariableImpl <em>Primitive Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.patterns.impl.PrimitiveVariableImpl
	 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getPrimitiveVariable()
	 * @generated
	 */
	int PRIMITIVE_VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__EXTENSIONS = ABSTRACT_VARIABLE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__GENERIC_TYPE = ABSTRACT_VARIABLE__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__CLASSIFIER = ABSTRACT_VARIABLE__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__VARIABLE_NAME = ABSTRACT_VARIABLE__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__NAME = ABSTRACT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__PATTERN = ABSTRACT_VARIABLE__PATTERN;

	/**
	 * The feature id for the '<em><b>Binding State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__BINDING_STATE = ABSTRACT_VARIABLE__BINDING_STATE;

	/**
	 * The feature id for the '<em><b>Binding Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__BINDING_EXPRESSION = ABSTRACT_VARIABLE__BINDING_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__CONSTRAINTS = ABSTRACT_VARIABLE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__INCOMING_LINKS = ABSTRACT_VARIABLE__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__DATA_TYPE = ABSTRACT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_FEATURE_COUNT = ABSTRACT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE___GET_EXTENSION__ECLASS = ABSTRACT_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Set Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE___SET_CLASSIFIER__ECLASSIFIER = ABSTRACT_VARIABLE___SET_CLASSIFIER__ECLASSIFIER;

	/**
	 * The number of operations of the '<em>Primitive Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_OPERATION_COUNT = ABSTRACT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.patterns.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.patterns.impl.PathImpl
	 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 8;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__EXTENSIONS = ABSTRACT_LINK_VARIABLE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__NAME = ABSTRACT_LINK_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__BINDING_SEMANTICS = ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__BINDING_OPERATOR = ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__SOURCE = ABSTRACT_LINK_VARIABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Second Link Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__SECOND_LINK_CONSTRAINTS = ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>First Link Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__FIRST_LINK_CONSTRAINTS = ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__PATTERN = ABSTRACT_LINK_VARIABLE__PATTERN;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__TARGET = ABSTRACT_LINK_VARIABLE__TARGET;

	/**
	 * The feature id for the '<em><b>Path Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__PATH_EXPRESSION = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___GET_EXTENSION__ECLASS = ABSTRACT_LINK_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = ABSTRACT_LINK_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.patterns.impl.LinkVariableImpl <em>Link Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.patterns.impl.LinkVariableImpl
	 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getLinkVariable()
	 * @generated
	 */
	int LINK_VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__EXTENSIONS = ABSTRACT_LINK_VARIABLE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__NAME = ABSTRACT_LINK_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__BINDING_SEMANTICS = ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__BINDING_OPERATOR = ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__SOURCE = ABSTRACT_LINK_VARIABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Second Link Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__SECOND_LINK_CONSTRAINTS = ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>First Link Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__FIRST_LINK_CONSTRAINTS = ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__PATTERN = ABSTRACT_LINK_VARIABLE__PATTERN;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__TARGET = ABSTRACT_LINK_VARIABLE__TARGET;

	/**
	 * The feature id for the '<em><b>Source End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__SOURCE_END = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__TARGET_END = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qualifier Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__QUALIFIER_EXPRESSION = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Link Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE_FEATURE_COUNT = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE___GET_EXTENSION__ECLASS = ABSTRACT_LINK_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Link Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE_OPERATION_COUNT = ABSTRACT_LINK_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.patterns.impl.InclusionLinkImpl <em>Inclusion Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.patterns.impl.InclusionLinkImpl
	 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getInclusionLink()
	 * @generated
	 */
	int INCLUSION_LINK = 10;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK__EXTENSIONS = ABSTRACT_LINK_VARIABLE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK__NAME = ABSTRACT_LINK_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK__BINDING_SEMANTICS = ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK__BINDING_OPERATOR = ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK__SOURCE = ABSTRACT_LINK_VARIABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Second Link Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK__SECOND_LINK_CONSTRAINTS = ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>First Link Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK__FIRST_LINK_CONSTRAINTS = ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK__PATTERN = ABSTRACT_LINK_VARIABLE__PATTERN;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK__TARGET = ABSTRACT_LINK_VARIABLE__TARGET;

	/**
	 * The number of structural features of the '<em>Inclusion Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK_FEATURE_COUNT = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK___GET_EXTENSION__ECLASS = ABSTRACT_LINK_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Inclusion Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK_OPERATION_COUNT = ABSTRACT_LINK_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.patterns.impl.StoryPatternImpl <em>Story Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.patterns.impl.StoryPatternImpl
	 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getStoryPattern()
	 * @generated
	 */
	int STORY_PATTERN = 13;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__VARIABLES = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__CONSTRAINTS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Link Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__LINK_VARIABLES = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__PARENT_PATTERN = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contained Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__CONTAINED_PATTERNS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__BINDING_SEMANTICS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__TEMPLATE_SIGNATURE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Story Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Story Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.patterns.impl.MatchingPatternImpl <em>Matching Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.patterns.impl.MatchingPatternImpl
	 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getMatchingPattern()
	 * @generated
	 */
	int MATCHING_PATTERN = 11;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN__EXTENSIONS = STORY_PATTERN__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN__COMMENT = STORY_PATTERN__COMMENT;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN__VARIABLES = STORY_PATTERN__VARIABLES;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN__CONSTRAINTS = STORY_PATTERN__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Link Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN__LINK_VARIABLES = STORY_PATTERN__LINK_VARIABLES;

	/**
	 * The feature id for the '<em><b>Parent Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN__PARENT_PATTERN = STORY_PATTERN__PARENT_PATTERN;

	/**
	 * The feature id for the '<em><b>Contained Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN__CONTAINED_PATTERNS = STORY_PATTERN__CONTAINED_PATTERNS;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN__BINDING_SEMANTICS = STORY_PATTERN__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN__TEMPLATE_SIGNATURE = STORY_PATTERN__TEMPLATE_SIGNATURE;

	/**
	 * The number of structural features of the '<em>Matching Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN_FEATURE_COUNT = STORY_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN___GET_EXTENSION__ECLASS = STORY_PATTERN___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>No Modifier In Matching Pattern</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN___NO_MODIFIER_IN_MATCHING_PATTERN__DIAGNOSTICCHAIN_MAP = STORY_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Matching Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN_OPERATION_COUNT = STORY_PATTERN_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.patterns.impl.MaybeLinkImpl <em>Maybe Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.patterns.impl.MaybeLinkImpl
	 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getMaybeLink()
	 * @generated
	 */
	int MAYBE_LINK = 12;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK__EXTENSIONS = ABSTRACT_LINK_VARIABLE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK__NAME = ABSTRACT_LINK_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK__BINDING_SEMANTICS = ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK__BINDING_OPERATOR = ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK__SOURCE = ABSTRACT_LINK_VARIABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Second Link Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK__SECOND_LINK_CONSTRAINTS = ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>First Link Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK__FIRST_LINK_CONSTRAINTS = ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK__PATTERN = ABSTRACT_LINK_VARIABLE__PATTERN;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK__TARGET = ABSTRACT_LINK_VARIABLE__TARGET;

	/**
	 * The number of structural features of the '<em>Maybe Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK_FEATURE_COUNT = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK___GET_EXTENSION__ECLASS = ABSTRACT_LINK_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Maybe Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK_OPERATION_COUNT = ABSTRACT_LINK_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.patterns.BindingState <em>Binding State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.patterns.BindingState
	 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getBindingState()
	 * @generated
	 */
	int BINDING_STATE = 14;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.patterns.BindingSemantics <em>Binding Semantics</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.patterns.BindingSemantics
	 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getBindingSemantics()
	 * @generated
	 */
	int BINDING_SEMANTICS = 15;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.patterns.BindingOperator <em>Binding Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.patterns.BindingOperator
	 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getBindingOperator()
	 * @generated
	 */
	int BINDING_OPERATOR = 16;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.patterns.LinkConstraintType <em>Link Constraint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.patterns.LinkConstraintType
	 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getLinkConstraintType()
	 * @generated
	 */
	int LINK_CONSTRAINT_TYPE = 17;

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.patterns.ObjectVariable <em>Object Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Variable</em>'.
	 * @see org.muml.storydiagram.patterns.ObjectVariable
	 * @generated
	 */
	EClass getObjectVariable();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.storydiagram.patterns.ObjectVariable#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Links</em>'.
	 * @see org.muml.storydiagram.patterns.ObjectVariable#getOutgoingLinks()
	 * @see #getObjectVariable()
	 * @generated
	 */
	EReference getObjectVariable_OutgoingLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.storydiagram.patterns.ObjectVariable#getLinkOrderConstraints <em>Link Order Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Order Constraints</em>'.
	 * @see org.muml.storydiagram.patterns.ObjectVariable#getLinkOrderConstraints()
	 * @see #getObjectVariable()
	 * @generated
	 */
	EReference getObjectVariable_LinkOrderConstraints();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.patterns.ObjectVariable#getBindingSemantics <em>Binding Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Semantics</em>'.
	 * @see org.muml.storydiagram.patterns.ObjectVariable#getBindingSemantics()
	 * @see #getObjectVariable()
	 * @generated
	 */
	EAttribute getObjectVariable_BindingSemantics();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.patterns.ObjectVariable#getBindingOperator <em>Binding Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Operator</em>'.
	 * @see org.muml.storydiagram.patterns.ObjectVariable#getBindingOperator()
	 * @see #getObjectVariable()
	 * @generated
	 */
	EAttribute getObjectVariable_BindingOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.storydiagram.patterns.ObjectVariable#getAttributeAssignments <em>Attribute Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Assignments</em>'.
	 * @see org.muml.storydiagram.patterns.ObjectVariable#getAttributeAssignments()
	 * @see #getObjectVariable()
	 * @generated
	 */
	EReference getObjectVariable_AttributeAssignments();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.patterns.AbstractVariable <em>Abstract Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Variable</em>'.
	 * @see org.muml.storydiagram.patterns.AbstractVariable
	 * @generated
	 */
	EClass getAbstractVariable();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.storydiagram.patterns.AbstractVariable#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pattern</em>'.
	 * @see org.muml.storydiagram.patterns.AbstractVariable#getPattern()
	 * @see #getAbstractVariable()
	 * @generated
	 */
	EReference getAbstractVariable_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.patterns.AbstractVariable#getBindingState <em>Binding State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding State</em>'.
	 * @see org.muml.storydiagram.patterns.AbstractVariable#getBindingState()
	 * @see #getAbstractVariable()
	 * @generated
	 */
	EAttribute getAbstractVariable_BindingState();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.storydiagram.patterns.AbstractVariable#getBindingExpression <em>Binding Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Expression</em>'.
	 * @see org.muml.storydiagram.patterns.AbstractVariable#getBindingExpression()
	 * @see #getAbstractVariable()
	 * @generated
	 */
	EReference getAbstractVariable_BindingExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.storydiagram.patterns.AbstractVariable#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.muml.storydiagram.patterns.AbstractVariable#getConstraints()
	 * @see #getAbstractVariable()
	 * @generated
	 */
	EReference getAbstractVariable_Constraints();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.storydiagram.patterns.AbstractVariable#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Links</em>'.
	 * @see org.muml.storydiagram.patterns.AbstractVariable#getIncomingLinks()
	 * @see #getAbstractVariable()
	 * @generated
	 */
	EReference getAbstractVariable_IncomingLinks();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.patterns.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.muml.storydiagram.patterns.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.storydiagram.patterns.Constraint#getConstraintExpression <em>Constraint Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint Expression</em>'.
	 * @see org.muml.storydiagram.patterns.Constraint#getConstraintExpression()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_ConstraintExpression();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.storydiagram.patterns.Constraint#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pattern</em>'.
	 * @see org.muml.storydiagram.patterns.Constraint#getPattern()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Pattern();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.storydiagram.patterns.Constraint#getObjectVariable <em>Object Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Object Variable</em>'.
	 * @see org.muml.storydiagram.patterns.Constraint#getObjectVariable()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_ObjectVariable();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.patterns.AbstractLinkVariable <em>Abstract Link Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Link Variable</em>'.
	 * @see org.muml.storydiagram.patterns.AbstractLinkVariable
	 * @generated
	 */
	EClass getAbstractLinkVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.patterns.AbstractLinkVariable#getBindingSemantics <em>Binding Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Semantics</em>'.
	 * @see org.muml.storydiagram.patterns.AbstractLinkVariable#getBindingSemantics()
	 * @see #getAbstractLinkVariable()
	 * @generated
	 */
	EAttribute getAbstractLinkVariable_BindingSemantics();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.patterns.AbstractLinkVariable#getBindingOperator <em>Binding Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Operator</em>'.
	 * @see org.muml.storydiagram.patterns.AbstractLinkVariable#getBindingOperator()
	 * @see #getAbstractLinkVariable()
	 * @generated
	 */
	EAttribute getAbstractLinkVariable_BindingOperator();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.patterns.AbstractLinkVariable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.muml.storydiagram.patterns.AbstractLinkVariable#getSource()
	 * @see #getAbstractLinkVariable()
	 * @generated
	 */
	EReference getAbstractLinkVariable_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.storydiagram.patterns.AbstractLinkVariable#getSecondLinkConstraints <em>Second Link Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Second Link Constraints</em>'.
	 * @see org.muml.storydiagram.patterns.AbstractLinkVariable#getSecondLinkConstraints()
	 * @see #getAbstractLinkVariable()
	 * @generated
	 */
	EReference getAbstractLinkVariable_SecondLinkConstraints();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.storydiagram.patterns.AbstractLinkVariable#getFirstLinkConstraints <em>First Link Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>First Link Constraints</em>'.
	 * @see org.muml.storydiagram.patterns.AbstractLinkVariable#getFirstLinkConstraints()
	 * @see #getAbstractLinkVariable()
	 * @generated
	 */
	EReference getAbstractLinkVariable_FirstLinkConstraints();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.storydiagram.patterns.AbstractLinkVariable#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pattern</em>'.
	 * @see org.muml.storydiagram.patterns.AbstractLinkVariable#getPattern()
	 * @see #getAbstractLinkVariable()
	 * @generated
	 */
	EReference getAbstractLinkVariable_Pattern();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.patterns.AbstractLinkVariable#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.muml.storydiagram.patterns.AbstractLinkVariable#getTarget()
	 * @see #getAbstractLinkVariable()
	 * @generated
	 */
	EReference getAbstractLinkVariable_Target();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.patterns.LinkConstraint <em>Link Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Constraint</em>'.
	 * @see org.muml.storydiagram.patterns.LinkConstraint
	 * @generated
	 */
	EClass getLinkConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.patterns.LinkConstraint#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.muml.storydiagram.patterns.LinkConstraint#getIndex()
	 * @see #getLinkConstraint()
	 * @generated
	 */
	EAttribute getLinkConstraint_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.patterns.LinkConstraint#getConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Type</em>'.
	 * @see org.muml.storydiagram.patterns.LinkConstraint#getConstraintType()
	 * @see #getLinkConstraint()
	 * @generated
	 */
	EAttribute getLinkConstraint_ConstraintType();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.patterns.LinkConstraint#isNegative <em>Negative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negative</em>'.
	 * @see org.muml.storydiagram.patterns.LinkConstraint#isNegative()
	 * @see #getLinkConstraint()
	 * @generated
	 */
	EAttribute getLinkConstraint_Negative();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.patterns.LinkConstraint#getFirstLink <em>First Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Link</em>'.
	 * @see org.muml.storydiagram.patterns.LinkConstraint#getFirstLink()
	 * @see #getLinkConstraint()
	 * @generated
	 */
	EReference getLinkConstraint_FirstLink();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.storydiagram.patterns.LinkConstraint#getReferencingObject <em>Referencing Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Referencing Object</em>'.
	 * @see org.muml.storydiagram.patterns.LinkConstraint#getReferencingObject()
	 * @see #getLinkConstraint()
	 * @generated
	 */
	EReference getLinkConstraint_ReferencingObject();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.patterns.LinkConstraint#getSecondLink <em>Second Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second Link</em>'.
	 * @see org.muml.storydiagram.patterns.LinkConstraint#getSecondLink()
	 * @see #getLinkConstraint()
	 * @generated
	 */
	EReference getLinkConstraint_SecondLink();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.patterns.AttributeAssignment <em>Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Assignment</em>'.
	 * @see org.muml.storydiagram.patterns.AttributeAssignment
	 * @generated
	 */
	EClass getAttributeAssignment();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.patterns.AttributeAssignment#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.muml.storydiagram.patterns.AttributeAssignment#getAttribute()
	 * @see #getAttributeAssignment()
	 * @generated
	 */
	EReference getAttributeAssignment_Attribute();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.storydiagram.patterns.AttributeAssignment#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Expression</em>'.
	 * @see org.muml.storydiagram.patterns.AttributeAssignment#getValueExpression()
	 * @see #getAttributeAssignment()
	 * @generated
	 */
	EReference getAttributeAssignment_ValueExpression();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.storydiagram.patterns.AttributeAssignment#getObjectVariable <em>Object Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Object Variable</em>'.
	 * @see org.muml.storydiagram.patterns.AttributeAssignment#getObjectVariable()
	 * @see #getAttributeAssignment()
	 * @generated
	 */
	EReference getAttributeAssignment_ObjectVariable();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.patterns.CollectionVariable <em>Collection Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Variable</em>'.
	 * @see org.muml.storydiagram.patterns.CollectionVariable
	 * @generated
	 */
	EClass getCollectionVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.patterns.CollectionVariable#isAtLeastOne <em>At Least One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>At Least One</em>'.
	 * @see org.muml.storydiagram.patterns.CollectionVariable#isAtLeastOne()
	 * @see #getCollectionVariable()
	 * @generated
	 */
	EAttribute getCollectionVariable_AtLeastOne();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.patterns.CollectionVariable#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.muml.storydiagram.patterns.CollectionVariable#isUnique()
	 * @see #getCollectionVariable()
	 * @generated
	 */
	EAttribute getCollectionVariable_Unique();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.patterns.PrimitiveVariable <em>Primitive Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Variable</em>'.
	 * @see org.muml.storydiagram.patterns.PrimitiveVariable
	 * @generated
	 */
	EClass getPrimitiveVariable();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.patterns.PrimitiveVariable#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see org.muml.storydiagram.patterns.PrimitiveVariable#getDataType()
	 * @see #getPrimitiveVariable()
	 * @generated
	 */
	EReference getPrimitiveVariable_DataType();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.patterns.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see org.muml.storydiagram.patterns.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.storydiagram.patterns.Path#getPathExpression <em>Path Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path Expression</em>'.
	 * @see org.muml.storydiagram.patterns.Path#getPathExpression()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_PathExpression();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.patterns.LinkVariable <em>Link Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Variable</em>'.
	 * @see org.muml.storydiagram.patterns.LinkVariable
	 * @generated
	 */
	EClass getLinkVariable();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.patterns.LinkVariable#getSourceEnd <em>Source End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source End</em>'.
	 * @see org.muml.storydiagram.patterns.LinkVariable#getSourceEnd()
	 * @see #getLinkVariable()
	 * @generated
	 */
	EReference getLinkVariable_SourceEnd();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.patterns.LinkVariable#getTargetEnd <em>Target End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target End</em>'.
	 * @see org.muml.storydiagram.patterns.LinkVariable#getTargetEnd()
	 * @see #getLinkVariable()
	 * @generated
	 */
	EReference getLinkVariable_TargetEnd();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.storydiagram.patterns.LinkVariable#getQualifierExpression <em>Qualifier Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualifier Expression</em>'.
	 * @see org.muml.storydiagram.patterns.LinkVariable#getQualifierExpression()
	 * @see #getLinkVariable()
	 * @generated
	 */
	EReference getLinkVariable_QualifierExpression();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.patterns.InclusionLink <em>Inclusion Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inclusion Link</em>'.
	 * @see org.muml.storydiagram.patterns.InclusionLink
	 * @generated
	 */
	EClass getInclusionLink();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.patterns.MatchingPattern <em>Matching Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matching Pattern</em>'.
	 * @see org.muml.storydiagram.patterns.MatchingPattern
	 * @generated
	 */
	EClass getMatchingPattern();

	/**
	 * Returns the meta object for the '{@link org.muml.storydiagram.patterns.MatchingPattern#NoModifierInMatchingPattern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Modifier In Matching Pattern</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Modifier In Matching Pattern</em>' operation.
	 * @see org.muml.storydiagram.patterns.MatchingPattern#NoModifierInMatchingPattern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.patterns.StoryPattern <em>Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Pattern</em>'.
	 * @see org.muml.storydiagram.patterns.StoryPattern
	 * @generated
	 */
	EClass getStoryPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.storydiagram.patterns.StoryPattern#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.muml.storydiagram.patterns.StoryPattern#getVariables()
	 * @see #getStoryPattern()
	 * @generated
	 */
	EReference getStoryPattern_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.storydiagram.patterns.StoryPattern#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.muml.storydiagram.patterns.StoryPattern#getConstraints()
	 * @see #getStoryPattern()
	 * @generated
	 */
	EReference getStoryPattern_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.storydiagram.patterns.StoryPattern#getLinkVariables <em>Link Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Variables</em>'.
	 * @see org.muml.storydiagram.patterns.StoryPattern#getLinkVariables()
	 * @see #getStoryPattern()
	 * @generated
	 */
	EReference getStoryPattern_LinkVariables();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.storydiagram.patterns.StoryPattern#getParentPattern <em>Parent Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Pattern</em>'.
	 * @see org.muml.storydiagram.patterns.StoryPattern#getParentPattern()
	 * @see #getStoryPattern()
	 * @generated
	 */
	EReference getStoryPattern_ParentPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.storydiagram.patterns.StoryPattern#getContainedPatterns <em>Contained Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Patterns</em>'.
	 * @see org.muml.storydiagram.patterns.StoryPattern#getContainedPatterns()
	 * @see #getStoryPattern()
	 * @generated
	 */
	EReference getStoryPattern_ContainedPatterns();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.patterns.StoryPattern#getBindingSemantics <em>Binding Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Semantics</em>'.
	 * @see org.muml.storydiagram.patterns.StoryPattern#getBindingSemantics()
	 * @see #getStoryPattern()
	 * @generated
	 */
	EAttribute getStoryPattern_BindingSemantics();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.storydiagram.patterns.StoryPattern#getTemplateSignature <em>Template Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template Signature</em>'.
	 * @see org.muml.storydiagram.patterns.StoryPattern#getTemplateSignature()
	 * @see #getStoryPattern()
	 * @generated
	 */
	EReference getStoryPattern_TemplateSignature();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.patterns.MaybeLink <em>Maybe Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maybe Link</em>'.
	 * @see org.muml.storydiagram.patterns.MaybeLink
	 * @generated
	 */
	EClass getMaybeLink();

	/**
	 * Returns the meta object for enum '{@link org.muml.storydiagram.patterns.BindingState <em>Binding State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding State</em>'.
	 * @see org.muml.storydiagram.patterns.BindingState
	 * @generated
	 */
	EEnum getBindingState();

	/**
	 * Returns the meta object for enum '{@link org.muml.storydiagram.patterns.BindingSemantics <em>Binding Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding Semantics</em>'.
	 * @see org.muml.storydiagram.patterns.BindingSemantics
	 * @generated
	 */
	EEnum getBindingSemantics();

	/**
	 * Returns the meta object for enum '{@link org.muml.storydiagram.patterns.BindingOperator <em>Binding Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding Operator</em>'.
	 * @see org.muml.storydiagram.patterns.BindingOperator
	 * @generated
	 */
	EEnum getBindingOperator();

	/**
	 * Returns the meta object for enum '{@link org.muml.storydiagram.patterns.LinkConstraintType <em>Link Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Link Constraint Type</em>'.
	 * @see org.muml.storydiagram.patterns.LinkConstraintType
	 * @generated
	 */
	EEnum getLinkConstraintType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PatternsFactory getPatternsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.patterns.impl.ObjectVariableImpl <em>Object Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.patterns.impl.ObjectVariableImpl
		 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getObjectVariable()
		 * @generated
		 */
		EClass OBJECT_VARIABLE = eINSTANCE.getObjectVariable();

		/**
		 * The meta object literal for the '<em><b>Outgoing Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_VARIABLE__OUTGOING_LINKS = eINSTANCE.getObjectVariable_OutgoingLinks();

		/**
		 * The meta object literal for the '<em><b>Link Order Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_VARIABLE__LINK_ORDER_CONSTRAINTS = eINSTANCE.getObjectVariable_LinkOrderConstraints();

		/**
		 * The meta object literal for the '<em><b>Binding Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_VARIABLE__BINDING_SEMANTICS = eINSTANCE.getObjectVariable_BindingSemantics();

		/**
		 * The meta object literal for the '<em><b>Binding Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_VARIABLE__BINDING_OPERATOR = eINSTANCE.getObjectVariable_BindingOperator();

		/**
		 * The meta object literal for the '<em><b>Attribute Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENTS = eINSTANCE.getObjectVariable_AttributeAssignments();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.patterns.impl.AbstractVariableImpl <em>Abstract Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.patterns.impl.AbstractVariableImpl
		 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getAbstractVariable()
		 * @generated
		 */
		EClass ABSTRACT_VARIABLE = eINSTANCE.getAbstractVariable();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_VARIABLE__PATTERN = eINSTANCE.getAbstractVariable_Pattern();

		/**
		 * The meta object literal for the '<em><b>Binding State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_VARIABLE__BINDING_STATE = eINSTANCE.getAbstractVariable_BindingState();

		/**
		 * The meta object literal for the '<em><b>Binding Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_VARIABLE__BINDING_EXPRESSION = eINSTANCE.getAbstractVariable_BindingExpression();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_VARIABLE__CONSTRAINTS = eINSTANCE.getAbstractVariable_Constraints();

		/**
		 * The meta object literal for the '<em><b>Incoming Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_VARIABLE__INCOMING_LINKS = eINSTANCE.getAbstractVariable_IncomingLinks();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.patterns.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.patterns.impl.ConstraintImpl
		 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraint Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONSTRAINT_EXPRESSION = eINSTANCE.getConstraint_ConstraintExpression();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__PATTERN = eINSTANCE.getConstraint_Pattern();

		/**
		 * The meta object literal for the '<em><b>Object Variable</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__OBJECT_VARIABLE = eINSTANCE.getConstraint_ObjectVariable();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.patterns.impl.AbstractLinkVariableImpl <em>Abstract Link Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.patterns.impl.AbstractLinkVariableImpl
		 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getAbstractLinkVariable()
		 * @generated
		 */
		EClass ABSTRACT_LINK_VARIABLE = eINSTANCE.getAbstractLinkVariable();

		/**
		 * The meta object literal for the '<em><b>Binding Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS = eINSTANCE.getAbstractLinkVariable_BindingSemantics();

		/**
		 * The meta object literal for the '<em><b>Binding Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR = eINSTANCE.getAbstractLinkVariable_BindingOperator();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_LINK_VARIABLE__SOURCE = eINSTANCE.getAbstractLinkVariable_Source();

		/**
		 * The meta object literal for the '<em><b>Second Link Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINTS = eINSTANCE.getAbstractLinkVariable_SecondLinkConstraints();

		/**
		 * The meta object literal for the '<em><b>First Link Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINTS = eINSTANCE.getAbstractLinkVariable_FirstLinkConstraints();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_LINK_VARIABLE__PATTERN = eINSTANCE.getAbstractLinkVariable_Pattern();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_LINK_VARIABLE__TARGET = eINSTANCE.getAbstractLinkVariable_Target();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.patterns.impl.LinkConstraintImpl <em>Link Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.patterns.impl.LinkConstraintImpl
		 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getLinkConstraint()
		 * @generated
		 */
		EClass LINK_CONSTRAINT = eINSTANCE.getLinkConstraint();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_CONSTRAINT__INDEX = eINSTANCE.getLinkConstraint_Index();

		/**
		 * The meta object literal for the '<em><b>Constraint Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_CONSTRAINT__CONSTRAINT_TYPE = eINSTANCE.getLinkConstraint_ConstraintType();

		/**
		 * The meta object literal for the '<em><b>Negative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_CONSTRAINT__NEGATIVE = eINSTANCE.getLinkConstraint_Negative();

		/**
		 * The meta object literal for the '<em><b>First Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_CONSTRAINT__FIRST_LINK = eINSTANCE.getLinkConstraint_FirstLink();

		/**
		 * The meta object literal for the '<em><b>Referencing Object</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_CONSTRAINT__REFERENCING_OBJECT = eINSTANCE.getLinkConstraint_ReferencingObject();

		/**
		 * The meta object literal for the '<em><b>Second Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_CONSTRAINT__SECOND_LINK = eINSTANCE.getLinkConstraint_SecondLink();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.patterns.impl.AttributeAssignmentImpl <em>Attribute Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.patterns.impl.AttributeAssignmentImpl
		 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getAttributeAssignment()
		 * @generated
		 */
		EClass ATTRIBUTE_ASSIGNMENT = eINSTANCE.getAttributeAssignment();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ASSIGNMENT__ATTRIBUTE = eINSTANCE.getAttributeAssignment_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION = eINSTANCE.getAttributeAssignment_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Object Variable</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE = eINSTANCE.getAttributeAssignment_ObjectVariable();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.patterns.impl.CollectionVariableImpl <em>Collection Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.patterns.impl.CollectionVariableImpl
		 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getCollectionVariable()
		 * @generated
		 */
		EClass COLLECTION_VARIABLE = eINSTANCE.getCollectionVariable();

		/**
		 * The meta object literal for the '<em><b>At Least One</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_VARIABLE__AT_LEAST_ONE = eINSTANCE.getCollectionVariable_AtLeastOne();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_VARIABLE__UNIQUE = eINSTANCE.getCollectionVariable_Unique();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.patterns.impl.PrimitiveVariableImpl <em>Primitive Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.patterns.impl.PrimitiveVariableImpl
		 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getPrimitiveVariable()
		 * @generated
		 */
		EClass PRIMITIVE_VARIABLE = eINSTANCE.getPrimitiveVariable();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_VARIABLE__DATA_TYPE = eINSTANCE.getPrimitiveVariable_DataType();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.patterns.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.patterns.impl.PathImpl
		 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Path Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__PATH_EXPRESSION = eINSTANCE.getPath_PathExpression();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.patterns.impl.LinkVariableImpl <em>Link Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.patterns.impl.LinkVariableImpl
		 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getLinkVariable()
		 * @generated
		 */
		EClass LINK_VARIABLE = eINSTANCE.getLinkVariable();

		/**
		 * The meta object literal for the '<em><b>Source End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_VARIABLE__SOURCE_END = eINSTANCE.getLinkVariable_SourceEnd();

		/**
		 * The meta object literal for the '<em><b>Target End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_VARIABLE__TARGET_END = eINSTANCE.getLinkVariable_TargetEnd();

		/**
		 * The meta object literal for the '<em><b>Qualifier Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_VARIABLE__QUALIFIER_EXPRESSION = eINSTANCE.getLinkVariable_QualifierExpression();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.patterns.impl.InclusionLinkImpl <em>Inclusion Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.patterns.impl.InclusionLinkImpl
		 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getInclusionLink()
		 * @generated
		 */
		EClass INCLUSION_LINK = eINSTANCE.getInclusionLink();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.patterns.impl.MatchingPatternImpl <em>Matching Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.patterns.impl.MatchingPatternImpl
		 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getMatchingPattern()
		 * @generated
		 */
		EClass MATCHING_PATTERN = eINSTANCE.getMatchingPattern();

		/**
		 * The meta object literal for the '<em><b>No Modifier In Matching Pattern</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MATCHING_PATTERN___NO_MODIFIER_IN_MATCHING_PATTERN__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.patterns.impl.StoryPatternImpl <em>Story Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.patterns.impl.StoryPatternImpl
		 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getStoryPattern()
		 * @generated
		 */
		EClass STORY_PATTERN = eINSTANCE.getStoryPattern();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN__VARIABLES = eINSTANCE.getStoryPattern_Variables();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN__CONSTRAINTS = eINSTANCE.getStoryPattern_Constraints();

		/**
		 * The meta object literal for the '<em><b>Link Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN__LINK_VARIABLES = eINSTANCE.getStoryPattern_LinkVariables();

		/**
		 * The meta object literal for the '<em><b>Parent Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN__PARENT_PATTERN = eINSTANCE.getStoryPattern_ParentPattern();

		/**
		 * The meta object literal for the '<em><b>Contained Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN__CONTAINED_PATTERNS = eINSTANCE.getStoryPattern_ContainedPatterns();

		/**
		 * The meta object literal for the '<em><b>Binding Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORY_PATTERN__BINDING_SEMANTICS = eINSTANCE.getStoryPattern_BindingSemantics();

		/**
		 * The meta object literal for the '<em><b>Template Signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN__TEMPLATE_SIGNATURE = eINSTANCE.getStoryPattern_TemplateSignature();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.patterns.impl.MaybeLinkImpl <em>Maybe Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.patterns.impl.MaybeLinkImpl
		 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getMaybeLink()
		 * @generated
		 */
		EClass MAYBE_LINK = eINSTANCE.getMaybeLink();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.patterns.BindingState <em>Binding State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.patterns.BindingState
		 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getBindingState()
		 * @generated
		 */
		EEnum BINDING_STATE = eINSTANCE.getBindingState();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.patterns.BindingSemantics <em>Binding Semantics</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.patterns.BindingSemantics
		 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getBindingSemantics()
		 * @generated
		 */
		EEnum BINDING_SEMANTICS = eINSTANCE.getBindingSemantics();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.patterns.BindingOperator <em>Binding Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.patterns.BindingOperator
		 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getBindingOperator()
		 * @generated
		 */
		EEnum BINDING_OPERATOR = eINSTANCE.getBindingOperator();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.patterns.LinkConstraintType <em>Link Constraint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.patterns.LinkConstraintType
		 * @see org.muml.storydiagram.patterns.impl.PatternsPackageImpl#getLinkConstraintType()
		 * @generated
		 */
		EEnum LINK_CONSTRAINT_TYPE = eINSTANCE.getLinkConstraintType();

	}

} //PatternsPackage
