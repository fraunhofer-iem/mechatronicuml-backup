		#include "../components/aComponentComponent_Interface.h"
		

		
	
		void AComponentComponent_initialize(AComponentComponent* component) {
		
			AComponentBehaviorStateChart_initialize(component->stateChart);
		
		}
		

		AComponentComponent* AComponentComponent_create(void) {
		
			AComponentComponent* component = (AComponentComponent*) malloc(
					sizeof(AComponentComponent));
		
			if (component != NULL) {
		
				component->stateChart = NULL;
		
			} else {
		
			}
		
			return component;
		}
		

		void AComponentComponent_destroy(AComponentComponent* component) {
			if (component != NULL) {
		
				//suicide
				free(component);
			}
		}
		
		
		void AComponentComponent_processStep(AComponentComponent* component) {
				
		
		
					component->stateChart->AComponentBehavior_isExecutable = true;
					component->stateChart->AComponentInit_isExecutable = true;
					component->stateChart->AComponentInitComposite_isExecutable = true;
					component->stateChart->AComponentInitCompositeInner1_isExecutable = true;
				AComponentBehaviorStateChart_processStep(component->stateChart);
		}
	
		AComponentBehaviorStateChart* AComponentComponent_getStateMachine(AComponentComponent* component) {
					return component->stateChart;
				}

		

