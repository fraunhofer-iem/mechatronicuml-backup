
		////////////////////////////////////////////////////////////////////////////////
		// Includes
		////////////////////////////////////////////////////////////////////////////////
		#include <stdio.h>
		#include <stdlib.h>
		#include "../GlobalIdentifier.h"
		#include "rootLoadControllerCmpRTSCStateChart.h"
		
		



		
		////////////////////////////////////////////////////////////////////////////////
		// Initialization
		////////////////////////////////////////////////////////////////////////////////
		void initializeROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSCRegion(
				RootLoadControllerCmpRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSC_LoadControllerBehaviorRTSC =
					ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLERBEHAVIORRTSC_LOADCONTROLLERBEHAVIORRTSC_INIT_STATE;
		
			// execute entry actions
			if (stateChart->TouchPort_apiValue == 1) {
				stateChart->loadedFlag = true;
		
			} else {
				stateChart->loadedFlag = false;
		
			}
		
			;
		
		}
		void initializeROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSCRegion(
				RootLoadControllerCmpRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC_LoaderPortRTSC =
					ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_INIT_STATE;
		
			// execute entry actions
		
			if (stateChart->TouchPort_apiValue == 1) {
		
				stateChart->loadedFlag = true;
		
			}
		
			else {
		
				stateChart->loadedFlag = false;
		
			}
		
			;
		
		}
		void initializeROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadController_TouchPort_behaviorRegion(
				RootLoadControllerCmpRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadController_TouchPort_behavior_LoadController_TouchPort_behavior =
					ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
		}
		void initializeROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootLoadControllerCmpRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		
		void RootLoadControllerCmpRTSCStateChart_initialize(
				RootLoadControllerCmpRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->checkTouchClock_ofcurrentStateOfRootLoadControllerCmpRTSCClock);
		
			stateChart->checkTouchTimeConst = 1;
			stateChart->loadedFlag = false;
			stateChart->TouchPort_apiValue = 0;
		
			stateChart->currentStateOfRootLoadControllerCmpRTSC =
					ROOTLOADCONTROLLERCMPRTSC_INIT_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSCRegion(
					stateChart);
			initializeROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSCRegion(
					stateChart);
			initializeROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadController_TouchPort_behaviorRegion(
					stateChart);
		}
		
		

		////////////////////////////////////////////////////////////////////////////////
		// Construction and destruction
		////////////////////////////////////////////////////////////////////////////////
		RootLoadControllerCmpRTSCStateChart* RootLoadControllerCmpRTSCStateChart_create(
				LoadControllerComponent* parentComponent) {
			RootLoadControllerCmpRTSCStateChart* stateChart =
					(RootLoadControllerCmpRTSCStateChart*) malloc(
							sizeof(RootLoadControllerCmpRTSCStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
		
				/*
				 if (stateChart->parentComponent != NULL
				 ) {
				 RootLoadControllerCmpRTSCStateChart_initialize(stateChart);
				 } else {
				 fprintf(stderr, "Initialization of RootLoadControllerCmpRTSCStateChart failed\n");
		
				 RootLoadControllerCmpRTSCStateChart_destroy(stateChart);
				 stateChart = NULL;
				 }
				 } else {
				 fprintf(stderr, "Creation of RootLoadControllerCmpRTSCStateChart failed\n");
				 */}
			return stateChart;
		}
		

			void RootLoadControllerCmpRTSCStateChart_destroy(RootLoadControllerCmpRTSCStateChart* stateChart) {
				if(stateChart != NULL) {
		
					free(stateChart);
				}
			}
	
		////////////////////////////////////////////////////////////////////////////////
		// Processing the statechart
		////////////////////////////////////////////////////////////////////////////////
	
		

		
		void ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSC_LoadControllerBehaviorRTSCStateChart_processStep(
				RootLoadControllerCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSC_LoadControllerBehaviorRTSC) {
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLERBEHAVIORRTSC_LOADCONTROLLERBEHAVIORRTSC_LOADED_STATE:
				if (Clock_getTime(
						stateChart->checkTouchClock_ofcurrentStateOfRootLoadControllerCmpRTSCClock)
						> stateChart->checkTouchTimeConst * 1000.0
		
						) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					if (stateChart->TouchPort_apiValue == 1) {
		
						stateChart->loadedFlag = true;
		
					}
		
					else {
		
						stateChart->loadedFlag = false;
		
					}
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSC_LoadControllerBehaviorRTSC =
							ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLERBEHAVIORRTSC_LOADCONTROLLERBEHAVIORRTSC_LOADED_STATE;
		
					// execute entry actions
		
					Clock_reset(
							stateChart->checkTouchClock_ofcurrentStateOfRootLoadControllerCmpRTSCClock);
		
				} else if (
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSC_LoadControllerBehaviorRTSC =
							ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLERBEHAVIORRTSC_LOADCONTROLLERBEHAVIORRTSC_UNLOADED_STATE;
		
					// execute entry actions
		
					Clock_reset(
							stateChart->checkTouchClock_ofcurrentStateOfRootLoadControllerCmpRTSCClock);
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLERBEHAVIORRTSC_LOADCONTROLLERBEHAVIORRTSC_UNLOADED_STATE:
				if (
		
				Clock_getTime(
						stateChart->checkTouchClock_ofcurrentStateOfRootLoadControllerCmpRTSCClock)
						> stateChart->checkTouchTimeConst * 1000.0
		
						) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					if (stateChart->TouchPort_apiValue == 1) {
		
						stateChart->loadedFlag = true;
		
					}
		
					else {
		
						stateChart->loadedFlag = false;
		
					}
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSC_LoadControllerBehaviorRTSC =
							ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLERBEHAVIORRTSC_LOADCONTROLLERBEHAVIORRTSC_UNLOADED_STATE;
		
					// execute entry actions
		
					Clock_reset(
							stateChart->checkTouchClock_ofcurrentStateOfRootLoadControllerCmpRTSCClock);
		
				} else if (
		
				stateChart->loadedFlag
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSC_LoadControllerBehaviorRTSC =
							ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLERBEHAVIORRTSC_LOADCONTROLLERBEHAVIORRTSC_LOADED_STATE;
		
					// execute entry actions
		
					Clock_reset(
							stateChart->checkTouchClock_ofcurrentStateOfRootLoadControllerCmpRTSCClock);
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLERBEHAVIORRTSC_LOADCONTROLLERBEHAVIORRTSC_INIT_STATE:
				if (
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSC_LoadControllerBehaviorRTSC =
							ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLERBEHAVIORRTSC_LOADCONTROLLERBEHAVIORRTSC_UNLOADED_STATE;
		
					// execute entry actions
		
					Clock_reset(
							stateChart->checkTouchClock_ofcurrentStateOfRootLoadControllerCmpRTSCClock);
		
				} else if (
		
				stateChart->loadedFlag
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSC_LoadControllerBehaviorRTSC =
							ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLERBEHAVIORRTSC_LOADCONTROLLERBEHAVIORRTSC_LOADED_STATE;
		
					// execute entry actions
		
					Clock_reset(
							stateChart->checkTouchClock_ofcurrentStateOfRootLoadControllerCmpRTSCClock);
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			default:
				break;
			}
		}
		
		void ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC_LoaderPortRTSCStateChart_processStep(
		
		RootLoadControllerCmpRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC_LoaderPortRTSC) {
		
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_WAITTOUNLOAD_STATE:
		
				if (
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->loaderPortPort->ID),
		
					MESSAGE_UNLOADDELIVERYMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_UNLOADDELIVERYMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC_LoaderPortRTSC =
		
							ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_UNLOADING_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_WAITTOLOAD_STATE:
		
				if (
		
				stateChart->loadedFlag
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->loaderPortPort->ID),
		
					MESSAGE_LOADDELIVERYMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_LOADDELIVERYMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC_LoaderPortRTSC =
		
							ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_LOADING_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_LOADING_STATE:
		
				if (Port_doesMessageExist(
		
				LoadControllerComponent_getLoaderPort(
		
				stateChart->parentComponent),
		
				MESSAGE_WAIT4UNLOADDELIVERYMESSAGESMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					LoadControllerComponent_getLoaderPort(stateChart->parentComponent),
		
					MESSAGE_WAIT4UNLOADDELIVERYMESSAGESMESSAGE);
		
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
		
					stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC_LoaderPortRTSC =
		
							ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_WAITTOUNLOAD_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_UNLOADING_STATE:
		
				if (Port_doesMessageExist(
		
				LoadControllerComponent_getLoaderPort(
		
				stateChart->parentComponent),
		
				MESSAGE_WAIT4LOADDELIVERYMESSAGESMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					LoadControllerComponent_getLoaderPort(stateChart->parentComponent),
		
					MESSAGE_WAIT4LOADDELIVERYMESSAGESMESSAGE);
		
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
		
					stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC_LoaderPortRTSC =
		
							ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_WAITTOLOAD_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_INIT_STATE:
		
				if (
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC_LoaderPortRTSC =
		
							ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_WAITTOLOAD_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else if (
		
				stateChart->loadedFlag
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC_LoaderPortRTSC =
		
							ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_WAITTOUNLOAD_STATE;
		
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
		
		void ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
		RootLoadControllerCmpRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
		
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
		
				if (Port_doesMessageExist(
		
				LoadControllerComponent_getTouchPort(
		
				stateChart->parentComponent),
		
				MESSAGE_TOUCHSENSOR_TOUCHPORT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg =
		
							Port_receiveMessage(
		
							LoadControllerComponent_getTouchPort(
		
							stateChart->parentComponent),
		
									MESSAGE_TOUCHSENSOR_TOUCHPORT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE);
		
					struct TouchSensor_TouchPort_messageapi_messageType_RepositoryMessage * msg =
		
							(TouchSensor_TouchPort_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct TouchSensor_TouchPort_messageapi_messageType_RepositoryMessage));
		
					TouchSensor_TouchPort_messageapi_messageType_RepositoryMessage_read_delimited_from(
		
					mwMsg->_mumlMsg, msg, 0);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->TouchPort_apiValue = msg->_touchPort_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else if (
		
				Clock_getTime(
		
						stateChart->receiverTimeout_ofcurrentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
		
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
		
					stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
		
				if (Port_doesMessageExist(
		
				LoadControllerComponent_getTouchPort(
		
				stateChart->parentComponent),
		
				MESSAGE_TOUCHSENSOR_TOUCHPORT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg =
		
							Port_receiveMessage(
		
							LoadControllerComponent_getTouchPort(
		
							stateChart->parentComponent),
		
									MESSAGE_TOUCHSENSOR_TOUCHPORT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE);
		
					struct TouchSensor_TouchPort_messageapi_messageType_RepositoryMessage * msg =
		
							(TouchSensor_TouchPort_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct TouchSensor_TouchPort_messageapi_messageType_RepositoryMessage));
		
					TouchSensor_TouchPort_messageapi_messageType_RepositoryMessage_read_delimited_from(
		
					mwMsg->_mumlMsg, msg, 0);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->TouchPort_apiValue = msg->_touchPort_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadController_TouchPort_behavior_LoadController_TouchPort_behaviorStateChart_processStep(
		
		RootLoadControllerCmpRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadController_TouchPort_behavior_LoadController_TouchPort_behavior) {
		
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE:
		
				// execute do action
		
				// nothing to do
		
				ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
				stateChart);
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void RootLoadControllerCmpRTSCStateChart_processStep(
				RootLoadControllerCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfRootLoadControllerCmpRTSC) {
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE:
				// execute do action
				// nothing to do
		
				ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadController_TouchPort_behavior_LoadController_TouchPort_behaviorStateChart_processStep(
						stateChart);
				ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC_LoaderPortRTSCStateChart_processStep(
						stateChart);
				ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSC_LoadControllerBehaviorRTSCStateChart_processStep(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		
		
		void ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootLoadControllerCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
				// nothing to do
		
				break;
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSC_LoadControllerBehaviorRTSCStateChart_exit(
				RootLoadControllerCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSC_LoadControllerBehaviorRTSC) {
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLERBEHAVIORRTSC_LOADCONTROLLERBEHAVIORRTSC_LOADED_STATE:
				// nothing to do
		
				break;
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLERBEHAVIORRTSC_LOADCONTROLLERBEHAVIORRTSC_UNLOADED_STATE:
				// nothing to do
		
				break;
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLERBEHAVIORRTSC_LOADCONTROLLERBEHAVIORRTSC_INIT_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadController_TouchPort_behavior_LoadController_TouchPort_behaviorStateChart_exit(
				RootLoadControllerCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadController_TouchPort_behavior_LoadController_TouchPort_behavior) {
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE:
				// nothing to do
		
				ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		void ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC_LoaderPortRTSCStateChart_exit(
				RootLoadControllerCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC_LoaderPortRTSC) {
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_WAITTOUNLOAD_STATE:
				// nothing to do
		
				break;
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_WAITTOLOAD_STATE:
				// nothing to do
		
				break;
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_LOADING_STATE:
				// nothing to do
		
				break;
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_UNLOADING_STATE:
				// nothing to do
		
				break;
			case ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_INIT_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
				
			
		int_t RootLoadControllerCmpRTSCStateChart_isInState(
				RootLoadControllerCmpRTSCStateChart* stateChart,
				RootLoadControllerCmpRTSCState state) {
			return (stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSC_LoadControllerBehaviorRTSC
					== state
					|| stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
							== state
					|| stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC_LoaderPortRTSC
							== state
					|| stateChart->currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadController_TouchPort_behavior_LoadController_TouchPort_behavior
							== state);
		
		}
		
		bool_t RootLoadControllerCmpRTSCStateChart_isTerminated(
				RootLoadControllerCmpRTSCStateChart* stateChart) {
			//TODO
			return true;
		}
		



