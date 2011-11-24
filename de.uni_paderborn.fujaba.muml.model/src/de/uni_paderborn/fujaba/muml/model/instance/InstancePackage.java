/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance;

import org.eclipse.emf.ecore.EClass;
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
 * The package instance contains all classes for building configurations of component instances.
 * 
 * Component instances are built from component types and connected by connectors. The resulting structure is a component instance configuration.
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.instance.InstanceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface InstancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "instance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/uni_paderborn/fujaba/muml/model/instance";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "instance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstancePackage eINSTANCE = de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__ANNOTATION = SDMPackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__EXTENSION = SDMPackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAME = SDMPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Behavioral Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__COMPONENT_TYPE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Embedded CIC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__EMBEDDED_CIC = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PORT_INSTANCES = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ConnectorInstanceImpl <em>Connector Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.ConnectorInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getConnectorInstance()
	 * @generated
	 */
	int CONNECTOR_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__ANNOTATION = SDMPackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__EXTENSION = SDMPackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Behavioral Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__BEHAVIORAL_ELEMENT_TYPE = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__SOURCE = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__TARGET = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__CONNECTOR_TYPE = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE_FEATURE_COUNT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.PortInstanceImpl <em>Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.PortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getPortInstance()
	 * @generated
	 */
	int PORT_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__ANNOTATION = SDMPackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__EXTENSION = SDMPackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__NAME = SDMPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__COMMENT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behavioral Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__PORT_TYPE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__COMPONENT_INSTANCE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Incoming Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Outgoing Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__CONNECTOR_INSTANCES = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_FEATURE_COUNT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.AssemblyInstanceImpl <em>Assembly Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.AssemblyInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getAssemblyInstance()
	 * @generated
	 */
	int ASSEMBLY_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE__ANNOTATION = CONNECTOR_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE__EXTENSION = CONNECTOR_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Behavioral Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE__BEHAVIORAL_ELEMENT_TYPE = CONNECTOR_INSTANCE__BEHAVIORAL_ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE__SOURCE = CONNECTOR_INSTANCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE__TARGET = CONNECTOR_INSTANCE__TARGET;

	/**
	 * The feature id for the '<em><b>Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE__CONNECTOR_TYPE = CONNECTOR_INSTANCE__CONNECTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Assembly Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE__ASSEMBLY_TYPE = CONNECTOR_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coordination Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE__COORDINATION_PATTERN = CONNECTOR_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assembly Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE_FEATURE_COUNT = CONNECTOR_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.DelegationInstanceImpl <em>Delegation Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.DelegationInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getDelegationInstance()
	 * @generated
	 */
	int DELEGATION_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE__ANNOTATION = CONNECTOR_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE__EXTENSION = CONNECTOR_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Behavioral Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE__BEHAVIORAL_ELEMENT_TYPE = CONNECTOR_INSTANCE__BEHAVIORAL_ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE__SOURCE = CONNECTOR_INSTANCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE__TARGET = CONNECTOR_INSTANCE__TARGET;

	/**
	 * The feature id for the '<em><b>Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE__CONNECTOR_TYPE = CONNECTOR_INSTANCE__CONNECTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Delegation Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE__DELEGATION_TYPE = CONNECTOR_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delegation Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE_FEATURE_COUNT = CONNECTOR_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceConfigurationImpl <em>Component Instance Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceConfigurationImpl
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getComponentInstanceConfiguration()
	 * @generated
	 */
	int COMPONENT_INSTANCE_CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__ANNOTATION = SDMPackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__EXTENSION = SDMPackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Component Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__CONNECTOR_INSTANCES = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Port Instances Derived</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__PARENT_PORT_INSTANCES_DERIVED = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component Instance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION_FEATURE_COUNT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ContinuousPortInstanceImpl <em>Continuous Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.ContinuousPortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getContinuousPortInstance()
	 * @generated
	 */
	int CONTINUOUS_PORT_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__ANNOTATION = PORT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__EXTENSION = PORT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__NAME = PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__COMMENT = PORT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Behavioral Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE = PORT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__PORT_TYPE = PORT_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__COMPONENT_INSTANCE = PORT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Incoming Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES = PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Outgoing Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES = PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__CONNECTOR_INSTANCES = PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The number of structural features of the '<em>Continuous Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE_FEATURE_COUNT = PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.DiscretePortInstanceImpl <em>Discrete Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.DiscretePortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getDiscretePortInstance()
	 * @generated
	 */
	int DISCRETE_PORT_INSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__ANNOTATION = PORT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__EXTENSION = PORT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__NAME = PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__COMMENT = PORT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Behavioral Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE = PORT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__PORT_TYPE = PORT_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__COMPONENT_INSTANCE = PORT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Incoming Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES = PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Outgoing Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES = PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__CONNECTOR_INSTANCES = PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Receiver Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_INTERFACE = PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sender Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_INTERFACE = PORT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Discrete Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE_FEATURE_COUNT = PORT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.HybridPortInstanceImpl <em>Hybrid Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.HybridPortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getHybridPortInstance()
	 * @generated
	 */
	int HYBRID_PORT_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__ANNOTATION = DISCRETE_PORT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__EXTENSION = DISCRETE_PORT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__NAME = DISCRETE_PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__COMMENT = DISCRETE_PORT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Behavioral Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE = DISCRETE_PORT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__PORT_TYPE = DISCRETE_PORT_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__COMPONENT_INSTANCE = DISCRETE_PORT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Incoming Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES = DISCRETE_PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Outgoing Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES = DISCRETE_PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__CONNECTOR_INSTANCES = DISCRETE_PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Receiver Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__RECEIVER_MESSAGE_INTERFACE = DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_INTERFACE;

	/**
	 * The feature id for the '<em><b>Sender Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__SENDER_MESSAGE_INTERFACE = DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_INTERFACE;

	/**
	 * The number of structural features of the '<em>Hybrid Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE_FEATURE_COUNT = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.DiscreteSinglePortInstanceImpl <em>Discrete Single Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.DiscreteSinglePortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getDiscreteSinglePortInstance()
	 * @generated
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE = 9;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__ANNOTATION = DISCRETE_PORT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__EXTENSION = DISCRETE_PORT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__NAME = DISCRETE_PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__COMMENT = DISCRETE_PORT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Behavioral Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE = DISCRETE_PORT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__PORT_TYPE = DISCRETE_PORT_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__COMPONENT_INSTANCE = DISCRETE_PORT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Incoming Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES = DISCRETE_PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Outgoing Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES = DISCRETE_PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__CONNECTOR_INSTANCES = DISCRETE_PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Receiver Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__RECEIVER_MESSAGE_INTERFACE = DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_INTERFACE;

	/**
	 * The feature id for the '<em><b>Sender Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__SENDER_MESSAGE_INTERFACE = DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_INTERFACE;

	/**
	 * The feature id for the '<em><b>Multi Port Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__MULTI_PORT_INSTANCE = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discrete Single Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE_FEATURE_COUNT = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.DiscreteMultiPortInstanceImpl <em>Discrete Multi Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.DiscreteMultiPortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getDiscreteMultiPortInstance()
	 * @generated
	 */
	int DISCRETE_MULTI_PORT_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__ANNOTATION = DISCRETE_PORT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__EXTENSION = DISCRETE_PORT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__NAME = DISCRETE_PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__COMMENT = DISCRETE_PORT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Behavioral Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE = DISCRETE_PORT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__PORT_TYPE = DISCRETE_PORT_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__COMPONENT_INSTANCE = DISCRETE_PORT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Incoming Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES = DISCRETE_PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Outgoing Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES = DISCRETE_PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__CONNECTOR_INSTANCES = DISCRETE_PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Receiver Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__RECEIVER_MESSAGE_INTERFACE = DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_INTERFACE;

	/**
	 * The feature id for the '<em><b>Sender Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__SENDER_MESSAGE_INTERFACE = DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_INTERFACE;

	/**
	 * The feature id for the '<em><b>Sub Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__SUB_PORT_INSTANCES = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discrete Multi Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE_FEATURE_COUNT = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.BehavioralElementInstanceImpl <em>Behavioral Element Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.BehavioralElementInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getBehavioralElementInstance()
	 * @generated
	 */
	int BEHAVIORAL_ELEMENT_INSTANCE = 11;

	/**
	 * The feature id for the '<em><b>Behavioral Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ELEMENT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Behavioral Element Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ELEMENT_INSTANCE_FEATURE_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance#getComponentType()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ComponentType();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance#getEmbeddedCIC <em>Embedded CIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Embedded CIC</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance#getEmbeddedCIC()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_EmbeddedCIC();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance#getPortInstances <em>Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance#getPortInstances()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_PortInstances();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance <em>Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance
	 * @generated
	 */
	EClass getConnectorInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance#getSource()
	 * @see #getConnectorInstance()
	 * @generated
	 */
	EReference getConnectorInstance_Source();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance#getTarget()
	 * @see #getConnectorInstance()
	 * @generated
	 */
	EReference getConnectorInstance_Target();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance#getConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance#getConnectorType()
	 * @see #getConnectorInstance()
	 * @generated
	 */
	EReference getConnectorInstance_ConnectorType();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.instance.PortInstance <em>Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.PortInstance
	 * @generated
	 */
	EClass getPortInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.instance.PortInstance#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.PortInstance#getPortType()
	 * @see #getPortInstance()
	 * @generated
	 */
	EReference getPortInstance_PortType();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.instance.PortInstance#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.PortInstance#getComponentInstance()
	 * @see #getPortInstance()
	 * @generated
	 */
	EReference getPortInstance_ComponentInstance();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.instance.PortInstance#getIncomingConnectorInstances <em>Incoming Connector Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Connector Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.PortInstance#getIncomingConnectorInstances()
	 * @see #getPortInstance()
	 * @generated
	 */
	EReference getPortInstance_IncomingConnectorInstances();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.instance.PortInstance#getOutgoingConnectorInstances <em>Outgoing Connector Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Connector Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.PortInstance#getOutgoingConnectorInstances()
	 * @see #getPortInstance()
	 * @generated
	 */
	EReference getPortInstance_OutgoingConnectorInstances();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.instance.PortInstance#getConnectorInstances <em>Connector Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connector Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.PortInstance#getConnectorInstances()
	 * @see #getPortInstance()
	 * @generated
	 */
	EReference getPortInstance_ConnectorInstances();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance <em>Assembly Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance
	 * @generated
	 */
	EClass getAssemblyInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance#getAssemblyType <em>Assembly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance#getAssemblyType()
	 * @see #getAssemblyInstance()
	 * @generated
	 */
	EReference getAssemblyInstance_AssemblyType();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance#getCoordinationPattern <em>Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordination Pattern</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance#getCoordinationPattern()
	 * @see #getAssemblyInstance()
	 * @generated
	 */
	EReference getAssemblyInstance_CoordinationPattern();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance <em>Delegation Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance
	 * @generated
	 */
	EClass getDelegationInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance#getDelegationType <em>Delegation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegation Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance#getDelegationType()
	 * @see #getDelegationInstance()
	 * @generated
	 */
	EReference getDelegationInstance_DelegationType();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration <em>Component Instance Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance Configuration</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration
	 * @generated
	 */
	EClass getComponentInstanceConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration#getComponentInstances <em>Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration#getComponentInstances()
	 * @see #getComponentInstanceConfiguration()
	 * @generated
	 */
	EReference getComponentInstanceConfiguration_ComponentInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration#getConnectorInstances <em>Connector Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration#getConnectorInstances()
	 * @see #getComponentInstanceConfiguration()
	 * @generated
	 */
	EReference getComponentInstanceConfiguration_ConnectorInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration#getParentPortInstancesDerived <em>Parent Port Instances Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parent Port Instances Derived</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration#getParentPortInstancesDerived()
	 * @see #getComponentInstanceConfiguration()
	 * @generated
	 */
	EReference getComponentInstanceConfiguration_ParentPortInstancesDerived();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance <em>Continuous Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuous Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance
	 * @generated
	 */
	EClass getContinuousPortInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance <em>Hybrid Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance
	 * @generated
	 */
	EClass getHybridPortInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance <em>Discrete Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance
	 * @generated
	 */
	EClass getDiscretePortInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance#getReceiverMessageInterface <em>Receiver Message Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver Message Interface</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance#getReceiverMessageInterface()
	 * @see #getDiscretePortInstance()
	 * @generated
	 */
	EReference getDiscretePortInstance_ReceiverMessageInterface();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance#getSenderMessageInterface <em>Sender Message Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender Message Interface</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance#getSenderMessageInterface()
	 * @see #getDiscretePortInstance()
	 * @generated
	 */
	EReference getDiscretePortInstance_SenderMessageInterface();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance <em>Discrete Single Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Single Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance
	 * @generated
	 */
	EClass getDiscreteSinglePortInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance#getMultiPortInstance <em>Multi Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Multi Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance#getMultiPortInstance()
	 * @see #getDiscreteSinglePortInstance()
	 * @generated
	 */
	EReference getDiscreteSinglePortInstance_MultiPortInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance <em>Discrete Multi Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Multi Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance
	 * @generated
	 */
	EClass getDiscreteMultiPortInstance();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance#getSubPortInstances <em>Sub Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Port Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance#getSubPortInstances()
	 * @see #getDiscreteMultiPortInstance()
	 * @generated
	 */
	EReference getDiscreteMultiPortInstance_SubPortInstances();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.instance.BehavioralElementInstance <em>Behavioral Element Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioral Element Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.BehavioralElementInstance
	 * @generated
	 */
	EClass getBehavioralElementInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.instance.BehavioralElementInstance#getBehavioralElementType <em>Behavioral Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavioral Element Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.BehavioralElementInstance#getBehavioralElementType()
	 * @see #getBehavioralElementInstance()
	 * @generated
	 */
	EReference getBehavioralElementInstance_BehavioralElementType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InstanceFactory getInstanceFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__COMPONENT_TYPE = eINSTANCE.getComponentInstance_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Embedded CIC</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__EMBEDDED_CIC = eINSTANCE.getComponentInstance_EmbeddedCIC();

		/**
		 * The meta object literal for the '<em><b>Port Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__PORT_INSTANCES = eINSTANCE.getComponentInstance_PortInstances();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ConnectorInstanceImpl <em>Connector Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.ConnectorInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getConnectorInstance()
		 * @generated
		 */
		EClass CONNECTOR_INSTANCE = eINSTANCE.getConnectorInstance();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_INSTANCE__SOURCE = eINSTANCE.getConnectorInstance_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_INSTANCE__TARGET = eINSTANCE.getConnectorInstance_Target();

		/**
		 * The meta object literal for the '<em><b>Connector Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_INSTANCE__CONNECTOR_TYPE = eINSTANCE.getConnectorInstance_ConnectorType();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.PortInstanceImpl <em>Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.PortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getPortInstance()
		 * @generated
		 */
		EClass PORT_INSTANCE = eINSTANCE.getPortInstance();

		/**
		 * The meta object literal for the '<em><b>Port Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE__PORT_TYPE = eINSTANCE.getPortInstance_PortType();

		/**
		 * The meta object literal for the '<em><b>Component Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE__COMPONENT_INSTANCE = eINSTANCE.getPortInstance_ComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Incoming Connector Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES = eINSTANCE.getPortInstance_IncomingConnectorInstances();

		/**
		 * The meta object literal for the '<em><b>Outgoing Connector Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES = eINSTANCE.getPortInstance_OutgoingConnectorInstances();

		/**
		 * The meta object literal for the '<em><b>Connector Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE__CONNECTOR_INSTANCES = eINSTANCE.getPortInstance_ConnectorInstances();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.AssemblyInstanceImpl <em>Assembly Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.AssemblyInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getAssemblyInstance()
		 * @generated
		 */
		EClass ASSEMBLY_INSTANCE = eINSTANCE.getAssemblyInstance();

		/**
		 * The meta object literal for the '<em><b>Assembly Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_INSTANCE__ASSEMBLY_TYPE = eINSTANCE.getAssemblyInstance_AssemblyType();

		/**
		 * The meta object literal for the '<em><b>Coordination Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_INSTANCE__COORDINATION_PATTERN = eINSTANCE.getAssemblyInstance_CoordinationPattern();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.DelegationInstanceImpl <em>Delegation Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.DelegationInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getDelegationInstance()
		 * @generated
		 */
		EClass DELEGATION_INSTANCE = eINSTANCE.getDelegationInstance();

		/**
		 * The meta object literal for the '<em><b>Delegation Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_INSTANCE__DELEGATION_TYPE = eINSTANCE.getDelegationInstance_DelegationType();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceConfigurationImpl <em>Component Instance Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceConfigurationImpl
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getComponentInstanceConfiguration()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE_CONFIGURATION = eINSTANCE.getComponentInstanceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Component Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES = eINSTANCE.getComponentInstanceConfiguration_ComponentInstances();

		/**
		 * The meta object literal for the '<em><b>Connector Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE_CONFIGURATION__CONNECTOR_INSTANCES = eINSTANCE.getComponentInstanceConfiguration_ConnectorInstances();

		/**
		 * The meta object literal for the '<em><b>Parent Port Instances Derived</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE_CONFIGURATION__PARENT_PORT_INSTANCES_DERIVED = eINSTANCE.getComponentInstanceConfiguration_ParentPortInstancesDerived();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ContinuousPortInstanceImpl <em>Continuous Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.ContinuousPortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getContinuousPortInstance()
		 * @generated
		 */
		EClass CONTINUOUS_PORT_INSTANCE = eINSTANCE.getContinuousPortInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.HybridPortInstanceImpl <em>Hybrid Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.HybridPortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getHybridPortInstance()
		 * @generated
		 */
		EClass HYBRID_PORT_INSTANCE = eINSTANCE.getHybridPortInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.DiscretePortInstanceImpl <em>Discrete Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.DiscretePortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getDiscretePortInstance()
		 * @generated
		 */
		EClass DISCRETE_PORT_INSTANCE = eINSTANCE.getDiscretePortInstance();

		/**
		 * The meta object literal for the '<em><b>Receiver Message Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_INTERFACE = eINSTANCE.getDiscretePortInstance_ReceiverMessageInterface();

		/**
		 * The meta object literal for the '<em><b>Sender Message Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_INTERFACE = eINSTANCE.getDiscretePortInstance_SenderMessageInterface();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.DiscreteSinglePortInstanceImpl <em>Discrete Single Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.DiscreteSinglePortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getDiscreteSinglePortInstance()
		 * @generated
		 */
		EClass DISCRETE_SINGLE_PORT_INSTANCE = eINSTANCE.getDiscreteSinglePortInstance();

		/**
		 * The meta object literal for the '<em><b>Multi Port Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_SINGLE_PORT_INSTANCE__MULTI_PORT_INSTANCE = eINSTANCE.getDiscreteSinglePortInstance_MultiPortInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.DiscreteMultiPortInstanceImpl <em>Discrete Multi Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.DiscreteMultiPortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getDiscreteMultiPortInstance()
		 * @generated
		 */
		EClass DISCRETE_MULTI_PORT_INSTANCE = eINSTANCE.getDiscreteMultiPortInstance();

		/**
		 * The meta object literal for the '<em><b>Sub Port Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_MULTI_PORT_INSTANCE__SUB_PORT_INSTANCES = eINSTANCE.getDiscreteMultiPortInstance_SubPortInstances();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.BehavioralElementInstanceImpl <em>Behavioral Element Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.BehavioralElementInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getBehavioralElementInstance()
		 * @generated
		 */
		EClass BEHAVIORAL_ELEMENT_INSTANCE = eINSTANCE.getBehavioralElementInstance();

		/**
		 * The meta object literal for the '<em><b>Behavioral Element Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORAL_ELEMENT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE = eINSTANCE.getBehavioralElementInstance_BehavioralElementType();

	}

} //InstancePackage
