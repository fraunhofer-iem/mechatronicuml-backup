/** \mainpage Documentation of the generated Code for ECU: approacherR2
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


//including all files for used Components
#include "Configuration.h"
#include "lib/NetworkInterface.h"
#include "Middleware/NetworkInterfaceImplementation.h"
#include "Middleware/MiddlewareCore.h"



Middleware *mw;

int main(void){
//create and  initialize middleware object
 Middleware_create();

//create CIC and add it to the middleware
configureApproacherR2CIC();


//initialize all network interfaces
NetworkInterface_init(mw->intern, NetworkInterface_intern_init, NetworkInterface_intern_send, NetworkInterface_intern_receive);
	NetworkInterface_init(mw->virtualBluetoothPort,networkInterface_VirtualBluetoothPort_init, networkInterface_VirtualBluetoothPort_send, networkInterface_VirtualBluetoothPort_receive);
	NetworkInterface_init(mw->VirtualWifiPort,networkInterface_VirtualWifiPort_init, networkInterface_VirtualWifiPort_send, networkInterface_VirtualWifiPort_receive);
	NetworkInterface_init(mw->usbPort,networkInterface_UsbPort_init, networkInterface_UsbPort_send, networkInterface_UsbPort_receive);
	NetworkInterface_init(mw->inputPort4,networkInterface_InputPort4_init, networkInterface_InputPort4_send, networkInterface_InputPort4_receive);



while (1){
		//execute component instance approacherCommunicatorComponent
		 ApproacherCommunicatorComponent_processStep(mw->approacherCommunicatorComponent);
		//execute component instance approacherColorComponent
		 ColorComponent_processStep(mw->approacherColorComponent);

	//execute message exchange
	MW_NIsendMessages();
	MW_NIreceiveMessages();
    MW_deliverReceivedMessages();
}
}
