/**
 * @file 
 * @author generated
 * @brief Specification of Component of Type: sectionControl
 * @details This files contains a description of the sectionControl in form of the SectionControlComponent
 * 			and all methods which can be executed on an Instance of this Component
 */
		#ifndef SECTIONCONTROLCOMPONENT_H_
		#define SECTIONCONTROLCOMPONENT_H_
				// Library
				#include "../lib/types.h"
					#include "../lib/port.h"
					#include "../messages/messages_types.h"
					//#include "../RTSCs/rootsectionControlRTSCStateChart.h"	
			
	
			/**
			 * @brief Forward Declaration of the struct RootsectionControlRTSCStateChart which describes the behavior of SectionControlComponent
			 * 
			 */
			 typedef struct RootsectionControlRTSCStateChart RootsectionControlRTSCStateChart;
			/**
			 * @brief Forward Declaration of the struct SectionControlComponent
			 */
			typedef struct SectionControlComponent SectionControlComponent;
			
			/**
			*  
			* @brief Description for a ComponentInstance of Type: sectionControl
			* @details This struct describes a specific Component Instances which is typed over the Component: sectionControl
			*/
			struct SectionControlComponent {
			
			
						RootsectionControlRTSCStateChart* stateChart;	/**< The RootsectionControlRTSCStateChart of the Component sectionControl */
				
							Port* sectionApproacherPPort; /**< A Pointer to the Component's Port: sectionApproacherP */
							Port* sectionOvertakerPPort; /**< A Pointer to the Component's Port: sectionOvertakerP */
							Port* sectionOvertakeePPort; /**< A Pointer to the Component's Port: sectionOvertakeeP */
							Port* controllerPPort; /**< A Pointer to the Component's Port: controllerP */
					
			
					SectionControlComponent * next;
					
				};
		
			/**
			* @brief This Function intializes the Component: sectionControl
			* @details All struct members of the struct SectionControlComponent are initialized
			* 
			* @param component The SectionControlComponent to be initialized
			*/	
				void SectionControlComponent_initialize(SectionControlComponent* component);
	
			/**
			* @brief Creates a Instance of the Component: sectionControl
			* @details Allocates Memory for the struct SectionControlComponent
			* @return A Pointer to the new created SectionControlComponent
			*/
				SectionControlComponent* SectionControlComponent_create(void);
	
			/**
			 * @brief Destroys a Component: sectionControl
			 * @details Frees the Memory for the struct SectionControlComponent
			 * 
			* @param component The specific SectionControlComponent to be destroyed
			 */
				void SectionControlComponent_destroy(SectionControlComponent* component);
		
			/**
			* @brief Checks if the execution of the Component: sectionControl  is terminated
			* @details To Check if the execution is terminated the Method is terminated of the stateChart is called
			*		In particular the method RootsectionControlRTSCStateChart::RootsectionControlRTSCStateChart_isInState is called.
			*
			* @param component The specific SectionControlComponent which shall be checked
			* @return True, if the Component is terminated, otherwise false
			*/
				bool_t SectionControlComponent_isTerminated(SectionControlComponent* component);
			
			/**
			* @brief Executes the next Step of the behavior an Instance of the Component: sectionControl
			* @details The behavior of the Component:  sectionControl is executed.
			*			In particular the the method RootsectionControlRTSCStateChart::RootsectionControlRTSCStateChart_processStep is called
			* 
			* @param component The SectionControlComponent whose behavior shall be checked
			*/
				void SectionControlComponent_processStep(SectionControlComponent* component);
		
			/**
					 * @brief Get the Port: sectionApproacherP of an Instance of the Component: sectionControl
					 * @details The Pointer SectionControlComponent::sectionApproacherPPort is returned
					 * 
					 * @param component The specific Instance SectionControlComponent  of the Component: sectionControl whose Port shall be returned
					 * @return A Pointer to the Port sectionApproacherP of the struct SectionControlComponent
					 */
					Port* SectionControlComponent_getsectionApproacherP(SectionControlComponent* component);
					/**
					 * @brief Get the Port: sectionOvertakerP of an Instance of the Component: sectionControl
					 * @details The Pointer SectionControlComponent::sectionOvertakerPPort is returned
					 * 
					 * @param component The specific Instance SectionControlComponent  of the Component: sectionControl whose Port shall be returned
					 * @return A Pointer to the Port sectionOvertakerP of the struct SectionControlComponent
					 */
					Port* SectionControlComponent_getsectionOvertakerP(SectionControlComponent* component);
					/**
					 * @brief Get the Port: sectionOvertakeeP of an Instance of the Component: sectionControl
					 * @details The Pointer SectionControlComponent::sectionOvertakeePPort is returned
					 * 
					 * @param component The specific Instance SectionControlComponent  of the Component: sectionControl whose Port shall be returned
					 * @return A Pointer to the Port sectionOvertakeeP of the struct SectionControlComponent
					 */
					Port* SectionControlComponent_getsectionOvertakeeP(SectionControlComponent* component);
					/**
					 * @brief Get the Port: controllerP of an Instance of the Component: sectionControl
					 * @details The Pointer SectionControlComponent::controllerPPort is returned
					 * 
					 * @param component The specific Instance SectionControlComponent  of the Component: sectionControl whose Port shall be returned
					 * @return A Pointer to the Port controllerP of the struct SectionControlComponent
					 */
					Port* SectionControlComponent_getcontrollerP(SectionControlComponent* component);

		
			
	


		#endif /* SECTIONCONTROLCOMPONENT_H_ */
