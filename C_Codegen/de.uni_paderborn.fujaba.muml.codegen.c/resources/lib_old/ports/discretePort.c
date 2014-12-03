/*********************************************************************************
 * Copyright (c) 2012 Solunar GmbH and others.
 * All rights reserved.
 *
 * Contributors:
 *     Solunar GmbH and others - initial API and implementation
 *******************************************************************************/
#include <stdlib.h>
#include <stdio.h>

#include "../types.h"

#include "discretePort.h"

struct DiscretePort {
	port_size_t numberOfCachedEventQueues;
	EventQueue** cachedEventQueues;
	port_size_t numberOfEventQueues;
	EventQueue** eventQueues;
};

void DiscretePort_initialize(DiscretePort* port) {
	port_size_t i;

	for (i = 0; i < port->numberOfCachedEventQueues; ++i) {
		EventQueue_initialize(port->cachedEventQueues[i]);
	}
	for (i = 0; i < port->numberOfEventQueues; ++i) {
		EventQueue_initialize(port->eventQueues[i]);
	}
}

DiscretePort* DiscretePort_create(const queue_size_t cachedQueueSize,
		const port_size_t numberOfCachedSignatures,
		const sign_t* cachedEventSignatures, const queue_size_t queueSize,
		const port_size_t numberOfSignatures, const sign_t* eventSignatures) {
	bool_t error = false;
	port_size_t i;

	DiscretePort* port = (DiscretePort*) calloc(1, sizeof(DiscretePort));

	if (port != NULL) {

		if (!error && numberOfCachedSignatures > 0) {
			port->numberOfCachedEventQueues = numberOfCachedSignatures;
			port->cachedEventQueues = (EventQueue**) calloc(
					numberOfCachedSignatures, sizeof(EventQueue*));
			error |= port->cachedEventQueues == NULL;
			for (i = 0; !error && i < port->numberOfCachedEventQueues; ++i) {
				port->cachedEventQueues[i] = EventQueue_create(
						cachedEventSignatures[i], cachedQueueSize);
				error |= port->cachedEventQueues[i] == NULL;
			}
			if (error) {
				fprintf(stderr, "Creation of bufferedEventQueues failed.\n");
				DiscretePort_destroy(port);

				port = NULL;
			}
		}

		if (!error && numberOfSignatures > 0) {
			port->numberOfEventQueues = numberOfSignatures;
			port->eventQueues = (EventQueue**) calloc(numberOfSignatures,
					sizeof(EventQueue*));
			error |= port->eventQueues == NULL;
			for (i = 0; !error && i < port->numberOfEventQueues; ++i) {
				port->eventQueues[i] = EventQueue_create(eventSignatures[i],
						queueSize);
				error |= port->eventQueues[i] == NULL;
			}
			if (error) {
				fprintf(stderr, "Creation of eventQueues failed.\n");
				DiscretePort_destroy(port);

				port = NULL;
			}
		}

	} else {
		error = true;
		fprintf(stderr, "Creation of port failed.\n");
	}

	return port;
}

void DiscretePort_destroy(DiscretePort* port) {
	if (port != NULL) {
		port_size_t i;

		for (i = 0; i < port->numberOfCachedEventQueues; ++i) {
			EventQueue_destroy(port->cachedEventQueues[i]);
		}
		free(port->cachedEventQueues);

		for (i = 0; i < port->numberOfEventQueues; ++i) {
			EventQueue_destroy(port->eventQueues[i]);
		}
		free(port->eventQueues);

		free(port);
	}
}

EventQueue** DiscretePort_getAllBufferedEventQueues(DiscretePort* port) {
	return port->cachedEventQueues;
}

port_size_t DiscretePort_numberOfBufferedEventQueues(DiscretePort* port) {
	return port->numberOfCachedEventQueues;
}

EventQueue** DiscretePort_getAllEventQueues(DiscretePort* port) {
	return port->eventQueues;
}

port_size_t DiscretePort_numberOfEventQueues(DiscretePort* port) {
	return port->numberOfEventQueues;
}

static EventQueue* getQueue(EventQueue** queues,
		const port_size_t numberOfQueues, const sign_t signature) {
	port_size_t i;
	for (i = 0; i < numberOfQueues; ++i) {
		if (EventQueue_getSignature(queues[i]) == signature) {
			return (queues[i]);
		}
	}
	return (NULL);
}

EventQueue* DiscretePort_getEventQueue(DiscretePort* port,
		const sign_t signature) {
	return getQueue(port->eventQueues, port->numberOfEventQueues, signature);
}

bool_t DiscretePort_sendEvent(DiscretePort* port, Event* event) {
	EventQueue* queue = getQueue(port->cachedEventQueues,
			port->numberOfCachedEventQueues, event->signature);
	if (queue != NULL) {
		return EventQueue_enqueue(queue, event);
	} else {
		fprintf(stderr, "sendEvent failed for event %d, %s.\n",
				event->signature, event->name);

		return false;
	}
}

Event* DiscretePort_receiveEvent(DiscretePort* port, const sign_t signature) {
	EventQueue* queue = getQueue(port->eventQueues, port->numberOfEventQueues,
			signature);
	if (queue != NULL) {
		return EventQueue_dequeue(queue);
	}
	return NULL;
}

bool_t DiscretePort_eventExists(DiscretePort* port, const sign_t signature) {
	EventQueue* queue = getQueue(port->eventQueues, port->numberOfEventQueues,
			signature);
	if (queue != NULL) {
		return (EventQueue_getSize(queue) > 0);
	} else {
		fprintf(stderr, "No queue found. Wrong signature?\n");

		return false;
	}
}
