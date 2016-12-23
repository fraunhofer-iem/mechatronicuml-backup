		// Standard library
		
		#include "../components/launchVerifierComponent_Interface.h"
		

		
	
		void LaunchVerifierComponent_initialize(LaunchVerifierComponent* component) {
		
			LaunchVerifierLaunchVerifierStateChart_initialize(component->stateChart);
		
		}
		

		LaunchVerifierComponent LaunchVerifierComponent_create(void) {
		
			LaunchVerifierComponent component;
		
			component.stateChart = NULL;
		
			return component;
		}
		

		void LaunchVerifierComponent_destroy(LaunchVerifierComponent* component) {
			if (component != NULL) {
		
				//temporarly deactivated
				//	Port_destroy(component->peer1Port);
				//temporarly deactivated
				//	Port_destroy(component->peer2Port);
		
				//suicide
				free(component);
			}
		}
		
		
		void LaunchVerifierComponent_processStep(LaunchVerifierComponent* component) {
				
		
		
					component->stateChart->LaunchVerifierLaunchVerifier_isExecutable = true;
					component->stateChart->LaunchVerifierPeer1Master_peer1_isExecutable = true;
					component->stateChart->LaunchVerifierPeer2Master_peer2_isExecutable = true;
					component->stateChart->LaunchVerifierLaunchVerifier_mainStatechart_isExecutable = true;
				LaunchVerifierLaunchVerifierStateChart_processStep(component->stateChart);
					component->setterOf_verifiedLaunch(component->stateChart->verifiedLaunch);
		}
	
		LaunchVerifierLaunchVerifierStateChart* LaunchVerifierComponent_getStateMachine(LaunchVerifierComponent* component) {
					return component->stateChart;
				} 
		
				Port* LaunchVerifierComponent_getpeer1(LaunchVerifierComponent* component) {
					return &(component->peer1Port);
				}
				Port* LaunchVerifierComponent_getpeer2(LaunchVerifierComponent* component) {
					return &(component->peer2Port);
				}

		

