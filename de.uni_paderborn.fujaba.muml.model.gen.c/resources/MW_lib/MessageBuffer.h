/*
 * MessageBuffer.h
 *
 *  Created on: 13.03.2014
 *      Author: badrobot
 */

#ifndef MESSAGEBUFFER_H_
#define MESSAGEBUFFER_H_

#include "stdlib.h"
#include "stdio.h"
#include "dummyTypes.h"
#include "../lib/types.h"



typedef struct MessageBuffer{
	int_t numberOfSupportedIDs;
	MessageID* supportedIDs;

	Message** queue;
	queue_size_t maxSize;
	queue_size_t currentSize;
	queue_size_t index;
	queue_size_t tail;
    bool bufferMode;
}MessageBuffer;

/*
 * returns a new MessageBufferInstance
 */
MessageBuffer* MessageBuffer_create(bufferSize_t size, bool mode, int_t numberIfIDs, MessageID* supportedIDs);

/*
 * init
 */
void MessageBuffer_initialize(MessageBuffer* buf);


/*
 * returns true, if the buffer supports a given messageID
 */
bool_t MessageBuffer_containsID(MessageBuffer *buf, MessageID msgID);

/*
 * returns the current size of the messageBuffer
 */
queue_size_t MessageBuffer_getSize(MessageBuffer* buf);

/*
 * returns the maximum size of the message buffer aka the buffer size
 */
queue_size_t MessageBuffer_getMaxSize(MessageBuffer* buf);

/*
 * enqueues a new message to the buffer
 * before you enqueue the message, make sure that you have checked that this is the correct buffer
 */
bool_t MessageBuffer_enqueue(MessageBuffer* buf, Message* msg);

/*
 * returns true, if a message of a given ID can be received by a RTSC
 */
bool_t MessageBuffer_doesMessageExists(MessageBuffer* buf, MessageID ID);

/*
 * dequeues the head of the messageBuffer and returns the message
 */
Message* MessageBuffer_dequeue(MessageBuffer* buf, MessageID msgID);

/*
 * destroys the message buffer
 */
void MessageBuffer_destroy(MessageBuffer* buf);

#endif /* MESSAGEBUFFER_H_ */
