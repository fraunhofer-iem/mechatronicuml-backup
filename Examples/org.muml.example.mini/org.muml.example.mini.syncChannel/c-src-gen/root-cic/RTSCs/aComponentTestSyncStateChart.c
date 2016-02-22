

		#include "../components/aComponentComponent_Interface.h"
		



		void initializeAComponentInitRegion_1Region(
				AComponentTestSyncStateChart* stateChart) {
		
			stateChart->currentStateOfAComponentInitRegion_1 =
					STATE_ACOMPONENTINITREGION_1S1;
		
			// execute entry actions
			// nothing to do
		
			stateChart->AComponentInitRegion_1_isExecutable = true;
		
		}
		void initializeAComponentInitRegion_2Region(
				AComponentTestSyncStateChart* stateChart) {
		
			stateChart->currentStateOfAComponentInitRegion_2 =
					STATE_ACOMPONENTINITREGION_2S2;
		
			// execute entry actions
		
			// nothing to do
		
			stateChart->AComponentInitRegion_2_isExecutable = true;
		
		}
		
		void AComponentTestSyncStateChart_initialize(
				AComponentTestSyncStateChart* stateChart) {
			//initialize clocks
		
			//initialize hybrid ports
		
			//initialize variables of the root statechart
			stateChart->var1 = 1;
		
			stateChart->var2 = 2;
		
			//initialize init state
			stateChart->currentStateOfAComponentTestSync = STATE_ACOMPONENTINIT;
		
			// execute entry actions
		
			// nothing to do
		
			initializeAComponentInitRegion_1Region(stateChart);
			initializeAComponentInitRegion_2Region(stateChart);
		}
		
		

		AComponentTestSyncStateChart* AComponentTestSyncStateChart_create(
				AComponentComponent* parentComponent) {
			AComponentTestSyncStateChart* stateChart =
					(AComponentTestSyncStateChart*) malloc(
							sizeof(AComponentTestSyncStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
				if (stateChart->parentComponent != NULL) {
					AComponentTestSyncStateChart_initialize(stateChart);
				} else {
		
					AComponentTestSyncStateChart_destroy(stateChart);
					stateChart = NULL;
				}
			} else {
		
			}
			return stateChart;
		}
		

			void AComponentTestSyncStateChart_destroy(AComponentTestSyncStateChart* stateChart) {
				if(stateChart != NULL) {
		
		
					free(stateChart);
				}
			}


		
		void AComponentInitRegion_1StateChart_processStep(
				AComponentTestSyncStateChart* stateChart) {
			switch (stateChart->currentStateOfAComponentInitRegion_1) {
			case STATE_ACOMPONENTINITREGION_1S1:
				if ((stateChart->AComponentInitRegion_2_isExecutable)
						&& (stateChart->currentStateOfAComponentInitRegion_2
								== STATE_ACOMPONENTINITREGION_2S2)) {
					if (
		
					stateChart->var2 == 2
		
					&&
		
					stateChart->var1 == 1
		
					) {
		
						// execute exit actions
		
						// nothing to do
		
						// Transition Effects (incl. clock resets)
		
						stateChart->var1 = 2;
		
						;
		
						// nothing to do			
		
						//release all created received events
		
						//release all created sent events
		
						// change the state
		
						stateChart->currentStateOfAComponentInitRegion_1 =
								STATE_ACOMPONENTINITREGION_1SENT;
		
		#ifdef DEBUG
		
						printDebugInformation("currentStateOfAComponentInitRegion_1 switched state to STATE_ACOMPONENTINITREGION_1SENT" );
		
		#endif		
		
						// execute entry actions
		
						// nothing to do
		
						// execute exit actions
		
						// nothing to do
		
						// Transition Effects (incl. clock resets)
		
						stateChart->var2 = 1;
		
						;
		
						// nothing to do			
		
						//release all created received events
		
						//release all created sent events
		
						// change the state
		
						stateChart->currentStateOfAComponentInitRegion_2 =
								STATE_ACOMPONENTINITREGION_2RECEIVED;
		
		#ifdef DEBUG
		
						printDebugInformation("currentStateOfAComponentInitRegion_2 switched state to STATE_ACOMPONENTINITREGION_2RECEIVED" );
		
		#endif		
		
						// execute entry actions
		
						// nothing to do
		
						stateChart->AComponentInitRegion_2_isExecutable = false;
						stateChart->AComponentInitRegion_1_isExecutable = false;
						//break;
					}
				} else if (0) {
					//dummy
				} else {
		
				}
				break;
			case STATE_ACOMPONENTINITREGION_1SENT:
		
				break;
			default:
				break;
			}
			stateChart->AComponentInitRegion_1_isExecutable = false;
		}
		
		void AComponentInitRegion_2StateChart_processStep(
		
		AComponentTestSyncStateChart* stateChart) {
		
			switch (stateChart->currentStateOfAComponentInitRegion_2) {
		
			case STATE_ACOMPONENTINITREGION_2S2:
		
				if ((stateChart->AComponentInitRegion_1_isExecutable)
		
				&& (stateChart->currentStateOfAComponentInitRegion_1
		
				== STATE_ACOMPONENTINITREGION_1S1)) {
		
					if (
		
					stateChart->var1 == 1
		
					&&
		
					stateChart->var2 == 2
		
					) {
		
						// execute exit actions
		
						// nothing to do
		
						// Transition Effects (incl. clock resets)
		
						stateChart->var1 = 2;
		
						;
		
						// nothing to do			
		
						//release all created received events
		
						//release all created sent events
		
						// change the state
		
						stateChart->currentStateOfAComponentInitRegion_1 =
		
						STATE_ACOMPONENTINITREGION_1SENT;
		
		#ifdef DEBUG
		
						printDebugInformation("currentStateOfAComponentInitRegion_1 switched state to STATE_ACOMPONENTINITREGION_1SENT" );
		
		#endif		
		
						// execute entry actions
		
						// nothing to do
		
						// execute exit actions
		
						// nothing to do
		
						// Transition Effects (incl. clock resets)
		
						stateChart->var2 = 1;
		
						;
		
						// nothing to do			
		
						//release all created received events
		
						//release all created sent events
		
						// change the state
		
						stateChart->currentStateOfAComponentInitRegion_2 =
		
						STATE_ACOMPONENTINITREGION_2RECEIVED;
		
		#ifdef DEBUG
		
						printDebugInformation("currentStateOfAComponentInitRegion_2 switched state to STATE_ACOMPONENTINITREGION_2RECEIVED" );
		
		#endif		
		
						// execute entry actions
		
						// nothing to do
		
						stateChart->AComponentInitRegion_1_isExecutable = false;
		
						stateChart->AComponentInitRegion_2_isExecutable = false;
		
						//break;
		
					}
		
				} else if (0) {
		
					//dummy
		
				} else {
		
				}
		
				break;
		
			case STATE_ACOMPONENTINITREGION_2RECEIVED:
		
				break;
		
			default:
		
				break;
		
			}
		
			stateChart->AComponentInitRegion_2_isExecutable = false;
		
		}
		
		void AComponentTestSyncStateChart_processStep(
				AComponentTestSyncStateChart* stateChart) {
			switch (stateChart->currentStateOfAComponentTestSync) {
			case STATE_ACOMPONENTINIT:
		
				if (stateChart->AComponentInitRegion_2_isExecutable)
					AComponentInitRegion_2StateChart_processStep(stateChart);
				if (stateChart->AComponentInitRegion_1_isExecutable)
					AComponentInitRegion_1StateChart_processStep(stateChart);
		
				break;
			default:
				break;
			}
			stateChart->AComponentTestSync_isExecutable = false;
		}
		
		
		void AComponentInitRegion_2StateChart_exit(
				AComponentTestSyncStateChart* stateChart) {
			switch (stateChart->currentStateOfAComponentInitRegion_2) {
			case STATE_ACOMPONENTINITREGION_2S2:
				// nothing to do
		
				break;
			case STATE_ACOMPONENTINITREGION_2RECEIVED:
				// nothing to do
		
				break;
			default:
				break;
			}
			stateChart->currentStateOfAComponentInitRegion_2 =
					ACOMPONENTTESTSYNC_INACTIVE;
		}
		void AComponentInitRegion_1StateChart_exit(
				AComponentTestSyncStateChart* stateChart) {
			switch (stateChart->currentStateOfAComponentInitRegion_1) {
			case STATE_ACOMPONENTINITREGION_1S1:
				// nothing to do
		
				break;
			case STATE_ACOMPONENTINITREGION_1SENT:
				// nothing to do
		
				break;
			default:
				break;
			}
			stateChart->currentStateOfAComponentInitRegion_1 =
					ACOMPONENTTESTSYNC_INACTIVE;
		}
				
			
		bool_t AComponentTestSyncStateChart_isInState(
				AComponentTestSyncStateChart* stateChart,
				AComponentTestSyncState state) {
			return (stateChart->currentStateOfAComponentInitRegion_2 == state
					|| stateChart->currentStateOfAComponentInitRegion_1 == state);
		
		}
		

