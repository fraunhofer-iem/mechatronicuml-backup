/**
 * @file 
 * @author generated
 * @brief Specification of Component of Type: PickUpBot
 * @details This files contains a description of the PickUpBot in form of the PickUpBotComponent
 * 			and all methods which can be executed on an Instance of this Component
 */
		#ifndef PICKUPBOTCOMPONENT_H_
		#define PICKUPBOTCOMPONENT_H_
				// Library
				#include "../lib/types.h"
					#include "../lib/port.h"
					#include "../messages/messages_types.h"
					//#include "../RTSCs/rootPickUpBotCmpRTSCStateChart.h"	
			
	
			/**
			 * @brief Forward Declaration of the struct RootPickUpBotCmpRTSCStateChart which describes the behavior of PickUpBotComponent
			 * 
			 */
			 typedef struct RootPickUpBotCmpRTSCStateChart RootPickUpBotCmpRTSCStateChart;
			/**
			 * @brief Forward Declaration of the struct PickUpBotComponent
			 */
			typedef struct PickUpBotComponent PickUpBotComponent;
			
			/**
			*  
			* @brief Description for a ComponentInstance of Type: PickUpBot
			* @details This struct describes a specific Component Instances which is typed over the Component: PickUpBot
			*/
			struct PickUpBotComponent {
			
			
						RootPickUpBotCmpRTSCStateChart* stateChart;	/**< The RootPickUpBotCmpRTSCStateChart of the Component PickUpBot */
				
							Port* pickUpBotPortPort; /**< A Pointer to the Component's Port: PickUpBotPort */
					
			
					PickUpBotComponent * next;
					
				};
		
			/**
			* @brief This Function intializes the Component: PickUpBot
			* @details All struct members of the struct PickUpBotComponent are initialized
			* 
			* @param component The PickUpBotComponent to be initialized
			*/	
				void PickUpBotComponent_initialize(PickUpBotComponent* component);
	
			/**
			* @brief Creates a Instance of the Component: PickUpBot
			* @details Allocates Memory for the struct PickUpBotComponent
			* @return A Pointer to the new created PickUpBotComponent
			*/
				PickUpBotComponent* PickUpBotComponent_create(void);
	
			/**
			 * @brief Destroys a Component: PickUpBot
			 * @details Frees the Memory for the struct PickUpBotComponent
			 * 
			* @param component The specific PickUpBotComponent to be destroyed
			 */
				void PickUpBotComponent_destroy(PickUpBotComponent* component);
		
			/**
			* @brief Checks if the execution of the Component: PickUpBot  is terminated
			* @details To Check if the execution is terminated the Method is terminated of the stateChart is called
			*		In particular the method RootPickUpBotCmpRTSCStateChart::RootPickUpBotCmpRTSCStateChart_isInState is called.
			*
			* @param component The specific PickUpBotComponent which shall be checked
			* @return True, if the Component is terminated, otherwise false
			*/
				bool_t PickUpBotComponent_isTerminated(PickUpBotComponent* component);
			
			/**
			* @brief Executes the next Step of the behavior an Instance of the Component: PickUpBot
			* @details The behavior of the Component:  PickUpBot is executed.
			*			In particular the the method RootPickUpBotCmpRTSCStateChart::RootPickUpBotCmpRTSCStateChart_processStep is called
			* 
			* @param component The PickUpBotComponent whose behavior shall be checked
			*/
				void PickUpBotComponent_processStep(PickUpBotComponent* component);
		
			/**
					 * @brief Get the Port: PickUpBotPort of an Instance of the Component: PickUpBot
					 * @details The Pointer PickUpBotComponent::pickUpBotPortPort is returned
					 * 
					 * @param component The specific Instance PickUpBotComponent  of the Component: PickUpBot whose Port shall be returned
					 * @return A Pointer to the Port PickUpBotPort of the struct PickUpBotComponent
					 */
					Port* PickUpBotComponent_getPickUpBotPort(PickUpBotComponent* component);

		
			
	


		#endif /* PICKUPBOTCOMPONENT_H_ */
