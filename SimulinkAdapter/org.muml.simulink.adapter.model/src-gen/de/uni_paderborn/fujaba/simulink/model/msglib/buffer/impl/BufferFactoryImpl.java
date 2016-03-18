/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.simulink.model.msglib.buffer.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.simulink.model.msglib.buffer.BufferFactory;
import de.uni_paderborn.fujaba.simulink.model.msglib.buffer.BufferFunction;
import de.uni_paderborn.fujaba.simulink.model.msglib.buffer.BufferPackage;
import de.uni_paderborn.fujaba.simulink.model.msglib.buffer.CheckQueue;
import de.uni_paderborn.fujaba.simulink.model.msglib.buffer.Dequeue;
import de.uni_paderborn.fujaba.simulink.model.msglib.buffer.Enqueue;
import de.uni_paderborn.fujaba.simulink.model.msglib.buffer.SharedCheckQueue;
import de.uni_paderborn.fujaba.simulink.model.msglib.buffer.SharedDequeue;
import de.uni_paderborn.fujaba.simulink.model.msglib.buffer.SharedEnqueue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BufferFactoryImpl extends EFactoryImpl implements BufferFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BufferFactory init() {
		try {
			BufferFactory theBufferFactory = (BufferFactory)EPackage.Registry.INSTANCE.getEFactory(BufferPackage.eNS_URI);
			if (theBufferFactory != null) {
				return theBufferFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BufferFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferFactoryImpl() {
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
			case BufferPackage.ENQUEUE: return (EObject)createEnqueue();
			case BufferPackage.DEQUEUE: return (EObject)createDequeue();
			case BufferPackage.CHECK_QUEUE: return (EObject)createCheckQueue();
			case BufferPackage.SHARED_ENQUEUE: return (EObject)createSharedEnqueue();
			case BufferPackage.SHARED_DEQUEUE: return (EObject)createSharedDequeue();
			case BufferPackage.SHARED_CHECK_QUEUE: return (EObject)createSharedCheckQueue();
			case BufferPackage.BUFFER_FUNCTION: return (EObject)createBufferFunction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enqueue createEnqueue() {
		EnqueueImpl enqueue = new EnqueueImpl();
		return enqueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dequeue createDequeue() {
		DequeueImpl dequeue = new DequeueImpl();
		return dequeue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckQueue createCheckQueue() {
		CheckQueueImpl checkQueue = new CheckQueueImpl();
		return checkQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedEnqueue createSharedEnqueue() {
		SharedEnqueueImpl sharedEnqueue = new SharedEnqueueImpl();
		return sharedEnqueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedDequeue createSharedDequeue() {
		SharedDequeueImpl sharedDequeue = new SharedDequeueImpl();
		return sharedDequeue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedCheckQueue createSharedCheckQueue() {
		SharedCheckQueueImpl sharedCheckQueue = new SharedCheckQueueImpl();
		return sharedCheckQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferFunction createBufferFunction() {
		BufferFunctionImpl bufferFunction = new BufferFunctionImpl();
		return bufferFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferPackage getBufferPackage() {
		return (BufferPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BufferPackage getPackage() {
		return BufferPackage.eINSTANCE;
	}

} //BufferFactoryImpl
