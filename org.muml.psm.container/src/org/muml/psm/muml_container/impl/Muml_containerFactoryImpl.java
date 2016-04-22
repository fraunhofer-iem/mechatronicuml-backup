/**
 */
package org.muml.psm.muml_container.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.muml.psm.muml_container.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Muml_containerFactoryImpl extends EFactoryImpl implements Muml_containerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Muml_containerFactory init() {
		try {
			Muml_containerFactory theMuml_containerFactory = (Muml_containerFactory)EPackage.Registry.INSTANCE.getEFactory(Muml_containerPackage.eNS_URI);
			if (theMuml_containerFactory != null) {
				return theMuml_containerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Muml_containerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Muml_containerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Muml_containerPackage.COMPONENT_CONTAINER: return createComponentContainer();
			case Muml_containerPackage.CONTAINER_COMPONENT_INSTANCE_CONFIGURATION: return createContainerComponentInstanceConfiguration();
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_LOCAL: return createPortInstanceConfiguration_Local();
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS: return createPortInstanceConfiguration_DDS();
			case Muml_containerPackage.ECU_CONFIGURATION: return createECUConfiguration();
			case Muml_containerPackage.MULTI_PORT_INSTANCE_CONFIGURATION: return createMultiPortInstanceConfiguration();
			case Muml_containerPackage.DEPLOYMENT_CONFIGURATION: return createDeploymentConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentContainer createComponentContainer() {
		ComponentContainerImpl componentContainer = new ComponentContainerImpl();
		return componentContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerComponentInstanceConfiguration createContainerComponentInstanceConfiguration() {
		ContainerComponentInstanceConfigurationImpl containerComponentInstanceConfiguration = new ContainerComponentInstanceConfigurationImpl();
		return containerComponentInstanceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceConfiguration_Local createPortInstanceConfiguration_Local() {
		PortInstanceConfiguration_LocalImpl portInstanceConfiguration_Local = new PortInstanceConfiguration_LocalImpl();
		return portInstanceConfiguration_Local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceConfiguration_DDS createPortInstanceConfiguration_DDS() {
		PortInstanceConfiguration_DDSImpl portInstanceConfiguration_DDS = new PortInstanceConfiguration_DDSImpl();
		return portInstanceConfiguration_DDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECUConfiguration createECUConfiguration() {
		ECUConfigurationImpl ecuConfiguration = new ECUConfigurationImpl();
		return ecuConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPortInstanceConfiguration createMultiPortInstanceConfiguration() {
		MultiPortInstanceConfigurationImpl multiPortInstanceConfiguration = new MultiPortInstanceConfigurationImpl();
		return multiPortInstanceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentConfiguration createDeploymentConfiguration() {
		DeploymentConfigurationImpl deploymentConfiguration = new DeploymentConfigurationImpl();
		return deploymentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Muml_containerPackage getMuml_containerPackage() {
		return (Muml_containerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Muml_containerPackage getPackage() {
		return Muml_containerPackage.eINSTANCE;
	}

} //Muml_containerFactoryImpl
