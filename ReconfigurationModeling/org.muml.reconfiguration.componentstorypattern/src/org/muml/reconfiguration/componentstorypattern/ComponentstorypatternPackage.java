/**
 */
package org.muml.reconfiguration.componentstorypattern;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.core.CorePackage;
import org.muml.core.expressions.ExpressionsPackage;

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
 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ComponentstorypatternPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "componentstorypattern";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/reconfiguration/componentstorypattern/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "componentstorypattern";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentstorypatternPackage eINSTANCE = org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.componentstorypattern.impl.ComponentStoryPatternImpl <em>Component Story Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentStoryPatternImpl
	 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getComponentStoryPattern()
	 * @generated
	 */
	int COMPONENT_STORY_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>This Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN__THIS_VARIABLE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Story Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN___PROVIDE_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN___GET_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN___PROVIDE_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Component Story Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.componentstorypattern.impl.ComponentStoryPatternVariableImpl <em>Component Story Pattern Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentStoryPatternVariableImpl
	 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getComponentStoryPatternVariable()
	 * @generated
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE__BINDING_SEMANTICS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Binding State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE__BINDING_STATE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Story Pattern Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE___PROVIDE_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE___GET_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE___PROVIDE_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Component Story Pattern Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.componentstorypattern.impl.ComponentVariableImpl <em>Component Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentVariableImpl
	 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getComponentVariable()
	 * @generated
	 */
	int COMPONENT_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE__ANNOTATIONS = COMPONENT_STORY_PATTERN_VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE__EXTENSIONS = COMPONENT_STORY_PATTERN_VARIABLE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE__NAME = COMPONENT_STORY_PATTERN_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE__COMMENT = COMPONENT_STORY_PATTERN_VARIABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE__BINDING_SEMANTICS = COMPONENT_STORY_PATTERN_VARIABLE__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE__BINDING_OPERATOR = COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR;

	/**
	 * The feature id for the '<em><b>Binding State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE__BINDING_STATE = COMPONENT_STORY_PATTERN_VARIABLE__BINDING_STATE;

	/**
	 * The feature id for the '<em><b>Port Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE__PORT_VARIABLES = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Part Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE__PART_VARIABLES = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connector Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE__CONNECTOR_VARIABLES = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE__TYPE = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE_FEATURE_COUNT = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE___ECLASS = COMPONENT_STORY_PATTERN_VARIABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE___EIS_PROXY = COMPONENT_STORY_PATTERN_VARIABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE___ERESOURCE = COMPONENT_STORY_PATTERN_VARIABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE___ECONTAINER = COMPONENT_STORY_PATTERN_VARIABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE___ECONTAINING_FEATURE = COMPONENT_STORY_PATTERN_VARIABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE___ECONTAINMENT_FEATURE = COMPONENT_STORY_PATTERN_VARIABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE___ECONTENTS = COMPONENT_STORY_PATTERN_VARIABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE___EALL_CONTENTS = COMPONENT_STORY_PATTERN_VARIABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE___ECROSS_REFERENCES = COMPONENT_STORY_PATTERN_VARIABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE___EGET__ESTRUCTURALFEATURE = COMPONENT_STORY_PATTERN_VARIABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = COMPONENT_STORY_PATTERN_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = COMPONENT_STORY_PATTERN_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = COMPONENT_STORY_PATTERN_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE___EUNSET__ESTRUCTURALFEATURE = COMPONENT_STORY_PATTERN_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE___EINVOKE__EOPERATION_ELIST = COMPONENT_STORY_PATTERN_VARIABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE___GET_EXTENSION__ECLASS = COMPONENT_STORY_PATTERN_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE___PROVIDE_EXTENSION__ECLASS = COMPONENT_STORY_PATTERN_VARIABLE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE___GET_ANNOTATION__STRING = COMPONENT_STORY_PATTERN_VARIABLE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE___PROVIDE_ANNOTATION__STRING = COMPONENT_STORY_PATTERN_VARIABLE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Component Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE_OPERATION_COUNT = COMPONENT_STORY_PATTERN_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.componentstorypattern.impl.PortVariableImpl <em>Port Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.componentstorypattern.impl.PortVariableImpl
	 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getPortVariable()
	 * @generated
	 */
	int PORT_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE__ANNOTATIONS = COMPONENT_STORY_PATTERN_VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE__EXTENSIONS = COMPONENT_STORY_PATTERN_VARIABLE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE__NAME = COMPONENT_STORY_PATTERN_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE__COMMENT = COMPONENT_STORY_PATTERN_VARIABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE__BINDING_SEMANTICS = COMPONENT_STORY_PATTERN_VARIABLE__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE__BINDING_OPERATOR = COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR;

	/**
	 * The feature id for the '<em><b>Binding State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE__BINDING_STATE = COMPONENT_STORY_PATTERN_VARIABLE__BINDING_STATE;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE__CONNECTORS = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE__DATA_TYPE = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE__PORT_TYPE = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connector Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE__CONNECTOR_VARIABLES = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Port Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE_FEATURE_COUNT = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE___ECLASS = COMPONENT_STORY_PATTERN_VARIABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE___EIS_PROXY = COMPONENT_STORY_PATTERN_VARIABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE___ERESOURCE = COMPONENT_STORY_PATTERN_VARIABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE___ECONTAINER = COMPONENT_STORY_PATTERN_VARIABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE___ECONTAINING_FEATURE = COMPONENT_STORY_PATTERN_VARIABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE___ECONTAINMENT_FEATURE = COMPONENT_STORY_PATTERN_VARIABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE___ECONTENTS = COMPONENT_STORY_PATTERN_VARIABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE___EALL_CONTENTS = COMPONENT_STORY_PATTERN_VARIABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE___ECROSS_REFERENCES = COMPONENT_STORY_PATTERN_VARIABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE___EGET__ESTRUCTURALFEATURE = COMPONENT_STORY_PATTERN_VARIABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = COMPONENT_STORY_PATTERN_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = COMPONENT_STORY_PATTERN_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = COMPONENT_STORY_PATTERN_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE___EUNSET__ESTRUCTURALFEATURE = COMPONENT_STORY_PATTERN_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE___EINVOKE__EOPERATION_ELIST = COMPONENT_STORY_PATTERN_VARIABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE___GET_EXTENSION__ECLASS = COMPONENT_STORY_PATTERN_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE___PROVIDE_EXTENSION__ECLASS = COMPONENT_STORY_PATTERN_VARIABLE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE___GET_ANNOTATION__STRING = COMPONENT_STORY_PATTERN_VARIABLE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE___PROVIDE_ANNOTATION__STRING = COMPONENT_STORY_PATTERN_VARIABLE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Port Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE_OPERATION_COUNT = COMPONENT_STORY_PATTERN_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.componentstorypattern.impl.PartVariableImpl <em>Part Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.componentstorypattern.impl.PartVariableImpl
	 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getPartVariable()
	 * @generated
	 */
	int PART_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE__ANNOTATIONS = COMPONENT_STORY_PATTERN_VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE__EXTENSIONS = COMPONENT_STORY_PATTERN_VARIABLE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE__NAME = COMPONENT_STORY_PATTERN_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE__COMMENT = COMPONENT_STORY_PATTERN_VARIABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE__BINDING_SEMANTICS = COMPONENT_STORY_PATTERN_VARIABLE__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE__BINDING_OPERATOR = COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR;

	/**
	 * The feature id for the '<em><b>Binding State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE__BINDING_STATE = COMPONENT_STORY_PATTERN_VARIABLE__BINDING_STATE;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE__DATA_TYPE = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE__PORT_VARIABLES = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Part Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE__COMPONENT_PART_TYPE = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Part Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE_FEATURE_COUNT = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE___ECLASS = COMPONENT_STORY_PATTERN_VARIABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE___EIS_PROXY = COMPONENT_STORY_PATTERN_VARIABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE___ERESOURCE = COMPONENT_STORY_PATTERN_VARIABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE___ECONTAINER = COMPONENT_STORY_PATTERN_VARIABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE___ECONTAINING_FEATURE = COMPONENT_STORY_PATTERN_VARIABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE___ECONTAINMENT_FEATURE = COMPONENT_STORY_PATTERN_VARIABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE___ECONTENTS = COMPONENT_STORY_PATTERN_VARIABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE___EALL_CONTENTS = COMPONENT_STORY_PATTERN_VARIABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE___ECROSS_REFERENCES = COMPONENT_STORY_PATTERN_VARIABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE___EGET__ESTRUCTURALFEATURE = COMPONENT_STORY_PATTERN_VARIABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = COMPONENT_STORY_PATTERN_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = COMPONENT_STORY_PATTERN_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = COMPONENT_STORY_PATTERN_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE___EUNSET__ESTRUCTURALFEATURE = COMPONENT_STORY_PATTERN_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE___EINVOKE__EOPERATION_ELIST = COMPONENT_STORY_PATTERN_VARIABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE___GET_EXTENSION__ECLASS = COMPONENT_STORY_PATTERN_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE___PROVIDE_EXTENSION__ECLASS = COMPONENT_STORY_PATTERN_VARIABLE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE___GET_ANNOTATION__STRING = COMPONENT_STORY_PATTERN_VARIABLE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE___PROVIDE_ANNOTATION__STRING = COMPONENT_STORY_PATTERN_VARIABLE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Part Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE_OPERATION_COUNT = COMPONENT_STORY_PATTERN_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.componentstorypattern.impl.ConnectorVariableImpl <em>Connector Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.componentstorypattern.impl.ConnectorVariableImpl
	 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getConnectorVariable()
	 * @generated
	 */
	int CONNECTOR_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE__ANNOTATIONS = COMPONENT_STORY_PATTERN_VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE__EXTENSIONS = COMPONENT_STORY_PATTERN_VARIABLE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE__NAME = COMPONENT_STORY_PATTERN_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE__COMMENT = COMPONENT_STORY_PATTERN_VARIABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE__BINDING_SEMANTICS = COMPONENT_STORY_PATTERN_VARIABLE__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE__BINDING_OPERATOR = COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR;

	/**
	 * The feature id for the '<em><b>Binding State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE__BINDING_STATE = COMPONENT_STORY_PATTERN_VARIABLE__BINDING_STATE;

	/**
	 * The feature id for the '<em><b>Connector Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE__CONNECTOR_ENDPOINTS = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Self Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE__SELF_CONNECTOR = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE__PORT_VARIABLES = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connector Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE_FEATURE_COUNT = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE___ECLASS = COMPONENT_STORY_PATTERN_VARIABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE___EIS_PROXY = COMPONENT_STORY_PATTERN_VARIABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE___ERESOURCE = COMPONENT_STORY_PATTERN_VARIABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE___ECONTAINER = COMPONENT_STORY_PATTERN_VARIABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE___ECONTAINING_FEATURE = COMPONENT_STORY_PATTERN_VARIABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE___ECONTAINMENT_FEATURE = COMPONENT_STORY_PATTERN_VARIABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE___ECONTENTS = COMPONENT_STORY_PATTERN_VARIABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE___EALL_CONTENTS = COMPONENT_STORY_PATTERN_VARIABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE___ECROSS_REFERENCES = COMPONENT_STORY_PATTERN_VARIABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE___EGET__ESTRUCTURALFEATURE = COMPONENT_STORY_PATTERN_VARIABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = COMPONENT_STORY_PATTERN_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = COMPONENT_STORY_PATTERN_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = COMPONENT_STORY_PATTERN_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE___EUNSET__ESTRUCTURALFEATURE = COMPONENT_STORY_PATTERN_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE___EINVOKE__EOPERATION_ELIST = COMPONENT_STORY_PATTERN_VARIABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE___GET_EXTENSION__ECLASS = COMPONENT_STORY_PATTERN_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE___PROVIDE_EXTENSION__ECLASS = COMPONENT_STORY_PATTERN_VARIABLE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE___GET_ANNOTATION__STRING = COMPONENT_STORY_PATTERN_VARIABLE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE___PROVIDE_ANNOTATION__STRING = COMPONENT_STORY_PATTERN_VARIABLE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Connector Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE_OPERATION_COUNT = COMPONENT_STORY_PATTERN_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.componentstorypattern.impl.AssemblyVariableImpl <em>Assembly Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.componentstorypattern.impl.AssemblyVariableImpl
	 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getAssemblyVariable()
	 * @generated
	 */
	int ASSEMBLY_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE__ANNOTATIONS = CONNECTOR_VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE__EXTENSIONS = CONNECTOR_VARIABLE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE__NAME = CONNECTOR_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE__COMMENT = CONNECTOR_VARIABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE__BINDING_SEMANTICS = CONNECTOR_VARIABLE__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE__BINDING_OPERATOR = CONNECTOR_VARIABLE__BINDING_OPERATOR;

	/**
	 * The feature id for the '<em><b>Binding State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE__BINDING_STATE = CONNECTOR_VARIABLE__BINDING_STATE;

	/**
	 * The feature id for the '<em><b>Connector Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE__CONNECTOR_ENDPOINTS = CONNECTOR_VARIABLE__CONNECTOR_ENDPOINTS;

	/**
	 * The feature id for the '<em><b>Self Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE__SELF_CONNECTOR = CONNECTOR_VARIABLE__SELF_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Port Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE__PORT_VARIABLES = CONNECTOR_VARIABLE__PORT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE__TYPE = CONNECTOR_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assembly Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE_FEATURE_COUNT = CONNECTOR_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE___ECLASS = CONNECTOR_VARIABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE___EIS_PROXY = CONNECTOR_VARIABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE___ERESOURCE = CONNECTOR_VARIABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE___ECONTAINER = CONNECTOR_VARIABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE___ECONTAINING_FEATURE = CONNECTOR_VARIABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE___ECONTAINMENT_FEATURE = CONNECTOR_VARIABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE___ECONTENTS = CONNECTOR_VARIABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE___EALL_CONTENTS = CONNECTOR_VARIABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE___ECROSS_REFERENCES = CONNECTOR_VARIABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE___EGET__ESTRUCTURALFEATURE = CONNECTOR_VARIABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = CONNECTOR_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = CONNECTOR_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = CONNECTOR_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE___EUNSET__ESTRUCTURALFEATURE = CONNECTOR_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE___EINVOKE__EOPERATION_ELIST = CONNECTOR_VARIABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE___GET_EXTENSION__ECLASS = CONNECTOR_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE___PROVIDE_EXTENSION__ECLASS = CONNECTOR_VARIABLE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE___GET_ANNOTATION__STRING = CONNECTOR_VARIABLE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE___PROVIDE_ANNOTATION__STRING = CONNECTOR_VARIABLE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Assembly Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE_OPERATION_COUNT = CONNECTOR_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.componentstorypattern.impl.DelegationVariableImpl <em>Delegation Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.componentstorypattern.impl.DelegationVariableImpl
	 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getDelegationVariable()
	 * @generated
	 */
	int DELEGATION_VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE__ANNOTATIONS = CONNECTOR_VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE__EXTENSIONS = CONNECTOR_VARIABLE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE__NAME = CONNECTOR_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE__COMMENT = CONNECTOR_VARIABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE__BINDING_SEMANTICS = CONNECTOR_VARIABLE__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE__BINDING_OPERATOR = CONNECTOR_VARIABLE__BINDING_OPERATOR;

	/**
	 * The feature id for the '<em><b>Binding State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE__BINDING_STATE = CONNECTOR_VARIABLE__BINDING_STATE;

	/**
	 * The feature id for the '<em><b>Connector Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE__CONNECTOR_ENDPOINTS = CONNECTOR_VARIABLE__CONNECTOR_ENDPOINTS;

	/**
	 * The feature id for the '<em><b>Self Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE__SELF_CONNECTOR = CONNECTOR_VARIABLE__SELF_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Port Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE__PORT_VARIABLES = CONNECTOR_VARIABLE__PORT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE__TYPE = CONNECTOR_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delegation Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE_FEATURE_COUNT = CONNECTOR_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE___ECLASS = CONNECTOR_VARIABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE___EIS_PROXY = CONNECTOR_VARIABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE___ERESOURCE = CONNECTOR_VARIABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE___ECONTAINER = CONNECTOR_VARIABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE___ECONTAINING_FEATURE = CONNECTOR_VARIABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE___ECONTAINMENT_FEATURE = CONNECTOR_VARIABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE___ECONTENTS = CONNECTOR_VARIABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE___EALL_CONTENTS = CONNECTOR_VARIABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE___ECROSS_REFERENCES = CONNECTOR_VARIABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE___EGET__ESTRUCTURALFEATURE = CONNECTOR_VARIABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = CONNECTOR_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = CONNECTOR_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = CONNECTOR_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE___EUNSET__ESTRUCTURALFEATURE = CONNECTOR_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE___EINVOKE__EOPERATION_ELIST = CONNECTOR_VARIABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE___GET_EXTENSION__ECLASS = CONNECTOR_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE___PROVIDE_EXTENSION__ECLASS = CONNECTOR_VARIABLE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE___GET_ANNOTATION__STRING = CONNECTOR_VARIABLE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE___PROVIDE_ANNOTATION__STRING = CONNECTOR_VARIABLE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Delegation Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE_OPERATION_COUNT = CONNECTOR_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.componentstorypattern.impl.SinglePortVariableImpl <em>Single Port Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.componentstorypattern.impl.SinglePortVariableImpl
	 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getSinglePortVariable()
	 * @generated
	 */
	int SINGLE_PORT_VARIABLE = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE__ANNOTATIONS = PORT_VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE__EXTENSIONS = PORT_VARIABLE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE__NAME = PORT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE__COMMENT = PORT_VARIABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE__BINDING_SEMANTICS = PORT_VARIABLE__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE__BINDING_OPERATOR = PORT_VARIABLE__BINDING_OPERATOR;

	/**
	 * The feature id for the '<em><b>Binding State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE__BINDING_STATE = PORT_VARIABLE__BINDING_STATE;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE__CONNECTORS = PORT_VARIABLE__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE__DATA_TYPE = PORT_VARIABLE__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE__PORT_TYPE = PORT_VARIABLE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Connector Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE__CONNECTOR_VARIABLES = PORT_VARIABLE__CONNECTOR_VARIABLES;

	/**
	 * The feature id for the '<em><b>Multi Port Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE__MULTI_PORT_VARIABLE = PORT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE__POSITION_CONSTRAINTS = PORT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Single Port Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE_FEATURE_COUNT = PORT_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE___ECLASS = PORT_VARIABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE___EIS_PROXY = PORT_VARIABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE___ERESOURCE = PORT_VARIABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE___ECONTAINER = PORT_VARIABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE___ECONTAINING_FEATURE = PORT_VARIABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE___ECONTAINMENT_FEATURE = PORT_VARIABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE___ECONTENTS = PORT_VARIABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE___EALL_CONTENTS = PORT_VARIABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE___ECROSS_REFERENCES = PORT_VARIABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE___EGET__ESTRUCTURALFEATURE = PORT_VARIABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = PORT_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = PORT_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = PORT_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE___EUNSET__ESTRUCTURALFEATURE = PORT_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE___EINVOKE__EOPERATION_ELIST = PORT_VARIABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE___GET_EXTENSION__ECLASS = PORT_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE___PROVIDE_EXTENSION__ECLASS = PORT_VARIABLE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE___GET_ANNOTATION__STRING = PORT_VARIABLE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE___PROVIDE_ANNOTATION__STRING = PORT_VARIABLE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Single Port Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE_OPERATION_COUNT = PORT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.componentstorypattern.impl.MultiPortVariableImpl <em>Multi Port Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.componentstorypattern.impl.MultiPortVariableImpl
	 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getMultiPortVariable()
	 * @generated
	 */
	int MULTI_PORT_VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE__ANNOTATIONS = PORT_VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE__EXTENSIONS = PORT_VARIABLE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE__NAME = PORT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE__COMMENT = PORT_VARIABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE__BINDING_SEMANTICS = PORT_VARIABLE__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE__BINDING_OPERATOR = PORT_VARIABLE__BINDING_OPERATOR;

	/**
	 * The feature id for the '<em><b>Binding State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE__BINDING_STATE = PORT_VARIABLE__BINDING_STATE;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE__CONNECTORS = PORT_VARIABLE__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE__DATA_TYPE = PORT_VARIABLE__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE__PORT_TYPE = PORT_VARIABLE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Connector Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE__CONNECTOR_VARIABLES = PORT_VARIABLE__CONNECTOR_VARIABLES;

	/**
	 * The feature id for the '<em><b>Sub Port Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE__SUB_PORT_VARIABLES = PORT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gmf Sub Port Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE__GMF_SUB_PORT_VARIABLES = PORT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Order Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE__ORDER_CONSTRAINTS = PORT_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Multi Port Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE_FEATURE_COUNT = PORT_VARIABLE_FEATURE_COUNT + 3;


	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE___ECLASS = PORT_VARIABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE___EIS_PROXY = PORT_VARIABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE___ERESOURCE = PORT_VARIABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE___ECONTAINER = PORT_VARIABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE___ECONTAINING_FEATURE = PORT_VARIABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE___ECONTAINMENT_FEATURE = PORT_VARIABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE___ECONTENTS = PORT_VARIABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE___EALL_CONTENTS = PORT_VARIABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE___ECROSS_REFERENCES = PORT_VARIABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE___EGET__ESTRUCTURALFEATURE = PORT_VARIABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = PORT_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = PORT_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = PORT_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE___EUNSET__ESTRUCTURALFEATURE = PORT_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE___EINVOKE__EOPERATION_ELIST = PORT_VARIABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE___GET_EXTENSION__ECLASS = PORT_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE___PROVIDE_EXTENSION__ECLASS = PORT_VARIABLE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE___GET_ANNOTATION__STRING = PORT_VARIABLE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE___PROVIDE_ANNOTATION__STRING = PORT_VARIABLE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Multi Port Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE_OPERATION_COUNT = PORT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.componentstorypattern.impl.TriggerEmbeddedComponentExpressionImpl <em>Trigger Embedded Component Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.componentstorypattern.impl.TriggerEmbeddedComponentExpressionImpl
	 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getTriggerEmbeddedComponentExpression()
	 * @generated
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION__ANNOTATIONS = ExpressionsPackage.EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION__EXTENSIONS = ExpressionsPackage.EXPRESSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The number of structural features of the '<em>Trigger Embedded Component Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;


	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION___ECLASS = ExpressionsPackage.EXPRESSION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION___EIS_PROXY = ExpressionsPackage.EXPRESSION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION___ERESOURCE = ExpressionsPackage.EXPRESSION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION___ECONTAINER = ExpressionsPackage.EXPRESSION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION___ECONTAINING_FEATURE = ExpressionsPackage.EXPRESSION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION___ECONTAINMENT_FEATURE = ExpressionsPackage.EXPRESSION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION___ECONTENTS = ExpressionsPackage.EXPRESSION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION___EALL_CONTENTS = ExpressionsPackage.EXPRESSION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION___ECROSS_REFERENCES = ExpressionsPackage.EXPRESSION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION___EGET__ESTRUCTURALFEATURE = ExpressionsPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN = ExpressionsPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT = ExpressionsPackage.EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION___EIS_SET__ESTRUCTURALFEATURE = ExpressionsPackage.EXPRESSION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION___EUNSET__ESTRUCTURALFEATURE = ExpressionsPackage.EXPRESSION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION___EINVOKE__EOPERATION_ELIST = ExpressionsPackage.EXPRESSION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION___GET_EXTENSION__ECLASS = ExpressionsPackage.EXPRESSION___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION___PROVIDE_EXTENSION__ECLASS = ExpressionsPackage.EXPRESSION___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION___GET_ANNOTATION__STRING = ExpressionsPackage.EXPRESSION___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION___PROVIDE_ANNOTATION__STRING = ExpressionsPackage.EXPRESSION___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Trigger Embedded Component Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION_OPERATION_COUNT = ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.componentstorypattern.impl.FadingComponentPartVariableImpl <em>Fading Component Part Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.componentstorypattern.impl.FadingComponentPartVariableImpl
	 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getFadingComponentPartVariable()
	 * @generated
	 */
	int FADING_COMPONENT_PART_VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE__ANNOTATIONS = PART_VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE__EXTENSIONS = PART_VARIABLE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE__NAME = PART_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE__COMMENT = PART_VARIABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE__BINDING_SEMANTICS = PART_VARIABLE__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE__BINDING_OPERATOR = PART_VARIABLE__BINDING_OPERATOR;

	/**
	 * The feature id for the '<em><b>Binding State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE__BINDING_STATE = PART_VARIABLE__BINDING_STATE;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE__DATA_TYPE = PART_VARIABLE__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Port Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE__PORT_VARIABLES = PART_VARIABLE__PORT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Component Part Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE__COMPONENT_PART_TYPE = PART_VARIABLE__COMPONENT_PART_TYPE;

	/**
	 * The feature id for the '<em><b>Applied Fading Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE__APPLIED_FADING_FUNCTION = PART_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fading Component Part Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE_FEATURE_COUNT = PART_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE___ECLASS = PART_VARIABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE___EIS_PROXY = PART_VARIABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE___ERESOURCE = PART_VARIABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE___ECONTAINER = PART_VARIABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE___ECONTAINING_FEATURE = PART_VARIABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE___ECONTAINMENT_FEATURE = PART_VARIABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE___ECONTENTS = PART_VARIABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE___EALL_CONTENTS = PART_VARIABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE___ECROSS_REFERENCES = PART_VARIABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE___EGET__ESTRUCTURALFEATURE = PART_VARIABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = PART_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = PART_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = PART_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE___EUNSET__ESTRUCTURALFEATURE = PART_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE___EINVOKE__EOPERATION_ELIST = PART_VARIABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE___GET_EXTENSION__ECLASS = PART_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE___PROVIDE_EXTENSION__ECLASS = PART_VARIABLE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE___GET_ANNOTATION__STRING = PART_VARIABLE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE___PROVIDE_ANNOTATION__STRING = PART_VARIABLE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Fading Component Part Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE_OPERATION_COUNT = PART_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.componentstorypattern.impl.ComponentPartVariableImpl <em>Component Part Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentPartVariableImpl
	 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getComponentPartVariable()
	 * @generated
	 */
	int COMPONENT_PART_VARIABLE = 12;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE__ANNOTATIONS = PART_VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE__EXTENSIONS = PART_VARIABLE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE__NAME = PART_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE__COMMENT = PART_VARIABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE__BINDING_SEMANTICS = PART_VARIABLE__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE__BINDING_OPERATOR = PART_VARIABLE__BINDING_OPERATOR;

	/**
	 * The feature id for the '<em><b>Binding State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE__BINDING_STATE = PART_VARIABLE__BINDING_STATE;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE__DATA_TYPE = PART_VARIABLE__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Port Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE__PORT_VARIABLES = PART_VARIABLE__PORT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Component Part Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE__COMPONENT_PART_TYPE = PART_VARIABLE__COMPONENT_PART_TYPE;

	/**
	 * The feature id for the '<em><b>Trigger Embedded Component Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE__TRIGGER_EMBEDDED_COMPONENT_EXPRESSIONS = PART_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Part Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE_FEATURE_COUNT = PART_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE___ECLASS = PART_VARIABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE___EIS_PROXY = PART_VARIABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE___ERESOURCE = PART_VARIABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE___ECONTAINER = PART_VARIABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE___ECONTAINING_FEATURE = PART_VARIABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE___ECONTAINMENT_FEATURE = PART_VARIABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE___ECONTENTS = PART_VARIABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE___EALL_CONTENTS = PART_VARIABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE___ECROSS_REFERENCES = PART_VARIABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE___EGET__ESTRUCTURALFEATURE = PART_VARIABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = PART_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = PART_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = PART_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE___EUNSET__ESTRUCTURALFEATURE = PART_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE___EINVOKE__EOPERATION_ELIST = PART_VARIABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE___GET_EXTENSION__ECLASS = PART_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE___PROVIDE_EXTENSION__ECLASS = PART_VARIABLE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE___GET_ANNOTATION__STRING = PART_VARIABLE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE___PROVIDE_ANNOTATION__STRING = PART_VARIABLE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Component Part Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE_OPERATION_COUNT = PART_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.componentstorypattern.impl.MultiPortOrderConstraintImpl <em>Multi Port Order Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.componentstorypattern.impl.MultiPortOrderConstraintImpl
	 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getMultiPortOrderConstraint()
	 * @generated
	 */
	int MULTI_PORT_ORDER_CONSTRAINT = 13;

	/**
	 * The feature id for the '<em><b>Multi Port Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_ORDER_CONSTRAINT__MULTI_PORT_VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Src Sub Port Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_ORDER_CONSTRAINT__SRC_SUB_PORT_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Order Constraint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_ORDER_CONSTRAINT__ORDER_CONSTRAINT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Tgt Sub Port Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_ORDER_CONSTRAINT__TGT_SUB_PORT_VARIABLE = 3;

	/**
	 * The number of structural features of the '<em>Multi Port Order Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_ORDER_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Multi Port Order Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_ORDER_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.componentstorypattern.impl.MultiPortPositionConstraintImpl <em>Multi Port Position Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.componentstorypattern.impl.MultiPortPositionConstraintImpl
	 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getMultiPortPositionConstraint()
	 * @generated
	 */
	int MULTI_PORT_POSITION_CONSTRAINT = 14;

	/**
	 * The feature id for the '<em><b>Position Constraint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_POSITION_CONSTRAINT__POSITION_CONSTRAINT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Sub Port Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_POSITION_CONSTRAINT__SUB_PORT_VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Multi Port Position Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_POSITION_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Multi Port Position Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_POSITION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraintType <em>Multi Port Order Constraint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraintType
	 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getMultiPortOrderConstraintType()
	 * @generated
	 */
	int MULTI_PORT_ORDER_CONSTRAINT_TYPE = 15;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.componentstorypattern.MultiPortPositionConstraintType <em>Multi Port Position Constraint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.componentstorypattern.MultiPortPositionConstraintType
	 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getMultiPortPositionConstraintType()
	 * @generated
	 */
	int MULTI_PORT_POSITION_CONSTRAINT_TYPE = 16;

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.componentstorypattern.ComponentStoryPattern <em>Component Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Story Pattern</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentStoryPattern
	 * @generated
	 */
	EClass getComponentStoryPattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.componentstorypattern.ComponentStoryPattern#getThisVariable <em>This Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>This Variable</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentStoryPattern#getThisVariable()
	 * @see #getComponentStoryPattern()
	 * @generated
	 */
	EReference getComponentStoryPattern_ThisVariable();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.componentstorypattern.ComponentStoryPatternVariable <em>Component Story Pattern Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Story Pattern Variable</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentStoryPatternVariable
	 * @generated
	 */
	EClass getComponentStoryPatternVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfiguration.componentstorypattern.ComponentStoryPatternVariable#getBindingSemantics <em>Binding Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Semantics</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentStoryPatternVariable#getBindingSemantics()
	 * @see #getComponentStoryPatternVariable()
	 * @generated
	 */
	EAttribute getComponentStoryPatternVariable_BindingSemantics();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfiguration.componentstorypattern.ComponentStoryPatternVariable#getBindingOperator <em>Binding Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Operator</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentStoryPatternVariable#getBindingOperator()
	 * @see #getComponentStoryPatternVariable()
	 * @generated
	 */
	EAttribute getComponentStoryPatternVariable_BindingOperator();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfiguration.componentstorypattern.ComponentStoryPatternVariable#getBindingState <em>Binding State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding State</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentStoryPatternVariable#getBindingState()
	 * @see #getComponentStoryPatternVariable()
	 * @generated
	 */
	EAttribute getComponentStoryPatternVariable_BindingState();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.componentstorypattern.ComponentVariable <em>Component Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Variable</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentVariable
	 * @generated
	 */
	EClass getComponentVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.componentstorypattern.ComponentVariable#getPortVariables <em>Port Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Variables</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentVariable#getPortVariables()
	 * @see #getComponentVariable()
	 * @generated
	 */
	EReference getComponentVariable_PortVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.componentstorypattern.ComponentVariable#getPartVariables <em>Part Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part Variables</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentVariable#getPartVariables()
	 * @see #getComponentVariable()
	 * @generated
	 */
	EReference getComponentVariable_PartVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.componentstorypattern.ComponentVariable#getConnectorVariables <em>Connector Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector Variables</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentVariable#getConnectorVariables()
	 * @see #getComponentVariable()
	 * @generated
	 */
	EReference getComponentVariable_ConnectorVariables();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.componentstorypattern.ComponentVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentVariable#getType()
	 * @see #getComponentVariable()
	 * @generated
	 */
	EReference getComponentVariable_Type();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.componentstorypattern.PortVariable <em>Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Variable</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.PortVariable
	 * @generated
	 */
	EClass getPortVariable();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.componentstorypattern.PortVariable#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Type</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.PortVariable#getPortType()
	 * @see #getPortVariable()
	 * @generated
	 */
	EReference getPortVariable_PortType();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.reconfiguration.componentstorypattern.PortVariable#getConnectorVariables <em>Connector Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connector Variables</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.PortVariable#getConnectorVariables()
	 * @see #getPortVariable()
	 * @generated
	 */
	EReference getPortVariable_ConnectorVariables();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.componentstorypattern.PartVariable <em>Part Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Variable</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.PartVariable
	 * @generated
	 */
	EClass getPartVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.componentstorypattern.PartVariable#getPortVariables <em>Port Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Variables</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.PartVariable#getPortVariables()
	 * @see #getPartVariable()
	 * @generated
	 */
	EReference getPartVariable_PortVariables();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.componentstorypattern.PartVariable#getComponentPartType <em>Component Part Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Part Type</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.PartVariable#getComponentPartType()
	 * @see #getPartVariable()
	 * @generated
	 */
	EReference getPartVariable_ComponentPartType();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.componentstorypattern.ConnectorVariable <em>Connector Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Variable</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.ConnectorVariable
	 * @generated
	 */
	EClass getConnectorVariable();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.reconfiguration.componentstorypattern.ConnectorVariable#getPortVariables <em>Port Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Variables</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.ConnectorVariable#getPortVariables()
	 * @see #getConnectorVariable()
	 * @generated
	 */
	EReference getConnectorVariable_PortVariables();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.componentstorypattern.AssemblyVariable <em>Assembly Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Variable</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.AssemblyVariable
	 * @generated
	 */
	EClass getAssemblyVariable();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.componentstorypattern.AssemblyVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.AssemblyVariable#getType()
	 * @see #getAssemblyVariable()
	 * @generated
	 */
	EReference getAssemblyVariable_Type();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.componentstorypattern.DelegationVariable <em>Delegation Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Variable</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.DelegationVariable
	 * @generated
	 */
	EClass getDelegationVariable();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.componentstorypattern.DelegationVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.DelegationVariable#getType()
	 * @see #getDelegationVariable()
	 * @generated
	 */
	EReference getDelegationVariable_Type();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.componentstorypattern.SinglePortVariable <em>Single Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Port Variable</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.SinglePortVariable
	 * @generated
	 */
	EClass getSinglePortVariable();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.componentstorypattern.SinglePortVariable#getMultiPortVariable <em>Multi Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Multi Port Variable</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.SinglePortVariable#getMultiPortVariable()
	 * @see #getSinglePortVariable()
	 * @generated
	 */
	EReference getSinglePortVariable_MultiPortVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.componentstorypattern.SinglePortVariable#getPositionConstraints <em>Position Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Position Constraints</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.SinglePortVariable#getPositionConstraints()
	 * @see #getSinglePortVariable()
	 * @generated
	 */
	EReference getSinglePortVariable_PositionConstraints();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.componentstorypattern.MultiPortVariable <em>Multi Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Port Variable</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.MultiPortVariable
	 * @generated
	 */
	EClass getMultiPortVariable();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.reconfiguration.componentstorypattern.MultiPortVariable#getSubPortVariables <em>Sub Port Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Port Variables</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.MultiPortVariable#getSubPortVariables()
	 * @see #getMultiPortVariable()
	 * @generated
	 */
	EReference getMultiPortVariable_SubPortVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.componentstorypattern.MultiPortVariable#getGmfSubPortVariables <em>Gmf Sub Port Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gmf Sub Port Variables</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.MultiPortVariable#getGmfSubPortVariables()
	 * @see #getMultiPortVariable()
	 * @generated
	 */
	EReference getMultiPortVariable_GmfSubPortVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.componentstorypattern.MultiPortVariable#getOrderConstraints <em>Order Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order Constraints</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.MultiPortVariable#getOrderConstraints()
	 * @see #getMultiPortVariable()
	 * @generated
	 */
	EReference getMultiPortVariable_OrderConstraints();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.componentstorypattern.TriggerEmbeddedComponentExpression <em>Trigger Embedded Component Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Embedded Component Expression</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.TriggerEmbeddedComponentExpression
	 * @generated
	 */
	EClass getTriggerEmbeddedComponentExpression();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.componentstorypattern.FadingComponentPartVariable <em>Fading Component Part Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fading Component Part Variable</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.FadingComponentPartVariable
	 * @generated
	 */
	EClass getFadingComponentPartVariable();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.componentstorypattern.FadingComponentPartVariable#getAppliedFadingFunction <em>Applied Fading Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applied Fading Function</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.FadingComponentPartVariable#getAppliedFadingFunction()
	 * @see #getFadingComponentPartVariable()
	 * @generated
	 */
	EReference getFadingComponentPartVariable_AppliedFadingFunction();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.componentstorypattern.ComponentPartVariable <em>Component Part Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Part Variable</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentPartVariable
	 * @generated
	 */
	EClass getComponentPartVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.componentstorypattern.ComponentPartVariable#getTriggerEmbeddedComponentExpressions <em>Trigger Embedded Component Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger Embedded Component Expressions</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentPartVariable#getTriggerEmbeddedComponentExpressions()
	 * @see #getComponentPartVariable()
	 * @generated
	 */
	EReference getComponentPartVariable_TriggerEmbeddedComponentExpressions();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraint <em>Multi Port Order Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Port Order Constraint</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraint
	 * @generated
	 */
	EClass getMultiPortOrderConstraint();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraint#getMultiPortVariable <em>Multi Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Multi Port Variable</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraint#getMultiPortVariable()
	 * @see #getMultiPortOrderConstraint()
	 * @generated
	 */
	EReference getMultiPortOrderConstraint_MultiPortVariable();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraint#getSrcSubPortVariable <em>Src Sub Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src Sub Port Variable</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraint#getSrcSubPortVariable()
	 * @see #getMultiPortOrderConstraint()
	 * @generated
	 */
	EReference getMultiPortOrderConstraint_SrcSubPortVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraint#getOrderConstraintType <em>Order Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Constraint Type</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraint#getOrderConstraintType()
	 * @see #getMultiPortOrderConstraint()
	 * @generated
	 */
	EAttribute getMultiPortOrderConstraint_OrderConstraintType();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraint#getTgtSubPortVariable <em>Tgt Sub Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt Sub Port Variable</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraint#getTgtSubPortVariable()
	 * @see #getMultiPortOrderConstraint()
	 * @generated
	 */
	EReference getMultiPortOrderConstraint_TgtSubPortVariable();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.componentstorypattern.MultiPortPositionConstraint <em>Multi Port Position Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Port Position Constraint</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.MultiPortPositionConstraint
	 * @generated
	 */
	EClass getMultiPortPositionConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfiguration.componentstorypattern.MultiPortPositionConstraint#getPositionConstraintType <em>Position Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Constraint Type</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.MultiPortPositionConstraint#getPositionConstraintType()
	 * @see #getMultiPortPositionConstraint()
	 * @generated
	 */
	EAttribute getMultiPortPositionConstraint_PositionConstraintType();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.reconfiguration.componentstorypattern.MultiPortPositionConstraint#getSubPortVariable <em>Sub Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sub Port Variable</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.MultiPortPositionConstraint#getSubPortVariable()
	 * @see #getMultiPortPositionConstraint()
	 * @generated
	 */
	EReference getMultiPortPositionConstraint_SubPortVariable();

	/**
	 * Returns the meta object for enum '{@link org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraintType <em>Multi Port Order Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multi Port Order Constraint Type</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraintType
	 * @generated
	 */
	EEnum getMultiPortOrderConstraintType();

	/**
	 * Returns the meta object for enum '{@link org.muml.reconfiguration.componentstorypattern.MultiPortPositionConstraintType <em>Multi Port Position Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multi Port Position Constraint Type</em>'.
	 * @see org.muml.reconfiguration.componentstorypattern.MultiPortPositionConstraintType
	 * @generated
	 */
	EEnum getMultiPortPositionConstraintType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentstorypatternFactory getComponentstorypatternFactory();

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
		 * The meta object literal for the '{@link org.muml.reconfiguration.componentstorypattern.impl.ComponentStoryPatternImpl <em>Component Story Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentStoryPatternImpl
		 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getComponentStoryPattern()
		 * @generated
		 */
		EClass COMPONENT_STORY_PATTERN = eINSTANCE.getComponentStoryPattern();

		/**
		 * The meta object literal for the '<em><b>This Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_STORY_PATTERN__THIS_VARIABLE = eINSTANCE.getComponentStoryPattern_ThisVariable();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.componentstorypattern.impl.ComponentStoryPatternVariableImpl <em>Component Story Pattern Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentStoryPatternVariableImpl
		 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getComponentStoryPatternVariable()
		 * @generated
		 */
		EClass COMPONENT_STORY_PATTERN_VARIABLE = eINSTANCE.getComponentStoryPatternVariable();

		/**
		 * The meta object literal for the '<em><b>Binding Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_STORY_PATTERN_VARIABLE__BINDING_SEMANTICS = eINSTANCE.getComponentStoryPatternVariable_BindingSemantics();

		/**
		 * The meta object literal for the '<em><b>Binding Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR = eINSTANCE.getComponentStoryPatternVariable_BindingOperator();

		/**
		 * The meta object literal for the '<em><b>Binding State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_STORY_PATTERN_VARIABLE__BINDING_STATE = eINSTANCE.getComponentStoryPatternVariable_BindingState();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.componentstorypattern.impl.ComponentVariableImpl <em>Component Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentVariableImpl
		 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getComponentVariable()
		 * @generated
		 */
		EClass COMPONENT_VARIABLE = eINSTANCE.getComponentVariable();

		/**
		 * The meta object literal for the '<em><b>Port Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_VARIABLE__PORT_VARIABLES = eINSTANCE.getComponentVariable_PortVariables();

		/**
		 * The meta object literal for the '<em><b>Part Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_VARIABLE__PART_VARIABLES = eINSTANCE.getComponentVariable_PartVariables();

		/**
		 * The meta object literal for the '<em><b>Connector Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_VARIABLE__CONNECTOR_VARIABLES = eINSTANCE.getComponentVariable_ConnectorVariables();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_VARIABLE__TYPE = eINSTANCE.getComponentVariable_Type();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.componentstorypattern.impl.PortVariableImpl <em>Port Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.componentstorypattern.impl.PortVariableImpl
		 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getPortVariable()
		 * @generated
		 */
		EClass PORT_VARIABLE = eINSTANCE.getPortVariable();

		/**
		 * The meta object literal for the '<em><b>Port Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_VARIABLE__PORT_TYPE = eINSTANCE.getPortVariable_PortType();

		/**
		 * The meta object literal for the '<em><b>Connector Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_VARIABLE__CONNECTOR_VARIABLES = eINSTANCE.getPortVariable_ConnectorVariables();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.componentstorypattern.impl.PartVariableImpl <em>Part Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.componentstorypattern.impl.PartVariableImpl
		 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getPartVariable()
		 * @generated
		 */
		EClass PART_VARIABLE = eINSTANCE.getPartVariable();

		/**
		 * The meta object literal for the '<em><b>Port Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART_VARIABLE__PORT_VARIABLES = eINSTANCE.getPartVariable_PortVariables();

		/**
		 * The meta object literal for the '<em><b>Component Part Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART_VARIABLE__COMPONENT_PART_TYPE = eINSTANCE.getPartVariable_ComponentPartType();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.componentstorypattern.impl.ConnectorVariableImpl <em>Connector Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.componentstorypattern.impl.ConnectorVariableImpl
		 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getConnectorVariable()
		 * @generated
		 */
		EClass CONNECTOR_VARIABLE = eINSTANCE.getConnectorVariable();

		/**
		 * The meta object literal for the '<em><b>Port Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_VARIABLE__PORT_VARIABLES = eINSTANCE.getConnectorVariable_PortVariables();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.componentstorypattern.impl.AssemblyVariableImpl <em>Assembly Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.componentstorypattern.impl.AssemblyVariableImpl
		 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getAssemblyVariable()
		 * @generated
		 */
		EClass ASSEMBLY_VARIABLE = eINSTANCE.getAssemblyVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_VARIABLE__TYPE = eINSTANCE.getAssemblyVariable_Type();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.componentstorypattern.impl.DelegationVariableImpl <em>Delegation Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.componentstorypattern.impl.DelegationVariableImpl
		 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getDelegationVariable()
		 * @generated
		 */
		EClass DELEGATION_VARIABLE = eINSTANCE.getDelegationVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_VARIABLE__TYPE = eINSTANCE.getDelegationVariable_Type();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.componentstorypattern.impl.SinglePortVariableImpl <em>Single Port Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.componentstorypattern.impl.SinglePortVariableImpl
		 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getSinglePortVariable()
		 * @generated
		 */
		EClass SINGLE_PORT_VARIABLE = eINSTANCE.getSinglePortVariable();

		/**
		 * The meta object literal for the '<em><b>Multi Port Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_PORT_VARIABLE__MULTI_PORT_VARIABLE = eINSTANCE.getSinglePortVariable_MultiPortVariable();

		/**
		 * The meta object literal for the '<em><b>Position Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_PORT_VARIABLE__POSITION_CONSTRAINTS = eINSTANCE.getSinglePortVariable_PositionConstraints();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.componentstorypattern.impl.MultiPortVariableImpl <em>Multi Port Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.componentstorypattern.impl.MultiPortVariableImpl
		 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getMultiPortVariable()
		 * @generated
		 */
		EClass MULTI_PORT_VARIABLE = eINSTANCE.getMultiPortVariable();

		/**
		 * The meta object literal for the '<em><b>Sub Port Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_PORT_VARIABLE__SUB_PORT_VARIABLES = eINSTANCE.getMultiPortVariable_SubPortVariables();

		/**
		 * The meta object literal for the '<em><b>Gmf Sub Port Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_PORT_VARIABLE__GMF_SUB_PORT_VARIABLES = eINSTANCE.getMultiPortVariable_GmfSubPortVariables();

		/**
		 * The meta object literal for the '<em><b>Order Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_PORT_VARIABLE__ORDER_CONSTRAINTS = eINSTANCE.getMultiPortVariable_OrderConstraints();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.componentstorypattern.impl.TriggerEmbeddedComponentExpressionImpl <em>Trigger Embedded Component Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.componentstorypattern.impl.TriggerEmbeddedComponentExpressionImpl
		 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getTriggerEmbeddedComponentExpression()
		 * @generated
		 */
		EClass TRIGGER_EMBEDDED_COMPONENT_EXPRESSION = eINSTANCE.getTriggerEmbeddedComponentExpression();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.componentstorypattern.impl.FadingComponentPartVariableImpl <em>Fading Component Part Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.componentstorypattern.impl.FadingComponentPartVariableImpl
		 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getFadingComponentPartVariable()
		 * @generated
		 */
		EClass FADING_COMPONENT_PART_VARIABLE = eINSTANCE.getFadingComponentPartVariable();

		/**
		 * The meta object literal for the '<em><b>Applied Fading Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FADING_COMPONENT_PART_VARIABLE__APPLIED_FADING_FUNCTION = eINSTANCE.getFadingComponentPartVariable_AppliedFadingFunction();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.componentstorypattern.impl.ComponentPartVariableImpl <em>Component Part Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentPartVariableImpl
		 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getComponentPartVariable()
		 * @generated
		 */
		EClass COMPONENT_PART_VARIABLE = eINSTANCE.getComponentPartVariable();

		/**
		 * The meta object literal for the '<em><b>Trigger Embedded Component Expressions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PART_VARIABLE__TRIGGER_EMBEDDED_COMPONENT_EXPRESSIONS = eINSTANCE.getComponentPartVariable_TriggerEmbeddedComponentExpressions();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.componentstorypattern.impl.MultiPortOrderConstraintImpl <em>Multi Port Order Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.componentstorypattern.impl.MultiPortOrderConstraintImpl
		 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getMultiPortOrderConstraint()
		 * @generated
		 */
		EClass MULTI_PORT_ORDER_CONSTRAINT = eINSTANCE.getMultiPortOrderConstraint();

		/**
		 * The meta object literal for the '<em><b>Multi Port Variable</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_PORT_ORDER_CONSTRAINT__MULTI_PORT_VARIABLE = eINSTANCE.getMultiPortOrderConstraint_MultiPortVariable();

		/**
		 * The meta object literal for the '<em><b>Src Sub Port Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_PORT_ORDER_CONSTRAINT__SRC_SUB_PORT_VARIABLE = eINSTANCE.getMultiPortOrderConstraint_SrcSubPortVariable();

		/**
		 * The meta object literal for the '<em><b>Order Constraint Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_PORT_ORDER_CONSTRAINT__ORDER_CONSTRAINT_TYPE = eINSTANCE.getMultiPortOrderConstraint_OrderConstraintType();

		/**
		 * The meta object literal for the '<em><b>Tgt Sub Port Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_PORT_ORDER_CONSTRAINT__TGT_SUB_PORT_VARIABLE = eINSTANCE.getMultiPortOrderConstraint_TgtSubPortVariable();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.componentstorypattern.impl.MultiPortPositionConstraintImpl <em>Multi Port Position Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.componentstorypattern.impl.MultiPortPositionConstraintImpl
		 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getMultiPortPositionConstraint()
		 * @generated
		 */
		EClass MULTI_PORT_POSITION_CONSTRAINT = eINSTANCE.getMultiPortPositionConstraint();

		/**
		 * The meta object literal for the '<em><b>Position Constraint Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_PORT_POSITION_CONSTRAINT__POSITION_CONSTRAINT_TYPE = eINSTANCE.getMultiPortPositionConstraint_PositionConstraintType();

		/**
		 * The meta object literal for the '<em><b>Sub Port Variable</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_PORT_POSITION_CONSTRAINT__SUB_PORT_VARIABLE = eINSTANCE.getMultiPortPositionConstraint_SubPortVariable();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraintType <em>Multi Port Order Constraint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraintType
		 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getMultiPortOrderConstraintType()
		 * @generated
		 */
		EEnum MULTI_PORT_ORDER_CONSTRAINT_TYPE = eINSTANCE.getMultiPortOrderConstraintType();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.componentstorypattern.MultiPortPositionConstraintType <em>Multi Port Position Constraint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.componentstorypattern.MultiPortPositionConstraintType
		 * @see org.muml.reconfiguration.componentstorypattern.impl.ComponentstorypatternPackageImpl#getMultiPortPositionConstraintType()
		 * @generated
		 */
		EEnum MULTI_PORT_POSITION_CONSTRAINT_TYPE = eINSTANCE.getMultiPortPositionConstraintType();

	}

} //ComponentstorypatternPackage
