/**
 * @file 
 * @author generated
 * @brief Specification of Realtime-StateChart: ReceiverReceiver
 * @details This files contains the description of the Realtime-StateChart: ReceiverReceiver and its behavior which is executed
 */
#ifndef RECEIVERRECEIVERSTATECHART_H_
#define RECEIVERRECEIVERSTATECHART_H_
#ifdef __cplusplus
  extern "C" {
#endif
#include "clock.h"
#include "Debug.h"
	#include "standardTypes.h"
	#include "customTypes.h"
#include "MiddlewareTypes.h"
#include "MiddlewareCore.h"
#include "receiverComponent.h"
//ENUM
	/** 
	 * @brief This enum represents the States of the Realtime-StateChart: ReceiverReceiver
	 */
		typedef enum {
			RECEIVERRECEIVER_INACTIVE,
			STATE_RECEIVERRECEIVER_MAIN /**< Represents the State: STATE_RECEIVERRECEIVER_MAIN of the Realtime-StateChart: ReceiverReceiver */
			,
					STATE_RECEIVERININIT /**< Represents the State: STATE_RECEIVERININIT of the Realtime-StateChart: ReceiverInReceiverRoleRTSC_in */	
		}ReceiverReceiverState;
	
	
		/**
		 * 
		 * @brief Description of the Realtime-StateChart: ReceiverReceiver
		 * @details This struct represents the  Realtime-StateChart: ReceiverReceiver and its States
		 */
	struct ReceiverReceiverStateChart {	
			ReceiverComponent * parentComponent;/**< A pointer to the parent ComponentInstance of Type: ReceiverComponent , which has this Realtime-StateChart as its behavior */			
	
	
						ReceiverReceiverState currentStateOfReceiverReceiver;/**< The current State of the Realtime-StateChart: ReceiverReceiver */
	
				ReceiverReceiverState currentStateOfReceiverInReceiverRoleRTSC_in;/**< Represents the state of region: ReceiverInReceiverRoleRTSC_in */
	
			bool_t ReceiverReceiver_isExecutable;/**< Execution Verifier of RTSC: ReceiverReceiver. This variable is used to ensure that a RTSC is executed only once per execution cycle */
				bool_t ReceiverInReceiverRoleRTSC_in_isExecutable;/**< Execution Verifier of RTSC: ReceiverInReceiverRoleRTSC_in. This variable is used to ensure that a RTSC is executed only once per execution cycle */
		
	
	
		
	
	
					int8_T LED;
	
	
			
	
		} ;

//METHOD STUBS
	/**
	 * @brief Creates an Instance of the Realtime-StateChart: ReceiverReceiver
	 * @details Allocates Memory for the struct ReceiverReceiverStateChart
	 * 
	 * @param parentComponent An Instance of the Component: ReceiverComponent which behavior is described via this Realtime-StateChart
	 * @return A Pointer to the new created ReceiverReceiverStateChart
	 */
		ReceiverReceiverStateChart* ReceiverReceiverStateChart_create(ReceiverComponent* parentComponent);
	/**
	 * @brief Initializes an Instance of the Realtime-StateChart: ReceiverReceiver
	 * @details All struct members of the struct ReceiverReceiverStateChart are initialized,
	 *			and all Regions of the Realtime-StateChart are initialized, too.
	 * 
	 * @param rtsc The specific ReceiverReceiverStateChart to be initialized
	 */
		void ReceiverReceiverStateChart_initialize(ReceiverReceiverStateChart* rtsc);
	/**
	 * @brief Initializes the Region: ReceiverInReceiverRoleRTSC_in of the Realtime-StateChart: ReceiverReceiver
	 * @details The Member ReceiverReceiverStateChart::currentStateOfReceiverInReceiverRoleRTSC_in is initialized
	 * 
	 * @param stateChart The specific ReceiverReceiverStateChart whose Region shall be initialized
	 */
	
		void initializeReceiverInReceiverRoleRTSC_inRegion(ReceiverReceiverStateChart* stateChart);
	/**
	 * @brief Destroys the Realtime-StateChart: ReceiverReceiver
	 * @details Frees the Memory for the struct ReceiverReceiverStateChart
	 * 
	 * @param rtsc The specific ReceiverReceiverStateChart to be destroyed
	 */	
		void ReceiverReceiverStateChart_destroy(ReceiverReceiverStateChart* rtsc);		
	/**
	 * @brief Executes the next Step of the Realtime-StateChart: ReceiverReceiver
	 * 
	 * @param rtsc The specific ReceiverReceiverStateChart to be executed
	 */	
		void ReceiverReceiverStateChart_processStep(ReceiverReceiverStateChart* rtsc);

	/**
	 * @brief Leaves the Region: receiverRoleRTSC_in of the Realtime-StateChart: ReceiverReceiver
	 * @details This method is called, whenever a the Region: receiverRoleRTSC_in is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific ReceiverReceiverStateChart whose Region: receiverRoleRTSC_in shall be exit
	 */
		void ReceiverInReceiverRoleRTSC_inStateChart_exit(ReceiverReceiverStateChart* rtsc);
			
	/**
	 * @brief Returns wether the Realtime-StateChart: ReceiverReceiver is in a specific State
	 * 
	 * @param rtsc The specific Realtime-StateChart: ReceiverReceiverStateChart
	 * @param state One of the States of the Enum: ReceiverReceiverState
	 * 
	 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
	 * @todo  Why is this int and not bool, like everywhere else
	 */	
		bool_t ReceiverReceiverStateChart_isInState(ReceiverReceiverStateChart* rtsc, ReceiverReceiverState state);
	/**
	 * @brief Checks if the execution of the Realtime-StateChart: ReceiverReceiver  is terminated
	 * 
	 * @param rtsc The specific Realtime-StateChart: ReceiverReceiverStateChart
	 * @return Always True
	 * @todo  always true is returned
	 */
		bool_t ReceiverReceiverStateChart_isTerminated(ReceiverReceiverStateChart* rtsc);


#ifdef __cplusplus
  }
#endif
#endif /* RECEIVERRECEIVERSTATECHART_H_ */
