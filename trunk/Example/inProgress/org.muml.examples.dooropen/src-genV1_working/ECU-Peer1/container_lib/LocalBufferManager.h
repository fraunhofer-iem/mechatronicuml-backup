#ifndef LOCAL_BUFFER_MANAGER_
#define LOCAL_BUFFER_MANAGER_

//FIXME: avialable per ECU across container

#ifdef __cplusplus
extern "C" {
#endif
// Library
#include "../../../src-genV1_working/ECU-Peer1/container_lib/uthash.h"
#include "../../../src-genV1_working/ECU-Peer1/container_lib/MessageBuffer.h"
#include "../../../src-genV1_working/ECU-Peer1/container_lib/ContainerTypes.h"


typedef struct LocalSubscriber {
	uint16_T msgID;
	MessageBuffer* buffer;
} LocalSubscriber;

//FIXME create localHandle
typedef struct LocalHandle {
	uint16_T pubID; //under which ID I want to publish (aka my own)
	uint16_T subID; // to which one, do I want to listen
	uint8_T numOfSubs;
	LocalSubscriber localSubscribers[];
//LocalPublisher* localPublishers;
//	uint8_T numofPubs;
} LocalHandle;


extern const LocalHandle INIT_LocalHandle;

void subscribeToMessage( LocalSubscriber* subscriber, uint16_T bufferID, uint16_T msgID, size_t capactiy, size_t elementSize, bool_t mode);
void publishMessage(uint16_T bufferID, uint16_T msgID,void* msg);

#ifdef __cplusplus
}
#endif
#endif

/* LOCAL_BUFFER_MANAGER_   */
