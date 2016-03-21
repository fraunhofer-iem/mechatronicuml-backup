

		#include "../components/productionStationComponent_Interface.h"
		



		void initializeProductionStationGetOrderParameterizedGetOrderRTSCRegion(
				ProductionStationPorductionStationRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->productionStationGetOrderProcessingTimeProductionStationGetOrderParameterizedGetOrderRTSCClock);
		
			stateChart->amount = -1;
		
			stateChart->processedOrderID = -1;
		
			stateChart->incomingOrderPsID = stateChart->incomingOrderPsID = 0;
			;
		
			stateChart->incredientID = -1;
		
			stateChart->evaluateOrderFailed = false;
		
			stateChart->currentStateOfProductionStationGetOrderParameterizedGetOrderRTSC =
					STATE_PRODUCTIONSTATIONGETORDERINIT;
		
			// execute entry actions
			// nothing to do
		
			stateChart->ProductionStationGetOrderParameterizedGetOrderRTSC_isExecutable =
					true;
		
		}
		
		void ProductionStationPorductionStationRTSCStateChart_initialize(
				ProductionStationPorductionStationRTSCStateChart* stateChart) {
			//initialize clocks
		
			//initialize hybrid ports
		
			//initialize variables of the root statechart
			stateChart->ID = -1;
		
			//initialize init state
			stateChart->currentStateOfProductionStationPorductionStationRTSC =
					STATE_PRODUCTIONSTATIONINIT;
		
			// execute entry actions
		
			// nothing to do
		
			initializeProductionStationGetOrderParameterizedGetOrderRTSCRegion(
					stateChart);
		}
		
		

		ProductionStationPorductionStationRTSCStateChart* ProductionStationPorductionStationRTSCStateChart_create(
				ProductionStationComponent* parentComponent) {
			ProductionStationPorductionStationRTSCStateChart* stateChart =
					(ProductionStationPorductionStationRTSCStateChart*) malloc(
							sizeof(ProductionStationPorductionStationRTSCStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
				if (stateChart->parentComponent != NULL) {
					ProductionStationPorductionStationRTSCStateChart_initialize(
							stateChart);
				} else {
		
					ProductionStationPorductionStationRTSCStateChart_destroy(
							stateChart);
					stateChart = NULL;
				}
			} else {
		
			}
			return stateChart;
		}
		

			void ProductionStationPorductionStationRTSCStateChart_destroy(ProductionStationPorductionStationRTSCStateChart* stateChart) {
				if(stateChart != NULL) {
		
		
					free(stateChart);
				}
			}


		
		void ProductionStationGetOrderParameterizedGetOrderRTSCStateChart_processStep(
				ProductionStationPorductionStationRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfProductionStationGetOrderParameterizedGetOrderRTSC) {
			case STATE_PRODUCTIONSTATIONGETORDERINIT:
				if (1
		
				) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->ID = IDManagement_iDManagementGetID();
					;
		
					;
		
					// nothing to do			
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfProductionStationGetOrderParameterizedGetOrderRTSC =
							STATE_PRODUCTIONSTATIONGETORDERIDLE;
		#ifdef DEBUG
					printDebugInformation("currentStateOfProductionStationGetOrderParameterizedGetOrderRTSC switched state to STATE_PRODUCTIONSTATIONGETORDERIDLE" );
		#endif		
		
					// execute entry actions
		
					stateChart->amount = -1;
		
					stateChart->incredientID = -1;
		
					stateChart->processedOrderID = -1;
		
					stateChart->incomingOrderPsID = -1;
		
					;
		
					Clock_reset(
							stateChart->productionStationGetOrderProcessingTimeProductionStationGetOrderParameterizedGetOrderRTSCClock);
		
				} else {
		
				}
				break;
			case STATE_PRODUCTIONSTATIONGETORDERIDLE:
				if (
		
				Clock_getTime(
						stateChart->productionStationGetOrderProcessingTimeProductionStationGetOrderParameterizedGetOrderRTSCClock)
						>= 500 * 1.0
		
						) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->evaluateOrderFailed = false;
		
					;
		
					//create new Parameter struct for MessagesGetOrderMessagesMessage
		
					struct MessagesGetOrderMessagesMessage * msg =
		
					(MessagesGetOrderMessagesMessage*) malloc(
		
					sizeof(struct MessagesGetOrderMessagesMessage));
		
					msg->_psID = stateChart->ID;
		
					//send Message
		
					MW_sendMessage(
							MW_getTargetPortIDforIdentifier(
									stateChart->parentComponent->getOrderPort->ID),
							MESSAGE_MESSAGESGETORDERMESSAGESMESSAGE, msg);
		
		#ifdef DEBUG
		
					printDebugInformation("ProductionStation sent message of type MESSAGE_MESSAGESGETORDERMESSAGESMESSAGE");
		
		#endif		
		
					//release all created received events
		
					//release all created sent events
		
					free(msg);
		
					// change the state
		
					stateChart->currentStateOfProductionStationGetOrderParameterizedGetOrderRTSC =
							STATE_PRODUCTIONSTATIONGETORDEREVALUATEORDER;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfProductionStationGetOrderParameterizedGetOrderRTSC switched state to STATE_PRODUCTIONSTATIONGETORDEREVALUATEORDER" );
		
		#endif		
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
				}
				break;
			case STATE_PRODUCTIONSTATIONGETORDEREVALUATEORDER:
				if (Port_doesMessageExist(
						ProductionStationComponent_getgetOrder(
								stateChart->parentComponent),
						MESSAGE_MESSAGESNOORDERMESSAGESMESSAGE)
		
						) {
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					ProductionStationComponent_getgetOrder(stateChart->parentComponent),
		
					MESSAGE_MESSAGESNOORDERMESSAGESMESSAGE);
		
					struct MessagesNoOrderMessagesMessage * msg =
		
					(MessagesNoOrderMessagesMessage*) malloc(
		
					sizeof(struct MessagesNoOrderMessagesMessage));
		
					MessagesNoOrderMessagesMessage_read_delimited_from(mwMsg->_mumlMsg,
							msg, 0);
		
		#ifdef DEBUG
		
					printDebugInformation("ProductionStation received message of typeMessagesNoOrderMessagesMessage");
		
		#endif
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->incomingOrderPsID = msg->_receiverPsID;
		
					if (stateChart->incomingOrderPsID == stateChart->ID) {
		
						stateChart->evaluateOrderFailed = true;
		
					}
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfProductionStationGetOrderParameterizedGetOrderRTSC =
							STATE_PRODUCTIONSTATIONGETORDEREVALUATEORDER;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfProductionStationGetOrderParameterizedGetOrderRTSC switched state to STATE_PRODUCTIONSTATIONGETORDEREVALUATEORDER" );
		
		#endif		
		
					// execute entry actions
		
					// nothing to do
		
				} else if (
		
				stateChart->incomingOrderPsID == stateChart->ID
						&& stateChart->evaluateOrderFailed == true
		
						) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfProductionStationGetOrderParameterizedGetOrderRTSC =
							STATE_PRODUCTIONSTATIONGETORDERIDLE;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfProductionStationGetOrderParameterizedGetOrderRTSC switched state to STATE_PRODUCTIONSTATIONGETORDERIDLE" );
		
		#endif		
		
					// execute entry actions
		
					stateChart->amount = -1;
		
					stateChart->incredientID = -1;
		
					stateChart->processedOrderID = -1;
		
					stateChart->incomingOrderPsID = -1;
		
					;
		
					Clock_reset(
							stateChart->productionStationGetOrderProcessingTimeProductionStationGetOrderParameterizedGetOrderRTSCClock);
		
				} else if (
		
				stateChart->incomingOrderPsID == stateChart->ID
						&& stateChart->amount > 0
		
						) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					Clock_reset(
							stateChart->productionStationGetOrderProcessingTimeProductionStationGetOrderParameterizedGetOrderRTSCClock);
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfProductionStationGetOrderParameterizedGetOrderRTSC =
							STATE_PRODUCTIONSTATIONGETORDERPROCESSORDER;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfProductionStationGetOrderParameterizedGetOrderRTSC switched state to STATE_PRODUCTIONSTATIONGETORDERPROCESSORDER" );
		
		#endif		
		
					// execute entry actions
		
					// nothing to do
		
				} else if (Port_doesMessageExist(
						ProductionStationComponent_getgetOrder(
								stateChart->parentComponent),
						MESSAGE_MESSAGESORDERFORPSMESSAGESMESSAGE)
		
						) {
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					ProductionStationComponent_getgetOrder(stateChart->parentComponent),
		
					MESSAGE_MESSAGESORDERFORPSMESSAGESMESSAGE);
		
					struct MessagesOrderForPSMessagesMessage * msg =
		
					(MessagesOrderForPSMessagesMessage*) malloc(
		
					sizeof(struct MessagesOrderForPSMessagesMessage));
		
					MessagesOrderForPSMessagesMessage_read_delimited_from(
							mwMsg->_mumlMsg, msg, 0);
		
		#ifdef DEBUG
		
					printDebugInformation("ProductionStation received message of typeMessagesOrderForPSMessagesMessage");
		
		#endif
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->incomingOrderPsID = msg->_receiverPsID;
		
					if (stateChart->incomingOrderPsID == stateChart->ID) {
		
						stateChart->amount = msg->_amount;
		
						stateChart->incredientID = msg->_incredientID;
		
						stateChart->processedOrderID = msg->_orderID;
		
					}
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfProductionStationGetOrderParameterizedGetOrderRTSC =
							STATE_PRODUCTIONSTATIONGETORDEREVALUATEORDER;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfProductionStationGetOrderParameterizedGetOrderRTSC switched state to STATE_PRODUCTIONSTATIONGETORDEREVALUATEORDER" );
		
		#endif		
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
				}
				break;
			case STATE_PRODUCTIONSTATIONGETORDERPROCESSORDER:
				if (
		
				Clock_getTime(
						stateChart->productionStationGetOrderProcessingTimeProductionStationGetOrderParameterizedGetOrderRTSCClock)
						>= stateChart->amount * 1000.0
		
						) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//create new Parameter struct for MessagesDoneOrderMessagesMessage
		
					struct MessagesDoneOrderMessagesMessage * msg =
		
					(MessagesDoneOrderMessagesMessage*) malloc(
		
					sizeof(struct MessagesDoneOrderMessagesMessage));
		
					msg->_orderID = stateChart->processedOrderID;
		
					//send Message
		
					MW_sendMessage(
							MW_getTargetPortIDforIdentifier(
									stateChart->parentComponent->getOrderPort->ID),
							MESSAGE_MESSAGESDONEORDERMESSAGESMESSAGE, msg);
		
		#ifdef DEBUG
		
					printDebugInformation("ProductionStation sent message of type MESSAGE_MESSAGESDONEORDERMESSAGESMESSAGE");
		
		#endif		
		
					//release all created received events
		
					//release all created sent events
		
					free(msg);
		
					// change the state
		
					stateChart->currentStateOfProductionStationGetOrderParameterizedGetOrderRTSC =
							STATE_PRODUCTIONSTATIONGETORDERSEMANTICBREAK;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfProductionStationGetOrderParameterizedGetOrderRTSC switched state to STATE_PRODUCTIONSTATIONGETORDERSEMANTICBREAK" );
		
		#endif		
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
				}
				break;
			case STATE_PRODUCTIONSTATIONGETORDERSEMANTICBREAK:
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
		
					stateChart->currentStateOfProductionStationGetOrderParameterizedGetOrderRTSC =
							STATE_PRODUCTIONSTATIONGETORDERIDLE;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfProductionStationGetOrderParameterizedGetOrderRTSC switched state to STATE_PRODUCTIONSTATIONGETORDERIDLE" );
		
		#endif		
		
					// execute entry actions
		
					stateChart->amount = -1;
		
					stateChart->incredientID = -1;
		
					stateChart->processedOrderID = -1;
		
					stateChart->incomingOrderPsID = -1;
		
					;
		
					Clock_reset(
							stateChart->productionStationGetOrderProcessingTimeProductionStationGetOrderParameterizedGetOrderRTSCClock);
		
				} else {
		
				}
				break;
			default:
				break;
			}
			stateChart->ProductionStationGetOrderParameterizedGetOrderRTSC_isExecutable =
					false;
		}
		
		void ProductionStationPorductionStationRTSCStateChart_processStep(
				ProductionStationPorductionStationRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfProductionStationPorductionStationRTSC) {
			case STATE_PRODUCTIONSTATIONINIT:
		
				if (stateChart->ProductionStationGetOrderParameterizedGetOrderRTSC_isExecutable)
					ProductionStationGetOrderParameterizedGetOrderRTSCStateChart_processStep(
							stateChart);
		
				break;
			default:
				break;
			}
			stateChart->ProductionStationPorductionStationRTSC_isExecutable = false;
		}
		
		
		void ProductionStationGetOrderParameterizedGetOrderRTSCStateChart_exit(
				ProductionStationPorductionStationRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfProductionStationGetOrderParameterizedGetOrderRTSC) {
			case STATE_PRODUCTIONSTATIONGETORDERINIT:
				// nothing to do
		
				break;
			case STATE_PRODUCTIONSTATIONGETORDERIDLE:
				// nothing to do
		
				break;
			case STATE_PRODUCTIONSTATIONGETORDEREVALUATEORDER:
				// nothing to do
		
				break;
			case STATE_PRODUCTIONSTATIONGETORDERPROCESSORDER:
				// nothing to do
		
				break;
			case STATE_PRODUCTIONSTATIONGETORDERSEMANTICBREAK:
				// nothing to do
		
				break;
			default:
				break;
			}
			stateChart->currentStateOfProductionStationGetOrderParameterizedGetOrderRTSC =
					PRODUCTIONSTATIONPORDUCTIONSTATIONRTSC_INACTIVE;
		}
				
			
		bool_t ProductionStationPorductionStationRTSCStateChart_isInState(
				ProductionStationPorductionStationRTSCStateChart* stateChart,
				ProductionStationPorductionStationRTSCState state) {
			return (stateChart->currentStateOfProductionStationGetOrderParameterizedGetOrderRTSC
					== state);
		
		}
		

		//implementations for RTSC internal operations
		
		

