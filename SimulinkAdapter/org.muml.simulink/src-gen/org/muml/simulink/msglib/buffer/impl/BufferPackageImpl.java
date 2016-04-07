/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.msglib.buffer.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.simulink.SimulinkPackage;
import org.muml.simulink.impl.SimulinkPackageImpl;
import org.muml.simulink.msglib.MsglibPackage;
import org.muml.simulink.msglib.buffer.BufferFactory;
import org.muml.simulink.msglib.buffer.BufferFunction;
import org.muml.simulink.msglib.buffer.BufferPackage;
import org.muml.simulink.msglib.buffer.CheckQueue;
import org.muml.simulink.msglib.buffer.Dequeue;
import org.muml.simulink.msglib.buffer.Enqueue;
import org.muml.simulink.msglib.buffer.SharedCheckQueue;
import org.muml.simulink.msglib.buffer.SharedDequeue;
import org.muml.simulink.msglib.buffer.SharedEnqueue;
import org.muml.simulink.msglib.impl.MsglibPackageImpl;
import org.muml.simulink.reconfiguration.ReconfigurationPackage;
import org.muml.simulink.reconfiguration.impl.ReconfigurationPackageImpl;
import org.muml.simulink.stateflow.StateflowPackage;
import org.muml.simulink.stateflow.impl.StateflowPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BufferPackageImpl extends EPackageImpl implements BufferPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enqueueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dequeueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkQueueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedEnqueueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedDequeueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedCheckQueueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferFunctionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.muml.simulink.msglib.buffer.BufferPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BufferPackageImpl() {
		super(eNS_URI, BufferFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BufferPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BufferPackage init() {
		if (isInited) return (BufferPackage)EPackage.Registry.INSTANCE.getEPackage(BufferPackage.eNS_URI);

		// Obtain or create and register package
		BufferPackageImpl theBufferPackage = (BufferPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BufferPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BufferPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SimulinkPackageImpl theSimulinkPackage = (SimulinkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SimulinkPackage.eNS_URI) instanceof SimulinkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SimulinkPackage.eNS_URI) : SimulinkPackage.eINSTANCE);
		StateflowPackageImpl theStateflowPackage = (StateflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StateflowPackage.eNS_URI) instanceof StateflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StateflowPackage.eNS_URI) : StateflowPackage.eINSTANCE);
		MsglibPackageImpl theMsglibPackage = (MsglibPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsglibPackage.eNS_URI) instanceof MsglibPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsglibPackage.eNS_URI) : MsglibPackage.eINSTANCE);
		ReconfigurationPackageImpl theReconfigurationPackage = (ReconfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReconfigurationPackage.eNS_URI) instanceof ReconfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReconfigurationPackage.eNS_URI) : ReconfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theBufferPackage.createPackageContents();
		theSimulinkPackage.createPackageContents();
		theStateflowPackage.createPackageContents();
		theMsglibPackage.createPackageContents();
		theReconfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theBufferPackage.initializePackageContents();
		theSimulinkPackage.initializePackageContents();
		theStateflowPackage.initializePackageContents();
		theMsglibPackage.initializePackageContents();
		theReconfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBufferPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BufferPackage.eNS_URI, theBufferPackage);
		return theBufferPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnqueue() {
		return enqueueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDequeue() {
		return dequeueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckQueue() {
		return checkQueueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedEnqueue() {
		return sharedEnqueueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedDequeue() {
		return sharedDequeueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedCheckQueue() {
		return sharedCheckQueueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBufferFunction() {
		return bufferFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBufferFunction_BufferSize() {
		return (EAttribute)bufferFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferFactory getBufferFactory() {
		return (BufferFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		enqueueEClass = createEClass(ENQUEUE);

		dequeueEClass = createEClass(DEQUEUE);

		checkQueueEClass = createEClass(CHECK_QUEUE);

		sharedEnqueueEClass = createEClass(SHARED_ENQUEUE);

		sharedDequeueEClass = createEClass(SHARED_DEQUEUE);

		sharedCheckQueueEClass = createEClass(SHARED_CHECK_QUEUE);

		bufferFunctionEClass = createEClass(BUFFER_FUNCTION);
		createEAttribute(bufferFunctionEClass, BUFFER_FUNCTION__BUFFER_SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		StateflowPackage theStateflowPackage = (StateflowPackage)EPackage.Registry.INSTANCE.getEPackage(StateflowPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		enqueueEClass.getESuperTypes().add(this.getBufferFunction());
		dequeueEClass.getESuperTypes().add(this.getBufferFunction());
		checkQueueEClass.getESuperTypes().add(this.getBufferFunction());
		sharedEnqueueEClass.getESuperTypes().add(this.getBufferFunction());
		sharedDequeueEClass.getESuperTypes().add(this.getBufferFunction());
		sharedCheckQueueEClass.getESuperTypes().add(this.getBufferFunction());
		bufferFunctionEClass.getESuperTypes().add(theStateflowPackage.getEmbeddedFunction());

		// Initialize classes, features, and operations; add parameters
		initEClass(enqueueEClass, Enqueue.class, "Enqueue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dequeueEClass, Dequeue.class, "Dequeue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(checkQueueEClass, CheckQueue.class, "CheckQueue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sharedEnqueueEClass, SharedEnqueue.class, "SharedEnqueue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sharedDequeueEClass, SharedDequeue.class, "SharedDequeue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sharedCheckQueueEClass, SharedCheckQueue.class, "SharedCheckQueue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bufferFunctionEClass, BufferFunction.class, "BufferFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBufferFunction_BufferSize(), ecorePackage.getEInt(), "bufferSize", "10", 1, 1, BufferFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //BufferPackageImpl
