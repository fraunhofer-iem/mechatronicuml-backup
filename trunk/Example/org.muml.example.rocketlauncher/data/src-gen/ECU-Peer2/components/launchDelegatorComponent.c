		// Standard library
		
		#include "../components/launchDelegatorComponent_Interface.h"
		

		int32_T selfCont(void){
			char c;
							int i = 0;
							int b = 1;
						   printf("Enter Number : ");

						   while (1) {
							   c = getchar();
							   if (c == 0 || c == 13 || c == 10) {
								   break;
							   }
							   if (c >= '0' && c <= '9') {
								   i += b * (c - '0');
								   b *= 10;
							   }
						   };

						   return i;
		}
	
		void LaunchDelegatorComponent_initialize(LaunchDelegatorComponent* component) {
		
			LaunchDelegatorLaunchDelegatorStateChart_initialize(component->stateChart);
			component->getterOf_code=&selfCont;

		
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

		

