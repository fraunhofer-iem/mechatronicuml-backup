/**
 * @file 
 * @author generated
 * @brief Specification of Realtime-StateChart: RootDriverCmpRTSC
 * @details This files contains the description of the Realtime-StateChart: RootDriverCmpRTSC and its behavior which is executed
 */

#ifndef ROOTDRIVERCMPRTSCSTATECHART_H_
#define ROOTDRIVERCMPRTSCSTATECHART_H_

#include "../lib/clock.h"
#include "../lib/syncChannel.h"
#include "../lib/MiddlewareTypes.h"
#include "../Middleware/MiddlewareCore.h"
#include "../components/driverComponent.h"
//ENUM
	/** 
	 * @brief This enum represents the States of the Realtime-StateChart: RootDriverCmpRTSC
	 */
		typedef enum {
				ROOTDRIVERCMPRTSC_INIT_STATE /**< Represents the State: ROOTDRIVERCMPRTSC_INIT_STATE of the Realtime-StateChart: RootDriverCmpRTSC */
				,
						ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERBEHAVIORRTSC_DRIVERBEHAVIORRTSC_DRIVE_STATE /**< Represents the State: ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERBEHAVIORRTSC_DRIVERBEHAVIORRTSC_DRIVE_STATE of the Realtime-StateChart: ROOTDRIVERCMPRTSC_INIT_STATE_DriverBehaviorRTSC_DriverBehaviorRTSC */ 
				,		ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERBEHAVIORRTSC_DRIVERBEHAVIORRTSC_STOP_STATE /**< Represents the State: ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERBEHAVIORRTSC_DRIVERBEHAVIORRTSC_STOP_STATE of the Realtime-StateChart: ROOTDRIVERCMPRTSC_INIT_STATE_DriverBehaviorRTSC_DriverBehaviorRTSC */ 
				,		ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERPORTRTSC_DRIVERPORTRTSC_DRIVING_STATE /**< Represents the State: ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERPORTRTSC_DRIVERPORTRTSC_DRIVING_STATE of the Realtime-StateChart: ROOTDRIVERCMPRTSC_INIT_STATE_DriverPortRTSC_DriverPortRTSC */ 
				,		ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERPORTRTSC_DRIVERPORTRTSC_STOPPING_STATE /**< Represents the State: ROOTDRIVERCMPRTSC_INIT_STATE_DRIVERPORTRTSC_DRIVERPORTRTSC_STOPPING_STATE of the Realtime-StateChart: ROOTDRIVERCMPRTSC_INIT_STATE_DriverPortRTSC_DriverPortRTSC */ 
				,		ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE /**< Represents the State: ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE of the Realtime-StateChart: ROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorRightPort_behavior_Driver_MotorRightPort_behavior */
				,
						ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE /**< Represents the State: ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE of the Realtime-StateChart: ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE /**< Represents the State: ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE of the Realtime-StateChart: ROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorLeftPort_behavior_Driver_MotorLeftPort_behavior */
				,
						ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE /**< Represents the State: ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE of the Realtime-StateChart: ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE /**< Represents the State: ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE of the Realtime-StateChart: ROOTDRIVERCMPRTSC_INIT_STATE_Driver_LineLeaderPort_behavior_Driver_LineLeaderPort_behavior */
				,
						ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE /**< Represents the State: ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE of the Realtime-StateChart: ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
				,		ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE /**< Represents the State: ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE of the Realtime-StateChart: ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */	 
		}RootDriverCmpRTSCState;
	
	
		/**
		 * 
		 * @brief Description of the Realtime-StateChart: RootDriverCmpRTSC
		 * @details This struct represents the  Realtime-StateChart: RootDriverCmpRTSC and its States
		 */
	struct RootDriverCmpRTSCStateChart {	
			DriverComponent * parentComponent; /**< A pointer to the parent ComponentInstance of Type: DriverComponent , which has this Realtime-StateChart as its behavior */			
	
	
			RootDriverCmpRTSCState currentStateOfRootDriverCmpRTSC; /**< The current State of the Realtime-StateChart: RootDriverCmpRTSC */
	
				RootDriverCmpRTSCState currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DriverBehaviorRTSC_DriverBehaviorRTSC; /**< Represents the State: ROOTDRIVERCMPRTSC_INIT_STATE_DriverBehaviorRTSC of the Realtime-StateChart: RootDriverCmpRTSC */
				RootDriverCmpRTSCState currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DriverPortRTSC_DriverPortRTSC; /**< Represents the State: ROOTDRIVERCMPRTSC_INIT_STATE_DriverPortRTSC of the Realtime-StateChart: RootDriverCmpRTSC */
				RootDriverCmpRTSCState currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorRightPort_behavior_Driver_MotorRightPort_behavior; /**< Represents the State: ROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorRightPort_behavior of the Realtime-StateChart: RootDriverCmpRTSC */
				RootDriverCmpRTSCState currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootDriverCmpRTSC */
				RootDriverCmpRTSCState currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorLeftPort_behavior_Driver_MotorLeftPort_behavior; /**< Represents the State: ROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorLeftPort_behavior of the Realtime-StateChart: RootDriverCmpRTSC */
				RootDriverCmpRTSCState currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootDriverCmpRTSC */
				RootDriverCmpRTSCState currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_Driver_LineLeaderPort_behavior_Driver_LineLeaderPort_behavior; /**< Represents the State: ROOTDRIVERCMPRTSC_INIT_STATE_Driver_LineLeaderPort_behavior of the Realtime-StateChart: RootDriverCmpRTSC */
				RootDriverCmpRTSCState currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootDriverCmpRTSC */
			
		
				Clock clockSending_ofcurrentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: clockSending_ofcurrentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
				Clock clockSending_ofcurrentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: clockSending_ofcurrentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
				Clock receiverTimeout_ofcurrentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: ReceiverTimeout_ofcurrentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
		
			
		
		
	
			
				int velocity; /**< The Realtime-StateChart Variable: velocity of Type: INT */
				bool driveFlag; /**< The Realtime-StateChart Variable: driveFlag of Type: BOOLEAN */
				bool stopFlag; /**< The Realtime-StateChart Variable: stopFlag of Type: BOOLEAN */
				int MotorRightPort_apiValue; /**< The Realtime-StateChart Variable: MotorRightPort_apiValue of Type: INT */
				int MotorLeftPort_apiValue; /**< The Realtime-StateChart Variable: MotorLeftPort_apiValue of Type: INT */
				int LineLeaderPort_apiValue; /**< The Realtime-StateChart Variable: LineLeaderPort_apiValue of Type: INT */
		
	
	
	
		} ;

