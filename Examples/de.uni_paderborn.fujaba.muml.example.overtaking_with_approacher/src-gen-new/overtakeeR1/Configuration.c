		#include "Configuration.h"
	void configureOvertakeeR1CIC(void){

MessageID * messageIDsOfbuffer;
		//create instance overtakeeDriver of type OvertakeeDriverComponent
		 mw->overtakeeDriverComponent = OvertakeeDriverComponent_create();
					messageIDsOfbuffer = (MessageID*) calloc(4,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_SETFASTOVERTAKINGMESSAGESMESSAGE;
						messageIDsOfbuffer[1] = MESSAGE_SETSLOWOVERTAKINGMESSAGESMESSAGE;
						messageIDsOfbuffer[2] = MESSAGE_STARTALLOVERTAKINGMESSAGESMESSAGE;
						messageIDsOfbuffer[3] = MESSAGE_STOPALLOVERTAKINGMESSAGESMESSAGE;
					MessageBuffer* buffer1ofvelocityGetterP1velocityGetterP = MessageBuffer_create(5,true,4,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfvelocityGetterP1velocityGetterP = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfvelocityGetterP1velocityGetterP[0] = buffer1ofvelocityGetterP1velocityGetterP;
	
				mw->overtakeeDriverComponent->velocityGetterPPort = Port_create(PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERVELOCITYGETTERP1, 1, allBuffersOfvelocityGetterP1velocityGetterP);
			


			mw->overtakeeDriverComponent->velocityRPort = Port_create(PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERVELOCITYR, 0, NULL);

					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_LINE_LINELIGHT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE;
					MessageBuffer* buffer1oflineOvertakeelineOvertakee = MessageBuffer_create(1,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOflineOvertakeelineOvertakee = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOflineOvertakeelineOvertakee[0] = buffer1oflineOvertakeelineOvertakee;
	
				mw->overtakeeDriverComponent->lineOvertakeePort = Port_create(PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERLINEOVERTAKEE, 1, allBuffersOflineOvertakeelineOvertakee);
			

			

			mw->overtakeeDriverComponent->velocityLPort = Port_create(PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERVELOCITYL, 0, NULL);

					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_DISTANCE_DISTANCE_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE;
					MessageBuffer* buffer1ofdistanceOvertakeedistanceOvertakee = MessageBuffer_create(1,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfdistanceOvertakeedistanceOvertakee = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfdistanceOvertakeedistanceOvertakee[0] = buffer1ofdistanceOvertakeedistanceOvertakee;
	
				mw->overtakeeDriverComponent->distanceOvertakeePort = Port_create(PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERDISTANCEOVERTAKEE, 1, allBuffersOfdistanceOvertakeedistanceOvertakee);
			
		//create behavior for component overtakeeDriverComponent
		mw->overtakeeDriverComponent->stateChart = RootovertakeeDriverRTSCStateChart_create(mw->overtakeeDriverComponent);
		//create instance overtakeeMotorL of type MotorComponent
		 mw->overtakeeMotorLComponent = MotorComponent_create();
					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_MOTOR_VELOCITY_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE;
					MessageBuffer* buffer1ofvelocityContRvelocity = MessageBuffer_create(1,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfvelocityContRvelocity = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfvelocityContRvelocity[0] = buffer1ofvelocityContRvelocity;
	
				mw->overtakeeMotorLComponent->velocityPort = Port_create(PORT_OVERTAKEEMOTORLMOTORVELOCITYCONTR, 1, allBuffersOfvelocityContRvelocity);
			
		//create behavior for component overtakeeMotorLComponent
		mw->overtakeeMotorLComponent->stateChart = RootMotorStateChart_create(mw->overtakeeMotorLComponent);
		mw->overtakeeMotorLComponent->stateChart->initApi = overtakeeMotorL_velocityContR_InitApi;
		mw->overtakeeMotorLComponent->stateChart->execApi = overtakeeMotorL_velocityContR_ExecApi;
		//create instance overtakeeMotorR of type MotorComponent
		 mw->overtakeeMotorRComponent = MotorComponent_create();
					messageIDsOfbuffer = (MessageID*) calloc(1,sizeof(MessageID));
						messageIDsOfbuffer[0] = MESSAGE_MOTOR_VELOCITY_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE;
					MessageBuffer* buffer1ofvelocityContLvelocity = MessageBuffer_create(1,false,1,messageIDsOfbuffer);
				MessageBuffer** allBuffersOfvelocityContLvelocity = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
				allBuffersOfvelocityContLvelocity[0] = buffer1ofvelocityContLvelocity;
	
				mw->overtakeeMotorRComponent->velocityPort = Port_create(PORT_OVERTAKEEMOTORRMOTORVELOCITYCONTL, 1, allBuffersOfvelocityContLvelocity);
			
		//create behavior for component overtakeeMotorRComponent
		mw->overtakeeMotorRComponent->stateChart = RootMotorStateChart_create(mw->overtakeeMotorRComponent);
		mw->overtakeeMotorRComponent->stateChart->initApi = overtakeeMotorR_velocityContL_InitApi;
		mw->overtakeeMotorRComponent->stateChart->execApi = overtakeeMotorR_velocityContL_ExecApi;
		//create instance overtakeeLine of type LineComponent
		 mw->overtakeeLineComponent = LineComponent_create();
			mw->overtakeeLineComponent->lineLightPort = Port_create(PORT_OVERTAKEELINELINELINELIGHT, 0, NULL);

		//create behavior for component overtakeeLineComponent
		mw->overtakeeLineComponent->stateChart = RootLineStateChart_create(mw->overtakeeLineComponent);
		mw->overtakeeLineComponent->stateChart->initApi = overtakeeLine_lineLight_InitApi;
		mw->overtakeeLineComponent->stateChart->execApi = overtakeeLine_lineLight_ExecApi;
		//create instance overtakeeDistance of type DistanceComponent
		 mw->overtakeeDistanceComponent = DistanceComponent_create();
			mw->overtakeeDistanceComponent->distancePort = Port_create(PORT_OVERTAKEEDISTANCEDISTANCEDISTANCEOVERTAKEE, 0, NULL);

		//create behavior for component overtakeeDistanceComponent
		mw->overtakeeDistanceComponent->stateChart = RootDistanceStateChart_create(mw->overtakeeDistanceComponent);
		mw->overtakeeDistanceComponent->stateChart->initApi = overtakeeDistance_distanceOvertakee_InitApi;
		mw->overtakeeDistanceComponent->stateChart->execApi = overtakeeDistance_distanceOvertakee_ExecApi;

	//call the initialize method after generation
	initializeOvertakeeR1CIC();

}

///////////////////////////////////////
/// \brief Initialize function for RSRI overtakeeR1
/// This is the initialize function for RSRI overtakeeR1. This function calls the initialization function
/// for the middleware of the ECU and of all AtomicComponentInstances which are allocated on this RSRI.
//////////////////////////////////////
void initializeOvertakeeR1CIC(void){
 
  //init component instances (inside of this init-functions,
  //the ports ands and the RTSC of the component instance is initialized
	  OvertakeeDriverComponent_initialize(mw->overtakeeDriverComponent);
	  MotorComponent_initialize(mw->overtakeeMotorLComponent);
	  MotorComponent_initialize(mw->overtakeeMotorRComponent);
	  LineComponent_initialize(mw->overtakeeLineComponent);
	  DistanceComponent_initialize(mw->overtakeeDistanceComponent);
	
}
