		// Standard library
		#include <stdlib.h>
		#include <stdio.h>
		#include "../RTSCs/rootPickUpBotCmpRTSCStateChart.h"
		
		#include "pickUpBotComponent.h"
		

		
	
		void PickUpBotComponent_initialize(PickUpBotComponent* component) {
		
			RootPickUpBotCmpRTSCStateChart_initialize(component->stateChart);
		
			Port_initialize(component->pickUpBotPortPort);
		
		}
		

		PickUpBotComponent* PickUpBotComponent_create(void) {
		
			PickUpBotComponent* component = (PickUpBotComponent*) malloc(
					sizeof(PickUpBotComponent));
		
			if (component != NULL) {
		
				component->pickUpBotPortPort = NULL;
		
				component->stateChart = NULL;
		
			} else {
				fprintf(stderr, "Creation of PickUpBotComponent failed.\n");
			}
		
			return component;
		}
		

		void PickUpBotComponent_destroy(PickUpBotComponent* component) {
			if (component != NULL) {
		
				Port_destroy(component->pickUpBotPortPort);
		
				//destroy stateChart
				RootPickUpBotCmpRTSCStateChart_destroy(component->stateChart);
		
				//suicide
				free(component);
			}
		}
		
	
		bool_t PickUpBotComponent_isTerminated(PickUpBotComponent* component) {
				return 
						RootPickUpBotCmpRTSCStateChart_isTerminated(component->stateChart);
			}
		
		void PickUpBotComponent_processStep(PickUpBotComponent* component) {
				
		
		
				RootPickUpBotCmpRTSCStateChart_processStep(component->stateChart);
		}
	
		RootPickUpBotCmpRTSCStateChart* PickUpBotComponent_getStateMachine(PickUpBotComponent* component) {
					return component->stateChart;
				} 
		
				Port* PickUpBotComponent_getPickUpBotPort(PickUpBotComponent* component) {
					return component->pickUpBotPortPort;
				}


		


