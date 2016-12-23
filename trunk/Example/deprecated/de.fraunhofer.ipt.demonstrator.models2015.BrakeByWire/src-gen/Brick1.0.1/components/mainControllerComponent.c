		// Standard library
		#include <stdlib.h>
		#include <stdio.h>
		#include "../RTSCs/rootMainControllerCmpRTSCStateChart.h"
		
		#include "mainControllerComponent.h"
		

		
	
		void MainControllerComponent_initialize(MainControllerComponent* component) {
		
			RootMainControllerCmpRTSCStateChart_initialize(component->stateChart);
		
			Port_initialize(component->drivingControllerPortPort);
		
			Port_initialize(component->loadingControllerPortPort);
		
			Port_initialize(component->pickingUpControllerPortPort);
		
			Port_initialize(component->colorPortPort);
		
		}
		

		MainControllerComponent* MainControllerComponent_create(void) {
		
			MainControllerComponent* component = (MainControllerComponent*) malloc(
					sizeof(MainControllerComponent));
		
			if (component != NULL) {
		
				component->drivingControllerPortPort = NULL;
				component->loadingControllerPortPort = NULL;
				component->pickingUpControllerPortPort = NULL;
				component->colorPortPort = NULL;
		
				component->stateChart = NULL;
		
			} else {
				fprintf(stderr, "Creation of MainControllerComponent failed.\n");
			}
		
			return component;
		}
		

		void MainControllerComponent_destroy(MainControllerComponent* component) {
			if (component != NULL) {
		
				Port_destroy(component->drivingControllerPortPort);
				Port_destroy(component->loadingControllerPortPort);
				Port_destroy(component->pickingUpControllerPortPort);
				Port_destroy(component->colorPortPort);
		
				//destroy stateChart
				RootMainControllerCmpRTSCStateChart_destroy(component->stateChart);
		
				//suicide
				free(component);
			}
		}
		
	
		bool_t MainControllerComponent_isTerminated(MainControllerComponent* component) {
				return 
						RootMainControllerCmpRTSCStateChart_isTerminated(component->stateChart);
			}
		
		void MainControllerComponent_processStep(MainControllerComponent* component) {
				
		
		
				RootMainControllerCmpRTSCStateChart_processStep(component->stateChart);
		}
	
		RootMainControllerCmpRTSCStateChart* MainControllerComponent_getStateMachine(MainControllerComponent* component) {
					return component->stateChart;
				} 
		
				Port* MainControllerComponent_getDrivingControllerPort(MainControllerComponent* component) {
					return component->drivingControllerPortPort;
				}
				Port* MainControllerComponent_getLoadingControllerPort(MainControllerComponent* component) {
					return component->loadingControllerPortPort;
				}
				Port* MainControllerComponent_getPickingUpControllerPort(MainControllerComponent* component) {
					return component->pickingUpControllerPortPort;
				}
				Port* MainControllerComponent_getColorPort(MainControllerComponent* component) {
					return component->colorPortPort;
				}


		


