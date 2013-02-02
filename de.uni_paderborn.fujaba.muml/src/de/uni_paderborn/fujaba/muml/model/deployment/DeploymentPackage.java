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
	String eNS_URI = "http://www.fujaba.de/muml/model/deployment/0.3.11";

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
	 * The feature id for the '<em><b>Quality Of Link Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__QUALITY_OF_LINK_SERVICES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

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
	 * The feature id for the '<em><b>Hardware Node Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_NODE__HARDWARE_NODE_KIND = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Hardware Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_NODE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

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
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__CONNECTORS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hardware Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__HARDWARE_NODE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deployed Port Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__DEPLOYED_PORT_INSTANCE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__KIND = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Communication Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__COMMUNICATION_LINKS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

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
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__COMMENT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connector Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__CONNECTOR_ENDPOINTS = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__DEPLOYMENT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Quality Of Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__QUALITY_OF_SERVICE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Deployed Assembly Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__DEPLOYED_ASSEMBLY_INSTANCES = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hardware Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__HARDWARE_PORTS = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Communication Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 6;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.LinkQualityOfServiceImpl <em>Link Quality Of Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.LinkQualityOfServiceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentPackageImpl#getLinkQualityOfService()
	 * @generated
	 */
	int LINK_QUALITY_OF_SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_QUALITY_OF_SERVICE__ANNOTATION = CorePackage.COMMENTABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_QUALITY_OF_SERVICE__EXTENSION = CorePackage.COMMENTABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_QUALITY_OF_SERVICE__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_QUALITY_OF_SERVICE__NAME = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Packet Delay Variation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_QUALITY_OF_SERVICE__PACKET_DELAY_VARIATION = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_QUALITY_OF_SERVICE__LATENCY = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_QUALITY_OF_SERVICE__DEPLOYMENT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Link Quality Of Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_QUALITY_OF_SERVICE_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwareNodeKind <em>Hardware Node Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwareNodeKind
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentPackageImpl#getHardwareNodeKind()
	 * @generated
	 */
	int HARDWARE_NODE_KIND = 5;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePortDirectionKind <em>Hardware Port Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwarePortDirectionKind
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentPackageImpl#getHardwarePortDirectionKind()
	 * @generated
	 */
	int HARDWARE_PORT_DIRECTION_KIND = 6;


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
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getQualityOfLinkServices <em>Quality Of Link Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quality Of Link Services</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getQualityOfLinkServices()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_QualityOfLinkServices();

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
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode#getHardwareNodeKind <em>Hardware Node Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware Node Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode#getHardwareNodeKind()
	 * @see #getHardwareNode()
	 * @generated
	 */
	EAttribute getHardwareNode_HardwareNodeKind();

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
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getCommunicationLinks <em>Communication Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communication Links</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getCommunicationLinks()
	 * @see #getHardwarePort()
	 * @generated
	 */
	EReference getHardwarePort_CommunicationLinks();

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
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getQualityOfService <em>Quality Of Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quality Of Service</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getQualityOfService()
	 * @see #getCommunicationLink()
	 * @generated
	 */
	EReference getCommunicationLink_QualityOfService();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getDeployedAssemblyInstances <em>Deployed Assembly Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deployed Assembly Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getDeployedAssemblyInstances()
	 * @see #getCommunicationLink()
	 * @generated
	 */
	EReference getCommunicationLink_DeployedAssemblyInstances();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getHardwarePorts <em>Hardware Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hardware Ports</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getHardwarePorts()
	 * @see #getCommunicationLink()
	 * @generated
	 */
	EReference getCommunicationLink_HardwarePorts();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.deployment.LinkQualityOfService <em>Link Quality Of Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Quality Of Service</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.LinkQualityOfService
	 * @generated
	 */
	EClass getLinkQualityOfService();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.deployment.LinkQualityOfService#getPacketDelayVariation <em>Packet Delay Variation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Packet Delay Variation</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.LinkQualityOfService#getPacketDelayVariation()
	 * @see #getLinkQualityOfService()
	 * @generated
	 */
	EReference getLinkQualityOfService_PacketDelayVariation();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.deployment.LinkQualityOfService#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latency</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.LinkQualityOfService#getLatency()
	 * @see #getLinkQualityOfService()
	 * @generated
	 */
	EReference getLinkQualityOfService_Latency();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.deployment.LinkQualityOfService#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Deployment</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.LinkQualityOfService#getDeployment()
	 * @see #getLinkQualityOfService()
	 * @generated
	 */
	EReference getLinkQualityOfService_Deployment();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwareNodeKind <em>Hardware Node Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hardware Node Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwareNodeKind
	 * @generated
	 */
	EEnum getHardwareNodeKind();

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
		 * The meta object literal for the '<em><b>Quality Of Link Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__QUALITY_OF_LINK_SERVICES = eINSTANCE.getDeployment_QualityOfLinkServices();

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
		 * The meta object literal for the '<em><b>Hardware Node Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_NODE__HARDWARE_NODE_KIND = eINSTANCE.getHardwareNode_HardwareNodeKind();

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
		 * The meta object literal for the '<em><b>Communication Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_PORT__COMMUNICATION_LINKS = eINSTANCE.getHardwarePort_CommunicationLinks();

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
		 * The meta object literal for the '<em><b>Quality Of Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK__QUALITY_OF_SERVICE = eINSTANCE.getCommunicationLink_QualityOfService();

		/**
		 * The meta object literal for the '<em><b>Deployed Assembly Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK__DEPLOYED_ASSEMBLY_INSTANCES = eINSTANCE.getCommunicationLink_DeployedAssemblyInstances();

		/**
		 * The meta object literal for the '<em><b>Hardware Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK__HARDWARE_PORTS = eINSTANCE.getCommunicationLink_HardwarePorts();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.LinkQualityOfServiceImpl <em>Link Quality Of Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.LinkQualityOfServiceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentPackageImpl#getLinkQualityOfService()
		 * @generated
		 */
		EClass LINK_QUALITY_OF_SERVICE = eINSTANCE.getLinkQualityOfService();

		/**
		 * The meta object literal for the '<em><b>Packet Delay Variation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_QUALITY_OF_SERVICE__PACKET_DELAY_VARIATION = eINSTANCE.getLinkQualityOfService_PacketDelayVariation();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_QUALITY_OF_SERVICE__LATENCY = eINSTANCE.getLinkQualityOfService_Latency();

		/**
		 * The meta object literal for the '<em><b>Deployment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_QUALITY_OF_SERVICE__DEPLOYMENT = eINSTANCE.getLinkQualityOfService_Deployment();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwareNodeKind <em>Hardware Node Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwareNodeKind
		 * @see de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentPackageImpl#getHardwareNodeKind()
		 * @generated
		 */
		EEnum HARDWARE_NODE_KIND = eINSTANCE.getHardwareNodeKind();

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
