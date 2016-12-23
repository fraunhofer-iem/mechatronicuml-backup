		// Standard library
		#include <stdlib.h>
		#include <stdio.h>
		#include "../RTSCs/rootovertakerDriverRTSCStateChart.h"
		
		#include "overtakerDriverComponent.h"
		

		
	
		void OvertakerDriverComponent_initialize(OvertakerDriverComponent* component) {
		
			RootovertakerDriverRTSCStateChart_initialize(component->stateChart);
		
			Port_initialize(component->initiatorPPort);
		
			Port_initialize(component->velocityRPort);
		
			Port_initialize(component->velocityLPort);
		
			Port_initialize(component->distancePort);
		
			Port_initialize(component->linePort);
		
		}
		

		OvertakerDriverComponent* OvertakerDriverComponent_create(void) {
		
			OvertakerDriverComponent* component = (OvertakerDriverComponent*) malloc(
					sizeof(OvertakerDriverComponent));
		
			if (component != NULL) {
		
				component->initiatorPPort = NULL;
				component->velocityRPort = NULL;
				component->velocityLPort = NULL;
				component->distancePort = NULL;
				component->linePort = NULL;
		
				component->stateChart = NULL;
		
			} else {
				fprintf(stderr, "Creation of OvertakerDriverComponent failed.\n");
			}
		
			return component;
		}
		

		void OvertakerDriverComponent_destroy(OvertakerDriverComponent* component) {
			if (component != NULL) {
		
				Port_destroy(component->initiatorPPort);
				Port_destroy(component->velocityRPort);
				Port_destroy(component->velocityLPort);
				Port_destroy(component->distancePort);
				Port_destroy(component->linePort);
		
				//destroy stateChart
				RootovertakerDriverRTSCStateChart_destroy(component->stateChart);
		
				//suicide
				free(component);
			}
		}
		
	
		bool_t OvertakerDriverComponent_isTerminated(OvertakerDriverComponent* component) {
				return 
						RootovertakerDriverRTSCStateChart_isTerminated(component->stateChart);
			}
		
		void OvertakerDriverComponent_processStep(OvertakerDriverComponent* component) {
				
		
		
				RootovertakerDriverRTSCStateChart_processStep(component->stateChart);
		}
	
		RootovertakerDriverRTSCStateChart* OvertakerDriverComponent_getStateMachine(OvertakerDriverComponent* component) {
					return component->stateChart;
				} 
		
				Port* OvertakerDriverComponent_getinitiatorP(OvertakerDriverComponent* component) {
					return component->initiatorPPort;
				}
				Port* OvertakerDriverComponent_getvelocityR(OvertakerDriverComponent* component) {
					return component->velocityRPort;
				}
				Port* OvertakerDriverComponent_getvelocityL(OvertakerDriverComponent* component) {
					return component->velocityLPort;
				}
				Port* OvertakerDriverComponent_getdistance(OvertakerDriverComponent* component) {
					return component->distancePort;
				}
				Port* OvertakerDriverComponent_getline(OvertakerDriverComponent* component) {
					return component->linePort;
				}


		


