/*********************************************************************************
 * Copyright (c) 2012 Solunar GmbH and others.
 * All rights reserved.
 *
 * Contributors:
 *     Solunar GmbH and others - initial API and implementation
 *******************************************************************************/
#ifndef CONNECTION_H_
#define CONNECTION_H_

#include "types.h"
#include "ports/discretePort.h"

typedef struct DiscreteConnection DiscreteConnection;

void DiscreteConnection_initialize(DiscreteConnection* connection,
		DiscretePort* sender, DiscretePort* receiver, bool_t bidirectional);

DiscreteConnection* DiscreteConnection_create(DiscretePort* sender,
		DiscretePort* receiver, bool_t bidirectional);

void DiscreteConnection_destroy(DiscreteConnection* connection);

bool_t DiscreteConnection_transfer(DiscreteConnection* connection);

#endif /* CONNECTION_H_ */
