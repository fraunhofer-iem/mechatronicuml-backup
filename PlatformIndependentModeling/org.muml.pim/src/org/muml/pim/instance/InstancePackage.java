/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.core.CorePackage;
import org.muml.pim.connector.ConnectorPackage;

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
 * @see org.muml.pim.instance.InstanceFactory
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
	String eNS_URI = "http://www.muml.org/pim/instance/1.0.0";

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
	InstancePackage eINSTANCE = org.muml.pim.instance.impl.InstancePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.pim.instance.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.instance.impl.ComponentInstanceImpl
	 * @see org.muml.pim.instance.impl.InstancePackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

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
	 * The feature id for the '<em><b>Parent CIC</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PARENT_CIC = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Top Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__TOP_LEVEL = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.instance.impl.PortConnectorInstanceImpl <em>Port Connector Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.instance.impl.PortConnectorInstanceImpl
	 * @see org.muml.pim.instance.impl.InstancePackageImpl#getPortConnectorInstance()
	 * @generated
	 */
	int PORT_CONNECTOR_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE__ANNOTATIONS = ConnectorPackage.CONNECTOR_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE__EXTENSIONS = ConnectorPackage.CONNECTOR_INSTANCE__EXTENSIONS;

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
	 * The feature id for the '<em><b>Port Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE = ConnectorPackage.CONNECTOR_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE__PORT_INSTANCES = ConnectorPackage.CONNECTOR_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE_FEATURE_COUNT = ConnectorPackage.CONNECTOR_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE___GET_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Port Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE_OPERATION_COUNT = ConnectorPackage.CONNECTOR_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.instance.impl.PortInstanceImpl <em>Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.instance.impl.PortInstanceImpl
	 * @see org.muml.pim.instance.impl.InstancePackageImpl#getPortInstance()
	 * @generated
	 */
	int PORT_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__ANNOTATIONS = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__EXTENSIONS = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__EXTENSIONS;

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
	 * The feature id for the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__PORT_PART = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_FEATURE_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___GET_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_OPERATION_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.instance.impl.AssemblyConnectorInstanceImpl <em>Assembly Connector Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.instance.impl.AssemblyConnectorInstanceImpl
	 * @see org.muml.pim.instance.impl.InstancePackageImpl#getAssemblyConnectorInstance()
	 * @generated
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE__ANNOTATIONS = PORT_CONNECTOR_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE__EXTENSIONS = PORT_CONNECTOR_INSTANCE__EXTENSIONS;

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
	 * The feature id for the '<em><b>Port Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE = PORT_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE__PORT_INSTANCES = PORT_CONNECTOR_INSTANCE__PORT_INSTANCES;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE___GET_EXTENSION__ECLASS = PORT_CONNECTOR_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Assembly Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE_OPERATION_COUNT = PORT_CONNECTOR_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.instance.impl.DelegationConnectorInstanceImpl <em>Delegation Connector Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.instance.impl.DelegationConnectorInstanceImpl
	 * @see org.muml.pim.instance.impl.InstancePackageImpl#getDelegationConnectorInstance()
	 * @generated
	 */
	int DELEGATION_CONNECTOR_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE__ANNOTATIONS = PORT_CONNECTOR_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE__EXTENSIONS = PORT_CONNECTOR_INSTANCE__EXTENSIONS;

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
	 * The feature id for the '<em><b>Port Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE = PORT_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE__PORT_INSTANCES = PORT_CONNECTOR_INSTANCE__PORT_INSTANCES;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE___GET_EXTENSION__ECLASS = PORT_CONNECTOR_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Delegation Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE_OPERATION_COUNT = PORT_CONNECTOR_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.instance.impl.ComponentInstanceConfigurationImpl <em>Component Instance Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.instance.impl.ComponentInstanceConfigurationImpl
	 * @see org.muml.pim.instance.impl.InstancePackageImpl#getComponentInstanceConfiguration()
	 * @generated
	 */
	int COMPONENT_INSTANCE_CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

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
	 * The feature id for the '<em><b>Verification Constraint Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__VERIFICATION_CONSTRAINT_REPOSITORIES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__PORT_CONNECTOR_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__PARENT_PORT_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent Structured Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__PARENT_STRUCTURED_COMPONENT_INSTANCE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Coordination Protocol Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__COORDINATION_PROTOCOL_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Component Instance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;


	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Component Instance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.instance.impl.ContinuousPortInstanceImpl <em>Continuous Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.instance.impl.ContinuousPortInstanceImpl
	 * @see org.muml.pim.instance.impl.InstancePackageImpl#getContinuousPortInstance()
	 * @generated
	 */
	int CONTINUOUS_PORT_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__ANNOTATIONS = PORT_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__EXTENSIONS = PORT_INSTANCE__EXTENSIONS;

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
	 * The feature id for the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__PORT_PART = PORT_INSTANCE__PORT_PART;

	/**
	 * The number of structural features of the '<em>Continuous Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE_FEATURE_COUNT = PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE___GET_EXTENSION__ECLASS = PORT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Continuous Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE_OPERATION_COUNT = PORT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.instance.impl.DiscretePortInstanceImpl <em>Discrete Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.instance.impl.DiscretePortInstanceImpl
	 * @see org.muml.pim.instance.impl.InstancePackageImpl#getDiscretePortInstance()
	 * @generated
	 */
	int DISCRETE_PORT_INSTANCE = 8;

	/**
	 * The meta object id for the '{@link org.muml.pim.instance.impl.HybridPortInstanceImpl <em>Hybrid Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.instance.impl.HybridPortInstanceImpl
	 * @see org.muml.pim.instance.impl.InstancePackageImpl#getHybridPortInstance()
	 * @generated
	 */
	int HYBRID_PORT_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__ANNOTATIONS = PORT_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__EXTENSIONS = PORT_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__NAME = PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__COMMENT = PORT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__CONNECTOR_INSTANCES = PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__TYPE = PORT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__PORT_TYPE = PORT_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__COMPONENT_INSTANCE = PORT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = PORT_INSTANCE__PORT_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__PORT_PART = PORT_INSTANCE__PORT_PART;

	/**
	 * The number of structural features of the '<em>Hybrid Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE_FEATURE_COUNT = PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE___GET_EXTENSION__ECLASS = PORT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Hybrid Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE_OPERATION_COUNT = PORT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__ANNOTATIONS = PORT_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__EXTENSIONS = PORT_INSTANCE__EXTENSIONS;

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
	 * The feature id for the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__PORT_PART = PORT_INSTANCE__PORT_PART;

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
	 * The feature id for the '<em><b>Refined Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__REFINED_ROLE = PORT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Discrete Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE_FEATURE_COUNT = PORT_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE___GET_EXTENSION__ECLASS = PORT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Discrete Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE_OPERATION_COUNT = PORT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.instance.impl.DiscreteSinglePortInstanceImpl <em>Discrete Single Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.instance.impl.DiscreteSinglePortInstanceImpl
	 * @see org.muml.pim.instance.impl.InstancePackageImpl#getDiscreteSinglePortInstance()
	 * @generated
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__ANNOTATIONS = DISCRETE_PORT_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__EXTENSIONS = DISCRETE_PORT_INSTANCE__EXTENSIONS;

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
	 * The feature id for the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__PORT_PART = DISCRETE_PORT_INSTANCE__PORT_PART;

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
	 * The feature id for the '<em><b>Refined Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__REFINED_ROLE = DISCRETE_PORT_INSTANCE__REFINED_ROLE;

	/**
	 * The feature id for the '<em><b>Multi Interaction Endpoint Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__NEXT = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__PREVIOUS = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__FIRST = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__LAST = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Discrete Single Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE_FEATURE_COUNT = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE___GET_EXTENSION__ECLASS = DISCRETE_PORT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Discrete Single Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE_OPERATION_COUNT = DISCRETE_PORT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.instance.impl.DiscreteMultiPortInstanceImpl <em>Discrete Multi Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.instance.impl.DiscreteMultiPortInstanceImpl
	 * @see org.muml.pim.instance.impl.InstancePackageImpl#getDiscreteMultiPortInstance()
	 * @generated
	 */
	int DISCRETE_MULTI_PORT_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__ANNOTATIONS = DISCRETE_PORT_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__EXTENSIONS = DISCRETE_PORT_INSTANCE__EXTENSIONS;

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
	 * The feature id for the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__PORT_PART = DISCRETE_PORT_INSTANCE__PORT_PART;

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
	 * The feature id for the '<em><b>Refined Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__REFINED_ROLE = DISCRETE_PORT_INSTANCE__REFINED_ROLE;

	/**
	 * The feature id for the '<em><b>Sub Interaction Endpoint Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__FIRST = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__LAST = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gmf Sub Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__GMF_SUB_PORT_INSTANCES = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Discrete Multi Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE_FEATURE_COUNT = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE___GET_EXTENSION__ECLASS = DISCRETE_PORT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Discrete Multi Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE_OPERATION_COUNT = DISCRETE_PORT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.instance.impl.CoordinationProtocolInstanceImpl <em>Coordination Protocol Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.instance.impl.CoordinationProtocolInstanceImpl
	 * @see org.muml.pim.instance.impl.InstancePackageImpl#getCoordinationProtocolInstance()
	 * @generated
	 */
	int COORDINATION_PROTOCOL_INSTANCE = 11;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

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
	 * The feature id for the '<em><b>Coordination Protocol Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL_PART = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Coordination Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Coordination Protocol Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Coordination Protocol Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.instance.impl.StructuredComponentInstanceImpl <em>Structured Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.instance.impl.StructuredComponentInstanceImpl
	 * @see org.muml.pim.instance.impl.InstancePackageImpl#getStructuredComponentInstance()
	 * @generated
	 */
	int STRUCTURED_COMPONENT_INSTANCE = 12;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE__ANNOTATIONS = COMPONENT_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE__EXTENSIONS = COMPONENT_INSTANCE__EXTENSIONS;

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
	 * The feature id for the '<em><b>Parent CIC</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE__PARENT_CIC = COMPONENT_INSTANCE__PARENT_CIC;

	/**
	 * The feature id for the '<em><b>Top Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE__TOP_LEVEL = COMPONENT_INSTANCE__TOP_LEVEL;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE___GET_EXTENSION__ECLASS = COMPONENT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Structured Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE_OPERATION_COUNT = COMPONENT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.instance.impl.AtomicComponentInstanceImpl <em>Atomic Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.instance.impl.AtomicComponentInstanceImpl
	 * @see org.muml.pim.instance.impl.InstancePackageImpl#getAtomicComponentInstance()
	 * @generated
	 */
	int ATOMIC_COMPONENT_INSTANCE = 13;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE__ANNOTATIONS = COMPONENT_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE__EXTENSIONS = COMPONENT_INSTANCE__EXTENSIONS;

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
	 * The feature id for the '<em><b>Parent CIC</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE__PARENT_CIC = COMPONENT_INSTANCE__PARENT_CIC;

	/**
	 * The feature id for the '<em><b>Top Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE__TOP_LEVEL = COMPONENT_INSTANCE__TOP_LEVEL;

	/**
	 * The number of structural features of the '<em>Atomic Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE_FEATURE_COUNT = COMPONENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE___GET_EXTENSION__ECLASS = COMPONENT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Atomic Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE_OPERATION_COUNT = COMPONENT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.muml.pim.instance.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see org.muml.pim.instance.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.instance.ComponentInstance#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Type</em>'.
	 * @see org.muml.pim.instance.ComponentInstance#getComponentType()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ComponentType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.instance.ComponentInstance#getPortInstances <em>Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Instances</em>'.
	 * @see org.muml.pim.instance.ComponentInstance#getPortInstances()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_PortInstances();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.instance.ComponentInstance#getComponentPart <em>Component Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Part</em>'.
	 * @see org.muml.pim.instance.ComponentInstance#getComponentPart()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ComponentPart();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pim.instance.ComponentInstance#getParentCIC <em>Parent CIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent CIC</em>'.
	 * @see org.muml.pim.instance.ComponentInstance#getParentCIC()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ParentCIC();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.instance.ComponentInstance#isTopLevel <em>Top Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Level</em>'.
	 * @see org.muml.pim.instance.ComponentInstance#isTopLevel()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_TopLevel();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.instance.PortConnectorInstance <em>Port Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connector Instance</em>'.
	 * @see org.muml.pim.instance.PortConnectorInstance
	 * @generated
	 */
	EClass getPortConnectorInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.instance.PortConnectorInstance#getPortConnectorType <em>Port Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Connector Type</em>'.
	 * @see org.muml.pim.instance.PortConnectorInstance#getPortConnectorType()
	 * @see #getPortConnectorInstance()
	 * @generated
	 */
	EReference getPortConnectorInstance_PortConnectorType();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.instance.PortConnectorInstance#getPortInstances <em>Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Instances</em>'.
	 * @see org.muml.pim.instance.PortConnectorInstance#getPortInstances()
	 * @see #getPortConnectorInstance()
	 * @generated
	 */
	EReference getPortConnectorInstance_PortInstances();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.instance.PortInstance <em>Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Instance</em>'.
	 * @see org.muml.pim.instance.PortInstance
	 * @generated
	 */
	EClass getPortInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.instance.PortInstance#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Type</em>'.
	 * @see org.muml.pim.instance.PortInstance#getPortType()
	 * @see #getPortInstance()
	 * @generated
	 */
	EReference getPortInstance_PortType();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pim.instance.PortInstance#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component Instance</em>'.
	 * @see org.muml.pim.instance.PortInstance#getComponentInstance()
	 * @see #getPortInstance()
	 * @generated
	 */
	EReference getPortInstance_ComponentInstance();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.instance.PortInstance#getPortConnectorInstances <em>Port Connector Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Connector Instances</em>'.
	 * @see org.muml.pim.instance.PortInstance#getPortConnectorInstances()
	 * @see #getPortInstance()
	 * @generated
	 */
	EReference getPortInstance_PortConnectorInstances();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.instance.PortInstance#getPortPart <em>Port Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Part</em>'.
	 * @see org.muml.pim.instance.PortInstance#getPortPart()
	 * @see #getPortInstance()
	 * @generated
	 */
	EReference getPortInstance_PortPart();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.instance.AssemblyConnectorInstance <em>Assembly Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Connector Instance</em>'.
	 * @see org.muml.pim.instance.AssemblyConnectorInstance
	 * @generated
	 */
	EClass getAssemblyConnectorInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.instance.AssemblyConnectorInstance#getAssemblyConnectorType <em>Assembly Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Connector Type</em>'.
	 * @see org.muml.pim.instance.AssemblyConnectorInstance#getAssemblyConnectorType()
	 * @see #getAssemblyConnectorInstance()
	 * @generated
	 */
	EReference getAssemblyConnectorInstance_AssemblyConnectorType();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.instance.DelegationConnectorInstance <em>Delegation Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Connector Instance</em>'.
	 * @see org.muml.pim.instance.DelegationConnectorInstance
	 * @generated
	 */
	EClass getDelegationConnectorInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.instance.DelegationConnectorInstance#getDelegationConnectorType <em>Delegation Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegation Connector Type</em>'.
	 * @see org.muml.pim.instance.DelegationConnectorInstance#getDelegationConnectorType()
	 * @see #getDelegationConnectorInstance()
	 * @generated
	 */
	EReference getDelegationConnectorInstance_DelegationConnectorType();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.instance.ComponentInstanceConfiguration <em>Component Instance Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance Configuration</em>'.
	 * @see org.muml.pim.instance.ComponentInstanceConfiguration
	 * @generated
	 */
	EClass getComponentInstanceConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.instance.ComponentInstanceConfiguration#getComponentInstances <em>Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Instances</em>'.
	 * @see org.muml.pim.instance.ComponentInstanceConfiguration#getComponentInstances()
	 * @see #getComponentInstanceConfiguration()
	 * @generated
	 */
	EReference getComponentInstanceConfiguration_ComponentInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.instance.ComponentInstanceConfiguration#getPortConnectorInstances <em>Port Connector Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Connector Instances</em>'.
	 * @see org.muml.pim.instance.ComponentInstanceConfiguration#getPortConnectorInstances()
	 * @see #getComponentInstanceConfiguration()
	 * @generated
	 */
	EReference getComponentInstanceConfiguration_PortConnectorInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.instance.ComponentInstanceConfiguration#getParentPortInstances <em>Parent Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parent Port Instances</em>'.
	 * @see org.muml.pim.instance.ComponentInstanceConfiguration#getParentPortInstances()
	 * @see #getComponentInstanceConfiguration()
	 * @generated
	 */
	EReference getComponentInstanceConfiguration_ParentPortInstances();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pim.instance.ComponentInstanceConfiguration#getParentStructuredComponentInstance <em>Parent Structured Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Structured Component Instance</em>'.
	 * @see org.muml.pim.instance.ComponentInstanceConfiguration#getParentStructuredComponentInstance()
	 * @see #getComponentInstanceConfiguration()
	 * @generated
	 */
	EReference getComponentInstanceConfiguration_ParentStructuredComponentInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.instance.ComponentInstanceConfiguration#getCoordinationProtocolInstances <em>Coordination Protocol Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coordination Protocol Instances</em>'.
	 * @see org.muml.pim.instance.ComponentInstanceConfiguration#getCoordinationProtocolInstances()
	 * @see #getComponentInstanceConfiguration()
	 * @generated
	 */
	EReference getComponentInstanceConfiguration_CoordinationProtocolInstances();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.instance.ContinuousPortInstance <em>Continuous Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuous Port Instance</em>'.
	 * @see org.muml.pim.instance.ContinuousPortInstance
	 * @generated
	 */
	EClass getContinuousPortInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.instance.HybridPortInstance <em>Hybrid Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid Port Instance</em>'.
	 * @see org.muml.pim.instance.HybridPortInstance
	 * @generated
	 */
	EClass getHybridPortInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.instance.DiscretePortInstance <em>Discrete Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Port Instance</em>'.
	 * @see org.muml.pim.instance.DiscretePortInstance
	 * @generated
	 */
	EClass getDiscretePortInstance();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.instance.DiscretePortInstance#getReceiverMessageTypes <em>Receiver Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receiver Message Types</em>'.
	 * @see org.muml.pim.instance.DiscretePortInstance#getReceiverMessageTypes()
	 * @see #getDiscretePortInstance()
	 * @generated
	 */
	EReference getDiscretePortInstance_ReceiverMessageTypes();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.instance.DiscretePortInstance#getSenderMessageTypes <em>Sender Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sender Message Types</em>'.
	 * @see org.muml.pim.instance.DiscretePortInstance#getSenderMessageTypes()
	 * @see #getDiscretePortInstance()
	 * @generated
	 */
	EReference getDiscretePortInstance_SenderMessageTypes();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.instance.DiscretePortInstance#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receiver Message Buffer</em>'.
	 * @see org.muml.pim.instance.DiscretePortInstance#getReceiverMessageBuffer()
	 * @see #getDiscretePortInstance()
	 * @generated
	 */
	EReference getDiscretePortInstance_ReceiverMessageBuffer();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.instance.DiscretePortInstance#getRefinedRole <em>Refined Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refined Role</em>'.
	 * @see org.muml.pim.instance.DiscretePortInstance#getRefinedRole()
	 * @see #getDiscretePortInstance()
	 * @generated
	 */
	EReference getDiscretePortInstance_RefinedRole();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.instance.DiscreteSinglePortInstance <em>Discrete Single Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Single Port Instance</em>'.
	 * @see org.muml.pim.instance.DiscreteSinglePortInstance
	 * @generated
	 */
	EClass getDiscreteSinglePortInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.instance.DiscreteMultiPortInstance <em>Discrete Multi Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Multi Port Instance</em>'.
	 * @see org.muml.pim.instance.DiscreteMultiPortInstance
	 * @generated
	 */
	EClass getDiscreteMultiPortInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.instance.DiscreteMultiPortInstance#getGmfSubPortInstances <em>Gmf Sub Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gmf Sub Port Instances</em>'.
	 * @see org.muml.pim.instance.DiscreteMultiPortInstance#getGmfSubPortInstances()
	 * @see #getDiscreteMultiPortInstance()
	 * @generated
	 */
	EReference getDiscreteMultiPortInstance_GmfSubPortInstances();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.instance.CoordinationProtocolInstance <em>Coordination Protocol Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Protocol Instance</em>'.
	 * @see org.muml.pim.instance.CoordinationProtocolInstance
	 * @generated
	 */
	EClass getCoordinationProtocolInstance();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.instance.CoordinationProtocolInstance#getPortInstances <em>Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Instances</em>'.
	 * @see org.muml.pim.instance.CoordinationProtocolInstance#getPortInstances()
	 * @see #getCoordinationProtocolInstance()
	 * @generated
	 */
	EReference getCoordinationProtocolInstance_PortInstances();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.instance.CoordinationProtocolInstance#getCoordinationProtocolPart <em>Coordination Protocol Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordination Protocol Part</em>'.
	 * @see org.muml.pim.instance.CoordinationProtocolInstance#getCoordinationProtocolPart()
	 * @see #getCoordinationProtocolInstance()
	 * @generated
	 */
	EReference getCoordinationProtocolInstance_CoordinationProtocolPart();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.instance.CoordinationProtocolInstance#getCoordinationProtocol <em>Coordination Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordination Protocol</em>'.
	 * @see org.muml.pim.instance.CoordinationProtocolInstance#getCoordinationProtocol()
	 * @see #getCoordinationProtocolInstance()
	 * @generated
	 */
	EReference getCoordinationProtocolInstance_CoordinationProtocol();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.instance.StructuredComponentInstance <em>Structured Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Component Instance</em>'.
	 * @see org.muml.pim.instance.StructuredComponentInstance
	 * @generated
	 */
	EClass getStructuredComponentInstance();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.instance.StructuredComponentInstance#getEmbeddedCIC <em>Embedded CIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Embedded CIC</em>'.
	 * @see org.muml.pim.instance.StructuredComponentInstance#getEmbeddedCIC()
	 * @see #getStructuredComponentInstance()
	 * @generated
	 */
	EReference getStructuredComponentInstance_EmbeddedCIC();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.instance.AtomicComponentInstance <em>Atomic Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Component Instance</em>'.
	 * @see org.muml.pim.instance.AtomicComponentInstance
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
		 * The meta object literal for the '{@link org.muml.pim.instance.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.instance.impl.ComponentInstanceImpl
		 * @see org.muml.pim.instance.impl.InstancePackageImpl#getComponentInstance()
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
		 * The meta object literal for the '<em><b>Parent CIC</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__PARENT_CIC = eINSTANCE.getComponentInstance_ParentCIC();

		/**
		 * The meta object literal for the '<em><b>Top Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__TOP_LEVEL = eINSTANCE.getComponentInstance_TopLevel();

		/**
		 * The meta object literal for the '{@link org.muml.pim.instance.impl.PortConnectorInstanceImpl <em>Port Connector Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.instance.impl.PortConnectorInstanceImpl
		 * @see org.muml.pim.instance.impl.InstancePackageImpl#getPortConnectorInstance()
		 * @generated
		 */
		EClass PORT_CONNECTOR_INSTANCE = eINSTANCE.getPortConnectorInstance();

		/**
		 * The meta object literal for the '<em><b>Port Connector Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE = eINSTANCE.getPortConnectorInstance_PortConnectorType();

		/**
		 * The meta object literal for the '<em><b>Port Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONNECTOR_INSTANCE__PORT_INSTANCES = eINSTANCE.getPortConnectorInstance_PortInstances();

		/**
		 * The meta object literal for the '{@link org.muml.pim.instance.impl.PortInstanceImpl <em>Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.instance.impl.PortInstanceImpl
		 * @see org.muml.pim.instance.impl.InstancePackageImpl#getPortInstance()
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
		 * The meta object literal for the '<em><b>Port Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE__PORT_PART = eINSTANCE.getPortInstance_PortPart();

		/**
		 * The meta object literal for the '{@link org.muml.pim.instance.impl.AssemblyConnectorInstanceImpl <em>Assembly Connector Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.instance.impl.AssemblyConnectorInstanceImpl
		 * @see org.muml.pim.instance.impl.InstancePackageImpl#getAssemblyConnectorInstance()
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
		 * The meta object literal for the '{@link org.muml.pim.instance.impl.DelegationConnectorInstanceImpl <em>Delegation Connector Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.instance.impl.DelegationConnectorInstanceImpl
		 * @see org.muml.pim.instance.impl.InstancePackageImpl#getDelegationConnectorInstance()
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
		 * The meta object literal for the '{@link org.muml.pim.instance.impl.ComponentInstanceConfigurationImpl <em>Component Instance Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.instance.impl.ComponentInstanceConfigurationImpl
		 * @see org.muml.pim.instance.impl.InstancePackageImpl#getComponentInstanceConfiguration()
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
		 * The meta object literal for the '<em><b>Parent Structured Component Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE_CONFIGURATION__PARENT_STRUCTURED_COMPONENT_INSTANCE = eINSTANCE.getComponentInstanceConfiguration_ParentStructuredComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Coordination Protocol Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE_CONFIGURATION__COORDINATION_PROTOCOL_INSTANCES = eINSTANCE.getComponentInstanceConfiguration_CoordinationProtocolInstances();

		/**
		 * The meta object literal for the '{@link org.muml.pim.instance.impl.ContinuousPortInstanceImpl <em>Continuous Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.instance.impl.ContinuousPortInstanceImpl
		 * @see org.muml.pim.instance.impl.InstancePackageImpl#getContinuousPortInstance()
		 * @generated
		 */
		EClass CONTINUOUS_PORT_INSTANCE = eINSTANCE.getContinuousPortInstance();

		/**
		 * The meta object literal for the '{@link org.muml.pim.instance.impl.HybridPortInstanceImpl <em>Hybrid Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.instance.impl.HybridPortInstanceImpl
		 * @see org.muml.pim.instance.impl.InstancePackageImpl#getHybridPortInstance()
		 * @generated
		 */
		EClass HYBRID_PORT_INSTANCE = eINSTANCE.getHybridPortInstance();

		/**
		 * The meta object literal for the '{@link org.muml.pim.instance.impl.DiscretePortInstanceImpl <em>Discrete Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.instance.impl.DiscretePortInstanceImpl
		 * @see org.muml.pim.instance.impl.InstancePackageImpl#getDiscretePortInstance()
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
		 * The meta object literal for the '<em><b>Refined Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_PORT_INSTANCE__REFINED_ROLE = eINSTANCE.getDiscretePortInstance_RefinedRole();

		/**
		 * The meta object literal for the '{@link org.muml.pim.instance.impl.DiscreteSinglePortInstanceImpl <em>Discrete Single Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.instance.impl.DiscreteSinglePortInstanceImpl
		 * @see org.muml.pim.instance.impl.InstancePackageImpl#getDiscreteSinglePortInstance()
		 * @generated
		 */
		EClass DISCRETE_SINGLE_PORT_INSTANCE = eINSTANCE.getDiscreteSinglePortInstance();

		/**
		 * The meta object literal for the '{@link org.muml.pim.instance.impl.DiscreteMultiPortInstanceImpl <em>Discrete Multi Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.instance.impl.DiscreteMultiPortInstanceImpl
		 * @see org.muml.pim.instance.impl.InstancePackageImpl#getDiscreteMultiPortInstance()
		 * @generated
		 */
		EClass DISCRETE_MULTI_PORT_INSTANCE = eINSTANCE.getDiscreteMultiPortInstance();

		/**
		 * The meta object literal for the '<em><b>Gmf Sub Port Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_MULTI_PORT_INSTANCE__GMF_SUB_PORT_INSTANCES = eINSTANCE.getDiscreteMultiPortInstance_GmfSubPortInstances();

		/**
		 * The meta object literal for the '{@link org.muml.pim.instance.impl.CoordinationProtocolInstanceImpl <em>Coordination Protocol Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.instance.impl.CoordinationProtocolInstanceImpl
		 * @see org.muml.pim.instance.impl.InstancePackageImpl#getCoordinationProtocolInstance()
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
		 * The meta object literal for the '<em><b>Coordination Protocol Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL_PART = eINSTANCE.getCoordinationProtocolInstance_CoordinationProtocolPart();

		/**
		 * The meta object literal for the '<em><b>Coordination Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL = eINSTANCE.getCoordinationProtocolInstance_CoordinationProtocol();

		/**
		 * The meta object literal for the '{@link org.muml.pim.instance.impl.StructuredComponentInstanceImpl <em>Structured Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.instance.impl.StructuredComponentInstanceImpl
		 * @see org.muml.pim.instance.impl.InstancePackageImpl#getStructuredComponentInstance()
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
		 * The meta object literal for the '{@link org.muml.pim.instance.impl.AtomicComponentInstanceImpl <em>Atomic Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.instance.impl.AtomicComponentInstanceImpl
		 * @see org.muml.pim.instance.impl.InstancePackageImpl#getAtomicComponentInstance()
		 * @generated
		 */
		EClass ATOMIC_COMPONENT_INSTANCE = eINSTANCE.getAtomicComponentInstance();

	}

} //InstancePackage
