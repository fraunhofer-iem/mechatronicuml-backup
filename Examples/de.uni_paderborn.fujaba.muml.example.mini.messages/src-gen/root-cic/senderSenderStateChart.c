
		////////////////////////////////////////////////////////////////////////////////
		// Includes
		////////////////////////////////////////////////////////////////////////////////
		#include "GlobalIdentifier.h"
		#include "senderSenderStateChart.h"
		


		////////////////////////////////////////////////////////////////////////////////
		// Initialization
		////////////////////////////////////////////////////////////////////////////////
		void initializeSenderOutSenderRoleRTSC_outRegion(
				SenderSenderStateChart* stateChart) {
			Clock_reset(stateChart->senderOutClockSenderOutSenderRoleRTSC_outClock);
		
			stateChart->currentStateOfSenderOutSenderRoleRTSC_out = STATE_SENDEROUTINIT;
		
			// execute entry actions
		
			Clock_reset(stateChart->senderOutClockSenderOutSenderRoleRTSC_outClock);
		
			stateChart->SenderOutSenderRoleRTSC_out_isExecutable = true;
		
		}
		
		void SenderSenderStateChart_initialize(SenderSenderStateChart* stateChart) {
		
			stateChart->currentStateOfSenderSender = STATE_SENDERSENDER_MAIN;
		
			// execute entry actions
		
			// nothing to do
		
			initializeSenderOutSenderRoleRTSC_outRegion(stateChart);
		}
		
		

		////////////////////////////////////////////////////////////////////////////////
		// Construction and destruction
		////////////////////////////////////////////////////////////////////////////////
		SenderSenderStateChart* SenderSenderStateChart_create(
				SenderComponent* parentComponent) {
			SenderSenderStateChart* stateChart = (SenderSenderStateChart*) malloc(
					sizeof(SenderSenderStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
				if (stateChart->parentComponent != NULL) {
					SenderSenderStateChart_initialize(stateChart);
				} else {
		
					SenderSenderStateChart_destroy(stateChart);
					stateChart = NULL;
				}
			} else {
		
			}
			return stateChart;
		}
		

			void SenderSenderStateChart_destroy(SenderSenderStateChart* stateChart) {
				if(stateChart != NULL) {
		
		
					free(stateChart);
				}
			}
	
		////////////////////////////////////////////////////////////////////////////////
		// Processing the statechart
		////////////////////////////////////////////////////////////////////////////////
	

		
		void SenderOutSenderRoleRTSC_outStateChart_processStep(
				SenderSenderStateChart* stateChart) {
			switch (stateChart->currentStateOfSenderOutSenderRoleRTSC_out) {
			case STATE_SENDEROUTINIT:
				if (Clock_getTime(
						stateChart->senderOutClockSenderOutSenderRoleRTSC_outClock)
						>= 1 * 1000.0
		
						) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//create new Parameter struct for M1MyMessageM1Message
		
					struct M1MyMessageM1Message * msg = (M1MyMessageM1Message*) malloc(
		
					sizeof(struct M1MyMessageM1Message));
		
					msg->_lightValue = 1;
		
					//send Message
		
					MW_sendMessage(
							MW_getTargetPortIDforIdentifier(
									stateChart->parentComponent->outPort->ID),
							MESSAGE_M1MYMESSAGEM1MESSAGE, msg);
		
		#ifdef DEBUG
		
					printDebugInformation("Sender sent message of type MESSAGE_M1MYMESSAGEM1MESSAGE");
		
		#endif		
		
					//release all created received events
		
					//release all created sent events
		
					free(msg);
		
					// change the state
		
					stateChart->currentStateOfSenderOutSenderRoleRTSC_out =
							STATE_SENDEROUTMESSAGESENT;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfSenderOutSenderRoleRTSC_out switched state to STATE_SENDEROUTMESSAGESENT" );
		
		#endif		
		
					// execute entry actions
		
					Clock_reset(
							stateChart->senderOutClockSenderOutSenderRoleRTSC_outClock);
		
				} else {
		
				}
				break;
			case STATE_SENDEROUTMESSAGESENT:
				if (
		
				Clock_getTime(
						stateChart->senderOutClockSenderOutSenderRoleRTSC_outClock)
						>= 1 * 1000.0
		
						) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//create new Parameter struct for M1MyMessageM1Message
		
					struct M1MyMessageM1Message * msg = (M1MyMessageM1Message*) malloc(
		
					sizeof(struct M1MyMessageM1Message));
		
					msg->_lightValue = 0;
		
					//send Message
		
					MW_sendMessage(
							MW_getTargetPortIDforIdentifier(
									stateChart->parentComponent->outPort->ID),
							MESSAGE_M1MYMESSAGEM1MESSAGE, msg);
		
		#ifdef DEBUG
		
					printDebugInformation("Sender sent message of type MESSAGE_M1MYMESSAGEM1MESSAGE");
		
		#endif		
		
					//release all created received events
		
					//release all created sent events
		
					free(msg);
		
					// change the state
		
					stateChart->currentStateOfSenderOutSenderRoleRTSC_out =
							STATE_SENDEROUTINIT;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfSenderOutSenderRoleRTSC_out switched state to STATE_SENDEROUTINIT" );
		
		#endif		
		
					// execute entry actions
		
					Clock_reset(
							stateChart->senderOutClockSenderOutSenderRoleRTSC_outClock);
		
				} else {
		
				}
				break;
			default:
				break;
			}
			stateChart->SenderOutSenderRoleRTSC_out_isExecutable = false;
		}
		
		void SenderSenderStateChart_processStep(SenderSenderStateChart* stateChart) {
			switch (stateChart->currentStateOfSenderSender) {
			case STATE_SENDERSENDER_MAIN:
		
				if (stateChart->SenderOutSenderRoleRTSC_out_isExecutable)
					SenderOutSenderRoleRTSC_outStateChart_processStep(stateChart);
		
				break;
			default:
				break;
			}
			stateChart->SenderSender_isExecutable = false;
		}
		
		
		void SenderOutSenderRoleRTSC_outStateChart_exit(
				SenderSenderStateChart* stateChart) {
			switch (stateChart->currentStateOfSenderOutSenderRoleRTSC_out) {
			case STATE_SENDEROUTINIT:
				// nothing to do
		
				break;
			case STATE_SENDEROUTMESSAGESENT:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
				
			
		bool_t SenderSenderStateChart_isInState(SenderSenderStateChart* stateChart,
				SenderSenderState state) {
			return (stateChart->currentStateOfSenderOutSenderRoleRTSC_out == state);
		
		}
		
		bool_t SenderSenderStateChart_isTerminated(SenderSenderStateChart* stateChart) {
			//TODO
			return true;
		}
		

