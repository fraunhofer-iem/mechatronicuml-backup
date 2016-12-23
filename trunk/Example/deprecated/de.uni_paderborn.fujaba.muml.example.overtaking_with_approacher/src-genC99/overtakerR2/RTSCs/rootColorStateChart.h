/**
 * @file 
 * @author generated
 * @brief Specification of Realtime-StateChart: RootColor
 * @details This files contains the description of the Realtime-StateChart: RootColor and its behavior which is executed
 */

#ifndef ROOTCOLORSTATECHART_H_
#define ROOTCOLORSTATECHART_H_

#include "../lib/clock.h"
#include "../lib/syncChannel.h"
#include "../lib/MiddlewareTypes.h"
#include "../Middleware/MiddlewareCore.h"
#include "../components/colorComponent.h"
#include "../operations/operations.h"
#include "../apiCallCode/implementations.h"
//ENUM
	/** 
	 * @brief This enum represents the States of the Realtime-StateChart: RootColor
	 */
		typedef enum {
				ROOTCOLOR_COLOR_STATE_STATE /**< Represents the State: ROOTCOLOR_COLOR_STATE_STATE of the Realtime-StateChart: RootColor */
				,
						ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE /**< Represents the State: ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE of the Realtime-StateChart: ROOTCOLOR_COLOR_STATE_STATE_Color_color_behavior_Color_color_behavior */
						,
								ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE /**< Represents the State: ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE of the Realtime-StateChart: ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */ 
						,		ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECINITCOMMAND_STATE /**< Represents the State: ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECINITCOMMAND_STATE of the Realtime-StateChart: ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution_ApiExecution */ 
						,		ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE /**< Represents the State: ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_APIEXECUTION_APIEXECUTION_EXECEXECCOMMAND_STATE of the Realtime-StateChart: ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution_ApiExecution */	 
		}RootColorState;
	
	
		/**
		 * 
		 * @brief Description of the Realtime-StateChart: RootColor
		 * @details This struct represents the  Realtime-StateChart: RootColor and its States
		 */
	struct RootColorStateChart {	
			ColorComponent * parentComponent; /**< A pointer to the parent ComponentInstance of Type: ColorComponent , which has this Realtime-StateChart as its behavior */			
	
	
			RootColorState currentStateOfRootColor; /**< The current State of the Realtime-StateChart: RootColor */
	
				RootColorState currentStateOfROOTCOLOR_COLOR_STATE_STATE_Color_color_behavior_Color_color_behavior; /**< Represents the State: ROOTCOLOR_COLOR_STATE_STATE_Color_color_behavior of the Realtime-StateChart: RootColor */
				RootColorState currentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission; /**< Represents the State: ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootColor */
				RootColorState currentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution_ApiExecution; /**< Represents the State: ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution of the Realtime-StateChart: RootColor */
			
		
				Clock clockSending_ofcurrentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock; /**< The Clock: clockSending_ofcurrentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission */
				Clock _apiClock_ofcurrentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution_ApiExecutionClock; /**< The Clock: _apiClock_ofcurrentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution_ApiExecution */
		
			
		
		
	
			
				int color_apiValue; /**< The Realtime-StateChart Variable: color_apiValue of Type: INT */
				int TimeBetweenApiExececutions; /**< The Realtime-StateChart Variable: TimeBetweenApiExececutions of Type: INT */
		
	
	
	
							void (*initApi)(); /**< A Function Pointer to the API-Call: initApi */
							int (*execApi)(); /**< A Function Pointer to the API-Call: execApi */
		} ;

