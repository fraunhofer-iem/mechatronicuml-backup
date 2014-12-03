/*********************************************************************************
 * Copyright (c) 2012 Solunar GmbH and others.
 * All rights reserved.
 *
 * Contributors:
 *     Solunar GmbH and others - initial API and implementation
 *******************************************************************************/
#ifndef CONTINUOUS_IN_PORT_H_
#define CONTINUOUS_IN_PORT_H_

#include "../types.h"

//typedef struct ContinuousInPort ContinuousInPort;
typedef struct ContinuousInPort {
	void* value;
	ContinuousType type;
} ContinuousInPort;

/**
 * @param value target set by the port of type real_t*, bool_t* or int_t* depending on the type of the port.
 * If the target is not known at cration time,
 * pass NULL and manually connect port and target using the connect method below.
 * @param type Type of the port (i.e. of the object connected by this port; either REAL_T, BOOL_T or INT_T)
 */
ContinuousInPort* ContinuousInPort_create(void* value,
		const ContinuousType type);

void ContinuousInPort_destroy(ContinuousInPort* port);

/**
 * Sets the target of the port.
 * @param port port that shall be connected.
 * @param value Target of the port. Must point to an object of the same type as the port itself,
 * i.e. bool_t*, int_t* or real_t* depending on the port object.
 */
void ContinuousInPort_connect(ContinuousInPort* port, void* value);

ContinuousType ContinuousInPort_getType(ContinuousInPort* port);

/**
 * Uses the type information stored in the port object to cast the value
 * and copies its contents to the target pointed to by the port.
 */
void ContinuousInPort_setValue(ContinuousInPort* port, const void* value);

#endif /* CONTINUOUS_IN_PORT_H_ */
