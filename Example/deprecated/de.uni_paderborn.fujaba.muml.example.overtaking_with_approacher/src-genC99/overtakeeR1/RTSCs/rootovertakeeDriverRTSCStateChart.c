
		////////////////////////////////////////////////////////////////////////////////
		// Includes
		////////////////////////////////////////////////////////////////////////////////
		#include <stdio.h>
		#include <stdlib.h>
		#include "../GlobalIdentifier.h"
		#include "rootovertakeeDriverRTSCStateChart.h"
		
		



		
		////////////////////////////////////////////////////////////////////////////////
		// Initialization
		////////////////////////////////////////////////////////////////////////////////
		void initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_velocityGetterPortRTSCRegion(
				RootovertakeeDriverRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_velocityGetterPortRTSC_velocityGetterPortRTSC =
					ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_SLOW_STATE;
		
			// execute entry actions
			stateChart->Vel = stateChart->constVelSlow;
			;
		
		}
		void initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDrivingRTSCRegion(
				RootovertakeeDriverRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDrivingRTSC_overtakeeDrivingRTSC =
					ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVINGRTSC_OVERTAKEEDRIVINGRTSC_DRIVE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
		}
		void initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeSaveBreakRTSCRegion(
				RootovertakeeDriverRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeSaveBreakRTSC_overtakeeSaveBreakRTSC =
					ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEESAVEBREAKRTSC_OVERTAKEESAVEBREAKRTSC_CHECKDISTANCE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
		}
		void initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityL_behaviorRegion(
				RootovertakeeDriverRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityL_behavior_overtakeeDriver_velocityL_behavior =
					ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
		}
		void initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootovertakeeDriverRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->clockSending_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->clockSending_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		void initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityR_behaviorRegion(
				RootovertakeeDriverRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityR_behavior_overtakeeDriver_velocityR_behavior =
					ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
		}
		void initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootovertakeeDriverRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->clockSending_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->clockSending_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		void initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_lineOvertakee_behaviorRegion(
				RootovertakeeDriverRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_lineOvertakee_behavior_overtakeeDriver_lineOvertakee_behavior =
					ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
		}
		void initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootovertakeeDriverRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		void initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_distanceOvertakee_behaviorRegion(
				RootovertakeeDriverRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_distanceOvertakee_behavior_overtakeeDriver_distanceOvertakee_behavior =
					ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
		}
		void initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootovertakeeDriverRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		
		void RootovertakeeDriverRTSCStateChart_initialize(
				RootovertakeeDriverRTSCStateChart* stateChart) {
		
			stateChart->Vel = stateChart->constVelSlow;
			stateChart->constVelFast = 25;
			stateChart->constVelSlow = 15;
			stateChart->constBreakDistance = 20;
			stateChart->velocityL_apiValue = 0;
			stateChart->velocityR_apiValue = 0;
			stateChart->lineOvertakee_apiValue = 0;
			stateChart->distanceOvertakee_apiValue = 150;
		
			stateChart->currentStateOfRootovertakeeDriverRTSC =
					ROOTOVERTAKEEDRIVERRTSC_INIT_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_velocityGetterPortRTSCRegion(
					stateChart);
			initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDrivingRTSCRegion(
					stateChart);
			initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeSaveBreakRTSCRegion(
					stateChart);
			initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityL_behaviorRegion(
					stateChart);
			initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityR_behaviorRegion(
					stateChart);
			initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_lineOvertakee_behaviorRegion(
					stateChart);
			initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_distanceOvertakee_behaviorRegion(
					stateChart);
		}
		
		

		////////////////////////////////////////////////////////////////////////////////
		// Construction and destruction
		////////////////////////////////////////////////////////////////////////////////
		RootovertakeeDriverRTSCStateChart* RootovertakeeDriverRTSCStateChart_create(
				OvertakeeDriverComponent* parentComponent) {
			RootovertakeeDriverRTSCStateChart* stateChart =
					(RootovertakeeDriverRTSCStateChart*) malloc(
							sizeof(RootovertakeeDriverRTSCStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
		
				/*
				 if (stateChart->parentComponent != NULL
				 ) {
				 RootovertakeeDriverRTSCStateChart_initialize(stateChart);
				 } else {
				 fprintf(stderr, "Initialization of RootovertakeeDriverRTSCStateChart failed\n");
		
				 RootovertakeeDriverRTSCStateChart_destroy(stateChart);
				 stateChart = NULL;
				 }
				 } else {
				 fprintf(stderr, "Creation of RootovertakeeDriverRTSCStateChart failed\n");
				 */}
			return stateChart;
		}
		

			void RootovertakeeDriverRTSCStateChart_destroy(RootovertakeeDriverRTSCStateChart* stateChart) {
				if(stateChart != NULL) {
		
					free(stateChart);
				}
			}
	
		////////////////////////////////////////////////////////////////////////////////
		// Processing the statechart
		////////////////////////////////////////////////////////////////////////////////
	
		

		
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_velocityGetterPortRTSC_velocityGetterPortRTSCStateChart_processStep(
				RootovertakeeDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_velocityGetterPortRTSC_velocityGetterPortRTSC) {
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_SLOW_STATE:
				if (Port_doesMessageExist(
						OvertakeeDriverComponent_getvelocityGetterP(
								stateChart->parentComponent),
						MESSAGE_SETFASTOVERTAKINGMESSAGESMESSAGE)
		
						) {
					MiddlewareMessage* mwMsg = Port_receiveMessage(
							OvertakeeDriverComponent_getvelocityGetterP(
									stateChart->parentComponent),
							MESSAGE_SETFASTOVERTAKINGMESSAGESMESSAGE);
		
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
					stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_velocityGetterPortRTSC_velocityGetterPortRTSC =
							ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_FAST_STATE;
		
					// execute entry actions
		
					stateChart->Vel = stateChart->constVelFast;
		
					;
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_FAST_STATE:
				if (Port_doesMessageExist(
						OvertakeeDriverComponent_getvelocityGetterP(
								stateChart->parentComponent),
						MESSAGE_SETSLOWOVERTAKINGMESSAGESMESSAGE)
		
						) {
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					OvertakeeDriverComponent_getvelocityGetterP(
		
					stateChart->parentComponent),
		
					MESSAGE_SETSLOWOVERTAKINGMESSAGESMESSAGE);
		
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
		
					stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_velocityGetterPortRTSC_velocityGetterPortRTSC =
							ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_SLOW_STATE;
		
					// execute entry actions
		
					stateChart->Vel = stateChart->constVelSlow;
		
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
		
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDrivingRTSC_overtakeeDrivingRTSCStateChart_processStep(
		
		RootovertakeeDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDrivingRTSC_overtakeeDrivingRTSC) {
		
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVINGRTSC_OVERTAKEEDRIVINGRTSC_DRIVE_STATE:
		
				if (1) {
		
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
		
					stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDrivingRTSC_overtakeeDrivingRTSC =
		
							ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVINGRTSC_OVERTAKEEDRIVINGRTSC_DRIVE_STATE;
		
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
		
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeSaveBreakRTSC_overtakeeSaveBreakRTSCStateChart_processStep(
		
		RootovertakeeDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeSaveBreakRTSC_overtakeeSaveBreakRTSC) {
		
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEESAVEBREAKRTSC_OVERTAKEESAVEBREAKRTSC_CHECKDISTANCE_STATE:
		
				if (
		
				stateChart->distanceOvertakee_apiValue < stateChart->constBreakDistance
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeSaveBreakRTSC_overtakeeSaveBreakRTSC =
		
							ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEESAVEBREAKRTSC_OVERTAKEESAVEBREAKRTSC_BREAKNOW_STATE;
		
					// execute entry actions
		
					stateChart->Vel = 0;
		
					;
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEESAVEBREAKRTSC_OVERTAKEESAVEBREAKRTSC_BREAKNOW_STATE:
		
				if (
		
				stateChart->distanceOvertakee_apiValue < stateChart->constBreakDistance
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeSaveBreakRTSC_overtakeeSaveBreakRTSC =
		
							ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEESAVEBREAKRTSC_OVERTAKEESAVEBREAKRTSC_BREAKNOW_STATE;
		
					// execute entry actions
		
					stateChart->Vel = 0;
		
					;
		
				} else if (
		
				stateChart->distanceOvertakee_apiValue >= stateChart->constBreakDistance
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeSaveBreakRTSC_overtakeeSaveBreakRTSC =
		
							ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEESAVEBREAKRTSC_OVERTAKEESAVEBREAKRTSC_CHECKDISTANCE_STATE;
		
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
		
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
		RootovertakeeDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
		
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE:
		
				if (Clock_getTime(
		
						stateChart->clockSending_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
		
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
		
					stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->clockSending_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityL_behavior_overtakeeDriver_velocityL_behaviorStateChart_processStep(
		
		RootovertakeeDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityL_behavior_overtakeeDriver_velocityL_behavior) {
		
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE:
		
				// execute do action
		
				// nothing to do
		
				ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
				stateChart);
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
		RootovertakeeDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
		
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE:
		
				if (Clock_getTime(
		
						stateChart->clockSending_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
		
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
		
					stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->clockSending_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityR_behavior_overtakeeDriver_velocityR_behaviorStateChart_processStep(
		
		RootovertakeeDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityR_behavior_overtakeeDriver_velocityR_behavior) {
		
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE:
		
				// execute do action
		
				// nothing to do
		
				ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
				stateChart);
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
		RootovertakeeDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
		
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
		
				if (Port_doesMessageExist(
		
				OvertakeeDriverComponent_getlineOvertakee(
		
				stateChart->parentComponent),
		
				MESSAGE_LINE_LINELIGHT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg =
		
					Port_receiveMessage(
		
					OvertakeeDriverComponent_getlineOvertakee(
		
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
		
					stateChart->lineOvertakee_apiValue = msg->_lineLight_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else if (
		
				Clock_getTime(
		
						stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
		
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
		
					stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
		
				if (Port_doesMessageExist(
		
				OvertakeeDriverComponent_getlineOvertakee(
		
				stateChart->parentComponent),
		
				MESSAGE_LINE_LINELIGHT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg =
		
					Port_receiveMessage(
		
					OvertakeeDriverComponent_getlineOvertakee(
		
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
		
					stateChart->lineOvertakee_apiValue = msg->_lineLight_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_lineOvertakee_behavior_overtakeeDriver_lineOvertakee_behaviorStateChart_processStep(
		
		RootovertakeeDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_lineOvertakee_behavior_overtakeeDriver_lineOvertakee_behavior) {
		
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE:
		
				// execute do action
		
				// nothing to do
		
				ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
				stateChart);
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
		RootovertakeeDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
		
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
		
				if (Port_doesMessageExist(
		
				OvertakeeDriverComponent_getdistanceOvertakee(
		
				stateChart->parentComponent),
		
				MESSAGE_DISTANCE_DISTANCE_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg =
		
					Port_receiveMessage(
		
					OvertakeeDriverComponent_getdistanceOvertakee(
		
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
		
					stateChart->distanceOvertakee_apiValue = msg->_distance_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else if (
		
				Clock_getTime(
		
						stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
		
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
		
					stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
		
				if (Port_doesMessageExist(
		
				OvertakeeDriverComponent_getdistanceOvertakee(
		
				stateChart->parentComponent),
		
				MESSAGE_DISTANCE_DISTANCE_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					OvertakeeDriverComponent_getdistanceOvertakee(
		
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
		
					stateChart->distanceOvertakee_apiValue = msg->_distance_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_distanceOvertakee_behavior_overtakeeDriver_distanceOvertakee_behaviorStateChart_processStep(
		
		RootovertakeeDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_distanceOvertakee_behavior_overtakeeDriver_distanceOvertakee_behavior) {
		
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE:
		
				// execute do action
		
				// nothing to do
		
				ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
				stateChart);
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void RootovertakeeDriverRTSCStateChart_processStep(
				RootovertakeeDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfRootovertakeeDriverRTSC) {
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE:
				// execute do action
				// nothing to do
		
				ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_distanceOvertakee_behavior_overtakeeDriver_distanceOvertakee_behaviorStateChart_processStep(
						stateChart);
				ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_lineOvertakee_behavior_overtakeeDriver_lineOvertakee_behaviorStateChart_processStep(
						stateChart);
				ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityR_behavior_overtakeeDriver_velocityR_behaviorStateChart_processStep(
						stateChart);
				ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityL_behavior_overtakeeDriver_velocityL_behaviorStateChart_processStep(
						stateChart);
				ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeSaveBreakRTSC_overtakeeSaveBreakRTSCStateChart_processStep(
						stateChart);
				ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDrivingRTSC_overtakeeDrivingRTSCStateChart_processStep(
						stateChart);
				ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_velocityGetterPortRTSC_velocityGetterPortRTSCStateChart_processStep(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		
		
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDrivingRTSC_overtakeeDrivingRTSCStateChart_exit(
				RootovertakeeDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDrivingRTSC_overtakeeDrivingRTSC) {
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVINGRTSC_OVERTAKEEDRIVINGRTSC_DRIVE_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootovertakeeDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityL_behavior_overtakeeDriver_velocityL_behaviorStateChart_exit(
				RootovertakeeDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityL_behavior_overtakeeDriver_velocityL_behavior) {
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE:
				// nothing to do
		
				ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_distanceOvertakee_behavior_overtakeeDriver_distanceOvertakee_behaviorStateChart_exit(
				RootovertakeeDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_distanceOvertakee_behavior_overtakeeDriver_distanceOvertakee_behavior) {
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE:
				// nothing to do
		
				ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootovertakeeDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootovertakeeDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootovertakeeDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeSaveBreakRTSC_overtakeeSaveBreakRTSCStateChart_exit(
				RootovertakeeDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeSaveBreakRTSC_overtakeeSaveBreakRTSC) {
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEESAVEBREAKRTSC_OVERTAKEESAVEBREAKRTSC_CHECKDISTANCE_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEESAVEBREAKRTSC_OVERTAKEESAVEBREAKRTSC_BREAKNOW_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_lineOvertakee_behavior_overtakeeDriver_lineOvertakee_behaviorStateChart_exit(
				RootovertakeeDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_lineOvertakee_behavior_overtakeeDriver_lineOvertakee_behavior) {
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE:
				// nothing to do
		
				ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_velocityGetterPortRTSC_velocityGetterPortRTSCStateChart_exit(
				RootovertakeeDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_velocityGetterPortRTSC_velocityGetterPortRTSC) {
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_SLOW_STATE:
				// nothing to do
		
				break;
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_FAST_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityR_behavior_overtakeeDriver_velocityR_behaviorStateChart_exit(
				RootovertakeeDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityR_behavior_overtakeeDriver_velocityR_behavior) {
			case ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE:
				// nothing to do
		
				ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
				
			
		int_t RootovertakeeDriverRTSCStateChart_isInState(
				RootovertakeeDriverRTSCStateChart* stateChart,
				RootovertakeeDriverRTSCState state) {
			return (stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDrivingRTSC_overtakeeDrivingRTSC
					== state
					|| stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
							== state
					|| stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityL_behavior_overtakeeDriver_velocityL_behavior
							== state
					|| stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_distanceOvertakee_behavior_overtakeeDriver_distanceOvertakee_behavior
							== state
					|| stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
							== state
					|| stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
							== state
					|| stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
							== state
					|| stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeSaveBreakRTSC_overtakeeSaveBreakRTSC
							== state
					|| stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_lineOvertakee_behavior_overtakeeDriver_lineOvertakee_behavior
							== state
					|| stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_velocityGetterPortRTSC_velocityGetterPortRTSC
							== state
					|| stateChart->currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityR_behavior_overtakeeDriver_velocityR_behavior
							== state);
		
		}
		
		bool_t RootovertakeeDriverRTSCStateChart_isTerminated(
				RootovertakeeDriverRTSCStateChart* stateChart) {
			//TODO
			return true;
		}
		



