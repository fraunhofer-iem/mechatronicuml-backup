/*********************************************************************************
 * Copyright (c) 2012 Solunar GmbH and others.
 * All rights reserved.
 *
 * Contributors:
 *     Solunar GmbH and others - initial API and implementation
 *******************************************************************************/
#ifndef CONTINOUSCONNECTION_H_
#define CONTINOUSCONNECTION_H_

#include "ports/continuousInPort.h"
#include "ports/continuousOutPort.h"

typedef struct ContinuousConnection ContinuousConnection;

void ContinuousConnection_initialize(ContinuousConnection* connection,
		ContinuousOutPort* sender, ContinuousInPort* receiver);

ContinuousConnection* ContinuousConnection_create(ContinuousOutPort* sender,
		ContinuousInPort* receiver);

void ContinuousConnection_destroy(ContinuousConnection* connection);

void ContinuousConnection_transfer(ContinuousConnection* connection);

#endif /* CONTINOUSCONNECTION_H_ */
