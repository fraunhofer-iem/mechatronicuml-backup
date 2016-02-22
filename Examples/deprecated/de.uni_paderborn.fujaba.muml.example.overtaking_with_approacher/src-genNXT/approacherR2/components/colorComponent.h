/**
 * @file 
 * @author generated
 * @brief Specification of Component of Type: Color
 * @details This files contains a description of the Color in form of the ColorComponent
 * 			and all methods which can be executed on an Instance of this Component
 */
		#ifndef COLORCOMPONENT_H_
		#define COLORCOMPONENT_H_
				// Library
				#include "../lib/types.h"
					#include "../lib/port.h"
					#include "../messages/messages_types.h"
					//#include "../RTSCs/rootColorStateChart.h"	
			
	
			/**
			 * @brief Forward Declaration of the struct RootColorStateChart which describes the behavior of ColorComponent
			 * 
			 */
			 typedef struct RootColorStateChart RootColorStateChart;
			/**
			 * @brief Forward Declaration of the struct ColorComponent
			 */
			typedef struct ColorComponent ColorComponent;
			
			/**
			*  
			* @brief Description for a ComponentInstance of Type: Color
			* @details This struct describes a specific Component Instances which is typed over the Component: Color
			*/
			struct ColorComponent {
			
			
						RootColorStateChart* stateChart;	/**< The RootColorStateChart of the Component Color */
				
							Port* colorPort; /**< A Pointer to the Component's Port: color */
					
			
					ColorComponent * next;
					
				};
		
			/**
			* @brief This Function intializes the Component: Color
			* @details All struct members of the struct ColorComponent are initialized
			* 
			* @param component The ColorComponent to be initialized
			*/	
				void ColorComponent_initialize(ColorComponent* component);
	
			/**
			* @brief Creates a Instance of the Component: Color
			* @details Allocates Memory for the struct ColorComponent
			* @return A Pointer to the new created ColorComponent
			*/
				ColorComponent* ColorComponent_create(void);
	
			/**
			 * @brief Destroys a Component: Color
			 * @details Frees the Memory for the struct ColorComponent
			 * 
			* @param component The specific ColorComponent to be destroyed
			 */
				void ColorComponent_destroy(ColorComponent* component);
		
			/**
			* @brief Checks if the execution of the Component: Color  is terminated
			* @details To Check if the execution is terminated the Method is terminated of the stateChart is called
			*		In particular the method RootColorStateChart::RootColorStateChart_isInState is called.
			*
			* @param component The specific ColorComponent which shall be checked
			* @return True, if the Component is terminated, otherwise false
			*/
				bool_t ColorComponent_isTerminated(ColorComponent* component);
			
			/**
			* @brief Executes the next Step of the behavior an Instance of the Component: Color
			* @details The behavior of the Component:  Color is executed.
			*			In particular the the method RootColorStateChart::RootColorStateChart_processStep is called
			* 
			* @param component The ColorComponent whose behavior shall be checked
			*/
				void ColorComponent_processStep(ColorComponent* component);
		
			/**
					 * @brief Get the Port: color of an Instance of the Component: Color
					 * @details The Pointer ColorComponent::colorPort is returned
					 * 
					 * @param component The specific Instance ColorComponent  of the Component: Color whose Port shall be returned
					 * @return A Pointer to the Port color of the struct ColorComponent
					 */
					Port* ColorComponent_getcolor(ColorComponent* component);

		
			
	


		#endif /* COLORCOMPONENT_H_ */
