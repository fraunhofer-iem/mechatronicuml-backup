	#include "lib/Debug.h"
		#include "component_container/MCC_brokerComponent.h"


//variable for component Instances
			BrokerComponent* atomic_c1;
int main(){
			atomic_c1= MCC_create_BrokerComponent(CI_BROKERBROKER);

	#ifdef DEBUG
	printDebugInformation("Initialization done...start execution.\n");
	#endif
	while (1) {

		BrokerComponent_processStep(atomic_c1);
	 		

	}

}	



