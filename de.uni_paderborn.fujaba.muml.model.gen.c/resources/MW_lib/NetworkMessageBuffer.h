/*
 * MessageBuffer.h
 *
 *  Created on: 13.03.2014
 *      Author: badrobot
 */

#ifndef NETWORKMESSAGEBUFFER_H_
#define NETWORKMESSAGEBUFFER_H_

#include "stdlib.h"
#include "stdio.h"
#include "dummyTypes.h"
#include "../lib/types.h"

typedef struct NetworkMessageBuffer NetworkMessageBuffer;
struct NetworkMessageBuffer{


	MiddlewareMessage** queue;
	queue_size_t maxSize;
	queue_size_t currentSize;
	queue_size_t index;
	queue_size_t tail;
};


NetworkMessageBuffer* NetworkMessageBuffer_create(bufferSize_t size);

/*
 * init
 */
void NetworkMessageBuffer_initialize(NetworkMessageBuffer* buf);


/*
 * returns the current size of the messageBuffer
 */
queue_size_t NetworkMessageBuffer_getSize(NetworkMessageBuffer* buf);

/*
 * returns the maximum size of the message buffer aka the buffer size
 */
queue_size_t NetworkMessageBuffer_getMaxSize(NetworkMessageBuffer* buf);

/*
 * enqueues a new message to the buffer
 * before you enqueue the message, make sure that you have checked that this is the correct buffer
 */
bool_t NetworkMessageBuffer_enqueue(NetworkMessageBuffer* buf, MiddlewareMessage* msg);

/*
 * returns true, if a message of a given ID can be received by a RTSC
 */
bool_t NetworkMessageBuffer_doesMessageExists(NetworkMessageBuffer* buf);

/*
 * dequeues the head of the messageBuffer and returns the message
 */
MiddlewareMessage* NetworkMessageBuffer_dequeue(NetworkMessageBuffer* buf);

/*
 * destroys the message buffer
 */
void NetworkMessageBuffer_destroy(NetworkMessageBuffer* buf);

#endif /* NETWORKMESSAGEBUFFER_H_ */
