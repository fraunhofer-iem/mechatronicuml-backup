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
 * INIT method for network interface usbPort
 * implement this method, to do additional initialization for NI usbPort. Usually this is called before the main application is started.
 */
bool_t networkInterface_UsbPort_init(void){
/** @TODO Start of user code networkInterface_UsbPort_init **/ 

/**End of user code**/
//standard return value
return true;
}


/*
 * SEND method for network interface usbPort.
 * implement this method, to send a message via the NI usbPort.
 * This method ist called by the middleware, if a message has to be sent via this network interface
 * @param msg the message to be sent
 * hint: use the protobuf method MiddlewareMessage_write_with_tag(struct MiddlewareMessage *_MiddlewareMessage, void *_buffer, int offset, int tag)
 * to write the message content into a byte array, if needed
 */
bool_t networkInterface_UsbPort_send(MiddlewareMessage * msg){
/** @TODO Start of user code networkInterface_UsbPort_send **/ 


/**End of user code**/
//free the allocated memory for the message after it has been sent
free(msg);
msg = NULL;
//if we are reaching this statement, everything went ok
return true;
}


/*
 * RECEIVE method for network interface usbPort.
 * implement this method, to receive a message via the NI usbPort.
 * This method ist called by the middleware periodically to receive new messages
 * @return the received MiddlewareMessage
 */
