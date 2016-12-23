/*********************************************************************************
 * Copyright (c) 2012 Solunar GmbH and others.
 * All rights reserved.
 *
 * Contributors:
 *     Solunar GmbH and others - initial API and implementation
 *******************************************************************************/
/**
 * @file
 * @author badrobot
 * @brief This file specifies the Synchronization Channels
 * @warning The Synchronization Channels are used in the Realtime-Statecharts
 * @todo Johannes: can you please document this part???
 */

#ifndef SYNCCHANNEL_H_
#define SYNCCHANNEL_H_

#include "types.h"

typedef struct SyncChannel {
	bool_t syncSend;
	bool_t syncSendMutex;
	bool_t syncReceive;
	bool_t syncReceiveMutex;
	bool_t syncComplement;
} SyncChannel;

SyncChannel* SyncChannel_create(void);

void SyncChannel_destroy(SyncChannel* syncChannel);

void SyncChannel_initialize(SyncChannel* syncChannel);

void SyncChannel_enableSend(SyncChannel* syncChannel);

void SyncChannel_enableReceive(SyncChannel* syncChannel);

bool_t SyncChannel_send(SyncChannel* syncChannel);

bool_t SyncChannel_receive(SyncChannel* syncChannel);

#endif /* SYNCCHANNEL_H_ */
