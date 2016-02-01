		#ifndef ECU_IDENTIFIER_H
		#define ECU_IDENTIFIER_H
			
			// code for ECU Config ECU-Launch_config
/**
*
*@brief Identifier for Messages used on ECU-Launch_config
*@details Identifier to Identy Local Messages
*/
			//Identifier for Messages used on this ECU
					#define MESSAGE_M1LAUNCHCODEM1MESSAGE 1 /**< ECU Identifier: For the Message-Type: launchCode */

			//Identifier for ComponentInstances
/**
*
*@brief Identifier to distinguish Component Instance on ECU ECU-Launch_config
*@details Used by a component container to identify component instances of the same component type
*/
					#define CI_LAUNCHERLAUNCHER 1 /**< Identifier for Component Instance Launcher */
					#define CI_LAUNCHVERIFIERLAUNCHVERIFIER 2 /**< Identifier for Component Instance LaunchVerifier */
			
		#endif /* ECU_IDENTIFIER_H */
