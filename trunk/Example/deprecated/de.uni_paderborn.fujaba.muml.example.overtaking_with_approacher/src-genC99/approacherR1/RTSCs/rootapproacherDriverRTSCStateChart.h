/**
 * @file 
 * @author generated
 * @brief Specification of Realtime-StateChart: RootapproacherDriverRTSC
 * @details This files contains the description of the Realtime-StateChart: RootapproacherDriverRTSC and its behavior which is executed
 */

#ifndef ROOTAPPROACHERDRIVERRTSCSTATECHART_H_
#define ROOTAPPROACHERDRIVERRTSCSTATECHART_H_

#include "../lib/clock.h"
#include "../lib/syncChannel.h"
#include "../lib/MiddlewareTypes.h"
#include "../Middleware/MiddlewareCore.h"
#include "../components/approacherDriverComponent.h"
//ENUM
	/** 
	 * @brief This enum represents the States of the Realtime-StateChart: RootapproacherDriverRTSC
	 */
		typedef enum {
				ROOTAPPROACHERDRIVERRTSC_INIT_STATE /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE of the Realtime-StateChart: RootapproacherDriverRTSC */
				,
						ROOTAPPROACHERDRIVERRTSC_INIT_STATE_LIMITERPORTRTSC_LIMITERPORTRTSC_FREE_STATE /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_LIMITERPORTRTSC_LIMITERPORTRTSC_FREE_STATE of the Realtime-StateChart: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_limiterPortRTSC_limiterPortRTSC */ 
				,		ROOTAPPROACHERDRIVERRTSC_INIT_STATE_LIMITERPORTRTSC_LIMITERPORTRTSC_FIXED_STATE /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_LIMITERPORTRTSC_LIMITERPORTRTSC_FIXED_STATE of the Realtime-StateChart: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_limiterPortRTSC_limiterPortRTSC */ 
				,		ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVINGRTSC_APPROACHERDRIVINGRTSC_DRIVE_STATE /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVINGRTSC_APPROACHERDRIVINGRTSC_DRIVE_STATE of the Realtime-StateChart: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSC_approacherDrivingRTSC */ 
				,		ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVINGRTSC_APPROACHERDRIVINGRTSC_FIXEDSLOW_STATE /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVINGRTSC_APPROACHERDRIVINGRTSC_FIXEDSLOW_STATE of the Realtime-StateChart: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSC_approacherDrivingRTSC */ 
				,		ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPRACHERSAVEBREAKRTSC_APPRACHERSAVEBREAKRTSC_CHECKDISTANCE_STATE /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPRACHERSAVEBREAKRTSC_APPRACHERSAVEBREAKRTSC_CHECKDISTANCE_STATE of the Realtime-StateChart: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_appracherSaveBreakRTSC_appracherSaveBreakRTSC */ 
				,		ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPRACHERSAVEBREAKRTSC_APPRACHERSAVEBREAKRTSC_BREAKNOW_STATE /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPRACHERSAVEBREAKRTSC_APPRACHERSAVEBREAKRTSC_BREAKNOW_STATE of the Realtime-StateChart: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_appracherSaveBreakRTSC_appracherSaveBreakRTSC */ 
				,		ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE of the Realtime-StateChart: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityL_behavior_approacherDriver_velocityL_behavior */
				,
						ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE of the Realtime-StateChart: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE of the Realtime-StateChart: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityR_behavior_approacherDriver_velocityR_behavior */
				,
						ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE of the Realtime-StateChart: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE of the Realtime-StateChart: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_lineApproacher_behavior_approacherDriver_lineApproacher_behavior */
				,
						ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE of the Realtime-StateChart: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE of the Realtime-StateChart: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE of the Realtime-StateChart: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_distance_behavior_approacherDriver_distance_behavior */
				,
						ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE of the Realtime-StateChart: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE of the Realtime-StateChart: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */	 
		}RootapproacherDriverRTSCState;
	
	
		/**
		 * 
		 * @brief Description of the Realtime-StateChart: RootapproacherDriverRTSC
		 * @details This struct represents the  Realtime-StateChart: RootapproacherDriverRTSC and its States
		 */
	struct RootapproacherDriverRTSCStateChart {	
			ApproacherDriverComponent * parentComponent; /**< A pointer to the parent ComponentInstance of Type: ApproacherDriverComponent , which has this Realtime-StateChart as its behavior */			
	
	
			RootapproacherDriverRTSCState currentStateOfRootapproacherDriverRTSC; /**< The current State of the Realtime-StateChart: RootapproacherDriverRTSC */
	
				RootapproacherDriverRTSCState currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_limiterPortRTSC_limiterPortRTSC; /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_limiterPortRTSC of the Realtime-StateChart: RootapproacherDriverRTSC */
				RootapproacherDriverRTSCState currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSC_approacherDrivingRTSC; /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSC of the Realtime-StateChart: RootapproacherDriverRTSC */
				RootapproacherDriverRTSCState currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_appracherSaveBreakRTSC_appracherSaveBreakRTSC; /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_appracherSaveBreakRTSC of the Realtime-StateChart: RootapproacherDriverRTSC */
				RootapproacherDriverRTSCState currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityL_behavior_approacherDriver_velocityL_behavior; /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityL_behavior of the Realtime-StateChart: RootapproacherDriverRTSC */
				RootapproacherDriverRTSCState currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootapproacherDriverRTSC */
				RootapproacherDriverRTSCState currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityR_behavior_approacherDriver_velocityR_behavior; /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityR_behavior of the Realtime-StateChart: RootapproacherDriverRTSC */
				RootapproacherDriverRTSCState currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootapproacherDriverRTSC */
				RootapproacherDriverRTSCState currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_lineApproacher_behavior_approacherDriver_lineApproacher_behavior; /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_lineApproacher_behavior of the Realtime-StateChart: RootapproacherDriverRTSC */
				RootapproacherDriverRTSCState currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootapproacherDriverRTSC */
				RootapproacherDriverRTSCState currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_distance_behavior_approacherDriver_distance_behavior; /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_distance_behavior of the Realtime-StateChart: RootapproacherDriverRTSC */
				RootapproacherDriverRTSCState currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootapproacherDriverRTSC */
			
		
				Clock clockSending_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: clockSending_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
				Clock clockSending_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: clockSending_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
				Clock receiverTimeout_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: ReceiverTimeout_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
				Clock receiverTimeout_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: ReceiverTimeout_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
				Clock changeClock_ofcurrentStateOfRootapproacherDriverRTSCClock; /**< The Clock: changeClock_ofcurrentStateOfRootapproacherDriverRTSC */
		
			
		
		
	
			
				int constVelFast; /**< The Realtime-StateChart Variable: constVelFast of Type: INT */
				int constVelSlow; /**< The Realtime-StateChart Variable: constVelSlow of Type: INT */
				int Vel; /**< The Realtime-StateChart Variable: Vel of Type: INT */
				int constChangeInterval; /**< The Realtime-StateChart Variable: constChangeInterval of Type: INT */
				int constBreakDistance; /**< The Realtime-StateChart Variable: constBreakDistance of Type: INT */
				int velocityL_apiValue; /**< The Realtime-StateChart Variable: velocityL_apiValue of Type: INT */
				int velocityR_apiValue; /**< The Realtime-StateChart Variable: velocityR_apiValue of Type: INT */
				int lineApproacher_apiValue; /**< The Realtime-StateChart Variable: lineApproacher_apiValue of Type: INT */
				int distance_apiValue; /**< The Realtime-StateChart Variable: distance_apiValue of Type: INT */
		
	
	
				SyncChannel* fixSyncChannel; /**< The Realtime-StateChart's Synchronization Channel: fix */
				SyncChannel* freeSyncChannel; /**< The Realtime-StateChart's Synchronization Channel: free */
	
		} ;

