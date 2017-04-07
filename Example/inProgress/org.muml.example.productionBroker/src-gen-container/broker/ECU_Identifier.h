		#ifndef ECU_IDENTIFIER_H
		#define ECU_IDENTIFIER_H
			
			// code for ECU Config broker_config
/**
*
*@brief Identifier for Messages used on broker_config
*@details Identifier to Identy Local Messages
*/
			//Identifier for Messages used on this ECU
					#define MESSAGE_MESSAGESORDERFORPSMESSAGESMESSAGE 1 /**< ECU Identifier: For the Message-Type: orderForPS */
					#define MESSAGE_MESSAGESGETORDERMESSAGESMESSAGE 2 /**< ECU Identifier: For the Message-Type: getOrder */
					#define MESSAGE_MESSAGESDONEORDERMESSAGESMESSAGE 3 /**< ECU Identifier: For the Message-Type: doneOrder */
					#define MESSAGE_MESSAGESNOORDERMESSAGESMESSAGE 4 /**< ECU Identifier: For the Message-Type: noOrder */
					#define MESSAGE_MESSAGESSIMPLEORDERMESSAGESMESSAGE 5 /**< ECU Identifier: For the Message-Type: simpleOrder */

			//Identifier for ComponentInstances
/**
*
*@brief Identifier to distinguish Component Instance on ECU broker_config
*@details Used by a component container to identify component instances of the same component type
*/
					#define CI_BROKERBROKER 1 /**< Identifier for Component Instance Broker */
			
		#endif /* ECU_IDENTIFIER_H */
