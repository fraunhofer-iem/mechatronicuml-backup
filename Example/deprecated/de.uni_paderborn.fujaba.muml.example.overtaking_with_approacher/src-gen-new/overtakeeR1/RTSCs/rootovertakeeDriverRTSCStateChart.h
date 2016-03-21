/**
 * @file 
 * @author generated
 * @brief Specification of Realtime-StateChart: RootovertakeeDriverRTSC
 * @details This files contains the description of the Realtime-StateChart: RootovertakeeDriverRTSC and its behavior which is executed
 */

#ifndef ROOTOVERTAKEEDRIVERRTSCSTATECHART_H_
#define ROOTOVERTAKEEDRIVERRTSCSTATECHART_H_

#include "../lib/clock.h"
#include "../lib/syncChannel.h"
#include "../lib/MiddlewareTypes.h"
#include "../Middleware/MiddlewareCore.h"
#include "../components/overtakeeDriverComponent.h"
//ENUM
	/** 
	 * @brief This enum represents the States of the Realtime-StateChart: RootovertakeeDriverRTSC
	 */
		typedef enum {
				ROOTOVERTAKEEDRIVERRTSC_INIT_STATE /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE of the Realtime-StateChart: RootovertakeeDriverRTSC */
				,
						ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_S1_STATE /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_S1_STATE of the Realtime-StateChart: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_velocityGetterPortRTSC_velocityGetterPortRTSC */ 
				,		ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_S2_STATE /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_S2_STATE of the Realtime-StateChart: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_velocityGetterPortRTSC_velocityGetterPortRTSC */
				,
						ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_S2_STATE_STATECHART_STATECHART_FAST_STATE /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_S2_STATE_STATECHART_STATECHART_FAST_STATE of the Realtime-StateChart: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_S2_STATE_statechart_statechart */ 
				,		ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_S2_STATE_STATECHART_STATECHART_SLOW_STATE /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_S2_STATE_STATECHART_STATECHART_SLOW_STATE of the Realtime-StateChart: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_S2_STATE_statechart_statechart */ 
				,		ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVINGRTSC_OVERTAKEEDRIVINGRTSC_DRIVE_STATE /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVINGRTSC_OVERTAKEEDRIVINGRTSC_DRIVE_STATE of the Realtime-StateChart: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDrivingRTSC_overtakeeDrivingRTSC */ 
				,		ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVINGRTSC_OVERTAKEEDRIVINGRTSC_BREAKNOW_STATE /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVINGRTSC_OVERTAKEEDRIVINGRTSC_BREAKNOW_STATE of the Realtime-StateChart: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDrivingRTSC_overtakeeDrivingRTSC */ 
				,		ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE of the Realtime-StateChart: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityL_behavior_overtakeeDriver_velocityL_behavior */
				,
						ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE of the Realtime-StateChart: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE of the Realtime-StateChart: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityR_behavior_overtakeeDriver_velocityR_behavior */
				,
						ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE of the Realtime-StateChart: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE of the Realtime-StateChart: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_lineOvertakee_behavior_overtakeeDriver_lineOvertakee_behavior */
				,
						ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE of the Realtime-StateChart: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE of the Realtime-StateChart: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE of the Realtime-StateChart: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_distanceOvertakee_behavior_overtakeeDriver_distanceOvertakee_behavior */
				,
						ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE of the Realtime-StateChart: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE of the Realtime-StateChart: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */	 
		}RootovertakeeDriverRTSCState;
	
	
		/**
		 * 
		 * @brief Description of the Realtime-StateChart: RootovertakeeDriverRTSC
		 * @details This struct represents the  Realtime-StateChart: RootovertakeeDriverRTSC and its States
		 */
	struct RootovertakeeDriverRTSCStateChart {	
			OvertakeeDriverComponent * parentComponent; /**< A pointer to the parent ComponentInstance of Type: OvertakeeDriverComponent , which has this Realtime-StateChart as its behavior */			
	
	
			RootovertakeeDriverRTSCState currentStateOfRootovertakeeDriverRTSC; /**< The current State of the Realtime-StateChart: RootovertakeeDriverRTSC */
	
				RootovertakeeDriverRTSCState currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_velocityGetterPortRTSC_velocityGetterPortRTSC; /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_velocityGetterPortRTSC of the Realtime-StateChart: RootovertakeeDriverRTSC */
				RootovertakeeDriverRTSCState currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_S2_STATE_statechart_statechart; /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_S2_STATE_statechart of the Realtime-StateChart: RootovertakeeDriverRTSC */
				RootovertakeeDriverRTSCState currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDrivingRTSC_overtakeeDrivingRTSC; /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDrivingRTSC of the Realtime-StateChart: RootovertakeeDriverRTSC */
				RootovertakeeDriverRTSCState currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityL_behavior_overtakeeDriver_velocityL_behavior; /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityL_behavior of the Realtime-StateChart: RootovertakeeDriverRTSC */
				RootovertakeeDriverRTSCState currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootovertakeeDriverRTSC */
				RootovertakeeDriverRTSCState currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityR_behavior_overtakeeDriver_velocityR_behavior; /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityR_behavior of the Realtime-StateChart: RootovertakeeDriverRTSC */
				RootovertakeeDriverRTSCState currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootovertakeeDriverRTSC */
				RootovertakeeDriverRTSCState currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_lineOvertakee_behavior_overtakeeDriver_lineOvertakee_behavior; /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_lineOvertakee_behavior of the Realtime-StateChart: RootovertakeeDriverRTSC */
				RootovertakeeDriverRTSCState currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootovertakeeDriverRTSC */
				RootovertakeeDriverRTSCState currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_distanceOvertakee_behavior_overtakeeDriver_distanceOvertakee_behavior; /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_distanceOvertakee_behavior of the Realtime-StateChart: RootovertakeeDriverRTSC */
				RootovertakeeDriverRTSCState currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootovertakeeDriverRTSC */
			
		
				Clock clockSending_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: clockSending_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
				Clock clockSending_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: clockSending_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
				Clock receiverTimeout_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: ReceiverTimeout_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
				Clock receiverTimeout_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: ReceiverTimeout_ofcurrentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
		
			
		
		
	
			
				int Vel; /**< The Realtime-StateChart Variable: Vel of Type: INT */
				int constVelFast; /**< The Realtime-StateChart Variable: constVelFast of Type: INT */
				int constVelSlow; /**< The Realtime-StateChart Variable: constVelSlow of Type: INT */
				int constBreakDistance; /**< The Realtime-StateChart Variable: constBreakDistance of Type: INT */
				int velocityL_apiValue; /**< The Realtime-StateChart Variable: velocityL_apiValue of Type: INT */
				int velocityR_apiValue; /**< The Realtime-StateChart Variable: velocityR_apiValue of Type: INT */
				int lineOvertakee_apiValue; /**< The Realtime-StateChart Variable: lineOvertakee_apiValue of Type: INT */
				int distanceOvertakee_apiValue; /**< The Realtime-StateChart Variable: distanceOvertakee_apiValue of Type: INT */
		
	
	
	
		} ;

