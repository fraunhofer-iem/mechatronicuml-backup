/** \mainpage Documentation of the generated Code for ECU: sectionControlBrick
 * 	The generated Code is documented for Doxygen @link http://www.doxygen.org @endlink.
 * 	Thus, a useful Documentation can be generated via Doxygen in html, latex,...!
 *
 *
 * \tableofcontents
 *
*/
//general includes
#include <stdio.h>
#include <stdlib.h>
//nxtOSEK includes
#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include "Configuration.h"
#include "lib/NetworkInterface.h"
#include "Middleware/NetworkInterfaceImplementation.h"
#include "Middleware/MiddlewareCore.h"


//declaring the middleware
Middleware *mw;


//declare used OSEK tasks and counter
DeclareTask(Task_Main);
DeclareTask(Task_initModel);
DeclareTask(Task_MsgExchange);
DeclareTask(Task_sectionComponent);
DeclareCounter(SysTimerCnt);



int i = 0;
/* nxtOSEK hook to be invoked from an ISR in category 2 */
void user_1ms_isr_type2(void){ 
	StatusType ercd;

	ercd = SignalCounter(SysTimerCnt); /* Increment OSEK Alarm Counter */
	if (ercd != E_OK) {
		ShutdownOS(ercd);
	}
}

/* LEJOS OSEK hooks */
void ecrobot_device_initialize()
{
//initialize all network interfaces
//networkInterface_VirtualWifiPort_init();
networkInterface_VirtualBluetoothPort_init();

//initialize sensors and actors
	//initAll();
}
void ecrobot_device_terminate()
{
}
TASK(Task_initModel){
	networkInterface_VirtualWifiPort_init();

	mw = Middleware_create();
	configureSectionControlBrickCIC();
	//initialize model
	initializeSectionControlBrickCIC();
//initialize all network interfaces
NetworkInterface_init(mw->intern, NetworkInterface_intern_init, NetworkInterface_intern_send, NetworkInterface_intern_receive);
	NetworkInterface_init(mw->VirtualWifiPort1,networkInterface_VirtualWifiPort_init, networkInterface_VirtualWifiPort_send, networkInterface_VirtualWifiPort_receive);
	NetworkInterface_init(mw->virtualBluetoothPort,networkInterface_VirtualBluetoothPort_init, networkInterface_VirtualBluetoothPort_send, networkInterface_VirtualBluetoothPort_receive);
	NetworkInterface_init(mw->VirtualWifiPort3,networkInterface_VirtualWifiPort_init, networkInterface_VirtualWifiPort_send, networkInterface_VirtualWifiPort_receive);
	NetworkInterface_init(mw->VirtualWifiPort2,networkInterface_VirtualWifiPort_init, networkInterface_VirtualWifiPort_send, networkInterface_VirtualWifiPort_receive);

	while(true) {
		U8 receive_buf[32];
		if(ecrobot_wb_tcp_is_ready(NXT_PORT_S3)){
			memset(receive_buf,0,32);
		
			ecrobot_wb_tcp_tx_write_data(NXT_PORT_S3, receive_buf, 32);
			ecrobot_wb_tcp_send(NXT_PORT_S3);

					 

			while(!ecrobot_wb_tcp_is_done(NXT_PORT_S3))
			{
				 
			}
			U8* received = ecrobot_wb_tcp_rx_read_data(NXT_PORT_S3);
			if(received[0] == 2){ // 2 means this is a START message.
				ecrobot_sendData_rs485(received,0, 32);
				break;
			}
		}
		systick_wait_ms(5);
	}
	
	TerminateTask();
}


TASK(Task_sectionComponent){
	SectionControlComponent_processStep(mw->sectionComponent);
	TerminateTask();
}	

TASK(Task_MsgExchange){
	    MW_NIsendMessages();
		MW_NIreceiveMessages();
        MW_deliverReceivedMessages();
        TerminateTask();
}
