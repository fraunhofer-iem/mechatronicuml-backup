		#ifndef LAUNCHDELEGATORCOMPONENT_Interface_H_
		#define LAUNCHDELEGATORCOMPONENT_Interface_H_

#ifdef __cplusplus
  extern "C" {
#endif		// Library
	#include "../types/standardTypes.h"
	#include "../types/customTypes.h"
		#include "../lib/port.h"
		#include "../messages/messages_types.h"
	
	#include "../lib/clock.h"
	#include "../lib/Debug.h"


			
			
		//#include "../continuousComponents/contImplementations.h"	

		//#include "../RTSCs/launchDelegatorLaunchDelegatorStateChart.h"
			/*****
 			 *
 			 *  Forward Delcaration of Container Functions
 			 *
 			 */		
					void MCC_LaunchDelegatorComponent_verifier_send_M1LaunchCode_M1_Message(Port* p, M1LaunchCode_M1_Message* msg);
			
					bool_t MCC_LaunchDelegatorComponent_code_recv_value(Port* p, int32_T* value);
					bool_t MCC_LaunchDelegatorComponent_code_exists_value(Port* p);
			
			
	
			/*****
 			 *
 			 *  Component Functions
 			 *
 			 */
			/**
			 * @file 
			 * @author generated
			 * @brief Specification of Component of Type: LaunchDelegator
			 * @details This files contains a description of the LaunchDelegator in form of the LaunchDelegatorComponent
			 * 			and all methods which can be executed on an Instance of this Component
			 */
				
						/**
						 * @brief Forward Declaration of the struct LaunchDelegatorLaunchDelegatorStateChart which describes the behavior of LaunchDelegatorComponent
						 * 
						 */
						 typedef struct LaunchDelegatorLaunchDelegatorStateChart LaunchDelegatorLaunchDelegatorStateChart;
						/**
						 * @brief Forward Declaration of the struct LaunchDelegatorComponent
						 */
							typedef struct LaunchDelegatorComponent LaunchDelegatorComponent;
						
						/**
						*  
						* @brief Description for a ComponentInstance of Type: LaunchDelegator
						* @details This struct describes a specific Component Instances which is typed over the Component: LaunchDelegator
						*/
						struct LaunchDelegatorComponent {
						
								uint8_T ID;	
						
						
									LaunchDelegatorLaunchDelegatorStateChart* stateChart;	/**< The LaunchDelegatorLaunchDelegatorStateChart of the Component LaunchDelegator */
							
										Port code; /**< A  Component's Port: code */
										Port verifierPort; /**< A  Component's Port: verifier */
						
											int32_T (*getterOf_code)(void);/**< A Pointer to the getter function of the hybrid port: code */
						
									
								
								
						
								LaunchDelegatorComponent * next;/**< A Pointer to the next component part, if this component ist part of a multipart in the CIC */
								
							};
					
						/**
						* @brief This Methodes intializes the Component: LaunchDelegator
						* @details All struct members of the struct LaunchDelegatorComponent are initialized
						* 
						* @param component The LaunchDelegatorComponent to be initialized
						*/	
							void LaunchDelegatorComponent_initialize(LaunchDelegatorComponent* component);
				
						/**
						* @brief Creates a Instance of the Component: LaunchDelegator
						* @details Allocates Memory for the struct LaunchDelegatorComponent
						* @return A Pointer to the new created LaunchDelegatorComponent
						*/
							LaunchDelegatorComponent LaunchDelegatorComponent_create();
				
						/**
						 * @brief Destroys a Component: LaunchDelegator
						 * @details Frees the Memory for the struct LaunchDelegatorComponent
						 * 
						* @param component The specific LaunchDelegatorComponent to be destroyed
						 */
							void LaunchDelegatorComponent_destroy(LaunchDelegatorComponent* component);
					
						
						/**
						* @brief Executes the next Step of the behavior an Instance of the Component: LaunchDelegator
						* @details The behavior of the Component:  LaunchDelegator is executed.
						*			
						* @param component The LaunchDelegatorComponent whose behavior shall be checked
						*/
							void LaunchDelegatorComponent_processStep(LaunchDelegatorComponent* component);
						/**
								 * @brief Get the Port: verifier of an Instance of the Component: LaunchDelegator
								 * @details The Pointer LaunchDelegatorComponent::verifierPort is returned
								 * 
								 * @param component The specific Instance LaunchDelegatorComponent  of the Component: LaunchDelegator whose Port shall be returned
								 * @return A Pointer to the Port verifier of the struct LaunchDelegatorComponent
								 */
								Port* LaunchDelegatorComponent_getverifier(LaunchDelegatorComponent* component);
					
						



			/*****
 			 *
 			 *  RealtimeStatechart Functions
 			 *
 			 */

			/**
			 * @file 
			 * @author generated
			 * @brief Specification of Realtime-StateChart: LaunchDelegatorLaunchDelegator
			 * @details This files contains the description of the Realtime-StateChart: LaunchDelegatorLaunchDelegator and its behavior which is executed
			 */
			
			//ENUM
				/** 
				 * @brief This enum represents the States of the Realtime-StateChart: LaunchDelegatorLaunchDelegator
				 */
					typedef enum {
						LAUNCHDELEGATORLAUNCHDELEGATOR_INACTIVE,
						STATE_LAUNCHDELEGATORLAUNCHDELEGATOR_MAIN /**< Represents the State: STATE_LAUNCHDELEGATORLAUNCHDELEGATOR_MAIN of the Realtime-StateChart: LaunchDelegatorLaunchDelegator */
						,
								STATE_LAUNCHDELEGATORVERIFIERPEER_MAIN /**< Represents the State: STATE_LAUNCHDELEGATORVERIFIERPEER_MAIN of the Realtime-StateChart: LaunchDelegatorVerifierPeer_verifier */	
					}LaunchDelegatorLaunchDelegatorState;
				
				
					/**
					 * 
					 * @brief Description of the Realtime-StateChart: LaunchDelegatorLaunchDelegator
					 * @details This struct represents the  Realtime-StateChart: LaunchDelegatorLaunchDelegator and its States
					 */
				struct LaunchDelegatorLaunchDelegatorStateChart {	
						LaunchDelegatorComponent * parentComponent;/**< A pointer to the parent ComponentInstance of Type: LaunchDelegatorComponent , which has this Realtime-StateChart as its behavior */			
				
				
									LaunchDelegatorLaunchDelegatorState currentStateOfLaunchDelegatorLaunchDelegator;/**< The current State of the Realtime-StateChart: LaunchDelegatorLaunchDelegator */
				
							LaunchDelegatorLaunchDelegatorState currentStateOfLaunchDelegatorVerifierPeer_verifier;/**< Represents the state of region: LaunchDelegatorVerifierPeer_verifier */
				
						bool_t LaunchDelegatorLaunchDelegator_isExecutable;/**< Execution Verifier of RTSC: LaunchDelegatorLaunchDelegator. This variable is used to ensure that a RTSC is executed only once per execution cycle */
							bool_t LaunchDelegatorVerifierPeer_verifier_isExecutable;/**< Execution Verifier of RTSC: LaunchDelegatorVerifierPeer_verifier. This variable is used to ensure that a RTSC is executed only once per execution cycle */
					
				
				
					
				
							int32_T code; /**< The Realtime-StateChart Variable: code of Type: int32; */
				
						//		int32_T code;
				
				
						
				
					} ;
			
			//METHOD STUBS
				/**
				 * @brief Creates an Instance of the Realtime-StateChart: LaunchDelegatorLaunchDelegator
				 * @details Allocates Memory for the struct LaunchDelegatorLaunchDelegatorStateChart
				 * 
				 * @param parentComponent An Instance of the Component: LaunchDelegatorComponent which behavior is described via this Realtime-StateChart
				 * @return A Pointer to the new created LaunchDelegatorLaunchDelegatorStateChart
				 */
					LaunchDelegatorLaunchDelegatorStateChart* LaunchDelegatorLaunchDelegatorStateChart_create(LaunchDelegatorComponent* parentComponent);
				/**
				 * @brief Initializes an Instance of the Realtime-StateChart: LaunchDelegatorLaunchDelegator
				 * @details All struct members of the struct LaunchDelegatorLaunchDelegatorStateChart are initialized,
				 *			and all Regions of the Realtime-StateChart are initialized, too.
				 * 
				 * @param rtsc The specific LaunchDelegatorLaunchDelegatorStateChart to be initialized
				 */
					void LaunchDelegatorLaunchDelegatorStateChart_initialize(LaunchDelegatorLaunchDelegatorStateChart* rtsc);
				/**
				 * @brief Initializes the Region: LaunchDelegatorVerifierPeer_verifier of the Realtime-StateChart: LaunchDelegatorLaunchDelegator
				 * @details The Member LaunchDelegatorLaunchDelegatorStateChart::currentStateOfLaunchDelegatorVerifierPeer_verifier is initialized
				 * 
				 * @param stateChart The specific LaunchDelegatorLaunchDelegatorStateChart whose Region shall be initialized
				 */
				
					void initializeLaunchDelegatorVerifierPeer_verifierRegion(LaunchDelegatorLaunchDelegatorStateChart* stateChart);
				/**
				 * @brief Destroys the Realtime-StateChart: LaunchDelegatorLaunchDelegator
				 * @details Frees the Memory for the struct LaunchDelegatorLaunchDelegatorStateChart
				 * 
				 * @param rtsc The specific LaunchDelegatorLaunchDelegatorStateChart to be destroyed
				 */	
					void LaunchDelegatorLaunchDelegatorStateChart_destroy(LaunchDelegatorLaunchDelegatorStateChart* rtsc);		
				/**
				 * @brief Executes the next Step of the Realtime-StateChart: LaunchDelegatorLaunchDelegator
				 * 
				 * @param rtsc The specific LaunchDelegatorLaunchDelegatorStateChart to be executed
				 */	
					void LaunchDelegatorLaunchDelegatorStateChart_processStep(LaunchDelegatorLaunchDelegatorStateChart* rtsc);
			
				/**
				 * @brief Leaves the Region: peer_verifier of the Realtime-StateChart: LaunchDelegatorLaunchDelegator
				 * @details This method is called, whenever a the Region: peer_verifier is left.
				 * 			The correct State is set and all Exit-Events are executed.
				 *
				 * @param rtsc The specific LaunchDelegatorLaunchDelegatorStateChart whose Region: peer_verifier shall be exit
				 */
					void LaunchDelegatorVerifierPeer_verifierStateChart_exit(LaunchDelegatorLaunchDelegatorStateChart* rtsc);
						
				/**
				 * @brief Returns wether the Realtime-StateChart: LaunchDelegatorLaunchDelegator is in a specific State
				 * 
				 * @param rtsc The specific Realtime-StateChart: LaunchDelegatorLaunchDelegatorStateChart
				 * @param state One of the States of the Enum: LaunchDelegatorLaunchDelegatorState
				 * 
				 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
				 */	
					bool_t LaunchDelegatorLaunchDelegatorStateChart_isInState(LaunchDelegatorLaunchDelegatorStateChart* rtsc, LaunchDelegatorLaunchDelegatorState state);
#ifdef __cplusplus
  }
#endif
		#endif /* LAUNCHDELEGATORCOMPONENT_Interface_H_ */
