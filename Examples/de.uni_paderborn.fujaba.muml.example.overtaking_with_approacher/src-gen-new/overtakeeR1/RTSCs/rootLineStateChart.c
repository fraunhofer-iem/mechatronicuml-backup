
		////////////////////////////////////////////////////////////////////////////////
		// Includes
		////////////////////////////////////////////////////////////////////////////////
		#include <stdio.h>
		#include <stdlib.h>
		#include "../GlobalIdentifier.h"
		#include "rootLineStateChart.h"
		
		



		
		////////////////////////////////////////////////////////////////////////////////
		// Initialization
		////////////////////////////////////////////////////////////////////////////////
		void initializeROOTLINE_LINE_STATE_STATE_Line_lineLight_behaviorRegion(
				RootLineStateChart* stateChart) {
		
			stateChart->currentStateOfROOTLINE_LINE_STATE_STATE_Line_lineLight_behavior_Line_lineLight_behavior =
					ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE;
		
			// execute entry actions
			// nothing to do
		
			initializeROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
			initializeROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecutionRegion(
					stateChart);
		}
		void initializeROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootLineStateChart* stateChart) {
			Clock_reset(
					stateChart->clockSending_ofcurrentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->clockSending_ofcurrentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		void initializeROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecutionRegion(
				RootLineStateChart* stateChart) {
			Clock_reset(
					stateChart->_apiClock_ofcurrentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution_ApiExecutionClock);
		
			stateChart->TimeBetweenApiExececutions = 20;
		
			stateChart->currentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution_ApiExecution =
					ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECINITCOMMAND_STATE;
		
			// execute entry actions
		
			stateChart->initApi();
		
		}
		
		void RootLineStateChart_initialize(RootLineStateChart* stateChart) {
		
			stateChart->lineLight_apiValue = 0;
		
			stateChart->currentStateOfRootLine = ROOTLINE_LINE_STATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTLINE_LINE_STATE_STATE_Line_lineLight_behaviorRegion(
					stateChart);
		}
		
		

		////////////////////////////////////////////////////////////////////////////////
		// Construction and destruction
		////////////////////////////////////////////////////////////////////////////////
		RootLineStateChart* RootLineStateChart_create(LineComponent* parentComponent) {
			RootLineStateChart* stateChart = (RootLineStateChart*) malloc(
					sizeof(RootLineStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
		
				/*
				 if (stateChart->parentComponent != NULL
				 ) {
				 RootLineStateChart_initialize(stateChart);
				 } else {
				 fprintf(stderr, "Initialization of RootLineStateChart failed\n");
		
				 RootLineStateChart_destroy(stateChart);
				 stateChart = NULL;
				 }
				 } else {
				 fprintf(stderr, "Creation of RootLineStateChart failed\n");
				 */}
			return stateChart;
		}
		

			void RootLineStateChart_destroy(RootLineStateChart* stateChart) {
				if(stateChart != NULL) {
		
					free(stateChart);
				}
			}
	
		////////////////////////////////////////////////////////////////////////////////
		// Processing the statechart
		////////////////////////////////////////////////////////////////////////////////
	
		

		
		void ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
				RootLineStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE:
				if (Clock_getTime(
						stateChart->clockSending_ofcurrentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
						>= 50 * 1.0
		
						) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//create new Parameter struct for Line_lineLight_messageapi_messageType_RepositoryMessage
		
					struct Line_lineLight_messageapi_messageType_RepositoryMessage * msg =
		
							(Line_lineLight_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct Line_lineLight_messageapi_messageType_RepositoryMessage));
		
					msg->_lineLight_value = stateChart->lineLight_apiValue;
		
					//send Message
		
					MW_sendMessage(
							MW_getTargetPortIDforIdentifier(
									stateChart->parentComponent->lineLightPort->ID),
							MESSAGE_LINE_LINELIGHT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE,
							msg);
		
					//printf("sent message of type %d",MESSAGE_LINE_LINELIGHT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					free(msg);
		
					// change the state
		
					stateChart->currentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
							ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE;
		
					// execute entry actions
		
					Clock_reset(
							stateChart->clockSending_ofcurrentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			default:
				break;
			}
		}
		
		void ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution_ApiExecutionStateChart_processStep(
		
		RootLineStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution_ApiExecution) {
		
			case ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECINITCOMMAND_STATE:
		
				if (1) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution_ApiExecution =
		
							ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE;
		
					// execute entry actions
		
					stateChart->lineLight_apiValue = stateChart->execApi();
		
					;
		
					Clock_reset(
		
							stateChart->_apiClock_ofcurrentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution_ApiExecutionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE:
		
				if (
		
				Clock_getTime(
		
						stateChart->_apiClock_ofcurrentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution_ApiExecutionClock)
		
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
		
					stateChart->currentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution_ApiExecution =
		
							ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE;
		
					// execute entry actions
		
					stateChart->lineLight_apiValue = stateChart->execApi();
		
					;
		
					Clock_reset(
		
							stateChart->_apiClock_ofcurrentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution_ApiExecutionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTLINE_LINE_STATE_STATE_Line_lineLight_behavior_Line_lineLight_behaviorStateChart_processStep(
				RootLineStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTLINE_LINE_STATE_STATE_Line_lineLight_behavior_Line_lineLight_behavior) {
			case ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE:
				// execute do action
				// nothing to do
		
				ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution_ApiExecutionStateChart_processStep(
						stateChart);
				ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		
		void RootLineStateChart_processStep(RootLineStateChart* stateChart) {
			switch (stateChart->currentStateOfRootLine) {
			case ROOTLINE_LINE_STATE_STATE:
				// execute do action
				// nothing to do
		
				ROOTLINE_LINE_STATE_STATE_Line_lineLight_behavior_Line_lineLight_behaviorStateChart_processStep(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		
		
		void ROOTLINE_LINE_STATE_STATE_Line_lineLight_behavior_Line_lineLight_behaviorStateChart_exit(
				RootLineStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTLINE_LINE_STATE_STATE_Line_lineLight_behavior_Line_lineLight_behavior) {
			case ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE:
				// nothing to do
		
				ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution_ApiExecutionStateChart_exit(
						stateChart);
				ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		void ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootLineStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution_ApiExecutionStateChart_exit(
				RootLineStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution_ApiExecution) {
			case ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECINITCOMMAND_STATE:
				// nothing to do
		
				break;
			case ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
				
			
		int_t RootLineStateChart_isInState(RootLineStateChart* stateChart,
				RootLineState state) {
			return (stateChart->currentStateOfROOTLINE_LINE_STATE_STATE_Line_lineLight_behavior_Line_lineLight_behavior
					== state
					|| stateChart->currentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
							== state
					|| stateChart->currentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution_ApiExecution
							== state);
		
		}
		
		bool_t RootLineStateChart_isTerminated(RootLineStateChart* stateChart) {
			//TODO
			return true;
		}
		



