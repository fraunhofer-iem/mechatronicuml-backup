/**
 * @file 
 * @author generated
 * @brief Specification of Realtime-StateChart: RootapproacherCommunicatorRTSC
 * @details This files contains the description of the Realtime-StateChart: RootapproacherCommunicatorRTSC and its behavior which is executed
 */

#ifndef ROOTAPPROACHERCOMMUNICATORRTSCSTATECHART_H_
#define ROOTAPPROACHERCOMMUNICATORRTSCSTATECHART_H_

#include "../lib/clock.h"
#include "../lib/syncChannel.h"
#include "../lib/MiddlewareTypes.h"
#include "../Middleware/MiddlewareCore.h"
#include "../components/approacherCommunicatorComponent.h"
//ENUM
	/** 
	 * @brief This enum represents the States of the Realtime-StateChart: RootapproacherCommunicatorRTSC
	 */
		typedef enum {
				ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE /**< Represents the State: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE of the Realtime-StateChart: RootapproacherCommunicatorRTSC */
				,
						ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_VEHICLEAPPROACHERPORTRTSC_VEHICLEAPPROACHERPORTRTSC_INIT_STATE /**< Represents the State: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_VEHICLEAPPROACHERPORTRTSC_VEHICLEAPPROACHERPORTRTSC_INIT_STATE of the Realtime-StateChart: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_vehicleApproacherPortRTSC_vehicleApproacherPortRTSC */ 
				,		ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_VEHICLEAPPROACHERPORTRTSC_VEHICLEAPPROACHERPORTRTSC_CHANGEDSECTION_STATE /**< Represents the State: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_VEHICLEAPPROACHERPORTRTSC_VEHICLEAPPROACHERPORTRTSC_CHANGEDSECTION_STATE of the Realtime-StateChart: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_vehicleApproacherPortRTSC_vehicleApproacherPortRTSC */ 
				,		ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_LIMITDRIVINGPORTRTSC_LIMITDRIVINGPORTRTSC_FREE_STATE /**< Represents the State: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_LIMITDRIVINGPORTRTSC_LIMITDRIVINGPORTRTSC_FREE_STATE of the Realtime-StateChart: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_limitDrivingPortRTSC_limitDrivingPortRTSC */ 
				,		ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_LIMITDRIVINGPORTRTSC_LIMITDRIVINGPORTRTSC_FIX_STATE /**< Represents the State: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_LIMITDRIVINGPORTRTSC_LIMITDRIVINGPORTRTSC_FIX_STATE of the Realtime-StateChart: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_limitDrivingPortRTSC_limitDrivingPortRTSC */ 
				,		ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_INFORMAPPROACHERPORTRTSC_INFORMAPPROACHERPORTRTSC_FREEDRIVE_STATE /**< Represents the State: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_INFORMAPPROACHERPORTRTSC_INFORMAPPROACHERPORTRTSC_FREEDRIVE_STATE of the Realtime-StateChart: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_informApproacherPortRTSC_informApproacherPortRTSC */ 
				,		ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_INFORMAPPROACHERPORTRTSC_INFORMAPPROACHERPORTRTSC_FIXDRIVE_STATE /**< Represents the State: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_INFORMAPPROACHERPORTRTSC_INFORMAPPROACHERPORTRTSC_FIXDRIVE_STATE of the Realtime-StateChart: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_informApproacherPortRTSC_informApproacherPortRTSC */ 
				,		ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE /**< Represents the State: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE of the Realtime-StateChart: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_approacherCommunicator_colorApproacher_behavior_approacherCommunicator_colorApproacher_behavior */
				,
						ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE /**< Represents the State: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE of the Realtime-StateChart: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE /**< Represents the State: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE of the Realtime-StateChart: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */	 
		}RootapproacherCommunicatorRTSCState;
	
	
		/**
		 * 
		 * @brief Description of the Realtime-StateChart: RootapproacherCommunicatorRTSC
		 * @details This struct represents the  Realtime-StateChart: RootapproacherCommunicatorRTSC and its States
		 */
	struct RootapproacherCommunicatorRTSCStateChart {	
			ApproacherCommunicatorComponent * parentComponent; /**< A pointer to the parent ComponentInstance of Type: ApproacherCommunicatorComponent , which has this Realtime-StateChart as its behavior */			
	
	
			RootapproacherCommunicatorRTSCState currentStateOfRootapproacherCommunicatorRTSC; /**< The current State of the Realtime-StateChart: RootapproacherCommunicatorRTSC */
	
				RootapproacherCommunicatorRTSCState currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_vehicleApproacherPortRTSC_vehicleApproacherPortRTSC; /**< Represents the State: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_vehicleApproacherPortRTSC of the Realtime-StateChart: RootapproacherCommunicatorRTSC */
				RootapproacherCommunicatorRTSCState currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_limitDrivingPortRTSC_limitDrivingPortRTSC; /**< Represents the State: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_limitDrivingPortRTSC of the Realtime-StateChart: RootapproacherCommunicatorRTSC */
				RootapproacherCommunicatorRTSCState currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_informApproacherPortRTSC_informApproacherPortRTSC; /**< Represents the State: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_informApproacherPortRTSC of the Realtime-StateChart: RootapproacherCommunicatorRTSC */
				RootapproacherCommunicatorRTSCState currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_approacherCommunicator_colorApproacher_behavior_approacherCommunicator_colorApproacher_behavior; /**< Represents the State: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_approacherCommunicator_colorApproacher_behavior of the Realtime-StateChart: RootapproacherCommunicatorRTSC */
				RootapproacherCommunicatorRTSCState currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootapproacherCommunicatorRTSC */
			
		
				Clock receiverTimeout_ofcurrentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: ReceiverTimeout_ofcurrentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
		
			
		
		
	
			
				int constSecRed; /**< The Realtime-StateChart Variable: constSecRed of Type: INT */
				int constSecGreen; /**< The Realtime-StateChart Variable: constSecGreen of Type: INT */
				int constSecBlue; /**< The Realtime-StateChart Variable: constSecBlue of Type: INT */
				int constSecYellow; /**< The Realtime-StateChart Variable: constSecYellow of Type: INT */
				int constSecOrange; /**< The Realtime-StateChart Variable: constSecOrange of Type: INT */
				bool change; /**< The Realtime-StateChart Variable: change of Type: BOOLEAN */
				int secID; /**< The Realtime-StateChart Variable: secID of Type: INT */
				int currentSec; /**< The Realtime-StateChart Variable: currentSec of Type: INT */
				int colorApproacher_apiValue; /**< The Realtime-StateChart Variable: colorApproacher_apiValue of Type: INT */
		
	
	
				SyncChannel* unlimitSyncChannel; /**< The Realtime-StateChart's Synchronization Channel: unlimit */
				SyncChannel* limitSyncChannel; /**< The Realtime-StateChart's Synchronization Channel: limit */
	
		} ;

