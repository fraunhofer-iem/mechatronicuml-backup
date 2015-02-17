
		////////////////////////////////////////////////////////////////////////////////
		// Includes
		////////////////////////////////////////////////////////////////////////////////
		#include <stdio.h>
		#include <stdlib.h>
		#include "../GlobalIdentifier.h"
		#include "rootovertakerCommunicatorRTSCStateChart.h"
		
		



		
		////////////////////////////////////////////////////////////////////////////////
		// Initialization
		////////////////////////////////////////////////////////////////////////////////
		void initializeROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSCRegion(
				RootovertakerCommunicatorRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC_overtakerPortRTSC =
					ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_INIT_STATE;
		
			// execute entry actions
			// nothing to do
		
		}
		void initializeROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_vehicleOvertakerPortRTSCRegion(
				RootovertakerCommunicatorRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_vehicleOvertakerPortRTSC_vehicleOvertakerPortRTSC =
					ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKERPORTRTSC_VEHICLEOVERTAKERPORTRTSC_INIT_STATE;
		
			// execute entry actions
		
			if (stateChart->color_apiValue == stateChart->constSecRed) {
		
				stateChart->secID = 2;
		
				stateChart->change = true;
		
			}
		
			;
		
		}
		void initializeROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSCRegion(
				RootovertakerCommunicatorRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC =
					ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_INIT_STATE;
		
			// execute entry actions
		
			// nothing to do
		
		}
		void initializeROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSCRegion(
				RootovertakerCommunicatorRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSC_requestorPortRTSC =
					ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_REQUESTORPORTRTSC_REQUESTORPORTRTSC_INIT_STATE;
		
			// execute entry actions
		
			// nothing to do
		
		}
		void initializeROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerCommunicator_color_behaviorRegion(
				RootovertakerCommunicatorRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerCommunicator_color_behavior_overtakerCommunicator_color_behavior =
					ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
		}
		void initializeROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootovertakerCommunicatorRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		
		void RootovertakerCommunicatorRTSCStateChart_initialize(
				RootovertakerCommunicatorRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->changeClock_ofcurrentStateOfRootovertakerCommunicatorRTSCClock);
			Clock_reset(
					stateChart->declineClock_ofcurrentStateOfRootovertakerCommunicatorRTSCClock);
			Clock_reset(
					stateChart->unsaveClock_ofcurrentStateOfRootovertakerCommunicatorRTSCClock);
		
			stateChart->constSecRed = 0;
			stateChart->constSecGreen = 1;
			stateChart->constSecBlue = 2;
			stateChart->constSecYellow = 3;
			stateChart->constSecOrange = 5;
			stateChart->constSecBlack = 7;
			stateChart->change = false;
			stateChart->constVelSlow = 14;
			stateChart->constVelFast = 18;
			stateChart->Vel = stateChart->constVelFast;
			stateChart->secID = 0;
			stateChart->color_apiValue = 0;
		
			stateChart->currentStateOfRootovertakerCommunicatorRTSC =
					ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSCRegion(
					stateChart);
			initializeROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_vehicleOvertakerPortRTSCRegion(
					stateChart);
			initializeROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSCRegion(
					stateChart);
			initializeROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSCRegion(
					stateChart);
			initializeROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerCommunicator_color_behaviorRegion(
					stateChart);
		}
		
		

		////////////////////////////////////////////////////////////////////////////////
		// Construction and destruction
		////////////////////////////////////////////////////////////////////////////////
		RootovertakerCommunicatorRTSCStateChart* RootovertakerCommunicatorRTSCStateChart_create(
				OvertakerCommunicatorComponent* parentComponent) {
			RootovertakerCommunicatorRTSCStateChart* stateChart =
					(RootovertakerCommunicatorRTSCStateChart*) malloc(
							sizeof(RootovertakerCommunicatorRTSCStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
		
				stateChart->saveSyncChannel = SyncChannel_create();
				stateChart->executeSyncChannel = SyncChannel_create();
				stateChart->executedSyncChannel = SyncChannel_create();
				stateChart->unsaveSyncChannel = SyncChannel_create();
				stateChart->allowSyncChannel = SyncChannel_create();
				stateChart->initiateSyncChannel = SyncChannel_create();
				/*
				 if (stateChart->parentComponent != NULL
				 && stateChart->saveSyncChannel != NULL				
				 && stateChart->executeSyncChannel != NULL				
				 && stateChart->executedSyncChannel != NULL				
				 && stateChart->unsaveSyncChannel != NULL				
				 && stateChart->allowSyncChannel != NULL				
				 && stateChart->initiateSyncChannel != NULL				
				 ) {
				 RootovertakerCommunicatorRTSCStateChart_initialize(stateChart);
				 } else {
				 fprintf(stderr, "Initialization of RootovertakerCommunicatorRTSCStateChart failed\n");
		
				 RootovertakerCommunicatorRTSCStateChart_destroy(stateChart);
				 stateChart = NULL;
				 }
				 } else {
				 fprintf(stderr, "Creation of RootovertakerCommunicatorRTSCStateChart failed\n");
				 */}
			return stateChart;
		}
		

			void RootovertakerCommunicatorRTSCStateChart_destroy(RootovertakerCommunicatorRTSCStateChart* stateChart) {
				if(stateChart != NULL) {
					SyncChannel_destroy(stateChart->saveSyncChannel);
					SyncChannel_destroy(stateChart->executeSyncChannel);
					SyncChannel_destroy(stateChart->executedSyncChannel);
					SyncChannel_destroy(stateChart->unsaveSyncChannel);
					SyncChannel_destroy(stateChart->allowSyncChannel);
					SyncChannel_destroy(stateChart->initiateSyncChannel);
		
					free(stateChart);
				}
			}
	
		////////////////////////////////////////////////////////////////////////////////
		// Processing the statechart
		////////////////////////////////////////////////////////////////////////////////
	
		static void verifySyncChannelsOfinit(
				RootovertakerCommunicatorRTSCStateChart* stateChart) {
			// save synchronization channel
			if (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSC_requestorPortRTSC
					== ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_REQUESTORPORTRTSC_REQUESTORPORTRTSC_ALLOW_STATE
					&& Port_doesMessageExist(
							OvertakerCommunicatorComponent_getrequestorP(
									stateChart->parentComponent),
							MESSAGE_SAVEOVERTAKINGMESSAGESMESSAGE)
		
							) {
				SyncChannel_enableSend(stateChart->saveSyncChannel);
			}
			if (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC
					== ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_ALLOW_STATE
		
					) {
				SyncChannel_enableReceive(stateChart->saveSyncChannel);
			}
			// unsave synchronization channel
			if (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSC_requestorPortRTSC
					== ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_REQUESTORPORTRTSC_REQUESTORPORTRTSC_ALLOW_STATE
					&& Port_doesMessageExist(
							OvertakerCommunicatorComponent_getrequestorP(
									stateChart->parentComponent),
							MESSAGE_UNSAVEOVERTAKINGMESSAGESMESSAGE)
		
							) {
				SyncChannel_enableSend(stateChart->unsaveSyncChannel);
			}
			if (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC
					== ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_ALLOW_STATE
		
					) {
				SyncChannel_enableReceive(stateChart->unsaveSyncChannel);
			}
			// allow synchronization channel
			if (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC
					== ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_INITIATE_STATE
		
					) {
				SyncChannel_enableSend(stateChart->allowSyncChannel);
			} else if (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC
					== ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_UNSAVE_STATE
					&&
		
					Clock_getTime(
							stateChart->unsaveClock_ofcurrentStateOfRootovertakerCommunicatorRTSCClock)
							>= 1 * 1000.0
		
							) {
				SyncChannel_enableSend(stateChart->allowSyncChannel);
			}
			if (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSC_requestorPortRTSC
					== ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_REQUESTORPORTRTSC_REQUESTORPORTRTSC_INIT_STATE
		
					) {
				SyncChannel_enableReceive(stateChart->allowSyncChannel);
			}
			// execute synchronization channel
			if (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC_overtakerPortRTSC
					== ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_REQUESTED_STATE
					&&
		
					Port_doesMessageExist(
							OvertakerCommunicatorComponent_getovertakerP(
									stateChart->parentComponent),
							MESSAGE_ACCEPTOVERTAKINGOVERTAKINGMESSAGESMESSAGE)
		
							) {
				SyncChannel_enableSend(stateChart->executeSyncChannel);
			}
			if (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC
					== ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_SAVE_STATE
		
					) {
				SyncChannel_enableReceive(stateChart->executeSyncChannel);
			}
			// executed synchronization channel
			if (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC
					== ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_EXECUTING_STATE
					&&
		
					Port_doesMessageExist(
							OvertakerCommunicatorComponent_getexecutorP(
									stateChart->parentComponent),
							MESSAGE_EXECUTEDOVERTAKINGMESSAGESMESSAGE)
		
							) {
				SyncChannel_enableSend(stateChart->executedSyncChannel);
			}
			if (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC_overtakerPortRTSC
					== ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_OVERTAKING_STATE
		
					) {
				SyncChannel_enableReceive(stateChart->executedSyncChannel);
			}
			// initiate synchronization channel
			if (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC
					== ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_INIT_STATE
					&&
		
					Port_doesMessageExist(
							OvertakerCommunicatorComponent_getexecutorP(
									stateChart->parentComponent),
							MESSAGE_INITIATEOVERTAKINGMESSAGESMESSAGE)
		
							) {
				SyncChannel_enableSend(stateChart->initiateSyncChannel);
			}
			if (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC_overtakerPortRTSC
					== ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_INIT_STATE
		
					) {
				SyncChannel_enableReceive(stateChart->initiateSyncChannel);
			}
		}
		

		
		void ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC_overtakerPortRTSCStateChart_processStep(
				RootovertakerCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC_overtakerPortRTSC) {
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_INIT_STATE:
				if (SyncChannel_receive(
						(SyncChannel*) stateChart->initiateSyncChannel)) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					//send Message
					MW_sendMessage(
							MW_getTargetPortIDforIdentifier(
									stateChart->parentComponent->overtakerPPort->ID),
							MESSAGE_REQUESTOVERTAKINGOVERTAKINGMESSAGESMESSAGE, NULL);
					//printf("sent message of type %d",MESSAGE_REQUESTOVERTAKINGOVERTAKINGMESSAGESMESSAGE );
					fflush (stdout);
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC_overtakerPortRTSC =
							ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_REQUESTED_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_REQUESTED_STATE:
				if (SyncChannel_send((SyncChannel*) stateChart->executeSyncChannel)
		
				) {
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					OvertakerCommunicatorComponent_getovertakerP(
		
					stateChart->parentComponent),
		
					MESSAGE_ACCEPTOVERTAKINGOVERTAKINGMESSAGESMESSAGE);
		
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
		
					stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC_overtakerPortRTSC =
							ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_OVERTAKING_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else if (Port_doesMessageExist(
						OvertakerCommunicatorComponent_getovertakerP(
								stateChart->parentComponent),
						MESSAGE_DECLINEOVERTAKINGOVERTAKINGMESSAGESMESSAGE)
		
						) {
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					OvertakerCommunicatorComponent_getovertakerP(
		
					stateChart->parentComponent),
		
					MESSAGE_DECLINEOVERTAKINGOVERTAKINGMESSAGESMESSAGE);
		
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
		
					stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC_overtakerPortRTSC =
							ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_DECLINED_STATE;
		
					// execute entry actions
		
					Clock_reset(
							stateChart->declineClock_ofcurrentStateOfRootovertakerCommunicatorRTSCClock);
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_DECLINED_STATE:
				if (
		
				Clock_getTime(
						stateChart->declineClock_ofcurrentStateOfRootovertakerCommunicatorRTSCClock)
						>= 1 * 1000.0
		
						) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
							MW_getTargetPortIDforIdentifier(
									stateChart->parentComponent->overtakerPPort->ID),
							MESSAGE_REQUESTOVERTAKINGOVERTAKINGMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_REQUESTOVERTAKINGOVERTAKINGMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC_overtakerPortRTSC =
							ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_REQUESTED_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_OVERTAKING_STATE:
				if (SyncChannel_receive((SyncChannel*) stateChart->executedSyncChannel)
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
							MW_getTargetPortIDforIdentifier(
									stateChart->parentComponent->overtakerPPort->ID),
							MESSAGE_FINISHOVERTAKINGOVERTAKINGMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_FINISHOVERTAKINGOVERTAKINGMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC_overtakerPortRTSC =
							ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_INIT_STATE;
		
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
		
		void ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_vehicleOvertakerPortRTSC_vehicleOvertakerPortRTSCStateChart_processStep(
		
		RootovertakerCommunicatorRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_vehicleOvertakerPortRTSC_vehicleOvertakerPortRTSC) {
		
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKERPORTRTSC_VEHICLEOVERTAKERPORTRTSC_INIT_STATE:
		
				if (
		
				stateChart->change
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_vehicleOvertakerPortRTSC_vehicleOvertakerPortRTSC =
		
							ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKERPORTRTSC_VEHICLEOVERTAKERPORTRTSC_CHANGEDSECTION_STATE;
		
					// execute entry actions
		
					stateChart->change = false;
		
					;
		
				} else if (1
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_vehicleOvertakerPortRTSC_vehicleOvertakerPortRTSC =
		
							ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKERPORTRTSC_VEHICLEOVERTAKERPORTRTSC_INIT_STATE;
		
					// execute entry actions
		
					if (stateChart->color_apiValue == stateChart->constSecRed) {
		
						stateChart->secID = 2;
		
						stateChart->change = true;
		
					}
		
					;
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKERPORTRTSC_VEHICLEOVERTAKERPORTRTSC_CHANGEDSECTION_STATE:
		
				if (1
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//create new Parameter struct for changeOvertakingMessagesMessage
		
					struct changeOvertakingMessagesMessage * msg =
		
					(changeOvertakingMessagesMessage*) malloc(
		
					sizeof(struct changeOvertakingMessagesMessage));
		
					msg->_secID = stateChart->secID;
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->vehicleOvertakerPPort->ID),
		
					MESSAGE_CHANGEOVERTAKINGMESSAGESMESSAGE, msg);
		
					//printf("sent message of type %d",MESSAGE_CHANGEOVERTAKINGMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					free(msg);
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_vehicleOvertakerPortRTSC_vehicleOvertakerPortRTSC =
		
							ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKERPORTRTSC_VEHICLEOVERTAKERPORTRTSC_INIT_STATE;
		
					// execute entry actions
		
					if (stateChart->color_apiValue == stateChart->constSecRed) {
		
						stateChart->secID = 2;
		
						stateChart->change = true;
		
					}
		
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
		
		void ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSCStateChart_processStep(
		
		RootovertakerCommunicatorRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC) {
		
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_INIT_STATE:
		
				if (SyncChannel_send((SyncChannel*) stateChart->initiateSyncChannel)) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					OvertakerCommunicatorComponent_getexecutorP(
		
					stateChart->parentComponent),
		
					MESSAGE_INITIATEOVERTAKINGMESSAGESMESSAGE);
		
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
		
					stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC =
		
							ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_INITIATE_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_INITIATE_STATE:
		
				if (SyncChannel_send((SyncChannel*) stateChart->allowSyncChannel)
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC =
		
							ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_ALLOW_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_EXECUTING_STATE:
		
				if (SyncChannel_send((SyncChannel*) stateChart->executedSyncChannel)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					OvertakerCommunicatorComponent_getexecutorP(
		
					stateChart->parentComponent),
		
					MESSAGE_EXECUTEDOVERTAKINGMESSAGESMESSAGE);
		
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
		
					stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC =
		
							ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_INIT_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_SAVE_STATE:
		
				if (SyncChannel_receive((SyncChannel*) stateChart->executeSyncChannel)
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->executorPPort->ID),
		
					MESSAGE_EXECUTEOVERTAKINGMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_EXECUTEOVERTAKINGMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC =
		
							ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_EXECUTING_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_UNSAVE_STATE:
		
				if (SyncChannel_send((SyncChannel*) stateChart->allowSyncChannel)
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC =
		
							ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_ALLOW_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_ALLOW_STATE:
		
				if (SyncChannel_receive((SyncChannel*) stateChart->saveSyncChannel)
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC =
		
							ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_SAVE_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else if (SyncChannel_receive(
		
				(SyncChannel*) stateChart->unsaveSyncChannel)
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC =
		
							ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_UNSAVE_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->unsaveClock_ofcurrentStateOfRootovertakerCommunicatorRTSCClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSC_requestorPortRTSCStateChart_processStep(
		
		RootovertakerCommunicatorRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSC_requestorPortRTSC) {
		
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_REQUESTORPORTRTSC_REQUESTORPORTRTSC_INIT_STATE:
		
				if (SyncChannel_receive((SyncChannel*) stateChart->allowSyncChannel)) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->requestorPPort->ID),
		
					MESSAGE_OVERTAKEOVERTAKINGMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_OVERTAKEOVERTAKINGMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSC_requestorPortRTSC =
		
							ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_REQUESTORPORTRTSC_REQUESTORPORTRTSC_ALLOW_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_REQUESTORPORTRTSC_REQUESTORPORTRTSC_ALLOW_STATE:
		
				if (SyncChannel_send((SyncChannel*) stateChart->unsaveSyncChannel)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					OvertakerCommunicatorComponent_getrequestorP(
		
					stateChart->parentComponent),
		
					MESSAGE_UNSAVEOVERTAKINGMESSAGESMESSAGE);
		
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
		
					stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSC_requestorPortRTSC =
		
							ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_REQUESTORPORTRTSC_REQUESTORPORTRTSC_INIT_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else if (SyncChannel_send((SyncChannel*) stateChart->saveSyncChannel)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					OvertakerCommunicatorComponent_getrequestorP(
		
					stateChart->parentComponent),
		
					MESSAGE_SAVEOVERTAKINGMESSAGESMESSAGE);
		
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
		
					stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSC_requestorPortRTSC =
		
							ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_REQUESTORPORTRTSC_REQUESTORPORTRTSC_INIT_STATE;
		
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
		
		void ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
		RootovertakerCommunicatorRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
		
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
		
				if (Port_doesMessageExist(
		
				OvertakerCommunicatorComponent_getcolor(
		
				stateChart->parentComponent),
		
				MESSAGE_COLOR_COLOR_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg =
		
					Port_receiveMessage(
		
					OvertakerCommunicatorComponent_getcolor(
		
					stateChart->parentComponent),
		
					MESSAGE_COLOR_COLOR_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE);
		
					struct Color_color_messageapi_messageType_RepositoryMessage * msg =
		
							(Color_color_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct Color_color_messageapi_messageType_RepositoryMessage));
		
					Color_color_messageapi_messageType_RepositoryMessage_read_delimited_from(
		
					mwMsg->_mumlMsg, msg, 0);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->color_apiValue = msg->_color_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else if (
		
				Clock_getTime(
		
						stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
		
				>= 55 * 1.0
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
		
				if (Port_doesMessageExist(
		
				OvertakerCommunicatorComponent_getcolor(
		
				stateChart->parentComponent),
		
				MESSAGE_COLOR_COLOR_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg =
		
					Port_receiveMessage(
		
					OvertakerCommunicatorComponent_getcolor(
		
					stateChart->parentComponent),
		
					MESSAGE_COLOR_COLOR_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE);
		
					struct Color_color_messageapi_messageType_RepositoryMessage * msg =
		
							(Color_color_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct Color_color_messageapi_messageType_RepositoryMessage));
		
					Color_color_messageapi_messageType_RepositoryMessage_read_delimited_from(
		
					mwMsg->_mumlMsg, msg, 0);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->color_apiValue = msg->_color_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerCommunicator_color_behavior_overtakerCommunicator_color_behaviorStateChart_processStep(
		
		RootovertakerCommunicatorRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerCommunicator_color_behavior_overtakerCommunicator_color_behavior) {
		
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE:
		
				// execute do action
		
				// nothing to do
		
				ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
				stateChart);
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void RootovertakerCommunicatorRTSCStateChart_processStep(
				RootovertakerCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfRootovertakerCommunicatorRTSC) {
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE:
				// execute do action
				// nothing to do
		
				verifySyncChannelsOfinit(stateChart);
		
				ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerCommunicator_color_behavior_overtakerCommunicator_color_behaviorStateChart_processStep(
						stateChart);
				ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSC_requestorPortRTSCStateChart_processStep(
						stateChart);
				ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSCStateChart_processStep(
						stateChart);
				ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_vehicleOvertakerPortRTSC_vehicleOvertakerPortRTSCStateChart_processStep(
						stateChart);
				ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC_overtakerPortRTSCStateChart_processStep(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		
		
		void ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_vehicleOvertakerPortRTSC_vehicleOvertakerPortRTSCStateChart_exit(
				RootovertakerCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_vehicleOvertakerPortRTSC_vehicleOvertakerPortRTSC) {
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKERPORTRTSC_VEHICLEOVERTAKERPORTRTSC_INIT_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKERPORTRTSC_VEHICLEOVERTAKERPORTRTSC_CHANGEDSECTION_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSC_requestorPortRTSCStateChart_exit(
				RootovertakerCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSC_requestorPortRTSC) {
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_REQUESTORPORTRTSC_REQUESTORPORTRTSC_INIT_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_REQUESTORPORTRTSC_REQUESTORPORTRTSC_ALLOW_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSCStateChart_exit(
				RootovertakerCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC) {
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_INIT_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_INITIATE_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_EXECUTING_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_SAVE_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_UNSAVE_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_ALLOW_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC_overtakerPortRTSCStateChart_exit(
				RootovertakerCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC_overtakerPortRTSC) {
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_INIT_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_REQUESTED_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_DECLINED_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_OVERTAKING_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootovertakerCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerCommunicator_color_behavior_overtakerCommunicator_color_behaviorStateChart_exit(
				RootovertakerCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerCommunicator_color_behavior_overtakerCommunicator_color_behavior) {
			case ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE:
				// nothing to do
		
				ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
				
			
		int_t RootovertakerCommunicatorRTSCStateChart_isInState(
				RootovertakerCommunicatorRTSCStateChart* stateChart,
				RootovertakerCommunicatorRTSCState state) {
			return (stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_vehicleOvertakerPortRTSC_vehicleOvertakerPortRTSC
					== state
					|| stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSC_requestorPortRTSC
							== state
					|| stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC
							== state
					|| stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC_overtakerPortRTSC
							== state
					|| stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
							== state
					|| stateChart->currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerCommunicator_color_behavior_overtakerCommunicator_color_behavior
							== state);
		
		}
		
		bool_t RootovertakerCommunicatorRTSCStateChart_isTerminated(
				RootovertakerCommunicatorRTSCStateChart* stateChart) {
			//TODO
			return true;
		}
		



