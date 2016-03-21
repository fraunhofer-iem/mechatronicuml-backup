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

#define DATA_LEN 32

//Buffers for sending and receiving data, use the same for all networkinterfaces, to save some memory/performance
U8 receive_buf[DATA_LEN];
U8 send_buf[DATA_LEN];

/**End of user code**/


/*
 * INIT method for network interface virtualBluetoothPort
 * implement this method, to do additional initialization for NI virtualBluetoothPort. Usually this is called before the main application is started.
 */
bool_t networkInterface_VirtualBluetoothPort_init(void){
/** @TODO Start of user code networkInterface_VirtualBluetoothPort_init **/ 

	static SINT bt_status = BT_NO_INIT;
	ecrobot_init_bt_slave("CYBERTRON");
	display_goto_xy(0, 0);
	display_string("BT-Slave! Addr:");
	display_update();

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

	MiddlewareMessage_write_delimited_to(msg, send_buf, 0);
		ecrobot_send_bt_packet(send_buf, DATA_LEN);

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
	if((ecrobot_read_bt_packet(receive_buf, DATA_LEN)) <= 0){
		return NULL;
		}
	else{
		//read the buffer and create the middlewareMessage
		MiddlewareMessage * tmpMessage = (MiddlewareMessage*) malloc(sizeof(MiddlewareMessage));
		MiddlewareMessage_read_delimited_from(receive_buf, tmpMessage, 0);
		return tmpMessage;
		}
	//return the received message
	return NULL;
}

	

/*
 * INIT method for network interface VirtualWifiPort
 * implement this method, to do additional initialization for NI VirtualWifiPort. Usually this is called before the main application is started.
 */
bool_t networkInterface_VirtualWifiPort_init(void){
/** @TODO Start of user code networkInterface_VirtualWifiPort_init **/ 

	ecrobot_wb_init(NXT_PORT_S3);
	ecrobot_wb_wait_for_i2c(NXT_PORT_S3);

	U8 wbIpAddr[4] = {192, 168, 0, 105};
	U8 wbIpMask[4] = { 255, 255, 255, 0};
	U8 wbIpGateway[4] = { 192, 168, 0, 1};

	//Disable Wifi
	ecrobot_wb_wifi_disable(NXT_PORT_S3);

	ecrobot_wb_wifi_config(NXT_PORT_S3, "IPT_EM_DEMO", wbIpAddr,
			wbIpMask, wbIpGateway, WB_I2C_WIFI_SECURITY_TYPE_OPEN, "");

	ecrobot_wb_wifi_enable(NXT_PORT_S3);

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
	//ssfree(msg);
	if(ecrobot_wb_tcp_is_ready(NXT_PORT_S3)){ 
		memset(send_buf,0,DATA_LEN);

		//no request
		send_buf[0] = 1;
		send_buf[1] = msg->_targetPort;

		MiddlewareMessage_write_delimited_to(msg, send_buf, 2);
	   
		ecrobot_wb_tcp_tx_write_data(NXT_PORT_S3, send_buf, DATA_LEN);
		ecrobot_wb_tcp_send(NXT_PORT_S3);
		free(msg);
		msg = NULL;
		//if we are reaching this statement, everything went ok
		return true;
	}
	return false;

	
}


/*
 * RECEIVE method for network interface VirtualWifiPort.
 * implement this method, to receive a message via the NI VirtualWifiPort.
 * This method ist called by the middleware periodically to receive new messages
 * @return the received MiddlewareMessage
 */

 int myPortIds[15] = {PORT_OVERTAKERMOTORRMOTORVELOCITYCONTR, PORT_OVERTAKERMOTORLMOTORVELOCITYCONTL, PORT_OVERTAKERDRIVEROVERTAKERDRIVERINITIATORP1, PORT_OVERTAKERDRIVEROVERTAKERDRIVERDISTANCE,
 						PORT_OVERTAKERDRIVEROVERTAKERDRIVERLINE, PORT_OVERTAKERDRIVEROVERTAKERDRIVERVELOCITYR, PORT_OVERTAKERDRIVEROVERTAKERDRIVERVELOCITYL, PORT_OVERTAKERDISTANCEDISTANCEDISTANCE, 
 						PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATOREXECUTORP1, PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATORVEHICLEOVERTAKERP1, PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATOROVERTAKERP1,
 						PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATORREQUESTORP1, PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATORCOLOR, PORT_OVERTAKERLINELINELINELIGHT, PORT_OVERTAKERCOLORCOLORCOLOR};

