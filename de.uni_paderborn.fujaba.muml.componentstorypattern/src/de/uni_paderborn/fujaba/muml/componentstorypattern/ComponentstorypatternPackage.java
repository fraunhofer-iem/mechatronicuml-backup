/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.core.CorePackage;
import org.storydriven.core.expressions.ExpressionsPackage;

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
 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternFactory
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
	String eNS_URI = "http://www.fujaba.de/muml/componentstorypattern/0.4.0";

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
	ComponentstorypatternPackage eINSTANCE = de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentStoryPatternImpl <em>Component Story Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentStoryPatternImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getComponentStoryPattern()
	 * @generated
	 */
	int COMPONENT_STORY_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentStoryPatternVariableImpl <em>Component Story Pattern Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentStoryPatternVariableImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getComponentStoryPatternVariable()
	 * @generated
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_VARIABLE__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentVariableImpl <em>Component Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentVariableImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getComponentVariable()
	 * @generated
	 */
	int COMPONENT_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE__ANNOTATION = COMPONENT_STORY_PATTERN_VARIABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE__EXTENSION = COMPONENT_STORY_PATTERN_VARIABLE__EXTENSION;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.PortVariableImpl <em>Port Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.PortVariableImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getPortVariable()
	 * @generated
	 */
	int PORT_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE__ANNOTATION = COMPONENT_STORY_PATTERN_VARIABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE__EXTENSION = COMPONENT_STORY_PATTERN_VARIABLE__EXTENSION;

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
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE__TYPE = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connector Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE__CONNECTOR_VARIABLES = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Port Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VARIABLE_FEATURE_COUNT = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.PartVariableImpl <em>Part Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.PartVariableImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getPartVariable()
	 * @generated
	 */
	int PART_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE__ANNOTATION = COMPONENT_STORY_PATTERN_VARIABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE__EXTENSION = COMPONENT_STORY_PATTERN_VARIABLE__EXTENSION;

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
	 * The feature id for the '<em><b>Port Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE__PORT_VARIABLES = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE__TYPE = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Part Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_VARIABLE_FEATURE_COUNT = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ConnectorVariableImpl <em>Connector Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ConnectorVariableImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getConnectorVariable()
	 * @generated
	 */
	int CONNECTOR_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE__ANNOTATION = COMPONENT_STORY_PATTERN_VARIABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE__EXTENSION = COMPONENT_STORY_PATTERN_VARIABLE__EXTENSION;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.AssemblyVariableImpl <em>Assembly Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.AssemblyVariableImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getAssemblyVariable()
	 * @generated
	 */
	int ASSEMBLY_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE__ANNOTATION = CONNECTOR_VARIABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VARIABLE__EXTENSION = CONNECTOR_VARIABLE__EXTENSION;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.DelegationVariableImpl <em>Delegation Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.DelegationVariableImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getDelegationVariable()
	 * @generated
	 */
	int DELEGATION_VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE__ANNOTATION = CONNECTOR_VARIABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_VARIABLE__EXTENSION = CONNECTOR_VARIABLE__EXTENSION;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.SinglePortVariableImpl <em>Single Port Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.SinglePortVariableImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getSinglePortVariable()
	 * @generated
	 */
	int SINGLE_PORT_VARIABLE = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE__ANNOTATION = PORT_VARIABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE__EXTENSION = PORT_VARIABLE__EXTENSION;

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
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE__TYPE = PORT_VARIABLE__TYPE;

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
	 * The number of structural features of the '<em>Single Port Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_VARIABLE_FEATURE_COUNT = PORT_VARIABLE_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.MultiPortVariableImpl <em>Multi Port Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.MultiPortVariableImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getMultiPortVariable()
	 * @generated
	 */
	int MULTI_PORT_VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE__ANNOTATION = PORT_VARIABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE__EXTENSION = PORT_VARIABLE__EXTENSION;

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
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE__TYPE = PORT_VARIABLE__TYPE;

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
	 * The number of structural features of the '<em>Multi Port Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_VARIABLE_FEATURE_COUNT = PORT_VARIABLE_FEATURE_COUNT + 2;


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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.TriggerEmbeddedComponentExpressionImpl <em>Trigger Embedded Component Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.TriggerEmbeddedComponentExpressionImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getTriggerEmbeddedComponentExpression()
	 * @generated
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EMBEDDED_COMPONENT_EXPRESSION__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.FadingComponentPartVariableImpl <em>Fading Component Part Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.FadingComponentPartVariableImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getFadingComponentPartVariable()
	 * @generated
	 */
	int FADING_COMPONENT_PART_VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE__ANNOTATION = PART_VARIABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE__EXTENSION = PART_VARIABLE__EXTENSION;

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
	 * The feature id for the '<em><b>Port Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE__PORT_VARIABLES = PART_VARIABLE__PORT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_PART_VARIABLE__TYPE = PART_VARIABLE__TYPE;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentPartVariableImpl <em>Component Part Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentPartVariableImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getComponentPartVariable()
	 * @generated
	 */
	int COMPONENT_PART_VARIABLE = 12;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE__ANNOTATION = PART_VARIABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE__EXTENSION = PART_VARIABLE__EXTENSION;

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
	 * The feature id for the '<em><b>Port Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE__PORT_VARIABLES = PART_VARIABLE__PORT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_VARIABLE__TYPE = PART_VARIABLE__TYPE;

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
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPattern <em>Component Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Story Pattern</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPattern
	 * @generated
	 */
	EClass getComponentStoryPattern();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPattern#getThisVariable <em>This Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>This Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPattern#getThisVariable()
	 * @see #getComponentStoryPattern()
	 * @generated
	 */
	EReference getComponentStoryPattern_ThisVariable();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPatternVariable <em>Component Story Pattern Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Story Pattern Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPatternVariable
	 * @generated
	 */
	EClass getComponentStoryPatternVariable();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPatternVariable#getBindingSemantics <em>Binding Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Semantics</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPatternVariable#getBindingSemantics()
	 * @see #getComponentStoryPatternVariable()
	 * @generated
	 */
	EAttribute getComponentStoryPatternVariable_BindingSemantics();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPatternVariable#getBindingOperator <em>Binding Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Operator</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPatternVariable#getBindingOperator()
	 * @see #getComponentStoryPatternVariable()
	 * @generated
	 */
	EAttribute getComponentStoryPatternVariable_BindingOperator();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPatternVariable#getBindingState <em>Binding State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding State</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPatternVariable#getBindingState()
	 * @see #getComponentStoryPatternVariable()
	 * @generated
	 */
	EAttribute getComponentStoryPatternVariable_BindingState();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable <em>Component Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable
	 * @generated
	 */
	EClass getComponentVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable#getPortVariables <em>Port Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Variables</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable#getPortVariables()
	 * @see #getComponentVariable()
	 * @generated
	 */
	EReference getComponentVariable_PortVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable#getPartVariables <em>Part Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part Variables</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable#getPartVariables()
	 * @see #getComponentVariable()
	 * @generated
	 */
	EReference getComponentVariable_PartVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable#getConnectorVariables <em>Connector Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector Variables</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable#getConnectorVariables()
	 * @see #getComponentVariable()
	 * @generated
	 */
	EReference getComponentVariable_ConnectorVariables();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable#getType()
	 * @see #getComponentVariable()
	 * @generated
	 */
	EReference getComponentVariable_Type();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable <em>Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable
	 * @generated
	 */
	EClass getPortVariable();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable#getType()
	 * @see #getPortVariable()
	 * @generated
	 */
	EReference getPortVariable_Type();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable#getConnectorVariables <em>Connector Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connector Variables</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable#getConnectorVariables()
	 * @see #getPortVariable()
	 * @generated
	 */
	EReference getPortVariable_ConnectorVariables();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.PartVariable <em>Part Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.PartVariable
	 * @generated
	 */
	EClass getPartVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.PartVariable#getPortVariables <em>Port Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Variables</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.PartVariable#getPortVariables()
	 * @see #getPartVariable()
	 * @generated
	 */
	EReference getPartVariable_PortVariables();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.PartVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.PartVariable#getType()
	 * @see #getPartVariable()
	 * @generated
	 */
	EReference getPartVariable_Type();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ConnectorVariable <em>Connector Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ConnectorVariable
	 * @generated
	 */
	EClass getConnectorVariable();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ConnectorVariable#getPortVariables <em>Port Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Variables</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ConnectorVariable#getPortVariables()
	 * @see #getConnectorVariable()
	 * @generated
	 */
	EReference getConnectorVariable_PortVariables();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.AssemblyVariable <em>Assembly Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.AssemblyVariable
	 * @generated
	 */
	EClass getAssemblyVariable();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.AssemblyVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.AssemblyVariable#getType()
	 * @see #getAssemblyVariable()
	 * @generated
	 */
	EReference getAssemblyVariable_Type();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.DelegationVariable <em>Delegation Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.DelegationVariable
	 * @generated
	 */
	EClass getDelegationVariable();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.DelegationVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.DelegationVariable#getType()
	 * @see #getDelegationVariable()
	 * @generated
	 */
	EReference getDelegationVariable_Type();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable <em>Single Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Port Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable
	 * @generated
	 */
	EClass getSinglePortVariable();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable#getMultiPortVariable <em>Multi Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Multi Port Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable#getMultiPortVariable()
	 * @see #getSinglePortVariable()
	 * @generated
	 */
	EReference getSinglePortVariable_MultiPortVariable();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable <em>Multi Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Port Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable
	 * @generated
	 */
	EClass getMultiPortVariable();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable#getSubPortVariables <em>Sub Port Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Port Variables</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable#getSubPortVariables()
	 * @see #getMultiPortVariable()
	 * @generated
	 */
	EReference getMultiPortVariable_SubPortVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable#getGmfSubPortVariables <em>Gmf Sub Port Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gmf Sub Port Variables</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable#getGmfSubPortVariables()
	 * @see #getMultiPortVariable()
	 * @generated
	 */
	EReference getMultiPortVariable_GmfSubPortVariables();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.TriggerEmbeddedComponentExpression <em>Trigger Embedded Component Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Embedded Component Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.TriggerEmbeddedComponentExpression
	 * @generated
	 */
	EClass getTriggerEmbeddedComponentExpression();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.FadingComponentPartVariable <em>Fading Component Part Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fading Component Part Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.FadingComponentPartVariable
	 * @generated
	 */
	EClass getFadingComponentPartVariable();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.FadingComponentPartVariable#getAppliedFadingFunction <em>Applied Fading Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applied Fading Function</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.FadingComponentPartVariable#getAppliedFadingFunction()
	 * @see #getFadingComponentPartVariable()
	 * @generated
	 */
	EReference getFadingComponentPartVariable_AppliedFadingFunction();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentPartVariable <em>Component Part Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Part Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentPartVariable
	 * @generated
	 */
	EClass getComponentPartVariable();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentPartVariable#getTriggerEmbeddedComponentExpressions <em>Trigger Embedded Component Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger Embedded Component Expressions</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentPartVariable#getTriggerEmbeddedComponentExpressions()
	 * @see #getComponentPartVariable()
	 * @generated
	 */
	EReference getComponentPartVariable_TriggerEmbeddedComponentExpressions();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentStoryPatternImpl <em>Component Story Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentStoryPatternImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getComponentStoryPattern()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentStoryPatternVariableImpl <em>Component Story Pattern Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentStoryPatternVariableImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getComponentStoryPatternVariable()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentVariableImpl <em>Component Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentVariableImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getComponentVariable()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.PortVariableImpl <em>Port Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.PortVariableImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getPortVariable()
		 * @generated
		 */
		EClass PORT_VARIABLE = eINSTANCE.getPortVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_VARIABLE__TYPE = eINSTANCE.getPortVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Connector Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_VARIABLE__CONNECTOR_VARIABLES = eINSTANCE.getPortVariable_ConnectorVariables();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.PartVariableImpl <em>Part Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.PartVariableImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getPartVariable()
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
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART_VARIABLE__TYPE = eINSTANCE.getPartVariable_Type();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ConnectorVariableImpl <em>Connector Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ConnectorVariableImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getConnectorVariable()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.AssemblyVariableImpl <em>Assembly Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.AssemblyVariableImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getAssemblyVariable()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.DelegationVariableImpl <em>Delegation Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.DelegationVariableImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getDelegationVariable()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.SinglePortVariableImpl <em>Single Port Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.SinglePortVariableImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getSinglePortVariable()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.MultiPortVariableImpl <em>Multi Port Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.MultiPortVariableImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getMultiPortVariable()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.TriggerEmbeddedComponentExpressionImpl <em>Trigger Embedded Component Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.TriggerEmbeddedComponentExpressionImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getTriggerEmbeddedComponentExpression()
		 * @generated
		 */
		EClass TRIGGER_EMBEDDED_COMPONENT_EXPRESSION = eINSTANCE.getTriggerEmbeddedComponentExpression();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.FadingComponentPartVariableImpl <em>Fading Component Part Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.FadingComponentPartVariableImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getFadingComponentPartVariable()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentPartVariableImpl <em>Component Part Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentPartVariableImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl#getComponentPartVariable()
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

	}

} //ComponentstorypatternPackage
