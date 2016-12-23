	#include "lib/Debug.h"
		#include "component_container/MCC_launchDelegatorComponent.h"


//variable for component Instances
			LaunchDelegatorComponent* atomic_c2;
int main(){

			atomic_c2= MCC_create_LaunchDelegatorComponent(CI_PEER1LAUNCHDELEGATOR);

	#ifdef DEBUG
	printDebugInformation("Initialization done...start execution.\n");
	#endif
	while (1) {

	 		
		LaunchDelegatorComponent_processStep(atomic_c2);
	 		

	}

}	



