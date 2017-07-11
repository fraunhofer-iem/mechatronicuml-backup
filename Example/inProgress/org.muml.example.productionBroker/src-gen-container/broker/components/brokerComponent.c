		// Standard library
		
		#include "../components/brokerComponent_Interface.h"
		

		
	
		void BrokerComponent_initialize(BrokerComponent* component) {
		
			BrokerBrokerStateChart_initialize(component->stateChart);
			/*Initialize all DirectedTypedPorts*/
		}
		

		BrokerComponent BrokerComponent_create(void) {
		
			BrokerComponent component;
		
			component.stateChart = NULL;
		
			return component;
		}
		

		void BrokerComponent_destroy(BrokerComponent* component) {
			if (component != NULL) {
				BrokerBrokerStateChart_destroy(component->stateChart);
		
				//temporarly deactivated
				//	Port_destroy(component->getOrderPort);
				//temporarly deactivated
				//	Port_destroy(component->brokerForPSPortPort);
		
				//suicide
				free(component);
			}
		}
		
		
		void BrokerComponent_processStep(BrokerComponent* component) {
				
		
					component->stateChart->BrokerBroker_isExecutable = true;
					component->stateChart->BrokerGetOrderGetOrderStatechart_isExecutable = true;
					component->stateChart->BrokerBrokerForPSPortOrderBrokerforPsRTSC_isExecutable = true;
				BrokerBrokerStateChart_processStep(component->stateChart);
					
				
			
		}

		
		BrokerBrokerStateChart* BrokerComponent_getStateMachine(BrokerComponent* component) {
					return component->stateChart;
				} 
			Port* BrokerComponent_getgetOrder(BrokerComponent* component) {
			return &(component->getOrderPort);
		}
			Port* BrokerComponent_getbrokerForPSPort(BrokerComponent* component) {
			return &(component->brokerForPSPortPort);
		}

		

