/** \mainpage Documentation of the generated Code for ECU: brick101
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
DeclareTask(Task_driverComponent);
DeclareTask(Task_mainControllerComponent);




/* nxtOSEK hook to be invoked from an ISR in category 2 */
void user_1ms_isr_type2(void){ /* do nothing */ }

/* LEJOS OSEK hooks */
void ecrobot_device_initialize()
{
//initialize all network interfaces
networkInterface_VirtualWifiPort_init();
networkInterface_VirtualBluetoothPort_init();
networkInterface_UsbPort_init();
networkInterface_InputPort4_init();

//initialize sensors and actors
}
void ecrobot_device_terminate()
{
}
TASK(Task_initModel){
	mw = Middleware_create();
	configureBrick101CIC();
	//initialize model
	initializeBrick101CIC();
//initialize all network interfaces
NetworkInterface_init(mw->intern, NetworkInterface_intern_init, NetworkInterface_intern_send, NetworkInterface_intern_receive);
	NetworkInterface_init(mw->VirtualWifiPort,networkInterface_VirtualWifiPort_init, networkInterface_VirtualWifiPort_send, networkInterface_VirtualWifiPort_receive);
	NetworkInterface_init(mw->virtualBluetoothPort,networkInterface_VirtualBluetoothPort_init, networkInterface_VirtualBluetoothPort_send, networkInterface_VirtualBluetoothPort_receive);
	NetworkInterface_init(mw->usbPort,networkInterface_UsbPort_init, networkInterface_UsbPort_send, networkInterface_UsbPort_receive);
	NetworkInterface_init(mw->inputPort4,networkInterface_InputPort4_init, networkInterface_InputPort4_send, networkInterface_InputPort4_receive);
ChainTask(Task_Main);
}


TASK(Task_Main){

	//Activate a task per component instance
		ActivateTask(Task_driverComponent);
		ActivateTask(Task_mainControllerComponent);
	ActivateTask(Task_MsgExchange);


TerminateTask();
}

TASK(Task_driverComponent){
	DriverComponent_processStep(mw->driverComponent);
	TerminateTask();
}	
TASK(Task_mainControllerComponent){
	MainControllerComponent_processStep(mw->mainControllerComponent);
	TerminateTask();
}	

TASK(Task_MsgExchange){
	    MW_NIsendMessages();
		MW_NIreceiveMessages();
        MW_deliverReceivedMessages();
ChainTask(Task_Main);
}
