		#ifndef ECU_IDENTIFIER_H
		#define ECU_IDENTIFIER_H
			
			// code for ECU Config ECU-Peer1_config
/**
*
*@brief Identifier for Messages used on ECU-Peer1_config
*@details Identifier to Identy Local Messages
*/
			//Identifier for Messages used on this ECU
					#define MESSAGE_M1ACCESSDENIEDM1MESSAGE 1 /**< ECU Identifier: For the Message-Type: accessDenied */
					#define MESSAGE_M1OTHERREADYM1MESSAGE 2 /**< ECU Identifier: For the Message-Type: otherReady */
					#define MESSAGE_M1ACCESSGRANTEDM1MESSAGE 3 /**< ECU Identifier: For the Message-Type: accessGranted */
					#define MESSAGE_M1LAUNCHCODEM1MESSAGE 4 /**< ECU Identifier: For the Message-Type: launchCode */
					#define MESSAGE_M1READYM1MESSAGE 5 /**< ECU Identifier: For the Message-Type: ready */
					#define MESSAGE_M1COMPLETEDENYM1MESSAGE 6 /**< ECU Identifier: For the Message-Type: completeDeny */

			//Identifier for ComponentInstances
/**
*
*@brief Identifier to distinguish Component Instance on ECU ECU-Peer1_config
*@details Used by a component container to identify component instances of the same component type
*/
					#define CI_PEER1INPUTIDENTIFICATIONINPUT 1 /**< Identifier for Component Instance peer1Input */
					#define CI_PEER1LAUNCHDELEGATOR 2 /**< Identifier for Component Instance peer1 */
			
		#endif /* ECU_IDENTIFIER_H */
