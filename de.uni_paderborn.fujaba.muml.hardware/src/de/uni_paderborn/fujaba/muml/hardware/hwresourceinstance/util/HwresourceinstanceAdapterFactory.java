/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.util;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.Resource;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage
 * @generated
 */
public class HwresourceinstanceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HwresourceinstancePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwresourceinstanceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HwresourceinstancePackage.eINSTANCE;
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
	protected HwresourceinstanceSwitch<Adapter> modelSwitch =
		new HwresourceinstanceSwitch<Adapter>() {
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
			public Adapter caseSensorInstance(SensorInstance object) {
				return createSensorInstanceAdapter();
			}
			@Override
			public Adapter caseActuatorInstance(ActuatorInstance object) {
				return createActuatorInstanceAdapter();
			}
			@Override
			public Adapter caseResourceInstanceRepository(ResourceInstanceRepository object) {
				return createResourceInstanceRepositoryAdapter();
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
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance <em>Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance
	 * @generated
	 */
	public Adapter createResourceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ComputingResourceInstance <em>Computing Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ComputingResourceInstance
	 * @generated
	 */
	public Adapter createComputingResourceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.MemoryResourceInstance <em>Memory Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.MemoryResourceInstance
	 * @generated
	 */
	public Adapter createMemoryResourceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.DeviceInstance <em>Device Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.DeviceInstance
	 * @generated
	 */
	public Adapter createDeviceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StorageMemoryInstance <em>Storage Memory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StorageMemoryInstance
	 * @generated
	 */
	public Adapter createStorageMemoryInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessingMemoryInstance <em>Processing Memory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessingMemoryInstance
	 * @generated
	 */
	public Adapter createProcessingMemoryInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.CacheInstance <em>Cache Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.CacheInstance
	 * @generated
	 */
	public Adapter createCacheInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProgrammableLogicDeviceInstance <em>Programmable Logic Device Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProgrammableLogicDeviceInstance
	 * @generated
	 */
	public Adapter createProgrammableLogicDeviceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessorInstance <em>Processor Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessorInstance
	 * @generated
	 */
	public Adapter createProcessorInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.AtomicResourceInstance <em>Atomic Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.AtomicResourceInstance
	 * @generated
	 */
	public Adapter createAtomicResourceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance <em>Structured Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance
	 * @generated
	 */
	public Adapter createStructuredResourceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.SensorInstance <em>Sensor Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.SensorInstance
	 * @generated
	 */
	public Adapter createSensorInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ActuatorInstance <em>Actuator Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ActuatorInstance
	 * @generated
	 */
	public Adapter createActuatorInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstanceRepository <em>Resource Instance Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstanceRepository
	 * @generated
	 */
	public Adapter createResourceInstanceRepositoryAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
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

} //HwresourceinstanceAdapterFactory
