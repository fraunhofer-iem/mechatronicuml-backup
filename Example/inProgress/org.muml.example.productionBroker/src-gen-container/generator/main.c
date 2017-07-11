	#include "lib/Debug.h"
		#include "component_container/MCC_recipeGeneratorComponent.h"


//variable for component Instances
			RecipeGeneratorComponent* atomic_c1;
int main(){
			atomic_c1= MCC_create_RecipeGeneratorComponent(CI_RECIPEGENERATORRECIPEGENERATOR);

	#ifdef DEBUG
	printDebugInformation("Initialization done...start execution.\n");
	#endif
	while (1) {

			RecipeGeneratorComponent_processStep(atomic_c1);
	}
}	



