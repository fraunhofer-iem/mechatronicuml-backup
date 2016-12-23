/**
 * @file 
 * @author generated
 * @brief Specification of Realtime-StateChart: MainRootRTSC
 * @details This files contains the description of the Realtime-StateChart: MainRootRTSC and its behavior which is executed
 */
#ifndef MAINROOTRTSCSTATECHART_H_
#define MAINROOTRTSCSTATECHART_H_
#ifdef __cplusplus
  extern "C" {
#endif
#include "clock.h"
#include "Debug.h"
	#include "standardTypes.h"
	#include "customTypes.h"
#include "MiddlewareTypes.h"
#include "MiddlewareCore.h"
#include "mainComponent.h"
//ENUM
	/** 
	 * @brief This enum represents the States of the Realtime-StateChart: MainRootRTSC
	 */
		typedef enum {
			MAINROOTRTSC_INACTIVE,
			STATE_MAININIT /**< Represents the State: STATE_MAININIT of the Realtime-StateChart: MainRootRTSC */
			,
					STATE_MAININITLED_OFF /**< Represents the State: STATE_MAININITLED_OFF of the Realtime-StateChart: MainInit */
			,		STATE_MAININITLED_ON /**< Represents the State: STATE_MAININITLED_ON of the Realtime-StateChart: MainInit */	
		}MainRootRTSCState;
	
	
		/**
		 * 
		 * @brief Description of the Realtime-StateChart: MainRootRTSC
		 * @details This struct represents the  Realtime-StateChart: MainRootRTSC and its States
		 */
	struct MainRootRTSCStateChart {	
			MainComponent * parentComponent;/**< A pointer to the parent ComponentInstance of Type: MainComponent , which has this Realtime-StateChart as its behavior */			
	
	
						MainRootRTSCState currentStateOfMainRootRTSC;/**< The current State of the Realtime-StateChart: MainRootRTSC */
	
				MainRootRTSCState currentStateOfMainInit;/**< Represents the state of region: MainInit */
	
			bool_t MainRootRTSC_isExecutable;/**< Execution Verifier of RTSC: MainRootRTSC. This variable is used to ensure that a RTSC is executed only once per execution cycle */
				bool_t MainInit_isExecutable;/**< Execution Verifier of RTSC: MainInit. This variable is used to ensure that a RTSC is executed only once per execution cycle */
		
				Clock mainInitChangingClockMainInitClock;/**< The Clock: MainInitChangingClockMainInit */
	
	
		
	
	
					int8_T LED_voltage;
	
	
			
	
		} ;

//METHOD STUBS
	/**
	 * @brief Creates an Instance of the Realtime-StateChart: MainRootRTSC
	 * @details Allocates Memory for the struct MainRootRTSCStateChart
	 * 
	 * @param parentComponent An Instance of the Component: MainComponent which behavior is described via this Realtime-StateChart
	 * @return A Pointer to the new created MainRootRTSCStateChart
	 */
		MainRootRTSCStateChart* MainRootRTSCStateChart_create(MainComponent* parentComponent);
	/**
	 * @brief Initializes an Instance of the Realtime-StateChart: MainRootRTSC
	 * @details All struct members of the struct MainRootRTSCStateChart are initialized,
	 *			and all Regions of the Realtime-StateChart are initialized, too.
	 * 
	 * @param rtsc The specific MainRootRTSCStateChart to be initialized
	 */
		void MainRootRTSCStateChart_initialize(MainRootRTSCStateChart* rtsc);
	/**
	 * @brief Initializes the Region: MainInit of the Realtime-StateChart: MainRootRTSC
	 * @details The Member MainRootRTSCStateChart::currentStateOfMainInit is initialized
	 * 
	 * @param stateChart The specific MainRootRTSCStateChart whose Region shall be initialized
	 */
	
		void initializeMainInitRegion(MainRootRTSCStateChart* stateChart);
	/**
	 * @brief Destroys the Realtime-StateChart: MainRootRTSC
	 * @details Frees the Memory for the struct MainRootRTSCStateChart
	 * 
	 * @param rtsc The specific MainRootRTSCStateChart to be destroyed
	 */	
		void MainRootRTSCStateChart_destroy(MainRootRTSCStateChart* rtsc);		
	/**
	 * @brief Executes the next Step of the Realtime-StateChart: MainRootRTSC
	 * 
	 * @param rtsc The specific MainRootRTSCStateChart to be executed
	 */	
		void MainRootRTSCStateChart_processStep(MainRootRTSCStateChart* rtsc);

	/**
	 * @brief Leaves the Region: Main of the Realtime-StateChart: MainRootRTSC
	 * @details This method is called, whenever a the Region: Main is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific MainRootRTSCStateChart whose Region: Main shall be exit
	 */
		void MainInitStateChart_exit(MainRootRTSCStateChart* rtsc);
			
	/**
	 * @brief Returns wether the Realtime-StateChart: MainRootRTSC is in a specific State
	 * 
	 * @param rtsc The specific Realtime-StateChart: MainRootRTSCStateChart
	 * @param state One of the States of the Enum: MainRootRTSCState
	 * 
	 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
	 * @todo  Why is this int and not bool, like everywhere else
	 */	
		bool_t MainRootRTSCStateChart_isInState(MainRootRTSCStateChart* rtsc, MainRootRTSCState state);
	/**
	 * @brief Checks if the execution of the Realtime-StateChart: MainRootRTSC  is terminated
	 * 
	 * @param rtsc The specific Realtime-StateChart: MainRootRTSCStateChart
	 * @return Always True
	 * @todo  always true is returned
	 */
		bool_t MainRootRTSCStateChart_isTerminated(MainRootRTSCStateChart* rtsc);


#ifdef __cplusplus
  }
#endif
#endif /* MAINROOTRTSCSTATECHART_H_ */
