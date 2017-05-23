		#include "../components/receiverComponent_Interface.h"
		

		
	
		void ReceiverComponent_initialize(ReceiverComponent* component) {
		
			ReceiverReceiverStateChart_initialize(component->stateChart);
		
			component->inPort = NULL;
		}
		

		ReceiverComponent* ReceiverComponent_create(void) {
		
			ReceiverComponent* component = (ReceiverComponent*) malloc(
					sizeof(ReceiverComponent));
		
			if (component != NULL) {
		
				component->inPort = NULL;
		
				component->stateChart = NULL;
		
			} else {
		
			}
		
			return component;
		}
		

		void ReceiverComponent_destroy(ReceiverComponent* component) {
			if (component != NULL) {
		
				Port_destroy(component->inPort);
		
				//suicide
				free(component);
			}
		}
		
		
		void ReceiverComponent_processStep(ReceiverComponent* component) {
				
		
		
					component->stateChart->ReceiverReceiver_isExecutable = true;
					component->stateChart->ReceiverInReceiverRoleRTSC_in_isExecutable = true;
				ReceiverReceiverStateChart_processStep(component->stateChart);
					component->setterOf_LED(component->stateChart->LED);
		}
	
		ReceiverReceiverStateChart* ReceiverComponent_getStateMachine(ReceiverComponent* component) {
					return component->stateChart;
				} 
		
				Port* ReceiverComponent_getin(ReceiverComponent* component) {
					return component->inPort;
				}

		

