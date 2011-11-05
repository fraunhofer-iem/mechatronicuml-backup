/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl;

import de.fujaba.modelinstance.ModelinstancePackage;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;

import de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl;

import de.uni_paderborn.fujaba.muml.model.constraint.ConstraintPackage;

import de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintPackageImpl;

import de.uni_paderborn.fujaba.muml.model.core.CorePackage;

import de.uni_paderborn.fujaba.muml.model.core.impl.CorePackageImpl;

import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;

import de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl;

import de.uni_paderborn.fujaba.muml.model.msgiface.MsgifacePackage;

import de.uni_paderborn.fujaba.muml.model.msgiface.impl.MsgifacePackageImpl;

import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;

import de.uni_paderborn.fujaba.muml.model.pattern.impl.PatternPackageImpl;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.AbsoluteDeadline;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Action;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousMessageEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Deadline;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Event;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EventKind;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Message;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Prioritizable;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RelativeDeadline;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryOrExitPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateExitPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationKind;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.TransitionEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.helper.HelperPackage;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.helper.impl.HelperPackageImpl;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.util.RealtimestatechartValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.storydriven.modeling.SDMPackage;

import org.storydriven.modeling.calls.CallsPackage;

import org.storydriven.modeling.expressions.ExpressionsPackage;

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
	private EClass prioritizableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fujabaRealtimeStatechartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryOrExitPointEClass = null;

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
	private EClass stateEntryOrExitPointEClass = null;

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
	private EClass stateEntryPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateExitPointEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#eNS_URI
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
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
		HelperPackageImpl theHelperPackage = (HelperPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI) instanceof HelperPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI) : HelperPackage.eINSTANCE);
		MsgifacePackageImpl theMsgifacePackage = (MsgifacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI) instanceof MsgifacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI) : MsgifacePackage.eINSTANCE);

		// Create package meta-data objects
		theRealtimestatechartPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theInstancePackage.createPackageContents();
		thePatternPackage.createPackageContents();
		theHelperPackage.createPackageContents();
		theMsgifacePackage.createPackageContents();

		// Initialize created meta-data
		theRealtimestatechartPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		thePatternPackage.initializePackageContents();
		theHelperPackage.initializePackageContents();
		theMsgifacePackage.initializePackageContents();

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
	public EReference getRegion_Statechart() {
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
	public EReference getRegion_Vertices() {
		return (EReference)regionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Transitions() {
		return (EReference)regionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_StatechartDerived() {
		return (EReference)regionEClass.getEStructuralFeatures().get(4);
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
	public EReference getState_Regions() {
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
	public EAttribute getState_Committed() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Initial() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Final() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Urgent() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Channels() {
		return (EReference)stateEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Events() {
		return (EReference)stateEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_StateEntryOrExitPoints() {
		return (EReference)stateEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Simple() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(12);
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
	public EReference getVertex_Statechart() {
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
	public EAttribute getTransition_Urgent() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Guard() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Events() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Action() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(14);
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
	public EAttribute getDoEvent_PeriodLower() {
		return (EAttribute)doEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoEvent_PeriodUpper() {
		return (EAttribute)doEventEClass.getEStructuralFeatures().get(2);
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
	public EClass getPrioritizable() {
		return prioritizableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrioritizable_Priority() {
		return (EAttribute)prioritizableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFujabaRealtimeStatechart() {
		return fujabaRealtimeStatechartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFujabaRealtimeStatechart_EmbeddingRegion() {
		return (EReference)fujabaRealtimeStatechartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFujabaRealtimeStatechart_Transitions() {
		return (EReference)fujabaRealtimeStatechartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFujabaRealtimeStatechart_Vertices() {
		return (EReference)fujabaRealtimeStatechartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFujabaRealtimeStatechart_Clocks() {
		return (EReference)fujabaRealtimeStatechartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFujabaRealtimeStatechart_AvailableClocks() {
		return (EAttribute)fujabaRealtimeStatechartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFujabaRealtimeStatechart_History() {
		return (EAttribute)fujabaRealtimeStatechartEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFujabaRealtimeStatechart_EventQueueSize() {
		return (EAttribute)fujabaRealtimeStatechartEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFujabaRealtimeStatechart_Flat() {
		return (EAttribute)fujabaRealtimeStatechartEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryOrExitPoint() {
		return entryOrExitPointEClass;
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
	public EClass getStateEntryOrExitPoint() {
		return stateEntryOrExitPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateEntryOrExitPoint_EntryOrExitPoint() {
		return (EReference)stateEntryOrExitPointEClass.getEStructuralFeatures().get(0);
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
	public EClass getStateEntryPoint() {
		return stateEntryPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateEntryPoint_EntryPoint() {
		return (EReference)stateEntryPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateExitPoint() {
		return stateExitPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateExitPoint_ExitPoint() {
		return (EReference)stateExitPointEClass.getEStructuralFeatures().get(0);
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
		createEReference(regionEClass, REGION__STATECHART);
		createEReference(regionEClass, REGION__PARENT_STATE);
		createEReference(regionEClass, REGION__VERTICES);
		createEReference(regionEClass, REGION__TRANSITIONS);
		createEReference(regionEClass, REGION__STATECHART_DERIVED);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__REGIONS);
		createEReference(stateEClass, STATE__DO_EVENT);
		createEReference(stateEClass, STATE__EXIT_EVENT);
		createEReference(stateEClass, STATE__ENTRY_EVENT);
		createEReference(stateEClass, STATE__INVARIANTS);
		createEAttribute(stateEClass, STATE__COMMITTED);
		createEAttribute(stateEClass, STATE__INITIAL);
		createEAttribute(stateEClass, STATE__FINAL);
		createEAttribute(stateEClass, STATE__URGENT);
		createEReference(stateEClass, STATE__CHANNELS);
		createEReference(stateEClass, STATE__EVENTS);
		createEReference(stateEClass, STATE__STATE_ENTRY_OR_EXIT_POINTS);
		createEAttribute(stateEClass, STATE__SIMPLE);

		vertexEClass = createEClass(VERTEX);
		createEReference(vertexEClass, VERTEX__OUTGOING_TRANSITIONS);
		createEReference(vertexEClass, VERTEX__INCOMING_TRANSITIONS);
		createEReference(vertexEClass, VERTEX__STATECHART);

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
		createEAttribute(transitionEClass, TRANSITION__URGENT);
		createEReference(transitionEClass, TRANSITION__GUARD);
		createEReference(transitionEClass, TRANSITION__EVENTS);
		createEReference(transitionEClass, TRANSITION__ACTION);

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
		createEAttribute(doEventEClass, DO_EVENT__PERIOD_LOWER);
		createEAttribute(doEventEClass, DO_EVENT__PERIOD_UPPER);

		entryOrExitEventEClass = createEClass(ENTRY_OR_EXIT_EVENT);
		createEReference(entryOrExitEventEClass, ENTRY_OR_EXIT_EVENT__CLOCK_RESETS);
		createEReference(entryOrExitEventEClass, ENTRY_OR_EXIT_EVENT__ACTION);

		synchronizationChannelEClass = createEClass(SYNCHRONIZATION_CHANNEL);
		createEReference(synchronizationChannelEClass, SYNCHRONIZATION_CHANNEL__STATE);

		synchronizationEClass = createEClass(SYNCHRONIZATION);
		createEReference(synchronizationEClass, SYNCHRONIZATION__SYNC_CHANNEL);
		createEAttribute(synchronizationEClass, SYNCHRONIZATION__KIND);

		prioritizableEClass = createEClass(PRIORITIZABLE);
		createEAttribute(prioritizableEClass, PRIORITIZABLE__PRIORITY);

		fujabaRealtimeStatechartEClass = createEClass(FUJABA_REALTIME_STATECHART);
		createEReference(fujabaRealtimeStatechartEClass, FUJABA_REALTIME_STATECHART__EMBEDDING_REGION);
		createEReference(fujabaRealtimeStatechartEClass, FUJABA_REALTIME_STATECHART__TRANSITIONS);
		createEReference(fujabaRealtimeStatechartEClass, FUJABA_REALTIME_STATECHART__VERTICES);
		createEReference(fujabaRealtimeStatechartEClass, FUJABA_REALTIME_STATECHART__CLOCKS);
		createEAttribute(fujabaRealtimeStatechartEClass, FUJABA_REALTIME_STATECHART__AVAILABLE_CLOCKS);
		createEAttribute(fujabaRealtimeStatechartEClass, FUJABA_REALTIME_STATECHART__HISTORY);
		createEAttribute(fujabaRealtimeStatechartEClass, FUJABA_REALTIME_STATECHART__EVENT_QUEUE_SIZE);
		createEAttribute(fujabaRealtimeStatechartEClass, FUJABA_REALTIME_STATECHART__FLAT);

		entryOrExitPointEClass = createEClass(ENTRY_OR_EXIT_POINT);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__KIND);

		transitionEventEClass = createEClass(TRANSITION_EVENT);

		stateEventEClass = createEClass(STATE_EVENT);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__INSTANCE_OF);

		stateEntryOrExitPointEClass = createEClass(STATE_ENTRY_OR_EXIT_POINT);
		createEReference(stateEntryOrExitPointEClass, STATE_ENTRY_OR_EXIT_POINT__ENTRY_OR_EXIT_POINT);

		entryEventEClass = createEClass(ENTRY_EVENT);

		exitEventEClass = createEClass(EXIT_EVENT);

		entryPointEClass = createEClass(ENTRY_POINT);

		exitPointEClass = createEClass(EXIT_POINT);

		stateEntryPointEClass = createEClass(STATE_ENTRY_POINT);
		createEReference(stateEntryPointEClass, STATE_ENTRY_POINT__ENTRY_POINT);

		stateExitPointEClass = createEClass(STATE_EXIT_POINT);
		createEReference(stateExitPointEClass, STATE_EXIT_POINT__EXIT_POINT);

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
		HelperPackage theHelperPackage = (HelperPackage)EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		SDMPackage theSDMPackage = (SDMPackage)EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		CallsPackage theCallsPackage = (CallsPackage)EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI);
		MsgifacePackage theMsgifacePackage = (MsgifacePackage)EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theHelperPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		absoluteDeadlineEClass.getESuperTypes().add(this.getDeadline());
		relativeDeadlineEClass.getESuperTypes().add(this.getDeadline());
		clockEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
		regionEClass.getESuperTypes().add(this.getPrioritizable());
		regionEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
		stateEClass.getESuperTypes().add(this.getVertex());
		vertexEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
		transitionEClass.getESuperTypes().add(this.getPrioritizable());
		transitionEClass.getESuperTypes().add(theSDMPackage.getExtendableElement());
		actionEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
		asynchronousMessageEventEClass.getESuperTypes().add(this.getTransitionEvent());
		doEventEClass.getESuperTypes().add(this.getStateEvent());
		entryOrExitEventEClass.getESuperTypes().add(this.getStateEvent());
		synchronizationChannelEClass.getESuperTypes().add(theCallsPackage.getCallable());
		synchronizationChannelEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
		synchronizationEClass.getESuperTypes().add(theCallsPackage.getInvocation());
		fujabaRealtimeStatechartEClass.getESuperTypes().add(theCorePackage.getAbstractRealtimeStatechart());
		entryOrExitPointEClass.getESuperTypes().add(this.getVertex());
		transitionEventEClass.getESuperTypes().add(this.getEvent());
		stateEventEClass.getESuperTypes().add(this.getEvent());
		messageEClass.getESuperTypes().add(theCallsPackage.getInvocation());
		stateEntryOrExitPointEClass.getESuperTypes().add(this.getVertex());
		entryEventEClass.getESuperTypes().add(this.getEntryOrExitEvent());
		exitEventEClass.getESuperTypes().add(this.getEntryOrExitEvent());
		entryPointEClass.getESuperTypes().add(this.getEntryOrExitPoint());
		exitPointEClass.getESuperTypes().add(this.getEntryOrExitPoint());
		stateEntryPointEClass.getESuperTypes().add(this.getStateEntryOrExitPoint());
		stateExitPointEClass.getESuperTypes().add(this.getStateEntryOrExitPoint());

		// Initialize classes and features; add operations and parameters
		initEClass(deadlineEClass, Deadline.class, "Deadline", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeadline_UpperBound(), theCorePackage.getNaturalNumber(), null, "upperBound", null, 0, 1, Deadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeadline_LowerBound(), theCorePackage.getNaturalNumber(), null, "lowerBound", null, 0, 1, Deadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absoluteDeadlineEClass, AbsoluteDeadline.class, "AbsoluteDeadline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbsoluteDeadline_Clock(), this.getClock(), null, "clock", null, 1, 1, AbsoluteDeadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativeDeadlineEClass, RelativeDeadline.class, "RelativeDeadline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clockEClass, Clock.class, "Clock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClock_Statechart(), this.getFujabaRealtimeStatechart(), this.getFujabaRealtimeStatechart_Clocks(), "statechart", null, 0, 1, Clock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegion_Statechart(), this.getFujabaRealtimeStatechart(), this.getFujabaRealtimeStatechart_EmbeddingRegion(), "statechart", null, 1, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_ParentState(), this.getState(), this.getState_Regions(), "parentState", null, 1, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_Vertices(), this.getVertex(), null, "vertices", null, 0, -1, Region.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, Region.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_StatechartDerived(), this.getFujabaRealtimeStatechart(), null, "statechartDerived", null, 1, 1, Region.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Regions(), this.getRegion(), this.getRegion_ParentState(), "regions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_DoEvent(), this.getDoEvent(), null, "doEvent", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_ExitEvent(), this.getExitEvent(), null, "exitEvent", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_EntryEvent(), this.getEntryEvent(), null, "entryEvent", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Invariants(), this.getClockConstraint(), null, "invariants", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Committed(), ecorePackage.getEBoolean(), "committed", "false", 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Initial(), ecorePackage.getEBoolean(), "initial", "false", 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Urgent(), ecorePackage.getEBoolean(), "urgent", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Channels(), this.getSynchronizationChannel(), this.getSynchronizationChannel_State(), "channels", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Events(), this.getStateEvent(), null, "events", null, 0, -1, State.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getState_StateEntryOrExitPoints(), this.getStateEntryOrExitPoint(), null, "stateEntryOrExitPoints", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Simple(), theEcorePackage.getEBoolean(), "simple", "false", 0, 1, State.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(vertexEClass, Vertex.class, "Vertex", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVertex_OutgoingTransitions(), this.getTransition(), this.getTransition_Source(), "outgoingTransitions", null, 0, -1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVertex_IncomingTransitions(), this.getTransition(), this.getTransition_Target(), "incomingTransitions", null, 0, -1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVertex_Statechart(), this.getFujabaRealtimeStatechart(), this.getFujabaRealtimeStatechart_Vertices(), "statechart", null, 0, 1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(vertexEClass, ecorePackage.getEBoolean(), "isSuperVertexOf", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVertex(), "vertex", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Synchronization(), this.getSynchronization(), null, "synchronization", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getVertex(), this.getVertex_IncomingTransitions(), "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getVertex(), this.getVertex_OutgoingTransitions(), "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Statechart(), this.getFujabaRealtimeStatechart(), this.getFujabaRealtimeStatechart_Transitions(), "statechart", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_ClockResets(), this.getClock(), null, "clockResets", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_TriggerMessageEvent(), this.getAsynchronousMessageEvent(), null, "triggerMessageEvent", null, 0, 1, Transition.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_RaiseMessageEvent(), this.getAsynchronousMessageEvent(), null, "raiseMessageEvent", null, 0, 1, Transition.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_ClockConstraints(), this.getClockConstraint(), null, "clockConstraints", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_AbsoluteDeadlines(), this.getAbsoluteDeadline(), null, "absoluteDeadlines", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_RelativeDeadline(), this.getRelativeDeadline(), null, "relativeDeadline", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Blockable(), ecorePackage.getEBoolean(), "blockable", "false", 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Urgent(), ecorePackage.getEBoolean(), "urgent", "true", 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Guard(), theExpressionsPackage.getExpression(), null, "guard", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Events(), this.getTransitionEvent(), null, "events", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Action(), this.getAction(), null, "action", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockConstraintEClass, ClockConstraint.class, "ClockConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClockConstraint_Bound(), theCorePackage.getNaturalNumber(), null, "bound", null, 1, 1, ClockConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClockConstraint_Clock(), this.getClock(), null, "clock", null, 1, 1, ClockConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClockConstraint_Operator(), theExpressionsPackage.getComparingOperator(), "operator", "ComparingOperator.LESS_OR_EQUAL", 1, 1, ClockConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Expressions(), theExpressionsPackage.getExpression(), null, "expressions", null, 1, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asynchronousMessageEventEClass, AsynchronousMessageEvent.class, "AsynchronousMessageEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAsynchronousMessageEvent_Message(), this.getMessage(), null, "message", null, 1, 1, AsynchronousMessageEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doEventEClass, DoEvent.class, "DoEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoEvent_Action(), this.getAction(), null, "action", null, 1, 1, DoEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoEvent_PeriodLower(), ecorePackage.getEInt(), "periodLower", null, 0, 1, DoEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoEvent_PeriodUpper(), ecorePackage.getEInt(), "periodUpper", null, 0, 1, DoEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryOrExitEventEClass, EntryOrExitEvent.class, "EntryOrExitEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryOrExitEvent_ClockResets(), this.getClock(), null, "clockResets", null, 0, -1, EntryOrExitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryOrExitEvent_Action(), this.getAction(), null, "action", null, 0, 1, EntryOrExitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronizationChannelEClass, SynchronizationChannel.class, "SynchronizationChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSynchronizationChannel_State(), this.getState(), this.getState_Channels(), "state", null, 1, 1, SynchronizationChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronizationEClass, Synchronization.class, "Synchronization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSynchronization_SyncChannel(), this.getSynchronizationChannel(), null, "syncChannel", null, 1, 1, Synchronization.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchronization_Kind(), this.getSynchronizationKind(), "kind", null, 1, 1, Synchronization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prioritizableEClass, Prioritizable.class, "Prioritizable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrioritizable_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Prioritizable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fujabaRealtimeStatechartEClass, FujabaRealtimeStatechart.class, "FujabaRealtimeStatechart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFujabaRealtimeStatechart_EmbeddingRegion(), this.getRegion(), this.getRegion_Statechart(), "embeddingRegion", null, 0, 1, FujabaRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFujabaRealtimeStatechart_Transitions(), this.getTransition(), this.getTransition_Statechart(), "transitions", null, 0, -1, FujabaRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFujabaRealtimeStatechart_Vertices(), this.getVertex(), this.getVertex_Statechart(), "vertices", null, 0, -1, FujabaRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFujabaRealtimeStatechart_Clocks(), this.getClock(), this.getClock_Statechart(), "clocks", null, 0, -1, FujabaRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFujabaRealtimeStatechart_AvailableClocks(), theHelperPackage.getIterator(), "availableClocks", null, 0, 1, FujabaRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFujabaRealtimeStatechart_History(), ecorePackage.getEBoolean(), "history", null, 0, 1, FujabaRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFujabaRealtimeStatechart_EventQueueSize(), ecorePackage.getEInt(), "eventQueueSize", null, 0, 1, FujabaRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFujabaRealtimeStatechart_Flat(), theEcorePackage.getEBoolean(), "flat", "false", 0, 1, FujabaRealtimeStatechart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = addEOperation(fujabaRealtimeStatechartEClass, ecorePackage.getEBoolean(), "isSuperStatechartOf", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFujabaRealtimeStatechart(), "statechart", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entryOrExitPointEClass, EntryOrExitPoint.class, "EntryOrExitPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Kind(), this.getEventKind(), "kind", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEventEClass, TransitionEvent.class, "TransitionEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateEventEClass, StateEvent.class, "StateEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessage_InstanceOf(), theMsgifacePackage.getMessageType(), null, "instanceOf", null, 1, 1, Message.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(stateEntryOrExitPointEClass, StateEntryOrExitPoint.class, "StateEntryOrExitPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateEntryOrExitPoint_EntryOrExitPoint(), this.getEntryOrExitPoint(), null, "entryOrExitPoint", null, 0, 1, StateEntryOrExitPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(entryEventEClass, EntryEvent.class, "EntryEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exitEventEClass, ExitEvent.class, "ExitEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entryPointEClass, EntryPoint.class, "EntryPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exitPointEClass, ExitPoint.class, "ExitPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateEntryPointEClass, StateEntryPoint.class, "StateEntryPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateEntryPoint_EntryPoint(), this.getEntryPoint(), null, "entryPoint", null, 0, 1, StateEntryPoint.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(stateExitPointEClass, StateExitPoint.class, "StateExitPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateExitPoint_ExitPoint(), this.getExitPoint(), null, "exitPoint", null, 0, 1, StateExitPoint.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
			 "constraints", "OneInvarianPerClock OneInitialState NoOutgoingTransitionOfFinalState NoRegionsOfFinalState UniquePrioritiesOfOutgoingTransitions UniquePrioritiesOfRegions UniqueChannelNames UniqueRegionNames BoundOfInvariantGreaterOrEqualZero"
		   });																							
		addAnnotation
		  (transitionEClass, 
		   source, 
		   new String[] {
			 "constraints", "SetTargetAndSource NoCrossingOfRegionBorders"
		   });																																													
		addAnnotation
		  (fujabaRealtimeStatechartEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueNameOfStates MinOneState"
		   });																											
		addAnnotation
		  (entryPointEClass, 
		   source, 
		   new String[] {
			 "constraints", "OneOutgoingTransition"
		   });				
		addAnnotation
		  (exitPointEClass, 
		   source, 
		   new String[] {
			 "constraints", "AtMostOneOutgoingTransition"
		   });				
		addAnnotation
		  (stateEntryPointEClass, 
		   source, 
		   new String[] {
			 "constraints", "AtLeastOneIncomingTransition"
		   });						
		addAnnotation
		  (stateExitPointEClass, 
		   source, 
		   new String[] {
			 "constraints", "OneOutgoingTransition"
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
		  (getRegion_Vertices(), 
		   source, 
		   new String[] {
			 "derivation", "-- we only derive the statechart, if it is no super statechart of our parentState\'s statechart\n-- this ensures that no endless recursion happens, when creating child-editparts for the states.\n\nif self.statechart.oclIsUndefined() or self.statechart.isSuperStatechartOf(self.parentState.statechart) then\r\n\tOrderedSet { }\r\nelse\r\n\tself.statechart.vertices\r\nendif"
		   });			
		addAnnotation
		  (getRegion_Transitions(), 
		   source, 
		   new String[] {
			 "derivation", "-- we only derive the statechart, if it is no super statechart of our parentState\'s statechart\n-- this ensures that no endless recursion happens, when creating child-editparts for the states.\n\nif self.statechart.oclIsUndefined() or self.statechart.isSuperStatechartOf(self.parentState.statechart) then\r\n\tOrderedSet { }\r\nelse\r\n\tself.statechart.transitions\r\nendif"
		   });			
		addAnnotation
		  (getRegion_StatechartDerived(), 
		   source, 
		   new String[] {
			 "derivation", "-- we only derive the statechart, if it is no super statechart of our parentState\'s statechart\r\n-- this ensures that no endless recursion happens, when creating child-editparts for the states.\r\n\r\nif self.statechart.oclIsUndefined() or self.statechart.isSuperStatechartOf(self.parentState.statechart) then\r\r\n\tnull\r\r\nelse\r\r\n\tself.statechart\r\r\nendif"
		   });				
		addAnnotation
		  (stateEClass, 
		   source, 
		   new String[] {
			 "OneInvarianPerClock", "self.invariants->isUnique(clock)",
			 "OneInitialState", "self.statechart.vertices.oclAsType(State)->one(s|  s.initial)",
			 "NoOutgoingTransitionOfFinalState", "self.final implies self.outgoingTransitions->isEmpty()",
			 "NoRegionsOfFinalState", "self.final implies self.regions->isEmpty()",
			 "UniquePrioritiesOfOutgoingTransitions", "self.outgoingTransitions->isUnique(priority) ",
			 "UniquePrioritiesOfRegions", "self.regions->isUnique(priority)",
			 "UniqueChannelNames", "self.channels->isUnique(name)",
			 "UniqueRegionNames", "self.regions->isUnique(name)",
			 "BoundOfInvariantGreaterOrEqualZero", "self.invariants->forAll(bound.value >= 0)"
		   });												
		addAnnotation
		  (getState_Events(), 
		   source, 
		   new String[] {
			 "derivation", "(entryEvent.oclAsType(StateEvent) -> asSet() -> union(exitEvent.oclAsType(StateEvent) -> asSet())) -> union(doEvent.oclAsType(StateEvent) -> asSet())"
		   });				
		addAnnotation
		  (getState_Simple(), 
		   source, 
		   new String[] {
			 "derivation", "regions -> isEmpty()"
		   });									
		addAnnotation
		  (transitionEClass, 
		   source, 
		   new String[] {
			 "SetTargetAndSource", "self.target->notEmpty() and self.source->notEmpty()",
			 "NoCrossingOfRegionBorders", "self.source.statechart.embeddingRegion=self.target.statechart.embeddingRegion or\r\nself.source.oclAsType(StateEntryPoint).statechart.embeddingRegion=\r\nself.target.statechart.embeddingRegion.parentState.statechart.embeddingRegion  or \t\t\t\t\r\nself.source.statechart.embeddingRegion.parentState.statechart.embeddingRegion=\r\nself.target.oclAsType(StateExitPoint).statechart.embeddingRegion",
			 "EntryPointMustOnlyPointToStatesOrStateEntryPoints", "not (self.source.oclIsKindOf(EntryPoint) and (not self.target.oclIsKindOf(State) and not self.target.oclIsKindOf(StateEntryPoint)))",
			 "ExitPointMustOnlyPointToStatesOrStateExitPoints", "not (self.source.oclIsKindOf(ExitPoint) and (not self.target.oclIsKindOf(State) and not self.target.oclIsKindOf(StateExitPoint)))",
			 "TriggerMessageEventsMustNotHaveAnOwnedParameterBinding", "self.triggerMessageEvent.message.ownedParameterBindings->isEmpty()"
		   });								
		addAnnotation
		  (getTransition_TriggerMessageEvent(), 
		   source, 
		   new String[] {
			 "derivation", "self.events->select(e | e.oclIsKindOf(AsynchronousMessageEvent) and e.kind=EventKind::TRIGGER).oclAsType(AsynchronousMessageEvent)->first()\n"
		   });			
		addAnnotation
		  (getTransition_RaiseMessageEvent(), 
		   source, 
		   new String[] {
			 "derivation", "self.events->select(e | e.oclIsKindOf(AsynchronousMessageEvent) and e.kind=EventKind::RAISE).oclAsType(AsynchronousMessageEvent)->first()\n"
		   });																												
		addAnnotation
		  (getSynchronization_SyncChannel(), 
		   source, 
		   new String[] {
			 "derivation", "callee.oclAsType(SynchronizationChannel)"
		   });						
		addAnnotation
		  (fujabaRealtimeStatechartEClass, 
		   source, 
		   new String[] {
			 "UniqueNameOfStates", "self.vertices.oclAsType(State)->isUnique(name) ",
			 "MinOneState", "self.vertices.oclAsType(State)->notEmpty()"
		   });									
		addAnnotation
		  (getFujabaRealtimeStatechart_Flat(), 
		   source, 
		   new String[] {
			 "derivation", "not(vertices -> exists( v : Vertex | v.oclIsTypeOf(State) implies v.oclAsType(State).regions -> notEmpty()))"
		   });													
		addAnnotation
		  (getMessage_InstanceOf(), 
		   source, 
		   new String[] {
			 "derivation", "callee.oclAsType(msgiface::MessageType)"
		   });										
		addAnnotation
		  (entryPointEClass, 
		   source, 
		   new String[] {
			 "OneOutgoingTransition", "self.outgoingTransitions->size() = 1"
		   });				
		addAnnotation
		  (exitPointEClass, 
		   source, 
		   new String[] {
			 "AtMostOneOutgoingTransition", "self.outgoingTransitions->size() <= 1"
		   });				
		addAnnotation
		  (stateEntryPointEClass, 
		   source, 
		   new String[] {
			 "AtLeastOneIncomingTransition", "self.incomingTransitions ->size()>0"
		   });		
		addAnnotation
		  (getStateEntryPoint_EntryPoint(), 
		   source, 
		   new String[] {
			 "derivation", "entryOrExitPoint.oclAsType(realtimestatechart::EntryPoint)"
		   });					
		addAnnotation
		  (stateExitPointEClass, 
		   source, 
		   new String[] {
			 "OneOutgoingTransition", "self.outgoingTransitions->size() = 1"
		   });		
		addAnnotation
		  (getStateExitPoint_ExitPoint(), 
		   source, 
		   new String[] {
			 "derivation", "entryOrExitPoint.oclAsType(realtimestatechart::ExitPoint)"
		   });	
	}

} //RealtimestatechartPackageImpl
