/**
 * @file 
 * @author generated
 * @brief Specification of Component of Type: Line
 * @details This files contains a description of the Line in form of the LineComponent
 * 			and all methods which can be executed on an Instance of this Component
 */
		#ifndef LINECOMPONENT_H_
		#define LINECOMPONENT_H_
				// Library
				#include "../lib/types.h"
					#include "../lib/port.h"
					#include "../messages/messages_types.h"
					//#include "../RTSCs/rootLineStateChart.h"	
			
	
			/**
			 * @brief Forward Declaration of the struct RootLineStateChart which describes the behavior of LineComponent
			 * 
			 */
			 typedef struct RootLineStateChart RootLineStateChart;
			/**
			 * @brief Forward Declaration of the struct LineComponent
			 */
			typedef struct LineComponent LineComponent;
			
			/**
			*  
			* @brief Description for a ComponentInstance of Type: Line
			* @details This struct describes a specific Component Instances which is typed over the Component: Line
			*/
			struct LineComponent {
			
			
						RootLineStateChart* stateChart;	/**< The RootLineStateChart of the Component Line */
				
							Port* lineLightPort; /**< A Pointer to the Component's Port: lineLight */
					
			
					LineComponent * next;
					
				};
		
			/**
			* @brief This Function intializes the Component: Line
			* @details All struct members of the struct LineComponent are initialized
			* 
			* @param component The LineComponent to be initialized
			*/	
				void LineComponent_initialize(LineComponent* component);
	
			/**
			* @brief Creates a Instance of the Component: Line
			* @details Allocates Memory for the struct LineComponent
			* @return A Pointer to the new created LineComponent
			*/
				LineComponent* LineComponent_create(void);
	
			/**
			 * @brief Destroys a Component: Line
			 * @details Frees the Memory for the struct LineComponent
			 * 
			* @param component The specific LineComponent to be destroyed
			 */
				void LineComponent_destroy(LineComponent* component);
		
			/**
			* @brief Checks if the execution of the Component: Line  is terminated
			* @details To Check if the execution is terminated the Method is terminated of the stateChart is called
			*		In particular the method RootLineStateChart::RootLineStateChart_isInState is called.
			*
			* @param component The specific LineComponent which shall be checked
			* @return True, if the Component is terminated, otherwise false
			*/
				bool_t LineComponent_isTerminated(LineComponent* component);
			
			/**
			* @brief Executes the next Step of the behavior an Instance of the Component: Line
			* @details The behavior of the Component:  Line is executed.
			*			In particular the the method RootLineStateChart::RootLineStateChart_processStep is called
			* 
			* @param component The LineComponent whose behavior shall be checked
			*/
				void LineComponent_processStep(LineComponent* component);
		
			/**
					 * @brief Get the Port: lineLight of an Instance of the Component: Line
					 * @details The Pointer LineComponent::lineLightPort is returned
					 * 
					 * @param component The specific Instance LineComponent  of the Component: Line whose Port shall be returned
					 * @return A Pointer to the Port lineLight of the struct LineComponent
					 */
					Port* LineComponent_getlineLight(LineComponent* component);

		
			
	


		#endif /* LINECOMPONENT_H_ */
