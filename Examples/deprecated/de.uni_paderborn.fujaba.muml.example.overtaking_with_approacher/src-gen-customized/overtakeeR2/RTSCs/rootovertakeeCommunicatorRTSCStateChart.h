/**
 * @file 
 * @author generated
 * @brief Specification of Realtime-StateChart: RootovertakeeCommunicatorRTSC
 * @details This files contains the description of the Realtime-StateChart: RootovertakeeCommunicatorRTSC and its behavior which is executed
 */

#ifndef ROOTOVERTAKEECOMMUNICATORRTSCSTATECHART_H_
#define ROOTOVERTAKEECOMMUNICATORRTSCSTATECHART_H_

#include "../lib/clock.h"
#include "../lib/syncChannel.h"
#include "../lib/MiddlewareTypes.h"
#include "../Middleware/MiddlewareCore.h"
#include "../components/overtakeeCommunicatorComponent.h"
//ENUM
	/** 
	 * @brief This enum represents the States of the Realtime-StateChart: RootovertakeeCommunicatorRTSC
	 */
		typedef enum {
				ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE /**< Represents the State: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE of the Realtime-StateChart: RootovertakeeCommunicatorRTSC */
				,
						ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEEPORTRTSC_OVERTAKEEPORTRTSC_INIT_STATE /**< Represents the State: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEEPORTRTSC_OVERTAKEEPORTRTSC_INIT_STATE of the Realtime-StateChart: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSC_overtakeePortRTSC */ 
				,		ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEEPORTRTSC_OVERTAKEEPORTRTSC_REQUESTED_STATE /**< Represents the State: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEEPORTRTSC_OVERTAKEEPORTRTSC_REQUESTED_STATE of the Realtime-StateChart: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSC_overtakeePortRTSC */ 
				,		ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEEPORTRTSC_OVERTAKEEPORTRTSC_OVERTAKING_STATE /**< Represents the State: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEEPORTRTSC_OVERTAKEEPORTRTSC_OVERTAKING_STATE of the Realtime-StateChart: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSC_overtakeePortRTSC */ 
				,		ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKEEPORTRTSC_VEHICLEOVERTAKEEPORTRTSC_INIT_STATE /**< Represents the State: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKEEPORTRTSC_VEHICLEOVERTAKEEPORTRTSC_INIT_STATE of the Realtime-StateChart: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_vehicleOvertakeePortRTSC_vehicleOvertakeePortRTSC */ 
				,		ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKEEPORTRTSC_VEHICLEOVERTAKEEPORTRTSC_CHANGEDSECTION_STATE /**< Represents the State: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VEHICLEOVERTAKEEPORTRTSC_VEHICLEOVERTAKEEPORTRTSC_CHANGEDSECTION_STATE of the Realtime-StateChart: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_vehicleOvertakeePortRTSC_vehicleOvertakeePortRTSC */ 
				,		ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE /**< Represents the State: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE of the Realtime-StateChart: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_velocitySetterPortRTSC_velocitySetterPortRTSC */
				,
						ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_CHANGINGMODERTSC_CHANGINGMODERTSC_SLOW_STATE /**< Represents the State: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_CHANGINGMODERTSC_CHANGINGMODERTSC_SLOW_STATE of the Realtime-StateChart: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_changingModeRTSC_changingModeRTSC */ 
				,		ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_CHANGINGMODERTSC_CHANGINGMODERTSC_FAST_STATE /**< Represents the State: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_CHANGINGMODERTSC_CHANGINGMODERTSC_FAST_STATE of the Realtime-StateChart: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_changingModeRTSC_changingModeRTSC */ 
				,		ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_FIXEDMODE_STATE /**< Represents the State: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_FIXEDMODE_STATE of the Realtime-StateChart: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_velocitySetterPortRTSC_velocitySetterPortRTSC */ 
				,		ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_INFORMOVERTAKEEPORTRTSC_INFORMOVERTAKEEPORTRTSC_INIT_STATE /**< Represents the State: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_INFORMOVERTAKEEPORTRTSC_INFORMOVERTAKEEPORTRTSC_INIT_STATE of the Realtime-StateChart: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_informOvertakeePortRTSC_informOvertakeePortRTSC */ 
				,		ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_INFORMOVERTAKEEPORTRTSC_INFORMOVERTAKEEPORTRTSC_OVERTAKING_STATE /**< Represents the State: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_INFORMOVERTAKEEPORTRTSC_INFORMOVERTAKEEPORTRTSC_OVERTAKING_STATE of the Realtime-StateChart: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_informOvertakeePortRTSC_informOvertakeePortRTSC */ 
				,		ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE /**< Represents the State: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE of the Realtime-StateChart: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeeCommunicator_colorOvertakee_behavior_overtakeeCommunicator_colorOvertakee_behavior */
				,
						ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE /**< Represents the State: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE of the Realtime-StateChart: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE /**< Represents the State: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE of the Realtime-StateChart: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */	 
		}RootovertakeeCommunicatorRTSCState;
	
	
		/**
		 * 
		 * @brief Description of the Realtime-StateChart: RootovertakeeCommunicatorRTSC
		 * @details This struct represents the  Realtime-StateChart: RootovertakeeCommunicatorRTSC and its States
		 */
	struct RootovertakeeCommunicatorRTSCStateChart {	
			OvertakeeCommunicatorComponent * parentComponent; /**< A pointer to the parent ComponentInstance of Type: OvertakeeCommunicatorComponent , which has this Realtime-StateChart as its behavior */			
	
	
			RootovertakeeCommunicatorRTSCState currentStateOfRootovertakeeCommunicatorRTSC; /**< The current State of the Realtime-StateChart: RootovertakeeCommunicatorRTSC */
	
				RootovertakeeCommunicatorRTSCState currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSC_overtakeePortRTSC; /**< Represents the State: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSC of the Realtime-StateChart: RootovertakeeCommunicatorRTSC */
				RootovertakeeCommunicatorRTSCState currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_vehicleOvertakeePortRTSC_vehicleOvertakeePortRTSC; /**< Represents the State: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_vehicleOvertakeePortRTSC of the Realtime-StateChart: RootovertakeeCommunicatorRTSC */
				RootovertakeeCommunicatorRTSCState currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_velocitySetterPortRTSC_velocitySetterPortRTSC; /**< Represents the State: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_velocitySetterPortRTSC of the Realtime-StateChart: RootovertakeeCommunicatorRTSC */
				RootovertakeeCommunicatorRTSCState currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_changingModeRTSC_changingModeRTSC; /**< Represents the State: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_changingModeRTSC of the Realtime-StateChart: RootovertakeeCommunicatorRTSC */
				RootovertakeeCommunicatorRTSCState currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_informOvertakeePortRTSC_informOvertakeePortRTSC; /**< Represents the State: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_informOvertakeePortRTSC of the Realtime-StateChart: RootovertakeeCommunicatorRTSC */
				RootovertakeeCommunicatorRTSCState currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeeCommunicator_colorOvertakee_behavior_overtakeeCommunicator_colorOvertakee_behavior; /**< Represents the State: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeeCommunicator_colorOvertakee_behavior of the Realtime-StateChart: RootovertakeeCommunicatorRTSC */
				RootovertakeeCommunicatorRTSCState currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootovertakeeCommunicatorRTSC */
			
		
				Clock receiverTimeout_ofcurrentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: ReceiverTimeout_ofcurrentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
				Clock changeClock_ofcurrentStateOfRootovertakeeCommunicatorRTSCClock; /**< The Clock: changeClock_ofcurrentStateOfRootovertakeeCommunicatorRTSC */
		
			
		
		
	
			
				int constChangeModeInterval; /**< The Realtime-StateChart Variable: constChangeModeInterval of Type: INT */
				int constVelFast; /**< The Realtime-StateChart Variable: constVelFast of Type: INT */
				int constVelSlow; /**< The Realtime-StateChart Variable: constVelSlow of Type: INT */
				int Vel; /**< The Realtime-StateChart Variable: Vel of Type: INT */
				bool change; /**< The Realtime-StateChart Variable: change of Type: BOOLEAN */
				int secID; /**< The Realtime-StateChart Variable: secID of Type: INT */
				int constSecRed; /**< The Realtime-StateChart Variable: constSecRed of Type: INT */
				int constSecGreen; /**< The Realtime-StateChart Variable: constSecGreen of Type: INT */
				int constSecBlue; /**< The Realtime-StateChart Variable: constSecBlue of Type: INT */
				int constSecYellow; /**< The Realtime-StateChart Variable: constSecYellow of Type: INT */
				int constSecOrange; /**< The Realtime-StateChart Variable: constSecOrange of Type: INT */
				int currentSec; /**< The Realtime-StateChart Variable: currentSec of Type: INT */
				int colorOvertakee_apiValue; /**< The Realtime-StateChart Variable: colorOvertakee_apiValue of Type: INT */
		
	
	
				SyncChannel* informStartSyncChannel; /**< The Realtime-StateChart's Synchronization Channel: informStart */
				SyncChannel* informFinishSyncChannel; /**< The Realtime-StateChart's Synchronization Channel: informFinish */
	
		} ;

