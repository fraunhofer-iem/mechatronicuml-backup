/**
 * @file 
 * @author generated
 * @brief Specification of Realtime-StateChart: RootCommunicatorCmpRTSC
 * @details This files contains the description of the Realtime-StateChart: RootCommunicatorCmpRTSC and its behavior which is executed
 */

#ifndef ROOTCOMMUNICATORCMPRTSCSTATECHART_H_
#define ROOTCOMMUNICATORCMPRTSCSTATECHART_H_

#include "../lib/clock.h"
#include "../lib/syncChannel.h"
#include "../lib/MiddlewareTypes.h"
#include "../Middleware/MiddlewareCore.h"
#include "../components/communicatorComponent.h"
//ENUM
	/** 
	 * @brief This enum represents the States of the Realtime-StateChart: RootCommunicatorCmpRTSC
	 */
		typedef enum {
				ROOTCOMMUNICATORCMPRTSC_INIT_STATE /**< Represents the State: ROOTCOMMUNICATORCMPRTSC_INIT_STATE of the Realtime-StateChart: RootCommunicatorCmpRTSC */
				,
						ROOTCOMMUNICATORCMPRTSC_INIT_STATE_COMMUNICATORPORTRTSC_COMMUNICATORPORTRTSC_WAITSENDDELIVERYFLAG_STATE /**< Represents the State: ROOTCOMMUNICATORCMPRTSC_INIT_STATE_COMMUNICATORPORTRTSC_COMMUNICATORPORTRTSC_WAITSENDDELIVERYFLAG_STATE of the Realtime-StateChart: ROOTCOMMUNICATORCMPRTSC_INIT_STATE_CommunicatorPortRTSC_CommunicatorPortRTSC */ 
				,		ROOTCOMMUNICATORCMPRTSC_INIT_STATE_COMMUNICATORPORTRTSC_COMMUNICATORPORTRTSC_WAITFINISHDELIVERY_STATE /**< Represents the State: ROOTCOMMUNICATORCMPRTSC_INIT_STATE_COMMUNICATORPORTRTSC_COMMUNICATORPORTRTSC_WAITFINISHDELIVERY_STATE of the Realtime-StateChart: ROOTCOMMUNICATORCMPRTSC_INIT_STATE_CommunicatorPortRTSC_CommunicatorPortRTSC */ 
				,		ROOTCOMMUNICATORCMPRTSC_INIT_STATE_PICKUPPORTRTSC_PICKUPPORTRTSC_WAITINITPICKUP_STATE /**< Represents the State: ROOTCOMMUNICATORCMPRTSC_INIT_STATE_PICKUPPORTRTSC_PICKUPPORTRTSC_WAITINITPICKUP_STATE of the Realtime-StateChart: ROOTCOMMUNICATORCMPRTSC_INIT_STATE_PickUpPortRTSC_PickUpPortRTSC */ 
				,		ROOTCOMMUNICATORCMPRTSC_INIT_STATE_PICKUPPORTRTSC_PICKUPPORTRTSC_INITPICKUPRECEIVED_STATE /**< Represents the State: ROOTCOMMUNICATORCMPRTSC_INIT_STATE_PICKUPPORTRTSC_PICKUPPORTRTSC_INITPICKUPRECEIVED_STATE of the Realtime-StateChart: ROOTCOMMUNICATORCMPRTSC_INIT_STATE_PickUpPortRTSC_PickUpPortRTSC */	 
		}RootCommunicatorCmpRTSCState;
	
	
		/**
		 * 
		 * @brief Description of the Realtime-StateChart: RootCommunicatorCmpRTSC
		 * @details This struct represents the  Realtime-StateChart: RootCommunicatorCmpRTSC and its States
		 */
	struct RootCommunicatorCmpRTSCStateChart {	
			CommunicatorComponent * parentComponent; /**< A pointer to the parent ComponentInstance of Type: CommunicatorComponent , which has this Realtime-StateChart as its behavior */			
	
	
			RootCommunicatorCmpRTSCState currentStateOfRootCommunicatorCmpRTSC; /**< The current State of the Realtime-StateChart: RootCommunicatorCmpRTSC */
	
				RootCommunicatorCmpRTSCState currentStateOfROOTCOMMUNICATORCMPRTSC_INIT_STATE_CommunicatorPortRTSC_CommunicatorPortRTSC; /**< Represents the State: ROOTCOMMUNICATORCMPRTSC_INIT_STATE_CommunicatorPortRTSC of the Realtime-StateChart: RootCommunicatorCmpRTSC */
				RootCommunicatorCmpRTSCState currentStateOfROOTCOMMUNICATORCMPRTSC_INIT_STATE_PickUpPortRTSC_PickUpPortRTSC; /**< Represents the State: ROOTCOMMUNICATORCMPRTSC_INIT_STATE_PickUpPortRTSC of the Realtime-StateChart: RootCommunicatorCmpRTSC */
			
		
		
			
		
		
	
			
				bool sendDeliveryFlag; /**< The Realtime-StateChart Variable: sendDeliveryFlag of Type: BOOLEAN */
				bool finishDeliveryFlag; /**< The Realtime-StateChart Variable: finishDeliveryFlag of Type: BOOLEAN */
		
	
	
	
		} ;

