/**
 * @file 
 * @author generated
 * @brief Specification of Realtime-StateChart: RootMainControllerCmpRTSC
 * @details This files contains the description of the Realtime-StateChart: RootMainControllerCmpRTSC and its behavior which is executed
 */

#ifndef ROOTMAINCONTROLLERCMPRTSCSTATECHART_H_
#define ROOTMAINCONTROLLERCMPRTSCSTATECHART_H_

#include "../lib/clock.h"
#include "../lib/syncChannel.h"
#include "../lib/MiddlewareTypes.h"
#include "../Middleware/MiddlewareCore.h"
#include "../components/mainControllerComponent.h"
//ENUM
	/** 
	 * @brief This enum represents the States of the Realtime-StateChart: RootMainControllerCmpRTSC
	 */
		typedef enum {
				ROOTMAINCONTROLLERCMPRTSC_INIT_STATE /**< Represents the State: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE of the Realtime-StateChart: RootMainControllerCmpRTSC */
				,
						ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLERBEHAVIORRTSC_MAINCONTROLLERBEHAVIORRTSC_INIT_STATE /**< Represents the State: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLERBEHAVIORRTSC_MAINCONTROLLERBEHAVIORRTSC_INIT_STATE of the Realtime-StateChart: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainControllerBehaviorRTSC_MainControllerBehaviorRTSC */ 
				,		ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PICKINGUPCONTROLLERPORTRTSC_PICKINGUPCONTROLLERPORTRTSC_INIT_STATE /**< Represents the State: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PICKINGUPCONTROLLERPORTRTSC_PICKINGUPCONTROLLERPORTRTSC_INIT_STATE of the Realtime-StateChart: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PickingUpControllerPortRTSC_PickingUpControllerPortRTSC */ 
				,		ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PICKINGUPCONTROLLERPORTRTSC_PICKINGUPCONTROLLERPORTRTSC_SENDPICKUP_STATE /**< Represents the State: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PICKINGUPCONTROLLERPORTRTSC_PICKINGUPCONTROLLERPORTRTSC_SENDPICKUP_STATE of the Realtime-StateChart: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PickingUpControllerPortRTSC_PickingUpControllerPortRTSC */ 
				,		ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DRIVINGCONTROLLERPORTRTSC_DRIVINGCONTROLLERPORTRTSC_DRIVE_STATE /**< Represents the State: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DRIVINGCONTROLLERPORTRTSC_DRIVINGCONTROLLERPORTRTSC_DRIVE_STATE of the Realtime-StateChart: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DrivingControllerPortRTSC_DrivingControllerPortRTSC */ 
				,		ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DRIVINGCONTROLLERPORTRTSC_DRIVINGCONTROLLERPORTRTSC_STOP4LOADING_STATE /**< Represents the State: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DRIVINGCONTROLLERPORTRTSC_DRIVINGCONTROLLERPORTRTSC_STOP4LOADING_STATE of the Realtime-StateChart: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DrivingControllerPortRTSC_DrivingControllerPortRTSC */ 
				,		ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DRIVINGCONTROLLERPORTRTSC_DRIVINGCONTROLLERPORTRTSC_STOP4UNLOADING_STATE /**< Represents the State: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DRIVINGCONTROLLERPORTRTSC_DRIVINGCONTROLLERPORTRTSC_STOP4UNLOADING_STATE of the Realtime-StateChart: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DrivingControllerPortRTSC_DrivingControllerPortRTSC */ 
				,		ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_INIT_STATE /**< Represents the State: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_INIT_STATE of the Realtime-StateChart: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC_LoadingControllerPortRTSC */ 
				,		ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_LOADED_STATE /**< Represents the State: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_LOADED_STATE of the Realtime-StateChart: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC_LoadingControllerPortRTSC */ 
				,		ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_UNLOADED_STATE /**< Represents the State: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_UNLOADED_STATE of the Realtime-StateChart: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC_LoadingControllerPortRTSC */ 
				,		ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_WAIT4UNLOAD_STATE /**< Represents the State: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_WAIT4UNLOAD_STATE of the Realtime-StateChart: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC_LoadingControllerPortRTSC */ 
				,		ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_WAIT4LOAD_STATE /**< Represents the State: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LOADINGCONTROLLERPORTRTSC_LOADINGCONTROLLERPORTRTSC_WAIT4LOAD_STATE of the Realtime-StateChart: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC_LoadingControllerPortRTSC */ 
				,		ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE /**< Represents the State: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE of the Realtime-StateChart: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainController_ColorPort_behavior_MainController_ColorPort_behavior */
				,
						ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE /**< Represents the State: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE of the Realtime-StateChart: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE /**< Represents the State: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE of the Realtime-StateChart: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */	 
		}RootMainControllerCmpRTSCState;
	
	
		/**
		 * 
		 * @brief Description of the Realtime-StateChart: RootMainControllerCmpRTSC
		 * @details This struct represents the  Realtime-StateChart: RootMainControllerCmpRTSC and its States
		 */
	struct RootMainControllerCmpRTSCStateChart {	
			MainControllerComponent * parentComponent; /**< A pointer to the parent ComponentInstance of Type: MainControllerComponent , which has this Realtime-StateChart as its behavior */			
	
	
			RootMainControllerCmpRTSCState currentStateOfRootMainControllerCmpRTSC; /**< The current State of the Realtime-StateChart: RootMainControllerCmpRTSC */
	
				RootMainControllerCmpRTSCState currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainControllerBehaviorRTSC_MainControllerBehaviorRTSC; /**< Represents the State: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainControllerBehaviorRTSC of the Realtime-StateChart: RootMainControllerCmpRTSC */
				RootMainControllerCmpRTSCState currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PickingUpControllerPortRTSC_PickingUpControllerPortRTSC; /**< Represents the State: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PickingUpControllerPortRTSC of the Realtime-StateChart: RootMainControllerCmpRTSC */
				RootMainControllerCmpRTSCState currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DrivingControllerPortRTSC_DrivingControllerPortRTSC; /**< Represents the State: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DrivingControllerPortRTSC of the Realtime-StateChart: RootMainControllerCmpRTSC */
				RootMainControllerCmpRTSCState currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC_LoadingControllerPortRTSC; /**< Represents the State: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC of the Realtime-StateChart: RootMainControllerCmpRTSC */
				RootMainControllerCmpRTSCState currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainController_ColorPort_behavior_MainController_ColorPort_behavior; /**< Represents the State: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainController_ColorPort_behavior of the Realtime-StateChart: RootMainControllerCmpRTSC */
				RootMainControllerCmpRTSCState currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootMainControllerCmpRTSC */
			
		
				Clock receiverTimeout_ofcurrentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: ReceiverTimeout_ofcurrentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
				Clock checkColorClock_ofcurrentStateOfRootMainControllerCmpRTSCClock; /**< The Clock: checkColorClock_ofcurrentStateOfRootMainControllerCmpRTSC */
				Clock stopClock_ofcurrentStateOfRootMainControllerCmpRTSCClock; /**< The Clock: stopClock_ofcurrentStateOfRootMainControllerCmpRTSC */
		
			
		
		
	
			
				bool loadStationFlag; /**< The Realtime-StateChart Variable: loadStationFlag of Type: BOOLEAN */
				bool unloadStationFlag; /**< The Realtime-StateChart Variable: unloadStationFlag of Type: BOOLEAN */
				int loadTimeConst; /**< The Realtime-StateChart Variable: loadTimeConst of Type: INT */
				int unloadTimeConst; /**< The Realtime-StateChart Variable: unloadTimeConst of Type: INT */
				int checkColorTimeConst; /**< The Realtime-StateChart Variable: checkColorTimeConst of Type: INT */
				bool loadedFlag; /**< The Realtime-StateChart Variable: loadedFlag of Type: BOOLEAN */
				bool deliveryFinishedFlag; /**< The Realtime-StateChart Variable: deliveryFinishedFlag of Type: BOOLEAN */
				int ColorPort_apiValue; /**< The Realtime-StateChart Variable: ColorPort_apiValue of Type: INT */
		
	
	
	
		} ;

