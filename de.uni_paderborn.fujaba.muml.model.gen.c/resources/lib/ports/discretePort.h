/*********************************************************************************
 * Copyright (c) 2012 Solunar GmbH and others.
 * All rights reserved.
 *
 * Contributors:
 *     Solunar GmbH and others - initial API and implementation
 *******************************************************************************/
#ifndef PORT_H_
#define PORT_H_

#include "../types.h"
#include "../eventQueue.h"

//The number of available signatures determines the maximal number of event queues
typedef sign_t port_size_t;

typedef struct DiscretePort DiscretePort;

/**
 * Resets a discrete Port to its initial state by iterating over all event queues and calling
 * EventQueue_initialize for each queue, effectively erasing all stored events by setting the
 * queue's sizes to zero.
 */
void DiscretePort_initialize(DiscretePort* port);

/**
 * Allocates memory for a port object, its arrays of (buffered)eventQueues
 * and the EventQueue objects themselves (by calling createEventQueue).
 * @param bufferedQueueSize The size of the queues used to store buffered events
 * @param numberOfBufferedSignatures The number of queues used to store buffered events
 * @param bufferedEventSignatures Signatures (used to distinguish event types) of the different queues
 * @param queueSize The size of the queues used to store events
 * @param numberOfSignatures The number of queues used to store events
 * @param eventSignatures Signatures (used to distinguish event types) of the different queues
 * @return The address of a memory area allocated and initialized for a DiscretePort object
 */
DiscretePort* DiscretePort_create(const queue_size_t cachedQueueSize,
		const port_size_t numberOfCachedSignatures,
		const sign_t* cachedEventSignatures, const queue_size_t queueSize,
		const port_size_t numberOfSignatures, const sign_t* eventSignatures);

/**
 * Free memory allocated for port; recursively frees all memory allocated for arrays
 * and eventQueues (by calling EventQueue_destroy).
 */
void DiscretePort_destroy(DiscretePort* port);

EventQueue** DiscretePort_getAllBufferedEventQueues(DiscretePort* port);
port_size_t DiscretePort_numberOfBufferedEventQueues(DiscretePort* port);
EventQueue** DiscretePort_getAllEventQueues(DiscretePort* port);
port_size_t DiscretePort_numberOfEventQueues(DiscretePort* port);

EventQueue* DiscretePort_getEventQueue(DiscretePort* port,
		const sign_t signature);

/**
 * Tests the queue of the given signature for stored events.
 * @param port Port object to be questioned
 * @param signature Signature (event type) used to determine which queue is to be tested
 * @return true if events exist in the queue, false otherwise.
 */
bool_t DiscretePort_eventExists(DiscretePort* port, const sign_t signature);

bool_t DiscretePort_sendEvent(DiscretePort* port, Event* event);

Event* DiscretePort_receiveEvent(DiscretePort* port, const sign_t signature);

#endif /* PORT_H_ */
