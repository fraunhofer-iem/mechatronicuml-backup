		// Standard library
		#include <stdlib.h>
		#include <stdio.h>
		#include "../RTSCs/rootLineStateChart.h"
		
		#include "lineComponent.h"
		

		
	
		void LineComponent_initialize(LineComponent* component) {
		
			RootLineStateChart_initialize(component->stateChart);
		
			Port_initialize(component->lineLightPort);
		
		}
		

		LineComponent* LineComponent_create(void) {
		
			LineComponent* component = (LineComponent*) malloc(sizeof(LineComponent));
		
			if (component != NULL) {
		
				component->lineLightPort = NULL;
		
				component->stateChart = NULL;
		
			} else {
				fprintf(stderr, "Creation of LineComponent failed.\n");
			}
		
			return component;
		}
		

		void LineComponent_destroy(LineComponent* component) {
			if (component != NULL) {
		
				Port_destroy(component->lineLightPort);
		
				//destroy stateChart
				RootLineStateChart_destroy(component->stateChart);
		
				//suicide
				free(component);
			}
		}
		
	
		bool_t LineComponent_isTerminated(LineComponent* component) {
				return 
						RootLineStateChart_isTerminated(component->stateChart);
			}
		
		void LineComponent_processStep(LineComponent* component) {
				
		
		
				RootLineStateChart_processStep(component->stateChart);
		}
	
		RootLineStateChart* LineComponent_getStateMachine(LineComponent* component) {
					return component->stateChart;
				} 
		
				Port* LineComponent_getlineLight(LineComponent* component) {
					return component->lineLightPort;
				}


		