//METHOD STUBS
	/**
	 * @brief Creates an Instance of the Realtime-StateChart: RootDriverCmpRTSC
	 * @details Allocates Memory for the struct RootDriverCmpRTSCStateChart
	 * 
	 * @param parentComponent An Instance of the Component: DriverComponent which behavior is described via this Realtime-StateChart
	 * @return A Pointer to the new created RootDriverCmpRTSCStateChart
	 */
		RootDriverCmpRTSCStateChart* RootDriverCmpRTSCStateChart_create(DriverComponent* parentComponent);
	/**
	 * @brief Initializes an Instance of the Realtime-StateChart: RootDriverCmpRTSC
	 * @details All struct members of the struct RootDriverCmpRTSCStateChart are initialized,
	 *			and all Regions of the Realtime-StateChart are initialized, too.
	 * 
	 * @param rtsc The specific RootDriverCmpRTSCStateChart to be initialized
	 */
		void RootDriverCmpRTSCStateChart_initialize(RootDriverCmpRTSCStateChart* rtsc);
	/**
	 * @brief Initializes the Region: ROOTDRIVERCMPRTSC_INIT_STATE_DriverBehaviorRTSC of the Realtime-StateChart: RootDriverCmpRTSC
	 * @details The Member RootDriverCmpRTSCStateChart::currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DriverBehaviorRTSC_DriverBehaviorRTSC is initialized
	 * 
	 * @param stateChart The specific RootDriverCmpRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTDRIVERCMPRTSC_INIT_STATE_DriverBehaviorRTSCRegion(RootDriverCmpRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTDRIVERCMPRTSC_INIT_STATE_DriverPortRTSC of the Realtime-StateChart: RootDriverCmpRTSC
	 * @details The Member RootDriverCmpRTSCStateChart::currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DriverPortRTSC_DriverPortRTSC is initialized
	 * 
	 * @param stateChart The specific RootDriverCmpRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTDRIVERCMPRTSC_INIT_STATE_DriverPortRTSCRegion(RootDriverCmpRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorRightPort_behavior of the Realtime-StateChart: RootDriverCmpRTSC
	 * @details The Member RootDriverCmpRTSCStateChart::currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorRightPort_behavior_Driver_MotorRightPort_behavior is initialized
	 * 
	 * @param stateChart The specific RootDriverCmpRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorRightPort_behaviorRegion(RootDriverCmpRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootDriverCmpRTSC
	 * @details The Member RootDriverCmpRTSCStateChart::currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootDriverCmpRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmissionRegion(RootDriverCmpRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorLeftPort_behavior of the Realtime-StateChart: RootDriverCmpRTSC
	 * @details The Member RootDriverCmpRTSCStateChart::currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorLeftPort_behavior_Driver_MotorLeftPort_behavior is initialized
	 * 
	 * @param stateChart The specific RootDriverCmpRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorLeftPort_behaviorRegion(RootDriverCmpRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootDriverCmpRTSC
	 * @details The Member RootDriverCmpRTSCStateChart::currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootDriverCmpRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmissionRegion(RootDriverCmpRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTDRIVERCMPRTSC_INIT_STATE_Driver_LineLeaderPort_behavior of the Realtime-StateChart: RootDriverCmpRTSC
	 * @details The Member RootDriverCmpRTSCStateChart::currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_Driver_LineLeaderPort_behavior_Driver_LineLeaderPort_behavior is initialized
	 * 
	 * @param stateChart The specific RootDriverCmpRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTDRIVERCMPRTSC_INIT_STATE_Driver_LineLeaderPort_behaviorRegion(RootDriverCmpRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootDriverCmpRTSC
	 * @details The Member RootDriverCmpRTSCStateChart::currentStateOfROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootDriverCmpRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmissionRegion(RootDriverCmpRTSCStateChart* stateChart);
	/**
	 * @brief Destroys the Realtime-StateChart: RootDriverCmpRTSC
	 * @details Frees the Memory for the struct RootDriverCmpRTSCStateChart
	 * 
	 * @param rtsc The specific RootDriverCmpRTSCStateChart to be destroyed
	 */	
		void RootDriverCmpRTSCStateChart_destroy(RootDriverCmpRTSCStateChart* rtsc);		
	/**
	 * @brief Executes the next Step of the Realtime-StateChart: RootDriverCmpRTSC
	 * 
	 * @param rtsc The specific RootDriverCmpRTSCStateChart to be executed
	 */	
	void RootDriverCmpRTSCStateChart_processStep(RootDriverCmpRTSCStateChart* rtsc);

	/**
	 * @brief Leaves the Region: DriverPortRTSC of the Realtime-StateChart: RootDriverCmpRTSC
	 * @details This method is called, whenever a the Region: DriverPortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootDriverCmpRTSCStateChart whose Region: DriverPortRTSC shall be exit
	 */
		void ROOTDRIVERCMPRTSC_INIT_STATE_DriverPortRTSC_DriverPortRTSCStateChart_exit(RootDriverCmpRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: Driver_LineLeaderPort_behavior of the Realtime-StateChart: RootDriverCmpRTSC
	 * @details This method is called, whenever a the Region: Driver_LineLeaderPort_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootDriverCmpRTSCStateChart whose Region: Driver_LineLeaderPort_behavior shall be exit
	 */
		void ROOTDRIVERCMPRTSC_INIT_STATE_Driver_LineLeaderPort_behavior_Driver_LineLeaderPort_behaviorStateChart_exit(RootDriverCmpRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootDriverCmpRTSC
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootDriverCmpRTSCStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORRIGHTPORT_BEHAVIOR_DRIVER_MOTORRIGHTPORT_BEHAVIOR_MOTORRIGHTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootDriverCmpRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootDriverCmpRTSC
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootDriverCmpRTSCStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_LINELEADERPORT_BEHAVIOR_DRIVER_LINELEADERPORT_BEHAVIOR_LINELEADERPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootDriverCmpRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: DriverBehaviorRTSC of the Realtime-StateChart: RootDriverCmpRTSC
	 * @details This method is called, whenever a the Region: DriverBehaviorRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootDriverCmpRTSCStateChart whose Region: DriverBehaviorRTSC shall be exit
	 */
		void ROOTDRIVERCMPRTSC_INIT_STATE_DriverBehaviorRTSC_DriverBehaviorRTSCStateChart_exit(RootDriverCmpRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootDriverCmpRTSC
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootDriverCmpRTSCStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTDRIVERCMPRTSC_INIT_STATE_DRIVER_MOTORLEFTPORT_BEHAVIOR_DRIVER_MOTORLEFTPORT_BEHAVIOR_MOTORLEFTPORT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootDriverCmpRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: Driver_MotorLeftPort_behavior of the Realtime-StateChart: RootDriverCmpRTSC
	 * @details This method is called, whenever a the Region: Driver_MotorLeftPort_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootDriverCmpRTSCStateChart whose Region: Driver_MotorLeftPort_behavior shall be exit
	 */
		void ROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorLeftPort_behavior_Driver_MotorLeftPort_behaviorStateChart_exit(RootDriverCmpRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: Driver_MotorRightPort_behavior of the Realtime-StateChart: RootDriverCmpRTSC
	 * @details This method is called, whenever a the Region: Driver_MotorRightPort_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootDriverCmpRTSCStateChart whose Region: Driver_MotorRightPort_behavior shall be exit
	 */
		void ROOTDRIVERCMPRTSC_INIT_STATE_Driver_MotorRightPort_behavior_Driver_MotorRightPort_behaviorStateChart_exit(RootDriverCmpRTSCStateChart* rtsc);
			
	/**
	 * @brief Returns wether the Realtime-StateChart: RootDriverCmpRTSC is in a specific State
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootDriverCmpRTSCStateChart
	 * @param state One of the States of the Enum: RootDriverCmpRTSCState
	 * 
	 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
	 * @todo  Why is this int and not bool, like everywhere else
	 */	
		int RootDriverCmpRTSCStateChart_isInState(RootDriverCmpRTSCStateChart* rtsc, RootDriverCmpRTSCState state);
	/**
	 * @brief Checks if the execution of the Realtime-StateChart: RootDriverCmpRTSC  is terminated
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootDriverCmpRTSCStateChart
	 * @return Always True
	 * @todo  always true is returned
	 */	
	bool RootDriverCmpRTSCStateChart_isTerminated(RootDriverCmpRTSCStateChart* rtsc);

#endif /* ROOTDRIVERCMPRTSCSTATECHART_H_ */