MiddlewareMessage * networkInterface_UsbPort_receive(void){
//create new MiddlewareMessage
MiddlewareMessage * tmpMessage = (MiddlewareMessage*) malloc(sizeof(MiddlewareMessage));

//buffer for receiving data
char buf[30];
//number of received bytes
int_t recvLength = 0;

///////////////////////////////
/** @TODO Start of user code networkInterface_UsbPort_receive **/ 
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
 * INIT method for network interface inputPort4
 * implement this method, to do additional initialization for NI inputPort4. Usually this is called before the main application is started.
 */
bool_t networkInterface_InputPort4_init(void){
/** @TODO Start of user code networkInterface_InputPort4_init **/ 

/**End of user code**/
//standard return value
return true;
}


/*
 * SEND method for network interface inputPort4.
 * implement this method, to send a message via the NI inputPort4.
 * This method ist called by the middleware, if a message has to be sent via this network interface
 * @param msg the message to be sent
 * hint: use the protobuf method MiddlewareMessage_write_with_tag(struct MiddlewareMessage *_MiddlewareMessage, void *_buffer, int offset, int tag)
 * to write the message content into a byte array, if needed
 */
bool_t networkInterface_InputPort4_send(MiddlewareMessage * msg){
/** @TODO Start of user code networkInterface_InputPort4_send **/ 


/**End of user code**/
//free the allocated memory for the message after it has been sent
free(msg);
msg = NULL;
//if we are reaching this statement, everything went ok
return true;
}


/*
 * RECEIVE method for network interface inputPort4.
 * implement this method, to receive a message via the NI inputPort4.
 * This method ist called by the middleware periodically to receive new messages
 * @return the received MiddlewareMessage
 */
MiddlewareMessage * networkInterface_InputPort4_receive(void){
//create new MiddlewareMessage
MiddlewareMessage * tmpMessage = (MiddlewareMessage*) malloc(sizeof(MiddlewareMessage));

//buffer for receiving data
char buf[30];
//number of received bytes
int_t recvLength = 0;

///////////////////////////////
/** @TODO Start of user code networkInterface_InputPort4_receive **/ 
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
 * INIT method for network interface VirtualWifiPort
 * implement this method, to do additional initialization for NI VirtualWifiPort. Usually this is called before the main application is started.
 */
bool_t networkInterface_VirtualWifiPort_init(void){
/** @TODO Start of user code networkInterface_VirtualWifiPort_init **/ 

	ecrobot_wb_init(NXT_PORT_S3);
	ecrobot_wb_wait_for_i2c(NXT_PORT_S3);

	U8 wbIpAddr[4] = {192, 168, 0, 104};
	U8 wbIpMask[4] = { 255, 255, 255, 0};
	U8 wbIpGateway[4] = { 192, 168, 0, 1};

	//Disable Wifi
	result_disable = ecrobot_wb_wifi_disable(NXT_PORT_S3);

	result_config = ecrobot_wb_wifi_config(NXT_PORT_S3, "IPT_EM_DEMO", wbIpAddr,
			wbIpMask, wbIpGateway, WB_I2C_WIFI_SECURITY_TYPE_OPEN, "");

	result_enable = ecrobot_wb_wifi_enable(NXT_PORT_S3);

/*
	//This is just for displaying stuff, uncomment if you want to see it

	char wb_ssid[32];
	memset(wb_ssid, 0, 32);

	U8 wb_ip[4];
	memset(wb_ip, 0, 4);
	
	U8 wb_mask[4];
	memset(wb_mask, 0, 4);

	ecrobot_wb_read(NXT_PORT_S3, WB_I2C_REG_WIFI_IP_ADDR, wb_ip, 4);
	ecrobot_wb_read(NXT_PORT_S3, WB_I2C_REG_WIFI_SSID, (U8*)wb_ssid, 32);
	ecrobot_wb_read(NXT_PORT_S3, WB_I2C_REG_WIFI_IP_MASK, (U8*)wb_mask, 4);

	display_clear(0);

	display_goto_xy(0, 0);
	display_string(wb_ssid);

	display_goto_xy(0, 2);
	display_unsigned(wb_ip[0], 0);
	display_string(" ");
	display_unsigned(wb_ip[1], 0);
	display_string(" ");
	display_unsigned( wb_ip[2], 0);
	display_string(" ");
	display_unsigned(wb_ip[3], 0);
	
	display_goto_xy(0, 3);
	display_unsigned(wb_mask[0], 0);
	display_string(" "); 
	display_unsigned( wb_mask[1], 0);
	display_string(" ");
	display_unsigned( wb_mask[2], 0);
	display_string(" ");
	display_unsigned(wb_mask[3], 0);

	display_update();
	*/

	//send stuff
   U8 destIP[4] = {192, 168, 0, 101};
   S16 destPort = 9999;

/*
   //show target port
   	display_goto_xy(0, 1);
	display_string("PORT:");
	display_int(destPort, 5);
*/

	ecrobot_wb_tcp_config(NXT_PORT_S3, destIP, destPort); 

/*
	//show written target ip on brick
   U8 tcptarget[4];
   ecrobot_wb_read(NXT_PORT_S3, WB_I2C_REG_TCP_PORT_IP, (U8*)tcptarget, 4);
   displayip(tcptarget);
*/

   while(!ecrobot_wb_wifi_isconnected(NXT_PORT_S3))
   {
   	/*
   		display_goto_xy(0,7);
   		display_string("waiting f. wifi");
   		display_update();
   	*/
   }

   //Show that wifi is connected now
	display_goto_xy(11, 4);
	display_string("[WF]");
	display_update();

/**End of user code**/
//standard return value
return true;
}


/*
 * SEND method for network interface VirtualWifiPort.
 * implement this method, to send a message via the NI VirtualWifiPort.
 * This method ist called by the middleware, if a message has to be sent via this network interface
 * @param msg the message to be sent
 * hint: use the protobuf method MiddlewareMessage_write_with_tag(struct MiddlewareMessage *_MiddlewareMessage, void *_buffer, int offset, int tag)
 * to write the message content into a byte array, if needed
 */
bool_t networkInterface_VirtualWifiPort_send(MiddlewareMessage * msg){
/** @TODO Start of user code networkInterface_VirtualWifiPort_send **/ 


/**End of user code**/
//free the allocated memory for the message after it has been sent
free(msg);
msg = NULL;
//if we are reaching this statement, everything went ok
return true;
}


/*
 * RECEIVE method for network interface VirtualWifiPort.
 * implement this method, to receive a message via the NI VirtualWifiPort.
 * This method ist called by the middleware periodically to receive new messages
 * @return the received MiddlewareMessage
 */
MiddlewareMessage * networkInterface_VirtualWifiPort_receive(void){
//create new MiddlewareMessage
MiddlewareMessage * tmpMessage = (MiddlewareMessage*) malloc(sizeof(MiddlewareMessage));

//buffer for receiving data
char buf[30];
//number of received bytes
int_t recvLength = 0;

///////////////////////////////
/** @TODO Start of user code networkInterface_VirtualWifiPort_receive **/ 
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

	
