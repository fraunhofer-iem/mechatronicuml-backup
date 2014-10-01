/*********************************************************************************
 * Copyright (c) 2012 Solunar GmbH and others.
 * All rights reserved.
 *
 * Contributors:
 *     Solunar GmbH and others - initial API and implementation
 *******************************************************************************/
#include <stdlib.h>
#include <stdio.h>

#include "continuousConnection.h"

struct ContinuousConnection {
	ContinuousOutPort* sender;
	ContinuousInPort* receiver;
};

void ContinuousConnection_initialize(ContinuousConnection* connection,
		ContinuousOutPort* sender, ContinuousInPort* receiver) {
	connection->sender = sender;
	connection->receiver = receiver;
}

ContinuousConnection* ContinuousConnection_create(ContinuousOutPort* sender,
		ContinuousInPort* receiver) {
	ContinuousConnection* connection = (ContinuousConnection*) malloc(
			sizeof(ContinuousConnection));
	if (connection != NULL) {
		if (sender != NULL && receiver != NULL) {
			ContinuousConnection_initialize(connection, sender, receiver);
		} else {
			fprintf(stderr, "Initialization of ContinuousConnection failed!\n");

			ContinuousConnection_destroy(connection);

			connection = NULL;
		}
	} else {
		fprintf(stderr, "Creation of ContinuousConnection failed!\n");
	}

	return connection;
}

void ContinuousConnection_destroy(ContinuousConnection* connection) {
	if (connection != NULL) {
		free(connection);
	}
}

void ContinuousConnection_transfer(ContinuousConnection* connnection) {
	ContinuousInPort_setValue(connnection->receiver,
			ContinuousOutPort_getValue(connnection->sender));
}
