		#include "Configuration.h"
	void configureOvertakerR1CIC(void){

MessageID * messageIDsOfbuffer;
		//create instance overtakerMotorR of type MotorComponent
		 mw->overtakerMotorRComponent = MotorComponent_create();
					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_MOTOR_VELOCITY_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE;
					MessageBuffer* buffer1ofvelocityvelocity = MessageBuffer_create(1,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfvelocityvelocity = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfvelocityvelocity[0] = buffer1ofvelocityvelocity;
	
				mw->overtakerMotorRComponent->velocityPort = Port_create(PORT_OVERTAKERMOTORRMOTORVELOCITY, 1, allBuffersOfvelocityvelocity);
			
		//create behavior for component overtakerMotorRComponent
		mw->overtakerMotorRComponent->stateChart = RootMotorStateChart_create(mw->overtakerMotorRComponent);
		mw->overtakerMotorRComponent->stateChart->initApi = overtakerMotorR_velocity_InitApi;
		mw->overtakerMotorRComponent->stateChart->execApi = overtakerMotorR_velocity_ExecApi;
		//create instance overtakerMotorL of type MotorComponent
		 mw->overtakerMotorLComponent = MotorComponent_create();
					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_MOTOR_VELOCITY_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE;
					MessageBuffer* buffer1ofvelocityvelocity = MessageBuffer_create(1,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfvelocityvelocity = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfvelocityvelocity[0] = buffer1ofvelocityvelocity;
	
				mw->overtakerMotorLComponent->velocityPort = Port_create(PORT_OVERTAKERMOTORLMOTORVELOCITY, 1, allBuffersOfvelocityvelocity);
			
		//create behavior for component overtakerMotorLComponent
		mw->overtakerMotorLComponent->stateChart = RootMotorStateChart_create(mw->overtakerMotorLComponent);
		mw->overtakerMotorLComponent->stateChart->initApi = overtakerMotorL_velocity_InitApi;
		mw->overtakerMotorLComponent->stateChart->execApi = overtakerMotorL_velocity_ExecApi;
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
	  DistanceComponent_initialize(mw->overtakerDistanceComponent);
	  LineComponent_initialize(mw->overtakerLineComponent);
	
}
