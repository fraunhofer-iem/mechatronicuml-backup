

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
		
		void BrokerBrokerStateChart_initialize(BrokerBrokerStateChart* stateChart) {
			//initialize clocks
		
			//initialize hybrid ports
		
			//initialize variables of the root statechart
		
			//initialize init state
			stateChart->currentStateOfBrokerBroker = STATE_BROKERINIT;
		
			// execute entry actions
		
			// nothing to do
		
			initializeBrokerGetOrderGetOrderStatechartRegion(stateChart);
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
							STATE_BROKERGETORDERSTOREORDERS;
		#ifdef DEBUG
					printDebugInformation("currentStateOfBrokerGetOrderGetOrderStatechart switched state to STATE_BROKERGETORDERSTOREORDERS" );
		#endif		
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
				}
				break;
			case STATE_BROKERGETORDERSTOREORDERS:
				if (
		
				stateChart->testLatestOrderID > 10
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfBrokerGetOrderGetOrderStatechart =
							STATE_BROKERGETORDERTESTSTATEFORDELETINGALLORDERS;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfBrokerGetOrderGetOrderStatechart switched state to STATE_BROKERGETORDERTESTSTATEFORDELETINGALLORDERS" );
		
		#endif		
		
					// execute entry actions
		
					// nothing to do
		
				} else if (Port_doesMessageExist(
						BrokerComponent_getgetOrder(stateChart->parentComponent),
						MESSAGE_MESSAGESSIMPLEORDERMESSAGESMESSAGE)
		
						) {
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					BrokerComponent_getgetOrder(stateChart->parentComponent),
		
					MESSAGE_MESSAGESSIMPLEORDERMESSAGESMESSAGE);
		
					struct MessagesSimpleOrderMessagesMessage * msg =
		
					(MessagesSimpleOrderMessagesMessage*) malloc(
		
					sizeof(struct MessagesSimpleOrderMessagesMessage));
		
					MessagesSimpleOrderMessagesMessage_read_delimited_from(
							mwMsg->_mumlMsg, msg, 0);
		
		#ifdef DEBUG
		
					printDebugInformation("Broker received message of typeMessagesSimpleOrderMessagesMessage");
		
		#endif
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					noSQLDatabase_noSQLDatabaseInsertOrder(msg->_orderID,
							msg->_ingredientID, msg->_amount);
		
					stateChart->testLatestOrderID = msg->_orderID;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfBrokerGetOrderGetOrderStatechart =
							STATE_BROKERGETORDERSTOREORDERS;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfBrokerGetOrderGetOrderStatechart switched state to STATE_BROKERGETORDERSTOREORDERS" );
		
		#endif		
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
				}
				break;
			case STATE_BROKERGETORDERTESTSTATEFORDELETINGALLORDERS:
				if (
		
				stateChart->testLatestOrderID >= 1
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					noSQLDatabase_noSQLDatabaseDeleteOrder(
							stateChart->testLatestOrderID);
		
					stateChart->testLatestOrderID = stateChart->testLatestOrderID - 1;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfBrokerGetOrderGetOrderStatechart =
							STATE_BROKERGETORDERTESTSTATEFORDELETINGALLORDERS;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfBrokerGetOrderGetOrderStatechart switched state to STATE_BROKERGETORDERTESTSTATEFORDELETINGALLORDERS" );
		
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
		
		void BrokerBrokerStateChart_processStep(BrokerBrokerStateChart* stateChart) {
			switch (stateChart->currentStateOfBrokerBroker) {
			case STATE_BROKERINIT:
		
				if (stateChart->BrokerGetOrderGetOrderStatechart_isExecutable)
					BrokerGetOrderGetOrderStatechartStateChart_processStep(stateChart);
		
				break;
			default:
				break;
			}
			stateChart->BrokerBroker_isExecutable = false;
		}
		
		
		void BrokerGetOrderGetOrderStatechartStateChart_exit(
				BrokerBrokerStateChart* stateChart) {
			switch (stateChart->currentStateOfBrokerGetOrderGetOrderStatechart) {
			case STATE_BROKERGETORDERINIT:
				// nothing to do
		
				break;
			case STATE_BROKERGETORDERSTOREORDERS:
				// nothing to do
		
				break;
			case STATE_BROKERGETORDERTESTSTATEFORDELETINGALLORDERS:
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
			return (stateChart->currentStateOfBrokerGetOrderGetOrderStatechart == state);
		
		}
		

		//implementations for RTSC internal operations
		
		

