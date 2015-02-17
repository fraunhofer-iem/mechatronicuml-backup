/** \mainpage Documentation of the generated Code for ECU: overtakeeR1
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
DeclareTask(Task_overtakeeDriverComponent);
DeclareTask(Task_overtakeeMotorLComponent);
DeclareTask(Task_overtakeeMotorRComponent);
DeclareTask(Task_overtakeeLineComponent);
DeclareTask(Task_overtakeeDistanceComponent);




/* nxtOSEK hook to be invoked from an ISR in category 2 */
void user_1ms_isr_type2(void){ /* do nothing */ }

/* LEJOS OSEK hooks */
void ecrobot_device_initialize()
{
//initialize all network interfaces
networkInterface_UsbPort_init();
networkInterface_VirtualBluetoothPort_init();
networkInterface_InputPort4_init();
networkInterface_VirtualWifiPort_init();

//initialize sensors and actors
		initAll();

}
void ecrobot_device_terminate()
{
}
TASK(Task_initModel){
	mw = Middleware_create();
	configureOvertakeeR1CIC();
	//initialize model
	initializeOvertakeeR1CIC();
//initialize all network interfaces
NetworkInterface_init(mw->intern, NetworkInterface_intern_init, NetworkInterface_intern_send, NetworkInterface_intern_receive);
	NetworkInterface_init(mw->usbPort,networkInterface_UsbPort_init, networkInterface_UsbPort_send, networkInterface_UsbPort_receive);
	NetworkInterface_init(mw->virtualBluetoothPort,networkInterface_VirtualBluetoothPort_init, networkInterface_VirtualBluetoothPort_send, networkInterface_VirtualBluetoothPort_receive);
	NetworkInterface_init(mw->inputPort4,networkInterface_InputPort4_init, networkInterface_InputPort4_send, networkInterface_InputPort4_receive);
	NetworkInterface_init(mw->VirtualWifiPort,networkInterface_VirtualWifiPort_init, networkInterface_VirtualWifiPort_send, networkInterface_VirtualWifiPort_receive);
ChainTask(Task_Main);
}


TASK(Task_Main){

	//Activate a task per component instance
		ActivateTask(Task_overtakeeDriverComponent);
		ActivateTask(Task_overtakeeMotorLComponent);
		ActivateTask(Task_overtakeeMotorRComponent);
		ActivateTask(Task_overtakeeLineComponent);
		ActivateTask(Task_overtakeeDistanceComponent);
	ActivateTask(Task_MsgExchange);


TerminateTask();
}

TASK(Task_overtakeeDriverComponent){
	OvertakeeDriverComponent_processStep(mw->overtakeeDriverComponent);
	TerminateTask();
}	
TASK(Task_overtakeeMotorLComponent){
	MotorComponent_processStep(mw->overtakeeMotorLComponent);
	TerminateTask();
}	
TASK(Task_overtakeeMotorRComponent){
	MotorComponent_processStep(mw->overtakeeMotorRComponent);
	TerminateTask();
}	
TASK(Task_overtakeeLineComponent){
	LineComponent_processStep(mw->overtakeeLineComponent);
	TerminateTask();
}	
TASK(Task_overtakeeDistanceComponent){
	DistanceComponent_processStep(mw->overtakeeDistanceComponent);
	TerminateTask();
}	

TASK(Task_MsgExchange){
	    MW_NIsendMessages();
		MW_NIreceiveMessages();
        MW_deliverReceivedMessages();
ChainTask(Task_Main);
}
