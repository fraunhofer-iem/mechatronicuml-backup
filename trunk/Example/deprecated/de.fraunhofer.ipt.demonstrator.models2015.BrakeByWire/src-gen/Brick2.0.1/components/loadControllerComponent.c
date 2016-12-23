		// Standard library
		#include <stdlib.h>
		#include <stdio.h>
		#include "../RTSCs/rootLoadControllerCmpRTSCStateChart.h"
		
		#include "loadControllerComponent.h"
		

		
	
		void LoadControllerComponent_initialize(LoadControllerComponent* component) {
		
			RootLoadControllerCmpRTSCStateChart_initialize(component->stateChart);
		
			Port_initialize(component->loaderPortPort);
		
			Port_initialize(component->touchPortPort);
		
		}
		

		LoadControllerComponent* LoadControllerComponent_create(void) {
		
			LoadControllerComponent* component = (LoadControllerComponent*) malloc(
					sizeof(LoadControllerComponent));
		
			if (component != NULL) {
		
				component->loaderPortPort = NULL;
				component->touchPortPort = NULL;
		
				component->stateChart = NULL;
		
			} else {
				fprintf(stderr, "Creation of LoadControllerComponent failed.\n");
			}
		
			return component;
		}
		

		void LoadControllerComponent_destroy(LoadControllerComponent* component) {
			if (component != NULL) {
		
				Port_destroy(component->loaderPortPort);
				Port_destroy(component->touchPortPort);
		
				//destroy stateChart
				RootLoadControllerCmpRTSCStateChart_destroy(component->stateChart);
		
				//suicide
				free(component);
			}
		}
		
	
		bool_t LoadControllerComponent_isTerminated(LoadControllerComponent* component) {
				return 
						RootLoadControllerCmpRTSCStateChart_isTerminated(component->stateChart);
			}
		
		void LoadControllerComponent_processStep(LoadControllerComponent* component) {
				
		
		
				RootLoadControllerCmpRTSCStateChart_processStep(component->stateChart);
		}
	
		RootLoadControllerCmpRTSCStateChart* LoadControllerComponent_getStateMachine(LoadControllerComponent* component) {
					return component->stateChart;
				} 
		
				Port* LoadControllerComponent_getLoaderPort(LoadControllerComponent* component) {
					return component->loaderPortPort;
				}
				Port* LoadControllerComponent_getTouchPort(LoadControllerComponent* component) {
					return component->touchPortPort;
				}


		


