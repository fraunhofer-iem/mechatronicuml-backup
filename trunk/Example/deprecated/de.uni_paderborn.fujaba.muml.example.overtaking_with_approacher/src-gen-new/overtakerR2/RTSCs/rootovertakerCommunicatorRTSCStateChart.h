/**
 * @file 
 * @author generated
 * @brief Specification of Realtime-StateChart: RootovertakerCommunicatorRTSC
 * @details This files contains the description of the Realtime-StateChart: RootovertakerCommunicatorRTSC and its behavior which is executed
 */

#ifndef ROOTOVERTAKERCOMMUNICATORRTSCSTATECHART_H_
#define ROOTOVERTAKERCOMMUNICATORRTSCSTATECHART_H_

#include "../lib/clock.h"
#include "../lib/syncChannel.h"
#include "../lib/MiddlewareTypes.h"
#include "../Middleware/MiddlewareCore.h"
#include "../components/overtakerCommunicatorComponent.h"
//ENUM
	/** 
	 * @brief This enum represents the States of the Realtime-StateChart: RootovertakerCommunicatorRTSC
	 */
		typedef enum {
				ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE of the Realtime-StateChart: RootovertakerCommunicatorRTSC */
				,
						ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_INIT_STATE /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_INIT_STATE of the Realtime-StateChart: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC_overtakerPortRTSC */ 
				,		ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_REQUESTED_STATE /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_REQUESTED_STATE of the Realtime-StateChart: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC_overtakerPortRTSC */ 
				,		ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_DECLINED_STATE /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_DECLINED_STATE of the Realtime-StateChart: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC_overtakerPortRTSC */ 
				,		ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_OVERTAKING_STATE /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERPORTRTSC_OVERTAKERPORTRTSC_OVERTAKING_STATE of the Realtime-StateChart: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC_overtakerPortRTSC */ 
				,		ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKERPORTRTSC_VEHICLEOVERTAKERPORTRTSC_INIT_STATE /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKERPORTRTSC_VEHICLEOVERTAKERPORTRTSC_INIT_STATE of the Realtime-StateChart: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_vehicleOvertakerPortRTSC_vehicleOvertakerPortRTSC */ 
				,		ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKERPORTRTSC_VEHICLEOVERTAKERPORTRTSC_CHANGEDSECTION_STATE /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKERPORTRTSC_VEHICLEOVERTAKERPORTRTSC_CHANGEDSECTION_STATE of the Realtime-StateChart: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_vehicleOvertakerPortRTSC_vehicleOvertakerPortRTSC */ 
				,		ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_INIT_STATE /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_INIT_STATE of the Realtime-StateChart: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC */ 
				,		ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_INITIATE_STATE /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_INITIATE_STATE of the Realtime-StateChart: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC */ 
				,		ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_EXECUTING_STATE /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_EXECUTING_STATE of the Realtime-StateChart: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC */ 
				,		ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_SAVE_STATE /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_SAVE_STATE of the Realtime-StateChart: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC */ 
				,		ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_UNSAVE_STATE /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_UNSAVE_STATE of the Realtime-StateChart: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC */ 
				,		ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_ALLOW_STATE /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_EXECUTORPORTRTSC_EXECUTORPORTRTSC_ALLOW_STATE of the Realtime-StateChart: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC */ 
				,		ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_REQUESTORPORTRTSC_REQUESTORPORTRTSC_INIT_STATE /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_REQUESTORPORTRTSC_REQUESTORPORTRTSC_INIT_STATE of the Realtime-StateChart: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSC_requestorPortRTSC */ 
				,		ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_REQUESTORPORTRTSC_REQUESTORPORTRTSC_ALLOW_STATE /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_REQUESTORPORTRTSC_REQUESTORPORTRTSC_ALLOW_STATE of the Realtime-StateChart: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSC_requestorPortRTSC */ 
				,		ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE of the Realtime-StateChart: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerCommunicator_color_behavior_overtakerCommunicator_color_behavior */
				,
						ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE of the Realtime-StateChart: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE of the Realtime-StateChart: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */	 
		}RootovertakerCommunicatorRTSCState;
	
	
		/**
		 * 
		 * @brief Description of the Realtime-StateChart: RootovertakerCommunicatorRTSC
		 * @details This struct represents the  Realtime-StateChart: RootovertakerCommunicatorRTSC and its States
		 */
	struct RootovertakerCommunicatorRTSCStateChart {	
			OvertakerCommunicatorComponent * parentComponent; /**< A pointer to the parent ComponentInstance of Type: OvertakerCommunicatorComponent , which has this Realtime-StateChart as its behavior */			
	
	
			RootovertakerCommunicatorRTSCState currentStateOfRootovertakerCommunicatorRTSC; /**< The current State of the Realtime-StateChart: RootovertakerCommunicatorRTSC */
	
				RootovertakerCommunicatorRTSCState currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC_overtakerPortRTSC; /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC of the Realtime-StateChart: RootovertakerCommunicatorRTSC */
				RootovertakerCommunicatorRTSCState currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_vehicleOvertakerPortRTSC_vehicleOvertakerPortRTSC; /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_vehicleOvertakerPortRTSC of the Realtime-StateChart: RootovertakerCommunicatorRTSC */
				RootovertakerCommunicatorRTSCState currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC; /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC of the Realtime-StateChart: RootovertakerCommunicatorRTSC */
				RootovertakerCommunicatorRTSCState currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSC_requestorPortRTSC; /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSC of the Realtime-StateChart: RootovertakerCommunicatorRTSC */
				RootovertakerCommunicatorRTSCState currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerCommunicator_color_behavior_overtakerCommunicator_color_behavior; /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerCommunicator_color_behavior of the Realtime-StateChart: RootovertakerCommunicatorRTSC */
				RootovertakerCommunicatorRTSCState currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootovertakerCommunicatorRTSC */
			
		
				Clock receiverTimeout_ofcurrentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: ReceiverTimeout_ofcurrentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
				Clock changeClock_ofcurrentStateOfRootovertakerCommunicatorRTSCClock; /**< The Clock: changeClock_ofcurrentStateOfRootovertakerCommunicatorRTSC */
				Clock declineClock_ofcurrentStateOfRootovertakerCommunicatorRTSCClock; /**< The Clock: declineClock_ofcurrentStateOfRootovertakerCommunicatorRTSC */
				Clock unsaveClock_ofcurrentStateOfRootovertakerCommunicatorRTSCClock; /**< The Clock: unsaveClock_ofcurrentStateOfRootovertakerCommunicatorRTSC */
		
			
		
		
	
			
				int constSecRed; /**< The Realtime-StateChart Variable: constSecRed of Type: INT */
				int constSecGreen; /**< The Realtime-StateChart Variable: constSecGreen of Type: INT */
				int constSecBlue; /**< The Realtime-StateChart Variable: constSecBlue of Type: INT */
				int constSecYellow; /**< The Realtime-StateChart Variable: constSecYellow of Type: INT */
				int constSecOrange; /**< The Realtime-StateChart Variable: constSecOrange of Type: INT */
				bool change; /**< The Realtime-StateChart Variable: change of Type: BOOLEAN */
				int constVelSlow; /**< The Realtime-StateChart Variable: constVelSlow of Type: INT */
				int constVelFast; /**< The Realtime-StateChart Variable: constVelFast of Type: INT */
				int Vel; /**< The Realtime-StateChart Variable: Vel of Type: INT */
				int secID; /**< The Realtime-StateChart Variable: secID of Type: INT */
				int currentSec; /**< The Realtime-StateChart Variable: currentSec of Type: INT */
				int color_apiValue; /**< The Realtime-StateChart Variable: color_apiValue of Type: INT */
		
	
	
				SyncChannel* saveSyncChannel; /**< The Realtime-StateChart's Synchronization Channel: save */
				SyncChannel* executeSyncChannel; /**< The Realtime-StateChart's Synchronization Channel: execute */
				SyncChannel* executedSyncChannel; /**< The Realtime-StateChart's Synchronization Channel: executed */
				SyncChannel* unsaveSyncChannel; /**< The Realtime-StateChart's Synchronization Channel: unsave */
				SyncChannel* initiateSyncChannel; /**< The Realtime-StateChart's Synchronization Channel: initiate */
				SyncChannel* allowSyncChannel; /**< The Realtime-StateChart's Synchronization Channel: allow */
	
		} ;

