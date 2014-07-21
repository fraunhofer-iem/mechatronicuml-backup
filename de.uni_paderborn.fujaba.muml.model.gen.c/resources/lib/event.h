/*********************************************************************************
 * Copyright (c) 2012 Solunar GmbH and others.
 * All rights reserved.
 *
 * Contributors:
 *     Solunar GmbH and others - initial API and implementation
 *******************************************************************************/
#ifndef EVENT_H_
#define EVENT_H_

#include "types.h"

typedef unsigned short sign_t;

typedef struct Event {
	sign_t signature;
	string_t name;
	real_t value;
} Event;

/**
 * Create a new Event and initialize it with given parameters at the given address.
 * Allocates memory in heap for the new event if NULL is passed as first argument.
 * @param event Address where the new event shall be created or NULL
 * @param signature Signature of the new event
 * @param name textual message of the event, limited to 255 chars
 */
Event* Event_create(const sign_t signature, const string_t name, real_t val);

/**
 * Free spaces allocated for message text and event.
 */
void Event_destroy(Event* event);

#endif /* EVENT_H_ */
