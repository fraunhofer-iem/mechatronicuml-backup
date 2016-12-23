
		////////////////////////////////////////////////////////////////////////////////
		// Includes
		////////////////////////////////////////////////////////////////////////////////
		#include <stdio.h>
		#include <stdlib.h>
		#include "../GlobalIdentifier.h"
		#include "rootovertakeeCommunicatorRTSCStateChart.h"
		
		



		
		////////////////////////////////////////////////////////////////////////////////
		// Initialization
		////////////////////////////////////////////////////////////////////////////////
		void initializeROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSCRegion(
				RootovertakeeCommunicatorRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSC_overtakeePortRTSC =
					ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEEPORTRTSC_OVERTAKEEPORTRTSC_INIT_STATE;
		
			// execute entry actions
			// nothing to do
		
		}
		void initializeROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_vehicleOvertakeePortRTSCRegion(
				RootovertakeeCommunicatorRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_vehicleOvertakeePortRTSC_vehicleOvertakeePortRTSC =
					ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKEEPORTRTSC_VEHICLEOVERTAKEEPORTRTSC_INIT_STATE;
		
			// execute entry actions
		
			if (stateChart->colorOvertakee_apiValue == stateChart->constSecRed) {
		
				stateChart->secID = 2;
		
				stateChart->change = true;
		
			}
		
			;
		
		}
		void initializeROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_velocitySetterPortRTSCRegion(
				RootovertakeeCommunicatorRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_velocitySetterPortRTSC_velocitySetterPortRTSC =
					ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_changingModeRTSCRegion(
					stateChart);
		}
		void initializeROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_changingModeRTSCRegion(
				RootovertakeeCommunicatorRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_changingModeRTSC_changingModeRTSC =
					ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_CHANGINGMODERTSC_CHANGINGMODERTSC_SLOW_STATE;
		
			// execute entry actions
		
			stateChart->Vel = stateChart->constVelSlow;
		
			;
		
			Clock_reset(
					stateChart->changeClock_ofcurrentStateOfRootovertakeeCommunicatorRTSCClock);
		
		}
		void initializeROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_informOvertakeePortRTSCRegion(
				RootovertakeeCommunicatorRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_informOvertakeePortRTSC_informOvertakeePortRTSC =
					ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_INFORMOVERTAKEEPORTRTSC_INFORMOVERTAKEEPORTRTSC_INIT_STATE;
		
			// execute entry actions
		
			// nothing to do
		
		}
		void initializeROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeeCommunicator_colorOvertakee_behaviorRegion(
				RootovertakeeCommunicatorRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeeCommunicator_colorOvertakee_behavior_overtakeeCommunicator_colorOvertakee_behavior =
					ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
		}
		void initializeROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootovertakeeCommunicatorRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		
		void RootovertakeeCommunicatorRTSCStateChart_initialize(
				RootovertakeeCommunicatorRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->changeClock_ofcurrentStateOfRootovertakeeCommunicatorRTSCClock);
		
			stateChart->constChangeModeInterval = 4;
			stateChart->constVelFast = 18;
			stateChart->constVelSlow = 14;
			stateChart->Vel = stateChart->constVelSlow;
			stateChart->change = false;
			stateChart->secID = 0;
			stateChart->constSecRed = 0;
			stateChart->constSecGreen = 1;
			stateChart->constSecBlue = 2;
			stateChart->constSecYellow = 3;
			stateChart->constSecOrange = 5;
			stateChart->constSecBlack = 7;
			stateChart->colorOvertakee_apiValue = 0;
		
			stateChart->currentStateOfRootovertakeeCommunicatorRTSC =
					ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSCRegion(
					stateChart);
			initializeROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_vehicleOvertakeePortRTSCRegion(
					stateChart);
			initializeROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_velocitySetterPortRTSCRegion(
					stateChart);
			initializeROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_informOvertakeePortRTSCRegion(
					stateChart);
			initializeROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeeCommunicator_colorOvertakee_behaviorRegion(
					stateChart);
		}
		
		

		////////////////////////////////////////////////////////////////////////////////
		// Construction and destruction
		////////////////////////////////////////////////////////////////////////////////
		RootovertakeeCommunicatorRTSCStateChart* RootovertakeeCommunicatorRTSCStateChart_create(
				OvertakeeCommunicatorComponent* parentComponent) {
			RootovertakeeCommunicatorRTSCStateChart* stateChart =
					(RootovertakeeCommunicatorRTSCStateChart*) malloc(
							sizeof(RootovertakeeCommunicatorRTSCStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
		
				stateChart->informStartSyncChannel = SyncChannel_create();
				stateChart->informFinishSyncChannel = SyncChannel_create();
				/*
				 if (stateChart->parentComponent != NULL
				 && stateChart->informStartSyncChannel != NULL				
				 && stateChart->informFinishSyncChannel != NULL				
				 ) {
				 RootovertakeeCommunicatorRTSCStateChart_initialize(stateChart);
				 } else {
				 fprintf(stderr, "Initialization of RootovertakeeCommunicatorRTSCStateChart failed\n");
		
				 RootovertakeeCommunicatorRTSCStateChart_destroy(stateChart);
				 stateChart = NULL;
				 }
				 } else {
				 fprintf(stderr, "Creation of RootovertakeeCommunicatorRTSCStateChart failed\n");
				 */}
			return stateChart;
		}
		

			void RootovertakeeCommunicatorRTSCStateChart_destroy(RootovertakeeCommunicatorRTSCStateChart* stateChart) {
				if(stateChart != NULL) {
					SyncChannel_destroy(stateChart->informStartSyncChannel);
					SyncChannel_destroy(stateChart->informFinishSyncChannel);
		
					free(stateChart);
				}
			}
	
		////////////////////////////////////////////////////////////////////////////////
		// Processing the statechart
		////////////////////////////////////////////////////////////////////////////////
	
		static void verifySyncChannelsOfinit(
				RootovertakeeCommunicatorRTSCStateChart* stateChart) {
			// informStart synchronization channel
			if (stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSC_overtakeePortRTSC
					== ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEEPORTRTSC_OVERTAKEEPORTRTSC_REQUESTED_STATE
					&&
		
					stateChart->Vel == stateChart->constVelSlow
		
					) {
				SyncChannel_enableSend(stateChart->informStartSyncChannel);
			}
			if (stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_informOvertakeePortRTSC_informOvertakeePortRTSC
					== ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_INFORMOVERTAKEEPORTRTSC_INFORMOVERTAKEEPORTRTSC_INIT_STATE
		
					) {
				SyncChannel_enableReceive(stateChart->informStartSyncChannel);
			}
			if (stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_velocitySetterPortRTSC_velocitySetterPortRTSC
					== ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE
		
					) {
				SyncChannel_enableReceive(stateChart->informStartSyncChannel);
			}
			// informFinish synchronization channel
			if (stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSC_overtakeePortRTSC
					== ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEEPORTRTSC_OVERTAKEEPORTRTSC_OVERTAKING_STATE
					&&
		
					Port_doesMessageExist(
							OvertakeeCommunicatorComponent_getovertakeeP(
									stateChart->parentComponent),
							MESSAGE_FINISHOVERTAKINGOVERTAKINGMESSAGESMESSAGE)
		
							) {
				SyncChannel_enableSend(stateChart->informFinishSyncChannel);
			}
			if (stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_informOvertakeePortRTSC_informOvertakeePortRTSC
					== ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_INFORMOVERTAKEEPORTRTSC_INFORMOVERTAKEEPORTRTSC_OVERTAKING_STATE
		
					) {
				SyncChannel_enableReceive(stateChart->informFinishSyncChannel);
			}
			if (stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_velocitySetterPortRTSC_velocitySetterPortRTSC
					== ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_FIXEDMODE_STATE
		
					) {
				SyncChannel_enableReceive(stateChart->informFinishSyncChannel);
			}
		}
		

		
		void ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSC_overtakeePortRTSCStateChart_processStep(
				RootovertakeeCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSC_overtakeePortRTSC) {
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEEPORTRTSC_OVERTAKEEPORTRTSC_INIT_STATE:
				if (Port_doesMessageExist(
						OvertakeeCommunicatorComponent_getovertakeeP(
								stateChart->parentComponent),
						MESSAGE_REQUESTOVERTAKINGOVERTAKINGMESSAGESMESSAGE)
		
						) {
					MiddlewareMessage* mwMsg = Port_receiveMessage(
							OvertakeeCommunicatorComponent_getovertakeeP(
									stateChart->parentComponent),
							MESSAGE_REQUESTOVERTAKINGOVERTAKINGMESSAGESMESSAGE);
		
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
					stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSC_overtakeePortRTSC =
							ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEEPORTRTSC_OVERTAKEEPORTRTSC_REQUESTED_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEEPORTRTSC_OVERTAKEEPORTRTSC_REQUESTED_STATE:
				if (
		
				stateChart->Vel == stateChart->constVelFast
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
							MW_getTargetPortIDforIdentifier(
									stateChart->parentComponent->overtakeePPort->ID),
							MESSAGE_DECLINEOVERTAKINGOVERTAKINGMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_DECLINEOVERTAKINGOVERTAKINGMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSC_overtakeePortRTSC =
							ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEEPORTRTSC_OVERTAKEEPORTRTSC_INIT_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else if (SyncChannel_send(
						(SyncChannel*) stateChart->informStartSyncChannel)
		
						) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
							MW_getTargetPortIDforIdentifier(
									stateChart->parentComponent->overtakeePPort->ID),
							MESSAGE_ACCEPTOVERTAKINGOVERTAKINGMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_ACCEPTOVERTAKINGOVERTAKINGMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSC_overtakeePortRTSC =
							ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEEPORTRTSC_OVERTAKEEPORTRTSC_OVERTAKING_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEEPORTRTSC_OVERTAKEEPORTRTSC_OVERTAKING_STATE:
				if (SyncChannel_send((SyncChannel*) stateChart->informFinishSyncChannel)
		
				) {
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					OvertakeeCommunicatorComponent_getovertakeeP(
		
					stateChart->parentComponent),
		
					MESSAGE_FINISHOVERTAKINGOVERTAKINGMESSAGESMESSAGE);
		
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
		
					stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSC_overtakeePortRTSC =
							ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEEPORTRTSC_OVERTAKEEPORTRTSC_INIT_STATE;
		
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
		
		void ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_vehicleOvertakeePortRTSC_vehicleOvertakeePortRTSCStateChart_processStep(
		
		RootovertakeeCommunicatorRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_vehicleOvertakeePortRTSC_vehicleOvertakeePortRTSC) {
		
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKEEPORTRTSC_VEHICLEOVERTAKEEPORTRTSC_INIT_STATE:
		
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
		
					stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_vehicleOvertakeePortRTSC_vehicleOvertakeePortRTSC =
		
							ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKEEPORTRTSC_VEHICLEOVERTAKEEPORTRTSC_CHANGEDSECTION_STATE;
		
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
		
					stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_vehicleOvertakeePortRTSC_vehicleOvertakeePortRTSC =
		
							ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKEEPORTRTSC_VEHICLEOVERTAKEEPORTRTSC_INIT_STATE;
		
					// execute entry actions
		
					if (stateChart->colorOvertakee_apiValue
		
					== stateChart->constSecRed) {
		
						stateChart->secID = 2;
		
						stateChart->change = true;
		
					}
		
					;
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKEEPORTRTSC_VEHICLEOVERTAKEEPORTRTSC_CHANGEDSECTION_STATE:
		
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
		
					stateChart->parentComponent->vehicleOvertakeePPort->ID),
		
					MESSAGE_CHANGEOVERTAKINGMESSAGESMESSAGE, msg);
		
					//printf("sent message of type %d",MESSAGE_CHANGEOVERTAKINGMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					free(msg);
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_vehicleOvertakeePortRTSC_vehicleOvertakeePortRTSC =
		
							ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKEEPORTRTSC_VEHICLEOVERTAKEEPORTRTSC_INIT_STATE;
		
					// execute entry actions
		
					if (stateChart->colorOvertakee_apiValue
		
					== stateChart->constSecRed) {
		
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
		
		void ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_changingModeRTSC_changingModeRTSCStateChart_processStep(
		
		RootovertakeeCommunicatorRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_changingModeRTSC_changingModeRTSC) {
		
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_CHANGINGMODERTSC_CHANGINGMODERTSC_SLOW_STATE:
		
				if (Clock_getTime(
		
						stateChart->changeClock_ofcurrentStateOfRootovertakeeCommunicatorRTSCClock)
		
				>= stateChart->constChangeModeInterval * 1000.0
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->velocitySetterPPort->ID),
		
					MESSAGE_SETFASTOVERTAKINGMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_SETFASTOVERTAKINGMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_changingModeRTSC_changingModeRTSC =
		
							ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_CHANGINGMODERTSC_CHANGINGMODERTSC_FAST_STATE;
		
					// execute entry actions
		
					stateChart->Vel = stateChart->constVelFast;
		
					;
		
					Clock_reset(
		
							stateChart->changeClock_ofcurrentStateOfRootovertakeeCommunicatorRTSCClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_CHANGINGMODERTSC_CHANGINGMODERTSC_FAST_STATE:
		
				if (
		
				Clock_getTime(
		
						stateChart->changeClock_ofcurrentStateOfRootovertakeeCommunicatorRTSCClock)
		
				>= stateChart->constChangeModeInterval * 1000.0
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->velocitySetterPPort->ID),
		
					MESSAGE_SETSLOWOVERTAKINGMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_SETSLOWOVERTAKINGMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_changingModeRTSC_changingModeRTSC =
		
							ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_CHANGINGMODERTSC_CHANGINGMODERTSC_SLOW_STATE;
		
					// execute entry actions
		
					stateChart->Vel = stateChart->constVelSlow;
		
					;
		
					Clock_reset(
		
							stateChart->changeClock_ofcurrentStateOfRootovertakeeCommunicatorRTSCClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_velocitySetterPortRTSC_velocitySetterPortRTSCStateChart_processStep(
		
		RootovertakeeCommunicatorRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_velocitySetterPortRTSC_velocitySetterPortRTSC) {
		
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE:
		
				if (SyncChannel_receive(
		
				(SyncChannel*) stateChart->informStartSyncChannel)
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_changingModeRTSC_changingModeRTSCStateChart_exit(
		
					stateChart);
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->velocitySetterPPort->ID),
		
					MESSAGE_SETSLOWOVERTAKINGMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_SETSLOWOVERTAKINGMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_velocitySetterPortRTSC_velocitySetterPortRTSC =
		
							ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_FIXEDMODE_STATE;
		
					// execute entry actions
		
					stateChart->Vel = stateChart->constVelSlow;
		
					;
		
				} else {
		
					// execute do action
		
					// nothing to do
		
					ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_changingModeRTSC_changingModeRTSCStateChart_processStep(
		
					stateChart);
		
				}
		
				break;
		
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_FIXEDMODE_STATE:
		
				if (SyncChannel_receive(
		
				(SyncChannel*) stateChart->informFinishSyncChannel)
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_velocitySetterPortRTSC_velocitySetterPortRTSC =
		
							ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE;
		
					// execute entry actions
		
					// nothing to do
		
					initializeROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_changingModeRTSCRegion(
		
					stateChart);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_informOvertakeePortRTSC_informOvertakeePortRTSCStateChart_processStep(
		
		RootovertakeeCommunicatorRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_informOvertakeePortRTSC_informOvertakeePortRTSC) {
		
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_INFORMOVERTAKEEPORTRTSC_INFORMOVERTAKEEPORTRTSC_INIT_STATE:
		
				if (SyncChannel_receive(
		
				(SyncChannel*) stateChart->informStartSyncChannel)) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->informOvertakeePort->ID),
		
					MESSAGE_STARTEDOOVERTAKINGMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_STARTEDOOVERTAKINGMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_informOvertakeePortRTSC_informOvertakeePortRTSC =
		
							ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_INFORMOVERTAKEEPORTRTSC_INFORMOVERTAKEEPORTRTSC_OVERTAKING_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_INFORMOVERTAKEEPORTRTSC_INFORMOVERTAKEEPORTRTSC_OVERTAKING_STATE:
		
				if (SyncChannel_receive(
		
				(SyncChannel*) stateChart->informFinishSyncChannel)
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->informOvertakeePort->ID),
		
					MESSAGE_FINISHEDOOVERTAKINGMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_FINISHEDOOVERTAKINGMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_informOvertakeePortRTSC_informOvertakeePortRTSC =
		
							ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_INFORMOVERTAKEEPORTRTSC_INFORMOVERTAKEEPORTRTSC_INIT_STATE;
		
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
		
		void ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
		RootovertakeeCommunicatorRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
		
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
		
				if (Port_doesMessageExist(
		
				OvertakeeCommunicatorComponent_getcolorOvertakee(
		
				stateChart->parentComponent),
		
				MESSAGE_COLOR_COLOR_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg =
		
					Port_receiveMessage(
		
					OvertakeeCommunicatorComponent_getcolorOvertakee(
		
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
		
					stateChart->colorOvertakee_apiValue = msg->_color_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else if (
		
				Clock_getTime(
		
						stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
		
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
		
					stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
		
				if (Port_doesMessageExist(
		
				OvertakeeCommunicatorComponent_getcolorOvertakee(
		
				stateChart->parentComponent),
		
				MESSAGE_COLOR_COLOR_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					OvertakeeCommunicatorComponent_getcolorOvertakee(
		
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
		
					stateChart->colorOvertakee_apiValue = msg->_color_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeeCommunicator_colorOvertakee_behavior_overtakeeCommunicator_colorOvertakee_behaviorStateChart_processStep(
		
		RootovertakeeCommunicatorRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeeCommunicator_colorOvertakee_behavior_overtakeeCommunicator_colorOvertakee_behavior) {
		
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE:
		
				// execute do action
		
				// nothing to do
		
				ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
				stateChart);
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void RootovertakeeCommunicatorRTSCStateChart_processStep(
				RootovertakeeCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfRootovertakeeCommunicatorRTSC) {
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE:
				// execute do action
				// nothing to do
		
				verifySyncChannelsOfinit(stateChart);
		
				ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeeCommunicator_colorOvertakee_behavior_overtakeeCommunicator_colorOvertakee_behaviorStateChart_processStep(
						stateChart);
				ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_informOvertakeePortRTSC_informOvertakeePortRTSCStateChart_processStep(
						stateChart);
				ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_velocitySetterPortRTSC_velocitySetterPortRTSCStateChart_processStep(
						stateChart);
				ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_vehicleOvertakeePortRTSC_vehicleOvertakeePortRTSCStateChart_processStep(
						stateChart);
				ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSC_overtakeePortRTSCStateChart_processStep(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		
		
		void ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeeCommunicator_colorOvertakee_behavior_overtakeeCommunicator_colorOvertakee_behaviorStateChart_exit(
				RootovertakeeCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeeCommunicator_colorOvertakee_behavior_overtakeeCommunicator_colorOvertakee_behavior) {
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE:
				// nothing to do
		
				ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_velocitySetterPortRTSC_velocitySetterPortRTSCStateChart_exit(
				RootovertakeeCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_velocitySetterPortRTSC_velocitySetterPortRTSC) {
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE:
				// nothing to do
		
				ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_changingModeRTSC_changingModeRTSCStateChart_exit(
						stateChart);
		
				break;
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_FIXEDMODE_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_changingModeRTSC_changingModeRTSCStateChart_exit(
				RootovertakeeCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_changingModeRTSC_changingModeRTSC) {
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_CHANGINGMODERTSC_CHANGINGMODERTSC_SLOW_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_CHANGINGMODERTSC_CHANGINGMODERTSC_FAST_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootovertakeeCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_informOvertakeePortRTSC_informOvertakeePortRTSCStateChart_exit(
				RootovertakeeCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_informOvertakeePortRTSC_informOvertakeePortRTSC) {
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_INFORMOVERTAKEEPORTRTSC_INFORMOVERTAKEEPORTRTSC_INIT_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_INFORMOVERTAKEEPORTRTSC_INFORMOVERTAKEEPORTRTSC_OVERTAKING_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSC_overtakeePortRTSCStateChart_exit(
				RootovertakeeCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSC_overtakeePortRTSC) {
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEEPORTRTSC_OVERTAKEEPORTRTSC_INIT_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEEPORTRTSC_OVERTAKEEPORTRTSC_REQUESTED_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEEPORTRTSC_OVERTAKEEPORTRTSC_OVERTAKING_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_vehicleOvertakeePortRTSC_vehicleOvertakeePortRTSCStateChart_exit(
				RootovertakeeCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_vehicleOvertakeePortRTSC_vehicleOvertakeePortRTSC) {
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKEEPORTRTSC_VEHICLEOVERTAKEEPORTRTSC_INIT_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKEEPORTRTSC_VEHICLEOVERTAKEEPORTRTSC_CHANGEDSECTION_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
				
			
		int_t RootovertakeeCommunicatorRTSCStateChart_isInState(
				RootovertakeeCommunicatorRTSCStateChart* stateChart,
				RootovertakeeCommunicatorRTSCState state) {
			return (stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeeCommunicator_colorOvertakee_behavior_overtakeeCommunicator_colorOvertakee_behavior
					== state
					|| stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_velocitySetterPortRTSC_velocitySetterPortRTSC
							== state
					|| stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_changingModeRTSC_changingModeRTSC
							== state
					|| stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
							== state
					|| stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_informOvertakeePortRTSC_informOvertakeePortRTSC
							== state
					|| stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSC_overtakeePortRTSC
							== state
					|| stateChart->currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_vehicleOvertakeePortRTSC_vehicleOvertakeePortRTSC
							== state);
		
		}
		
		bool_t RootovertakeeCommunicatorRTSCStateChart_isTerminated(
				RootovertakeeCommunicatorRTSCStateChart* stateChart) {
			//TODO
			return true;
		}
		



