	/**
 * @file 
 * @author generated by Fraunhofer IEM
 * @brief Specification of Component of Type: aComponent
 * @details This files contains a description of the aComponent in form of the AComponentComponent
 * 			and all methods which can be executed on an Instance of this Component
 */
		#ifndef ACOMPONENTCOMPONENT_INTERFACE_H_
		#define ACOMPONENTCOMPONENT_INTERFACE_H_

#ifdef __cplusplus
  extern "C" {
#endif
				// Library
				#include "../types/standardTypes.h"
				#include "../types/customTypes.h"
					
					
				
			
				#include "../lib/clock.h"
			#include "../lib/Debug.h"
			#include "../lib/MiddlewareTypes.h"
			#include "../Middleware/MiddlewareCore.h"
				
			
	
			/**
			 * @brief Forward Declaration of the struct AComponentTestSyncStateChart which describes the behavior of AComponentComponent
			 * 
			 */
			 typedef struct AComponentTestSyncStateChart AComponentTestSyncStateChart;
			/**
			 * @brief Forward Declaration of the struct AComponentComponent
			 */
				typedef struct AComponentComponent AComponentComponent;
			
			/**
			*  
			* @brief Description for a ComponentInstance of Type: aComponent
			* @details This struct describes a specific Component Instances which is typed over the Component: aComponent
			*/
			struct AComponentComponent {
			
			
						AComponentTestSyncStateChart* stateChart;	/**< The AComponentTestSyncStateChart of the Component aComponent */
				
			
						
					
					
			
					AComponentComponent * next;/**< A Pointer to the next component part, if this component ist part of a multipart in the CIC */
					
				};
		
			/**
			* @brief This Methodes intializes the Component: aComponent
			* @details All struct members of the struct AComponentComponent are initialized
			* 
			* @param component The AComponentComponent to be initialized
			*/	
				void AComponentComponent_initialize(AComponentComponent* component);
	
			/**
			* @brief Creates a Instance of the Component: aComponent
			* @details Allocates Memory for the struct AComponentComponent
			* @return A Pointer to the new created AComponentComponent
			*/
				AComponentComponent* AComponentComponent_create();
	
			/**
			 * @brief Destroys a Component: aComponent
			 * @details Frees the Memory for the struct AComponentComponent
			 * 
			* @param component The specific AComponentComponent to be destroyed
			 */
				void AComponentComponent_destroy(AComponentComponent* component);
		
			
			/**
			* @brief Executes the next Step of the behavior an Instance of the Component: aComponent
			* @details The behavior of the Component:  aComponent is executed.
			*			
			* @param component The AComponentComponent whose behavior shall be checked
			*/
				void AComponentComponent_processStep(AComponentComponent* component);
		
			
		
			

		
/**
 * @file 
 * @author generated by Fraunhofer IEM
 * @brief Specification of Realtime-StateChart: AComponentTestSync
 * @details This files contains the description of the Realtime-StateChart: AComponentTestSync and its behavior which is executed
 */
	//ENUM
	/** 
	 * @brief This enum represents the States of the Realtime-StateChart: AComponentTestSync
	 */
		typedef enum {
			ACOMPONENTTESTSYNC_INACTIVE,
			STATE_ACOMPONENTINIT /**< Represents the State: STATE_ACOMPONENTINIT of the Realtime-StateChart: AComponentTestSync */
			,
					STATE_ACOMPONENTINITREGION_1S1 /**< Represents the State: STATE_ACOMPONENTINITREGION_1S1 of the Realtime-StateChart: AComponentInitRegion_1 */
			,		STATE_ACOMPONENTINITREGION_1SENT /**< Represents the State: STATE_ACOMPONENTINITREGION_1SENT of the Realtime-StateChart: AComponentInitRegion_1 */
			,		STATE_ACOMPONENTINITREGION_2S2 /**< Represents the State: STATE_ACOMPONENTINITREGION_2S2 of the Realtime-StateChart: AComponentInitRegion_2 */
			,		STATE_ACOMPONENTINITREGION_2RECEIVED /**< Represents the State: STATE_ACOMPONENTINITREGION_2RECEIVED of the Realtime-StateChart: AComponentInitRegion_2 */	
		}AComponentTestSyncState;
	
	
		/**
		 * 
		 * @brief Description of the Realtime-StateChart: AComponentTestSync
		 * @details This struct represents the  Realtime-StateChart: AComponentTestSync and its States
		 */
	struct AComponentTestSyncStateChart {	
			AComponentComponent * parentComponent;/**< A pointer to the parent ComponentInstance of Type: AComponentComponent , which has this Realtime-StateChart as its behavior */			
	
	
						AComponentTestSyncState currentStateOfAComponentTestSync;/**< The current State of the Realtime-StateChart: AComponentTestSync */
	
				AComponentTestSyncState currentStateOfAComponentInitRegion_1;/**< Represents the state of region: AComponentInitRegion_1 */
				AComponentTestSyncState currentStateOfAComponentInitRegion_2;/**< Represents the state of region: AComponentInitRegion_2 */
	
			bool_t AComponentTestSync_isExecutable;/**< Execution Verifier of RTSC: AComponentTestSync. This variable is used to ensure that a RTSC is executed only once per execution cycle */
				bool_t AComponentInitRegion_1_isExecutable;/**< Execution Verifier of RTSC: AComponentInitRegion_1. This variable is used to ensure that a RTSC is executed only once per execution cycle */
				bool_t AComponentInitRegion_2_isExecutable;/**< Execution Verifier of RTSC: AComponentInitRegion_2. This variable is used to ensure that a RTSC is executed only once per execution cycle */
		
	
	
		
	
				int32_T var1; /**< The Realtime-StateChart Variable: var1 of Type: int32; */
				int32_T var2; /**< The Realtime-StateChart Variable: var2 of Type: int32; */
	
	
	
			
	
		} ;

//METHOD STUBS
	/**
	 * @brief Creates an Instance of the Realtime-StateChart: AComponentTestSync
	 * @details Allocates Memory for the struct AComponentTestSyncStateChart
	 * 
	 * @param parentComponent An Instance of the Component: AComponentComponent which behavior is described via this Realtime-StateChart
	 * @return A Pointer to the new created AComponentTestSyncStateChart
	 */
		AComponentTestSyncStateChart* AComponentTestSyncStateChart_create(AComponentComponent* parentComponent);
	/**
	 * @brief Initializes an Instance of the Realtime-StateChart: AComponentTestSync
	 * @details All struct members of the struct AComponentTestSyncStateChart are initialized,
	 *			and all Regions of the Realtime-StateChart are initialized, too.
	 * 
	 * @param rtsc The specific AComponentTestSyncStateChart to be initialized
	 */
		void AComponentTestSyncStateChart_initialize(AComponentTestSyncStateChart* rtsc);
	/**
	 * @brief Initializes the Region: AComponentInitRegion_1 of the Realtime-StateChart: AComponentTestSync
	 * @details The Member AComponentTestSyncStateChart::currentStateOfAComponentInitRegion_1 is initialized
	 * 
	 * @param stateChart The specific AComponentTestSyncStateChart whose Region shall be initialized
	 */
	
		void initializeAComponentInitRegion_1Region(AComponentTestSyncStateChart* stateChart);
	/**
	 * @brief Initializes the Region: AComponentInitRegion_2 of the Realtime-StateChart: AComponentTestSync
	 * @details The Member AComponentTestSyncStateChart::currentStateOfAComponentInitRegion_2 is initialized
	 * 
	 * @param stateChart The specific AComponentTestSyncStateChart whose Region shall be initialized
	 */
	
		void initializeAComponentInitRegion_2Region(AComponentTestSyncStateChart* stateChart);
	/**
	 * @brief Destroys the Realtime-StateChart: AComponentTestSync
	 * @details Frees the Memory for the struct AComponentTestSyncStateChart
	 * 
	 * @param rtsc The specific AComponentTestSyncStateChart to be destroyed
	 */	
		void AComponentTestSyncStateChart_destroy(AComponentTestSyncStateChart* rtsc);		
	/**
	 * @brief Executes the next Step of the Realtime-StateChart: AComponentTestSync
	 * 
	 * @param rtsc The specific AComponentTestSyncStateChart to be executed
	 */	
		void AComponentTestSyncStateChart_processStep(AComponentTestSyncStateChart* rtsc);

	/**
	 * @brief Leaves the Region: Region 1 of the Realtime-StateChart: AComponentTestSync
	 * @details This method is called, whenever a the Region: Region 1 is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific AComponentTestSyncStateChart whose Region: Region 1 shall be exit
	 */
		void AComponentInitRegion_1StateChart_exit(AComponentTestSyncStateChart* rtsc);
	/**
	 * @brief Leaves the Region: Region 2 of the Realtime-StateChart: AComponentTestSync
	 * @details This method is called, whenever a the Region: Region 2 is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific AComponentTestSyncStateChart whose Region: Region 2 shall be exit
	 */
		void AComponentInitRegion_2StateChart_exit(AComponentTestSyncStateChart* rtsc);
			
	/**
	 * @brief Returns wether the Realtime-StateChart: AComponentTestSync is in a specific State
	 * 
	 * @param rtsc The specific Realtime-StateChart: AComponentTestSyncStateChart
	 * @param state One of the States of the Enum: AComponentTestSyncState
	 * 
	 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
	 */	
		bool_t AComponentTestSyncStateChart_isInState(AComponentTestSyncStateChart* rtsc, AComponentTestSyncState state);




#ifdef __cplusplus
  }
#endif
		#endif /* ACOMPONENTCOMPONENT_INTERFACE_H_ */

