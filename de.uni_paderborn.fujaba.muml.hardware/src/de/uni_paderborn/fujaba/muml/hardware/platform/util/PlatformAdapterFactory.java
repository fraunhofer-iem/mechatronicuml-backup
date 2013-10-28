/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.util;

import de.uni_paderborn.fujaba.muml.hardware.platform.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.hardware.platform.ActuatorInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.AtomicResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.Bridge;
import de.uni_paderborn.fujaba.muml.hardware.platform.Bus;
import de.uni_paderborn.fujaba.muml.hardware.platform.BusPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.CacheInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia;
import de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationResource;
import de.uni_paderborn.fujaba.muml.hardware.platform.ComputingResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.Delegation;
import de.uni_paderborn.fujaba.muml.hardware.platform.DeviceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformConfiguration;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.Link;
import de.uni_paderborn.fujaba.muml.hardware.platform.LinkPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.MemoryResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.ProcessingMemoryInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.ProcessorInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.ProgrammableLogicDeviceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstancePart;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstanceRepository;
import de.uni_paderborn.fujaba.muml.hardware.platform.SensorInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.StorageMemoryInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage
 * @generated
 */
public class PlatformAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PlatformPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PlatformPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformSwitch<Adapter> modelSwitch =
		new PlatformSwitch<Adapter>() {
			@Override
			public Adapter caseHWPlatformConfiguration(HWPlatformConfiguration object) {
				return createHWPlatformConfigurationAdapter();
			}
			@Override
			public Adapter caseResourceInstance(ResourceInstance object) {
				return createResourceInstanceAdapter();
			}
			@Override
			public Adapter caseComputingResourceInstance(ComputingResourceInstance object) {
				return createComputingResourceInstanceAdapter();
			}
			@Override
			public Adapter caseMemoryResourceInstance(MemoryResourceInstance object) {
				return createMemoryResourceInstanceAdapter();
			}
			@Override
			public Adapter caseDeviceInstance(DeviceInstance object) {
				return createDeviceInstanceAdapter();
			}
			@Override
			public Adapter caseStorageMemoryInstance(StorageMemoryInstance object) {
				return createStorageMemoryInstanceAdapter();
			}
			@Override
			public Adapter caseProcessingMemoryInstance(ProcessingMemoryInstance object) {
				return createProcessingMemoryInstanceAdapter();
			}
			@Override
			public Adapter caseCacheInstance(CacheInstance object) {
				return createCacheInstanceAdapter();
			}
			@Override
			public Adapter caseProgrammableLogicDeviceInstance(ProgrammableLogicDeviceInstance object) {
				return createProgrammableLogicDeviceInstanceAdapter();
			}
			@Override
			public Adapter caseProcessorInstance(ProcessorInstance object) {
				return createProcessorInstanceAdapter();
			}
			@Override
			public Adapter caseAtomicResourceInstance(AtomicResourceInstance object) {
				return createAtomicResourceInstanceAdapter();
			}
			@Override
			public Adapter caseStructuredResourceInstance(StructuredResourceInstance object) {
				return createStructuredResourceInstanceAdapter();
			}
			@Override
			public Adapter caseCommunicationResource(CommunicationResource object) {
				return createCommunicationResourceAdapter();
			}
			@Override
			public Adapter caseBus(Bus object) {
				return createBusAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseCommunicationMedia(CommunicationMedia object) {
				return createCommunicationMediaAdapter();
			}
			@Override
			public Adapter caseHWPlatform(HWPlatform object) {
				return createHWPlatformAdapter();
			}
			@Override
			public Adapter casePlatformPart(PlatformPart object) {
				return createPlatformPartAdapter();
			}
			@Override
			public Adapter caseHWPlatformPart(HWPlatformPart object) {
				return createHWPlatformPartAdapter();
			}
			@Override
			public Adapter caseSensorInstance(SensorInstance object) {
				return createSensorInstanceAdapter();
			}
			@Override
			public Adapter caseActuatorInstance(ActuatorInstance object) {
				return createActuatorInstanceAdapter();
			}
			@Override
			public Adapter caseBridge(Bridge object) {
				return createBridgeAdapter();
			}
			@Override
			public Adapter caseHWPortInstance(HWPortInstance object) {
				return createHWPortInstanceAdapter();
			}
			@Override
			public Adapter caseBusPortInstance(BusPortInstance object) {
				return createBusPortInstanceAdapter();
			}
			@Override
			public Adapter caseLinkPortInstance(LinkPortInstance object) {
				return createLinkPortInstanceAdapter();
			}
			@Override
			public Adapter caseResourceInstanceRepository(ResourceInstanceRepository object) {
				return createResourceInstanceRepositoryAdapter();
			}
			@Override
			public Adapter caseResourceInstancePart(ResourceInstancePart object) {
				return createResourceInstancePartAdapter();
			}
			@Override
			public Adapter caseDelegation(Delegation object) {
				return createDelegationAdapter();
			}
			@Override
			public Adapter caseHWPortPart(HWPortPart object) {
				return createHWPortPartAdapter();
			}
			@Override
			public Adapter caseExtendableElement(ExtendableElement object) {
				return createExtendableElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseCommentableElement(CommentableElement object) {
				return createCommentableElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformConfiguration <em>HW Platform Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformConfiguration
	 * @generated
	 */
	public Adapter createHWPlatformConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance <em>Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance
	 * @generated
	 */
	public Adapter createResourceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ComputingResourceInstance <em>Computing Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ComputingResourceInstance
	 * @generated
	 */
	public Adapter createComputingResourceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.MemoryResourceInstance <em>Memory Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.MemoryResourceInstance
	 * @generated
	 */
	public Adapter createMemoryResourceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.DeviceInstance <em>Device Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.DeviceInstance
	 * @generated
	 */
	public Adapter createDeviceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.StorageMemoryInstance <em>Storage Memory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.StorageMemoryInstance
	 * @generated
	 */
	public Adapter createStorageMemoryInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ProcessingMemoryInstance <em>Processing Memory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ProcessingMemoryInstance
	 * @generated
	 */
	public Adapter createProcessingMemoryInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.CacheInstance <em>Cache Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.CacheInstance
	 * @generated
	 */
	public Adapter createCacheInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ProgrammableLogicDeviceInstance <em>Programmable Logic Device Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ProgrammableLogicDeviceInstance
	 * @generated
	 */
	public Adapter createProgrammableLogicDeviceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ProcessorInstance <em>Processor Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ProcessorInstance
	 * @generated
	 */
	public Adapter createProcessorInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.AtomicResourceInstance <em>Atomic Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.AtomicResourceInstance
	 * @generated
	 */
	public Adapter createAtomicResourceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance <em>Structured Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance
	 * @generated
	 */
	public Adapter createStructuredResourceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationResource <em>Communication Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationResource
	 * @generated
	 */
	public Adapter createCommunicationResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.Bus
	 * @generated
	 */
	public Adapter createBusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia <em>Communication Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia
	 * @generated
	 */
	public Adapter createCommunicationMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform <em>HW Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform
	 * @generated
	 */
	public Adapter createHWPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart
	 * @generated
	 */
	public Adapter createPlatformPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart <em>HW Platform Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart
	 * @generated
	 */
	public Adapter createHWPlatformPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.SensorInstance <em>Sensor Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.SensorInstance
	 * @generated
	 */
	public Adapter createSensorInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ActuatorInstance <em>Actuator Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ActuatorInstance
	 * @generated
	 */
	public Adapter createActuatorInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.Bridge <em>Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.Bridge
	 * @generated
	 */
	public Adapter createBridgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance <em>HW Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance
	 * @generated
	 */
	public Adapter createHWPortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.BusPortInstance <em>Bus Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.BusPortInstance
	 * @generated
	 */
	public Adapter createBusPortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.LinkPortInstance <em>Link Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.LinkPortInstance
	 * @generated
	 */
	public Adapter createLinkPortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstanceRepository <em>Resource Instance Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstanceRepository
	 * @generated
	 */
	public Adapter createResourceInstanceRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstancePart <em>Resource Instance Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstancePart
	 * @generated
	 */
	public Adapter createResourceInstancePartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.Delegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.Delegation
	 * @generated
	 */
	public Adapter createDelegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart <em>HW Port Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart
	 * @generated
	 */
	public Adapter createHWPortPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.ExtendableElement <em>Extendable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.ExtendableElement
	 * @generated
	 */
	public Adapter createExtendableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.CommentableElement <em>Commentable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.CommentableElement
	 * @generated
	 */
	public Adapter createCommentableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PlatformAdapterFactory
