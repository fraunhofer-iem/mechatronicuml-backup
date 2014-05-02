/*
 * port.h
 *
 *  Created on: 11.03.2014
 *      Author: badrobot
 *      Since the Codegen-model does only contain discretePorts, we do not need to provide
 *      an implementation of hybrid, continuous or delegation ports.
 */

#ifndef PORT_H_
#define PORT_H_

#include "stdlib.h"
#include "MessageBuffer.h"
#include "../lib/types.h"

typedef struct Port {
	PortID ID;
	int_t numberOfIncomingBuffer;
	MessageBuffer** allMessageBuffers;
}Port;

/*
 * returns a new created port. it allocates memory for every needed MessageBuffer(pointer)
 */
Port* Port_create(PortID id, int_t numberOfBuffers, MessageBuffer** msgBuffer);


/*
 * initializes the Port and all Buffers
 */
void Port_initialize(Port * port);

/*
 * adds a given message to the correct MessageBuffer of the given port
 */
bool_t Port_addMessage(Port* port, Message* msg);

/*
 * returns the messageBuffer of a given port for a given MessageID
 */
MessageBuffer * Port_getMessageBuffer(Port * port, MessageID msgID);

/*
 * checks for a given messageID, if there exists a received message in the correct messageBuffer of the Port
 */
bool_t Port_doesMessageExist(Port * port, MessageID msgID);

/*
 * returns a message of the given messageID and removes it from the messageBuffer
 * Before you call this method, you definitively should call Port_doesMessageExists(...)
 */
Message* Port_receiveMessage(Port * port, MessageID msgID);

#endif /* PORT_H_ */
