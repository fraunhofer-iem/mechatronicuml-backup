#include "implementations.h"
/** Start of user code user includes **/ 

static bool_t initd = false;
static S8 power1 = 0;
static S8 power2 = 0;

U8 result[1];
U8 average[1];
int self_average[1];
U8 count = 0;

//0 = straight, 1 = rechts von der linie, 2 = links von der linie
static U8 last_known_direction = 0; 

// should be always 45 (when the sensor is in the middle of the line)
U8 target = 45;

// current difference fro the middle of the line
static int difference; 

static U8 pk = 7;
static U8 pkd = 32;
static U8 cutoff = 80;

void initAll(){
		ecrobot_init_tetrix(NXT_PORT_S1);
		 ecrobot_LL_init(NXT_PORT_S2);
	ecrobot_init_sonar_sensor(NXT_PORT_S3);


	}

/**End of user code**/

		void overtakeeMotorL_velocityContR_InitApi(){
/** Start of user code overtakeeMotorL_velocityContR_InitApi **/ 
		
/**End of user code**/
}	
		void overtakeeMotorL_velocityContR_ExecApi(int velocity){
/** Start of user code overtakeeMotorL_velocityContR_ExecApi **/ 
		
				self_average[0] = 0;

    float p = (float)pk/(float)pkd;

	i2c_start_transaction(NXT_PORT_S2, LL_I2C_ADDR, LL_REG_RESULT, 1, result, 1, 0);
	i2c_start_transaction(NXT_PORT_S2, LL_I2C_ADDR, 0x43, 1, average, 1, 0);

	int i;
	for (i = 0; i < 8; i++) {
		int pos = (1 << (7-i));
		if ((result[0] & pos) == 0) {
			self_average[0] += (i+1)*10;
			count++;
		}
	}

	self_average[0] /= count;

	if(count == 0)
	{
		//No line detected
		
		if(last_known_direction == 0)
		{
			self_average[0] = 45;
		}
		else if(last_known_direction == 1)
		{
			self_average[0] = 90;
		}
		else if(last_known_direction == 2)
		{
			self_average[0] = 0;
		}

	} 
	else if(count == 8)
	{
		//robot is orthogonal to the line, drive left
		self_average[0] = 90;
	}
	else if(count > 0 && count < 8) 
	{
		if(self_average[0] > target)
		{
			last_known_direction = 1;
		}
		else if(self_average[0] < target)
		{
			last_known_direction = 2;
		}
		else
		{
			last_known_direction = 0;
		}
	}

	difference = target - self_average[0];


    power1=velocity-((int)(difference*p));
    power2=velocity+((int)(difference*p));

    if(power2>cutoff){
    	power2=cutoff;
    }
    if(power1>cutoff){
    	power1=cutoff;
    }
	ecrobot_tetrix_motors(NXT_PORT_S1, TETRIX_ADDRESS_1,
						TETRIX_MODE_PWM, TETRIX_MODE_PWM_REV, power1, power2);
/**End of user code**/
}	
		void overtakeeMotorR_velocityContL_InitApi(){
/** Start of user code overtakeeMotorR_velocityContL_InitApi **/ 
		
/**End of user code**/
}	
		void overtakeeMotorR_velocityContL_ExecApi(int velocity){
/** Start of user code overtakeeMotorR_velocityContL_ExecApi **/ 
		overtakeeMotorL_velocityContR_ExecApi(velocity);
/**End of user code**/
}	
		void overtakeeLine_lineLight_InitApi(){

		}
		void overtakeeLine_lineLight_InitApi_real(){
/** Start of user code overtakeeLine_lineLight_InitApi **/ 

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
		int overtakeeLine_lineLight_ExecApi(){
/** Start of user code overtakeeLine_lineLight_ExecApi **/ 
		
/**End of user code**/
}	
		void overtakeeDistance_distanceOvertakee_InitApi(){
/** Start of user code overtakeeDistance_distanceOvertakee_InitApi **/ 
		
/**End of user code**/
}	
		int overtakeeDistance_distanceOvertakee_ExecApi(){
/** Start of user code overtakeeDistance_distanceOvertakee_ExecApi **/ 
		int i = ecrobot_get_sonar_sensor(NXT_PORT_S3);

			if (i>10)
				return i;
			else return 255;
/**End of user code**/
}	
