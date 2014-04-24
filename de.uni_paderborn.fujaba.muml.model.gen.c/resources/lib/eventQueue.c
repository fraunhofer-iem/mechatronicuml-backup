/*********************************************************************************
 * Copyright (c) 2012 Solunar GmbH and others.
 * All rights reserved.
 *
 * Contributors:
 *     Solunar GmbH and others - initial API and implementation
 *******************************************************************************/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "types.h"
#include "event.h"

#include "eventQueue.h"

struct EventQueue {
	const sign_t signature;
	const queue_size_t maxQueueSize;
	queue_size_t queueSize;
	queue_size_t queueIndex;
	queue_size_t queueTail;
	Event** eventQueue;
};

void EventQueue_initialize(EventQueue* queue) {
	queue->queueSize = 0;
	queue->queueIndex = 0;
	queue->queueTail = 0;
}

EventQueue* EventQueue_create(const sign_t signature, const queue_size_t maxSize) {
	EventQueue* queue = (EventQueue*) malloc(sizeof(EventQueue));
	if (queue != NULL) {
		sign_t* newSig = (sign_t*) &(queue->signature);
		queue_size_t* maxQueueSize = (queue_size_t*) &(queue->maxQueueSize);
		*newSig = signature;
		*maxQueueSize = maxSize;

		queue->eventQueue = (Event**) malloc(maxSize * sizeof(Event*));
		if (queue->eventQueue != NULL) {
			EventQueue_initialize(queue);
		} else {
			fprintf(stderr,
					"Creation of event array for queue with signature %d failed!\n",
					signature);

			EventQueue_destroy(queue);

			queue = NULL;
		}
	} else {
		fprintf(stderr, "Creation of Queue with signature %d failed!\n",
				signature);
	}

	return queue;
}

void EventQueue_destroy(EventQueue* queue) {
	if (queue != NULL) {
		free(queue->eventQueue);

		free(queue);
	}
}

sign_t EventQueue_getSignature(EventQueue* queue) {
	return queue->signature;
}

queue_size_t EventQueue_getSize(EventQueue* queue) {
	return queue->queueSize;
}

queue_size_t EventQueue_getMaxSize(EventQueue* queue) {
	return queue->maxQueueSize;
}

bool_t EventQueue_enqueue(EventQueue* queue, Event* event) {
	if (queue != NULL && event != NULL
			&& queue->signature == event->signature) {
		if (queue->queueSize < queue->maxQueueSize) {
			queue_size_t temp;
			queue->eventQueue[queue->queueTail] = event;
			temp = (++(queue->queueTail)) % (queue->maxQueueSize);
			queue->queueTail = temp;
			++(queue->queueSize);
			return true;
		} else {
			fprintf(stderr, "Queue exceeded. Event will be rejected!\n");
			Event_destroy(event);
		}
	} else {
		fprintf(stderr, "Error: Invalid argument.\n");
	}
	return false;
}

Event* EventQueue_dequeue(EventQueue* queue) {
	if (queue->queueSize > 0) {
		queue_size_t temp;
		Event* event = (queue->eventQueue)[queue->queueIndex];
		(queue->eventQueue)[queue->queueIndex] = NULL;
		temp = (++(queue->queueIndex)) % (queue->maxQueueSize);
		queue->queueIndex = temp;
		--(queue->queueSize);
		return event;
	}
	return NULL;
}

//Event* peek(EventQueue* queue) {
//	if (queue->queueSize > 0) {
//		return (queue->eventQueue)[queue->queueIndex];
//	}
//	return NULL;
//}
