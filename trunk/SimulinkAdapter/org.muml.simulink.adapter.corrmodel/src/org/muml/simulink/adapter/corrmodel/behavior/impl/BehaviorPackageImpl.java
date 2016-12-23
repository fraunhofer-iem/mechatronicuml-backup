/**
 */
package org.muml.simulink.adapter.corrmodel.behavior.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.expressions.ExpressionsPackage;
import org.muml.core.modelinstance.ModelinstancePackage;
import org.muml.pim.PimPackage;
import org.muml.pim.msgtype.MsgtypePackage;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.types.TypesPackage;
import org.muml.pim.valuetype.ValuetypePackage;
import org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage;
import org.muml.simulink.adapter.corrmodel.behavior.BehaviorFactory;
import org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage;
import org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart;
import org.muml.simulink.adapter.corrmodel.behavior.MT_Par2MTD;
import org.muml.simulink.adapter.corrmodel.behavior.RtScCat2SfM;
import org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry;
import org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit;
import org.muml.simulink.adapter.corrmodel.behavior.ScRegion2sfParallel;
import org.muml.simulink.adapter.corrmodel.behavior.ScStEnPoint2sfTrans;
import org.muml.simulink.adapter.corrmodel.behavior.ScStExPoint2sfTrans;
import org.muml.simulink.adapter.corrmodel.behavior.ScState2SfState;
import org.muml.simulink.adapter.corrmodel.behavior.ScSyncChannel2sfSignal;
import org.muml.simulink.adapter.corrmodel.behavior.ScSyncPara2sfSyncParaData;
import org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceive2sfSyncReceive;
import org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceiveAction2sfAction;
import org.muml.simulink.adapter.corrmodel.behavior.ScTrans2SfTrans;
import org.muml.simulink.adapter.corrmodel.behavior.clock2ClockReset;
import org.muml.simulink.adapter.corrmodel.behavior.scAction2sfAction;
import org.muml.simulink.adapter.corrmodel.behavior.scActionSelfTrans2sfAction;
import org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfAsyncGuard;
import org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfDequeue;
import org.muml.simulink.adapter.corrmodel.behavior.scAsyncSend2sfAction;
import org.muml.simulink.adapter.corrmodel.behavior.scAttribute2sfData;
import org.muml.simulink.adapter.corrmodel.behavior.scClock2sfData;
import org.muml.simulink.adapter.corrmodel.behavior.scClockConstr2sfGuard;
import org.muml.simulink.adapter.corrmodel.behavior.scGuard2sfGuard;
import org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError;
import org.muml.simulink.adapter.corrmodel.behavior.scOp2sfEmbFunc;
import org.muml.simulink.adapter.corrmodel.behavior.scOpData2sfEmbFuncData;
import org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction;
import org.muml.simulink.adapter.corrmodel.behavior.scSendParaBind2sfAction;
import org.muml.simulink.adapter.corrmodel.behavior.scSyncSend2sfSyncSend;
import org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorPackageImpl extends EPackageImpl implements BehaviorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtScCat2SfMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fRtSc2ChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scState2SfStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scTrans2SfTransEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scRegion2sfParallelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scEntry2sfEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scExit2sfExitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scStEnPoint2sfTransEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scStExPoint2sfTransEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scSyncChannel2sfSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scSyncReceiveAction2sfActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scSyncReceive2sfSyncReceiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scSyncSend2sfSyncSendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scSyncPara2sfSyncParaDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mT_Par2MTDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scAttribute2sfDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scSendAsync2sfTransActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scSendParaBind2sfActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scAsyncSend2sfActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scAsyncRec2sfAsyncGuardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scClock2sfDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scClockConstr2sfGuardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clock2ClockResetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scInvariant2sfInvErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scGuard2sfGuardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scAction2sfActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scOp2sfEmbFuncEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scOpData2sfEmbFuncDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scAsyncRec2sfDequeueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scActionSelfTrans2sfActionEClass = null;

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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BehaviorPackageImpl() {
		super(eNS_URI, BehaviorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BehaviorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BehaviorPackage init() {
		if (isInited) return (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

		// Obtain or create and register package
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BehaviorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		PimPackage.eINSTANCE.eClass();
		org.muml.simulink.SimulinkPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Fujaba2simulinkPackageImpl theFujaba2simulinkPackage = (Fujaba2simulinkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Fujaba2simulinkPackage.eNS_URI) instanceof Fujaba2simulinkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Fujaba2simulinkPackage.eNS_URI) : Fujaba2simulinkPackage.eINSTANCE);

		// Create package meta-data objects
		theBehaviorPackage.createPackageContents();
		theFujaba2simulinkPackage.createPackageContents();

		// Initialize created meta-data
		theBehaviorPackage.initializePackageContents();
		theFujaba2simulinkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBehaviorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BehaviorPackage.eNS_URI, theBehaviorPackage);
		return theBehaviorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtScCat2SfM() {
		return rtScCat2SfMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtScCat2SfM_SfM() {
		return (EReference)rtScCat2SfMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtScCat2SfM_RtScCat() {
		return (EReference)rtScCat2SfMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFRtSc2Chart() {
		return fRtSc2ChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFRtSc2Chart_Chart() {
		return (EReference)fRtSc2ChartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFRtSc2Chart_FRtSc() {
		return (EReference)fRtSc2ChartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFRtSc2Chart_Mt_par() {
		return (EReference)fRtSc2ChartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFRtSc2Chart_SfChartState() {
		return (EReference)fRtSc2ChartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFRtSc2Chart_SfChartRegion() {
		return (EReference)fRtSc2ChartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFRtSc2Chart_SfQueueRegion() {
		return (EReference)fRtSc2ChartEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFRtSc2Chart_SfSelfTrans() {
		return (EReference)fRtSc2ChartEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScState2SfState() {
		return scState2SfStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScState2SfState_ScState() {
		return (EReference)scState2SfStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScState2SfState_SfState() {
		return (EReference)scState2SfStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScTrans2SfTrans() {
		return scTrans2SfTransEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScTrans2SfTrans_ScTrans() {
		return (EReference)scTrans2SfTransEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScTrans2SfTrans_SfTrans() {
		return (EReference)scTrans2SfTransEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScTrans2SfTrans_ScReg() {
		return (EReference)scTrans2SfTransEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScRegion2sfParallel() {
		return scRegion2sfParallelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScRegion2sfParallel_ScRegion() {
		return (EReference)scRegion2sfParallelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScRegion2sfParallel_SfParallelState() {
		return (EReference)scRegion2sfParallelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScRegion2sfParallel_ScRegRtsc() {
		return (EReference)scRegion2sfParallelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScEntry2sfEntry() {
		return scEntry2sfEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScEntry2sfEntry_ScEntryEvent() {
		return (EReference)scEntry2sfEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScEntry2sfEntry_SfEntryAction() {
		return (EReference)scEntry2sfEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScEntry2sfEntry_ScEntryAction() {
		return (EReference)scEntry2sfEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScEntry2sfEntry_ScExpr() {
		return (EReference)scEntry2sfEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScEntry2sfEntry_ScClock() {
		return (EReference)scEntry2sfEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScExit2sfExit() {
		return scExit2sfExitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScExit2sfExit_ScExitEvent() {
		return (EReference)scExit2sfExitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScExit2sfExit_ScExitAction() {
		return (EReference)scExit2sfExitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScExit2sfExit_ScExitExpr() {
		return (EReference)scExit2sfExitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScExit2sfExit_SfExitAction() {
		return (EReference)scExit2sfExitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScExit2sfExit_ScClock() {
		return (EReference)scExit2sfExitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScStEnPoint2sfTrans() {
		return scStEnPoint2sfTransEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScStEnPoint2sfTrans_SfTrans() {
		return (EReference)scStEnPoint2sfTransEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScStEnPoint2sfTrans_ScInTrans() {
		return (EReference)scStEnPoint2sfTransEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScStEnPoint2sfTrans_ScOutTrans() {
		return (EReference)scStEnPoint2sfTransEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScStEnPoint2sfTrans_ScStateEntryP() {
		return (EReference)scStEnPoint2sfTransEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScStExPoint2sfTrans() {
		return scStExPoint2sfTransEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScStExPoint2sfTrans_SfTrans() {
		return (EReference)scStExPoint2sfTransEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScStExPoint2sfTrans_ScOutTrans() {
		return (EReference)scStExPoint2sfTransEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScStExPoint2sfTrans_ScInTrans() {
		return (EReference)scStExPoint2sfTransEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScStExPoint2sfTrans_ScStExPoint() {
		return (EReference)scStExPoint2sfTransEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScSyncChannel2sfSignal() {
		return scSyncChannel2sfSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScSyncChannel2sfSignal_ScSyncChannel() {
		return (EReference)scSyncChannel2sfSignalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScSyncChannel2sfSignal_SfSyncEvent() {
		return (EReference)scSyncChannel2sfSignalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScSyncReceiveAction2sfAction() {
		return scSyncReceiveAction2sfActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScSyncReceiveAction2sfAction_ScAction() {
		return (EReference)scSyncReceiveAction2sfActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScSyncReceiveAction2sfAction_ScActionExpr() {
		return (EReference)scSyncReceiveAction2sfActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScSyncReceiveAction2sfAction_SfAction() {
		return (EReference)scSyncReceiveAction2sfActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScSyncReceive2sfSyncReceive() {
		return scSyncReceive2sfSyncReceiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScSyncReceive2sfSyncReceive_ScSyncReceive() {
		return (EReference)scSyncReceive2sfSyncReceiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScSyncReceive2sfSyncReceive_SfEntryAction() {
		return (EReference)scSyncReceive2sfSyncReceiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScSyncReceive2sfSyncReceive_SfExitAction() {
		return (EReference)scSyncReceive2sfSyncReceiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScSyncReceive2sfSyncReceive_SfTransEvent() {
		return (EReference)scSyncReceive2sfSyncReceiveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getscSyncSend2sfSyncSend() {
		return scSyncSend2sfSyncSendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscSyncSend2sfSyncSend_SfGuard() {
		return (EReference)scSyncSend2sfSyncSendEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscSyncSend2sfSyncSend_SfAssignment() {
		return (EReference)scSyncSend2sfSyncSendEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscSyncSend2sfSyncSend_ScTransAnnotation() {
		return (EReference)scSyncSend2sfSyncSendEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscSyncSend2sfSyncSend_ScAnnDetails() {
		return (EReference)scSyncSend2sfSyncSendEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScSyncPara2sfSyncParaData() {
		return scSyncPara2sfSyncParaDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMT_Par2MTD() {
		return mT_Par2MTDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMT_Par2MTD_Mt() {
		return (EReference)mT_Par2MTDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMT_Par2MTD_Par() {
		return (EReference)mT_Par2MTDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMT_Par2MTD_Data() {
		return (EReference)mT_Par2MTDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getscAttribute2sfData() {
		return scAttribute2sfDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscAttribute2sfData_ScAttribute() {
		return (EReference)scAttribute2sfDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscAttribute2sfData_SfData() {
		return (EReference)scAttribute2sfDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscAttribute2sfData_ScType() {
		return (EReference)scAttribute2sfDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscAttribute2sfData_ScAttrType() {
		return (EReference)scAttribute2sfDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getscSendAsync2sfTransAction() {
		return scSendAsync2sfTransActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscSendAsync2sfTransAction_SfSendAsync() {
		return (EReference)scSendAsync2sfTransActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscSendAsync2sfTransAction_AsynchronousMessageEvent() {
		return (EReference)scSendAsync2sfTransActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscSendAsync2sfTransAction_Message() {
		return (EReference)scSendAsync2sfTransActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getscSendAsync2sfTransAction_ActionValue() {
		return (EAttribute)scSendAsync2sfTransActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscSendAsync2sfTransAction_ScPara() {
		return (EReference)scSendAsync2sfTransActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscSendAsync2sfTransAction_ParBind() {
		return (EReference)scSendAsync2sfTransActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getscSendParaBind2sfAction() {
		return scSendParaBind2sfActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscSendParaBind2sfAction_SfParaBAction() {
		return (EReference)scSendParaBind2sfActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscSendParaBind2sfAction_ScAnnotation() {
		return (EReference)scSendParaBind2sfActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscSendParaBind2sfAction_ScDetails() {
		return (EReference)scSendParaBind2sfActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getscAsyncSend2sfAction() {
		return scAsyncSend2sfActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscAsyncSend2sfAction_SfEnqAction() {
		return (EReference)scAsyncSend2sfActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscAsyncSend2sfAction_AsynchronousMessageEvent() {
		return (EReference)scAsyncSend2sfActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscAsyncSend2sfAction_EAnnotation() {
		return (EReference)scAsyncSend2sfActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscAsyncSend2sfAction_EStringToStringMapEntry() {
		return (EReference)scAsyncSend2sfActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getscAsyncRec2sfAsyncGuard() {
		return scAsyncRec2sfAsyncGuardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscAsyncRec2sfAsyncGuard_GuardAnnotation() {
		return (EReference)scAsyncRec2sfAsyncGuardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscAsyncRec2sfAsyncGuard_EAnnotation() {
		return (EReference)scAsyncRec2sfAsyncGuardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscAsyncRec2sfAsyncGuard_AsynchronousMessageEvent() {
		return (EReference)scAsyncRec2sfAsyncGuardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscAsyncRec2sfAsyncGuard_AsyncRecGuard() {
		return (EReference)scAsyncRec2sfAsyncGuardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getscClock2sfData() {
		return scClock2sfDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscClock2sfData_ScClock() {
		return (EReference)scClock2sfDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscClock2sfData_SfClockVariable() {
		return (EReference)scClock2sfDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getscClockConstr2sfGuard() {
		return scClockConstr2sfGuardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscClockConstr2sfGuard_ScClockConstr() {
		return (EReference)scClockConstr2sfGuardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscClockConstr2sfGuard_ScBound() {
		return (EReference)scClockConstr2sfGuardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscClockConstr2sfGuard_ScClock() {
		return (EReference)scClockConstr2sfGuardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscClockConstr2sfGuard_SfClockGuard() {
		return (EReference)scClockConstr2sfGuardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getclock2ClockReset() {
		return clock2ClockResetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getclock2ClockReset_ScClock() {
		return (EReference)clock2ClockResetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getclock2ClockReset_SfClockReset() {
		return (EReference)clock2ClockResetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getscInvariant2sfInvError() {
		return scInvariant2sfInvErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscInvariant2sfInvError_ScInvariant() {
		return (EReference)scInvariant2sfInvErrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscInvariant2sfInvError_ScBound() {
		return (EReference)scInvariant2sfInvErrorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscInvariant2sfInvError_ScClock() {
		return (EReference)scInvariant2sfInvErrorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscInvariant2sfInvError_SfInvTrans() {
		return (EReference)scInvariant2sfInvErrorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscInvariant2sfInvError_SfInvGuard() {
		return (EReference)scInvariant2sfInvErrorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscInvariant2sfInvError_SfInvNode() {
		return (EReference)scInvariant2sfInvErrorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getscGuard2sfGuard() {
		return scGuard2sfGuardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscGuard2sfGuard_SfGuard() {
		return (EReference)scGuard2sfGuardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscGuard2sfGuard_ScAnnotation() {
		return (EReference)scGuard2sfGuardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscGuard2sfGuard_ScDetails() {
		return (EReference)scGuard2sfGuardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getscAction2sfAction() {
		return scAction2sfActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscAction2sfAction_ScAction() {
		return (EReference)scAction2sfActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscAction2sfAction_SfAction() {
		return (EReference)scAction2sfActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscAction2sfAction_ScActionExpr() {
		return (EReference)scAction2sfActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getscOp2sfEmbFunc() {
		return scOp2sfEmbFuncEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscOp2sfEmbFunc_ScOperation() {
		return (EReference)scOp2sfEmbFuncEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscOp2sfEmbFunc_SfEmbFunc() {
		return (EReference)scOp2sfEmbFuncEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscOp2sfEmbFunc_ScAnnotation() {
		return (EReference)scOp2sfEmbFuncEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscOp2sfEmbFunc_ScDetails() {
		return (EReference)scOp2sfEmbFuncEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getscOpData2sfEmbFuncData() {
		return scOpData2sfEmbFuncDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscOpData2sfEmbFuncData_ScParameter() {
		return (EReference)scOpData2sfEmbFuncDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscOpData2sfEmbFuncData_SfData() {
		return (EReference)scOpData2sfEmbFuncDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscOpData2sfEmbFuncData_ScParaType() {
		return (EReference)scOpData2sfEmbFuncDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getscAsyncRec2sfDequeue() {
		return scAsyncRec2sfDequeueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscAsyncRec2sfDequeue_ScDetailsDequeue() {
		return (EReference)scAsyncRec2sfDequeueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscAsyncRec2sfDequeue_ScAction() {
		return (EReference)scAsyncRec2sfDequeueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getscActionSelfTrans2sfAction() {
		return scActionSelfTrans2sfActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscActionSelfTrans2sfAction_ScAction() {
		return (EReference)scActionSelfTrans2sfActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscActionSelfTrans2sfAction_SfAction() {
		return (EReference)scActionSelfTrans2sfActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorFactory getBehaviorFactory() {
		return (BehaviorFactory)getEFactoryInstance();
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
		rtScCat2SfMEClass = createEClass(RT_SC_CAT2_SF_M);
		createEReference(rtScCat2SfMEClass, RT_SC_CAT2_SF_M__SF_M);
		createEReference(rtScCat2SfMEClass, RT_SC_CAT2_SF_M__RT_SC_CAT);

		fRtSc2ChartEClass = createEClass(FRT_SC2_CHART);
		createEReference(fRtSc2ChartEClass, FRT_SC2_CHART__CHART);
		createEReference(fRtSc2ChartEClass, FRT_SC2_CHART__FRT_SC);
		createEReference(fRtSc2ChartEClass, FRT_SC2_CHART__MT_PAR);
		createEReference(fRtSc2ChartEClass, FRT_SC2_CHART__SF_CHART_STATE);
		createEReference(fRtSc2ChartEClass, FRT_SC2_CHART__SF_CHART_REGION);
		createEReference(fRtSc2ChartEClass, FRT_SC2_CHART__SF_QUEUE_REGION);
		createEReference(fRtSc2ChartEClass, FRT_SC2_CHART__SF_SELF_TRANS);

		scState2SfStateEClass = createEClass(SC_STATE2_SF_STATE);
		createEReference(scState2SfStateEClass, SC_STATE2_SF_STATE__SC_STATE);
		createEReference(scState2SfStateEClass, SC_STATE2_SF_STATE__SF_STATE);

		scTrans2SfTransEClass = createEClass(SC_TRANS2_SF_TRANS);
		createEReference(scTrans2SfTransEClass, SC_TRANS2_SF_TRANS__SC_TRANS);
		createEReference(scTrans2SfTransEClass, SC_TRANS2_SF_TRANS__SF_TRANS);
		createEReference(scTrans2SfTransEClass, SC_TRANS2_SF_TRANS__SC_REG);

		scRegion2sfParallelEClass = createEClass(SC_REGION2SF_PARALLEL);
		createEReference(scRegion2sfParallelEClass, SC_REGION2SF_PARALLEL__SC_REGION);
		createEReference(scRegion2sfParallelEClass, SC_REGION2SF_PARALLEL__SF_PARALLEL_STATE);
		createEReference(scRegion2sfParallelEClass, SC_REGION2SF_PARALLEL__SC_REG_RTSC);

		scEntry2sfEntryEClass = createEClass(SC_ENTRY2SF_ENTRY);
		createEReference(scEntry2sfEntryEClass, SC_ENTRY2SF_ENTRY__SC_ENTRY_EVENT);
		createEReference(scEntry2sfEntryEClass, SC_ENTRY2SF_ENTRY__SF_ENTRY_ACTION);
		createEReference(scEntry2sfEntryEClass, SC_ENTRY2SF_ENTRY__SC_ENTRY_ACTION);
		createEReference(scEntry2sfEntryEClass, SC_ENTRY2SF_ENTRY__SC_EXPR);
		createEReference(scEntry2sfEntryEClass, SC_ENTRY2SF_ENTRY__SC_CLOCK);

		scExit2sfExitEClass = createEClass(SC_EXIT2SF_EXIT);
		createEReference(scExit2sfExitEClass, SC_EXIT2SF_EXIT__SC_EXIT_EVENT);
		createEReference(scExit2sfExitEClass, SC_EXIT2SF_EXIT__SC_EXIT_ACTION);
		createEReference(scExit2sfExitEClass, SC_EXIT2SF_EXIT__SC_EXIT_EXPR);
		createEReference(scExit2sfExitEClass, SC_EXIT2SF_EXIT__SF_EXIT_ACTION);
		createEReference(scExit2sfExitEClass, SC_EXIT2SF_EXIT__SC_CLOCK);

		scStEnPoint2sfTransEClass = createEClass(SC_ST_EN_POINT2SF_TRANS);
		createEReference(scStEnPoint2sfTransEClass, SC_ST_EN_POINT2SF_TRANS__SF_TRANS);
		createEReference(scStEnPoint2sfTransEClass, SC_ST_EN_POINT2SF_TRANS__SC_IN_TRANS);
		createEReference(scStEnPoint2sfTransEClass, SC_ST_EN_POINT2SF_TRANS__SC_OUT_TRANS);
		createEReference(scStEnPoint2sfTransEClass, SC_ST_EN_POINT2SF_TRANS__SC_STATE_ENTRY_P);

		scStExPoint2sfTransEClass = createEClass(SC_ST_EX_POINT2SF_TRANS);
		createEReference(scStExPoint2sfTransEClass, SC_ST_EX_POINT2SF_TRANS__SF_TRANS);
		createEReference(scStExPoint2sfTransEClass, SC_ST_EX_POINT2SF_TRANS__SC_OUT_TRANS);
		createEReference(scStExPoint2sfTransEClass, SC_ST_EX_POINT2SF_TRANS__SC_IN_TRANS);
		createEReference(scStExPoint2sfTransEClass, SC_ST_EX_POINT2SF_TRANS__SC_ST_EX_POINT);

		scSyncChannel2sfSignalEClass = createEClass(SC_SYNC_CHANNEL2SF_SIGNAL);
		createEReference(scSyncChannel2sfSignalEClass, SC_SYNC_CHANNEL2SF_SIGNAL__SC_SYNC_CHANNEL);
		createEReference(scSyncChannel2sfSignalEClass, SC_SYNC_CHANNEL2SF_SIGNAL__SF_SYNC_EVENT);

		scSyncReceiveAction2sfActionEClass = createEClass(SC_SYNC_RECEIVE_ACTION2SF_ACTION);
		createEReference(scSyncReceiveAction2sfActionEClass, SC_SYNC_RECEIVE_ACTION2SF_ACTION__SC_ACTION);
		createEReference(scSyncReceiveAction2sfActionEClass, SC_SYNC_RECEIVE_ACTION2SF_ACTION__SC_ACTION_EXPR);
		createEReference(scSyncReceiveAction2sfActionEClass, SC_SYNC_RECEIVE_ACTION2SF_ACTION__SF_ACTION);

		scSyncReceive2sfSyncReceiveEClass = createEClass(SC_SYNC_RECEIVE2SF_SYNC_RECEIVE);
		createEReference(scSyncReceive2sfSyncReceiveEClass, SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SC_SYNC_RECEIVE);
		createEReference(scSyncReceive2sfSyncReceiveEClass, SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_ENTRY_ACTION);
		createEReference(scSyncReceive2sfSyncReceiveEClass, SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_EXIT_ACTION);
		createEReference(scSyncReceive2sfSyncReceiveEClass, SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_TRANS_EVENT);

		scSyncSend2sfSyncSendEClass = createEClass(SC_SYNC_SEND2SF_SYNC_SEND);
		createEReference(scSyncSend2sfSyncSendEClass, SC_SYNC_SEND2SF_SYNC_SEND__SF_GUARD);
		createEReference(scSyncSend2sfSyncSendEClass, SC_SYNC_SEND2SF_SYNC_SEND__SF_ASSIGNMENT);
		createEReference(scSyncSend2sfSyncSendEClass, SC_SYNC_SEND2SF_SYNC_SEND__SC_TRANS_ANNOTATION);
		createEReference(scSyncSend2sfSyncSendEClass, SC_SYNC_SEND2SF_SYNC_SEND__SC_ANN_DETAILS);

		scSyncPara2sfSyncParaDataEClass = createEClass(SC_SYNC_PARA2SF_SYNC_PARA_DATA);

		mT_Par2MTDEClass = createEClass(MT_PAR2_MTD);
		createEReference(mT_Par2MTDEClass, MT_PAR2_MTD__MT);
		createEReference(mT_Par2MTDEClass, MT_PAR2_MTD__PAR);
		createEReference(mT_Par2MTDEClass, MT_PAR2_MTD__DATA);

		scAttribute2sfDataEClass = createEClass(SC_ATTRIBUTE2SF_DATA);
		createEReference(scAttribute2sfDataEClass, SC_ATTRIBUTE2SF_DATA__SC_ATTRIBUTE);
		createEReference(scAttribute2sfDataEClass, SC_ATTRIBUTE2SF_DATA__SF_DATA);
		createEReference(scAttribute2sfDataEClass, SC_ATTRIBUTE2SF_DATA__SC_TYPE);
		createEReference(scAttribute2sfDataEClass, SC_ATTRIBUTE2SF_DATA__SC_ATTR_TYPE);

		scSendAsync2sfTransActionEClass = createEClass(SC_SEND_ASYNC2SF_TRANS_ACTION);
		createEReference(scSendAsync2sfTransActionEClass, SC_SEND_ASYNC2SF_TRANS_ACTION__SF_SEND_ASYNC);
		createEReference(scSendAsync2sfTransActionEClass, SC_SEND_ASYNC2SF_TRANS_ACTION__ASYNCHRONOUS_MESSAGE_EVENT);
		createEReference(scSendAsync2sfTransActionEClass, SC_SEND_ASYNC2SF_TRANS_ACTION__MESSAGE);
		createEAttribute(scSendAsync2sfTransActionEClass, SC_SEND_ASYNC2SF_TRANS_ACTION__ACTION_VALUE);
		createEReference(scSendAsync2sfTransActionEClass, SC_SEND_ASYNC2SF_TRANS_ACTION__SC_PARA);
		createEReference(scSendAsync2sfTransActionEClass, SC_SEND_ASYNC2SF_TRANS_ACTION__PAR_BIND);

		scSendParaBind2sfActionEClass = createEClass(SC_SEND_PARA_BIND2SF_ACTION);
		createEReference(scSendParaBind2sfActionEClass, SC_SEND_PARA_BIND2SF_ACTION__SF_PARA_BACTION);
		createEReference(scSendParaBind2sfActionEClass, SC_SEND_PARA_BIND2SF_ACTION__SC_ANNOTATION);
		createEReference(scSendParaBind2sfActionEClass, SC_SEND_PARA_BIND2SF_ACTION__SC_DETAILS);

		scAsyncSend2sfActionEClass = createEClass(SC_ASYNC_SEND2SF_ACTION);
		createEReference(scAsyncSend2sfActionEClass, SC_ASYNC_SEND2SF_ACTION__SF_ENQ_ACTION);
		createEReference(scAsyncSend2sfActionEClass, SC_ASYNC_SEND2SF_ACTION__ASYNCHRONOUS_MESSAGE_EVENT);
		createEReference(scAsyncSend2sfActionEClass, SC_ASYNC_SEND2SF_ACTION__EANNOTATION);
		createEReference(scAsyncSend2sfActionEClass, SC_ASYNC_SEND2SF_ACTION__ESTRING_TO_STRING_MAP_ENTRY);

		scAsyncRec2sfAsyncGuardEClass = createEClass(SC_ASYNC_REC2SF_ASYNC_GUARD);
		createEReference(scAsyncRec2sfAsyncGuardEClass, SC_ASYNC_REC2SF_ASYNC_GUARD__GUARD_ANNOTATION);
		createEReference(scAsyncRec2sfAsyncGuardEClass, SC_ASYNC_REC2SF_ASYNC_GUARD__EANNOTATION);
		createEReference(scAsyncRec2sfAsyncGuardEClass, SC_ASYNC_REC2SF_ASYNC_GUARD__ASYNCHRONOUS_MESSAGE_EVENT);
		createEReference(scAsyncRec2sfAsyncGuardEClass, SC_ASYNC_REC2SF_ASYNC_GUARD__ASYNC_REC_GUARD);

		scClock2sfDataEClass = createEClass(SC_CLOCK2SF_DATA);
		createEReference(scClock2sfDataEClass, SC_CLOCK2SF_DATA__SC_CLOCK);
		createEReference(scClock2sfDataEClass, SC_CLOCK2SF_DATA__SF_CLOCK_VARIABLE);

		scClockConstr2sfGuardEClass = createEClass(SC_CLOCK_CONSTR2SF_GUARD);
		createEReference(scClockConstr2sfGuardEClass, SC_CLOCK_CONSTR2SF_GUARD__SC_CLOCK_CONSTR);
		createEReference(scClockConstr2sfGuardEClass, SC_CLOCK_CONSTR2SF_GUARD__SC_BOUND);
		createEReference(scClockConstr2sfGuardEClass, SC_CLOCK_CONSTR2SF_GUARD__SC_CLOCK);
		createEReference(scClockConstr2sfGuardEClass, SC_CLOCK_CONSTR2SF_GUARD__SF_CLOCK_GUARD);

		clock2ClockResetEClass = createEClass(CLOCK2_CLOCK_RESET);
		createEReference(clock2ClockResetEClass, CLOCK2_CLOCK_RESET__SC_CLOCK);
		createEReference(clock2ClockResetEClass, CLOCK2_CLOCK_RESET__SF_CLOCK_RESET);

		scInvariant2sfInvErrorEClass = createEClass(SC_INVARIANT2SF_INV_ERROR);
		createEReference(scInvariant2sfInvErrorEClass, SC_INVARIANT2SF_INV_ERROR__SC_INVARIANT);
		createEReference(scInvariant2sfInvErrorEClass, SC_INVARIANT2SF_INV_ERROR__SC_BOUND);
		createEReference(scInvariant2sfInvErrorEClass, SC_INVARIANT2SF_INV_ERROR__SC_CLOCK);
		createEReference(scInvariant2sfInvErrorEClass, SC_INVARIANT2SF_INV_ERROR__SF_INV_TRANS);
		createEReference(scInvariant2sfInvErrorEClass, SC_INVARIANT2SF_INV_ERROR__SF_INV_GUARD);
		createEReference(scInvariant2sfInvErrorEClass, SC_INVARIANT2SF_INV_ERROR__SF_INV_NODE);

		scGuard2sfGuardEClass = createEClass(SC_GUARD2SF_GUARD);
		createEReference(scGuard2sfGuardEClass, SC_GUARD2SF_GUARD__SF_GUARD);
		createEReference(scGuard2sfGuardEClass, SC_GUARD2SF_GUARD__SC_ANNOTATION);
		createEReference(scGuard2sfGuardEClass, SC_GUARD2SF_GUARD__SC_DETAILS);

		scAction2sfActionEClass = createEClass(SC_ACTION2SF_ACTION);
		createEReference(scAction2sfActionEClass, SC_ACTION2SF_ACTION__SC_ACTION);
		createEReference(scAction2sfActionEClass, SC_ACTION2SF_ACTION__SF_ACTION);
		createEReference(scAction2sfActionEClass, SC_ACTION2SF_ACTION__SC_ACTION_EXPR);

		scOp2sfEmbFuncEClass = createEClass(SC_OP2SF_EMB_FUNC);
		createEReference(scOp2sfEmbFuncEClass, SC_OP2SF_EMB_FUNC__SC_OPERATION);
		createEReference(scOp2sfEmbFuncEClass, SC_OP2SF_EMB_FUNC__SF_EMB_FUNC);
		createEReference(scOp2sfEmbFuncEClass, SC_OP2SF_EMB_FUNC__SC_ANNOTATION);
		createEReference(scOp2sfEmbFuncEClass, SC_OP2SF_EMB_FUNC__SC_DETAILS);

		scOpData2sfEmbFuncDataEClass = createEClass(SC_OP_DATA2SF_EMB_FUNC_DATA);
		createEReference(scOpData2sfEmbFuncDataEClass, SC_OP_DATA2SF_EMB_FUNC_DATA__SC_PARAMETER);
		createEReference(scOpData2sfEmbFuncDataEClass, SC_OP_DATA2SF_EMB_FUNC_DATA__SF_DATA);
		createEReference(scOpData2sfEmbFuncDataEClass, SC_OP_DATA2SF_EMB_FUNC_DATA__SC_PARA_TYPE);

		scAsyncRec2sfDequeueEClass = createEClass(SC_ASYNC_REC2SF_DEQUEUE);
		createEReference(scAsyncRec2sfDequeueEClass, SC_ASYNC_REC2SF_DEQUEUE__SC_DETAILS_DEQUEUE);
		createEReference(scAsyncRec2sfDequeueEClass, SC_ASYNC_REC2SF_DEQUEUE__SC_ACTION);

		scActionSelfTrans2sfActionEClass = createEClass(SC_ACTION_SELF_TRANS2SF_ACTION);
		createEReference(scActionSelfTrans2sfActionEClass, SC_ACTION_SELF_TRANS2SF_ACTION__SC_ACTION);
		createEReference(scActionSelfTrans2sfActionEClass, SC_ACTION_SELF_TRANS2SF_ACTION__SF_ACTION);
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
		Fujaba2simulinkPackage theFujaba2simulinkPackage = (Fujaba2simulinkPackage)EPackage.Registry.INSTANCE.getEPackage(Fujaba2simulinkPackage.eNS_URI);
		org.muml.simulink.stateflow.StateflowPackage theStateflowPackage = (org.muml.simulink.stateflow.StateflowPackage)EPackage.Registry.INSTANCE.getEPackage(org.muml.simulink.stateflow.StateflowPackage.eNS_URI);
		ModelinstancePackage theModelinstancePackage = (ModelinstancePackage)EPackage.Registry.INSTANCE.getEPackage(ModelinstancePackage.eNS_URI);
		RealtimestatechartPackage theRealtimestatechartPackage = (RealtimestatechartPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		MsgtypePackage theMsgtypePackage = (MsgtypePackage)EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI);
		org.muml.pim.behavior.BehaviorPackage theBehaviorPackage_1 = (org.muml.pim.behavior.BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(org.muml.pim.behavior.BehaviorPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rtScCat2SfMEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		fRtSc2ChartEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scState2SfStateEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scTrans2SfTransEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scRegion2sfParallelEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scEntry2sfEntryEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scExit2sfExitEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scStEnPoint2sfTransEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scStExPoint2sfTransEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scSyncChannel2sfSignalEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scSyncReceiveAction2sfActionEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scSyncReceive2sfSyncReceiveEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scSyncSend2sfSyncSendEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scSyncPara2sfSyncParaDataEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		mT_Par2MTDEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scAttribute2sfDataEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scSendAsync2sfTransActionEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scSendParaBind2sfActionEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scAsyncSend2sfActionEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scAsyncRec2sfAsyncGuardEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scClock2sfDataEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scClockConstr2sfGuardEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		clock2ClockResetEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scInvariant2sfInvErrorEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scGuard2sfGuardEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scAction2sfActionEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scOp2sfEmbFuncEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scOpData2sfEmbFuncDataEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scAsyncRec2sfDequeueEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());
		scActionSelfTrans2sfActionEClass.getESuperTypes().add(theFujaba2simulinkPackage.getAbstractContainerCorrespondenceNode());

		// Initialize classes and features; add operations and parameters
		initEClass(rtScCat2SfMEClass, RtScCat2SfM.class, "RtScCat2SfM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRtScCat2SfM_SfM(), theStateflowPackage.getStateflowMachine(), null, "sfM", null, 0, 1, RtScCat2SfM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRtScCat2SfM_RtScCat(), theModelinstancePackage.getModelElementCategory(), null, "rtScCat", null, 0, 1, RtScCat2SfM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fRtSc2ChartEClass, FRtSc2Chart.class, "FRtSc2Chart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFRtSc2Chart_Chart(), theStateflowPackage.getChart(), null, "chart", null, 0, 1, FRtSc2Chart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFRtSc2Chart_FRtSc(), theRealtimestatechartPackage.getRealtimeStatechart(), null, "fRtSc", null, 0, 1, FRtSc2Chart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFRtSc2Chart_Mt_par(), this.getMT_Par2MTD(), null, "mt_par", null, 0, -1, FRtSc2Chart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFRtSc2Chart_SfChartState(), theStateflowPackage.getState(), null, "sfChartState", null, 0, 1, FRtSc2Chart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFRtSc2Chart_SfChartRegion(), theStateflowPackage.getState(), null, "sfChartRegion", null, 0, 1, FRtSc2Chart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFRtSc2Chart_SfQueueRegion(), theStateflowPackage.getState(), null, "sfQueueRegion", null, 0, 1, FRtSc2Chart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFRtSc2Chart_SfSelfTrans(), theStateflowPackage.getTransition(), null, "sfSelfTrans", null, 0, 1, FRtSc2Chart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scState2SfStateEClass, ScState2SfState.class, "ScState2SfState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScState2SfState_ScState(), theRealtimestatechartPackage.getState(), null, "scState", null, 0, 1, ScState2SfState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScState2SfState_SfState(), theStateflowPackage.getState(), null, "sfState", null, 0, 1, ScState2SfState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scTrans2SfTransEClass, ScTrans2SfTrans.class, "ScTrans2SfTrans", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScTrans2SfTrans_ScTrans(), theRealtimestatechartPackage.getTransition(), null, "scTrans", null, 0, 1, ScTrans2SfTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScTrans2SfTrans_SfTrans(), theStateflowPackage.getTransition(), null, "sfTrans", null, 0, 1, ScTrans2SfTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScTrans2SfTrans_ScReg(), theRealtimestatechartPackage.getRegion(), null, "scReg", null, 0, 1, ScTrans2SfTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scRegion2sfParallelEClass, ScRegion2sfParallel.class, "ScRegion2sfParallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScRegion2sfParallel_ScRegion(), theRealtimestatechartPackage.getRegion(), null, "scRegion", null, 0, 1, ScRegion2sfParallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScRegion2sfParallel_SfParallelState(), theStateflowPackage.getState(), null, "sfParallelState", null, 0, 1, ScRegion2sfParallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScRegion2sfParallel_ScRegRtsc(), theRealtimestatechartPackage.getRealtimeStatechart(), null, "scRegRtsc", null, 0, 1, ScRegion2sfParallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scEntry2sfEntryEClass, ScEntry2sfEntry.class, "ScEntry2sfEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScEntry2sfEntry_ScEntryEvent(), theRealtimestatechartPackage.getEntryEvent(), null, "scEntryEvent", null, 0, 1, ScEntry2sfEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScEntry2sfEntry_SfEntryAction(), theStateflowPackage.getAction(), null, "sfEntryAction", null, 0, 1, ScEntry2sfEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScEntry2sfEntry_ScEntryAction(), theRealtimestatechartPackage.getAction(), null, "scEntryAction", null, 0, 1, ScEntry2sfEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScEntry2sfEntry_ScExpr(), theExpressionsPackage.getExpression(), null, "scExpr", null, 0, 1, ScEntry2sfEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScEntry2sfEntry_ScClock(), theRealtimestatechartPackage.getClock(), null, "scClock", null, 0, 1, ScEntry2sfEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scExit2sfExitEClass, ScExit2sfExit.class, "ScExit2sfExit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScExit2sfExit_ScExitEvent(), theRealtimestatechartPackage.getExitEvent(), null, "scExitEvent", null, 0, 1, ScExit2sfExit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScExit2sfExit_ScExitAction(), theRealtimestatechartPackage.getAction(), null, "scExitAction", null, 0, 1, ScExit2sfExit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScExit2sfExit_ScExitExpr(), theExpressionsPackage.getExpression(), null, "scExitExpr", null, 0, 1, ScExit2sfExit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScExit2sfExit_SfExitAction(), theStateflowPackage.getAction(), null, "sfExitAction", null, 0, 1, ScExit2sfExit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScExit2sfExit_ScClock(), theRealtimestatechartPackage.getClock(), null, "scClock", null, 0, 1, ScExit2sfExit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scStEnPoint2sfTransEClass, ScStEnPoint2sfTrans.class, "ScStEnPoint2sfTrans", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScStEnPoint2sfTrans_SfTrans(), theStateflowPackage.getTransition(), null, "sfTrans", null, 0, 1, ScStEnPoint2sfTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScStEnPoint2sfTrans_ScInTrans(), theRealtimestatechartPackage.getTransition(), null, "scInTrans", null, 0, 1, ScStEnPoint2sfTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScStEnPoint2sfTrans_ScOutTrans(), theRealtimestatechartPackage.getTransition(), null, "scOutTrans", null, 0, 1, ScStEnPoint2sfTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScStEnPoint2sfTrans_ScStateEntryP(), theRealtimestatechartPackage.getEntryPoint(), null, "scStateEntryP", null, 0, 1, ScStEnPoint2sfTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scStExPoint2sfTransEClass, ScStExPoint2sfTrans.class, "ScStExPoint2sfTrans", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScStExPoint2sfTrans_SfTrans(), theStateflowPackage.getTransition(), null, "sfTrans", null, 0, 1, ScStExPoint2sfTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScStExPoint2sfTrans_ScOutTrans(), theRealtimestatechartPackage.getTransition(), null, "scOutTrans", null, 0, 1, ScStExPoint2sfTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScStExPoint2sfTrans_ScInTrans(), theRealtimestatechartPackage.getTransition(), null, "scInTrans", null, 0, 1, ScStExPoint2sfTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScStExPoint2sfTrans_ScStExPoint(), theRealtimestatechartPackage.getExitPoint(), null, "scStExPoint", null, 0, 1, ScStExPoint2sfTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scSyncChannel2sfSignalEClass, ScSyncChannel2sfSignal.class, "ScSyncChannel2sfSignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScSyncChannel2sfSignal_ScSyncChannel(), theRealtimestatechartPackage.getSynchronizationChannel(), null, "scSyncChannel", null, 0, 1, ScSyncChannel2sfSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScSyncChannel2sfSignal_SfSyncEvent(), theStateflowPackage.getEvent(), null, "sfSyncEvent", null, 0, 1, ScSyncChannel2sfSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scSyncReceiveAction2sfActionEClass, ScSyncReceiveAction2sfAction.class, "ScSyncReceiveAction2sfAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScSyncReceiveAction2sfAction_ScAction(), theRealtimestatechartPackage.getAction(), null, "scAction", null, 0, 1, ScSyncReceiveAction2sfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScSyncReceiveAction2sfAction_ScActionExpr(), theExpressionsPackage.getTextualExpression(), null, "scActionExpr", null, 0, 1, ScSyncReceiveAction2sfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScSyncReceiveAction2sfAction_SfAction(), theStateflowPackage.getAction(), null, "sfAction", null, 0, 1, ScSyncReceiveAction2sfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scSyncReceive2sfSyncReceiveEClass, ScSyncReceive2sfSyncReceive.class, "ScSyncReceive2sfSyncReceive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScSyncReceive2sfSyncReceive_ScSyncReceive(), theRealtimestatechartPackage.getSynchronization(), null, "scSyncReceive", null, 0, 1, ScSyncReceive2sfSyncReceive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScSyncReceive2sfSyncReceive_SfEntryAction(), theStateflowPackage.getAction(), null, "sfEntryAction", null, 0, 1, ScSyncReceive2sfSyncReceive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScSyncReceive2sfSyncReceive_SfExitAction(), theStateflowPackage.getAction(), null, "sfExitAction", null, 0, 1, ScSyncReceive2sfSyncReceive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScSyncReceive2sfSyncReceive_SfTransEvent(), theStateflowPackage.getEvent(), null, "sfTransEvent", null, 0, 1, ScSyncReceive2sfSyncReceive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scSyncSend2sfSyncSendEClass, scSyncSend2sfSyncSend.class, "scSyncSend2sfSyncSend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getscSyncSend2sfSyncSend_SfGuard(), theStateflowPackage.getAction(), null, "sfGuard", null, 0, 1, scSyncSend2sfSyncSend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscSyncSend2sfSyncSend_SfAssignment(), theStateflowPackage.getAction(), null, "sfAssignment", null, 0, 1, scSyncSend2sfSyncSend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscSyncSend2sfSyncSend_ScTransAnnotation(), ecorePackage.getEAnnotation(), null, "scTransAnnotation", null, 0, 1, scSyncSend2sfSyncSend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscSyncSend2sfSyncSend_ScAnnDetails(), ecorePackage.getEStringToStringMapEntry(), null, "scAnnDetails", null, 0, 1, scSyncSend2sfSyncSend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scSyncPara2sfSyncParaDataEClass, ScSyncPara2sfSyncParaData.class, "ScSyncPara2sfSyncParaData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mT_Par2MTDEClass, MT_Par2MTD.class, "MT_Par2MTD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMT_Par2MTD_Mt(), theMsgtypePackage.getMessageType(), null, "mt", null, 0, 1, MT_Par2MTD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMT_Par2MTD_Par(), theBehaviorPackage_1.getParameter(), null, "par", null, 0, 1, MT_Par2MTD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMT_Par2MTD_Data(), theStateflowPackage.getData(), null, "data", null, 0, 1, MT_Par2MTD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scAttribute2sfDataEClass, scAttribute2sfData.class, "scAttribute2sfData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getscAttribute2sfData_ScAttribute(), theBehaviorPackage_1.getVariable(), null, "scAttribute", null, 0, 1, scAttribute2sfData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscAttribute2sfData_SfData(), theStateflowPackage.getData(), null, "sfData", null, 0, 1, scAttribute2sfData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscAttribute2sfData_ScType(), theTypesPackage.getDataType(), null, "scType", null, 0, 1, scAttribute2sfData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscAttribute2sfData_ScAttrType(), theTypesPackage.getDataType(), null, "scAttrType", null, 0, 1, scAttribute2sfData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scSendAsync2sfTransActionEClass, scSendAsync2sfTransAction.class, "scSendAsync2sfTransAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getscSendAsync2sfTransAction_SfSendAsync(), theStateflowPackage.getAction(), null, "sfSendAsync", null, 0, 1, scSendAsync2sfTransAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscSendAsync2sfTransAction_AsynchronousMessageEvent(), theRealtimestatechartPackage.getAsynchronousMessageEvent(), null, "AsynchronousMessageEvent", null, 0, 1, scSendAsync2sfTransAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscSendAsync2sfTransAction_Message(), theRealtimestatechartPackage.getMessage(), null, "Message", null, 0, 1, scSendAsync2sfTransAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getscSendAsync2sfTransAction_ActionValue(), ecorePackage.getEString(), "ActionValue", "", 0, 1, scSendAsync2sfTransAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscSendAsync2sfTransAction_ScPara(), ecorePackage.getEParameter(), null, "scPara", null, 0, 1, scSendAsync2sfTransAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscSendAsync2sfTransAction_ParBind(), theBehaviorPackage_1.getParameterBinding(), null, "parBind", null, 0, 1, scSendAsync2sfTransAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scSendParaBind2sfActionEClass, scSendParaBind2sfAction.class, "scSendParaBind2sfAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getscSendParaBind2sfAction_SfParaBAction(), theStateflowPackage.getAction(), null, "sfParaBAction", null, 0, 1, scSendParaBind2sfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscSendParaBind2sfAction_ScAnnotation(), ecorePackage.getEAnnotation(), null, "scAnnotation", null, 0, 1, scSendParaBind2sfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscSendParaBind2sfAction_ScDetails(), theEcorePackage.getEStringToStringMapEntry(), null, "scDetails", null, 0, 1, scSendParaBind2sfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scAsyncSend2sfActionEClass, scAsyncSend2sfAction.class, "scAsyncSend2sfAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getscAsyncSend2sfAction_SfEnqAction(), theStateflowPackage.getAction(), null, "sfEnqAction", null, 0, 1, scAsyncSend2sfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscAsyncSend2sfAction_AsynchronousMessageEvent(), theRealtimestatechartPackage.getAsynchronousMessageEvent(), null, "AsynchronousMessageEvent", null, 0, 1, scAsyncSend2sfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscAsyncSend2sfAction_EAnnotation(), ecorePackage.getEAnnotation(), null, "EAnnotation", null, 0, 1, scAsyncSend2sfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscAsyncSend2sfAction_EStringToStringMapEntry(), ecorePackage.getEStringToStringMapEntry(), null, "EStringToStringMapEntry", null, 0, 1, scAsyncSend2sfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scAsyncRec2sfAsyncGuardEClass, scAsyncRec2sfAsyncGuard.class, "scAsyncRec2sfAsyncGuard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getscAsyncRec2sfAsyncGuard_GuardAnnotation(), ecorePackage.getEStringToStringMapEntry(), null, "guardAnnotation", null, 0, 1, scAsyncRec2sfAsyncGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscAsyncRec2sfAsyncGuard_EAnnotation(), ecorePackage.getEAnnotation(), null, "EAnnotation", null, 0, 1, scAsyncRec2sfAsyncGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscAsyncRec2sfAsyncGuard_AsynchronousMessageEvent(), theRealtimestatechartPackage.getAsynchronousMessageEvent(), null, "AsynchronousMessageEvent", null, 0, 1, scAsyncRec2sfAsyncGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscAsyncRec2sfAsyncGuard_AsyncRecGuard(), theStateflowPackage.getAction(), null, "asyncRecGuard", null, 0, 1, scAsyncRec2sfAsyncGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scClock2sfDataEClass, scClock2sfData.class, "scClock2sfData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getscClock2sfData_ScClock(), theRealtimestatechartPackage.getClock(), null, "scClock", null, 0, 1, scClock2sfData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscClock2sfData_SfClockVariable(), theStateflowPackage.getData(), null, "sfClockVariable", null, 0, 1, scClock2sfData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scClockConstr2sfGuardEClass, scClockConstr2sfGuard.class, "scClockConstr2sfGuard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getscClockConstr2sfGuard_ScClockConstr(), theRealtimestatechartPackage.getClockConstraint(), null, "scClockConstr", null, 0, 1, scClockConstr2sfGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscClockConstr2sfGuard_ScBound(), theValuetypePackage.getTimeValue(), null, "scBound", null, 0, 1, scClockConstr2sfGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscClockConstr2sfGuard_ScClock(), theRealtimestatechartPackage.getClock(), null, "scClock", null, 0, 1, scClockConstr2sfGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscClockConstr2sfGuard_SfClockGuard(), theStateflowPackage.getAction(), null, "sfClockGuard", null, 0, 1, scClockConstr2sfGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clock2ClockResetEClass, clock2ClockReset.class, "clock2ClockReset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getclock2ClockReset_ScClock(), theRealtimestatechartPackage.getClock(), null, "scClock", null, 0, 1, clock2ClockReset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getclock2ClockReset_SfClockReset(), theStateflowPackage.getAction(), null, "sfClockReset", null, 0, 1, clock2ClockReset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scInvariant2sfInvErrorEClass, scInvariant2sfInvError.class, "scInvariant2sfInvError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getscInvariant2sfInvError_ScInvariant(), theRealtimestatechartPackage.getClockConstraint(), null, "scInvariant", null, 0, 1, scInvariant2sfInvError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscInvariant2sfInvError_ScBound(), theValuetypePackage.getTimeValue(), null, "scBound", null, 0, 1, scInvariant2sfInvError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscInvariant2sfInvError_ScClock(), theRealtimestatechartPackage.getClock(), null, "scClock", null, 0, 1, scInvariant2sfInvError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscInvariant2sfInvError_SfInvTrans(), theStateflowPackage.getTransition(), null, "sfInvTrans", null, 0, 1, scInvariant2sfInvError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscInvariant2sfInvError_SfInvGuard(), theStateflowPackage.getAction(), null, "sfInvGuard", null, 0, 1, scInvariant2sfInvError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscInvariant2sfInvError_SfInvNode(), theStateflowPackage.getState(), null, "sfInvNode", null, 0, 1, scInvariant2sfInvError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scGuard2sfGuardEClass, scGuard2sfGuard.class, "scGuard2sfGuard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getscGuard2sfGuard_SfGuard(), theStateflowPackage.getAction(), null, "sfGuard", null, 0, 1, scGuard2sfGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscGuard2sfGuard_ScAnnotation(), ecorePackage.getEAnnotation(), null, "scAnnotation", null, 0, 1, scGuard2sfGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscGuard2sfGuard_ScDetails(), ecorePackage.getEStringToStringMapEntry(), null, "scDetails", null, 0, 1, scGuard2sfGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scAction2sfActionEClass, scAction2sfAction.class, "scAction2sfAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getscAction2sfAction_ScAction(), theRealtimestatechartPackage.getAction(), null, "scAction", null, 0, 1, scAction2sfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscAction2sfAction_SfAction(), theStateflowPackage.getAction(), null, "sfAction", null, 0, 1, scAction2sfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscAction2sfAction_ScActionExpr(), theExpressionsPackage.getExpression(), null, "scActionExpr", null, 0, 1, scAction2sfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scOp2sfEmbFuncEClass, scOp2sfEmbFunc.class, "scOp2sfEmbFunc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getscOp2sfEmbFunc_ScOperation(), theBehaviorPackage_1.getOperation(), null, "scOperation", null, 0, 1, scOp2sfEmbFunc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscOp2sfEmbFunc_SfEmbFunc(), theStateflowPackage.getEmbeddedFunction(), null, "sfEmbFunc", null, 0, 1, scOp2sfEmbFunc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscOp2sfEmbFunc_ScAnnotation(), ecorePackage.getEAnnotation(), null, "scAnnotation", null, 0, 1, scOp2sfEmbFunc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscOp2sfEmbFunc_ScDetails(), ecorePackage.getEStringToStringMapEntry(), null, "scDetails", null, 0, 1, scOp2sfEmbFunc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scOpData2sfEmbFuncDataEClass, scOpData2sfEmbFuncData.class, "scOpData2sfEmbFuncData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getscOpData2sfEmbFuncData_ScParameter(), theBehaviorPackage_1.getParameter(), null, "scParameter", null, 0, 1, scOpData2sfEmbFuncData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscOpData2sfEmbFuncData_SfData(), theStateflowPackage.getData(), null, "sfData", null, 0, 1, scOpData2sfEmbFuncData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscOpData2sfEmbFuncData_ScParaType(), theTypesPackage.getPrimitiveDataType(), null, "scParaType", null, 0, 1, scOpData2sfEmbFuncData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scAsyncRec2sfDequeueEClass, scAsyncRec2sfDequeue.class, "scAsyncRec2sfDequeue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getscAsyncRec2sfDequeue_ScDetailsDequeue(), ecorePackage.getEStringToStringMapEntry(), null, "scDetailsDequeue", null, 0, 1, scAsyncRec2sfDequeue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscAsyncRec2sfDequeue_ScAction(), theStateflowPackage.getAction(), null, "scAction", null, 0, 1, scAsyncRec2sfDequeue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scActionSelfTrans2sfActionEClass, scActionSelfTrans2sfAction.class, "scActionSelfTrans2sfAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getscActionSelfTrans2sfAction_ScAction(), theRealtimestatechartPackage.getAction(), null, "scAction", null, 0, 1, scActionSelfTrans2sfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getscActionSelfTrans2sfAction_SfAction(), theStateflowPackage.getAction(), null, "sfAction", null, 0, 1, scActionSelfTrans2sfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //BehaviorPackageImpl
