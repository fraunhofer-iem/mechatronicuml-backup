		#ifndef LAUNCHERCOMPONENT_Interface_H_
		#define LAUNCHERCOMPONENT_Interface_H_

#ifdef __cplusplus
  extern "C" {
#endif		// Library
	#include "../types/standardTypes.h"
	#include "../types/customTypes.h"
	#include "../../../src-genV1_working/ECU-Launch/lib/clock.h"
	#include "../lib/Debug.h"
			/*****
 			 *
 			 *  Forward Delcaration of Container Functions
 			 *
 			 */		
			
					bool_t MCC_LauncherComponent_launch_recv_value(Port* p, bool_T* value);
					bool_t MCC_LauncherComponent_launch_exists_value(Port* p);
			
			
	
			/*****
 			 *
 			 *  Component Functions
 			 *
 			 */
			/**
			 * @file 
			 * @author generated
			 * @brief Specification of Component of Type: Launcher
			 * @details This files contains a description of the Launcher in form of the LauncherComponent
			 * 			and all methods which can be executed on an Instance of this Component
			 */
				
						/**
						 * @brief Forward Declaration of the struct LauncherComponent
						 */
							typedef struct LauncherComponent LauncherComponent;
						
						/**
						*  
						* @brief Description for a ComponentInstance of Type: Launcher
						* @details This struct describes a specific Component Instances which is typed over the Component: Launcher
						*/
						struct LauncherComponent {
						
								uint8_T ID;	
						
						
							
										Port launch; /**< A  Component's Port: launch */
						
									
								
								
						
								LauncherComponent * next;/**< A Pointer to the next component part, if this component ist part of a multipart in the CIC */
								
							};
					
						/**
						* @brief This Methodes intializes the Component: Launcher
						* @details All struct members of the struct LauncherComponent are initialized
						* 
						* @param component The LauncherComponent to be initialized
						*/	
							void LauncherComponent_initialize(LauncherComponent* component);
				
						/**
						* @brief Creates a Instance of the Component: Launcher
						* @details Allocates Memory for the struct LauncherComponent
						* @return A Pointer to the new created LauncherComponent
						*/
							LauncherComponent LauncherComponent_create();
				
						/**
						 * @brief Destroys a Component: Launcher
						 * @details Frees the Memory for the struct LauncherComponent
						 * 
						* @param component The specific LauncherComponent to be destroyed
						 */
							void LauncherComponent_destroy(LauncherComponent* component);
					
						
					
						


#ifdef __cplusplus
  }
#endif
		#endif /* LAUNCHERCOMPONENT_Interface_H_ */
