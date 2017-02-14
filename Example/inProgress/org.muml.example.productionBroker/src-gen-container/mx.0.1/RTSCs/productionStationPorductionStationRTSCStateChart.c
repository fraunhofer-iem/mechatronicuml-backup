

		#include "../components/productionStationComponent_Interface.h"
		



		void initializeProductionStationGetOrderParameterizedGetOrderRTSCRegion(
				ProductionStationPorductionStationRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->productionStationGetOrderProcessingTimeProductionStationGetOrderParameterizedGetOrderRTSCClock);
		
			stateChart->amount = -1;
		
			stateChart->processedOrderID = -1;
		
			stateChart->incomingOrderPsID = stateChart->incomingOrderPsID = 0;
			;
		
			stateChart->ingredientID = -1;
		
			stateChart->evaluateOrderFailed = false;
		
			stateChart->currentStateOfProductionStationGetOrderParameterizedGetOrderRTSC =
					STATE_PRODUCTIONSTATIONGETORDERINIT;
		
			stateChart->ProductionStationGetOrderParameterizedGetOrderRTSC_isExecutable =
					true;
		
		}
		
		void ProductionStationPorductionStationRTSCStateChart_initialize(
				ProductionStationPorductionStationRTSCStateChart* stateChart) {
			//initialize clocks
		
			//initialize variables of the root statechart
			stateChart->ID = -1;
		
			//initialize port variables of the root statechart
		
			//initialize init state
			stateChart->currentStateOfProductionStationPorductionStationRTSC =
					STATE_PRODUCTIONSTATIONINIT;
		
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

		//implementations for RTSC internal operations
		
		
		
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
					;;
		
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
					stateChart->ingredientID = -1;
					stateChart->processedOrderID = -1;
					stateChart->incomingOrderPsID = -1;
					;
		
					Clock_reset(
							stateChart->productionStationGetOrderProcessingTimeProductionStationGetOrderParameterizedGetOrderRTSCClock);
		
				} else {
		
				}
				break;
			case STATE_PRODUCTIONSTATIONGETORDERIDLE:
				if (Clock_getTime(
						stateChart->productionStationGetOrderProcessingTimeProductionStationGetOrderParameterizedGetOrderRTSCClock)
						>= 500 * 1.0
		
						) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->evaluateOrderFailed = false;
					;
		
					//create new Parameter struct for MessagesGetOrder_Messages_Message
					MessagesGetOrder_Messages_Message msg_MessagesGetOrder;
					msg_MessagesGetOrder.psID = stateChart->ID;
		
					//send Message
					MCC_ProductionStationComponent_getOrder_send_MessagesGetOrder_Messages_Message(
							&(stateChart->parentComponent->getOrderPort),
							&msg_MessagesGetOrder);
		#ifdef DEBUG
					printDebugInformation("ProductionStation sent message of type MessagesGetOrder");
		#endif		
		
					//release all created received events
					//release all created sent events
					//free(msg);
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
				if (MCC_ProductionStationComponent_getOrder_exists_MessagesNoOrder_Messages_Message(
						ProductionStationComponent_getgetOrder(
								stateChart->parentComponent))
		
								) {
					MessagesNoOrder_Messages_Message msg_MessagesNoOrder;
					MCC_ProductionStationComponent_getOrder_recv_MessagesNoOrder_Messages_Message(
							ProductionStationComponent_getgetOrder(
									stateChart->parentComponent), &msg_MessagesNoOrder);
		
		#ifdef DEBUG
					printDebugInformation("ProductionStation received message of typeMessagesNoOrder_Messages_Message");
		#endif
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->incomingOrderPsID = msg_MessagesNoOrder.receiverPsID;
					if (stateChart->incomingOrderPsID == stateChart->ID) {
						stateChart->evaluateOrderFailed = true;
		
					}
		
					;
		
					// nothing to do			
		
					//release all created received events
					//	free(msg);
					//	free(mwMsg);
		
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
					stateChart->ingredientID = -1;
					stateChart->processedOrderID = -1;
					stateChart->incomingOrderPsID = -1;
					;
		
					Clock_reset(
							stateChart->productionStationGetOrderProcessingTimeProductionStationGetOrderParameterizedGetOrderRTSCClock);
		
				} else if (
		
				stateChart->incomingOrderPsID == stateChart->ID
						&& stateChart->amount >= 0
		
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
		
				} else if (MCC_ProductionStationComponent_getOrder_exists_MessagesOrderForPS_Messages_Message(
						ProductionStationComponent_getgetOrder(
								stateChart->parentComponent))
		
								) {
					MessagesOrderForPS_Messages_Message msg_MessagesOrderForPS;
					MCC_ProductionStationComponent_getOrder_recv_MessagesOrderForPS_Messages_Message(
							ProductionStationComponent_getgetOrder(
									stateChart->parentComponent),
							&msg_MessagesOrderForPS);
		
		#ifdef DEBUG
					printDebugInformation("ProductionStation received message of typeMessagesOrderForPS_Messages_Message");
		#endif
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->incomingOrderPsID = msg_MessagesOrderForPS.receiverPsID;
					if (stateChart->incomingOrderPsID == stateChart->ID) {
						stateChart->amount = msg_MessagesOrderForPS.amount;
						stateChart->ingredientID = msg_MessagesOrderForPS.ingredientID;
						stateChart->processedOrderID = msg_MessagesOrderForPS.orderID;
		
					}
		
					;
		
					// nothing to do			
		
					//release all created received events
					//	free(msg);
					//	free(mwMsg);
		
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
				if (Clock_getTime(
						stateChart->productionStationGetOrderProcessingTimeProductionStationGetOrderParameterizedGetOrderRTSCClock)
						>= stateChart->amount * 1000.0
		
						) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					//create new Parameter struct for MessagesDoneOrder_Messages_Message
					MessagesDoneOrder_Messages_Message msg_MessagesDoneOrder;
					msg_MessagesDoneOrder.orderID = stateChart->processedOrderID;
		
					//send Message
					MCC_ProductionStationComponent_getOrder_send_MessagesDoneOrder_Messages_Message(
							&(stateChart->parentComponent->getOrderPort),
							&msg_MessagesDoneOrder);
		#ifdef DEBUG
					printDebugInformation("ProductionStation sent message of type MessagesDoneOrder");
		#endif		
		
					//release all created received events
					//release all created sent events
					//free(msg);
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
					stateChart->ingredientID = -1;
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
		

	

