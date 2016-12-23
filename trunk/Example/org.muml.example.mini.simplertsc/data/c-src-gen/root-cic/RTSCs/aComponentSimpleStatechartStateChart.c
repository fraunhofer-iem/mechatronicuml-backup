

		#include "../components/aComponentComponent_Interface.h"
		



		void initializeAComponentInitRegion(
				AComponentSimpleStatechartStateChart* stateChart) {
		
			stateChart->currentStateOfAComponentInit = STATE_ACOMPONENTINITSTATE_A;
		
			// execute entry actions
			stateChart->myVariable = stateChart->myVariable + 1;
			;
		
			stateChart->AComponentInit_isExecutable = true;
		
		}
		
		void AComponentSimpleStatechartStateChart_initialize(
				AComponentSimpleStatechartStateChart* stateChart) {
			//initialize clocks
		
			//initialize hybrid ports
		
			//initialize variables of the root statechart
			stateChart->myVariable = 42;
		
			//initialize init state
			stateChart->currentStateOfAComponentSimpleStatechart = STATE_ACOMPONENTINIT;
		
			// execute entry actions
		
			// nothing to do
		
			initializeAComponentInitRegion(stateChart);
		}
		
		

		AComponentSimpleStatechartStateChart* AComponentSimpleStatechartStateChart_create(
				AComponentComponent* parentComponent) {
			AComponentSimpleStatechartStateChart* stateChart =
					(AComponentSimpleStatechartStateChart*) malloc(
							sizeof(AComponentSimpleStatechartStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
				if (stateChart->parentComponent != NULL) {
					AComponentSimpleStatechartStateChart_initialize(stateChart);
				} else {
		
					AComponentSimpleStatechartStateChart_destroy(stateChart);
					stateChart = NULL;
				}
			} else {
		
			}
			return stateChart;
		}
		

			void AComponentSimpleStatechartStateChart_destroy(AComponentSimpleStatechartStateChart* stateChart) {
				if(stateChart != NULL) {
		
		
					free(stateChart);
				}
			}


		
		void AComponentInitStateChart_processStep(
				AComponentSimpleStatechartStateChart* stateChart) {
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
		
					stateChart->myVariable = stateChart->myVariable + 1;
		
					;
		
				} else {
		
				}
				break;
			case STATE_ACOMPONENTINITSTATE_B:
				if (1
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->myVariable = stateChart->myVariable - 1;
		
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
		
				} else if (
		
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
		
					stateChart->myVariable = stateChart->myVariable + 1;
		
					;
		
				} else {
		
				}
				break;
			default:
				break;
			}
			stateChart->AComponentInit_isExecutable = false;
		}
		
		void AComponentSimpleStatechartStateChart_processStep(
				AComponentSimpleStatechartStateChart* stateChart) {
			switch (stateChart->currentStateOfAComponentSimpleStatechart) {
			case STATE_ACOMPONENTINIT:
		
				if (stateChart->AComponentInit_isExecutable)
					AComponentInitStateChart_processStep(stateChart);
		
				break;
			default:
				break;
			}
			stateChart->AComponentSimpleStatechart_isExecutable = false;
		}
		
		
		void AComponentInitStateChart_exit(
				AComponentSimpleStatechartStateChart* stateChart) {
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
					ACOMPONENTSIMPLESTATECHART_INACTIVE;
		}
				
			
		bool_t AComponentSimpleStatechartStateChart_isInState(
				AComponentSimpleStatechartStateChart* stateChart,
				AComponentSimpleStatechartState state) {
			return (stateChart->currentStateOfAComponentInit == state);
		
		}
		

