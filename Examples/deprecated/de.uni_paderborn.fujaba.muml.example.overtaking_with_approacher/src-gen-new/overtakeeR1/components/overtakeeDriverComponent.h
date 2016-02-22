/**
 * @file 
 * @author generated
 * @brief Specification of Component of Type: overtakeeDriver
 * @details This files contains a description of the overtakeeDriver in form of the OvertakeeDriverComponent
 * 			and all methods which can be executed on an Instance of this Component
 */
		#ifndef OVERTAKEEDRIVERCOMPONENT_H_
		#define OVERTAKEEDRIVERCOMPONENT_H_
				// Library
				#include "../lib/types.h"
					#include "../lib/port.h"
					#include "../messages/messages_types.h"
					//#include "../RTSCs/rootovertakeeDriverRTSCStateChart.h"	
			
	
			/**
			 * @brief Forward Declaration of the struct RootovertakeeDriverRTSCStateChart which describes the behavior of OvertakeeDriverComponent
			 * 
			 */
			 typedef struct RootovertakeeDriverRTSCStateChart RootovertakeeDriverRTSCStateChart;
			/**
			 * @brief Forward Declaration of the struct OvertakeeDriverComponent
			 */
			typedef struct OvertakeeDriverComponent OvertakeeDriverComponent;
			
			/**
			*  
			* @brief Description for a ComponentInstance of Type: overtakeeDriver
			* @details This struct describes a specific Component Instances which is typed over the Component: overtakeeDriver
			*/
			struct OvertakeeDriverComponent {
			
			
						RootovertakeeDriverRTSCStateChart* stateChart;	/**< The RootovertakeeDriverRTSCStateChart of the Component overtakeeDriver */
				
							Port* velocityGetterPPort; /**< A Pointer to the Component's Port: velocityGetterP */
							Port* velocityLPort; /**< A Pointer to the Component's Port: velocityL */
							Port* velocityRPort; /**< A Pointer to the Component's Port: velocityR */
							Port* lineOvertakeePort; /**< A Pointer to the Component's Port: lineOvertakee */
							Port* distanceOvertakeePort; /**< A Pointer to the Component's Port: distanceOvertakee */
					
			
					OvertakeeDriverComponent * next;
					
				};
		
			/**
			* @brief This Function intializes the Component: overtakeeDriver
			* @details All struct members of the struct OvertakeeDriverComponent are initialized
			* 
			* @param component The OvertakeeDriverComponent to be initialized
			*/	
				void OvertakeeDriverComponent_initialize(OvertakeeDriverComponent* component);
	
			/**
			* @brief Creates a Instance of the Component: overtakeeDriver
			* @details Allocates Memory for the struct OvertakeeDriverComponent
			* @return A Pointer to the new created OvertakeeDriverComponent
			*/
				OvertakeeDriverComponent* OvertakeeDriverComponent_create(void);
	
			/**
			 * @brief Destroys a Component: overtakeeDriver
			 * @details Frees the Memory for the struct OvertakeeDriverComponent
			 * 
			* @param component The specific OvertakeeDriverComponent to be destroyed
			 */
				void OvertakeeDriverComponent_destroy(OvertakeeDriverComponent* component);
		
			/**
			* @brief Checks if the execution of the Component: overtakeeDriver  is terminated
			* @details To Check if the execution is terminated the Method is terminated of the stateChart is called
			*		In particular the method RootovertakeeDriverRTSCStateChart::RootovertakeeDriverRTSCStateChart_isInState is called.
			*
			* @param component The specific OvertakeeDriverComponent which shall be checked
			* @return True, if the Component is terminated, otherwise false
			*/
				bool_t OvertakeeDriverComponent_isTerminated(OvertakeeDriverComponent* component);
			
			/**
			* @brief Executes the next Step of the behavior an Instance of the Component: overtakeeDriver
			* @details The behavior of the Component:  overtakeeDriver is executed.
			*			In particular the the method RootovertakeeDriverRTSCStateChart::RootovertakeeDriverRTSCStateChart_processStep is called
			* 
			* @param component The OvertakeeDriverComponent whose behavior shall be checked
			*/
				void OvertakeeDriverComponent_processStep(OvertakeeDriverComponent* component);
		
			/**
					 * @brief Get the Port: velocityGetterP of an Instance of the Component: overtakeeDriver
					 * @details The Pointer OvertakeeDriverComponent::velocityGetterPPort is returned
					 * 
					 * @param component The specific Instance OvertakeeDriverComponent  of the Component: overtakeeDriver whose Port shall be returned
					 * @return A Pointer to the Port velocityGetterP of the struct OvertakeeDriverComponent
					 */
					Port* OvertakeeDriverComponent_getvelocityGetterP(OvertakeeDriverComponent* component);
					/**
					 * @brief Get the Port: velocityL of an Instance of the Component: overtakeeDriver
					 * @details The Pointer OvertakeeDriverComponent::velocityLPort is returned
					 * 
					 * @param component The specific Instance OvertakeeDriverComponent  of the Component: overtakeeDriver whose Port shall be returned
					 * @return A Pointer to the Port velocityL of the struct OvertakeeDriverComponent
					 */
					Port* OvertakeeDriverComponent_getvelocityL(OvertakeeDriverComponent* component);
					/**
					 * @brief Get the Port: velocityR of an Instance of the Component: overtakeeDriver
					 * @details The Pointer OvertakeeDriverComponent::velocityRPort is returned
					 * 
					 * @param component The specific Instance OvertakeeDriverComponent  of the Component: overtakeeDriver whose Port shall be returned
					 * @return A Pointer to the Port velocityR of the struct OvertakeeDriverComponent
					 */
					Port* OvertakeeDriverComponent_getvelocityR(OvertakeeDriverComponent* component);
					/**
					 * @brief Get the Port: lineOvertakee of an Instance of the Component: overtakeeDriver
					 * @details The Pointer OvertakeeDriverComponent::lineOvertakeePort is returned
					 * 
					 * @param component The specific Instance OvertakeeDriverComponent  of the Component: overtakeeDriver whose Port shall be returned
					 * @return A Pointer to the Port lineOvertakee of the struct OvertakeeDriverComponent
					 */
					Port* OvertakeeDriverComponent_getlineOvertakee(OvertakeeDriverComponent* component);
					/**
					 * @brief Get the Port: distanceOvertakee of an Instance of the Component: overtakeeDriver
					 * @details The Pointer OvertakeeDriverComponent::distanceOvertakeePort is returned
					 * 
					 * @param component The specific Instance OvertakeeDriverComponent  of the Component: overtakeeDriver whose Port shall be returned
					 * @return A Pointer to the Port distanceOvertakee of the struct OvertakeeDriverComponent
					 */
					Port* OvertakeeDriverComponent_getdistanceOvertakee(OvertakeeDriverComponent* component);

		
			
	


		#endif /* OVERTAKEEDRIVERCOMPONENT_H_ */
