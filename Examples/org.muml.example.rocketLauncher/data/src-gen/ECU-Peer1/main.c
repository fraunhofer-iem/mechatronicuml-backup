	#include "lib/Debug.h"
		#include "component_container/MCC_identificationInputComponent.h"
		#include "component_container/MCC_launchDelegatorComponent.h"


//variable for component Instances
			LaunchDelegatorComponent* atomic_c1;
			IdentificationInputComponent* cont_c2;
int main(){
			atomic_c1= MCC_create_LaunchDelegatorComponent(CI_PEER1LAUNCHDELEGATOR);

			 cont_c2=MCC_create_IdentificationInputComponent(CI_PEER1INPUTIDENTIFICATIONINPUT);

	#ifdef DEBUG
	printDebugInformation("Initialization done...start execution.\n");
	#endif
	while (1) {

		LaunchDelegatorComponent_processStep(atomic_c1);
	 		
	 		

	}

}	



