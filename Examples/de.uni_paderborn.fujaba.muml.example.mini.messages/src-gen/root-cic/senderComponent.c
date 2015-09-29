		// Standard library
		
		#include "senderSenderStateChart.h"
		
		#include "senderComponent.h"
		

		
	
		void SenderComponent_initialize(SenderComponent* component) {
		
			SenderSenderStateChart_initialize(component->stateChart);
		
			component->outPort = NULL;
		}
		

		SenderComponent* SenderComponent_create(void) {
		
			SenderComponent* component = (SenderComponent*) malloc(
					sizeof(SenderComponent));
		
			if (component != NULL) {
		
				component->outPort = NULL;
		
				component->stateChart = NULL;
		
			} else {
		
			}
		
			return component;
		}
		

		void SenderComponent_destroy(SenderComponent* component) {
			if (component != NULL) {
		
				Port_destroy(component->outPort);
		
				//suicide
				free(component);
			}
		}
		
	
		bool_t SenderComponent_isTerminated(SenderComponent* component) {
				return 
						SenderSenderStateChart_isTerminated(component->stateChart);
			}
		
		void SenderComponent_processStep(SenderComponent* component) {
				
		
		
					component->stateChart->SenderSender_isExecutable = true;
					component->stateChart->SenderOutSenderRoleRTSC_out_isExecutable = true;
				SenderSenderStateChart_processStep(component->stateChart);
		}
	
		SenderSenderStateChart* SenderComponent_getStateMachine(SenderComponent* component) {
					return component->stateChart;
				} 
		
				Port* SenderComponent_getout(SenderComponent* component) {
					return component->outPort;
				}

		

