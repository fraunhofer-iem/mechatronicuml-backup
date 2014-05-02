/*
 * MessageBuffer.c
 *
 *  Created on: 13.03.2014
 *      Author: badrobot
 */

#include "MessageBuffer.h"



MessageBuffer* MessageBuffer_create(bufferSize_t size, bool mode, int_t numberOfIDs, MessageID* supportedIDs){
	MessageBuffer* buf = (MessageBuffer*) malloc(sizeof(MessageBuffer));

    buf->maxSize = size;
	buf->numberOfSupportedIDs = numberOfIDs;
	buf->supportedIDs = supportedIDs;
    buf->bufferMode = mode;

	buf->queue = (Message**) malloc(size * sizeof(Message*));
	return buf;
}

void MessageBuffer_initialize(MessageBuffer* buf){
	buf->currentSize = 0;
	buf->index = 0;
	buf->tail = 0;
}

bool_t MessageBuffer_containsID(MessageBuffer *buf, MessageID msgID){
    for (int_t i=0; i < buf->numberOfSupportedIDs; i++){
        if ((MessageID)(buf->supportedIDs[i]) == msgID){

            //awesome, we are supporting the given msgID
            return true;
        }
    }
    //this buffer cannot handle the given msgID
    return false;
}

queue_size_t MessageBuffer_getSize(MessageBuffer* buf){
	return buf->currentSize;
}

queue_size_t MessageBuffer_getMaxSize(MessageBuffer* buf){
	return buf->maxSize;
}

bool_t MessageBuffer_enqueue(MessageBuffer* buf, Message* msg){
	if (MessageBuffer_containsID(buf, (MessageID)msg->ID)) {
      if(buf->currentSize < buf->maxSize){
        buf->queue[buf->tail] = msg;
		queue_size_t foo = (++(buf->tail)) % (buf->maxSize);
		buf->tail = foo;
		++(buf->currentSize);
          printf("standard enqueue\n");
		return true;
      }else if (buf->bufferMode){

          free(buf->queue[buf->tail]);
          buf->queue[buf->tail] = msg;
          queue_size_t foo = (++(buf->tail)) % (buf->maxSize);
          queue_size_t bar = (++(buf->index)) % (buf->maxSize);
          buf->tail = foo;
          buf->index = bar;
                    printf("overwritten enqueue\n");
          return true;
      }
    }
              printf("rejected\n");
return false;

}

bool_t MessageBuffer_doesMessageExists(MessageBuffer* buf, MessageID msgID){
	return ((MessageID)buf->queue[0]->ID == msgID);
}

Message* MessageBuffer_dequeue(MessageBuffer* buf, MessageID msgID){
	if (buf->currentSize > 0){
		Message *returnMsg = buf->queue[buf->index];
		//(buf->queue)[buf->index] = NULL;
		queue_size_t foo = (++(buf->index)) % (buf->maxSize);
		buf->index = foo;
		(buf->currentSize)--;
		return (returnMsg);
	}
	return NULL;
}

void MessageBuffer_destroy(MessageBuffer* buf){

}
