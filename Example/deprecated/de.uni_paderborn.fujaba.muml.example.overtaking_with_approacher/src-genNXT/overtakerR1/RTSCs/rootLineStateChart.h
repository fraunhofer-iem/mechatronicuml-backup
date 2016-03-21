/**
 * @file 
 * @author generated
 * @brief Specification of Realtime-StateChart: RootLine
 * @details This files contains the description of the Realtime-StateChart: RootLine and its behavior which is executed
 */

#ifndef ROOTLINESTATECHART_H_
#define ROOTLINESTATECHART_H_

#include "../lib/clock.h"
#include "../lib/syncChannel.h"
#include "../lib/MiddlewareTypes.h"
#include "../Middleware/MiddlewareCore.h"
#include "../components/lineComponent.h"
#include "../operations/operations.h"
#include "../apiCallCode/implementations.h"
//ENUM
	/** 
	 * @brief This enum represents the States of the Realtime-StateChart: RootLine
	 */
		typedef enum {
				ROOTLINE_LINE_STATE_STATE /**< Represents the State: ROOTLINE_LINE_STATE_STATE of the Realtime-StateChart: RootLine */
				,
						ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE /**< Represents the State: ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE of the Realtime-StateChart: ROOTLINE_LINE_STATE_STATE_Line_lineLight_behavior_Line_lineLight_behavior */
						,
								ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE /**< Represents the State: ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE of the Realtime-StateChart: ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
						,		ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECINITCOMMAND_STATE /**< Represents the State: ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECINITCOMMAND_STATE of the Realtime-StateChart: ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution_ApiExecution */ 
						,		ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE /**< Represents the State: ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE of the Realtime-StateChart: ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution_ApiExecution */	 
		}RootLineState;
	
	
		/**
		 * 
		 * @brief Description of the Realtime-StateChart: RootLine
		 * @details This struct represents the  Realtime-StateChart: RootLine and its States
		 */
	struct RootLineStateChart {	
			LineComponent * parentComponent; /**< A pointer to the parent ComponentInstance of Type: LineComponent , which has this Realtime-StateChart as its behavior */			
	
	
			RootLineState currentStateOfRootLine; /**< The current State of the Realtime-StateChart: RootLine */
	
				RootLineState currentStateOfROOTLINE_LINE_STATE_STATE_Line_lineLight_behavior_Line_lineLight_behavior; /**< Represents the State: ROOTLINE_LINE_STATE_STATE_Line_lineLight_behavior of the Realtime-StateChart: RootLine */
				RootLineState currentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootLine */
				RootLineState currentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution_ApiExecution; /**< Represents the State: ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution of the Realtime-StateChart: RootLine */
			
		
				Clock clockSending_ofcurrentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: clockSending_ofcurrentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
				Clock _apiClock_ofcurrentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution_ApiExecutionClock; /**< The Clock: _apiClock_ofcurrentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution_ApiExecution */
		
			
		
		
	
			
				int lineLight_apiValue; /**< The Realtime-StateChart Variable: lineLight_apiValue of Type: INT */
				int TimeBetweenApiExececutions; /**< The Realtime-StateChart Variable: TimeBetweenApiExececutions of Type: INT */
		
	
	
	
							void (*initApi)(); /**< A Function Pointer to the API-Call: initApi */
							int (*execApi)(); /**< A Function Pointer to the API-Call: execApi */
		} ;

//METHOD STUBS
	/**
	 * @brief Creates an Instance of the Realtime-StateChart: RootLine
	 * @details Allocates Memory for the struct RootLineStateChart
	 * 
	 * @param parentComponent An Instance of the Component: LineComponent which behavior is described via this Realtime-StateChart
	 * @return A Pointer to the new created RootLineStateChart
	 */
		RootLineStateChart* RootLineStateChart_create(LineComponent* parentComponent);
	/**
	 * @brief Initializes an Instance of the Realtime-StateChart: RootLine
	 * @details All struct members of the struct RootLineStateChart are initialized,
	 *			and all Regions of the Realtime-StateChart are initialized, too.
	 * 
	 * @param rtsc The specific RootLineStateChart to be initialized
	 */
		void RootLineStateChart_initialize(RootLineStateChart* rtsc);
	/**
	 * @brief Initializes the Region: ROOTLINE_LINE_STATE_STATE_Line_lineLight_behavior of the Realtime-StateChart: RootLine
	 * @details The Member RootLineStateChart::currentStateOfROOTLINE_LINE_STATE_STATE_Line_lineLight_behavior_Line_lineLight_behavior is initialized
	 * 
	 * @param stateChart The specific RootLineStateChart whose Region shall be initialized
	 */
		void initializeROOTLINE_LINE_STATE_STATE_Line_lineLight_behaviorRegion(RootLineStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootLine
	 * @details The Member RootLineStateChart::currentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootLineStateChart whose Region shall be initialized
	 */
		void initializeROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmissionRegion(RootLineStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution of the Realtime-StateChart: RootLine
	 * @details The Member RootLineStateChart::currentStateOfROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution_ApiExecution is initialized
	 * 
	 * @param stateChart The specific RootLineStateChart whose Region shall be initialized
	 */
		void initializeROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecutionRegion(RootLineStateChart* stateChart);
	/**
	 * @brief Destroys the Realtime-StateChart: RootLine
	 * @details Frees the Memory for the struct RootLineStateChart
	 * 
	 * @param rtsc The specific RootLineStateChart to be destroyed
	 */	
		void RootLineStateChart_destroy(RootLineStateChart* rtsc);		
	/**
	 * @brief Executes the next Step of the Realtime-StateChart: RootLine
	 * 
	 * @param rtsc The specific RootLineStateChart to be executed
	 */	
	void RootLineStateChart_processStep(RootLineStateChart* rtsc);

	/**
	 * @brief Leaves the Region: ApiExecution of the Realtime-StateChart: RootLine
	 * @details This method is called, whenever a the Region: ApiExecution is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootLineStateChart whose Region: ApiExecution shall be exit
	 */
		void ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_ApiExecution_ApiExecutionStateChart_exit(RootLineStateChart* rtsc);
	/**
	 * @brief Leaves the Region: Line_lineLight_behavior of the Realtime-StateChart: RootLine
	 * @details This method is called, whenever a the Region: Line_lineLight_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootLineStateChart whose Region: Line_lineLight_behavior shall be exit
	 */
		void ROOTLINE_LINE_STATE_STATE_Line_lineLight_behavior_Line_lineLight_behaviorStateChart_exit(RootLineStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootLine
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootLineStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTLINE_LINE_STATE_STATE_LINE_LINELIGHT_BEHAVIOR_LINE_LINELIGHT_BEHAVIOR_LINELIGHT_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootLineStateChart* rtsc);
			
	/**
	 * @brief Returns wether the Realtime-StateChart: RootLine is in a specific State
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootLineStateChart
	 * @param state One of the States of the Enum: RootLineState
	 * 
	 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
	 * @todo  Why is this int and not bool, like everywhere else
	 */	
		int RootLineStateChart_isInState(RootLineStateChart* rtsc, RootLineState state);
	/**
	 * @brief Checks if the execution of the Realtime-StateChart: RootLine  is terminated
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootLineStateChart
	 * @return Always True
	 * @todo  always true is returned
	 */	
	bool RootLineStateChart_isTerminated(RootLineStateChart* rtsc);

#endif /* ROOTLINESTATECHART_H_ */
