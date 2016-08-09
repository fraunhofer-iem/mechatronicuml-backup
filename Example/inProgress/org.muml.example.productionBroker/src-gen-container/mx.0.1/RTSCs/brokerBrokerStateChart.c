

		#include "../components/brokerComponent_Interface.h"
		



		void initializeBrokerGetOrderGetOrderStatechartRegion(
				BrokerBrokerStateChart* stateChart) {
		
			stateChart->testLatestOrderID = -1;
		
			stateChart->currentStateOfBrokerGetOrderGetOrderStatechart =
					STATE_BROKERGETORDERINIT;
		
			// execute entry actions
			// nothing to do
		
			stateChart->BrokerGetOrderGetOrderStatechart_isExecutable = true;
		
		}
		void initializeBrokerBrokerForPSPortOrderBrokerforPsRTSCRegion(
				BrokerBrokerStateChart* stateChart) {
		
			stateChart->currentPsID = -1;
		
			stateChart->provideOrderID = -1;
		
			stateChart->provideAmount = -1;
		
			stateChart->provideIncredientID = -1;
		
			stateChart->currentStateOfBrokerBrokerForPSPortOrderBrokerforPsRTSC =
					STATE_BROKERBROKERFORPSPORTINIT;
		
			// execute entry actions
		
			// nothing to do
		
			stateChart->BrokerBrokerForPSPortOrderBrokerforPsRTSC_isExecutable = true;
		
		}
		
		void BrokerBrokerStateChart_initialize(BrokerBrokerStateChart* stateChart) {
			//initialize clocks
		
			//initialize variables of the root statechart
			stateChart->testLatestOrderIDGlobal = -1;
		
			//initialize init state
			stateChart->currentStateOfBrokerBroker = STATE_BROKERINIT;
		
			// execute entry actions
		
			// nothing to do
		
			initializeBrokerGetOrderGetOrderStatechartRegion(stateChart);
			initializeBrokerBrokerForPSPortOrderBrokerforPsRTSCRegion(stateChart);
		}
		
		

		BrokerBrokerStateChart* BrokerBrokerStateChart_create(
				BrokerComponent* parentComponent) {
			BrokerBrokerStateChart* stateChart = (BrokerBrokerStateChart*) malloc(
					sizeof(BrokerBrokerStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
				if (stateChart->parentComponent != NULL) {
					BrokerBrokerStateChart_initialize(stateChart);
				} else {
		
					BrokerBrokerStateChart_destroy(stateChart);
					stateChart = NULL;
				}
			} else {
		
			}
			return stateChart;
		}
		

			void BrokerBrokerStateChart_destroy(BrokerBrokerStateChart* stateChart) {
				if(stateChart != NULL) {
		
		
					free(stateChart);
				}
			}

		//implementations for RTSC internal operations
		
		
		
		void BrokerGetOrderGetOrderStatechartStateChart_processStep(
				BrokerBrokerStateChart* stateChart) {
			switch (stateChart->currentStateOfBrokerGetOrderGetOrderStatechart) {
			case STATE_BROKERGETORDERINIT:
				if (1
		
				) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					noSQLDatabase_noSQLDatabaseCreateDatabase();
		
					;
		
					// nothing to do			
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfBrokerGetOrderGetOrderStatechart =
							STATE_BROKERGETORDERMANAGEORDERS;
		#ifdef DEBUG
					printDebugInformation("currentStateOfBrokerGetOrderGetOrderStatechart switched state to STATE_BROKERGETORDERMANAGEORDERS" );
		#endif		
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
				}
				break;
			case STATE_BROKERGETORDERMANAGEORDERS:
				if (MCC_BrokerComponent_getOrder_exists_MessagesSimpleOrder_Messages_Message(
						BrokerComponent_getgetOrder(stateChart->parentComponent))
		
						) {
					MessagesSimpleOrder_Messages_Message msg_MessagesSimpleOrder;
		
					MCC_BrokerComponent_getOrder_recv_MessagesSimpleOrder_Messages_Message(
							BrokerComponent_getgetOrder(stateChart->parentComponent),
							&msg_MessagesSimpleOrder);
		
		#ifdef DEBUG
		
					printDebugInformation("Broker received message of typeMessagesSimpleOrder_Messages_Message");
		
		#endif
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					noSQLDatabase_noSQLDatabaseInsertOrder(
							msg_MessagesSimpleOrder.orderID,
							msg_MessagesSimpleOrder.ingredientID,
							msg_MessagesSimpleOrder.amount);
		
					stateChart->testLatestOrderIDGlobal =
							msg_MessagesSimpleOrder.orderID;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					//	free(msg);
		
					//	free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfBrokerGetOrderGetOrderStatechart =
							STATE_BROKERGETORDERMANAGEORDERS;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfBrokerGetOrderGetOrderStatechart switched state to STATE_BROKERGETORDERMANAGEORDERS" );
		
		#endif		
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
				}
				break;
			default:
				break;
			}
			stateChart->BrokerGetOrderGetOrderStatechart_isExecutable = false;
		}
		
		void BrokerBrokerForPSPortOrderBrokerforPsRTSCStateChart_processStep(
		
		BrokerBrokerStateChart* stateChart) {
		
			switch (stateChart->currentStateOfBrokerBrokerForPSPortOrderBrokerforPsRTSC) {
		
			case STATE_BROKERBROKERFORPSPORTINIT:
		
				if (MCC_BrokerComponent_brokerForPSPort_exists_MessagesDoneOrder_Messages_Message(
		
				BrokerComponent_getbrokerForPSPort(stateChart->parentComponent))
		
				) {
		
					MessagesDoneOrder_Messages_Message msg_MessagesDoneOrder;
		
					MCC_BrokerComponent_brokerForPSPort_recv_MessagesDoneOrder_Messages_Message(
		
					BrokerComponent_getbrokerForPSPort(
		
					stateChart->parentComponent),
		
					&msg_MessagesDoneOrder);
		
		#ifdef DEBUG
		
					printDebugInformation("Broker received message of typeMessagesDoneOrder_Messages_Message");
		
		#endif
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					noSQLDatabase_noSQLDatabaseDeleteOrder(
		
					msg_MessagesDoneOrder.orderID);
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					//	free(msg);
		
					//	free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfBrokerBrokerForPSPortOrderBrokerforPsRTSC =
		
					STATE_BROKERBROKERFORPSPORTINIT;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfBrokerBrokerForPSPortOrderBrokerforPsRTSC switched state to STATE_BROKERBROKERFORPSPORTINIT" );
		
		#endif		
		
					// execute entry actions
		
					// nothing to do
		
				} else if (MCC_BrokerComponent_brokerForPSPort_exists_MessagesGetOrder_Messages_Message(
		
				BrokerComponent_getbrokerForPSPort(stateChart->parentComponent))
		
				&&
		
				stateChart->testLatestOrderIDGlobal > 0
		
				) {
		
					MessagesGetOrder_Messages_Message msg_MessagesGetOrder;
		
					MCC_BrokerComponent_brokerForPSPort_recv_MessagesGetOrder_Messages_Message(
		
					BrokerComponent_getbrokerForPSPort(
		
					stateChart->parentComponent),
		
					&msg_MessagesGetOrder);
		
		#ifdef DEBUG
		
					printDebugInformation("Broker received message of typeMessagesGetOrder_Messages_Message");
		
		#endif
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->currentPsID = msg_MessagesGetOrder.psID;
		
					stateChart->provideOrderID = noSQLDatabase_noSQLDatabaseSearchOrder(
		
					stateChart->testLatestOrderIDGlobal);
		
					;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					//	free(msg);
		
					//	free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfBrokerBrokerForPSPortOrderBrokerforPsRTSC =
		
					STATE_BROKERBROKERFORPSPORTPROCESSORDERREQUEST;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfBrokerBrokerForPSPortOrderBrokerforPsRTSC switched state to STATE_BROKERBROKERFORPSPORTPROCESSORDERREQUEST" );
		
		#endif		
		
					// execute entry actions
		
					stateChart->provideAmount =
		
					noSQLDatabase_noSQLDatabaseGetOrderAmount(
		
					stateChart->provideOrderID);
		
					;
		
					stateChart->provideIncredientID =
		
					noSQLDatabase_noSQLDatabaseGetOrderIncredientID(
		
					stateChart->provideOrderID);
		
					;
		
					;
		
				} else {
		
				}
		
				break;
		
			case STATE_BROKERBROKERFORPSPORTPROCESSORDERREQUEST:
		
				if (
		
				stateChart->provideAmount < 0 || stateChart->provideIncredientID < 0
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//create new Parameter struct for MessagesNoOrder_Messages_Message
		
					MessagesNoOrder_Messages_Message msg_MessagesNoOrder;
		
					msg_MessagesNoOrder.receiverPsID = stateChart->currentPsID;
		
					//send Message
		
					MCC_BrokerComponent_brokerForPSPort_send_MessagesNoOrder_Messages_Message(
		
					&(stateChart->parentComponent->brokerForPSPortPort),
		
					&msg_MessagesNoOrder);
		
		#ifdef DEBUG
		
					printDebugInformation("Broker sent message of type MessagesNoOrder");
		
		#endif		
		
					//release all created received events
		
					//release all created sent events
		
					//free(msg);
		
					// change the state
		
					stateChart->currentStateOfBrokerBrokerForPSPortOrderBrokerforPsRTSC =
		
					STATE_BROKERBROKERFORPSPORTRESET;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfBrokerBrokerForPSPortOrderBrokerforPsRTSC switched state to STATE_BROKERBROKERFORPSPORTRESET" );
		
		#endif		
		
					// execute entry actions
		
					// nothing to do
		
				} else if (1
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					noSQLDatabase_noSQLDatabaseDefineProductionStationForOrder(
		
					stateChart->provideOrderID, stateChart->currentPsID);
		
					;
		
					//create new Parameter struct for MessagesOrderForPS_Messages_Message
		
					MessagesOrderForPS_Messages_Message msg_MessagesOrderForPS;
		
					msg_MessagesOrderForPS.receiverPsID = stateChart->currentPsID;
		
					msg_MessagesOrderForPS.orderID = stateChart->provideOrderID;
		
					msg_MessagesOrderForPS.incredientID =
		
					stateChart->provideIncredientID;
		
					msg_MessagesOrderForPS.amount = stateChart->provideAmount;
		
					//send Message
		
					MCC_BrokerComponent_brokerForPSPort_send_MessagesOrderForPS_Messages_Message(
		
					&(stateChart->parentComponent->brokerForPSPortPort),
		
					&msg_MessagesOrderForPS);
		
		#ifdef DEBUG
		
					printDebugInformation("Broker sent message of type MessagesOrderForPS");
		
		#endif		
		
					//release all created received events
		
					//release all created sent events
		
					//free(msg);
		
					// change the state
		
					stateChart->currentStateOfBrokerBrokerForPSPortOrderBrokerforPsRTSC =
		
					STATE_BROKERBROKERFORPSPORTRESET;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfBrokerBrokerForPSPortOrderBrokerforPsRTSC switched state to STATE_BROKERBROKERFORPSPORTRESET" );
		
		#endif		
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
				}
		
				break;
		
			case STATE_BROKERBROKERFORPSPORTRESET:
		
				if (1
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->provideOrderID = -1;
		
					stateChart->currentPsID = -1;
		
					stateChart->provideAmount = -1;
		
					stateChart->provideIncredientID = -1;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfBrokerBrokerForPSPortOrderBrokerforPsRTSC =
		
					STATE_BROKERBROKERFORPSPORTINIT;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfBrokerBrokerForPSPortOrderBrokerforPsRTSC switched state to STATE_BROKERBROKERFORPSPORTINIT" );
		
		#endif		
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
			stateChart->BrokerBrokerForPSPortOrderBrokerforPsRTSC_isExecutable = false;
		
		}
		
		void BrokerBrokerStateChart_processStep(BrokerBrokerStateChart* stateChart) {
			switch (stateChart->currentStateOfBrokerBroker) {
			case STATE_BROKERINIT:
		
				if (stateChart->BrokerBrokerForPSPortOrderBrokerforPsRTSC_isExecutable)
					BrokerBrokerForPSPortOrderBrokerforPsRTSCStateChart_processStep(
							stateChart);
				if (stateChart->BrokerGetOrderGetOrderStatechart_isExecutable)
					BrokerGetOrderGetOrderStatechartStateChart_processStep(stateChart);
		
				break;
			default:
				break;
			}
			stateChart->BrokerBroker_isExecutable = false;
		}
		
		
		void BrokerBrokerForPSPortOrderBrokerforPsRTSCStateChart_exit(
				BrokerBrokerStateChart* stateChart) {
			switch (stateChart->currentStateOfBrokerBrokerForPSPortOrderBrokerforPsRTSC) {
			case STATE_BROKERBROKERFORPSPORTINIT:
				// nothing to do
		
				break;
			case STATE_BROKERBROKERFORPSPORTPROCESSORDERREQUEST:
				// nothing to do
		
				break;
			case STATE_BROKERBROKERFORPSPORTRESET:
				// nothing to do
		
				break;
			default:
				break;
			}
			stateChart->currentStateOfBrokerBrokerForPSPortOrderBrokerforPsRTSC =
					BROKERBROKER_INACTIVE;
		}
		void BrokerGetOrderGetOrderStatechartStateChart_exit(
				BrokerBrokerStateChart* stateChart) {
			switch (stateChart->currentStateOfBrokerGetOrderGetOrderStatechart) {
			case STATE_BROKERGETORDERINIT:
				// nothing to do
		
				break;
			case STATE_BROKERGETORDERMANAGEORDERS:
				// nothing to do
		
				break;
			default:
				break;
			}
			stateChart->currentStateOfBrokerGetOrderGetOrderStatechart =
					BROKERBROKER_INACTIVE;
		}
				
			
		bool_t BrokerBrokerStateChart_isInState(BrokerBrokerStateChart* stateChart,
				BrokerBrokerState state) {
			return (stateChart->currentStateOfBrokerBrokerForPSPortOrderBrokerforPsRTSC
					== state
					|| stateChart->currentStateOfBrokerGetOrderGetOrderStatechart
							== state);
		
		}
		

	

