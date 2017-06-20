	#include "lib/Debug.h"
		#include "component_container/MCC_recipeGeneratorComponent.h"
		#include <time.h>

//variable for component Instances
			RecipeGeneratorComponent* atomic_c1;
int main(){
			atomic_c1= MCC_create_RecipeGeneratorComponent(CI_RECIPEGENERATORRECIPEGENERATOR);

	#ifdef DEBUG
	printDebugInformation("Initialization done...start execution.\n");
	#endif
	int milisec = 100; // length of time to sleep, in miliseconds
	struct timespec req = {0};
	req.tv_sec = 0;
	req.tv_nsec = milisec * 1000000L;
	while (1) {

			RecipeGeneratorComponent_processStep(atomic_c1);
			nanosleep(&req, (struct timespec *)NULL);
	}
}	



