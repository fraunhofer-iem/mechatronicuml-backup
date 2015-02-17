		// Standard library
		#include <stdlib.h>
		#include <stdio.h>
		#include "../RTSCs/rootMotorStateChart.h"
		
		#include "motorComponent.h"
		

		
	
		void MotorComponent_initialize(MotorComponent* component) {
		
			RootMotorStateChart_initialize(component->stateChart);
		
			Port_initialize(component->velocityPort);
		
		}
		

		MotorComponent* MotorComponent_create(void) {
		
			MotorComponent* component = (MotorComponent*) malloc(
					sizeof(MotorComponent));
		
			if (component != NULL) {
		
				component->velocityPort = NULL;
		
				component->stateChart = NULL;
		
			} else {
				fprintf(stderr, "Creation of MotorComponent failed.\n");
			}
		
			return component;
		}
		

		void MotorComponent_destroy(MotorComponent* component) {
			if (component != NULL) {
		
				Port_destroy(component->velocityPort);
		
				//destroy stateChart
				RootMotorStateChart_destroy(component->stateChart);
		
				//suicide
				free(component);
			}
		}
		
	
		bool_t MotorComponent_isTerminated(MotorComponent* component) {
				return 
						RootMotorStateChart_isTerminated(component->stateChart);
			}
		
		void MotorComponent_processStep(MotorComponent* component) {
				
		
		
				RootMotorStateChart_processStep(component->stateChart);
		}
	
		RootMotorStateChart* MotorComponent_getStateMachine(MotorComponent* component) {
					return component->stateChart;
				} 
		
				Port* MotorComponent_getvelocity(MotorComponent* component) {
					return component->velocityPort;
				}


		


