		// Standard library
		#include <stdlib.h>
		#include <stdio.h>
		#include "../RTSCs/rootCommunicatorCmpRTSCStateChart.h"
		
		#include "communicatorComponent.h"
		

		
	
		void CommunicatorComponent_initialize(CommunicatorComponent* component) {
		
			RootCommunicatorCmpRTSCStateChart_initialize(component->stateChart);
		
			Port_initialize(component->pickUpPortPort);
		
			Port_initialize(component->communicatorPortPort);
		
		}
		

		CommunicatorComponent* CommunicatorComponent_create(void) {
		
			CommunicatorComponent* component = (CommunicatorComponent*) malloc(
					sizeof(CommunicatorComponent));
		
			if (component != NULL) {
		
				component->pickUpPortPort = NULL;
				component->communicatorPortPort = NULL;
		
				component->stateChart = NULL;
		
			} else {
				fprintf(stderr, "Creation of CommunicatorComponent failed.\n");
			}
		
			return component;
		}
		

		void CommunicatorComponent_destroy(CommunicatorComponent* component) {
			if (component != NULL) {
		
				Port_destroy(component->pickUpPortPort);
				Port_destroy(component->communicatorPortPort);
		
				//destroy stateChart
				RootCommunicatorCmpRTSCStateChart_destroy(component->stateChart);
		
				//suicide
				free(component);
			}
		}
		
	
		bool_t CommunicatorComponent_isTerminated(CommunicatorComponent* component) {
				return 
						RootCommunicatorCmpRTSCStateChart_isTerminated(component->stateChart);
			}
		
		void CommunicatorComponent_processStep(CommunicatorComponent* component) {
				
		
		
				RootCommunicatorCmpRTSCStateChart_processStep(component->stateChart);
		}
	
		RootCommunicatorCmpRTSCStateChart* CommunicatorComponent_getStateMachine(CommunicatorComponent* component) {
					return component->stateChart;
				} 
		
				Port* CommunicatorComponent_getPickUpPort(CommunicatorComponent* component) {
					return component->pickUpPortPort;
				}
				Port* CommunicatorComponent_getCommunicatorPort(CommunicatorComponent* component) {
					return component->communicatorPortPort;
				}


		


