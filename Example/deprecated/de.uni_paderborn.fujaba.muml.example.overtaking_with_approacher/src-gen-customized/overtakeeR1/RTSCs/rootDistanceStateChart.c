
		////////////////////////////////////////////////////////////////////////////////
		// Includes
		////////////////////////////////////////////////////////////////////////////////
		#include <stdio.h>
		#include <stdlib.h>
		#include "../GlobalIdentifier.h"
		#include "rootDistanceStateChart.h"
		
		



		
		////////////////////////////////////////////////////////////////////////////////
		// Initialization
		////////////////////////////////////////////////////////////////////////////////
		void initializeROOTDISTANCE_DISTANCE_STATE_STATE_Distance_distance_behaviorRegion(
				RootDistanceStateChart* stateChart) {
		
			stateChart->currentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_Distance_distance_behavior_Distance_distance_behavior =
					ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE;
		
			// execute entry actions
			// nothing to do
		
			initializeROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
			initializeROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecutionRegion(
					stateChart);
		}
		void initializeROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootDistanceStateChart* stateChart) {
			Clock_reset(
					stateChart->clockSending_ofcurrentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->clockSending_ofcurrentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		void initializeROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecutionRegion(
				RootDistanceStateChart* stateChart) {
			Clock_reset(
					stateChart->_apiClock_ofcurrentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution_ApiExecutionClock);
		
			stateChart->TimeBetweenApiExececutions = 20;
		
			stateChart->currentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution_ApiExecution =
					ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECINITCOMMAND_STATE;
		
			// execute entry actions
		
			stateChart->initApi();
		
		}
		
		void RootDistanceStateChart_initialize(RootDistanceStateChart* stateChart) {
		
			stateChart->distance_apiValue = 150;
		
			stateChart->currentStateOfRootDistance = ROOTDISTANCE_DISTANCE_STATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTDISTANCE_DISTANCE_STATE_STATE_Distance_distance_behaviorRegion(
					stateChart);
		}
		
		

		////////////////////////////////////////////////////////////////////////////////
		// Construction and destruction
		////////////////////////////////////////////////////////////////////////////////
		RootDistanceStateChart* RootDistanceStateChart_create(
				DistanceComponent* parentComponent) {
			RootDistanceStateChart* stateChart = (RootDistanceStateChart*) malloc(
					sizeof(RootDistanceStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
		
				/*
				 if (stateChart->parentComponent != NULL
				 ) {
				 RootDistanceStateChart_initialize(stateChart);
				 } else {
				 fprintf(stderr, "Initialization of RootDistanceStateChart failed\n");
		
				 RootDistanceStateChart_destroy(stateChart);
				 stateChart = NULL;
				 }
				 } else {
				 fprintf(stderr, "Creation of RootDistanceStateChart failed\n");
				 */}
			return stateChart;
		}
		

			void RootDistanceStateChart_destroy(RootDistanceStateChart* stateChart) {
				if(stateChart != NULL) {
		
					free(stateChart);
				}
			}
	
		////////////////////////////////////////////////////////////////////////////////
		// Processing the statechart
		////////////////////////////////////////////////////////////////////////////////
	
		

		
		void ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
				RootDistanceStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE:
				if (Clock_getTime(
						stateChart->clockSending_ofcurrentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
						>= 50 * 1.0
		
						) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//create new Parameter struct for Distance_distance_messageapi_messageType_RepositoryMessage
		
					struct Distance_distance_messageapi_messageType_RepositoryMessage * msg =
		
							(Distance_distance_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct Distance_distance_messageapi_messageType_RepositoryMessage));
		
					msg->_distance_value = stateChart->distance_apiValue;
		
					//send Message
		
					MW_sendMessage(
							MW_getTargetPortIDforIdentifier(
									stateChart->parentComponent->distancePort->ID),
							MESSAGE_DISTANCE_DISTANCE_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE,
							msg);
		
					//printf("sent message of type %d",MESSAGE_DISTANCE_DISTANCE_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					free(msg);
		
					// change the state
		
					stateChart->currentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
							ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE;
		
					// execute entry actions
		
					Clock_reset(
							stateChart->clockSending_ofcurrentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			default:
				break;
			}
		}
		
		void ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution_ApiExecutionStateChart_processStep(
		
		RootDistanceStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution_ApiExecution) {
		
			case ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECINITCOMMAND_STATE:
		
				if (1) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution_ApiExecution =
		
							ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE;
		
					// execute entry actions
		
					stateChart->distance_apiValue = stateChart->execApi();
		
					;
		
					Clock_reset(
		
							stateChart->_apiClock_ofcurrentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution_ApiExecutionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE:
		
				if (
		
				Clock_getTime(
		
						stateChart->_apiClock_ofcurrentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution_ApiExecutionClock)
		
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
		
					stateChart->currentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution_ApiExecution =
		
							ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE;
		
					// execute entry actions
		
					stateChart->distance_apiValue = stateChart->execApi();
		
					;
		
					Clock_reset(
		
							stateChart->_apiClock_ofcurrentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution_ApiExecutionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTDISTANCE_DISTANCE_STATE_STATE_Distance_distance_behavior_Distance_distance_behaviorStateChart_processStep(
				RootDistanceStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_Distance_distance_behavior_Distance_distance_behavior) {
			case ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE:
				// execute do action
				// nothing to do
		
				ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution_ApiExecutionStateChart_processStep(
						stateChart);
				ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		
		void RootDistanceStateChart_processStep(RootDistanceStateChart* stateChart) {
			switch (stateChart->currentStateOfRootDistance) {
			case ROOTDISTANCE_DISTANCE_STATE_STATE:
				// execute do action
				// nothing to do
		
				ROOTDISTANCE_DISTANCE_STATE_STATE_Distance_distance_behavior_Distance_distance_behaviorStateChart_processStep(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		
		
		void ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootDistanceStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution_ApiExecutionStateChart_exit(
				RootDistanceStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution_ApiExecution) {
			case ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECINITCOMMAND_STATE:
				// nothing to do
		
				break;
			case ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTDISTANCE_DISTANCE_STATE_STATE_Distance_distance_behavior_Distance_distance_behaviorStateChart_exit(
				RootDistanceStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_Distance_distance_behavior_Distance_distance_behavior) {
			case ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE:
				// nothing to do
		
				ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution_ApiExecutionStateChart_exit(
						stateChart);
		
				ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
				
			
		int_t RootDistanceStateChart_isInState(RootDistanceStateChart* stateChart,
				RootDistanceState state) {
			return (stateChart->currentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
					== state
					|| stateChart->currentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution_ApiExecution
							== state
					|| stateChart->currentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_Distance_distance_behavior_Distance_distance_behavior
							== state);
		
		}
		
		bool_t RootDistanceStateChart_isTerminated(RootDistanceStateChart* stateChart) {
			//TODO
			return true;
		}
		



