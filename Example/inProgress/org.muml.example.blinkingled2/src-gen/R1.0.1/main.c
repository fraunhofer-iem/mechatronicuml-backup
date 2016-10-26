	#include "lib/Debug.h"
		#include "component_container/MCC_mainComponent.h"


//variable for component Instances
			MainComponent* atomic_c1;
int main(){
			atomic_c1= MCC_create_MainComponent(CI_C1MAIN);

	#ifdef DEBUG
	printDebugInformation("Initialization done...start execution.\n");
	#endif
	while (1) {

		MainComponent_processStep(atomic_c1);
	 		

	}

}	