//METHOD STUBS
	/**
	 * @brief Creates an Instance of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details Allocates Memory for the struct RootapproacherDriverRTSCStateChart
	 * 
	 * @param parentComponent An Instance of the Component: ApproacherDriverComponent which behavior is described via this Realtime-StateChart
	 * @return A Pointer to the new created RootapproacherDriverRTSCStateChart
	 */
		RootapproacherDriverRTSCStateChart* RootapproacherDriverRTSCStateChart_create(ApproacherDriverComponent* parentComponent);
	/**
	 * @brief Initializes an Instance of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details All struct members of the struct RootapproacherDriverRTSCStateChart are initialized,
	 *			and all Regions of the Realtime-StateChart are initialized, too.
	 * 
	 * @param rtsc The specific RootapproacherDriverRTSCStateChart to be initialized
	 */
		void RootapproacherDriverRTSCStateChart_initialize(RootapproacherDriverRTSCStateChart* rtsc);
	/**
	 * @brief Initializes the Region: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_limiterPortRTSC of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details The Member RootapproacherDriverRTSCStateChart::currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_limiterPortRTSC_limiterPortRTSC is initialized
	 * 
	 * @param stateChart The specific RootapproacherDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_limiterPortRTSCRegion(RootapproacherDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSC of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details The Member RootapproacherDriverRTSCStateChart::currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSC_approacherDrivingRTSC is initialized
	 * 
	 * @param stateChart The specific RootapproacherDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSCRegion(RootapproacherDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_appracherSaveBreakRTSC of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details The Member RootapproacherDriverRTSCStateChart::currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_appracherSaveBreakRTSC_appracherSaveBreakRTSC is initialized
	 * 
	 * @param stateChart The specific RootapproacherDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_appracherSaveBreakRTSCRegion(RootapproacherDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityL_behavior of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details The Member RootapproacherDriverRTSCStateChart::currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityL_behavior_approacherDriver_velocityL_behavior is initialized
	 * 
	 * @param stateChart The specific RootapproacherDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityL_behaviorRegion(RootapproacherDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details The Member RootapproacherDriverRTSCStateChart::currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootapproacherDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmissionRegion(RootapproacherDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityR_behavior of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details The Member RootapproacherDriverRTSCStateChart::currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityR_behavior_approacherDriver_velocityR_behavior is initialized
	 * 
	 * @param stateChart The specific RootapproacherDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityR_behaviorRegion(RootapproacherDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details The Member RootapproacherDriverRTSCStateChart::currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootapproacherDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmissionRegion(RootapproacherDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_lineApproacher_behavior of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details The Member RootapproacherDriverRTSCStateChart::currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_lineApproacher_behavior_approacherDriver_lineApproacher_behavior is initialized
	 * 
	 * @param stateChart The specific RootapproacherDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_lineApproacher_behaviorRegion(RootapproacherDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details The Member RootapproacherDriverRTSCStateChart::currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootapproacherDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmissionRegion(RootapproacherDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_distance_behavior of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details The Member RootapproacherDriverRTSCStateChart::currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_distance_behavior_approacherDriver_distance_behavior is initialized
	 * 
	 * @param stateChart The specific RootapproacherDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_distance_behaviorRegion(RootapproacherDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details The Member RootapproacherDriverRTSCStateChart::currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootapproacherDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmissionRegion(RootapproacherDriverRTSCStateChart* stateChart);
	/**
	 * @brief Destroys the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details Frees the Memory for the struct RootapproacherDriverRTSCStateChart
	 * 
	 * @param rtsc The specific RootapproacherDriverRTSCStateChart to be destroyed
	 */	
		void RootapproacherDriverRTSCStateChart_destroy(RootapproacherDriverRTSCStateChart* rtsc);		
	/**
	 * @brief Executes the next Step of the Realtime-StateChart: RootapproacherDriverRTSC
	 * 
	 * @param rtsc The specific RootapproacherDriverRTSCStateChart to be executed
	 */	
	void RootapproacherDriverRTSCStateChart_processStep(RootapproacherDriverRTSCStateChart* rtsc);

	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootapproacherDriverRTSCStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootapproacherDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: approacherDriver_velocityL_behavior of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details This method is called, whenever a the Region: approacherDriver_velocityL_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootapproacherDriverRTSCStateChart whose Region: approacherDriver_velocityL_behavior shall be exit
	 */
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityL_behavior_approacherDriver_velocityL_behaviorStateChart_exit(RootapproacherDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: approacherDriver_velocityR_behavior of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details This method is called, whenever a the Region: approacherDriver_velocityR_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootapproacherDriverRTSCStateChart whose Region: approacherDriver_velocityR_behavior shall be exit
	 */
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityR_behavior_approacherDriver_velocityR_behaviorStateChart_exit(RootapproacherDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: limiterPortRTSC of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details This method is called, whenever a the Region: limiterPortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootapproacherDriverRTSCStateChart whose Region: limiterPortRTSC shall be exit
	 */
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_limiterPortRTSC_limiterPortRTSCStateChart_exit(RootapproacherDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: approacherDrivingRTSC of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details This method is called, whenever a the Region: approacherDrivingRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootapproacherDriverRTSCStateChart whose Region: approacherDrivingRTSC shall be exit
	 */
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSC_approacherDrivingRTSCStateChart_exit(RootapproacherDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootapproacherDriverRTSCStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootapproacherDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: approacherDriver_distance_behavior of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details This method is called, whenever a the Region: approacherDriver_distance_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootapproacherDriverRTSCStateChart whose Region: approacherDriver_distance_behavior shall be exit
	 */
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_distance_behavior_approacherDriver_distance_behaviorStateChart_exit(RootapproacherDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootapproacherDriverRTSCStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootapproacherDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootapproacherDriverRTSCStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootapproacherDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: approacherDriver_lineApproacher_behavior of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details This method is called, whenever a the Region: approacherDriver_lineApproacher_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootapproacherDriverRTSCStateChart whose Region: approacherDriver_lineApproacher_behavior shall be exit
	 */
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_lineApproacher_behavior_approacherDriver_lineApproacher_behaviorStateChart_exit(RootapproacherDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: appracherSaveBreakRTSC of the Realtime-StateChart: RootapproacherDriverRTSC
	 * @details This method is called, whenever a the Region: appracherSaveBreakRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootapproacherDriverRTSCStateChart whose Region: appracherSaveBreakRTSC shall be exit
	 */
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_appracherSaveBreakRTSC_appracherSaveBreakRTSCStateChart_exit(RootapproacherDriverRTSCStateChart* rtsc);
			
	/**
	 * @brief Returns wether the Realtime-StateChart: RootapproacherDriverRTSC is in a specific State
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootapproacherDriverRTSCStateChart
	 * @param state One of the States of the Enum: RootapproacherDriverRTSCState
	 * 
	 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
	 * @todo  Why is this int and not bool, like everywhere else
	 */	
		int RootapproacherDriverRTSCStateChart_isInState(RootapproacherDriverRTSCStateChart* rtsc, RootapproacherDriverRTSCState state);
	/**
	 * @brief Checks if the execution of the Realtime-StateChart: RootapproacherDriverRTSC  is terminated
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootapproacherDriverRTSCStateChart
	 * @return Always True
	 * @todo  always true is returned
	 */	
	bool RootapproacherDriverRTSCStateChart_isTerminated(RootapproacherDriverRTSCStateChart* rtsc);

#endif /* ROOTAPPROACHERDRIVERRTSCSTATECHART_H_ */
