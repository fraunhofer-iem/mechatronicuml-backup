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
				
		
		}
	
		

		