//METHOD STUBS
	/**
	 * @brief Creates an Instance of the Realtime-StateChart: RootapproacherCommunicatorRTSC
	 * @details Allocates Memory for the struct RootapproacherCommunicatorRTSCStateChart
	 * 
	 * @param parentComponent An Instance of the Component: ApproacherCommunicatorComponent which behavior is described via this Realtime-StateChart
	 * @return A Pointer to the new created RootapproacherCommunicatorRTSCStateChart
	 */
		RootapproacherCommunicatorRTSCStateChart* RootapproacherCommunicatorRTSCStateChart_create(ApproacherCommunicatorComponent* parentComponent);
	/**
	 * @brief Initializes an Instance of the Realtime-StateChart: RootapproacherCommunicatorRTSC
	 * @details All struct members of the struct RootapproacherCommunicatorRTSCStateChart are initialized,
	 *			and all Regions of the Realtime-StateChart are initialized, too.
	 * 
	 * @param rtsc The specific RootapproacherCommunicatorRTSCStateChart to be initialized
	 */
		void RootapproacherCommunicatorRTSCStateChart_initialize(RootapproacherCommunicatorRTSCStateChart* rtsc);
	/**
	 * @brief Initializes the Region: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_vehicleApproacherPortRTSC of the Realtime-StateChart: RootapproacherCommunicatorRTSC
	 * @details The Member RootapproacherCommunicatorRTSCStateChart::currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_vehicleApproacherPortRTSC_vehicleApproacherPortRTSC is initialized
	 * 
	 * @param stateChart The specific RootapproacherCommunicatorRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_vehicleApproacherPortRTSCRegion(RootapproacherCommunicatorRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_limitDrivingPortRTSC of the Realtime-StateChart: RootapproacherCommunicatorRTSC
	 * @details The Member RootapproacherCommunicatorRTSCStateChart::currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_limitDrivingPortRTSC_limitDrivingPortRTSC is initialized
	 * 
	 * @param stateChart The specific RootapproacherCommunicatorRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_limitDrivingPortRTSCRegion(RootapproacherCommunicatorRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_informApproacherPortRTSC of the Realtime-StateChart: RootapproacherCommunicatorRTSC
	 * @details The Member RootapproacherCommunicatorRTSCStateChart::currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_informApproacherPortRTSC_informApproacherPortRTSC is initialized
	 * 
	 * @param stateChart The specific RootapproacherCommunicatorRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_informApproacherPortRTSCRegion(RootapproacherCommunicatorRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_approacherCommunicator_colorApproacher_behavior of the Realtime-StateChart: RootapproacherCommunicatorRTSC
	 * @details The Member RootapproacherCommunicatorRTSCStateChart::currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_approacherCommunicator_colorApproacher_behavior_approacherCommunicator_colorApproacher_behavior is initialized
	 * 
	 * @param stateChart The specific RootapproacherCommunicatorRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_approacherCommunicator_colorApproacher_behaviorRegion(RootapproacherCommunicatorRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootapproacherCommunicatorRTSC
	 * @details The Member RootapproacherCommunicatorRTSCStateChart::currentStateOfROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootapproacherCommunicatorRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmissionRegion(RootapproacherCommunicatorRTSCStateChart* stateChart);
	/**
	 * @brief Destroys the Realtime-StateChart: RootapproacherCommunicatorRTSC
	 * @details Frees the Memory for the struct RootapproacherCommunicatorRTSCStateChart
	 * 
	 * @param rtsc The specific RootapproacherCommunicatorRTSCStateChart to be destroyed
	 */	
		void RootapproacherCommunicatorRTSCStateChart_destroy(RootapproacherCommunicatorRTSCStateChart* rtsc);		
	/**
	 * @brief Executes the next Step of the Realtime-StateChart: RootapproacherCommunicatorRTSC
	 * 
	 * @param rtsc The specific RootapproacherCommunicatorRTSCStateChart to be executed
	 */	
	void RootapproacherCommunicatorRTSCStateChart_processStep(RootapproacherCommunicatorRTSCStateChart* rtsc);

	/**
	 * @brief Leaves the Region: limitDrivingPortRTSC of the Realtime-StateChart: RootapproacherCommunicatorRTSC
	 * @details This method is called, whenever a the Region: limitDrivingPortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootapproacherCommunicatorRTSCStateChart whose Region: limitDrivingPortRTSC shall be exit
	 */
		void ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_limitDrivingPortRTSC_limitDrivingPortRTSCStateChart_exit(RootapproacherCommunicatorRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: approacherCommunicator_colorApproacher_behavior of the Realtime-StateChart: RootapproacherCommunicatorRTSC
	 * @details This method is called, whenever a the Region: approacherCommunicator_colorApproacher_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootapproacherCommunicatorRTSCStateChart whose Region: approacherCommunicator_colorApproacher_behavior shall be exit
	 */
		void ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_approacherCommunicator_colorApproacher_behavior_approacherCommunicator_colorApproacher_behaviorStateChart_exit(RootapproacherCommunicatorRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: informApproacherPortRTSC of the Realtime-StateChart: RootapproacherCommunicatorRTSC
	 * @details This method is called, whenever a the Region: informApproacherPortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootapproacherCommunicatorRTSCStateChart whose Region: informApproacherPortRTSC shall be exit
	 */
		void ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_informApproacherPortRTSC_informApproacherPortRTSCStateChart_exit(RootapproacherCommunicatorRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootapproacherCommunicatorRTSC
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootapproacherCommunicatorRTSCStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_APPROACHERCOMMUNICATOR_COLORAPPROACHER_BEHAVIOR_COLORAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootapproacherCommunicatorRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: vehicleApproacherPortRTSC of the Realtime-StateChart: RootapproacherCommunicatorRTSC
	 * @details This method is called, whenever a the Region: vehicleApproacherPortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootapproacherCommunicatorRTSCStateChart whose Region: vehicleApproacherPortRTSC shall be exit
	 */
		void ROOTAPPROACHERCOMMUNICATORRTSC_INIT_STATE_vehicleApproacherPortRTSC_vehicleApproacherPortRTSCStateChart_exit(RootapproacherCommunicatorRTSCStateChart* rtsc);
			
	/**
	 * @brief Returns wether the Realtime-StateChart: RootapproacherCommunicatorRTSC is in a specific State
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootapproacherCommunicatorRTSCStateChart
	 * @param state One of the States of the Enum: RootapproacherCommunicatorRTSCState
	 * 
	 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
	 * @todo  Why is this int and not bool, like everywhere else
	 */	
		int RootapproacherCommunicatorRTSCStateChart_isInState(RootapproacherCommunicatorRTSCStateChart* rtsc, RootapproacherCommunicatorRTSCState state);
	/**
	 * @brief Checks if the execution of the Realtime-StateChart: RootapproacherCommunicatorRTSC  is terminated
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootapproacherCommunicatorRTSCStateChart
	 * @return Always True
	 * @todo  always true is returned
	 */	
	bool RootapproacherCommunicatorRTSCStateChart_isTerminated(RootapproacherCommunicatorRTSCStateChart* rtsc);

#endif /* ROOTAPPROACHERCOMMUNICATORRTSCSTATECHART_H_ */
