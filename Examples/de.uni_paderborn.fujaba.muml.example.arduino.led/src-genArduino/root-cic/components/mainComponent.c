		// Standard library
		#include <stdlib.h>
		#include <stdio.h>
		#include "../RTSCs/mainRootRTSCStateChart.h"
		
		#include "mainComponent.h"
		

		
	
		void MainComponent_initialize(MainComponent* component) {
		
			MainRootRTSCStateChart_initialize(component->stateChart);
		
		}
		

		MainComponent* MainComponent_create(void) {
		
			MainComponent* component = (MainComponent*) malloc(sizeof(MainComponent));
		
			if (component != NULL) {
		
				component->stateChart = NULL;
		
			} else {
				fprintf(stderr, "Creation of MainComponent failed.\n");
			}
		
			return component;
		}
		

		void MainComponent_destroy(MainComponent* component) {
			if (component != NULL) {
		
				//suicide
				free(component);
			}
		}
		
	
		bool_t MainComponent_isTerminated(MainComponent* component) {
				return 
						MainRootRTSCStateChart_isTerminated(component->stateChart);
			}
		
		void MainComponent_processStep(MainComponent* component) {
				
		
		
					component->stateChart->MainRootRTSC_isExecutable = true;
					component->stateChart->MainInit_isExecutable = true;
				MainRootRTSCStateChart_processStep(component->stateChart);
					component->setterOf_LED_voltage(component->stateChart->lED_voltage);
		}
	
		MainRootRTSCStateChart* MainComponent_getStateMachine(MainComponent* component) {
					return component->stateChart;
				}

		

