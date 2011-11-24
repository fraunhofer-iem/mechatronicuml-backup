/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.impl;

import de.uni_paderborn.fujaba.muml.model.instance.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance;
import de.uni_paderborn.fujaba.muml.model.instance.AttributeBinding;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.FujabaRealtimeStatechartInstance;
import de.uni_paderborn.fujaba.muml.model.instance.HardwarePortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstanceFactory;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;

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
			InstanceFactory theInstanceFactory = (InstanceFactory)EPackage.Registry.INSTANCE.getEFactory("http:///de/uni_paderborn/fujaba/muml/model/instance"); 
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
			case InstancePackage.COMPONENT_INSTANCE: return createComponentInstance();
			case InstancePackage.CONNECTOR_INSTANCE: return createConnectorInstance();
			case InstancePackage.ASSEMBLY_INSTANCE: return createAssemblyInstance();
			case InstancePackage.DELEGATION_INSTANCE: return createDelegationInstance();
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION: return createComponentInstanceConfiguration();
			case InstancePackage.CONTINUOUS_PORT_INSTANCE: return createContinuousPortInstance();
			case InstancePackage.HYBRID_PORT_INSTANCE: return createHybridPortInstance();
			case InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE: return createDiscreteSinglePortInstance();
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE: return createDiscreteMultiPortInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance createComponentInstance() {
		ComponentInstanceImpl componentInstance = new ComponentInstanceImpl();
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorInstance createConnectorInstance() {
		ConnectorInstanceImpl connectorInstance = new ConnectorInstanceImpl();
		return connectorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyInstance createAssemblyInstance() {
		AssemblyInstanceImpl assemblyInstance = new AssemblyInstanceImpl();
		return assemblyInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationInstance createDelegationInstance() {
		DelegationInstanceImpl delegationInstance = new DelegationInstanceImpl();
		return delegationInstance;
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
