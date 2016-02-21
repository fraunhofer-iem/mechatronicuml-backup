		#include "../components/aComponentComponent_Interface.h"
		

		
	
		void AComponentComponent_initialize(AComponentComponent* component) {
		
			AComponentRootStatechartStateChart_initialize(component->stateChart);
		
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
				
		
		
					component->stateChart->AComponentRootStatechart_isExecutable = true;
					component->stateChart->AComponentInit_isExecutable = true;
				AComponentRootStatechartStateChart_processStep(component->stateChart);
		}
	
		AComponentRootStatechartStateChart* AComponentComponent_getStateMachine(AComponentComponent* component) {
					return component->stateChart;
				}

		

