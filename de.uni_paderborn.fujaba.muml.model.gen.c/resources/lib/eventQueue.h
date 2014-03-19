/*********************************************************************************
 * Copyright (c) 2012 Solunar GmbH and others.
 * All rights reserved.
 *
 * Contributors:
 *     Solunar GmbH and others - initial API and implementation
 *******************************************************************************/
#ifndef EVENTQUEUE_H_
#define EVENTQUEUE_H_

#include "types.h"

#include "event.h"

#define DEFAULT_QUEUE_SIZE 8

typedef unsigned short queue_size_t;

typedef struct EventQueue EventQueue;

/**
 * Resets the queue to size = 0, thus effectively deleting all stored messages.
 * @param queue The queue which shall be reset to initial status.
 */
void EventQueue_initialize(EventQueue* queue);

/**
 * Creates a new Queue object at the given address.
 * Allocates new memory from the heap for the event slots.
 * If NULL is passed as first argument, memory for the queue object itself
 * is allocated as well.
 * @param aQueue Address where the new Queue shall be created or NULL.
 * @param sig Signature of the Queue and the events stored within
 * @param maxSize Maximal number of messages stored within the queue
 *
 * @return Address of the queue object created or NULL if creation failed
 */
EventQueue* EventQueue_create(const sign_t signature, const queue_size_t maxSize);

/**
 * Uses free(void*) to destroy the queue.
 */
void EventQueue_destroy(EventQueue* queue);

sign_t EventQueue_getSignature(EventQueue* queue);

queue_size_t EventQueue_getSize(EventQueue* queue);

queue_size_t EventQueue_getMaxSize(EventQueue* queue);

/**
 * Inserts a new message to the end of the queue.
 * The queue and the event are required to have the same signature.
 * For efficiency, only a reference to the event is stored.
 * Memory allocated for the message has to be handled from outside this function.
 * @param queue Message queue into which to insert a new element
 * @param event Reference of an event to be stored in the queue.
 * @return true if the insertion was successful. False, if the signatures did not match
 * or if the queue is full.
 */
bool_t EventQueue_enqueue(EventQueue* queue, Event* event);

/**
 * Retrieve the oldest event from the queue.
 * @param queue Message queue from which the event shall be retrieved.
 * @return A reference to the oldest event stored in the queue or NULL if the queue was empty.
 */
Event* EventQueue_dequeue(EventQueue* queue);

//Event* peek(EventQueue* queue);

#endif /* EVENTQUEUE_H_ */
