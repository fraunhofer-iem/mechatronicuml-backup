/**
 * @file 
 * @author generated
 * @brief Specification of Realtime-StateChart: RootLoadControllerCmpRTSC
 * @details This files contains the description of the Realtime-StateChart: RootLoadControllerCmpRTSC and its behavior which is executed
 */

#ifndef ROOTLOADCONTROLLERCMPRTSCSTATECHART_H_
#define ROOTLOADCONTROLLERCMPRTSCSTATECHART_H_

#include "../lib/clock.h"
#include "../lib/syncChannel.h"
#include "../lib/MiddlewareTypes.h"
#include "../Middleware/MiddlewareCore.h"
#include "../components/loadControllerComponent.h"
//ENUM
	/** 
	 * @brief This enum represents the States of the Realtime-StateChart: RootLoadControllerCmpRTSC
	 */
		typedef enum {
				ROOTLOADCONTROLLERCMPRTSC_INIT_STATE /**< Represents the State: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE of the Realtime-StateChart: RootLoadControllerCmpRTSC */
				,
						ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLERBEHAVIORRTSC_LOADCONTROLLERBEHAVIORRTSC_LOADED_STATE /**< Represents the State: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLERBEHAVIORRTSC_LOADCONTROLLERBEHAVIORRTSC_LOADED_STATE of the Realtime-StateChart: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSC_LoadControllerBehaviorRTSC */ 
				,		ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLERBEHAVIORRTSC_LOADCONTROLLERBEHAVIORRTSC_UNLOADED_STATE /**< Represents the State: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLERBEHAVIORRTSC_LOADCONTROLLERBEHAVIORRTSC_UNLOADED_STATE of the Realtime-StateChart: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSC_LoadControllerBehaviorRTSC */ 
				,		ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLERBEHAVIORRTSC_LOADCONTROLLERBEHAVIORRTSC_INIT_STATE /**< Represents the State: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLERBEHAVIORRTSC_LOADCONTROLLERBEHAVIORRTSC_INIT_STATE of the Realtime-StateChart: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSC_LoadControllerBehaviorRTSC */ 
				,		ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_WAITTOUNLOAD_STATE /**< Represents the State: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_WAITTOUNLOAD_STATE of the Realtime-StateChart: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC_LoaderPortRTSC */ 
				,		ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_WAITTOLOAD_STATE /**< Represents the State: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_WAITTOLOAD_STATE of the Realtime-StateChart: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC_LoaderPortRTSC */ 
				,		ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_LOADING_STATE /**< Represents the State: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_LOADING_STATE of the Realtime-StateChart: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC_LoaderPortRTSC */ 
				,		ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_UNLOADING_STATE /**< Represents the State: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_UNLOADING_STATE of the Realtime-StateChart: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC_LoaderPortRTSC */ 
				,		ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_INIT_STATE /**< Represents the State: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADERPORTRTSC_LOADERPORTRTSC_INIT_STATE of the Realtime-StateChart: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC_LoaderPortRTSC */ 
				,		ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE /**< Represents the State: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE of the Realtime-StateChart: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadController_TouchPort_behavior_LoadController_TouchPort_behavior */
				,
						ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE /**< Represents the State: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE of the Realtime-StateChart: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE /**< Represents the State: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE of the Realtime-StateChart: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */	 
		}RootLoadControllerCmpRTSCState;
	
	
		/**
		 * 
		 * @brief Description of the Realtime-StateChart: RootLoadControllerCmpRTSC
		 * @details This struct represents the  Realtime-StateChart: RootLoadControllerCmpRTSC and its States
		 */
	struct RootLoadControllerCmpRTSCStateChart {	
			LoadControllerComponent * parentComponent; /**< A pointer to the parent ComponentInstance of Type: LoadControllerComponent , which has this Realtime-StateChart as its behavior */			
	
	
			RootLoadControllerCmpRTSCState currentStateOfRootLoadControllerCmpRTSC; /**< The current State of the Realtime-StateChart: RootLoadControllerCmpRTSC */
	
				RootLoadControllerCmpRTSCState currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSC_LoadControllerBehaviorRTSC; /**< Represents the State: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSC of the Realtime-StateChart: RootLoadControllerCmpRTSC */
				RootLoadControllerCmpRTSCState currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC_LoaderPortRTSC; /**< Represents the State: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC of the Realtime-StateChart: RootLoadControllerCmpRTSC */
				RootLoadControllerCmpRTSCState currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadController_TouchPort_behavior_LoadController_TouchPort_behavior; /**< Represents the State: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadController_TouchPort_behavior of the Realtime-StateChart: RootLoadControllerCmpRTSC */
				RootLoadControllerCmpRTSCState currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootLoadControllerCmpRTSC */
			
		
				Clock receiverTimeout_ofcurrentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: ReceiverTimeout_ofcurrentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
				Clock checkTouchClock_ofcurrentStateOfRootLoadControllerCmpRTSCClock; /**< The Clock: checkTouchClock_ofcurrentStateOfRootLoadControllerCmpRTSC */
		
			
		
		
	
			
				int checkTouchTimeConst; /**< The Realtime-StateChart Variable: checkTouchTimeConst of Type: INT */
				bool loadedFlag; /**< The Realtime-StateChart Variable: loadedFlag of Type: BOOLEAN */
				int TouchPort_apiValue; /**< The Realtime-StateChart Variable: TouchPort_apiValue of Type: INT */
		
	
	
	
		} ;

