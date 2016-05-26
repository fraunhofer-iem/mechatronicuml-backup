	#include "lib/Debug.h"
		#include "component_container/MCC_launchVerifierComponent.h"


//variable for component Instances
			LaunchVerifierComponent* atomic_c2;
int main(){

			atomic_c2= MCC_create_LaunchVerifierComponent(CI_LAUNCHVERIFIERLAUNCHVERIFIER);

	#ifdef DEBUG
	printDebugInformation("Initialization done...start execution.\n");
	#endif
	while (1) {

	 		
		LaunchVerifierComponent_processStep(atomic_c2);
	 		

	}

}	



