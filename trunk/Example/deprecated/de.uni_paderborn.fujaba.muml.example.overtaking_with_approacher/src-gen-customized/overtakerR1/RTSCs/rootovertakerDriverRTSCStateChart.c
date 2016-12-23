
		////////////////////////////////////////////////////////////////////////////////
		// Includes
		////////////////////////////////////////////////////////////////////////////////
		#include <stdio.h>
		#include <stdlib.h>
		#include "../GlobalIdentifier.h"
		#include "rootovertakerDriverRTSCStateChart.h"
		
		



		
		////////////////////////////////////////////////////////////////////////////////
		// Initialization
		////////////////////////////////////////////////////////////////////////////////
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_initiatorPortRTSCRegion(
				RootovertakerDriverRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_initiatorPortRTSC_initiatorPortRTSC =
					ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_INIT_STATE;
		
			// execute entry actions
			// nothing to do
		
		}
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSCRegion(
				RootovertakerDriverRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->movingClock_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSCClock);
		
			stateChart->constTurnLeftTime = 500;
			stateChart->constTurnRightTime = 500;
			stateChart->constToOppositeLineTime = 1500;
			stateChart->constToMainLineTime = 1500;
			stateChart->constFollowOppositeLineTime = 3000;
			stateChart->constOvertakingVelocity = 22;
		
			stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSC =
					ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_DRIVE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
		}
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_driveOvertakingRTSCRegion(
				RootovertakerDriverRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_driveOvertakingRTSC_driveOvertakingRTSC =
					ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_TURNLEFT_STATE;
		
			// execute entry actions
		
			stateChart->velocityR_apiValue = stateChart->Vel;
		
			stateChart->velocityL_apiValue = 0;
		
			;
		
			Clock_reset(
					stateChart->movingClock_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSCClock);
		
		}
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerSaveBrakeRTSCRegion(
				RootovertakerDriverRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerSaveBrakeRTSC_overtakerSaveBrakeRTSC =
					ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERSAVEBRAKERTSC_OVERTAKERSAVEBRAKERTSC_CHECKDISTANCE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
		}
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityR_behaviorRegion(
				RootovertakerDriverRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityR_behavior_overtakerDriver_velocityR_behavior =
					ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
		}
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootovertakerDriverRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->clockSending_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->clockSending_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityL_behaviorRegion(
				RootovertakerDriverRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityL_behavior_overtakerDriver_velocityL_behavior =
					ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
		}
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootovertakerDriverRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->clockSending_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->clockSending_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_distance_behaviorRegion(
				RootovertakerDriverRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_distance_behavior_overtakerDriver_distance_behavior =
					ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
		}
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootovertakerDriverRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_line_behaviorRegion(
				RootovertakerDriverRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_line_behavior_overtakerDriver_line_behavior =
					ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
		}
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootovertakerDriverRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		
		void RootovertakerDriverRTSCStateChart_initialize(
				RootovertakerDriverRTSCStateChart* stateChart) {
		
			stateChart->constBreakDistance = 25;
			stateChart->constOvertakeDistance = 70;
			stateChart->Vel = 25;
			stateChart->constVelFast = 25;
			stateChart->constVelSlow = 15;
			stateChart->velocityR_apiValue = 0;
			stateChart->velocityL_apiValue = 0;
			stateChart->distance_apiValue = 150;
			stateChart->line_apiValue = 0;
		
			stateChart->currentStateOfRootovertakerDriverRTSC =
					ROOTOVERTAKERDRIVERRTSC_INIT_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_initiatorPortRTSCRegion(
					stateChart);
			initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSCRegion(
					stateChart);
			initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerSaveBrakeRTSCRegion(
					stateChart);
			initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityR_behaviorRegion(
					stateChart);
			initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityL_behaviorRegion(
					stateChart);
			initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_distance_behaviorRegion(
					stateChart);
			initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_line_behaviorRegion(
					stateChart);
		}
		
		

		////////////////////////////////////////////////////////////////////////////////
		// Construction and destruction
		////////////////////////////////////////////////////////////////////////////////
		RootovertakerDriverRTSCStateChart* RootovertakerDriverRTSCStateChart_create(
				OvertakerDriverComponent* parentComponent) {
			RootovertakerDriverRTSCStateChart* stateChart =
					(RootovertakerDriverRTSCStateChart*) malloc(
							sizeof(RootovertakerDriverRTSCStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
		
				stateChart->finishOSyncChannel = SyncChannel_create();
				stateChart->startOSyncChannel = SyncChannel_create();
				/*
				 if (stateChart->parentComponent != NULL
				 && stateChart->finishOSyncChannel != NULL				
				 && stateChart->startOSyncChannel != NULL				
				 ) {
				 RootovertakerDriverRTSCStateChart_initialize(stateChart);
				 } else {
				 fprintf(stderr, "Initialization of RootovertakerDriverRTSCStateChart failed\n");
		
				 RootovertakerDriverRTSCStateChart_destroy(stateChart);
				 stateChart = NULL;
				 }
				 } else {
				 fprintf(stderr, "Creation of RootovertakerDriverRTSCStateChart failed\n");
				 */}
			return stateChart;
		}
		

			void RootovertakerDriverRTSCStateChart_destroy(RootovertakerDriverRTSCStateChart* stateChart) {
				if(stateChart != NULL) {
					SyncChannel_destroy(stateChart->finishOSyncChannel);
					SyncChannel_destroy(stateChart->startOSyncChannel);
		
					free(stateChart);
				}
			}
	
		////////////////////////////////////////////////////////////////////////////////
		// Processing the statechart
		////////////////////////////////////////////////////////////////////////////////
	
		static void verifySyncChannelsOfinit(
				RootovertakerDriverRTSCStateChart* stateChart) {
			// startO synchronization channel
			if (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_initiatorPortRTSC_initiatorPortRTSC
					== ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_INITIATE_STATE
					&& Port_doesMessageExist(
							OvertakerDriverComponent_getinitiatorP(
									stateChart->parentComponent),
							MESSAGE_EXECUTEOVERTAKINGMESSAGESMESSAGE)
		
							) {
				SyncChannel_enableSend(stateChart->startOSyncChannel);
			}
			if (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSC
					== ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_DRIVE_STATE
		
					) {
				SyncChannel_enableReceive(stateChart->startOSyncChannel);
			}
			// finishO synchronization channel
			if (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_initiatorPortRTSC_initiatorPortRTSC
					== ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_EXECUTING_STATE
		
					) {
				SyncChannel_enableReceive(stateChart->finishOSyncChannel);
			}
		}
		

		
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_initiatorPortRTSC_initiatorPortRTSCStateChart_processStep(
				RootovertakerDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_initiatorPortRTSC_initiatorPortRTSC) {
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_INIT_STATE:
				if (
		
				stateChart->distance_apiValue < stateChart->constOvertakeDistance
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
							MW_getTargetPortIDforIdentifier(
									stateChart->parentComponent->initiatorPPort->ID),
							MESSAGE_INITIATEOVERTAKINGMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_INITIATEOVERTAKINGMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_initiatorPortRTSC_initiatorPortRTSC =
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_INITIATE_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_INITIATE_STATE:
				if (SyncChannel_send((SyncChannel*) stateChart->startOSyncChannel)
		
				) {
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					OvertakerDriverComponent_getinitiatorP(stateChart->parentComponent),
		
					MESSAGE_EXECUTEOVERTAKINGMESSAGESMESSAGE);
		
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
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_initiatorPortRTSC_initiatorPortRTSC =
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_EXECUTING_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_EXECUTING_STATE:
				if (SyncChannel_receive((SyncChannel*) stateChart->finishOSyncChannel)
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
							MW_getTargetPortIDforIdentifier(
									stateChart->parentComponent->initiatorPPort->ID),
							MESSAGE_EXECUTEDOVERTAKINGMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_EXECUTEDOVERTAKINGMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_initiatorPortRTSC_initiatorPortRTSC =
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_INIT_STATE;
		
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
		
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_driveOvertakingRTSC_driveOvertakingRTSCStateChart_processStep(
		
		RootovertakerDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_driveOvertakingRTSC_driveOvertakingRTSC) {
		
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_TURNLEFT_STATE:
		
				if (Clock_getTime(
		
						stateChart->movingClock_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSCClock)
		
				>= stateChart->constTurnLeftTime * 1.0
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_driveOvertakingRTSC_driveOvertakingRTSC =
		
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_DRIVETOOPPOSITELINE_STATE;
		
					// execute entry actions
		
					stateChart->velocityR_apiValue = stateChart->Vel;
		
					stateChart->velocityL_apiValue = stateChart->Vel;
		
					;
		
					Clock_reset(
		
							stateChart->movingClock_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSCClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_DRIVETOOPPOSITELINE_STATE:
		
				if (
		
				Clock_getTime(
		
						stateChart->movingClock_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSCClock)
		
				>= stateChart->constToOppositeLineTime * 1.0
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_driveOvertakingRTSC_driveOvertakingRTSC =
		
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_FOLLOWOPPOSITELINE_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->movingClock_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSCClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_FOLLOWOPPOSITELINE_STATE:
		
				if (1
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->velocityR_apiValue = stateChart->Vel;
		
					stateChart->velocityL_apiValue = stateChart->Vel;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_driveOvertakingRTSC_driveOvertakingRTSC =
		
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_FOLLOWOPPOSITELINE_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->movingClock_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSCClock);
		
				} else if (
		
				Clock_getTime(
		
						stateChart->movingClock_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSCClock)
		
				>= stateChart->constFollowOppositeLineTime * 1.0
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_driveOvertakingRTSC_driveOvertakingRTSC =
		
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_TURNRIGHT_STATE;
		
					// execute entry actions
		
					stateChart->velocityR_apiValue = 0;
		
					stateChart->velocityL_apiValue = stateChart->Vel;
		
					;
		
					Clock_reset(
		
							stateChart->movingClock_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSCClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_TURNRIGHT_STATE:
		
				if (
		
				Clock_getTime(
		
						stateChart->movingClock_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSCClock)
		
				>= stateChart->constTurnRightTime * 1.0
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_driveOvertakingRTSC_driveOvertakingRTSC =
		
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_DRIVETOMAINLINE_STATE;
		
					// execute entry actions
		
					stateChart->velocityR_apiValue = stateChart->Vel;
		
					stateChart->velocityL_apiValue = stateChart->Vel;
		
					;
		
					Clock_reset(
		
							stateChart->movingClock_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSCClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_DRIVETOMAINLINE_STATE:
		
				if (SyncChannel_send((SyncChannel*) stateChart->finishOSyncChannel)
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSC =
		
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_DRIVE_STATE;
		
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
		
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSCStateChart_processStep(
		
		RootovertakerDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSC) {
		
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_DRIVE_STATE:
		
				if (1
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->velocityR_apiValue = stateChart->Vel;
		
					stateChart->velocityL_apiValue = stateChart->Vel;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSC =
		
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_DRIVE_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else if (SyncChannel_receive(
		
				(SyncChannel*) stateChart->startOSyncChannel)
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSC =
		
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE;
		
					// execute entry actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_driveOvertakingRTSC_driveOvertakingRTSC =
		
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_TURNLEFT_STATE;
		
					// execute entry actions
		
					stateChart->velocityR_apiValue = stateChart->Vel;
		
					stateChart->velocityL_apiValue = 0;
		
					;
		
					Clock_reset(
		
							stateChart->movingClock_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSCClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE:
		
				// execute do action
		
				// nothing to do
		
				ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_driveOvertakingRTSC_driveOvertakingRTSCStateChart_processStep(
		
				stateChart);
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerSaveBrakeRTSC_overtakerSaveBrakeRTSCStateChart_processStep(
		
		RootovertakerDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerSaveBrakeRTSC_overtakerSaveBrakeRTSC) {
		
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERSAVEBRAKERTSC_OVERTAKERSAVEBRAKERTSC_CHECKDISTANCE_STATE:
		
				if (
		
				stateChart->distance_apiValue < stateChart->constBreakDistance
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerSaveBrakeRTSC_overtakerSaveBrakeRTSC =
		
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERSAVEBRAKERTSC_OVERTAKERSAVEBRAKERTSC_BREAKNOW_STATE;
		
					// execute entry actions
		
					stateChart->Vel = 0;
		
					;
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERSAVEBRAKERTSC_OVERTAKERSAVEBRAKERTSC_BREAKNOW_STATE:
		
				if (
		
				stateChart->distance_apiValue < stateChart->constBreakDistance
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerSaveBrakeRTSC_overtakerSaveBrakeRTSC =
		
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERSAVEBRAKERTSC_OVERTAKERSAVEBRAKERTSC_BREAKNOW_STATE;
		
					// execute entry actions
		
					stateChart->Vel = 0;
		
					;
		
				} else if (
		
				stateChart->distance_apiValue >= stateChart->constBreakDistance
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerSaveBrakeRTSC_overtakerSaveBrakeRTSC =
		
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERSAVEBRAKERTSC_OVERTAKERSAVEBRAKERTSC_CHECKDISTANCE_STATE;
		
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
		
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
		RootovertakerDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
		
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE:
		
				if (Clock_getTime(
		
						stateChart->clockSending_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
		
				>= 50 * 1.0
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//create new Parameter struct for Motor_velocity_messageapi_messageType_RepositoryMessage
		
					struct Motor_velocity_messageapi_messageType_RepositoryMessage * msg =
		
							(Motor_velocity_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct Motor_velocity_messageapi_messageType_RepositoryMessage));
		
					msg->_velocity_value = stateChart->velocityR_apiValue;
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->velocityRPort->ID),
		
					MESSAGE_MOTOR_VELOCITY_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE,
		
					msg);
		
					//printf("sent message of type %d",MESSAGE_MOTOR_VELOCITY_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					free(msg);
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->clockSending_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityR_behavior_overtakerDriver_velocityR_behaviorStateChart_processStep(
		
		RootovertakerDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityR_behavior_overtakerDriver_velocityR_behavior) {
		
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE:
		
				// execute do action
		
				// nothing to do
		
				ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
				stateChart);
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
		RootovertakerDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
		
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE:
		
				if (Clock_getTime(
		
						stateChart->clockSending_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
		
				>= 50 * 1.0
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//create new Parameter struct for Motor_velocity_messageapi_messageType_RepositoryMessage
		
					struct Motor_velocity_messageapi_messageType_RepositoryMessage * msg =
		
							(Motor_velocity_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct Motor_velocity_messageapi_messageType_RepositoryMessage));
		
					msg->_velocity_value = stateChart->velocityL_apiValue;
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->velocityLPort->ID),
		
					MESSAGE_MOTOR_VELOCITY_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE,
		
					msg);
		
					//printf("sent message of type %d",MESSAGE_MOTOR_VELOCITY_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					free(msg);
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->clockSending_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityL_behavior_overtakerDriver_velocityL_behaviorStateChart_processStep(
		
		RootovertakerDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityL_behavior_overtakerDriver_velocityL_behavior) {
		
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE:
		
				// execute do action
		
				// nothing to do
		
				ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
				stateChart);
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
		RootovertakerDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
		
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
		
				if (Port_doesMessageExist(
		
				OvertakerDriverComponent_getdistance(
		
				stateChart->parentComponent),
		
				MESSAGE_DISTANCE_DISTANCE_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg =
		
					Port_receiveMessage(
		
					OvertakerDriverComponent_getdistance(
		
					stateChart->parentComponent),
		
					MESSAGE_DISTANCE_DISTANCE_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE);
		
					struct Distance_distance_messageapi_messageType_RepositoryMessage * msg =
		
							(Distance_distance_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct Distance_distance_messageapi_messageType_RepositoryMessage));
		
					Distance_distance_messageapi_messageType_RepositoryMessage_read_delimited_from(
		
					mwMsg->_mumlMsg, msg, 0);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->distance_apiValue = msg->_distance_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else if (
		
				Clock_getTime(
		
						stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
		
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
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
		
				if (Port_doesMessageExist(
		
				OvertakerDriverComponent_getdistance(
		
				stateChart->parentComponent),
		
				MESSAGE_DISTANCE_DISTANCE_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					OvertakerDriverComponent_getdistance(stateChart->parentComponent),
		
					MESSAGE_DISTANCE_DISTANCE_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE);
		
					struct Distance_distance_messageapi_messageType_RepositoryMessage * msg =
		
							(Distance_distance_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct Distance_distance_messageapi_messageType_RepositoryMessage));
		
					Distance_distance_messageapi_messageType_RepositoryMessage_read_delimited_from(
		
					mwMsg->_mumlMsg, msg, 0);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->distance_apiValue = msg->_distance_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_distance_behavior_overtakerDriver_distance_behaviorStateChart_processStep(
		
		RootovertakerDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_distance_behavior_overtakerDriver_distance_behavior) {
		
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE:
		
				// execute do action
		
				// nothing to do
		
				ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
				stateChart);
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
		RootovertakerDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
		
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
		
				if (Port_doesMessageExist(
		
				OvertakerDriverComponent_getline(stateChart->parentComponent),
		
				MESSAGE_LINE_LINELIGHT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg =
		
					Port_receiveMessage(
		
					OvertakerDriverComponent_getline(
		
					stateChart->parentComponent),
		
					MESSAGE_LINE_LINELIGHT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE);
		
					struct Line_lineLight_messageapi_messageType_RepositoryMessage * msg =
		
							(Line_lineLight_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct Line_lineLight_messageapi_messageType_RepositoryMessage));
		
					Line_lineLight_messageapi_messageType_RepositoryMessage_read_delimited_from(
		
					mwMsg->_mumlMsg, msg, 0);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->line_apiValue = msg->_lineLight_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else if (
		
				Clock_getTime(
		
						stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
		
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
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
		
				if (Port_doesMessageExist(
		
				OvertakerDriverComponent_getline(stateChart->parentComponent),
		
				MESSAGE_LINE_LINELIGHT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					OvertakerDriverComponent_getline(stateChart->parentComponent),
		
					MESSAGE_LINE_LINELIGHT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE);
		
					struct Line_lineLight_messageapi_messageType_RepositoryMessage * msg =
		
							(Line_lineLight_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct Line_lineLight_messageapi_messageType_RepositoryMessage));
		
					Line_lineLight_messageapi_messageType_RepositoryMessage_read_delimited_from(
		
					mwMsg->_mumlMsg, msg, 0);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->line_apiValue = msg->_lineLight_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_line_behavior_overtakerDriver_line_behaviorStateChart_processStep(
		
		RootovertakerDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_line_behavior_overtakerDriver_line_behavior) {
		
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE:
		
				// execute do action
		
				// nothing to do
		
				ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
				stateChart);
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void RootovertakerDriverRTSCStateChart_processStep(
				RootovertakerDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfRootovertakerDriverRTSC) {
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE:
				// execute do action
				// nothing to do
		
				verifySyncChannelsOfinit(stateChart);
		
				ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_line_behavior_overtakerDriver_line_behaviorStateChart_processStep(
						stateChart);
				ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_distance_behavior_overtakerDriver_distance_behaviorStateChart_processStep(
						stateChart);
				ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityL_behavior_overtakerDriver_velocityL_behaviorStateChart_processStep(
						stateChart);
				ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityR_behavior_overtakerDriver_velocityR_behaviorStateChart_processStep(
						stateChart);
				ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerSaveBrakeRTSC_overtakerSaveBrakeRTSCStateChart_processStep(
						stateChart);
				ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSCStateChart_processStep(
						stateChart);
				ROOTOVERTAKERDRIVERRTSC_INIT_STATE_initiatorPortRTSC_initiatorPortRTSCStateChart_processStep(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		
		
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootovertakerDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityR_behavior_overtakerDriver_velocityR_behaviorStateChart_exit(
				RootovertakerDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityR_behavior_overtakerDriver_velocityR_behavior) {
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE:
				// nothing to do
		
				ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerSaveBrakeRTSC_overtakerSaveBrakeRTSCStateChart_exit(
				RootovertakerDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerSaveBrakeRTSC_overtakerSaveBrakeRTSC) {
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERSAVEBRAKERTSC_OVERTAKERSAVEBRAKERTSC_CHECKDISTANCE_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERSAVEBRAKERTSC_OVERTAKERSAVEBRAKERTSC_BREAKNOW_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_driveOvertakingRTSC_driveOvertakingRTSCStateChart_exit(
				RootovertakerDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_driveOvertakingRTSC_driveOvertakingRTSC) {
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_TURNLEFT_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_DRIVETOOPPOSITELINE_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_FOLLOWOPPOSITELINE_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_TURNRIGHT_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_DRIVETOMAINLINE_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootovertakerDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootovertakerDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityL_behavior_overtakerDriver_velocityL_behaviorStateChart_exit(
				RootovertakerDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityL_behavior_overtakerDriver_velocityL_behavior) {
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE:
				// nothing to do
		
				ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootovertakerDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_initiatorPortRTSC_initiatorPortRTSCStateChart_exit(
				RootovertakerDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_initiatorPortRTSC_initiatorPortRTSC) {
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_INIT_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_INITIATE_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_EXECUTING_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_distance_behavior_overtakerDriver_distance_behaviorStateChart_exit(
				RootovertakerDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_distance_behavior_overtakerDriver_distance_behavior) {
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE:
				// nothing to do
		
				ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_line_behavior_overtakerDriver_line_behaviorStateChart_exit(
				RootovertakerDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_line_behavior_overtakerDriver_line_behavior) {
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE:
				// nothing to do
		
				ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSCStateChart_exit(
				RootovertakerDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSC) {
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_DRIVE_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE:
				// nothing to do
		
				ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_driveOvertakingRTSC_driveOvertakingRTSCStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
				
			
		int_t RootovertakerDriverRTSCStateChart_isInState(
				RootovertakerDriverRTSCStateChart* stateChart,
				RootovertakerDriverRTSCState state) {
			return (stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
					== state
					|| stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityR_behavior_overtakerDriver_velocityR_behavior
							== state
					|| stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_initiatorPortRTSC_initiatorPortRTSC
							== state
					|| stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_distance_behavior_overtakerDriver_distance_behavior
							== state
					|| stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerSaveBrakeRTSC_overtakerSaveBrakeRTSC
							== state
					|| stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_OVERTAKE_STATE_driveOvertakingRTSC_driveOvertakingRTSC
							== state
					|| stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
							== state
					|| stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
							== state
					|| stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_line_behavior_overtakerDriver_line_behavior
							== state
					|| stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityL_behavior_overtakerDriver_velocityL_behavior
							== state
					|| stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSC
							== state
					|| stateChart->currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
							== state);
		
		}
		
		bool_t RootovertakerDriverRTSCStateChart_isTerminated(
				RootovertakerDriverRTSCStateChart* stateChart) {
			//TODO
			return true;
		}
		



