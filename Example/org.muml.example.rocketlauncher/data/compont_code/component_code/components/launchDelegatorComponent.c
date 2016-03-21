		// Standard library
		
		#include "../components/launchDelegatorComponent_Interface.h"
		

		
	
		void LaunchDelegatorComponent_initialize(LaunchDelegatorComponent* component) {
		
			LaunchDelegatorLaunchDelegatorStateChart_initialize(component->stateChart);
		
		}
		

		LaunchDelegatorComponent LaunchDelegatorComponent_create(void) {
		
			LaunchDelegatorComponent component;
		
			component.stateChart = NULL;
		
			return component;
		}
		

		void LaunchDelegatorComponent_destroy(LaunchDelegatorComponent* component) {
			if (component != NULL) {
		
				//temporarly deactivated
				//	Port_destroy(component->verifierPort);
		
				//suicide
				free(component);
			}
		}
		
		
		void LaunchDelegatorComponent_processStep(LaunchDelegatorComponent* component) {
				
		
					component->stateChart->code = component->getterOf_code();
		
					component->stateChart->LaunchDelegatorLaunchDelegator_isExecutable = true;
					component->stateChart->LaunchDelegatorVerifierPeer_verifier_isExecutable = true;
				LaunchDelegatorLaunchDelegatorStateChart_processStep(component->stateChart);
		}
	
		LaunchDelegatorLaunchDelegatorStateChart* LaunchDelegatorComponent_getStateMachine(LaunchDelegatorComponent* component) {
					return component->stateChart;
				} 
		
				Port* LaunchDelegatorComponent_getverifier(LaunchDelegatorComponent* component) {
					return &(component->verifierPort);
				}

		

