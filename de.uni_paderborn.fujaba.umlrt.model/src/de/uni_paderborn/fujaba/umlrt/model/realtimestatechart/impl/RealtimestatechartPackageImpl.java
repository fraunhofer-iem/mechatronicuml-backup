/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.behavior.BehaviorPackage;

import de.uni_paderborn.fujaba.umlrt.model.behavior.impl.BehaviorPackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage;

import de.uni_paderborn.fujaba.umlrt.model.component.impl.ComponentPackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintPackage;

import de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;

import de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage;

import de.uni_paderborn.fujaba.umlrt.model.instance.impl.InstancePackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifacePackage;

import de.uni_paderborn.fujaba.umlrt.model.msgiface.impl.MsgifacePackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage;

import de.uni_paderborn.fujaba.umlrt.model.pattern.impl.PatternPackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Deadline;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryKind;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInterfaceStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInvariantAtom;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStartState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStopState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLTimeguardAtom;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.HelperPackage;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.impl.HelperPackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
	private EClass umlClockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlRealtimeComplexStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlInterfaceStatechartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlInvariantAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlRealtimeActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlRealtimeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlRealtimeFadingFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlRealtimeFlatSwitchingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlRealtimeStartStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlRealtimeStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlRealtimeStatechartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlRealtimeStopStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlRealtimeTransitionEClass = null;

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
	private EClass umlTimeguardAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyStateEClass = null;

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
	private EClass synchronizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum historyKindEEnum = null;

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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#eNS_URI
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
		SDMPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
		ReconfPackageImpl theReconfPackage = (ReconfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReconfPackage.eNS_URI) instanceof ReconfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReconfPackage.eNS_URI) : ReconfPackage.eINSTANCE);
		HelperPackageImpl theHelperPackage = (HelperPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI) instanceof HelperPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI) : HelperPackage.eINSTANCE);
		MsgifacePackageImpl theMsgifacePackage = (MsgifacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI) instanceof MsgifacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI) : MsgifacePackage.eINSTANCE);

		// Create package meta-data objects
		theRealtimestatechartPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theInstancePackage.createPackageContents();
		thePatternPackage.createPackageContents();
		theReconfPackage.createPackageContents();
		theHelperPackage.createPackageContents();
		theMsgifacePackage.createPackageContents();

		// Initialize created meta-data
		theRealtimestatechartPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		thePatternPackage.initializePackageContents();
		theReconfPackage.initializePackageContents();
		theHelperPackage.initializePackageContents();
		theMsgifacePackage.initializePackageContents();

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
	public EReference getAbsoluteDeadline_UMLRealtimeTransition() {
		return (EReference)absoluteDeadlineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbsoluteDeadline_UMLClock() {
		return (EReference)absoluteDeadlineEClass.getEStructuralFeatures().get(1);
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
	public EReference getRelativeDeadline_UMLRealtimeTransition() {
		return (EReference)relativeDeadlineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLClock() {
		return umlClockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLClock_Id() {
		return (EAttribute)umlClockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLClock_AbsoluteDeadlines() {
		return (EReference)umlClockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLClock_UMLRealtimeStatechart() {
		return (EReference)umlClockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLClock_Resets() {
		return (EReference)umlClockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLClock__ToString() {
		return umlClockEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLClock__Clone__UMLRealtimeStatechart_UMLClock() {
		return umlClockEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLRealtimeComplexState() {
		return umlRealtimeComplexStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeComplexState_UMLRealtimeStatecharts() {
		return (EReference)umlRealtimeComplexStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeComplexState_DoAction() {
		return (EReference)umlRealtimeComplexStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeComplexState_ExitAction() {
		return (EReference)umlRealtimeComplexStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeComplexState_EntryAction() {
		return (EReference)umlRealtimeComplexStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeComplexState_ReconfDiagram() {
		return (EReference)umlRealtimeComplexStateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeComplexState_InterfacedStates() {
		return (EReference)umlRealtimeComplexStateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeComplexState_InterfaceState() {
		return (EReference)umlRealtimeComplexStateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeComplexState_Invariants() {
		return (EReference)umlRealtimeComplexStateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeComplexState_Committed() {
		return (EAttribute)umlRealtimeComplexStateEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeComplexState_Channels() {
		return (EReference)umlRealtimeComplexStateEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeComplexState__Clone__UMLRealtimeStatechart_UMLRealtimeComplexState() {
		return umlRealtimeComplexStateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLInterfaceStatechart() {
		return umlInterfaceStatechartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLInterfaceStatechart_UMLRealtimeStatechart() {
		return (EReference)umlInterfaceStatechartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLInvariantAtom() {
		return umlInvariantAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLInvariantAtom_UMLComplexRealtimeState() {
		return (EReference)umlInvariantAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLInvariantAtom__Clone__UMLRealtimeStatechart_UMLInvariantAtom() {
		return umlInvariantAtomEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLRealtimeAction() {
		return umlRealtimeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeAction_Id() {
		return (EAttribute)umlRealtimeActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeAction_Wcet() {
		return (EAttribute)umlRealtimeActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeAction_Blocking() {
		return (EAttribute)umlRealtimeActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeAction_UMLRealtimeTransition() {
		return (EReference)umlRealtimeActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeAction_Resets() {
		return (EReference)umlRealtimeActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeAction_WCETSpecifiedByUser() {
		return (EAttribute)umlRealtimeActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeAction__Clone__UMLRealtimeStatechart_UMLRealtimeAction() {
		return umlRealtimeActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLRealtimeEvent() {
		return umlRealtimeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeEvent_TriggeredUMLRealtimeTransition() {
		return (EReference)umlRealtimeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeEvent_RaisedUMLRealtimeTransition() {
		return (EReference)umlRealtimeEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeEvent_Instance() {
		return (EAttribute)umlRealtimeEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeEvent_Name() {
		return (EAttribute)umlRealtimeEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeEvent_FullEventName() {
		return (EAttribute)umlRealtimeEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeEvent__Clone__UMLRealtimeStatechart_UMLRealtimeEvent() {
		return umlRealtimeEventEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeEvent__ToString() {
		return umlRealtimeEventEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLRealtimeFadingFunction() {
		return umlRealtimeFadingFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeFadingFunction_Function() {
		return (EAttribute)umlRealtimeFadingFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeFadingFunction_UMLRealtimeTransitions() {
		return (EReference)umlRealtimeFadingFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeFadingFunction_MinDuration() {
		return (EAttribute)umlRealtimeFadingFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeFadingFunction_MaxDuration() {
		return (EAttribute)umlRealtimeFadingFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeFadingFunction_Spline1() {
		return (EAttribute)umlRealtimeFadingFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeFadingFunction_Spline2() {
		return (EAttribute)umlRealtimeFadingFunctionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeFadingFunction_PolynomDegree() {
		return (EAttribute)umlRealtimeFadingFunctionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeFadingFunction_PortsByComponentInstance() {
		return (EReference)umlRealtimeFadingFunctionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeFadingFunction_PortInstToPortInstMapEntry() {
		return (EAttribute)umlRealtimeFadingFunctionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeFadingFunction__GetBreakpoint() {
		return umlRealtimeFadingFunctionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLRealtimeFlatSwitching() {
		return umlRealtimeFlatSwitchingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeFlatSwitching_UMLRealtimeTransitions() {
		return (EReference)umlRealtimeFlatSwitchingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeFlatSwitching_MinDuration() {
		return (EAttribute)umlRealtimeFlatSwitchingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeFlatSwitching_MaxDuration() {
		return (EAttribute)umlRealtimeFlatSwitchingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeFlatSwitching_Spline1() {
		return (EAttribute)umlRealtimeFlatSwitchingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeFlatSwitching_Spline2() {
		return (EAttribute)umlRealtimeFlatSwitchingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeFlatSwitching_PolynomDegree() {
		return (EAttribute)umlRealtimeFlatSwitchingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeFlatSwitching_PortInstToPortInstMapEntry() {
		return (EAttribute)umlRealtimeFlatSwitchingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeFlatSwitching__GetBreakpoint() {
		return umlRealtimeFlatSwitchingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLRealtimeStartState() {
		return umlRealtimeStartStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeStartState_UMLRealtimeStartStateRev() {
		return (EReference)umlRealtimeStartStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeStartState__GetNextState() {
		return umlRealtimeStartStateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeStartState__Clone__UMLRealtimeStatechart_UMLRealtimeStartState() {
		return umlRealtimeStartStateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLRealtimeState() {
		return umlRealtimeStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeState_OutgoingUMLRealtimeTransitions() {
		return (EReference)umlRealtimeStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeState_IncomingUMLRealtimeTransitions() {
		return (EReference)umlRealtimeStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeState_UMLRealtimeStatechart() {
		return (EReference)umlRealtimeStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeState__GetLongName() {
		return umlRealtimeStateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeState__GetRootRealtimeStatechart() {
		return umlRealtimeStateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLRealtimeStatechart() {
		return umlRealtimeStatechartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeStatechart_EventQueueSize() {
		return (EAttribute)umlRealtimeStatechartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeStatechart_WcetDocument() {
		return (EAttribute)umlRealtimeStatechartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeStatechart_SecurityLevel() {
		return (EAttribute)umlRealtimeStatechartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeStatechart_SystemWcetMap() {
		return (EAttribute)umlRealtimeStatechartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeStatechart_Utilisation() {
		return (EAttribute)umlRealtimeStatechartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeStatechart_ScheduleDocument() {
		return (EAttribute)umlRealtimeStatechartEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeStatechart_UMLRealtimeStartState() {
		return (EReference)umlRealtimeStatechartEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeStatechart_UMLComplexRealtimeState() {
		return (EReference)umlRealtimeStatechartEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeStatechart_UMLRealtimeTransitions() {
		return (EReference)umlRealtimeStatechartEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeStatechart_UMLRealtimeStates() {
		return (EReference)umlRealtimeStatechartEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeStatechart_EClass() {
		return (EReference)umlRealtimeStatechartEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeStatechart_UMLInterfaceStatechart() {
		return (EReference)umlRealtimeStatechartEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeStatechart_BehavioralElement() {
		return (EReference)umlRealtimeStatechartEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeStatechart_ProvidedMsgIFace() {
		return (EReference)umlRealtimeStatechartEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeStatechart_RequiredMsgIFace() {
		return (EReference)umlRealtimeStatechartEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeStatechart_IsEmbedded() {
		return (EAttribute)umlRealtimeStatechartEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeStatechart_UMLClocks() {
		return (EReference)umlRealtimeStatechartEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeStatechart__GetHighestParentStatechart() {
		return umlRealtimeStatechartEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeStatechart__IteratorOfAllSubRealtimeStatecharts() {
		return umlRealtimeStatechartEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeStatechart__AddAllUMLRealtimeStates__Set_boolean() {
		return umlRealtimeStatechartEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeStatechart__AddComplexUMLRealtimeStates__Set() {
		return umlRealtimeStatechartEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeStatechart__AddAllUMLRealtimeTransitions__Set() {
		return umlRealtimeStatechartEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeStatechart__IteratorOfAllUMLClocks__boolean() {
		return umlRealtimeStatechartEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeStatechart__AddAllUMLClocks__Set_boolean() {
		return umlRealtimeStatechartEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeStatechart__ToString() {
		return umlRealtimeStatechartEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeStatechart__Clone() {
		return umlRealtimeStatechartEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLRealtimeStopState() {
		return umlRealtimeStopStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeStopState__Clone__UMLRealtimeStatechart_UMLRealtimeStopState() {
		return umlRealtimeStopStateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLRealtimeTransition() {
		return umlRealtimeTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeTransition_UMLRealtimeTransitionMappingVector() {
		return (EAttribute)umlRealtimeTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeTransition_Priority() {
		return (EAttribute)umlRealtimeTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeTransition_SendSynchronization() {
		return (EReference)umlRealtimeTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeTransition_ReceiveSynchronization() {
		return (EReference)umlRealtimeTransitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeTransition_SideEffect() {
		return (EReference)umlRealtimeTransitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeTransition_TargetUMLRealtimeState() {
		return (EReference)umlRealtimeTransitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeTransition_SourceUMLRealtimeState() {
		return (EReference)umlRealtimeTransitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeTransition_UMLRealtimeStatechart() {
		return (EReference)umlRealtimeTransitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeTransition_Resets() {
		return (EReference)umlRealtimeTransitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeTransition_UMLRealtimeFlatSwitching() {
		return (EReference)umlRealtimeTransitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeTransition_UMLRealtimeFadingFunction() {
		return (EReference)umlRealtimeTransitionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeTransition_TriggerEvents() {
		return (EReference)umlRealtimeTransitionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeTransition_RaisedEvents() {
		return (EReference)umlRealtimeTransitionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeTransition_Timeguard() {
		return (EReference)umlRealtimeTransitionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeTransition_AbsoluteDeadlines() {
		return (EReference)umlRealtimeTransitionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeTransition_RelativeDeadline() {
		return (EReference)umlRealtimeTransitionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLRealtimeTransition_Urgent() {
		return (EAttribute)umlRealtimeTransitionEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLRealtimeTransition_Guard() {
		return (EReference)umlRealtimeTransitionEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeTransition__HasClockInUMLClockResetAtom__UMLClock() {
		return umlRealtimeTransitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeTransition__CalculateWorstCaseDeadlineAsNaturalNumber() {
		return umlRealtimeTransitionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeTransition__GetDefaultName() {
		return umlRealtimeTransitionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeTransition__ResetsClock__UMLClock() {
		return umlRealtimeTransitionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLRealtimeTransition__Clone__UMLRealtimeStatechart_UMLRealtimeTransition() {
		return umlRealtimeTransitionEClass.getEOperations().get(4);
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
	public EReference getSynchronizationChannel_UMLRealtimeComplexState() {
		return (EReference)synchronizationChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSynchronizationChannel__Clone__UMLRealtimeStatechart_SynchronizationChannel() {
		return synchronizationChannelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLTimeguardAtom() {
		return umlTimeguardAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUMLTimeguardAtom__Clone__UMLRealtimeStatechart_UMLTimeguardAtom() {
		return umlTimeguardAtomEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryState() {
		return historyStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistoryState_Kind() {
		return (EAttribute)historyStateEClass.getEStructuralFeatures().get(0);
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
	public EReference getDoEvent_UMLRealtimeAction() {
		return (EReference)doEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoEvent_DoActionRev() {
		return (EReference)doEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoEvent_PeriodLower() {
		return (EAttribute)doEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoEvent_PeriodUpper() {
		return (EAttribute)doEventEClass.getEStructuralFeatures().get(3);
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
	public EReference getEntryOrExitEvent_Resets() {
		return (EReference)entryOrExitEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryOrExitEvent_EntryActionRev() {
		return (EReference)entryOrExitEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryOrExitEvent_ExitActionRev() {
		return (EReference)entryOrExitEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryOrExitEvent_UMLRealtimeAction() {
		return (EReference)entryOrExitEventEClass.getEStructuralFeatures().get(3);
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
	public EReference getSynchronization_SendSyncRev() {
		return (EReference)synchronizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronization_ReceiveSyncRev() {
		return (EReference)synchronizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHistoryKind() {
		return historyKindEEnum;
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
		createEReference(absoluteDeadlineEClass, ABSOLUTE_DEADLINE__UML_REALTIME_TRANSITION);
		createEReference(absoluteDeadlineEClass, ABSOLUTE_DEADLINE__UML_CLOCK);

		relativeDeadlineEClass = createEClass(RELATIVE_DEADLINE);
		createEReference(relativeDeadlineEClass, RELATIVE_DEADLINE__UML_REALTIME_TRANSITION);

		umlClockEClass = createEClass(UML_CLOCK);
		createEAttribute(umlClockEClass, UML_CLOCK__ID);
		createEReference(umlClockEClass, UML_CLOCK__ABSOLUTE_DEADLINES);
		createEReference(umlClockEClass, UML_CLOCK__UML_REALTIME_STATECHART);
		createEReference(umlClockEClass, UML_CLOCK__RESETS);
		createEOperation(umlClockEClass, UML_CLOCK___TO_STRING);
		createEOperation(umlClockEClass, UML_CLOCK___CLONE__UMLREALTIMESTATECHART_UMLCLOCK);

		umlRealtimeComplexStateEClass = createEClass(UML_REALTIME_COMPLEX_STATE);
		createEReference(umlRealtimeComplexStateEClass, UML_REALTIME_COMPLEX_STATE__UML_REALTIME_STATECHARTS);
		createEReference(umlRealtimeComplexStateEClass, UML_REALTIME_COMPLEX_STATE__DO_ACTION);
		createEReference(umlRealtimeComplexStateEClass, UML_REALTIME_COMPLEX_STATE__EXIT_ACTION);
		createEReference(umlRealtimeComplexStateEClass, UML_REALTIME_COMPLEX_STATE__ENTRY_ACTION);
		createEReference(umlRealtimeComplexStateEClass, UML_REALTIME_COMPLEX_STATE__RECONF_DIAGRAM);
		createEReference(umlRealtimeComplexStateEClass, UML_REALTIME_COMPLEX_STATE__INTERFACED_STATES);
		createEReference(umlRealtimeComplexStateEClass, UML_REALTIME_COMPLEX_STATE__INTERFACE_STATE);
		createEReference(umlRealtimeComplexStateEClass, UML_REALTIME_COMPLEX_STATE__INVARIANTS);
		createEAttribute(umlRealtimeComplexStateEClass, UML_REALTIME_COMPLEX_STATE__COMMITTED);
		createEReference(umlRealtimeComplexStateEClass, UML_REALTIME_COMPLEX_STATE__CHANNELS);
		createEOperation(umlRealtimeComplexStateEClass, UML_REALTIME_COMPLEX_STATE___CLONE__UMLREALTIMESTATECHART_UMLREALTIMECOMPLEXSTATE);

		umlInterfaceStatechartEClass = createEClass(UML_INTERFACE_STATECHART);
		createEReference(umlInterfaceStatechartEClass, UML_INTERFACE_STATECHART__UML_REALTIME_STATECHART);

		umlInvariantAtomEClass = createEClass(UML_INVARIANT_ATOM);
		createEReference(umlInvariantAtomEClass, UML_INVARIANT_ATOM__UML_COMPLEX_REALTIME_STATE);
		createEOperation(umlInvariantAtomEClass, UML_INVARIANT_ATOM___CLONE__UMLREALTIMESTATECHART_UMLINVARIANTATOM);

		umlRealtimeActionEClass = createEClass(UML_REALTIME_ACTION);
		createEAttribute(umlRealtimeActionEClass, UML_REALTIME_ACTION__ID);
		createEAttribute(umlRealtimeActionEClass, UML_REALTIME_ACTION__WCET);
		createEAttribute(umlRealtimeActionEClass, UML_REALTIME_ACTION__BLOCKING);
		createEReference(umlRealtimeActionEClass, UML_REALTIME_ACTION__UML_REALTIME_TRANSITION);
		createEReference(umlRealtimeActionEClass, UML_REALTIME_ACTION__RESETS);
		createEAttribute(umlRealtimeActionEClass, UML_REALTIME_ACTION__WCET_SPECIFIED_BY_USER);
		createEOperation(umlRealtimeActionEClass, UML_REALTIME_ACTION___CLONE__UMLREALTIMESTATECHART_UMLREALTIMEACTION);

		umlRealtimeEventEClass = createEClass(UML_REALTIME_EVENT);
		createEReference(umlRealtimeEventEClass, UML_REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION);
		createEReference(umlRealtimeEventEClass, UML_REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION);
		createEAttribute(umlRealtimeEventEClass, UML_REALTIME_EVENT__INSTANCE);
		createEAttribute(umlRealtimeEventEClass, UML_REALTIME_EVENT__NAME);
		createEAttribute(umlRealtimeEventEClass, UML_REALTIME_EVENT__FULL_EVENT_NAME);
		createEOperation(umlRealtimeEventEClass, UML_REALTIME_EVENT___CLONE__UMLREALTIMESTATECHART_UMLREALTIMEEVENT);
		createEOperation(umlRealtimeEventEClass, UML_REALTIME_EVENT___TO_STRING);

		umlRealtimeFadingFunctionEClass = createEClass(UML_REALTIME_FADING_FUNCTION);
		createEAttribute(umlRealtimeFadingFunctionEClass, UML_REALTIME_FADING_FUNCTION__FUNCTION);
		createEReference(umlRealtimeFadingFunctionEClass, UML_REALTIME_FADING_FUNCTION__UML_REALTIME_TRANSITIONS);
		createEAttribute(umlRealtimeFadingFunctionEClass, UML_REALTIME_FADING_FUNCTION__MIN_DURATION);
		createEAttribute(umlRealtimeFadingFunctionEClass, UML_REALTIME_FADING_FUNCTION__MAX_DURATION);
		createEAttribute(umlRealtimeFadingFunctionEClass, UML_REALTIME_FADING_FUNCTION__SPLINE1);
		createEAttribute(umlRealtimeFadingFunctionEClass, UML_REALTIME_FADING_FUNCTION__SPLINE2);
		createEAttribute(umlRealtimeFadingFunctionEClass, UML_REALTIME_FADING_FUNCTION__POLYNOM_DEGREE);
		createEReference(umlRealtimeFadingFunctionEClass, UML_REALTIME_FADING_FUNCTION__PORTS_BY_COMPONENT_INSTANCE);
		createEAttribute(umlRealtimeFadingFunctionEClass, UML_REALTIME_FADING_FUNCTION__PORT_INST_TO_PORT_INST_MAP_ENTRY);
		createEOperation(umlRealtimeFadingFunctionEClass, UML_REALTIME_FADING_FUNCTION___GET_BREAKPOINT);

		umlRealtimeFlatSwitchingEClass = createEClass(UML_REALTIME_FLAT_SWITCHING);
		createEReference(umlRealtimeFlatSwitchingEClass, UML_REALTIME_FLAT_SWITCHING__UML_REALTIME_TRANSITIONS);
		createEAttribute(umlRealtimeFlatSwitchingEClass, UML_REALTIME_FLAT_SWITCHING__MIN_DURATION);
		createEAttribute(umlRealtimeFlatSwitchingEClass, UML_REALTIME_FLAT_SWITCHING__MAX_DURATION);
		createEAttribute(umlRealtimeFlatSwitchingEClass, UML_REALTIME_FLAT_SWITCHING__SPLINE1);
		createEAttribute(umlRealtimeFlatSwitchingEClass, UML_REALTIME_FLAT_SWITCHING__SPLINE2);
		createEAttribute(umlRealtimeFlatSwitchingEClass, UML_REALTIME_FLAT_SWITCHING__POLYNOM_DEGREE);
		createEAttribute(umlRealtimeFlatSwitchingEClass, UML_REALTIME_FLAT_SWITCHING__PORT_INST_TO_PORT_INST_MAP_ENTRY);
		createEOperation(umlRealtimeFlatSwitchingEClass, UML_REALTIME_FLAT_SWITCHING___GET_BREAKPOINT);

		umlRealtimeStartStateEClass = createEClass(UML_REALTIME_START_STATE);
		createEReference(umlRealtimeStartStateEClass, UML_REALTIME_START_STATE__UML_REALTIME_START_STATE_REV);
		createEOperation(umlRealtimeStartStateEClass, UML_REALTIME_START_STATE___GET_NEXT_STATE);
		createEOperation(umlRealtimeStartStateEClass, UML_REALTIME_START_STATE___CLONE__UMLREALTIMESTATECHART_UMLREALTIMESTARTSTATE);

		umlRealtimeStateEClass = createEClass(UML_REALTIME_STATE);
		createEReference(umlRealtimeStateEClass, UML_REALTIME_STATE__OUTGOING_UML_REALTIME_TRANSITIONS);
		createEReference(umlRealtimeStateEClass, UML_REALTIME_STATE__INCOMING_UML_REALTIME_TRANSITIONS);
		createEReference(umlRealtimeStateEClass, UML_REALTIME_STATE__UML_REALTIME_STATECHART);
		createEOperation(umlRealtimeStateEClass, UML_REALTIME_STATE___GET_LONG_NAME);
		createEOperation(umlRealtimeStateEClass, UML_REALTIME_STATE___GET_ROOT_REALTIME_STATECHART);

		umlRealtimeStatechartEClass = createEClass(UML_REALTIME_STATECHART);
		createEAttribute(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART__EVENT_QUEUE_SIZE);
		createEAttribute(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART__WCET_DOCUMENT);
		createEAttribute(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART__SECURITY_LEVEL);
		createEAttribute(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART__SYSTEM_WCET_MAP);
		createEAttribute(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART__UTILISATION);
		createEAttribute(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART__SCHEDULE_DOCUMENT);
		createEReference(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART__UML_REALTIME_START_STATE);
		createEReference(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART__UML_COMPLEX_REALTIME_STATE);
		createEReference(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART__UML_REALTIME_TRANSITIONS);
		createEReference(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART__UML_REALTIME_STATES);
		createEReference(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART__ECLASS);
		createEReference(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART__UML_INTERFACE_STATECHART);
		createEReference(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART__BEHAVIORAL_ELEMENT);
		createEReference(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART__PROVIDED_MSG_IFACE);
		createEReference(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART__REQUIRED_MSG_IFACE);
		createEAttribute(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART__IS_EMBEDDED);
		createEReference(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART__UML_CLOCKS);
		createEOperation(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART___GET_HIGHEST_PARENT_STATECHART);
		createEOperation(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART___ITERATOR_OF_ALL_SUB_REALTIME_STATECHARTS);
		createEOperation(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART___ADD_ALL_UML_REALTIME_STATES__SET_BOOLEAN);
		createEOperation(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART___ADD_COMPLEX_UML_REALTIME_STATES__SET);
		createEOperation(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART___ADD_ALL_UML_REALTIME_TRANSITIONS__SET);
		createEOperation(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART___ITERATOR_OF_ALL_UML_CLOCKS__BOOLEAN);
		createEOperation(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART___ADD_ALL_UML_CLOCKS__SET_BOOLEAN);
		createEOperation(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART___TO_STRING);
		createEOperation(umlRealtimeStatechartEClass, UML_REALTIME_STATECHART___CLONE);

		umlRealtimeStopStateEClass = createEClass(UML_REALTIME_STOP_STATE);
		createEOperation(umlRealtimeStopStateEClass, UML_REALTIME_STOP_STATE___CLONE__UMLREALTIMESTATECHART_UMLREALTIMESTOPSTATE);

		umlRealtimeTransitionEClass = createEClass(UML_REALTIME_TRANSITION);
		createEAttribute(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION__UML_REALTIME_TRANSITION_MAPPING_VECTOR);
		createEAttribute(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION__PRIORITY);
		createEReference(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION__SEND_SYNCHRONIZATION);
		createEReference(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION__RECEIVE_SYNCHRONIZATION);
		createEReference(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION__SIDE_EFFECT);
		createEReference(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION__TARGET_UML_REALTIME_STATE);
		createEReference(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION__SOURCE_UML_REALTIME_STATE);
		createEReference(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION__UML_REALTIME_STATECHART);
		createEReference(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION__RESETS);
		createEReference(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION__UML_REALTIME_FLAT_SWITCHING);
		createEReference(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION__UML_REALTIME_FADING_FUNCTION);
		createEReference(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION__TRIGGER_EVENTS);
		createEReference(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION__RAISED_EVENTS);
		createEReference(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION__TIMEGUARD);
		createEReference(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION__ABSOLUTE_DEADLINES);
		createEReference(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION__RELATIVE_DEADLINE);
		createEAttribute(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION__URGENT);
		createEReference(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION__GUARD);
		createEOperation(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION___HAS_CLOCK_IN_UML_CLOCK_RESET_ATOM__UMLCLOCK);
		createEOperation(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION___CALCULATE_WORST_CASE_DEADLINE_AS_NATURAL_NUMBER);
		createEOperation(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION___GET_DEFAULT_NAME);
		createEOperation(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION___RESETS_CLOCK__UMLCLOCK);
		createEOperation(umlRealtimeTransitionEClass, UML_REALTIME_TRANSITION___CLONE__UMLREALTIMESTATECHART_UMLREALTIMETRANSITION);

		synchronizationChannelEClass = createEClass(SYNCHRONIZATION_CHANNEL);
		createEReference(synchronizationChannelEClass, SYNCHRONIZATION_CHANNEL__UML_REALTIME_COMPLEX_STATE);
		createEOperation(synchronizationChannelEClass, SYNCHRONIZATION_CHANNEL___CLONE__UMLREALTIMESTATECHART_SYNCHRONIZATIONCHANNEL);

		umlTimeguardAtomEClass = createEClass(UML_TIMEGUARD_ATOM);
		createEOperation(umlTimeguardAtomEClass, UML_TIMEGUARD_ATOM___CLONE__UMLREALTIMESTATECHART_UMLTIMEGUARDATOM);

		historyStateEClass = createEClass(HISTORY_STATE);
		createEAttribute(historyStateEClass, HISTORY_STATE__KIND);

		doEventEClass = createEClass(DO_EVENT);
		createEReference(doEventEClass, DO_EVENT__UML_REALTIME_ACTION);
		createEReference(doEventEClass, DO_EVENT__DO_ACTION_REV);
		createEAttribute(doEventEClass, DO_EVENT__PERIOD_LOWER);
		createEAttribute(doEventEClass, DO_EVENT__PERIOD_UPPER);

		entryOrExitEventEClass = createEClass(ENTRY_OR_EXIT_EVENT);
		createEReference(entryOrExitEventEClass, ENTRY_OR_EXIT_EVENT__RESETS);
		createEReference(entryOrExitEventEClass, ENTRY_OR_EXIT_EVENT__ENTRY_ACTION_REV);
		createEReference(entryOrExitEventEClass, ENTRY_OR_EXIT_EVENT__EXIT_ACTION_REV);
		createEReference(entryOrExitEventEClass, ENTRY_OR_EXIT_EVENT__UML_REALTIME_ACTION);

		synchronizationEClass = createEClass(SYNCHRONIZATION);
		createEReference(synchronizationEClass, SYNCHRONIZATION__SEND_SYNC_REV);
		createEReference(synchronizationEClass, SYNCHRONIZATION__RECEIVE_SYNC_REV);

		// Create enums
		historyKindEEnum = createEEnum(HISTORY_KIND);
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
		ReconfPackage theReconfPackage = (ReconfPackage)EPackage.Registry.INSTANCE.getEPackage(ReconfPackage.eNS_URI);
		HelperPackage theHelperPackage = (HelperPackage)EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		org.storydriven.modeling.calls.expressions.ExpressionsPackage theExpressionsPackage_1 = (org.storydriven.modeling.calls.expressions.ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(org.storydriven.modeling.calls.expressions.ExpressionsPackage.eNS_URI);
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
		SDMPackage theSDMPackage = (SDMPackage)EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI);
		CallsPackage theCallsPackage = (CallsPackage)EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theReconfPackage);
		getESubpackages().add(theHelperPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		absoluteDeadlineEClass.getESuperTypes().add(this.getDeadline());
		relativeDeadlineEClass.getESuperTypes().add(this.getDeadline());
		umlRealtimeComplexStateEClass.getESuperTypes().add(this.getUMLRealtimeState());
		umlInterfaceStatechartEClass.getESuperTypes().add(this.getUMLRealtimeStatechart());
		umlRealtimeActionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		umlRealtimeEventEClass.getESuperTypes().add(theExpressionsPackage_1.getMethodCallExpression());
		umlRealtimeStartStateEClass.getESuperTypes().add(this.getUMLRealtimeState());
		umlRealtimeStateEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
		umlRealtimeStatechartEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
		umlRealtimeStatechartEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());
		umlRealtimeStopStateEClass.getESuperTypes().add(this.getUMLRealtimeState());
		synchronizationChannelEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
		synchronizationChannelEClass.getESuperTypes().add(theCallsPackage.getCallable());
		historyStateEClass.getESuperTypes().add(this.getUMLRealtimeState());
		synchronizationEClass.getESuperTypes().add(theCallsPackage.getInvocation());

		// Initialize classes, features, and operations; add parameters
		initEClass(deadlineEClass, Deadline.class, "Deadline", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeadline_UpperBound(), theCorePackage.getNaturalNumber(), null, "upperBound", null, 0, 1, Deadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeadline_LowerBound(), theCorePackage.getNaturalNumber(), null, "lowerBound", null, 0, 1, Deadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absoluteDeadlineEClass, AbsoluteDeadline.class, "AbsoluteDeadline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbsoluteDeadline_UMLRealtimeTransition(), this.getUMLRealtimeTransition(), this.getUMLRealtimeTransition_AbsoluteDeadlines(), "uMLRealtimeTransition", null, 1, 1, AbsoluteDeadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbsoluteDeadline_UMLClock(), this.getUMLClock(), this.getUMLClock_AbsoluteDeadlines(), "uMLClock", null, 1, 1, AbsoluteDeadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativeDeadlineEClass, RelativeDeadline.class, "RelativeDeadline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelativeDeadline_UMLRealtimeTransition(), this.getUMLRealtimeTransition(), this.getUMLRealtimeTransition_RelativeDeadline(), "uMLRealtimeTransition", null, 0, 1, RelativeDeadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlClockEClass, UMLClock.class, "UMLClock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUMLClock_Id(), ecorePackage.getEString(), "id", null, 0, 1, UMLClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLClock_AbsoluteDeadlines(), this.getAbsoluteDeadline(), this.getAbsoluteDeadline_UMLClock(), "absoluteDeadlines", null, 0, -1, UMLClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLClock_UMLRealtimeStatechart(), this.getUMLRealtimeStatechart(), this.getUMLRealtimeStatechart_UMLClocks(), "uMLRealtimeStatechart", null, 0, 1, UMLClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLClock_Resets(), this.getUMLClock(), null, "resets", null, 0, -1, UMLClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getUMLClock__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getUMLClock__Clone__UMLRealtimeStatechart_UMLClock(), theEcorePackage.getEObject(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUMLRealtimeStatechart(), "rtsc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUMLClock(), "newClock", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(umlRealtimeComplexStateEClass, UMLRealtimeComplexState.class, "UMLRealtimeComplexState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLRealtimeComplexState_UMLRealtimeStatecharts(), this.getUMLRealtimeStatechart(), null, "uMLRealtimeStatecharts", null, 0, -1, UMLRealtimeComplexState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeComplexState_DoAction(), this.getDoEvent(), this.getDoEvent_DoActionRev(), "doAction", null, 0, 1, UMLRealtimeComplexState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeComplexState_ExitAction(), this.getEntryOrExitEvent(), this.getEntryOrExitEvent_ExitActionRev(), "exitAction", null, 0, 1, UMLRealtimeComplexState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeComplexState_EntryAction(), this.getEntryOrExitEvent(), this.getEntryOrExitEvent_EntryActionRev(), "entryAction", null, 0, 1, UMLRealtimeComplexState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeComplexState_ReconfDiagram(), theReconfPackage.getReconfDiagram(), null, "reconfDiagram", null, 0, 1, UMLRealtimeComplexState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeComplexState_InterfacedStates(), this.getUMLRealtimeComplexState(), null, "interfacedStates", null, 0, -1, UMLRealtimeComplexState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeComplexState_InterfaceState(), this.getUMLRealtimeComplexState(), null, "interfaceState", null, 0, 1, UMLRealtimeComplexState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeComplexState_Invariants(), this.getUMLInvariantAtom(), null, "invariants", null, 0, -1, UMLRealtimeComplexState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeComplexState_Committed(), theEcorePackage.getEBoolean(), "committed", null, 0, 1, UMLRealtimeComplexState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeComplexState_Channels(), this.getSynchronizationChannel(), this.getSynchronizationChannel_UMLRealtimeComplexState(), "channels", null, 0, -1, UMLRealtimeComplexState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getUMLRealtimeComplexState__Clone__UMLRealtimeStatechart_UMLRealtimeComplexState(), theEcorePackage.getEObject(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUMLRealtimeStatechart(), "rtsc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUMLRealtimeComplexState(), "newComplexState", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(umlInterfaceStatechartEClass, UMLInterfaceStatechart.class, "UMLInterfaceStatechart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLInterfaceStatechart_UMLRealtimeStatechart(), this.getUMLRealtimeStatechart(), null, "uMLRealtimeStatechart", null, 0, 1, UMLInterfaceStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlInvariantAtomEClass, UMLInvariantAtom.class, "UMLInvariantAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLInvariantAtom_UMLComplexRealtimeState(), this.getUMLRealtimeComplexState(), null, "uMLComplexRealtimeState", null, 0, 1, UMLInvariantAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getUMLInvariantAtom__Clone__UMLRealtimeStatechart_UMLInvariantAtom(), theEcorePackage.getEObject(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUMLRealtimeStatechart(), "rtsc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUMLInvariantAtom(), "newAtom", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(umlRealtimeActionEClass, UMLRealtimeAction.class, "UMLRealtimeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUMLRealtimeAction_Id(), ecorePackage.getEString(), "id", null, 0, 1, UMLRealtimeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeAction_Wcet(), ecorePackage.getELongObject(), "wcet", null, 0, 1, UMLRealtimeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeAction_Blocking(), ecorePackage.getELong(), "blocking", null, 0, 1, UMLRealtimeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeAction_UMLRealtimeTransition(), this.getUMLRealtimeTransition(), this.getUMLRealtimeTransition_SideEffect(), "uMLRealtimeTransition", null, 0, 1, UMLRealtimeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeAction_Resets(), this.getUMLClock(), null, "resets", null, 0, -1, UMLRealtimeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeAction_WCETSpecifiedByUser(), theEcorePackage.getEBoolean(), "wCETSpecifiedByUser", null, 0, 1, UMLRealtimeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getUMLRealtimeAction__Clone__UMLRealtimeStatechart_UMLRealtimeAction(), theEcorePackage.getEObject(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUMLRealtimeStatechart(), "rtsc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUMLRealtimeAction(), "newAction", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(umlRealtimeEventEClass, UMLRealtimeEvent.class, "UMLRealtimeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLRealtimeEvent_TriggeredUMLRealtimeTransition(), this.getUMLRealtimeTransition(), null, "triggeredUMLRealtimeTransition", null, 0, 1, UMLRealtimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeEvent_RaisedUMLRealtimeTransition(), this.getUMLRealtimeTransition(), null, "raisedUMLRealtimeTransition", null, 0, 1, UMLRealtimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeEvent_Instance(), ecorePackage.getEString(), "instance", null, 0, 1, UMLRealtimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, UMLRealtimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeEvent_FullEventName(), ecorePackage.getEString(), "fullEventName", null, 0, 1, UMLRealtimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getUMLRealtimeEvent__Clone__UMLRealtimeStatechart_UMLRealtimeEvent(), theEcorePackage.getEObject(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUMLRealtimeStatechart(), "rtsc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUMLRealtimeEvent(), "newEvent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUMLRealtimeEvent__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(umlRealtimeFadingFunctionEClass, UMLRealtimeFadingFunction.class, "UMLRealtimeFadingFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUMLRealtimeFadingFunction_Function(), ecorePackage.getEString(), "function", null, 0, 1, UMLRealtimeFadingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeFadingFunction_UMLRealtimeTransitions(), this.getUMLRealtimeTransition(), this.getUMLRealtimeTransition_UMLRealtimeFadingFunction(), "uMLRealtimeTransitions", null, 0, 1, UMLRealtimeFadingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeFadingFunction_MinDuration(), ecorePackage.getEFloat(), "minDuration", null, 0, 1, UMLRealtimeFadingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeFadingFunction_MaxDuration(), ecorePackage.getEFloat(), "maxDuration", null, 0, 1, UMLRealtimeFadingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeFadingFunction_Spline1(), ecorePackage.getEString(), "spline1", null, 0, 1, UMLRealtimeFadingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeFadingFunction_Spline2(), ecorePackage.getEString(), "spline2", null, 0, 1, UMLRealtimeFadingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeFadingFunction_PolynomDegree(), ecorePackage.getEInt(), "polynomDegree", null, 0, 1, UMLRealtimeFadingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeFadingFunction_PortsByComponentInstance(), theInstancePackage.getCI2PsMapEntry(), null, "portsByComponentInstance", null, 0, 1, UMLRealtimeFadingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(theHelperPackage.getMyMap());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getUMLRealtimeFadingFunction_PortInstToPortInstMapEntry(), g1, "portInstToPortInstMapEntry", null, 0, 1, UMLRealtimeFadingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getUMLRealtimeFadingFunction__GetBreakpoint(), ecorePackage.getEBoolean(), "getBreakpoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(umlRealtimeFlatSwitchingEClass, UMLRealtimeFlatSwitching.class, "UMLRealtimeFlatSwitching", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLRealtimeFlatSwitching_UMLRealtimeTransitions(), this.getUMLRealtimeTransition(), null, "uMLRealtimeTransitions", null, 0, -1, UMLRealtimeFlatSwitching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeFlatSwitching_MinDuration(), ecorePackage.getEFloat(), "minDuration", null, 0, 1, UMLRealtimeFlatSwitching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeFlatSwitching_MaxDuration(), ecorePackage.getEFloat(), "maxDuration", null, 0, 1, UMLRealtimeFlatSwitching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeFlatSwitching_Spline1(), ecorePackage.getEString(), "spline1", null, 0, 1, UMLRealtimeFlatSwitching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeFlatSwitching_Spline2(), ecorePackage.getEString(), "spline2", null, 0, 1, UMLRealtimeFlatSwitching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeFlatSwitching_PolynomDegree(), ecorePackage.getEInt(), "polynomDegree", null, 0, 1, UMLRealtimeFlatSwitching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theHelperPackage.getMyMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getUMLRealtimeFlatSwitching_PortInstToPortInstMapEntry(), g1, "portInstToPortInstMapEntry", null, 0, 1, UMLRealtimeFlatSwitching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getUMLRealtimeFlatSwitching__GetBreakpoint(), ecorePackage.getEBoolean(), "getBreakpoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(umlRealtimeStartStateEClass, UMLRealtimeStartState.class, "UMLRealtimeStartState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLRealtimeStartState_UMLRealtimeStartStateRev(), this.getUMLRealtimeStatechart(), this.getUMLRealtimeStatechart_UMLRealtimeStartState(), "uMLRealtimeStartStateRev", null, 0, 1, UMLRealtimeStartState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getUMLRealtimeStartState__GetNextState(), this.getUMLRealtimeState(), "getNextState", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUMLRealtimeStartState__Clone__UMLRealtimeStatechart_UMLRealtimeStartState(), theEcorePackage.getEObject(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUMLRealtimeStatechart(), "rtsc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUMLRealtimeStartState(), "newStartState", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(umlRealtimeStateEClass, UMLRealtimeState.class, "UMLRealtimeState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLRealtimeState_OutgoingUMLRealtimeTransitions(), this.getUMLRealtimeTransition(), null, "outgoingUMLRealtimeTransitions", null, 0, -1, UMLRealtimeState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeState_IncomingUMLRealtimeTransitions(), this.getUMLRealtimeTransition(), null, "incomingUMLRealtimeTransitions", null, 0, -1, UMLRealtimeState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeState_UMLRealtimeStatechart(), this.getUMLRealtimeStatechart(), null, "uMLRealtimeStatechart", null, 0, 1, UMLRealtimeState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getUMLRealtimeState__GetLongName(), theEcorePackage.getEString(), "getLongName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUMLRealtimeState__GetRootRealtimeStatechart(), this.getUMLRealtimeStatechart(), "getRootRealtimeStatechart", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(umlRealtimeStatechartEClass, UMLRealtimeStatechart.class, "UMLRealtimeStatechart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUMLRealtimeStatechart_EventQueueSize(), ecorePackage.getEInt(), "eventQueueSize", null, 0, 1, UMLRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeStatechart_WcetDocument(), ecorePackage.getEString(), "wcetDocument", null, 0, 1, UMLRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeStatechart_SecurityLevel(), ecorePackage.getEInt(), "securityLevel", "0", 0, 1, UMLRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeStatechart_SystemWcetMap(), theHelperPackage.getMap(), "systemWcetMap", null, 0, 1, UMLRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeStatechart_Utilisation(), ecorePackage.getEDouble(), "utilisation", null, 0, 1, UMLRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeStatechart_ScheduleDocument(), ecorePackage.getEString(), "scheduleDocument", "\\\"schedule.xml\\\"", 0, 1, UMLRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeStatechart_UMLRealtimeStartState(), this.getUMLRealtimeStartState(), this.getUMLRealtimeStartState_UMLRealtimeStartStateRev(), "uMLRealtimeStartState", null, 0, 1, UMLRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeStatechart_UMLComplexRealtimeState(), this.getUMLRealtimeComplexState(), null, "uMLComplexRealtimeState", null, 0, 1, UMLRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeStatechart_UMLRealtimeTransitions(), this.getUMLRealtimeTransition(), null, "uMLRealtimeTransitions", null, 0, -1, UMLRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeStatechart_UMLRealtimeStates(), this.getUMLRealtimeState(), null, "uMLRealtimeStates", null, 0, -1, UMLRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeStatechart_EClass(), theEcorePackage.getEClass(), null, "eClass", null, 0, 1, UMLRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeStatechart_UMLInterfaceStatechart(), this.getUMLInterfaceStatechart(), null, "uMLInterfaceStatechart", null, 0, 1, UMLRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeStatechart_BehavioralElement(), theCorePackage.getBehavioralElement(), null, "behavioralElement", null, 0, 1, UMLRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeStatechart_ProvidedMsgIFace(), theHelperPackage.getStringToEClass(), null, "providedMsgIFace", null, 0, 1, UMLRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeStatechart_RequiredMsgIFace(), theHelperPackage.getStringToEClass(), null, "requiredMsgIFace", null, 0, 1, UMLRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeStatechart_IsEmbedded(), theEcorePackage.getEBoolean(), "isEmbedded", null, 0, 1, UMLRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeStatechart_UMLClocks(), this.getUMLClock(), this.getUMLClock_UMLRealtimeStatechart(), "uMLClocks", null, 0, -1, UMLRealtimeStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getUMLRealtimeStatechart__GetHighestParentStatechart(), this.getUMLRealtimeStatechart(), "getHighestParentStatechart", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUMLRealtimeStatechart__IteratorOfAllSubRealtimeStatecharts(), theHelperPackage.getIterator(), "iteratorOfAllSubRealtimeStatecharts", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUMLRealtimeStatechart__AddAllUMLRealtimeStates__Set_boolean(), null, "addAllUMLRealtimeStates", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelperPackage.getSet());
		g2 = createEGenericType(this.getUMLRealtimeState());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inclusiveStartStates", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUMLRealtimeStatechart__AddComplexUMLRealtimeStates__Set(), null, "addComplexUMLRealtimeStates", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelperPackage.getSet());
		g2 = createEGenericType(this.getUMLRealtimeComplexState());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "set", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUMLRealtimeStatechart__AddAllUMLRealtimeTransitions__Set(), null, "addAllUMLRealtimeTransitions", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelperPackage.getSet());
		g2 = createEGenericType(this.getUMLRealtimeTransition());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "set", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUMLRealtimeStatechart__IteratorOfAllUMLClocks__boolean(), theHelperPackage.getIterator(), "iteratorOfAllUMLClocks", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "excludeNoClock", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUMLRealtimeStatechart__AddAllUMLClocks__Set_boolean(), null, "addAllUMLClocks", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelperPackage.getSet());
		g2 = createEGenericType(this.getUMLClock());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "excludeNoClock", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUMLRealtimeStatechart__ToString(), theEcorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUMLRealtimeStatechart__Clone(), theEcorePackage.getEObject(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(umlRealtimeStopStateEClass, UMLRealtimeStopState.class, "UMLRealtimeStopState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getUMLRealtimeStopState__Clone__UMLRealtimeStatechart_UMLRealtimeStopState(), theEcorePackage.getEObject(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUMLRealtimeStatechart(), "rtsc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUMLRealtimeStopState(), "newStopState", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(umlRealtimeTransitionEClass, UMLRealtimeTransition.class, "UMLRealtimeTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUMLRealtimeTransition_UMLRealtimeTransitionMappingVector(), theHelperPackage.getVector(), "uMLRealtimeTransitionMappingVector", null, 0, 1, UMLRealtimeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeTransition_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, UMLRealtimeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeTransition_SendSynchronization(), this.getSynchronization(), this.getSynchronization_SendSyncRev(), "sendSynchronization", null, 0, 1, UMLRealtimeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeTransition_ReceiveSynchronization(), this.getSynchronization(), this.getSynchronization_ReceiveSyncRev(), "receiveSynchronization", null, 0, 1, UMLRealtimeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeTransition_SideEffect(), this.getUMLRealtimeAction(), this.getUMLRealtimeAction_UMLRealtimeTransition(), "sideEffect", null, 0, 1, UMLRealtimeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeTransition_TargetUMLRealtimeState(), this.getUMLRealtimeState(), null, "targetUMLRealtimeState", null, 0, 1, UMLRealtimeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeTransition_SourceUMLRealtimeState(), this.getUMLRealtimeState(), null, "sourceUMLRealtimeState", null, 0, 1, UMLRealtimeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeTransition_UMLRealtimeStatechart(), this.getUMLRealtimeStatechart(), null, "uMLRealtimeStatechart", null, 0, 1, UMLRealtimeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeTransition_Resets(), this.getUMLClock(), null, "resets", null, 0, -1, UMLRealtimeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeTransition_UMLRealtimeFlatSwitching(), this.getUMLRealtimeFlatSwitching(), null, "uMLRealtimeFlatSwitching", null, 0, 1, UMLRealtimeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeTransition_UMLRealtimeFadingFunction(), this.getUMLRealtimeFadingFunction(), this.getUMLRealtimeFadingFunction_UMLRealtimeTransitions(), "uMLRealtimeFadingFunction", null, 0, 1, UMLRealtimeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeTransition_TriggerEvents(), this.getUMLRealtimeEvent(), null, "triggerEvents", null, 0, -1, UMLRealtimeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeTransition_RaisedEvents(), this.getUMLRealtimeEvent(), null, "raisedEvents", null, 0, -1, UMLRealtimeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeTransition_Timeguard(), this.getUMLTimeguardAtom(), null, "timeguard", null, 0, -1, UMLRealtimeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeTransition_AbsoluteDeadlines(), this.getAbsoluteDeadline(), this.getAbsoluteDeadline_UMLRealtimeTransition(), "absoluteDeadlines", null, 0, -1, UMLRealtimeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeTransition_RelativeDeadline(), this.getRelativeDeadline(), this.getRelativeDeadline_UMLRealtimeTransition(), "relativeDeadline", null, 0, 1, UMLRealtimeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLRealtimeTransition_Urgent(), theEcorePackage.getEBoolean(), "urgent", null, 0, 1, UMLRealtimeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRealtimeTransition_Guard(), theExpressionsPackage.getExpression(), null, "guard", null, 0, 1, UMLRealtimeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getUMLRealtimeTransition__HasClockInUMLClockResetAtom__UMLClock(), theEcorePackage.getEBoolean(), "hasClockInUMLClockResetAtom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUMLClock(), "clock", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUMLRealtimeTransition__CalculateWorstCaseDeadlineAsNaturalNumber(), theCorePackage.getNaturalNumber(), "calculateWorstCaseDeadlineAsNaturalNumber", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUMLRealtimeTransition__GetDefaultName(), theEcorePackage.getEString(), "getDefaultName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUMLRealtimeTransition__ResetsClock__UMLClock(), theEcorePackage.getEBoolean(), "resetsClock", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUMLClock(), "clock", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUMLRealtimeTransition__Clone__UMLRealtimeStatechart_UMLRealtimeTransition(), theEcorePackage.getEObject(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUMLRealtimeStatechart(), "rtsc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUMLRealtimeTransition(), "newTransition", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(synchronizationChannelEClass, SynchronizationChannel.class, "SynchronizationChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSynchronizationChannel_UMLRealtimeComplexState(), this.getUMLRealtimeComplexState(), this.getUMLRealtimeComplexState_Channels(), "uMLRealtimeComplexState", null, 0, 1, SynchronizationChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSynchronizationChannel__Clone__UMLRealtimeStatechart_SynchronizationChannel(), theEcorePackage.getEObject(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUMLRealtimeStatechart(), "rtsc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSynchronizationChannel(), "newChannel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(umlTimeguardAtomEClass, UMLTimeguardAtom.class, "UMLTimeguardAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getUMLTimeguardAtom__Clone__UMLRealtimeStatechart_UMLTimeguardAtom(), theEcorePackage.getEObject(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUMLRealtimeStatechart(), "rtsc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUMLTimeguardAtom(), "newAtom", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(historyStateEClass, HistoryState.class, "HistoryState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHistoryState_Kind(), this.getHistoryKind(), "kind", null, 0, 1, HistoryState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doEventEClass, DoEvent.class, "DoEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoEvent_UMLRealtimeAction(), this.getUMLRealtimeAction(), null, "uMLRealtimeAction", null, 0, 1, DoEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoEvent_DoActionRev(), this.getUMLRealtimeComplexState(), this.getUMLRealtimeComplexState_DoAction(), "doActionRev", null, 0, 1, DoEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoEvent_PeriodLower(), theEcorePackage.getEInt(), "periodLower", null, 0, 1, DoEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoEvent_PeriodUpper(), theEcorePackage.getEInt(), "periodUpper", null, 0, 1, DoEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryOrExitEventEClass, EntryOrExitEvent.class, "EntryOrExitEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryOrExitEvent_Resets(), this.getUMLClock(), null, "resets", null, 0, 1, EntryOrExitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryOrExitEvent_EntryActionRev(), this.getUMLRealtimeComplexState(), this.getUMLRealtimeComplexState_EntryAction(), "entryActionRev", null, 0, 1, EntryOrExitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryOrExitEvent_ExitActionRev(), this.getUMLRealtimeComplexState(), this.getUMLRealtimeComplexState_ExitAction(), "exitActionRev", null, 0, 1, EntryOrExitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryOrExitEvent_UMLRealtimeAction(), this.getUMLRealtimeAction(), null, "uMLRealtimeAction", null, 0, 1, EntryOrExitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronizationEClass, Synchronization.class, "Synchronization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSynchronization_SendSyncRev(), this.getUMLRealtimeTransition(), this.getUMLRealtimeTransition_SendSynchronization(), "sendSyncRev", null, 0, 1, Synchronization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSynchronization_ReceiveSyncRev(), this.getUMLRealtimeTransition(), this.getUMLRealtimeTransition_ReceiveSynchronization(), "receiveSyncRev", null, 0, 1, Synchronization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(historyKindEEnum, HistoryKind.class, "HistoryKind");
		addEEnumLiteral(historyKindEEnum, HistoryKind.DEEP);
		addEEnumLiteral(historyKindEEnum, HistoryKind.SHALLOW);

		// Create resource
		createResource(eNS_URI);
	}

} //RealtimestatechartPackageImpl
