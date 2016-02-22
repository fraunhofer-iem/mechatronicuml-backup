		// Standard library
		#include <stdlib.h>
		#include <stdio.h>
		#include "../RTSCs/rootColorStateChart.h"
		
		#include "colorComponent.h"
		

		
	
		void ColorComponent_initialize(ColorComponent* component) {
		
			RootColorStateChart_initialize(component->stateChart);
		
			Port_initialize(component->colorPort);
		
		}
		

		ColorComponent* ColorComponent_create(void) {
		
			ColorComponent* component = (ColorComponent*) malloc(
					sizeof(ColorComponent));
		
			if (component != NULL) {
		
				component->colorPort = NULL;
		
				component->stateChart = NULL;
		
			} else {
				fprintf(stderr, "Creation of ColorComponent failed.\n");
			}
		
			return component;
		}
		

		void ColorComponent_destroy(ColorComponent* component) {
			if (component != NULL) {
		
				Port_destroy(component->colorPort);
		
				//destroy stateChart
				RootColorStateChart_destroy(component->stateChart);
		
				//suicide
				free(component);
			}
		}
		
	
		bool_t ColorComponent_isTerminated(ColorComponent* component) {
				return 
						RootColorStateChart_isTerminated(component->stateChart);
			}
		
		void ColorComponent_processStep(ColorComponent* component) {
				
		
		
				RootColorStateChart_processStep(component->stateChart);
		}
	
		RootColorStateChart* ColorComponent_getStateMachine(ColorComponent* component) {
					return component->stateChart;
				} 
		
				Port* ColorComponent_getcolor(ColorComponent* component) {
					return component->colorPort;
				}


		


