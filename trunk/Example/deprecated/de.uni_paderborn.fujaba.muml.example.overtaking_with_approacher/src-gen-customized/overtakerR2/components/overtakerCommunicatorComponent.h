/**
 * @file 
 * @author generated
 * @brief Specification of Component of Type: overtakerCommunicator
 * @details This files contains a description of the overtakerCommunicator in form of the OvertakerCommunicatorComponent
 * 			and all methods which can be executed on an Instance of this Component
 */
		#ifndef OVERTAKERCOMMUNICATORCOMPONENT_H_
		#define OVERTAKERCOMMUNICATORCOMPONENT_H_
				// Library
				#include "../lib/types.h"
					#include "../lib/port.h"
					#include "../messages/messages_types.h"
					//#include "../RTSCs/rootovertakerCommunicatorRTSCStateChart.h"	
			
	
			/**
			 * @brief Forward Declaration of the struct RootovertakerCommunicatorRTSCStateChart which describes the behavior of OvertakerCommunicatorComponent
			 * 
			 */
			 typedef struct RootovertakerCommunicatorRTSCStateChart RootovertakerCommunicatorRTSCStateChart;
			/**
			 * @brief Forward Declaration of the struct OvertakerCommunicatorComponent
			 */
			typedef struct OvertakerCommunicatorComponent OvertakerCommunicatorComponent;
			
			/**
			*  
			* @brief Description for a ComponentInstance of Type: overtakerCommunicator
			* @details This struct describes a specific Component Instances which is typed over the Component: overtakerCommunicator
			*/
			struct OvertakerCommunicatorComponent {
			
			
						RootovertakerCommunicatorRTSCStateChart* stateChart;	/**< The RootovertakerCommunicatorRTSCStateChart of the Component overtakerCommunicator */
				
							Port* overtakerPPort; /**< A Pointer to the Component's Port: overtakerP */
							Port* vehicleOvertakerPPort; /**< A Pointer to the Component's Port: vehicleOvertakerP */
							Port* executorPPort; /**< A Pointer to the Component's Port: executorP */
							Port* requestorPPort; /**< A Pointer to the Component's Port: requestorP */
							Port* colorPort; /**< A Pointer to the Component's Port: color */
					
			
					OvertakerCommunicatorComponent * next;
					
				};
		
			/**
			* @brief This Function intializes the Component: overtakerCommunicator
			* @details All struct members of the struct OvertakerCommunicatorComponent are initialized
			* 
			* @param component The OvertakerCommunicatorComponent to be initialized
			*/	
				void OvertakerCommunicatorComponent_initialize(OvertakerCommunicatorComponent* component);
	
			/**
			* @brief Creates a Instance of the Component: overtakerCommunicator
			* @details Allocates Memory for the struct OvertakerCommunicatorComponent
			* @return A Pointer to the new created OvertakerCommunicatorComponent
			*/
				OvertakerCommunicatorComponent* OvertakerCommunicatorComponent_create(void);
	
			/**
			 * @brief Destroys a Component: overtakerCommunicator
			 * @details Frees the Memory for the struct OvertakerCommunicatorComponent
			 * 
			* @param component The specific OvertakerCommunicatorComponent to be destroyed
			 */
				void OvertakerCommunicatorComponent_destroy(OvertakerCommunicatorComponent* component);
		
			/**
			* @brief Checks if the execution of the Component: overtakerCommunicator  is terminated
			* @details To Check if the execution is terminated the Method is terminated of the stateChart is called
			*		In particular the method RootovertakerCommunicatorRTSCStateChart::RootovertakerCommunicatorRTSCStateChart_isInState is called.
			*
			* @param component The specific OvertakerCommunicatorComponent which shall be checked
			* @return True, if the Component is terminated, otherwise false
			*/
				bool_t OvertakerCommunicatorComponent_isTerminated(OvertakerCommunicatorComponent* component);
			
			/**
			* @brief Executes the next Step of the behavior an Instance of the Component: overtakerCommunicator
			* @details The behavior of the Component:  overtakerCommunicator is executed.
			*			In particular the the method RootovertakerCommunicatorRTSCStateChart::RootovertakerCommunicatorRTSCStateChart_processStep is called
			* 
			* @param component The OvertakerCommunicatorComponent whose behavior shall be checked
			*/
				void OvertakerCommunicatorComponent_processStep(OvertakerCommunicatorComponent* component);
		
			/**
					 * @brief Get the Port: overtakerP of an Instance of the Component: overtakerCommunicator
					 * @details The Pointer OvertakerCommunicatorComponent::overtakerPPort is returned
					 * 
					 * @param component The specific Instance OvertakerCommunicatorComponent  of the Component: overtakerCommunicator whose Port shall be returned
					 * @return A Pointer to the Port overtakerP of the struct OvertakerCommunicatorComponent
					 */
					Port* OvertakerCommunicatorComponent_getovertakerP(OvertakerCommunicatorComponent* component);
					/**
					 * @brief Get the Port: vehicleOvertakerP of an Instance of the Component: overtakerCommunicator
					 * @details The Pointer OvertakerCommunicatorComponent::vehicleOvertakerPPort is returned
					 * 
					 * @param component The specific Instance OvertakerCommunicatorComponent  of the Component: overtakerCommunicator whose Port shall be returned
					 * @return A Pointer to the Port vehicleOvertakerP of the struct OvertakerCommunicatorComponent
					 */
					Port* OvertakerCommunicatorComponent_getvehicleOvertakerP(OvertakerCommunicatorComponent* component);
					/**
					 * @brief Get the Port: executorP of an Instance of the Component: overtakerCommunicator
					 * @details The Pointer OvertakerCommunicatorComponent::executorPPort is returned
					 * 
					 * @param component The specific Instance OvertakerCommunicatorComponent  of the Component: overtakerCommunicator whose Port shall be returned
					 * @return A Pointer to the Port executorP of the struct OvertakerCommunicatorComponent
					 */
					Port* OvertakerCommunicatorComponent_getexecutorP(OvertakerCommunicatorComponent* component);
					/**
					 * @brief Get the Port: requestorP of an Instance of the Component: overtakerCommunicator
					 * @details The Pointer OvertakerCommunicatorComponent::requestorPPort is returned
					 * 
					 * @param component The specific Instance OvertakerCommunicatorComponent  of the Component: overtakerCommunicator whose Port shall be returned
					 * @return A Pointer to the Port requestorP of the struct OvertakerCommunicatorComponent
					 */
					Port* OvertakerCommunicatorComponent_getrequestorP(OvertakerCommunicatorComponent* component);
					/**
					 * @brief Get the Port: color of an Instance of the Component: overtakerCommunicator
					 * @details The Pointer OvertakerCommunicatorComponent::colorPort is returned
					 * 
					 * @param component The specific Instance OvertakerCommunicatorComponent  of the Component: overtakerCommunicator whose Port shall be returned
					 * @return A Pointer to the Port color of the struct OvertakerCommunicatorComponent
					 */
					Port* OvertakerCommunicatorComponent_getcolor(OvertakerCommunicatorComponent* component);

		
			
	


		#endif /* OVERTAKERCOMMUNICATORCOMPONENT_H_ */
