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
#include "continuousInPort.h"

ContinuousInPort* ContinuousInPort_create(void* value,
		const ContinuousType type) {
	ContinuousInPort* port = (ContinuousInPort*) malloc(
			sizeof(ContinuousInPort));
	if (port != NULL) {
		port->value = value;
		port->type = type;
	} else {
		fprintf(stderr, "Creation of ContinuousIn Port failed! \n");
	}
	return port;
}

void ContinuousInPort_destroy(ContinuousInPort* port) {
	if (port != NULL) {
		free(port);
	}
}

void ContinuousInPort_connect(ContinuousInPort* port, void* value) {
	port->value = value;
}

ContinuousType ContinuousInPort_getType(ContinuousInPort* port) {
	return port->type;
}

void ContinuousInPort_setValue(ContinuousInPort* port, const void* value) {
	switch (port->type) {
	case INT_T:
		*((int_t*) port->value) = *((int_t*) value);
		break;
	case REAL_T:
		*((real_t*) port->value) = *((real_t*) value);
		break;
	case BOOL_T:
		*((bool_t*) port->value) = *((bool_t*) value);
		break;
	}
}
