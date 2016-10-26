		// Standard library
		
		#include "../components/mainComponent_Interface.h"
		

		
	
		void MainComponent_initialize(MainComponent* component) {
		
			MainRootRTSCStateChart_initialize(component->stateChart);
		
		}


		void setterOf_LED_voltage(Port* port, int8_T* value) {

			MCC_MainComponent_LED_voltage_send_value(port,value);

		}

		

		MainComponent MainComponent_create(void) {
		
			MainComponent component;
		
			component.stateChart = NULL;
		
			return component;
		}
		

		void MainComponent_destroy(MainComponent* component) {
			if (component != NULL) {
		
				//suicide
				free(component);
			}
		}
		
		
		void MainComponent_processStep(MainComponent* component) {
				
		
		
					component->stateChart->MainRootRTSC_isExecutable = true;
					component->stateChart->MainInit_isExecutable = true;
				MainRootRTSCStateChart_processStep(component->stateChart);
				//Manuell changed
					setterOf_LED_voltage(&(component->LED_voltage), &(component->stateChart->LED_voltage));
		}
	
		MainRootRTSCStateChart* MainComponent_getStateMachine(MainComponent* component) {
					return component->stateChart;
				}

		

