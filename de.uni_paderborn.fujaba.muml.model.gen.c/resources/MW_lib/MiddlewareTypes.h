/*
 * dummyTypes.h
 *
 *  Created on: 11.03.2014
 *      Author: badrobot
 */

#ifndef DUMMYTYPES_H_
#define DUMMYTYPES_H_

// If we change defs like "typedef signed long PortID", we have to make sure, what protobuf generates is fitting to this
typedef unsigned short queue_size_t;
typedef int bufferSize_t;
typedef signed long MessageID;
typedef signed long PortID;
typedef signed long ECUID;

typedef struct Message{
	MessageID  ID;
	void* parameter;
}Message;

/*
typedef struct NetworkMessage{
	PortID targetPort;
	Message * content;
}NetworkMessage;
*/
// Since protobuf doesn't use typedef for structs, we have to do it here *consider in codegen*
typedef struct MiddlewareMessage MiddlewareMessage;
typedef struct MumlMessage1 MumlMessage1;
typedef struct MumlMessage2 MumlMessage2;
typedef struct QoSProps QoSProps;


typedef int ECU;
typedef int U8;

#endif /* DUMMYTYPES_H_ */
