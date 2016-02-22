		#include "Configuration.h"
	void configureApproacherR1CIC(void){

MessageID * messageIDsOfbuffer;
		//create instance approacherMotorR of type MotorComponent
		 mw->approacherMotorRComponent = MotorComponent_create();
					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_MOTOR_VELOCITY_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE;
					MessageBuffer* buffer1ofvelocityContRvelocity = MessageBuffer_create(1,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfvelocityContRvelocity = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfvelocityContRvelocity[0] = buffer1ofvelocityContRvelocity;
	
				mw->approacherMotorRComponent->velocityPort = Port_create(PORT_APPROACHERMOTORRMOTORVELOCITYCONTR, 1, allBuffersOfvelocityContRvelocity);
			
		//create behavior for component approacherMotorRComponent
		mw->approacherMotorRComponent->stateChart = RootMotorStateChart_create(mw->approacherMotorRComponent);
		mw->approacherMotorRComponent->stateChart->initApi = approacherMotorR_velocityContR_InitApi;
		mw->approacherMotorRComponent->stateChart->execApi = approacherMotorR_velocityContR_ExecApi;
		//create instance approacherMotorL of type MotorComponent
		 mw->approacherMotorLComponent = MotorComponent_create();
					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_MOTOR_VELOCITY_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE;
					MessageBuffer* buffer1ofvelocityContLvelocity = MessageBuffer_create(1,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfvelocityContLvelocity = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfvelocityContLvelocity[0] = buffer1ofvelocityContLvelocity;
	
				mw->approacherMotorLComponent->velocityPort = Port_create(PORT_APPROACHERMOTORLMOTORVELOCITYCONTL, 1, allBuffersOfvelocityContLvelocity);
			
		//create behavior for component approacherMotorLComponent
		mw->approacherMotorLComponent->stateChart = RootMotorStateChart_create(mw->approacherMotorLComponent);
		mw->approacherMotorLComponent->stateChart->initApi = approacherMotorL_velocityContL_InitApi;
		mw->approacherMotorLComponent->stateChart->execApi = approacherMotorL_velocityContL_ExecApi;
		//create instance approacherDriver of type ApproacherDriverComponent
		 mw->approacherDriverComponent = ApproacherDriverComponent_create();
					messageIDsOfbuffer = (MessageID*) calloc(2,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_FIXVELOCITYOVERTAKINGMESSAGESMESSAGE;
						messageIDsOfbuffer[1] = MESSAGE_FREEVELOCITYOVERTAKINGMESSAGESMESSAGE;
					MessageBuffer* buffer1oflimiterP1limiterP = MessageBuffer_create(5,false,2,messageIDsOfbuffer);
				MessageBuffer** allBuffersOflimiterP1limiterP = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOflimiterP1limiterP[0] = buffer1oflimiterP1limiterP;
	
				mw->approacherDriverComponent->limiterPPort = Port_create(PORT_APPROACHERDRIVERAPPROACHERDRIVERLIMITERP1, 1, allBuffersOflimiterP1limiterP);
			
			mw->approacherDriverComponent->velocityLPort = Port_create(PORT_APPROACHERDRIVERAPPROACHERDRIVERVELOCITYL, 0, NULL);

					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_LINE_LINELIGHT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE;
					MessageBuffer* buffer1oflineApproacherlineApproacher = MessageBuffer_create(1,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOflineApproacherlineApproacher = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOflineApproacherlineApproacher[0] = buffer1oflineApproacherlineApproacher;
	
				mw->approacherDriverComponent->lineApproacherPort = Port_create(PORT_APPROACHERDRIVERAPPROACHERDRIVERLINEAPPROACHER, 1, allBuffersOflineApproacherlineApproacher);
			
			mw->approacherDriverComponent->velocityRPort = Port_create(PORT_APPROACHERDRIVERAPPROACHERDRIVERVELOCITYR, 0, NULL);

					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_DISTANCE_DISTANCE_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE;
					MessageBuffer* buffer1ofdistanceAproacherdistance = MessageBuffer_create(1,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfdistanceAproacherdistance = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfdistanceAproacherdistance[0] = buffer1ofdistanceAproacherdistance;
	
				mw->approacherDriverComponent->distancePort = Port_create(PORT_APPROACHERDRIVERAPPROACHERDRIVERDISTANCEAPROACHER, 1, allBuffersOfdistanceAproacherdistance);
			
		//create behavior for component approacherDriverComponent
		mw->approacherDriverComponent->stateChart = RootapproacherDriverRTSCStateChart_create(mw->approacherDriverComponent);
		//create instance approacherLine of type LineComponent
		 mw->approacherLineComponent = LineComponent_create();
			mw->approacherLineComponent->lineLightPort = Port_create(PORT_APPROACHERLINELINELINELIGHT, 0, NULL);

		//create behavior for component approacherLineComponent
		mw->approacherLineComponent->stateChart = RootLineStateChart_create(mw->approacherLineComponent);
		mw->approacherLineComponent->stateChart->initApi = approacherLine_lineLight_InitApi;
		mw->approacherLineComponent->stateChart->execApi = approacherLine_lineLight_ExecApi;
		//create instance approacherDistance of type DistanceComponent
		 mw->approacherDistanceComponent = DistanceComponent_create();
			mw->approacherDistanceComponent->distancePort = Port_create(PORT_APPROACHERDISTANCEDISTANCEDISTANCE, 0, NULL);

		//create behavior for component approacherDistanceComponent
		mw->approacherDistanceComponent->stateChart = RootDistanceStateChart_create(mw->approacherDistanceComponent);
		mw->approacherDistanceComponent->stateChart->initApi = approacherDistance_distance_InitApi;
		mw->approacherDistanceComponent->stateChart->execApi = approacherDistance_distance_ExecApi;

	//call the initialize method after generation
	initializeApproacherR1CIC();

}

///////////////////////////////////////
/// \brief Initialize function for RSRI approacherR1
/// This is the initialize function for RSRI approacherR1. This function calls the initialization function
/// for the middleware of the ECU and of all AtomicComponentInstances which are allocated on this RSRI.
//////////////////////////////////////
void initializeApproacherR1CIC(void){
 
  //init component instances (inside of this init-functions,
  //the ports ands and the RTSC of the component instance is initialized
	  MotorComponent_initialize(mw->approacherMotorRComponent);
	  MotorComponent_initialize(mw->approacherMotorLComponent);
	  ApproacherDriverComponent_initialize(mw->approacherDriverComponent);
	  LineComponent_initialize(mw->approacherLineComponent);
	  DistanceComponent_initialize(mw->approacherDistanceComponent);
	
}
