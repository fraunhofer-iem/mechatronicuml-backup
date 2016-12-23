		// Standard library
		
		#include "../components/recipeGeneratorComponent_Interface.h"
		

		
	
		void RecipeGeneratorComponent_initialize(RecipeGeneratorComponent* component) {
		
			RecipeGeneratorReciepeGeneratorStateChart_initialize(component->stateChart);
		
		}
		

		RecipeGeneratorComponent RecipeGeneratorComponent_create(void) {
		
			RecipeGeneratorComponent component;
		
			component.stateChart = NULL;
		
			return component;
		}
		

		void RecipeGeneratorComponent_destroy(RecipeGeneratorComponent* component) {
			if (component != NULL) {
		
				//temporarly deactivated
				//	Port_destroy(component->provideOrderPort);
		
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
					return &(component->provideOrderPort);
				}

		

