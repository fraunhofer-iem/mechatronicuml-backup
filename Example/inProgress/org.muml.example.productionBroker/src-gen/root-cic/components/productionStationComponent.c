		#include "../components/productionStationComponent_Interface.h"
		

		
	
		void ProductionStationComponent_initialize(
				ProductionStationComponent* component) {
		
			ProductionStationPorductionStationRTSCStateChart_initialize(
					component->stateChart);
		
			component->getOrderPort = NULL;
		}
		

		ProductionStationComponent* ProductionStationComponent_create(void) {
		
			ProductionStationComponent* component =
					(ProductionStationComponent*) malloc(
							sizeof(ProductionStationComponent));
		
			if (component != NULL) {
		
				component->getOrderPort = NULL;
		
				component->stateChart = NULL;
		
			} else {
		
			}
		
			return component;
		}
		

		void ProductionStationComponent_destroy(ProductionStationComponent* component) {
			if (component != NULL) {
		
				Port_destroy(component->getOrderPort);
		
				//suicide
				free(component);
			}
		}
		
		
		void ProductionStationComponent_processStep(ProductionStationComponent* component) {
				
		
		
					component->stateChart->ProductionStationPorductionStationRTSC_isExecutable = true;
					component->stateChart->ProductionStationGetOrderParameterizedGetOrderRTSC_isExecutable = true;
				ProductionStationPorductionStationRTSCStateChart_processStep(component->stateChart);
		}
	
		ProductionStationPorductionStationRTSCStateChart* ProductionStationComponent_getStateMachine(ProductionStationComponent* component) {
					return component->stateChart;
				} 
		
				Port* ProductionStationComponent_getgetOrder(ProductionStationComponent* component) {
					return component->getOrderPort;
				}

		

