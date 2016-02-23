		#include "../components/mainComponent_Interface.h"
		

		
	
		void MainComponent_initialize(MainComponent* component) {
		
			MainRootRTSCStateChart_initialize(component->stateChart);
		
		}
		

		MainComponent* MainComponent_create(void) {
		
			MainComponent* component = (MainComponent*) malloc(sizeof(MainComponent));
		
			if (component != NULL) {
		
				component->stateChart = NULL;
		
			} else {
		
			}
		
			return component;
		}
		

		void MainComponent_destroy(MainComponent* component) {
			if (component != NULL) {
		
				//suicide
				free(component);
			}
		}
		
		
		void MainComponent_processStep(MainComponent* component) {
				
		
		
					component->stateChart->MainRootRTSC_isExecutable = true;
					component->stateChart->MainInit_isExecutable = true;
				MainRootRTSCStateChart_processStep(component->stateChart);
					component->setterOf_LED_voltage(component->stateChart->LED_voltage);
		}
	
		MainRootRTSCStateChart* MainComponent_getStateMachine(MainComponent* component) {
					return component->stateChart;
				}

		

