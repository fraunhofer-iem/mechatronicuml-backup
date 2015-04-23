/**
 * @file 
 * @author generated
 * @brief Specification of Component of Type: Driver
 * @details This files contains a description of the Driver in form of the DriverComponent
 * 			and all methods which can be executed on an Instance of this Component
 */
		#ifndef DRIVERCOMPONENT_H_
		#define DRIVERCOMPONENT_H_
				// Library
				#include "../lib/types.h"
					#include "../lib/port.h"
					#include "../messages/messages_types.h"
					//#include "../RTSCs/rootDriverCmpRTSCStateChart.h"	
			
	
			/**
			 * @brief Forward Declaration of the struct RootDriverCmpRTSCStateChart which describes the behavior of DriverComponent
			 * 
			 */
			 typedef struct RootDriverCmpRTSCStateChart RootDriverCmpRTSCStateChart;
			/**
			 * @brief Forward Declaration of the struct DriverComponent
			 */
			typedef struct DriverComponent DriverComponent;
			
			/**
			*  
			* @brief Description for a ComponentInstance of Type: Driver
			* @details This struct describes a specific Component Instances which is typed over the Component: Driver
			*/
			struct DriverComponent {
			
			
						RootDriverCmpRTSCStateChart* stateChart;	/**< The RootDriverCmpRTSCStateChart of the Component Driver */
				
							Port* driverPortPort; /**< A Pointer to the Component's Port: DriverPort */
							Port* motorRightPortPort; /**< A Pointer to the Component's Port: MotorRightPort */
							Port* motorLeftPortPort; /**< A Pointer to the Component's Port: MotorLeftPort */
							Port* lineLeaderPortPort; /**< A Pointer to the Component's Port: LineLeaderPort */
					
			
					DriverComponent * next;
					
				};
		
			/**
			* @brief This Function intializes the Component: Driver
			* @details All struct members of the struct DriverComponent are initialized
			* 
			* @param component The DriverComponent to be initialized
			*/	
				void DriverComponent_initialize(DriverComponent* component);
	
			/**
			* @brief Creates a Instance of the Component: Driver
			* @details Allocates Memory for the struct DriverComponent
			* @return A Pointer to the new created DriverComponent
			*/
				DriverComponent* DriverComponent_create(void);
	
			/**
			 * @brief Destroys a Component: Driver
			 * @details Frees the Memory for the struct DriverComponent
			 * 
			* @param component The specific DriverComponent to be destroyed
			 */
				void DriverComponent_destroy(DriverComponent* component);
		
			/**
			* @brief Checks if the execution of the Component: Driver  is terminated
			* @details To Check if the execution is terminated the Method is terminated of the stateChart is called
			*		In particular the method RootDriverCmpRTSCStateChart::RootDriverCmpRTSCStateChart_isInState is called.
			*
			* @param component The specific DriverComponent which shall be checked
			* @return True, if the Component is terminated, otherwise false
			*/
				bool_t DriverComponent_isTerminated(DriverComponent* component);
			
			/**
			* @brief Executes the next Step of the behavior an Instance of the Component: Driver
			* @details The behavior of the Component:  Driver is executed.
			*			In particular the the method RootDriverCmpRTSCStateChart::RootDriverCmpRTSCStateChart_processStep is called
			* 
			* @param component The DriverComponent whose behavior shall be checked
			*/
				void DriverComponent_processStep(DriverComponent* component);
		
			/**
					 * @brief Get the Port: DriverPort of an Instance of the Component: Driver
					 * @details The Pointer DriverComponent::driverPortPort is returned
					 * 
					 * @param component The specific Instance DriverComponent  of the Component: Driver whose Port shall be returned
					 * @return A Pointer to the Port DriverPort of the struct DriverComponent
					 */
					Port* DriverComponent_getDriverPort(DriverComponent* component);
					/**
					 * @brief Get the Port: MotorRightPort of an Instance of the Component: Driver
					 * @details The Pointer DriverComponent::motorRightPortPort is returned
					 * 
					 * @param component The specific Instance DriverComponent  of the Component: Driver whose Port shall be returned
					 * @return A Pointer to the Port MotorRightPort of the struct DriverComponent
					 */
					Port* DriverComponent_getMotorRightPort(DriverComponent* component);
					/**
					 * @brief Get the Port: MotorLeftPort of an Instance of the Component: Driver
					 * @details The Pointer DriverComponent::motorLeftPortPort is returned
					 * 
					 * @param component The specific Instance DriverComponent  of the Component: Driver whose Port shall be returned
					 * @return A Pointer to the Port MotorLeftPort of the struct DriverComponent
					 */
					Port* DriverComponent_getMotorLeftPort(DriverComponent* component);
					/**
					 * @brief Get the Port: LineLeaderPort of an Instance of the Component: Driver
					 * @details The Pointer DriverComponent::lineLeaderPortPort is returned
					 * 
					 * @param component The specific Instance DriverComponent  of the Component: Driver whose Port shall be returned
					 * @return A Pointer to the Port LineLeaderPort of the struct DriverComponent
					 */
					Port* DriverComponent_getLineLeaderPort(DriverComponent* component);

		
			
	


		#endif /* DRIVERCOMPONENT_H_ */
