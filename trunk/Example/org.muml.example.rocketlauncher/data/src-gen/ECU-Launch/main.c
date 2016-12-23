	#include "lib/Debug.h"
		#include "component_container/MCC_launcherComponent.h"
		#include "component_container/MCC_launchVerifierComponent.h"
#include <unistd.h>

//variable for component Instances
			LauncherComponent* cont_c1;
			LaunchVerifierComponent* atomic_c2;
int main(){
			 cont_c1=MCC_create_LauncherComponent(CI_LAUNCHERLAUNCHER);

			atomic_c2= MCC_create_LaunchVerifierComponent(CI_LAUNCHVERIFIERLAUNCHVERIFIER);

	#ifdef DEBUG
	printDebugInformation("Initialization done...start execution.\n");
	#endif
	while (1) {

	 		
		LaunchVerifierComponent_processStep(atomic_c2);
	 		usleep(1000);

	}

}	



