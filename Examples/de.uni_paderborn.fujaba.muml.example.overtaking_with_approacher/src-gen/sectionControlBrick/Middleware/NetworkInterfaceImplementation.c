#include "NetworkInterfaceImplementation.h"

bool_t NetworkInterface_intern_init(void){
    //do some initialization here
return true;
}

bool_t NetworkInterface_intern_send(MiddlewareMessage* msg){
   return NetworkMessageBuffer_enqueue(mw->incoming, msg);

}
MiddlewareMessage* NetworkInterface_intern_receive(void){
    return NULL; //This method should never be used
}
/** Start of user code user includes **/ 

/**End of user code**/


/*
 * INIT method for network interface VirtualWifiPort1
 * implement this method, to do additional initialization for NI VirtualWifiPort1. Usually this is called before the main application is started.
 */
bool_t networkInterface_VirtualWifiPort1_init(void){
/** @TODO Start of user code networkInterface_VirtualWifiPort1_init **/ 

/**End of user code**/
//standard return value
return true;
}


/*
 * SEND method for network interface VirtualWifiPort1.
 * implement this method, to send a message via the NI VirtualWifiPort1.
 * This method ist called by the middleware, if a message has to be sent via this network interface
 * @param msg the message to be sent
 * hint: use the protobuf method MiddlewareMessage_write_with_tag(struct MiddlewareMessage *_MiddlewareMessage, void *_buffer, int offset, int tag)
 * to write the message content into a byte array, if needed
 */
bool_t networkInterface_VirtualWifiPort1_send(MiddlewareMessage * msg){
/** @TODO Start of user code networkInterface_VirtualWifiPort1_send **/ 


/**End of user code**/
//free the allocated memory for the message after it has been sent
free(msg);
msg = NULL;
//if we are reaching this statement, everything went ok
return true;
}


/*
 * RECEIVE method for network interface VirtualWifiPort1.
 * implement this method, to receive a message via the NI VirtualWifiPort1.
 * This method ist called by the middleware periodically to receive new messages
 * @return the received MiddlewareMessage
 */
MiddlewareMessage * networkInterface_VirtualWifiPort1_receive(void){
//create new MiddlewareMessage
MiddlewareMessage * tmpMessage = (MiddlewareMessage*) malloc(sizeof(MiddlewareMessage));

//buffer for receiving data
char buf[30];
//number of received bytes
int_t recvLength = 0;

///////////////////////////////
/** @TODO Start of user code networkInterface_VirtualWifiPort1_receive **/ 
 //fill the buffer *buf and specify the number of received bytres (recvLength)
/**End of user code**/
///////////////////////////////

if(recvLength<=0 || !(Message_can_read_delimited_from(buf,0,recvLength))){
	free(tmpMessage);
    tmpMessage = NULL;
	}
else{
	//read the buffer and create the middlewareMessage
	MiddlewareMessage_read_delimited_from(buf, tmpMessage, 0);
	}
//return the received message
return tmpMessage;
}

	

/*
 * INIT method for network interface virtualBluetoothPort
 * implement this method, to do additional initialization for NI virtualBluetoothPort. Usually this is called before the main application is started.
 */
bool_t networkInterface_VirtualBluetoothPort_init(void){
/** @TODO Start of user code networkInterface_VirtualBluetoothPort_init **/ 

/**End of user code**/
//standard return value
return true;
}


/*
 * SEND method for network interface virtualBluetoothPort.
 * implement this method, to send a message via the NI virtualBluetoothPort.
 * This method ist called by the middleware, if a message has to be sent via this network interface
 * @param msg the message to be sent
 * hint: use the protobuf method MiddlewareMessage_write_with_tag(struct MiddlewareMessage *_MiddlewareMessage, void *_buffer, int offset, int tag)
 * to write the message content into a byte array, if needed
 */
bool_t networkInterface_VirtualBluetoothPort_send(MiddlewareMessage * msg){
/** @TODO Start of user code networkInterface_VirtualBluetoothPort_send **/ 


/**End of user code**/
//free the allocated memory for the message after it has been sent
free(msg);
msg = NULL;
//if we are reaching this statement, everything went ok
return true;
}


/*
 * RECEIVE method for network interface virtualBluetoothPort.
 * implement this method, to receive a message via the NI virtualBluetoothPort.
 * This method ist called by the middleware periodically to receive new messages
 * @return the received MiddlewareMessage
 */
MiddlewareMessage * networkInterface_VirtualBluetoothPort_receive(void){
//create new MiddlewareMessage
MiddlewareMessage * tmpMessage = (MiddlewareMessage*) malloc(sizeof(MiddlewareMessage));

//buffer for receiving data
char buf[30];
//number of received bytes
int_t recvLength = 0;

///////////////////////////////
/** @TODO Start of user code networkInterface_VirtualBluetoothPort_receive **/ 
 //fill the buffer *buf and specify the number of received bytres (recvLength)
/**End of user code**/
///////////////////////////////

if(recvLength<=0 || !(Message_can_read_delimited_from(buf,0,recvLength))){
	free(tmpMessage);
    tmpMessage = NULL;
	}
else{
	//read the buffer and create the middlewareMessage
	MiddlewareMessage_read_delimited_from(buf, tmpMessage, 0);
	}
//return the received message
return tmpMessage;
}

	

