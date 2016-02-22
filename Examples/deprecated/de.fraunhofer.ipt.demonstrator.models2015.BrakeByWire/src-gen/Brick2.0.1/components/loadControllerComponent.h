/**
 * @file 
 * @author generated
 * @brief Specification of Component of Type: LoadController
 * @details This files contains a description of the LoadController in form of the LoadControllerComponent
 * 			and all methods which can be executed on an Instance of this Component
 */
		#ifndef LOADCONTROLLERCOMPONENT_H_
		#define LOADCONTROLLERCOMPONENT_H_
				// Library
				#include "../lib/types.h"
					#include "../lib/port.h"
					#include "../messages/messages_types.h"
					//#include "../RTSCs/rootLoadControllerCmpRTSCStateChart.h"	
			
	
			/**
			 * @brief Forward Declaration of the struct RootLoadControllerCmpRTSCStateChart which describes the behavior of LoadControllerComponent
			 * 
			 */
			 typedef struct RootLoadControllerCmpRTSCStateChart RootLoadControllerCmpRTSCStateChart;
			/**
			 * @brief Forward Declaration of the struct LoadControllerComponent
			 */
			typedef struct LoadControllerComponent LoadControllerComponent;
			
			/**
			*  
			* @brief Description for a ComponentInstance of Type: LoadController
			* @details This struct describes a specific Component Instances which is typed over the Component: LoadController
			*/
			struct LoadControllerComponent {
			
			
						RootLoadControllerCmpRTSCStateChart* stateChart;	/**< The RootLoadControllerCmpRTSCStateChart of the Component LoadController */
				
							Port* loaderPortPort; /**< A Pointer to the Component's Port: LoaderPort */
							Port* touchPortPort; /**< A Pointer to the Component's Port: TouchPort */
					
			
					LoadControllerComponent * next;
					
				};
		
			/**
			* @brief This Function intializes the Component: LoadController
			* @details All struct members of the struct LoadControllerComponent are initialized
			* 
			* @param component The LoadControllerComponent to be initialized
			*/	
				void LoadControllerComponent_initialize(LoadControllerComponent* component);
	
			/**
			* @brief Creates a Instance of the Component: LoadController
			* @details Allocates Memory for the struct LoadControllerComponent
			* @return A Pointer to the new created LoadControllerComponent
			*/
				LoadControllerComponent* LoadControllerComponent_create(void);
	
			/**
			 * @brief Destroys a Component: LoadController
			 * @details Frees the Memory for the struct LoadControllerComponent
			 * 
			* @param component The specific LoadControllerComponent to be destroyed
			 */
				void LoadControllerComponent_destroy(LoadControllerComponent* component);
		
			/**
			* @brief Checks if the execution of the Component: LoadController  is terminated
			* @details To Check if the execution is terminated the Method is terminated of the stateChart is called
			*		In particular the method RootLoadControllerCmpRTSCStateChart::RootLoadControllerCmpRTSCStateChart_isInState is called.
			*
			* @param component The specific LoadControllerComponent which shall be checked
			* @return True, if the Component is terminated, otherwise false
			*/
				bool_t LoadControllerComponent_isTerminated(LoadControllerComponent* component);
			
			/**
			* @brief Executes the next Step of the behavior an Instance of the Component: LoadController
			* @details The behavior of the Component:  LoadController is executed.
			*			In particular the the method RootLoadControllerCmpRTSCStateChart::RootLoadControllerCmpRTSCStateChart_processStep is called
			* 
			* @param component The LoadControllerComponent whose behavior shall be checked
			*/
				void LoadControllerComponent_processStep(LoadControllerComponent* component);
		
			/**
					 * @brief Get the Port: LoaderPort of an Instance of the Component: LoadController
					 * @details The Pointer LoadControllerComponent::loaderPortPort is returned
					 * 
					 * @param component The specific Instance LoadControllerComponent  of the Component: LoadController whose Port shall be returned
					 * @return A Pointer to the Port LoaderPort of the struct LoadControllerComponent
					 */
					Port* LoadControllerComponent_getLoaderPort(LoadControllerComponent* component);
					/**
					 * @brief Get the Port: TouchPort of an Instance of the Component: LoadController
					 * @details The Pointer LoadControllerComponent::touchPortPort is returned
					 * 
					 * @param component The specific Instance LoadControllerComponent  of the Component: LoadController whose Port shall be returned
					 * @return A Pointer to the Port TouchPort of the struct LoadControllerComponent
					 */
					Port* LoadControllerComponent_getTouchPort(LoadControllerComponent* component);

		
			
	


		#endif /* LOADCONTROLLERCOMPONENT_H_ */
