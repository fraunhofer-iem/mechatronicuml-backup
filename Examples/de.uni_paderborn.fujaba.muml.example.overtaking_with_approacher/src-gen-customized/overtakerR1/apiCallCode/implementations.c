#include "implementations.h"
/** Start of user code user includes **/ 

static bool_t initd = false;
static S8 power1 = 0;
static S8 power2 = 0;

//0 = straight, 1 = rechts von der linie, 2 = links von der linie
static U8 last_known_direction = 0; 

// should be always 45 (when the sensor is in the middle of the line)
U8 target = 45;

// current difference fro the middle of the line
static int difference; 

static U8 pk = 7;
static U8 pkd = 32;



	void initAll(){
		ecrobot_init_tetrix(NXT_PORT_S1);
		 ecrobot_LL_init(NXT_PORT_S2);
	ecrobot_init_sonar_sensor(NXT_PORT_S3);


	}

/**End of user code**/

		void overtakerMotorR_velocityContR_InitApi(){
/** Start of user code overtakerMotorR_velocityContR_InitApi **/ 
		
/**End of user code**/
}	
		void overtakerMotorR_velocityContR_ExecApi(int velocity){
/** Start of user code overtakerMotorR_velocityContR_ExecApi **/ 
		power2 = velocity;
				ecrobot_tetrix_motors(NXT_PORT_S1, TETRIX_ADDRESS_1,
						TETRIX_MODE_PWM, TETRIX_MODE_PWM_REV, power1, power2);
/**End of user code**/
}	
		void overtakerMotorL_velocityContL_InitApi(){
/** Start of user code overtakerMotorL_velocityContL_InitApi **/ 
		
/**End of user code**/
}	
		void overtakerMotorL_velocityContL_ExecApi(int velocity){
/** Start of user code overtakerMotorL_velocityContL_ExecApi **/ 
		power1 = velocity;
				ecrobot_tetrix_motors(NXT_PORT_S1, TETRIX_ADDRESS_1,
						TETRIX_MODE_PWM, TETRIX_MODE_PWM_REV, power1, power2);
/**End of user code**/
}	
		void overtakerDistance_distance_InitApi(){
/** Start of user code overtakerDistance_distance_InitApi **/ 
		
/**End of user code**/
}	
		int overtakerDistance_distance_ExecApi(){
/** Start of user code overtakerDistance_distance_ExecApi **/ 
		int i = ecrobot_get_sonar_sensor(NXT_PORT_S3);

			if (i>10)
				return i;
			else return 255;
/**End of user code**/
}	
		void overtakerLine_lineLight_InitApi(){
/** Start of user code overtakerLine_lineLight_InitApi **/ 
		
/**End of user code**/
}	
		int overtakerLine_lineLight_ExecApi(){
/** Start of user code overtakerLine_lineLight_ExecApi **/ 
		
/**End of user code**/
}	
