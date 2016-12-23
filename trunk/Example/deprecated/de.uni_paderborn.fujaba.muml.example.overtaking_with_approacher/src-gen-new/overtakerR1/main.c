/** \mainpage Documentation of the generated Code for ECU: overtakerR1
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
#include "GlobalIdentifier.h"

int doLinefollowing = 1;

//declaring the middleware
Middleware *mw;


//declare used OSEK tasks and counter
DeclareTask(Task_Main);
DeclareTask(Task_initModel);
DeclareTask(Task_MsgExchange);
DeclareTask(Task_overtakerMotorRComponent);
DeclareTask(Task_overtakerMotorLComponent);
DeclareTask(Task_overtakerDriverComponent);
DeclareTask(Task_overtakerDistanceComponent);
DeclareTask(Task_overtakerLineComponent);




/* nxtOSEK hook to be invoked from an ISR in category 2 */
void user_1ms_isr_type2(void){ /* do nothing */ }

/* LEJOS OSEK hooks */
void ecrobot_device_initialize()
{
//initialize all network interfaces
networkInterface_VirtualBluetoothPort_init();
networkInterface_InputPort4_init();
networkInterface_UsbPort_init();

//initialize sensors and actors
		initAll();

}
void ecrobot_device_terminate()
{
}
TASK(Task_initModel){
	doLinefollowing = 1;

	overtakerLine_lineLight_InitApi_real();
	networkInterface_VirtualWifiPort_init();

	mw = Middleware_create();
	configureOvertakerR1CIC();
	//initialize model
	initializeOvertakerR1CIC();
//initialize all network interfaces
NetworkInterface_init(mw->intern, NetworkInterface_intern_init, NetworkInterface_intern_send, NetworkInterface_intern_receive);
	NetworkInterface_init(mw->virtualBluetoothPort,networkInterface_VirtualBluetoothPort_init, networkInterface_VirtualBluetoothPort_send, networkInterface_VirtualBluetoothPort_receive);
	NetworkInterface_init(mw->VirtualWifiPort,networkInterface_VirtualWifiPort_init, networkInterface_VirtualWifiPort_send, networkInterface_VirtualWifiPort_receive);
	NetworkInterface_init(mw->inputPort4,networkInterface_InputPort4_init, networkInterface_InputPort4_send, networkInterface_InputPort4_receive);
	NetworkInterface_init(mw->usbPort,networkInterface_UsbPort_init, networkInterface_UsbPort_send, networkInterface_UsbPort_receive);

	while(true) {
		U8 receive_buf[32];
		if(ecrobot_readData_rs485(receive_buf, 32) > 0) {
			if(receive_buf[0] == 2){ // 2 means this is a START message.
				break;
			}
		}
		systick_wait_ms(5);
	}

ChainTask(Task_Main);
}


TASK(Task_Main){

	//Activate a task per component instance
		ActivateTask(Task_overtakerMotorRComponent);
		ActivateTask(Task_overtakerMotorLComponent);
		ActivateTask(Task_overtakerDriverComponent);
		ActivateTask(Task_overtakerDistanceComponent);
		ActivateTask(Task_overtakerLineComponent);
	ActivateTask(Task_MsgExchange);


TerminateTask();
}

TASK(Task_overtakerMotorRComponent){
	MotorComponent_processStep(mw->overtakerMotorRComponent);
	TerminateTask();
}	
TASK(Task_overtakerMotorLComponent){
	MotorComponent_processStep(mw->overtakerMotorLComponent);
	TerminateTask();
}	
TASK(Task_overtakerDriverComponent){
	OvertakerDriverComponent_processStep(mw->overtakerDriverComponent);
	TerminateTask();
}	
TASK(Task_overtakerDistanceComponent){
	DistanceComponent_processStep(mw->overtakerDistanceComponent);
	TerminateTask();
}	
TASK(Task_overtakerLineComponent){
	LineComponent_processStep(mw->overtakerLineComponent);
	TerminateTask();
}	

TASK(Task_MsgExchange){
	    MW_NIsendMessages();
		MW_NIreceiveMessages();
        MW_deliverReceivedMessages();
ChainTask(Task_Main);
}