//METHOD STUBS
	/**
	 * @brief Creates an Instance of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details Allocates Memory for the struct RootovertakeeDriverRTSCStateChart
	 * 
	 * @param parentComponent An Instance of the Component: OvertakeeDriverComponent which behavior is described via this Realtime-StateChart
	 * @return A Pointer to the new created RootovertakeeDriverRTSCStateChart
	 */
		RootovertakeeDriverRTSCStateChart* RootovertakeeDriverRTSCStateChart_create(OvertakeeDriverComponent* parentComponent);
	/**
	 * @brief Initializes an Instance of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details All struct members of the struct RootovertakeeDriverRTSCStateChart are initialized,
	 *			and all Regions of the Realtime-StateChart are initialized, too.
	 * 
	 * @param rtsc The specific RootovertakeeDriverRTSCStateChart to be initialized
	 */
		void RootovertakeeDriverRTSCStateChart_initialize(RootovertakeeDriverRTSCStateChart* rtsc);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_velocityGetterPortRTSC of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details The Member RootovertakeeDriverRTSCStateChart::currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_velocityGetterPortRTSC_velocityGetterPortRTSC is initialized
	 * 
	 * @param stateChart The specific RootovertakeeDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_velocityGetterPortRTSCRegion(RootovertakeeDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_S2_STATE_statechart of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details The Member RootovertakeeDriverRTSCStateChart::currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_S2_STATE_statechart_statechart is initialized
	 * 
	 * @param stateChart The specific RootovertakeeDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_S2_STATE_statechartRegion(RootovertakeeDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDrivingRTSC of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details The Member RootovertakeeDriverRTSCStateChart::currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDrivingRTSC_overtakeeDrivingRTSC is initialized
	 * 
	 * @param stateChart The specific RootovertakeeDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDrivingRTSCRegion(RootovertakeeDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityL_behavior of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details The Member RootovertakeeDriverRTSCStateChart::currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityL_behavior_overtakeeDriver_velocityL_behavior is initialized
	 * 
	 * @param stateChart The specific RootovertakeeDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityL_behaviorRegion(RootovertakeeDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details The Member RootovertakeeDriverRTSCStateChart::currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootovertakeeDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmissionRegion(RootovertakeeDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityR_behavior of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details The Member RootovertakeeDriverRTSCStateChart::currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityR_behavior_overtakeeDriver_velocityR_behavior is initialized
	 * 
	 * @param stateChart The specific RootovertakeeDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityR_behaviorRegion(RootovertakeeDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details The Member RootovertakeeDriverRTSCStateChart::currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootovertakeeDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmissionRegion(RootovertakeeDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_lineOvertakee_behavior of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details The Member RootovertakeeDriverRTSCStateChart::currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_lineOvertakee_behavior_overtakeeDriver_lineOvertakee_behavior is initialized
	 * 
	 * @param stateChart The specific RootovertakeeDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_lineOvertakee_behaviorRegion(RootovertakeeDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details The Member RootovertakeeDriverRTSCStateChart::currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootovertakeeDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmissionRegion(RootovertakeeDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_distanceOvertakee_behavior of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details The Member RootovertakeeDriverRTSCStateChart::currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_distanceOvertakee_behavior_overtakeeDriver_distanceOvertakee_behavior is initialized
	 * 
	 * @param stateChart The specific RootovertakeeDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_distanceOvertakee_behaviorRegion(RootovertakeeDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details The Member RootovertakeeDriverRTSCStateChart::currentStateOfROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootovertakeeDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmissionRegion(RootovertakeeDriverRTSCStateChart* stateChart);
	/**
	 * @brief Destroys the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details Frees the Memory for the struct RootovertakeeDriverRTSCStateChart
	 * 
	 * @param rtsc The specific RootovertakeeDriverRTSCStateChart to be destroyed
	 */	
		void RootovertakeeDriverRTSCStateChart_destroy(RootovertakeeDriverRTSCStateChart* rtsc);		
	/**
	 * @brief Executes the next Step of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * 
	 * @param rtsc The specific RootovertakeeDriverRTSCStateChart to be executed
	 */	
	void RootovertakeeDriverRTSCStateChart_processStep(RootovertakeeDriverRTSCStateChart* rtsc);

	/**
	 * @brief Leaves the Region: overtakeeDriver_velocityL_behavior of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details This method is called, whenever a the Region: overtakeeDriver_velocityL_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakeeDriverRTSCStateChart whose Region: overtakeeDriver_velocityL_behavior shall be exit
	 */
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityL_behavior_overtakeeDriver_velocityL_behaviorStateChart_exit(RootovertakeeDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakeeDriverRTSCStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_LINEOVERTAKEE_BEHAVIOR_LINEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootovertakeeDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: statechart of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details This method is called, whenever a the Region: statechart is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakeeDriverRTSCStateChart whose Region: statechart shall be exit
	 */
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_VELOCITYGETTERPORTRTSC_VELOCITYGETTERPORTRTSC_S2_STATE_statechart_statechartStateChart_exit(RootovertakeeDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakeeDriverRTSCStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootovertakeeDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakeeDriverRTSCStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_OVERTAKEEDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootovertakeeDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: overtakeeDrivingRTSC of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details This method is called, whenever a the Region: overtakeeDrivingRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakeeDriverRTSCStateChart whose Region: overtakeeDrivingRTSC shall be exit
	 */
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDrivingRTSC_overtakeeDrivingRTSCStateChart_exit(RootovertakeeDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: overtakeeDriver_distanceOvertakee_behavior of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details This method is called, whenever a the Region: overtakeeDriver_distanceOvertakee_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakeeDriverRTSCStateChart whose Region: overtakeeDriver_distanceOvertakee_behavior shall be exit
	 */
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_distanceOvertakee_behavior_overtakeeDriver_distanceOvertakee_behaviorStateChart_exit(RootovertakeeDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: velocityGetterPortRTSC of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details This method is called, whenever a the Region: velocityGetterPortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakeeDriverRTSCStateChart whose Region: velocityGetterPortRTSC shall be exit
	 */
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_velocityGetterPortRTSC_velocityGetterPortRTSCStateChart_exit(RootovertakeeDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: overtakeeDriver_velocityR_behavior of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details This method is called, whenever a the Region: overtakeeDriver_velocityR_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakeeDriverRTSCStateChart whose Region: overtakeeDriver_velocityR_behavior shall be exit
	 */
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_velocityR_behavior_overtakeeDriver_velocityR_behaviorStateChart_exit(RootovertakeeDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: overtakeeDriver_lineOvertakee_behavior of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details This method is called, whenever a the Region: overtakeeDriver_lineOvertakee_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakeeDriverRTSCStateChart whose Region: overtakeeDriver_lineOvertakee_behavior shall be exit
	 */
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_overtakeeDriver_lineOvertakee_behavior_overtakeeDriver_lineOvertakee_behaviorStateChart_exit(RootovertakeeDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootovertakeeDriverRTSC
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakeeDriverRTSCStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTOVERTAKEEDRIVERRTSC_INIT_STATE_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_OVERTAKEEDRIVER_DISTANCEOVERTAKEE_BEHAVIOR_DISTANCEOVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootovertakeeDriverRTSCStateChart* rtsc);
			
	/**
	 * @brief Returns wether the Realtime-StateChart: RootovertakeeDriverRTSC is in a specific State
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootovertakeeDriverRTSCStateChart
	 * @param state One of the States of the Enum: RootovertakeeDriverRTSCState
	 * 
	 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
	 * @todo  Why is this int and not bool, like everywhere else
	 */	
		int RootovertakeeDriverRTSCStateChart_isInState(RootovertakeeDriverRTSCStateChart* rtsc, RootovertakeeDriverRTSCState state);
	/**
	 * @brief Checks if the execution of the Realtime-StateChart: RootovertakeeDriverRTSC  is terminated
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootovertakeeDriverRTSCStateChart
	 * @return Always True
	 * @todo  always true is returned
	 */	
	bool RootovertakeeDriverRTSCStateChart_isTerminated(RootovertakeeDriverRTSCStateChart* rtsc);

#endif /* ROOTOVERTAKEEDRIVERRTSCSTATECHART_H_ */
