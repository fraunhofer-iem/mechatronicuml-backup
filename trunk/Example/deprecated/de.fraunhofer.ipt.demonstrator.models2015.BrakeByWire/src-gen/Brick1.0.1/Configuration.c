		#include "Configuration.h"
	void configureBrick101CIC(void){

MessageID * messageIDsOfbuffer;
		//create instance Driver of type DriverComponent
		 mw->driverComponent = DriverComponent_create();
					messageIDsOfbuffer = (MessageID*) calloc(2,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_GODELIVERYMESSAGESMESSAGE;
						messageIDsOfbuffer[1] = MESSAGE_STOPDELIVERYMESSAGESMESSAGE;
					MessageBuffer* buffer1ofDriverPort1DriverPort = MessageBuffer_create(5,false,2,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfDriverPort1DriverPort = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfDriverPort1DriverPort[0] = buffer1ofDriverPort1DriverPort;
	
				mw->driverComponent->driverPortPort = Port_create(PORT_DRIVERDRIVERDRIVERPORT1, 1, allBuffersOfDriverPort1DriverPort);
			
					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_LINELEADERSENSOR_LINELEADERPORT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE;
					MessageBuffer* buffer1ofLineLeaderPortLineLeaderPort = MessageBuffer_create(1,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfLineLeaderPortLineLeaderPort = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfLineLeaderPortLineLeaderPort[0] = buffer1ofLineLeaderPortLineLeaderPort;
	
				mw->driverComponent->lineLeaderPortPort = Port_create(PORT_DRIVERDRIVERLINELEADERPORT, 1, allBuffersOfLineLeaderPortLineLeaderPort);
			
			mw->driverComponent->motorLeftPortPort = Port_create(PORT_DRIVERDRIVERMOTORLEFTPORT, 0, NULL);

			mw->driverComponent->motorRightPortPort = Port_create(PORT_DRIVERDRIVERMOTORRIGHTPORT, 0, NULL);

		//create behavior for component driverComponent
		mw->driverComponent->stateChart = RootDriverCmpRTSCStateChart_create(mw->driverComponent);
		//create instance MainController of type MainControllerComponent
		 mw->mainControllerComponent = MainControllerComponent_create();
					messageIDsOfbuffer = (MessageID*) calloc(2,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_LOADDELIVERYMESSAGESMESSAGE;
						messageIDsOfbuffer[1] = MESSAGE_UNLOADDELIVERYMESSAGESMESSAGE;
					MessageBuffer* buffer1ofLoadingControllerPort1LoadingControllerPort = MessageBuffer_create(5,false,2,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfLoadingControllerPort1LoadingControllerPort = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfLoadingControllerPort1LoadingControllerPort[0] = buffer1ofLoadingControllerPort1LoadingControllerPort;
	
				mw->mainControllerComponent->loadingControllerPortPort = Port_create(PORT_MAINCONTROLLERMAINCONTROLLERLOADINGCONTROLLERPORT1, 1, allBuffersOfLoadingControllerPort1LoadingControllerPort);
			
			mw->mainControllerComponent->drivingControllerPortPort = Port_create(PORT_MAINCONTROLLERMAINCONTROLLERDRIVINGCONTROLLERPORT1, 0, NULL);

					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_FINISHEDDELIVERYDELIVERYMESSAGESMESSAGE;
					MessageBuffer* buffer1ofPickingUpControllerPort1PickingUpControllerPort = MessageBuffer_create(5,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfPickingUpControllerPort1PickingUpControllerPort = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfPickingUpControllerPort1PickingUpControllerPort[0] = buffer1ofPickingUpControllerPort1PickingUpControllerPort;
	
				mw->mainControllerComponent->pickingUpControllerPortPort = Port_create(PORT_MAINCONTROLLERMAINCONTROLLERPICKINGUPCONTROLLERPORT1, 1, allBuffersOfPickingUpControllerPort1PickingUpControllerPort);
			
					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_COLORSENSOR_COLORPORT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE;
					MessageBuffer* buffer1ofColorPortColorPort = MessageBuffer_create(1,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfColorPortColorPort = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfColorPortColorPort[0] = buffer1ofColorPortColorPort;
	
				mw->mainControllerComponent->colorPortPort = Port_create(PORT_MAINCONTROLLERMAINCONTROLLERCOLORPORT, 1, allBuffersOfColorPortColorPort);
			
		//create behavior for component mainControllerComponent
		mw->mainControllerComponent->stateChart = RootMainControllerCmpRTSCStateChart_create(mw->mainControllerComponent);

	//call the initialize method after generation
	initializeBrick101CIC();

}

///////////////////////////////////////
/// \brief Initialize function for RSRI brick101
/// This is the initialize function for RSRI brick101. This function calls the initialization function
/// for the middleware of the ECU and of all AtomicComponentInstances which are allocated on this RSRI.
//////////////////////////////////////
void initializeBrick101CIC(void){
 
  //init component instances (inside of this init-functions,
  //the ports ands and the RTSC of the component instance is initialized
	  DriverComponent_initialize(mw->driverComponent);
	  MainControllerComponent_initialize(mw->mainControllerComponent);
	
}
