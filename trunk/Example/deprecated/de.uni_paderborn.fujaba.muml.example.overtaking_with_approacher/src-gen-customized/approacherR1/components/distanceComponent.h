/**
 * @file 
 * @author generated
 * @brief Specification of Component of Type: Distance
 * @details This files contains a description of the Distance in form of the DistanceComponent
 * 			and all methods which can be executed on an Instance of this Component
 */
		#ifndef DISTANCECOMPONENT_H_
		#define DISTANCECOMPONENT_H_
				// Library
				#include "../lib/types.h"
					#include "../lib/port.h"
					#include "../messages/messages_types.h"
					//#include "../RTSCs/rootDistanceStateChart.h"	
			
	
			/**
			 * @brief Forward Declaration of the struct RootDistanceStateChart which describes the behavior of DistanceComponent
			 * 
			 */
			 typedef struct RootDistanceStateChart RootDistanceStateChart;
			/**
			 * @brief Forward Declaration of the struct DistanceComponent
			 */
			typedef struct DistanceComponent DistanceComponent;
			
			/**
			*  
			* @brief Description for a ComponentInstance of Type: Distance
			* @details This struct describes a specific Component Instances which is typed over the Component: Distance
			*/
			struct DistanceComponent {
			
			
						RootDistanceStateChart* stateChart;	/**< The RootDistanceStateChart of the Component Distance */
				
							Port* distancePort; /**< A Pointer to the Component's Port: distance */
					
			
					DistanceComponent * next;
					
				};
		
			/**
			* @brief This Function intializes the Component: Distance
			* @details All struct members of the struct DistanceComponent are initialized
			* 
			* @param component The DistanceComponent to be initialized
			*/	
				void DistanceComponent_initialize(DistanceComponent* component);
	
			/**
			* @brief Creates a Instance of the Component: Distance
			* @details Allocates Memory for the struct DistanceComponent
			* @return A Pointer to the new created DistanceComponent
			*/
				DistanceComponent* DistanceComponent_create(void);
	
			/**
			 * @brief Destroys a Component: Distance
			 * @details Frees the Memory for the struct DistanceComponent
			 * 
			* @param component The specific DistanceComponent to be destroyed
			 */
				void DistanceComponent_destroy(DistanceComponent* component);
		
			/**
			* @brief Checks if the execution of the Component: Distance  is terminated
			* @details To Check if the execution is terminated the Method is terminated of the stateChart is called
			*		In particular the method RootDistanceStateChart::RootDistanceStateChart_isInState is called.
			*
			* @param component The specific DistanceComponent which shall be checked
			* @return True, if the Component is terminated, otherwise false
			*/
				bool_t DistanceComponent_isTerminated(DistanceComponent* component);
			
			/**
			* @brief Executes the next Step of the behavior an Instance of the Component: Distance
			* @details The behavior of the Component:  Distance is executed.
			*			In particular the the method RootDistanceStateChart::RootDistanceStateChart_processStep is called
			* 
			* @param component The DistanceComponent whose behavior shall be checked
			*/
				void DistanceComponent_processStep(DistanceComponent* component);
		
			/**
					 * @brief Get the Port: distance of an Instance of the Component: Distance
					 * @details The Pointer DistanceComponent::distancePort is returned
					 * 
					 * @param component The specific Instance DistanceComponent  of the Component: Distance whose Port shall be returned
					 * @return A Pointer to the Port distance of the struct DistanceComponent
					 */
					Port* DistanceComponent_getdistance(DistanceComponent* component);

		
			
	


		#endif /* DISTANCECOMPONENT_H_ */
