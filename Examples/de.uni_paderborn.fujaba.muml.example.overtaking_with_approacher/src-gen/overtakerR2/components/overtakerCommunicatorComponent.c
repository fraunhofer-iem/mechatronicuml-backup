		// Standard library
		#include <stdlib.h>
		#include <stdio.h>
		#include "../RTSCs/rootovertakerCommunicatorRTSCStateChart.h"
		
		#include "overtakerCommunicatorComponent.h"
		

		
	
		void OvertakerCommunicatorComponent_initialize(
				OvertakerCommunicatorComponent* component) {
		
			RootovertakerCommunicatorRTSCStateChart_initialize(component->stateChart);
		
			Port_initialize(component->overtakerPPort);
		
			Port_initialize(component->vehicleOvertakerPPort);
		
			Port_initialize(component->executorPPort);
		
			Port_initialize(component->requestorPPort);
		
			Port_initialize(component->colorPort);
		
		}
		

		OvertakerCommunicatorComponent* OvertakerCommunicatorComponent_create(void) {
		
			OvertakerCommunicatorComponent* component =
					(OvertakerCommunicatorComponent*) malloc(
							sizeof(OvertakerCommunicatorComponent));
		
			if (component != NULL) {
		
				component->overtakerPPort = NULL;
				component->vehicleOvertakerPPort = NULL;
				component->executorPPort = NULL;
				component->requestorPPort = NULL;
				component->colorPort = NULL;
		
				component->stateChart = NULL;
		
			} else {
				fprintf(stderr, "Creation of OvertakerCommunicatorComponent failed.\n");
			}
		
			return component;
		}
		

		void OvertakerCommunicatorComponent_destroy(
				OvertakerCommunicatorComponent* component) {
			if (component != NULL) {
		
				Port_destroy(component->overtakerPPort);
				Port_destroy(component->vehicleOvertakerPPort);
				Port_destroy(component->executorPPort);
				Port_destroy(component->requestorPPort);
				Port_destroy(component->colorPort);
		
				//destroy stateChart
				RootovertakerCommunicatorRTSCStateChart_destroy(component->stateChart);
		
				//suicide
				free(component);
			}
		}
		
	
		bool_t OvertakerCommunicatorComponent_isTerminated(OvertakerCommunicatorComponent* component) {
				return 
						RootovertakerCommunicatorRTSCStateChart_isTerminated(component->stateChart);
			}
		
		void OvertakerCommunicatorComponent_processStep(OvertakerCommunicatorComponent* component) {
				
		
		
				RootovertakerCommunicatorRTSCStateChart_processStep(component->stateChart);
		}
	
		RootovertakerCommunicatorRTSCStateChart* OvertakerCommunicatorComponent_getStateMachine(OvertakerCommunicatorComponent* component) {
					return component->stateChart;
				} 
		
				Port* OvertakerCommunicatorComponent_getovertakerP(OvertakerCommunicatorComponent* component) {
					return component->overtakerPPort;
				}
				Port* OvertakerCommunicatorComponent_getvehicleOvertakerP(OvertakerCommunicatorComponent* component) {
					return component->vehicleOvertakerPPort;
				}
				Port* OvertakerCommunicatorComponent_getexecutorP(OvertakerCommunicatorComponent* component) {
					return component->executorPPort;
				}
				Port* OvertakerCommunicatorComponent_getrequestorP(OvertakerCommunicatorComponent* component) {
					return component->requestorPPort;
				}
				Port* OvertakerCommunicatorComponent_getcolor(OvertakerCommunicatorComponent* component) {
					return component->colorPort;
				}


		


