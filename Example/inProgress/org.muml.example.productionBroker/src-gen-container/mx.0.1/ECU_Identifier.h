		#ifndef ECU_IDENTIFIER_H
		#define ECU_IDENTIFIER_H
			
			// code for ECU Config mx.0.1_config
/**
*
*@brief Identifier for Messages used on mx.0.1_config
*@details Identifier to Identy Local Messages
*/
			//Identifier for Messages used on this ECU
					#define MESSAGE_MESSAGESORDERFORPSMESSAGESMESSAGE 1 /**< ECU Identifier: For the Message-Type: orderForPS */
					#define MESSAGE_MESSAGESDONEORDERMESSAGESMESSAGE 2 /**< ECU Identifier: For the Message-Type: doneOrder */
					#define MESSAGE_MESSAGESNOORDERMESSAGESMESSAGE 3 /**< ECU Identifier: For the Message-Type: noOrder */
					#define MESSAGE_MESSAGESGETORDERMESSAGESMESSAGE 4 /**< ECU Identifier: For the Message-Type: getOrder */

			//Identifier for ComponentInstances
/**
*
*@brief Identifier to distinguish Component Instance on ECU mx.0.1_config
*@details Used by a component container to identify component instances of the same component type
*/
					#define CI_PRODUCTIONSTATIONPRODUCTIONSTATION 1 /**< Identifier for Component Instance ProductionStation */
			
		#endif /* ECU_IDENTIFIER_H */
