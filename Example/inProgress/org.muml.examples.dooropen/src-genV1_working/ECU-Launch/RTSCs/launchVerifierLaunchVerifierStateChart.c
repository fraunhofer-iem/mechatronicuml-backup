

		#include "../../../src-genV1_working/ECU-Launch/components/launchVerifierComponent_Interface.h"
		



		void initializeLaunchVerifierPeer1Master_peer1Region(
				LaunchVerifierLaunchVerifierStateChart* stateChart) {
		
			stateChart->currentStateOfLaunchVerifierPeer1Master_peer1 =
					STATE_LAUNCHVERIFIERPEER1MASTER_MAIN;
		
			// execute entry actions
			// nothing to do
		
			stateChart->LaunchVerifierPeer1Master_peer1_isExecutable = true;
			stateChart->verifiedLaunch = false;
		
		}
		void initializeLaunchVerifierPeer2Master_peer2Region(
				LaunchVerifierLaunchVerifierStateChart* stateChart) {
		
			stateChart->currentStateOfLaunchVerifierPeer2Master_peer2 =
					STATE_LAUNCHVERIFIERPEER2MASTER_MAIN;
		
			// execute entry actions
			// nothing to do
		
			stateChart->LaunchVerifierPeer2Master_peer2_isExecutable = true;
		
		}
		void initializeLaunchVerifierLaunchVerifier_mainStatechartRegion(
				LaunchVerifierLaunchVerifierStateChart* stateChart) {
		
			stateChart->currentStateOfLaunchVerifierLaunchVerifier_mainStatechart =
					STATE_LAUNCHVERIFIERLAUNCHVERIFIER_MAINSTATECHARTUNVERIFIED;
		
			// execute entry actions
			// nothing to do
		
			stateChart->LaunchVerifierLaunchVerifier_mainStatechart_isExecutable = true;
		
		}
		
		void LaunchVerifierLaunchVerifierStateChart_initialize(
				LaunchVerifierLaunchVerifierStateChart* stateChart) {
		
			stateChart->peer1 = -32;
		
			stateChart->peer2 = -42;
		
			stateChart->currentStateOfLaunchVerifierLaunchVerifier =
					STATE_LAUNCHVERIFIERLAUNCHVERIFIER_MAIN;
		
			// execute entry actions
			// nothing to do
		
			initializeLaunchVerifierPeer1Master_peer1Region(stateChart);
			initializeLaunchVerifierPeer2Master_peer2Region(stateChart);
			initializeLaunchVerifierLaunchVerifier_mainStatechartRegion(stateChart);
		}
		
		

		LaunchVerifierLaunchVerifierStateChart* LaunchVerifierLaunchVerifierStateChart_create(
				LaunchVerifierComponent* parentComponent) {
			LaunchVerifierLaunchVerifierStateChart* stateChart =
					(LaunchVerifierLaunchVerifierStateChart*) malloc(
							sizeof(LaunchVerifierLaunchVerifierStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
				if (stateChart->parentComponent != NULL) {
					LaunchVerifierLaunchVerifierStateChart_initialize(stateChart);
				} else {
		
					LaunchVerifierLaunchVerifierStateChart_destroy(stateChart);
					stateChart = NULL;
				}
			} else {
		
			}
			return stateChart;
		}
		

			void LaunchVerifierLaunchVerifierStateChart_destroy(LaunchVerifierLaunchVerifierStateChart* stateChart) {
				if(stateChart != NULL) {
		
		
					free(stateChart);
				}
			}


		
		void LaunchVerifierPeer1Master_peer1StateChart_processStep(
				LaunchVerifierLaunchVerifierStateChart* stateChart) {
			switch (stateChart->currentStateOfLaunchVerifierPeer1Master_peer1) {
			case STATE_LAUNCHVERIFIERPEER1MASTER_MAIN:
				if (MCC_LaunchVerifierComponent_peer1_exists_M1LaunchCode_M1_Message(
						LaunchVerifierComponent_getpeer1(stateChart->parentComponent))
		
						) {
					M1LaunchCode_M1_Message msg_M1LaunchCode;
					MCC_LaunchVerifierComponent_peer1_recv_M1LaunchCode_M1_Message(
							LaunchVerifierComponent_getpeer1(
									stateChart->parentComponent), &msg_M1LaunchCode);
		
		#ifdef DEBUG
					printDebugInformation("LaunchVerifier received message of typeM1LaunchCode_M1_Message");
		#endif
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->peer1 = msg_M1LaunchCode.id;
					;
		
					// nothing to do			
		
					//release all created received events
					//	free(msg);
					//	free(mwMsg);
		
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchVerifierPeer1Master_peer1 =
							STATE_LAUNCHVERIFIERPEER1MASTER_MAIN;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchVerifierPeer1Master_peer1 switched state to STATE_LAUNCHVERIFIERPEER1MASTER_MAIN" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else {
		
				}
				break;
			default:
				break;
			}
			stateChart->LaunchVerifierPeer1Master_peer1_isExecutable = false;
		}
		
		void LaunchVerifierPeer2Master_peer2StateChart_processStep(
				LaunchVerifierLaunchVerifierStateChart* stateChart) {
			switch (stateChart->currentStateOfLaunchVerifierPeer2Master_peer2) {
			case STATE_LAUNCHVERIFIERPEER2MASTER_MAIN:
				if (MCC_LaunchVerifierComponent_peer2_exists_M1LaunchCode_M1_Message(
						LaunchVerifierComponent_getpeer2(stateChart->parentComponent))
		
						) {
					M1LaunchCode_M1_Message msg_M1LaunchCode;
					MCC_LaunchVerifierComponent_peer2_recv_M1LaunchCode_M1_Message(
							LaunchVerifierComponent_getpeer2(
									stateChart->parentComponent), &msg_M1LaunchCode);
		
		#ifdef DEBUG
					printDebugInformation("LaunchVerifier received message of typeM1LaunchCode_M1_Message");
		#endif
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->peer2 = msg_M1LaunchCode.id;
					;
		
					// nothing to do			
		
					//release all created received events
					//	free(msg);
					//	free(mwMsg);
		
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchVerifierPeer2Master_peer2 =
							STATE_LAUNCHVERIFIERPEER2MASTER_MAIN;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchVerifierPeer2Master_peer2 switched state to STATE_LAUNCHVERIFIERPEER2MASTER_MAIN" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else {
		
				}
				break;
			default:
				break;
			}
			stateChart->LaunchVerifierPeer2Master_peer2_isExecutable = false;
		}
		
		void LaunchVerifierLaunchVerifier_mainStatechartStateChart_processStep(
				LaunchVerifierLaunchVerifierStateChart* stateChart) {
			switch (stateChart->currentStateOfLaunchVerifierLaunchVerifier_mainStatechart) {
			case STATE_LAUNCHVERIFIERLAUNCHVERIFIER_MAINSTATECHARTUNVERIFIED:
				if (
		
				stateChart->peer1 == stateChart->peer2 && stateChart->peer1 >0 && stateChart->peer2 > 0
		
				) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					if (stateChart->peer1 == stateChart->peer2) {
						stateChart->verifiedLaunch = true;
		
					}
		
					else {
						stateChart->verifiedLaunch = false;
		
					}
		
					;
		
					// nothing to do			
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchVerifierLaunchVerifier_mainStatechart =
							STATE_LAUNCHVERIFIERLAUNCHVERIFIER_MAINSTATECHARTVERIFIED;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchVerifierLaunchVerifier_mainStatechart switched state to STATE_LAUNCHVERIFIERLAUNCHVERIFIER_MAINSTATECHARTVERIFIED" );
		#endif		
		
					// execute entry actions
					stateChart->verifiedLaunch = true;
					;
		
				} else {
		
				}
				break;
			case STATE_LAUNCHVERIFIERLAUNCHVERIFIER_MAINSTATECHARTVERIFIED:
				if (
		
				stateChart->peer1 != stateChart->peer2 || stateChart->peer1<=0 || stateChart->peer2<=0
		
				) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->verifiedLaunch = false;
					;
		
					// nothing to do			
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchVerifierLaunchVerifier_mainStatechart =
							STATE_LAUNCHVERIFIERLAUNCHVERIFIER_MAINSTATECHARTUNVERIFIED;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchVerifierLaunchVerifier_mainStatechart switched state to STATE_LAUNCHVERIFIERLAUNCHVERIFIER_MAINSTATECHARTUNVERIFIED" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else {
		
				}
				break;
			default:
				break;
			}
			stateChart->LaunchVerifierLaunchVerifier_mainStatechart_isExecutable =
					false;
		}
		
		void LaunchVerifierLaunchVerifierStateChart_processStep(
				LaunchVerifierLaunchVerifierStateChart* stateChart) {
			switch (stateChart->currentStateOfLaunchVerifierLaunchVerifier) {
			case STATE_LAUNCHVERIFIERLAUNCHVERIFIER_MAIN:
		
				if (stateChart->LaunchVerifierLaunchVerifier_mainStatechart_isExecutable)
					LaunchVerifierLaunchVerifier_mainStatechartStateChart_processStep(
							stateChart);
				if (stateChart->LaunchVerifierPeer2Master_peer2_isExecutable)
					LaunchVerifierPeer2Master_peer2StateChart_processStep(stateChart);
				if (stateChart->LaunchVerifierPeer1Master_peer1_isExecutable)
					LaunchVerifierPeer1Master_peer1StateChart_processStep(stateChart);
		
				break;
			default:
				break;
			}
			stateChart->LaunchVerifierLaunchVerifier_isExecutable = false;
		}
		
		
		void LaunchVerifierPeer2Master_peer2StateChart_exit(
				LaunchVerifierLaunchVerifierStateChart* stateChart) {
			switch (stateChart->currentStateOfLaunchVerifierPeer2Master_peer2) {
			case STATE_LAUNCHVERIFIERPEER2MASTER_MAIN:
				// nothing to do
		
				break;
			default:
				break;
			}
			stateChart->currentStateOfLaunchVerifierPeer2Master_peer2 =
					LAUNCHVERIFIERLAUNCHVERIFIER_INACTIVE;
		}
		void LaunchVerifierPeer1Master_peer1StateChart_exit(
				LaunchVerifierLaunchVerifierStateChart* stateChart) {
			switch (stateChart->currentStateOfLaunchVerifierPeer1Master_peer1) {
			case STATE_LAUNCHVERIFIERPEER1MASTER_MAIN:
				// nothing to do
		
				break;
			default:
				break;
			}
			stateChart->currentStateOfLaunchVerifierPeer1Master_peer1 =
					LAUNCHVERIFIERLAUNCHVERIFIER_INACTIVE;
		}
		void LaunchVerifierLaunchVerifier_mainStatechartStateChart_exit(
				LaunchVerifierLaunchVerifierStateChart* stateChart) {
			switch (stateChart->currentStateOfLaunchVerifierLaunchVerifier_mainStatechart) {
			case STATE_LAUNCHVERIFIERLAUNCHVERIFIER_MAINSTATECHARTUNVERIFIED:
				// nothing to do
		
				break;
			case STATE_LAUNCHVERIFIERLAUNCHVERIFIER_MAINSTATECHARTVERIFIED:
				// nothing to do
		
				break;
			default:
				break;
			}
			stateChart->currentStateOfLaunchVerifierLaunchVerifier_mainStatechart =
					LAUNCHVERIFIERLAUNCHVERIFIER_INACTIVE;
		}
				
			
		bool_t LaunchVerifierLaunchVerifierStateChart_isInState(
				LaunchVerifierLaunchVerifierStateChart* stateChart,
				LaunchVerifierLaunchVerifierState state) {
			return (stateChart->currentStateOfLaunchVerifierPeer2Master_peer2 == state
					|| stateChart->currentStateOfLaunchVerifierPeer1Master_peer1
							== state
					|| stateChart->currentStateOfLaunchVerifierLaunchVerifier_mainStatechart
							== state);
		
		}
		

