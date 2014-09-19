/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.muml.component.ComponentPackage;

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
 * This package contains classes for specifying the broadcast message exchange that 
 * is required for setting up a connection between two autonomous mechatronic
 * systems.
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.ProtocolinstantiationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ProtocolinstantiationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "protocolinstantiation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/reconfiguration/protocolinstantiation/0.4.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "protocolinstantiation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProtocolinstantiationPackage eINSTANCE = de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.ProtocolinstantiationPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.BroadcastPortImpl <em>Broadcast Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.BroadcastPortImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.ProtocolinstantiationPackageImpl#getBroadcastPort()
	 * @generated
	 */
	int BROADCAST_PORT = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_PORT__ANNOTATION = ComponentPackage.PORT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_PORT__EXTENSION = ComponentPackage.PORT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_PORT__COMMENT = ComponentPackage.PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_PORT__CONNECTORS = ComponentPackage.PORT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_PORT__NAME = ComponentPackage.PORT__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_PORT__COMPONENT = ComponentPackage.PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Port Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_PORT__PORT_CONNECTORS = ComponentPackage.PORT__PORT_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_PORT__BEHAVIOR = ComponentPackage.PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_PORT__SENDER_MESSAGE_TYPES = ComponentPackage.PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_PORT__RECEIVER_MESSAGE_TYPES = ComponentPackage.PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_PORT__ADAPTATION_BEHAVIOR = ComponentPackage.PORT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Subrole Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_PORT__SUBROLE_BEHAVIOR = ComponentPackage.PORT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_PORT__CARDINALITY = ComponentPackage.PORT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_PORT__RECEIVER_MESSAGE_BUFFER = ComponentPackage.PORT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_PORT__MULTI = ComponentPackage.PORT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_PORT__SPECIFICATION = ComponentPackage.PORT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_PORT__KIND = ComponentPackage.PORT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Broadcast Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_PORT_FEATURE_COUNT = ComponentPackage.PORT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.BroadcastPortSpecificationImpl <em>Broadcast Port Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.BroadcastPortSpecificationImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.ProtocolinstantiationPackageImpl#getBroadcastPortSpecification()
	 * @generated
	 */
	int BROADCAST_PORT_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_PORT_SPECIFICATION__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_PORT_SPECIFICATION__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The number of structural features of the '<em>Broadcast Port Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_PORT_SPECIFICATION_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.ProtocolInstantiationPortSpecificationImpl <em>Protocol Instantiation Port Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.ProtocolInstantiationPortSpecificationImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.ProtocolinstantiationPackageImpl#getProtocolInstantiationPortSpecification()
	 * @generated
	 */
	int PROTOCOL_INSTANTIATION_PORT_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_INSTANTIATION_PORT_SPECIFICATION__ANNOTATION = BROADCAST_PORT_SPECIFICATION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_INSTANTIATION_PORT_SPECIFICATION__EXTENSION = BROADCAST_PORT_SPECIFICATION__EXTENSION;

	/**
	 * The number of structural features of the '<em>Protocol Instantiation Port Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_INSTANTIATION_PORT_SPECIFICATION_FEATURE_COUNT = BROADCAST_PORT_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.DiscoveryPortSpecificationImpl <em>Discovery Port Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.DiscoveryPortSpecificationImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.ProtocolinstantiationPackageImpl#getDiscoveryPortSpecification()
	 * @generated
	 */
	int DISCOVERY_PORT_SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_PORT_SPECIFICATION__ANNOTATION = BROADCAST_PORT_SPECIFICATION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_PORT_SPECIFICATION__EXTENSION = BROADCAST_PORT_SPECIFICATION__EXTENSION;

	/**
	 * The number of structural features of the '<em>Discovery Port Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_PORT_SPECIFICATION_FEATURE_COUNT = BROADCAST_PORT_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPortKind <em>Broadcast Port Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPortKind
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.ProtocolinstantiationPackageImpl#getBroadcastPortKind()
	 * @generated
	 */
	int BROADCAST_PORT_KIND = 4;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPort <em>Broadcast Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Broadcast Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPort
	 * @generated
	 */
	EClass getBroadcastPort();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPort#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPort#getSpecification()
	 * @see #getBroadcastPort()
	 * @generated
	 */
	EReference getBroadcastPort_Specification();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPort#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPort#getKind()
	 * @see #getBroadcastPort()
	 * @generated
	 */
	EAttribute getBroadcastPort_Kind();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPortSpecification <em>Broadcast Port Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Broadcast Port Specification</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPortSpecification
	 * @generated
	 */
	EClass getBroadcastPortSpecification();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.ProtocolInstantiationPortSpecification <em>Protocol Instantiation Port Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Instantiation Port Specification</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.ProtocolInstantiationPortSpecification
	 * @generated
	 */
	EClass getProtocolInstantiationPortSpecification();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.DiscoveryPortSpecification <em>Discovery Port Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discovery Port Specification</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.DiscoveryPortSpecification
	 * @generated
	 */
	EClass getDiscoveryPortSpecification();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPortKind <em>Broadcast Port Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Broadcast Port Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPortKind
	 * @generated
	 */
	EEnum getBroadcastPortKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProtocolinstantiationFactory getProtocolinstantiationFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.BroadcastPortImpl <em>Broadcast Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.BroadcastPortImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.ProtocolinstantiationPackageImpl#getBroadcastPort()
		 * @generated
		 */
		EClass BROADCAST_PORT = eINSTANCE.getBroadcastPort();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROADCAST_PORT__SPECIFICATION = eINSTANCE.getBroadcastPort_Specification();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROADCAST_PORT__KIND = eINSTANCE.getBroadcastPort_Kind();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.BroadcastPortSpecificationImpl <em>Broadcast Port Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.BroadcastPortSpecificationImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.ProtocolinstantiationPackageImpl#getBroadcastPortSpecification()
		 * @generated
		 */
		EClass BROADCAST_PORT_SPECIFICATION = eINSTANCE.getBroadcastPortSpecification();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.ProtocolInstantiationPortSpecificationImpl <em>Protocol Instantiation Port Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.ProtocolInstantiationPortSpecificationImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.ProtocolinstantiationPackageImpl#getProtocolInstantiationPortSpecification()
		 * @generated
		 */
		EClass PROTOCOL_INSTANTIATION_PORT_SPECIFICATION = eINSTANCE.getProtocolInstantiationPortSpecification();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.DiscoveryPortSpecificationImpl <em>Discovery Port Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.DiscoveryPortSpecificationImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.ProtocolinstantiationPackageImpl#getDiscoveryPortSpecification()
		 * @generated
		 */
		EClass DISCOVERY_PORT_SPECIFICATION = eINSTANCE.getDiscoveryPortSpecification();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPortKind <em>Broadcast Port Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPortKind
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.ProtocolinstantiationPackageImpl#getBroadcastPortKind()
		 * @generated
		 */
		EEnum BROADCAST_PORT_KIND = eINSTANCE.getBroadcastPortKind();

	}

} //ProtocolinstantiationPackage
