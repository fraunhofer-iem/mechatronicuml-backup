		// Standard library
		#include <stdlib.h>
		#include <stdio.h>
		#include "../RTSCs/rootovertakeeCommunicatorRTSCStateChart.h"
		
		#include "overtakeeCommunicatorComponent.h"
		

		
	
		void OvertakeeCommunicatorComponent_initialize(
				OvertakeeCommunicatorComponent* component) {
		
			RootovertakeeCommunicatorRTSCStateChart_initialize(component->stateChart);
		
			Port_initialize(component->overtakeePPort);
		
			Port_initialize(component->vehicleOvertakeePPort);
		
			Port_initialize(component->velocitySetterPPort);
		
			Port_initialize(component->informOvertakeePort);
		
			Port_initialize(component->colorOvertakeePort);
		
		}
		

		OvertakeeCommunicatorComponent* OvertakeeCommunicatorComponent_create(void) {
		
			OvertakeeCommunicatorComponent* component =
					(OvertakeeCommunicatorComponent*) malloc(
							sizeof(OvertakeeCommunicatorComponent));
		
			if (component != NULL) {
		
				component->overtakeePPort = NULL;
				component->vehicleOvertakeePPort = NULL;
				component->velocitySetterPPort = NULL;
				component->informOvertakeePort = NULL;
				component->colorOvertakeePort = NULL;
		
				component->stateChart = NULL;
		
			} else {
				fprintf(stderr, "Creation of OvertakeeCommunicatorComponent failed.\n");
			}
		
			return component;
		}
		

		void OvertakeeCommunicatorComponent_destroy(
				OvertakeeCommunicatorComponent* component) {
			if (component != NULL) {
		
				Port_destroy(component->overtakeePPort);
				Port_destroy(component->vehicleOvertakeePPort);
				Port_destroy(component->velocitySetterPPort);
				Port_destroy(component->informOvertakeePort);
				Port_destroy(component->colorOvertakeePort);
		
				//destroy stateChart
				RootovertakeeCommunicatorRTSCStateChart_destroy(component->stateChart);
		
				//suicide
				free(component);
			}
		}
		
	
		bool_t OvertakeeCommunicatorComponent_isTerminated(OvertakeeCommunicatorComponent* component) {
				return 
						RootovertakeeCommunicatorRTSCStateChart_isTerminated(component->stateChart);
			}
		
		void OvertakeeCommunicatorComponent_processStep(OvertakeeCommunicatorComponent* component) {
				
		
		
				RootovertakeeCommunicatorRTSCStateChart_processStep(component->stateChart);
		}
	
		RootovertakeeCommunicatorRTSCStateChart* OvertakeeCommunicatorComponent_getStateMachine(OvertakeeCommunicatorComponent* component) {
					return component->stateChart;
				} 
		
				Port* OvertakeeCommunicatorComponent_getovertakeeP(OvertakeeCommunicatorComponent* component) {
					return component->overtakeePPort;
				}
				Port* OvertakeeCommunicatorComponent_getvehicleOvertakeeP(OvertakeeCommunicatorComponent* component) {
					return component->vehicleOvertakeePPort;
				}
				Port* OvertakeeCommunicatorComponent_getvelocitySetterP(OvertakeeCommunicatorComponent* component) {
					return component->velocitySetterPPort;
				}
				Port* OvertakeeCommunicatorComponent_getinformOvertakee(OvertakeeCommunicatorComponent* component) {
					return component->informOvertakeePort;
				}
				Port* OvertakeeCommunicatorComponent_getcolorOvertakee(OvertakeeCommunicatorComponent* component) {
					return component->colorOvertakeePort;
				}


		


