	#include "lib/Debug.h"
	#include "component_container/MCC_productionStationComponent.h"
	#include <time.h>


//variable for component Instances
			ProductionStationComponent* atomic_c1;
int main(){
			atomic_c1= MCC_create_ProductionStationComponent(CI_PRODUCTIONSTATIONPRODUCTIONSTATION);

	#ifdef DEBUG
	printDebugInformation("Initialization done...start execution.\n");
	#endif
	int milisec = 200; // length of time to sleep, in miliseconds
	struct timespec req = {0};
	req.tv_sec = 0;
	req.tv_nsec = milisec * 1000000L;
	while (1) {

			ProductionStationComponent_processStep(atomic_c1);
			nanosleep(&req, (struct timespec *)NULL);
	}
}	



