

		#include "../components/aComponentComponent_Interface.h"
		



		void initializeAComponentInitRegion(AComponentBehaviorStateChart* stateChart) {
		
			stateChart->currentStateOfAComponentInit = STATE_ACOMPONENTINITSTART;
		
			// execute entry actions
			// nothing to do
		
			stateChart->AComponentInit_isExecutable = true;
		
		}
		void initializeAComponentInitCompositeRegion(
				AComponentBehaviorStateChart* stateChart) {
		
			stateChart->currentStateOfAComponentInitComposite =
					STATE_ACOMPONENTINITCOMPOSITEINNER1;
		
			// execute entry actions
		
			stateChart->i = 3;
		
			;
		
			initializeAComponentInitCompositeInner1Region(stateChart);
			stateChart->AComponentInitComposite_isExecutable = true;
		
		}
		void initializeAComponentInitCompositeInner1Region(
				AComponentBehaviorStateChart* stateChart) {
		
			stateChart->currentStateOfAComponentInitCompositeInner1 =
					STATE_ACOMPONENTINITCOMPOSITEINNER1SOMESTATE;
		
			// execute entry actions
		
			stateChart->i = 4;
		
			;
		
			stateChart->AComponentInitCompositeInner1_isExecutable = true;
		
		}
		
		void AComponentBehaviorStateChart_initialize(
				AComponentBehaviorStateChart* stateChart) {
			//initialize clocks
		
			//initialize hybrid ports
		
			//initialize variables of the root statechart
			stateChart->i = stateChart->i = 0;
			;
		
			//initialize init state
			stateChart->currentStateOfAComponentBehavior = STATE_ACOMPONENTINIT;
		
			// execute entry actions
		
			// nothing to do
		
			initializeAComponentInitRegion(stateChart);
		}
		
		

		AComponentBehaviorStateChart* AComponentBehaviorStateChart_create(
				AComponentComponent* parentComponent) {
			AComponentBehaviorStateChart* stateChart =
					(AComponentBehaviorStateChart*) malloc(
							sizeof(AComponentBehaviorStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
				if (stateChart->parentComponent != NULL) {
					AComponentBehaviorStateChart_initialize(stateChart);
				} else {
		
					AComponentBehaviorStateChart_destroy(stateChart);
					stateChart = NULL;
				}
			} else {
		
			}
			return stateChart;
		}
		

			void AComponentBehaviorStateChart_destroy(AComponentBehaviorStateChart* stateChart) {
				if(stateChart != NULL) {
		
		
					free(stateChart);
				}
			}


		
		void AComponentInitCompositeInner1StateChart_processStep(
				AComponentBehaviorStateChart* stateChart) {
			switch (stateChart->currentStateOfAComponentInitCompositeInner1) {
			case STATE_ACOMPONENTINITCOMPOSITEINNER1SOMESTATE:
				if (1
		
				) {
		
					// execute exit actions
					stateChart->i = 5;
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
					//release all created sent events
					// change the state
		
					stateChart->i = 6;
		
					AComponentInitCompositeInner1StateChart_exit(stateChart);
		
					stateChart->currentStateOfAComponentInitCompositeInner1 =
							ACOMPONENTBEHAVIOR_INACTIVE;
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->i = 7;
		
					AComponentInitCompositeStateChart_exit(stateChart);
		
					stateChart->currentStateOfAComponentInitComposite =
							ACOMPONENTBEHAVIOR_INACTIVE;
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfAComponentInit = STATE_ACOMPONENTINITEND;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfAComponentInit switched state to STATE_ACOMPONENTINITEND" );
		
		#endif		
		
					// execute entry actions
		
					stateChart->i = 8;
		
					;
		
				} else {
		
				}
				break;
			default:
				break;
			}
			stateChart->AComponentInitCompositeInner1_isExecutable = false;
		}
		
		void AComponentInitCompositeStateChart_processStep(
				AComponentBehaviorStateChart* stateChart) {
			switch (stateChart->currentStateOfAComponentInitComposite) {
			case STATE_ACOMPONENTINITCOMPOSITEINNER1:
		
				if (stateChart->AComponentInitCompositeInner1_isExecutable)
					AComponentInitCompositeInner1StateChart_processStep(stateChart);
		
				break;
			default:
				break;
			}
			stateChart->AComponentInitComposite_isExecutable = false;
		}
		
		void AComponentInitStateChart_processStep(
				AComponentBehaviorStateChart* stateChart) {
			switch (stateChart->currentStateOfAComponentInit) {
			case STATE_ACOMPONENTINITSTART:
				if (1
		
				) {
		
					// execute exit actions
		
					stateChart->i = 1;
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfAComponentInit =
							STATE_ACOMPONENTINITCOMPOSITE;
		
					// execute entry actions
		
					stateChart->i = 2;
		
					;
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfAComponentInitComposite =
							STATE_ACOMPONENTINITCOMPOSITEINNER1;
		
					// execute entry actions
		
					stateChart->i = 3;
		
					;
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfAComponentInitCompositeInner1 =
							STATE_ACOMPONENTINITCOMPOSITEINNER1SOMESTATE;
		
		#ifdef DEBUG
		
					printDebugInformation("currentStateOfAComponentInitCompositeInner1 switched state to STATE_ACOMPONENTINITCOMPOSITEINNER1SOMESTATE" );
		
		#endif		
		
					// execute entry actions
		
					stateChart->i = 4;
		
					;
		
				} else {
		
				}
				break;
			case STATE_ACOMPONENTINITCOMPOSITE:
		
				if (stateChart->AComponentInitComposite_isExecutable)
					AComponentInitCompositeStateChart_processStep(stateChart);
		
				break;
			case STATE_ACOMPONENTINITEND:
		
				break;
			default:
				break;
			}
			stateChart->AComponentInit_isExecutable = false;
		}
		
		void AComponentBehaviorStateChart_processStep(
				AComponentBehaviorStateChart* stateChart) {
			switch (stateChart->currentStateOfAComponentBehavior) {
			case STATE_ACOMPONENTINIT:
		
				if (stateChart->AComponentInit_isExecutable)
					AComponentInitStateChart_processStep(stateChart);
		
				break;
			default:
				break;
			}
			stateChart->AComponentBehavior_isExecutable = false;
		}
		
		
		void AComponentInitCompositeInner1StateChart_exit(
				AComponentBehaviorStateChart* stateChart) {
			switch (stateChart->currentStateOfAComponentInitCompositeInner1) {
			case STATE_ACOMPONENTINITCOMPOSITEINNER1SOMESTATE:
				stateChart->i = 5;
		
				break;
			default:
				break;
			}
			stateChart->currentStateOfAComponentInitCompositeInner1 =
					ACOMPONENTBEHAVIOR_INACTIVE;
		}
		void AComponentInitCompositeStateChart_exit(
				AComponentBehaviorStateChart* stateChart) {
			switch (stateChart->currentStateOfAComponentInitComposite) {
			case STATE_ACOMPONENTINITCOMPOSITEINNER1:
				stateChart->i = 6;
		
				AComponentInitCompositeInner1StateChart_exit(stateChart);
		
				stateChart->currentStateOfAComponentInitCompositeInner1 =
						ACOMPONENTBEHAVIOR_INACTIVE;
		
				break;
			default:
				break;
			}
			stateChart->currentStateOfAComponentInitComposite =
					ACOMPONENTBEHAVIOR_INACTIVE;
		}
		void AComponentInitStateChart_exit(AComponentBehaviorStateChart* stateChart) {
			switch (stateChart->currentStateOfAComponentInit) {
			case STATE_ACOMPONENTINITSTART:
				stateChart->i = 1;
		
				break;
			case STATE_ACOMPONENTINITCOMPOSITE:
				stateChart->i = 7;
		
				AComponentInitCompositeStateChart_exit(stateChart);
		
				stateChart->currentStateOfAComponentInitComposite =
						ACOMPONENTBEHAVIOR_INACTIVE;
		
				break;
			case STATE_ACOMPONENTINITEND:
				// nothing to do
		
				break;
			default:
				break;
			}
			stateChart->currentStateOfAComponentInit = ACOMPONENTBEHAVIOR_INACTIVE;
		}
				
			
		bool_t AComponentBehaviorStateChart_isInState(
				AComponentBehaviorStateChart* stateChart,
				AComponentBehaviorState state) {
			return (stateChart->currentStateOfAComponentInitCompositeInner1 == state
					|| stateChart->currentStateOfAComponentInitComposite == state
					|| stateChart->currentStateOfAComponentInit == state);
		
		}
		

