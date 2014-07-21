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
#include "continuousOutPort.h"

ContinuousOutPort* ContinuousOutPort_create(void* value,
		const ContinuousType type) {
	ContinuousOutPort* port = (ContinuousOutPort*) malloc(
			sizeof(ContinuousOutPort));
	if (port != NULL) {
		port->value = value;
		port->type = type;
	} else {
		fprintf(stderr, "Creation of ContinuousOut Port failed! \n");
	}
	return port;
}

void ContinuousOutPort_destroy(ContinuousOutPort* port) {
	if (port != NULL) {
		free(port);
	}
}

void ContinuousOutPort_connect(ContinuousOutPort* port, void* value) {
	port->value = value;
}

ContinuousType ContinuousOutPort_getType(ContinuousOutPort* port) {
	return port->type;
}

const void* ContinuousOutPort_getValue(ContinuousOutPort* port) {
	return (const void*) port->value;
}

