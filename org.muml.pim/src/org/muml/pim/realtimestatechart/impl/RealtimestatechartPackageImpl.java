/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.core.expressions.ExpressionsPackage;
import org.muml.core.expressions.common.CommonExpressionsPackage;
import org.muml.pim.PimPackage;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.behavior.impl.BehaviorPackageImpl;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.impl.ComponentPackageImpl;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.connector.impl.ConnectorPackageImpl;
import org.muml.pim.constraint.ConstraintPackage;
import org.muml.pim.constraint.impl.ConstraintPackageImpl;
import org.muml.pim.impl.PimPackageImpl;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.instance.impl.InstancePackageImpl;
import org.muml.pim.msgtype.MsgtypePackage;
import org.muml.pim.msgtype.impl.MsgtypePackageImpl;
import org.muml.pim.pattern.PatternPackage;
import org.muml.pim.pattern.impl.PatternPackageImpl;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.protocol.impl.ProtocolPackageImpl;
import org.muml.pim.realtimestatechart.AbsoluteDeadline;
import org.muml.pim.realtimestatechart.Action;
import org.muml.pim.realtimestatechart.AsynchronousMessageEvent;
import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.ClockConstraint;
import org.muml.pim.realtimestatechart.Deadline;
import org.muml.pim.realtimestatechart.DoEvent;
import org.muml.pim.realtimestatechart.EntryEvent;
import org.muml.pim.realtimestatechart.EntryOrExitEvent;
import org.muml.pim.realtimestatechart.EntryPoint;
import org.muml.pim.realtimestatechart.Event;
import org.muml.pim.realtimestatechart.EventKind;
import org.muml.pim.realtimestatechart.ExitEvent;
import org.muml.pim.realtimestatechart.ExitPoint;
import org.muml.pim.realtimestatechart.Message;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartFactory;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.RelativeDeadline;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.StateConnectionPoint;
import org.muml.pim.realtimestatechart.StateEvent;
import org.muml.pim.realtimestatechart.Synchronization;
import org.muml.pim.realtimestatechart.SynchronizationChannel;
import org.muml.pim.realtimestatechart.SynchronizationKind;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.pim.realtimestatechart.TransitionEvent;
import org.muml.pim.realtimestatechart.Vertex;
import org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage;
import org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl;
import org.muml.pim.realtimestatechart.util.RealtimestatechartValidator;
import org.muml.pim.runnable.RunnablePackage;
import org.muml.pim.runnable.impl.RunnablePackageImpl;
import org.muml.pim.types.TypesPackage;
import org.muml.pim.types.impl.TypesPackageImpl;
import org.muml.pim.valuetype.ValuetypePackage;
import org.muml.pim.valuetype.impl.ValuetypePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RealtimestatechartPackageImpl extends EPackageImpl implements RealtimestatechartPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deadlineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absoluteDeadlineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeDeadlineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asynchronousMessageEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryOrExitEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realtimeStatechartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exitEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateConnectionPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exitPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum synchronizationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventKindEEnum = null;

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
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RealtimestatechartPackageImpl() {
		super(eNS_URI, RealtimestatechartFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RealtimestatechartPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RealtimestatechartPackage init() {
		if (isInited) return (RealtimestatechartPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI);

		// Obtain or create and register package
		RealtimestatechartPackageImpl theRealtimestatechartPackage = (RealtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RealtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RealtimestatechartPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PimPackageImpl thePimPackage = (PimPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PimPackage.eNS_URI) instanceof PimPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PimPackage.eNS_URI) : PimPackage.eINSTANCE);
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		ProtocolPackageImpl theProtocolPackage = (ProtocolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) instanceof ProtocolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) : ProtocolPackage.eINSTANCE);
		One_to_n_schemataPackageImpl theOne_to_n_schemataPackage = (One_to_n_schemataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(One_to_n_schemataPackage.eNS_URI) instanceof One_to_n_schemataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(One_to_n_schemataPackage.eNS_URI) : One_to_n_schemataPackage.eINSTANCE);
		MsgtypePackageImpl theMsgtypePackage = (MsgtypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) instanceof MsgtypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) : MsgtypePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ConnectorPackageImpl theConnectorPackage = (ConnectorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI) instanceof ConnectorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI) : ConnectorPackage.eINSTANCE);
		ValuetypePackageImpl theValuetypePackage = (ValuetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI) instanceof ValuetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI) : ValuetypePackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
		PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
		RunnablePackageImpl theRunnablePackage = (RunnablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RunnablePackage.eNS_URI) instanceof RunnablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RunnablePackage.eNS_URI) : RunnablePackage.eINSTANCE);

		// Create package meta-data objects
		theRealtimestatechartPackage.createPackageContents();
		thePimPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theInstancePackage.createPackageContents();
		theProtocolPackage.createPackageContents();
		theOne_to_n_schemataPackage.createPackageContents();
		theMsgtypePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theConnectorPackage.createPackageContents();
		theValuetypePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		thePatternPackage.createPackageContents();
		theRunnablePackage.createPackageContents();

		// Initialize created meta-data
		theRealtimestatechartPackage.initializePackageContents();
		thePimPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		theProtocolPackage.initializePackageContents();
		theOne_to_n_schemataPackage.initializePackageContents();
		theMsgtypePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theConnectorPackage.initializePackageContents();
		theValuetypePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		thePatternPackage.initializePackageContents();
		theRunnablePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRealtimestatechartPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RealtimestatechartValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRealtimestatechartPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RealtimestatechartPackage.eNS_URI, theRealtimestatechartPackage);
		return theRealtimestatechartPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeadline() {
		return deadlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeadline_UpperBound() {
		return (EReference)deadlineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeadline_LowerBound() {
		return (EReference)deadlineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsoluteDeadline() {
		return absoluteDeadlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbsoluteDeadline_Clock() {
		return (EReference)absoluteDeadlineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeDeadline() {
		return relativeDeadlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClock() {
		return clockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClock_Statechart() {
		return (EReference)clockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_EmbeddedStatecharts() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_DoEvent() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ExitEvent() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_EntryEvent() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Invariants() {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Initial() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Final() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Urgent() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Channels() {
		return (EReference)stateEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Events() {
		return (EReference)stateEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ConnectionPoints() {
		return (EReference)stateEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Simple() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ParentStatechart() {
		return (EReference)stateEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_AllAvailableChannels() {
		return (EReference)stateEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__GetUniqueRegionPriority__int() {
		return stateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__HasRegionOfPriority__int() {
		return stateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertex() {
		return vertexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertex_OutgoingTransitions() {
		return (EReference)vertexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertex_IncomingTransitions() {
		return (EReference)vertexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertex_AllSuperVertices() {
		return (EReference)vertexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVertex__IsSuperVertexOf__Vertex() {
		return vertexEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVertex__GetUniqueTransitionPriority__int() {
		return vertexEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVertex__HasOutgoingTransitionOfPriority__int() {
		return vertexEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVertex__GetTransitionPriority__Transition() {
		return vertexEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Synchronization() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Statechart() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_ClockResets() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_TriggerMessageEvent() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_RaiseMessageEvent() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_ClockConstraints() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_AbsoluteDeadlines() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_RelativeDeadline() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Blockable() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Guard() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Events() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Action() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Urgent() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_ReceiverMessageTypes() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_SenderMessageTypes() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__GetPriority() {
		return transitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockConstraint() {
		return clockConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClockConstraint_Bound() {
		return (EReference)clockConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClockConstraint_Clock() {
		return (EReference)clockConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClockConstraint_Operator() {
		return (EAttribute)clockConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Expressions() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsynchronousMessageEvent() {
		return asynchronousMessageEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsynchronousMessageEvent_Message() {
		return (EReference)asynchronousMessageEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsynchronousMessageEvent_OneToManyCommunicationSchema() {
		return (EReference)asynchronousMessageEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoEvent() {
		return doEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoEvent_Action() {
		return (EReference)doEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoEvent_Period() {
		return (EReference)doEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryOrExitEvent() {
		return entryOrExitEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryOrExitEvent_ClockResets() {
		return (EReference)entryOrExitEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryOrExitEvent_Action() {
		return (EReference)entryOrExitEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronizationChannel() {
		return synchronizationChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronizationChannel_State() {
		return (EReference)synchronizationChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronizationChannel_SelectorType() {
		return (EReference)synchronizationChannelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronization() {
		return synchronizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronization_SyncChannel() {
		return (EReference)synchronizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronization_Kind() {
		return (EAttribute)synchronizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronization_SelectorExpression() {
		return (EReference)synchronizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealtimeStatechart() {
		return realtimeStatechartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechart_ParentState() {
		return (EReference)realtimeStatechartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechart_Transitions() {
		return (EReference)realtimeStatechartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechart_States() {
		return (EReference)realtimeStatechartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechart_Clocks() {
		return (EReference)realtimeStatechartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealtimeStatechart_Flat() {
		return (EAttribute)realtimeStatechartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechart_AvailableClocks() {
		return (EReference)realtimeStatechartEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealtimeStatechart_Embedded() {
		return (EAttribute)realtimeStatechartEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechart_AllAvailableVariables() {
		return (EReference)realtimeStatechartEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechart_AllAvailableOperations() {
		return (EReference)realtimeStatechartEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechart_UsedOperationRepositories() {
		return (EReference)realtimeStatechartEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealtimeStatechart_UsesOneToManyCommunicationSchemata() {
		return (EAttribute)realtimeStatechartEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechart_SubRoleSpecificVariables() {
		return (EReference)realtimeStatechartEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechart_SubRoleSpecificClocks() {
		return (EReference)realtimeStatechartEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechart_SubRoleSpecificOperations() {
		return (EReference)realtimeStatechartEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRealtimeStatechart__IsSuperStatechartOf__RealtimeStatechart() {
		return realtimeStatechartEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRealtimeStatechart__GetHighestParentStatechart() {
		return realtimeStatechartEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRealtimeStatechart__GetPortOrRoleStatechart() {
		return realtimeStatechartEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRealtimeStatechart__GetPriority() {
		return realtimeStatechartEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Kind() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionEvent() {
		return transitionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateEvent() {
		return stateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_InstanceOf() {
		return (EReference)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_ParameterBinding() {
		return (EReference)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryEvent() {
		return entryEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExitEvent() {
		return exitEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateConnectionPoint() {
		return stateConnectionPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateConnectionPoint_State() {
		return (EReference)stateConnectionPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryPoint() {
		return entryPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExitPoint() {
		return exitPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSynchronizationKind() {
		return synchronizationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventKind() {
		return eventKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimestatechartFactory getRealtimestatechartFactory() {
		return (RealtimestatechartFactory)getEFactoryInstance();
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
		deadlineEClass = createEClass(DEADLINE);
		createEReference(deadlineEClass, DEADLINE__UPPER_BOUND);
		createEReference(deadlineEClass, DEADLINE__LOWER_BOUND);

		absoluteDeadlineEClass = createEClass(ABSOLUTE_DEADLINE);
		createEReference(absoluteDeadlineEClass, ABSOLUTE_DEADLINE__CLOCK);

		relativeDeadlineEClass = createEClass(RELATIVE_DEADLINE);

		clockEClass = createEClass(CLOCK);
		createEReference(clockEClass, CLOCK__STATECHART);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__EMBEDDED_STATECHARTS);
		createEReference(stateEClass, STATE__DO_EVENT);
		createEReference(stateEClass, STATE__EXIT_EVENT);
		createEReference(stateEClass, STATE__ENTRY_EVENT);
		createEReference(stateEClass, STATE__INVARIANTS);
		createEAttribute(stateEClass, STATE__INITIAL);
		createEAttribute(stateEClass, STATE__FINAL);
		createEAttribute(stateEClass, STATE__URGENT);
		createEReference(stateEClass, STATE__CHANNELS);
		createEReference(stateEClass, STATE__EVENTS);
		createEReference(stateEClass, STATE__CONNECTION_POINTS);
		createEAttribute(stateEClass, STATE__SIMPLE);
		createEReference(stateEClass, STATE__PARENT_STATECHART);
		createEReference(stateEClass, STATE__ALL_AVAILABLE_CHANNELS);
		createEOperation(stateEClass, STATE___GET_UNIQUE_REGION_PRIORITY__INT);
		createEOperation(stateEClass, STATE___HAS_REGION_OF_PRIORITY__INT);

		vertexEClass = createEClass(VERTEX);
		createEReference(vertexEClass, VERTEX__OUTGOING_TRANSITIONS);
		createEReference(vertexEClass, VERTEX__INCOMING_TRANSITIONS);
		createEReference(vertexEClass, VERTEX__ALL_SUPER_VERTICES);
		createEOperation(vertexEClass, VERTEX___IS_SUPER_VERTEX_OF__VERTEX);
		createEOperation(vertexEClass, VERTEX___GET_UNIQUE_TRANSITION_PRIORITY__INT);
		createEOperation(vertexEClass, VERTEX___HAS_OUTGOING_TRANSITION_OF_PRIORITY__INT);
		createEOperation(vertexEClass, VERTEX___GET_TRANSITION_PRIORITY__TRANSITION);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__SYNCHRONIZATION);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__STATECHART);
		createEReference(transitionEClass, TRANSITION__CLOCK_RESETS);
		createEReference(transitionEClass, TRANSITION__TRIGGER_MESSAGE_EVENT);
		createEReference(transitionEClass, TRANSITION__RAISE_MESSAGE_EVENT);
		createEReference(transitionEClass, TRANSITION__CLOCK_CONSTRAINTS);
		createEReference(transitionEClass, TRANSITION__ABSOLUTE_DEADLINES);
		createEReference(transitionEClass, TRANSITION__RELATIVE_DEADLINE);
		createEAttribute(transitionEClass, TRANSITION__BLOCKABLE);
		createEReference(transitionEClass, TRANSITION__GUARD);
		createEReference(transitionEClass, TRANSITION__EVENTS);
		createEReference(transitionEClass, TRANSITION__ACTION);
		createEAttribute(transitionEClass, TRANSITION__URGENT);
		createEReference(transitionEClass, TRANSITION__RECEIVER_MESSAGE_TYPES);
		createEReference(transitionEClass, TRANSITION__SENDER_MESSAGE_TYPES);
		createEOperation(transitionEClass, TRANSITION___GET_PRIORITY);

		clockConstraintEClass = createEClass(CLOCK_CONSTRAINT);
		createEReference(clockConstraintEClass, CLOCK_CONSTRAINT__BOUND);
		createEReference(clockConstraintEClass, CLOCK_CONSTRAINT__CLOCK);
		createEAttribute(clockConstraintEClass, CLOCK_CONSTRAINT__OPERATOR);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__EXPRESSIONS);

		asynchronousMessageEventEClass = createEClass(ASYNCHRONOUS_MESSAGE_EVENT);
		createEReference(asynchronousMessageEventEClass, ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE);
		createEReference(asynchronousMessageEventEClass, ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA);

		doEventEClass = createEClass(DO_EVENT);
		createEReference(doEventEClass, DO_EVENT__ACTION);
		createEReference(doEventEClass, DO_EVENT__PERIOD);

		entryOrExitEventEClass = createEClass(ENTRY_OR_EXIT_EVENT);
		createEReference(entryOrExitEventEClass, ENTRY_OR_EXIT_EVENT__CLOCK_RESETS);
		createEReference(entryOrExitEventEClass, ENTRY_OR_EXIT_EVENT__ACTION);

		synchronizationChannelEClass = createEClass(SYNCHRONIZATION_CHANNEL);
		createEReference(synchronizationChannelEClass, SYNCHRONIZATION_CHANNEL__STATE);
		createEReference(synchronizationChannelEClass, SYNCHRONIZATION_CHANNEL__SELECTOR_TYPE);

		synchronizationEClass = createEClass(SYNCHRONIZATION);
		createEReference(synchronizationEClass, SYNCHRONIZATION__SYNC_CHANNEL);
		createEAttribute(synchronizationEClass, SYNCHRONIZATION__KIND);
		createEReference(synchronizationEClass, SYNCHRONIZATION__SELECTOR_EXPRESSION);

		realtimeStatechartEClass = createEClass(REALTIME_STATECHART);
		createEReference(realtimeStatechartEClass, REALTIME_STATECHART__PARENT_STATE);
		createEReference(realtimeStatechartEClass, REALTIME_STATECHART__TRANSITIONS);
		createEReference(realtimeStatechartEClass, REALTIME_STATECHART__STATES);
		createEReference(realtimeStatechartEClass, REALTIME_STATECHART__CLOCKS);
		createEAttribute(realtimeStatechartEClass, REALTIME_STATECHART__FLAT);
		createEReference(realtimeStatechartEClass, REALTIME_STATECHART__AVAILABLE_CLOCKS);
		createEAttribute(realtimeStatechartEClass, REALTIME_STATECHART__EMBEDDED);
		createEReference(realtimeStatechartEClass, REALTIME_STATECHART__ALL_AVAILABLE_VARIABLES);
		createEReference(realtimeStatechartEClass, REALTIME_STATECHART__ALL_AVAILABLE_OPERATIONS);
		createEReference(realtimeStatechartEClass, REALTIME_STATECHART__USED_OPERATION_REPOSITORIES);
		createEAttribute(realtimeStatechartEClass, REALTIME_STATECHART__USES_ONE_TO_MANY_COMMUNICATION_SCHEMATA);
		createEReference(realtimeStatechartEClass, REALTIME_STATECHART__SUB_ROLE_SPECIFIC_VARIABLES);
		createEReference(realtimeStatechartEClass, REALTIME_STATECHART__SUB_ROLE_SPECIFIC_CLOCKS);
		createEReference(realtimeStatechartEClass, REALTIME_STATECHART__SUB_ROLE_SPECIFIC_OPERATIONS);
		createEOperation(realtimeStatechartEClass, REALTIME_STATECHART___IS_SUPER_STATECHART_OF__REALTIMESTATECHART);
		createEOperation(realtimeStatechartEClass, REALTIME_STATECHART___GET_HIGHEST_PARENT_STATECHART);
		createEOperation(realtimeStatechartEClass, REALTIME_STATECHART___GET_PORT_OR_ROLE_STATECHART);
		createEOperation(realtimeStatechartEClass, REALTIME_STATECHART___GET_PRIORITY);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__KIND);

		transitionEventEClass = createEClass(TRANSITION_EVENT);

		stateEventEClass = createEClass(STATE_EVENT);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__INSTANCE_OF);
		createEReference(messageEClass, MESSAGE__PARAMETER_BINDING);

		entryEventEClass = createEClass(ENTRY_EVENT);

		exitEventEClass = createEClass(EXIT_EVENT);

		stateConnectionPointEClass = createEClass(STATE_CONNECTION_POINT);
		createEReference(stateConnectionPointEClass, STATE_CONNECTION_POINT__STATE);

		entryPointEClass = createEClass(ENTRY_POINT);

		exitPointEClass = createEClass(EXIT_POINT);

		// Create enums
		synchronizationKindEEnum = createEEnum(SYNCHRONIZATION_KIND);
		eventKindEEnum = createEEnum(EVENT_KIND);
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
		One_to_n_schemataPackage theOne_to_n_schemataPackage = (One_to_n_schemataPackage)EPackage.Registry.INSTANCE.getEPackage(One_to_n_schemataPackage.eNS_URI);
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		MsgtypePackage theMsgtypePackage = (MsgtypePackage)EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI);
		CommonExpressionsPackage theCommonExpressionsPackage = (CommonExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonExpressionsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theOne_to_n_schemataPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		absoluteDeadlineEClass.getESuperTypes().add(this.getDeadline());
		relativeDeadlineEClass.getESuperTypes().add(this.getDeadline());
		clockEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		stateEClass.getESuperTypes().add(this.getVertex());
		vertexEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		vertexEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		transitionEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		clockConstraintEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		actionEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		asynchronousMessageEventEClass.getESuperTypes().add(this.getTransitionEvent());
		doEventEClass.getESuperTypes().add(this.getStateEvent());
		entryOrExitEventEClass.getESuperTypes().add(this.getStateEvent());
		synchronizationChannelEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		synchronizationChannelEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		synchronizationEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		realtimeStatechartEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		realtimeStatechartEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		realtimeStatechartEClass.getESuperTypes().add(theBehaviorPackage.getBehavior());
		transitionEventEClass.getESuperTypes().add(this.getEvent());
		stateEventEClass.getESuperTypes().add(this.getEvent());
		messageEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		entryEventEClass.getESuperTypes().add(this.getEntryOrExitEvent());
		exitEventEClass.getESuperTypes().add(this.getEntryOrExitEvent());
		stateConnectionPointEClass.getESuperTypes().add(this.getVertex());
		entryPointEClass.getESuperTypes().add(this.getStateConnectionPoint());
		exitPointEClass.getESuperTypes().add(this.getStateConnectionPoint());

		// Initialize classes, features, and operations; add parameters
		initEClass(deadlineEClass, Deadline.class, "Deadline", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeadline_UpperBound(), theValuetypePackage.getTimeValue(), null, "upperBound", null, 1, 1, Deadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeadline_LowerBound(), theValuetypePackage.getTimeValue(), null, "lowerBound", null, 1, 1, Deadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absoluteDeadlineEClass, AbsoluteDeadline.class, "AbsoluteDeadline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbsoluteDeadline_Clock(), this.getClock(), null, "clock", null, 1, 1, AbsoluteDeadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativeDeadlineEClass, RelativeDeadline.class, "RelativeDeadline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clockEClass, Clock.class, "Clock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClock_Statechart(), this.getRealtimeStatechart(), this.getRealtimeStatechart_Clocks(), "statechart", null, 0, 1, Clock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_EmbeddedStatecharts(), this.getRealtimeStatechart(), this.getRealtimeStatechart_ParentState(), "embeddedStatecharts", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_DoEvent(), this.getDoEvent(), null, "doEvent", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_ExitEvent(), this.getExitEvent(), null, "exitEvent", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_EntryEvent(), this.getEntryEvent(), null, "entryEvent", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Invariants(), this.getClockConstraint(), null, "invariants", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Initial(), ecorePackage.getEBoolean(), "initial", "false", 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Final(), ecorePackage.getEBoolean(), "final", "false", 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Urgent(), ecorePackage.getEBoolean(), "urgent", "false", 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Channels(), this.getSynchronizationChannel(), this.getSynchronizationChannel_State(), "channels", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Events(), this.getStateEvent(), null, "events", null, 0, -1, State.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ConnectionPoints(), this.getStateConnectionPoint(), this.getStateConnectionPoint_State(), "connectionPoints", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Simple(), ecorePackage.getEBoolean(), "simple", "true", 0, 1, State.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_ParentStatechart(), this.getRealtimeStatechart(), this.getRealtimeStatechart_States(), "parentStatechart", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_AllAvailableChannels(), this.getSynchronizationChannel(), null, "allAvailableChannels", null, 0, -1, State.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getState__GetUniqueRegionPriority__int(), ecorePackage.getEInt(), "getUniqueRegionPriority", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "hint", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getState__HasRegionOfPriority__int(), ecorePackage.getEBoolean(), "hasRegionOfPriority", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "priority", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vertexEClass, Vertex.class, "Vertex", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVertex_OutgoingTransitions(), this.getTransition(), this.getTransition_Source(), "outgoingTransitions", null, 0, -1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVertex_IncomingTransitions(), this.getTransition(), this.getTransition_Target(), "incomingTransitions", null, 0, -1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVertex_AllSuperVertices(), this.getVertex(), null, "allSuperVertices", null, 0, -1, Vertex.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVertex__IsSuperVertexOf__Vertex(), ecorePackage.getEBoolean(), "isSuperVertexOf", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVertex(), "vertex", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVertex__GetUniqueTransitionPriority__int(), ecorePackage.getEInt(), "getUniqueTransitionPriority", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "hint", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVertex__HasOutgoingTransitionOfPriority__int(), ecorePackage.getEBoolean(), "hasOutgoingTransitionOfPriority", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "priority", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVertex__GetTransitionPriority__Transition(), ecorePackage.getEInt(), "getTransitionPriority", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTransition(), "transition", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Synchronization(), this.getSynchronization(), null, "synchronization", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getVertex(), this.getVertex_IncomingTransitions(), "target", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getVertex(), this.getVertex_OutgoingTransitions(), "source", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Statechart(), this.getRealtimeStatechart(), null, "statechart", null, 1, 1, Transition.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_ClockResets(), this.getClock(), null, "clockResets", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_TriggerMessageEvent(), this.getAsynchronousMessageEvent(), null, "triggerMessageEvent", null, 0, 1, Transition.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_RaiseMessageEvent(), this.getAsynchronousMessageEvent(), null, "raiseMessageEvent", null, 0, 1, Transition.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_ClockConstraints(), this.getClockConstraint(), null, "clockConstraints", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_AbsoluteDeadlines(), this.getAbsoluteDeadline(), null, "absoluteDeadlines", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_RelativeDeadline(), this.getRelativeDeadline(), null, "relativeDeadline", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Blockable(), ecorePackage.getEBoolean(), "blockable", "false", 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Guard(), theExpressionsPackage.getExpression(), null, "guard", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Events(), this.getTransitionEvent(), null, "events", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Action(), this.getAction(), null, "action", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Urgent(), ecorePackage.getEBoolean(), "urgent", "true", 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_ReceiverMessageTypes(), theMsgtypePackage.getMessageType(), null, "receiverMessageTypes", null, 0, -1, Transition.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_SenderMessageTypes(), theMsgtypePackage.getMessageType(), null, "senderMessageTypes", null, 0, -1, Transition.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getTransition__GetPriority(), ecorePackage.getEInt(), "getPriority", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(clockConstraintEClass, ClockConstraint.class, "ClockConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClockConstraint_Bound(), theValuetypePackage.getTimeValue(), null, "bound", null, 1, 1, ClockConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClockConstraint_Clock(), this.getClock(), null, "clock", null, 1, 1, ClockConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClockConstraint_Operator(), theCommonExpressionsPackage.getComparingOperator(), "operator", "LESS_OR_EQUAL", 1, 1, ClockConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Expressions(), theExpressionsPackage.getExpression(), null, "expressions", null, 1, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asynchronousMessageEventEClass, AsynchronousMessageEvent.class, "AsynchronousMessageEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAsynchronousMessageEvent_Message(), this.getMessage(), null, "message", null, 1, 1, AsynchronousMessageEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsynchronousMessageEvent_OneToManyCommunicationSchema(), theOne_to_n_schemataPackage.getOneToManyCommunicationSchema(), theOne_to_n_schemataPackage.getOneToManyCommunicationSchema_AsynchronousMessageEvent(), "oneToManyCommunicationSchema", null, 0, 1, AsynchronousMessageEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doEventEClass, DoEvent.class, "DoEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoEvent_Action(), this.getAction(), null, "action", null, 1, 1, DoEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoEvent_Period(), theValuetypePackage.getTimeValue(), null, "period", null, 1, 1, DoEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryOrExitEventEClass, EntryOrExitEvent.class, "EntryOrExitEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryOrExitEvent_ClockResets(), this.getClock(), null, "clockResets", null, 0, -1, EntryOrExitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryOrExitEvent_Action(), this.getAction(), null, "action", null, 0, 1, EntryOrExitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronizationChannelEClass, SynchronizationChannel.class, "SynchronizationChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSynchronizationChannel_State(), this.getState(), this.getState_Channels(), "state", null, 1, 1, SynchronizationChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSynchronizationChannel_SelectorType(), theTypesPackage.getDataType(), null, "selectorType", null, 0, 1, SynchronizationChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronizationEClass, Synchronization.class, "Synchronization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSynchronization_SyncChannel(), this.getSynchronizationChannel(), null, "syncChannel", null, 0, 1, Synchronization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchronization_Kind(), this.getSynchronizationKind(), "kind", null, 1, 1, Synchronization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSynchronization_SelectorExpression(), theExpressionsPackage.getExpression(), null, "selectorExpression", null, 0, 1, Synchronization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realtimeStatechartEClass, RealtimeStatechart.class, "RealtimeStatechart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealtimeStatechart_ParentState(), this.getState(), this.getState_EmbeddedStatecharts(), "parentState", null, 0, 1, RealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechart_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, RealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechart_States(), this.getState(), this.getState_ParentStatechart(), "states", null, 1, -1, RealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechart_Clocks(), this.getClock(), this.getClock_Statechart(), "clocks", null, 0, -1, RealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealtimeStatechart_Flat(), ecorePackage.getEBoolean(), "flat", "false", 0, 1, RealtimeStatechart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechart_AvailableClocks(), this.getClock(), null, "availableClocks", null, 0, -1, RealtimeStatechart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRealtimeStatechart_Embedded(), ecorePackage.getEBoolean(), "embedded", "false", 0, 1, RealtimeStatechart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechart_AllAvailableVariables(), theBehaviorPackage.getVariable(), null, "allAvailableVariables", null, 0, -1, RealtimeStatechart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechart_AllAvailableOperations(), theBehaviorPackage.getOperation(), null, "allAvailableOperations", null, 0, -1, RealtimeStatechart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechart_UsedOperationRepositories(), theBehaviorPackage.getOperationRepository(), null, "usedOperationRepositories", null, 0, -1, RealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealtimeStatechart_UsesOneToManyCommunicationSchemata(), ecorePackage.getEBoolean(), "usesOneToManyCommunicationSchemata", "false", 0, 1, RealtimeStatechart.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechart_SubRoleSpecificVariables(), theBehaviorPackage.getVariable(), null, "subRoleSpecificVariables", null, 0, -1, RealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechart_SubRoleSpecificClocks(), this.getClock(), null, "subRoleSpecificClocks", null, 0, -1, RealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechart_SubRoleSpecificOperations(), theBehaviorPackage.getOperation(), null, "subRoleSpecificOperations", null, 0, -1, RealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRealtimeStatechart__IsSuperStatechartOf__RealtimeStatechart(), ecorePackage.getEBoolean(), "isSuperStatechartOf", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRealtimeStatechart(), "statechart", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRealtimeStatechart__GetHighestParentStatechart(), this.getRealtimeStatechart(), "getHighestParentStatechart", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRealtimeStatechart__GetPortOrRoleStatechart(), this.getRealtimeStatechart(), "getPortOrRoleStatechart", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRealtimeStatechart__GetPriority(), theEcorePackage.getEInt(), "getPriority", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Kind(), this.getEventKind(), "kind", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEventEClass, TransitionEvent.class, "TransitionEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateEventEClass, StateEvent.class, "StateEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessage_InstanceOf(), theMsgtypePackage.getMessageType(), null, "instanceOf", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_ParameterBinding(), theBehaviorPackage.getParameterBinding(), null, "parameterBinding", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryEventEClass, EntryEvent.class, "EntryEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exitEventEClass, ExitEvent.class, "ExitEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateConnectionPointEClass, StateConnectionPoint.class, "StateConnectionPoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateConnectionPoint_State(), this.getState(), this.getState_ConnectionPoints(), "state", null, 1, 1, StateConnectionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryPointEClass, EntryPoint.class, "EntryPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exitPointEClass, ExitPoint.class, "ExitPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(synchronizationKindEEnum, SynchronizationKind.class, "SynchronizationKind");
		addEEnumLiteral(synchronizationKindEEnum, SynchronizationKind.SEND);
		addEEnumLiteral(synchronizationKindEEnum, SynchronizationKind.RECEIVE);

		initEEnum(eventKindEEnum, EventKind.class, "EventKind");
		addEEnumLiteral(eventKindEEnum, EventKind.RAISE);
		addEEnumLiteral(eventKindEEnum, EventKind.TRIGGER);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// null
		createNullAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// http://www.muml.org/emf/OCLFilter
		createOCLFilterAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
		addAnnotation
		  (stateEClass, 
		   source, 
		   new String[] {
			 "constraints", "NoOutgoingTransitionOfFinalState NoRegionsOfFinalState UniquePrioritiesOfOutgoingTransitions UniquePrioritiesOfRegions UniqueChannelNames UniqueRegionNames InvalidClockConstraintOperator UniqueStateConnectionPointNames EntryEventAtInitialState"
		   });	
		addAnnotation
		  (transitionEClass, 
		   source, 
		   new String[] {
			 "constraints", "UsingAOneToManySchemaAtOneTransitionImpliesUsingSchemaAtAllTransitions LegalTransitionsOnly TriggerMessageEventsMustNotHaveAnOwnedParameterBinding ValidTriggerMessageEvents ValidRaiseMessageEvents StateConnectionPointIncomingTransitionsNoSideEffectsOrDeadlines StateConnectionPointOutgoingTransitionsNoConditions StateConnectionPointOutgoingTransitionsMustBeUrgent NoCombinationOfRelativeAndAbsoluteDeadlines NoCombinationOfReceivedSynchronizationAndTriggerMessage TransitionMustBeContainedByCorrectStatechart OutgoingTransitionOfUrgentStateMustBeUrgent NotMoreThanOneTriggerAndOneRaiseMessageEvent"
		   });	
		addAnnotation
		  (asynchronousMessageEventEClass, 
		   source, 
		   new String[] {
			 "constraints", "RaiseMessageEventImpliesParameterBinding RaiseMessageEventImpliesSendingCommunicationSchema TriggerMessageEventImpliesReceivingCommunicationSchema"
		   });	
		addAnnotation
		  (synchronizationChannelEClass, 
		   source, 
		   new String[] {
			 "constraints", "ValidSelectorType"
		   });	
		addAnnotation
		  (synchronizationEClass, 
		   source, 
		   new String[] {
			 "constraints", "SelectorExpressionNecessary SelectorExpressionForbidden"
		   });	
		addAnnotation
		  (realtimeStatechartEClass, 
		   source, 
		   new String[] {
			 "constraints", "HybridPortNamesAndVariableNamesMustDiffer CommunicationSchemaOnlyUsedInMultiRoleOrMultiPort UniqueNameOfStates NoCycles OneInitialState OnlyDefineSchemataBeforeDisassembling ComponentBehaviorStatechartMustBeWellFormed NoMessageSendInCoordinatorRegion MultiDiscreteInteractionEndpointBehaviorStatechartMustBeWellFormed"
		   });	
		addAnnotation
		  (stateConnectionPointEClass, 
		   source, 
		   new String[] {
			 "constraints", "ConnectionPointsOnlyAtCompositeStates"
		   });	
		addAnnotation
		  (entryPointEClass, 
		   source, 
		   new String[] {
			 "constraints", "AtLeastOneIncomingTransition OneOutgoingTransitionPerRegion"
		   });	
		addAnnotation
		  (exitPointEClass, 
		   source, 
		   new String[] {
			 "constraints", "AtLeastOneIncomingTransitionPerRegion OneOutgoingTransition AtMostOneConnectingRegionWithSynchronizations AtMostOneConnectingRegionWithTriggerMessageEvents"
		   });
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;	
		addAnnotation
		  (relativeDeadlineEClass, 
		   source, 
		   new String[] {
			 "", null
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (stateEClass, 
		   source, 
		   new String[] {
			 "NoOutgoingTransitionOfFinalState", "-- Final states must not have outgoing transitions\nself.final implies self.outgoingTransitions->isEmpty()",
			 "NoRegionsOfFinalState", "-- Final states must not have regions\nself.final implies self.embeddedStatecharts->isEmpty()",
			 "UniquePrioritiesOfOutgoingTransitions", "-- Outgoing transitions must have a unique priority\nself.outgoingTransitions->isUnique(priority) ",
			 "UniqueChannelNames", "-- Synchronization channels must have a unique name\nself.channels->isUnique(name)",
			 "UniqueRegionNames", "-- Regions must have a unique name\nself.embeddedStatecharts->isUnique(name)",
			 "InvalidClockConstraintOperator", "-- Clock Constraints must only use operators LESS and LESS_OR_EQUAL\nself.invariants->forAll(invariant | Set{core::expressions::common::ComparingOperator::LESS, core::expressions::common::ComparingOperator::LESS_OR_EQUAL }->includes(invariant.operator))",
			 "UniqueStateConnectionPointNames", "-- State Connection Points of a composite state must have unique names.\r\nself.connectionPoints->isUnique(name)",
			 "EntryEventAtInitialState", "-- @warning\n-- Attention: An initial state only executes its entry event if it is activated via a firing transition. Consequently, if the RTSC starts, its initial states do not execute their entry events (their entry actions and their clock resets). Noteworthy, this only affects initial states that have no parent states and initial states where all their parents are initial states.\nlet allParentStates : Set(State) = self -> closure(if parentStatechart.parentState.oclIsUndefined() then self else parentStatechart.parentState endif) in\nnot (self.initial and allParentStates->forAll(x | x.initial) and not self.entryEvent.oclIsUndefined())"
		   });	
		addAnnotation
		  (getState_Events(), 
		   source, 
		   new String[] {
			 "derivation", "Set{entryEvent,exitEvent,doEvent }->select(x | not x.oclIsUndefined())"
		   });	
		addAnnotation
		  (getState_Simple(), 
		   source, 
		   new String[] {
			 "derivation", "-- a state is simple if it contains no regions\r\nembeddedStatecharts->isEmpty()\r\n"
		   });	
		addAnnotation
		  (getState_AllAvailableChannels(), 
		   source, 
		   new String[] {
			 "derivation", "self -> closure(if parentStatechart.parentState.oclIsUndefined() then self else parentStatechart.parentState endif).channels ->asOrderedSet()"
		   });	
		addAnnotation
		  (getVertex__IsSuperVertexOf__Vertex(), 
		   source, 
		   new String[] {
			 "body", "vertex.allSuperVertices->includes(self)"
		   });	
		addAnnotation
		  (getVertex_AllSuperVertices(), 
		   source, 
		   new String[] {
			 "derivation", "if self.oclIsKindOf(State)\r\nthen self.oclAsType(State)->closure(s | if s.parentStatechart.embedded then s.parentStatechart.parentState else null endif)->asOrderedSet()\r\nelse\r\n   if self.oclIsKindOf(StateConnectionPoint)\r\n   then let state : State = self.oclAsType(StateConnectionPoint).state in state->union(state->closure(s | if s.parentStatechart.embedded then s.parentStatechart.parentState else null endif))->asOrderedSet()\r\n   else OrderedSet{ }\r\n   endif\r\nendif"
		   });	
		addAnnotation
		  (transitionEClass, 
		   source, 
		   new String[] {
			 "LegalTransitionsOnly", "-- Inter-level transitions are invalid\r\n\r\nif (self.source.oclIsUndefined() or self.target.oclIsUndefined()) then\r\ntrue\r\nelse\r\n-- State A1 to ExitPoint of A2, where A2 is the direct parent state of A1\r\n(self.source.oclIsKindOf(State) and self.target.oclIsKindOf(ExitPoint) and self.target.oclAsType(ExitPoint).state.embeddedStatecharts.states->includes(self.source.oclAsType(State)))\t\r\nor\r\n-- EntryPoint of A1 to State A2, where A1 is the direct parent state of A2\r\n(self.source.oclIsKindOf(EntryPoint) and self.target.oclIsKindOf(State) and self.source.oclAsType(EntryPoint).state.embeddedStatecharts.states->includes(self.target.oclAsType(State)))\t\r\nor\r\n-- EntryPoint of A1 to EntryPoint of A2, where A1 is the direct parent state of A2\r\n(self.source.oclIsKindOf(EntryPoint) and self.target.oclIsKindOf(EntryPoint) and self.source.oclAsType(EntryPoint).state.embeddedStatecharts.states->includes(self.target.oclAsType(EntryPoint).state))\r\nor\r\n-- ExitPoint of A1 to ExitPoint of A2, where A2 is the direct parent state of A1\r\n(self.source.oclIsKindOf(ExitPoint) and self.target.oclIsKindOf(ExitPoint) and self.target.oclAsType(ExitPoint).state.embeddedStatecharts.states->includes(self.source.oclAsType(ExitPoint).state))\r\n\r\nor \r\n-- State A to State B within the same statechart\r\n(self.source.oclIsKindOf(State) and self.target.oclIsKindOf(State) and self.source.oclAsType(State).parentStatechart = self.target.oclAsType(State).parentStatechart)\r\nor\r\n-- State A to EntryPoint of B, where A and B are in the same statechart\r\n(self.source.oclIsKindOf(State) and self.target.oclIsKindOf(EntryPoint) and self.source.oclAsType(State).parentStatechart = self.target.oclAsType(EntryPoint).state.parentStatechart)\r\nor\r\n-- ExitPoint of A to EntryPoint of B, where A and B are in the same statechart\r\n(self.source.oclIsKindOf(ExitPoint) and self.target.oclIsKindOf(EntryPoint) and self.source.oclAsType(ExitPoint).state.parentStatechart = self.target.oclAsType(EntryPoint).state.parentStatechart)\r\nor\r\n-- ExitPoint of A to State B, where A and B are in the same statechart\r\n(self.source.oclIsKindOf(ExitPoint) and self.target.oclIsKindOf(State) and self.source.oclAsType(ExitPoint).state.parentStatechart = self.target.oclAsType(State).parentStatechart)\r\nendif",
			 "TriggerMessageEventsMustNotHaveAnOwnedParameterBinding", "-- Trigger Message Event must be parameterless (no parameter binding allowed)\r\nnot self.triggerMessageEvent.message.oclIsUndefined() implies\r\nself.triggerMessageEvent.message.parameterBinding->isEmpty()",
			 "ValidTriggerMessageEvents", "-- Trigger message type must be added to receiver message types\r\nnot triggerMessageEvent.message.instanceOf.oclIsUndefined() implies receiverMessageTypes->includes(triggerMessageEvent.message.instanceOf)",
			 "ValidRaiseMessageEvents", "-- Raise message type must be added to sender message types\r\nnot raiseMessageEvent.message.instanceOf.oclIsUndefined() implies senderMessageTypes->includes(raiseMessageEvent.message.instanceOf)",
			 "StateConnectionPointIncomingTransitionsNoSideEffectsOrDeadlines", "-- Transitions to state connection points must not define side effects or deadlines\r\n(not self.target.oclIsUndefined() and self.target.oclIsKindOf(realtimestatechart::StateConnectionPoint))\r\n\timplies (\r\n\t\tself.clockResets->isEmpty()\r\n\t\tand self.action.oclIsUndefined()\r\n\t\tand self.raiseMessageEvent.oclIsUndefined()\r\n\t\tand self.absoluteDeadlines->isEmpty()\r\n\t\tand self.relativeDeadline.oclIsUndefined()\r\n\t)",
			 "StateConnectionPointOutgoingTransitionsNoConditions", "-- Transitions from state connection points must not have conditions\r\n(not self.source.oclIsUndefined() and self.source.oclIsKindOf(realtimestatechart::StateConnectionPoint))\r\n\timplies (\r\n\t\tself.triggerMessageEvent.oclIsUndefined()\r\n\t\tand self.clockConstraints->isEmpty()\r\n\t\tand self.guard.oclIsUndefined()\r\n\t\tand self.synchronization.oclIsUndefined()\r\n\t)",
			 "StateConnectionPointOutgoingTransitionsMustBeUrgent", "-- Transitions from state connection points must be urgent\r\n(not self.source.oclIsUndefined() and self.source.oclIsKindOf(realtimestatechart::StateConnectionPoint))\r\n\timplies (\r\n\t\tself.urgent\r\n\t)",
			 "NoCombinationOfRelativeAndAbsoluteDeadlines", "-- Defining both relative and absolute deadlines is forbidden\n(not self.relativeDeadline.oclIsUndefined()) implies (self.absoluteDeadlines->isEmpty())",
			 "NoCombinationOfReceivedSynchronizationAndTriggerMessage", "-- A transition must not specify a received synchronization and a trigger message at the same time\r\n((not self.synchronization.oclIsUndefined()) and (self.synchronization.kind = SynchronizationKind::RECEIVE))\r\nimplies\r\nself.triggerMessageEvent.oclIsUndefined()",
			 "TransitionMustBeContainedByCorrectStatechart", "-- A transition must be contained by its logical parent statechart\r\n(not self.statechart.oclIsUndefined()) implies (self.statechart.transitions->includes(self))",
			 "OutgoingTransitionOfUrgentStateMustBeUrgent", "-- An outgoing transition of an urgent state must be urgent itself\r\n(self.source.oclIsKindOf(State) and self.source.oclAsType(State).urgent) implies self.urgent",
			 "UsingAOneToManySchemaAtOneTransitionImpliesUsingSchemaAtAllTransitions", "-- If a one-to-many communication schema is used at a transition, the behavioral element must be a multi role or multi port and all other messages of the RTSC must use a one-to-many communication schema  as well. Moreover, the RTSC may not define explicit coordinator and subrole regions.\r\nlet result : Boolean = (\r\nlet selfStatechart : RealtimeStatechart = self.statechart in \r\nlet allChildrenOfRoleOrPortStatechart : Set(RealtimeStatechart) =if selfStatechart.oclIsUndefined() then Set{} else selfStatechart.getPortOrRoleStatechart() -> closure(states.embeddedStatecharts) endif in \r\nlet allTransitions : OrderedSet(Transition) =  allChildrenOfRoleOrPortStatechart->asOrderedSet()->append(selfStatechart.getPortOrRoleStatechart()).transitions->asOrderedSet() in \r\n\r\n(selfStatechart.usesOneToManyCommunicationSchemata and not (selfStatechart.getPortOrRoleStatechart() = null)) implies ( \r\nallTransitions->forAll(t : Transition |  (not(t.raiseMessageEvent = null) implies not (t.raiseMessageEvent.oneToManyCommunicationSchema = null)) and ( not(t.triggerMessageEvent = null) implies not (t.triggerMessageEvent.oneToManyCommunicationSchema = null)))\r\n)\r\n) in not result.oclIsUndefined() and result\r\n",
			 "NotMoreThanOneTriggerAndOneRaiseMessageEvent", "-- There may only be at most one Raise MessageEvent and at most one Trigger MessageEvent\r\nself.events->select(event|event.oclIsKindOf(realtimestatechart::AsynchronousMessageEvent) and event.oclAsType(realtimestatechart::AsynchronousMessageEvent).kind = realtimestatechart::EventKind::RAISE) -> size() <2\r\nand self.events->select(event|event.oclIsKindOf(realtimestatechart::AsynchronousMessageEvent) and event.oclAsType(realtimestatechart::AsynchronousMessageEvent).kind = realtimestatechart::EventKind::TRIGGER) -> size() <2"
		   });	
		addAnnotation
		  (getTransition_Statechart(), 
		   source, 
		   new String[] {
			 "derivation", "if(self.source.oclIsKindOf(State))\r\nthen self.source.oclAsType(State).parentStatechart\r\nelse\r\n   if(self.target.oclIsKindOf(State))\r\n   then self.target.oclAsType(State).parentStatechart\r\n   else\r\n      if(self.source.oclIsKindOf(ExitPoint))\r\n      then self.source.oclAsType(ExitPoint).state.parentStatechart\r\n      else\r\n         if(self.target.oclIsKindOf(EntryPoint))\r\n\t  then self.target.oclAsType(EntryPoint).state.parentStatechart\r\n\t  else null -- this transition is illegal according to our syntactic constraints, no enclosing statechart can be assigned\r\n\t  endif\r\n      endif\r\n   endif\r\nendif\r\n"
		   });	
		addAnnotation
		  (getTransition_TriggerMessageEvent(), 
		   source, 
		   new String[] {
			 "derivation", "let eventSet : Sequence(AsynchronousMessageEvent) = self.events->select(e | e.oclIsKindOf(AsynchronousMessageEvent) and e.kind=EventKind::TRIGGER).oclAsType(AsynchronousMessageEvent) in\r\nif eventSet ->size() = 0 then null else eventSet -> first() endif"
		   });	
		addAnnotation
		  (getTransition_RaiseMessageEvent(), 
		   source, 
		   new String[] {
			 "derivation", "let eventSet : Sequence(AsynchronousMessageEvent) = self.events->select(e | e.oclIsKindOf(AsynchronousMessageEvent) and e.kind=EventKind::RAISE).oclAsType(AsynchronousMessageEvent) in\r\nif eventSet ->size() = 0 then null else eventSet -> first() endif"
		   });	
		addAnnotation
		  (getTransition_ReceiverMessageTypes(), 
		   source, 
		   new String[] {
			 "derivation", "if statechart.oclIsUndefined() then\r\n\tOrderedSet { }\r\nelse\r\n\tif statechart.getPortOrRoleStatechart().oclIsUndefined() then\r\n\t\tOrderedSet { }\r\n\telse \r\n\t\tlet b : behavior::BehavioralElement = statechart.getPortOrRoleStatechart().behavioralElement in\r\n\t\tif b.oclIsUndefined() then\r\n\t\t\tOrderedSet { }\r\n\t\telse\r\n\t\t\tif b.oclIsKindOf(connector::DiscreteInteractionEndpoint) then\r\n\t\t\t\tb.oclAsType(connector::DiscreteInteractionEndpoint).receiverMessageTypes\r\n\t\t\telse\r\n\t\t\t\tOrderedSet { }\r\n\t\t\tendif\r\n\t\tendif\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (getTransition_SenderMessageTypes(), 
		   source, 
		   new String[] {
			 "derivation", "if statechart.oclIsUndefined() then\r\n\tOrderedSet { }\r\nelse\r\n\tif statechart.getPortOrRoleStatechart().oclIsUndefined() then\r\n\t\tOrderedSet { }\r\n\telse\r\n\t\tlet b : behavior::BehavioralElement = statechart.getPortOrRoleStatechart().behavioralElement in\r\n\t\tif b.oclIsUndefined() then\r\n\t\t\tOrderedSet { }\r\n\t\telse\r\n\t\t\tif b.oclIsKindOf(connector::DiscreteInteractionEndpoint) then\r\n\t\t\t\tb.oclAsType(connector::DiscreteInteractionEndpoint).senderMessageTypes\r\n\t\t\telse\r\n\t\t\t\tOrderedSet { }\r\n\t\t\tendif\r\n\t\tendif\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (asynchronousMessageEventEClass, 
		   source, 
		   new String[] {
			 "RaiseMessageEventImpliesParameterBinding", "-- A raise message event must bind a value to every parameter\r\nlet messageType : msgtype::MessageType = self.message.instanceOf in\r\n(self.kind=EventKind::RAISE and not self.message.oclIsUndefined()) implies ( not messageType.oclIsUndefined() implies (messageType.parameters->asBag() = message.parameterBinding.parameter->asBag()))\r\n-- author: adann",
			 "RaiseMessageEventImpliesSendingCommunicationSchema", "-- When using One-To-Many Communication Schemata, a RaiseMessageEvent may only use sending One-To-Many Communication Schemata.\r\nif (self.oneToManyCommunicationSchema->isEmpty()) then \r\n\ttrue \r\nelse\r\n\tself.kind =EventKind::RAISE implies (self.oneToManyCommunicationSchema.oclIsKindOf(one_to_n_schemata::SendingOneToManyCommunicationSchema))\r\nendif",
			 "TriggerMessageEventImpliesReceivingCommunicationSchema", "-- When using One-To-Many Communication Schemata, a TiggerMessageEvent may only use receiving One-To-Many Communication Schemata.\r\nif (self.oneToManyCommunicationSchema->isEmpty()) then \r\n\ttrue \r\nelse\r\n\tself.kind =EventKind::TRIGGER implies (self.oneToManyCommunicationSchema.oclIsKindOf(one_to_n_schemata::ReceivingOneToManyCommunicationSchema))\r\nendif"
		   });	
		addAnnotation
		  (synchronizationChannelEClass, 
		   source, 
		   new String[] {
			 "ValidSelectorType", "-- The selector type must be of and Integer type or of type role iff this RTSC is a multi-role RTSC, or of type port iff this RTSC is a multi-port RTSC \r\nlet parentRtsc : realtimestatechart::RealtimeStatechart = self.state.parentStatechart in\r\n\r\nlet behavElement : behavior::BehavioralElement = if (parentRtsc->isEmpty()) then null else parentRtsc.behavioralElement endif in\r\n\r\nlet selectorTypeIsValidPrimitiveType : Boolean = if (not self.selectorType.oclIsUndefined()) then \r\nself.selectorType.oclIsKindOf(types::PrimitiveDataType) \r\nand (self.selectorType.oclAsType(types::PrimitiveDataType).primitiveType=types::PrimitiveTypes::BOOLEAN \r\n\tor self.selectorType.oclAsType(types::PrimitiveDataType).primitiveType=types::PrimitiveTypes::INT8 \r\n\tor self.selectorType.oclAsType(types::PrimitiveDataType).primitiveType=types::PrimitiveTypes::INT16 \r\n\tor self.selectorType.oclAsType(types::PrimitiveDataType).primitiveType=types::PrimitiveTypes::INT32\r\n\tor self.selectorType.oclAsType(types::PrimitiveDataType).primitiveType=types::PrimitiveTypes::INT64\r\n\tor self.selectorType.oclAsType(types::PrimitiveDataType).primitiveType=types::PrimitiveTypes::UINT8 \r\n\tor self.selectorType.oclAsType(types::PrimitiveDataType).primitiveType=types::PrimitiveTypes::UINT16 \r\n\tor self.selectorType.oclAsType(types::PrimitiveDataType).primitiveType=types::PrimitiveTypes::UINT32\r\n\tor self.selectorType.oclAsType(types::PrimitiveDataType).primitiveType=types::PrimitiveTypes::UINT64\r\n)\r\nelse true endif in \r\n\r\nif self.selectorType.oclIsUndefined() then\r\n\ttrue\r\nelse \r\n\tif behavElement.oclIsUndefined() then \r\n\t\tselectorTypeIsValidPrimitiveType\r\n\telse \r\n\tselectorTypeIsValidPrimitiveType \r\n\t\tor (if behavElement.oclIsKindOf(connector::DiscreteInteractionEndpoint) then behavElement.oclAsType(connector::DiscreteInteractionEndpoint).multi and self.selectorType.oclIsKindOf(connector::DiscreteInteractionEndpoint) else false endif)\r\n\tendif \r\nendif\n-- adann, xell, chris227"
		   });	
		addAnnotation
		  (synchronizationEClass, 
		   source, 
		   new String[] {
			 "SelectorExpressionNecessary", "-- Selected SynchronizationChannel requires this Synchronization to specify a selector expression.\r\nnot syncChannel.selectorType.oclIsUndefined() implies not selectorExpression.oclIsUndefined()",
			 "SelectorExpressionForbidden", "-- Using selector expression requires to define a data type for the channel. \r\nnot syncChannel.oclIsUndefined() implies (syncChannel.selectorType.oclIsUndefined() implies selectorExpression.oclIsUndefined())"
		   });	
		addAnnotation
		  (realtimeStatechartEClass, 
		   source, 
		   new String[] {
			 "UniqueNameOfStates", "-- State names must be unique.\nself.states->isUnique(name)",
			 "NoCycles", "-- An RTSC may not be the parent of the RTSC that it contains, i.e., cycles are not allowed.\r\n(not self.parentState.parentStatechart.oclIsUndefined())\r\nimplies\r\n(not self.isSuperStatechartOf(self.parentState.parentStatechart))",
			 "OneInitialState", "-- An RTSC requires an initial state.\r\nself.states->select(s |  s.initial)->size() = 1",
			 "CommunicationSchemaOnlyUsedInMultiRoleOrMultiPort", "-- An RTSC may only use one-to-many communication schema if its behavioral element is a multi role or multi port.\r\n(not (self.getPortOrRoleStatechart().behavioralElement.oclIsUndefined()) and  self.getPortOrRoleStatechart().behavioralElement.oclIsKindOf(component::AtomicComponent))\r\nor\r\n(\r\nself.usesOneToManyCommunicationSchemata implies (\r\nnot (self.getPortOrRoleStatechart().behavioralElement.oclIsUndefined()) and  self.getPortOrRoleStatechart().behavioralElement.oclIsKindOf(connector::DiscreteInteractionEndpoint)\r\nand self.getPortOrRoleStatechart().behavioralElement.oclAsType(connector::DiscreteInteractionEndpoint).multi)\r\n)",
			 "OnlyDefineSchemataBeforeDisassembling", "-- One-to-many communication schemata may only be used if the RTSC of the multi role or multi port does not distinguish between coordinator and subrole RTSC.\r\nself.usesOneToManyCommunicationSchemata implies self.getPortOrRoleStatechart().behavioralElement.oclAsType(connector::DiscreteInteractionEndpoint).subroleBehavior.oclIsUndefined() and  self.getPortOrRoleStatechart().behavioralElement.oclAsType(connector::DiscreteInteractionEndpoint).coordinatorBehavior.oclIsUndefined() ",
			 "ComponentBehaviorStatechartMustBeWellFormed", "-- The component behavior RTSC must contain at the top-level exactly one state and no transitions.\r\n\r\nlet behavioralElement : behavior::BehavioralElement = self.behavioralElement in \r\n(not behavioralElement.oclIsUndefined() and behavioralElement.oclIsKindOf(component::Component)) implies ( self.states->size() = 1 and self.transitions->size() = 0)",
			 "MultiDiscreteInteractionEndpointBehaviorStatechartMustBeWellFormed", "-- If a multi port or multi role RTSC does not use one-to-many communication schemata, then it must contain exactly one state and no transitions on top-level. Furthermore, the top level state defines exactly two regions: one region defines the DiscreteInteractionEndpoint.coordinatorBehavior, the other one defines the DiscreteInteractionEndpoint.subRoleBehavior.\r\nlet behavioralElement : behavior::BehavioralElement = self.behavioralElement in \r\n(not behavioralElement.oclIsUndefined() and behavioralElement.oclIsKindOf(connector::DiscreteInteractionEndpoint) and behavioralElement.oclAsType(connector::DiscreteInteractionEndpoint).multi and not self.usesOneToManyCommunicationSchemata) implies ( self.states->size() = 1 \r\nand self.transitions->size() = 0 and self.states->at(1).embeddedStatecharts->size() = 2 and \r\nself.states->at(1).embeddedStatecharts->includes(behavioralElement.oclAsType(connector::DiscreteInteractionEndpoint).subroleBehavior) and self.states->at(1).embeddedStatecharts->includes(behavioralElement.oclAsType(connector::DiscreteInteractionEndpoint).coordinatorBehavior) \r\n)\r\n\r\n\r\n\r\n\r\n\r\n\r\n",
			 "NoMessageSendInCoordinatorRegion", "-- It is not allowed to specify AsynchronousMessageEvents in the coordinator region.\r\nif(self.getPortOrRoleStatechart().behavioralElement.oclAsType(connector::DiscreteInteractionEndpoint).coordinatorBehavior.oclIsInvalid())\r\nthen true else \r\n(self.getPortOrRoleStatechart().behavioralElement.oclAsType(connector::DiscreteInteractionEndpoint).coordinatorBehavior = self )implies (\r\nlet allChildrenStatecharts: Set(realtimestatechart::RealtimeStatechart) = self->closure(t|t.oclAsType(realtimestatechart::RealtimeStatechart).states.embeddedStatecharts) in \r\nlet allTransitions : Bag(realtimestatechart::Transition) = allChildrenStatecharts.transitions->union(self.transitions) in\r\nallTransitions->select(t| not t.triggerMessageEvent.oclIsUndefined() or not t.raiseMessageEvent.oclIsUndefined())->isEmpty()\r\n)\r\nendif",
			 "HybridPortNamesAndVariableNamesMustDiffer", "-- The names of hybrid ports and variable names of the RTSC must differ.\r\nlet com:component::AtomicComponent = if(self.getHighestParentStatechart().behavioralElement.oclIsKindOf(component::AtomicComponent)) \r\nthen self.getHighestParentStatechart().behavioralElement.oclAsType(component::AtomicComponent) else null endif\r\n in  let allSubRoleSpecificVariables:Set(behavior::Variable) = self -> closure(if parentState.oclIsUndefined() then self else parentState.parentStatechart endif).subRoleSpecificVariables->asSet() in\r\n not com.oclIsUndefined() implies  com.ports->select(port|port.oclIsKindOf(component::HybridPort)).name->forAll(portName| self.allAvailableVariables.name->excludes(portName) and allSubRoleSpecificVariables.name->excludes(portName))\r\n"
		   });	
		addAnnotation
		  (getRealtimeStatechart_Flat(), 
		   source, 
		   new String[] {
			 "derivation", "-- a statechart is flat if it exclusively contains simple states\r\nstates->forAll(simple)"
		   });	
		addAnnotation
		  (getRealtimeStatechart_AvailableClocks(), 
		   source, 
		   new String[] {
			 "derivation", "self -> closure(\r\n\tif parentState.oclIsUndefined() then \r\n\t\tself \r\n\telse \r\n\t\tparentState.parentStatechart \r\n\tendif\r\n).clocks->asSet()"
		   });	
		addAnnotation
		  (getRealtimeStatechart_Embedded(), 
		   source, 
		   new String[] {
			 "derivation", "not self.parentState.oclIsUndefined()"
		   });	
		addAnnotation
		  (getRealtimeStatechart_AllAvailableVariables(), 
		   source, 
		   new String[] {
			 "derivation", "self -> closure(if parentState.parentStatechart.oclIsUndefined() then self else parentState.parentStatechart endif).variables->asOrderedSet()"
		   });	
		addAnnotation
		  (getRealtimeStatechart_AllAvailableOperations(), 
		   source, 
		   new String[] {
			 "derivation", "-- consider operations defined by self and by all parent RTSCs and include operations of all used OperationRepositories (either by self or by parent)\r\nlet allParentRTSCs : Set(RealtimeStatechart) = self -> closure(if parentState.oclIsUndefined() then self else parentState.parentStatechart endif) in\r\nallParentRTSCs.operations ->union(allParentRTSCs.usedOperationRepositories.operations) ->asOrderedSet()"
		   });	
		addAnnotation
		  (getRealtimeStatechart_UsesOneToManyCommunicationSchemata(), 
		   source, 
		   new String[] {
			 "derivation", "-- a RTSC uses OneToManyCommunicationSchemata if itself uses a oneToManyCommunicationSchema or one of the its children statecharts\r\nlet allRTSCs : Set(RealtimeStatechart) = self->closure(states.oclAsType(State).embeddedStatecharts)->append(self) in \r\nallRTSCs.transitions->exists(t : Transition | (not t.triggerMessageEvent.oneToManyCommunicationSchema.oclIsInvalid() and \r\n\tnot (t.triggerMessageEvent.oneToManyCommunicationSchema = null)\r\n) or (not t.raiseMessageEvent.oneToManyCommunicationSchema.oclIsInvalid() and not (t.raiseMessageEvent.oneToManyCommunicationSchema = null)))\r\n"
		   });	
		addAnnotation
		  (stateConnectionPointEClass, 
		   source, 
		   new String[] {
			 "ConnectionPointsOnlyAtCompositeStates", "-- State connection points are only allowed at composite (non-simple) states\nnot self.state.oclIsUndefined() implies not self.state.simple"
		   });	
		addAnnotation
		  (entryPointEClass, 
		   source, 
		   new String[] {
			 "AtLeastOneIncomingTransition", "-- Entry point needs at least one incoming transition\nself.incomingTransitions ->notEmpty()",
			 "OneOutgoingTransitionPerRegion", "-- all regions of the parent state must have exactly one vertex that the EntryPoint connects to\r\n(not self.state.oclIsUndefined()) implies self.state.embeddedStatecharts->forAll(r |\r\n\tself.outgoingTransitions->one(t |\r\n\t\t(t.target.oclIsKindOf(State) and t.target.oclAsType(State).parentStatechart = r)\r\n\t\tor\r\n\t\t(t.target.oclIsKindOf(EntryPoint) and t.target.oclAsType(EntryPoint).state.parentStatechart = r)\r\n\t)\r\n)"
		   });	
		addAnnotation
		  (exitPointEClass, 
		   source, 
		   new String[] {
			 "AtLeastOneIncomingTransitionPerRegion", "-- all regions of the parent state must have at least one vertex that connects to the ExitPoint\r\n(not self.state.oclIsUndefined()) implies self.state.embeddedStatecharts->forAll(r |\r\n\tself.incomingTransitions->exists(t |\r\n\t\t(t.source.oclIsKindOf(State) and t.source.oclAsType(State).parentStatechart = r)\r\n\t\tor\r\n\t\t(t.source.oclIsKindOf(ExitPoint) and t.source.oclAsType(ExitPoint).state.parentStatechart = r)\r\n\t)\r\n)",
			 "OneOutgoingTransition", "-- Exit point must have exactly one outgoing transition\nself.outgoingTransitions->size() = 1",
			 "AtMostOneConnectingRegionWithSynchronizations", "-- There must be at most one region with synchronizing transitions that connect (directly or indirectly) to the exit point\r\n\r\nlet exitTransitions : Collection(Transition) = \r\n\r\nself.incomingTransitions->union(\r\n   self.incomingTransitions->closure(t | \r\n\tif t.source.oclIsKindOf(ExitPoint)\r\n\tthen t.source.incomingTransitions\r\n\telse Sequence{}\r\n\tendif\r\n   )\r\n)\r\n\r\nin exitTransitions->forAll(t1 : Transition, t2: Transition | (t1 <> t2 and (not t1.synchronization.oclIsUndefined()) and (not t2.synchronization.oclIsUndefined())) implies (t1.statechart = t2.statechart))",
			 "AtMostOneConnectingRegionWithTriggerMessageEvents", "-- There must be at most one region with transitions that have a trigger message event and connect (directly or indirectly) to the exit point\r\n\r\nlet exitTransitions : Collection(Transition) = \r\n\r\nself.incomingTransitions->union(\r\n   self.incomingTransitions->closure(t | \r\n\tif t.source.oclIsKindOf(ExitPoint)\r\n\tthen t.source.incomingTransitions\r\n\telse Sequence{}\r\n\tendif\r\n   )\r\n)\r\n\r\nin exitTransitions->forAll(t1 : Transition, t2: Transition | (t1 <> t2 and (not t1.triggerMessageEvent.oclIsUndefined()) and (not t2.triggerMessageEvent.oclIsUndefined())) implies (t1.statechart = t2.statechart))"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.muml.org/emf/OCLFilter</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLFilterAnnotations() {
		String source = "http://www.muml.org/emf/OCLFilter";	
		addAnnotation
		  (getMessage_InstanceOf(), 
		   source, 
		   new String[] {
			 "filter", "msgtype::MessageType::allInstances()->select(x |\r\nif( self.oclAsType(ecore::EObject).eContainer().oclIsTypeOf(realtimestatechart::AsynchronousMessageEvent)  and self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsTypeOf(realtimestatechart::Transition)) then \r\n\tlet messageEvent : realtimestatechart::AsynchronousMessageEvent = self.oclAsType(ecore::EObject).eContainer().oclAsType(realtimestatechart::AsynchronousMessageEvent)  in \r\n\tlet transition : realtimestatechart::Transition = messageEvent.oclAsType(ecore::EObject).eContainer().oclAsType(realtimestatechart::Transition) in \r\n\t\r\n\tif(messageEvent.kind = realtimestatechart::EventKind::TRIGGER) then\r\n\t\ttransition.receiverMessageTypes->includes(x)\r\n\telse\r\n\t\ttransition.senderMessageTypes->includes(x)\r\n\tendif\r\nelse\r\n\ttrue\r\nendif\r\n\r\n\r\n)"
		   });
	}

} //RealtimestatechartPackageImpl
