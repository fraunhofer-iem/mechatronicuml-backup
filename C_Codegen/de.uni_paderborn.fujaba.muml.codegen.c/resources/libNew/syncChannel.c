/*********************************************************************************
 * Copyright (c) 2012 Solunar GmbH and others.
 * All rights reserved.
 *
 * Contributors:
 *     Solunar GmbH and others - initial API and implementation
 *******************************************************************************/
#include <stdio.h>
#include <stdlib.h>


#include "syncChannel.h"


void SyncChannel_initialize(SyncChannel* syncChannel) {
	syncChannel->syncSend = false;
	syncChannel->syncSendMutex = true;
	syncChannel->syncReceive = false;
	syncChannel->syncReceiveMutex = true;
	syncChannel->syncComplement = false;
}

SyncChannel* SyncChannel_create(void) {
	SyncChannel* syncChannel = (SyncChannel*) malloc(sizeof(SyncChannel));
	if (syncChannel != NULL) {
		SyncChannel_initialize(syncChannel);
	} else {
		fprintf(stderr, "Creation of SyncChannel failed.\n");
	}

	return syncChannel;
}

void SyncChannel_destroy(SyncChannel* syncChannel) {
	if (syncChannel != NULL) {
		free(syncChannel);
	}
}

void SyncChannel_enableSend(SyncChannel* syncChannel) {
	syncChannel->syncSend = true;
	syncChannel->syncSendMutex = true;
	syncChannel->syncComplement = false;
}

void SyncChannel_enableReceive(SyncChannel* syncChannel) {
	syncChannel->syncReceive = true;
	syncChannel->syncReceiveMutex = true;
	syncChannel->syncComplement = false;
}

bool_t SyncChannel_send(SyncChannel* syncChannel) {
	bool_t canSendSync = ((syncChannel->syncSend && syncChannel->syncReceive)
			|| syncChannel->syncComplement) && syncChannel->syncSendMutex;

	syncChannel->syncSend = false;
	syncChannel->syncReceive = false;

	if (canSendSync) {
		syncChannel->syncComplement = true;
		syncChannel->syncSendMutex = false;
	}

	return canSendSync;
}

bool_t SyncChannel_receive(SyncChannel* syncChannel) {
	bool_t canReceiveSync = ((syncChannel->syncSend && syncChannel->syncReceive)
			|| syncChannel->syncComplement) && syncChannel->syncReceiveMutex;

	syncChannel->syncSend = false;
	syncChannel->syncReceive = false;

	if (canReceiveSync) {
		syncChannel->syncComplement = true;
		syncChannel->syncReceiveMutex = false;
	}

	return canReceiveSync;
}
