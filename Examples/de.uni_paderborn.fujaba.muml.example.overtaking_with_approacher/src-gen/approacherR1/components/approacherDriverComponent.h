/**
 * @file 
 * @author generated
 * @brief Specification of Component of Type: approacherDriver
 * @details This files contains a description of the approacherDriver in form of the ApproacherDriverComponent
 * 			and all methods which can be executed on an Instance of this Component
 */
		#ifndef APPROACHERDRIVERCOMPONENT_H_
		#define APPROACHERDRIVERCOMPONENT_H_
				// Library
				#include "../lib/types.h"
					#include "../lib/port.h"
					#include "../messages/messages_types.h"
					//#include "../RTSCs/rootapproacherDriverRTSCStateChart.h"	
			
	
			/**
			 * @brief Forward Declaration of the struct RootapproacherDriverRTSCStateChart which describes the behavior of ApproacherDriverComponent
			 * 
			 */
			 typedef struct RootapproacherDriverRTSCStateChart RootapproacherDriverRTSCStateChart;
			/**
			 * @brief Forward Declaration of the struct ApproacherDriverComponent
			 */
			typedef struct ApproacherDriverComponent ApproacherDriverComponent;
			
			/**
			*  
			* @brief Description for a ComponentInstance of Type: approacherDriver
			* @details This struct describes a specific Component Instances which is typed over the Component: approacherDriver
			*/
			struct ApproacherDriverComponent {
			
			
						RootapproacherDriverRTSCStateChart* stateChart;	/**< The RootapproacherDriverRTSCStateChart of the Component approacherDriver */
				
							Port* limiterPPort; /**< A Pointer to the Component's Port: limiterP */
							Port* velocityLPort; /**< A Pointer to the Component's Port: velocityL */
							Port* velocityRPort; /**< A Pointer to the Component's Port: velocityR */
							Port* lineApproacherPort; /**< A Pointer to the Component's Port: lineApproacher */
							Port* distancePort; /**< A Pointer to the Component's Port: distance */
					
			
					ApproacherDriverComponent * next;
					
				};
		
			/**
			* @brief This Function intializes the Component: approacherDriver
			* @details All struct members of the struct ApproacherDriverComponent are initialized
			* 
			* @param component The ApproacherDriverComponent to be initialized
			*/	
				void ApproacherDriverComponent_initialize(ApproacherDriverComponent* component);
	
			/**
			* @brief Creates a Instance of the Component: approacherDriver
			* @details Allocates Memory for the struct ApproacherDriverComponent
			* @return A Pointer to the new created ApproacherDriverComponent
			*/
				ApproacherDriverComponent* ApproacherDriverComponent_create(void);
	
			/**
			 * @brief Destroys a Component: approacherDriver
			 * @details Frees the Memory for the struct ApproacherDriverComponent
			 * 
			* @param component The specific ApproacherDriverComponent to be destroyed
			 */
				void ApproacherDriverComponent_destroy(ApproacherDriverComponent* component);
		
			/**
			* @brief Checks if the execution of the Component: approacherDriver  is terminated
			* @details To Check if the execution is terminated the Method is terminated of the stateChart is called
			*		In particular the method RootapproacherDriverRTSCStateChart::RootapproacherDriverRTSCStateChart_isInState is called.
			*
			* @param component The specific ApproacherDriverComponent which shall be checked
			* @return True, if the Component is terminated, otherwise false
			*/
				bool_t ApproacherDriverComponent_isTerminated(ApproacherDriverComponent* component);
			
			/**
			* @brief Executes the next Step of the behavior an Instance of the Component: approacherDriver
			* @details The behavior of the Component:  approacherDriver is executed.
			*			In particular the the method RootapproacherDriverRTSCStateChart::RootapproacherDriverRTSCStateChart_processStep is called
			* 
			* @param component The ApproacherDriverComponent whose behavior shall be checked
			*/
				void ApproacherDriverComponent_processStep(ApproacherDriverComponent* component);
		
			/**
					 * @brief Get the Port: limiterP of an Instance of the Component: approacherDriver
					 * @details The Pointer ApproacherDriverComponent::limiterPPort is returned
					 * 
					 * @param component The specific Instance ApproacherDriverComponent  of the Component: approacherDriver whose Port shall be returned
					 * @return A Pointer to the Port limiterP of the struct ApproacherDriverComponent
					 */
					Port* ApproacherDriverComponent_getlimiterP(ApproacherDriverComponent* component);
					/**
					 * @brief Get the Port: velocityL of an Instance of the Component: approacherDriver
					 * @details The Pointer ApproacherDriverComponent::velocityLPort is returned
					 * 
					 * @param component The specific Instance ApproacherDriverComponent  of the Component: approacherDriver whose Port shall be returned
					 * @return A Pointer to the Port velocityL of the struct ApproacherDriverComponent
					 */
					Port* ApproacherDriverComponent_getvelocityL(ApproacherDriverComponent* component);
					/**
					 * @brief Get the Port: velocityR of an Instance of the Component: approacherDriver
					 * @details The Pointer ApproacherDriverComponent::velocityRPort is returned
					 * 
					 * @param component The specific Instance ApproacherDriverComponent  of the Component: approacherDriver whose Port shall be returned
					 * @return A Pointer to the Port velocityR of the struct ApproacherDriverComponent
					 */
					Port* ApproacherDriverComponent_getvelocityR(ApproacherDriverComponent* component);
					/**
					 * @brief Get the Port: lineApproacher of an Instance of the Component: approacherDriver
					 * @details The Pointer ApproacherDriverComponent::lineApproacherPort is returned
					 * 
					 * @param component The specific Instance ApproacherDriverComponent  of the Component: approacherDriver whose Port shall be returned
					 * @return A Pointer to the Port lineApproacher of the struct ApproacherDriverComponent
					 */
					Port* ApproacherDriverComponent_getlineApproacher(ApproacherDriverComponent* component);
					/**
					 * @brief Get the Port: distance of an Instance of the Component: approacherDriver
					 * @details The Pointer ApproacherDriverComponent::distancePort is returned
					 * 
					 * @param component The specific Instance ApproacherDriverComponent  of the Component: approacherDriver whose Port shall be returned
					 * @return A Pointer to the Port distance of the struct ApproacherDriverComponent
					 */
					Port* ApproacherDriverComponent_getdistance(ApproacherDriverComponent* component);

		
			
	


		#endif /* APPROACHERDRIVERCOMPONENT_H_ */
