
		////////////////////////////////////////////////////////////////////////////////
		// Includes
		////////////////////////////////////////////////////////////////////////////////
		#include <stdio.h>
		#include <stdlib.h>
		#include "../GlobalIdentifier.h"
		#include "rootsectionControlRTSCStateChart.h"
		
		



		
		////////////////////////////////////////////////////////////////////////////////
		// Initialization
		////////////////////////////////////////////////////////////////////////////////
		void initializeROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakeePortRTSCRegion(
				RootsectionControlRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakeePortRTSC_sectionOvertakeePortRTSC =
					ROOTSECTIONCONTROLRTSC_INIT_STATE_SECTIONOVERTAKEEPORTRTSC_SECTIONOVERTAKEEPORTRTSC_INIT_STATE;
		
			// execute entry actions
			// nothing to do
		
		}
		void initializeROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakerPortRTSCRegion(
				RootsectionControlRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakerPortRTSC_sectionOvertakerPortRTSC =
					ROOTSECTIONCONTROLRTSC_INIT_STATE_SECTIONOVERTAKERPORTRTSC_SECTIONOVERTAKERPORTRTSC_INIT_STATE;
		
			// execute entry actions
		
			// nothing to do
		
		}
		void initializeROOTSECTIONCONTROLRTSC_INIT_STATE_sectionApproacherPortRTSCRegion(
				RootsectionControlRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_sectionApproacherPortRTSC_sectionApproacherPortRTSC =
					ROOTSECTIONCONTROLRTSC_INIT_STATE_SECTIONAPPROACHERPORTRTSC_SECTIONAPPROACHERPORTRTSC_INIT_STATE;
		
			// execute entry actions
		
			// nothing to do
		
		}
		void initializeROOTSECTIONCONTROLRTSC_INIT_STATE_controllerPortRTSCRegion(
				RootsectionControlRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_controllerPortRTSC_controllerPortRTSC =
					ROOTSECTIONCONTROLRTSC_INIT_STATE_CONTROLLERPORTRTSC_CONTROLLERPORTRTSC_INIT_STATE;
		
			// execute entry actions
		
			// nothing to do
		
		}
		
		void RootsectionControlRTSCStateChart_initialize(
				RootsectionControlRTSCStateChart* stateChart) {
		
			stateChart->secIDapproacher = 0;
			stateChart->secIDovertakee = 0;
			stateChart->constNumSecDifference = 2;
			stateChart->secIDovertaker = 0;
		
			stateChart->currentStateOfRootsectionControlRTSC =
					ROOTSECTIONCONTROLRTSC_INIT_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakeePortRTSCRegion(
					stateChart);
			initializeROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakerPortRTSCRegion(
					stateChart);
			initializeROOTSECTIONCONTROLRTSC_INIT_STATE_sectionApproacherPortRTSCRegion(
					stateChart);
			initializeROOTSECTIONCONTROLRTSC_INIT_STATE_controllerPortRTSCRegion(
					stateChart);
		}
		
		

		////////////////////////////////////////////////////////////////////////////////
		// Construction and destruction
		////////////////////////////////////////////////////////////////////////////////
		RootsectionControlRTSCStateChart* RootsectionControlRTSCStateChart_create(
				SectionControlComponent* parentComponent) {
			RootsectionControlRTSCStateChart* stateChart =
					(RootsectionControlRTSCStateChart*) malloc(
							sizeof(RootsectionControlRTSCStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
		
				/*
				 if (stateChart->parentComponent != NULL
				 ) {
				 RootsectionControlRTSCStateChart_initialize(stateChart);
				 } else {
				 fprintf(stderr, "Initialization of RootsectionControlRTSCStateChart failed\n");
		
				 RootsectionControlRTSCStateChart_destroy(stateChart);
				 stateChart = NULL;
				 }
				 } else {
				 fprintf(stderr, "Creation of RootsectionControlRTSCStateChart failed\n");
				 */}
			return stateChart;
		}
		

			void RootsectionControlRTSCStateChart_destroy(RootsectionControlRTSCStateChart* stateChart) {
				if(stateChart != NULL) {
		
					free(stateChart);
				}
			}
	
		////////////////////////////////////////////////////////////////////////////////
		// Processing the statechart
		////////////////////////////////////////////////////////////////////////////////
	
		

		
		void ROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakeePortRTSC_sectionOvertakeePortRTSCStateChart_processStep(
				RootsectionControlRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakeePortRTSC_sectionOvertakeePortRTSC) {
			case ROOTSECTIONCONTROLRTSC_INIT_STATE_SECTIONOVERTAKEEPORTRTSC_SECTIONOVERTAKEEPORTRTSC_INIT_STATE:
				if (Port_doesMessageExist(
						SectionControlComponent_getsectionOvertakeeP(
								stateChart->parentComponent),
						MESSAGE_CHANGEOVERTAKINGMESSAGESMESSAGE)
		
						) {
					MiddlewareMessage* mwMsg = Port_receiveMessage(
							SectionControlComponent_getsectionOvertakeeP(
									stateChart->parentComponent),
							MESSAGE_CHANGEOVERTAKINGMESSAGESMESSAGE);
		
					struct changeOvertakingMessagesMessage * msg =
							(changeOvertakingMessagesMessage*) malloc(
									sizeof(struct changeOvertakingMessagesMessage));
					changeOvertakingMessagesMessage_read_delimited_from(mwMsg->_mumlMsg,
							msg, 0);
					//printf("received message of type %d",mwMsg->_msgID );
					fflush (stdout);
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->secIDovertakee = msg->_secID;
		
					;
		
					// nothing to do			
		
					//release all created received events
					free(msg);
					free(mwMsg);
		
					//release all created sent events
					// change the state
					stateChart->currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakeePortRTSC_sectionOvertakeePortRTSC =
							ROOTSECTIONCONTROLRTSC_INIT_STATE_SECTIONOVERTAKEEPORTRTSC_SECTIONOVERTAKEEPORTRTSC_INIT_STATE;
		
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
		
		void ROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakerPortRTSC_sectionOvertakerPortRTSCStateChart_processStep(
		
		RootsectionControlRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakerPortRTSC_sectionOvertakerPortRTSC) {
		
			case ROOTSECTIONCONTROLRTSC_INIT_STATE_SECTIONOVERTAKERPORTRTSC_SECTIONOVERTAKERPORTRTSC_INIT_STATE:
		
				if (Port_doesMessageExist(
		
				SectionControlComponent_getsectionOvertakerP(
		
				stateChart->parentComponent),
		
				MESSAGE_CHANGEOVERTAKINGMESSAGESMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					SectionControlComponent_getsectionOvertakerP(
		
					stateChart->parentComponent),
		
					MESSAGE_CHANGEOVERTAKINGMESSAGESMESSAGE);
		
					struct changeOvertakingMessagesMessage * msg =
		
					(changeOvertakingMessagesMessage*) malloc(
		
					sizeof(struct changeOvertakingMessagesMessage));
		
					changeOvertakingMessagesMessage_read_delimited_from(mwMsg->_mumlMsg,
		
					msg, 0);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->secIDovertaker = msg->_secID;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakerPortRTSC_sectionOvertakerPortRTSC =
		
							ROOTSECTIONCONTROLRTSC_INIT_STATE_SECTIONOVERTAKERPORTRTSC_SECTIONOVERTAKERPORTRTSC_INIT_STATE;
		
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
		
		void ROOTSECTIONCONTROLRTSC_INIT_STATE_sectionApproacherPortRTSC_sectionApproacherPortRTSCStateChart_processStep(
		
		RootsectionControlRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_sectionApproacherPortRTSC_sectionApproacherPortRTSC) {
		
			case ROOTSECTIONCONTROLRTSC_INIT_STATE_SECTIONAPPROACHERPORTRTSC_SECTIONAPPROACHERPORTRTSC_INIT_STATE:
		
				if (Port_doesMessageExist(
		
				SectionControlComponent_getsectionApproacherP(
		
				stateChart->parentComponent),
		
				MESSAGE_CHANGEOVERTAKINGMESSAGESMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					SectionControlComponent_getsectionApproacherP(
		
					stateChart->parentComponent),
		
					MESSAGE_CHANGEOVERTAKINGMESSAGESMESSAGE);
		
					struct changeOvertakingMessagesMessage * msg =
		
					(changeOvertakingMessagesMessage*) malloc(
		
					sizeof(struct changeOvertakingMessagesMessage));
		
					changeOvertakingMessagesMessage_read_delimited_from(mwMsg->_mumlMsg,
		
					msg, 0);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->secIDapproacher = msg->_secID;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_sectionApproacherPortRTSC_sectionApproacherPortRTSC =
		
							ROOTSECTIONCONTROLRTSC_INIT_STATE_SECTIONAPPROACHERPORTRTSC_SECTIONAPPROACHERPORTRTSC_INIT_STATE;
		
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
		
		void ROOTSECTIONCONTROLRTSC_INIT_STATE_controllerPortRTSC_controllerPortRTSCStateChart_processStep(
		
		RootsectionControlRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_controllerPortRTSC_controllerPortRTSC) {
		
			case ROOTSECTIONCONTROLRTSC_INIT_STATE_CONTROLLERPORTRTSC_CONTROLLERPORTRTSC_INIT_STATE:
		
				if (Port_doesMessageExist(
		
				SectionControlComponent_getcontrollerP(
		
				stateChart->parentComponent),
		
				MESSAGE_OVERTAKEOVERTAKINGMESSAGESMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					SectionControlComponent_getcontrollerP(
		
					stateChart->parentComponent),
		
					MESSAGE_OVERTAKEOVERTAKINGMESSAGESMESSAGE);
		
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
		
					stateChart->currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_controllerPortRTSC_controllerPortRTSC =
		
							ROOTSECTIONCONTROLRTSC_INIT_STATE_CONTROLLERPORTRTSC_CONTROLLERPORTRTSC_REQUESTED_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTSECTIONCONTROLRTSC_INIT_STATE_CONTROLLERPORTRTSC_CONTROLLERPORTRTSC_REQUESTED_STATE:
		
				if (
		
				stateChart->secIDovertakee - stateChart->secIDapproacher
		
				<= stateChart->constNumSecDifference
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->controllerPPort->ID),
		
					MESSAGE_UNSAVEOVERTAKINGMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_UNSAVEOVERTAKINGMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_controllerPortRTSC_controllerPortRTSC =
		
							ROOTSECTIONCONTROLRTSC_INIT_STATE_CONTROLLERPORTRTSC_CONTROLLERPORTRTSC_INIT_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else if (
		
				stateChart->secIDovertakee - stateChart->secIDapproacher
		
				> stateChart->constNumSecDifference
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->controllerPPort->ID),
		
					MESSAGE_SAVEOVERTAKINGMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_SAVEOVERTAKINGMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_controllerPortRTSC_controllerPortRTSC =
		
							ROOTSECTIONCONTROLRTSC_INIT_STATE_CONTROLLERPORTRTSC_CONTROLLERPORTRTSC_INIT_STATE;
		
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
		
		void RootsectionControlRTSCStateChart_processStep(
				RootsectionControlRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfRootsectionControlRTSC) {
			case ROOTSECTIONCONTROLRTSC_INIT_STATE:
				// execute do action
				// nothing to do
		
				ROOTSECTIONCONTROLRTSC_INIT_STATE_controllerPortRTSC_controllerPortRTSCStateChart_processStep(
						stateChart);
				ROOTSECTIONCONTROLRTSC_INIT_STATE_sectionApproacherPortRTSC_sectionApproacherPortRTSCStateChart_processStep(
						stateChart);
				ROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakerPortRTSC_sectionOvertakerPortRTSCStateChart_processStep(
						stateChart);
				ROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakeePortRTSC_sectionOvertakeePortRTSCStateChart_processStep(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		
		
		void ROOTSECTIONCONTROLRTSC_INIT_STATE_controllerPortRTSC_controllerPortRTSCStateChart_exit(
				RootsectionControlRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_controllerPortRTSC_controllerPortRTSC) {
			case ROOTSECTIONCONTROLRTSC_INIT_STATE_CONTROLLERPORTRTSC_CONTROLLERPORTRTSC_INIT_STATE:
				// nothing to do
		
				break;
			case ROOTSECTIONCONTROLRTSC_INIT_STATE_CONTROLLERPORTRTSC_CONTROLLERPORTRTSC_REQUESTED_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTSECTIONCONTROLRTSC_INIT_STATE_sectionApproacherPortRTSC_sectionApproacherPortRTSCStateChart_exit(
				RootsectionControlRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_sectionApproacherPortRTSC_sectionApproacherPortRTSC) {
			case ROOTSECTIONCONTROLRTSC_INIT_STATE_SECTIONAPPROACHERPORTRTSC_SECTIONAPPROACHERPORTRTSC_INIT_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakerPortRTSC_sectionOvertakerPortRTSCStateChart_exit(
				RootsectionControlRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakerPortRTSC_sectionOvertakerPortRTSC) {
			case ROOTSECTIONCONTROLRTSC_INIT_STATE_SECTIONOVERTAKERPORTRTSC_SECTIONOVERTAKERPORTRTSC_INIT_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakeePortRTSC_sectionOvertakeePortRTSCStateChart_exit(
				RootsectionControlRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakeePortRTSC_sectionOvertakeePortRTSC) {
			case ROOTSECTIONCONTROLRTSC_INIT_STATE_SECTIONOVERTAKEEPORTRTSC_SECTIONOVERTAKEEPORTRTSC_INIT_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
				
			
		int_t RootsectionControlRTSCStateChart_isInState(
				RootsectionControlRTSCStateChart* stateChart,
				RootsectionControlRTSCState state) {
			return (stateChart->currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_controllerPortRTSC_controllerPortRTSC
					== state
					|| stateChart->currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_sectionApproacherPortRTSC_sectionApproacherPortRTSC
							== state
					|| stateChart->currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakerPortRTSC_sectionOvertakerPortRTSC
							== state
					|| stateChart->currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakeePortRTSC_sectionOvertakeePortRTSC
							== state);
		
		}
		
		bool_t RootsectionControlRTSCStateChart_isTerminated(
				RootsectionControlRTSCStateChart* stateChart) {
			//TODO
			return true;
		}
		



