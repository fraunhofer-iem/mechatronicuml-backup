		#include "Configuration.h"
	void configureSectionControlBrickCIC(void){

MessageID * messageIDsOfbuffer;
		//create instance section of type SectionControlComponent
		 mw->sectionComponent = SectionControlComponent_create();
					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_CHANGEOVERTAKINGMESSAGESMESSAGE;
					MessageBuffer* buffer1ofsectionApproacherP1sectionApproacherP = MessageBuffer_create(5,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfsectionApproacherP1sectionApproacherP = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfsectionApproacherP1sectionApproacherP[0] = buffer1ofsectionApproacherP1sectionApproacherP;
	
				mw->sectionComponent->sectionApproacherPPort = Port_create(PORT_SECTIONSECTIONCONTROLSECTIONAPPROACHERP1, 1, allBuffersOfsectionApproacherP1sectionApproacherP);
			
					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_CHANGEOVERTAKINGMESSAGESMESSAGE;
					MessageBuffer* buffer1ofsectionOvertakerP1sectionOvertakerP = MessageBuffer_create(5,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfsectionOvertakerP1sectionOvertakerP = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfsectionOvertakerP1sectionOvertakerP[0] = buffer1ofsectionOvertakerP1sectionOvertakerP;
	
				mw->sectionComponent->sectionOvertakerPPort = Port_create(PORT_SECTIONSECTIONCONTROLSECTIONOVERTAKERP1, 1, allBuffersOfsectionOvertakerP1sectionOvertakerP);
			
					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_CHANGEOVERTAKINGMESSAGESMESSAGE;
					MessageBuffer* buffer1ofsectionOvertakeeP1sectionOvertakeeP = MessageBuffer_create(5,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfsectionOvertakeeP1sectionOvertakeeP = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfsectionOvertakeeP1sectionOvertakeeP[0] = buffer1ofsectionOvertakeeP1sectionOvertakeeP;
	
				mw->sectionComponent->sectionOvertakeePPort = Port_create(PORT_SECTIONSECTIONCONTROLSECTIONOVERTAKEEP1, 1, allBuffersOfsectionOvertakeeP1sectionOvertakeeP);
			
					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_OVERTAKEOVERTAKINGMESSAGESMESSAGE;
					MessageBuffer* buffer1ofcontrollerP1controllerP = MessageBuffer_create(5,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfcontrollerP1controllerP = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfcontrollerP1controllerP[0] = buffer1ofcontrollerP1controllerP;
	
				mw->sectionComponent->controllerPPort = Port_create(PORT_SECTIONSECTIONCONTROLCONTROLLERP1, 1, allBuffersOfcontrollerP1controllerP);
			
		//create behavior for component sectionComponent
		mw->sectionComponent->stateChart = RootsectionControlRTSCStateChart_create(mw->sectionComponent);

	//call the initialize method after generation
	initializeSectionControlBrickCIC();

}

///////////////////////////////////////
/// \brief Initialize function for RSRI sectionControlBrick
/// This is the initialize function for RSRI sectionControlBrick. This function calls the initialization function
/// for the middleware of the ECU and of all AtomicComponentInstances which are allocated on this RSRI.
//////////////////////////////////////
void initializeSectionControlBrickCIC(void){
 
  //init component instances (inside of this init-functions,
  //the ports ands and the RTSC of the component instance is initialized
	  SectionControlComponent_initialize(mw->sectionComponent);
	
}
