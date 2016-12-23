		// Standard library
		#include <stdlib.h>
		#include <stdio.h>
		#include "../RTSCs/rootovertakeeDriverRTSCStateChart.h"
		
		#include "overtakeeDriverComponent.h"
		

		
	
		void OvertakeeDriverComponent_initialize(OvertakeeDriverComponent* component) {
		
			RootovertakeeDriverRTSCStateChart_initialize(component->stateChart);
		
			Port_initialize(component->velocityGetterPPort);
		
			Port_initialize(component->velocityLPort);
		
			Port_initialize(component->velocityRPort);
		
			Port_initialize(component->lineOvertakeePort);
		
			Port_initialize(component->distanceOvertakeePort);
		
		}
		

		OvertakeeDriverComponent* OvertakeeDriverComponent_create(void) {
		
			OvertakeeDriverComponent* component = (OvertakeeDriverComponent*) malloc(
					sizeof(OvertakeeDriverComponent));
		
			if (component != NULL) {
		
				component->velocityGetterPPort = NULL;
				component->velocityLPort = NULL;
				component->velocityRPort = NULL;
				component->lineOvertakeePort = NULL;
				component->distanceOvertakeePort = NULL;
		
				component->stateChart = NULL;
		
			} else {
				fprintf(stderr, "Creation of OvertakeeDriverComponent failed.\n");
			}
		
			return component;
		}
		

		void OvertakeeDriverComponent_destroy(OvertakeeDriverComponent* component) {
			if (component != NULL) {
		
				Port_destroy(component->velocityGetterPPort);
				Port_destroy(component->velocityLPort);
				Port_destroy(component->velocityRPort);
				Port_destroy(component->lineOvertakeePort);
				Port_destroy(component->distanceOvertakeePort);
		
				//destroy stateChart
				RootovertakeeDriverRTSCStateChart_destroy(component->stateChart);
		
				//suicide
				free(component);
			}
		}
		
	
		bool_t OvertakeeDriverComponent_isTerminated(OvertakeeDriverComponent* component) {
				return 
						RootovertakeeDriverRTSCStateChart_isTerminated(component->stateChart);
			}
		
		void OvertakeeDriverComponent_processStep(OvertakeeDriverComponent* component) {
				
		
		
				RootovertakeeDriverRTSCStateChart_processStep(component->stateChart);
		}
	
		RootovertakeeDriverRTSCStateChart* OvertakeeDriverComponent_getStateMachine(OvertakeeDriverComponent* component) {
					return component->stateChart;
				} 
		
				Port* OvertakeeDriverComponent_getvelocityGetterP(OvertakeeDriverComponent* component) {
					return component->velocityGetterPPort;
				}
				Port* OvertakeeDriverComponent_getvelocityL(OvertakeeDriverComponent* component) {
					return component->velocityLPort;
				}
				Port* OvertakeeDriverComponent_getvelocityR(OvertakeeDriverComponent* component) {
					return component->velocityRPort;
				}
				Port* OvertakeeDriverComponent_getlineOvertakee(OvertakeeDriverComponent* component) {
					return component->lineOvertakeePort;
				}
				Port* OvertakeeDriverComponent_getdistanceOvertakee(OvertakeeDriverComponent* component) {
					return component->distanceOvertakeePort;
				}


		


