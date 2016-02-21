

		#include "../components/aComponentComponent_Interface.h"
		



		void initializeAComponentInitRegion(
				AComponentRootStatechartStateChart* stateChart) {
		
			stateChart->currentStateOfAComponentInit = STATE_ACOMPONENTINITSTATE_A;
		
			// execute entry actions
			aComponentIncreaseInt(stateChart, stateChart->myVariable);
		
			stateChart->AComponentInit_isExecutable = true;
		
		}
		
		void AComponentRootStatechartStateChart_initialize(
				AComponentRootStatechartStateChart* stateChart) {
			//initialize clocks
		
			//initialize hybrid ports
		
			//initialize variables of the root statechart
			stateChart->myVariable = 21;
		
			//initialize init state
			stateChart->currentStateOfAComponentRootStatechart = STATE_ACOMPONENTINIT;
		
			// execute entry actions
		
			// nothing to do
		
			initializeAComponentInitRegion(stateChart);
		}
		
		

		AComponentRootStatechartStateChart* AComponentRootStatechartStateChart_create(
				AComponentComponent* parentComponent) {
			AComponentRootStatechartStateChart* stateChart =
					(AComponentRootStatechartStateChart*) malloc(
							sizeof(AComponentRootStatechartStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
				if (stateChart->parentComponent != NULL) {
					AComponentRootStatechartStateChart_initialize(stateChart);
				} else {
		
					AComponentRootStatechartStateChart_destroy(stateChart);
					stateChart = NULL;
				}
			} else {
		
			}
			return stateChart;
		}
		

			void AComponentRootStatechartStateChart_destroy(AComponentRootStatechartStateChart* stateChart) {
				if(stateChart != NULL) {
		
		
					free(stateChart);
				}
			}


		
		void AComponentInitStateChart_processStep(
				AComponentRootStatechartStateChart* stateChart) {
			switch (stateChart->currentStateOfAComponentInit) {
			case STATE_ACOMPONENTINITSTATE_A:
				if (
		
				stateChart->myVariable == 42
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfAComponentInit =
							STATE_ACOMPONENTINITSTATE_B;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfAComponentInit switched state to STATE_ACOMPONENTINITSTATE_B" );
		
		#endif		
		
					// execute entry actions
		
					// nothing to do
		
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
		
					stateChart->currentStateOfAComponentInit =
							STATE_ACOMPONENTINITSTATE_A;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfAComponentInit switched state to STATE_ACOMPONENTINITSTATE_A" );
		
		#endif		
		
					// execute entry actions
		
					aComponentIncreaseInt(stateChart, stateChart->myVariable)
		
					;
		
				} else {
		
				}
				break;
			case STATE_ACOMPONENTINITSTATE_B:
				if (
		
				stateChart->myVariable == 0
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfAComponentInit =
							STATE_ACOMPONENTINITSTATE_A;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfAComponentInit switched state to STATE_ACOMPONENTINITSTATE_A" );
		
		#endif		
		
					// execute entry actions
		
					aComponentIncreaseInt(stateChart, stateChart->myVariable)
		
					;
		
				} else if (1
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					aComponentDecreaseInt(stateChart, stateChart->myVariable)
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfAComponentInit =
							STATE_ACOMPONENTINITSTATE_B;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfAComponentInit switched state to STATE_ACOMPONENTINITSTATE_B" );
		
		#endif		
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
				}
				break;
			default:
				break;
			}
			stateChart->AComponentInit_isExecutable = false;
		}
		
		void AComponentRootStatechartStateChart_processStep(
				AComponentRootStatechartStateChart* stateChart) {
			switch (stateChart->currentStateOfAComponentRootStatechart) {
			case STATE_ACOMPONENTINIT:
		
				if (stateChart->AComponentInit_isExecutable)
					AComponentInitStateChart_processStep(stateChart);
		
				break;
			default:
				break;
			}
			stateChart->AComponentRootStatechart_isExecutable = false;
		}
		
		
		void AComponentInitStateChart_exit(
				AComponentRootStatechartStateChart* stateChart) {
			switch (stateChart->currentStateOfAComponentInit) {
			case STATE_ACOMPONENTINITSTATE_A:
				// nothing to do
		
				break;
			case STATE_ACOMPONENTINITSTATE_B:
				// nothing to do
		
				break;
			default:
				break;
			}
			stateChart->currentStateOfAComponentInit =
					ACOMPONENTROOTSTATECHART_INACTIVE;
		}
				
			
		bool_t AComponentRootStatechartStateChart_isInState(
				AComponentRootStatechartStateChart* stateChart,
				AComponentRootStatechartState state) {
			return (stateChart->currentStateOfAComponentInit == state);
		
		}
		

