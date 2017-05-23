#include "MiddlewareCore.h"
//import all needed ComponentHeaders
#include "../components/senderComponent_Interface.h"
#include "../components/receiverComponent_Interface.h"

/*
 * create a new middleware instance
 * called by the system initialization (once)
 */
Middleware* Middleware_create(void){
	mw = (Middleware*) malloc(sizeof(Middleware));
	/*
	 * call create-function for every NI of the ECU
	 */
	mw->intern = NetworkInterface_create("intern");

	if(Middelware_init() == true){
		return mw;
	}
	else{
		return NULL;
	}

}

/*
 * initialize the middleware instance
 * called by the system initialization (once)
 */
bool_t Middelware_init(void){
		
	if (mw != NULL){
        mw->idOfECU = 1;
        mw->incoming = NetworkMessageBuffer_create(15, true);
        mw->outgoing = NetworkMessageBuffer_create(15, true);
		return true;
	}else
		return false;
}

/*
 * destroys the middleware instance
 * called by the system initialization (once)
 */
bool_t Middleware_destroy(void){
	if (mw != NULL){
		//destroy all components
	SenderComponent_destroy(mw->c1Component);
	ReceiverComponent_destroy(mw->c2Component);

//destroy all network interfaces
	NetworkInterface_destroy(mw->intern);


//destroy all NetworkMessageBuffer
  	NetworkMessageBuffer_destroy(mw->incoming);
    NetworkMessageBuffer_destroy(mw->outgoing);
// destroy the middleware itself
		free(mw);
		return true;
	}else
		return false;
}

/*
 * sends a message.
 */
bool_t MW_sendMessage(PortID targetPort, MessageID id, void *msg){
	MiddlewareMessage* nwMsg = (MiddlewareMessage*) malloc(sizeof(MiddlewareMessage));
	nwMsg->_msgID = id;
	nwMsg->_targetPort = targetPort;
	
	//choose right function to create the bytearray (which is actually a chararray).
	switch(id){
	case MESSAGE_M1MYMESSAGEM1MESSAGE:
			nwMsg->_mumlMsg_len = M1MyMessageM1Message_write_delimited_to((M1MyMessageM1Message*)msg, nwMsg->_mumlMsg, 0);
			break;
		default:
			nwMsg->_mumlMsg_len = 0;
			break;
	}
	Port *p = MW_getPortforIdentifier(targetPort);
	if (p != NULL){
		Port_addMessage(p, nwMsg);
		
		
		return true;
	}
	else
		return false;


}


/*
 * calls the receive-message of the middleware and delivers all messages to the correct buffers
 * will be called periodically
 */
bool_t MW_deliverReceivedMessages(void){
//not needed for local middleware
return true;	
}


/*
 * receives messages for every known NetworkInterface
 */
bool_t MW_NIreceiveMessages(void){
  //not needed for local middleware  
	
    return true;
}

/*
 * as long we have messages in the outgoing-buffer,
 * we try to send them via the "best" network interface
 */
bool_t MW_NIsendMessages(void){
	//not needed for local middleware
return true;
}


Port* MW_getPortforIdentifier(PortID portID){
    switch (portID) {
case PORT_C1SENDEROUT1:
	return mw->c1Component->outPort;
	break;
case PORT_C2RECEIVERIN1:
	return mw->c2Component->inPort;
	break;
        default:
            return NULL;
    }
    
}


/*
* Return the  PortID of a receiving port for a given sender PortID
*
*/
PortID MW_getTargetPortIDforIdentifier(PortID portID){ 
switch (portID) {
		case PORT_C1SENDEROUT1:
		return PORT_C2RECEIVERIN1;
		break;
		case PORT_C2RECEIVERIN1:
		return PORT_C1SENDEROUT1;
		break;
        default:
            return -1;
    }
}
