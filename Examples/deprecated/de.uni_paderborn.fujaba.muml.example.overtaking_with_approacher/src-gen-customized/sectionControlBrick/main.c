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




/* nxtOSEK hook to be invoked from an ISR in category 2 */
void user_1ms_isr_type2(void){ /* do nothing */ }

/* LEJOS OSEK hooks */
void ecrobot_device_initialize()
{
//initialize all network interfaces
//networkInterface_VirtualWifiPort_init();
networkInterface_VirtualBluetoothPort_init();

//initialize sensors and actors
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
ChainTask(Task_Main);
}


TASK(Task_Main){

	//Activate a task per component instance
		ActivateTask(Task_sectionComponent);
	ActivateTask(Task_MsgExchange);


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
ChainTask(Task_Main);
}
