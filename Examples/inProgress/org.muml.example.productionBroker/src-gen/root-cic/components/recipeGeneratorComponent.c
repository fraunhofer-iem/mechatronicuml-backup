		#include "../components/recipeGeneratorComponent_Interface.h"
		

		
	
		void RecipeGeneratorComponent_initialize(RecipeGeneratorComponent* component) {
		
			RecipeGeneratorReciepeGeneratorStateChart_initialize(component->stateChart);
		
			component->provideOrderPort = NULL;
		}
		

		RecipeGeneratorComponent* RecipeGeneratorComponent_create(void) {
		
			RecipeGeneratorComponent* component = (RecipeGeneratorComponent*) malloc(
					sizeof(RecipeGeneratorComponent));
		
			if (component != NULL) {
		
				component->provideOrderPort = NULL;
		
				component->stateChart = NULL;
		
			} else {
		
			}
		
			return component;
		}
		

		void RecipeGeneratorComponent_destroy(RecipeGeneratorComponent* component) {
			if (component != NULL) {
		
				Port_destroy(component->provideOrderPort);
		
				//suicide
				free(component);
			}
		}
		
		
		void RecipeGeneratorComponent_processStep(RecipeGeneratorComponent* component) {
				
		
		
					component->stateChart->RecipeGeneratorReciepeGenerator_isExecutable = true;
					component->stateChart->RecipeGeneratorProvideOrderReciepeSender_isExecutable = true;
					component->stateChart->RecipeGeneratorInitInternalBehavior_isExecutable = true;
				RecipeGeneratorReciepeGeneratorStateChart_processStep(component->stateChart);
		}
	
		RecipeGeneratorReciepeGeneratorStateChart* RecipeGeneratorComponent_getStateMachine(RecipeGeneratorComponent* component) {
					return component->stateChart;
				} 
		
				Port* RecipeGeneratorComponent_getprovideOrder(RecipeGeneratorComponent* component) {
					return component->provideOrderPort;
				}

		