/*
 * INIT method for network interface VirtualWifiPort3
 * implement this method, to do additional initialization for NI VirtualWifiPort3. Usually this is called before the main application is started.
 */
bool_t networkInterface_VirtualWifiPort3_init(void){
/** @TODO Start of user code networkInterface_VirtualWifiPort3_init **/ 

/**End of user code**/
//standard return value
return true;
}


/*
 * SEND method for network interface VirtualWifiPort3.
 * implement this method, to send a message via the NI VirtualWifiPort3.
 * This method ist called by the middleware, if a message has to be sent via this network interface
 * @param msg the message to be sent
 * hint: use the protobuf method MiddlewareMessage_write_with_tag(struct MiddlewareMessage *_MiddlewareMessage, void *_buffer, int offset, int tag)
 * to write the message content into a byte array, if needed
 */
bool_t networkInterface_VirtualWifiPort3_send(MiddlewareMessage * msg){
/** @TODO Start of user code networkInterface_VirtualWifiPort3_send **/ 


/**End of user code**/
//free the allocated memory for the message after it has been sent
free(msg);
msg = NULL;
//if we are reaching this statement, everything went ok
return true;
}


/*
 * RECEIVE method for network interface VirtualWifiPort3.
 * implement this method, to receive a message via the NI VirtualWifiPort3.
 * This method ist called by the middleware periodically to receive new messages
 * @return the received MiddlewareMessage
 */
MiddlewareMessage * networkInterface_VirtualWifiPort3_receive(void){
//create new MiddlewareMessage
MiddlewareMessage * tmpMessage = (MiddlewareMessage*) malloc(sizeof(MiddlewareMessage));

//buffer for receiving data
char buf[30];
//number of received bytes
int_t recvLength = 0;

///////////////////////////////
/** @TODO Start of user code networkInterface_VirtualWifiPort3_receive **/ 
 //fill the buffer *buf and specify the number of received bytres (recvLength)
/**End of user code**/
///////////////////////////////

if(recvLength<=0 || !(Message_can_read_delimited_from(buf,0,recvLength))){
	free(tmpMessage);
    tmpMessage = NULL;
	}
else{
	//read the buffer and create the middlewareMessage
	MiddlewareMessage_read_delimited_from(buf, tmpMessage, 0);
	}
//return the received message
return tmpMessage;
}

	

/*
 * INIT method for network interface VirtualWifiPort2
 * implement this method, to do additional initialization for NI VirtualWifiPort2. Usually this is called before the main application is started.
 */
bool_t networkInterface_VirtualWifiPort2_init(void){
/** @TODO Start of user code networkInterface_VirtualWifiPort2_init **/ 

/**End of user code**/
//standard return value
return true;
}


/*
 * SEND method for network interface VirtualWifiPort2.
 * implement this method, to send a message via the NI VirtualWifiPort2.
 * This method ist called by the middleware, if a message has to be sent via this network interface
 * @param msg the message to be sent
 * hint: use the protobuf method MiddlewareMessage_write_with_tag(struct MiddlewareMessage *_MiddlewareMessage, void *_buffer, int offset, int tag)
 * to write the message content into a byte array, if needed
 */
bool_t networkInterface_VirtualWifiPort2_send(MiddlewareMessage * msg){
/** @TODO Start of user code networkInterface_VirtualWifiPort2_send **/ 


/**End of user code**/
//free the allocated memory for the message after it has been sent
free(msg);
msg = NULL;
//if we are reaching this statement, everything went ok
return true;
}


/*
 * RECEIVE method for network interface VirtualWifiPort2.
 * implement this method, to receive a message via the NI VirtualWifiPort2.
 * This method ist called by the middleware periodically to receive new messages
 * @return the received MiddlewareMessage
 */
MiddlewareMessage * networkInterface_VirtualWifiPort2_receive(void){
//create new MiddlewareMessage
MiddlewareMessage * tmpMessage = (MiddlewareMessage*) malloc(sizeof(MiddlewareMessage));

//buffer for receiving data
char buf[30];
//number of received bytes
int_t recvLength = 0;

///////////////////////////////
/** @TODO Start of user code networkInterface_VirtualWifiPort2_receive **/ 
 //fill the buffer *buf and specify the number of received bytres (recvLength)
/**End of user code**/
///////////////////////////////

if(recvLength<=0 || !(Message_can_read_delimited_from(buf,0,recvLength))){
	free(tmpMessage);
    tmpMessage = NULL;
	}
else{
	//read the buffer and create the middlewareMessage
	MiddlewareMessage_read_delimited_from(buf, tmpMessage, 0);
	}
//return the received message
return tmpMessage;
}

	
