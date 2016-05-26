

		#include "../components/launchVerifierComponent_Interface.h"
		



		void initializeLaunchVerifierPeer1Master_peer1Region(
				LaunchVerifierLaunchVerifierStateChart* stateChart) {
		
			stateChart->currentStateOfLaunchVerifierPeer1Master_peer1 =
					STATE_LAUNCHVERIFIERPEER1WAITFORSTART;
		
			// execute entry actions
			stateChart->isOtherReady = false;
			stateChart->peer1Tries = 0;
			stateChart->newTry = false;
			stateChart->peer1 = -32;
			stateChart->peer2 = -42;
			stateChart->verifiedLaunch = false;
			;
		
			stateChart->LaunchVerifierPeer1Master_peer1_isExecutable = true;
		
		}
		void initializeLaunchVerifierPeer2Master_peer2Region(
				LaunchVerifierLaunchVerifierStateChart* stateChart) {
		
			stateChart->currentStateOfLaunchVerifierPeer2Master_peer2 =
					STATE_LAUNCHVERIFIERPEER2WAITFORSTART;
		
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
			//initialize clocks
		
			//initialize variables of the root statechart
			stateChart->peer1 = -32;
		
			stateChart->peer2 = -42;
		
			stateChart->isOtherReady = false;
		
			stateChart->peer1Tries = 0;
		
			stateChart->newTry = false;
		
			//initialize init state
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

		//implementations for RTSC internal operations
		
		
		
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
					stateChart->peer1Tries++;
					;
		
					// nothing to do			
		
					//release all created received events
					//	free(msg);
					//	free(mwMsg);
		
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchVerifierPeer1Master_peer1 =
							STATE_LAUNCHVERIFIERPEER1WAITISCORRECT;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchVerifierPeer1Master_peer1 switched state to STATE_LAUNCHVERIFIERPEER1WAITISCORRECT" );
		#endif		
		
					// execute entry actions
					stateChart->newTry = true;
					;
		
				} else {
		
				}
				break;
			case STATE_LAUNCHVERIFIERPEER1WAITFORSTART:
				if (MCC_LaunchVerifierComponent_peer1_exists_M1Ready_M1_Message(
						LaunchVerifierComponent_getpeer1(stateChart->parentComponent))
		
						) {
					M1Ready_M1_Message msg_M1Ready;
					MCC_LaunchVerifierComponent_peer1_recv_M1Ready_M1_Message(
							LaunchVerifierComponent_getpeer1(
									stateChart->parentComponent), &msg_M1Ready);
		
		#ifdef DEBUG
					printDebugInformation("LaunchVerifier received message of typeM1Ready_M1_Message");
		#endif
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->isOtherReady = true;
					;
		
					// nothing to do			
		
					//release all created received events
					//	free(mwMsg);
		
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchVerifierPeer1Master_peer1 =
							STATE_LAUNCHVERIFIERPEER1GETREADY;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchVerifierPeer1Master_peer1 switched state to STATE_LAUNCHVERIFIERPEER1GETREADY" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else {
		
				}
				break;
			case STATE_LAUNCHVERIFIERPEER1GETREADY:
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
					stateChart->currentStateOfLaunchVerifierPeer1Master_peer1 =
							STATE_LAUNCHVERIFIERPEER1MASTER_MAIN;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchVerifierPeer1Master_peer1 switched state to STATE_LAUNCHVERIFIERPEER1MASTER_MAIN" );
		#endif		
		
					// execute entry actions
					stateChart->newTry = false;
					;
		
				} else {
		
				}
				break;
			case STATE_LAUNCHVERIFIERPEER1WAITISCORRECT:
				if (
		
				stateChart->verifiedLaunch == false && stateChart->peer1Tries < 3
						&& stateChart->peer2 > 0
		
						) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchVerifierPeer1Master_peer1 =
							STATE_LAUNCHVERIFIERPEER1ACCESDENY;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchVerifierPeer1Master_peer1 switched state to STATE_LAUNCHVERIFIERPEER1ACCESDENY" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else if (
		
				stateChart->verifiedLaunch == true && stateChart->peer1Tries <= 3
		
				) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					//create new Parameter struct for M1AccessGranted_M1_Message
					M1AccessGranted_M1_Message msg_M1AccessGranted;
		
					//send Message
					MCC_LaunchVerifierComponent_peer1_send_M1AccessGranted_M1_Message(
							&(stateChart->parentComponent->peer1Port),
							&msg_M1AccessGranted);
		#ifdef DEBUG
					printDebugInformation("LaunchVerifier sent message of type M1AccessGranted");
		#endif		
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchVerifierPeer1Master_peer1 =
							STATE_LAUNCHVERIFIERPEER1ACCESSGRANTED;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchVerifierPeer1Master_peer1 switched state to STATE_LAUNCHVERIFIERPEER1ACCESSGRANTED" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else if (
		
				stateChart->verifiedLaunch == false && stateChart->peer1Tries >= 3
		
				) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					//create new Parameter struct for M1CompleteDeny_M1_Message
					M1CompleteDeny_M1_Message msg_M1CompleteDeny;
		
					//send Message
					MCC_LaunchVerifierComponent_peer1_send_M1CompleteDeny_M1_Message(
							&(stateChart->parentComponent->peer1Port),
							&msg_M1CompleteDeny);
		#ifdef DEBUG
					printDebugInformation("LaunchVerifier sent message of type M1CompleteDeny");
		#endif		
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchVerifierPeer1Master_peer1 =
							STATE_LAUNCHVERIFIERPEER1COMPLETEDENY;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchVerifierPeer1Master_peer1 switched state to STATE_LAUNCHVERIFIERPEER1COMPLETEDENY" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else {
		
				}
				break;
			case STATE_LAUNCHVERIFIERPEER1COMPLETEDENY:
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
					stateChart->currentStateOfLaunchVerifierPeer1Master_peer1 =
							STATE_LAUNCHVERIFIERPEER1WAITFORSTART;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchVerifierPeer1Master_peer1 switched state to STATE_LAUNCHVERIFIERPEER1WAITFORSTART" );
		#endif		
		
					// execute entry actions
					stateChart->isOtherReady = false;
					stateChart->peer1Tries = 0;
					stateChart->newTry = false;
					stateChart->peer1 = -32;
					stateChart->peer2 = -42;
					stateChart->verifiedLaunch = false;
					;
		
				} else {
		
				}
				break;
			case STATE_LAUNCHVERIFIERPEER1ACCESSGRANTED:
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
					stateChart->currentStateOfLaunchVerifierPeer1Master_peer1 =
							STATE_LAUNCHVERIFIERPEER1WAITFORSTART;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchVerifierPeer1Master_peer1 switched state to STATE_LAUNCHVERIFIERPEER1WAITFORSTART" );
		#endif		
		
					// execute entry actions
					stateChart->isOtherReady = false;
					stateChart->peer1Tries = 0;
					stateChart->newTry = false;
					stateChart->peer1 = -32;
					stateChart->peer2 = -42;
					stateChart->verifiedLaunch = false;
					;
		
				} else {
		
				}
				break;
			case STATE_LAUNCHVERIFIERPEER1ACCESDENY:
				if (1
		
				) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					//create new Parameter struct for M1AccessDenied_M1_Message
					M1AccessDenied_M1_Message msg_M1AccessDenied;
		
					//send Message
					MCC_LaunchVerifierComponent_peer1_send_M1AccessDenied_M1_Message(
							&(stateChart->parentComponent->peer1Port),
							&msg_M1AccessDenied);
		#ifdef DEBUG
					printDebugInformation("LaunchVerifier sent message of type M1AccessDenied");
		#endif		
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchVerifierPeer1Master_peer1 =
							STATE_LAUNCHVERIFIERPEER1MASTER_MAIN;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchVerifierPeer1Master_peer1 switched state to STATE_LAUNCHVERIFIERPEER1MASTER_MAIN" );
		#endif		
		
					// execute entry actions
					stateChart->newTry = false;
					;
		
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
							STATE_LAUNCHVERIFIERPEER2WAITTILFINALRESULT;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchVerifierPeer2Master_peer2 switched state to STATE_LAUNCHVERIFIERPEER2WAITTILFINALRESULT" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else {
		
				}
				break;
			case STATE_LAUNCHVERIFIERPEER2WAITFORSTART:
				if (
		
				stateChart->isOtherReady == true
		
				) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					//create new Parameter struct for M1OtherReady_M1_Message
					M1OtherReady_M1_Message msg_M1OtherReady;
		
					//send Message
					MCC_LaunchVerifierComponent_peer2_send_M1OtherReady_M1_Message(
							&(stateChart->parentComponent->peer2Port),
							&msg_M1OtherReady);
		#ifdef DEBUG
					printDebugInformation("LaunchVerifier sent message of type M1OtherReady");
		#endif		
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchVerifierPeer2Master_peer2 =
							STATE_LAUNCHVERIFIERPEER2SENDREADY;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchVerifierPeer2Master_peer2 switched state to STATE_LAUNCHVERIFIERPEER2SENDREADY" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else {
		
				}
				break;
			case STATE_LAUNCHVERIFIERPEER2SENDREADY:
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
			case STATE_LAUNCHVERIFIERPEER2ACCESGRANTED:
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
					stateChart->currentStateOfLaunchVerifierPeer2Master_peer2 =
							STATE_LAUNCHVERIFIERPEER2WAITFORSTART;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchVerifierPeer2Master_peer2 switched state to STATE_LAUNCHVERIFIERPEER2WAITFORSTART" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else {
		
				}
				break;
			case STATE_LAUNCHVERIFIERPEER2COMPLETEDENY:
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
					stateChart->currentStateOfLaunchVerifierPeer2Master_peer2 =
							STATE_LAUNCHVERIFIERPEER2WAITFORSTART;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchVerifierPeer2Master_peer2 switched state to STATE_LAUNCHVERIFIERPEER2WAITFORSTART" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else {
		
				}
				break;
			case STATE_LAUNCHVERIFIERPEER2DENY:
				if (1
		
				) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					//create new Parameter struct for M1AccessDenied_M1_Message
					M1AccessDenied_M1_Message msg_M1AccessDenied;
		
					//send Message
					MCC_LaunchVerifierComponent_peer2_send_M1AccessDenied_M1_Message(
							&(stateChart->parentComponent->peer2Port),
							&msg_M1AccessDenied);
		#ifdef DEBUG
					printDebugInformation("LaunchVerifier sent message of type M1AccessDenied");
		#endif		
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchVerifierPeer2Master_peer2 =
							STATE_LAUNCHVERIFIERPEER2WAITTILFINALRESULT;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchVerifierPeer2Master_peer2 switched state to STATE_LAUNCHVERIFIERPEER2WAITTILFINALRESULT" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else {
		
				}
				break;
			case STATE_LAUNCHVERIFIERPEER2WAITTILFINALRESULT:
				if (
		
				stateChart->verifiedLaunch == false && stateChart->peer1Tries < 3
						&& stateChart->peer1Tries > 0 && stateChart->newTry == true
						&& stateChart->peer1 > 0
		
						) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchVerifierPeer2Master_peer2 =
							STATE_LAUNCHVERIFIERPEER2DENY;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchVerifierPeer2Master_peer2 switched state to STATE_LAUNCHVERIFIERPEER2DENY" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else if (
		
				stateChart->verifiedLaunch == false && stateChart->peer1Tries >= 3
		
				) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					//create new Parameter struct for M1CompleteDeny_M1_Message
					M1CompleteDeny_M1_Message msg_M1CompleteDeny;
		
					//send Message
					MCC_LaunchVerifierComponent_peer2_send_M1CompleteDeny_M1_Message(
							&(stateChart->parentComponent->peer2Port),
							&msg_M1CompleteDeny);
		#ifdef DEBUG
					printDebugInformation("LaunchVerifier sent message of type M1CompleteDeny");
		#endif		
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchVerifierPeer2Master_peer2 =
							STATE_LAUNCHVERIFIERPEER2COMPLETEDENY;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchVerifierPeer2Master_peer2 switched state to STATE_LAUNCHVERIFIERPEER2COMPLETEDENY" );
		#endif		
		
					// execute entry actions
					// nothing to do
		
				} else if (
		
				stateChart->verifiedLaunch == true && stateChart->peer1Tries <= 3
		
				) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					//create new Parameter struct for M1AccessGranted_M1_Message
					M1AccessGranted_M1_Message msg_M1AccessGranted;
		
					//send Message
					MCC_LaunchVerifierComponent_peer2_send_M1AccessGranted_M1_Message(
							&(stateChart->parentComponent->peer2Port),
							&msg_M1AccessGranted);
		#ifdef DEBUG
					printDebugInformation("LaunchVerifier sent message of type M1AccessGranted");
		#endif		
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfLaunchVerifierPeer2Master_peer2 =
							STATE_LAUNCHVERIFIERPEER2ACCESGRANTED;
		#ifdef DEBUG
					printDebugInformation("currentStateOfLaunchVerifierPeer2Master_peer2 switched state to STATE_LAUNCHVERIFIERPEER2ACCESGRANTED" );
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
		
				stateChart->peer1 == stateChart->peer2 && stateChart->peer1 > 0
						&& stateChart->peer2 > 0
		
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
		
				stateChart->peer1 != stateChart->peer2
		
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
			case STATE_LAUNCHVERIFIERPEER2WAITFORSTART:
				// nothing to do
		
				break;
			case STATE_LAUNCHVERIFIERPEER2SENDREADY:
				// nothing to do
		
				break;
			case STATE_LAUNCHVERIFIERPEER2ACCESGRANTED:
				// nothing to do
		
				break;
			case STATE_LAUNCHVERIFIERPEER2COMPLETEDENY:
				// nothing to do
		
				break;
			case STATE_LAUNCHVERIFIERPEER2DENY:
				// nothing to do
		
				break;
			case STATE_LAUNCHVERIFIERPEER2WAITTILFINALRESULT:
				// nothing to do
		
				break;
			default:
				break;
			}
			stateChart->currentStateOfLaunchVerifierPeer2Master_peer2 =
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
		void LaunchVerifierPeer1Master_peer1StateChart_exit(
				LaunchVerifierLaunchVerifierStateChart* stateChart) {
			switch (stateChart->currentStateOfLaunchVerifierPeer1Master_peer1) {
			case STATE_LAUNCHVERIFIERPEER1MASTER_MAIN:
				// nothing to do
		
				break;
			case STATE_LAUNCHVERIFIERPEER1WAITFORSTART:
				// nothing to do
		
				break;
			case STATE_LAUNCHVERIFIERPEER1GETREADY:
				// nothing to do
		
				break;
			case STATE_LAUNCHVERIFIERPEER1WAITISCORRECT:
				// nothing to do
		
				break;
			case STATE_LAUNCHVERIFIERPEER1COMPLETEDENY:
				// nothing to do
		
				break;
			case STATE_LAUNCHVERIFIERPEER1ACCESSGRANTED:
				// nothing to do
		
				break;
			case STATE_LAUNCHVERIFIERPEER1ACCESDENY:
				// nothing to do
		
				break;
			default:
				break;
			}
			stateChart->currentStateOfLaunchVerifierPeer1Master_peer1 =
					LAUNCHVERIFIERLAUNCHVERIFIER_INACTIVE;
		}
				
			
		bool_t LaunchVerifierLaunchVerifierStateChart_isInState(
				LaunchVerifierLaunchVerifierStateChart* stateChart,
				LaunchVerifierLaunchVerifierState state) {
			return (stateChart->currentStateOfLaunchVerifierPeer2Master_peer2 == state
					|| stateChart->currentStateOfLaunchVerifierLaunchVerifier_mainStatechart
							== state
					|| stateChart->currentStateOfLaunchVerifierPeer1Master_peer1
							== state);
		
		}
		

	

