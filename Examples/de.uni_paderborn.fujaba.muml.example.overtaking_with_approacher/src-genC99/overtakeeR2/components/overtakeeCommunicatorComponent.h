/**
 * @file 
 * @author generated
 * @brief Specification of Component of Type: overtakeeCommunicator
 * @details This files contains a description of the overtakeeCommunicator in form of the OvertakeeCommunicatorComponent
 * 			and all methods which can be executed on an Instance of this Component
 */
		#ifndef OVERTAKEECOMMUNICATORCOMPONENT_H_
		#define OVERTAKEECOMMUNICATORCOMPONENT_H_
				// Library
				#include "../lib/types.h"
					#include "../lib/port.h"
					#include "../messages/messages_types.h"
					//#include "../RTSCs/rootovertakeeCommunicatorRTSCStateChart.h"	
			
	
			/**
			 * @brief Forward Declaration of the struct RootovertakeeCommunicatorRTSCStateChart which describes the behavior of OvertakeeCommunicatorComponent
			 * 
			 */
			 typedef struct RootovertakeeCommunicatorRTSCStateChart RootovertakeeCommunicatorRTSCStateChart;
			/**
			 * @brief Forward Declaration of the struct OvertakeeCommunicatorComponent
			 */
			typedef struct OvertakeeCommunicatorComponent OvertakeeCommunicatorComponent;
			
			/**
			*  
			* @brief Description for a ComponentInstance of Type: overtakeeCommunicator
			* @details This struct describes a specific Component Instances which is typed over the Component: overtakeeCommunicator
			*/
			struct OvertakeeCommunicatorComponent {
			
			
						RootovertakeeCommunicatorRTSCStateChart* stateChart;	/**< The RootovertakeeCommunicatorRTSCStateChart of the Component overtakeeCommunicator */
				
							Port* overtakeePPort; /**< A Pointer to the Component's Port: overtakeeP */
							Port* vehicleOvertakeePPort; /**< A Pointer to the Component's Port: vehicleOvertakeeP */
							Port* velocitySetterPPort; /**< A Pointer to the Component's Port: velocitySetterP */
							Port* informOvertakeePort; /**< A Pointer to the Component's Port: informOvertakee */
							Port* colorOvertakeePort; /**< A Pointer to the Component's Port: colorOvertakee */
					
			
					OvertakeeCommunicatorComponent * next;
					
				};
		
			/**
			* @brief This Function intializes the Component: overtakeeCommunicator
			* @details All struct members of the struct OvertakeeCommunicatorComponent are initialized
			* 
			* @param component The OvertakeeCommunicatorComponent to be initialized
			*/	
				void OvertakeeCommunicatorComponent_initialize(OvertakeeCommunicatorComponent* component);
	
			/**
			* @brief Creates a Instance of the Component: overtakeeCommunicator
			* @details Allocates Memory for the struct OvertakeeCommunicatorComponent
			* @return A Pointer to the new created OvertakeeCommunicatorComponent
			*/
				OvertakeeCommunicatorComponent* OvertakeeCommunicatorComponent_create(void);
	
			/**
			 * @brief Destroys a Component: overtakeeCommunicator
			 * @details Frees the Memory for the struct OvertakeeCommunicatorComponent
			 * 
			* @param component The specific OvertakeeCommunicatorComponent to be destroyed
			 */
				void OvertakeeCommunicatorComponent_destroy(OvertakeeCommunicatorComponent* component);
		
			/**
			* @brief Checks if the execution of the Component: overtakeeCommunicator  is terminated
			* @details To Check if the execution is terminated the Method is terminated of the stateChart is called
			*		In particular the method RootovertakeeCommunicatorRTSCStateChart::RootovertakeeCommunicatorRTSCStateChart_isInState is called.
			*
			* @param component The specific OvertakeeCommunicatorComponent which shall be checked
			* @return True, if the Component is terminated, otherwise false
			*/
				bool_t OvertakeeCommunicatorComponent_isTerminated(OvertakeeCommunicatorComponent* component);
			
			/**
			* @brief Executes the next Step of the behavior an Instance of the Component: overtakeeCommunicator
			* @details The behavior of the Component:  overtakeeCommunicator is executed.
			*			In particular the the method RootovertakeeCommunicatorRTSCStateChart::RootovertakeeCommunicatorRTSCStateChart_processStep is called
			* 
			* @param component The OvertakeeCommunicatorComponent whose behavior shall be checked
			*/
				void OvertakeeCommunicatorComponent_processStep(OvertakeeCommunicatorComponent* component);
		
			/**
					 * @brief Get the Port: overtakeeP of an Instance of the Component: overtakeeCommunicator
					 * @details The Pointer OvertakeeCommunicatorComponent::overtakeePPort is returned
					 * 
					 * @param component The specific Instance OvertakeeCommunicatorComponent  of the Component: overtakeeCommunicator whose Port shall be returned
					 * @return A Pointer to the Port overtakeeP of the struct OvertakeeCommunicatorComponent
					 */
					Port* OvertakeeCommunicatorComponent_getovertakeeP(OvertakeeCommunicatorComponent* component);
					/**
					 * @brief Get the Port: vehicleOvertakeeP of an Instance of the Component: overtakeeCommunicator
					 * @details The Pointer OvertakeeCommunicatorComponent::vehicleOvertakeePPort is returned
					 * 
					 * @param component The specific Instance OvertakeeCommunicatorComponent  of the Component: overtakeeCommunicator whose Port shall be returned
					 * @return A Pointer to the Port vehicleOvertakeeP of the struct OvertakeeCommunicatorComponent
					 */
					Port* OvertakeeCommunicatorComponent_getvehicleOvertakeeP(OvertakeeCommunicatorComponent* component);
					/**
					 * @brief Get the Port: velocitySetterP of an Instance of the Component: overtakeeCommunicator
					 * @details The Pointer OvertakeeCommunicatorComponent::velocitySetterPPort is returned
					 * 
					 * @param component The specific Instance OvertakeeCommunicatorComponent  of the Component: overtakeeCommunicator whose Port shall be returned
					 * @return A Pointer to the Port velocitySetterP of the struct OvertakeeCommunicatorComponent
					 */
					Port* OvertakeeCommunicatorComponent_getvelocitySetterP(OvertakeeCommunicatorComponent* component);
					/**
					 * @brief Get the Port: informOvertakee of an Instance of the Component: overtakeeCommunicator
					 * @details The Pointer OvertakeeCommunicatorComponent::informOvertakeePort is returned
					 * 
					 * @param component The specific Instance OvertakeeCommunicatorComponent  of the Component: overtakeeCommunicator whose Port shall be returned
					 * @return A Pointer to the Port informOvertakee of the struct OvertakeeCommunicatorComponent
					 */
					Port* OvertakeeCommunicatorComponent_getinformOvertakee(OvertakeeCommunicatorComponent* component);
					/**
					 * @brief Get the Port: colorOvertakee of an Instance of the Component: overtakeeCommunicator
					 * @details The Pointer OvertakeeCommunicatorComponent::colorOvertakeePort is returned
					 * 
					 * @param component The specific Instance OvertakeeCommunicatorComponent  of the Component: overtakeeCommunicator whose Port shall be returned
					 * @return A Pointer to the Port colorOvertakee of the struct OvertakeeCommunicatorComponent
					 */
					Port* OvertakeeCommunicatorComponent_getcolorOvertakee(OvertakeeCommunicatorComponent* component);

		
			
	


		#endif /* OVERTAKEECOMMUNICATORCOMPONENT_H_ */
