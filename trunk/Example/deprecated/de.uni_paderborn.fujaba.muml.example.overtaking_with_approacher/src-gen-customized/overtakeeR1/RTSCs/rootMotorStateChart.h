/**
 * @file 
 * @author generated
 * @brief Specification of Realtime-StateChart: RootMotor
 * @details This files contains the description of the Realtime-StateChart: RootMotor and its behavior which is executed
 */

#ifndef ROOTMOTORSTATECHART_H_
#define ROOTMOTORSTATECHART_H_

#include "../lib/clock.h"
#include "../lib/syncChannel.h"
#include "../lib/MiddlewareTypes.h"
#include "../Middleware/MiddlewareCore.h"
#include "../components/motorComponent.h"
#include "../operations/operations.h"
#include "../apiCallCode/implementations.h"
//ENUM
	/** 
	 * @brief This enum represents the States of the Realtime-StateChart: RootMotor
	 */
		typedef enum {
				ROOTMOTOR_MOTOR_STATE_STATE /**< Represents the State: ROOTMOTOR_MOTOR_STATE_STATE of the Realtime-StateChart: RootMotor */
				,
						ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE /**< Represents the State: ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE of the Realtime-StateChart: ROOTMOTOR_MOTOR_STATE_STATE_Motor_velocity_behavior_Motor_velocity_behavior */
						,
								ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE /**< Represents the State: ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE of the Realtime-StateChart: ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
						,		ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE /**< Represents the State: ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE of the Realtime-StateChart: ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
						,		ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECINITCOMMAND_STATE /**< Represents the State: ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECINITCOMMAND_STATE of the Realtime-StateChart: ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution_ApiExecution */ 
						,		ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE /**< Represents the State: ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE of the Realtime-StateChart: ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution_ApiExecution */	 
		}RootMotorState;
	
	
		/**
		 * 
		 * @brief Description of the Realtime-StateChart: RootMotor
		 * @details This struct represents the  Realtime-StateChart: RootMotor and its States
		 */
	struct RootMotorStateChart {	
			MotorComponent * parentComponent; /**< A pointer to the parent ComponentInstance of Type: MotorComponent , which has this Realtime-StateChart as its behavior */			
	
	
			RootMotorState currentStateOfRootMotor; /**< The current State of the Realtime-StateChart: RootMotor */
	
				RootMotorState currentStateOfROOTMOTOR_MOTOR_STATE_STATE_Motor_velocity_behavior_Motor_velocity_behavior; /**< Represents the State: ROOTMOTOR_MOTOR_STATE_STATE_Motor_velocity_behavior of the Realtime-StateChart: RootMotor */
				RootMotorState currentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootMotor */
				RootMotorState currentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution_ApiExecution; /**< Represents the State: ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution of the Realtime-StateChart: RootMotor */
			
		
				Clock receiverTimeout_ofcurrentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: ReceiverTimeout_ofcurrentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
				Clock _apiClock_ofcurrentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution_ApiExecutionClock; /**< The Clock: _apiClock_ofcurrentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution_ApiExecution */
		
			
		
		
	
			
				int velocity_apiValue; /**< The Realtime-StateChart Variable: velocity_apiValue of Type: INT */
				int TimeBetweenApiExececutions; /**< The Realtime-StateChart Variable: TimeBetweenApiExececutions of Type: INT */
		
	
	
	
							void (*initApi)(); /**< A Function Pointer to the API-Call: initApi */
							void (*execApi)(int); /**< A Function Pointer to the API-Call: execApi */
		} ;

