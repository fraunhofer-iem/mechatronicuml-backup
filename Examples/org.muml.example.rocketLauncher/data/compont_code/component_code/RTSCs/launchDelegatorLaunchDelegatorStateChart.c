

		#include "../components/launchDelegatorComponent_Interface.h"
		



		void initializeLaunchDelegatorVerifierPeer_verifierRegion(
				LaunchDelegatorLaunchDelegatorStateChart* stateChart) {
		
			stateChart->currentStateOfLaunchDelegatorVerifierPeer_verifier =
					STATE_LAUNCHDELEGATORVERIFIERPEER_MAIN;
		
			// execute entry actions
			// nothing to do
		
			stateChart->LaunchDelegatorVerifierPeer_verifier_isExecutable = true;
		
		}
		
		void LaunchDelegatorLaunchDelegatorStateChart_initialize(
				LaunchDelegatorLaunchDelegatorStateChart* stateChart) {
		
			stateChart->currentStateOfLaunchDelegatorLaunchDelegator =
					STATE_LAUNCHDELEGATORLAUNCHDELEGATOR_MAIN;
		
			// execute entry actions
			// nothing to do
		
			initializeLaunchDelegatorVerifierPeer_verifierRegion(stateChart);
		}
		
		

		LaunchDelegatorLaunchDelegatorStateChart* LaunchDelegatorLaunchDelegatorStateChart_create(
				LaunchDelegatorComponent* parentComponent) {
			LaunchDelegatorLaunchDelegatorStateChart* stateChart =
					(LaunchDelegatorLaunchDelegatorStateChart*) malloc(
							sizeof(LaunchDelegatorLaunchDelegatorStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
				if (stateChart->parentComponent != NULL) {
					LaunchDelegatorLaunchDelegatorStateChart_initialize(stateChart);
				} else {
		
					LaunchDelegatorLaunchDelegatorStateChart_destroy(stateChart);
					stateChart = NULL;
				}
			} else {
		
			}
			return stateChart;
		}
		

			void LaunchDelegatorLaunchDelegatorStateChart_destroy(LaunchDelegatorLaunchDelegatorStateChart* stateChart) {
				if(stateChart != NULL) {
		
		
					free(stateChart);
				}
			}


		
		void LaunchDelegatorVerifierPeer_verifierStateChart_processStep(
				LaunchDelegatorLaunchDelegatorStateChart* stateChart) {
			switch (stateChart->currentStateOfLaunchDelegatorVerifierPeer_verifier) {
			case STATE_LAUNCHDELEGATORVERIFIERPEER_MAIN:
				if (1
		
				) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					//create new Parameter struct for M1LaunchCode_M1_Message
					M1LaunchCode_M1_Message msg_M1LaunchCode;
					msg_M1LaunchCode.id = stateChart->code;
		
					//send Message
					MCC_LaunchDelegatorComponent_verifier_send_M1LaunchCode_M1_Message(
							&(stateChart->parentComponent->verifierPort),
							&msg_M1LaunchCode);
		#ifdef DEBUG
					printDebugInformation("LaunchDelegator sent message of type M1LaunchCode");
		#endif		
		
					//release all created received events
					//release all created sent events
					//free(msg);
					// change the state
					stateChart->currentStateOfLaunchDelegatorVerifierPeer_verifier =
							STATE_LAUNCHDELEGATORVERIFIERPEER_MAIN;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchDelegatorVerifierPeer_verifier switched state to STATE_LAUNCHDELEGATORVERIFIERPEER_MAIN" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else {
		
				}
				break;
			default:
				break;
			}
			stateChart->LaunchDelegatorVerifierPeer_verifier_isExecutable = false;
		}
		
		void LaunchDelegatorLaunchDelegatorStateChart_processStep(
				LaunchDelegatorLaunchDelegatorStateChart* stateChart) {
			switch (stateChart->currentStateOfLaunchDelegatorLaunchDelegator) {
			case STATE_LAUNCHDELEGATORLAUNCHDELEGATOR_MAIN:
		
				if (stateChart->LaunchDelegatorVerifierPeer_verifier_isExecutable)
					LaunchDelegatorVerifierPeer_verifierStateChart_processStep(
							stateChart);
		
				break;
			default:
				break;
			}
			stateChart->LaunchDelegatorLaunchDelegator_isExecutable = false;
		}
		
		
		void LaunchDelegatorVerifierPeer_verifierStateChart_exit(
				LaunchDelegatorLaunchDelegatorStateChart* stateChart) {
			switch (stateChart->currentStateOfLaunchDelegatorVerifierPeer_verifier) {
			case STATE_LAUNCHDELEGATORVERIFIERPEER_MAIN:
				// nothing to do
		
				break;
			default:
				break;
			}
			stateChart->currentStateOfLaunchDelegatorVerifierPeer_verifier =
					LAUNCHDELEGATORLAUNCHDELEGATOR_INACTIVE;
		}
				
			
		bool_t LaunchDelegatorLaunchDelegatorStateChart_isInState(
				LaunchDelegatorLaunchDelegatorStateChart* stateChart,
				LaunchDelegatorLaunchDelegatorState state) {
			return (stateChart->currentStateOfLaunchDelegatorVerifierPeer_verifier
					== state);
		
		}
		

