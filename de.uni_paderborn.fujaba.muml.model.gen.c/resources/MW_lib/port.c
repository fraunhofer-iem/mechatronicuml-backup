/*
 * port.c
 *
 *  Created on: 13.03.2014
 *      Author: badrobot
 */


#include "port.h"
#include <stdio.h>
#include "../protobuf/messages.h"


Port* Port_create(PortID id, int_t numberOfBuffers, MessageBuffer** msgBuffer){
	//alloc mem for the port
	Port* port = (Port*) calloc(1, sizeof(Port));

	//set ID
	port->ID = id;

	//alloc space for messageBuffers
	if(numberOfBuffers > 0){
		port->numberOfIncomingBuffer = numberOfBuffers;
		port->allMessageBuffers = msgBuffer;
	}

	return port;
}


void Port_initialize(Port * port){
	//do some init stuff

}

bool_t Port_addMessage(Port* port, Message* msg){
	//get messageBuffer for the given message
	MessageBuffer* buf = Port_getMessageBuffer(port, (MessageID)msg->ID);
	//add message to buffer
	if (buf != NULL){
		MessageBuffer_enqueue(buf, msg);
        printf("buffer of port %d received msg of type %d\n",(int)port->ID, (int)msg->ID);
		
		//Test if message parameters are correct
		switch(msg->ID){
			case MSG_1:
			{
				MumlMessage1 *msg1 = (MumlMessage1*)msg->parameter;
				printf("parameters from rcvd msg:\n \t (long) parm1: %lu \n\t (long) parm2: %lu \n\t (bool) parm3: %d\n", msg1->_parm1, msg1->_parm2, msg1->_parm3);
			}
			break;
			case MSG_2:
			{
				MumlMessage2 *msg2 = (MumlMessage2*)msg->parameter;
				printf("parameters from rcvd msg:\n \t (double) parm1: %lf \n\t (bool) parm2: %d \n\t (long) parm3: %lu\n", msg2->_parm1, msg2->_parm2, msg2->_parm3);
			}
			break;
			default: ;
		}
		return true;
	}
	//on error: return failure
	else
		return false;
}


MessageBuffer * Port_getMessageBuffer(Port * port, MessageID msgID){
	for(int_t i = 0; i < port->numberOfIncomingBuffer; i++){
		if (MessageBuffer_containsID(port->allMessageBuffers[i],msgID)){
			return port->allMessageBuffers[i];
		}
	}
	return NULL;
}


bool_t Port_doesMessageExist(Port * port, MessageID msgID){
	if (MessageBuffer_doesMessageExists(Port_getMessageBuffer(port, msgID), msgID)){
		return true;
	}
	return false;
}


Message* Port_receiveMessage(Port * port, MessageID msgID){
	return MessageBuffer_dequeue(Port_getMessageBuffer(port, msgID), msgID);
}
