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
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage;

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
	String eNS_URI = "http://www.fujaba.de/muml/model/instance/0.3.7";

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
	int COMPONENT_INSTANCE__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__COMPONENT_TYPE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PORT_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__COMPONENT_PART = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.PortConnectorInstanceImpl <em>Port Connector Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.PortConnectorInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getPortConnectorInstance()
	 * @generated
	 */
	int PORT_CONNECTOR_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE__ANNOTATION = ConnectorPackage.CONNECTOR_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE__EXTENSION = ConnectorPackage.CONNECTOR_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE__COMMENT = ConnectorPackage.CONNECTOR_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE__TYPE = ConnectorPackage.CONNECTOR_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Connector Endpoint Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES = ConnectorPackage.CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE__SOURCE = ConnectorPackage.CONNECTOR_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE__TARGET = ConnectorPackage.CONNECTOR_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE = ConnectorPackage.CONNECTOR_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Port Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE_FEATURE_COUNT = ConnectorPackage.CONNECTOR_INSTANCE_FEATURE_COUNT + 3;

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
	int PORT_INSTANCE__ANNOTATION = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__EXTENSION = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__NAME = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__COMMENT = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__CONNECTOR_INSTANCES = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__TYPE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__PORT_TYPE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__COMPONENT_INSTANCE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_FEATURE_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.AssemblyConnectorInstanceImpl <em>Assembly Connector Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.AssemblyConnectorInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getAssemblyConnectorInstance()
	 * @generated
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE__ANNOTATION = PORT_CONNECTOR_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE__EXTENSION = PORT_CONNECTOR_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE__COMMENT = PORT_CONNECTOR_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE__TYPE = PORT_CONNECTOR_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Connector Endpoint Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES = PORT_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE__SOURCE = PORT_CONNECTOR_INSTANCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE__TARGET = PORT_CONNECTOR_INSTANCE__TARGET;

	/**
	 * The feature id for the '<em><b>Port Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE = PORT_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Assembly Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE__ASSEMBLY_CONNECTOR_TYPE = PORT_CONNECTOR_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assembly Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE_FEATURE_COUNT = PORT_CONNECTOR_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.DelegationConnectorInstanceImpl <em>Delegation Connector Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.DelegationConnectorInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getDelegationConnectorInstance()
	 * @generated
	 */
	int DELEGATION_CONNECTOR_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE__ANNOTATION = PORT_CONNECTOR_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE__EXTENSION = PORT_CONNECTOR_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE__COMMENT = PORT_CONNECTOR_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE__TYPE = PORT_CONNECTOR_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Connector Endpoint Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES = PORT_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE__SOURCE = PORT_CONNECTOR_INSTANCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE__TARGET = PORT_CONNECTOR_INSTANCE__TARGET;

	/**
	 * The feature id for the '<em><b>Port Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE = PORT_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Delegation Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE__DELEGATION_CONNECTOR_TYPE = PORT_CONNECTOR_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delegation Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE_FEATURE_COUNT = PORT_CONNECTOR_INSTANCE_FEATURE_COUNT + 1;

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
	int COMPONENT_INSTANCE_CONFIGURATION__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__PORT_CONNECTOR_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__PARENT_PORT_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Instance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;


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
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__CONNECTOR_INSTANCES = PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__TYPE = PORT_INSTANCE__TYPE;

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
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = PORT_INSTANCE__PORT_CONNECTOR_INSTANCES;

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
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__CONNECTOR_INSTANCES = PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__TYPE = PORT_INSTANCE__TYPE;

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
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = PORT_INSTANCE__PORT_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES = PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_TYPES = PORT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER = PORT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__REFINES = PORT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Discrete Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE_FEATURE_COUNT = PORT_INSTANCE_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__CONNECTOR_INSTANCES = DISCRETE_PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__TYPE = DISCRETE_PORT_INSTANCE__TYPE;

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
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = DISCRETE_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES = DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__SENDER_MESSAGE_TYPES = DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER = DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__REFINES = DISCRETE_PORT_INSTANCE__REFINES;

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
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__CONNECTOR_INSTANCES = DISCRETE_PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__TYPE = DISCRETE_PORT_INSTANCE__TYPE;

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
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = DISCRETE_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES = DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__SENDER_MESSAGE_TYPES = DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER = DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__REFINES = DISCRETE_PORT_INSTANCE__REFINES;

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
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__CONNECTOR_INSTANCES = DISCRETE_PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__TYPE = DISCRETE_PORT_INSTANCE__TYPE;

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
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = DISCRETE_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES = DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__SENDER_MESSAGE_TYPES = DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER = DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__REFINES = DISCRETE_PORT_INSTANCE__REFINES;

	/**
	 * The feature id for the '<em><b>Sub Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__SUB_PORT_INSTANCES = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gmf Sub Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__GMF_SUB_PORT_INSTANCES = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Discrete Multi Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE_FEATURE_COUNT = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.CoordinationProtocolInstanceImpl <em>Coordination Protocol Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.CoordinationProtocolInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getCoordinationProtocolInstance()
	 * @generated
	 */
	int COORDINATION_PROTOCOL_INSTANCE = 11;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE__PORT_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coordination Protocol Occurrence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL_OCCURRENCE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coordination Protocol Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.StructuredComponentInstanceImpl <em>Structured Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.StructuredComponentInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getStructuredComponentInstance()
	 * @generated
	 */
	int STRUCTURED_COMPONENT_INSTANCE = 12;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE__ANNOTATION = COMPONENT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE__EXTENSION = COMPONENT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE__NAME = COMPONENT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE__COMPONENT_TYPE = COMPONENT_INSTANCE__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE__PORT_INSTANCES = COMPONENT_INSTANCE__PORT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE__COMPONENT_PART = COMPONENT_INSTANCE__COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Embedded CIC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE__EMBEDDED_CIC = COMPONENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structured Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE_FEATURE_COUNT = COMPONENT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.AtomicComponentInstanceImpl <em>Atomic Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.AtomicComponentInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getAtomicComponentInstance()
	 * @generated
	 */
	int ATOMIC_COMPONENT_INSTANCE = 13;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE__ANNOTATION = COMPONENT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE__EXTENSION = COMPONENT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE__NAME = COMPONENT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE__COMPONENT_TYPE = COMPONENT_INSTANCE__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE__PORT_INSTANCES = COMPONENT_INSTANCE__PORT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE__COMPONENT_PART = COMPONENT_INSTANCE__COMPONENT_PART;

	/**
	 * The number of structural features of the '<em>Atomic Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE_FEATURE_COUNT = COMPONENT_INSTANCE_FEATURE_COUNT + 0;

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
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance#getComponentPart <em>Component Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance#getComponentPart()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ComponentPart();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.instance.PortConnectorInstance <em>Port Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connector Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.PortConnectorInstance
	 * @generated
	 */
	EClass getPortConnectorInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.instance.PortConnectorInstance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.PortConnectorInstance#getSource()
	 * @see #getPortConnectorInstance()
	 * @generated
	 */
	EReference getPortConnectorInstance_Source();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.instance.PortConnectorInstance#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.PortConnectorInstance#getTarget()
	 * @see #getPortConnectorInstance()
	 * @generated
	 */
	EReference getPortConnectorInstance_Target();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.instance.PortConnectorInstance#getPortConnectorType <em>Port Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Connector Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.PortConnectorInstance#getPortConnectorType()
	 * @see #getPortConnectorInstance()
	 * @generated
	 */
	EReference getPortConnectorInstance_PortConnectorType();

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
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.instance.PortInstance#getPortConnectorInstances <em>Port Connector Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Connector Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.PortInstance#getPortConnectorInstances()
	 * @see #getPortInstance()
	 * @generated
	 */
	EReference getPortInstance_PortConnectorInstances();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.instance.AssemblyConnectorInstance <em>Assembly Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Connector Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.AssemblyConnectorInstance
	 * @generated
	 */
	EClass getAssemblyConnectorInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.instance.AssemblyConnectorInstance#getAssemblyConnectorType <em>Assembly Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Connector Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.AssemblyConnectorInstance#getAssemblyConnectorType()
	 * @see #getAssemblyConnectorInstance()
	 * @generated
	 */
	EReference getAssemblyConnectorInstance_AssemblyConnectorType();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.instance.DelegationConnectorInstance <em>Delegation Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Connector Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.DelegationConnectorInstance
	 * @generated
	 */
	EClass getDelegationConnectorInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.instance.DelegationConnectorInstance#getDelegationConnectorType <em>Delegation Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegation Connector Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.DelegationConnectorInstance#getDelegationConnectorType()
	 * @see #getDelegationConnectorInstance()
	 * @generated
	 */
	EReference getDelegationConnectorInstance_DelegationConnectorType();

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
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration#getPortConnectorInstances <em>Port Connector Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Connector Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration#getPortConnectorInstances()
	 * @see #getComponentInstanceConfiguration()
	 * @generated
	 */
	EReference getComponentInstanceConfiguration_PortConnectorInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration#getParentPortInstances <em>Parent Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parent Port Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration#getParentPortInstances()
	 * @see #getComponentInstanceConfiguration()
	 * @generated
	 */
	EReference getComponentInstanceConfiguration_ParentPortInstances();

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
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance#getReceiverMessageTypes <em>Receiver Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receiver Message Types</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance#getReceiverMessageTypes()
	 * @see #getDiscretePortInstance()
	 * @generated
	 */
	EReference getDiscretePortInstance_ReceiverMessageTypes();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance#getSenderMessageTypes <em>Sender Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sender Message Types</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance#getSenderMessageTypes()
	 * @see #getDiscretePortInstance()
	 * @generated
	 */
	EReference getDiscretePortInstance_SenderMessageTypes();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receiver Message Buffer</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance#getReceiverMessageBuffer()
	 * @see #getDiscretePortInstance()
	 * @generated
	 */
	EReference getDiscretePortInstance_ReceiverMessageBuffer();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refines</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance#getRefines()
	 * @see #getDiscretePortInstance()
	 * @generated
	 */
	EReference getDiscretePortInstance_Refines();

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
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance#getGmfSubPortInstances <em>Gmf Sub Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gmf Sub Port Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance#getGmfSubPortInstances()
	 * @see #getDiscreteMultiPortInstance()
	 * @generated
	 */
	EReference getDiscreteMultiPortInstance_GmfSubPortInstances();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.instance.CoordinationProtocolInstance <em>Coordination Protocol Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Protocol Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.CoordinationProtocolInstance
	 * @generated
	 */
	EClass getCoordinationProtocolInstance();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.instance.CoordinationProtocolInstance#getPortInstances <em>Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.CoordinationProtocolInstance#getPortInstances()
	 * @see #getCoordinationProtocolInstance()
	 * @generated
	 */
	EReference getCoordinationProtocolInstance_PortInstances();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.instance.CoordinationProtocolInstance#getCoordinationProtocolOccurrence <em>Coordination Protocol Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordination Protocol Occurrence</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.CoordinationProtocolInstance#getCoordinationProtocolOccurrence()
	 * @see #getCoordinationProtocolInstance()
	 * @generated
	 */
	EReference getCoordinationProtocolInstance_CoordinationProtocolOccurrence();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.instance.StructuredComponentInstance <em>Structured Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Component Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.StructuredComponentInstance
	 * @generated
	 */
	EClass getStructuredComponentInstance();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.instance.StructuredComponentInstance#getEmbeddedCIC <em>Embedded CIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Embedded CIC</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.StructuredComponentInstance#getEmbeddedCIC()
	 * @see #getStructuredComponentInstance()
	 * @generated
	 */
	EReference getStructuredComponentInstance_EmbeddedCIC();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.instance.AtomicComponentInstance <em>Atomic Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Component Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.AtomicComponentInstance
	 * @generated
	 */
	EClass getAtomicComponentInstance();

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
		 * The meta object literal for the '<em><b>Port Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__PORT_INSTANCES = eINSTANCE.getComponentInstance_PortInstances();

		/**
		 * The meta object literal for the '<em><b>Component Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__COMPONENT_PART = eINSTANCE.getComponentInstance_ComponentPart();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.PortConnectorInstanceImpl <em>Port Connector Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.PortConnectorInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getPortConnectorInstance()
		 * @generated
		 */
		EClass PORT_CONNECTOR_INSTANCE = eINSTANCE.getPortConnectorInstance();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONNECTOR_INSTANCE__SOURCE = eINSTANCE.getPortConnectorInstance_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONNECTOR_INSTANCE__TARGET = eINSTANCE.getPortConnectorInstance_Target();

		/**
		 * The meta object literal for the '<em><b>Port Connector Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE = eINSTANCE.getPortConnectorInstance_PortConnectorType();

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
		 * The meta object literal for the '<em><b>Port Connector Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = eINSTANCE.getPortInstance_PortConnectorInstances();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.AssemblyConnectorInstanceImpl <em>Assembly Connector Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.AssemblyConnectorInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getAssemblyConnectorInstance()
		 * @generated
		 */
		EClass ASSEMBLY_CONNECTOR_INSTANCE = eINSTANCE.getAssemblyConnectorInstance();

		/**
		 * The meta object literal for the '<em><b>Assembly Connector Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR_INSTANCE__ASSEMBLY_CONNECTOR_TYPE = eINSTANCE.getAssemblyConnectorInstance_AssemblyConnectorType();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.DelegationConnectorInstanceImpl <em>Delegation Connector Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.DelegationConnectorInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getDelegationConnectorInstance()
		 * @generated
		 */
		EClass DELEGATION_CONNECTOR_INSTANCE = eINSTANCE.getDelegationConnectorInstance();

		/**
		 * The meta object literal for the '<em><b>Delegation Connector Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_CONNECTOR_INSTANCE__DELEGATION_CONNECTOR_TYPE = eINSTANCE.getDelegationConnectorInstance_DelegationConnectorType();

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
		 * The meta object literal for the '<em><b>Port Connector Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE_CONFIGURATION__PORT_CONNECTOR_INSTANCES = eINSTANCE.getComponentInstanceConfiguration_PortConnectorInstances();

		/**
		 * The meta object literal for the '<em><b>Parent Port Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE_CONFIGURATION__PARENT_PORT_INSTANCES = eINSTANCE.getComponentInstanceConfiguration_ParentPortInstances();

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
		 * The meta object literal for the '<em><b>Receiver Message Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES = eINSTANCE.getDiscretePortInstance_ReceiverMessageTypes();

		/**
		 * The meta object literal for the '<em><b>Sender Message Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_TYPES = eINSTANCE.getDiscretePortInstance_SenderMessageTypes();

		/**
		 * The meta object literal for the '<em><b>Receiver Message Buffer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER = eINSTANCE.getDiscretePortInstance_ReceiverMessageBuffer();

		/**
		 * The meta object literal for the '<em><b>Refines</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_PORT_INSTANCE__REFINES = eINSTANCE.getDiscretePortInstance_Refines();

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
		 * The meta object literal for the '<em><b>Gmf Sub Port Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_MULTI_PORT_INSTANCE__GMF_SUB_PORT_INSTANCES = eINSTANCE.getDiscreteMultiPortInstance_GmfSubPortInstances();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.CoordinationProtocolInstanceImpl <em>Coordination Protocol Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.CoordinationProtocolInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getCoordinationProtocolInstance()
		 * @generated
		 */
		EClass COORDINATION_PROTOCOL_INSTANCE = eINSTANCE.getCoordinationProtocolInstance();

		/**
		 * The meta object literal for the '<em><b>Port Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PROTOCOL_INSTANCE__PORT_INSTANCES = eINSTANCE.getCoordinationProtocolInstance_PortInstances();

		/**
		 * The meta object literal for the '<em><b>Coordination Protocol Occurrence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL_OCCURRENCE = eINSTANCE.getCoordinationProtocolInstance_CoordinationProtocolOccurrence();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.StructuredComponentInstanceImpl <em>Structured Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.StructuredComponentInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getStructuredComponentInstance()
		 * @generated
		 */
		EClass STRUCTURED_COMPONENT_INSTANCE = eINSTANCE.getStructuredComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Embedded CIC</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_COMPONENT_INSTANCE__EMBEDDED_CIC = eINSTANCE.getStructuredComponentInstance_EmbeddedCIC();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.instance.impl.AtomicComponentInstanceImpl <em>Atomic Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.AtomicComponentInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl#getAtomicComponentInstance()
		 * @generated
		 */
		EClass ATOMIC_COMPONENT_INSTANCE = eINSTANCE.getAtomicComponentInstance();

	}

} //InstancePackage
