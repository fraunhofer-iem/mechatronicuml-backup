/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.pim.instance.AssemblyConnectorInstance;
import org.muml.pim.instance.AtomicComponentInstance;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pim.instance.ContinuousPortInstance;
import org.muml.pim.instance.CoordinationProtocolInstance;
import org.muml.pim.instance.DelegationConnectorInstance;
import org.muml.pim.instance.DiscreteMultiPortInstance;
import org.muml.pim.instance.DiscreteSinglePortInstance;
import org.muml.pim.instance.HybridPortInstance;
import org.muml.pim.instance.InstanceFactory;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.instance.StructuredComponentInstance;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceFactoryImpl extends EFactoryImpl implements InstanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InstanceFactory init() {
		try {
			InstanceFactory theInstanceFactory = (InstanceFactory)EPackage.Registry.INSTANCE.getEFactory(InstancePackage.eNS_URI);
			if (theInstanceFactory != null) {
				return theInstanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InstanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceFactoryImpl() {
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
			case InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE: return createAssemblyConnectorInstance();
			case InstancePackage.DELEGATION_CONNECTOR_INSTANCE: return createDelegationConnectorInstance();
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION: return createComponentInstanceConfiguration();
			case InstancePackage.CONTINUOUS_PORT_INSTANCE: return createContinuousPortInstance();
			case InstancePackage.HYBRID_PORT_INSTANCE: return createHybridPortInstance();
			case InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE: return createDiscreteSinglePortInstance();
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE: return createDiscreteMultiPortInstance();
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE: return createCoordinationProtocolInstance();
			case InstancePackage.STRUCTURED_COMPONENT_INSTANCE: return createStructuredComponentInstance();
			case InstancePackage.ATOMIC_COMPONENT_INSTANCE: return createAtomicComponentInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnectorInstance createAssemblyConnectorInstance() {
		AssemblyConnectorInstanceImpl assemblyConnectorInstance = new AssemblyConnectorInstanceImpl();
		return assemblyConnectorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationConnectorInstance createDelegationConnectorInstance() {
		DelegationConnectorInstanceImpl delegationConnectorInstance = new DelegationConnectorInstanceImpl();
		return delegationConnectorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceConfiguration createComponentInstanceConfiguration() {
		ComponentInstanceConfigurationImpl componentInstanceConfiguration = new ComponentInstanceConfigurationImpl();
		return componentInstanceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousPortInstance createContinuousPortInstance() {
		ContinuousPortInstanceImpl continuousPortInstance = new ContinuousPortInstanceImpl();
		return continuousPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridPortInstance createHybridPortInstance() {
		HybridPortInstanceImpl hybridPortInstance = new HybridPortInstanceImpl();
		return hybridPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteSinglePortInstance createDiscreteSinglePortInstance() {
		DiscreteSinglePortInstanceImpl discreteSinglePortInstance = new DiscreteSinglePortInstanceImpl();
		return discreteSinglePortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteMultiPortInstance createDiscreteMultiPortInstance() {
		DiscreteMultiPortInstanceImpl discreteMultiPortInstance = new DiscreteMultiPortInstanceImpl();
		return discreteMultiPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationProtocolInstance createCoordinationProtocolInstance() {
		CoordinationProtocolInstanceImpl coordinationProtocolInstance = new CoordinationProtocolInstanceImpl();
		return coordinationProtocolInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredComponentInstance createStructuredComponentInstance() {
		StructuredComponentInstanceImpl structuredComponentInstance = new StructuredComponentInstanceImpl();
		return structuredComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicComponentInstance createAtomicComponentInstance() {
		AtomicComponentInstanceImpl atomicComponentInstance = new AtomicComponentInstanceImpl();
		return atomicComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancePackage getInstancePackage() {
		return (InstancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InstancePackage getPackage() {
		return InstancePackage.eINSTANCE;
	}

} //InstanceFactoryImpl
