		// Standard library
		#include <stdlib.h>
		#include <stdio.h>
		#include "../RTSCs/rootapproacherDriverRTSCStateChart.h"
		
		#include "approacherDriverComponent.h"
		

		
	
		void ApproacherDriverComponent_initialize(
				ApproacherDriverComponent* component) {
		
			RootapproacherDriverRTSCStateChart_initialize(component->stateChart);
		
			Port_initialize(component->limiterPPort);
		
			Port_initialize(component->velocityLPort);
		
			Port_initialize(component->velocityRPort);
		
			Port_initialize(component->lineApproacherPort);
		
			Port_initialize(component->distancePort);
		
		}
		

		ApproacherDriverComponent* ApproacherDriverComponent_create(void) {
		
			ApproacherDriverComponent* component = (ApproacherDriverComponent*) malloc(
					sizeof(ApproacherDriverComponent));
		
			if (component != NULL) {
		
				component->limiterPPort = NULL;
				component->velocityLPort = NULL;
				component->velocityRPort = NULL;
				component->lineApproacherPort = NULL;
				component->distancePort = NULL;
		
				component->stateChart = NULL;
		
			} else {
				fprintf(stderr, "Creation of ApproacherDriverComponent failed.\n");
			}
		
			return component;
		}
		

		void ApproacherDriverComponent_destroy(ApproacherDriverComponent* component) {
			if (component != NULL) {
		
				Port_destroy(component->limiterPPort);
				Port_destroy(component->velocityLPort);
				Port_destroy(component->velocityRPort);
				Port_destroy(component->lineApproacherPort);
				Port_destroy(component->distancePort);
		
				//destroy stateChart
				RootapproacherDriverRTSCStateChart_destroy(component->stateChart);
		
				//suicide
				free(component);
			}
		}
		
	
		bool_t ApproacherDriverComponent_isTerminated(ApproacherDriverComponent* component) {
				return 
						RootapproacherDriverRTSCStateChart_isTerminated(component->stateChart);
			}
		
		void ApproacherDriverComponent_processStep(ApproacherDriverComponent* component) {
				
		
		
				RootapproacherDriverRTSCStateChart_processStep(component->stateChart);
		}
	
		RootapproacherDriverRTSCStateChart* ApproacherDriverComponent_getStateMachine(ApproacherDriverComponent* component) {
					return component->stateChart;
				} 
		
				Port* ApproacherDriverComponent_getlimiterP(ApproacherDriverComponent* component) {
					return component->limiterPPort;
				}
				Port* ApproacherDriverComponent_getvelocityL(ApproacherDriverComponent* component) {
					return component->velocityLPort;
				}
				Port* ApproacherDriverComponent_getvelocityR(ApproacherDriverComponent* component) {
					return component->velocityRPort;
				}
				Port* ApproacherDriverComponent_getlineApproacher(ApproacherDriverComponent* component) {
					return component->lineApproacherPort;
				}
				Port* ApproacherDriverComponent_getdistance(ApproacherDriverComponent* component) {
					return component->distancePort;
				}


		


