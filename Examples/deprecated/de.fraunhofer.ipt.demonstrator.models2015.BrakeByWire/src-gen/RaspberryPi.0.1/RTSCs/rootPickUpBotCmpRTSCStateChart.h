/**
 * @file 
 * @author generated
 * @brief Specification of Realtime-StateChart: RootPickUpBotCmpRTSC
 * @details This files contains the description of the Realtime-StateChart: RootPickUpBotCmpRTSC and its behavior which is executed
 */

#ifndef ROOTPICKUPBOTCMPRTSCSTATECHART_H_
#define ROOTPICKUPBOTCMPRTSCSTATECHART_H_

#include "../lib/clock.h"
#include "../lib/syncChannel.h"
#include "../lib/MiddlewareTypes.h"
#include "../Middleware/MiddlewareCore.h"
#include "../components/pickUpBotComponent.h"
//ENUM
	/** 
	 * @brief This enum represents the States of the Realtime-StateChart: RootPickUpBotCmpRTSC
	 */
		typedef enum {
				ROOTPICKUPBOTCMPRTSC_INIT_STATE /**< Represents the State: ROOTPICKUPBOTCMPRTSC_INIT_STATE of the Realtime-StateChart: RootPickUpBotCmpRTSC */
				,
						ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_STOCKTOPLATE_STATE /**< Represents the State: ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_STOCKTOPLATE_STATE of the Realtime-StateChart: ROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSC_PickUpBotPortRTSC */ 
				,		ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_READY2UNLOAD_STATE /**< Represents the State: ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_READY2UNLOAD_STATE of the Realtime-StateChart: ROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSC_PickUpBotPortRTSC */ 
				,		ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_UNLOADING_STATE /**< Represents the State: ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_UNLOADING_STATE of the Realtime-StateChart: ROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSC_PickUpBotPortRTSC */ 
				,		ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_UNLOADED_STATE /**< Represents the State: ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_UNLOADED_STATE of the Realtime-StateChart: ROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSC_PickUpBotPortRTSC */ 
				,		ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_MOVEAWAY_STATE /**< Represents the State: ROOTPICKUPBOTCMPRTSC_INIT_STATE_PICKUPBOTPORTRTSC_PICKUPBOTPORTRTSC_MOVEAWAY_STATE of the Realtime-StateChart: ROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSC_PickUpBotPortRTSC */	 
		}RootPickUpBotCmpRTSCState;
	
	
		/**
		 * 
		 * @brief Description of the Realtime-StateChart: RootPickUpBotCmpRTSC
		 * @details This struct represents the  Realtime-StateChart: RootPickUpBotCmpRTSC and its States
		 */
	struct RootPickUpBotCmpRTSCStateChart {	
			PickUpBotComponent * parentComponent; /**< A pointer to the parent ComponentInstance of Type: PickUpBotComponent , which has this Realtime-StateChart as its behavior */			
	
	
			RootPickUpBotCmpRTSCState currentStateOfRootPickUpBotCmpRTSC; /**< The current State of the Realtime-StateChart: RootPickUpBotCmpRTSC */
	
				RootPickUpBotCmpRTSCState currentStateOfROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSC_PickUpBotPortRTSC; /**< Represents the State: ROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSC of the Realtime-StateChart: RootPickUpBotCmpRTSC */
			
		
				Clock c_ofcurrentStateOfRootPickUpBotCmpRTSCClock; /**< The Clock: c_ofcurrentStateOfRootPickUpBotCmpRTSC */
		
			
		
		
	
			
		
	
	
	
		} ;

//METHOD STUBS
	/**
	 * @brief Creates an Instance of the Realtime-StateChart: RootPickUpBotCmpRTSC
	 * @details Allocates Memory for the struct RootPickUpBotCmpRTSCStateChart
	 * 
	 * @param parentComponent An Instance of the Component: PickUpBotComponent which behavior is described via this Realtime-StateChart
	 * @return A Pointer to the new created RootPickUpBotCmpRTSCStateChart
	 */
		RootPickUpBotCmpRTSCStateChart* RootPickUpBotCmpRTSCStateChart_create(PickUpBotComponent* parentComponent);
	/**
	 * @brief Initializes an Instance of the Realtime-StateChart: RootPickUpBotCmpRTSC
	 * @details All struct members of the struct RootPickUpBotCmpRTSCStateChart are initialized,
	 *			and all Regions of the Realtime-StateChart are initialized, too.
	 * 
	 * @param rtsc The specific RootPickUpBotCmpRTSCStateChart to be initialized
	 */
		void RootPickUpBotCmpRTSCStateChart_initialize(RootPickUpBotCmpRTSCStateChart* rtsc);
	/**
	 * @brief Initializes the Region: ROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSC of the Realtime-StateChart: RootPickUpBotCmpRTSC
	 * @details The Member RootPickUpBotCmpRTSCStateChart::currentStateOfROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSC_PickUpBotPortRTSC is initialized
	 * 
	 * @param stateChart The specific RootPickUpBotCmpRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSCRegion(RootPickUpBotCmpRTSCStateChart* stateChart);
	/**
	 * @brief Destroys the Realtime-StateChart: RootPickUpBotCmpRTSC
	 * @details Frees the Memory for the struct RootPickUpBotCmpRTSCStateChart
	 * 
	 * @param rtsc The specific RootPickUpBotCmpRTSCStateChart to be destroyed
	 */	
		void RootPickUpBotCmpRTSCStateChart_destroy(RootPickUpBotCmpRTSCStateChart* rtsc);		
	/**
	 * @brief Executes the next Step of the Realtime-StateChart: RootPickUpBotCmpRTSC
	 * 
	 * @param rtsc The specific RootPickUpBotCmpRTSCStateChart to be executed
	 */	
	void RootPickUpBotCmpRTSCStateChart_processStep(RootPickUpBotCmpRTSCStateChart* rtsc);

	/**
	 * @brief Leaves the Region: PickUpBotPortRTSC of the Realtime-StateChart: RootPickUpBotCmpRTSC
	 * @details This method is called, whenever a the Region: PickUpBotPortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootPickUpBotCmpRTSCStateChart whose Region: PickUpBotPortRTSC shall be exit
	 */
		void ROOTPICKUPBOTCMPRTSC_INIT_STATE_PickUpBotPortRTSC_PickUpBotPortRTSCStateChart_exit(RootPickUpBotCmpRTSCStateChart* rtsc);
			
	/**
	 * @brief Returns wether the Realtime-StateChart: RootPickUpBotCmpRTSC is in a specific State
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootPickUpBotCmpRTSCStateChart
	 * @param state One of the States of the Enum: RootPickUpBotCmpRTSCState
	 * 
	 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
	 * @todo  Why is this int and not bool, like everywhere else
	 */	
		int RootPickUpBotCmpRTSCStateChart_isInState(RootPickUpBotCmpRTSCStateChart* rtsc, RootPickUpBotCmpRTSCState state);
	/**
	 * @brief Checks if the execution of the Realtime-StateChart: RootPickUpBotCmpRTSC  is terminated
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootPickUpBotCmpRTSCStateChart
	 * @return Always True
	 * @todo  always true is returned
	 */	
	bool RootPickUpBotCmpRTSCStateChart_isTerminated(RootPickUpBotCmpRTSCStateChart* rtsc);

#endif /* ROOTPICKUPBOTCMPRTSCSTATECHART_H_ */