//METHOD STUBS
	/**
	 * @brief Creates an Instance of the Realtime-StateChart: RootovertakerCommunicatorRTSC
	 * @details Allocates Memory for the struct RootovertakerCommunicatorRTSCStateChart
	 * 
	 * @param parentComponent An Instance of the Component: OvertakerCommunicatorComponent which behavior is described via this Realtime-StateChart
	 * @return A Pointer to the new created RootovertakerCommunicatorRTSCStateChart
	 */
		RootovertakerCommunicatorRTSCStateChart* RootovertakerCommunicatorRTSCStateChart_create(OvertakerCommunicatorComponent* parentComponent);
	/**
	 * @brief Initializes an Instance of the Realtime-StateChart: RootovertakerCommunicatorRTSC
	 * @details All struct members of the struct RootovertakerCommunicatorRTSCStateChart are initialized,
	 *			and all Regions of the Realtime-StateChart are initialized, too.
	 * 
	 * @param rtsc The specific RootovertakerCommunicatorRTSCStateChart to be initialized
	 */
		void RootovertakerCommunicatorRTSCStateChart_initialize(RootovertakerCommunicatorRTSCStateChart* rtsc);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC of the Realtime-StateChart: RootovertakerCommunicatorRTSC
	 * @details The Member RootovertakerCommunicatorRTSCStateChart::currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC_overtakerPortRTSC is initialized
	 * 
	 * @param stateChart The specific RootovertakerCommunicatorRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSCRegion(RootovertakerCommunicatorRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_vehicleOvertakerPortRTSC of the Realtime-StateChart: RootovertakerCommunicatorRTSC
	 * @details The Member RootovertakerCommunicatorRTSCStateChart::currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_vehicleOvertakerPortRTSC_vehicleOvertakerPortRTSC is initialized
	 * 
	 * @param stateChart The specific RootovertakerCommunicatorRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_vehicleOvertakerPortRTSCRegion(RootovertakerCommunicatorRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC of the Realtime-StateChart: RootovertakerCommunicatorRTSC
	 * @details The Member RootovertakerCommunicatorRTSCStateChart::currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSC is initialized
	 * 
	 * @param stateChart The specific RootovertakerCommunicatorRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSCRegion(RootovertakerCommunicatorRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSC of the Realtime-StateChart: RootovertakerCommunicatorRTSC
	 * @details The Member RootovertakerCommunicatorRTSCStateChart::currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSC_requestorPortRTSC is initialized
	 * 
	 * @param stateChart The specific RootovertakerCommunicatorRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSCRegion(RootovertakerCommunicatorRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerCommunicator_color_behavior of the Realtime-StateChart: RootovertakerCommunicatorRTSC
	 * @details The Member RootovertakerCommunicatorRTSCStateChart::currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerCommunicator_color_behavior_overtakerCommunicator_color_behavior is initialized
	 * 
	 * @param stateChart The specific RootovertakerCommunicatorRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerCommunicator_color_behaviorRegion(RootovertakerCommunicatorRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootovertakerCommunicatorRTSC
	 * @details The Member RootovertakerCommunicatorRTSCStateChart::currentStateOfROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootovertakerCommunicatorRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmissionRegion(RootovertakerCommunicatorRTSCStateChart* stateChart);
	/**
	 * @brief Destroys the Realtime-StateChart: RootovertakerCommunicatorRTSC
	 * @details Frees the Memory for the struct RootovertakerCommunicatorRTSCStateChart
	 * 
	 * @param rtsc The specific RootovertakerCommunicatorRTSCStateChart to be destroyed
	 */	
		void RootovertakerCommunicatorRTSCStateChart_destroy(RootovertakerCommunicatorRTSCStateChart* rtsc);		
	/**
	 * @brief Executes the next Step of the Realtime-StateChart: RootovertakerCommunicatorRTSC
	 * 
	 * @param rtsc The specific RootovertakerCommunicatorRTSCStateChart to be executed
	 */	
	void RootovertakerCommunicatorRTSCStateChart_processStep(RootovertakerCommunicatorRTSCStateChart* rtsc);

	/**
	 * @brief Leaves the Region: overtakerPortRTSC of the Realtime-StateChart: RootovertakerCommunicatorRTSC
	 * @details This method is called, whenever a the Region: overtakerPortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakerCommunicatorRTSCStateChart whose Region: overtakerPortRTSC shall be exit
	 */
		void ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerPortRTSC_overtakerPortRTSCStateChart_exit(RootovertakerCommunicatorRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: vehicleOvertakerPortRTSC of the Realtime-StateChart: RootovertakerCommunicatorRTSC
	 * @details This method is called, whenever a the Region: vehicleOvertakerPortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakerCommunicatorRTSCStateChart whose Region: vehicleOvertakerPortRTSC shall be exit
	 */
		void ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_vehicleOvertakerPortRTSC_vehicleOvertakerPortRTSCStateChart_exit(RootovertakerCommunicatorRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: executorPortRTSC of the Realtime-StateChart: RootovertakerCommunicatorRTSC
	 * @details This method is called, whenever a the Region: executorPortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakerCommunicatorRTSCStateChart whose Region: executorPortRTSC shall be exit
	 */
		void ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_executorPortRTSC_executorPortRTSCStateChart_exit(RootovertakerCommunicatorRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: overtakerCommunicator_color_behavior of the Realtime-StateChart: RootovertakerCommunicatorRTSC
	 * @details This method is called, whenever a the Region: overtakerCommunicator_color_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakerCommunicatorRTSCStateChart whose Region: overtakerCommunicator_color_behavior shall be exit
	 */
		void ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_overtakerCommunicator_color_behavior_overtakerCommunicator_color_behaviorStateChart_exit(RootovertakerCommunicatorRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: requestorPortRTSC of the Realtime-StateChart: RootovertakerCommunicatorRTSC
	 * @details This method is called, whenever a the Region: requestorPortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakerCommunicatorRTSCStateChart whose Region: requestorPortRTSC shall be exit
	 */
		void ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_requestorPortRTSC_requestorPortRTSCStateChart_exit(RootovertakerCommunicatorRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootovertakerCommunicatorRTSC
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakerCommunicatorRTSCStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTOVERTAKERCOMMUNICATORRTSC_INIT_STATE_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_OVERTAKERCOMMUNICATOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootovertakerCommunicatorRTSCStateChart* rtsc);
			
	/**
	 * @brief Returns wether the Realtime-StateChart: RootovertakerCommunicatorRTSC is in a specific State
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootovertakerCommunicatorRTSCStateChart
	 * @param state One of the States of the Enum: RootovertakerCommunicatorRTSCState
	 * 
	 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
	 * @todo  Why is this int and not bool, like everywhere else
	 */	
		int RootovertakerCommunicatorRTSCStateChart_isInState(RootovertakerCommunicatorRTSCStateChart* rtsc, RootovertakerCommunicatorRTSCState state);
	/**
	 * @brief Checks if the execution of the Realtime-StateChart: RootovertakerCommunicatorRTSC  is terminated
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootovertakerCommunicatorRTSCStateChart
	 * @return Always True
	 * @todo  always true is returned
	 */	
	bool RootovertakerCommunicatorRTSCStateChart_isTerminated(RootovertakerCommunicatorRTSCStateChart* rtsc);

#endif /* ROOTOVERTAKERCOMMUNICATORRTSCSTATECHART_H_ */
