/**
 * @file 
 * @author generated
 * @brief Specification of Realtime-StateChart: RootovertakerDriverRTSC
 * @details This files contains the description of the Realtime-StateChart: RootovertakerDriverRTSC and its behavior which is executed
 */

#ifndef ROOTOVERTAKERDRIVERRTSCSTATECHART_H_
#define ROOTOVERTAKERDRIVERRTSCSTATECHART_H_

#include "../lib/clock.h"
#include "../lib/syncChannel.h"
#include "../lib/MiddlewareTypes.h"
#include "../Middleware/MiddlewareCore.h"
#include "../components/overtakerDriverComponent.h"
//ENUM
	/** 
	 * @brief This enum represents the States of the Realtime-StateChart: RootovertakerDriverRTSC
	 */
		typedef enum {
				ROOTOVERTAKERDRIVERRTSC_INIT_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE of the Realtime-StateChart: RootovertakerDriverRTSC */
				,
						ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_S11_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_S11_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_initiatorPortRTSC_initiatorPortRTSC */ 
				,		ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_S22_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_S22_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_initiatorPortRTSC_initiatorPortRTSC */
				,
						ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_S22_STATE_STATECHART_STATECHART_EXECUTING_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_S22_STATE_STATECHART_STATECHART_EXECUTING_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_S22_STATE_statechart_statechart */ 
				,		ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_S22_STATE_STATECHART_STATECHART_INITIATE_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_S22_STATE_STATECHART_STATECHART_INITIATE_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_S22_STATE_statechart_statechart */ 
				,		ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_S22_STATE_STATECHART_STATECHART_INIT_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_S22_STATE_STATECHART_STATECHART_INIT_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_S22_STATE_statechart_statechart */ 
				,		ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S1_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S1_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSC */ 
				,		ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSC */
				,
						ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_statechart_statechart */
						,
								ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_TURNLEFT_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_TURNLEFT_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE_driveOvertakingRTSC_driveOvertakingRTSC */ 
						,		ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_DRIVETOOPPOSITELINE_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_DRIVETOOPPOSITELINE_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE_driveOvertakingRTSC_driveOvertakingRTSC */ 
						,		ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_FOLLOWOPPOSITELINE_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_FOLLOWOPPOSITELINE_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE_driveOvertakingRTSC_driveOvertakingRTSC */ 
						,		ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_TURNRIGHT_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_TURNRIGHT_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE_driveOvertakingRTSC_driveOvertakingRTSC */ 
						,		ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_DRIVETOMAINLINE_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE_DRIVEOVERTAKINGRTSC_DRIVEOVERTAKINGRTSC_DRIVETOMAINLINE_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE_driveOvertakingRTSC_driveOvertakingRTSC */ 
				,		ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_DRIVE_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_DRIVE_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_statechart_statechart */ 
				,		ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_BREAKNOW_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_BREAKNOW_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_statechart_statechart */ 
				,		ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityR_behavior_overtakerDriver_velocityR_behavior */
				,
						ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityL_behavior_overtakerDriver_velocityL_behavior */
				,
						ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_distance_behavior_overtakerDriver_distance_behavior */
				,
						ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_line_behavior_overtakerDriver_line_behavior */
				,
						ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE of the Realtime-StateChart: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */	 
		}RootovertakerDriverRTSCState;
	
	
		/**
		 * 
		 * @brief Description of the Realtime-StateChart: RootovertakerDriverRTSC
		 * @details This struct represents the  Realtime-StateChart: RootovertakerDriverRTSC and its States
		 */
	struct RootovertakerDriverRTSCStateChart {	
			OvertakerDriverComponent * parentComponent; /**< A pointer to the parent ComponentInstance of Type: OvertakerDriverComponent , which has this Realtime-StateChart as its behavior */			
	
	
			RootovertakerDriverRTSCState currentStateOfRootovertakerDriverRTSC; /**< The current State of the Realtime-StateChart: RootovertakerDriverRTSC */
	
				RootovertakerDriverRTSCState currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_initiatorPortRTSC_initiatorPortRTSC; /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_initiatorPortRTSC of the Realtime-StateChart: RootovertakerDriverRTSC */
				RootovertakerDriverRTSCState currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_S22_STATE_statechart_statechart; /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_S22_STATE_statechart of the Realtime-StateChart: RootovertakerDriverRTSC */
				RootovertakerDriverRTSCState currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSC; /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC of the Realtime-StateChart: RootovertakerDriverRTSC */
				RootovertakerDriverRTSCState currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_statechart_statechart; /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_statechart of the Realtime-StateChart: RootovertakerDriverRTSC */
				RootovertakerDriverRTSCState currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE_driveOvertakingRTSC_driveOvertakingRTSC; /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE_driveOvertakingRTSC of the Realtime-StateChart: RootovertakerDriverRTSC */
				RootovertakerDriverRTSCState currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityR_behavior_overtakerDriver_velocityR_behavior; /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityR_behavior of the Realtime-StateChart: RootovertakerDriverRTSC */
				RootovertakerDriverRTSCState currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootovertakerDriverRTSC */
				RootovertakerDriverRTSCState currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityL_behavior_overtakerDriver_velocityL_behavior; /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityL_behavior of the Realtime-StateChart: RootovertakerDriverRTSC */
				RootovertakerDriverRTSCState currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootovertakerDriverRTSC */
				RootovertakerDriverRTSCState currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_distance_behavior_overtakerDriver_distance_behavior; /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_distance_behavior of the Realtime-StateChart: RootovertakerDriverRTSC */
				RootovertakerDriverRTSCState currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootovertakerDriverRTSC */
				RootovertakerDriverRTSCState currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_line_behavior_overtakerDriver_line_behavior; /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_line_behavior of the Realtime-StateChart: RootovertakerDriverRTSC */
				RootovertakerDriverRTSCState currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootovertakerDriverRTSC */
			
		
				Clock movingClock_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSCClock; /**< The Clock: movingClock_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSC */
				Clock clockSending_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: clockSending_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
				Clock clockSending_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: clockSending_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
				Clock receiverTimeout_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: ReceiverTimeout_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
				Clock receiverTimeout_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: ReceiverTimeout_ofcurrentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
		
			
		
		
	
			
				int constBreakDistance; /**< The Realtime-StateChart Variable: constBreakDistance of Type: INT */
				int constOvertakeDistance; /**< The Realtime-StateChart Variable: constOvertakeDistance of Type: INT */
				int Vel; /**< The Realtime-StateChart Variable: Vel of Type: INT */
				int constVelFast; /**< The Realtime-StateChart Variable: constVelFast of Type: INT */
				int constVelSlow; /**< The Realtime-StateChart Variable: constVelSlow of Type: INT */
				int velocityR_apiValue; /**< The Realtime-StateChart Variable: velocityR_apiValue of Type: INT */
				int velocityL_apiValue; /**< The Realtime-StateChart Variable: velocityL_apiValue of Type: INT */
				int distance_apiValue; /**< The Realtime-StateChart Variable: distance_apiValue of Type: INT */
				int line_apiValue; /**< The Realtime-StateChart Variable: line_apiValue of Type: INT */
				int constTurnLeftTime; /**< The Realtime-StateChart Variable: constTurnLeftTime of Type: INT */
				int constTurnRightTime; /**< The Realtime-StateChart Variable: constTurnRightTime of Type: INT */
				int constToOppositeLineTime; /**< The Realtime-StateChart Variable: constToOppositeLineTime of Type: INT */
				int constToMainLineTime; /**< The Realtime-StateChart Variable: constToMainLineTime of Type: INT */
				int constFollowOppositeLineTime; /**< The Realtime-StateChart Variable: constFollowOppositeLineTime of Type: INT */
				int constOvertakingVelocity; /**< The Realtime-StateChart Variable: constOvertakingVelocity of Type: INT */
		
	
	
				SyncChannel* startOSyncChannel; /**< The Realtime-StateChart's Synchronization Channel: startO */
				SyncChannel* finishOSyncChannel; /**< The Realtime-StateChart's Synchronization Channel: finishO */
				SyncChannel* stopAllSyncChannel; /**< The Realtime-StateChart's Synchronization Channel: stopAll */
				SyncChannel* startAllSyncChannel; /**< The Realtime-StateChart's Synchronization Channel: startAll */
	
		} ;

