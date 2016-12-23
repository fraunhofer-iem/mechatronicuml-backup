/**
 * @file 
 * @author generated
 * @brief Specification of Realtime-StateChart: RootsectionControlRTSC
 * @details This files contains the description of the Realtime-StateChart: RootsectionControlRTSC and its behavior which is executed
 */

#ifndef ROOTSECTIONCONTROLRTSCSTATECHART_H_
#define ROOTSECTIONCONTROLRTSCSTATECHART_H_

#include "../lib/clock.h"
#include "../lib/syncChannel.h"
#include "../lib/MiddlewareTypes.h"
#include "../Middleware/MiddlewareCore.h"
#include "../components/sectionControlComponent.h"
//ENUM
	/** 
	 * @brief This enum represents the States of the Realtime-StateChart: RootsectionControlRTSC
	 */
		typedef enum {
				ROOTSECTIONCONTROLRTSC_INIT_STATE /**< Represents the State: ROOTSECTIONCONTROLRTSC_INIT_STATE of the Realtime-StateChart: RootsectionControlRTSC */
				,
						ROOTSECTIONCONTROLRTSC_INIT_STATE_SECTIONOVERTAKEEPORTRTSC_SECTIONOVERTAKEEPORTRTSC_INIT_STATE /**< Represents the State: ROOTSECTIONCONTROLRTSC_INIT_STATE_SECTIONOVERTAKEEPORTRTSC_SECTIONOVERTAKEEPORTRTSC_INIT_STATE of the Realtime-StateChart: ROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakeePortRTSC_sectionOvertakeePortRTSC */ 
				,		ROOTSECTIONCONTROLRTSC_INIT_STATE_SECTIONOVERTAKERPORTRTSC_SECTIONOVERTAKERPORTRTSC_INIT_STATE /**< Represents the State: ROOTSECTIONCONTROLRTSC_INIT_STATE_SECTIONOVERTAKERPORTRTSC_SECTIONOVERTAKERPORTRTSC_INIT_STATE of the Realtime-StateChart: ROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakerPortRTSC_sectionOvertakerPortRTSC */ 
				,		ROOTSECTIONCONTROLRTSC_INIT_STATE_SECTIONAPPROACHERPORTRTSC_SECTIONAPPROACHERPORTRTSC_INIT_STATE /**< Represents the State: ROOTSECTIONCONTROLRTSC_INIT_STATE_SECTIONAPPROACHERPORTRTSC_SECTIONAPPROACHERPORTRTSC_INIT_STATE of the Realtime-StateChart: ROOTSECTIONCONTROLRTSC_INIT_STATE_sectionApproacherPortRTSC_sectionApproacherPortRTSC */ 
				,		ROOTSECTIONCONTROLRTSC_INIT_STATE_CONTROLLERPORTRTSC_CONTROLLERPORTRTSC_INIT_STATE /**< Represents the State: ROOTSECTIONCONTROLRTSC_INIT_STATE_CONTROLLERPORTRTSC_CONTROLLERPORTRTSC_INIT_STATE of the Realtime-StateChart: ROOTSECTIONCONTROLRTSC_INIT_STATE_controllerPortRTSC_controllerPortRTSC */ 
				,		ROOTSECTIONCONTROLRTSC_INIT_STATE_CONTROLLERPORTRTSC_CONTROLLERPORTRTSC_REQUESTED_STATE /**< Represents the State: ROOTSECTIONCONTROLRTSC_INIT_STATE_CONTROLLERPORTRTSC_CONTROLLERPORTRTSC_REQUESTED_STATE of the Realtime-StateChart: ROOTSECTIONCONTROLRTSC_INIT_STATE_controllerPortRTSC_controllerPortRTSC */	 
		}RootsectionControlRTSCState;
	
	
		/**
		 * 
		 * @brief Description of the Realtime-StateChart: RootsectionControlRTSC
		 * @details This struct represents the  Realtime-StateChart: RootsectionControlRTSC and its States
		 */
	struct RootsectionControlRTSCStateChart {	
			SectionControlComponent * parentComponent; /**< A pointer to the parent ComponentInstance of Type: SectionControlComponent , which has this Realtime-StateChart as its behavior */			
	
	
			RootsectionControlRTSCState currentStateOfRootsectionControlRTSC; /**< The current State of the Realtime-StateChart: RootsectionControlRTSC */
	
				RootsectionControlRTSCState currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakeePortRTSC_sectionOvertakeePortRTSC; /**< Represents the State: ROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakeePortRTSC of the Realtime-StateChart: RootsectionControlRTSC */
				RootsectionControlRTSCState currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakerPortRTSC_sectionOvertakerPortRTSC; /**< Represents the State: ROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakerPortRTSC of the Realtime-StateChart: RootsectionControlRTSC */
				RootsectionControlRTSCState currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_sectionApproacherPortRTSC_sectionApproacherPortRTSC; /**< Represents the State: ROOTSECTIONCONTROLRTSC_INIT_STATE_sectionApproacherPortRTSC of the Realtime-StateChart: RootsectionControlRTSC */
				RootsectionControlRTSCState currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_controllerPortRTSC_controllerPortRTSC; /**< Represents the State: ROOTSECTIONCONTROLRTSC_INIT_STATE_controllerPortRTSC of the Realtime-StateChart: RootsectionControlRTSC */
			
		
		
			
		
		
	
			
				int secIDapproacher; /**< The Realtime-StateChart Variable: secIDapproacher of Type: INT */
				int secIDovertakee; /**< The Realtime-StateChart Variable: secIDovertakee of Type: INT */
				int constNumSecDifference; /**< The Realtime-StateChart Variable: constNumSecDifference of Type: INT */
				int secIDovertaker; /**< The Realtime-StateChart Variable: secIDovertaker of Type: INT */
		
	
	
	
		} ;

