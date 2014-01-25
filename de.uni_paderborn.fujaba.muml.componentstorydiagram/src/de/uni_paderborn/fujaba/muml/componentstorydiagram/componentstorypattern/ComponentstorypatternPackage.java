/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern;

import org.eclipse.emf.ecore.EAttribute;
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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentstorypatternFactory
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
	String eNS_URI = "http://www.fujaba.de/muml/componentstorydiagram/componentstorypattern/0.3.3";

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
	ComponentstorypatternPackage eINSTANCE = de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentStoryPatternImpl <em>Component Story Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentStoryPatternImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl#getComponentStoryPattern()
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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentStoryPatternVariableImpl <em>Component Story Pattern Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentStoryPatternVariableImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl#getComponentStoryPatternVariable()
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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentVariableImpl <em>Component Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentVariableImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl#getComponentVariable()
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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.PortVariableImpl <em>Port Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.PortVariableImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl#getPortVariable()
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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.PartVariableImpl <em>Part Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.PartVariableImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl#getPartVariable()
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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ConnectorVariableImpl <em>Connector Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ConnectorVariableImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl#getConnectorVariable()
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
	 * The feature id for the '<em><b>Port Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE__PORT_VARIABLES = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connector Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VARIABLE_FEATURE_COUNT = COMPONENT_STORY_PATTERN_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.AssemblyVariableImpl <em>Assembly Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.AssemblyVariableImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl#getAssemblyVariable()
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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.DelegationVariableImpl <em>Delegation Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.DelegationVariableImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl#getDelegationVariable()
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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.SinglePortVariableImpl <em>Single Port Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.SinglePortVariableImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl#getSinglePortVariable()
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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.MultiPortVariableImpl <em>Multi Port Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.MultiPortVariableImpl
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl#getMultiPortVariable()
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
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentStoryPattern <em>Component Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Story Pattern</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentStoryPattern
	 * @generated
	 */
	EClass getComponentStoryPattern();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentStoryPattern#getThisVariable <em>This Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>This Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentStoryPattern#getThisVariable()
	 * @see #getComponentStoryPattern()
	 * @generated
	 */
	EReference getComponentStoryPattern_ThisVariable();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentStoryPatternVariable <em>Component Story Pattern Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Story Pattern Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentStoryPatternVariable
	 * @generated
	 */
	EClass getComponentStoryPatternVariable();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentStoryPatternVariable#getBindingSemantics <em>Binding Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Semantics</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentStoryPatternVariable#getBindingSemantics()
	 * @see #getComponentStoryPatternVariable()
	 * @generated
	 */
	EAttribute getComponentStoryPatternVariable_BindingSemantics();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentStoryPatternVariable#getBindingOperator <em>Binding Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Operator</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentStoryPatternVariable#getBindingOperator()
	 * @see #getComponentStoryPatternVariable()
	 * @generated
	 */
	EAttribute getComponentStoryPatternVariable_BindingOperator();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentStoryPatternVariable#getBindingState <em>Binding State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding State</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentStoryPatternVariable#getBindingState()
	 * @see #getComponentStoryPatternVariable()
	 * @generated
	 */
	EAttribute getComponentStoryPatternVariable_BindingState();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentVariable <em>Component Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentVariable
	 * @generated
	 */
	EClass getComponentVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentVariable#getPortVariables <em>Port Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Variables</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentVariable#getPortVariables()
	 * @see #getComponentVariable()
	 * @generated
	 */
	EReference getComponentVariable_PortVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentVariable#getPartVariables <em>Part Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part Variables</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentVariable#getPartVariables()
	 * @see #getComponentVariable()
	 * @generated
	 */
	EReference getComponentVariable_PartVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentVariable#getConnectorVariables <em>Connector Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector Variables</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentVariable#getConnectorVariables()
	 * @see #getComponentVariable()
	 * @generated
	 */
	EReference getComponentVariable_ConnectorVariables();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentVariable#getType()
	 * @see #getComponentVariable()
	 * @generated
	 */
	EReference getComponentVariable_Type();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.PortVariable <em>Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.PortVariable
	 * @generated
	 */
	EClass getPortVariable();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.PortVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.PortVariable#getType()
	 * @see #getPortVariable()
	 * @generated
	 */
	EReference getPortVariable_Type();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.PortVariable#getConnectorVariables <em>Connector Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connector Variables</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.PortVariable#getConnectorVariables()
	 * @see #getPortVariable()
	 * @generated
	 */
	EReference getPortVariable_ConnectorVariables();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.PartVariable <em>Part Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.PartVariable
	 * @generated
	 */
	EClass getPartVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.PartVariable#getPortVariables <em>Port Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Variables</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.PartVariable#getPortVariables()
	 * @see #getPartVariable()
	 * @generated
	 */
	EReference getPartVariable_PortVariables();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.PartVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.PartVariable#getType()
	 * @see #getPartVariable()
	 * @generated
	 */
	EReference getPartVariable_Type();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ConnectorVariable <em>Connector Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ConnectorVariable
	 * @generated
	 */
	EClass getConnectorVariable();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ConnectorVariable#getPortVariables <em>Port Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Variables</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ConnectorVariable#getPortVariables()
	 * @see #getConnectorVariable()
	 * @generated
	 */
	EReference getConnectorVariable_PortVariables();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.AssemblyVariable <em>Assembly Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.AssemblyVariable
	 * @generated
	 */
	EClass getAssemblyVariable();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.AssemblyVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.AssemblyVariable#getType()
	 * @see #getAssemblyVariable()
	 * @generated
	 */
	EReference getAssemblyVariable_Type();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.DelegationVariable <em>Delegation Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.DelegationVariable
	 * @generated
	 */
	EClass getDelegationVariable();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.DelegationVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.DelegationVariable#getType()
	 * @see #getDelegationVariable()
	 * @generated
	 */
	EReference getDelegationVariable_Type();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.SinglePortVariable <em>Single Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Port Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.SinglePortVariable
	 * @generated
	 */
	EClass getSinglePortVariable();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.SinglePortVariable#getMultiPortVariable <em>Multi Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Multi Port Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.SinglePortVariable#getMultiPortVariable()
	 * @see #getSinglePortVariable()
	 * @generated
	 */
	EReference getSinglePortVariable_MultiPortVariable();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.MultiPortVariable <em>Multi Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Port Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.MultiPortVariable
	 * @generated
	 */
	EClass getMultiPortVariable();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.MultiPortVariable#getSubPortVariables <em>Sub Port Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Port Variables</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.MultiPortVariable#getSubPortVariables()
	 * @see #getMultiPortVariable()
	 * @generated
	 */
	EReference getMultiPortVariable_SubPortVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.MultiPortVariable#getGmfSubPortVariables <em>Gmf Sub Port Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gmf Sub Port Variables</em>'.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.MultiPortVariable#getGmfSubPortVariables()
	 * @see #getMultiPortVariable()
	 * @generated
	 */
	EReference getMultiPortVariable_GmfSubPortVariables();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentStoryPatternImpl <em>Component Story Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentStoryPatternImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl#getComponentStoryPattern()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentStoryPatternVariableImpl <em>Component Story Pattern Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentStoryPatternVariableImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl#getComponentStoryPatternVariable()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentVariableImpl <em>Component Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentVariableImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl#getComponentVariable()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.PortVariableImpl <em>Port Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.PortVariableImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl#getPortVariable()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.PartVariableImpl <em>Part Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.PartVariableImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl#getPartVariable()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ConnectorVariableImpl <em>Connector Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ConnectorVariableImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl#getConnectorVariable()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.AssemblyVariableImpl <em>Assembly Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.AssemblyVariableImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl#getAssemblyVariable()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.DelegationVariableImpl <em>Delegation Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.DelegationVariableImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl#getDelegationVariable()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.SinglePortVariableImpl <em>Single Port Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.SinglePortVariableImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl#getSinglePortVariable()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.MultiPortVariableImpl <em>Multi Port Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.MultiPortVariableImpl
		 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl#getMultiPortVariable()
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

	}

} //ComponentstorypatternPackage
