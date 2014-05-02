/*
 * MessageBuffer.c
 *
 *  Created on: 13.03.2014
 *      Author: badrobot
 */

#include "NetworkMessageBuffer.h"


NetworkMessageBuffer* NetworkMessageBuffer_create(bufferSize_t size){
	NetworkMessageBuffer* buf = (NetworkMessageBuffer*) malloc(sizeof(NetworkMessageBuffer));

    buf->maxSize = size;

	buf->queue = (MiddlewareMessage**) malloc(size * sizeof(MiddlewareMessage*));
	return buf;
}

void NetworkMessageBuffer_initialize(NetworkMessageBuffer* buf){
	buf->currentSize = 0;
	buf->index = 0;
	buf->tail = 0;
}


queue_size_t NetworkMessageBuffer_getSize(NetworkMessageBuffer* buf){
	return buf->currentSize;
}

queue_size_t NetworkMessageBuffer_getMaxSize(NetworkMessageBuffer* buf){
	return buf->maxSize;
}

bool_t NetworkMessageBuffer_enqueue(NetworkMessageBuffer* buf, MiddlewareMessage* msg){
	if ((buf->currentSize < buf->maxSize)){
        buf->queue[buf->tail] = msg;
		queue_size_t foo = (++(buf->tail)) % (buf->maxSize);
		buf->tail = foo;
		++(buf->currentSize);
        printf("network message enqueued\n");
		return true;
	}
	return false;
}

bool_t NetworkMessageBuffer_doesMessageExists(NetworkMessageBuffer* buf){
	return (buf->currentSize > 0);
}

MiddlewareMessage* NetworkMessageBuffer_dequeue(NetworkMessageBuffer* buf){
	if (buf->currentSize > 0){
		MiddlewareMessage *returnMsg = buf->queue[buf->index];
        
		queue_size_t foo = (++(buf->index)) % (buf->maxSize);
		buf->index = foo;
		(buf->currentSize)--;
		return (returnMsg);
	}
	return NULL;
}

void NetworkMessageBuffer_destroy(NetworkMessageBuffer* buf){

}
