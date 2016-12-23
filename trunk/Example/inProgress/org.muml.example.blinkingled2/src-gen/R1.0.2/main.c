	#include "lib/Debug.h"
		#include "component_container/MCC_lEDComponent.h"


//variable for component Instances
			LEDComponent* cont_c1;
int main(){
			 cont_c1=MCC_create_LEDComponent(CI_C2LED);

	#ifdef DEBUG
	printDebugInformation("Initialization done...start execution.\n");
	#endif
	while (1) {
		//manuell
		LEDComponent_processStep(cont_c1);

	}

}	



