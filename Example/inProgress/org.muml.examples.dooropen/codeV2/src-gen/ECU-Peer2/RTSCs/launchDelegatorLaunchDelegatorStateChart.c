

		#include "../components/launchDelegatorComponent_Interface.h"
		



		void initializeLaunchDelegatorVerifierPeer_verifierRegion(
				LaunchDelegatorLaunchDelegatorStateChart* stateChart) {
		
			stateChart->currentStateOfLaunchDelegatorVerifierPeer_verifier =
					STATE_LAUNCHDELEGATORVERIFIERSTART;
		
			// execute entry actions
			// nothing to do
		
			stateChart->LaunchDelegatorVerifierPeer_verifier_isExecutable = true;
		
		}
		
		void LaunchDelegatorLaunchDelegatorStateChart_initialize(
				LaunchDelegatorLaunchDelegatorStateChart* stateChart) {
			//initialize clocks
		
			//initialize variables of the root statechart
			stateChart->whoami = 2;
		
			//initialize init state
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

		//implementations for RTSC internal operations
		
		
		
		void LaunchDelegatorVerifierPeer_verifierStateChart_processStep(
				LaunchDelegatorLaunchDelegatorStateChart* stateChart) {
			switch (stateChart->currentStateOfLaunchDelegatorVerifierPeer_verifier) {
			case STATE_LAUNCHDELEGATORVERIFIERINPUTSTATE:
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
							STATE_LAUNCHDELEGATORVERIFIERWAITFORRESPONSE;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchDelegatorVerifierPeer_verifier switched state to STATE_LAUNCHDELEGATORVERIFIERWAITFORRESPONSE" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else {
		
				}
				break;
			case STATE_LAUNCHDELEGATORVERIFIERSTART:
				if (MCC_LaunchDelegatorComponent_verifier_exists_M1OtherReady_M1_Message(
						LaunchDelegatorComponent_getverifier(
								stateChart->parentComponent))
		
								) {
					M1OtherReady_M1_Message msg_M1OtherReady;
					MCC_LaunchDelegatorComponent_verifier_recv_M1OtherReady_M1_Message(
							LaunchDelegatorComponent_getverifier(
									stateChart->parentComponent), &msg_M1OtherReady);
		
		#ifdef DEBUG
					printDebugInformation("LaunchDelegator received message of typeM1OtherReady_M1_Message");
		#endif
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
					//	free(mwMsg);
		
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchDelegatorVerifierPeer_verifier =
							STATE_LAUNCHDELEGATORVERIFIERREADY;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchDelegatorVerifierPeer_verifier switched state to STATE_LAUNCHDELEGATORVERIFIERREADY" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else if (
		
				stateChart->code == -42
		
				) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					//create new Parameter struct for M1Ready_M1_Message
					M1Ready_M1_Message msg_M1Ready;
		
					//send Message
					MCC_LaunchDelegatorComponent_verifier_send_M1Ready_M1_Message(
							&(stateChart->parentComponent->verifierPort), &msg_M1Ready);
		#ifdef DEBUG
					printDebugInformation("LaunchDelegator sent message of type M1Ready");
		#endif		
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchDelegatorVerifierPeer_verifier =
							STATE_LAUNCHDELEGATORVERIFIERREADY;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchDelegatorVerifierPeer_verifier switched state to STATE_LAUNCHDELEGATORVERIFIERREADY" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else {
		
				}
				break;
			case STATE_LAUNCHDELEGATORVERIFIERREADY:
				if (1
		
				) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchDelegatorVerifierPeer_verifier =
							STATE_LAUNCHDELEGATORVERIFIERINPUTSTATE;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchDelegatorVerifierPeer_verifier switched state to STATE_LAUNCHDELEGATORVERIFIERINPUTSTATE" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else {
		
				}
				break;
			case STATE_LAUNCHDELEGATORVERIFIERWAITFORRESPONSE:
				if (MCC_LaunchDelegatorComponent_verifier_exists_M1AccessDenied_M1_Message(
						LaunchDelegatorComponent_getverifier(
								stateChart->parentComponent))
		
				&& stateChart->whoami == 2
		
				) {
					M1AccessDenied_M1_Message msg_M1AccessDenied;
					MCC_LaunchDelegatorComponent_verifier_recv_M1AccessDenied_M1_Message(
							LaunchDelegatorComponent_getverifier(
									stateChart->parentComponent), &msg_M1AccessDenied);
		
		#ifdef DEBUG
					printDebugInformation("LaunchDelegator received message of typeM1AccessDenied_M1_Message");
		#endif
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
					//	free(mwMsg);
		
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchDelegatorVerifierPeer_verifier =
							STATE_LAUNCHDELEGATORVERIFIERWAITFORRESPONSE;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchDelegatorVerifierPeer_verifier switched state to STATE_LAUNCHDELEGATORVERIFIERWAITFORRESPONSE" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else if (MCC_LaunchDelegatorComponent_verifier_exists_M1AccessDenied_M1_Message(
						LaunchDelegatorComponent_getverifier(
								stateChart->parentComponent))
		
				&& stateChart->whoami == 1
		
				) {
					M1AccessDenied_M1_Message msg_M1AccessDenied;
					MCC_LaunchDelegatorComponent_verifier_recv_M1AccessDenied_M1_Message(
							LaunchDelegatorComponent_getverifier(
									stateChart->parentComponent), &msg_M1AccessDenied);
		
		#ifdef DEBUG
					printDebugInformation("LaunchDelegator received message of typeM1AccessDenied_M1_Message");
		#endif
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
					//	free(mwMsg);
		
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchDelegatorVerifierPeer_verifier =
							STATE_LAUNCHDELEGATORVERIFIERINPUTSTATE;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchDelegatorVerifierPeer_verifier switched state to STATE_LAUNCHDELEGATORVERIFIERINPUTSTATE" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else if (MCC_LaunchDelegatorComponent_verifier_exists_M1CompleteDeny_M1_Message(
						LaunchDelegatorComponent_getverifier(
								stateChart->parentComponent))
		
								) {
					M1CompleteDeny_M1_Message msg_M1CompleteDeny;
					MCC_LaunchDelegatorComponent_verifier_recv_M1CompleteDeny_M1_Message(
							LaunchDelegatorComponent_getverifier(
									stateChart->parentComponent), &msg_M1CompleteDeny);
		
		#ifdef DEBUG
					printDebugInformation("LaunchDelegator received message of typeM1CompleteDeny_M1_Message");
		#endif
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
					//	free(mwMsg);
		
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchDelegatorVerifierPeer_verifier =
							STATE_LAUNCHDELEGATORVERIFIERCOMPLETEDENY;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchDelegatorVerifierPeer_verifier switched state to STATE_LAUNCHDELEGATORVERIFIERCOMPLETEDENY" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else if (MCC_LaunchDelegatorComponent_verifier_exists_M1AccessGranted_M1_Message(
						LaunchDelegatorComponent_getverifier(
								stateChart->parentComponent))
		
								) {
					M1AccessGranted_M1_Message msg_M1AccessGranted;
					MCC_LaunchDelegatorComponent_verifier_recv_M1AccessGranted_M1_Message(
							LaunchDelegatorComponent_getverifier(
									stateChart->parentComponent), &msg_M1AccessGranted);
		
		#ifdef DEBUG
					printDebugInformation("LaunchDelegator received message of typeM1AccessGranted_M1_Message");
		#endif
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
					//	free(mwMsg);
		
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchDelegatorVerifierPeer_verifier =
							STATE_LAUNCHDELEGATORVERIFIERACCESSOK;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchDelegatorVerifierPeer_verifier switched state to STATE_LAUNCHDELEGATORVERIFIERACCESSOK" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else {
		
				}
				break;
			case STATE_LAUNCHDELEGATORVERIFIERACCESSOK:
				if (1
		
				) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchDelegatorVerifierPeer_verifier =
							STATE_LAUNCHDELEGATORVERIFIERSTART;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchDelegatorVerifierPeer_verifier switched state to STATE_LAUNCHDELEGATORVERIFIERSTART" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else {
		
				}
				break;
			case STATE_LAUNCHDELEGATORVERIFIERCOMPLETEDENY:
				if (1
		
				) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchDelegatorVerifierPeer_verifier =
							STATE_LAUNCHDELEGATORVERIFIERSTART;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchDelegatorVerifierPeer_verifier switched state to STATE_LAUNCHDELEGATORVERIFIERSTART" );
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
			case STATE_LAUNCHDELEGATORVERIFIERINPUTSTATE:
				// nothing to do
		
				break;
			case STATE_LAUNCHDELEGATORVERIFIERSTART:
				// nothing to do
		
				break;
			case STATE_LAUNCHDELEGATORVERIFIERREADY:
				// nothing to do
		
				break;
			case STATE_LAUNCHDELEGATORVERIFIERWAITFORRESPONSE:
				// nothing to do
		
				break;
			case STATE_LAUNCHDELEGATORVERIFIERACCESSOK:
				// nothing to do
		
				break;
			case STATE_LAUNCHDELEGATORVERIFIERCOMPLETEDENY:
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
		

	

