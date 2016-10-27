		// Standard library
		
		#include "../components/lEDComponent_Interface.h"
		

		
	
		void LEDComponent_initialize(LEDComponent* component) {
		
		}
		

		LEDComponent LEDComponent_create(void) {
		
			LEDComponent component;
		
			return component;
		}
		

		void LEDComponent_destroy(LEDComponent* component) {
			if (component != NULL) {
		
				//suicide
				free(component);
			}
		}
		
		
		void LEDComponent_processStep(LEDComponent* component) {

			getterOf_LED_voltage(&(component->voltage),&(component->LED_voltage));
		
		}
		//Manuell TODO change to receive method
		void getterOf_LED_voltage(Port* port, int8_T* value) {

			if(MCC_LEDComponent_voltage_exists_value(port)){
				MCC_LEDComponent_voltage_recv_value(port,value);
			}
		}
		

		

