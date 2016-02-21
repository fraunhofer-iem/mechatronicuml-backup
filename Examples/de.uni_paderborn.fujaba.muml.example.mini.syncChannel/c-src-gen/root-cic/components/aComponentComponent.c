		#include "../components/aComponentComponent_Interface.h"
		

		
	
		void AComponentComponent_initialize(AComponentComponent* component) {
		
			AComponentTestSyncStateChart_initialize(component->stateChart);
		
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
				
		
		
					component->stateChart->AComponentTestSync_isExecutable = true;
					component->stateChart->AComponentInitRegion_1_isExecutable = true;
					component->stateChart->AComponentInitRegion_2_isExecutable = true;
				AComponentTestSyncStateChart_processStep(component->stateChart);
		}
	
		AComponentTestSyncStateChart* AComponentComponent_getStateMachine(AComponentComponent* component) {
					return component->stateChart;
				}

		

