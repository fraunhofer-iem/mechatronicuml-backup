
		////////////////////////////////////////////////////////////////////////////////
		// Includes
		////////////////////////////////////////////////////////////////////////////////
		#include <stdio.h>
		#include <stdlib.h>
		#include "../GlobalIdentifier.h"
		#include "rootCommunicatorCmpRTSCStateChart.h"
		
		



		
		////////////////////////////////////////////////////////////////////////////////
		// Initialization
		////////////////////////////////////////////////////////////////////////////////
		void initializeROOTCOMMUNICATORCMPRTSC_INIT_STATE_CommunicatorPortRTSCRegion(
				RootCommunicatorCmpRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTCOMMUNICATORCMPRTSC_INIT_STATE_CommunicatorPortRTSC_CommunicatorPortRTSC =
					ROOTCOMMUNICATORCMPRTSC_INIT_STATE_COMMUNICATORPORTRTSC_COMMUNICATORPORTRTSC_WAITSENDDELIVERYFLAG_STATE;
		
			// execute entry actions
			// nothing to do
		
		}
		void initializeROOTCOMMUNICATORCMPRTSC_INIT_STATE_PickUpPortRTSCRegion(
				RootCommunicatorCmpRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTCOMMUNICATORCMPRTSC_INIT_STATE_PickUpPortRTSC_PickUpPortRTSC =
					ROOTCOMMUNICATORCMPRTSC_INIT_STATE_PICKUPPORTRTSC_PICKUPPORTRTSC_WAITINITPICKUP_STATE;
		
			// execute entry actions
		
			stateChart->finishDeliveryFlag = false;
		
			;
		
		}
		
		void RootCommunicatorCmpRTSCStateChart_initialize(
				RootCommunicatorCmpRTSCStateChart* stateChart) {
		
			stateChart->sendDeliveryFlag = false;
			stateChart->finishDeliveryFlag = false;
		
			stateChart->currentStateOfRootCommunicatorCmpRTSC =
					ROOTCOMMUNICATORCMPRTSC_INIT_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTCOMMUNICATORCMPRTSC_INIT_STATE_CommunicatorPortRTSCRegion(
					stateChart);
			initializeROOTCOMMUNICATORCMPRTSC_INIT_STATE_PickUpPortRTSCRegion(
					stateChart);
		}
		
		

		////////////////////////////////////////////////////////////////////////////////
		// Construction and destruction
		////////////////////////////////////////////////////////////////////////////////
		RootCommunicatorCmpRTSCStateChart* RootCommunicatorCmpRTSCStateChart_create(
				CommunicatorComponent* parentComponent) {
			RootCommunicatorCmpRTSCStateChart* stateChart =
					(RootCommunicatorCmpRTSCStateChart*) malloc(
							sizeof(RootCommunicatorCmpRTSCStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
		
				/*
				 if (stateChart->parentComponent != NULL
				 ) {
				 RootCommunicatorCmpRTSCStateChart_initialize(stateChart);
				 } else {
				 fprintf(stderr, "Initialization of RootCommunicatorCmpRTSCStateChart failed\n");
		
				 RootCommunicatorCmpRTSCStateChart_destroy(stateChart);
				 stateChart = NULL;
				 }
				 } else {
				 fprintf(stderr, "Creation of RootCommunicatorCmpRTSCStateChart failed\n");
				 */}
			return stateChart;
		}
		

			void RootCommunicatorCmpRTSCStateChart_destroy(RootCommunicatorCmpRTSCStateChart* stateChart) {
				if(stateChart != NULL) {
		
					free(stateChart);
				}
			}
	
		////////////////////////////////////////////////////////////////////////////////
		// Processing the statechart
		////////////////////////////////////////////////////////////////////////////////
	
		

		
		void ROOTCOMMUNICATORCMPRTSC_INIT_STATE_CommunicatorPortRTSC_CommunicatorPortRTSCStateChart_processStep(
				RootCommunicatorCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTCOMMUNICATORCMPRTSC_INIT_STATE_CommunicatorPortRTSC_CommunicatorPortRTSC) {
			case ROOTCOMMUNICATORCMPRTSC_INIT_STATE_COMMUNICATORPORTRTSC_COMMUNICATORPORTRTSC_WAITSENDDELIVERYFLAG_STATE:
				if (
		
				stateChart->sendDeliveryFlag
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
							MW_getTargetPortIDforIdentifier(
									stateChart->parentComponent->communicatorPortPort->ID),
							MESSAGE_STARTDELIVERYDELIVERYMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_STARTDELIVERYDELIVERYMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTCOMMUNICATORCMPRTSC_INIT_STATE_CommunicatorPortRTSC_CommunicatorPortRTSC =
							ROOTCOMMUNICATORCMPRTSC_INIT_STATE_COMMUNICATORPORTRTSC_COMMUNICATORPORTRTSC_WAITFINISHDELIVERY_STATE;
		
					// execute entry actions
		
					stateChart->sendDeliveryFlag = false;
		
					;
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			case ROOTCOMMUNICATORCMPRTSC_INIT_STATE_COMMUNICATORPORTRTSC_COMMUNICATORPORTRTSC_WAITFINISHDELIVERY_STATE:
				if (Port_doesMessageExist(
						CommunicatorComponent_getCommunicatorPort(
								stateChart->parentComponent),
						MESSAGE_FINISHDELIVERYDELIVERYMESSAGESMESSAGE)
		
						) {
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
							CommunicatorComponent_getCommunicatorPort(
									stateChart->parentComponent),
		
							MESSAGE_FINISHDELIVERYDELIVERYMESSAGESMESSAGE);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->finishDeliveryFlag = true;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTCOMMUNICATORCMPRTSC_INIT_STATE_CommunicatorPortRTSC_CommunicatorPortRTSC =
							ROOTCOMMUNICATORCMPRTSC_INIT_STATE_COMMUNICATORPORTRTSC_COMMUNICATORPORTRTSC_WAITSENDDELIVERYFLAG_STATE;
		
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
		
		void ROOTCOMMUNICATORCMPRTSC_INIT_STATE_PickUpPortRTSC_PickUpPortRTSCStateChart_processStep(
		
		RootCommunicatorCmpRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTCOMMUNICATORCMPRTSC_INIT_STATE_PickUpPortRTSC_PickUpPortRTSC) {
		
			case ROOTCOMMUNICATORCMPRTSC_INIT_STATE_PICKUPPORTRTSC_PICKUPPORTRTSC_WAITINITPICKUP_STATE:
		
				if (Port_doesMessageExist(
		
				CommunicatorComponent_getPickUpPort(
		
				stateChart->parentComponent),
		
				MESSAGE_INITIATEDELIVERYDELIVERYMESSAGESMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					CommunicatorComponent_getPickUpPort(
		
					stateChart->parentComponent),
		
					MESSAGE_INITIATEDELIVERYDELIVERYMESSAGESMESSAGE);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->sendDeliveryFlag = true;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTCOMMUNICATORCMPRTSC_INIT_STATE_PickUpPortRTSC_PickUpPortRTSC =
		
							ROOTCOMMUNICATORCMPRTSC_INIT_STATE_PICKUPPORTRTSC_PICKUPPORTRTSC_INITPICKUPRECEIVED_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTCOMMUNICATORCMPRTSC_INIT_STATE_PICKUPPORTRTSC_PICKUPPORTRTSC_INITPICKUPRECEIVED_STATE:
		
				if (
		
				stateChart->finishDeliveryFlag
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->pickUpPortPort->ID),
		
					MESSAGE_FINISHEDDELIVERYDELIVERYMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_FINISHEDDELIVERYDELIVERYMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTCOMMUNICATORCMPRTSC_INIT_STATE_PickUpPortRTSC_PickUpPortRTSC =
		
							ROOTCOMMUNICATORCMPRTSC_INIT_STATE_PICKUPPORTRTSC_PICKUPPORTRTSC_WAITINITPICKUP_STATE;
		
					// execute entry actions
		
					stateChart->finishDeliveryFlag = false;
		
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
		
		void RootCommunicatorCmpRTSCStateChart_processStep(
				RootCommunicatorCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfRootCommunicatorCmpRTSC) {
			case ROOTCOMMUNICATORCMPRTSC_INIT_STATE:
				// execute do action
				// nothing to do
		
				ROOTCOMMUNICATORCMPRTSC_INIT_STATE_PickUpPortRTSC_PickUpPortRTSCStateChart_processStep(
						stateChart);
				ROOTCOMMUNICATORCMPRTSC_INIT_STATE_CommunicatorPortRTSC_CommunicatorPortRTSCStateChart_processStep(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		
		
		void ROOTCOMMUNICATORCMPRTSC_INIT_STATE_PickUpPortRTSC_PickUpPortRTSCStateChart_exit(
				RootCommunicatorCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTCOMMUNICATORCMPRTSC_INIT_STATE_PickUpPortRTSC_PickUpPortRTSC) {
			case ROOTCOMMUNICATORCMPRTSC_INIT_STATE_PICKUPPORTRTSC_PICKUPPORTRTSC_WAITINITPICKUP_STATE:
				// nothing to do
		
				break;
			case ROOTCOMMUNICATORCMPRTSC_INIT_STATE_PICKUPPORTRTSC_PICKUPPORTRTSC_INITPICKUPRECEIVED_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTCOMMUNICATORCMPRTSC_INIT_STATE_CommunicatorPortRTSC_CommunicatorPortRTSCStateChart_exit(
				RootCommunicatorCmpRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTCOMMUNICATORCMPRTSC_INIT_STATE_CommunicatorPortRTSC_CommunicatorPortRTSC) {
			case ROOTCOMMUNICATORCMPRTSC_INIT_STATE_COMMUNICATORPORTRTSC_COMMUNICATORPORTRTSC_WAITSENDDELIVERYFLAG_STATE:
				// nothing to do
		
				break;
			case ROOTCOMMUNICATORCMPRTSC_INIT_STATE_COMMUNICATORPORTRTSC_COMMUNICATORPORTRTSC_WAITFINISHDELIVERY_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
				
			
		int_t RootCommunicatorCmpRTSCStateChart_isInState(
				RootCommunicatorCmpRTSCStateChart* stateChart,
				RootCommunicatorCmpRTSCState state) {
			return (stateChart->currentStateOfROOTCOMMUNICATORCMPRTSC_INIT_STATE_PickUpPortRTSC_PickUpPortRTSC
					== state
					|| stateChart->currentStateOfROOTCOMMUNICATORCMPRTSC_INIT_STATE_CommunicatorPortRTSC_CommunicatorPortRTSC
							== state);
		
		}
		
		bool_t RootCommunicatorCmpRTSCStateChart_isTerminated(
				RootCommunicatorCmpRTSCStateChart* stateChart) {
			//TODO
			return true;
		}
		



