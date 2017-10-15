	#include "lib/Debug.h"
	#include "component_container/MCC_brokerComponent.h"
	#include <time.h>

//variable for component Instances
			BrokerComponent* atomic_c1;
int main(){
			atomic_c1= MCC_create_BrokerComponent(CI_BROKERBROKER);

	#ifdef DEBUG
	printDebugInformation("Initialization done...start execution.\n");
	#endif
	int milisec = 50; // length of time to sleep, in miliseconds
	struct timespec req = {0};
	req.tv_sec = 0;
	req.tv_nsec = milisec * 1000000L;
	while (1) {

			BrokerComponent_processStep(atomic_c1);
			nanosleep(&req, (struct timespec *)NULL);
	}
}	