//METHOD STUBS
	/**
	 * @brief Creates an Instance of the Realtime-StateChart: RootMainControllerCmpRTSC
	 * @details Allocates Memory for the struct RootMainControllerCmpRTSCStateChart
	 * 
	 * @param parentComponent An Instance of the Component: MainControllerComponent which behavior is described via this Realtime-StateChart
	 * @return A Pointer to the new created RootMainControllerCmpRTSCStateChart
	 */
		RootMainControllerCmpRTSCStateChart* RootMainControllerCmpRTSCStateChart_create(MainControllerComponent* parentComponent);
	/**
	 * @brief Initializes an Instance of the Realtime-StateChart: RootMainControllerCmpRTSC
	 * @details All struct members of the struct RootMainControllerCmpRTSCStateChart are initialized,
	 *			and all Regions of the Realtime-StateChart are initialized, too.
	 * 
	 * @param rtsc The specific RootMainControllerCmpRTSCStateChart to be initialized
	 */
		void RootMainControllerCmpRTSCStateChart_initialize(RootMainControllerCmpRTSCStateChart* rtsc);
	/**
	 * @brief Initializes the Region: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainControllerBehaviorRTSC of the Realtime-StateChart: RootMainControllerCmpRTSC
	 * @details The Member RootMainControllerCmpRTSCStateChart::currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainControllerBehaviorRTSC_MainControllerBehaviorRTSC is initialized
	 * 
	 * @param stateChart The specific RootMainControllerCmpRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainControllerBehaviorRTSCRegion(RootMainControllerCmpRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PickingUpControllerPortRTSC of the Realtime-StateChart: RootMainControllerCmpRTSC
	 * @details The Member RootMainControllerCmpRTSCStateChart::currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PickingUpControllerPortRTSC_PickingUpControllerPortRTSC is initialized
	 * 
	 * @param stateChart The specific RootMainControllerCmpRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PickingUpControllerPortRTSCRegion(RootMainControllerCmpRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DrivingControllerPortRTSC of the Realtime-StateChart: RootMainControllerCmpRTSC
	 * @details The Member RootMainControllerCmpRTSCStateChart::currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DrivingControllerPortRTSC_DrivingControllerPortRTSC is initialized
	 * 
	 * @param stateChart The specific RootMainControllerCmpRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DrivingControllerPortRTSCRegion(RootMainControllerCmpRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC of the Realtime-StateChart: RootMainControllerCmpRTSC
	 * @details The Member RootMainControllerCmpRTSCStateChart::currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC_LoadingControllerPortRTSC is initialized
	 * 
	 * @param stateChart The specific RootMainControllerCmpRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSCRegion(RootMainControllerCmpRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainController_ColorPort_behavior of the Realtime-StateChart: RootMainControllerCmpRTSC
	 * @details The Member RootMainControllerCmpRTSCStateChart::currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainController_ColorPort_behavior_MainController_ColorPort_behavior is initialized
	 * 
	 * @param stateChart The specific RootMainControllerCmpRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainController_ColorPort_behaviorRegion(RootMainControllerCmpRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootMainControllerCmpRTSC
	 * @details The Member RootMainControllerCmpRTSCStateChart::currentStateOfROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootMainControllerCmpRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmissionRegion(RootMainControllerCmpRTSCStateChart* stateChart);
	/**
	 * @brief Destroys the Realtime-StateChart: RootMainControllerCmpRTSC
	 * @details Frees the Memory for the struct RootMainControllerCmpRTSCStateChart
	 * 
	 * @param rtsc The specific RootMainControllerCmpRTSCStateChart to be destroyed
	 */	
		void RootMainControllerCmpRTSCStateChart_destroy(RootMainControllerCmpRTSCStateChart* rtsc);		
	/**
	 * @brief Executes the next Step of the Realtime-StateChart: RootMainControllerCmpRTSC
	 * 
	 * @param rtsc The specific RootMainControllerCmpRTSCStateChart to be executed
	 */	
	void RootMainControllerCmpRTSCStateChart_processStep(RootMainControllerCmpRTSCStateChart* rtsc);

	/**
	 * @brief Leaves the Region: MainControllerBehaviorRTSC of the Realtime-StateChart: RootMainControllerCmpRTSC
	 * @details This method is called, whenever a the Region: MainControllerBehaviorRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootMainControllerCmpRTSCStateChart whose Region: MainControllerBehaviorRTSC shall be exit
	 */
		void ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainControllerBehaviorRTSC_MainControllerBehaviorRTSCStateChart_exit(RootMainControllerCmpRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootMainControllerCmpRTSC
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootMainControllerCmpRTSCStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MAINCONTROLLER_COLORPORT_BEHAVIOR_MAINCONTROLLER_COLORPORT_BEHAVIOR_COLORPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootMainControllerCmpRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: LoadingControllerPortRTSC of the Realtime-StateChart: RootMainControllerCmpRTSC
	 * @details This method is called, whenever a the Region: LoadingControllerPortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootMainControllerCmpRTSCStateChart whose Region: LoadingControllerPortRTSC shall be exit
	 */
		void ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_LoadingControllerPortRTSC_LoadingControllerPortRTSCStateChart_exit(RootMainControllerCmpRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PickingUpControllerPortRTSC of the Realtime-StateChart: RootMainControllerCmpRTSC
	 * @details This method is called, whenever a the Region: PickingUpControllerPortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootMainControllerCmpRTSCStateChart whose Region: PickingUpControllerPortRTSC shall be exit
	 */
		void ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_PickingUpControllerPortRTSC_PickingUpControllerPortRTSCStateChart_exit(RootMainControllerCmpRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: MainController_ColorPort_behavior of the Realtime-StateChart: RootMainControllerCmpRTSC
	 * @details This method is called, whenever a the Region: MainController_ColorPort_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootMainControllerCmpRTSCStateChart whose Region: MainController_ColorPort_behavior shall be exit
	 */
		void ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_MainController_ColorPort_behavior_MainController_ColorPort_behaviorStateChart_exit(RootMainControllerCmpRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: DrivingControllerPortRTSC of the Realtime-StateChart: RootMainControllerCmpRTSC
	 * @details This method is called, whenever a the Region: DrivingControllerPortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootMainControllerCmpRTSCStateChart whose Region: DrivingControllerPortRTSC shall be exit
	 */
		void ROOTMAINCONTROLLERCMPRTSC_INIT_STATE_DrivingControllerPortRTSC_DrivingControllerPortRTSCStateChart_exit(RootMainControllerCmpRTSCStateChart* rtsc);
			
	/**
	 * @brief Returns wether the Realtime-StateChart: RootMainControllerCmpRTSC is in a specific State
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootMainControllerCmpRTSCStateChart
	 * @param state One of the States of the Enum: RootMainControllerCmpRTSCState
	 * 
	 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
	 * @todo  Why is this int and not bool, like everywhere else
	 */	
		int RootMainControllerCmpRTSCStateChart_isInState(RootMainControllerCmpRTSCStateChart* rtsc, RootMainControllerCmpRTSCState state);
	/**
	 * @brief Checks if the execution of the Realtime-StateChart: RootMainControllerCmpRTSC  is terminated
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootMainControllerCmpRTSCStateChart
	 * @return Always True
	 * @todo  always true is returned
	 */	
	bool RootMainControllerCmpRTSCStateChart_isTerminated(RootMainControllerCmpRTSCStateChart* rtsc);

#endif /* ROOTMAINCONTROLLERCMPRTSCSTATECHART_H_ */