//METHOD STUBS
	/**
	 * @brief Creates an Instance of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details Allocates Memory for the struct RootovertakerDriverRTSCStateChart
	 * 
	 * @param parentComponent An Instance of the Component: OvertakerDriverComponent which behavior is described via this Realtime-StateChart
	 * @return A Pointer to the new created RootovertakerDriverRTSCStateChart
	 */
		RootovertakerDriverRTSCStateChart* RootovertakerDriverRTSCStateChart_create(OvertakerDriverComponent* parentComponent);
	/**
	 * @brief Initializes an Instance of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details All struct members of the struct RootovertakerDriverRTSCStateChart are initialized,
	 *			and all Regions of the Realtime-StateChart are initialized, too.
	 * 
	 * @param rtsc The specific RootovertakerDriverRTSCStateChart to be initialized
	 */
		void RootovertakerDriverRTSCStateChart_initialize(RootovertakerDriverRTSCStateChart* rtsc);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_initiatorPortRTSC of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details The Member RootovertakerDriverRTSCStateChart::currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_initiatorPortRTSC_initiatorPortRTSC is initialized
	 * 
	 * @param stateChart The specific RootovertakerDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_initiatorPortRTSCRegion(RootovertakerDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_S22_STATE_statechart of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details The Member RootovertakerDriverRTSCStateChart::currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_S22_STATE_statechart_statechart is initialized
	 * 
	 * @param stateChart The specific RootovertakerDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_S22_STATE_statechartRegion(RootovertakerDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details The Member RootovertakerDriverRTSCStateChart::currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSC is initialized
	 * 
	 * @param stateChart The specific RootovertakerDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSCRegion(RootovertakerDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_statechart of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details The Member RootovertakerDriverRTSCStateChart::currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_statechart_statechart is initialized
	 * 
	 * @param stateChart The specific RootovertakerDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_statechartRegion(RootovertakerDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE_driveOvertakingRTSC of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details The Member RootovertakerDriverRTSCStateChart::currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE_driveOvertakingRTSC_driveOvertakingRTSC is initialized
	 * 
	 * @param stateChart The specific RootovertakerDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE_driveOvertakingRTSCRegion(RootovertakerDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityR_behavior of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details The Member RootovertakerDriverRTSCStateChart::currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityR_behavior_overtakerDriver_velocityR_behavior is initialized
	 * 
	 * @param stateChart The specific RootovertakerDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityR_behaviorRegion(RootovertakerDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details The Member RootovertakerDriverRTSCStateChart::currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootovertakerDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmissionRegion(RootovertakerDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityL_behavior of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details The Member RootovertakerDriverRTSCStateChart::currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityL_behavior_overtakerDriver_velocityL_behavior is initialized
	 * 
	 * @param stateChart The specific RootovertakerDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityL_behaviorRegion(RootovertakerDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details The Member RootovertakerDriverRTSCStateChart::currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootovertakerDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmissionRegion(RootovertakerDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_distance_behavior of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details The Member RootovertakerDriverRTSCStateChart::currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_distance_behavior_overtakerDriver_distance_behavior is initialized
	 * 
	 * @param stateChart The specific RootovertakerDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_distance_behaviorRegion(RootovertakerDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details The Member RootovertakerDriverRTSCStateChart::currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootovertakerDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmissionRegion(RootovertakerDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_line_behavior of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details The Member RootovertakerDriverRTSCStateChart::currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_line_behavior_overtakerDriver_line_behavior is initialized
	 * 
	 * @param stateChart The specific RootovertakerDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_line_behaviorRegion(RootovertakerDriverRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details The Member RootovertakerDriverRTSCStateChart::currentStateOfROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootovertakerDriverRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmissionRegion(RootovertakerDriverRTSCStateChart* stateChart);
	/**
	 * @brief Destroys the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details Frees the Memory for the struct RootovertakerDriverRTSCStateChart
	 * 
	 * @param rtsc The specific RootovertakerDriverRTSCStateChart to be destroyed
	 */	
		void RootovertakerDriverRTSCStateChart_destroy(RootovertakerDriverRTSCStateChart* rtsc);		
	/**
	 * @brief Executes the next Step of the Realtime-StateChart: RootovertakerDriverRTSC
	 * 
	 * @param rtsc The specific RootovertakerDriverRTSCStateChart to be executed
	 */	
	void RootovertakerDriverRTSCStateChart_processStep(RootovertakerDriverRTSCStateChart* rtsc);

	/**
	 * @brief Leaves the Region: overtakerDriver_distance_behavior of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details This method is called, whenever a the Region: overtakerDriver_distance_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakerDriverRTSCStateChart whose Region: overtakerDriver_distance_behavior shall be exit
	 */
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_distance_behavior_overtakerDriver_distance_behaviorStateChart_exit(RootovertakerDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: initiatorPortRTSC of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details This method is called, whenever a the Region: initiatorPortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakerDriverRTSCStateChart whose Region: initiatorPortRTSC shall be exit
	 */
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_initiatorPortRTSC_initiatorPortRTSCStateChart_exit(RootovertakerDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakerDriverRTSCStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_OVERTAKERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootovertakerDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: overtakerDrivingRTSC of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details This method is called, whenever a the Region: overtakerDrivingRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakerDriverRTSCStateChart whose Region: overtakerDrivingRTSC shall be exit
	 */
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDrivingRTSC_overtakerDrivingRTSCStateChart_exit(RootovertakerDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: overtakerDriver_velocityR_behavior of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details This method is called, whenever a the Region: overtakerDriver_velocityR_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakerDriverRTSCStateChart whose Region: overtakerDriver_velocityR_behavior shall be exit
	 */
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityR_behavior_overtakerDriver_velocityR_behaviorStateChart_exit(RootovertakerDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: driveOvertakingRTSC of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details This method is called, whenever a the Region: driveOvertakingRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakerDriverRTSCStateChart whose Region: driveOvertakingRTSC shall be exit
	 */
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_STATECHART_STATECHART_OVERTAKE_STATE_driveOvertakingRTSC_driveOvertakingRTSCStateChart_exit(RootovertakerDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: overtakerDriver_velocityL_behavior of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details This method is called, whenever a the Region: overtakerDriver_velocityL_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakerDriverRTSCStateChart whose Region: overtakerDriver_velocityL_behavior shall be exit
	 */
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_velocityL_behavior_overtakerDriver_velocityL_behaviorStateChart_exit(RootovertakerDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: statechart of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details This method is called, whenever a the Region: statechart is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakerDriverRTSCStateChart whose Region: statechart shall be exit
	 */
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_INITIATORPORTRTSC_INITIATORPORTRTSC_S22_STATE_statechart_statechartStateChart_exit(RootovertakerDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: overtakerDriver_line_behavior of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details This method is called, whenever a the Region: overtakerDriver_line_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakerDriverRTSCStateChart whose Region: overtakerDriver_line_behavior shall be exit
	 */
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_overtakerDriver_line_behavior_overtakerDriver_line_behaviorStateChart_exit(RootovertakerDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: statechart of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details This method is called, whenever a the Region: statechart is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakerDriverRTSCStateChart whose Region: statechart shall be exit
	 */
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVINGRTSC_OVERTAKERDRIVINGRTSC_S2_STATE_statechart_statechartStateChart_exit(RootovertakerDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakerDriverRTSCStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_LINE_BEHAVIOR_OVERTAKERDRIVER_LINE_BEHAVIOR_LINE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootovertakerDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakerDriverRTSCStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_OVERTAKERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootovertakerDriverRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootovertakerDriverRTSC
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakerDriverRTSCStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTOVERTAKERDRIVERRTSC_INIT_STATE_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_OVERTAKERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootovertakerDriverRTSCStateChart* rtsc);
			
	/**
	 * @brief Returns wether the Realtime-StateChart: RootovertakerDriverRTSC is in a specific State
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootovertakerDriverRTSCStateChart
	 * @param state One of the States of the Enum: RootovertakerDriverRTSCState
	 * 
	 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
	 * @todo  Why is this int and not bool, like everywhere else
	 */	
		int RootovertakerDriverRTSCStateChart_isInState(RootovertakerDriverRTSCStateChart* rtsc, RootovertakerDriverRTSCState state);
	/**
	 * @brief Checks if the execution of the Realtime-StateChart: RootovertakerDriverRTSC  is terminated
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootovertakerDriverRTSCStateChart
	 * @return Always True
	 * @todo  always true is returned
	 */	
	bool RootovertakerDriverRTSCStateChart_isTerminated(RootovertakerDriverRTSCStateChart* rtsc);

#endif /* ROOTOVERTAKERDRIVERRTSCSTATECHART_H_ */