static int counter = 0;

MiddlewareMessage * networkInterface_VirtualWifiPort_receive(void){
//return NULL;
			 

	if(ecrobot_wb_tcp_is_ready(NXT_PORT_S3)){ 
		memset(receive_buf,0,DATA_LEN);
		// MiddlewareMessage msg;
		// msg._targetPort = 20;
		// msg._msgID = 14;
		// msg._mumlMsg_len =0;
			 

		///////////////////////////////
		/** @TODO Start of user code networkInterface_VirtualWifiPort_receive **/ 

		//String such that the server knows we request a message
		//strcpy(reqMessage._mumlMsg, "Req msg!(WK6Hm)"); 
		
		//The target port for which we want to receive a message

		/*
			TODO: (Idea) Every time this function gets called we need to check for one of our PortIDs.
			I think a simple solution is that we just check for a different PortID,
			every time this function gets called
		*/	

		counter++;
		if(counter == sizeof(myPortIds) / sizeof(int))
			counter = 0;
		//request message
		receive_buf[0]=0;
		receive_buf[1]=myPortIds[counter];
		//MiddlewareMessage_write_delimited_to(&msg, receive_buf, 2);
		ecrobot_wb_tcp_tx_write_data(NXT_PORT_S3, receive_buf, DATA_LEN);
		ecrobot_wb_tcp_send(NXT_PORT_S3);

					 

		while(!ecrobot_wb_tcp_is_done(NXT_PORT_S3))
		{
			 
		}
		U8* received = ecrobot_wb_tcp_rx_read_data(NXT_PORT_S3);
		if(received <= 0){
			return NULL;
		}
		else{
						 

			//read the buffer and create the middlewareMessage
			//the server respone,
			//if first byte != 0 , server response is MiddlewareMessage with offset 2
			if(received[0] != 0){
				MiddlewareMessage* tmpMessage = (MiddlewareMessage*) malloc(sizeof(MiddlewareMessage));
				MiddlewareMessage_read_delimited_from(received, tmpMessage, 2);
							 

				// display_goto_xy(0,0);
				// display_clear(0);
				// display_int(tmpMessage->_targetPort,3);
				// display_goto_xy(0,1);
				// display_int(tmpMessage->_msgID,3);
				// if(tmpMessage->_msgID==MESSAGE_CHANGEOVERTAKINGMESSAGESMESSAGE){
				// 	struct changeOvertakingMessagesMessage msg;
				// 	changeOvertakingMessagesMessage_read_delimited_from(tmpMessage->_mumlMsg,&msg,0);
				// 	display_goto_xy(0,3);
				// 	display_int(msg._secID,3);
				// }
				// display_update();
				return tmpMessage;
			}

		}
	}
	
	return NULL;

	
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

if(recvLength<=0 || !(Message_can_read_delimited_from(buf,0,DATA_LEN))){
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

	ecrobot_init_rs485(DEFAULT_BAUD_RATE_RS485);
	
	/*

	static U16 i = 0;



	if(ecrobot_read_rs485(bt_receive_buf,0, DATA_LEN) > 0)
	{
	  display_goto_xy(7, 4);
	  display_string("[RS]");
	  display_update();
	}else
	{
	  i++;
	  if(i % 10000 == 1){
	  display_goto_xy(7, 4);
	  display_string("    ");
	  display_update();
	}
	}
	bt_send_buf[0] = 42;
	ecrobot_send_rs485(bt_send_buf,0, 2);

	*/

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
	  MiddlewareMessage_write_delimited_to(msg, send_buf, 0);
	  ecrobot_sendData_rs485(send_buf,0, DATA_LEN);

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
	if(ecrobot_readData_rs485(receive_buf, DATA_LEN) <= 0)
	{	
		return NULL;
	}
	else{
		//read the buffer and create the middlewareMessage
		MiddlewareMessage * tmpMessage = (MiddlewareMessage*) malloc(sizeof(MiddlewareMessage));
		MiddlewareMessage_read_delimited_from(receive_buf, tmpMessage, 0);
		return tmpMessage;
		}
	//return the received message
	return NULL;
}