//METHOD STUBS
	/**
	 * @brief Creates an Instance of the Realtime-StateChart: RootovertakeeCommunicatorRTSC
	 * @details Allocates Memory for the struct RootovertakeeCommunicatorRTSCStateChart
	 * 
	 * @param parentComponent An Instance of the Component: OvertakeeCommunicatorComponent which behavior is described via this Realtime-StateChart
	 * @return A Pointer to the new created RootovertakeeCommunicatorRTSCStateChart
	 */
		RootovertakeeCommunicatorRTSCStateChart* RootovertakeeCommunicatorRTSCStateChart_create(OvertakeeCommunicatorComponent* parentComponent);
	/**
	 * @brief Initializes an Instance of the Realtime-StateChart: RootovertakeeCommunicatorRTSC
	 * @details All struct members of the struct RootovertakeeCommunicatorRTSCStateChart are initialized,
	 *			and all Regions of the Realtime-StateChart are initialized, too.
	 * 
	 * @param rtsc The specific RootovertakeeCommunicatorRTSCStateChart to be initialized
	 */
		void RootovertakeeCommunicatorRTSCStateChart_initialize(RootovertakeeCommunicatorRTSCStateChart* rtsc);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSC of the Realtime-StateChart: RootovertakeeCommunicatorRTSC
	 * @details The Member RootovertakeeCommunicatorRTSCStateChart::currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSC_overtakeePortRTSC is initialized
	 * 
	 * @param stateChart The specific RootovertakeeCommunicatorRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSCRegion(RootovertakeeCommunicatorRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_vehicleOvertakeePortRTSC of the Realtime-StateChart: RootovertakeeCommunicatorRTSC
	 * @details The Member RootovertakeeCommunicatorRTSCStateChart::currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_vehicleOvertakeePortRTSC_vehicleOvertakeePortRTSC is initialized
	 * 
	 * @param stateChart The specific RootovertakeeCommunicatorRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_vehicleOvertakeePortRTSCRegion(RootovertakeeCommunicatorRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_velocitySetterPortRTSC of the Realtime-StateChart: RootovertakeeCommunicatorRTSC
	 * @details The Member RootovertakeeCommunicatorRTSCStateChart::currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_velocitySetterPortRTSC_velocitySetterPortRTSC is initialized
	 * 
	 * @param stateChart The specific RootovertakeeCommunicatorRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_velocitySetterPortRTSCRegion(RootovertakeeCommunicatorRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_changingModeRTSC of the Realtime-StateChart: RootovertakeeCommunicatorRTSC
	 * @details The Member RootovertakeeCommunicatorRTSCStateChart::currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_changingModeRTSC_changingModeRTSC is initialized
	 * 
	 * @param stateChart The specific RootovertakeeCommunicatorRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_changingModeRTSCRegion(RootovertakeeCommunicatorRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_informOvertakeePortRTSC of the Realtime-StateChart: RootovertakeeCommunicatorRTSC
	 * @details The Member RootovertakeeCommunicatorRTSCStateChart::currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_informOvertakeePortRTSC_informOvertakeePortRTSC is initialized
	 * 
	 * @param stateChart The specific RootovertakeeCommunicatorRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_informOvertakeePortRTSCRegion(RootovertakeeCommunicatorRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeeCommunicator_colorOvertakee_behavior of the Realtime-StateChart: RootovertakeeCommunicatorRTSC
	 * @details The Member RootovertakeeCommunicatorRTSCStateChart::currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeeCommunicator_colorOvertakee_behavior_overtakeeCommunicator_colorOvertakee_behavior is initialized
	 * 
	 * @param stateChart The specific RootovertakeeCommunicatorRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeeCommunicator_colorOvertakee_behaviorRegion(RootovertakeeCommunicatorRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootovertakeeCommunicatorRTSC
	 * @details The Member RootovertakeeCommunicatorRTSCStateChart::currentStateOfROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootovertakeeCommunicatorRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmissionRegion(RootovertakeeCommunicatorRTSCStateChart* stateChart);
	/**
	 * @brief Destroys the Realtime-StateChart: RootovertakeeCommunicatorRTSC
	 * @details Frees the Memory for the struct RootovertakeeCommunicatorRTSCStateChart
	 * 
	 * @param rtsc The specific RootovertakeeCommunicatorRTSCStateChart to be destroyed
	 */	
		void RootovertakeeCommunicatorRTSCStateChart_destroy(RootovertakeeCommunicatorRTSCStateChart* rtsc);		
	/**
	 * @brief Executes the next Step of the Realtime-StateChart: RootovertakeeCommunicatorRTSC
	 * 
	 * @param rtsc The specific RootovertakeeCommunicatorRTSCStateChart to be executed
	 */	
	void RootovertakeeCommunicatorRTSCStateChart_processStep(RootovertakeeCommunicatorRTSCStateChart* rtsc);

	/**
	 * @brief Leaves the Region: changingModeRTSC of the Realtime-StateChart: RootovertakeeCommunicatorRTSC
	 * @details This method is called, whenever a the Region: changingModeRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakeeCommunicatorRTSCStateChart whose Region: changingModeRTSC shall be exit
	 */
		void ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_VELOCITYSETTERPORTRTSC_VELOCITYSETTERPORTRTSC_CHANGINGMODE_STATE_changingModeRTSC_changingModeRTSCStateChart_exit(RootovertakeeCommunicatorRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: vehicleOvertakeePortRTSC of the Realtime-StateChart: RootovertakeeCommunicatorRTSC
	 * @details This method is called, whenever a the Region: vehicleOvertakeePortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakeeCommunicatorRTSCStateChart whose Region: vehicleOvertakeePortRTSC shall be exit
	 */
		void ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_vehicleOvertakeePortRTSC_vehicleOvertakeePortRTSCStateChart_exit(RootovertakeeCommunicatorRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: overtakeeCommunicator_colorOvertakee_behavior of the Realtime-StateChart: RootovertakeeCommunicatorRTSC
	 * @details This method is called, whenever a the Region: overtakeeCommunicator_colorOvertakee_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakeeCommunicatorRTSCStateChart whose Region: overtakeeCommunicator_colorOvertakee_behavior shall be exit
	 */
		void ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeeCommunicator_colorOvertakee_behavior_overtakeeCommunicator_colorOvertakee_behaviorStateChart_exit(RootovertakeeCommunicatorRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootovertakeeCommunicatorRTSC
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakeeCommunicatorRTSCStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_OVERTAKEECOMMUNICATOR_COLOROVERTAKEE_BEHAVIOR_COLOROVERTAKEE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootovertakeeCommunicatorRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: overtakeePortRTSC of the Realtime-StateChart: RootovertakeeCommunicatorRTSC
	 * @details This method is called, whenever a the Region: overtakeePortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakeeCommunicatorRTSCStateChart whose Region: overtakeePortRTSC shall be exit
	 */
		void ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_overtakeePortRTSC_overtakeePortRTSCStateChart_exit(RootovertakeeCommunicatorRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: velocitySetterPortRTSC of the Realtime-StateChart: RootovertakeeCommunicatorRTSC
	 * @details This method is called, whenever a the Region: velocitySetterPortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakeeCommunicatorRTSCStateChart whose Region: velocitySetterPortRTSC shall be exit
	 */
		void ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_velocitySetterPortRTSC_velocitySetterPortRTSCStateChart_exit(RootovertakeeCommunicatorRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: informOvertakeePortRTSC of the Realtime-StateChart: RootovertakeeCommunicatorRTSC
	 * @details This method is called, whenever a the Region: informOvertakeePortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootovertakeeCommunicatorRTSCStateChart whose Region: informOvertakeePortRTSC shall be exit
	 */
		void ROOTOVERTAKEECOMMUNICATORRTSC_INIT_STATE_informOvertakeePortRTSC_informOvertakeePortRTSCStateChart_exit(RootovertakeeCommunicatorRTSCStateChart* rtsc);
			
	/**
	 * @brief Returns wether the Realtime-StateChart: RootovertakeeCommunicatorRTSC is in a specific State
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootovertakeeCommunicatorRTSCStateChart
	 * @param state One of the States of the Enum: RootovertakeeCommunicatorRTSCState
	 * 
	 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
	 * @todo  Why is this int and not bool, like everywhere else
	 */	
		int RootovertakeeCommunicatorRTSCStateChart_isInState(RootovertakeeCommunicatorRTSCStateChart* rtsc, RootovertakeeCommunicatorRTSCState state);
	/**
	 * @brief Checks if the execution of the Realtime-StateChart: RootovertakeeCommunicatorRTSC  is terminated
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootovertakeeCommunicatorRTSCStateChart
	 * @return Always True
	 * @todo  always true is returned
	 */	
	bool RootovertakeeCommunicatorRTSCStateChart_isTerminated(RootovertakeeCommunicatorRTSCStateChart* rtsc);

#endif /* ROOTOVERTAKEECOMMUNICATORRTSCSTATECHART_H_ */