//METHOD STUBS
	/**
	 * @brief Creates an Instance of the Realtime-StateChart: RootLoadControllerCmpRTSC
	 * @details Allocates Memory for the struct RootLoadControllerCmpRTSCStateChart
	 * 
	 * @param parentComponent An Instance of the Component: LoadControllerComponent which behavior is described via this Realtime-StateChart
	 * @return A Pointer to the new created RootLoadControllerCmpRTSCStateChart
	 */
		RootLoadControllerCmpRTSCStateChart* RootLoadControllerCmpRTSCStateChart_create(LoadControllerComponent* parentComponent);
	/**
	 * @brief Initializes an Instance of the Realtime-StateChart: RootLoadControllerCmpRTSC
	 * @details All struct members of the struct RootLoadControllerCmpRTSCStateChart are initialized,
	 *			and all Regions of the Realtime-StateChart are initialized, too.
	 * 
	 * @param rtsc The specific RootLoadControllerCmpRTSCStateChart to be initialized
	 */
		void RootLoadControllerCmpRTSCStateChart_initialize(RootLoadControllerCmpRTSCStateChart* rtsc);
	/**
	 * @brief Initializes the Region: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSC of the Realtime-StateChart: RootLoadControllerCmpRTSC
	 * @details The Member RootLoadControllerCmpRTSCStateChart::currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSC_LoadControllerBehaviorRTSC is initialized
	 * 
	 * @param stateChart The specific RootLoadControllerCmpRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSCRegion(RootLoadControllerCmpRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC of the Realtime-StateChart: RootLoadControllerCmpRTSC
	 * @details The Member RootLoadControllerCmpRTSCStateChart::currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC_LoaderPortRTSC is initialized
	 * 
	 * @param stateChart The specific RootLoadControllerCmpRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSCRegion(RootLoadControllerCmpRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadController_TouchPort_behavior of the Realtime-StateChart: RootLoadControllerCmpRTSC
	 * @details The Member RootLoadControllerCmpRTSCStateChart::currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadController_TouchPort_behavior_LoadController_TouchPort_behavior is initialized
	 * 
	 * @param stateChart The specific RootLoadControllerCmpRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadController_TouchPort_behaviorRegion(RootLoadControllerCmpRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootLoadControllerCmpRTSC
	 * @details The Member RootLoadControllerCmpRTSCStateChart::currentStateOfROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootLoadControllerCmpRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmissionRegion(RootLoadControllerCmpRTSCStateChart* stateChart);
	/**
	 * @brief Destroys the Realtime-StateChart: RootLoadControllerCmpRTSC
	 * @details Frees the Memory for the struct RootLoadControllerCmpRTSCStateChart
	 * 
	 * @param rtsc The specific RootLoadControllerCmpRTSCStateChart to be destroyed
	 */	
		void RootLoadControllerCmpRTSCStateChart_destroy(RootLoadControllerCmpRTSCStateChart* rtsc);		
	/**
	 * @brief Executes the next Step of the Realtime-StateChart: RootLoadControllerCmpRTSC
	 * 
	 * @param rtsc The specific RootLoadControllerCmpRTSCStateChart to be executed
	 */	
	void RootLoadControllerCmpRTSCStateChart_processStep(RootLoadControllerCmpRTSCStateChart* rtsc);

	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootLoadControllerCmpRTSC
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootLoadControllerCmpRTSCStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_LOADCONTROLLER_TOUCHPORT_BEHAVIOR_TOUCHPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootLoadControllerCmpRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: LoadControllerBehaviorRTSC of the Realtime-StateChart: RootLoadControllerCmpRTSC
	 * @details This method is called, whenever a the Region: LoadControllerBehaviorRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootLoadControllerCmpRTSCStateChart whose Region: LoadControllerBehaviorRTSC shall be exit
	 */
		void ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadControllerBehaviorRTSC_LoadControllerBehaviorRTSCStateChart_exit(RootLoadControllerCmpRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: LoadController_TouchPort_behavior of the Realtime-StateChart: RootLoadControllerCmpRTSC
	 * @details This method is called, whenever a the Region: LoadController_TouchPort_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootLoadControllerCmpRTSCStateChart whose Region: LoadController_TouchPort_behavior shall be exit
	 */
		void ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoadController_TouchPort_behavior_LoadController_TouchPort_behaviorStateChart_exit(RootLoadControllerCmpRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: LoaderPortRTSC of the Realtime-StateChart: RootLoadControllerCmpRTSC
	 * @details This method is called, whenever a the Region: LoaderPortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootLoadControllerCmpRTSCStateChart whose Region: LoaderPortRTSC shall be exit
	 */
		void ROOTLOADCONTROLLERCMPRTSC_INIT_STATE_LoaderPortRTSC_LoaderPortRTSCStateChart_exit(RootLoadControllerCmpRTSCStateChart* rtsc);
			
	/**
	 * @brief Returns wether the Realtime-StateChart: RootLoadControllerCmpRTSC is in a specific State
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootLoadControllerCmpRTSCStateChart
	 * @param state One of the States of the Enum: RootLoadControllerCmpRTSCState
	 * 
	 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
	 * @todo  Why is this int and not bool, like everywhere else
	 */	
		int RootLoadControllerCmpRTSCStateChart_isInState(RootLoadControllerCmpRTSCStateChart* rtsc, RootLoadControllerCmpRTSCState state);
	/**
	 * @brief Checks if the execution of the Realtime-StateChart: RootLoadControllerCmpRTSC  is terminated
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootLoadControllerCmpRTSCStateChart
	 * @return Always True
	 * @todo  always true is returned
	 */	
	bool RootLoadControllerCmpRTSCStateChart_isTerminated(RootLoadControllerCmpRTSCStateChart* rtsc);

#endif /* ROOTLOADCONTROLLERCMPRTSCSTATECHART_H_ */
