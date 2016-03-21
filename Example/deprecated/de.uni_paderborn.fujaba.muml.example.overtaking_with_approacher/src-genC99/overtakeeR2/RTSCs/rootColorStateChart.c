
		////////////////////////////////////////////////////////////////////////////////
		// Includes
		////////////////////////////////////////////////////////////////////////////////
		#include <stdio.h>
		#include <stdlib.h>
		#include "../GlobalIdentifier.h"
		#include "rootColorStateChart.h"
		
		



		
		////////////////////////////////////////////////////////////////////////////////
		// Initialization
		////////////////////////////////////////////////////////////////////////////////
		void initializeROOTCOLOR_COLOR_STATE_STATE_Color_color_behaviorRegion(
				RootColorStateChart* stateChart) {
		
			stateChart->currentStateOfROOTCOLOR_COLOR_STATE_STATE_Color_color_behavior_Color_color_behavior =
					ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE;
		
			// execute entry actions
			// nothing to do
		
			initializeROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
			initializeROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecutionRegion(
					stateChart);
		}
		void initializeROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootColorStateChart* stateChart) {
			Clock_reset(
					stateChart->clockSending_ofcurrentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->clockSending_ofcurrentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		void initializeROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecutionRegion(
				RootColorStateChart* stateChart) {
			Clock_reset(
					stateChart->_apiClock_ofcurrentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution_ApiExecutionClock);
		
			stateChart->TimeBetweenApiExececutions = 20;
		
			stateChart->currentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution_ApiExecution =
					ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECINITCOMMAND_STATE;
		
			// execute entry actions
		
			stateChart->initApi();
		
		}
		
		void RootColorStateChart_initialize(RootColorStateChart* stateChart) {
		
			stateChart->color_apiValue = 0;
		
			stateChart->currentStateOfRootColor = ROOTCOLOR_COLOR_STATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTCOLOR_COLOR_STATE_STATE_Color_color_behaviorRegion(
					stateChart);
		}
		
		

		////////////////////////////////////////////////////////////////////////////////
		// Construction and destruction
		////////////////////////////////////////////////////////////////////////////////
		RootColorStateChart* RootColorStateChart_create(
				ColorComponent* parentComponent) {
			RootColorStateChart* stateChart = (RootColorStateChart*) malloc(
					sizeof(RootColorStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
		
				/*
				 if (stateChart->parentComponent != NULL
				 ) {
				 RootColorStateChart_initialize(stateChart);
				 } else {
				 fprintf(stderr, "Initialization of RootColorStateChart failed\n");
		
				 RootColorStateChart_destroy(stateChart);
				 stateChart = NULL;
				 }
				 } else {
				 fprintf(stderr, "Creation of RootColorStateChart failed\n");
				 */}
			return stateChart;
		}
		

			void RootColorStateChart_destroy(RootColorStateChart* stateChart) {
				if(stateChart != NULL) {
		
					free(stateChart);
				}
			}
	
		////////////////////////////////////////////////////////////////////////////////
		// Processing the statechart
		////////////////////////////////////////////////////////////////////////////////
	
		

		
		void ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
				RootColorStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE:
				if (Clock_getTime(
						stateChart->clockSending_ofcurrentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
						>= 50 * 1.0
		
						) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//create new Parameter struct for Color_color_messageapi_messageType_RepositoryMessage
		
					struct Color_color_messageapi_messageType_RepositoryMessage * msg =
		
							(Color_color_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct Color_color_messageapi_messageType_RepositoryMessage));
		
					msg->_color_value = stateChart->color_apiValue;
		
					//send Message
		
					MW_sendMessage(
							MW_getTargetPortIDforIdentifier(
									stateChart->parentComponent->colorPort->ID),
							MESSAGE_COLOR_COLOR_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE,
							msg);
		
					//printf("sent message of type %d",MESSAGE_COLOR_COLOR_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					free(msg);
		
					// change the state
		
					stateChart->currentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
							ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE;
		
					// execute entry actions
		
					Clock_reset(
							stateChart->clockSending_ofcurrentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			default:
				break;
			}
		}
		
		void ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution_ApiExecutionStateChart_processStep(
		
		RootColorStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution_ApiExecution) {
		
			case ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECINITCOMMAND_STATE:
		
				if (1) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution_ApiExecution =
		
							ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE;
		
					// execute entry actions
		
					stateChart->color_apiValue = stateChart->execApi();
		
					;
		
					Clock_reset(
		
							stateChart->_apiClock_ofcurrentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution_ApiExecutionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE:
		
				if (
		
				Clock_getTime(
		
						stateChart->_apiClock_ofcurrentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution_ApiExecutionClock)
		
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
		
					stateChart->currentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution_ApiExecution =
		
							ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE;
		
					// execute entry actions
		
					stateChart->color_apiValue = stateChart->execApi();
		
					;
		
					Clock_reset(
		
							stateChart->_apiClock_ofcurrentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution_ApiExecutionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTCOLOR_COLOR_STATE_STATE_Color_color_behavior_Color_color_behaviorStateChart_processStep(
				RootColorStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTCOLOR_COLOR_STATE_STATE_Color_color_behavior_Color_color_behavior) {
			case ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE:
				// execute do action
				// nothing to do
		
				ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution_ApiExecutionStateChart_processStep(
						stateChart);
				ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		
		void RootColorStateChart_processStep(RootColorStateChart* stateChart) {
			switch (stateChart->currentStateOfRootColor) {
			case ROOTCOLOR_COLOR_STATE_STATE:
				// execute do action
				// nothing to do
		
				ROOTCOLOR_COLOR_STATE_STATE_Color_color_behavior_Color_color_behaviorStateChart_processStep(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		
		
		void ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution_ApiExecutionStateChart_exit(
				RootColorStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution_ApiExecution) {
			case ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECINITCOMMAND_STATE:
				// nothing to do
		
				break;
			case ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootColorStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTCOLOR_COLOR_STATE_STATE_Color_color_behavior_Color_color_behaviorStateChart_exit(
				RootColorStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTCOLOR_COLOR_STATE_STATE_Color_color_behavior_Color_color_behavior) {
			case ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE:
				// nothing to do
		
				ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution_ApiExecutionStateChart_exit(
						stateChart);
		
				ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
				
			
		int_t RootColorStateChart_isInState(RootColorStateChart* stateChart,
				RootColorState state) {
			return (stateChart->currentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution_ApiExecution
					== state
					|| stateChart->currentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
							== state
					|| stateChart->currentStateOfROOTCOLOR_COLOR_STATE_STATE_Color_color_behavior_Color_color_behavior
							== state);
		
		}
		
		bool_t RootColorStateChart_isTerminated(RootColorStateChart* stateChart) {
			//TODO
			return true;
		}
		



