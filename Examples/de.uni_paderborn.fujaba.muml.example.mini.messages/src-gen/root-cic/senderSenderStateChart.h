/**
 * @file 
 * @author generated
 * @brief Specification of Realtime-StateChart: SenderSender
 * @details This files contains the description of the Realtime-StateChart: SenderSender and its behavior which is executed
 */
#ifndef SENDERSENDERSTATECHART_H_
#define SENDERSENDERSTATECHART_H_
#ifdef __cplusplus
  extern "C" {
#endif
#include "clock.h"
#include "Debug.h"
	#include "standardTypes.h"
	#include "customTypes.h"
#include "MiddlewareTypes.h"
#include "MiddlewareCore.h"
#include "senderComponent.h"
//ENUM
	/** 
	 * @brief This enum represents the States of the Realtime-StateChart: SenderSender
	 */
		typedef enum {
			SENDERSENDER_INACTIVE,
			STATE_SENDERSENDER_MAIN /**< Represents the State: STATE_SENDERSENDER_MAIN of the Realtime-StateChart: SenderSender */
			,
					STATE_SENDEROUTINIT /**< Represents the State: STATE_SENDEROUTINIT of the Realtime-StateChart: SenderOutSenderRoleRTSC_out */
			,		STATE_SENDEROUTMESSAGESENT /**< Represents the State: STATE_SENDEROUTMESSAGESENT of the Realtime-StateChart: SenderOutSenderRoleRTSC_out */	
		}SenderSenderState;
	
	
		/**
		 * 
		 * @brief Description of the Realtime-StateChart: SenderSender
		 * @details This struct represents the  Realtime-StateChart: SenderSender and its States
		 */
	struct SenderSenderStateChart {	
			SenderComponent * parentComponent;/**< A pointer to the parent ComponentInstance of Type: SenderComponent , which has this Realtime-StateChart as its behavior */			
	
	
						SenderSenderState currentStateOfSenderSender;/**< The current State of the Realtime-StateChart: SenderSender */
	
				SenderSenderState currentStateOfSenderOutSenderRoleRTSC_out;/**< Represents the state of region: SenderOutSenderRoleRTSC_out */
	
			bool_t SenderSender_isExecutable;/**< Execution Verifier of RTSC: SenderSender. This variable is used to ensure that a RTSC is executed only once per execution cycle */
				bool_t SenderOutSenderRoleRTSC_out_isExecutable;/**< Execution Verifier of RTSC: SenderOutSenderRoleRTSC_out. This variable is used to ensure that a RTSC is executed only once per execution cycle */
		
				Clock senderOutClockSenderOutSenderRoleRTSC_outClock;/**< The Clock: SenderOutClockSenderOutSenderRoleRTSC_out */
	
	
		
	
	
	
	
			
	
		} ;

//METHOD STUBS
	/**
	 * @brief Creates an Instance of the Realtime-StateChart: SenderSender
	 * @details Allocates Memory for the struct SenderSenderStateChart
	 * 
	 * @param parentComponent An Instance of the Component: SenderComponent which behavior is described via this Realtime-StateChart
	 * @return A Pointer to the new created SenderSenderStateChart
	 */
		SenderSenderStateChart* SenderSenderStateChart_create(SenderComponent* parentComponent);
	/**
	 * @brief Initializes an Instance of the Realtime-StateChart: SenderSender
	 * @details All struct members of the struct SenderSenderStateChart are initialized,
	 *			and all Regions of the Realtime-StateChart are initialized, too.
	 * 
	 * @param rtsc The specific SenderSenderStateChart to be initialized
	 */
		void SenderSenderStateChart_initialize(SenderSenderStateChart* rtsc);
	/**
	 * @brief Initializes the Region: SenderOutSenderRoleRTSC_out of the Realtime-StateChart: SenderSender
	 * @details The Member SenderSenderStateChart::currentStateOfSenderOutSenderRoleRTSC_out is initialized
	 * 
	 * @param stateChart The specific SenderSenderStateChart whose Region shall be initialized
	 */
	
		void initializeSenderOutSenderRoleRTSC_outRegion(SenderSenderStateChart* stateChart);
	/**
	 * @brief Destroys the Realtime-StateChart: SenderSender
	 * @details Frees the Memory for the struct SenderSenderStateChart
	 * 
	 * @param rtsc The specific SenderSenderStateChart to be destroyed
	 */	
		void SenderSenderStateChart_destroy(SenderSenderStateChart* rtsc);		
	/**
	 * @brief Executes the next Step of the Realtime-StateChart: SenderSender
	 * 
	 * @param rtsc The specific SenderSenderStateChart to be executed
	 */	
		void SenderSenderStateChart_processStep(SenderSenderStateChart* rtsc);

	/**
	 * @brief Leaves the Region: senderRoleRTSC_out of the Realtime-StateChart: SenderSender
	 * @details This method is called, whenever a the Region: senderRoleRTSC_out is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific SenderSenderStateChart whose Region: senderRoleRTSC_out shall be exit
	 */
		void SenderOutSenderRoleRTSC_outStateChart_exit(SenderSenderStateChart* rtsc);
			
	/**
	 * @brief Returns wether the Realtime-StateChart: SenderSender is in a specific State
	 * 
	 * @param rtsc The specific Realtime-StateChart: SenderSenderStateChart
	 * @param state One of the States of the Enum: SenderSenderState
	 * 
	 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
	 * @todo  Why is this int and not bool, like everywhere else
	 */	
		bool_t SenderSenderStateChart_isInState(SenderSenderStateChart* rtsc, SenderSenderState state);
	/**
	 * @brief Checks if the execution of the Realtime-StateChart: SenderSender  is terminated
	 * 
	 * @param rtsc The specific Realtime-StateChart: SenderSenderStateChart
	 * @return Always True
	 * @todo  always true is returned
	 */
		bool_t SenderSenderStateChart_isTerminated(SenderSenderStateChart* rtsc);


#ifdef __cplusplus
  }
#endif
#endif /* SENDERSENDERSTATECHART_H_ */
