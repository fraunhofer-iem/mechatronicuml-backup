/**
 * @file 
 * @author generated
 * @brief Specification of Component of Type: Main
 * @details This files contains a description of the Main in form of the MainComponent
 * 			and all methods which can be executed on an Instance of this Component
 */
		#ifndef MAINCOMPONENT_H_
		#define MAINCOMPONENT_H_

#ifdef __cplusplus
  extern "C" {
#endif
				// Library
				#include "standardTypes.h"
				#include "customTypes.h"
			
					//#include "mainRootRTSCStateChart.h"	
			
	
			/**
			 * @brief Forward Declaration of the struct MainRootRTSCStateChart which describes the behavior of MainComponent
			 * 
			 */
			 typedef struct MainRootRTSCStateChart MainRootRTSCStateChart;
			/**
			 * @brief Forward Declaration of the struct MainComponent
			 */
				typedef struct MainComponent MainComponent;
			
			/**
			*  
			* @brief Description for a ComponentInstance of Type: Main
			* @details This struct describes a specific Component Instances which is typed over the Component: Main
			*/
			struct MainComponent {
			
			
						MainRootRTSCStateChart* stateChart;	/**< The MainRootRTSCStateChart of the Component Main */
				
			
								void (*setterOf_LED_voltage)(int8_T);/**< A Pointer to the setter function of the hybrid port: LED_voltage */
			
						
					
					
			
					MainComponent * next;/**< A Pointer to the next component part, if this component ist part of a multipart in the CIC */
					
				};
		
			/**
			* @brief This Methodes intializes the Component: Main
			* @details All struct members of the struct MainComponent are initialized
			* 
			* @param component The MainComponent to be initialized
			*/	
				void MainComponent_initialize(MainComponent* component);
	
			/**
			* @brief Creates a Instance of the Component: Main
			* @details Allocates Memory for the struct MainComponent
			* @return A Pointer to the new created MainComponent
			*/
				MainComponent* MainComponent_create();
	
			/**
			 * @brief Destroys a Component: Main
			 * @details Frees the Memory for the struct MainComponent
			 * 
			* @param component The specific MainComponent to be destroyed
			 */
				void MainComponent_destroy(MainComponent* component);
		
			/**
			* @brief Checks if the execution of the Component: Main  is terminated
			* @details To Check if the execution is terminated the Method is terminated of the stateChart is called
			*		
			* @param component The specific MainComponent which shall be checked
			* @return True, if the Component is terminated, otherwise false
			*/
				bool_t MainComponent_isTerminated(MainComponent* component);
			
			/**
			* @brief Executes the next Step of the behavior an Instance of the Component: Main
			* @details The behavior of the Component:  Main is executed.
			*			
			* @param component The MainComponent whose behavior shall be checked
			*/
				void MainComponent_processStep(MainComponent* component);
		
			
		
			


#ifdef __cplusplus
  }
#endif
		#endif /* MAINCOMPONENT_H_ */
