/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package deployment;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see deployment.DeploymentFactory
 * @model kind="package"
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
	String eNS_URI = "http://deployment/1.0";

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
	DeploymentPackage eINSTANCE = deployment.impl.DeploymentPackageImpl.init();

	/**
	 * The meta object id for the '{@link deployment.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment.impl.DeploymentImpl
	 * @see deployment.impl.DeploymentPackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 0;

	/**
	 * The feature id for the '<em><b>Hardware Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__HARDWARE_NODES = 0;

	/**
	 * The feature id for the '<em><b>Component Instance Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Communication Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__COMMUNICATION_LINKS = 2;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__COMPONENT_INSTANCE = 3;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link deployment.impl.HardwareNodeImpl <em>Hardware Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment.impl.HardwareNodeImpl
	 * @see deployment.impl.DeploymentPackageImpl#getHardwareNode()
	 * @generated
	 */
	int HARDWARE_NODE = 1;

	/**
	 * The feature id for the '<em><b>Hardware Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_NODE__HARDWARE_PORTS = 0;

	/**
	 * The feature id for the '<em><b>Component Instance Of Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_NODE__COMPONENT_INSTANCE_OF_NODE = 1;

	/**
	 * The number of structural features of the '<em>Hardware Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_NODE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link deployment.impl.HardwarePortImpl <em>Hardware Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment.impl.HardwarePortImpl
	 * @see deployment.impl.DeploymentPackageImpl#getHardwarePort()
	 * @generated
	 */
	int HARDWARE_PORT = 2;

	/**
	 * The number of structural features of the '<em>Hardware Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link deployment.impl.CommunicationLinkImpl <em>Communication Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment.impl.CommunicationLinkImpl
	 * @see deployment.impl.DeploymentPackageImpl#getCommunicationLink()
	 * @generated
	 */
	int COMMUNICATION_LINK = 3;

	/**
	 * The feature id for the '<em><b>Hardware Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__HARDWARE_PORT = 0;

	/**
	 * The feature id for the '<em><b>Component Instance Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__COMPONENT_INSTANCE_PORT = 1;

	/**
	 * The number of structural features of the '<em>Communication Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link deployment.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see deployment.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment.Deployment#getHardwareNodes <em>Hardware Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hardware Nodes</em>'.
	 * @see deployment.Deployment#getHardwareNodes()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_HardwareNodes();

	/**
	 * Returns the meta object for the containment reference '{@link deployment.Deployment#getComponentInstanceConfiguration <em>Component Instance Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Instance Configuration</em>'.
	 * @see deployment.Deployment#getComponentInstanceConfiguration()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_ComponentInstanceConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment.Deployment#getCommunicationLinks <em>Communication Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communication Links</em>'.
	 * @see deployment.Deployment#getCommunicationLinks()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_CommunicationLinks();

	/**
	 * Returns the meta object for the containment reference '{@link deployment.Deployment#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Instance</em>'.
	 * @see deployment.Deployment#getComponentInstance()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_ComponentInstance();

	/**
	 * Returns the meta object for class '{@link deployment.HardwareNode <em>Hardware Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Node</em>'.
	 * @see deployment.HardwareNode
	 * @generated
	 */
	EClass getHardwareNode();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment.HardwareNode#getHardwarePorts <em>Hardware Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hardware Ports</em>'.
	 * @see deployment.HardwareNode#getHardwarePorts()
	 * @see #getHardwareNode()
	 * @generated
	 */
	EReference getHardwareNode_HardwarePorts();

	/**
	 * Returns the meta object for the reference '{@link deployment.HardwareNode#getComponentInstanceOfNode <em>Component Instance Of Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Instance Of Node</em>'.
	 * @see deployment.HardwareNode#getComponentInstanceOfNode()
	 * @see #getHardwareNode()
	 * @generated
	 */
	EReference getHardwareNode_ComponentInstanceOfNode();

	/**
	 * Returns the meta object for class '{@link deployment.HardwarePort <em>Hardware Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Port</em>'.
	 * @see deployment.HardwarePort
	 * @generated
	 */
	EClass getHardwarePort();

	/**
	 * Returns the meta object for class '{@link deployment.CommunicationLink <em>Communication Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Link</em>'.
	 * @see deployment.CommunicationLink
	 * @generated
	 */
	EClass getCommunicationLink();

	/**
	 * Returns the meta object for the reference '{@link deployment.CommunicationLink#getHardwarePort <em>Hardware Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hardware Port</em>'.
	 * @see deployment.CommunicationLink#getHardwarePort()
	 * @see #getCommunicationLink()
	 * @generated
	 */
	EReference getCommunicationLink_HardwarePort();

	/**
	 * Returns the meta object for the reference '{@link deployment.CommunicationLink#getComponentInstancePort <em>Component Instance Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Instance Port</em>'.
	 * @see deployment.CommunicationLink#getComponentInstancePort()
	 * @see #getCommunicationLink()
	 * @generated
	 */
	EReference getCommunicationLink_ComponentInstancePort();

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
		 * The meta object literal for the '{@link deployment.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment.impl.DeploymentImpl
		 * @see deployment.impl.DeploymentPackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Hardware Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__HARDWARE_NODES = eINSTANCE.getDeployment_HardwareNodes();

		/**
		 * The meta object literal for the '<em><b>Component Instance Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION = eINSTANCE.getDeployment_ComponentInstanceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Communication Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__COMMUNICATION_LINKS = eINSTANCE.getDeployment_CommunicationLinks();

		/**
		 * The meta object literal for the '<em><b>Component Instance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__COMPONENT_INSTANCE = eINSTANCE.getDeployment_ComponentInstance();

		/**
		 * The meta object literal for the '{@link deployment.impl.HardwareNodeImpl <em>Hardware Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment.impl.HardwareNodeImpl
		 * @see deployment.impl.DeploymentPackageImpl#getHardwareNode()
		 * @generated
		 */
		EClass HARDWARE_NODE = eINSTANCE.getHardwareNode();

		/**
		 * The meta object literal for the '<em><b>Hardware Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_NODE__HARDWARE_PORTS = eINSTANCE.getHardwareNode_HardwarePorts();

		/**
		 * The meta object literal for the '<em><b>Component Instance Of Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_NODE__COMPONENT_INSTANCE_OF_NODE = eINSTANCE.getHardwareNode_ComponentInstanceOfNode();

		/**
		 * The meta object literal for the '{@link deployment.impl.HardwarePortImpl <em>Hardware Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment.impl.HardwarePortImpl
		 * @see deployment.impl.DeploymentPackageImpl#getHardwarePort()
		 * @generated
		 */
		EClass HARDWARE_PORT = eINSTANCE.getHardwarePort();

		/**
		 * The meta object literal for the '{@link deployment.impl.CommunicationLinkImpl <em>Communication Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment.impl.CommunicationLinkImpl
		 * @see deployment.impl.DeploymentPackageImpl#getCommunicationLink()
		 * @generated
		 */
		EClass COMMUNICATION_LINK = eINSTANCE.getCommunicationLink();

		/**
		 * The meta object literal for the '<em><b>Hardware Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK__HARDWARE_PORT = eINSTANCE.getCommunicationLink_HardwarePort();

		/**
		 * The meta object literal for the '<em><b>Component Instance Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK__COMPONENT_INSTANCE_PORT = eINSTANCE.getCommunicationLink_ComponentInstancePort();

	}

} //DeploymentPackage
