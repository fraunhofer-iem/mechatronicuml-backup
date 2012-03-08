/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.modeling.SDMPackage;

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
 * The package components contains all classes for modeling atomic and structured components.
 * Components are defined on the type level and may be instantiated in a component instance configuration.
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ComponentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "component";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/model/component/0.2.3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "component";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentPackage eINSTANCE = de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ANNOTATION = SDMPackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__EXTENSION = SDMPackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = SDMPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMMENT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONSTRAINT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PORTS = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Referencing Component Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REFERENCING_COMPONENT_PARTS = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_TYPE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ANNOTATION = SDMPackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__EXTENSION = SDMPackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = SDMPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__COMMENT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CONSTRAINT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CARDINALITY = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incoming Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__INCOMING_CONNECTORS = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outgoing Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__OUTGOING_CONNECTORS = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__COMPONENT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CONNECTORS = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Multi Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__IS_MULTI_PORT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.ContinuousPortImpl <em>Continuous Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ContinuousPortImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getContinuousPort()
	 * @generated
	 */
	int CONTINUOUS_PORT = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__ANNOTATION = PORT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__EXTENSION = PORT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__COMMENT = PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__CONSTRAINT = PORT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__CARDINALITY = PORT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Incoming Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__INCOMING_CONNECTORS = PORT__INCOMING_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Outgoing Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__OUTGOING_CONNECTORS = PORT__OUTGOING_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__COMPONENT = PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__CONNECTORS = PORT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Is Multi Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__IS_MULTI_PORT = PORT__IS_MULTI_PORT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__KIND = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Continuous In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__IS_CONTINUOUS_IN_PORT = PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Continuous Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__IS_CONTINUOUS_OUT_PORT = PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__TYPE = PORT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Continuous Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl <em>Discrete Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getDiscretePort()
	 * @generated
	 */
	int DISCRETE_PORT = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__ANNOTATION = PORT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__EXTENSION = PORT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__COMMENT = PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__CONSTRAINT = PORT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__CARDINALITY = PORT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Incoming Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__INCOMING_CONNECTORS = PORT__INCOMING_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Outgoing Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__OUTGOING_CONNECTORS = PORT__OUTGOING_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__COMPONENT = PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__CONNECTORS = PORT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Is Multi Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__IS_MULTI_PORT = PORT__IS_MULTI_PORT;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__BEHAVIOR = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__REFINES = PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sender Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__SENDER_MESSAGE_INTERFACE = PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Receiver Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__RECEIVER_MESSAGE_INTERFACE = PORT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__ADAPTATION_BEHAVIOR = PORT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Role And Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__ROLE_AND_ADAPTATION_BEHAVIOR = PORT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Discrete In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__IS_DISCRETE_IN_PORT = PORT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Discrete Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__IS_DISCRETE_OUT_PORT = PORT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Discrete In Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__IS_DISCRETE_IN_OUT_PORT = PORT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Discrete Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getComponentPart()
	 * @generated
	 */
	int COMPONENT_PART = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__ANNOTATION = SDMPackage.COMMENTABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__EXTENSION = SDMPackage.COMMENTABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__COMMENT = SDMPackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__COMPONENT_TYPE = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__PARENT_COMPONENT = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Rev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__FROM_REV = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To Rev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__TO_REV = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Delegation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__DELEGATION = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__CARDINALITY = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports Derived</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__PORTS_DERIVED = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Multi Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__IS_MULTI_PART = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_FEATURE_COUNT = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.StructuredComponentImpl <em>Structured Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.StructuredComponentImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getStructuredComponent()
	 * @generated
	 */
	int STRUCTURED_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__ANNOTATION = COMPONENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__EXTENSION = COMPONENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__COMMENT = COMPONENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__CONSTRAINT = COMPONENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__PORTS = COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Referencing Component Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__REFERENCING_COMPONENT_PARTS = COMPONENT__REFERENCING_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__COMPONENT_TYPE = COMPONENT__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Embedded Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__EMBEDDED_PARTS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__CONNECTORS = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All Structured Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__ALL_STRUCTURED_COMPONENTS = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Atomic Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__ALL_ATOMIC_COMPONENTS = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Structured Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.AtomicComponentImpl <em>Atomic Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.AtomicComponentImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getAtomicComponent()
	 * @generated
	 */
	int ATOMIC_COMPONENT = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__ANNOTATION = COMPONENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__EXTENSION = COMPONENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__COMMENT = COMPONENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__CONSTRAINT = COMPONENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__PORTS = COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Referencing Component Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__REFERENCING_COMPONENT_PARTS = COMPONENT__REFERENCING_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__COMPONENT_TYPE = COMPONENT__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__BEHAVIOR = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.BehavioralConnectorImpl <em>Behavioral Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.BehavioralConnectorImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getBehavioralConnector()
	 * @generated
	 */
	int BEHAVIORAL_CONNECTOR = 10;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ConnectorTypeImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getConnectorType()
	 * @generated
	 */
	int CONNECTOR_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__ANNOTATION = SDMPackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__EXTENSION = SDMPackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>From Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__FROM_PORT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__TO_PORT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__PARENT_COMPONENT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To Discrete Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__TO_DISCRETE_PORT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>From Discrete Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__FROM_DISCRETE_PORT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>To Continuous Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__TO_CONTINUOUS_PORT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Continuous Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__FROM_CONTINUOUS_PORT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>To Hybrid Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__TO_HYBRID_PORT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>From Hybrid Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__FROM_HYBRID_PORT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE_FEATURE_COUNT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_CONNECTOR__ANNOTATION = CONNECTOR_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_CONNECTOR__EXTENSION = CONNECTOR_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>From Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_CONNECTOR__FROM_PORT = CONNECTOR_TYPE__FROM_PORT;

	/**
	 * The feature id for the '<em><b>To Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_CONNECTOR__TO_PORT = CONNECTOR_TYPE__TO_PORT;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_CONNECTOR__PARENT_COMPONENT = CONNECTOR_TYPE__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>To Discrete Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_CONNECTOR__TO_DISCRETE_PORT = CONNECTOR_TYPE__TO_DISCRETE_PORT;

	/**
	 * The feature id for the '<em><b>From Discrete Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_CONNECTOR__FROM_DISCRETE_PORT = CONNECTOR_TYPE__FROM_DISCRETE_PORT;

	/**
	 * The feature id for the '<em><b>To Continuous Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_CONNECTOR__TO_CONTINUOUS_PORT = CONNECTOR_TYPE__TO_CONTINUOUS_PORT;

	/**
	 * The feature id for the '<em><b>From Continuous Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_CONNECTOR__FROM_CONTINUOUS_PORT = CONNECTOR_TYPE__FROM_CONTINUOUS_PORT;

	/**
	 * The feature id for the '<em><b>To Hybrid Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_CONNECTOR__TO_HYBRID_PORT = CONNECTOR_TYPE__TO_HYBRID_PORT;

	/**
	 * The feature id for the '<em><b>From Hybrid Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_CONNECTOR__FROM_HYBRID_PORT = CONNECTOR_TYPE__FROM_HYBRID_PORT;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.AssemblyImpl <em>Assembly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.AssemblyImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getAssembly()
	 * @generated
	 */
	int ASSEMBLY = 8;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.DelegationImpl <em>Delegation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.DelegationImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getDelegation()
	 * @generated
	 */
	int DELEGATION = 9;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_CONNECTOR__BEHAVIOR = CONNECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Behavioral Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_CONNECTOR_FEATURE_COUNT = CONNECTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__ANNOTATION = BEHAVIORAL_CONNECTOR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__EXTENSION = BEHAVIORAL_CONNECTOR__EXTENSION;

	/**
	 * The feature id for the '<em><b>From Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__FROM_PORT = BEHAVIORAL_CONNECTOR__FROM_PORT;

	/**
	 * The feature id for the '<em><b>To Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__TO_PORT = BEHAVIORAL_CONNECTOR__TO_PORT;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__PARENT_COMPONENT = BEHAVIORAL_CONNECTOR__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>To Discrete Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__TO_DISCRETE_PORT = BEHAVIORAL_CONNECTOR__TO_DISCRETE_PORT;

	/**
	 * The feature id for the '<em><b>From Discrete Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__FROM_DISCRETE_PORT = BEHAVIORAL_CONNECTOR__FROM_DISCRETE_PORT;

	/**
	 * The feature id for the '<em><b>To Continuous Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__TO_CONTINUOUS_PORT = BEHAVIORAL_CONNECTOR__TO_CONTINUOUS_PORT;

	/**
	 * The feature id for the '<em><b>From Continuous Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__FROM_CONTINUOUS_PORT = BEHAVIORAL_CONNECTOR__FROM_CONTINUOUS_PORT;

	/**
	 * The feature id for the '<em><b>To Hybrid Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__TO_HYBRID_PORT = BEHAVIORAL_CONNECTOR__TO_HYBRID_PORT;

	/**
	 * The feature id for the '<em><b>From Hybrid Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__FROM_HYBRID_PORT = BEHAVIORAL_CONNECTOR__FROM_HYBRID_PORT;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__BEHAVIOR = BEHAVIORAL_CONNECTOR__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__TO = BEHAVIORAL_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__FROM = BEHAVIORAL_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Coordination Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__COORDINATION_PATTERN = BEHAVIORAL_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_FEATURE_COUNT = BEHAVIORAL_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__ANNOTATION = CONNECTOR_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__EXTENSION = CONNECTOR_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>From Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__FROM_PORT = CONNECTOR_TYPE__FROM_PORT;

	/**
	 * The feature id for the '<em><b>To Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__TO_PORT = CONNECTOR_TYPE__TO_PORT;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__PARENT_COMPONENT = CONNECTOR_TYPE__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>To Discrete Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__TO_DISCRETE_PORT = CONNECTOR_TYPE__TO_DISCRETE_PORT;

	/**
	 * The feature id for the '<em><b>From Discrete Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__FROM_DISCRETE_PORT = CONNECTOR_TYPE__FROM_DISCRETE_PORT;

	/**
	 * The feature id for the '<em><b>To Continuous Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__TO_CONTINUOUS_PORT = CONNECTOR_TYPE__TO_CONTINUOUS_PORT;

	/**
	 * The feature id for the '<em><b>From Continuous Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__FROM_CONTINUOUS_PORT = CONNECTOR_TYPE__FROM_CONTINUOUS_PORT;

	/**
	 * The feature id for the '<em><b>To Hybrid Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__TO_HYBRID_PORT = CONNECTOR_TYPE__TO_HYBRID_PORT;

	/**
	 * The feature id for the '<em><b>From Hybrid Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__FROM_HYBRID_PORT = CONNECTOR_TYPE__FROM_HYBRID_PORT;

	/**
	 * The feature id for the '<em><b>Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__COMPONENT_PART = CONNECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delegation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_FEATURE_COUNT = CONNECTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.HybridPortImpl <em>Hybrid Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.HybridPortImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getHybridPort()
	 * @generated
	 */
	int HYBRID_PORT = 11;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__ANNOTATION = DISCRETE_PORT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__EXTENSION = DISCRETE_PORT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__NAME = DISCRETE_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__COMMENT = DISCRETE_PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__CONSTRAINT = DISCRETE_PORT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__CARDINALITY = DISCRETE_PORT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Incoming Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__INCOMING_CONNECTORS = DISCRETE_PORT__INCOMING_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Outgoing Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__OUTGOING_CONNECTORS = DISCRETE_PORT__OUTGOING_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__COMPONENT = DISCRETE_PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__CONNECTORS = DISCRETE_PORT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Is Multi Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__IS_MULTI_PORT = DISCRETE_PORT__IS_MULTI_PORT;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__BEHAVIOR = DISCRETE_PORT__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__REFINES = DISCRETE_PORT__REFINES;

	/**
	 * The feature id for the '<em><b>Sender Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__SENDER_MESSAGE_INTERFACE = DISCRETE_PORT__SENDER_MESSAGE_INTERFACE;

	/**
	 * The feature id for the '<em><b>Receiver Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__RECEIVER_MESSAGE_INTERFACE = DISCRETE_PORT__RECEIVER_MESSAGE_INTERFACE;

	/**
	 * The feature id for the '<em><b>Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__ADAPTATION_BEHAVIOR = DISCRETE_PORT__ADAPTATION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Role And Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__ROLE_AND_ADAPTATION_BEHAVIOR = DISCRETE_PORT__ROLE_AND_ADAPTATION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Is Discrete In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__IS_DISCRETE_IN_PORT = DISCRETE_PORT__IS_DISCRETE_IN_PORT;

	/**
	 * The feature id for the '<em><b>Is Discrete Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__IS_DISCRETE_OUT_PORT = DISCRETE_PORT__IS_DISCRETE_OUT_PORT;

	/**
	 * The feature id for the '<em><b>Is Discrete In Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__IS_DISCRETE_IN_OUT_PORT = DISCRETE_PORT__IS_DISCRETE_IN_OUT_PORT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__KIND = DISCRETE_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Continuous In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__IS_CONTINUOUS_IN_PORT = DISCRETE_PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Continuous Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__IS_CONTINUOUS_OUT_PORT = DISCRETE_PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__TYPE = DISCRETE_PORT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Hybrid In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__IS_HYBRID_IN_PORT = DISCRETE_PORT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Hybrid Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__IS_HYBRID_OUT_PORT = DISCRETE_PORT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Hybrid Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_FEATURE_COUNT = DISCRETE_PORT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentKind <em>Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentKind
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getComponentKind()
	 * @generated
	 */
	int COMPONENT_KIND = 12;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind <em>Continuous Port Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getContinuousPortDirectionKind()
	 * @generated
	 */
	int CONTINUOUS_PORT_DIRECTION_KIND = 13;

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.component.Component#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Component#getPorts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Ports();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.component.Component#getReferencingComponentParts <em>Referencing Component Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referencing Component Parts</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Component#getReferencingComponentParts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ReferencingComponentParts();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.component.Component#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Component#getComponentType()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ComponentType();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.component.Port#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Port#getComponent()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Component();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.component.Port#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connectors</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Port#getConnectors()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Connectors();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.component.Port#isIsMultiPort <em>Is Multi Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multi Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Port#isIsMultiPort()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_IsMultiPort();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPort <em>Continuous Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuous Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ContinuousPort
	 * @generated
	 */
	EClass getContinuousPort();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPort#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ContinuousPort#getKind()
	 * @see #getContinuousPort()
	 * @generated
	 */
	EAttribute getContinuousPort_Kind();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPort#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ContinuousPort#getType()
	 * @see #getContinuousPort()
	 * @generated
	 */
	EReference getContinuousPort_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPort#isIsContinuousInPort <em>Is Continuous In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Continuous In Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ContinuousPort#isIsContinuousInPort()
	 * @see #getContinuousPort()
	 * @generated
	 */
	EAttribute getContinuousPort_IsContinuousInPort();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPort#isIsContinuousOutPort <em>Is Continuous Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Continuous Out Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ContinuousPort#isIsContinuousOutPort()
	 * @see #getContinuousPort()
	 * @generated
	 */
	EAttribute getContinuousPort_IsContinuousOutPort();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort <em>Discrete Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.DiscretePort
	 * @generated
	 */
	EClass getDiscretePort();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refines</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getRefines()
	 * @see #getDiscretePort()
	 * @generated
	 */
	EReference getDiscretePort_Refines();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getSenderMessageInterface <em>Sender Message Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender Message Interface</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getSenderMessageInterface()
	 * @see #getDiscretePort()
	 * @generated
	 */
	EReference getDiscretePort_SenderMessageInterface();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getReceiverMessageInterface <em>Receiver Message Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver Message Interface</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getReceiverMessageInterface()
	 * @see #getDiscretePort()
	 * @generated
	 */
	EReference getDiscretePort_ReceiverMessageInterface();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getAdaptationBehavior <em>Adaptation Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Adaptation Behavior</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getAdaptationBehavior()
	 * @see #getDiscretePort()
	 * @generated
	 */
	EReference getDiscretePort_AdaptationBehavior();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getRoleAndAdaptationBehavior <em>Role And Adaptation Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role And Adaptation Behavior</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getRoleAndAdaptationBehavior()
	 * @see #getDiscretePort()
	 * @generated
	 */
	EReference getDiscretePort_RoleAndAdaptationBehavior();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#isIsDiscreteInPort <em>Is Discrete In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Discrete In Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.DiscretePort#isIsDiscreteInPort()
	 * @see #getDiscretePort()
	 * @generated
	 */
	EAttribute getDiscretePort_IsDiscreteInPort();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#isIsDiscreteOutPort <em>Is Discrete Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Discrete Out Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.DiscretePort#isIsDiscreteOutPort()
	 * @see #getDiscretePort()
	 * @generated
	 */
	EAttribute getDiscretePort_IsDiscreteOutPort();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#isIsDiscreteInOutPort <em>Is Discrete In Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Discrete In Out Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.DiscretePort#isIsDiscreteInOutPort()
	 * @see #getDiscretePort()
	 * @generated
	 */
	EAttribute getDiscretePort_IsDiscreteInOutPort();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.component.Port#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Port#getCardinality()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Cardinality();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.component.Port#getIncomingConnectors <em>Incoming Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Connectors</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Port#getIncomingConnectors()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_IncomingConnectors();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.component.Port#getOutgoingConnectors <em>Outgoing Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Connectors</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Port#getOutgoingConnectors()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_OutgoingConnectors();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart
	 * @generated
	 */
	EClass getComponentPart();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getComponentType()
	 * @see #getComponentPart()
	 * @generated
	 */
	EReference getComponentPart_ComponentType();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getParentComponent <em>Parent Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Component</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getParentComponent()
	 * @see #getComponentPart()
	 * @generated
	 */
	EReference getComponentPart_ParentComponent();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getFromRev <em>From Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Rev</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getFromRev()
	 * @see #getComponentPart()
	 * @generated
	 */
	EReference getComponentPart_FromRev();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getToRev <em>To Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Rev</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getToRev()
	 * @see #getComponentPart()
	 * @generated
	 */
	EReference getComponentPart_ToRev();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getDelegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delegation</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getDelegation()
	 * @see #getComponentPart()
	 * @generated
	 */
	EReference getComponentPart_Delegation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getPortsDerived <em>Ports Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports Derived</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getPortsDerived()
	 * @see #getComponentPart()
	 * @generated
	 */
	EReference getComponentPart_PortsDerived();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#isIsMultiPart <em>Is Multi Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multi Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart#isIsMultiPart()
	 * @see #getComponentPart()
	 * @generated
	 */
	EAttribute getComponentPart_IsMultiPart();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getCardinality()
	 * @see #getComponentPart()
	 * @generated
	 */
	EReference getComponentPart_Cardinality();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent <em>Structured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Component</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.StructuredComponent
	 * @generated
	 */
	EClass getStructuredComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getEmbeddedParts <em>Embedded Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Parts</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getEmbeddedParts()
	 * @see #getStructuredComponent()
	 * @generated
	 */
	EReference getStructuredComponent_EmbeddedParts();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getConnectors()
	 * @see #getStructuredComponent()
	 * @generated
	 */
	EReference getStructuredComponent_Connectors();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getAllStructuredComponents <em>All Structured Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Structured Components</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getAllStructuredComponents()
	 * @see #getStructuredComponent()
	 * @generated
	 */
	EReference getStructuredComponent_AllStructuredComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getAllAtomicComponents <em>All Atomic Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Atomic Components</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getAllAtomicComponents()
	 * @see #getStructuredComponent()
	 * @generated
	 */
	EReference getStructuredComponent_AllAtomicComponents();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.AtomicComponent <em>Atomic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Component</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.AtomicComponent
	 * @generated
	 */
	EClass getAtomicComponent();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ConnectorType
	 * @generated
	 */
	EClass getConnectorType();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getFromPort <em>From Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getFromPort()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_FromPort();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getToPort <em>To Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getToPort()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_ToPort();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getParentComponent <em>Parent Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Component</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getParentComponent()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_ParentComponent();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getToDiscretePort <em>To Discrete Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Discrete Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getToDiscretePort()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_ToDiscretePort();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getFromDiscretePort <em>From Discrete Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Discrete Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getFromDiscretePort()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_FromDiscretePort();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getToContinuousPort <em>To Continuous Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Continuous Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getToContinuousPort()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_ToContinuousPort();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getFromContinuousPort <em>From Continuous Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Continuous Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getFromContinuousPort()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_FromContinuousPort();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getToHybridPort <em>To Hybrid Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Hybrid Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getToHybridPort()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_ToHybridPort();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getFromHybridPort <em>From Hybrid Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Hybrid Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getFromHybridPort()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_FromHybridPort();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.Assembly <em>Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Assembly
	 * @generated
	 */
	EClass getAssembly();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.Assembly#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Assembly#getTo()
	 * @see #getAssembly()
	 * @generated
	 */
	EReference getAssembly_To();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.Assembly#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Assembly#getFrom()
	 * @see #getAssembly()
	 * @generated
	 */
	EReference getAssembly_From();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.Assembly#getCoordinationPattern <em>Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordination Pattern</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Assembly#getCoordinationPattern()
	 * @see #getAssembly()
	 * @generated
	 */
	EReference getAssembly_CoordinationPattern();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.Delegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Delegation
	 * @generated
	 */
	EClass getDelegation();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.Delegation#getComponentPart <em>Component Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Delegation#getComponentPart()
	 * @see #getDelegation()
	 * @generated
	 */
	EReference getDelegation_ComponentPart();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.BehavioralConnector <em>Behavioral Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioral Connector</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.BehavioralConnector
	 * @generated
	 */
	EClass getBehavioralConnector();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.HybridPort <em>Hybrid Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.HybridPort
	 * @generated
	 */
	EClass getHybridPort();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.component.HybridPort#isIsHybridInPort <em>Is Hybrid In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Hybrid In Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.HybridPort#isIsHybridInPort()
	 * @see #getHybridPort()
	 * @generated
	 */
	EAttribute getHybridPort_IsHybridInPort();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.component.HybridPort#isIsHybridOutPort <em>Is Hybrid Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Hybrid Out Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.HybridPort#isIsHybridOutPort()
	 * @see #getHybridPort()
	 * @generated
	 */
	EAttribute getHybridPort_IsHybridOutPort();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentKind
	 * @generated
	 */
	EEnum getComponentKind();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind <em>Continuous Port Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Continuous Port Direction Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind
	 * @generated
	 */
	EEnum getContinuousPortDirectionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentFactory getComponentFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PORTS = eINSTANCE.getComponent_Ports();

		/**
		 * The meta object literal for the '<em><b>Referencing Component Parts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__REFERENCING_COMPONENT_PARTS = eINSTANCE.getComponent_ReferencingComponentParts();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__COMPONENT_TYPE = eINSTANCE.getComponent_ComponentType();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__COMPONENT = eINSTANCE.getPort_Component();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__CONNECTORS = eINSTANCE.getPort_Connectors();

		/**
		 * The meta object literal for the '<em><b>Is Multi Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__IS_MULTI_PORT = eINSTANCE.getPort_IsMultiPort();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.ContinuousPortImpl <em>Continuous Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ContinuousPortImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getContinuousPort()
		 * @generated
		 */
		EClass CONTINUOUS_PORT = eINSTANCE.getContinuousPort();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINUOUS_PORT__KIND = eINSTANCE.getContinuousPort_Kind();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTINUOUS_PORT__TYPE = eINSTANCE.getContinuousPort_Type();

		/**
		 * The meta object literal for the '<em><b>Is Continuous In Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINUOUS_PORT__IS_CONTINUOUS_IN_PORT = eINSTANCE.getContinuousPort_IsContinuousInPort();

		/**
		 * The meta object literal for the '<em><b>Is Continuous Out Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINUOUS_PORT__IS_CONTINUOUS_OUT_PORT = eINSTANCE.getContinuousPort_IsContinuousOutPort();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl <em>Discrete Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getDiscretePort()
		 * @generated
		 */
		EClass DISCRETE_PORT = eINSTANCE.getDiscretePort();

		/**
		 * The meta object literal for the '<em><b>Refines</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_PORT__REFINES = eINSTANCE.getDiscretePort_Refines();

		/**
		 * The meta object literal for the '<em><b>Sender Message Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_PORT__SENDER_MESSAGE_INTERFACE = eINSTANCE.getDiscretePort_SenderMessageInterface();

		/**
		 * The meta object literal for the '<em><b>Receiver Message Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_PORT__RECEIVER_MESSAGE_INTERFACE = eINSTANCE.getDiscretePort_ReceiverMessageInterface();

		/**
		 * The meta object literal for the '<em><b>Adaptation Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_PORT__ADAPTATION_BEHAVIOR = eINSTANCE.getDiscretePort_AdaptationBehavior();

		/**
		 * The meta object literal for the '<em><b>Role And Adaptation Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_PORT__ROLE_AND_ADAPTATION_BEHAVIOR = eINSTANCE.getDiscretePort_RoleAndAdaptationBehavior();

		/**
		 * The meta object literal for the '<em><b>Is Discrete In Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_PORT__IS_DISCRETE_IN_PORT = eINSTANCE.getDiscretePort_IsDiscreteInPort();

		/**
		 * The meta object literal for the '<em><b>Is Discrete Out Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_PORT__IS_DISCRETE_OUT_PORT = eINSTANCE.getDiscretePort_IsDiscreteOutPort();

		/**
		 * The meta object literal for the '<em><b>Is Discrete In Out Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_PORT__IS_DISCRETE_IN_OUT_PORT = eINSTANCE.getDiscretePort_IsDiscreteInOutPort();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__CARDINALITY = eINSTANCE.getPort_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Incoming Connectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__INCOMING_CONNECTORS = eINSTANCE.getPort_IncomingConnectors();

		/**
		 * The meta object literal for the '<em><b>Outgoing Connectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__OUTGOING_CONNECTORS = eINSTANCE.getPort_OutgoingConnectors();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getComponentPart()
		 * @generated
		 */
		EClass COMPONENT_PART = eINSTANCE.getComponentPart();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PART__COMPONENT_TYPE = eINSTANCE.getComponentPart_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Parent Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PART__PARENT_COMPONENT = eINSTANCE.getComponentPart_ParentComponent();

		/**
		 * The meta object literal for the '<em><b>From Rev</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PART__FROM_REV = eINSTANCE.getComponentPart_FromRev();

		/**
		 * The meta object literal for the '<em><b>To Rev</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PART__TO_REV = eINSTANCE.getComponentPart_ToRev();

		/**
		 * The meta object literal for the '<em><b>Delegation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PART__DELEGATION = eINSTANCE.getComponentPart_Delegation();

		/**
		 * The meta object literal for the '<em><b>Ports Derived</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PART__PORTS_DERIVED = eINSTANCE.getComponentPart_PortsDerived();

		/**
		 * The meta object literal for the '<em><b>Is Multi Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_PART__IS_MULTI_PART = eINSTANCE.getComponentPart_IsMultiPart();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PART__CARDINALITY = eINSTANCE.getComponentPart_Cardinality();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.StructuredComponentImpl <em>Structured Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.StructuredComponentImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getStructuredComponent()
		 * @generated
		 */
		EClass STRUCTURED_COMPONENT = eINSTANCE.getStructuredComponent();

		/**
		 * The meta object literal for the '<em><b>Embedded Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_COMPONENT__EMBEDDED_PARTS = eINSTANCE.getStructuredComponent_EmbeddedParts();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_COMPONENT__CONNECTORS = eINSTANCE.getStructuredComponent_Connectors();

		/**
		 * The meta object literal for the '<em><b>All Structured Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_COMPONENT__ALL_STRUCTURED_COMPONENTS = eINSTANCE.getStructuredComponent_AllStructuredComponents();

		/**
		 * The meta object literal for the '<em><b>All Atomic Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_COMPONENT__ALL_ATOMIC_COMPONENTS = eINSTANCE.getStructuredComponent_AllAtomicComponents();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.AtomicComponentImpl <em>Atomic Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.AtomicComponentImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getAtomicComponent()
		 * @generated
		 */
		EClass ATOMIC_COMPONENT = eINSTANCE.getAtomicComponent();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ConnectorTypeImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getConnectorType()
		 * @generated
		 */
		EClass CONNECTOR_TYPE = eINSTANCE.getConnectorType();

		/**
		 * The meta object literal for the '<em><b>From Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TYPE__FROM_PORT = eINSTANCE.getConnectorType_FromPort();

		/**
		 * The meta object literal for the '<em><b>To Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TYPE__TO_PORT = eINSTANCE.getConnectorType_ToPort();

		/**
		 * The meta object literal for the '<em><b>Parent Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TYPE__PARENT_COMPONENT = eINSTANCE.getConnectorType_ParentComponent();

		/**
		 * The meta object literal for the '<em><b>To Discrete Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TYPE__TO_DISCRETE_PORT = eINSTANCE.getConnectorType_ToDiscretePort();

		/**
		 * The meta object literal for the '<em><b>From Discrete Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TYPE__FROM_DISCRETE_PORT = eINSTANCE.getConnectorType_FromDiscretePort();

		/**
		 * The meta object literal for the '<em><b>To Continuous Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TYPE__TO_CONTINUOUS_PORT = eINSTANCE.getConnectorType_ToContinuousPort();

		/**
		 * The meta object literal for the '<em><b>From Continuous Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TYPE__FROM_CONTINUOUS_PORT = eINSTANCE.getConnectorType_FromContinuousPort();

		/**
		 * The meta object literal for the '<em><b>To Hybrid Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TYPE__TO_HYBRID_PORT = eINSTANCE.getConnectorType_ToHybridPort();

		/**
		 * The meta object literal for the '<em><b>From Hybrid Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TYPE__FROM_HYBRID_PORT = eINSTANCE.getConnectorType_FromHybridPort();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.AssemblyImpl <em>Assembly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.AssemblyImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getAssembly()
		 * @generated
		 */
		EClass ASSEMBLY = eINSTANCE.getAssembly();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY__TO = eINSTANCE.getAssembly_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY__FROM = eINSTANCE.getAssembly_From();

		/**
		 * The meta object literal for the '<em><b>Coordination Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY__COORDINATION_PATTERN = eINSTANCE.getAssembly_CoordinationPattern();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.DelegationImpl <em>Delegation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.DelegationImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getDelegation()
		 * @generated
		 */
		EClass DELEGATION = eINSTANCE.getDelegation();

		/**
		 * The meta object literal for the '<em><b>Component Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION__COMPONENT_PART = eINSTANCE.getDelegation_ComponentPart();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.BehavioralConnectorImpl <em>Behavioral Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.BehavioralConnectorImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getBehavioralConnector()
		 * @generated
		 */
		EClass BEHAVIORAL_CONNECTOR = eINSTANCE.getBehavioralConnector();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.HybridPortImpl <em>Hybrid Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.HybridPortImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getHybridPort()
		 * @generated
		 */
		EClass HYBRID_PORT = eINSTANCE.getHybridPort();

		/**
		 * The meta object literal for the '<em><b>Is Hybrid In Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYBRID_PORT__IS_HYBRID_IN_PORT = eINSTANCE.getHybridPort_IsHybridInPort();

		/**
		 * The meta object literal for the '<em><b>Is Hybrid Out Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYBRID_PORT__IS_HYBRID_OUT_PORT = eINSTANCE.getHybridPort_IsHybridOutPort();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentKind <em>Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentKind
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getComponentKind()
		 * @generated
		 */
		EEnum COMPONENT_KIND = eINSTANCE.getComponentKind();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind <em>Continuous Port Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getContinuousPortDirectionKind()
		 * @generated
		 */
		EEnum CONTINUOUS_PORT_DIRECTION_KIND = eINSTANCE.getContinuousPortDirectionKind();

	}

} //ComponentPackage
