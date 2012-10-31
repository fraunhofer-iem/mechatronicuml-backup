/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;

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
 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeFactory
 * @model kind="package"
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
	String eNS_URI = "http://www.fujaba.de/muml/model/runtime/0.3.0";

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
	RuntimePackage eINSTANCE = de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeComponentInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getRuntimeComponentInstance()
	 * @generated
	 */
	int RUNTIME_COMPONENT_INSTANCE = 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeDiscretePortInstanceImpl <em>Discrete Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeDiscretePortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getRuntimeDiscretePortInstance()
	 * @generated
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE = 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RealtimeStatechartInstanceImpl <em>Realtime Statechart Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RealtimeStatechartInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getRealtimeStatechartInstance()
	 * @generated
	 */
	int REALTIME_STATECHART_INSTANCE = 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeMessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeMessageImpl
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getRuntimeMessage()
	 * @generated
	 */
	int RUNTIME_MESSAGE = 5;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeParameterImpl
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getRuntimeParameter()
	 * @generated
	 */
	int RUNTIME_PARAMETER = 6;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeBehavioralElementImpl <em>Behavioral Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeBehavioralElementImpl
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getRuntimeBehavioralElement()
	 * @generated
	 */
	int RUNTIME_BEHAVIORAL_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_COMPONENT_INSTANCE__ANNOTATION = InstancePackage.COMPONENT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_COMPONENT_INSTANCE__EXTENSION = InstancePackage.COMPONENT_INSTANCE__EXTENSION;

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
	 * The feature id for the '<em><b>Statechart Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_COMPONENT_INSTANCE__STATECHART_INSTANCE = InstancePackage.COMPONENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Buffer</b></em>' containment reference.
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
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE__ANNOTATION = InstancePackage.DISCRETE_PORT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE__EXTENSION = InstancePackage.DISCRETE_PORT_INSTANCE__EXTENSION;

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
	 * The feature id for the '<em><b>Incoming Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES = InstancePackage.DISCRETE_PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Outgoing Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES = InstancePackage.DISCRETE_PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE__CONNECTOR_INSTANCES = InstancePackage.DISCRETE_PORT_INSTANCE__CONNECTOR_INSTANCES;

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
	 * The feature id for the '<em><b>Statechart Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE = InstancePackage.DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Buffer</b></em>' containment reference.
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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.MessageBufferImpl <em>Message Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.MessageBufferImpl
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getMessageBuffer()
	 * @generated
	 */
	int MESSAGE_BUFFER = 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.AttributeBindingImpl <em>Attribute Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.AttributeBindingImpl
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getAttributeBinding()
	 * @generated
	 */
	int ATTRIBUTE_BINDING = 7;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.SingleRoleInstanceImpl <em>Single Role Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.SingleRoleInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getSingleRoleInstance()
	 * @generated
	 */
	int SINGLE_ROLE_INSTANCE = 9;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.MultiRoleInstanceImpl <em>Multi Role Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.MultiRoleInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getMultiRoleInstance()
	 * @generated
	 */
	int MULTI_ROLE_INSTANCE = 10;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeRoleAssemblyImpl <em>Role Assembly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeRoleAssemblyImpl
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getRuntimeRoleAssembly()
	 * @generated
	 */
	int RUNTIME_ROLE_ASSEMBLY = 11;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeAssemblyInstanceImpl <em>Assembly Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeAssemblyInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getRuntimeAssemblyInstance()
	 * @generated
	 */
	int RUNTIME_ASSEMBLY_INSTANCE = 12;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePortInstanceAssemblyImpl <em>Port Instance Assembly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePortInstanceAssemblyImpl
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getRuntimePortInstanceAssembly()
	 * @generated
	 */
	int RUNTIME_PORT_INSTANCE_ASSEMBLY = 13;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.MessageOnAssemblyImpl <em>Message On Assembly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.MessageOnAssemblyImpl
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getMessageOnAssembly()
	 * @generated
	 */
	int MESSAGE_ON_ASSEMBLY = 14;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_BEHAVIORAL_ELEMENT__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_BEHAVIORAL_ELEMENT__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_BEHAVIORAL_ELEMENT__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Statechart Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Buffer</b></em>' containment reference.
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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RoleInstanceImpl <em>Role Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RoleInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getRoleInstance()
	 * @generated
	 */
	int ROLE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__ANNOTATION = RUNTIME_BEHAVIORAL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__EXTENSION = RUNTIME_BEHAVIORAL_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__NAME = RUNTIME_BEHAVIORAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Statechart Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__STATECHART_INSTANCE = RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE;

	/**
	 * The feature id for the '<em><b>Message Buffer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__MESSAGE_BUFFER = RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__INSTANCE_OF = RUNTIME_BEHAVIORAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assembly</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__ASSEMBLY = RUNTIME_BEHAVIORAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE_FEATURE_COUNT = RUNTIME_BEHAVIORAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__BUFFER_SIZE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__MESSAGES = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Runtime Behavioral Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Message Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_INSTANCE__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_INSTANCE__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Runtime Behavioral Element</b></em>' container reference.
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
	 * The feature id for the '<em><b>Active</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_INSTANCE__ACTIVE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Realtime Statechart Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_INSTANCE__SUB_REALTIME_STATECHART_INSTANCES = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attribute Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_INSTANCE__ATTRIBUTE_BINDINGS = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Realtime Statechart Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_INSTANCE_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_MESSAGE__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_MESSAGE__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

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
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_MESSAGE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PARAMETER__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PARAMETER__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

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
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PARAMETER_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BINDING__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BINDING__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BINDING__ATTRIBUTE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BINDING__VALUE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BINDING_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE__ANNOTATION = ROLE_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE__EXTENSION = ROLE_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE__NAME = ROLE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Statechart Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE__STATECHART_INSTANCE = ROLE_INSTANCE__STATECHART_INSTANCE;

	/**
	 * The feature id for the '<em><b>Message Buffer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE__MESSAGE_BUFFER = ROLE_INSTANCE__MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE__INSTANCE_OF = ROLE_INSTANCE__INSTANCE_OF;

	/**
	 * The feature id for the '<em><b>Assembly</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE__ASSEMBLY = ROLE_INSTANCE__ASSEMBLY;

	/**
	 * The feature id for the '<em><b>Multi Role Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE__MULTI_ROLE_INSTANCE = ROLE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Role Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROLE_INSTANCE_FEATURE_COUNT = ROLE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ROLE_INSTANCE__ANNOTATION = ROLE_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ROLE_INSTANCE__EXTENSION = ROLE_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ROLE_INSTANCE__NAME = ROLE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Statechart Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ROLE_INSTANCE__STATECHART_INSTANCE = ROLE_INSTANCE__STATECHART_INSTANCE;

	/**
	 * The feature id for the '<em><b>Message Buffer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ROLE_INSTANCE__MESSAGE_BUFFER = ROLE_INSTANCE__MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ROLE_INSTANCE__INSTANCE_OF = ROLE_INSTANCE__INSTANCE_OF;

	/**
	 * The feature id for the '<em><b>Assembly</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ROLE_INSTANCE__ASSEMBLY = ROLE_INSTANCE__ASSEMBLY;

	/**
	 * The feature id for the '<em><b>Sub Role Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ROLE_INSTANCE__SUB_ROLE_INSTANCES = ROLE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Role Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ROLE_INSTANCE_FEATURE_COUNT = ROLE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ASSEMBLY_INSTANCE__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ASSEMBLY_INSTANCE__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Transient Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ASSEMBLY_INSTANCE__TRANSIENT_MESSAGES = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assembly Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ASSEMBLY_INSTANCE_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ROLE_ASSEMBLY__ANNOTATION = RUNTIME_ASSEMBLY_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ROLE_ASSEMBLY__EXTENSION = RUNTIME_ASSEMBLY_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Transient Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ROLE_ASSEMBLY__TRANSIENT_MESSAGES = RUNTIME_ASSEMBLY_INSTANCE__TRANSIENT_MESSAGES;

	/**
	 * The feature id for the '<em><b>Role Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ROLE_ASSEMBLY__ROLE_INSTANCES = RUNTIME_ASSEMBLY_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ROLE_ASSEMBLY__INSTANCE_OF = RUNTIME_ASSEMBLY_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ROLE_ASSEMBLY_FEATURE_COUNT = RUNTIME_ASSEMBLY_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PORT_INSTANCE_ASSEMBLY__ANNOTATION = InstancePackage.ASSEMBLY_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PORT_INSTANCE_ASSEMBLY__EXTENSION = InstancePackage.ASSEMBLY_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PORT_INSTANCE_ASSEMBLY__SOURCE = InstancePackage.ASSEMBLY_INSTANCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PORT_INSTANCE_ASSEMBLY__TARGET = InstancePackage.ASSEMBLY_INSTANCE__TARGET;

	/**
	 * The feature id for the '<em><b>Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PORT_INSTANCE_ASSEMBLY__CONNECTOR_TYPE = InstancePackage.ASSEMBLY_INSTANCE__CONNECTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Assembly Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PORT_INSTANCE_ASSEMBLY__ASSEMBLY_TYPE = InstancePackage.ASSEMBLY_INSTANCE__ASSEMBLY_TYPE;

	/**
	 * The feature id for the '<em><b>Transient Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PORT_INSTANCE_ASSEMBLY__TRANSIENT_MESSAGES = InstancePackage.ASSEMBLY_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Instance Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PORT_INSTANCE_ASSEMBLY_FEATURE_COUNT = InstancePackage.ASSEMBLY_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ON_ASSEMBLY__RECEIVER = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ON_ASSEMBLY__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Runtime Assembly</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ON_ASSEMBLY__RUNTIME_ASSEMBLY = 2;

	/**
	 * The number of structural features of the '<em>Message On Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ON_ASSEMBLY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '<em>Java Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getJavaObject()
	 * @generated
	 */
	int JAVA_OBJECT = 15;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeComponentInstance
	 * @generated
	 */
	EClass getRuntimeComponentInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeDiscretePortInstance <em>Discrete Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeDiscretePortInstance
	 * @generated
	 */
	EClass getRuntimeDiscretePortInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance <em>Role Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance
	 * @generated
	 */
	EClass getRoleInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance#getInstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Of</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance#getInstanceOf()
	 * @see #getRoleInstance()
	 * @generated
	 */
	EReference getRoleInstance_InstanceOf();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance#getAssembly <em>Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance#getAssembly()
	 * @see #getRoleInstance()
	 * @generated
	 */
	EReference getRoleInstance_Assembly();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageBuffer <em>Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Buffer</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.MessageBuffer
	 * @generated
	 */
	EClass getMessageBuffer();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageBuffer#getBufferSize <em>Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffer Size</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.MessageBuffer#getBufferSize()
	 * @see #getMessageBuffer()
	 * @generated
	 */
	EAttribute getMessageBuffer_BufferSize();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageBuffer#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.MessageBuffer#getMessages()
	 * @see #getMessageBuffer()
	 * @generated
	 */
	EReference getMessageBuffer_Messages();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageBuffer#getRuntimeBehavioralElement <em>Runtime Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Runtime Behavioral Element</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.MessageBuffer#getRuntimeBehavioralElement()
	 * @see #getMessageBuffer()
	 * @generated
	 */
	EReference getMessageBuffer_RuntimeBehavioralElement();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance <em>Realtime Statechart Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realtime Statechart Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance
	 * @generated
	 */
	EClass getRealtimeStatechartInstance();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance#getRuntimeBehavioralElement <em>Runtime Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Runtime Behavioral Element</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance#getRuntimeBehavioralElement()
	 * @see #getRealtimeStatechartInstance()
	 * @generated
	 */
	EReference getRealtimeStatechartInstance_RuntimeBehavioralElement();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance#getInstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Of</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance#getInstanceOf()
	 * @see #getRealtimeStatechartInstance()
	 * @generated
	 */
	EReference getRealtimeStatechartInstance_InstanceOf();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance#getActive()
	 * @see #getRealtimeStatechartInstance()
	 * @generated
	 */
	EReference getRealtimeStatechartInstance_Active();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance#getSubRealtimeStatechartInstances <em>Sub Realtime Statechart Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Realtime Statechart Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance#getSubRealtimeStatechartInstances()
	 * @see #getRealtimeStatechartInstance()
	 * @generated
	 */
	EReference getRealtimeStatechartInstance_SubRealtimeStatechartInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance#getAttributeBindings <em>Attribute Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Bindings</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance#getAttributeBindings()
	 * @see #getRealtimeStatechartInstance()
	 * @generated
	 */
	EReference getRealtimeStatechartInstance_AttributeBindings();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeMessage
	 * @generated
	 */
	EClass getRuntimeMessage();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeMessage#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeMessage#getParameters()
	 * @see #getRuntimeMessage()
	 * @generated
	 */
	EReference getRuntimeMessage_Parameters();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeParameter
	 * @generated
	 */
	EClass getRuntimeParameter();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeParameter#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Message</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeParameter#getMessage()
	 * @see #getRuntimeParameter()
	 * @generated
	 */
	EReference getRuntimeParameter_Message();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeParameter#getValue()
	 * @see #getRuntimeParameter()
	 * @generated
	 */
	EAttribute getRuntimeParameter_Value();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.runtime.AttributeBinding <em>Attribute Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Binding</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.AttributeBinding
	 * @generated
	 */
	EClass getAttributeBinding();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.runtime.AttributeBinding#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.AttributeBinding#getAttribute()
	 * @see #getAttributeBinding()
	 * @generated
	 */
	EReference getAttributeBinding_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.runtime.AttributeBinding#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.AttributeBinding#getValue()
	 * @see #getAttributeBinding()
	 * @generated
	 */
	EAttribute getAttributeBinding_Value();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeBehavioralElement <em>Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioral Element</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeBehavioralElement
	 * @generated
	 */
	EClass getRuntimeBehavioralElement();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeBehavioralElement#getStatechartInstance <em>Statechart Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statechart Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeBehavioralElement#getStatechartInstance()
	 * @see #getRuntimeBehavioralElement()
	 * @generated
	 */
	EReference getRuntimeBehavioralElement_StatechartInstance();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeBehavioralElement#getMessageBuffer <em>Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Buffer</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeBehavioralElement#getMessageBuffer()
	 * @see #getRuntimeBehavioralElement()
	 * @generated
	 */
	EReference getRuntimeBehavioralElement_MessageBuffer();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.runtime.SingleRoleInstance <em>Single Role Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Role Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.SingleRoleInstance
	 * @generated
	 */
	EClass getSingleRoleInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.runtime.SingleRoleInstance#getMultiRoleInstance <em>Multi Role Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Multi Role Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.SingleRoleInstance#getMultiRoleInstance()
	 * @see #getSingleRoleInstance()
	 * @generated
	 */
	EReference getSingleRoleInstance_MultiRoleInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.runtime.MultiRoleInstance <em>Multi Role Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Role Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.MultiRoleInstance
	 * @generated
	 */
	EClass getMultiRoleInstance();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.runtime.MultiRoleInstance#getSubRoleInstances <em>Sub Role Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Role Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.MultiRoleInstance#getSubRoleInstances()
	 * @see #getMultiRoleInstance()
	 * @generated
	 */
	EReference getMultiRoleInstance_SubRoleInstances();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeRoleAssembly <em>Role Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Assembly</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeRoleAssembly
	 * @generated
	 */
	EClass getRuntimeRoleAssembly();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeRoleAssembly#getRoleInstances <em>Role Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeRoleAssembly#getRoleInstances()
	 * @see #getRuntimeRoleAssembly()
	 * @generated
	 */
	EReference getRuntimeRoleAssembly_RoleInstances();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeRoleAssembly#getInstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Of</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeRoleAssembly#getInstanceOf()
	 * @see #getRuntimeRoleAssembly()
	 * @generated
	 */
	EReference getRuntimeRoleAssembly_InstanceOf();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeAssemblyInstance <em>Assembly Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeAssemblyInstance
	 * @generated
	 */
	EClass getRuntimeAssemblyInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeAssemblyInstance#getTransientMessages <em>Transient Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transient Messages</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeAssemblyInstance#getTransientMessages()
	 * @see #getRuntimeAssemblyInstance()
	 * @generated
	 */
	EReference getRuntimeAssemblyInstance_TransientMessages();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimePortInstanceAssembly <em>Port Instance Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Instance Assembly</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePortInstanceAssembly
	 * @generated
	 */
	EClass getRuntimePortInstanceAssembly();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly <em>Message On Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message On Assembly</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly
	 * @generated
	 */
	EClass getMessageOnAssembly();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly#getReceiver()
	 * @see #getMessageOnAssembly()
	 * @generated
	 */
	EReference getMessageOnAssembly_Receiver();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly#getMessage()
	 * @see #getMessageOnAssembly()
	 * @generated
	 */
	EReference getMessageOnAssembly_Message();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly#getRuntimeAssembly <em>Runtime Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Runtime Assembly</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly#getRuntimeAssembly()
	 * @see #getMessageOnAssembly()
	 * @generated
	 */
	EReference getMessageOnAssembly_RuntimeAssembly();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeComponentInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getRuntimeComponentInstance()
		 * @generated
		 */
		EClass RUNTIME_COMPONENT_INSTANCE = eINSTANCE.getRuntimeComponentInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeDiscretePortInstanceImpl <em>Discrete Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeDiscretePortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getRuntimeDiscretePortInstance()
		 * @generated
		 */
		EClass RUNTIME_DISCRETE_PORT_INSTANCE = eINSTANCE.getRuntimeDiscretePortInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RoleInstanceImpl <em>Role Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RoleInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getRoleInstance()
		 * @generated
		 */
		EClass ROLE_INSTANCE = eINSTANCE.getRoleInstance();

		/**
		 * The meta object literal for the '<em><b>Instance Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_INSTANCE__INSTANCE_OF = eINSTANCE.getRoleInstance_InstanceOf();

		/**
		 * The meta object literal for the '<em><b>Assembly</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_INSTANCE__ASSEMBLY = eINSTANCE.getRoleInstance_Assembly();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.MessageBufferImpl <em>Message Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.MessageBufferImpl
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getMessageBuffer()
		 * @generated
		 */
		EClass MESSAGE_BUFFER = eINSTANCE.getMessageBuffer();

		/**
		 * The meta object literal for the '<em><b>Buffer Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_BUFFER__BUFFER_SIZE = eINSTANCE.getMessageBuffer_BufferSize();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_BUFFER__MESSAGES = eINSTANCE.getMessageBuffer_Messages();

		/**
		 * The meta object literal for the '<em><b>Runtime Behavioral Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT = eINSTANCE.getMessageBuffer_RuntimeBehavioralElement();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RealtimeStatechartInstanceImpl <em>Realtime Statechart Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RealtimeStatechartInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getRealtimeStatechartInstance()
		 * @generated
		 */
		EClass REALTIME_STATECHART_INSTANCE = eINSTANCE.getRealtimeStatechartInstance();

		/**
		 * The meta object literal for the '<em><b>Runtime Behavioral Element</b></em>' container reference feature.
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
		 * The meta object literal for the '<em><b>Active</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART_INSTANCE__ACTIVE = eINSTANCE.getRealtimeStatechartInstance_Active();

		/**
		 * The meta object literal for the '<em><b>Sub Realtime Statechart Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART_INSTANCE__SUB_REALTIME_STATECHART_INSTANCES = eINSTANCE.getRealtimeStatechartInstance_SubRealtimeStatechartInstances();

		/**
		 * The meta object literal for the '<em><b>Attribute Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART_INSTANCE__ATTRIBUTE_BINDINGS = eINSTANCE.getRealtimeStatechartInstance_AttributeBindings();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeMessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeMessageImpl
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getRuntimeMessage()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeParameterImpl
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getRuntimeParameter()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.AttributeBindingImpl <em>Attribute Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.AttributeBindingImpl
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getAttributeBinding()
		 * @generated
		 */
		EClass ATTRIBUTE_BINDING = eINSTANCE.getAttributeBinding();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_BINDING__ATTRIBUTE = eINSTANCE.getAttributeBinding_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_BINDING__VALUE = eINSTANCE.getAttributeBinding_Value();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeBehavioralElementImpl <em>Behavioral Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeBehavioralElementImpl
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getRuntimeBehavioralElement()
		 * @generated
		 */
		EClass RUNTIME_BEHAVIORAL_ELEMENT = eINSTANCE.getRuntimeBehavioralElement();

		/**
		 * The meta object literal for the '<em><b>Statechart Instance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE = eINSTANCE.getRuntimeBehavioralElement_StatechartInstance();

		/**
		 * The meta object literal for the '<em><b>Message Buffer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_BUFFER = eINSTANCE.getRuntimeBehavioralElement_MessageBuffer();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.SingleRoleInstanceImpl <em>Single Role Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.SingleRoleInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getSingleRoleInstance()
		 * @generated
		 */
		EClass SINGLE_ROLE_INSTANCE = eINSTANCE.getSingleRoleInstance();

		/**
		 * The meta object literal for the '<em><b>Multi Role Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ROLE_INSTANCE__MULTI_ROLE_INSTANCE = eINSTANCE.getSingleRoleInstance_MultiRoleInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.MultiRoleInstanceImpl <em>Multi Role Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.MultiRoleInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getMultiRoleInstance()
		 * @generated
		 */
		EClass MULTI_ROLE_INSTANCE = eINSTANCE.getMultiRoleInstance();

		/**
		 * The meta object literal for the '<em><b>Sub Role Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_ROLE_INSTANCE__SUB_ROLE_INSTANCES = eINSTANCE.getMultiRoleInstance_SubRoleInstances();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeRoleAssemblyImpl <em>Role Assembly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeRoleAssemblyImpl
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getRuntimeRoleAssembly()
		 * @generated
		 */
		EClass RUNTIME_ROLE_ASSEMBLY = eINSTANCE.getRuntimeRoleAssembly();

		/**
		 * The meta object literal for the '<em><b>Role Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_ROLE_ASSEMBLY__ROLE_INSTANCES = eINSTANCE.getRuntimeRoleAssembly_RoleInstances();

		/**
		 * The meta object literal for the '<em><b>Instance Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_ROLE_ASSEMBLY__INSTANCE_OF = eINSTANCE.getRuntimeRoleAssembly_InstanceOf();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeAssemblyInstanceImpl <em>Assembly Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeAssemblyInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getRuntimeAssemblyInstance()
		 * @generated
		 */
		EClass RUNTIME_ASSEMBLY_INSTANCE = eINSTANCE.getRuntimeAssemblyInstance();

		/**
		 * The meta object literal for the '<em><b>Transient Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_ASSEMBLY_INSTANCE__TRANSIENT_MESSAGES = eINSTANCE.getRuntimeAssemblyInstance_TransientMessages();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePortInstanceAssemblyImpl <em>Port Instance Assembly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePortInstanceAssemblyImpl
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getRuntimePortInstanceAssembly()
		 * @generated
		 */
		EClass RUNTIME_PORT_INSTANCE_ASSEMBLY = eINSTANCE.getRuntimePortInstanceAssembly();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.MessageOnAssemblyImpl <em>Message On Assembly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.MessageOnAssemblyImpl
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getMessageOnAssembly()
		 * @generated
		 */
		EClass MESSAGE_ON_ASSEMBLY = eINSTANCE.getMessageOnAssembly();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_ON_ASSEMBLY__RECEIVER = eINSTANCE.getMessageOnAssembly_Receiver();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_ON_ASSEMBLY__MESSAGE = eINSTANCE.getMessageOnAssembly_Message();

		/**
		 * The meta object literal for the '<em><b>Runtime Assembly</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_ON_ASSEMBLY__RUNTIME_ASSEMBLY = eINSTANCE.getMessageOnAssembly_RuntimeAssembly();

		/**
		 * The meta object literal for the '<em>Java Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimePackageImpl#getJavaObject()
		 * @generated
		 */
		EDataType JAVA_OBJECT = eINSTANCE.getJavaObject();

	}

} //RuntimePackage