//METHOD STUBS
	/**
	 * @brief Creates an Instance of the Realtime-StateChart: RootColor
	 * @details Allocates Memory for the struct RootColorStateChart
	 * 
	 * @param parentComponent An Instance of the Component: ColorComponent which behavior is described via this Realtime-StateChart
	 * @return A Pointer to the new created RootColorStateChart
	 */
		RootColorStateChart* RootColorStateChart_create(ColorComponent* parentComponent);
	/**
	 * @brief Initializes an Instance of the Realtime-StateChart: RootColor
	 * @details All struct members of the struct RootColorStateChart are initialized,
	 *			and all Regions of the Realtime-StateChart are initialized, too.
	 * 
	 * @param rtsc The specific RootColorStateChart to be initialized
	 */
		void RootColorStateChart_initialize(RootColorStateChart* rtsc);
	/**
	 * @brief Initializes the Region: ROOTCOLOR_COLOR_STATE_STATE_Color_color_behavior of the Realtime-StateChart: RootColor
	 * @details The Member RootColorStateChart::currentStateOfROOTCOLOR_COLOR_STATE_STATE_Color_color_behavior_Color_color_behavior is initialized
	 * 
	 * @param stateChart The specific RootColorStateChart whose Region shall be initialized
	 */
		void initializeROOTCOLOR_COLOR_STATE_STATE_Color_color_behaviorRegion(RootColorStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission of the Realtime-StateChart: RootColor
	 * @details The Member RootColorStateChart::currentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission is initialized
	 * 
	 * @param stateChart The specific RootColorStateChart whose Region shall be initialized
	 */
		void initializeROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmissionRegion(RootColorStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution of the Realtime-StateChart: RootColor
	 * @details The Member RootColorStateChart::currentStateOfROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution_ApiExecution is initialized
	 * 
	 * @param stateChart The specific RootColorStateChart whose Region shall be initialized
	 */
		void initializeROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecutionRegion(RootColorStateChart* stateChart);
	/**
	 * @brief Destroys the Realtime-StateChart: RootColor
	 * @details Frees the Memory for the struct RootColorStateChart
	 * 
	 * @param rtsc The specific RootColorStateChart to be destroyed
	 */	
		void RootColorStateChart_destroy(RootColorStateChart* rtsc);		
	/**
	 * @brief Executes the next Step of the Realtime-StateChart: RootColor
	 * 
	 * @param rtsc The specific RootColorStateChart to be executed
	 */	
	void RootColorStateChart_processStep(RootColorStateChart* rtsc);

	/**
	 * @brief Leaves the Region: ApiExecution of the Realtime-StateChart: RootColor
	 * @details This method is called, whenever a the Region: ApiExecution is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootColorStateChart whose Region: ApiExecution shall be exit
	 */
		void ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_ApiExecution_ApiExecutionStateChart_exit(RootColorStateChart* rtsc);
	/**
	 * @brief Leaves the Region: PeriodicTransmission of the Realtime-StateChart: RootColor
	 * @details This method is called, whenever a the Region: PeriodicTransmission is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootColorStateChart whose Region: PeriodicTransmission shall be exit
	 */
		void ROOTCOLOR_COLOR_STATE_STATE_COLOR_COLOR_BEHAVIOR_COLOR_COLOR_BEHAVIOR_COLOR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(RootColorStateChart* rtsc);
	/**
	 * @brief Leaves the Region: Color_color_behavior of the Realtime-StateChart: RootColor
	 * @details This method is called, whenever a the Region: Color_color_behavior is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootColorStateChart whose Region: Color_color_behavior shall be exit
	 */
		void ROOTCOLOR_COLOR_STATE_STATE_Color_color_behavior_Color_color_behaviorStateChart_exit(RootColorStateChart* rtsc);
			
	/**
	 * @brief Returns wether the Realtime-StateChart: RootColor is in a specific State
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootColorStateChart
	 * @param state One of the States of the Enum: RootColorState
	 * 
	 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
	 * @todo  Why is this int and not bool, like everywhere else
	 */	
		int RootColorStateChart_isInState(RootColorStateChart* rtsc, RootColorState state);
	/**
	 * @brief Checks if the execution of the Realtime-StateChart: RootColor  is terminated
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootColorStateChart
	 * @return Always True
	 * @todo  always true is returned
	 */	
	bool RootColorStateChart_isTerminated(RootColorStateChart* rtsc);

#endif /* ROOTCOLORSTATECHART_H_ */
