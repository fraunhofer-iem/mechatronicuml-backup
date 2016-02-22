		#include "Configuration.h"
	void configureBrick201CIC(void){

MessageID * messageIDsOfbuffer;
		//create instance Communicator of type CommunicatorComponent
		 mw->communicatorComponent = CommunicatorComponent_create();
					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_FINISHDELIVERYDELIVERYMESSAGESMESSAGE;
					MessageBuffer* buffer1ofCommunicatorPort1CommunicatorPort = MessageBuffer_create(5,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfCommunicatorPort1CommunicatorPort = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfCommunicatorPort1CommunicatorPort[0] = buffer1ofCommunicatorPort1CommunicatorPort;
	
				mw->communicatorComponent->communicatorPortPort = Port_create(PORT_COMMUNICATORCOMMUNICATORCOMMUNICATORPORT1, 1, allBuffersOfCommunicatorPort1CommunicatorPort);
			
					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_INITIATEDELIVERYDELIVERYMESSAGESMESSAGE;
					MessageBuffer* buffer1ofPickUpPort1PickUpPort = MessageBuffer_create(5,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfPickUpPort1PickUpPort = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfPickUpPort1PickUpPort[0] = buffer1ofPickUpPort1PickUpPort;
	
				mw->communicatorComponent->pickUpPortPort = Port_create(PORT_COMMUNICATORCOMMUNICATORPICKUPPORT1, 1, allBuffersOfPickUpPort1PickUpPort);
			
		//create behavior for component communicatorComponent
		mw->communicatorComponent->stateChart = RootCommunicatorCmpRTSCStateChart_create(mw->communicatorComponent);
		//create instance LoadController of type LoadControllerComponent
		 mw->loadControllerComponent = LoadControllerComponent_create();
					messageIDsOfbuffer = (MessageID*) calloc(2,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_WAIT4LOADDELIVERYMESSAGESMESSAGE;
						messageIDsOfbuffer[1] = MESSAGE_WAIT4UNLOADDELIVERYMESSAGESMESSAGE;
					MessageBuffer* buffer1ofLoaderPort1LoaderPort = MessageBuffer_create(5,false,2,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfLoaderPort1LoaderPort = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfLoaderPort1LoaderPort[0] = buffer1ofLoaderPort1LoaderPort;
	
				mw->loadControllerComponent->loaderPortPort = Port_create(PORT_LOADCONTROLLERLOADCONTROLLERLOADERPORT1, 1, allBuffersOfLoaderPort1LoaderPort);
			
					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_TOUCHSENSOR_TOUCHPORT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE;
					MessageBuffer* buffer1ofTouchPortTouchPort = MessageBuffer_create(1,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfTouchPortTouchPort = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfTouchPortTouchPort[0] = buffer1ofTouchPortTouchPort;
	
				mw->loadControllerComponent->touchPortPort = Port_create(PORT_LOADCONTROLLERLOADCONTROLLERTOUCHPORT, 1, allBuffersOfTouchPortTouchPort);
			
		//create behavior for component loadControllerComponent
		mw->loadControllerComponent->stateChart = RootLoadControllerCmpRTSCStateChart_create(mw->loadControllerComponent);

	//call the initialize method after generation
	initializeBrick201CIC();

}

///////////////////////////////////////
/// \brief Initialize function for RSRI brick201
/// This is the initialize function for RSRI brick201. This function calls the initialization function
/// for the middleware of the ECU and of all AtomicComponentInstances which are allocated on this RSRI.
//////////////////////////////////////
void initializeBrick201CIC(void){
 
  //init component instances (inside of this init-functions,
  //the ports ands and the RTSC of the component instance is initialized
	  CommunicatorComponent_initialize(mw->communicatorComponent);
	  LoadControllerComponent_initialize(mw->loadControllerComponent);
	
}
