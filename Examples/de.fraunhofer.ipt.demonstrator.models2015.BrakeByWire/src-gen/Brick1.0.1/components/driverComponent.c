		// Standard library
		#include <stdlib.h>
		#include <stdio.h>
		#include "../RTSCs/rootDriverCmpRTSCStateChart.h"
		
		#include "driverComponent.h"
		

		
	
		void DriverComponent_initialize(DriverComponent* component) {
		
			RootDriverCmpRTSCStateChart_initialize(component->stateChart);
		
			Port_initialize(component->driverPortPort);
		
			Port_initialize(component->motorRightPortPort);
		
			Port_initialize(component->motorLeftPortPort);
		
			Port_initialize(component->lineLeaderPortPort);
		
		}
		

		DriverComponent* DriverComponent_create(void) {
		
			DriverComponent* component = (DriverComponent*) malloc(
					sizeof(DriverComponent));
		
			if (component != NULL) {
		
				component->driverPortPort = NULL;
				component->motorRightPortPort = NULL;
				component->motorLeftPortPort = NULL;
				component->lineLeaderPortPort = NULL;
		
				component->stateChart = NULL;
		
			} else {
				fprintf(stderr, "Creation of DriverComponent failed.\n");
			}
		
			return component;
		}
		

		void DriverComponent_destroy(DriverComponent* component) {
			if (component != NULL) {
		
				Port_destroy(component->driverPortPort);
				Port_destroy(component->motorRightPortPort);
				Port_destroy(component->motorLeftPortPort);
				Port_destroy(component->lineLeaderPortPort);
		
				//destroy stateChart
				RootDriverCmpRTSCStateChart_destroy(component->stateChart);
		
				//suicide
				free(component);
			}
		}
		
	
		bool_t DriverComponent_isTerminated(DriverComponent* component) {
				return 
						RootDriverCmpRTSCStateChart_isTerminated(component->stateChart);
			}
		
		void DriverComponent_processStep(DriverComponent* component) {
				
		
		
				RootDriverCmpRTSCStateChart_processStep(component->stateChart);
		}
	
		RootDriverCmpRTSCStateChart* DriverComponent_getStateMachine(DriverComponent* component) {
					return component->stateChart;
				} 
		
				Port* DriverComponent_getDriverPort(DriverComponent* component) {
					return component->driverPortPort;
				}
				Port* DriverComponent_getMotorRightPort(DriverComponent* component) {
					return component->motorRightPortPort;
				}
				Port* DriverComponent_getMotorLeftPort(DriverComponent* component) {
					return component->motorLeftPortPort;
				}
				Port* DriverComponent_getLineLeaderPort(DriverComponent* component) {
					return component->lineLeaderPortPort;
				}


		


