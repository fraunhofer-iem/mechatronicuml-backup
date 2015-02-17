		#include "Configuration.h"
	void configureApproacherR2CIC(void){

MessageID * messageIDsOfbuffer;
		//create instance approacherCommunicator of type ApproacherCommunicatorComponent
		 mw->approacherCommunicatorComponent = ApproacherCommunicatorComponent_create();
			mw->approacherCommunicatorComponent->vehicleApproacherPPort = Port_create(PORT_APPROACHERCOMMUNICATORAPPROACHERCOMMUNICATORVEHICLEAPPROACHERP1, 0, NULL);

			mw->approacherCommunicatorComponent->limitDrivingPPort = Port_create(PORT_APPROACHERCOMMUNICATORAPPROACHERCOMMUNICATORLIMITDRIVINGP1, 0, NULL);

					messageIDsOfbuffer = (MessageID*) calloc(2,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_FINISHEDOOVERTAKINGMESSAGESMESSAGE;
						messageIDsOfbuffer[1] = MESSAGE_STARTEDOOVERTAKINGMESSAGESMESSAGE;
					MessageBuffer* buffer1ofinformApproacherP1informApproacherP = MessageBuffer_create(5,false,2,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfinformApproacherP1informApproacherP = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfinformApproacherP1informApproacherP[0] = buffer1ofinformApproacherP1informApproacherP;
	
				mw->approacherCommunicatorComponent->informApproacherPPort = Port_create(PORT_APPROACHERCOMMUNICATORAPPROACHERCOMMUNICATORINFORMAPPROACHERP1, 1, allBuffersOfinformApproacherP1informApproacherP);
			
					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_COLOR_COLOR_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE;
					MessageBuffer* buffer1ofcolorApproachercolorApproacher = MessageBuffer_create(1,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfcolorApproachercolorApproacher = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfcolorApproachercolorApproacher[0] = buffer1ofcolorApproachercolorApproacher;
	
				mw->approacherCommunicatorComponent->colorApproacherPort = Port_create(PORT_APPROACHERCOMMUNICATORAPPROACHERCOMMUNICATORCOLORAPPROACHER, 1, allBuffersOfcolorApproachercolorApproacher);
			
		//create behavior for component approacherCommunicatorComponent
		mw->approacherCommunicatorComponent->stateChart = RootapproacherCommunicatorRTSCStateChart_create(mw->approacherCommunicatorComponent);
		//create instance approacherColor of type ColorComponent
		 mw->approacherColorComponent = ColorComponent_create();
			mw->approacherColorComponent->colorPort = Port_create(PORT_APPROACHERCOLORCOLORCOLOR, 0, NULL);

		//create behavior for component approacherColorComponent
		mw->approacherColorComponent->stateChart = RootColorStateChart_create(mw->approacherColorComponent);
		mw->approacherColorComponent->stateChart->initApi = approacherColor_color_InitApi;
		mw->approacherColorComponent->stateChart->execApi = approacherColor_color_ExecApi;

	//call the initialize method after generation
	initializeApproacherR2CIC();

}

///////////////////////////////////////
/// \brief Initialize function for RSRI approacherR2
/// This is the initialize function for RSRI approacherR2. This function calls the initialization function
/// for the middleware of the ECU and of all AtomicComponentInstances which are allocated on this RSRI.
//////////////////////////////////////
void initializeApproacherR2CIC(void){
 
  //init component instances (inside of this init-functions,
  //the ports ands and the RTSC of the component instance is initialized
	  ApproacherCommunicatorComponent_initialize(mw->approacherCommunicatorComponent);
	  ColorComponent_initialize(mw->approacherColorComponent);
	
}
