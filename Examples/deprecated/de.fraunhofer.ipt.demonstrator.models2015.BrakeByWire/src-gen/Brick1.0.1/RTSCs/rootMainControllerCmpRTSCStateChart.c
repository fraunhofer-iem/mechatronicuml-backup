
		////////////////////////////////////////////////////////////////////////////////
		// Includes
		////////////////////////////////////////////////////////////////////////////////
		#include <stdio.h>
		#include <stdlib.h>
		#include "../GlobalIdentifier.h"
		#include "rootMainControllerCmpRTSCStateChart.h"
		
		



		
		////////////////////////////////////////////////////////////////////////////////
		// Initialization
		////////////////////////////////////////////////////////////////////////////////
		void initializeROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainControllerBehaviorRTSCRegion(
				RootMainControllerCmpRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainControllerBehaviorRTSC_MainControllerBehaviorRTSC =
					ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLERBEHAVIORRTSC_MAINCONTROLLERBEHAVIORRTSC_INIT_STATE;
		
			// execute entry actions
			if (stateChart->ColorPort_apiValue == 1) {
				stateChart->loadStationFlag = true;
		
			} else {
				stateChart->unloadStationFlag = false;
				stateChart->loadStationFlag = false;
		
			}
		
			;
		
			Clock_reset(
					stateChart->checkColorClock_ofcurrentStateOfRootMainControllerCmpRTSCClock);
		
		}
		void initializeROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PickingUpControllerPortRTSCRegion(
				RootMainControllerCmpRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PickingUpControllerPortRTSC_PickingUpControllerPortRTSC =
					ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PICKINGUPCONTROLLERPORTRTSC_PICKINGUPCONTROLLERPORTRTSC_INIT_STATE;
		
			// execute entry actions
		
			// nothing to do
		
		}
		void initializeROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DrivingControllerPortRTSCRegion(
				RootMainControllerCmpRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DrivingControllerPortRTSC_DrivingControllerPortRTSC =
					ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DRIVINGCONTROLLERPORTRTSC_DRIVINGCONTROLLERPORTRTSC_DRIVE_STATE;
		
			// execute entry actions
		
			stateChart->deliveryFinishedFlag = false;
		
			;
		
		}
		void initializeROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSCRegion(
				RootMainControllerCmpRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC_LoadingControllerPortRTSC =
					ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_INIT_STATE;
		
			// execute entry actions
		
			// nothing to do
		
		}
		void initializeROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainController_ColorPort_behaviorRegion(
				RootMainControllerCmpRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainController_ColorPort_behavior_MainController_ColorPort_behavior =
					ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
		}
		void initializeROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootMainControllerCmpRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		
		void RootMainControllerCmpRTSCStateChart_initialize(
				RootMainControllerCmpRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->checkColorClock_ofcurrentStateOfRootMainControllerCmpRTSCClock);
			Clock_reset(
					stateChart->stopClock_ofcurrentStateOfRootMainControllerCmpRTSCClock);
		
			stateChart->loadStationFlag = false;
			stateChart->unloadStationFlag = false;
			stateChart->loadTimeConst = 3;
			stateChart->unloadTimeConst = 5;
			stateChart->checkColorTimeConst = 300;
			stateChart->loadedFlag = false;
			stateChart->deliveryFinishedFlag = false;
			stateChart->ColorPort_apiValue = 0;
		
			stateChart->currentStateOfRootMainControllerCmpRTSC =
					ROOTMAINCONTROLLERCMPRTSC_INIT_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainControllerBehaviorRTSCRegion(
					stateChart);
			initializeROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PickingUpControllerPortRTSCRegion(
					stateChart);
			initializeROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DrivingControllerPortRTSCRegion(
					stateChart);
			initializeROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSCRegion(
					stateChart);
			initializeROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainController_ColorPort_behaviorRegion(
					stateChart);
		}
		
		

		////////////////////////////////////////////////////////////////////////////////
		// Construction and destruction
		////////////////////////////////////////////////////////////////////////////////
		RootMainControllerCmpRTSCStateChart* RootMainControllerCmpRTSCStateChart_create(
				MainControllerComponent* parentComponent) {
			RootMainControllerCmpRTSCStateChart* stateChart =
					(RootMainControllerCmpRTSCStateChart*) malloc(
							sizeof(RootMainControllerCmpRTSCStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
		
				/*
				 if (stateChart->parentComponent != NULL
				 ) {
				 RootMainControllerCmpRTSCStateChart_initialize(stateChart);
				 } else {
				 fprintf(stderr, "Initialization of RootMainControllerCmpRTSCStateChart failed\n");
		
				 RootMainControllerCmpRTSCStateChart_destroy(stateChart);
				 stateChart = NULL;
				 }
				 } else {
				 fprintf(stderr, "Creation of RootMainControllerCmpRTSCStateChart failed\n");
				 */}
			return stateChart;
		}
		

			void RootMainControllerCmpRTSCStateChart_destroy(RootMainControllerCmpRTSCStateChart* stateChart) {
				if(stateChart != NULL) {
		
					free(stateChart);
				}
			}
	
		////////////////////////////////////////////////////////////////////////////////
		// Processing the statechart
		////////////////////////////////////////////////////////////////////////////////
	
		

		
		void ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainControllerBehaviorRTSC_MainControllerBehaviorRTSCStateChart_processStep(
				RootMainControllerCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainControllerBehaviorRTSC_MainControllerBehaviorRTSC) {
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLERBEHAVIORRTSC_MAINCONTROLLERBEHAVIORRTSC_INIT_STATE:
				if (Clock_getTime(
						stateChart->checkColorClock_ofcurrentStateOfRootMainControllerCmpRTSCClock)
						> stateChart->checkColorTimeConst * 1.0
		
						) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainControllerBehaviorRTSC_MainControllerBehaviorRTSC =
							ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLERBEHAVIORRTSC_MAINCONTROLLERBEHAVIORRTSC_INIT_STATE;
		
					// execute entry actions
		
					if (stateChart->ColorPort_apiValue == 1) {
		
						stateChart->loadStationFlag = true;
		
					}
		
					else {
		
						stateChart->unloadStationFlag = false;
		
						stateChart->loadStationFlag = false;
		
					}
		
					;
		
					Clock_reset(
							stateChart->checkColorClock_ofcurrentStateOfRootMainControllerCmpRTSCClock);
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			default:
				break;
			}
		}
		
		void ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PickingUpControllerPortRTSC_PickingUpControllerPortRTSCStateChart_processStep(
		
		RootMainControllerCmpRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PickingUpControllerPortRTSC_PickingUpControllerPortRTSC) {
		
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PICKINGUPCONTROLLERPORTRTSC_PICKINGUPCONTROLLERPORTRTSC_INIT_STATE:
		
				if (
		
				stateChart->loadStationFlag && unsupportedstateChart->loadedFlag
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->pickingUpControllerPortPort->ID),
		
					MESSAGE_INITIATEDELIVERYDELIVERYMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_INITIATEDELIVERYDELIVERYMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PickingUpControllerPortRTSC_PickingUpControllerPortRTSC =
		
							ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PICKINGUPCONTROLLERPORTRTSC_PICKINGUPCONTROLLERPORTRTSC_SENDPICKUP_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PICKINGUPCONTROLLERPORTRTSC_PICKINGUPCONTROLLERPORTRTSC_SENDPICKUP_STATE:
		
				if (Port_doesMessageExist(
		
				MainControllerComponent_getPickingUpControllerPort(
		
				stateChart->parentComponent),
		
				MESSAGE_FINISHEDDELIVERYDELIVERYMESSAGESMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					MainControllerComponent_getPickingUpControllerPort(
		
					stateChart->parentComponent),
		
					MESSAGE_FINISHEDDELIVERYDELIVERYMESSAGESMESSAGE);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->deliveryFinishedFlag = true;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PickingUpControllerPortRTSC_PickingUpControllerPortRTSC =
		
							ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PICKINGUPCONTROLLERPORTRTSC_PICKINGUPCONTROLLERPORTRTSC_INIT_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DrivingControllerPortRTSC_DrivingControllerPortRTSCStateChart_processStep(
		
		RootMainControllerCmpRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DrivingControllerPortRTSC_DrivingControllerPortRTSC) {
		
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DRIVINGCONTROLLERPORTRTSC_DRIVINGCONTROLLERPORTRTSC_DRIVE_STATE:
		
				if (
		
				stateChart->unloadStationFlag && stateChart->loadedFlag
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->drivingControllerPortPort->ID),
		
					MESSAGE_STOPDELIVERYMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_STOPDELIVERYMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DrivingControllerPortRTSC_DrivingControllerPortRTSC =
		
							ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DRIVINGCONTROLLERPORTRTSC_DRIVINGCONTROLLERPORTRTSC_STOP4UNLOADING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->stopClock_ofcurrentStateOfRootMainControllerCmpRTSCClock);
		
				} else if (
		
				stateChart->loadStationFlag && unsupportedstateChart->loadedFlag
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->drivingControllerPortPort->ID),
		
					MESSAGE_STOPDELIVERYMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_STOPDELIVERYMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DrivingControllerPortRTSC_DrivingControllerPortRTSC =
		
							ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DRIVINGCONTROLLERPORTRTSC_DRIVINGCONTROLLERPORTRTSC_STOP4LOADING_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DRIVINGCONTROLLERPORTRTSC_DRIVINGCONTROLLERPORTRTSC_STOP4LOADING_STATE:
		
				if (
		
				stateChart->loadedFlag && stateChart->deliveryFinishedFlag
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->drivingControllerPortPort->ID),
		
					MESSAGE_GODELIVERYMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_GODELIVERYMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DrivingControllerPortRTSC_DrivingControllerPortRTSC =
		
							ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DRIVINGCONTROLLERPORTRTSC_DRIVINGCONTROLLERPORTRTSC_DRIVE_STATE;
		
					// execute entry actions
		
					stateChart->deliveryFinishedFlag = false;
		
					;
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DRIVINGCONTROLLERPORTRTSC_DRIVINGCONTROLLERPORTRTSC_STOP4UNLOADING_STATE:
		
				if (
		
				Clock_getTime(stateChart->stopClock_ofcurrentStateOfRootMainControllerCmpRTSCClock)>=stateChart->unloadTimeConst * 1000.0
		
				&&
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->drivingControllerPortPort->ID),
		
					MESSAGE_GODELIVERYMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_GODELIVERYMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DrivingControllerPortRTSC_DrivingControllerPortRTSC =
		
							ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DRIVINGCONTROLLERPORTRTSC_DRIVINGCONTROLLERPORTRTSC_DRIVE_STATE;
		
					// execute entry actions
		
					stateChart->deliveryFinishedFlag = false;
		
					;
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC_LoadingControllerPortRTSCStateChart_processStep(
		
		RootMainControllerCmpRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC_LoadingControllerPortRTSC) {
		
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_INIT_STATE:
		
				if (Port_doesMessageExist(
		
				MainControllerComponent_getLoadingControllerPort(
		
				stateChart->parentComponent),
		
				MESSAGE_UNLOADDELIVERYMESSAGESMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					MainControllerComponent_getLoadingControllerPort(
		
					stateChart->parentComponent),
		
					MESSAGE_UNLOADDELIVERYMESSAGESMESSAGE);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC_LoadingControllerPortRTSC =
		
							ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_UNLOADED_STATE;
		
					// execute entry actions
		
					stateChart->loadedFlag = false;
		
					;
		
				} else if (Port_doesMessageExist(
		
				MainControllerComponent_getLoadingControllerPort(
		
				stateChart->parentComponent),
		
				MESSAGE_LOADDELIVERYMESSAGESMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					MainControllerComponent_getLoadingControllerPort(
		
					stateChart->parentComponent),
		
					MESSAGE_LOADDELIVERYMESSAGESMESSAGE);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC_LoadingControllerPortRTSC =
		
							ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_LOADED_STATE;
		
					// execute entry actions
		
					stateChart->loadedFlag = true;
		
					;
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_LOADED_STATE:
		
				if (1
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->loadingControllerPortPort->ID),
		
					MESSAGE_WAIT4UNLOADDELIVERYMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_WAIT4UNLOADDELIVERYMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC_LoadingControllerPortRTSC =
		
							ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_WAIT4UNLOAD_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_UNLOADED_STATE:
		
				if (1
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->loadingControllerPortPort->ID),
		
					MESSAGE_WAIT4LOADDELIVERYMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_WAIT4LOADDELIVERYMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC_LoadingControllerPortRTSC =
		
							ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_WAIT4LOAD_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_WAIT4UNLOAD_STATE:
		
				if (Port_doesMessageExist(
		
				MainControllerComponent_getLoadingControllerPort(
		
				stateChart->parentComponent),
		
				MESSAGE_UNLOADDELIVERYMESSAGESMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					MainControllerComponent_getLoadingControllerPort(
		
					stateChart->parentComponent),
		
					MESSAGE_UNLOADDELIVERYMESSAGESMESSAGE);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC_LoadingControllerPortRTSC =
		
							ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_UNLOADED_STATE;
		
					// execute entry actions
		
					stateChart->loadedFlag = false;
		
					;
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_WAIT4LOAD_STATE:
		
				if (Port_doesMessageExist(
		
				MainControllerComponent_getLoadingControllerPort(
		
				stateChart->parentComponent),
		
				MESSAGE_LOADDELIVERYMESSAGESMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					MainControllerComponent_getLoadingControllerPort(
		
					stateChart->parentComponent),
		
					MESSAGE_LOADDELIVERYMESSAGESMESSAGE);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC_LoadingControllerPortRTSC =
		
							ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_LOADED_STATE;
		
					// execute entry actions
		
					stateChart->loadedFlag = true;
		
					;
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
		RootMainControllerCmpRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
		
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
		
				if (Port_doesMessageExist(
		
				MainControllerComponent_getColorPort(
		
				stateChart->parentComponent),
		
				MESSAGE_COLORSENSOR_COLORPORT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg =
		
							Port_receiveMessage(
		
							MainControllerComponent_getColorPort(
		
							stateChart->parentComponent),
		
									MESSAGE_COLORSENSOR_COLORPORT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE);
		
					struct ColorSensor_ColorPort_messageapi_messageType_RepositoryMessage * msg =
		
							(ColorSensor_ColorPort_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct ColorSensor_ColorPort_messageapi_messageType_RepositoryMessage));
		
					ColorSensor_ColorPort_messageapi_messageType_RepositoryMessage_read_delimited_from(
		
					mwMsg->_mumlMsg, msg, 0);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->ColorPort_apiValue = msg->_colorPort_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else if (
		
				Clock_getTime(
		
						stateChart->receiverTimeout_ofcurrentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
		
				>= 105 * 1.0
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
		
				if (Port_doesMessageExist(
		
				MainControllerComponent_getColorPort(
		
				stateChart->parentComponent),
		
				MESSAGE_COLORSENSOR_COLORPORT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg =
		
							Port_receiveMessage(
		
							MainControllerComponent_getColorPort(
		
							stateChart->parentComponent),
		
									MESSAGE_COLORSENSOR_COLORPORT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE);
		
					struct ColorSensor_ColorPort_messageapi_messageType_RepositoryMessage * msg =
		
							(ColorSensor_ColorPort_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct ColorSensor_ColorPort_messageapi_messageType_RepositoryMessage));
		
					ColorSensor_ColorPort_messageapi_messageType_RepositoryMessage_read_delimited_from(
		
					mwMsg->_mumlMsg, msg, 0);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->ColorPort_apiValue = msg->_colorPort_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainController_ColorPort_behavior_MainController_ColorPort_behaviorStateChart_processStep(
		
		RootMainControllerCmpRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainController_ColorPort_behavior_MainController_ColorPort_behavior) {
		
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE:
		
				// execute do action
		
				// nothing to do
		
				ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
				stateChart);
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void RootMainControllerCmpRTSCStateChart_processStep(
				RootMainControllerCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfRootMainControllerCmpRTSC) {
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE:
				// execute do action
				// nothing to do
		
				ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainController_ColorPort_behavior_MainController_ColorPort_behaviorStateChart_processStep(
						stateChart);
				ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC_LoadingControllerPortRTSCStateChart_processStep(
						stateChart);
				ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DrivingControllerPortRTSC_DrivingControllerPortRTSCStateChart_processStep(
						stateChart);
				ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PickingUpControllerPortRTSC_PickingUpControllerPortRTSCStateChart_processStep(
						stateChart);
				ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainControllerBehaviorRTSC_MainControllerBehaviorRTSCStateChart_processStep(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		
		
		void ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainControllerBehaviorRTSC_MainControllerBehaviorRTSCStateChart_exit(
				RootMainControllerCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainControllerBehaviorRTSC_MainControllerBehaviorRTSC) {
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLERBEHAVIORRTSC_MAINCONTROLLERBEHAVIORRTSC_INIT_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootMainControllerCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
				// nothing to do
		
				break;
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC_LoadingControllerPortRTSCStateChart_exit(
				RootMainControllerCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC_LoadingControllerPortRTSC) {
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_INIT_STATE:
				// nothing to do
		
				break;
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_LOADED_STATE:
				// nothing to do
		
				break;
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_UNLOADED_STATE:
				// nothing to do
		
				break;
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_WAIT4UNLOAD_STATE:
				// nothing to do
		
				break;
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_WAIT4LOAD_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PickingUpControllerPortRTSC_PickingUpControllerPortRTSCStateChart_exit(
				RootMainControllerCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PickingUpControllerPortRTSC_PickingUpControllerPortRTSC) {
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PICKINGUPCONTROLLERPORTRTSC_PICKINGUPCONTROLLERPORTRTSC_INIT_STATE:
				// nothing to do
		
				break;
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PICKINGUPCONTROLLERPORTRTSC_PICKINGUPCONTROLLERPORTRTSC_SENDPICKUP_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainController_ColorPort_behavior_MainController_ColorPort_behaviorStateChart_exit(
				RootMainControllerCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainController_ColorPort_behavior_MainController_ColorPort_behavior) {
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE:
				// nothing to do
		
				ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		void ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DrivingControllerPortRTSC_DrivingControllerPortRTSCStateChart_exit(
				RootMainControllerCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DrivingControllerPortRTSC_DrivingControllerPortRTSC) {
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DRIVINGCONTROLLERPORTRTSC_DRIVINGCONTROLLERPORTRTSC_DRIVE_STATE:
				// nothing to do
		
				break;
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DRIVINGCONTROLLERPORTRTSC_DRIVINGCONTROLLERPORTRTSC_STOP4LOADING_STATE:
				// nothing to do
		
				break;
			case ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DRIVINGCONTROLLERPORTRTSC_DRIVINGCONTROLLERPORTRTSC_STOP4UNLOADING_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
				
			
		int_t RootMainControllerCmpRTSCStateChart_isInState(
				RootMainControllerCmpRTSCStateChart* stateChart,
				RootMainControllerCmpRTSCState state) {
			return (stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainControllerBehaviorRTSC_MainControllerBehaviorRTSC
					== state
					|| stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC_LoadingControllerPortRTSC
							== state
					|| stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
							== state
					|| stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PickingUpControllerPortRTSC_PickingUpControllerPortRTSC
							== state
					|| stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainController_ColorPort_behavior_MainController_ColorPort_behavior
							== state
					|| stateChart->currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DrivingControllerPortRTSC_DrivingControllerPortRTSC
							== state);
		
		}
		
		bool_t RootMainControllerCmpRTSCStateChart_isTerminated(
				RootMainControllerCmpRTSCStateChart* stateChart) {
			//TODO
			return true;
		}
		



