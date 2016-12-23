		#include "Configuration.h"
	void configureOvertakerR2CIC(void){

MessageID * messageIDsOfbuffer;
		//create instance overtakerCommunicator of type OvertakerCommunicatorComponent
		 mw->overtakerCommunicatorComponent = OvertakerCommunicatorComponent_create();
					messageIDsOfbuffer = (MessageID*) calloc(2,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_INITIATEOVERTAKINGMESSAGESMESSAGE;
						messageIDsOfbuffer[1] = MESSAGE_EXECUTEDOVERTAKINGMESSAGESMESSAGE;
					MessageBuffer* buffer1ofexecutorP1executorP = MessageBuffer_create(5,false,2,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfexecutorP1executorP = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfexecutorP1executorP[0] = buffer1ofexecutorP1executorP;
	
				mw->overtakerCommunicatorComponent->executorPPort = Port_create(PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATOREXECUTORP1, 1, allBuffersOfexecutorP1executorP);
			
			mw->overtakerCommunicatorComponent->vehicleOvertakerPPort = Port_create(PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATORVEHICLEOVERTAKERP1, 0, NULL);

					messageIDsOfbuffer = (MessageID*) calloc(2,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_ACCEPTOVERTAKINGOVERTAKINGMESSAGESMESSAGE;
						messageIDsOfbuffer[1] = MESSAGE_DECLINEOVERTAKINGOVERTAKINGMESSAGESMESSAGE;
					MessageBuffer* buffer1ofovertakerP1overtakerP = MessageBuffer_create(5,false,2,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfovertakerP1overtakerP = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfovertakerP1overtakerP[0] = buffer1ofovertakerP1overtakerP;
	
				mw->overtakerCommunicatorComponent->overtakerPPort = Port_create(PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATOROVERTAKERP1, 1, allBuffersOfovertakerP1overtakerP);
			
					messageIDsOfbuffer = (MessageID*) calloc(2,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_SAVEOVERTAKINGMESSAGESMESSAGE;
						messageIDsOfbuffer[1] = MESSAGE_UNSAVEOVERTAKINGMESSAGESMESSAGE;
					MessageBuffer* buffer1ofrequestorP1requestorP = MessageBuffer_create(5,false,2,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfrequestorP1requestorP = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfrequestorP1requestorP[0] = buffer1ofrequestorP1requestorP;
	
				mw->overtakerCommunicatorComponent->requestorPPort = Port_create(PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATORREQUESTORP1, 1, allBuffersOfrequestorP1requestorP);
			
					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_COLOR_COLOR_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE;
					MessageBuffer* buffer1ofcolorcolor = MessageBuffer_create(1,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfcolorcolor = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfcolorcolor[0] = buffer1ofcolorcolor;
	
				mw->overtakerCommunicatorComponent->colorPort = Port_create(PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATORCOLOR, 1, allBuffersOfcolorcolor);
			
		//create behavior for component overtakerCommunicatorComponent
		mw->overtakerCommunicatorComponent->stateChart = RootovertakerCommunicatorRTSCStateChart_create(mw->overtakerCommunicatorComponent);
		//create instance overtakerColor of type ColorComponent
		 mw->overtakerColorComponent = ColorComponent_create();
			mw->overtakerColorComponent->colorPort = Port_create(PORT_OVERTAKERCOLORCOLORCOLOR, 0, NULL);

		//create behavior for component overtakerColorComponent
		mw->overtakerColorComponent->stateChart = RootColorStateChart_create(mw->overtakerColorComponent);
		mw->overtakerColorComponent->stateChart->initApi = overtakerColor_color_InitApi;
		mw->overtakerColorComponent->stateChart->execApi = overtakerColor_color_ExecApi;

	//call the initialize method after generation
	initializeOvertakerR2CIC();

}

///////////////////////////////////////
/// \brief Initialize function for RSRI overtakerR2
/// This is the initialize function for RSRI overtakerR2. This function calls the initialization function
/// for the middleware of the ECU and of all AtomicComponentInstances which are allocated on this RSRI.
//////////////////////////////////////
void initializeOvertakerR2CIC(void){
 
  //init component instances (inside of this init-functions,
  //the ports ands and the RTSC of the component instance is initialized
	  OvertakerCommunicatorComponent_initialize(mw->overtakerCommunicatorComponent);
	  ColorComponent_initialize(mw->overtakerColorComponent);
	
}
