
		////////////////////////////////////////////////////////////////////////////////
		// Includes
		////////////////////////////////////////////////////////////////////////////////
		#include <stdio.h>
		#include <stdlib.h>
		#include "../GlobalIdentifier.h"
		#include "rootDriverCmpRTSCStateChart.h"
		
		



		
		////////////////////////////////////////////////////////////////////////////////
		// Initialization
		////////////////////////////////////////////////////////////////////////////////
		void initializeROOTDRIVERCMPRTSC_INIT_STATE_DriverBehaviorRTSCRegion(
				RootDriverCmpRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DriverBehaviorRTSC_DriverBehaviorRTSC =
					ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERBEHAVIORRTSC_DRIVERBEHAVIORRTSC_DRIVE_STATE;
		
			// execute entry actions
			stateChart->driveFlag = false;
			;
		
		}
		void initializeROOTDRIVERCMPRTSC_INIT_STATE_DriverPortRTSCRegion(
				RootDriverCmpRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DriverPortRTSC_DriverPortRTSC =
					ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERPORTRTSC_DRIVERPORTRTSC_DRIVING_STATE;
		
			// execute entry actions
		
			// nothing to do
		
		}
		void initializeROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorRightPort_behaviorRegion(
				RootDriverCmpRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorRightPort_behavior_Driver_MotorRightPort_behavior =
					ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
		}
		void initializeROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootDriverCmpRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->clockSending_ofcurrentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->clockSending_ofcurrentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		void initializeROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorLeftPort_behaviorRegion(
				RootDriverCmpRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorLeftPort_behavior_Driver_MotorLeftPort_behavior =
					ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
		}
		void initializeROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootDriverCmpRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->clockSending_ofcurrentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->clockSending_ofcurrentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		void initializeROOTDRIVERCMPRTSC_INIT_STATE_Driver_LineLeaderPort_behaviorRegion(
				RootDriverCmpRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_Driver_LineLeaderPort_behavior_Driver_LineLeaderPort_behavior =
					ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
		}
		void initializeROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootDriverCmpRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		
		void RootDriverCmpRTSCStateChart_initialize(
				RootDriverCmpRTSCStateChart* stateChart) {
		
			stateChart->velocity = 20;
			stateChart->driveFlag = false;
			stateChart->stopFlag = false;
			stateChart->MotorRightPort_apiValue = 0;
			stateChart->MotorLeftPort_apiValue = 0;
			stateChart->LineLeaderPort_apiValue = 0;
		
			stateChart->currentStateOfRootDriverCmpRTSC = ROOTDRIVERCMPRTSC_INIT_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTDRIVERCMPRTSC_INIT_STATE_DriverBehaviorRTSCRegion(stateChart);
			initializeROOTDRIVERCMPRTSC_INIT_STATE_DriverPortRTSCRegion(stateChart);
			initializeROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorRightPort_behaviorRegion(
					stateChart);
			initializeROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorLeftPort_behaviorRegion(
					stateChart);
			initializeROOTDRIVERCMPRTSC_INIT_STATE_Driver_LineLeaderPort_behaviorRegion(
					stateChart);
		}
		
		

		////////////////////////////////////////////////////////////////////////////////
		// Construction and destruction
		////////////////////////////////////////////////////////////////////////////////
		RootDriverCmpRTSCStateChart* RootDriverCmpRTSCStateChart_create(
				DriverComponent* parentComponent) {
			RootDriverCmpRTSCStateChart* stateChart =
					(RootDriverCmpRTSCStateChart*) malloc(
							sizeof(RootDriverCmpRTSCStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
		
				/*
				 if (stateChart->parentComponent != NULL
				 ) {
				 RootDriverCmpRTSCStateChart_initialize(stateChart);
				 } else {
				 fprintf(stderr, "Initialization of RootDriverCmpRTSCStateChart failed\n");
		
				 RootDriverCmpRTSCStateChart_destroy(stateChart);
				 stateChart = NULL;
				 }
				 } else {
				 fprintf(stderr, "Creation of RootDriverCmpRTSCStateChart failed\n");
				 */}
			return stateChart;
		}
		

			void RootDriverCmpRTSCStateChart_destroy(RootDriverCmpRTSCStateChart* stateChart) {
				if(stateChart != NULL) {
		
					free(stateChart);
				}
			}
	
		////////////////////////////////////////////////////////////////////////////////
		// Processing the statechart
		////////////////////////////////////////////////////////////////////////////////
	
		

		
		void ROOTDRIVERCMPRTSC_INIT_STATE_DriverBehaviorRTSC_DriverBehaviorRTSCStateChart_processStep(
				RootDriverCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DriverBehaviorRTSC_DriverBehaviorRTSC) {
			case ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERBEHAVIORRTSC_DRIVERBEHAVIORRTSC_DRIVE_STATE:
				if (1) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->MotorLeftPort_apiValue = stateChart->velocity;
		
					stateChart->MotorRightPort_apiValue = stateChart->velocity;
		
					;
		
					// nothing to do			
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DriverBehaviorRTSC_DriverBehaviorRTSC =
							ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERBEHAVIORRTSC_DRIVERBEHAVIORRTSC_DRIVE_STATE;
		
					// execute entry actions
		
					stateChart->driveFlag = false;
		
					;
		
				} else if (
		
				stateChart->stopFlag
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DriverBehaviorRTSC_DriverBehaviorRTSC =
							ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERBEHAVIORRTSC_DRIVERBEHAVIORRTSC_STOP_STATE;
		
					// execute entry actions
		
					stateChart->MotorLeftPort_apiValue = 0;
		
					stateChart->MotorRightPort_apiValue = 0;
		
					stateChart->stopFlag = false;
		
					;
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			case ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERBEHAVIORRTSC_DRIVERBEHAVIORRTSC_STOP_STATE:
				if (
		
				stateChart->driveFlag
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DriverBehaviorRTSC_DriverBehaviorRTSC =
							ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERBEHAVIORRTSC_DRIVERBEHAVIORRTSC_DRIVE_STATE;
		
					// execute entry actions
		
					stateChart->driveFlag = false;
		
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
		
		void ROOTDRIVERCMPRTSC_INIT_STATE_DriverPortRTSC_DriverPortRTSCStateChart_processStep(
		
		RootDriverCmpRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DriverPortRTSC_DriverPortRTSC) {
		
			case ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERPORTRTSC_DRIVERPORTRTSC_DRIVING_STATE:
		
				if (Port_doesMessageExist(
		
				DriverComponent_getDriverPort(stateChart->parentComponent),
		
				MESSAGE_STOPDELIVERYMESSAGESMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					DriverComponent_getDriverPort(stateChart->parentComponent),
		
					MESSAGE_STOPDELIVERYMESSAGESMESSAGE);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->stopFlag = true;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DriverPortRTSC_DriverPortRTSC =
		
							ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERPORTRTSC_DRIVERPORTRTSC_STOPPING_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERPORTRTSC_DRIVERPORTRTSC_STOPPING_STATE:
		
				if (Port_doesMessageExist(
		
				DriverComponent_getDriverPort(stateChart->parentComponent),
		
				MESSAGE_GODELIVERYMESSAGESMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					DriverComponent_getDriverPort(stateChart->parentComponent),
		
					MESSAGE_GODELIVERYMESSAGESMESSAGE);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->driveFlag = true;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DriverPortRTSC_DriverPortRTSC =
		
							ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERPORTRTSC_DRIVERPORTRTSC_DRIVING_STATE;
		
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
		
		void ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
		RootDriverCmpRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
		
			case ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE:
		
				if (Clock_getTime(
		
						stateChart->clockSending_ofcurrentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
		
				>= 100 * 1.0
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//create new Parameter struct for Motor_MotorPort_messageapi_messageType_RepositoryMessage
		
					struct Motor_MotorPort_messageapi_messageType_RepositoryMessage * msg =
		
							(Motor_MotorPort_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct Motor_MotorPort_messageapi_messageType_RepositoryMessage));
		
					msg->_motorPort_value = stateChart->MotorRightPort_apiValue;
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->motorRightPortPort->ID),
		
					MESSAGE_MOTOR_MOTORPORT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE,
		
					msg);
		
					//printf("sent message of type %d",MESSAGE_MOTOR_MOTORPORT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					free(msg);
		
					// change the state
		
					stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->clockSending_ofcurrentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorRightPort_behavior_Driver_MotorRightPort_behaviorStateChart_processStep(
		
		RootDriverCmpRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorRightPort_behavior_Driver_MotorRightPort_behavior) {
		
			case ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE:
		
				// execute do action
		
				// nothing to do
		
				ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
				stateChart);
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
		RootDriverCmpRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
		
			case ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE:
		
				if (Clock_getTime(
		
						stateChart->clockSending_ofcurrentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
		
				>= 100 * 1.0
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//create new Parameter struct for Motor_MotorPort_messageapi_messageType_RepositoryMessage
		
					struct Motor_MotorPort_messageapi_messageType_RepositoryMessage * msg =
		
							(Motor_MotorPort_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct Motor_MotorPort_messageapi_messageType_RepositoryMessage));
		
					msg->_motorPort_value = stateChart->MotorLeftPort_apiValue;
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->motorLeftPortPort->ID),
		
					MESSAGE_MOTOR_MOTORPORT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE,
		
					msg);
		
					//printf("sent message of type %d",MESSAGE_MOTOR_MOTORPORT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					free(msg);
		
					// change the state
		
					stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->clockSending_ofcurrentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorLeftPort_behavior_Driver_MotorLeftPort_behaviorStateChart_processStep(
		
		RootDriverCmpRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorLeftPort_behavior_Driver_MotorLeftPort_behavior) {
		
			case ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE:
		
				// execute do action
		
				// nothing to do
		
				ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
				stateChart);
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
		RootDriverCmpRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
		
			case ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
		
				if (Port_doesMessageExist(
		
				DriverComponent_getLineLeaderPort(stateChart->parentComponent),
		
						MESSAGE_LINELEADERSENSOR_LINELEADERPORT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
						) {
		
					MiddlewareMessage* mwMsg =
		
							Port_receiveMessage(
		
							DriverComponent_getLineLeaderPort(
		
							stateChart->parentComponent),
		
									MESSAGE_LINELEADERSENSOR_LINELEADERPORT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE);
		
					struct LineLeaderSensor_LineLeaderPort_messageapi_messageType_RepositoryMessage * msg =
		
							(LineLeaderSensor_LineLeaderPort_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct LineLeaderSensor_LineLeaderPort_messageapi_messageType_RepositoryMessage));
		
					LineLeaderSensor_LineLeaderPort_messageapi_messageType_RepositoryMessage_read_delimited_from(
		
					mwMsg->_mumlMsg, msg, 0);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->LineLeaderPort_apiValue = msg->_lineLeaderPort_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else if (
		
				Clock_getTime(
		
						stateChart->receiverTimeout_ofcurrentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
		
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
		
					stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
		
				if (Port_doesMessageExist(
		
				DriverComponent_getLineLeaderPort(stateChart->parentComponent),
		
						MESSAGE_LINELEADERSENSOR_LINELEADERPORT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
						) {
		
					MiddlewareMessage* mwMsg =
		
							Port_receiveMessage(
		
							DriverComponent_getLineLeaderPort(
		
							stateChart->parentComponent),
		
									MESSAGE_LINELEADERSENSOR_LINELEADERPORT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE);
		
					struct LineLeaderSensor_LineLeaderPort_messageapi_messageType_RepositoryMessage * msg =
		
							(LineLeaderSensor_LineLeaderPort_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct LineLeaderSensor_LineLeaderPort_messageapi_messageType_RepositoryMessage));
		
					LineLeaderSensor_LineLeaderPort_messageapi_messageType_RepositoryMessage_read_delimited_from(
		
					mwMsg->_mumlMsg, msg, 0);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->LineLeaderPort_apiValue = msg->_lineLeaderPort_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTDRIVERCMPRTSC_INIT_STATE_Driver_LineLeaderPort_behavior_Driver_LineLeaderPort_behaviorStateChart_processStep(
		
		RootDriverCmpRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_Driver_LineLeaderPort_behavior_Driver_LineLeaderPort_behavior) {
		
			case ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE:
		
				// execute do action
		
				// nothing to do
		
				ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
				stateChart);
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void RootDriverCmpRTSCStateChart_processStep(
				RootDriverCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfRootDriverCmpRTSC) {
			case ROOTDRIVERCMPRTSC_INIT_STATE:
				// execute do action
				// nothing to do
		
				ROOTDRIVERCMPRTSC_INIT_STATE_Driver_LineLeaderPort_behavior_Driver_LineLeaderPort_behaviorStateChart_processStep(
						stateChart);
				ROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorLeftPort_behavior_Driver_MotorLeftPort_behaviorStateChart_processStep(
						stateChart);
				ROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorRightPort_behavior_Driver_MotorRightPort_behaviorStateChart_processStep(
						stateChart);
				ROOTDRIVERCMPRTSC_INIT_STATE_DriverPortRTSC_DriverPortRTSCStateChart_processStep(
						stateChart);
				ROOTDRIVERCMPRTSC_INIT_STATE_DriverBehaviorRTSC_DriverBehaviorRTSCStateChart_processStep(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		
		
		void ROOTDRIVERCMPRTSC_INIT_STATE_DriverPortRTSC_DriverPortRTSCStateChart_exit(
				RootDriverCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DriverPortRTSC_DriverPortRTSC) {
			case ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERPORTRTSC_DRIVERPORTRTSC_DRIVING_STATE:
				// nothing to do
		
				break;
			case ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERPORTRTSC_DRIVERPORTRTSC_STOPPING_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTDRIVERCMPRTSC_INIT_STATE_Driver_LineLeaderPort_behavior_Driver_LineLeaderPort_behaviorStateChart_exit(
				RootDriverCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_Driver_LineLeaderPort_behavior_Driver_LineLeaderPort_behavior) {
			case ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE:
				// nothing to do
		
				ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		void ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootDriverCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootDriverCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
				// nothing to do
		
				break;
			case ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTDRIVERCMPRTSC_INIT_STATE_DriverBehaviorRTSC_DriverBehaviorRTSCStateChart_exit(
				RootDriverCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DriverBehaviorRTSC_DriverBehaviorRTSC) {
			case ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERBEHAVIORRTSC_DRIVERBEHAVIORRTSC_DRIVE_STATE:
				// nothing to do
		
				break;
			case ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERBEHAVIORRTSC_DRIVERBEHAVIORRTSC_STOP_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootDriverCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorLeftPort_behavior_Driver_MotorLeftPort_behaviorStateChart_exit(
				RootDriverCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorLeftPort_behavior_Driver_MotorLeftPort_behavior) {
			case ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE:
				// nothing to do
		
				ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		void ROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorRightPort_behavior_Driver_MotorRightPort_behaviorStateChart_exit(
				RootDriverCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorRightPort_behavior_Driver_MotorRightPort_behavior) {
			case ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE:
				// nothing to do
		
				ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
				
			
		int_t RootDriverCmpRTSCStateChart_isInState(
				RootDriverCmpRTSCStateChart* stateChart, RootDriverCmpRTSCState state) {
			return (stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DriverPortRTSC_DriverPortRTSC
					== state
					|| stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_Driver_LineLeaderPort_behavior_Driver_LineLeaderPort_behavior
							== state
					|| stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
							== state
					|| stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DriverBehaviorRTSC_DriverBehaviorRTSC
							== state
					|| stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
							== state
					|| stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
							== state
					|| stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorLeftPort_behavior_Driver_MotorLeftPort_behavior
							== state
					|| stateChart->currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorRightPort_behavior_Driver_MotorRightPort_behavior
							== state);
		
		}
		
		bool_t RootDriverCmpRTSCStateChart_isTerminated(
				RootDriverCmpRTSCStateChart* stateChart) {
			//TODO
			return true;
		}
		



