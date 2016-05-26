	#include "../../src-genV1_working/ECU-Peer2/component_container/MCC_identificationInputComponent.h"
#include "../../src-genV1_working/ECU-Peer2/component_container/MCC_launchDelegatorComponent.h"
#include "../../src-genV1_working/ECU-Peer2/lib/Debug.h"


//variable for component Instances
			IdentificationInputComponent* cont_c1;
			LaunchDelegatorComponent* atomic_c2;
int main(){
			 cont_c1=MCC_create_IdentificationInputComponent(CI_PEER2INPUTIDENTIFICATIONINPUT);

			atomic_c2= MCC_create_LaunchDelegatorComponent(CI_PEER2LAUNCHDELEGATOR);

	#ifdef DEBUG
	printDebugInformation("Initialization done...start execution.\n");
	#endif
	while (1) {

	 		
		LaunchDelegatorComponent_processStep(atomic_c2);
	 		

	}

}	



