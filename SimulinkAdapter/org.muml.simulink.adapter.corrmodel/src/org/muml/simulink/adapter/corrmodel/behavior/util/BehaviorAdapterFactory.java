/**
 */
package org.muml.simulink.adapter.corrmodel.behavior.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode;

import org.muml.simulink.adapter.corrmodel.behavior.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage
 * @generated
 */
public class BehaviorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BehaviorPackage.eINSTANCE;
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
	protected BehaviorSwitch<Adapter> modelSwitch =
		new BehaviorSwitch<Adapter>() {
			@Override
			public Adapter caseRtScCat2SfM(RtScCat2SfM object) {
				return createRtScCat2SfMAdapter();
			}
			@Override
			public Adapter caseFRtSc2Chart(FRtSc2Chart object) {
				return createFRtSc2ChartAdapter();
			}
			@Override
			public Adapter caseScState2SfState(ScState2SfState object) {
				return createScState2SfStateAdapter();
			}
			@Override
			public Adapter caseScTrans2SfTrans(ScTrans2SfTrans object) {
				return createScTrans2SfTransAdapter();
			}
			@Override
			public Adapter caseScRegion2sfParallel(ScRegion2sfParallel object) {
				return createScRegion2sfParallelAdapter();
			}
			@Override
			public Adapter caseScEntry2sfEntry(ScEntry2sfEntry object) {
				return createScEntry2sfEntryAdapter();
			}
			@Override
			public Adapter caseScExit2sfExit(ScExit2sfExit object) {
				return createScExit2sfExitAdapter();
			}
			@Override
			public Adapter caseScStEnPoint2sfTrans(ScStEnPoint2sfTrans object) {
				return createScStEnPoint2sfTransAdapter();
			}
			@Override
			public Adapter caseScStExPoint2sfTrans(ScStExPoint2sfTrans object) {
				return createScStExPoint2sfTransAdapter();
			}
			@Override
			public Adapter caseScSyncChannel2sfSignal(ScSyncChannel2sfSignal object) {
				return createScSyncChannel2sfSignalAdapter();
			}
			@Override
			public Adapter caseScSyncReceiveAction2sfAction(ScSyncReceiveAction2sfAction object) {
				return createScSyncReceiveAction2sfActionAdapter();
			}
			@Override
			public Adapter caseScSyncReceive2sfSyncReceive(ScSyncReceive2sfSyncReceive object) {
				return createScSyncReceive2sfSyncReceiveAdapter();
			}
			@Override
			public Adapter casescSyncSend2sfSyncSend(scSyncSend2sfSyncSend object) {
				return createscSyncSend2sfSyncSendAdapter();
			}
			@Override
			public Adapter caseScSyncPara2sfSyncParaData(ScSyncPara2sfSyncParaData object) {
				return createScSyncPara2sfSyncParaDataAdapter();
			}
			@Override
			public Adapter caseMT_Par2MTD(MT_Par2MTD object) {
				return createMT_Par2MTDAdapter();
			}
			@Override
			public Adapter casescAttribute2sfData(scAttribute2sfData object) {
				return createscAttribute2sfDataAdapter();
			}
			@Override
			public Adapter casescSendAsync2sfTransAction(scSendAsync2sfTransAction object) {
				return createscSendAsync2sfTransActionAdapter();
			}
			@Override
			public Adapter casescSendParaBind2sfAction(scSendParaBind2sfAction object) {
				return createscSendParaBind2sfActionAdapter();
			}
			@Override
			public Adapter casescAsyncSend2sfAction(scAsyncSend2sfAction object) {
				return createscAsyncSend2sfActionAdapter();
			}
			@Override
			public Adapter casescAsyncRec2sfAsyncGuard(scAsyncRec2sfAsyncGuard object) {
				return createscAsyncRec2sfAsyncGuardAdapter();
			}
			@Override
			public Adapter casescClock2sfData(scClock2sfData object) {
				return createscClock2sfDataAdapter();
			}
			@Override
			public Adapter casescClockConstr2sfGuard(scClockConstr2sfGuard object) {
				return createscClockConstr2sfGuardAdapter();
			}
			@Override
			public Adapter caseclock2ClockReset(clock2ClockReset object) {
				return createclock2ClockResetAdapter();
			}
			@Override
			public Adapter casescInvariant2sfInvError(scInvariant2sfInvError object) {
				return createscInvariant2sfInvErrorAdapter();
			}
			@Override
			public Adapter casescGuard2sfGuard(scGuard2sfGuard object) {
				return createscGuard2sfGuardAdapter();
			}
			@Override
			public Adapter casescAction2sfAction(scAction2sfAction object) {
				return createscAction2sfActionAdapter();
			}
			@Override
			public Adapter casescOp2sfEmbFunc(scOp2sfEmbFunc object) {
				return createscOp2sfEmbFuncAdapter();
			}
			@Override
			public Adapter casescOpData2sfEmbFuncData(scOpData2sfEmbFuncData object) {
				return createscOpData2sfEmbFuncDataAdapter();
			}
			@Override
			public Adapter casescAsyncRec2sfDequeue(scAsyncRec2sfDequeue object) {
				return createscAsyncRec2sfDequeueAdapter();
			}
			@Override
			public Adapter casescActionSelfTrans2sfAction(scActionSelfTrans2sfAction object) {
				return createscActionSelfTrans2sfActionAdapter();
			}
			@Override
			public Adapter caseAbstractContainerCorrespondenceNode(AbstractContainerCorrespondenceNode object) {
				return createAbstractContainerCorrespondenceNodeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.RtScCat2SfM <em>Rt Sc Cat2 Sf M</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.RtScCat2SfM
	 * @generated
	 */
	public Adapter createRtScCat2SfMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart <em>FRt Sc2 Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart
	 * @generated
	 */
	public Adapter createFRtSc2ChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.ScState2SfState <em>Sc State2 Sf State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScState2SfState
	 * @generated
	 */
	public Adapter createScState2SfStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.ScTrans2SfTrans <em>Sc Trans2 Sf Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScTrans2SfTrans
	 * @generated
	 */
	public Adapter createScTrans2SfTransAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.ScRegion2sfParallel <em>Sc Region2sf Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScRegion2sfParallel
	 * @generated
	 */
	public Adapter createScRegion2sfParallelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry <em>Sc Entry2sf Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry
	 * @generated
	 */
	public Adapter createScEntry2sfEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit <em>Sc Exit2sf Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit
	 * @generated
	 */
	public Adapter createScExit2sfExitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.ScStEnPoint2sfTrans <em>Sc St En Point2sf Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScStEnPoint2sfTrans
	 * @generated
	 */
	public Adapter createScStEnPoint2sfTransAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.ScStExPoint2sfTrans <em>Sc St Ex Point2sf Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScStExPoint2sfTrans
	 * @generated
	 */
	public Adapter createScStExPoint2sfTransAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncChannel2sfSignal <em>Sc Sync Channel2sf Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScSyncChannel2sfSignal
	 * @generated
	 */
	public Adapter createScSyncChannel2sfSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceiveAction2sfAction <em>Sc Sync Receive Action2sf Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceiveAction2sfAction
	 * @generated
	 */
	public Adapter createScSyncReceiveAction2sfActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceive2sfSyncReceive <em>Sc Sync Receive2sf Sync Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceive2sfSyncReceive
	 * @generated
	 */
	public Adapter createScSyncReceive2sfSyncReceiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.scSyncSend2sfSyncSend <em>sc Sync Send2sf Sync Send</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scSyncSend2sfSyncSend
	 * @generated
	 */
	public Adapter createscSyncSend2sfSyncSendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncPara2sfSyncParaData <em>Sc Sync Para2sf Sync Para Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScSyncPara2sfSyncParaData
	 * @generated
	 */
	public Adapter createScSyncPara2sfSyncParaDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.MT_Par2MTD <em>MT Par2 MTD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.MT_Par2MTD
	 * @generated
	 */
	public Adapter createMT_Par2MTDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.scAttribute2sfData <em>sc Attribute2sf Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAttribute2sfData
	 * @generated
	 */
	public Adapter createscAttribute2sfDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction <em>sc Send Async2sf Trans Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction
	 * @generated
	 */
	public Adapter createscSendAsync2sfTransActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.scSendParaBind2sfAction <em>sc Send Para Bind2sf Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scSendParaBind2sfAction
	 * @generated
	 */
	public Adapter createscSendParaBind2sfActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncSend2sfAction <em>sc Async Send2sf Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAsyncSend2sfAction
	 * @generated
	 */
	public Adapter createscAsyncSend2sfActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfAsyncGuard <em>sc Async Rec2sf Async Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfAsyncGuard
	 * @generated
	 */
	public Adapter createscAsyncRec2sfAsyncGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.scClock2sfData <em>sc Clock2sf Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scClock2sfData
	 * @generated
	 */
	public Adapter createscClock2sfDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.scClockConstr2sfGuard <em>sc Clock Constr2sf Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scClockConstr2sfGuard
	 * @generated
	 */
	public Adapter createscClockConstr2sfGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.clock2ClockReset <em>clock2 Clock Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.clock2ClockReset
	 * @generated
	 */
	public Adapter createclock2ClockResetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError <em>sc Invariant2sf Inv Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError
	 * @generated
	 */
	public Adapter createscInvariant2sfInvErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.scGuard2sfGuard <em>sc Guard2sf Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scGuard2sfGuard
	 * @generated
	 */
	public Adapter createscGuard2sfGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.scAction2sfAction <em>sc Action2sf Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAction2sfAction
	 * @generated
	 */
	public Adapter createscAction2sfActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.scOp2sfEmbFunc <em>sc Op2sf Emb Func</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scOp2sfEmbFunc
	 * @generated
	 */
	public Adapter createscOp2sfEmbFuncAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.scOpData2sfEmbFuncData <em>sc Op Data2sf Emb Func Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scOpData2sfEmbFuncData
	 * @generated
	 */
	public Adapter createscOpData2sfEmbFuncDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfDequeue <em>sc Async Rec2sf Dequeue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfDequeue
	 * @generated
	 */
	public Adapter createscAsyncRec2sfDequeueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.behavior.scActionSelfTrans2sfAction <em>sc Action Self Trans2sf Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scActionSelfTrans2sfAction
	 * @generated
	 */
	public Adapter createscActionSelfTrans2sfActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode <em>Abstract Container Correspondence Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode
	 * @generated
	 */
	public Adapter createAbstractContainerCorrespondenceNodeAdapter() {
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

} //BehaviorAdapterFactory
