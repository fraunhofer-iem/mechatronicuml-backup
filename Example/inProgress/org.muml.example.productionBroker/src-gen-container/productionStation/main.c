	#include "lib/Debug.h"
		#include "component_container/MCC_productionStationComponent.h"


//variable for component Instances
			ProductionStationComponent* atomic_c1;
int main(){
			atomic_c1= MCC_create_ProductionStationComponent(CI_PRODUCTIONSTATIONPRODUCTIONSTATION);

	#ifdef DEBUG
	printDebugInformation("Initialization done...start execution.\n");
	#endif
	while (1) {

			ProductionStationComponent_processStep(atomic_c1);
	}
}	



