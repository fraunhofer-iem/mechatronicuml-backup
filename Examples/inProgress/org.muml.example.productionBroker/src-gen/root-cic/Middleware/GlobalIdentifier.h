/**
 * @file 
 * @author generated by Fraunhofer IEM
 * @brief The GlobalIdentifiers
 * @details In this file the GlobalIdentifiers are specified via preprocessor macros
 * 			 These GlobalIdentifiers are equal for all ECUs
 */
		//Define MessageType IDs
			#define MESSAGE_MESSAGESDONEORDERMESSAGESMESSAGE 1 /**< Global Identifier: For the Message-Type: doneOrder */
			#define MESSAGE_MESSAGESNOORDERMESSAGESMESSAGE 2 /**< Global Identifier: For the Message-Type: noOrder */
			#define MESSAGE_MESSAGESGETORDERMESSAGESMESSAGE 3 /**< Global Identifier: For the Message-Type: getOrder */
			#define MESSAGE_MESSAGESSIMPLEORDERMESSAGESMESSAGE 4 /**< Global Identifier: For the Message-Type: simpleOrder */
			#define MESSAGE_MESSAGESORDERFORPSMESSAGESMESSAGE 5 /**< Global Identifier: For the Message-Type: orderForPS */

		//Define Port IDs
			#define PORT_BROKERBROKERGETORDER1 1 /**< Global Identifier: For the Discrete-Port-Instance: getOrder1 */
			#define PORT_BROKERBROKERBROKERFORPS 2 /**< Global Identifier: For the Discrete-Port-Instance: brokerForPS */
			#define PORT_RECIPEGENERATORRECIPEGENERATORPROVIDEORDER1 3 /**< Global Identifier: For the Discrete-Port-Instance: provideOrder1 */
			#define PORT_PRODUCTIONSTATIONPRODUCTIONSTATIONGETORDER1 4 /**< Global Identifier: For the Discrete-Port-Instance: getOrder1 */
