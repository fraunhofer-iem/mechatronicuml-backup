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

		void approacherMotorR_velocityContR_InitApi(){
/** Start of user code approacherMotorR_velocityContR_InitApi **/ 
		
/**End of user code**/
}	
		void approacherMotorR_velocityContR_ExecApi(int velocity){
/** Start of user code approacherMotorR_velocityContR_ExecApi **/ 
		power2 = velocity;
				ecrobot_tetrix_motors(NXT_PORT_S1, TETRIX_ADDRESS_1,
						TETRIX_MODE_PWM, TETRIX_MODE_PWM_REV, power1, power2);
/**End of user code**/
}	
		void approacherMotorL_velocityContL_InitApi(){
/** Start of user code approacherMotorL_velocityContL_InitApi **/ 
		
/**End of user code**/
}	
		void approacherMotorL_velocityContL_ExecApi(int velocity){
/** Start of user code approacherMotorL_velocityContL_ExecApi **/ 
		power1 = velocity;
				ecrobot_tetrix_motors(NXT_PORT_S1, TETRIX_ADDRESS_1,
						TETRIX_MODE_PWM, TETRIX_MODE_PWM_REV, power1, power2);
/**End of user code**/
}	
		void approacherLine_lineLight_InitApi(){

		}

		void approacherLine_lineLight_InitApi_real(){
/** Start of user code approacherLine_lineLight_InitApi **/ 

	display_clear(1);
	int ret = 55;

	display_goto_xy(0,0);
	display_string("Put on White ");
	display_update();
	while(ecrobot_is_ENTER_button_pressed()==0){
		systick_wait_ms(50);
	}
	ret=ecrobot_LL_calibrate_White(NXT_PORT_S2);

	display_goto_xy(0,0);
	display_int(ret,3);
	display_goto_xy(1,0);
	display_string("Put on Black ");
	display_update();
	systick_wait_ms(1000);
	while(ecrobot_is_ENTER_button_pressed()==0){
		systick_wait_ms(50);
	}
	ret=ecrobot_LL_calibrate_Black(NXT_PORT_S2);

	display_goto_xy(0,0);
	display_int(ret,3);
	display_goto_xy(1,0);
	display_string("Put on Line ");
	display_update();
	systick_wait_ms(1000);
	while(ecrobot_is_ENTER_button_pressed()==0){
		systick_wait_ms(50);
	}
	ret=ecrobot_LL_Take_SetPoint_Snapshot(NXT_PORT_S2);

	display_goto_xy(0,0);
	display_int(ret,3);
	display_goto_xy(1,0);
	display_string("Done");
	display_update();
	display_clear(1);

	systick_wait_ms(2000);
		
/**End of user code**/
}	
		int approacherLine_lineLight_ExecApi(){
/** Start of user code approacherLine_lineLight_ExecApi **/ 
		
/**End of user code**/
}	
		void approacherDistance_distance_InitApi(){
/** Start of user code approacherDistance_distance_InitApi **/ 
		
/**End of user code**/
}	
		int approacherDistance_distance_ExecApi(){
/** Start of user code approacherDistance_distance_ExecApi **/ 
			int i = ecrobot_get_sonar_sensor(NXT_PORT_S3);

			if (i>10)
				return i;
			else return 255;
/**End of user code**/
}	
