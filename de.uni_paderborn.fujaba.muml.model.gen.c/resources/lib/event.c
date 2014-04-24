/*********************************************************************************
 * Copyright (c) 2012 Solunar GmbH and others.
 * All rights reserved.
 *
 * Contributors:
 *     Solunar GmbH and others - initial API and implementation
 *******************************************************************************/
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

#include "types.h"

#include "event.h"

Event* Event_create(sign_t signature, string_t name, real_t val) {
	Event* event = (Event*) malloc(sizeof(Event));
	if (event != NULL) {
		size_t length = strlen(name);
		event->signature = signature;
		event->value = val;
		if (length < 256) {
			if (name != NULL) {
				event->name = name;
			} else {
				fprintf(stderr,
						"Allocation of space for name of event %d failed!\n",
						signature);

				free(event);
				event = NULL;
			}
		}
	} else {
		fprintf(stderr, "Allocation of space for event %d failed!\n",
				signature);
	}

	return event;
}

void Event_destroy(Event* event) {
	if (event != NULL) {
		free(event);
	}
}
