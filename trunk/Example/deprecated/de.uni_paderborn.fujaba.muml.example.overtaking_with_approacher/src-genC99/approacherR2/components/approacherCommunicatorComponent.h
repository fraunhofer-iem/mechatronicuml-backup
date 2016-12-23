/**
 * @file 
 * @author generated
 * @brief Specification of Component of Type: approacherCommunicator
 * @details This files contains a description of the approacherCommunicator in form of the ApproacherCommunicatorComponent
 * 			and all methods which can be executed on an Instance of this Component
 */
		#ifndef APPROACHERCOMMUNICATORCOMPONENT_H_
		#define APPROACHERCOMMUNICATORCOMPONENT_H_
				// Library
				#include "../lib/types.h"
					#include "../lib/port.h"
					#include "../messages/messages_types.h"
					//#include "../RTSCs/rootapproacherCommunicatorRTSCStateChart.h"	
			
	
			/**
			 * @brief Forward Declaration of the struct RootapproacherCommunicatorRTSCStateChart which describes the behavior of ApproacherCommunicatorComponent
			 * 
			 */
			 typedef struct RootapproacherCommunicatorRTSCStateChart RootapproacherCommunicatorRTSCStateChart;
			/**
			 * @brief Forward Declaration of the struct ApproacherCommunicatorComponent
			 */
			typedef struct ApproacherCommunicatorComponent ApproacherCommunicatorComponent;
			
			/**
			*  
			* @brief Description for a ComponentInstance of Type: approacherCommunicator
			* @details This struct describes a specific Component Instances which is typed over the Component: approacherCommunicator
			*/
			struct ApproacherCommunicatorComponent {
			
			
						RootapproacherCommunicatorRTSCStateChart* stateChart;	/**< The RootapproacherCommunicatorRTSCStateChart of the Component approacherCommunicator */
				
							Port* informApproacherPPort; /**< A Pointer to the Component's Port: informApproacherP */
							Port* limitDrivingPPort; /**< A Pointer to the Component's Port: limitDrivingP */
							Port* vehicleApproacherPPort; /**< A Pointer to the Component's Port: vehicleApproacherP */
							Port* colorApproacherPort; /**< A Pointer to the Component's Port: colorApproacher */
					
			
					ApproacherCommunicatorComponent * next;
					
				};
		
			/**
			* @brief This Function intializes the Component: approacherCommunicator
			* @details All struct members of the struct ApproacherCommunicatorComponent are initialized
			* 
			* @param component The ApproacherCommunicatorComponent to be initialized
			*/	
				void ApproacherCommunicatorComponent_initialize(ApproacherCommunicatorComponent* component);
	
			/**
			* @brief Creates a Instance of the Component: approacherCommunicator
			* @details Allocates Memory for the struct ApproacherCommunicatorComponent
			* @return A Pointer to the new created ApproacherCommunicatorComponent
			*/
				ApproacherCommunicatorComponent* ApproacherCommunicatorComponent_create(void);
	
			/**
			 * @brief Destroys a Component: approacherCommunicator
			 * @details Frees the Memory for the struct ApproacherCommunicatorComponent
			 * 
			* @param component The specific ApproacherCommunicatorComponent to be destroyed
			 */
				void ApproacherCommunicatorComponent_destroy(ApproacherCommunicatorComponent* component);
		
			/**
			* @brief Checks if the execution of the Component: approacherCommunicator  is terminated
			* @details To Check if the execution is terminated the Method is terminated of the stateChart is called
			*		In particular the method RootapproacherCommunicatorRTSCStateChart::RootapproacherCommunicatorRTSCStateChart_isInState is called.
			*
			* @param component The specific ApproacherCommunicatorComponent which shall be checked
			* @return True, if the Component is terminated, otherwise false
			*/
				bool_t ApproacherCommunicatorComponent_isTerminated(ApproacherCommunicatorComponent* component);
			
			/**
			* @brief Executes the next Step of the behavior an Instance of the Component: approacherCommunicator
			* @details The behavior of the Component:  approacherCommunicator is executed.
			*			In particular the the method RootapproacherCommunicatorRTSCStateChart::RootapproacherCommunicatorRTSCStateChart_processStep is called
			* 
			* @param component The ApproacherCommunicatorComponent whose behavior shall be checked
			*/
				void ApproacherCommunicatorComponent_processStep(ApproacherCommunicatorComponent* component);
		
			/**
					 * @brief Get the Port: informApproacherP of an Instance of the Component: approacherCommunicator
					 * @details The Pointer ApproacherCommunicatorComponent::informApproacherPPort is returned
					 * 
					 * @param component The specific Instance ApproacherCommunicatorComponent  of the Component: approacherCommunicator whose Port shall be returned
					 * @return A Pointer to the Port informApproacherP of the struct ApproacherCommunicatorComponent
					 */
					Port* ApproacherCommunicatorComponent_getinformApproacherP(ApproacherCommunicatorComponent* component);
					/**
					 * @brief Get the Port: limitDrivingP of an Instance of the Component: approacherCommunicator
					 * @details The Pointer ApproacherCommunicatorComponent::limitDrivingPPort is returned
					 * 
					 * @param component The specific Instance ApproacherCommunicatorComponent  of the Component: approacherCommunicator whose Port shall be returned
					 * @return A Pointer to the Port limitDrivingP of the struct ApproacherCommunicatorComponent
					 */
					Port* ApproacherCommunicatorComponent_getlimitDrivingP(ApproacherCommunicatorComponent* component);
					/**
					 * @brief Get the Port: vehicleApproacherP of an Instance of the Component: approacherCommunicator
					 * @details The Pointer ApproacherCommunicatorComponent::vehicleApproacherPPort is returned
					 * 
					 * @param component The specific Instance ApproacherCommunicatorComponent  of the Component: approacherCommunicator whose Port shall be returned
					 * @return A Pointer to the Port vehicleApproacherP of the struct ApproacherCommunicatorComponent
					 */
					Port* ApproacherCommunicatorComponent_getvehicleApproacherP(ApproacherCommunicatorComponent* component);
					/**
					 * @brief Get the Port: colorApproacher of an Instance of the Component: approacherCommunicator
					 * @details The Pointer ApproacherCommunicatorComponent::colorApproacherPort is returned
					 * 
					 * @param component The specific Instance ApproacherCommunicatorComponent  of the Component: approacherCommunicator whose Port shall be returned
					 * @return A Pointer to the Port colorApproacher of the struct ApproacherCommunicatorComponent
					 */
					Port* ApproacherCommunicatorComponent_getcolorApproacher(ApproacherCommunicatorComponent* component);

		
			
	


		#endif /* APPROACHERCOMMUNICATORCOMPONENT_H_ */
