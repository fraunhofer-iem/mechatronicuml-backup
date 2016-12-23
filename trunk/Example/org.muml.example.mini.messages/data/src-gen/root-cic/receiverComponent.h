/**
 * @file 
 * @author generated
 * @brief Specification of Component of Type: Receiver
 * @details This files contains a description of the Receiver in form of the ReceiverComponent
 * 			and all methods which can be executed on an Instance of this Component
 */
		#ifndef RECEIVERCOMPONENT_H_
		#define RECEIVERCOMPONENT_H_

#ifdef __cplusplus
  extern "C" {
#endif
				// Library
				#include "standardTypes.h"
				#include "customTypes.h"
					#include "port.h"
					#include "Messages.h"
			
			
					//#include "receiverReceiverStateChart.h"	
			
	
			/**
			 * @brief Forward Declaration of the struct ReceiverReceiverStateChart which describes the behavior of ReceiverComponent
			 * 
			 */
			 typedef struct ReceiverReceiverStateChart ReceiverReceiverStateChart;
			/**
			 * @brief Forward Declaration of the struct ReceiverComponent
			 */
				typedef struct ReceiverComponent ReceiverComponent;
			
			/**
			*  
			* @brief Description for a ComponentInstance of Type: Receiver
			* @details This struct describes a specific Component Instances which is typed over the Component: Receiver
			*/
			struct ReceiverComponent {
			
			
						ReceiverReceiverStateChart* stateChart;	/**< The ReceiverReceiverStateChart of the Component Receiver */
				
							Port* inPort; /**< A Pointer to the Component's Port: in */
			
								void (*setterOf_LED)(int8_T);/**< A Pointer to the setter function of the hybrid port: LED */
			
						
					
					
			
					ReceiverComponent * next;/**< A Pointer to the next component part, if this component ist part of a multipart in the CIC */
					
				};
		
			/**
			* @brief This Methodes intializes the Component: Receiver
			* @details All struct members of the struct ReceiverComponent are initialized
			* 
			* @param component The ReceiverComponent to be initialized
			*/	
				void ReceiverComponent_initialize(ReceiverComponent* component);
	
			/**
			* @brief Creates a Instance of the Component: Receiver
			* @details Allocates Memory for the struct ReceiverComponent
			* @return A Pointer to the new created ReceiverComponent
			*/
				ReceiverComponent* ReceiverComponent_create();
	
			/**
			 * @brief Destroys a Component: Receiver
			 * @details Frees the Memory for the struct ReceiverComponent
			 * 
			* @param component The specific ReceiverComponent to be destroyed
			 */
				void ReceiverComponent_destroy(ReceiverComponent* component);
		
			/**
			* @brief Checks if the execution of the Component: Receiver  is terminated
			* @details To Check if the execution is terminated the Method is terminated of the stateChart is called
			*		
			* @param component The specific ReceiverComponent which shall be checked
			* @return True, if the Component is terminated, otherwise false
			*/
				bool_t ReceiverComponent_isTerminated(ReceiverComponent* component);
			
			/**
			* @brief Executes the next Step of the behavior an Instance of the Component: Receiver
			* @details The behavior of the Component:  Receiver is executed.
			*			
			* @param component The ReceiverComponent whose behavior shall be checked
			*/
				void ReceiverComponent_processStep(ReceiverComponent* component);
		
			/**
					 * @brief Get the Port: in of an Instance of the Component: Receiver
					 * @details The Pointer ReceiverComponent::inPort is returned
					 * 
					 * @param component The specific Instance ReceiverComponent  of the Component: Receiver whose Port shall be returned
					 * @return A Pointer to the Port in of the struct ReceiverComponent
					 */
					Port* ReceiverComponent_getin(ReceiverComponent* component);
		
			


#ifdef __cplusplus
  }
#endif
		#endif /* RECEIVERCOMPONENT_H_ */
