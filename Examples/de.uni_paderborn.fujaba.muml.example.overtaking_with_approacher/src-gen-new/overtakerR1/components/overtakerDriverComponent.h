/**
 * @file 
 * @author generated
 * @brief Specification of Component of Type: overtakerDriver
 * @details This files contains a description of the overtakerDriver in form of the OvertakerDriverComponent
 * 			and all methods which can be executed on an Instance of this Component
 */
		#ifndef OVERTAKERDRIVERCOMPONENT_H_
		#define OVERTAKERDRIVERCOMPONENT_H_
				// Library
				#include "../lib/types.h"
					#include "../lib/port.h"
					#include "../messages/messages_types.h"
					//#include "../RTSCs/rootovertakerDriverRTSCStateChart.h"	
			
	
			/**
			 * @brief Forward Declaration of the struct RootovertakerDriverRTSCStateChart which describes the behavior of OvertakerDriverComponent
			 * 
			 */
			 typedef struct RootovertakerDriverRTSCStateChart RootovertakerDriverRTSCStateChart;
			/**
			 * @brief Forward Declaration of the struct OvertakerDriverComponent
			 */
			typedef struct OvertakerDriverComponent OvertakerDriverComponent;
			
			/**
			*  
			* @brief Description for a ComponentInstance of Type: overtakerDriver
			* @details This struct describes a specific Component Instances which is typed over the Component: overtakerDriver
			*/
			struct OvertakerDriverComponent {
			
			
						RootovertakerDriverRTSCStateChart* stateChart;	/**< The RootovertakerDriverRTSCStateChart of the Component overtakerDriver */
				
							Port* initiatorPPort; /**< A Pointer to the Component's Port: initiatorP */
							Port* velocityRPort; /**< A Pointer to the Component's Port: velocityR */
							Port* velocityLPort; /**< A Pointer to the Component's Port: velocityL */
							Port* distancePort; /**< A Pointer to the Component's Port: distance */
							Port* linePort; /**< A Pointer to the Component's Port: line */
					
			
					OvertakerDriverComponent * next;
					
				};
		
			/**
			* @brief This Function intializes the Component: overtakerDriver
			* @details All struct members of the struct OvertakerDriverComponent are initialized
			* 
			* @param component The OvertakerDriverComponent to be initialized
			*/	
				void OvertakerDriverComponent_initialize(OvertakerDriverComponent* component);
	
			/**
			* @brief Creates a Instance of the Component: overtakerDriver
			* @details Allocates Memory for the struct OvertakerDriverComponent
			* @return A Pointer to the new created OvertakerDriverComponent
			*/
				OvertakerDriverComponent* OvertakerDriverComponent_create(void);
	
			/**
			 * @brief Destroys a Component: overtakerDriver
			 * @details Frees the Memory for the struct OvertakerDriverComponent
			 * 
			* @param component The specific OvertakerDriverComponent to be destroyed
			 */
				void OvertakerDriverComponent_destroy(OvertakerDriverComponent* component);
		
			/**
			* @brief Checks if the execution of the Component: overtakerDriver  is terminated
			* @details To Check if the execution is terminated the Method is terminated of the stateChart is called
			*		In particular the method RootovertakerDriverRTSCStateChart::RootovertakerDriverRTSCStateChart_isInState is called.
			*
			* @param component The specific OvertakerDriverComponent which shall be checked
			* @return True, if the Component is terminated, otherwise false
			*/
				bool_t OvertakerDriverComponent_isTerminated(OvertakerDriverComponent* component);
			
			/**
			* @brief Executes the next Step of the behavior an Instance of the Component: overtakerDriver
			* @details The behavior of the Component:  overtakerDriver is executed.
			*			In particular the the method RootovertakerDriverRTSCStateChart::RootovertakerDriverRTSCStateChart_processStep is called
			* 
			* @param component The OvertakerDriverComponent whose behavior shall be checked
			*/
				void OvertakerDriverComponent_processStep(OvertakerDriverComponent* component);
		
			/**
					 * @brief Get the Port: initiatorP of an Instance of the Component: overtakerDriver
					 * @details The Pointer OvertakerDriverComponent::initiatorPPort is returned
					 * 
					 * @param component The specific Instance OvertakerDriverComponent  of the Component: overtakerDriver whose Port shall be returned
					 * @return A Pointer to the Port initiatorP of the struct OvertakerDriverComponent
					 */
					Port* OvertakerDriverComponent_getinitiatorP(OvertakerDriverComponent* component);
					/**
					 * @brief Get the Port: velocityR of an Instance of the Component: overtakerDriver
					 * @details The Pointer OvertakerDriverComponent::velocityRPort is returned
					 * 
					 * @param component The specific Instance OvertakerDriverComponent  of the Component: overtakerDriver whose Port shall be returned
					 * @return A Pointer to the Port velocityR of the struct OvertakerDriverComponent
					 */
					Port* OvertakerDriverComponent_getvelocityR(OvertakerDriverComponent* component);
					/**
					 * @brief Get the Port: velocityL of an Instance of the Component: overtakerDriver
					 * @details The Pointer OvertakerDriverComponent::velocityLPort is returned
					 * 
					 * @param component The specific Instance OvertakerDriverComponent  of the Component: overtakerDriver whose Port shall be returned
					 * @return A Pointer to the Port velocityL of the struct OvertakerDriverComponent
					 */
					Port* OvertakerDriverComponent_getvelocityL(OvertakerDriverComponent* component);
					/**
					 * @brief Get the Port: distance of an Instance of the Component: overtakerDriver
					 * @details The Pointer OvertakerDriverComponent::distancePort is returned
					 * 
					 * @param component The specific Instance OvertakerDriverComponent  of the Component: overtakerDriver whose Port shall be returned
					 * @return A Pointer to the Port distance of the struct OvertakerDriverComponent
					 */
					Port* OvertakerDriverComponent_getdistance(OvertakerDriverComponent* component);
					/**
					 * @brief Get the Port: line of an Instance of the Component: overtakerDriver
					 * @details The Pointer OvertakerDriverComponent::linePort is returned
					 * 
					 * @param component The specific Instance OvertakerDriverComponent  of the Component: overtakerDriver whose Port shall be returned
					 * @return A Pointer to the Port line of the struct OvertakerDriverComponent
					 */
					Port* OvertakerDriverComponent_getline(OvertakerDriverComponent* component);

		
			
	


		#endif /* OVERTAKERDRIVERCOMPONENT_H_ */
