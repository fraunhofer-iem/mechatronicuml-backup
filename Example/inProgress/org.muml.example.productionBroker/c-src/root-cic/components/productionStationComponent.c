		// Standard library
		
		#include "../components/productionStationComponent_Interface.h"
		

		
	
		void ProductionStationComponent_initialize(
				ProductionStationComponent* component) {
		
			ProductionStationProductionStationRTSCStateChart_initialize(
					component->stateChart);
			/*Initialize all DirectedTypedPorts*/
		}
		

		ProductionStationComponent ProductionStationComponent_create(void) {
		
			ProductionStationComponent component;
		
			component.stateChart = NULL;
		
			return component;
		}
		

		void ProductionStationComponent_destroy(ProductionStationComponent* component) {
			if (component != NULL) {
				ProductionStationProductionStationRTSCStateChart_destroy(
						component->stateChart);
		
				//temporarly deactivated
				//	Port_destroy(component->getOrderPort);
		
				//suicide
				free(component);
			}
		}
		
		
		void ProductionStationComponent_processStep(ProductionStationComponent* component) {
				
		
					component->stateChart->ProductionStationProductionStationRTSC_isExecutable = true;
					component->stateChart->ProductionStationGetOrderParameterizedGetOrderRTSC_isExecutable = true;
				ProductionStationProductionStationRTSCStateChart_processStep(component->stateChart);
					
				
			
		}

		
		ProductionStationProductionStationRTSCStateChart* ProductionStationComponent_getStateMachine(ProductionStationComponent* component) {
					return component->stateChart;
				} 
			Port* ProductionStationComponent_getgetOrder(ProductionStationComponent* component) {
			return &(component->getOrderPort);
		}

		

