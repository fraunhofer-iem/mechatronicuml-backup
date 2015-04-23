/**
 * @file 
 * @author generated
 * @brief Specification of Component of Type: Communicator
 * @details This files contains a description of the Communicator in form of the CommunicatorComponent
 * 			and all methods which can be executed on an Instance of this Component
 */
		#ifndef COMMUNICATORCOMPONENT_H_
		#define COMMUNICATORCOMPONENT_H_
				// Library
				#include "../lib/types.h"
					#include "../lib/port.h"
					#include "../messages/messages_types.h"
					//#include "../RTSCs/rootCommunicatorCmpRTSCStateChart.h"	
			
	
			/**
			 * @brief Forward Declaration of the struct RootCommunicatorCmpRTSCStateChart which describes the behavior of CommunicatorComponent
			 * 
			 */
			 typedef struct RootCommunicatorCmpRTSCStateChart RootCommunicatorCmpRTSCStateChart;
			/**
			 * @brief Forward Declaration of the struct CommunicatorComponent
			 */
			typedef struct CommunicatorComponent CommunicatorComponent;
			
			/**
			*  
			* @brief Description for a ComponentInstance of Type: Communicator
			* @details This struct describes a specific Component Instances which is typed over the Component: Communicator
			*/
			struct CommunicatorComponent {
			
			
						RootCommunicatorCmpRTSCStateChart* stateChart;	/**< The RootCommunicatorCmpRTSCStateChart of the Component Communicator */
				
							Port* pickUpPortPort; /**< A Pointer to the Component's Port: PickUpPort */
							Port* communicatorPortPort; /**< A Pointer to the Component's Port: CommunicatorPort */
					
			
					CommunicatorComponent * next;
					
				};
		
			/**
			* @brief This Function intializes the Component: Communicator
			* @details All struct members of the struct CommunicatorComponent are initialized
			* 
			* @param component The CommunicatorComponent to be initialized
			*/	
				void CommunicatorComponent_initialize(CommunicatorComponent* component);
	
			/**
			* @brief Creates a Instance of the Component: Communicator
			* @details Allocates Memory for the struct CommunicatorComponent
			* @return A Pointer to the new created CommunicatorComponent
			*/
				CommunicatorComponent* CommunicatorComponent_create(void);
	
			/**
			 * @brief Destroys a Component: Communicator
			 * @details Frees the Memory for the struct CommunicatorComponent
			 * 
			* @param component The specific CommunicatorComponent to be destroyed
			 */
				void CommunicatorComponent_destroy(CommunicatorComponent* component);
		
			/**
			* @brief Checks if the execution of the Component: Communicator  is terminated
			* @details To Check if the execution is terminated the Method is terminated of the stateChart is called
			*		In particular the method RootCommunicatorCmpRTSCStateChart::RootCommunicatorCmpRTSCStateChart_isInState is called.
			*
			* @param component The specific CommunicatorComponent which shall be checked
			* @return True, if the Component is terminated, otherwise false
			*/
				bool_t CommunicatorComponent_isTerminated(CommunicatorComponent* component);
			
			/**
			* @brief Executes the next Step of the behavior an Instance of the Component: Communicator
			* @details The behavior of the Component:  Communicator is executed.
			*			In particular the the method RootCommunicatorCmpRTSCStateChart::RootCommunicatorCmpRTSCStateChart_processStep is called
			* 
			* @param component The CommunicatorComponent whose behavior shall be checked
			*/
				void CommunicatorComponent_processStep(CommunicatorComponent* component);
		
			/**
					 * @brief Get the Port: PickUpPort of an Instance of the Component: Communicator
					 * @details The Pointer CommunicatorComponent::pickUpPortPort is returned
					 * 
					 * @param component The specific Instance CommunicatorComponent  of the Component: Communicator whose Port shall be returned
					 * @return A Pointer to the Port PickUpPort of the struct CommunicatorComponent
					 */
					Port* CommunicatorComponent_getPickUpPort(CommunicatorComponent* component);
					/**
					 * @brief Get the Port: CommunicatorPort of an Instance of the Component: Communicator
					 * @details The Pointer CommunicatorComponent::communicatorPortPort is returned
					 * 
					 * @param component The specific Instance CommunicatorComponent  of the Component: Communicator whose Port shall be returned
					 * @return A Pointer to the Port CommunicatorPort of the struct CommunicatorComponent
					 */
					Port* CommunicatorComponent_getCommunicatorPort(CommunicatorComponent* component);

		
			
	


		#endif /* COMMUNICATORCOMPONENT_H_ */
