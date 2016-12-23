/**
 */
package org.muml.simulink.adapter.corrmodel.behavior.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.muml.simulink.adapter.corrmodel.behavior.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorFactoryImpl extends EFactoryImpl implements BehaviorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviorFactory init() {
		try {
			BehaviorFactory theBehaviorFactory = (BehaviorFactory)EPackage.Registry.INSTANCE.getEFactory(BehaviorPackage.eNS_URI);
			if (theBehaviorFactory != null) {
				return theBehaviorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehaviorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorFactoryImpl() {
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
			case BehaviorPackage.RT_SC_CAT2_SF_M: return createRtScCat2SfM();
			case BehaviorPackage.FRT_SC2_CHART: return createFRtSc2Chart();
			case BehaviorPackage.SC_STATE2_SF_STATE: return createScState2SfState();
			case BehaviorPackage.SC_TRANS2_SF_TRANS: return createScTrans2SfTrans();
			case BehaviorPackage.SC_REGION2SF_PARALLEL: return createScRegion2sfParallel();
			case BehaviorPackage.SC_ENTRY2SF_ENTRY: return createScEntry2sfEntry();
			case BehaviorPackage.SC_EXIT2SF_EXIT: return createScExit2sfExit();
			case BehaviorPackage.SC_ST_EN_POINT2SF_TRANS: return createScStEnPoint2sfTrans();
			case BehaviorPackage.SC_ST_EX_POINT2SF_TRANS: return createScStExPoint2sfTrans();
			case BehaviorPackage.SC_SYNC_CHANNEL2SF_SIGNAL: return createScSyncChannel2sfSignal();
			case BehaviorPackage.SC_SYNC_RECEIVE_ACTION2SF_ACTION: return createScSyncReceiveAction2sfAction();
			case BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE: return createScSyncReceive2sfSyncReceive();
			case BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND: return createscSyncSend2sfSyncSend();
			case BehaviorPackage.SC_SYNC_PARA2SF_SYNC_PARA_DATA: return createScSyncPara2sfSyncParaData();
			case BehaviorPackage.MT_PAR2_MTD: return createMT_Par2MTD();
			case BehaviorPackage.SC_ATTRIBUTE2SF_DATA: return createscAttribute2sfData();
			case BehaviorPackage.SC_SEND_ASYNC2SF_TRANS_ACTION: return createscSendAsync2sfTransAction();
			case BehaviorPackage.SC_SEND_PARA_BIND2SF_ACTION: return createscSendParaBind2sfAction();
			case BehaviorPackage.SC_ASYNC_SEND2SF_ACTION: return createscAsyncSend2sfAction();
			case BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD: return createscAsyncRec2sfAsyncGuard();
			case BehaviorPackage.SC_CLOCK2SF_DATA: return createscClock2sfData();
			case BehaviorPackage.SC_CLOCK_CONSTR2SF_GUARD: return createscClockConstr2sfGuard();
			case BehaviorPackage.CLOCK2_CLOCK_RESET: return createclock2ClockReset();
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR: return createscInvariant2sfInvError();
			case BehaviorPackage.SC_GUARD2SF_GUARD: return createscGuard2sfGuard();
			case BehaviorPackage.SC_ACTION2SF_ACTION: return createscAction2sfAction();
			case BehaviorPackage.SC_OP2SF_EMB_FUNC: return createscOp2sfEmbFunc();
			case BehaviorPackage.SC_OP_DATA2SF_EMB_FUNC_DATA: return createscOpData2sfEmbFuncData();
			case BehaviorPackage.SC_ASYNC_REC2SF_DEQUEUE: return createscAsyncRec2sfDequeue();
			case BehaviorPackage.SC_ACTION_SELF_TRANS2SF_ACTION: return createscActionSelfTrans2sfAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtScCat2SfM createRtScCat2SfM() {
		RtScCat2SfMImpl rtScCat2SfM = new RtScCat2SfMImpl();
		return rtScCat2SfM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FRtSc2Chart createFRtSc2Chart() {
		FRtSc2ChartImpl fRtSc2Chart = new FRtSc2ChartImpl();
		return fRtSc2Chart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScState2SfState createScState2SfState() {
		ScState2SfStateImpl scState2SfState = new ScState2SfStateImpl();
		return scState2SfState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScTrans2SfTrans createScTrans2SfTrans() {
		ScTrans2SfTransImpl scTrans2SfTrans = new ScTrans2SfTransImpl();
		return scTrans2SfTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScRegion2sfParallel createScRegion2sfParallel() {
		ScRegion2sfParallelImpl scRegion2sfParallel = new ScRegion2sfParallelImpl();
		return scRegion2sfParallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScEntry2sfEntry createScEntry2sfEntry() {
		ScEntry2sfEntryImpl scEntry2sfEntry = new ScEntry2sfEntryImpl();
		return scEntry2sfEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScExit2sfExit createScExit2sfExit() {
		ScExit2sfExitImpl scExit2sfExit = new ScExit2sfExitImpl();
		return scExit2sfExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScStEnPoint2sfTrans createScStEnPoint2sfTrans() {
		ScStEnPoint2sfTransImpl scStEnPoint2sfTrans = new ScStEnPoint2sfTransImpl();
		return scStEnPoint2sfTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScStExPoint2sfTrans createScStExPoint2sfTrans() {
		ScStExPoint2sfTransImpl scStExPoint2sfTrans = new ScStExPoint2sfTransImpl();
		return scStExPoint2sfTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScSyncChannel2sfSignal createScSyncChannel2sfSignal() {
		ScSyncChannel2sfSignalImpl scSyncChannel2sfSignal = new ScSyncChannel2sfSignalImpl();
		return scSyncChannel2sfSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScSyncReceiveAction2sfAction createScSyncReceiveAction2sfAction() {
		ScSyncReceiveAction2sfActionImpl scSyncReceiveAction2sfAction = new ScSyncReceiveAction2sfActionImpl();
		return scSyncReceiveAction2sfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScSyncReceive2sfSyncReceive createScSyncReceive2sfSyncReceive() {
		ScSyncReceive2sfSyncReceiveImpl scSyncReceive2sfSyncReceive = new ScSyncReceive2sfSyncReceiveImpl();
		return scSyncReceive2sfSyncReceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scSyncSend2sfSyncSend createscSyncSend2sfSyncSend() {
		scSyncSend2sfSyncSendImpl scSyncSend2sfSyncSend = new scSyncSend2sfSyncSendImpl();
		return scSyncSend2sfSyncSend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScSyncPara2sfSyncParaData createScSyncPara2sfSyncParaData() {
		ScSyncPara2sfSyncParaDataImpl scSyncPara2sfSyncParaData = new ScSyncPara2sfSyncParaDataImpl();
		return scSyncPara2sfSyncParaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MT_Par2MTD createMT_Par2MTD() {
		MT_Par2MTDImpl mT_Par2MTD = new MT_Par2MTDImpl();
		return mT_Par2MTD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scAttribute2sfData createscAttribute2sfData() {
		scAttribute2sfDataImpl scAttribute2sfData = new scAttribute2sfDataImpl();
		return scAttribute2sfData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scSendAsync2sfTransAction createscSendAsync2sfTransAction() {
		scSendAsync2sfTransActionImpl scSendAsync2sfTransAction = new scSendAsync2sfTransActionImpl();
		return scSendAsync2sfTransAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scSendParaBind2sfAction createscSendParaBind2sfAction() {
		scSendParaBind2sfActionImpl scSendParaBind2sfAction = new scSendParaBind2sfActionImpl();
		return scSendParaBind2sfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scAsyncSend2sfAction createscAsyncSend2sfAction() {
		scAsyncSend2sfActionImpl scAsyncSend2sfAction = new scAsyncSend2sfActionImpl();
		return scAsyncSend2sfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scAsyncRec2sfAsyncGuard createscAsyncRec2sfAsyncGuard() {
		scAsyncRec2sfAsyncGuardImpl scAsyncRec2sfAsyncGuard = new scAsyncRec2sfAsyncGuardImpl();
		return scAsyncRec2sfAsyncGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scClock2sfData createscClock2sfData() {
		scClock2sfDataImpl scClock2sfData = new scClock2sfDataImpl();
		return scClock2sfData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scClockConstr2sfGuard createscClockConstr2sfGuard() {
		scClockConstr2sfGuardImpl scClockConstr2sfGuard = new scClockConstr2sfGuardImpl();
		return scClockConstr2sfGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public clock2ClockReset createclock2ClockReset() {
		clock2ClockResetImpl clock2ClockReset = new clock2ClockResetImpl();
		return clock2ClockReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scInvariant2sfInvError createscInvariant2sfInvError() {
		scInvariant2sfInvErrorImpl scInvariant2sfInvError = new scInvariant2sfInvErrorImpl();
		return scInvariant2sfInvError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scGuard2sfGuard createscGuard2sfGuard() {
		scGuard2sfGuardImpl scGuard2sfGuard = new scGuard2sfGuardImpl();
		return scGuard2sfGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scAction2sfAction createscAction2sfAction() {
		scAction2sfActionImpl scAction2sfAction = new scAction2sfActionImpl();
		return scAction2sfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scOp2sfEmbFunc createscOp2sfEmbFunc() {
		scOp2sfEmbFuncImpl scOp2sfEmbFunc = new scOp2sfEmbFuncImpl();
		return scOp2sfEmbFunc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scOpData2sfEmbFuncData createscOpData2sfEmbFuncData() {
		scOpData2sfEmbFuncDataImpl scOpData2sfEmbFuncData = new scOpData2sfEmbFuncDataImpl();
		return scOpData2sfEmbFuncData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scAsyncRec2sfDequeue createscAsyncRec2sfDequeue() {
		scAsyncRec2sfDequeueImpl scAsyncRec2sfDequeue = new scAsyncRec2sfDequeueImpl();
		return scAsyncRec2sfDequeue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scActionSelfTrans2sfAction createscActionSelfTrans2sfAction() {
		scActionSelfTrans2sfActionImpl scActionSelfTrans2sfAction = new scActionSelfTrans2sfActionImpl();
		return scActionSelfTrans2sfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorPackage getBehaviorPackage() {
		return (BehaviorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehaviorPackage getPackage() {
		return BehaviorPackage.eINSTANCE;
	}

} //BehaviorFactoryImpl
