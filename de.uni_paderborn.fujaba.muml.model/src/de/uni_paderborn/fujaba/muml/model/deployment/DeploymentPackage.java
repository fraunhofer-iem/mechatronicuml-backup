/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.deployment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface DeploymentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "deployment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/model/deployment/0.2.7";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "deployment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeploymentPackage eINSTANCE = de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentImpl
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentPackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Communication Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__COMMUNICATION_LINKS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hardware Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__HARDWARE_NODES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Component Instance Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwareNodeImpl <em>Hardware Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwareNodeImpl
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentPackageImpl#getHardwareNode()
	 * @generated
	 */
	int HARDWARE_NODE = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_NODE__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_NODE__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_NODE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_NODE__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_NODE__DEPLOYMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hardware Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_NODE__HARDWARE_PORTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deployed Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_NODE__DEPLOYED_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Hardware Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_NODE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwarePortImpl <em>Hardware Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwarePortImpl
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentPackageImpl#getHardwarePort()
	 * @generated
	 */
	int HARDWARE_PORT = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hardware Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__HARDWARE_NODE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Communication Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__OUTGOING_COMMUNICATION_LINK = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incoming Communication Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__INCOMING_COMMUNICATION_LINK = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Deployed Port Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__DEPLOYED_PORT_INSTANCE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__KIND = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Hardware Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.CommunicationLinkImpl <em>Communication Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.CommunicationLinkImpl
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentPackageImpl#getCommunicationLink()
	 * @generated
	 */
	int COMMUNICATION_LINK = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__DEPLOYMENT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__SOURCE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__TARGET = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Communication Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePortDirectionKind <em>Hardware Port Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwarePortDirectionKind
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentPackageImpl#getHardwarePortDirectionKind()
	 * @generated
	 */
	int HARDWARE_PORT_DIRECTION_KIND = 4;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.deployment.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getCommunicationLinks <em>Communication Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communication Links</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getCommunicationLinks()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_CommunicationLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getHardwareNodes <em>Hardware Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hardware Nodes</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getHardwareNodes()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_HardwareNodes();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getComponentInstanceConfiguration <em>Component Instance Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Instance Configuration</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getComponentInstanceConfiguration()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_ComponentInstanceConfiguration();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode <em>Hardware Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Node</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode
	 * @generated
	 */
	EClass getHardwareNode();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Deployment</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode#getDeployment()
	 * @see #getHardwareNode()
	 * @generated
	 */
	EReference getHardwareNode_Deployment();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode#getHardwarePorts <em>Hardware Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hardware Ports</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode#getHardwarePorts()
	 * @see #getHardwareNode()
	 * @generated
	 */
	EReference getHardwareNode_HardwarePorts();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode#getDeployedInstances <em>Deployed Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deployed Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode#getDeployedInstances()
	 * @see #getHardwareNode()
	 * @generated
	 */
	EReference getHardwareNode_DeployedInstances();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort <em>Hardware Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort
	 * @generated
	 */
	EClass getHardwarePort();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getHardwareNode <em>Hardware Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Hardware Node</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getHardwareNode()
	 * @see #getHardwarePort()
	 * @generated
	 */
	EReference getHardwarePort_HardwareNode();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getOutgoingCommunicationLink <em>Outgoing Communication Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Communication Link</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getOutgoingCommunicationLink()
	 * @see #getHardwarePort()
	 * @generated
	 */
	EReference getHardwarePort_OutgoingCommunicationLink();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getIncomingCommunicationLink <em>Incoming Communication Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Communication Link</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getIncomingCommunicationLink()
	 * @see #getHardwarePort()
	 * @generated
	 */
	EReference getHardwarePort_IncomingCommunicationLink();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getDeployedPortInstance <em>Deployed Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deployed Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getDeployedPortInstance()
	 * @see #getHardwarePort()
	 * @generated
	 */
	EReference getHardwarePort_DeployedPortInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getKind()
	 * @see #getHardwarePort()
	 * @generated
	 */
	EAttribute getHardwarePort_Kind();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink <em>Communication Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Link</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink
	 * @generated
	 */
	EClass getCommunicationLink();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Deployment</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getDeployment()
	 * @see #getCommunicationLink()
	 * @generated
	 */
	EReference getCommunicationLink_Deployment();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getSource()
	 * @see #getCommunicationLink()
	 * @generated
	 */
	EReference getCommunicationLink_Source();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getTarget()
	 * @see #getCommunicationLink()
	 * @generated
	 */
	EReference getCommunicationLink_Target();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePortDirectionKind <em>Hardware Port Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hardware Port Direction Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwarePortDirectionKind
	 * @generated
	 */
	EEnum getHardwarePortDirectionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeploymentFactory getDeploymentFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentImpl
		 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentPackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Communication Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__COMMUNICATION_LINKS = eINSTANCE.getDeployment_CommunicationLinks();

		/**
		 * The meta object literal for the '<em><b>Hardware Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__HARDWARE_NODES = eINSTANCE.getDeployment_HardwareNodes();

		/**
		 * The meta object literal for the '<em><b>Component Instance Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION = eINSTANCE.getDeployment_ComponentInstanceConfiguration();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwareNodeImpl <em>Hardware Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwareNodeImpl
		 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentPackageImpl#getHardwareNode()
		 * @generated
		 */
		EClass HARDWARE_NODE = eINSTANCE.getHardwareNode();

		/**
		 * The meta object literal for the '<em><b>Deployment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_NODE__DEPLOYMENT = eINSTANCE.getHardwareNode_Deployment();

		/**
		 * The meta object literal for the '<em><b>Hardware Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_NODE__HARDWARE_PORTS = eINSTANCE.getHardwareNode_HardwarePorts();

		/**
		 * The meta object literal for the '<em><b>Deployed Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_NODE__DEPLOYED_INSTANCES = eINSTANCE.getHardwareNode_DeployedInstances();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwarePortImpl <em>Hardware Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwarePortImpl
		 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentPackageImpl#getHardwarePort()
		 * @generated
		 */
		EClass HARDWARE_PORT = eINSTANCE.getHardwarePort();

		/**
		 * The meta object literal for the '<em><b>Hardware Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_PORT__HARDWARE_NODE = eINSTANCE.getHardwarePort_HardwareNode();

		/**
		 * The meta object literal for the '<em><b>Outgoing Communication Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_PORT__OUTGOING_COMMUNICATION_LINK = eINSTANCE.getHardwarePort_OutgoingCommunicationLink();

		/**
		 * The meta object literal for the '<em><b>Incoming Communication Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_PORT__INCOMING_COMMUNICATION_LINK = eINSTANCE.getHardwarePort_IncomingCommunicationLink();

		/**
		 * The meta object literal for the '<em><b>Deployed Port Instance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_PORT__DEPLOYED_PORT_INSTANCE = eINSTANCE.getHardwarePort_DeployedPortInstance();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PORT__KIND = eINSTANCE.getHardwarePort_Kind();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.CommunicationLinkImpl <em>Communication Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.CommunicationLinkImpl
		 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentPackageImpl#getCommunicationLink()
		 * @generated
		 */
		EClass COMMUNICATION_LINK = eINSTANCE.getCommunicationLink();

		/**
		 * The meta object literal for the '<em><b>Deployment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK__DEPLOYMENT = eINSTANCE.getCommunicationLink_Deployment();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK__SOURCE = eINSTANCE.getCommunicationLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK__TARGET = eINSTANCE.getCommunicationLink_Target();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePortDirectionKind <em>Hardware Port Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwarePortDirectionKind
		 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentPackageImpl#getHardwarePortDirectionKind()
		 * @generated
		 */
		EEnum HARDWARE_PORT_DIRECTION_KIND = eINSTANCE.getHardwarePortDirectionKind();

	}

} //DeploymentPackage
