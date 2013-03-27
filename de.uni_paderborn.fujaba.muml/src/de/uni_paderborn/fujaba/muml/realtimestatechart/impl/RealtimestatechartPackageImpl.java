/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.realtimestatechart.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.CorePackage;
import org.storydriven.core.expressions.ExpressionsPackage;
import org.storydriven.core.expressions.common.CommonExpressionsPackage;

import de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage;
import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.behavior.impl.BehaviorPackageImpl;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.impl.ComponentPackageImpl;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.connector.impl.ConnectorPackageImpl;
import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.constraint.impl.ConstraintPackageImpl;
import de.uni_paderborn.fujaba.muml.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.deployment.impl.DeploymentPackageImpl;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl;
import de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage;
import de.uni_paderborn.fujaba.muml.msgtype.impl.MsgtypePackageImpl;
import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.protocol.impl.ProtocolPackageImpl;
import de.uni_paderborn.fujaba.muml.realtimestatechart.AbsoluteDeadline;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Action;
import de.uni_paderborn.fujaba.muml.realtimestatechart.AsynchronousMessageEvent;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.realtimestatechart.ClockConstraint;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Deadline;
import de.uni_paderborn.fujaba.muml.realtimestatechart.DoEvent;
import de.uni_paderborn.fujaba.muml.realtimestatechart.EntryEvent;
import de.uni_paderborn.fujaba.muml.realtimestatechart.EntryOrExitEvent;
import de.uni_paderborn.fujaba.muml.realtimestatechart.EntryPoint;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Event;
import de.uni_paderborn.fujaba.muml.realtimestatechart.EventKind;
import de.uni_paderborn.fujaba.muml.realtimestatechart.ExitEvent;
import de.uni_paderborn.fujaba.muml.realtimestatechart.ExitPoint;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Message;
import de.uni_paderborn.fujaba.muml.realtimestatechart.PrioritizedElement;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RelativeDeadline;
import de.uni_paderborn.fujaba.muml.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.realtimestatechart.StateConnectionPoint;
import de.uni_paderborn.fujaba.muml.realtimestatechart.StateEvent;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Synchronization;
import de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationKind;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.realtimestatechart.TransitionEvent;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex;
import de.uni_paderborn.fujaba.muml.realtimestatechart.util.RealtimestatechartValidator;
import de.uni_paderborn.fujaba.muml.types.TypesPackage;
import de.uni_paderborn.fujaba.muml.types.impl.TypesPackageImpl;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;
import de.uni_paderborn.fujaba.muml.valuetype.impl.ValuetypePackageImpl;

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
	private EClass regionEClass = null;

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
	private EClass prioritizedElementEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#eNS_URI
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
		ModelinstancePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		ProtocolPackageImpl theProtocolPackage = (ProtocolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) instanceof ProtocolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) : ProtocolPackage.eINSTANCE);
		MsgtypePackageImpl theMsgtypePackage = (MsgtypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) instanceof MsgtypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) : MsgtypePackage.eINSTANCE);
		DeploymentPackageImpl theDeploymentPackage = (DeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) instanceof DeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) : DeploymentPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ConnectorPackageImpl theConnectorPackage = (ConnectorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI) instanceof ConnectorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI) : ConnectorPackage.eINSTANCE);
		ValuetypePackageImpl theValuetypePackage = (ValuetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI) instanceof ValuetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI) : ValuetypePackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);

		// Create package meta-data objects
		theRealtimestatechartPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theInstancePackage.createPackageContents();
		theProtocolPackage.createPackageContents();
		theMsgtypePackage.createPackageContents();
		theDeploymentPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theConnectorPackage.createPackageContents();
		theValuetypePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();

		// Initialize created meta-data
		theRealtimestatechartPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		theProtocolPackage.initializePackageContents();
		theMsgtypePackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theConnectorPackage.initializePackageContents();
		theValuetypePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();

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
	public EClass getRegion() {
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_EmbeddedStatechart() {
		return (EReference)regionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_ParentState() {
		return (EReference)regionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegion_EmbedsHistoryStatechart() {
		return (EAttribute)regionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegion_Name() {
		return (EAttribute)regionEClass.getEStructuralFeatures().get(3);
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
	public EReference getState_EmbeddedRegions() {
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
	public EReference getDoEvent_PeriodLower() {
		return (EReference)doEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoEvent_PeriodUpper() {
		return (EReference)doEventEClass.getEStructuralFeatures().get(2);
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
	public EClass getPrioritizedElement() {
		return prioritizedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrioritizedElement_Priority() {
		return (EAttribute)prioritizedElementEClass.getEStructuralFeatures().get(0);
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
	public EReference getRealtimeStatechart_ParentRegion() {
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
	public EAttribute getRealtimeStatechart_History() {
		return (EAttribute)realtimeStatechartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealtimeStatechart_Flat() {
		return (EAttribute)realtimeStatechartEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechart_AvailableClocks() {
		return (EReference)realtimeStatechartEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealtimeStatechart_Embedded() {
		return (EAttribute)realtimeStatechartEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechart_AllAvailableVariables() {
		return (EReference)realtimeStatechartEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechart_AllAvailableOperations() {
		return (EReference)realtimeStatechartEClass.getEStructuralFeatures().get(9);
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

		regionEClass = createEClass(REGION);
		createEReference(regionEClass, REGION__EMBEDDED_STATECHART);
		createEReference(regionEClass, REGION__PARENT_STATE);
		createEAttribute(regionEClass, REGION__EMBEDS_HISTORY_STATECHART);
		createEAttribute(regionEClass, REGION__NAME);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__EMBEDDED_REGIONS);
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

		vertexEClass = createEClass(VERTEX);
		createEReference(vertexEClass, VERTEX__OUTGOING_TRANSITIONS);
		createEReference(vertexEClass, VERTEX__INCOMING_TRANSITIONS);
		createEReference(vertexEClass, VERTEX__ALL_SUPER_VERTICES);

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

		clockConstraintEClass = createEClass(CLOCK_CONSTRAINT);
		createEReference(clockConstraintEClass, CLOCK_CONSTRAINT__BOUND);
		createEReference(clockConstraintEClass, CLOCK_CONSTRAINT__CLOCK);
		createEAttribute(clockConstraintEClass, CLOCK_CONSTRAINT__OPERATOR);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__EXPRESSIONS);

		asynchronousMessageEventEClass = createEClass(ASYNCHRONOUS_MESSAGE_EVENT);
		createEReference(asynchronousMessageEventEClass, ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE);

		doEventEClass = createEClass(DO_EVENT);
		createEReference(doEventEClass, DO_EVENT__ACTION);
		createEReference(doEventEClass, DO_EVENT__PERIOD_LOWER);
		createEReference(doEventEClass, DO_EVENT__PERIOD_UPPER);

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

		prioritizedElementEClass = createEClass(PRIORITIZED_ELEMENT);
		createEAttribute(prioritizedElementEClass, PRIORITIZED_ELEMENT__PRIORITY);

		realtimeStatechartEClass = createEClass(REALTIME_STATECHART);
		createEReference(realtimeStatechartEClass, REALTIME_STATECHART__PARENT_REGION);
		createEReference(realtimeStatechartEClass, REALTIME_STATECHART__TRANSITIONS);
		createEReference(realtimeStatechartEClass, REALTIME_STATECHART__STATES);
		createEReference(realtimeStatechartEClass, REALTIME_STATECHART__CLOCKS);
		createEAttribute(realtimeStatechartEClass, REALTIME_STATECHART__HISTORY);
		createEAttribute(realtimeStatechartEClass, REALTIME_STATECHART__FLAT);
		createEReference(realtimeStatechartEClass, REALTIME_STATECHART__AVAILABLE_CLOCKS);
		createEAttribute(realtimeStatechartEClass, REALTIME_STATECHART__EMBEDDED);
		createEReference(realtimeStatechartEClass, REALTIME_STATECHART__ALL_AVAILABLE_VARIABLES);
		createEReference(realtimeStatechartEClass, REALTIME_STATECHART__ALL_AVAILABLE_OPERATIONS);

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
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		MsgtypePackage theMsgtypePackage = (MsgtypePackage)EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI);
		CommonExpressionsPackage theCommonExpressionsPackage = (CommonExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonExpressionsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		absoluteDeadlineEClass.getESuperTypes().add(this.getDeadline());
		relativeDeadlineEClass.getESuperTypes().add(this.getDeadline());
		clockEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		regionEClass.getESuperTypes().add(this.getPrioritizedElement());
		regionEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		stateEClass.getESuperTypes().add(this.getVertex());
		vertexEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		transitionEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		transitionEClass.getESuperTypes().add(this.getPrioritizedElement());
		transitionEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
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

		// Initialize classes and features; add operations and parameters
		initEClass(deadlineEClass, Deadline.class, "Deadline", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeadline_UpperBound(), theValuetypePackage.getTimeValue(), null, "upperBound", null, 0, 1, Deadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeadline_LowerBound(), theValuetypePackage.getTimeValue(), null, "lowerBound", null, 0, 1, Deadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absoluteDeadlineEClass, AbsoluteDeadline.class, "AbsoluteDeadline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbsoluteDeadline_Clock(), this.getClock(), null, "clock", null, 1, 1, AbsoluteDeadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativeDeadlineEClass, RelativeDeadline.class, "RelativeDeadline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clockEClass, Clock.class, "Clock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClock_Statechart(), this.getRealtimeStatechart(), this.getRealtimeStatechart_Clocks(), "statechart", null, 0, 1, Clock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegion_EmbeddedStatechart(), this.getRealtimeStatechart(), this.getRealtimeStatechart_ParentRegion(), "embeddedStatechart", null, 1, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_ParentState(), this.getState(), this.getState_EmbeddedRegions(), "parentState", null, 1, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegion_EmbedsHistoryStatechart(), theEcorePackage.getEBoolean(), "embedsHistoryStatechart", null, 1, 1, Region.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Region.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_EmbeddedRegions(), this.getRegion(), this.getRegion_ParentState(), "embeddedRegions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEAttribute(getState_Simple(), theEcorePackage.getEBoolean(), "simple", "true", 0, 1, State.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_ParentStatechart(), this.getRealtimeStatechart(), this.getRealtimeStatechart_States(), "parentStatechart", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(stateEClass, ecorePackage.getEInt(), "getUniqueRegionPriority", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "hint", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stateEClass, ecorePackage.getEBoolean(), "hasRegionOfPriority", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "priority", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vertexEClass, Vertex.class, "Vertex", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVertex_OutgoingTransitions(), this.getTransition(), this.getTransition_Source(), "outgoingTransitions", null, 0, -1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVertex_IncomingTransitions(), this.getTransition(), this.getTransition_Target(), "incomingTransitions", null, 0, -1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVertex_AllSuperVertices(), this.getVertex(), null, "allSuperVertices", null, 0, -1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(vertexEClass, ecorePackage.getEBoolean(), "isSuperVertexOf", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVertex(), "vertex", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vertexEClass, theEcorePackage.getEInt(), "getUniqueTransitionPriority", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "hint", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vertexEClass, theEcorePackage.getEBoolean(), "hasOutgoingTransitionOfPriority", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "priority", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Synchronization(), this.getSynchronization(), null, "synchronization", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getVertex(), this.getVertex_IncomingTransitions(), "target", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getVertex(), this.getVertex_OutgoingTransitions(), "source", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Statechart(), this.getRealtimeStatechart(), this.getRealtimeStatechart_Transitions(), "statechart", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEClass(clockConstraintEClass, ClockConstraint.class, "ClockConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClockConstraint_Bound(), theValuetypePackage.getTimeValue(), null, "bound", null, 1, 1, ClockConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClockConstraint_Clock(), this.getClock(), null, "clock", null, 1, 1, ClockConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClockConstraint_Operator(), theCommonExpressionsPackage.getComparingOperator(), "operator", "ComparingOperator.LESS_OR_EQUAL", 1, 1, ClockConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Expressions(), theExpressionsPackage.getExpression(), null, "expressions", null, 1, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asynchronousMessageEventEClass, AsynchronousMessageEvent.class, "AsynchronousMessageEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAsynchronousMessageEvent_Message(), this.getMessage(), null, "message", null, 1, 1, AsynchronousMessageEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doEventEClass, DoEvent.class, "DoEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoEvent_Action(), this.getAction(), null, "action", null, 1, 1, DoEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoEvent_PeriodLower(), theValuetypePackage.getTimeValue(), null, "periodLower", null, 1, 1, DoEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoEvent_PeriodUpper(), theValuetypePackage.getTimeValue(), null, "periodUpper", null, 1, 1, DoEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(prioritizedElementEClass, PrioritizedElement.class, "PrioritizedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrioritizedElement_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, PrioritizedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realtimeStatechartEClass, RealtimeStatechart.class, "RealtimeStatechart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealtimeStatechart_ParentRegion(), this.getRegion(), this.getRegion_EmbeddedStatechart(), "parentRegion", null, 0, 1, RealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechart_Transitions(), this.getTransition(), this.getTransition_Statechart(), "transitions", null, 0, -1, RealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechart_States(), this.getState(), this.getState_ParentStatechart(), "states", null, 1, -1, RealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechart_Clocks(), this.getClock(), this.getClock_Statechart(), "clocks", null, 0, -1, RealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealtimeStatechart_History(), ecorePackage.getEBoolean(), "history", null, 0, 1, RealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealtimeStatechart_Flat(), theEcorePackage.getEBoolean(), "flat", "false", 0, 1, RealtimeStatechart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechart_AvailableClocks(), this.getClock(), null, "availableClocks", null, 0, -1, RealtimeStatechart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRealtimeStatechart_Embedded(), ecorePackage.getEBoolean(), "embedded", "false", 0, 1, RealtimeStatechart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechart_AllAvailableVariables(), theBehaviorPackage.getVariable(), null, "allAvailableVariables", null, 0, -1, RealtimeStatechart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechart_AllAvailableOperations(), theBehaviorPackage.getOperation(), null, "allAvailableOperations", null, 0, -1, RealtimeStatechart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = addEOperation(realtimeStatechartEClass, ecorePackage.getEBoolean(), "isSuperStatechartOf", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRealtimeStatechart(), "statechart", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(realtimeStatechartEClass, this.getRealtimeStatechart(), "getHighestParentStatechart", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(realtimeStatechartEClass, this.getRealtimeStatechart(), "getPortOrRoleStatechart", 1, 1, IS_UNIQUE, IS_ORDERED);

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

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
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
			 "constraints", "OneInvariantPerClock NoOutgoingTransitionOfFinalState NoRegionsOfFinalState UniquePrioritiesOfOutgoingTransitions UniquePrioritiesOfRegions UniqueChannelNames UniqueRegionNames BoundOfInvariantGreaterOrEqualZero InvalidClockConstraintOperator UniqueStateConnectionPointNames"
		   });																														
		addAnnotation
		  (transitionEClass, 
		   source, 
		   new String[] {
			 "constraints", "LegalTransitionsOnly TriggerMessageEventsMustNotHaveAnOwnedParameterBinding ValidTriggerMessageEvents ValidRaiseMessageEvents StateConnectionPointIncomingTransitionsNoSideEffectsOrDeadlines StateConnectionPointOutgoingTransitionsNoConditions StateConnectionPointOutgoingTransitionsMustBeUrgent StateConnectionPointTransitionsNoSynchronization"
		   });																																
		addAnnotation
		  (doEventEClass, 
		   source, 
		   new String[] {
			 "constraints", "ValidLowerUpperPeriod"
		   });														
		addAnnotation
		  (prioritizedElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "PriorityGreaterOrEqualOne"
		   });					
		addAnnotation
		  (realtimeStatechartEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueNameOfStates NoCycles OneInitialState"
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
			 "constraints", "AtLeastOneIncomingTransitionPerRegion OneOutgoingTransition"
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
		  (getRegion_EmbedsHistoryStatechart(), 
		   source, 
		   new String[] {
			 "derivation", "if embeddedStatechart.oclIsUndefined() then\r\n\tfalse\r\nelse\r\n\tembeddedStatechart.history\r\nendif"
		   });			
		addAnnotation
		  (getRegion_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if not self.embeddedStatechart.oclIsUndefined() then\r\n\tif not self.embeddedStatechart.oclIsUndefined() then\r\n\t\tself.embeddedStatechart.name\r\n\telse\r\n\t\tnull\r\n\tendif\r\nelse\r\n\tnull\r\nendif"
		   });					
		addAnnotation
		  (stateEClass, 
		   source, 
		   new String[] {
			 "OneInvariantPerClock", "self.invariants->isUnique(clock)",
			 "NoOutgoingTransitionOfFinalState", "self.final implies self.outgoingTransitions->isEmpty()",
			 "NoRegionsOfFinalState", "self.final implies self.embeddedRegions->isEmpty()",
			 "UniquePrioritiesOfOutgoingTransitions", "self.outgoingTransitions->isUnique(priority) ",
			 "UniquePrioritiesOfRegions", "self.embeddedRegions->isUnique(priority)",
			 "UniqueChannelNames", "self.channels->isUnique(name)",
			 "UniqueRegionNames", "self.embeddedRegions->isUnique(name)",
			 "BoundOfInvariantGreaterOrEqualZero", "self.invariants->forAll(i|\r\n\tnot i.bound.value.oclIsUndefined() implies\r\n\t\ti.bound.value.value >= 0\r\n\r\n)",
			 "InvalidClockConstraintOperator", "self.invariants->forAll(invariant | Set{core::expressions::common::ComparingOperator::LESS, core::expressions::common::ComparingOperator::LESS_OR_EQUAL }->includes(invariant.operator))",
			 "UniqueStateConnectionPointNames", "-- State Connection Points of a composite state must have unique names.\r\nself.connectionPoints->isUnique(name)"
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
			 "derivation", "-- a state is simple if it contains no regions\r\nembeddedRegions->isEmpty()\r\n"
		   });						
		addAnnotation
		  (vertexEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "true\r\n-- TODO IMPLEMENT\r\n--self.allSuperVertices->includes(v)"
		   });						
		addAnnotation
		  (getVertex_AllSuperVertices(), 
		   source, 
		   new String[] {
			 "derivation", "if self.oclIsKindOf(State)\r\nthen self.oclAsType(State)->closure(s | if s.parentStatechart.embedded then s.parentStatechart.parentRegion.parentState else null endif)->asOrderedSet()\r\nelse\r\n   if self.oclIsKindOf(StateConnectionPoint)\r\n   then let state : State = self.oclAsType(StateConnectionPoint).state in state->union(state->closure(s | if s.parentStatechart.embedded then s.parentStatechart.parentRegion.parentState else null endif))->asOrderedSet()\r\n   else OrderedSet{ }\r\n   endif\r\nendif"
		   });					
		addAnnotation
		  (transitionEClass, 
		   source, 
		   new String[] {
			 "LegalTransitionsOnly", "-- Only specific types of transitions are allowed\r\n\r\n-- State A1 to ExitPoint of A2, where A2 is the direct parent state of A1\r\n(self.source.oclIsKindOf(State) and self.target.oclIsKindOf(ExitPoint) and self.target.oclAsType(ExitPoint).state.embeddedRegions.embeddedStatechart.states->includes(self.source.oclAsType(State)))\t\r\nor\r\n-- EntryPoint of A1 to State A2, where A1 is the direct parent state of A2\r\n(self.source.oclIsKindOf(EntryPoint) and self.target.oclIsKindOf(State) and self.source.oclAsType(EntryPoint).state.embeddedRegions.embeddedStatechart.states->includes(self.target.oclAsType(State)))\t\r\nor\r\n-- EntryPoint of A1 to EntryPoint of A2, where A1 is the direct parent state of A2\r\n(self.source.oclIsKindOf(EntryPoint) and self.target.oclIsKindOf(EntryPoint) and self.source.oclAsType(EntryPoint).state.embeddedRegions.embeddedStatechart.states->includes(self.target.oclAsType(EntryPoint).state))\r\nor\r\n-- ExitPoint of A1 to ExitPoint of A2, where A2 is the direct parent state of A1\r\n(self.source.oclIsKindOf(ExitPoint) and self.target.oclIsKindOf(ExitPoint) and self.target.oclAsType(ExitPoint).state.embeddedRegions.embeddedStatechart.states->includes(self.source.oclAsType(ExitPoint).state))\r\n\r\nor \r\n-- State A to State B within the same statechart\r\n(self.source.oclIsKindOf(State) and self.target.oclIsKindOf(State) and self.source.oclAsType(State).parentStatechart = self.target.oclAsType(State).parentStatechart)\r\nor\r\n-- State A to EntryPoint of B, where A and B are in the same statechart\r\n(self.source.oclIsKindOf(State) and self.target.oclIsKindOf(EntryPoint) and self.source.oclAsType(State).parentStatechart = self.target.oclAsType(EntryPoint).state.parentStatechart)\r\nor\r\n-- ExitPoint of A to EntryPoint of B, where A and B are in the same statechart\r\n(self.source.oclIsKindOf(ExitPoint) and self.target.oclIsKindOf(EntryPoint) and self.source.oclAsType(ExitPoint).state.parentStatechart = self.target.oclAsType(EntryPoint).state.parentStatechart)\r\nor\r\n-- ExitPoint of A to State B, where A and B are in the same statechart\r\n(self.source.oclIsKindOf(ExitPoint) and self.target.oclIsKindOf(State) and self.source.oclAsType(ExitPoint).state.parentStatechart = self.target.oclAsType(State).parentStatechart)",
			 "TriggerMessageEventsMustNotHaveAnOwnedParameterBinding", "not self.triggerMessageEvent.message.oclIsUndefined() implies\r\nself.triggerMessageEvent.message.parameterBinding->isEmpty()",
			 "ValidTriggerMessageEvents", "not triggerMessageEvent.message.instanceOf.oclIsUndefined() implies receiverMessageTypes->includes(triggerMessageEvent.message.instanceOf)",
			 "ValidRaiseMessageEvents", "not raiseMessageEvent.message.instanceOf.oclIsUndefined() implies senderMessageTypes->includes(raiseMessageEvent.message.instanceOf)",
			 "StateConnectionPointIncomingTransitionsNoSideEffectsOrDeadlines", "(not self.target.oclIsUndefined() and self.target.oclIsKindOf(realtimestatechart::StateConnectionPoint))\r\n\timplies (\r\n\t\tself.clockResets->isEmpty()\r\n\t\tand self.action.oclIsUndefined()\r\n\t\tand self.raiseMessageEvent.oclIsUndefined()\r\n\t\tand self.absoluteDeadlines->isEmpty()\r\n\t\tand self.relativeDeadline.oclIsUndefined()\r\n\t)",
			 "StateConnectionPointOutgoingTransitionsNoConditions", "(not self.source.oclIsUndefined() and self.source.oclIsKindOf(realtimestatechart::StateConnectionPoint))\r\n\timplies (\r\n\t\tself.triggerMessageEvent.oclIsUndefined()\r\n\t\tand self.clockConstraints->isEmpty()\r\n\t\tand self.guard.oclIsUndefined()\r\n\t)",
			 "StateConnectionPointOutgoingTransitionsMustBeUrgent ", "(not self.source.oclIsUndefined() and self.source.oclIsKindOf(realtimestatechart::StateConnectionPoint))\r\n\timplies (\r\n\t\tself.urgent\r\n\t)",
			 "StateConnectionPointTransitionsNoSynchronization", "((not self.source.oclIsUndefined() and self.source.oclIsKindOf(realtimestatechart::StateConnectionPoint))\r\n\tor\r\n (not self.target.oclIsUndefined() and self.target.oclIsKindOf(realtimestatechart::StateConnectionPoint)))\r\n\timplies\r\nself.synchronization.oclIsUndefined()"
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
			 "derivation", "let b : behavior::BehavioralElement = statechart.getPortOrRoleStatechart().behavioralElement in\nif b.oclIsUndefined() then\n\tOrderedSet { }\nelse\n\tif b.oclIsKindOf(component::DiscretePort) then\n\t\tb.oclAsType(component::DiscretePort).receiverMessageTypes\n\telse\n\t\tif b.oclIsKindOf(protocol::Role) then\n\t\t\tb.oclAsType(protocol::Role).receiverMessageTypes\n\t\telse\n\t\t\tOrderedSet { }\n\t\tendif\n\tendif\nendif"
		   });		
		addAnnotation
		  (getTransition_SenderMessageTypes(), 
		   source, 
		   new String[] {
			 "derivation", "let b : behavior::BehavioralElement = statechart.getPortOrRoleStatechart().behavioralElement in\nif b.oclIsUndefined() then\n\tOrderedSet { }\nelse\n\tif b.oclIsKindOf(component::DiscretePort) then\n\t\tb.oclAsType(component::DiscretePort).senderMessageTypes\n\telse\n\t\tif b.oclIsKindOf(protocol::Role) then\n\t\t\tb.oclAsType(protocol::Role).senderMessageTypes\n\t\telse\n\t\t\tOrderedSet { }\n\t\tendif\n\tendif\nendif"
		   });											
		addAnnotation
		  (doEventEClass, 
		   source, 
		   new String[] {
			 "ValidLowerUpperPeriod", "not (self.periodLower.value.oclIsUndefined() and self.periodUpper.value.oclIsUndefined())\r\nimplies\r\nself.periodLower.value.value >= 1 and self.periodLower.value.value <= self.periodUpper.value.value"
		   });																
		addAnnotation
		  (prioritizedElementEClass, 
		   source, 
		   new String[] {
			 "PriorityGreaterOrEqualOne", "self.priority >= 1"
		   });			
		addAnnotation
		  (realtimeStatechartEClass, 
		   source, 
		   new String[] {
			 "UniqueNameOfStates", "self.states->isUnique(name)",
			 "NoCycles", "-- If we are contained within a statechart...\r\n(not self.parentRegion.parentState.parentStatechart.oclIsUndefined())\r\n\r\nimplies\r\n\r\n-- ... then we must not be a super statechart of it.\r\n(not self.isSuperStatechartOf(self.parentRegion.parentState.parentStatechart))",
			 "OneInitialState", "self.states->select(s |  s.initial)->size() = 1"
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
			 "derivation", "self -> closure(\r\n\tif parentRegion.oclIsUndefined() then \r\n\t\tself \r\n\telse \r\n\t\tparentRegion.parentState.parentStatechart \r\n\tendif\r\n).clocks->asSet()"
		   });			
		addAnnotation
		  (getRealtimeStatechart_Embedded(), 
		   source, 
		   new String[] {
			 "derivation", "not self.parentRegion.oclIsUndefined()"
		   });		
		addAnnotation
		  (getRealtimeStatechart_AllAvailableVariables(), 
		   source, 
		   new String[] {
			 "derivation", "self -> closure(if parentRegion.oclIsUndefined() then self else parentRegion.parentState.parentStatechart endif).variables->asOrderedSet()"
		   });		
		addAnnotation
		  (getRealtimeStatechart_AllAvailableOperations(), 
		   source, 
		   new String[] {
			 "derivation", "self -> closure(if parentRegion.oclIsUndefined() then self else parentRegion.parentState.parentStatechart endif).operations ->asOrderedSet()"
		   });																		
		addAnnotation
		  (stateConnectionPointEClass, 
		   source, 
		   new String[] {
			 "ConnectionPointsOnlyAtCompositeStates", "not self.state.oclIsUndefined() implies not self.state.simple"
		   });					
		addAnnotation
		  (entryPointEClass, 
		   source, 
		   new String[] {
			 "AtLeastOneIncomingTransition", "self.incomingTransitions ->notEmpty()",
			 "OneOutgoingTransitionPerRegion", "-- all regions of the parent state have exactly one state that the EntryPoint connects to\r\nself.state.embeddedRegions->forAll(r | \r\n\tr.embeddedStatechart.states->select(s |\r\n\t\ts.incomingTransitions->exists(t | t.source = self)\r\n\t\tor\r\n\t\ts.connectionPoints->select(oclIsKindOf(EntryPoint)).incomingTransitions->exists(t | t.source = self)\r\n\t)->size() = 1\r\n)"
		   });				
		addAnnotation
		  (exitPointEClass, 
		   source, 
		   new String[] {
			 "AtLeastOneIncomingTransitionPerRegion", "-- all regions of the parent state have at least one state that connects to the ExitPoint\r\nself.state.embeddedRegions->forAll(r | \r\n\tr.embeddedStatechart.states->exists(s |\r\n\t\ts.outgoingTransitions->exists(t | t.target = self)\r\n\t\tor\r\n\t\ts.connectionPoints->select(oclIsKindOf(ExitPoint)).outgoingTransitions->exists(t | t.target = self)\r\n\t)\r\n)",
			 "OneOutgoingTransition", "self.outgoingTransitions->size() = 1"
		   });
	}

} //RealtimestatechartPackageImpl