//METHOD STUBS
	/**
	 * @brief Creates an Instance of the Realtime-StateChart: RootCommunicatorCmpRTSC
	 * @details Allocates Memory for the struct RootCommunicatorCmpRTSCStateChart
	 * 
	 * @param parentComponent An Instance of the Component: CommunicatorComponent which behavior is described via this Realtime-StateChart
	 * @return A Pointer to the new created RootCommunicatorCmpRTSCStateChart
	 */
		RootCommunicatorCmpRTSCStateChart* RootCommunicatorCmpRTSCStateChart_create(CommunicatorComponent* parentComponent);
	/**
	 * @brief Initializes an Instance of the Realtime-StateChart: RootCommunicatorCmpRTSC
	 * @details All struct members of the struct RootCommunicatorCmpRTSCStateChart are initialized,
	 *			and all Regions of the Realtime-StateChart are initialized, too.
	 * 
	 * @param rtsc The specific RootCommunicatorCmpRTSCStateChart to be initialized
	 */
		void RootCommunicatorCmpRTSCStateChart_initialize(RootCommunicatorCmpRTSCStateChart* rtsc);
	/**
	 * @brief Initializes the Region: ROOTCOMMUNICATORCMPRTSC_INIT_STATE_CommunicatorPortRTSC of the Realtime-StateChart: RootCommunicatorCmpRTSC
	 * @details The Member RootCommunicatorCmpRTSCStateChart::currentStateOfROOTCOMMUNICATORCMPRTSC_INIT_STATE_CommunicatorPortRTSC_CommunicatorPortRTSC is initialized
	 * 
	 * @param stateChart The specific RootCommunicatorCmpRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTCOMMUNICATORCMPRTSC_INIT_STATE_CommunicatorPortRTSCRegion(RootCommunicatorCmpRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTCOMMUNICATORCMPRTSC_INIT_STATE_PickUpPortRTSC of the Realtime-StateChart: RootCommunicatorCmpRTSC
	 * @details The Member RootCommunicatorCmpRTSCStateChart::currentStateOfROOTCOMMUNICATORCMPRTSC_INIT_STATE_PickUpPortRTSC_PickUpPortRTSC is initialized
	 * 
	 * @param stateChart The specific RootCommunicatorCmpRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTCOMMUNICATORCMPRTSC_INIT_STATE_PickUpPortRTSCRegion(RootCommunicatorCmpRTSCStateChart* stateChart);
	/**
	 * @brief Destroys the Realtime-StateChart: RootCommunicatorCmpRTSC
	 * @details Frees the Memory for the struct RootCommunicatorCmpRTSCStateChart
	 * 
	 * @param rtsc The specific RootCommunicatorCmpRTSCStateChart to be destroyed
	 */	
		void RootCommunicatorCmpRTSCStateChart_destroy(RootCommunicatorCmpRTSCStateChart* rtsc);		
	/**
	 * @brief Executes the next Step of the Realtime-StateChart: RootCommunicatorCmpRTSC
	 * 
	 * @param rtsc The specific RootCommunicatorCmpRTSCStateChart to be executed
	 */	
	void RootCommunicatorCmpRTSCStateChart_processStep(RootCommunicatorCmpRTSCStateChart* rtsc);

	/**
	 * @brief Leaves the Region: PickUpPortRTSC of the Realtime-StateChart: RootCommunicatorCmpRTSC
	 * @details This method is called, whenever a the Region: PickUpPortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootCommunicatorCmpRTSCStateChart whose Region: PickUpPortRTSC shall be exit
	 */
		void ROOTCOMMUNICATORCMPRTSC_INIT_STATE_PickUpPortRTSC_PickUpPortRTSCStateChart_exit(RootCommunicatorCmpRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: CommunicatorPortRTSC of the Realtime-StateChart: RootCommunicatorCmpRTSC
	 * @details This method is called, whenever a the Region: CommunicatorPortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootCommunicatorCmpRTSCStateChart whose Region: CommunicatorPortRTSC shall be exit
	 */
		void ROOTCOMMUNICATORCMPRTSC_INIT_STATE_CommunicatorPortRTSC_CommunicatorPortRTSCStateChart_exit(RootCommunicatorCmpRTSCStateChart* rtsc);
			
	/**
	 * @brief Returns wether the Realtime-StateChart: RootCommunicatorCmpRTSC is in a specific State
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootCommunicatorCmpRTSCStateChart
	 * @param state One of the States of the Enum: RootCommunicatorCmpRTSCState
	 * 
	 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
	 * @todo  Why is this int and not bool, like everywhere else
	 */	
		int RootCommunicatorCmpRTSCStateChart_isInState(RootCommunicatorCmpRTSCStateChart* rtsc, RootCommunicatorCmpRTSCState state);
	/**
	 * @brief Checks if the execution of the Realtime-StateChart: RootCommunicatorCmpRTSC  is terminated
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootCommunicatorCmpRTSCStateChart
	 * @return Always True
	 * @todo  always true is returned
	 */	
	bool RootCommunicatorCmpRTSCStateChart_isTerminated(RootCommunicatorCmpRTSCStateChart* rtsc);

#endif /* ROOTCOMMUNICATORCMPRTSCSTATECHART_H_ */
