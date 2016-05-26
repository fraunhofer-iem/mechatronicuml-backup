#ifndef CONTIANERT_TYPES_
#define CONTIANERT_TYPES_

//FIXME: avialable per ECU across container

#ifdef __cplusplus
extern "C" {
#endif

//FIXME: Global for all Container (e.g. Lib_Container)
#include "../../../src-genV1_working/ECU-Launch/lib/port.h"
#include "../../../src-genV1_working/ECU-Launch/container_lib/MessageBuffer.h"



//FIXME: HandleTypes
//FIXME: typedef PortStatus
typedef enum {
	PORT_HANDLE_TYPE_DDS, PORT_HANDLE_TYPE_LOCAL
} HandleType;

//FIXME: create PortHandle;
typedef struct PortHandle {
	HandleType type;
	Port* port;
	void *concreteHandle;
} PortHandle;



#ifdef __cplusplus
}
#endif
#endif

/* CONTIANERT_TYPES_   */
