		#include "Configuration.h"
	void configureOvertakeeR2CIC(void){

MessageID * messageIDsOfbuffer;
		//create instance overtakeeCommunicator of type OvertakeeCommunicatorComponent
		 mw->overtakeeCommunicatorComponent = OvertakeeCommunicatorComponent_create();
					messageIDsOfbuffer = (MessageID*) calloc(2,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_REQUESTOVERTAKINGOVERTAKINGMESSAGESMESSAGE;
						messageIDsOfbuffer[1] = MESSAGE_FINISHOVERTAKINGOVERTAKINGMESSAGESMESSAGE;
					MessageBuffer* buffer1ofovertakeeP1overtakeeP = MessageBuffer_create(5,false,2,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfovertakeeP1overtakeeP = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfovertakeeP1overtakeeP[0] = buffer1ofovertakeeP1overtakeeP;
	
				mw->overtakeeCommunicatorComponent->overtakeePPort = Port_create(PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATOROVERTAKEEP1, 1, allBuffersOfovertakeeP1overtakeeP);
			
			mw->overtakeeCommunicatorComponent->velocitySetterPPort = Port_create(PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATORVELOCITYSETTERP1, 0, NULL);

			mw->overtakeeCommunicatorComponent->vehicleOvertakeePPort = Port_create(PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATORVEHICLEOVERTAKEEP1, 0, NULL);

			mw->overtakeeCommunicatorComponent->informOvertakeePort = Port_create(PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATORINFORMOVERTAKEE1, 0, NULL);

					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_COLOR_COLOR_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE;
					MessageBuffer* buffer1ofcolorOvertakeecolorOvertakee = MessageBuffer_create(1,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfcolorOvertakeecolorOvertakee = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfcolorOvertakeecolorOvertakee[0] = buffer1ofcolorOvertakeecolorOvertakee;
	
				mw->overtakeeCommunicatorComponent->colorOvertakeePort = Port_create(PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATORCOLOROVERTAKEE, 1, allBuffersOfcolorOvertakeecolorOvertakee);
			
		//create behavior for component overtakeeCommunicatorComponent
		mw->overtakeeCommunicatorComponent->stateChart = RootovertakeeCommunicatorRTSCStateChart_create(mw->overtakeeCommunicatorComponent);
		//create instance overtakeeColor of type ColorComponent
		 mw->overtakeeColorComponent = ColorComponent_create();
			mw->overtakeeColorComponent->colorPort = Port_create(PORT_OVERTAKEECOLORCOLORCOLOR, 0, NULL);

		//create behavior for component overtakeeColorComponent
		mw->overtakeeColorComponent->stateChart = RootColorStateChart_create(mw->overtakeeColorComponent);
		mw->overtakeeColorComponent->stateChart->initApi = overtakeeColor_color_InitApi;
		mw->overtakeeColorComponent->stateChart->execApi = overtakeeColor_color_ExecApi;

	//call the initialize method after generation
	initializeOvertakeeR2CIC();

}

///////////////////////////////////////
/// \brief Initialize function for RSRI overtakeeR2
/// This is the initialize function for RSRI overtakeeR2. This function calls the initialization function
/// for the middleware of the ECU and of all AtomicComponentInstances which are allocated on this RSRI.
//////////////////////////////////////
void initializeOvertakeeR2CIC(void){
 
  //init component instances (inside of this init-functions,
  //the ports ands and the RTSC of the component instance is initialized
	  OvertakeeCommunicatorComponent_initialize(mw->overtakeeCommunicatorComponent);
	  ColorComponent_initialize(mw->overtakeeColorComponent);
	
}
