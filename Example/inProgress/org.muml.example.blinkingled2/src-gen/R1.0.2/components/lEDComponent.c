		// Standard library
		
		#include "../components/lEDComponent_Interface.h"
		

		
	
		void LEDComponent_initialize(LEDComponent* component) {
		//Clock_reset((component->voltage).portClock); //manuell
		ClockedPort *myPort = ((ClockedPort*)&(component->voltage)); //manuell
		Clock_reset(myPort->portClock); //manuell
		
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

		//Manuell start
		void getterOf_LED_voltage(Port* port, int8_T* value) {
			ClockedPort *myPort = (ClockedPort*) port; 
			if (Clock_getTime(myPort->portClock)		>= 1000 * 1.0) //interval of continuous port
			{
				if(MCC_LEDComponent_voltage_exists_value(port)){
					MCC_LEDComponent_voltage_recv_value(port,value);
					Clock_reset(myPort->portClock);
				}
			}
		}
		
		//Manuell end
		

		

