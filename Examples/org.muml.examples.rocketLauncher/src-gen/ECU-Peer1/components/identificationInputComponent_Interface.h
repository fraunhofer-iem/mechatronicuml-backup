		#ifndef IDENTIFICATIONINPUTCOMPONENT_Interface_H_
		#define IDENTIFICATIONINPUTCOMPONENT_Interface_H_

#ifdef __cplusplus
  extern "C" {
#endif		// Library
	#include "../types/standardTypes.h"
	#include "../types/customTypes.h"
	#include "../lib/clock.h"
	#include "../lib/Debug.h"
			/*****
 			 *
 			 *  Forward Delcaration of Container Functions
 			 *
 			 */		
			
						void MCC_IdentificationInputComponent_code_send_value(Port* p, int32_T* value);
			
			
	
			/*****
 			 *
 			 *  Component Functions
 			 *
 			 */
			/**
			 * @file 
			 * @author generated
			 * @brief Specification of Component of Type: IdentificationInput
			 * @details This files contains a description of the IdentificationInput in form of the IdentificationInputComponent
			 * 			and all methods which can be executed on an Instance of this Component
			 */
				
						/**
						 * @brief Forward Declaration of the struct IdentificationInputComponent
						 */
							typedef struct IdentificationInputComponent IdentificationInputComponent;
						
						/**
						*  
						* @brief Description for a ComponentInstance of Type: IdentificationInput
						* @details This struct describes a specific Component Instances which is typed over the Component: IdentificationInput
						*/
						struct IdentificationInputComponent {
						
								uint8_T ID;	
						
						
							
										Port code; /**< A  Component's Port: code */
						
									
								
								
						
								IdentificationInputComponent * next;/**< A Pointer to the next component part, if this component ist part of a multipart in the CIC */
								
							};
					
						/**
						* @brief This Methodes intializes the Component: IdentificationInput
						* @details All struct members of the struct IdentificationInputComponent are initialized
						* 
						* @param component The IdentificationInputComponent to be initialized
						*/	
							void IdentificationInputComponent_initialize(IdentificationInputComponent* component);
				
						/**
						* @brief Creates a Instance of the Component: IdentificationInput
						* @details Allocates Memory for the struct IdentificationInputComponent
						* @return A Pointer to the new created IdentificationInputComponent
						*/
							IdentificationInputComponent IdentificationInputComponent_create();
				
						/**
						 * @brief Destroys a Component: IdentificationInput
						 * @details Frees the Memory for the struct IdentificationInputComponent
						 * 
						* @param component The specific IdentificationInputComponent to be destroyed
						 */
							void IdentificationInputComponent_destroy(IdentificationInputComponent* component);
					
						
					
						


#ifdef __cplusplus
  }
#endif
		#endif /* IDENTIFICATIONINPUTCOMPONENT_Interface_H_ */
