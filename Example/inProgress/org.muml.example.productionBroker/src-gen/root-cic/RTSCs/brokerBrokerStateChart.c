

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
		
			//initialize hybrid ports
		
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
				if (Port_doesMessageExist(
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
		
					stateChart->testLatestOrderIDGlobal = msg->_orderID;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
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
		
				if (Port_doesMessageExist(
		
				BrokerComponent_getbrokerForPSPort(stateChart->parentComponent),
		
				MESSAGE_MESSAGESDONEORDERMESSAGESMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					BrokerComponent_getbrokerForPSPort(
		
					stateChart->parentComponent),
		
					MESSAGE_MESSAGESDONEORDERMESSAGESMESSAGE);
		
					struct MessagesDoneOrderMessagesMessage * msg =
		
					(MessagesDoneOrderMessagesMessage*) malloc(
		
					sizeof(struct MessagesDoneOrderMessagesMessage));
		
					MessagesDoneOrderMessagesMessage_read_delimited_from(
		
					mwMsg->_mumlMsg, msg, 0);
		
		#ifdef DEBUG
		
					printDebugInformation("Broker received message of typeMessagesDoneOrderMessagesMessage");
		
		#endif
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					noSQLDatabase_noSQLDatabaseDeleteOrder(msg->_orderID);
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfBrokerBrokerForPSPortOrderBrokerforPsRTSC =
		
					STATE_BROKERBROKERFORPSPORTINIT;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfBrokerBrokerForPSPortOrderBrokerforPsRTSC switched state to STATE_BROKERBROKERFORPSPORTINIT" );
		
		#endif		
		
					// execute entry actions
		
					// nothing to do
		
				} else if (Port_doesMessageExist(
		
				BrokerComponent_getbrokerForPSPort(stateChart->parentComponent),
		
				MESSAGE_MESSAGESGETORDERMESSAGESMESSAGE)
		
				&&
		
				stateChart->testLatestOrderIDGlobal > 0
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					BrokerComponent_getbrokerForPSPort(stateChart->parentComponent),
		
					MESSAGE_MESSAGESGETORDERMESSAGESMESSAGE);
		
					struct MessagesGetOrderMessagesMessage * msg =
		
					(MessagesGetOrderMessagesMessage*) malloc(
		
					sizeof(struct MessagesGetOrderMessagesMessage));
		
					MessagesGetOrderMessagesMessage_read_delimited_from(mwMsg->_mumlMsg,
		
					msg, 0);
		
		#ifdef DEBUG
		
					printDebugInformation("Broker received message of typeMessagesGetOrderMessagesMessage");
		
		#endif
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->currentPsID = msg->_psID;
		
					stateChart->provideOrderID = noSQLDatabase_noSQLDatabaseSearchOrder(
		
					stateChart->testLatestOrderIDGlobal);
		
					;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
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
		
					//create new Parameter struct for MessagesNoOrderMessagesMessage
		
					struct MessagesNoOrderMessagesMessage * msg =
		
					(MessagesNoOrderMessagesMessage*) malloc(
		
					sizeof(struct MessagesNoOrderMessagesMessage));
		
					msg->_receiverPsID = stateChart->currentPsID;
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->brokerForPSPortPort->ID),
		
					MESSAGE_MESSAGESNOORDERMESSAGESMESSAGE, msg);
		
		#ifdef DEBUG
		
					printDebugInformation("Broker sent message of type MESSAGE_MESSAGESNOORDERMESSAGESMESSAGE");
		
		#endif		
		
					//release all created received events
		
					//release all created sent events
		
					free(msg);
		
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
		
					//create new Parameter struct for MessagesOrderForPSMessagesMessage
		
					struct MessagesOrderForPSMessagesMessage * msg =
		
					(MessagesOrderForPSMessagesMessage*) malloc(
		
					sizeof(struct MessagesOrderForPSMessagesMessage));
		
					msg->_receiverPsID = stateChart->currentPsID;
		
					msg->_orderID = stateChart->provideOrderID;
		
					msg->_incredientID = stateChart->provideIncredientID;
		
					msg->_amount = stateChart->provideAmount;
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->brokerForPSPortPort->ID),
		
					MESSAGE_MESSAGESORDERFORPSMESSAGESMESSAGE, msg);
		
		#ifdef DEBUG
		
					printDebugInformation("Broker sent message of type MESSAGE_MESSAGESORDERFORPSMESSAGESMESSAGE");
		
		#endif		
		
					//release all created received events
		
					//release all created sent events
		
					free(msg);
		
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
		

		//implementations for RTSC internal operations
		
		

