#include "MiddlewareCore.h"

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
	mw->usbPort = NetworkInterface_create("usbPort");
	mw->virtualBluetoothPort = NetworkInterface_create("virtualBluetoothPort");
	mw->inputPort4 = NetworkInterface_create("inputPort4");
	mw->VirtualWifiPort = NetworkInterface_create("VirtualWifiPort");

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
        mw->idOfECU = ECU_OVERTAKEER1;
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
	OvertakeeDriverComponent_destroy(mw->overtakeeDriverComponent);
	MotorComponent_destroy(mw->overtakeeMotorLComponent);
	MotorComponent_destroy(mw->overtakeeMotorRComponent);
	LineComponent_destroy(mw->overtakeeLineComponent);
	DistanceComponent_destroy(mw->overtakeeDistanceComponent);

//destroy all network interfaces
	NetworkInterface_destroy(mw->intern);
	NetworkInterface_destroy(mw->usbPort);
	NetworkInterface_destroy(mw->virtualBluetoothPort);
	NetworkInterface_destroy(mw->inputPort4);
	NetworkInterface_destroy(mw->VirtualWifiPort);

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
 * TODO: add decision, if targetC <-- what does it mean? :(
 */
bool_t MW_sendMessage(PortID targetPort, MessageID id, void *msg){
	//called in RTSC to send a message
	MiddlewareMessage* nwMsg = (MiddlewareMessage*) malloc(sizeof(MiddlewareMessage));
	nwMsg->_msgID = id;
	nwMsg->_targetPort = targetPort;
	
	//choose right function to create the bytearray (which is actually a chararray).
	switch(id){
	case MESSAGE_MOTOR_VELOCITY_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE:
			nwMsg->_mumlMsg_len = Motor_velocity_messageapi_messageType_RepositoryMessage_write_delimited_to((Motor_velocity_messageapi_messageType_RepositoryMessage*)msg, nwMsg->_mumlMsg, 0);
			break;
	case MESSAGE_DISTANCE_DISTANCE_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE:
			nwMsg->_mumlMsg_len = Distance_distance_messageapi_messageType_RepositoryMessage_write_delimited_to((Distance_distance_messageapi_messageType_RepositoryMessage*)msg, nwMsg->_mumlMsg, 0);
			break;
	case MESSAGE_LINE_LINELIGHT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE:
			nwMsg->_mumlMsg_len = Line_lineLight_messageapi_messageType_RepositoryMessage_write_delimited_to((Line_lineLight_messageapi_messageType_RepositoryMessage*)msg, nwMsg->_mumlMsg, 0);
			break;
		default:
			nwMsg->_mumlMsg_len = 0;
			break;
	}
	
	NetworkMessageBuffer_enqueue(mw->outgoing, nwMsg);
	return true;
}

/*
 * calls the receive-message of the middleware and delivers all messages to the correct buffers
 * will be called periodically
 */
bool_t MW_deliverReceivedMessages(void){
	MiddlewareMessage* msg;
	while (mw->incoming->currentSize > 0){
		msg = NetworkMessageBuffer_dequeue(mw->incoming);
		if (MW_getTargetECU(msg->_targetPort) == mw->idOfECU){
			//the target receiver is located on this ECU		
			Port_addMessage(MW_getPortforIdentifier(msg->_targetPort), msg);
		}else
		{
			NetworkMessageBuffer_enqueue(mw->outgoing, msg);
		}
	}
    
	return true;
}


/*
 * receives messages for every known NetworkInterface
 */
bool_t MW_NIreceiveMessages(void){
    
	//TODO: Is this function called periodically or something?

	MiddlewareMessage* msg;
	msg = NULL;
		msg = mw->usbPort->receiveMethod();
		if (msg != NULL)
			NetworkMessageBuffer_enqueue(mw->incoming, msg);
		msg = mw->virtualBluetoothPort->receiveMethod();
		if (msg != NULL)
			NetworkMessageBuffer_enqueue(mw->incoming, msg);
		msg = mw->inputPort4->receiveMethod();
		if (msg != NULL)
			NetworkMessageBuffer_enqueue(mw->incoming, msg);
		msg = mw->VirtualWifiPort->receiveMethod();
		if (msg != NULL)
			NetworkMessageBuffer_enqueue(mw->incoming, msg);
    return true;
}

/*
 * as long we have messages in the outgoing-buffer,
 * we try to send them via the "best" network interface
 */
bool_t MW_NIsendMessages(void){
	MiddlewareMessage* msg = NULL;
	ECUID targetECUID = -1;
	ECUID nextStepECUID = -1;
	bool_t returnValue = true;
	while (mw->outgoing->currentSize>0){
		msg = NetworkMessageBuffer_dequeue(mw->outgoing);
		targetECUID = MW_getTargetECU(msg->_targetPort);
		nextStepECUID = MW_getNextStepECU(targetECUID);
		if(targetECUID == -1 || nextStepECUID == -1){
			//this message belongs nowhere
			free(msg);
			returnValue = false;
			continue;
		}
        NetworkInterface* ni = MW_getNetworkInterface(nextStepECUID);
		if(ni == NULL){
			//we don't have a NetworkInterface to send it, thus throw it away
			free(msg);
			returnValue = false;
			continue;
		}
		// the allocated memory for the MiddlewareMessage is deallocated (free(msg);) in the generated Stubs of the NetworkInterfaces
		// !!! Thus, do not call free(msg); here !!!
        if(!(ni->sendMethod(msg))){
			//something went wrong
			returnValue = false;
		}
	}
	return returnValue;
}



