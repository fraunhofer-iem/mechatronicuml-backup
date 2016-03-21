
		////////////////////////////////////////////////////////////////////////////////
		// Includes
		////////////////////////////////////////////////////////////////////////////////
		#include <stdio.h>
		#include <stdlib.h>
		#include "../GlobalIdentifier.h"
		#include "rootMotorStateChart.h"
		
		



		
		////////////////////////////////////////////////////////////////////////////////
		// Initialization
		////////////////////////////////////////////////////////////////////////////////
		void initializeROOTMOTOR_MOTOR_STATE_STATE_Motor_velocity_behaviorRegion(
				RootMotorStateChart* stateChart) {
		
			stateChart->currentStateOfROOTMOTOR_MOTOR_STATE_STATE_Motor_velocity_behavior_Motor_velocity_behavior =
					ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE;
		
			// execute entry actions
			// nothing to do
		
			initializeROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
			initializeROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecutionRegion(
					stateChart);
		}
		void initializeROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootMotorStateChart* stateChart) {
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		void initializeROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecutionRegion(
				RootMotorStateChart* stateChart) {
			Clock_reset(
					stateChart->_apiClock_ofcurrentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution_ApiExecutionClock);
		
			stateChart->TimeBetweenApiExececutions = 20;
		
			stateChart->currentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution_ApiExecution =
					ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECINITCOMMAND_STATE;
		
			// execute entry actions
		
			stateChart->initApi();
		
		}
		
		void RootMotorStateChart_initialize(RootMotorStateChart* stateChart) {
		
			stateChart->velocity_apiValue = 0;
		
			stateChart->currentStateOfRootMotor = ROOTMOTOR_MOTOR_STATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTMOTOR_MOTOR_STATE_STATE_Motor_velocity_behaviorRegion(
					stateChart);
		}
		
		

		////////////////////////////////////////////////////////////////////////////////
		// Construction and destruction
		////////////////////////////////////////////////////////////////////////////////
		RootMotorStateChart* RootMotorStateChart_create(
				MotorComponent* parentComponent) {
			RootMotorStateChart* stateChart = (RootMotorStateChart*) malloc(
					sizeof(RootMotorStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
		
				/*
				 if (stateChart->parentComponent != NULL
				 ) {
				 RootMotorStateChart_initialize(stateChart);
				 } else {
				 fprintf(stderr, "Initialization of RootMotorStateChart failed\n");
		
				 RootMotorStateChart_destroy(stateChart);
				 stateChart = NULL;
				 }
				 } else {
				 fprintf(stderr, "Creation of RootMotorStateChart failed\n");
				 */}
			return stateChart;
		}
		

			void RootMotorStateChart_destroy(RootMotorStateChart* stateChart) {
				if(stateChart != NULL) {
		
					free(stateChart);
				}
			}
	
		////////////////////////////////////////////////////////////////////////////////
		// Processing the statechart
		////////////////////////////////////////////////////////////////////////////////
	
		

		
		void ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
				RootMotorStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
				if (Port_doesMessageExist(
						MotorComponent_getvelocity(stateChart->parentComponent),
						MESSAGE_MOTOR_VELOCITY_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
						) {
					MiddlewareMessage* mwMsg =
							Port_receiveMessage(
									MotorComponent_getvelocity(
											stateChart->parentComponent),
									MESSAGE_MOTOR_VELOCITY_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE);
		
					struct Motor_velocity_messageapi_messageType_RepositoryMessage * msg =
							(Motor_velocity_messageapi_messageType_RepositoryMessage*) malloc(
									sizeof(struct Motor_velocity_messageapi_messageType_RepositoryMessage));
					Motor_velocity_messageapi_messageType_RepositoryMessage_read_delimited_from(
							mwMsg->_mumlMsg, msg, 0);
					//printf("received message of type %d",mwMsg->_msgID );
					fflush (stdout);
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->velocity_apiValue = msg->_velocity_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
					free(msg);
					free(mwMsg);
		
					//release all created sent events
					// change the state
					stateChart->currentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
							ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
							stateChart->receiverTimeout_ofcurrentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else if (
		
				Clock_getTime(
						stateChart->receiverTimeout_ofcurrentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
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
		
					stateChart->currentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
							ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			case ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
				if (Port_doesMessageExist(
						MotorComponent_getvelocity(stateChart->parentComponent),
						MESSAGE_MOTOR_VELOCITY_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
						) {
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					MotorComponent_getvelocity(stateChart->parentComponent),
		
					MESSAGE_MOTOR_VELOCITY_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE);
		
					struct Motor_velocity_messageapi_messageType_RepositoryMessage * msg =
		
							(Motor_velocity_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct Motor_velocity_messageapi_messageType_RepositoryMessage));
		
					Motor_velocity_messageapi_messageType_RepositoryMessage_read_delimited_from(
							mwMsg->_mumlMsg, msg, 0);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->velocity_apiValue = msg->_velocity_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
							ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
							stateChart->receiverTimeout_ofcurrentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			default:
				break;
			}
		}
		
		void ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution_ApiExecutionStateChart_processStep(
		
		RootMotorStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution_ApiExecution) {
		
			case ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECINITCOMMAND_STATE:
		
				if (1) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution_ApiExecution =
		
							ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE;
		
					// execute entry actions
		
					stateChart->execApi(stateChart->velocity_apiValue);
		
					Clock_reset(
		
							stateChart->_apiClock_ofcurrentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution_ApiExecutionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE:
		
				if (
		
				Clock_getTime(
		
						stateChart->_apiClock_ofcurrentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution_ApiExecutionClock)
		
				>= stateChart->TimeBetweenApiExececutions * 1.0
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution_ApiExecution =
		
							ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE;
		
					// execute entry actions
		
					stateChart->execApi(stateChart->velocity_apiValue);
		
					Clock_reset(
		
							stateChart->_apiClock_ofcurrentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution_ApiExecutionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTMOTOR_MOTOR_STATE_STATE_Motor_velocity_behavior_Motor_velocity_behaviorStateChart_processStep(
				RootMotorStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTMOTOR_MOTOR_STATE_STATE_Motor_velocity_behavior_Motor_velocity_behavior) {
			case ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE:
				// execute do action
				// nothing to do
		
				ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution_ApiExecutionStateChart_processStep(
						stateChart);
				ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		
		void RootMotorStateChart_processStep(RootMotorStateChart* stateChart) {
			switch (stateChart->currentStateOfRootMotor) {
			case ROOTMOTOR_MOTOR_STATE_STATE:
				// execute do action
				// nothing to do
		
				ROOTMOTOR_MOTOR_STATE_STATE_Motor_velocity_behavior_Motor_velocity_behaviorStateChart_processStep(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		
		
		void ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution_ApiExecutionStateChart_exit(
				RootMotorStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution_ApiExecution) {
			case ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECINITCOMMAND_STATE:
				// nothing to do
		
				break;
			case ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootMotorStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
				// nothing to do
		
				break;
			case ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTMOTOR_MOTOR_STATE_STATE_Motor_velocity_behavior_Motor_velocity_behaviorStateChart_exit(
				RootMotorStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTMOTOR_MOTOR_STATE_STATE_Motor_velocity_behavior_Motor_velocity_behavior) {
			case ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE:
				// nothing to do
		
				ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution_ApiExecutionStateChart_exit(
						stateChart);
		
				ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
				
			
		int_t RootMotorStateChart_isInState(RootMotorStateChart* stateChart,
				RootMotorState state) {
			return (stateChart->currentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution_ApiExecution
					== state
					|| stateChart->currentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
							== state
					|| stateChart->currentStateOfROOTMOTOR_MOTOR_STATE_STATE_Motor_velocity_behavior_Motor_velocity_behavior
							== state);
		
		}
		
		bool_t RootMotorStateChart_isTerminated(RootMotorStateChart* stateChart) {
			//TODO
			return true;
		}
		



