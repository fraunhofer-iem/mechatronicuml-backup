		// Standard library
		#include <stdlib.h>
		#include <stdio.h>
		#include "../RTSCs/rootDistanceStateChart.h"
		
		#include "distanceComponent.h"
		

		
	
		void DistanceComponent_initialize(DistanceComponent* component) {
		
			RootDistanceStateChart_initialize(component->stateChart);
		
			Port_initialize(component->distancePort);
		
		}
		

		DistanceComponent* DistanceComponent_create(void) {
		
			DistanceComponent* component = (DistanceComponent*) malloc(
					sizeof(DistanceComponent));
		
			if (component != NULL) {
		
				component->distancePort = NULL;
		
				component->stateChart = NULL;
		
			} else {
				fprintf(stderr, "Creation of DistanceComponent failed.\n");
			}
		
			return component;
		}
		

		void DistanceComponent_destroy(DistanceComponent* component) {
			if (component != NULL) {
		
				Port_destroy(component->distancePort);
		
				//destroy stateChart
				RootDistanceStateChart_destroy(component->stateChart);
		
				//suicide
				free(component);
			}
		}
		
	
		bool_t DistanceComponent_isTerminated(DistanceComponent* component) {
				return 
						RootDistanceStateChart_isTerminated(component->stateChart);
			}
		
		void DistanceComponent_processStep(DistanceComponent* component) {
				
		
		
				RootDistanceStateChart_processStep(component->stateChart);
		}
	
		RootDistanceStateChart* DistanceComponent_getStateMachine(DistanceComponent* component) {
					return component->stateChart;
				} 
		
				Port* DistanceComponent_getdistance(DistanceComponent* component) {
					return component->distancePort;
				}


		


