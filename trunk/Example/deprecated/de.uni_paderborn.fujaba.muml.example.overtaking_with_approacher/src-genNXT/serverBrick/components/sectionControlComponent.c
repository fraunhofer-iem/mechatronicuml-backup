		// Standard library
		#include <stdlib.h>
		#include <stdio.h>
		#include "../RTSCs/rootsectionControlRTSCStateChart.h"
		
		#include "sectionControlComponent.h"
		

		
	
		void SectionControlComponent_initialize(SectionControlComponent* component) {
		
			RootsectionControlRTSCStateChart_initialize(component->stateChart);
		
			Port_initialize(component->sectionApproacherPPort);
		
			Port_initialize(component->sectionOvertakerPPort);
		
			Port_initialize(component->sectionOvertakeePPort);
		
			Port_initialize(component->controllerPPort);
		
		}
		

		SectionControlComponent* SectionControlComponent_create(void) {
		
			SectionControlComponent* component = (SectionControlComponent*) malloc(
					sizeof(SectionControlComponent));
		
			if (component != NULL) {
		
				component->sectionApproacherPPort = NULL;
				component->sectionOvertakerPPort = NULL;
				component->sectionOvertakeePPort = NULL;
				component->controllerPPort = NULL;
		
				component->stateChart = NULL;
		
			} else {
				fprintf(stderr, "Creation of SectionControlComponent failed.\n");
			}
		
			return component;
		}
		

		void SectionControlComponent_destroy(SectionControlComponent* component) {
			if (component != NULL) {
		
				Port_destroy(component->sectionApproacherPPort);
				Port_destroy(component->sectionOvertakerPPort);
				Port_destroy(component->sectionOvertakeePPort);
				Port_destroy(component->controllerPPort);
		
				//destroy stateChart
				RootsectionControlRTSCStateChart_destroy(component->stateChart);
		
				//suicide
				free(component);
			}
		}
		
	
		bool_t SectionControlComponent_isTerminated(SectionControlComponent* component) {
				return 
						RootsectionControlRTSCStateChart_isTerminated(component->stateChart);
			}
		
		void SectionControlComponent_processStep(SectionControlComponent* component) {
				
		
		
				RootsectionControlRTSCStateChart_processStep(component->stateChart);
		}
	
		RootsectionControlRTSCStateChart* SectionControlComponent_getStateMachine(SectionControlComponent* component) {
					return component->stateChart;
				} 
		
				Port* SectionControlComponent_getsectionApproacherP(SectionControlComponent* component) {
					return component->sectionApproacherPPort;
				}
				Port* SectionControlComponent_getsectionOvertakerP(SectionControlComponent* component) {
					return component->sectionOvertakerPPort;
				}
				Port* SectionControlComponent_getsectionOvertakeeP(SectionControlComponent* component) {
					return component->sectionOvertakeePPort;
				}
				Port* SectionControlComponent_getcontrollerP(SectionControlComponent* component) {
					return component->controllerPPort;
				}


		


