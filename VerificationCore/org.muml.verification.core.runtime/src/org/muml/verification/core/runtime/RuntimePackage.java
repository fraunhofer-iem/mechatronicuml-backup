/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.verification.core.runtime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.core.CorePackage;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.instance.InstancePackage;

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
 * @see org.muml.verification.core.runtime.RuntimeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface RuntimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "runtime";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/verification/core/runtime/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "runtime";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimePackage eINSTANCE = org.muml.verification.core.runtime.impl.RuntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.verification.core.runtime.impl.RuntimeComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.verification.core.runtime.impl.RuntimeComponentInstanceImpl
	 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeComponentInstance()
	 * @generated
	 */
	int RUNTIME_COMPONENT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_COMPONENT_INSTANCE__EXTENSIONS = InstancePackage.COMPONENT_INSTANCE__EXTENSIONS;

	/**
	 * The meta object id for the '{@link org.muml.verification.core.runtime.impl.RuntimeDiscretePortInstanceImpl <em>Discrete Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.verification.core.runtime.impl.RuntimeDiscretePortInstanceImpl
	 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeDiscretePortInstance()
	 * @generated
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE = 1;

	/**
	 * The meta object id for the '{@link org.muml.verification.core.runtime.impl.RealtimeStatechartInstanceImpl <em>Realtime Statechart Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.verification.core.runtime.impl.RealtimeStatechartInstanceImpl
	 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRealtimeStatechartInstance()
	 * @generated
	 */
	int REALTIME_STATECHART_INSTANCE = 4;

	/**
	 * The meta object id for the '{@link org.muml.verification.core.runtime.impl.RuntimeMessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.verification.core.runtime.impl.RuntimeMessageImpl
	 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeMessage()
	 * @generated
	 */
	int RUNTIME_MESSAGE = 5;

	/**
	 * The meta object id for the '{@link org.muml.verification.core.runtime.impl.RuntimeParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.verification.core.runtime.impl.RuntimeParameterImpl
	 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeParameter()
	 * @generated
	 */
	int RUNTIME_PARAMETER = 6;

	/**
	 * The meta object id for the '{@link org.muml.verification.core.runtime.impl.RuntimeBehavioralElementImpl <em>Behavioral Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.verification.core.runtime.impl.RuntimeBehavioralElementImpl
	 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeBehavioralElement()
	 * @generated
	 */
	int RUNTIME_BEHAVIORAL_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_COMPONENT_INSTANCE__NAME = InstancePackage.COMPONENT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_COMPONENT_INSTANCE__COMPONENT_TYPE = InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_COMPONENT_INSTANCE__PORT_INSTANCES = InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_COMPONENT_INSTANCE__COMPONENT_PART = InstancePackage.COMPONENT_INSTANCE__COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Parent CIC</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_COMPONENT_INSTANCE__PARENT_CIC = InstancePackage.COMPONENT_INSTANCE__PARENT_CIC;

	/**
	 * The feature id for the '<em><b>Top Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_COMPONENT_INSTANCE__TOP_LEVEL = InstancePackage.COMPONENT_INSTANCE__TOP_LEVEL;

	/**
	 * The feature id for the '<em><b>Statechart Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_COMPONENT_INSTANCE__STATECHART_INSTANCE = InstancePackage.COMPONENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_COMPONENT_INSTANCE__MESSAGE_BUFFER = InstancePackage.COMPONENT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_COMPONENT_INSTANCE_FEATURE_COUNT = InstancePackage.COMPONENT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE__EXTENSIONS = InstancePackage.DISCRETE_PORT_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE__NAME = InstancePackage.DISCRETE_PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE__COMMENT = InstancePackage.DISCRETE_PORT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE__CONNECTOR_INSTANCES = InstancePackage.DISCRETE_PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE__TYPE = InstancePackage.DISCRETE_PORT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE__PORT_TYPE = InstancePackage.DISCRETE_PORT_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE__COMPONENT_INSTANCE = InstancePackage.DISCRETE_PORT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = InstancePackage.DISCRETE_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE__PORT_PART = InstancePackage.DISCRETE_PORT_INSTANCE__PORT_PART;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES = InstancePackage.DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_TYPES = InstancePackage.DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER = InstancePackage.DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Refined Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE__REFINED_ROLE = InstancePackage.DISCRETE_PORT_INSTANCE__REFINED_ROLE;

	/**
	 * The feature id for the '<em><b>Statechart Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE = InstancePackage.DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE__MESSAGE_BUFFER = InstancePackage.DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Discrete Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE_FEATURE_COUNT = InstancePackage.DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_BEHAVIORAL_ELEMENT__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The meta object id for the '{@link org.muml.verification.core.runtime.impl.SingleRoleInstanceImpl <em>Single Role Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.verification.core.runtime.impl.SingleRoleInstanceImpl
	 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getSingleRoleInstance()
	 * @generated
	 */
	int SINGLE_ROLE_INSTANCE = 9;

	/**
	 * The meta object id for the '{@link org.muml.verification.core.runtime.impl.MultiRoleInstanceImpl <em>Multi Role Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.verification.core.runtime.impl.MultiRoleInstanceImpl
	 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getMultiRoleInstance()
	 * @generated
	 */
	int MULTI_ROLE_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_BEHAVIORAL_ELEMENT__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Statechart Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_BUFFER = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Behavioral Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_BEHAVIORAL_ELEMENT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.muml.verification.core.runtime.impl.RuntimeDiscreteInteractionEndpointInstanceImpl <em>Discrete Interaction Endpoint Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.verification.core.runtime.impl.RuntimeDiscreteInteractionEndpointInstanceImpl
	 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeDiscreteInteractionEndpointInstance()
	 * @generated
	 */
	int RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE = 15;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE__EXTENSIONS = RUNTIME_BEHAVIORAL_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE__NAME = RUNTIME_BEHAVIORAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Statechart Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE__STATECHART_INSTANCE = RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE;

	/**
	 * The feature id for the '<em><b>Message Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE__MESSAGE_BUFFER = RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE__COMMENT = RUNTIME_BEHAVIORAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE__CONNECTOR_INSTANCES = RUNTIME_BEHAVIORAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE__TYPE = RUNTIME_BEHAVIORAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Discrete Interaction Endpoint Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE_FEATURE_COUNT = RUNTIME_BEHAVIORAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.verification.core.runtime.impl.RoleInstanceImpl <em>Role Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.verification.core.runtime.impl.RoleInstanceImpl
	 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRoleInstance()
	 * @generated
	 */
	int ROLE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__EXTENSIONS = RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__NAME = RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Statechart Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__STATECHART_INSTANCE = RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE__STATECHART_INSTANCE;

	/**
	 * The feature id for the '<em><b>Message Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__MESSAGE_BUFFER = RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE__MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__COMMENT = RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__CONNECTOR_INSTANCES = RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__TYPE = RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__ROLE = RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assembly</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__ASSEMBLY = RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE_FEATURE_COUNT = RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.verification.core.runtime.impl.RuntimeMessageBufferImpl <em>Message Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.verification.core.runtime.impl.RuntimeMessageBufferImpl
	 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeMessageBuffer()
	 * @generated
	 */
	int RUNTIME_MESSAGE_BUFFER = 3;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_MESSAGE_BUFFER__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_MESSAGE_BUFFER__MESSAGES = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Runtime Behavioral Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message Buffer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_MESSAGE_BUFFER__MESSAGE_BUFFER = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Message Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_MESSAGE_BUFFER_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_INSTANCE__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Runtime Behavioral Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_INSTANCE__INSTANCE_OF = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Active Vertex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_INSTANCE__ACTIVE_VERTEX = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Realtime Statechart Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_INSTANCE__SUB_REALTIME_STATECHART_INSTANCES = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Realtime Statechart Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_INSTANCE__PARENT_REALTIME_STATECHART_INSTANCE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Variable Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_INSTANCE__VARIABLE_BINDINGS = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>All Available Variable Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_INSTANCE__ALL_AVAILABLE_VARIABLE_BINDINGS = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Nearest Runtime Behavioral Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_INSTANCE__NEAREST_RUNTIME_BEHAVIORAL_ELEMENT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Active Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_INSTANCE__ACTIVE_TRANSITION = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Realtime Statechart Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_INSTANCE_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_MESSAGE__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_MESSAGE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_MESSAGE__PARAMETERS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_MESSAGE__TYPE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_MESSAGE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PARAMETER__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PARAMETER__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Message</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PARAMETER__MESSAGE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PARAMETER__VALUE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PARAMETER__PARAMETER = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PARAMETER_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.verification.core.runtime.impl.VariableBindingImpl <em>Variable Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.verification.core.runtime.impl.VariableBindingImpl
	 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getVariableBinding()
	 * @generated
	 */
	int VARIABLE_BINDING = 7;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_BINDING__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_BINDING__VARIABLE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_BINDING__VALUE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_BINDING_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE__EXTENSIONS = ROLE_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE__NAME = ROLE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Statechart Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE__STATECHART_INSTANCE = ROLE_INSTANCE__STATECHART_INSTANCE;

	/**
	 * The feature id for the '<em><b>Message Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE__MESSAGE_BUFFER = ROLE_INSTANCE__MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE__COMMENT = ROLE_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE__CONNECTOR_INSTANCES = ROLE_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE__TYPE = ROLE_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE__ROLE = ROLE_INSTANCE__ROLE;

	/**
	 * The feature id for the '<em><b>Assembly</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE__ASSEMBLY = ROLE_INSTANCE__ASSEMBLY;

	/**
	 * The feature id for the '<em><b>Multi Interaction Endpoint Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE = ROLE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE__NEXT = ROLE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE__PREVIOUS = ROLE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE__FIRST = ROLE_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE__LAST = ROLE_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Single Role Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE_FEATURE_COUNT = ROLE_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ROLE_INSTANCE__EXTENSIONS = ROLE_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ROLE_INSTANCE__NAME = ROLE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Statechart Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ROLE_INSTANCE__STATECHART_INSTANCE = ROLE_INSTANCE__STATECHART_INSTANCE;

	/**
	 * The feature id for the '<em><b>Message Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ROLE_INSTANCE__MESSAGE_BUFFER = ROLE_INSTANCE__MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ROLE_INSTANCE__COMMENT = ROLE_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ROLE_INSTANCE__CONNECTOR_INSTANCES = ROLE_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ROLE_INSTANCE__TYPE = ROLE_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ROLE_INSTANCE__ROLE = ROLE_INSTANCE__ROLE;

	/**
	 * The feature id for the '<em><b>Assembly</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ROLE_INSTANCE__ASSEMBLY = ROLE_INSTANCE__ASSEMBLY;

	/**
	 * The feature id for the '<em><b>Sub Interaction Endpoint Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ROLE_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES = ROLE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ROLE_INSTANCE__FIRST = ROLE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ROLE_INSTANCE__LAST = ROLE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Multi Role Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ROLE_INSTANCE_FEATURE_COUNT = ROLE_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.verification.core.runtime.impl.RuntimeConnectorInstanceImpl <em>Connector Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.verification.core.runtime.impl.RuntimeConnectorInstanceImpl
	 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeConnectorInstance()
	 * @generated
	 */
	int RUNTIME_CONNECTOR_INSTANCE = 12;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONNECTOR_INSTANCE__EXTENSIONS = ConnectorPackage.CONNECTOR_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONNECTOR_INSTANCE__COMMENT = ConnectorPackage.CONNECTOR_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONNECTOR_INSTANCE__TYPE = ConnectorPackage.CONNECTOR_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Connector Endpoint Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES = ConnectorPackage.CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Transient Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONNECTOR_INSTANCE__TRANSIENT_MESSAGES = ConnectorPackage.CONNECTOR_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONNECTOR_INSTANCE_FEATURE_COUNT = ConnectorPackage.CONNECTOR_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.verification.core.runtime.impl.RuntimeRoleConnectorInstanceImpl <em>Role Connector Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.verification.core.runtime.impl.RuntimeRoleConnectorInstanceImpl
	 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeRoleConnectorInstance()
	 * @generated
	 */
	int RUNTIME_ROLE_CONNECTOR_INSTANCE = 11;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ROLE_CONNECTOR_INSTANCE__EXTENSIONS = RUNTIME_CONNECTOR_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ROLE_CONNECTOR_INSTANCE__COMMENT = RUNTIME_CONNECTOR_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ROLE_CONNECTOR_INSTANCE__TYPE = RUNTIME_CONNECTOR_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Connector Endpoint Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ROLE_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES = RUNTIME_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Transient Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ROLE_CONNECTOR_INSTANCE__TRANSIENT_MESSAGES = RUNTIME_CONNECTOR_INSTANCE__TRANSIENT_MESSAGES;

	/**
	 * The number of structural features of the '<em>Role Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ROLE_CONNECTOR_INSTANCE_FEATURE_COUNT = RUNTIME_CONNECTOR_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.verification.core.runtime.impl.RuntimeAssemblyConnectorInstanceImpl <em>Assembly Connector Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.verification.core.runtime.impl.RuntimeAssemblyConnectorInstanceImpl
	 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeAssemblyConnectorInstance()
	 * @generated
	 */
	int RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE = 13;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE__EXTENSIONS = InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE__COMMENT = InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE__TYPE = InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Connector Endpoint Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES = InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE = InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE__PORT_INSTANCES = InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE__PORT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Assembly Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE__ASSEMBLY_CONNECTOR_TYPE = InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE__ASSEMBLY_CONNECTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Transient Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE__TRANSIENT_MESSAGES = InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assembly Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE_FEATURE_COUNT = InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.verification.core.runtime.impl.MessageOnConnectorImpl <em>Message On Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.verification.core.runtime.impl.MessageOnConnectorImpl
	 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getMessageOnConnector()
	 * @generated
	 */
	int MESSAGE_ON_CONNECTOR = 14;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ON_CONNECTOR__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ON_CONNECTOR__RECEIVER = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ON_CONNECTOR__MESSAGE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Runtime Connector Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ON_CONNECTOR__RUNTIME_CONNECTOR_INSTANCE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Message On Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ON_CONNECTOR_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.verification.core.runtime.impl.RuntimeDiscreteSinglePortInstanceImpl <em>Discrete Single Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.verification.core.runtime.impl.RuntimeDiscreteSinglePortInstanceImpl
	 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeDiscreteSinglePortInstance()
	 * @generated
	 */
	int RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE = 16;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE__EXTENSIONS = RUNTIME_DISCRETE_PORT_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE__NAME = RUNTIME_DISCRETE_PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE__COMMENT = RUNTIME_DISCRETE_PORT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE__CONNECTOR_INSTANCES = RUNTIME_DISCRETE_PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE__TYPE = RUNTIME_DISCRETE_PORT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE__PORT_TYPE = RUNTIME_DISCRETE_PORT_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE__COMPONENT_INSTANCE = RUNTIME_DISCRETE_PORT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = RUNTIME_DISCRETE_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE__PORT_PART = RUNTIME_DISCRETE_PORT_INSTANCE__PORT_PART;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES = RUNTIME_DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE__SENDER_MESSAGE_TYPES = RUNTIME_DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER = RUNTIME_DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Refined Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE__REFINED_ROLE = RUNTIME_DISCRETE_PORT_INSTANCE__REFINED_ROLE;

	/**
	 * The feature id for the '<em><b>Statechart Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE__STATECHART_INSTANCE = RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE;

	/**
	 * The feature id for the '<em><b>Message Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE__MESSAGE_BUFFER = RUNTIME_DISCRETE_PORT_INSTANCE__MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Multi Interaction Endpoint Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE = RUNTIME_DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE__NEXT = RUNTIME_DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE__PREVIOUS = RUNTIME_DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE__FIRST = RUNTIME_DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE__LAST = RUNTIME_DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Discrete Single Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE_FEATURE_COUNT = RUNTIME_DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.muml.verification.core.runtime.impl.RuntimeDiscreteMultiPortInstanceImpl <em>Discrete Multi Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.verification.core.runtime.impl.RuntimeDiscreteMultiPortInstanceImpl
	 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeDiscreteMultiPortInstance()
	 * @generated
	 */
	int RUNTIME_DISCRETE_MULTI_PORT_INSTANCE = 17;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_MULTI_PORT_INSTANCE__EXTENSIONS = InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_MULTI_PORT_INSTANCE__NAME = InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_MULTI_PORT_INSTANCE__COMMENT = InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_MULTI_PORT_INSTANCE__CONNECTOR_INSTANCES = InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_MULTI_PORT_INSTANCE__TYPE = InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_MULTI_PORT_INSTANCE__PORT_TYPE = InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_MULTI_PORT_INSTANCE__COMPONENT_INSTANCE = InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_MULTI_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_MULTI_PORT_INSTANCE__PORT_PART = InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__PORT_PART;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_MULTI_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES = InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_MULTI_PORT_INSTANCE__SENDER_MESSAGE_TYPES = InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SENDER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_MULTI_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER = InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Refined Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_MULTI_PORT_INSTANCE__REFINED_ROLE = InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__REFINED_ROLE;

	/**
	 * The feature id for the '<em><b>Sub Interaction Endpoint Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_MULTI_PORT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES = InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_MULTI_PORT_INSTANCE__FIRST = InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__FIRST;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_MULTI_PORT_INSTANCE__LAST = InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__LAST;

	/**
	 * The feature id for the '<em><b>Gmf Sub Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_MULTI_PORT_INSTANCE__GMF_SUB_PORT_INSTANCES = InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__GMF_SUB_PORT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Statechart Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_MULTI_PORT_INSTANCE__STATECHART_INSTANCE = InstancePackage.DISCRETE_MULTI_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_MULTI_PORT_INSTANCE__MESSAGE_BUFFER = InstancePackage.DISCRETE_MULTI_PORT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Discrete Multi Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_MULTI_PORT_INSTANCE_FEATURE_COUNT = InstancePackage.DISCRETE_MULTI_PORT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '<em>Java Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getJavaObject()
	 * @generated
	 */
	int JAVA_OBJECT = 18;


	/**
	 * Returns the meta object for class '{@link org.muml.verification.core.runtime.RuntimeComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeComponentInstance
	 * @generated
	 */
	EClass getRuntimeComponentInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.verification.core.runtime.RuntimeDiscretePortInstance <em>Discrete Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Port Instance</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeDiscretePortInstance
	 * @generated
	 */
	EClass getRuntimeDiscretePortInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.verification.core.runtime.RoleInstance <em>Role Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Instance</em>'.
	 * @see org.muml.verification.core.runtime.RoleInstance
	 * @generated
	 */
	EClass getRoleInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.verification.core.runtime.RoleInstance#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see org.muml.verification.core.runtime.RoleInstance#getRole()
	 * @see #getRoleInstance()
	 * @generated
	 */
	EReference getRoleInstance_Role();

	/**
	 * Returns the meta object for the reference '{@link org.muml.verification.core.runtime.RoleInstance#getAssembly <em>Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly</em>'.
	 * @see org.muml.verification.core.runtime.RoleInstance#getAssembly()
	 * @see #getRoleInstance()
	 * @generated
	 */
	EReference getRoleInstance_Assembly();

	/**
	 * Returns the meta object for class '{@link org.muml.verification.core.runtime.RuntimeMessageBuffer <em>Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Buffer</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeMessageBuffer
	 * @generated
	 */
	EClass getRuntimeMessageBuffer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.verification.core.runtime.RuntimeMessageBuffer#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeMessageBuffer#getMessages()
	 * @see #getRuntimeMessageBuffer()
	 * @generated
	 */
	EReference getRuntimeMessageBuffer_Messages();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.verification.core.runtime.RuntimeMessageBuffer#getRuntimeBehavioralElement <em>Runtime Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Runtime Behavioral Element</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeMessageBuffer#getRuntimeBehavioralElement()
	 * @see #getRuntimeMessageBuffer()
	 * @generated
	 */
	EReference getRuntimeMessageBuffer_RuntimeBehavioralElement();

	/**
	 * Returns the meta object for the reference '{@link org.muml.verification.core.runtime.RuntimeMessageBuffer#getMessageBuffer <em>Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Buffer</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeMessageBuffer#getMessageBuffer()
	 * @see #getRuntimeMessageBuffer()
	 * @generated
	 */
	EReference getRuntimeMessageBuffer_MessageBuffer();

	/**
	 * Returns the meta object for class '{@link org.muml.verification.core.runtime.RealtimeStatechartInstance <em>Realtime Statechart Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realtime Statechart Instance</em>'.
	 * @see org.muml.verification.core.runtime.RealtimeStatechartInstance
	 * @generated
	 */
	EClass getRealtimeStatechartInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.verification.core.runtime.RealtimeStatechartInstance#getRuntimeBehavioralElement <em>Runtime Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runtime Behavioral Element</em>'.
	 * @see org.muml.verification.core.runtime.RealtimeStatechartInstance#getRuntimeBehavioralElement()
	 * @see #getRealtimeStatechartInstance()
	 * @generated
	 */
	EReference getRealtimeStatechartInstance_RuntimeBehavioralElement();

	/**
	 * Returns the meta object for the reference '{@link org.muml.verification.core.runtime.RealtimeStatechartInstance#getInstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Of</em>'.
	 * @see org.muml.verification.core.runtime.RealtimeStatechartInstance#getInstanceOf()
	 * @see #getRealtimeStatechartInstance()
	 * @generated
	 */
	EReference getRealtimeStatechartInstance_InstanceOf();

	/**
	 * Returns the meta object for the reference '{@link org.muml.verification.core.runtime.RealtimeStatechartInstance#getActiveVertex <em>Active Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Vertex</em>'.
	 * @see org.muml.verification.core.runtime.RealtimeStatechartInstance#getActiveVertex()
	 * @see #getRealtimeStatechartInstance()
	 * @generated
	 */
	EReference getRealtimeStatechartInstance_ActiveVertex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.verification.core.runtime.RealtimeStatechartInstance#getSubRealtimeStatechartInstances <em>Sub Realtime Statechart Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Realtime Statechart Instances</em>'.
	 * @see org.muml.verification.core.runtime.RealtimeStatechartInstance#getSubRealtimeStatechartInstances()
	 * @see #getRealtimeStatechartInstance()
	 * @generated
	 */
	EReference getRealtimeStatechartInstance_SubRealtimeStatechartInstances();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.verification.core.runtime.RealtimeStatechartInstance#getParentRealtimeStatechartInstance <em>Parent Realtime Statechart Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Realtime Statechart Instance</em>'.
	 * @see org.muml.verification.core.runtime.RealtimeStatechartInstance#getParentRealtimeStatechartInstance()
	 * @see #getRealtimeStatechartInstance()
	 * @generated
	 */
	EReference getRealtimeStatechartInstance_ParentRealtimeStatechartInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.verification.core.runtime.RealtimeStatechartInstance#getVariableBindings <em>Variable Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Bindings</em>'.
	 * @see org.muml.verification.core.runtime.RealtimeStatechartInstance#getVariableBindings()
	 * @see #getRealtimeStatechartInstance()
	 * @generated
	 */
	EReference getRealtimeStatechartInstance_VariableBindings();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.verification.core.runtime.RealtimeStatechartInstance#getAllAvailableVariableBindings <em>All Available Variable Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Available Variable Bindings</em>'.
	 * @see org.muml.verification.core.runtime.RealtimeStatechartInstance#getAllAvailableVariableBindings()
	 * @see #getRealtimeStatechartInstance()
	 * @generated
	 */
	EReference getRealtimeStatechartInstance_AllAvailableVariableBindings();

	/**
	 * Returns the meta object for the reference '{@link org.muml.verification.core.runtime.RealtimeStatechartInstance#getNearestRuntimeBehavioralElement <em>Nearest Runtime Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nearest Runtime Behavioral Element</em>'.
	 * @see org.muml.verification.core.runtime.RealtimeStatechartInstance#getNearestRuntimeBehavioralElement()
	 * @see #getRealtimeStatechartInstance()
	 * @generated
	 */
	EReference getRealtimeStatechartInstance_NearestRuntimeBehavioralElement();

	/**
	 * Returns the meta object for the reference '{@link org.muml.verification.core.runtime.RealtimeStatechartInstance#getActiveTransition <em>Active Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Transition</em>'.
	 * @see org.muml.verification.core.runtime.RealtimeStatechartInstance#getActiveTransition()
	 * @see #getRealtimeStatechartInstance()
	 * @generated
	 */
	EReference getRealtimeStatechartInstance_ActiveTransition();

	/**
	 * Returns the meta object for class '{@link org.muml.verification.core.runtime.RuntimeMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeMessage
	 * @generated
	 */
	EClass getRuntimeMessage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.verification.core.runtime.RuntimeMessage#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeMessage#getParameters()
	 * @see #getRuntimeMessage()
	 * @generated
	 */
	EReference getRuntimeMessage_Parameters();

	/**
	 * Returns the meta object for the reference '{@link org.muml.verification.core.runtime.RuntimeMessage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeMessage#getType()
	 * @see #getRuntimeMessage()
	 * @generated
	 */
	EReference getRuntimeMessage_Type();

	/**
	 * Returns the meta object for class '{@link org.muml.verification.core.runtime.RuntimeParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeParameter
	 * @generated
	 */
	EClass getRuntimeParameter();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.verification.core.runtime.RuntimeParameter#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Message</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeParameter#getMessage()
	 * @see #getRuntimeParameter()
	 * @generated
	 */
	EReference getRuntimeParameter_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.verification.core.runtime.RuntimeParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeParameter#getValue()
	 * @see #getRuntimeParameter()
	 * @generated
	 */
	EAttribute getRuntimeParameter_Value();

	/**
	 * Returns the meta object for the reference '{@link org.muml.verification.core.runtime.RuntimeParameter#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeParameter#getParameter()
	 * @see #getRuntimeParameter()
	 * @generated
	 */
	EReference getRuntimeParameter_Parameter();

	/**
	 * Returns the meta object for class '{@link org.muml.verification.core.runtime.VariableBinding <em>Variable Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Binding</em>'.
	 * @see org.muml.verification.core.runtime.VariableBinding
	 * @generated
	 */
	EClass getVariableBinding();

	/**
	 * Returns the meta object for the reference '{@link org.muml.verification.core.runtime.VariableBinding#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.muml.verification.core.runtime.VariableBinding#getVariable()
	 * @see #getVariableBinding()
	 * @generated
	 */
	EReference getVariableBinding_Variable();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.verification.core.runtime.VariableBinding#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.muml.verification.core.runtime.VariableBinding#getValue()
	 * @see #getVariableBinding()
	 * @generated
	 */
	EAttribute getVariableBinding_Value();

	/**
	 * Returns the meta object for class '{@link org.muml.verification.core.runtime.RuntimeBehavioralElement <em>Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioral Element</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeBehavioralElement
	 * @generated
	 */
	EClass getRuntimeBehavioralElement();

	/**
	 * Returns the meta object for the reference '{@link org.muml.verification.core.runtime.RuntimeBehavioralElement#getStatechartInstance <em>Statechart Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statechart Instance</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeBehavioralElement#getStatechartInstance()
	 * @see #getRuntimeBehavioralElement()
	 * @generated
	 */
	EReference getRuntimeBehavioralElement_StatechartInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.verification.core.runtime.RuntimeBehavioralElement#getMessageBuffer <em>Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Buffer</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeBehavioralElement#getMessageBuffer()
	 * @see #getRuntimeBehavioralElement()
	 * @generated
	 */
	EReference getRuntimeBehavioralElement_MessageBuffer();

	/**
	 * Returns the meta object for class '{@link org.muml.verification.core.runtime.SingleRoleInstance <em>Single Role Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Role Instance</em>'.
	 * @see org.muml.verification.core.runtime.SingleRoleInstance
	 * @generated
	 */
	EClass getSingleRoleInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.verification.core.runtime.MultiRoleInstance <em>Multi Role Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Role Instance</em>'.
	 * @see org.muml.verification.core.runtime.MultiRoleInstance
	 * @generated
	 */
	EClass getMultiRoleInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.verification.core.runtime.RuntimeRoleConnectorInstance <em>Role Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Connector Instance</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeRoleConnectorInstance
	 * @generated
	 */
	EClass getRuntimeRoleConnectorInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.verification.core.runtime.RuntimeConnectorInstance <em>Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Instance</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeConnectorInstance
	 * @generated
	 */
	EClass getRuntimeConnectorInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.verification.core.runtime.RuntimeConnectorInstance#getTransientMessages <em>Transient Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transient Messages</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeConnectorInstance#getTransientMessages()
	 * @see #getRuntimeConnectorInstance()
	 * @generated
	 */
	EReference getRuntimeConnectorInstance_TransientMessages();

	/**
	 * Returns the meta object for class '{@link org.muml.verification.core.runtime.RuntimeAssemblyConnectorInstance <em>Assembly Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Connector Instance</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeAssemblyConnectorInstance
	 * @generated
	 */
	EClass getRuntimeAssemblyConnectorInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.verification.core.runtime.MessageOnConnector <em>Message On Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message On Connector</em>'.
	 * @see org.muml.verification.core.runtime.MessageOnConnector
	 * @generated
	 */
	EClass getMessageOnConnector();

	/**
	 * Returns the meta object for the reference '{@link org.muml.verification.core.runtime.MessageOnConnector#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see org.muml.verification.core.runtime.MessageOnConnector#getReceiver()
	 * @see #getMessageOnConnector()
	 * @generated
	 */
	EReference getMessageOnConnector_Receiver();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.verification.core.runtime.MessageOnConnector#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see org.muml.verification.core.runtime.MessageOnConnector#getMessage()
	 * @see #getMessageOnConnector()
	 * @generated
	 */
	EReference getMessageOnConnector_Message();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.verification.core.runtime.MessageOnConnector#getRuntimeConnectorInstance <em>Runtime Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Runtime Connector Instance</em>'.
	 * @see org.muml.verification.core.runtime.MessageOnConnector#getRuntimeConnectorInstance()
	 * @see #getMessageOnConnector()
	 * @generated
	 */
	EReference getMessageOnConnector_RuntimeConnectorInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.verification.core.runtime.RuntimeDiscreteInteractionEndpointInstance <em>Discrete Interaction Endpoint Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Interaction Endpoint Instance</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeDiscreteInteractionEndpointInstance
	 * @generated
	 */
	EClass getRuntimeDiscreteInteractionEndpointInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.verification.core.runtime.RuntimeDiscreteSinglePortInstance <em>Discrete Single Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Single Port Instance</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeDiscreteSinglePortInstance
	 * @generated
	 */
	EClass getRuntimeDiscreteSinglePortInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.verification.core.runtime.RuntimeDiscreteMultiPortInstance <em>Discrete Multi Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Multi Port Instance</em>'.
	 * @see org.muml.verification.core.runtime.RuntimeDiscreteMultiPortInstance
	 * @generated
	 */
	EClass getRuntimeDiscreteMultiPortInstance();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Java Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" serializeable="false"
	 * @generated
	 */
	EDataType getJavaObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RuntimeFactory getRuntimeFactory();

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
		 * The meta object literal for the '{@link org.muml.verification.core.runtime.impl.RuntimeComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.verification.core.runtime.impl.RuntimeComponentInstanceImpl
		 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeComponentInstance()
		 * @generated
		 */
		EClass RUNTIME_COMPONENT_INSTANCE = eINSTANCE.getRuntimeComponentInstance();

		/**
		 * The meta object literal for the '{@link org.muml.verification.core.runtime.impl.RuntimeDiscretePortInstanceImpl <em>Discrete Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.verification.core.runtime.impl.RuntimeDiscretePortInstanceImpl
		 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeDiscretePortInstance()
		 * @generated
		 */
		EClass RUNTIME_DISCRETE_PORT_INSTANCE = eINSTANCE.getRuntimeDiscretePortInstance();

		/**
		 * The meta object literal for the '{@link org.muml.verification.core.runtime.impl.RoleInstanceImpl <em>Role Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.verification.core.runtime.impl.RoleInstanceImpl
		 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRoleInstance()
		 * @generated
		 */
		EClass ROLE_INSTANCE = eINSTANCE.getRoleInstance();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_INSTANCE__ROLE = eINSTANCE.getRoleInstance_Role();

		/**
		 * The meta object literal for the '<em><b>Assembly</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_INSTANCE__ASSEMBLY = eINSTANCE.getRoleInstance_Assembly();

		/**
		 * The meta object literal for the '{@link org.muml.verification.core.runtime.impl.RuntimeMessageBufferImpl <em>Message Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.verification.core.runtime.impl.RuntimeMessageBufferImpl
		 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeMessageBuffer()
		 * @generated
		 */
		EClass RUNTIME_MESSAGE_BUFFER = eINSTANCE.getRuntimeMessageBuffer();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_MESSAGE_BUFFER__MESSAGES = eINSTANCE.getRuntimeMessageBuffer_Messages();

		/**
		 * The meta object literal for the '<em><b>Runtime Behavioral Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT = eINSTANCE.getRuntimeMessageBuffer_RuntimeBehavioralElement();

		/**
		 * The meta object literal for the '<em><b>Message Buffer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_MESSAGE_BUFFER__MESSAGE_BUFFER = eINSTANCE.getRuntimeMessageBuffer_MessageBuffer();

		/**
		 * The meta object literal for the '{@link org.muml.verification.core.runtime.impl.RealtimeStatechartInstanceImpl <em>Realtime Statechart Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.verification.core.runtime.impl.RealtimeStatechartInstanceImpl
		 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRealtimeStatechartInstance()
		 * @generated
		 */
		EClass REALTIME_STATECHART_INSTANCE = eINSTANCE.getRealtimeStatechartInstance();

		/**
		 * The meta object literal for the '<em><b>Runtime Behavioral Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT = eINSTANCE.getRealtimeStatechartInstance_RuntimeBehavioralElement();

		/**
		 * The meta object literal for the '<em><b>Instance Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART_INSTANCE__INSTANCE_OF = eINSTANCE.getRealtimeStatechartInstance_InstanceOf();

		/**
		 * The meta object literal for the '<em><b>Active Vertex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART_INSTANCE__ACTIVE_VERTEX = eINSTANCE.getRealtimeStatechartInstance_ActiveVertex();

		/**
		 * The meta object literal for the '<em><b>Sub Realtime Statechart Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART_INSTANCE__SUB_REALTIME_STATECHART_INSTANCES = eINSTANCE.getRealtimeStatechartInstance_SubRealtimeStatechartInstances();

		/**
		 * The meta object literal for the '<em><b>Parent Realtime Statechart Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART_INSTANCE__PARENT_REALTIME_STATECHART_INSTANCE = eINSTANCE.getRealtimeStatechartInstance_ParentRealtimeStatechartInstance();

		/**
		 * The meta object literal for the '<em><b>Variable Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART_INSTANCE__VARIABLE_BINDINGS = eINSTANCE.getRealtimeStatechartInstance_VariableBindings();

		/**
		 * The meta object literal for the '<em><b>All Available Variable Bindings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART_INSTANCE__ALL_AVAILABLE_VARIABLE_BINDINGS = eINSTANCE.getRealtimeStatechartInstance_AllAvailableVariableBindings();

		/**
		 * The meta object literal for the '<em><b>Nearest Runtime Behavioral Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART_INSTANCE__NEAREST_RUNTIME_BEHAVIORAL_ELEMENT = eINSTANCE.getRealtimeStatechartInstance_NearestRuntimeBehavioralElement();

		/**
		 * The meta object literal for the '<em><b>Active Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART_INSTANCE__ACTIVE_TRANSITION = eINSTANCE.getRealtimeStatechartInstance_ActiveTransition();

		/**
		 * The meta object literal for the '{@link org.muml.verification.core.runtime.impl.RuntimeMessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.verification.core.runtime.impl.RuntimeMessageImpl
		 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeMessage()
		 * @generated
		 */
		EClass RUNTIME_MESSAGE = eINSTANCE.getRuntimeMessage();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_MESSAGE__PARAMETERS = eINSTANCE.getRuntimeMessage_Parameters();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_MESSAGE__TYPE = eINSTANCE.getRuntimeMessage_Type();

		/**
		 * The meta object literal for the '{@link org.muml.verification.core.runtime.impl.RuntimeParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.verification.core.runtime.impl.RuntimeParameterImpl
		 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeParameter()
		 * @generated
		 */
		EClass RUNTIME_PARAMETER = eINSTANCE.getRuntimeParameter();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_PARAMETER__MESSAGE = eINSTANCE.getRuntimeParameter_Message();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_PARAMETER__VALUE = eINSTANCE.getRuntimeParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_PARAMETER__PARAMETER = eINSTANCE.getRuntimeParameter_Parameter();

		/**
		 * The meta object literal for the '{@link org.muml.verification.core.runtime.impl.VariableBindingImpl <em>Variable Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.verification.core.runtime.impl.VariableBindingImpl
		 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getVariableBinding()
		 * @generated
		 */
		EClass VARIABLE_BINDING = eINSTANCE.getVariableBinding();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_BINDING__VARIABLE = eINSTANCE.getVariableBinding_Variable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_BINDING__VALUE = eINSTANCE.getVariableBinding_Value();

		/**
		 * The meta object literal for the '{@link org.muml.verification.core.runtime.impl.RuntimeBehavioralElementImpl <em>Behavioral Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.verification.core.runtime.impl.RuntimeBehavioralElementImpl
		 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeBehavioralElement()
		 * @generated
		 */
		EClass RUNTIME_BEHAVIORAL_ELEMENT = eINSTANCE.getRuntimeBehavioralElement();

		/**
		 * The meta object literal for the '<em><b>Statechart Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE = eINSTANCE.getRuntimeBehavioralElement_StatechartInstance();

		/**
		 * The meta object literal for the '<em><b>Message Buffer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_BUFFER = eINSTANCE.getRuntimeBehavioralElement_MessageBuffer();

		/**
		 * The meta object literal for the '{@link org.muml.verification.core.runtime.impl.SingleRoleInstanceImpl <em>Single Role Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.verification.core.runtime.impl.SingleRoleInstanceImpl
		 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getSingleRoleInstance()
		 * @generated
		 */
		EClass SINGLE_ROLE_INSTANCE = eINSTANCE.getSingleRoleInstance();

		/**
		 * The meta object literal for the '{@link org.muml.verification.core.runtime.impl.MultiRoleInstanceImpl <em>Multi Role Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.verification.core.runtime.impl.MultiRoleInstanceImpl
		 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getMultiRoleInstance()
		 * @generated
		 */
		EClass MULTI_ROLE_INSTANCE = eINSTANCE.getMultiRoleInstance();

		/**
		 * The meta object literal for the '{@link org.muml.verification.core.runtime.impl.RuntimeRoleConnectorInstanceImpl <em>Role Connector Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.verification.core.runtime.impl.RuntimeRoleConnectorInstanceImpl
		 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeRoleConnectorInstance()
		 * @generated
		 */
		EClass RUNTIME_ROLE_CONNECTOR_INSTANCE = eINSTANCE.getRuntimeRoleConnectorInstance();

		/**
		 * The meta object literal for the '{@link org.muml.verification.core.runtime.impl.RuntimeConnectorInstanceImpl <em>Connector Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.verification.core.runtime.impl.RuntimeConnectorInstanceImpl
		 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeConnectorInstance()
		 * @generated
		 */
		EClass RUNTIME_CONNECTOR_INSTANCE = eINSTANCE.getRuntimeConnectorInstance();

		/**
		 * The meta object literal for the '<em><b>Transient Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_CONNECTOR_INSTANCE__TRANSIENT_MESSAGES = eINSTANCE.getRuntimeConnectorInstance_TransientMessages();

		/**
		 * The meta object literal for the '{@link org.muml.verification.core.runtime.impl.RuntimeAssemblyConnectorInstanceImpl <em>Assembly Connector Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.verification.core.runtime.impl.RuntimeAssemblyConnectorInstanceImpl
		 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeAssemblyConnectorInstance()
		 * @generated
		 */
		EClass RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE = eINSTANCE.getRuntimeAssemblyConnectorInstance();

		/**
		 * The meta object literal for the '{@link org.muml.verification.core.runtime.impl.MessageOnConnectorImpl <em>Message On Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.verification.core.runtime.impl.MessageOnConnectorImpl
		 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getMessageOnConnector()
		 * @generated
		 */
		EClass MESSAGE_ON_CONNECTOR = eINSTANCE.getMessageOnConnector();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_ON_CONNECTOR__RECEIVER = eINSTANCE.getMessageOnConnector_Receiver();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_ON_CONNECTOR__MESSAGE = eINSTANCE.getMessageOnConnector_Message();

		/**
		 * The meta object literal for the '<em><b>Runtime Connector Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_ON_CONNECTOR__RUNTIME_CONNECTOR_INSTANCE = eINSTANCE.getMessageOnConnector_RuntimeConnectorInstance();

		/**
		 * The meta object literal for the '{@link org.muml.verification.core.runtime.impl.RuntimeDiscreteInteractionEndpointInstanceImpl <em>Discrete Interaction Endpoint Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.verification.core.runtime.impl.RuntimeDiscreteInteractionEndpointInstanceImpl
		 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeDiscreteInteractionEndpointInstance()
		 * @generated
		 */
		EClass RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE = eINSTANCE.getRuntimeDiscreteInteractionEndpointInstance();

		/**
		 * The meta object literal for the '{@link org.muml.verification.core.runtime.impl.RuntimeDiscreteSinglePortInstanceImpl <em>Discrete Single Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.verification.core.runtime.impl.RuntimeDiscreteSinglePortInstanceImpl
		 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeDiscreteSinglePortInstance()
		 * @generated
		 */
		EClass RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE = eINSTANCE.getRuntimeDiscreteSinglePortInstance();

		/**
		 * The meta object literal for the '{@link org.muml.verification.core.runtime.impl.RuntimeDiscreteMultiPortInstanceImpl <em>Discrete Multi Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.verification.core.runtime.impl.RuntimeDiscreteMultiPortInstanceImpl
		 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getRuntimeDiscreteMultiPortInstance()
		 * @generated
		 */
		EClass RUNTIME_DISCRETE_MULTI_PORT_INSTANCE = eINSTANCE.getRuntimeDiscreteMultiPortInstance();

		/**
		 * The meta object literal for the '<em>Java Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.muml.verification.core.runtime.impl.RuntimePackageImpl#getJavaObject()
		 * @generated
		 */
		EDataType JAVA_OBJECT = eINSTANCE.getJavaObject();

	}

} //RuntimePackage
