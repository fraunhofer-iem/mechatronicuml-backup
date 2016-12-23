/**
 * @file 
 * @author generated
 * @brief Specification of Realtime-StateChart: RootDistance
 * @details This files contains the description of the Realtime-StateChart: RootDistance and its behavior which is executed
 */

#ifndef ROOTDISTANCESTATECHART_H_
#define ROOTDISTANCESTATECHART_H_

#include "../lib/clock.h"
#include "../lib/syncChannel.h"
#include "../lib/MiddlewareTypes.h"
#include "../Middleware/MiddlewareCore.h"
#include "../components/distanceComponent.h"
#include "../operations/operations.h"
#include "../apiCallCode/implementations.h"
//ENUM
	/** 
	 * @brief This enum represents the States of the Realtime-StateChart: RootDistance
	 */
		typedef enum {
				ROOTDISTANCE_DISTANCE_STATE_STATE /**< Represents the State: ROOTDISTANCE_DISTANCE_STATE_STATE of the Realtime-StateChart: RootDistance */
				,
						ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE /**< Represents the State: ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE of the Realtime-StateChart: ROOTDISTANCE_DISTANCE_STATE_STATE_Distance_distance_behavior_Distance_distance_behavior */
						,
								ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE /**< Represents the State: ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE of the Realtime-StateChart: ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
						,		ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECINITCOMMAND_STATE /**< Represents the State: ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECINITCOMMAND_STATE of the Realtime-StateChart: ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution_ApiExecution */ 
						,		ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE /**< Represents the State: ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE of the Realtime-StateChart: ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution_ApiExecution */	 
		}RootDistanceState;
	
	
		/**
		 * 
		 * @brief Description of the Realtime-StateChart: RootDistance
		 * @details This struct represents the  Realtime-StateChart: RootDistance and its States
		 */
	struct RootDistanceStateChart {	
			DistanceComponent * parentComponent; /**< A pointer to the parent ComponentInstance of Type: DistanceComponent , which has this Realtime-StateChart as its behavior */			
	
	
			RootDistanceState currentStateOfRootDistance; /**< The current State of the Realtime-StateChart: RootDistance */
	
				RootDistanceState currentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_Distance_distance_behavior_Distance_distance_behavior; /**< Represents the State: ROOTDISTANCE_DISTANCE_STATE_STATE_Distance_distance_behavior of the Realtime-StateChart: RootDistance */
				RootDistanceState currentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootDistance */
				RootDistanceState currentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution_ApiExecution; /**< Represents the State: ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution of the Realtime-StateChart: RootDistance */
			
		
				Clock clockSending_ofcurrentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: clockSending_ofcurrentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
				Clock _apiClock_ofcurrentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution_ApiExecutionClock; /**< The Clock: _apiClock_ofcurrentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution_ApiExecution */
		
			
		
		
	
			
				int distance_apiValue; /**< The Realtime-StateChart Variable: distance_apiValue of Type: INT */
				int TimeBetweenApiExececutions; /**< The Realtime-StateChart Variable: TimeBetweenApiExececutions of Type: INT */
		
	
	
	
							void (*initApi)(); /**< A Function Pointer to the API-Call: initApi */
							int (*execApi)(); /**< A Function Pointer to the API-Call: execApi */
		} ;

//METHOD STUBS
	/**
	 * @brief Creates an Instance of the Realtime-StateChart: RootDistance
	 * @details Allocates Memory for the struct RootDistanceStateChart
	 * 
	 * @param parentComponent An Instance of the Component: DistanceComponent which behavior is described via this Realtime-StateChart
	 * @return A Pointer to the new created RootDistanceStateChart
	 */
		RootDistanceStateChart* RootDistanceStateChart_create(DistanceComponent* parentComponent);
	/**
	 * @brief Initializes an Instance of the Realtime-StateChart: RootDistance
	 * @details All struct members of the struct RootDistanceStateChart are initialized,
	 *			and all Regions of the Realtime-StateChart are initialized, too.
	 * 
	 * @param rtsc The specific RootDistanceStateChart to be initialized
	 */
		void RootDistanceStateChart_initialize(RootDistanceStateChart* rtsc);
	/**
	 * @brief Initializes the Region: ROOTDISTANCE_DISTANCE_STATE_STATE_Distance_distance_behavior of the Realtime-StateChart: RootDistance
	 * @details The Member RootDistanceStateChart::currentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_Distance_distance_behavior_Distance_distance_behavior is initialized
	 * 
	 * @param stateChart The specific RootDistanceStateChart whose Region shall be initialized
	 */
		void initializeROOTDISTANCE_DISTANCE_STATE_STATE_Distance_distance_behaviorRegion(RootDistanceStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootDistance
	 * @details The Member RootDistanceStateChart::currentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootDistanceStateChart whose Region shall be initialized
	 */
		void initializeROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmissionRegion(RootDistanceStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution of the Realtime-StateChart: RootDistance
	 * @details The Member RootDistanceStateChart::currentStateOfROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution_ApiExecution is initialized
	 * 
	 * @param stateChart The specific RootDistanceStateChart whose Region shall be initialized
	 */
		void initializeROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecutionRegion(RootDistanceStateChart* stateChart);
	/**
	 * @brief Destroys the Realtime-StateChart: RootDistance
	 * @details Frees the Memory for the struct RootDistanceStateChart
	 * 
	 * @param rtsc The specific RootDistanceStateChart to be destroyed
	 */	
		void RootDistanceStateChart_destroy(RootDistanceStateChart* rtsc);		
	/**
	 * @brief Executes the next Step of the Realtime-StateChart: RootDistance
	 * 
	 * @param rtsc The specific RootDistanceStateChart to be executed
	 */	
	void RootDistanceStateChart_processStep(RootDistanceStateChart* rtsc);

	/**
	 * @brief Leaves the Region: Distance_distance_behavior of the Realtime-StateChart: RootDistance
	 * @details This method is called, whenever a the Region: Distance_distance_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootDistanceStateChart whose Region: Distance_distance_behavior shall be exit
	 */
		void ROOTDISTANCE_DISTANCE_STATE_STATE_Distance_distance_behavior_Distance_distance_behaviorStateChart_exit(RootDistanceStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootDistance
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootDistanceStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootDistanceStateChart* rtsc);
	/**
	 * @brief Leaves the Region: ApiExecution of the Realtime-StateChart: RootDistance
	 * @details This method is called, whenever a the Region: ApiExecution is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootDistanceStateChart whose Region: ApiExecution shall be exit
	 */
		void ROOTDISTANCE_DISTANCE_STATE_STATE_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_ApiExecution_ApiExecutionStateChart_exit(RootDistanceStateChart* rtsc);
			
	/**
	 * @brief Returns wether the Realtime-StateChart: RootDistance is in a specific State
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootDistanceStateChart
	 * @param state One of the States of the Enum: RootDistanceState
	 * 
	 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
	 * @todo  Why is this int and not bool, like everywhere else
	 */	
		int RootDistanceStateChart_isInState(RootDistanceStateChart* rtsc, RootDistanceState state);
	/**
	 * @brief Checks if the execution of the Realtime-StateChart: RootDistance  is terminated
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootDistanceStateChart
	 * @return Always True
	 * @todo  always true is returned
	 */	
	bool RootDistanceStateChart_isTerminated(RootDistanceStateChart* rtsc);

#endif /* ROOTDISTANCESTATECHART_H_ */