//METHOD STUBS
	/**
	 * @brief Creates an Instance of the Realtime-StateChart: RootsectionControlRTSC
	 * @details Allocates Memory for the struct RootsectionControlRTSCStateChart
	 * 
	 * @param parentComponent An Instance of the Component: SectionControlComponent which behavior is described via this Realtime-StateChart
	 * @return A Pointer to the new created RootsectionControlRTSCStateChart
	 */
		RootsectionControlRTSCStateChart* RootsectionControlRTSCStateChart_create(SectionControlComponent* parentComponent);
	/**
	 * @brief Initializes an Instance of the Realtime-StateChart: RootsectionControlRTSC
	 * @details All struct members of the struct RootsectionControlRTSCStateChart are initialized,
	 *			and all Regions of the Realtime-StateChart are initialized, too.
	 * 
	 * @param rtsc The specific RootsectionControlRTSCStateChart to be initialized
	 */
		void RootsectionControlRTSCStateChart_initialize(RootsectionControlRTSCStateChart* rtsc);
	/**
	 * @brief Initializes the Region: ROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakeePortRTSC of the Realtime-StateChart: RootsectionControlRTSC
	 * @details The Member RootsectionControlRTSCStateChart::currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakeePortRTSC_sectionOvertakeePortRTSC is initialized
	 * 
	 * @param stateChart The specific RootsectionControlRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakeePortRTSCRegion(RootsectionControlRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakerPortRTSC of the Realtime-StateChart: RootsectionControlRTSC
	 * @details The Member RootsectionControlRTSCStateChart::currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakerPortRTSC_sectionOvertakerPortRTSC is initialized
	 * 
	 * @param stateChart The specific RootsectionControlRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakerPortRTSCRegion(RootsectionControlRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTSECTIONCONTROLRTSC_INIT_STATE_sectionApproacherPortRTSC of the Realtime-StateChart: RootsectionControlRTSC
	 * @details The Member RootsectionControlRTSCStateChart::currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_sectionApproacherPortRTSC_sectionApproacherPortRTSC is initialized
	 * 
	 * @param stateChart The specific RootsectionControlRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTSECTIONCONTROLRTSC_INIT_STATE_sectionApproacherPortRTSCRegion(RootsectionControlRTSCStateChart* stateChart);
	/**
	 * @brief Initializes the Region: ROOTSECTIONCONTROLRTSC_INIT_STATE_controllerPortRTSC of the Realtime-StateChart: RootsectionControlRTSC
	 * @details The Member RootsectionControlRTSCStateChart::currentStateOfROOTSECTIONCONTROLRTSC_INIT_STATE_controllerPortRTSC_controllerPortRTSC is initialized
	 * 
	 * @param stateChart The specific RootsectionControlRTSCStateChart whose Region shall be initialized
	 */
		void initializeROOTSECTIONCONTROLRTSC_INIT_STATE_controllerPortRTSCRegion(RootsectionControlRTSCStateChart* stateChart);
	/**
	 * @brief Destroys the Realtime-StateChart: RootsectionControlRTSC
	 * @details Frees the Memory for the struct RootsectionControlRTSCStateChart
	 * 
	 * @param rtsc The specific RootsectionControlRTSCStateChart to be destroyed
	 */	
		void RootsectionControlRTSCStateChart_destroy(RootsectionControlRTSCStateChart* rtsc);		
	/**
	 * @brief Executes the next Step of the Realtime-StateChart: RootsectionControlRTSC
	 * 
	 * @param rtsc The specific RootsectionControlRTSCStateChart to be executed
	 */	
	void RootsectionControlRTSCStateChart_processStep(RootsectionControlRTSCStateChart* rtsc);

	/**
	 * @brief Leaves the Region: controllerPortRTSC of the Realtime-StateChart: RootsectionControlRTSC
	 * @details This method is called, whenever a the Region: controllerPortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootsectionControlRTSCStateChart whose Region: controllerPortRTSC shall be exit
	 */
		void ROOTSECTIONCONTROLRTSC_INIT_STATE_controllerPortRTSC_controllerPortRTSCStateChart_exit(RootsectionControlRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: sectionApproacherPortRTSC of the Realtime-StateChart: RootsectionControlRTSC
	 * @details This method is called, whenever a the Region: sectionApproacherPortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootsectionControlRTSCStateChart whose Region: sectionApproacherPortRTSC shall be exit
	 */
		void ROOTSECTIONCONTROLRTSC_INIT_STATE_sectionApproacherPortRTSC_sectionApproacherPortRTSCStateChart_exit(RootsectionControlRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: sectionOvertakerPortRTSC of the Realtime-StateChart: RootsectionControlRTSC
	 * @details This method is called, whenever a the Region: sectionOvertakerPortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootsectionControlRTSCStateChart whose Region: sectionOvertakerPortRTSC shall be exit
	 */
		void ROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakerPortRTSC_sectionOvertakerPortRTSCStateChart_exit(RootsectionControlRTSCStateChart* rtsc);
	/**
	 * @brief Leaves the Region: sectionOvertakeePortRTSC of the Realtime-StateChart: RootsectionControlRTSC
	 * @details This method is called, whenever a the Region: sectionOvertakeePortRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific RootsectionControlRTSCStateChart whose Region: sectionOvertakeePortRTSC shall be exit
	 */
		void ROOTSECTIONCONTROLRTSC_INIT_STATE_sectionOvertakeePortRTSC_sectionOvertakeePortRTSCStateChart_exit(RootsectionControlRTSCStateChart* rtsc);
			
	/**
	 * @brief Returns wether the Realtime-StateChart: RootsectionControlRTSC is in a specific State
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootsectionControlRTSCStateChart
	 * @param state One of the States of the Enum: RootsectionControlRTSCState
	 * 
	 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
	 * @todo  Why is this int and not bool, like everywhere else
	 */	
		int RootsectionControlRTSCStateChart_isInState(RootsectionControlRTSCStateChart* rtsc, RootsectionControlRTSCState state);
	/**
	 * @brief Checks if the execution of the Realtime-StateChart: RootsectionControlRTSC  is terminated
	 * 
	 * @param rtsc The specific Realtime-StateChart: RootsectionControlRTSCStateChart
	 * @return Always True
	 * @todo  always true is returned
	 */	
	bool RootsectionControlRTSCStateChart_isTerminated(RootsectionControlRTSCStateChart* rtsc);

#endif /* ROOTSECTIONCONTROLRTSCSTATECHART_H_ */
