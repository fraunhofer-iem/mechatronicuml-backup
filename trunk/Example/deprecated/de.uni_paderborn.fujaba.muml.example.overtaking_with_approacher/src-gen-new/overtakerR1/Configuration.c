		#include "Configuration.h"
	void configureOvertakerR1CIC(void){

MessageID * messageIDsOfbuffer;
		//create instance overtakerMotorR of type MotorComponent
		 mw->overtakerMotorRComponent = MotorComponent_create();
					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_MOTOR_VELOCITY_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE;
					MessageBuffer* buffer1ofvelocityContRvelocity = MessageBuffer_create(1,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfvelocityContRvelocity = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfvelocityContRvelocity[0] = buffer1ofvelocityContRvelocity;
	
				mw->overtakerMotorRComponent->velocityPort = Port_create(PORT_OVERTAKERMOTORRMOTORVELOCITYCONTR, 1, allBuffersOfvelocityContRvelocity);
			
		//create behavior for component overtakerMotorRComponent
		mw->overtakerMotorRComponent->stateChart = RootMotorStateChart_create(mw->overtakerMotorRComponent);
		mw->overtakerMotorRComponent->stateChart->initApi = overtakerMotorR_velocityContR_InitApi;
		mw->overtakerMotorRComponent->stateChart->execApi = overtakerMotorR_velocityContR_ExecApi;
		//create instance overtakerMotorL of type MotorComponent
		 mw->overtakerMotorLComponent = MotorComponent_create();
					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_MOTOR_VELOCITY_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE;
					MessageBuffer* buffer1ofvelocityContLvelocity = MessageBuffer_create(1,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfvelocityContLvelocity = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfvelocityContLvelocity[0] = buffer1ofvelocityContLvelocity;
	
				mw->overtakerMotorLComponent->velocityPort = Port_create(PORT_OVERTAKERMOTORLMOTORVELOCITYCONTL, 1, allBuffersOfvelocityContLvelocity);
			
		//create behavior for component overtakerMotorLComponent
		mw->overtakerMotorLComponent->stateChart = RootMotorStateChart_create(mw->overtakerMotorLComponent);
		mw->overtakerMotorLComponent->stateChart->initApi = overtakerMotorL_velocityContL_InitApi;
		mw->overtakerMotorLComponent->stateChart->execApi = overtakerMotorL_velocityContL_ExecApi;
		//create instance overtakerDriver of type OvertakerDriverComponent
		 mw->overtakerDriverComponent = OvertakerDriverComponent_create();
					messageIDsOfbuffer = (MessageID*) calloc(3,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_EXECUTEOVERTAKINGMESSAGESMESSAGE;
						messageIDsOfbuffer[1] = MESSAGE_STARTALLOVERTAKINGMESSAGESMESSAGE;
						messageIDsOfbuffer[2] = MESSAGE_STOPALLOVERTAKINGMESSAGESMESSAGE;
					MessageBuffer* buffer1ofinitiatorP1initiatorP = MessageBuffer_create(5,false,3,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfinitiatorP1initiatorP = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfinitiatorP1initiatorP[0] = buffer1ofinitiatorP1initiatorP;
	
				mw->overtakerDriverComponent->initiatorPPort = Port_create(PORT_OVERTAKERDRIVEROVERTAKERDRIVERINITIATORP1, 1, allBuffersOfinitiatorP1initiatorP);
			
					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_DISTANCE_DISTANCE_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE;
					MessageBuffer* buffer1ofdistancedistance = MessageBuffer_create(1,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfdistancedistance = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfdistancedistance[0] = buffer1ofdistancedistance;
	
				mw->overtakerDriverComponent->distancePort = Port_create(PORT_OVERTAKERDRIVEROVERTAKERDRIVERDISTANCE, 1, allBuffersOfdistancedistance);
			
					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_LINE_LINELIGHT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE;
					MessageBuffer* buffer1oflineline = MessageBuffer_create(1,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOflineline = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOflineline[0] = buffer1oflineline;
	
				mw->overtakerDriverComponent->linePort = Port_create(PORT_OVERTAKERDRIVEROVERTAKERDRIVERLINE, 1, allBuffersOflineline);
			
			mw->overtakerDriverComponent->velocityRPort = Port_create(PORT_OVERTAKERDRIVEROVERTAKERDRIVERVELOCITYR, 0, NULL);

			mw->overtakerDriverComponent->velocityLPort = Port_create(PORT_OVERTAKERDRIVEROVERTAKERDRIVERVELOCITYL, 0, NULL);

		//create behavior for component overtakerDriverComponent
		mw->overtakerDriverComponent->stateChart = RootovertakerDriverRTSCStateChart_create(mw->overtakerDriverComponent);
		//create instance overtakerDistance of type DistanceComponent
		 mw->overtakerDistanceComponent = DistanceComponent_create();
			mw->overtakerDistanceComponent->distancePort = Port_create(PORT_OVERTAKERDISTANCEDISTANCEDISTANCE, 0, NULL);

		//create behavior for component overtakerDistanceComponent
		mw->overtakerDistanceComponent->stateChart = RootDistanceStateChart_create(mw->overtakerDistanceComponent);
		mw->overtakerDistanceComponent->stateChart->initApi = overtakerDistance_distance_InitApi;
		mw->overtakerDistanceComponent->stateChart->execApi = overtakerDistance_distance_ExecApi;
		//create instance overtakerLine of type LineComponent
		 mw->overtakerLineComponent = LineComponent_create();
			mw->overtakerLineComponent->lineLightPort = Port_create(PORT_OVERTAKERLINELINELINELIGHT, 0, NULL);

		//create behavior for component overtakerLineComponent
		mw->overtakerLineComponent->stateChart = RootLineStateChart_create(mw->overtakerLineComponent);
		mw->overtakerLineComponent->stateChart->initApi = overtakerLine_lineLight_InitApi;
		mw->overtakerLineComponent->stateChart->execApi = overtakerLine_lineLight_ExecApi;

	//call the initialize method after generation
	initializeOvertakerR1CIC();

}

///////////////////////////////////////
/// \brief Initialize function for RSRI overtakerR1
/// This is the initialize function for RSRI overtakerR1. This function calls the initialization function
/// for the middleware of the ECU and of all AtomicComponentInstances which are allocated on this RSRI.
//////////////////////////////////////
void initializeOvertakerR1CIC(void){
 
  //init component instances (inside of this init-functions,
  //the ports ands and the RTSC of the component instance is initialized
	  MotorComponent_initialize(mw->overtakerMotorRComponent);
	  MotorComponent_initialize(mw->overtakerMotorLComponent);
	  OvertakerDriverComponent_initialize(mw->overtakerDriverComponent);
	  DistanceComponent_initialize(mw->overtakerDistanceComponent);
	  LineComponent_initialize(mw->overtakerLineComponent);
	
}
