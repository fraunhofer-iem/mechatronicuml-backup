	#include "lib/Debug.h"
		#include "component_container/MCC_launchDelegatorComponent.h"


//variable for component Instances
			LaunchDelegatorComponent* atomic_c1;
int main(){
			atomic_c1= MCC_create_LaunchDelegatorComponent(CI_PEER2LAUNCHDELEGATOR);

	#ifdef DEBUG
	printDebugInformation("Initialization done...start execution.\n");
	#endif
	while (1) {

		LaunchDelegatorComponent_processStep(atomic_c1);
	 		
	 		

	}

}	



