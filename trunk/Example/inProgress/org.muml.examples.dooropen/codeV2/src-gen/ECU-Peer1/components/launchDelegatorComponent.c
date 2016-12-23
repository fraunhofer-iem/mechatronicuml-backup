		// Standard library
		
		#include "../components/launchDelegatorComponent_Interface.h"

//TODO: CustomCode
int32_T selfCont(void){
				int i;
			   printf("Enter Number : ");
			   	fflush(stdout);

			    scanf("%d",&i);

			   return i;
		}
		
	
		void LaunchDelegatorComponent_initialize(LaunchDelegatorComponent* component) {
		
			LaunchDelegatorLaunchDelegatorStateChart_initialize(component->stateChart);
			//TODO:CUstomCode
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
					//TODO:CustomCode
						//component->stateChart->code = component->getterOf_code();
						if(component->stateChart->currentStateOfLaunchDelegatorVerifierPeer_verifier == STATE_LAUNCHDELEGATORVERIFIERSTART || component->stateChart->currentStateOfLaunchDelegatorVerifierPeer_verifier == STATE_LAUNCHDELEGATORVERIFIERINPUTSTATE ){
							component->stateChart->code = component->getterOf_code();
						}

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

		