//METHOD STUBS
	/**
	 * @brief Creates an Instance of the Realtime-StateChart: RootMotor
	 * @details Allocates Memory for the struct RootMotorStateChart
	 * 
	 * @param parentComponent An Instance of the Component: MotorComponent which behavior is described via this Realtime-StateChart
	 * @return A Pointer to the new created RootMotorStateChart
	 */
		RootMotorStateChart* RootMotorStateChart_create(MotorComponent* parentComponent);
	/**
	 * @brief Initializes an Instance of the Realtime-StateChart: RootMotor
	 * @details All struct members of the struct RootMotorStateChart are initialized,
	 *			and all Regions of the Realtime-StateChart are initialized, too.
	 * 
	 * @param rtsc The specific RootMotorStateChart to be initialized
	 */
		void RootMotorStateChart_initialize(RootMotorStateChart* rtsc);
	/**
	 * @brief Initializes the Region: ROOTMOTOR_MOTOR_STATE_STATE_Motor_velocity_behavior of the Realtime-StateChart: RootMotor
	 * @details The Member RootMotorStateChart::currentStateOfROOTMOTOR_MOTOR_STATE_STATE_Motor_velocity_behavior_Motor_velocity_behavior is initialized
	 * 
	 * @param stateChart The specific RootMotorStateChart whose Region shall be initialized
	 */
		void initializeROOTMOTOR_MOTOR_STATE_STATE_Motor_velocity_behaviorRegion(RootMotorStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootMotor
	 * @details The Member RootMotorStateChart::currentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootMotorStateChart whose Region shall be initialized
	 */
		void initializeROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmissionRegion(RootMotorStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution of the Realtime-StateChart: RootMotor
	 * @details The Member RootMotorStateChart::currentStateOfROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution_ApiExecution is initialized
	 * 
	 * @param stateChart The specific RootMotorStateChart whose Region shall be initialized
	 */
		void initializeROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecutionRegion(RootMotorStateChart* stateChart);
	/**
	 * @brief Destroys the Realtime-StateChart: RootMotor
	 * @details Frees the Memory for the struct RootMotorStateChart
	 * 
	 * @param rtsc The specific RootMotorStateChart to be destroyed
	 */	
		void RootMotorStateChart_destroy(RootMotorStateChart* rtsc);		
	/**
	 * @brief Executes the next Step of the Realtime-StateChart: RootMotor
	 * 
	 * @param rtsc The specific RootMotorStateChart to be executed
	 */	
	void RootMotorStateChart_processStep(RootMotorStateChart* rtsc);

	/**
	 * @brief Leaves the Region: Motor_velocity_behavior of the Realtime-StateChart: RootMotor
	 * @details This method is called, whenever a the Region: Motor_velocity_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootMotorStateChart whose Region: Motor_velocity_behavior shall be exit
	 */
		void ROOTMOTOR_MOTOR_STATE_STATE_Motor_velocity_behavior_Motor_velocity_behaviorStateChart_exit(RootMotorStateChart* rtsc);
	/**
	 * @brief Leaves the Region: ApiExecution of the Realtime-StateChart: RootMotor
	 * @details This method is called, whenever a the Region: ApiExecution is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootMotorStateChart whose Region: ApiExecution shall be exit
	 */
		void ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_ApiExecution_ApiExecutionStateChart_exit(RootMotorStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootMotor
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootMotorStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTMOTOR_MOTOR_STATE_STATE_MOTOR_VELOCITY_BEHAVIOR_MOTOR_VELOCITY_BEHAVIOR_VELOCITY_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootMotorStateChart* rtsc);
			
	/**
	 * @brief Returns wether the Realtime-StateChart: RootMotor is in a specific State
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootMotorStateChart
	 * @param state One of the States of the Enum: RootMotorState
	 * 
	 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
	 * @todo  Why is this int and not bool, like everywhere else
	 */	
		int RootMotorStateChart_isInState(RootMotorStateChart* rtsc, RootMotorState state);
	/**
	 * @brief Checks if the execution of the Realtime-StateChart: RootMotor  is terminated
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootMotorStateChart
	 * @return Always True
	 * @todo  always true is returned
	 */	
	bool RootMotorStateChart_isTerminated(RootMotorStateChart* rtsc);

#endif /* ROOTMOTORSTATECHART_H_ */
