/**
 * @file 
 * @author generated
 * @brief Specification of Component of Type: Motor
 * @details This files contains a description of the Motor in form of the MotorComponent
 * 			and all methods which can be executed on an Instance of this Component
 */
		#ifndef MOTORCOMPONENT_H_
		#define MOTORCOMPONENT_H_
				// Library
				#include "../lib/types.h"
					#include "../lib/port.h"
					#include "../messages/messages_types.h"
					//#include "../RTSCs/rootMotorStateChart.h"	
			
	
			/**
			 * @brief Forward Declaration of the struct RootMotorStateChart which describes the behavior of MotorComponent
			 * 
			 */
			 typedef struct RootMotorStateChart RootMotorStateChart;
			/**
			 * @brief Forward Declaration of the struct MotorComponent
			 */
			typedef struct MotorComponent MotorComponent;
			
			/**
			*  
			* @brief Description for a ComponentInstance of Type: Motor
			* @details This struct describes a specific Component Instances which is typed over the Component: Motor
			*/
			struct MotorComponent {
			
			
						RootMotorStateChart* stateChart;	/**< The RootMotorStateChart of the Component Motor */
				
							Port* velocityPort; /**< A Pointer to the Component's Port: velocity */
					
			
					MotorComponent * next;
					
				};
		
			/**
			* @brief This Function intializes the Component: Motor
			* @details All struct members of the struct MotorComponent are initialized
			* 
			* @param component The MotorComponent to be initialized
			*/	
				void MotorComponent_initialize(MotorComponent* component);
	
			/**
			* @brief Creates a Instance of the Component: Motor
			* @details Allocates Memory for the struct MotorComponent
			* @return A Pointer to the new created MotorComponent
			*/
				MotorComponent* MotorComponent_create(void);
	
			/**
			 * @brief Destroys a Component: Motor
			 * @details Frees the Memory for the struct MotorComponent
			 * 
			* @param component The specific MotorComponent to be destroyed
			 */
				void MotorComponent_destroy(MotorComponent* component);
		
			/**
			* @brief Checks if the execution of the Component: Motor  is terminated
			* @details To Check if the execution is terminated the Method is terminated of the stateChart is called
			*		In particular the method RootMotorStateChart::RootMotorStateChart_isInState is called.
			*
			* @param component The specific MotorComponent which shall be checked
			* @return True, if the Component is terminated, otherwise false
			*/
				bool_t MotorComponent_isTerminated(MotorComponent* component);
			
			/**
			* @brief Executes the next Step of the behavior an Instance of the Component: Motor
			* @details The behavior of the Component:  Motor is executed.
			*			In particular the the method RootMotorStateChart::RootMotorStateChart_processStep is called
			* 
			* @param component The MotorComponent whose behavior shall be checked
			*/
				void MotorComponent_processStep(MotorComponent* component);
		
			/**
					 * @brief Get the Port: velocity of an Instance of the Component: Motor
					 * @details The Pointer MotorComponent::velocityPort is returned
					 * 
					 * @param component The specific Instance MotorComponent  of the Component: Motor whose Port shall be returned
					 * @return A Pointer to the Port velocity of the struct MotorComponent
					 */
					Port* MotorComponent_getvelocity(MotorComponent* component);

		
			
	


		#endif /* MOTORCOMPONENT_H_ */
