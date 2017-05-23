

		#include "../components/receiverComponent_Interface.h"
		



		void initializeReceiverInReceiverRoleRTSC_inRegion(
				ReceiverReceiverStateChart* stateChart) {
		
			stateChart->currentStateOfReceiverInReceiverRoleRTSC_in =
					STATE_RECEIVERININIT;
		
			stateChart->ReceiverInReceiverRoleRTSC_in_isExecutable = true;
		
		}
		
		void ReceiverReceiverStateChart_initialize(
				ReceiverReceiverStateChart* stateChart) {
			//initialize clocks
		
			//initialize hybrid ports
			stateChart->LED = 0;
		
			//initialize variables of the root statechart
		
			//initialize init state
			stateChart->currentStateOfReceiverReceiver = STATE_RECEIVERRECEIVER_MAIN;
		
			initializeReceiverInReceiverRoleRTSC_inRegion(stateChart);
		}
		
		

		ReceiverReceiverStateChart* ReceiverReceiverStateChart_create(
				ReceiverComponent* parentComponent) {
			ReceiverReceiverStateChart* stateChart =
					(ReceiverReceiverStateChart*) malloc(
							sizeof(ReceiverReceiverStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
				if (stateChart->parentComponent != NULL) {
					ReceiverReceiverStateChart_initialize(stateChart);
				} else {
		
					ReceiverReceiverStateChart_destroy(stateChart);
					stateChart = NULL;
				}
			} else {
		
			}
			return stateChart;
		}
		

			void ReceiverReceiverStateChart_destroy(ReceiverReceiverStateChart* stateChart) {
				if(stateChart != NULL) {
		
		
					free(stateChart);
				}
			}


		
		void ReceiverInReceiverRoleRTSC_inStateChart_processStep(
				ReceiverReceiverStateChart* stateChart) {
			switch (stateChart->currentStateOfReceiverInReceiverRoleRTSC_in) {
			case STATE_RECEIVERININIT:
				if (Port_doesMessageExist(
						ReceiverComponent_getin(stateChart->parentComponent),
						MESSAGE_M1MYMESSAGEM1MESSAGE)
		
						) {
					MiddlewareMessage* mwMsg = Port_receiveMessage(
							ReceiverComponent_getin(stateChart->parentComponent),
							MESSAGE_M1MYMESSAGEM1MESSAGE);
		
					struct M1MyMessageM1Message * msg = (M1MyMessageM1Message*) malloc(
							sizeof(struct M1MyMessageM1Message));
					M1MyMessageM1Message_read_delimited_from(mwMsg->_mumlMsg, msg, 0);
		#ifdef DEBUG
					printDebugInformation("Receiver received message of typeM1MyMessageM1Message");
		#endif
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->LED = msg->_lightValue;
		
					;
		
					// nothing to do			
		
					//release all created received events
					free(msg);
					free(mwMsg);
		
					//release all created sent events
					// change the state
					stateChart->currentStateOfReceiverInReceiverRoleRTSC_in =
							STATE_RECEIVERININIT;
		#ifdef DEBUG
					printDebugInformation("currentStateOfReceiverInReceiverRoleRTSC_in switched state to STATE_RECEIVERININIT" );
		#endif		
		
					// execute entry actions
		
					// nothing to do
		
					//
				} else {
		
				}
				break;
			default:
				break;
			}
			stateChart->ReceiverInReceiverRoleRTSC_in_isExecutable = false;
		}
		
		void ReceiverReceiverStateChart_processStep(
				ReceiverReceiverStateChart* stateChart) {
			switch (stateChart->currentStateOfReceiverReceiver) {
			case STATE_RECEIVERRECEIVER_MAIN:
		
				if (stateChart->ReceiverInReceiverRoleRTSC_in_isExecutable)
					ReceiverInReceiverRoleRTSC_inStateChart_processStep(stateChart);
		
				break;
			default:
				break;
			}
			stateChart->ReceiverReceiver_isExecutable = false;
		}
		
		
		void ReceiverInReceiverRoleRTSC_inStateChart_exit(
				ReceiverReceiverStateChart* stateChart) {
			switch (stateChart->currentStateOfReceiverInReceiverRoleRTSC_in) {
			case STATE_RECEIVERININIT:
				// nothing to do
		
				break;
			default:
				break;
			}
			stateChart->currentStateOfReceiverInReceiverRoleRTSC_in =
					RECEIVERRECEIVER_INACTIVE;
		}
				
			
		bool_t ReceiverReceiverStateChart_isInState(
				ReceiverReceiverStateChart* stateChart, ReceiverReceiverState state) {
			return (stateChart->currentStateOfReceiverInReceiverRoleRTSC_in == state);
		
		}
		

		//implementations for RTSC internal operations
		
		

