/**
 * @file 
 * @author generated
 * @brief Specification of Component of Type: Sender
 * @details This files contains a description of the Sender in form of the SenderComponent
 * 			and all methods which can be executed on an Instance of this Component
 */
		#ifndef SENDERCOMPONENT_H_
		#define SENDERCOMPONENT_H_

#ifdef __cplusplus
  extern "C" {
#endif
				// Library
				#include "standardTypes.h"
				#include "customTypes.h"
					#include "port.h"
					#include "Messages.h"
			
			
					//#include "senderSenderStateChart.h"	
			
	
			/**
			 * @brief Forward Declaration of the struct SenderSenderStateChart which describes the behavior of SenderComponent
			 * 
			 */
			 typedef struct SenderSenderStateChart SenderSenderStateChart;
			/**
			 * @brief Forward Declaration of the struct SenderComponent
			 */
				typedef struct SenderComponent SenderComponent;
			
			/**
			*  
			* @brief Description for a ComponentInstance of Type: Sender
			* @details This struct describes a specific Component Instances which is typed over the Component: Sender
			*/
			struct SenderComponent {
			
			
						SenderSenderStateChart* stateChart;	/**< The SenderSenderStateChart of the Component Sender */
				
							Port* outPort; /**< A Pointer to the Component's Port: out */
			
						
					
					
			
					SenderComponent * next;/**< A Pointer to the next component part, if this component ist part of a multipart in the CIC */
					
				};
		
			/**
			* @brief This Methodes intializes the Component: Sender
			* @details All struct members of the struct SenderComponent are initialized
			* 
			* @param component The SenderComponent to be initialized
			*/	
				void SenderComponent_initialize(SenderComponent* component);
	
			/**
			* @brief Creates a Instance of the Component: Sender
			* @details Allocates Memory for the struct SenderComponent
			* @return A Pointer to the new created SenderComponent
			*/
				SenderComponent* SenderComponent_create();
	
			/**
			 * @brief Destroys a Component: Sender
			 * @details Frees the Memory for the struct SenderComponent
			 * 
			* @param component The specific SenderComponent to be destroyed
			 */
				void SenderComponent_destroy(SenderComponent* component);
		
			/**
			* @brief Checks if the execution of the Component: Sender  is terminated
			* @details To Check if the execution is terminated the Method is terminated of the stateChart is called
			*		
			* @param component The specific SenderComponent which shall be checked
			* @return True, if the Component is terminated, otherwise false
			*/
				bool_t SenderComponent_isTerminated(SenderComponent* component);
			
			/**
			* @brief Executes the next Step of the behavior an Instance of the Component: Sender
			* @details The behavior of the Component:  Sender is executed.
			*			
			* @param component The SenderComponent whose behavior shall be checked
			*/
				void SenderComponent_processStep(SenderComponent* component);
		
			/**
					 * @brief Get the Port: out of an Instance of the Component: Sender
					 * @details The Pointer SenderComponent::outPort is returned
					 * 
					 * @param component The specific Instance SenderComponent  of the Component: Sender whose Port shall be returned
					 * @return A Pointer to the Port out of the struct SenderComponent
					 */
					Port* SenderComponent_getout(SenderComponent* component);
		
			


#ifdef __cplusplus
  }
#endif
		#endif /* SENDERCOMPONENT_H_ */
