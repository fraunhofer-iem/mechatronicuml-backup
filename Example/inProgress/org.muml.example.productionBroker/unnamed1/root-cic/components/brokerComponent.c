		#include "../components/brokerComponent_Interface.h"
		

		
	
		void BrokerComponent_initialize(BrokerComponent* component) {
		
			BrokerBrokerStateChart_initialize(component->stateChart);
		
			component->getOrderPort = NULL;
		}
		

		BrokerComponent* BrokerComponent_create(void) {
		
			BrokerComponent* component = (BrokerComponent*) malloc(
					sizeof(BrokerComponent));
		
			if (component != NULL) {
		
				component->getOrderPort = NULL;
		
				component->stateChart = NULL;
		
			} else {
		
			}
		
			return component;
		}
		

		void BrokerComponent_destroy(BrokerComponent* component) {
			if (component != NULL) {
		
				Port_destroy(component->getOrderPort);
		
				//suicide
				free(component);
			}
		}
		
		
		void BrokerComponent_processStep(BrokerComponent* component) {
				
		
		
					component->stateChart->BrokerBroker_isExecutable = true;
					component->stateChart->BrokerGetOrderGetOrderStatechart_isExecutable = true;
				BrokerBrokerStateChart_processStep(component->stateChart);
		}
	
		BrokerBrokerStateChart* BrokerComponent_getStateMachine(BrokerComponent* component) {
					return component->stateChart;
				} 
		
				Port* BrokerComponent_getgetOrder(BrokerComponent* component) {
					return component->getOrderPort;
				}

		

