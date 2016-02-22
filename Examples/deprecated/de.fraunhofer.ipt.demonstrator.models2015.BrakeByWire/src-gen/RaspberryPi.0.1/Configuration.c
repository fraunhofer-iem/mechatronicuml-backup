		#include "Configuration.h"
	void configureRaspberryPi01CIC(void){

MessageID * messageIDsOfbuffer;
		//create instance PickUpBotInstance of type PickUpBotComponent
		 mw->pickUpBotInstanceComponent = PickUpBotComponent_create();
					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_STARTDELIVERYDELIVERYMESSAGESMESSAGE;
					MessageBuffer* buffer1ofPickUpBotPortInstancePickUpBotPort = MessageBuffer_create(5,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfPickUpBotPortInstancePickUpBotPort = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfPickUpBotPortInstancePickUpBotPort[0] = buffer1ofPickUpBotPortInstancePickUpBotPort;
	
				mw->pickUpBotInstanceComponent->pickUpBotPortPort = Port_create(PORT_PICKUPBOTINSTANCEPICKUPBOTPICKUPBOTPORTINSTANCE, 1, allBuffersOfPickUpBotPortInstancePickUpBotPort);
			
		//create behavior for component pickUpBotInstanceComponent
		mw->pickUpBotInstanceComponent->stateChart = RootPickUpBotCmpRTSCStateChart_create(mw->pickUpBotInstanceComponent);

	//call the initialize method after generation
	initializeRaspberryPi01CIC();

}

///////////////////////////////////////
/// \brief Initialize function for RSRI raspberryPi01
/// This is the initialize function for RSRI raspberryPi01. This function calls the initialization function
/// for the middleware of the ECU and of all AtomicComponentInstances which are allocated on this RSRI.
//////////////////////////////////////
void initializeRaspberryPi01CIC(void){
 
  //init component instances (inside of this init-functions,
  //the ports ands and the RTSC of the component instance is initialized
	  PickUpBotComponent_initialize(mw->pickUpBotInstanceComponent);
	
}
