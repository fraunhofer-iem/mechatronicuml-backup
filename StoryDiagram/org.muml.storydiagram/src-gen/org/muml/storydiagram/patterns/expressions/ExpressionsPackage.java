/**
 */
package org.muml.storydiagram.patterns.expressions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.muml.storydiagram.patterns.expressions.ExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expressions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/storydiagram/patterns/expressions/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sdpe";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionsPackage eINSTANCE = org.muml.storydiagram.patterns.expressions.impl.ExpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.patterns.expressions.impl.AttributeValueExpressionImpl <em>Attribute Value Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.patterns.expressions.impl.AttributeValueExpressionImpl
	 * @see org.muml.storydiagram.patterns.expressions.impl.ExpressionsPackageImpl#getAttributeValueExpression()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION__ANNOTATIONS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION__EXTENSIONS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION__COMMENT = org.muml.core.expressions.ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION__OBJECT = org.muml.core.expressions.ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION__ATTRIBUTE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION_FEATURE_COUNT = org.muml.core.expressions.ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION___ECLASS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION___EIS_PROXY = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION___ERESOURCE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION___ECONTAINER = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION___ECONTAINING_FEATURE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION___ECONTAINMENT_FEATURE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION___ECONTENTS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION___EALL_CONTENTS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION___ECROSS_REFERENCES = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION___EGET__ESTRUCTURALFEATURE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE_1;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN_1;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT_1;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION___EIS_SET__ESTRUCTURALFEATURE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EIS_SET__ESTRUCTURALFEATURE_1;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION___EUNSET__ESTRUCTURALFEATURE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EUNSET__ESTRUCTURALFEATURE_1;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION___EINVOKE__EOPERATION_ELIST = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EINVOKE__EOPERATION_ELIST_1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION___GET_EXTENSION__ECLASS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION___PROVIDE_EXTENSION__ECLASS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION___GET_ANNOTATION__STRING = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION___PROVIDE_ANNOTATION__STRING = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Attribute Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION_OPERATION_COUNT = org.muml.core.expressions.ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.patterns.expressions.impl.ObjectVariableExpressionImpl <em>Object Variable Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.patterns.expressions.impl.ObjectVariableExpressionImpl
	 * @see org.muml.storydiagram.patterns.expressions.impl.ExpressionsPackageImpl#getObjectVariableExpression()
	 * @generated
	 */
	int OBJECT_VARIABLE_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION__ANNOTATIONS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION__EXTENSIONS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION__COMMENT = org.muml.core.expressions.ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION__OBJECT = org.muml.core.expressions.ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Variable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION_FEATURE_COUNT = org.muml.core.expressions.ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION___ECLASS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION___EIS_PROXY = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION___ERESOURCE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION___ECONTAINER = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION___ECONTAINING_FEATURE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION___ECONTAINMENT_FEATURE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION___ECONTENTS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION___EALL_CONTENTS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION___ECROSS_REFERENCES = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION___EGET__ESTRUCTURALFEATURE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE_1;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN_1;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT_1;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION___EIS_SET__ESTRUCTURALFEATURE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EIS_SET__ESTRUCTURALFEATURE_1;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION___EUNSET__ESTRUCTURALFEATURE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EUNSET__ESTRUCTURALFEATURE_1;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION___EINVOKE__EOPERATION_ELIST = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EINVOKE__EOPERATION_ELIST_1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION___GET_EXTENSION__ECLASS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION___PROVIDE_EXTENSION__ECLASS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION___GET_ANNOTATION__STRING = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION___PROVIDE_ANNOTATION__STRING = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Object Variable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION_OPERATION_COUNT = org.muml.core.expressions.ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.patterns.expressions.impl.CollectionSizeExpressionImpl <em>Collection Size Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.patterns.expressions.impl.CollectionSizeExpressionImpl
	 * @see org.muml.storydiagram.patterns.expressions.impl.ExpressionsPackageImpl#getCollectionSizeExpression()
	 * @generated
	 */
	int COLLECTION_SIZE_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION__ANNOTATIONS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION__EXTENSIONS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION__COMMENT = org.muml.core.expressions.ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION__SET = org.muml.core.expressions.ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Size Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION_FEATURE_COUNT = org.muml.core.expressions.ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION___ECLASS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION___EIS_PROXY = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION___ERESOURCE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION___ECONTAINER = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION___ECONTAINING_FEATURE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION___ECONTAINMENT_FEATURE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION___ECONTENTS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION___EALL_CONTENTS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION___ECROSS_REFERENCES = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION___EGET__ESTRUCTURALFEATURE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE_1;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN_1;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT_1;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION___EIS_SET__ESTRUCTURALFEATURE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EIS_SET__ESTRUCTURALFEATURE_1;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION___EUNSET__ESTRUCTURALFEATURE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EUNSET__ESTRUCTURALFEATURE_1;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION___EINVOKE__EOPERATION_ELIST = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EINVOKE__EOPERATION_ELIST_1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION___GET_EXTENSION__ECLASS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION___PROVIDE_EXTENSION__ECLASS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION___GET_ANNOTATION__STRING = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION___PROVIDE_ANNOTATION__STRING = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Collection Size Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SIZE_EXPRESSION_OPERATION_COUNT = org.muml.core.expressions.ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.patterns.expressions.impl.PrimitiveVariableExpressionImpl <em>Primitive Variable Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.patterns.expressions.impl.PrimitiveVariableExpressionImpl
	 * @see org.muml.storydiagram.patterns.expressions.impl.ExpressionsPackageImpl#getPrimitiveVariableExpression()
	 * @generated
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION__ANNOTATIONS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION__EXTENSIONS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION__COMMENT = org.muml.core.expressions.ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Primitive Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION__PRIMITIVE_VARIABLE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Variable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION_FEATURE_COUNT = org.muml.core.expressions.ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION___ECLASS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION___EIS_PROXY = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION___ERESOURCE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION___ECONTAINER = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION___ECONTAINING_FEATURE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION___ECONTAINMENT_FEATURE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION___ECONTENTS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION___EALL_CONTENTS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION___ECROSS_REFERENCES = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION___EGET__ESTRUCTURALFEATURE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE_1;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN_1;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT_1;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION___EIS_SET__ESTRUCTURALFEATURE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EIS_SET__ESTRUCTURALFEATURE_1;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION___EUNSET__ESTRUCTURALFEATURE = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EUNSET__ESTRUCTURALFEATURE_1;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION___EINVOKE__EOPERATION_ELIST = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___EINVOKE__EOPERATION_ELIST_1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION___GET_EXTENSION__ECLASS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION___PROVIDE_EXTENSION__ECLASS = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION___GET_ANNOTATION__STRING = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION___PROVIDE_ANNOTATION__STRING = org.muml.core.expressions.ExpressionsPackage.EXPRESSION___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Primitive Variable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION_OPERATION_COUNT = org.muml.core.expressions.ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.patterns.expressions.AttributeValueExpression <em>Attribute Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Expression</em>'.
	 * @see org.muml.storydiagram.patterns.expressions.AttributeValueExpression
	 * @generated
	 */
	EClass getAttributeValueExpression();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.patterns.expressions.AttributeValueExpression#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see org.muml.storydiagram.patterns.expressions.AttributeValueExpression#getObject()
	 * @see #getAttributeValueExpression()
	 * @generated
	 */
	EReference getAttributeValueExpression_Object();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.patterns.expressions.AttributeValueExpression#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.muml.storydiagram.patterns.expressions.AttributeValueExpression#getAttribute()
	 * @see #getAttributeValueExpression()
	 * @generated
	 */
	EReference getAttributeValueExpression_Attribute();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.patterns.expressions.ObjectVariableExpression <em>Object Variable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Variable Expression</em>'.
	 * @see org.muml.storydiagram.patterns.expressions.ObjectVariableExpression
	 * @generated
	 */
	EClass getObjectVariableExpression();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.patterns.expressions.ObjectVariableExpression#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see org.muml.storydiagram.patterns.expressions.ObjectVariableExpression#getObject()
	 * @see #getObjectVariableExpression()
	 * @generated
	 */
	EReference getObjectVariableExpression_Object();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.patterns.expressions.CollectionSizeExpression <em>Collection Size Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Size Expression</em>'.
	 * @see org.muml.storydiagram.patterns.expressions.CollectionSizeExpression
	 * @generated
	 */
	EClass getCollectionSizeExpression();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.patterns.expressions.CollectionSizeExpression#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set</em>'.
	 * @see org.muml.storydiagram.patterns.expressions.CollectionSizeExpression#getSet()
	 * @see #getCollectionSizeExpression()
	 * @generated
	 */
	EReference getCollectionSizeExpression_Set();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.patterns.expressions.PrimitiveVariableExpression <em>Primitive Variable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Variable Expression</em>'.
	 * @see org.muml.storydiagram.patterns.expressions.PrimitiveVariableExpression
	 * @generated
	 */
	EClass getPrimitiveVariableExpression();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.patterns.expressions.PrimitiveVariableExpression#getPrimitiveVariable <em>Primitive Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primitive Variable</em>'.
	 * @see org.muml.storydiagram.patterns.expressions.PrimitiveVariableExpression#getPrimitiveVariable()
	 * @see #getPrimitiveVariableExpression()
	 * @generated
	 */
	EReference getPrimitiveVariableExpression_PrimitiveVariable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionsFactory getExpressionsFactory();

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
		 * The meta object literal for the '{@link org.muml.storydiagram.patterns.expressions.impl.AttributeValueExpressionImpl <em>Attribute Value Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.patterns.expressions.impl.AttributeValueExpressionImpl
		 * @see org.muml.storydiagram.patterns.expressions.impl.ExpressionsPackageImpl#getAttributeValueExpression()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_EXPRESSION = eINSTANCE.getAttributeValueExpression();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_EXPRESSION__OBJECT = eINSTANCE.getAttributeValueExpression_Object();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_EXPRESSION__ATTRIBUTE = eINSTANCE.getAttributeValueExpression_Attribute();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.patterns.expressions.impl.ObjectVariableExpressionImpl <em>Object Variable Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.patterns.expressions.impl.ObjectVariableExpressionImpl
		 * @see org.muml.storydiagram.patterns.expressions.impl.ExpressionsPackageImpl#getObjectVariableExpression()
		 * @generated
		 */
		EClass OBJECT_VARIABLE_EXPRESSION = eINSTANCE.getObjectVariableExpression();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_VARIABLE_EXPRESSION__OBJECT = eINSTANCE.getObjectVariableExpression_Object();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.patterns.expressions.impl.CollectionSizeExpressionImpl <em>Collection Size Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.patterns.expressions.impl.CollectionSizeExpressionImpl
		 * @see org.muml.storydiagram.patterns.expressions.impl.ExpressionsPackageImpl#getCollectionSizeExpression()
		 * @generated
		 */
		EClass COLLECTION_SIZE_EXPRESSION = eINSTANCE.getCollectionSizeExpression();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_SIZE_EXPRESSION__SET = eINSTANCE.getCollectionSizeExpression_Set();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.patterns.expressions.impl.PrimitiveVariableExpressionImpl <em>Primitive Variable Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.patterns.expressions.impl.PrimitiveVariableExpressionImpl
		 * @see org.muml.storydiagram.patterns.expressions.impl.ExpressionsPackageImpl#getPrimitiveVariableExpression()
		 * @generated
		 */
		EClass PRIMITIVE_VARIABLE_EXPRESSION = eINSTANCE.getPrimitiveVariableExpression();

		/**
		 * The meta object literal for the '<em><b>Primitive Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_VARIABLE_EXPRESSION__PRIMITIVE_VARIABLE = eINSTANCE.getPrimitiveVariableExpression_PrimitiveVariable();

	}

} //ExpressionsPackage
