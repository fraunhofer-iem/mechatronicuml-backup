/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode;
import org.muml.simulink.adapter.corrmodel.behavior.Behavior_modelPackage;
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

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.muml.simulink.adapter.corrmodel.behavior.Behavior_modelPackage
 * @generated
 */
public class Behavior_modelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Behavior_modelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior_modelSwitch() {
		if (modelPackage == null) {
			modelPackage = Behavior_modelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Behavior_modelPackage.RT_SC_CAT2_SF_M: {
				RtScCat2SfM rtScCat2SfM = (RtScCat2SfM)theEObject;
				T result = caseRtScCat2SfM(rtScCat2SfM);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(rtScCat2SfM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.FRT_SC2_CHART: {
				FRtSc2Chart fRtSc2Chart = (FRtSc2Chart)theEObject;
				T result = caseFRtSc2Chart(fRtSc2Chart);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(fRtSc2Chart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_STATE2_SF_STATE: {
				ScState2SfState scState2SfState = (ScState2SfState)theEObject;
				T result = caseScState2SfState(scState2SfState);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scState2SfState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_TRANS2_SF_TRANS: {
				ScTrans2SfTrans scTrans2SfTrans = (ScTrans2SfTrans)theEObject;
				T result = caseScTrans2SfTrans(scTrans2SfTrans);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scTrans2SfTrans);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_REGION2SF_PARALLEL: {
				ScRegion2sfParallel scRegion2sfParallel = (ScRegion2sfParallel)theEObject;
				T result = caseScRegion2sfParallel(scRegion2sfParallel);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scRegion2sfParallel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_ENTRY2SF_ENTRY: {
				ScEntry2sfEntry scEntry2sfEntry = (ScEntry2sfEntry)theEObject;
				T result = caseScEntry2sfEntry(scEntry2sfEntry);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scEntry2sfEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_EXIT2SF_EXIT: {
				ScExit2sfExit scExit2sfExit = (ScExit2sfExit)theEObject;
				T result = caseScExit2sfExit(scExit2sfExit);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scExit2sfExit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_ST_EN_POINT2SF_TRANS: {
				ScStEnPoint2sfTrans scStEnPoint2sfTrans = (ScStEnPoint2sfTrans)theEObject;
				T result = caseScStEnPoint2sfTrans(scStEnPoint2sfTrans);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scStEnPoint2sfTrans);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_ST_EX_POINT2SF_TRANS: {
				ScStExPoint2sfTrans scStExPoint2sfTrans = (ScStExPoint2sfTrans)theEObject;
				T result = caseScStExPoint2sfTrans(scStExPoint2sfTrans);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scStExPoint2sfTrans);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_SYNC_CHANNEL2SF_SIGNAL: {
				ScSyncChannel2sfSignal scSyncChannel2sfSignal = (ScSyncChannel2sfSignal)theEObject;
				T result = caseScSyncChannel2sfSignal(scSyncChannel2sfSignal);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scSyncChannel2sfSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_SYNC_RECEIVE_ACTION2SF_ACTION: {
				ScSyncReceiveAction2sfAction scSyncReceiveAction2sfAction = (ScSyncReceiveAction2sfAction)theEObject;
				T result = caseScSyncReceiveAction2sfAction(scSyncReceiveAction2sfAction);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scSyncReceiveAction2sfAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE: {
				ScSyncReceive2sfSyncReceive scSyncReceive2sfSyncReceive = (ScSyncReceive2sfSyncReceive)theEObject;
				T result = caseScSyncReceive2sfSyncReceive(scSyncReceive2sfSyncReceive);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scSyncReceive2sfSyncReceive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_SYNC_SEND2SF_SYNC_SEND: {
				scSyncSend2sfSyncSend scSyncSend2sfSyncSend = (scSyncSend2sfSyncSend)theEObject;
				T result = casescSyncSend2sfSyncSend(scSyncSend2sfSyncSend);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scSyncSend2sfSyncSend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_SYNC_PARA2SF_SYNC_PARA_DATA: {
				ScSyncPara2sfSyncParaData scSyncPara2sfSyncParaData = (ScSyncPara2sfSyncParaData)theEObject;
				T result = caseScSyncPara2sfSyncParaData(scSyncPara2sfSyncParaData);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scSyncPara2sfSyncParaData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.MT_PAR2_MTD: {
				MT_Par2MTD mT_Par2MTD = (MT_Par2MTD)theEObject;
				T result = caseMT_Par2MTD(mT_Par2MTD);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(mT_Par2MTD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA: {
				scAttribute2sfData scAttribute2sfData = (scAttribute2sfData)theEObject;
				T result = casescAttribute2sfData(scAttribute2sfData);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scAttribute2sfData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION: {
				scSendAsync2sfTransAction scSendAsync2sfTransAction = (scSendAsync2sfTransAction)theEObject;
				T result = casescSendAsync2sfTransAction(scSendAsync2sfTransAction);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scSendAsync2sfTransAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_SEND_PARA_BIND2SF_ACTION: {
				scSendParaBind2sfAction scSendParaBind2sfAction = (scSendParaBind2sfAction)theEObject;
				T result = casescSendParaBind2sfAction(scSendParaBind2sfAction);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scSendParaBind2sfAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION: {
				scAsyncSend2sfAction scAsyncSend2sfAction = (scAsyncSend2sfAction)theEObject;
				T result = casescAsyncSend2sfAction(scAsyncSend2sfAction);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scAsyncSend2sfAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_ASYNC_REC2SF_ASYNC_GUARD: {
				scAsyncRec2sfAsyncGuard scAsyncRec2sfAsyncGuard = (scAsyncRec2sfAsyncGuard)theEObject;
				T result = casescAsyncRec2sfAsyncGuard(scAsyncRec2sfAsyncGuard);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scAsyncRec2sfAsyncGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_CLOCK2SF_DATA: {
				scClock2sfData scClock2sfData = (scClock2sfData)theEObject;
				T result = casescClock2sfData(scClock2sfData);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scClock2sfData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD: {
				scClockConstr2sfGuard scClockConstr2sfGuard = (scClockConstr2sfGuard)theEObject;
				T result = casescClockConstr2sfGuard(scClockConstr2sfGuard);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scClockConstr2sfGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.CLOCK2_CLOCK_RESET: {
				clock2ClockReset clock2ClockReset = (clock2ClockReset)theEObject;
				T result = caseclock2ClockReset(clock2ClockReset);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(clock2ClockReset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_INVARIANT2SF_INV_ERROR: {
				scInvariant2sfInvError scInvariant2sfInvError = (scInvariant2sfInvError)theEObject;
				T result = casescInvariant2sfInvError(scInvariant2sfInvError);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scInvariant2sfInvError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_GUARD2SF_GUARD: {
				scGuard2sfGuard scGuard2sfGuard = (scGuard2sfGuard)theEObject;
				T result = casescGuard2sfGuard(scGuard2sfGuard);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scGuard2sfGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_ACTION2SF_ACTION: {
				scAction2sfAction scAction2sfAction = (scAction2sfAction)theEObject;
				T result = casescAction2sfAction(scAction2sfAction);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scAction2sfAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_OP2SF_EMB_FUNC: {
				scOp2sfEmbFunc scOp2sfEmbFunc = (scOp2sfEmbFunc)theEObject;
				T result = casescOp2sfEmbFunc(scOp2sfEmbFunc);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scOp2sfEmbFunc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_OP_DATA2SF_EMB_FUNC_DATA: {
				scOpData2sfEmbFuncData scOpData2sfEmbFuncData = (scOpData2sfEmbFuncData)theEObject;
				T result = casescOpData2sfEmbFuncData(scOpData2sfEmbFuncData);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scOpData2sfEmbFuncData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_ASYNC_REC2SF_DEQUEUE: {
				scAsyncRec2sfDequeue scAsyncRec2sfDequeue = (scAsyncRec2sfDequeue)theEObject;
				T result = casescAsyncRec2sfDequeue(scAsyncRec2sfDequeue);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scAsyncRec2sfDequeue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Behavior_modelPackage.SC_ACTION_SELF_TRANS2SF_ACTION: {
				scActionSelfTrans2sfAction scActionSelfTrans2sfAction = (scActionSelfTrans2sfAction)theEObject;
				T result = casescActionSelfTrans2sfAction(scActionSelfTrans2sfAction);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(scActionSelfTrans2sfAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rt Sc Cat2 Sf M</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rt Sc Cat2 Sf M</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtScCat2SfM(RtScCat2SfM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FRt Sc2 Chart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FRt Sc2 Chart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFRtSc2Chart(FRtSc2Chart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sc State2 Sf State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sc State2 Sf State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScState2SfState(ScState2SfState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sc Trans2 Sf Trans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sc Trans2 Sf Trans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScTrans2SfTrans(ScTrans2SfTrans object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sc Region2sf Parallel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sc Region2sf Parallel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScRegion2sfParallel(ScRegion2sfParallel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sc Entry2sf Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sc Entry2sf Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScEntry2sfEntry(ScEntry2sfEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sc Exit2sf Exit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sc Exit2sf Exit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScExit2sfExit(ScExit2sfExit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sc St En Point2sf Trans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sc St En Point2sf Trans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScStEnPoint2sfTrans(ScStEnPoint2sfTrans object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sc St Ex Point2sf Trans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sc St Ex Point2sf Trans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScStExPoint2sfTrans(ScStExPoint2sfTrans object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sc Sync Channel2sf Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sc Sync Channel2sf Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScSyncChannel2sfSignal(ScSyncChannel2sfSignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sc Sync Receive Action2sf Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sc Sync Receive Action2sf Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScSyncReceiveAction2sfAction(ScSyncReceiveAction2sfAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sc Sync Receive2sf Sync Receive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sc Sync Receive2sf Sync Receive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScSyncReceive2sfSyncReceive(ScSyncReceive2sfSyncReceive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sc Sync Send2sf Sync Send</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sc Sync Send2sf Sync Send</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casescSyncSend2sfSyncSend(scSyncSend2sfSyncSend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sc Sync Para2sf Sync Para Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sc Sync Para2sf Sync Para Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScSyncPara2sfSyncParaData(ScSyncPara2sfSyncParaData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MT Par2 MTD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT Par2 MTD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMT_Par2MTD(MT_Par2MTD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sc Attribute2sf Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sc Attribute2sf Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casescAttribute2sfData(scAttribute2sfData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sc Send Async2sf Trans Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sc Send Async2sf Trans Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casescSendAsync2sfTransAction(scSendAsync2sfTransAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sc Send Para Bind2sf Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sc Send Para Bind2sf Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casescSendParaBind2sfAction(scSendParaBind2sfAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sc Async Send2sf Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sc Async Send2sf Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casescAsyncSend2sfAction(scAsyncSend2sfAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sc Async Rec2sf Async Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sc Async Rec2sf Async Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casescAsyncRec2sfAsyncGuard(scAsyncRec2sfAsyncGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sc Clock2sf Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sc Clock2sf Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casescClock2sfData(scClock2sfData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sc Clock Constr2sf Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sc Clock Constr2sf Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casescClockConstr2sfGuard(scClockConstr2sfGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>clock2 Clock Reset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>clock2 Clock Reset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseclock2ClockReset(clock2ClockReset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sc Invariant2sf Inv Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sc Invariant2sf Inv Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casescInvariant2sfInvError(scInvariant2sfInvError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sc Guard2sf Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sc Guard2sf Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casescGuard2sfGuard(scGuard2sfGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sc Action2sf Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sc Action2sf Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casescAction2sfAction(scAction2sfAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sc Op2sf Emb Func</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sc Op2sf Emb Func</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casescOp2sfEmbFunc(scOp2sfEmbFunc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sc Op Data2sf Emb Func Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sc Op Data2sf Emb Func Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casescOpData2sfEmbFuncData(scOpData2sfEmbFuncData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sc Async Rec2sf Dequeue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sc Async Rec2sf Dequeue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casescAsyncRec2sfDequeue(scAsyncRec2sfDequeue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sc Action Self Trans2sf Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sc Action Self Trans2sf Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casescActionSelfTrans2sfAction(scActionSelfTrans2sfAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Container Correspondence Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Container Correspondence Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractContainerCorrespondenceNode(AbstractContainerCorrespondenceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Behavior_modelSwitch
