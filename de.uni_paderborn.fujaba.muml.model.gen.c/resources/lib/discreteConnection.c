/*********************************************************************************
 * Copyright (c) 2012 Solunar GmbH and others.
 * All rights reserved.
 *
 * Contributors:
 *     Solunar GmbH and others - initial API and implementation
 *******************************************************************************/
#include <stdlib.h>
#include <stdio.h>

#include "event.h"
#include "eventQueue.h"
#include "ports/discretePort.h"
#include "types.h"

#include "discreteConnection.h"

struct DiscreteConnection {
	DiscretePort* sender;
	DiscretePort* receiver;
	bool_t bidirectional;
};

void DiscreteConnection_initialize(DiscreteConnection* connection,
		DiscretePort* sender, DiscretePort* receiver, bool_t bidirectional) {
	connection->sender = sender;
	connection->receiver = receiver;
	connection->bidirectional = bidirectional;
}

DiscreteConnection* DiscreteConnection_create(DiscretePort* sender,
		DiscretePort* receiver, bool_t bidirectional) {
	DiscreteConnection* connection = (DiscreteConnection*) malloc(
			sizeof(DiscreteConnection));
	if (connection != NULL) {
		if (sender != NULL && receiver != NULL) {
			DiscreteConnection_initialize(connection, sender, receiver,
					bidirectional);
		} else {
			fprintf(stderr, "Initialization of DiscreteConnection failed.\n");

			DiscreteConnection_destroy(connection);

			connection = NULL;
		}
	} else {
		fprintf(stderr, "Creation of DiscreteConnection failed.\n");
	}

	return connection;
}

void DiscreteConnection_destroy(DiscreteConnection* connection) {
	if (connection != NULL) {
		free(connection);
	}
}

static bool_t transfer(DiscretePort* source, DiscretePort* target) {
	bool_t flag = false;
	Event* event = NULL;
	port_size_t i;
	EventQueue** cachedEventQueues = DiscretePort_getAllBufferedEventQueues(
			source);
	for (i = 0; i < DiscretePort_numberOfBufferedEventQueues(source); ++i) {
		EventQueue* sourceQueue = cachedEventQueues[i];
		EventQueue* targetQueue = DiscretePort_getEventQueue(target,
				EventQueue_getSignature(sourceQueue));
		while (EventQueue_getSize(sourceQueue) > 0) {
			event = EventQueue_dequeue(sourceQueue);
			if (event != NULL) {
				flag = EventQueue_enqueue(targetQueue, event);
#ifdef DEBUG
				if (flag) {
					printf("Event: %s transfered.\n", event->name);
				} else {
					printf("Event can't be transfered.\n");
				}
#endif
			} else {
				fprintf(stderr,
						"Dequeue failed. No event exists for transfer.\n");

				break; //NULL event received, error!
			} //event != NULL
		} //while
	} //for
	return flag;
}

bool_t DiscreteConnection_transfer(DiscreteConnection* con) {
	bool_t flag;
	flag = transfer(con->sender, con->receiver);
	if (con->bidirectional) {
		flag &= transfer(con->receiver, con->sender);
	}
	return flag;
}
