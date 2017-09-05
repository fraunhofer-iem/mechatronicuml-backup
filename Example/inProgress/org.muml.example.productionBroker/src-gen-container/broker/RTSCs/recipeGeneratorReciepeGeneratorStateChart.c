

		#include "../components/recipeGeneratorComponent_Interface.h"
		



		void initializeRecipeGeneratorProvideOrderReciepeSenderRegion(
				RecipeGeneratorReciepeGeneratorStateChart* stateChart) {
			Clock_reset(
					stateChart->recipeGeneratorProvideOrderTimeSpanRecipeGeneratorProvideOrderReciepeSenderClock);
		
			stateChart->currentOrderID = 0;
		
			stateChart->speed = 2;
		
			stateChart->currentStateOfRecipeGeneratorProvideOrderReciepeSender =
					STATE_RECIPEGENERATORPROVIDEORDERINIT;
		
			stateChart->RecipeGeneratorProvideOrderReciepeSender_isExecutable = true;
		
		}
		void initializeRecipeGeneratorInitInternalBehaviorRegion(
				RecipeGeneratorReciepeGeneratorStateChart* stateChart) {
			Clock_reset(
					stateChart->recipeGeneratorInitInternalBehaviorLoadClockRecipeGeneratorInitInternalBehaviorClock);
		
			stateChart->currentStateOfRecipeGeneratorInitInternalBehavior =
					STATE_RECIPEGENERATORINITINTERNALBEHAVIORSMALLAMOUNT;
		
			stateChart->RecipeGeneratorInitInternalBehavior_isExecutable = true;
		
		}
		
		void RecipeGeneratorReciepeGeneratorStateChart_initialize(
				RecipeGeneratorReciepeGeneratorStateChart* stateChart) {
			//initialize clocks
		
			//initialize variables of the root statechart
			stateChart->produceIngredientID = 1;
		
			stateChart->amount = 1;
		
			//initialize port variables of the root statechart
		
			//initialize init state
			stateChart->currentStateOfRecipeGeneratorReciepeGenerator =
					STATE_RECIPEGENERATORINIT;
		
			initializeRecipeGeneratorProvideOrderReciepeSenderRegion(stateChart);
			initializeRecipeGeneratorInitInternalBehaviorRegion(stateChart);
		}
		
		

		RecipeGeneratorReciepeGeneratorStateChart* RecipeGeneratorReciepeGeneratorStateChart_create(
				RecipeGeneratorComponent* parentComponent) {
			RecipeGeneratorReciepeGeneratorStateChart* stateChart =
					(RecipeGeneratorReciepeGeneratorStateChart*) malloc(
							sizeof(RecipeGeneratorReciepeGeneratorStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
				if (stateChart->parentComponent != NULL) {
					RecipeGeneratorReciepeGeneratorStateChart_initialize(stateChart);
				} else {
		
					RecipeGeneratorReciepeGeneratorStateChart_destroy(stateChart);
					stateChart = NULL;
				}
			} else {
		
			}
			return stateChart;
		}
		

			void RecipeGeneratorReciepeGeneratorStateChart_destroy(RecipeGeneratorReciepeGeneratorStateChart* stateChart) {
				if(stateChart != NULL) {
		
		
					free(stateChart);
				}
			}

		//implementations for RTSC internal operations
		
		
		
		void RecipeGeneratorProvideOrderReciepeSenderStateChart_processStep(
				RecipeGeneratorReciepeGeneratorStateChart* stateChart) {
			switch (stateChart->currentStateOfRecipeGeneratorProvideOrderReciepeSender) {
			case STATE_RECIPEGENERATORPROVIDEORDERINIT:
				if (Clock_getTime(
						stateChart->recipeGeneratorProvideOrderTimeSpanRecipeGeneratorProvideOrderReciepeSenderClock)
						>= stateChart->speed * 1000.0
		
						) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->currentOrderID = stateChart->currentOrderID + 1;
					;
		
					Clock_reset(
							stateChart->recipeGeneratorProvideOrderTimeSpanRecipeGeneratorProvideOrderReciepeSenderClock);
		
					//create new Parameter struct for MessagesSimpleOrder_Messages_Message
					MessagesSimpleOrder_Messages_Message msg_MessagesSimpleOrder;
					msg_MessagesSimpleOrder.amount = stateChart->amount;
					msg_MessagesSimpleOrder.ingredientID =
							stateChart->produceIngredientID;
					msg_MessagesSimpleOrder.orderID = stateChart->currentOrderID;
					msg_MessagesSimpleOrder.timeout = 12;
		
					//send Message
					MCC_RecipeGeneratorComponent_provideOrder_send_MessagesSimpleOrder_Messages_Message(
							&(stateChart->parentComponent->provideOrderPort),
							&msg_MessagesSimpleOrder);
		#ifdef DEBUG
					printDebugInformation("RecipeGenerator sent message of type MessagesSimpleOrder");
		#endif		
		
					//release all created received events
					//release all created sent events
					//free(msg);
					// change the state
					stateChart->currentStateOfRecipeGeneratorProvideOrderReciepeSender =
							STATE_RECIPEGENERATORPROVIDEORDERINIT;
		#ifdef DEBUG
					printDebugInformation("currentStateOfRecipeGeneratorProvideOrderReciepeSender switched state to STATE_RECIPEGENERATORPROVIDEORDERINIT" );
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
			stateChart->RecipeGeneratorProvideOrderReciepeSender_isExecutable = false;
		}
		
		void RecipeGeneratorInitInternalBehaviorStateChart_processStep(
				RecipeGeneratorReciepeGeneratorStateChart* stateChart) {
			switch (stateChart->currentStateOfRecipeGeneratorInitInternalBehavior) {
			case STATE_RECIPEGENERATORINITINTERNALBEHAVIORSMALLAMOUNT:
				if (Clock_getTime(
						stateChart->recipeGeneratorInitInternalBehaviorLoadClockRecipeGeneratorInitInternalBehaviorClock)
						>= 5 * 1000.0
		
						) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->amount = 2;
					if (stateChart->produceIngredientID < 5) {
						stateChart->produceIngredientID =
								stateChart->produceIngredientID + 1;
		
					}
		
					else {
						stateChart->produceIngredientID = 0;
		
					}
		
					;
		
					Clock_reset(
							stateChart->recipeGeneratorInitInternalBehaviorLoadClockRecipeGeneratorInitInternalBehaviorClock);
		
					// nothing to do			
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfRecipeGeneratorInitInternalBehavior =
							STATE_RECIPEGENERATORINITINTERNALBEHAVIORHIGHAMOUNT;
		#ifdef DEBUG
					printDebugInformation("currentStateOfRecipeGeneratorInitInternalBehavior switched state to STATE_RECIPEGENERATORINITINTERNALBEHAVIORHIGHAMOUNT" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
					//
				} else {
		
				}
				break;
			case STATE_RECIPEGENERATORINITINTERNALBEHAVIORHIGHAMOUNT:
				if (Clock_getTime(
						stateChart->recipeGeneratorInitInternalBehaviorLoadClockRecipeGeneratorInitInternalBehaviorClock)
						>= 2 * 1000.0
		
						) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->amount = 1;
					if (stateChart->produceIngredientID < 5) {
						stateChart->produceIngredientID =
								stateChart->produceIngredientID + 1;
		
					}
		
					else {
						stateChart->produceIngredientID = 0;
		
					}
		
					;
		
					Clock_reset(
							stateChart->recipeGeneratorInitInternalBehaviorLoadClockRecipeGeneratorInitInternalBehaviorClock);
		
					// nothing to do			
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfRecipeGeneratorInitInternalBehavior =
							STATE_RECIPEGENERATORINITINTERNALBEHAVIORSMALLAMOUNT;
		#ifdef DEBUG
					printDebugInformation("currentStateOfRecipeGeneratorInitInternalBehavior switched state to STATE_RECIPEGENERATORINITINTERNALBEHAVIORSMALLAMOUNT" );
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
			stateChart->RecipeGeneratorInitInternalBehavior_isExecutable = false;
		}
		
		void RecipeGeneratorReciepeGeneratorStateChart_processStep(
				RecipeGeneratorReciepeGeneratorStateChart* stateChart) {
			switch (stateChart->currentStateOfRecipeGeneratorReciepeGenerator) {
			case STATE_RECIPEGENERATORINIT:
		
				if (stateChart->RecipeGeneratorInitInternalBehavior_isExecutable)
					RecipeGeneratorInitInternalBehaviorStateChart_processStep(
							stateChart);
				if (stateChart->RecipeGeneratorProvideOrderReciepeSender_isExecutable)
					RecipeGeneratorProvideOrderReciepeSenderStateChart_processStep(
							stateChart);
		
				break;
			default:
				break;
			}
			stateChart->RecipeGeneratorReciepeGenerator_isExecutable = false;
		}
		
		
		void RecipeGeneratorProvideOrderReciepeSenderStateChart_exit(
				RecipeGeneratorReciepeGeneratorStateChart* stateChart) {
			switch (stateChart->currentStateOfRecipeGeneratorProvideOrderReciepeSender) {
			case STATE_RECIPEGENERATORPROVIDEORDERINIT:
				// nothing to do
		
				break;
			default:
				break;
			}
			stateChart->currentStateOfRecipeGeneratorProvideOrderReciepeSender =
					RECIPEGENERATORRECIEPEGENERATOR_INACTIVE;
		}
		void RecipeGeneratorInitInternalBehaviorStateChart_exit(
				RecipeGeneratorReciepeGeneratorStateChart* stateChart) {
			switch (stateChart->currentStateOfRecipeGeneratorInitInternalBehavior) {
			case STATE_RECIPEGENERATORINITINTERNALBEHAVIORSMALLAMOUNT:
				// nothing to do
		
				break;
			case STATE_RECIPEGENERATORINITINTERNALBEHAVIORHIGHAMOUNT:
				// nothing to do
		
				break;
			default:
				break;
			}
			stateChart->currentStateOfRecipeGeneratorInitInternalBehavior =
					RECIPEGENERATORRECIEPEGENERATOR_INACTIVE;
		}
				
			
		bool_t RecipeGeneratorReciepeGeneratorStateChart_isInState(
				RecipeGeneratorReciepeGeneratorStateChart* stateChart,
				RecipeGeneratorReciepeGeneratorState state) {
			return (stateChart->currentStateOfRecipeGeneratorProvideOrderReciepeSender
					== state
					|| stateChart->currentStateOfRecipeGeneratorInitInternalBehavior
							== state);
		
		}
		

	

