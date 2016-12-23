
		////////////////////////////////////////////////////////////////////////////////
		// Includes
		////////////////////////////////////////////////////////////////////////////////
		#include <stdio.h>
		#include <stdlib.h>
		#include "../GlobalIdentifier.h"
		#include "rootPickUpBotCmpRTSCStateChart.h"
		
		



		
		////////////////////////////////////////////////////////////////////////////////
		// Initialization
		////////////////////////////////////////////////////////////////////////////////
		void initializeROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSCRegion(
				RootPickUpBotCmpRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSC_PickUpBotPortRTSC =
					ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_STOCKTOPLATE_STATE;
		
			// execute entry actions
			// nothing to do
		
		}
		
		void RootPickUpBotCmpRTSCStateChart_initialize(
				RootPickUpBotCmpRTSCStateChart* stateChart) {
			Clock_reset(stateChart->c_ofcurrentStateOfRootPickUpBotCmpRTSCClock);
		
			stateChart->currentStateOfRootPickUpBotCmpRTSC =
					ROOTPICKUPBOTCMPRTSC_INIT_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSCRegion(
					stateChart);
		}
		
		

		////////////////////////////////////////////////////////////////////////////////
		// Construction and destruction
		////////////////////////////////////////////////////////////////////////////////
		RootPickUpBotCmpRTSCStateChart* RootPickUpBotCmpRTSCStateChart_create(
				PickUpBotComponent* parentComponent) {
			RootPickUpBotCmpRTSCStateChart* stateChart =
					(RootPickUpBotCmpRTSCStateChart*) malloc(
							sizeof(RootPickUpBotCmpRTSCStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
		
				/*
				 if (stateChart->parentComponent != NULL
				 ) {
				 RootPickUpBotCmpRTSCStateChart_initialize(stateChart);
				 } else {
				 fprintf(stderr, "Initialization of RootPickUpBotCmpRTSCStateChart failed\n");
		
				 RootPickUpBotCmpRTSCStateChart_destroy(stateChart);
				 stateChart = NULL;
				 }
				 } else {
				 fprintf(stderr, "Creation of RootPickUpBotCmpRTSCStateChart failed\n");
				 */}
			return stateChart;
		}
		

			void RootPickUpBotCmpRTSCStateChart_destroy(RootPickUpBotCmpRTSCStateChart* stateChart) {
				if(stateChart != NULL) {
		
					free(stateChart);
				}
			}
	
		////////////////////////////////////////////////////////////////////////////////
		// Processing the statechart
		////////////////////////////////////////////////////////////////////////////////
	
		

		
		void ROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSC_PickUpBotPortRTSCStateChart_processStep(
				RootPickUpBotCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSC_PickUpBotPortRTSC) {
			case ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_STOCKTOPLATE_STATE:
				if (Port_doesMessageExist(
						PickUpBotComponent_getPickUpBotPort(
								stateChart->parentComponent),
						MESSAGE_STARTDELIVERYDELIVERYMESSAGESMESSAGE)
		
						) {
					MiddlewareMessage* mwMsg = Port_receiveMessage(
							PickUpBotComponent_getPickUpBotPort(
									stateChart->parentComponent),
							MESSAGE_STARTDELIVERYDELIVERYMESSAGESMESSAGE);
		
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
					stateChart->currentStateOfROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSC_PickUpBotPortRTSC =
							ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_READY2UNLOAD_STATE;
		
					// execute entry actions
		
					Clock_reset(
							stateChart->c_ofcurrentStateOfRootPickUpBotCmpRTSCClock);
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			case ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_READY2UNLOAD_STATE:
				if (1
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSC_PickUpBotPortRTSC =
							ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_UNLOADING_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			case ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_UNLOADING_STATE:
				if (
		
				Clock_getTime(stateChart->c_ofcurrentStateOfRootPickUpBotCmpRTSCClock)
						> 3 * 1000.0
		
						) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSC_PickUpBotPortRTSC =
							ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_UNLOADED_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			case ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_UNLOADED_STATE:
				if (
		
				Clock_getTime(stateChart->c_ofcurrentStateOfRootPickUpBotCmpRTSCClock)
						> 5 * 1000.0
		
						) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSC_PickUpBotPortRTSC =
							ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_MOVEAWAY_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			case ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_MOVEAWAY_STATE:
				if (1
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
							MW_getTargetPortIDforIdentifier(
									stateChart->parentComponent->pickUpBotPortPort->ID),
							MESSAGE_FINISHDELIVERYDELIVERYMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_FINISHDELIVERYDELIVERYMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSC_PickUpBotPortRTSC =
							ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_STOCKTOPLATE_STATE;
		
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
		
		void RootPickUpBotCmpRTSCStateChart_processStep(
				RootPickUpBotCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfRootPickUpBotCmpRTSC) {
			case ROOTPICKUPBOTCMPRTSC_INIT_STATE:
				// execute do action
				// nothing to do
		
				ROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSC_PickUpBotPortRTSCStateChart_processStep(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		
		
		void ROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSC_PickUpBotPortRTSCStateChart_exit(
				RootPickUpBotCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSC_PickUpBotPortRTSC) {
			case ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_STOCKTOPLATE_STATE:
				// nothing to do
		
				break;
			case ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_READY2UNLOAD_STATE:
				// nothing to do
		
				break;
			case ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_UNLOADING_STATE:
				// nothing to do
		
				break;
			case ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_UNLOADED_STATE:
				// nothing to do
		
				break;
			case ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_MOVEAWAY_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
				
			
		int_t RootPickUpBotCmpRTSCStateChart_isInState(
				RootPickUpBotCmpRTSCStateChart* stateChart,
				RootPickUpBotCmpRTSCState state) {
			return (stateChart->currentStateOfROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSC_PickUpBotPortRTSC
					== state);
		
		}
		
		bool_t RootPickUpBotCmpRTSCStateChart_isTerminated(
				RootPickUpBotCmpRTSCStateChart* stateChart) {
			//TODO
			return true;
		}
		



