		// Standard library
		#include <stdlib.h>
		#include <stdio.h>
		#include "../RTSCs/rootapproacherCommunicatorRTSCStateChart.h"
		
		#include "approacherCommunicatorComponent.h"
		

		
	
		void ApproacherCommunicatorComponent_initialize(
				ApproacherCommunicatorComponent* component) {
		
			RootapproacherCommunicatorRTSCStateChart_initialize(component->stateChart);
		
			Port_initialize(component->informApproacherPPort);
		
			Port_initialize(component->limitDrivingPPort);
		
			Port_initialize(component->vehicleApproacherPPort);
		
			Port_initialize(component->colorApproacherPort);
		
		}
		

		ApproacherCommunicatorComponent* ApproacherCommunicatorComponent_create(void) {
		
			ApproacherCommunicatorComponent* component =
					(ApproacherCommunicatorComponent*) malloc(
							sizeof(ApproacherCommunicatorComponent));
		
			if (component != NULL) {
		
				component->informApproacherPPort = NULL;
				component->limitDrivingPPort = NULL;
				component->vehicleApproacherPPort = NULL;
				component->colorApproacherPort = NULL;
		
				component->stateChart = NULL;
		
			} else {
				fprintf(stderr,
						"Creation of ApproacherCommunicatorComponent failed.\n");
			}
		
			return component;
		}
		

		void ApproacherCommunicatorComponent_destroy(
				ApproacherCommunicatorComponent* component) {
			if (component != NULL) {
		
				Port_destroy(component->informApproacherPPort);
				Port_destroy(component->limitDrivingPPort);
				Port_destroy(component->vehicleApproacherPPort);
				Port_destroy(component->colorApproacherPort);
		
				//destroy stateChart
				RootapproacherCommunicatorRTSCStateChart_destroy(component->stateChart);
		
				//suicide
				free(component);
			}
		}
		
	
		bool_t ApproacherCommunicatorComponent_isTerminated(ApproacherCommunicatorComponent* component) {
				return 
						RootapproacherCommunicatorRTSCStateChart_isTerminated(component->stateChart);
			}
		
		void ApproacherCommunicatorComponent_processStep(ApproacherCommunicatorComponent* component) {
				
		
		
				RootapproacherCommunicatorRTSCStateChart_processStep(component->stateChart);
		}
	
		RootapproacherCommunicatorRTSCStateChart* ApproacherCommunicatorComponent_getStateMachine(ApproacherCommunicatorComponent* component) {
					return component->stateChart;
				} 
		
				Port* ApproacherCommunicatorComponent_getinformApproacherP(ApproacherCommunicatorComponent* component) {
					return component->informApproacherPPort;
				}
				Port* ApproacherCommunicatorComponent_getlimitDrivingP(ApproacherCommunicatorComponent* component) {
					return component->limitDrivingPPort;
				}
				Port* ApproacherCommunicatorComponent_getvehicleApproacherP(ApproacherCommunicatorComponent* component) {
					return component->vehicleApproacherPPort;
				}
				Port* ApproacherCommunicatorComponent_getcolorApproacher(ApproacherCommunicatorComponent* component) {
					return component->colorApproacherPort;
				}


		


