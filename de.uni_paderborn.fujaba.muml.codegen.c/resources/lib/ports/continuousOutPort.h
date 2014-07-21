/*********************************************************************************
 * Copyright (c) 2012 Solunar GmbH and others.
 * All rights reserved.
 *
 * Contributors:
 *     Solunar GmbH and others - initial API and implementation
 *******************************************************************************/
#ifndef CONTINUOUS_OUT_PORT_H_
#define CONTINUOUS_OUT_PORT_H_

#include "../types.h"

//typedef struct ContinuousOutPort ContinuousOutPort;
typedef struct ContinuousOutPort {
	void* value;
	ContinuousType type;
} ContinuousOutPort;

ContinuousOutPort* ContinuousOutPort_create(void* value,
		const ContinuousType type);

void ContinuousOutPort_destroy(ContinuousOutPort* port);

void ContinuousOutPort_connect(ContinuousOutPort* port, void* value);

ContinuousType ContinuousOutPort_getType(ContinuousOutPort* port);

const void* ContinuousOutPort_getValue(ContinuousOutPort* port);

#endif /* CONTINUOUS_OUT_PORT_H_ */
