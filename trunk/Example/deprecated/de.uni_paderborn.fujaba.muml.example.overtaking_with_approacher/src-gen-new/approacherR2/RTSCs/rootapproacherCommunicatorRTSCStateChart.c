
		////////////////////////////////////////////////////////////////////////////////
		// Includes
		////////////////////////////////////////////////////////////////////////////////
		#include <stdio.h>
		#include <stdlib.h>
		#include "../GlobalIdentifier.h"
		#include "rootapproacherCommunicatorRTSCStateChart.h"
		
		



		
		////////////////////////////////////////////////////////////////////////////////
		// Initialization
		////////////////////////////////////////////////////////////////////////////////
		void initializeROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_vehicleApproacherPortRTSCRegion(
				RootapproacherCommunicatorRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_vehicleApproacherPortRTSC_vehicleApproacherPortRTSC =
					ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_VEHICLEAPPROACHERPORTRTSC_VEHICLEAPPROACHERPORTRTSC_INIT_STATE;
		
			// execute entry actions
			if (stateChart->currentSec == stateChart->colorApproacher_apiValue) {
				stateChart->change = false;
		
			}
				else if(stateChart->colorApproacher_apiValue == stateChart->constSecRed){
							//ecrobot_sound_tone(400,100,50);
						stateChart->change = true;
						stateChart->currentSec = stateChart->colorApproacher_apiValue;
						stateChart->secID = 1;
						
					}
					else if(stateChart->colorApproacher_apiValue == stateChart->constSecGreen){
						stateChart->change = true;
						stateChart->currentSec = stateChart->colorApproacher_apiValue;
						stateChart->secID = 2;
						
					}
					else if(stateChart->colorApproacher_apiValue == stateChart->constSecBlue){
						stateChart->change = true;
						stateChart->currentSec = stateChart->colorApproacher_apiValue;
						stateChart->secID = 3;
						
					}
					else if(stateChart->colorApproacher_apiValue == stateChart->constSecYellow){
						stateChart->change = true;
						stateChart->currentSec = stateChart->colorApproacher_apiValue;
						stateChart->secID = 4;
						
					}
		
			;
		
		}
		void initializeROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_limitDrivingPortRTSCRegion(
				RootapproacherCommunicatorRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_limitDrivingPortRTSC_limitDrivingPortRTSC =
					ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_LIMITDRIVINGPORTRTSC_LIMITDRIVINGPORTRTSC_FREE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
		}
		void initializeROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_informApproacherPortRTSCRegion(
				RootapproacherCommunicatorRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_informApproacherPortRTSC_informApproacherPortRTSC =
					ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_INFORMAPPROACHERPORTRTSC_INFORMAPPROACHERPORTRTSC_FREEDRIVE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
		}
		void initializeROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_approacherCommunicator_colorApproacher_behaviorRegion(
				RootapproacherCommunicatorRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_approacherCommunicator_colorApproacher_behavior_approacherCommunicator_colorApproacher_behavior =
					ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
		}
		void initializeROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootapproacherCommunicatorRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		
		void RootapproacherCommunicatorRTSCStateChart_initialize(
				RootapproacherCommunicatorRTSCStateChart* stateChart) {
		
			stateChart->constSecRed = 5;
			stateChart->constSecGreen = 2;
			stateChart->constSecBlue = 1;
			stateChart->constSecYellow = 3;
			stateChart->constSecOrange = 4;
			stateChart->change = false;
			stateChart->secID = 0;
			stateChart->currentSec = 0;
			stateChart->colorApproacher_apiValue = 0;
		
			stateChart->currentStateOfRootapproacherCommunicatorRTSC =
					ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_vehicleApproacherPortRTSCRegion(
					stateChart);
			initializeROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_limitDrivingPortRTSCRegion(
					stateChart);
			initializeROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_informApproacherPortRTSCRegion(
					stateChart);
			initializeROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_approacherCommunicator_colorApproacher_behaviorRegion(
					stateChart);
		}
		
		

		////////////////////////////////////////////////////////////////////////////////
		// Construction and destruction
		////////////////////////////////////////////////////////////////////////////////
		RootapproacherCommunicatorRTSCStateChart* RootapproacherCommunicatorRTSCStateChart_create(
				ApproacherCommunicatorComponent* parentComponent) {
			RootapproacherCommunicatorRTSCStateChart* stateChart =
					(RootapproacherCommunicatorRTSCStateChart*) malloc(
							sizeof(RootapproacherCommunicatorRTSCStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
		
				stateChart->unlimitSyncChannel = SyncChannel_create();
				stateChart->limitSyncChannel = SyncChannel_create();
				/*
				 if (stateChart->parentComponent != NULL
				 && stateChart->unlimitSyncChannel != NULL				
				 && stateChart->limitSyncChannel != NULL				
				 ) {
				 RootapproacherCommunicatorRTSCStateChart_initialize(stateChart);
				 } else {
				 fprintf(stderr, "Initialization of RootapproacherCommunicatorRTSCStateChart failed\n");
		
				 RootapproacherCommunicatorRTSCStateChart_destroy(stateChart);
				 stateChart = NULL;
				 }
				 } else {
				 fprintf(stderr, "Creation of RootapproacherCommunicatorRTSCStateChart failed\n");
				 */}
			return stateChart;
		}
		

			void RootapproacherCommunicatorRTSCStateChart_destroy(RootapproacherCommunicatorRTSCStateChart* stateChart) {
				if(stateChart != NULL) {
					SyncChannel_destroy(stateChart->unlimitSyncChannel);
					SyncChannel_destroy(stateChart->limitSyncChannel);
		
					free(stateChart);
				}
			}
	
		////////////////////////////////////////////////////////////////////////////////
		// Processing the statechart
		////////////////////////////////////////////////////////////////////////////////
	
		static void verifySyncChannelsOfinit(
				RootapproacherCommunicatorRTSCStateChart* stateChart) {
			// limit synchronization channel
			if (stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_informApproacherPortRTSC_informApproacherPortRTSC
					== ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_INFORMAPPROACHERPORTRTSC_INFORMAPPROACHERPORTRTSC_FREEDRIVE_STATE
					&& Port_doesMessageExist(
							ApproacherCommunicatorComponent_getinformApproacherP(
									stateChart->parentComponent),
							MESSAGE_STARTEDOOVERTAKINGMESSAGESMESSAGE)
		
							) {
				SyncChannel_enableSend(stateChart->limitSyncChannel);
			}
			if (stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_limitDrivingPortRTSC_limitDrivingPortRTSC
					== ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_LIMITDRIVINGPORTRTSC_LIMITDRIVINGPORTRTSC_FREE_STATE
		
					) {
				SyncChannel_enableReceive(stateChart->limitSyncChannel);
			}
			// unlimit synchronization channel
			if (stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_informApproacherPortRTSC_informApproacherPortRTSC
					== ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_INFORMAPPROACHERPORTRTSC_INFORMAPPROACHERPORTRTSC_FIXDRIVE_STATE
					&& Port_doesMessageExist(
							ApproacherCommunicatorComponent_getinformApproacherP(
									stateChart->parentComponent),
							MESSAGE_FINISHEDOOVERTAKINGMESSAGESMESSAGE)
		
							) {
				SyncChannel_enableSend(stateChart->unlimitSyncChannel);
			}
			if (stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_limitDrivingPortRTSC_limitDrivingPortRTSC
					== ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_LIMITDRIVINGPORTRTSC_LIMITDRIVINGPORTRTSC_FIX_STATE
		
					) {
				SyncChannel_enableReceive(stateChart->unlimitSyncChannel);
			}
		}
		

		
		void ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_vehicleApproacherPortRTSC_vehicleApproacherPortRTSCStateChart_processStep(
				RootapproacherCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_vehicleApproacherPortRTSC_vehicleApproacherPortRTSC) {
			case ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_VEHICLEAPPROACHERPORTRTSC_VEHICLEAPPROACHERPORTRTSC_INIT_STATE:
				if (
		
				stateChart->change
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_vehicleApproacherPortRTSC_vehicleApproacherPortRTSC =
							ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_VEHICLEAPPROACHERPORTRTSC_VEHICLEAPPROACHERPORTRTSC_CHANGEDSECTION_STATE;
		
					// execute entry actions
		
					stateChart->change = false;
		
					;
		
				} else if (1
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_vehicleApproacherPortRTSC_vehicleApproacherPortRTSC =
							ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_VEHICLEAPPROACHERPORTRTSC_VEHICLEAPPROACHERPORTRTSC_INIT_STATE;
		
					// execute entry actions
		
					if (stateChart->currentSec
							== stateChart->colorApproacher_apiValue) {
		
						stateChart->change = false;
		
					}
					else if(stateChart->colorApproacher_apiValue == stateChart->constSecRed){
							//ecrobot_sound_tone(400,100,50);
						stateChart->change = true;
						stateChart->currentSec = stateChart->colorApproacher_apiValue;
						stateChart->secID = 1;
						display_goto_xy(0,2);
				 		display_string("red   ");
				 		display_update();
					}
					else if(stateChart->colorApproacher_apiValue == stateChart->constSecGreen){
						stateChart->change = true;
						stateChart->currentSec = stateChart->colorApproacher_apiValue;
						stateChart->secID = 2;
						display_goto_xy(0,2);
				 		display_string("green ");
				 		display_update();
					}
					else if(stateChart->colorApproacher_apiValue == stateChart->constSecBlue){
						stateChart->change = true;
						stateChart->currentSec = stateChart->colorApproacher_apiValue;
						stateChart->secID = 3;
						display_goto_xy(0,2);
				 		display_string("blue  ");
				 		display_update();
					}
					else if(stateChart->colorApproacher_apiValue == stateChart->constSecYellow){
						stateChart->change = true;
						stateChart->currentSec = stateChart->colorApproacher_apiValue;
						stateChart->secID = 4;
						display_goto_xy(0,2);
				 		display_string("yellow");
				 		display_update();
					}
		
					;
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			case ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_VEHICLEAPPROACHERPORTRTSC_VEHICLEAPPROACHERPORTRTSC_CHANGEDSECTION_STATE:
				if (1
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//create new Parameter struct for changeOvertakingMessagesMessage
		
					struct changeOvertakingMessagesMessage * msg =
		
					(changeOvertakingMessagesMessage*) malloc(
		
					sizeof(struct changeOvertakingMessagesMessage));
		
					msg->_secID = stateChart->secID;
		
					//send Message
		
					MW_sendMessage(
							MW_getTargetPortIDforIdentifier(
									stateChart->parentComponent->vehicleApproacherPPort->ID),
							MESSAGE_CHANGEOVERTAKINGMESSAGESMESSAGE, msg);
		
					//printf("sent message of type %d",MESSAGE_CHANGEOVERTAKINGMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					free(msg);
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_vehicleApproacherPortRTSC_vehicleApproacherPortRTSC =
							ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_VEHICLEAPPROACHERPORTRTSC_VEHICLEAPPROACHERPORTRTSC_INIT_STATE;
		
					// execute entry actions
		
					if (stateChart->currentSec
							== stateChart->colorApproacher_apiValue) {
		
						stateChart->change = false;
		
					}
		
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
		
		void ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_limitDrivingPortRTSC_limitDrivingPortRTSCStateChart_processStep(
		
		RootapproacherCommunicatorRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_limitDrivingPortRTSC_limitDrivingPortRTSC) {
		
			case ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_LIMITDRIVINGPORTRTSC_LIMITDRIVINGPORTRTSC_FREE_STATE:
		
				if (SyncChannel_receive((SyncChannel*) stateChart->limitSyncChannel)) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->limitDrivingPPort->ID),
		
					MESSAGE_FIXVELOCITYOVERTAKINGMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_FIXVELOCITYOVERTAKINGMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_limitDrivingPortRTSC_limitDrivingPortRTSC =
		
							ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_LIMITDRIVINGPORTRTSC_LIMITDRIVINGPORTRTSC_FIX_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_LIMITDRIVINGPORTRTSC_LIMITDRIVINGPORTRTSC_FIX_STATE:
		
				if (SyncChannel_receive((SyncChannel*) stateChart->unlimitSyncChannel)
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->limitDrivingPPort->ID),
		
					MESSAGE_FREEVELOCITYOVERTAKINGMESSAGESMESSAGE, NULL);
		
					//printf("sent message of type %d",MESSAGE_FREEVELOCITYOVERTAKINGMESSAGESMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_limitDrivingPortRTSC_limitDrivingPortRTSC =
		
							ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_LIMITDRIVINGPORTRTSC_LIMITDRIVINGPORTRTSC_FREE_STATE;
		
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
		
		void ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_informApproacherPortRTSC_informApproacherPortRTSCStateChart_processStep(
		
		RootapproacherCommunicatorRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_informApproacherPortRTSC_informApproacherPortRTSC) {
		
			case ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_INFORMAPPROACHERPORTRTSC_INFORMAPPROACHERPORTRTSC_FREEDRIVE_STATE:
		
				if (SyncChannel_send((SyncChannel*) stateChart->limitSyncChannel)) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					ApproacherCommunicatorComponent_getinformApproacherP(
		
					stateChart->parentComponent),
		
					MESSAGE_STARTEDOOVERTAKINGMESSAGESMESSAGE);
		
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
		
					stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_informApproacherPortRTSC_informApproacherPortRTSC =
		
							ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_INFORMAPPROACHERPORTRTSC_INFORMAPPROACHERPORTRTSC_FIXDRIVE_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_INFORMAPPROACHERPORTRTSC_INFORMAPPROACHERPORTRTSC_FIXDRIVE_STATE:
		
				if (SyncChannel_send((SyncChannel*) stateChart->unlimitSyncChannel)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					ApproacherCommunicatorComponent_getinformApproacherP(
		
					stateChart->parentComponent),
		
					MESSAGE_FINISHEDOOVERTAKINGMESSAGESMESSAGE);
		
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
		
					stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_informApproacherPortRTSC_informApproacherPortRTSC =
		
							ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_INFORMAPPROACHERPORTRTSC_INFORMAPPROACHERPORTRTSC_FREEDRIVE_STATE;
		
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
		
		void ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
		RootapproacherCommunicatorRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
		
			case ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
		
				if (Port_doesMessageExist(
		
				ApproacherCommunicatorComponent_getcolorApproacher(
		
				stateChart->parentComponent),
		
				MESSAGE_COLOR_COLOR_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg =
		
					Port_receiveMessage(
		
					ApproacherCommunicatorComponent_getcolorApproacher(
		
					stateChart->parentComponent),
		
					MESSAGE_COLOR_COLOR_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE);
		
					struct Color_color_messageapi_messageType_RepositoryMessage * msg =
		
							(Color_color_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct Color_color_messageapi_messageType_RepositoryMessage));
		
					Color_color_messageapi_messageType_RepositoryMessage_read_delimited_from(
		
					mwMsg->_mumlMsg, msg, 0);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->colorApproacher_apiValue = msg->_color_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else if (
		
				Clock_getTime(
		
						stateChart->receiverTimeout_ofcurrentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
		
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
		
					stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
		
				if (Port_doesMessageExist(
		
				ApproacherCommunicatorComponent_getcolorApproacher(
		
				stateChart->parentComponent),
		
				MESSAGE_COLOR_COLOR_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					ApproacherCommunicatorComponent_getcolorApproacher(
		
					stateChart->parentComponent),
		
					MESSAGE_COLOR_COLOR_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE);
		
					struct Color_color_messageapi_messageType_RepositoryMessage * msg =
		
							(Color_color_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct Color_color_messageapi_messageType_RepositoryMessage));
		
					Color_color_messageapi_messageType_RepositoryMessage_read_delimited_from(
		
					mwMsg->_mumlMsg, msg, 0);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->colorApproacher_apiValue = msg->_color_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_approacherCommunicator_colorApproacher_behavior_approacherCommunicator_colorApproacher_behaviorStateChart_processStep(
		
		RootapproacherCommunicatorRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_approacherCommunicator_colorApproacher_behavior_approacherCommunicator_colorApproacher_behavior) {
		
			case ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE:
		
				// execute do action
		
				// nothing to do
		
				ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
				stateChart);
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void RootapproacherCommunicatorRTSCStateChart_processStep(
				RootapproacherCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfRootapproacherCommunicatorRTSC) {
			case ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE:
				// execute do action
				// nothing to do
		
				verifySyncChannelsOfinit(stateChart);
		
				ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_approacherCommunicator_colorApproacher_behavior_approacherCommunicator_colorApproacher_behaviorStateChart_processStep(
						stateChart);
				ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_informApproacherPortRTSC_informApproacherPortRTSCStateChart_processStep(
						stateChart);
				ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_limitDrivingPortRTSC_limitDrivingPortRTSCStateChart_processStep(
						stateChart);
				ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_vehicleApproacherPortRTSC_vehicleApproacherPortRTSCStateChart_processStep(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		
		
		void ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_limitDrivingPortRTSC_limitDrivingPortRTSCStateChart_exit(
				RootapproacherCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_limitDrivingPortRTSC_limitDrivingPortRTSC) {
			case ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_LIMITDRIVINGPORTRTSC_LIMITDRIVINGPORTRTSC_FREE_STATE:
				// nothing to do
		
				break;
			case ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_LIMITDRIVINGPORTRTSC_LIMITDRIVINGPORTRTSC_FIX_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_approacherCommunicator_colorApproacher_behavior_approacherCommunicator_colorApproacher_behaviorStateChart_exit(
				RootapproacherCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_approacherCommunicator_colorApproacher_behavior_approacherCommunicator_colorApproacher_behavior) {
			case ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE:
				// nothing to do
		
				ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		void ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_informApproacherPortRTSC_informApproacherPortRTSCStateChart_exit(
				RootapproacherCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_informApproacherPortRTSC_informApproacherPortRTSC) {
			case ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_INFORMAPPROACHERPORTRTSC_INFORMAPPROACHERPORTRTSC_FREEDRIVE_STATE:
				// nothing to do
		
				break;
			case ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_INFORMAPPROACHERPORTRTSC_INFORMAPPROACHERPORTRTSC_FIXDRIVE_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootapproacherCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
				// nothing to do
		
				break;
			case ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_vehicleApproacherPortRTSC_vehicleApproacherPortRTSCStateChart_exit(
				RootapproacherCommunicatorRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_vehicleApproacherPortRTSC_vehicleApproacherPortRTSC) {
			case ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_VEHICLEAPPROACHERPORTRTSC_VEHICLEAPPROACHERPORTRTSC_INIT_STATE:
				// nothing to do
		
				break;
			case ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_VEHICLEAPPROACHERPORTRTSC_VEHICLEAPPROACHERPORTRTSC_CHANGEDSECTION_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
				
			
		int_t RootapproacherCommunicatorRTSCStateChart_isInState(
				RootapproacherCommunicatorRTSCStateChart* stateChart,
				RootapproacherCommunicatorRTSCState state) {
			return (stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_limitDrivingPortRTSC_limitDrivingPortRTSC
					== state
					|| stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_approacherCommunicator_colorApproacher_behavior_approacherCommunicator_colorApproacher_behavior
							== state
					|| stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_informApproacherPortRTSC_informApproacherPortRTSC
							== state
					|| stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
							== state
					|| stateChart->currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_vehicleApproacherPortRTSC_vehicleApproacherPortRTSC
							== state);
		
		}
		
		bool_t RootapproacherCommunicatorRTSCStateChart_isTerminated(
				RootapproacherCommunicatorRTSCStateChart* stateChart) {
			//TODO
			return true;
		}
		



