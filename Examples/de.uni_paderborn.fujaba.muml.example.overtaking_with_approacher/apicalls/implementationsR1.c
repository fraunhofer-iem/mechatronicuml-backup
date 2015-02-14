#include "implementations.h"
/** Start of user code user includes **/
#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include <stdlib.h>

static bool_t initd = false;
static S8 power1 = 0;
static S8 power2 = 0;
/**End of user code**/

		void approacherMotorR_velocity_InitApi(){
/** Start of user code approacherMotorR_velocity_InitApi **/

/**End of user code**/
}
		void approacherMotorR_velocity_ExecApi(int velocity){
/** Start of user code approacherMotorR_velocity_ExecApi **/
			power1 = velocity;
				ecrobot_tetrix_motors(NXT_PORT_S1, TETRIX_ADDRESS_1,
						TETRIX_MODE_PWM, TETRIX_MODE_PWM_REV, power1, power2);
/**End of user code**/
}
		void approacherMotorL_velocity_InitApi(){
/** Start of user code approacherMotorL_velocity_InitApi **/

/**End of user code**/
}
		void approacherMotorL_velocity_ExecApi(int velocity){
/** Start of user code approacherMotorL_velocity_ExecApi **/
			power2 = velocity;
			ecrobot_tetrix_motors(NXT_PORT_S1, TETRIX_ADDRESS_1,
						TETRIX_MODE_PWM, TETRIX_MODE_PWM_REV, power1, power2);
/**End of user code**/
}
		void approacherLine_lineLight_InitApi(){
/** Start of user code approacherLine_lineLight_InitApi **/

/**End of user code**/
}
		int approacherLine_lineLight_ExecApi(){
/** Start of user code approacherLine_lineLight_ExecApi **/

/**End of user code**/
}
		void approacherDistance_distance_InitApi(){
/** Start of user code approacherDistance_distance_InitApi **/
			ecrobot_init_sonar_sensor(NXT_PORT_S3);
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
